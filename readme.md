# memo
環境  
本　：JDK 8、STS  
自分：JDK 11、VSCode

予定：7/10までに一通り用語確認、その後理解が不十分な点を2周目。。。

個人メモ

07/05
- 1章：用語の確認のみ＞＞目次から節を消して気になった用語の解説  
- 2章：初期設定でSpringを作成してpom.xmlファイルの構成を確認
    - 9章でしか、SpringBootを使わないという衝撃の事実！！
- 3章：bean.xmlを作るときに発生した問題　＞＞　xml内の全てのリンクアドレスを`https`にしないといけない。`http`だと動かない。
    - ※Springには一つのクラスにつき一つのBean（インスタンス）しか保管できない。>> classリテラルを指定する方法でもインスタンス取得可能
07/06  
07/07  
07/08  
07/09  
07/10  


# 以下、目次＋簡易メモ

## Chapter 1 Spring Frameworkの準備
Sprig:
- 多数のフレームワークの共同体
- Dependency Injection(依存性の注入)を行う技術として開発

SpringFramework
- 簡単にコンポーネント同士を切り離したり入れ替えたりできる。（疎結合の実現？）
- AOP:Aspect-OrientedPrograming

Dependency Injection
- 必要なインスタンスをnewしないで代入してもらう方法
- Bean生成時にコンテナが行う
- いい感じに引っ張ってきてくれる

DIの例
```java
@Conponent
public class Hoge{
    private final Fuga fuga;

    @Autowired
    public Hoge(Fuga fuga){
        this.fuga = fuga;
    }
}
```

- @Conponent:Spring管理下におくためのアノテーション
- @Autowired:Spring管理下のオフジェクトの中から、適切なものをセットしてもらうためインスタンス変数に付けるアノテーション

※Spring Bootでは@Component⇒@Controller,@Service,@Repository(３つともComponentを継承)


## Chapter 2 Springプロジェクトの基本

依存ライブラリをpom.xmlの中で確認する。公式からコピペで自分で追記も可能。```xml
<dependencises>
    <dependency>
    ・・・ライブラリ・・・
    </dependency>
</dependencises>
```

コアコンテナの機能  
- DI/AOP
全ての技術はこの上に！？

- Context
ITの分野では、利用者の意図や状況、環境などの総体を表したり、同じ処理や記述でも状況に応じて動作などが異なる場合に、その選択基準となる判断材料や条件などを指す場合が多い。

- Beans
Springでは、あらゆるものをBeanとして登録し、利用。Springにはプログラムで必要となるコンポーネントをBeanとしてインスタンス化して利用するための機能がまとめられている。

## Chapter 3 Dependency Injectionの基本
bean.xmlを作るときに発生した問題
全てのアドレスを`https`にしないといけない。`http`だと動かない。
```java
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="https://maven.apache.org/POM/4.0.0" xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="https://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">

    <!-- フィールドインジェクションver -->
    <bean id="mybean1" class="src/main/java/com/example/chapter03/MyBean">
        <property name="message" value="this is sample bean!"></property>
    </bean>

    <!-- コンストラクタver -->
    <bean id="mybean2" class="src/main/java/com/example/chapter03/MyBean">
        <constructor-arg type="String" name="message" value="this is sample bean!">
        </constructor-arg>
    </bean>

    <!-- Additional lines to be added here... -->
</beans>
```

※Springには一つのクラスにつき一つのBean（インスタンス）しか保管できない。  

### 3.1 Beanの利用とDI
Beanクラスを作成する  
MyBeanのソースコードを作成する  
MyBeanを利用する  
MyBean利用の問題点  
Bean構成ファイルを作成する  
bean.xmlの内容をチェック  
bean.xmlを完成させる  
タグの記述について  
Appクラスを書き換える  
ClassPathXmlApplicationContextを利用する  
依存性は排除されたか？  
Maven利用の場合  
pom.xmlの内容について  
Exec Mavenプラグインについて  
Mavenでのプログラム実行  

### 3.2 依存性の排除
インターフェイス化する  
MyBeanInterfaceをチェックする  
修正されたソースコードをチェックする  
MyBean2クラスを作成する  
MyBean2を利用する  
AnnotationConfigApplicationContextによるBean生成  
Bean構成クラスを作成する  
@Configurationと@Bean  
Bean構成クラスを利用する  

## Chapter 4 WebアプリケーションでDIを利用する
### 4.1 WebアプリケーションのDIの基本
WebアプリケーションとSpring  
Spring Web Mavenプロジェクトの作成  
サーバーで実行する  
プロジェクトの構成  
pom.xmlについて  
web.xmlについて  
application-config.xmlについて  
Beanクラスを作成する  
サーブレットを作成する  
サーブレットのソースコードを記述する  
web.xmlを確認する  
index.jspを変更する  
動作を確認しよう  

### 4.2 Beanの利用を更に考える
エンコーディングフィルターの設定  
@Autowiredを使う  
Bean構成クラスを利用する  
MyBeanConfigをBean構成クラスにする  
MyBean2を作成する  
新たなBean構成クラスを作る  
contextConfigLocationの変更  
サーブレットを変更する  
ApplicationContextのイベント  
MySampleApplicationListenerの作成  
オリジナルイベントの利用  
MyBeanEventクラスの作成  
MyBeanEventListenerを作成する  
MyBeanEventServiceクラスを作成する  
ApplicationEventPublisherAwareの働き  
Beanを登録する  
サーブレットを変更する  
すべて@Autowiredでインスタンスを取得すべし！  

## Chapter 5 Spring AOPによるアスペクト指向開発
### 5.1 AOPの働きと利用の基本
AOPとは何か？  
アスペクトの要素と仕組み  
プロジェクトを用意する  
pom.xmlを変更する  
Beanインターフェイスを作成する  
IMyBean実装クラスを作成する  
Bean構成ファイルを作成する  
Bean利用クラスを作成する  
アスペクトクラスを作成する  
bean.xmlに追記する  
アスペクトの設定  

### 5.2 Spring AOPの機能を理解する
自動プロキシを利用する  
MyBeanAspectを書き換える  
bean.xmlを変更する  
Bean構成クラスを使う  
Appクラスを変更する  
AOP関連アノテーション  
様々なアドバイスを利用する  
MyBean2クラスを作成する  
mainメソッドを修正する  
アスペクトクラスにアドバイスを追加する  
JoinPointクラスについて  
AOPの処理を取り除くには？  

## Chapter 6 リソースとプロパティ
### 6.1 リソースのロード
Springとリソースの利用  
サンプルプロジェクトの用意  
リソースファイルの作成  
Appクラスを作成する  
StaticApplicationContextとResource  
リソース文字列について  
Bean構成ファイルをファイルシステムから読み込む  
Bean構成ファイルを作成する  
App.javaを書き換える  
FileSystemXmlApplicationContextの利用  

### 6.2 プロパティの利用
プロパティファイルを利用する  
プロパティファイルの作成  
Bean構成ファイルを変更する  
Property Placeholderでプロパティを利用する  
プロパティをコード内から利用する  
MyBeanKeeperクラスを作成する  
bean.xmlを変更する  
App.javaを変更する  
PropertiesFactoryBeanについて  
BeanWrapperによるBean情報の取得  
MyBeanKeeperをBean構成ファイルに登録する  
Appを実行する  

### 6.3 プロパティエディタ
プロパティエディタについて  
ビルトイン・プロパティエディタ  
CustomDateEditorの利用  
CustomEditorConfigurerタグについて  
プロパティエディタの登録方法  
カスタムプロパティエディタの作成  
MyBeanTypeEditorを作成する  

## Chapter 7 Spring Dataによるデータアクセス
### 7.1 Spring JDBCの利用
Spring Dataについて  
プロジェクトを用意する  
Bean構成ファイルの作成  
データソースとJDBCテンプレート  
SQLファイル（script.sql）を作成する  
SQLファイルを編集する  
Appクラスを作成する  
JdbcTemplateの基本操作  
後はSQLクエリー次第  

### 7.2 Spring Data JPAの利用
pom.xmlにSpring Data JPAを追加する  
Spring Data JPAの利用に必要なもの  
pom.xmlの変更  
エンティティクラスの作成  
エンティティのためのアノテーション  
persistene.xmlファイルを作成する  
persistence.xmlを編集する  
永続性ユニットの定義について  
プロパティファイルを作成する  
Bean構成ファイルを変更する  
変更されたBean構成ファイルの内容  
AppクラスでJPAを利用する  
EntityManagerを使ってエンティティを取り出す  
IDでエンティティを取得する「find」  

### 7.3 JPAの基本操作
DAOインターフェイスを作成する  
MyPersonDataDaoImplクラスの作成  
全エンティティの検索  
createQueryについて  
値を指定して検索する  
エンティティの追加  
EntityTransactionによるトランザクション  
エンティティの更新（updateEntity）  
エンティティの削除（removeEntity）  
Bean構成クラスを利用する  
Bean構成ファイルのBean作成  

## Chapter 8 Spring Dataを更に活用する
### 8.1 WebアプリケーションにおけるSpring Data JPA
Webアプリケーションプロジェクトの作成  
pom.xmlを変更する  
必要なファイル類をコピーする  
application-config.xmlを編集する  
AbstractMyPerrsonDataDaoクラスの作成  
DAOクラスの変更  
サーブレットのスーパークラスを作成する  
サーブレットを作る  
MyPersonDataServletクラスを編集する  
web.xmlを編集する  
index.jspを編集する  
プロジェクトを実行する  

### 8.2 アノテーションとリポジトリ
@NamedQueryによるクエリーの作成  
エンティティクラスの変更  
DAOクラスの変更  
サーブレットを変更する  
JpaRepositoryの利用  
Bean構成ファイルを追記する  
サーブレットのスーパークラスを変更する  
サーブレットを変更する  
リポジトリの標準メソッド  
リポジトリを拡張する  
メソッド名の仕組み  
メソッドで認識できる単語  
@Queryでメソッドを追加する  
注意すべきは「戻り値」  

### 8.3 Criteria API
Criteria APIの利用  
Criteria API利用の流れを理解する  
フィールドで絞り込む  
whereメソッドによる条件設定  
検索条件式のためのメソッドについて  
並べ替えの「orderBy」  
開始位置と取得数の指定  

### 8.4 バリデーション
エンティティとバリデーション  
Hibernate Validatorをpom.xmlに追加する  
Validator用のBeanを登録する  
MyPersonDataクラスにアノテーションを追加する  
index.jspを変更する  
サーブレットを変更する  
Validatorによるバリデーションのチェック  
バリデーション用のアノテーションについて  
Hibernate Validatorのアノテーション  
メッセージを日本語化する  

## Chapter 9 Spring MVCによるWeb開発
### 9.1 Spring MVCプロジェクトの基本
Web開発の基本は「Spring MVC」  
プロジェクトを作成する  
pom.xmlを変更する  
mvc-config.xmlの修正  
RESTコントローラークラスを作る  
コントローラーの仕組み  
パラメータを渡す  
XMLで出力する  
RESTはコントローラーのみ  

## 9.2 ViewとController
ビュー利用の準備を整える  
コントローラーを作成する  
テンプレートを表示する  
ビューに値を渡す  
Modelによる値の保管  
フォームの送信  
AppControllerにPOSTの処理を追加する  
ModelAndViewを使ったビューの表示  

### 9.3 JPAとデータベース
H2とJPAの組み込み  
データベース設定を追記する  
application-config.xmlの修正  
persistence.xmlの作成  
エンティティクラスの作成  
リポジトリを作成する  
showMessage.jspを変更する  
コントローラーを変更する  
リポジトリ利用のポイントを整理する  

## 9.4 Spring Bootについて
Springの限界とSpring Boot  
Spring Starter Projectを作成する  
pom.xmlについて  
コントローラーの作成  
テンプレートの作成  
エンティティ「PlaceData」の作成  
リポジトリ「PlaceDataRepository」  
プロジェクトを実行しよう  
Spring Bootの中身はSpring MVC  

## Appendix Spring Tool Suiteの基本機能
### A.1 STSの基本設定
### STSの設定について
「General」設定  
「General/Editors」設定  
「Java」設定  
「Java/Editor」設定  
「Spring」設定  
そのほかの設定  

### A.2 開発を支援するメニュー
＜Source＞メニューについて  
＜Refactor＞メニューについて  

### A.3 プロジェクトの利用
プロジェクトの設定について  
プロジェクトの管理  
ワーキングセットについて  
