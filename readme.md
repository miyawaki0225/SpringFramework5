# memo
環境  
本　：JDK 8、STS  
自分：JDK 11、VSCode

予定：7/10までに一通り用語確認、その後理解が不十分な点を2周目。。。
 
- 07/05


- 07/06
- 07/07
- 07/08
- 07/09
- 07/10


# 以下、目次

## Chapter 1 Spring Frameworkの準備
### 1.1 Spring FrameworkとSTSの準備
Java開発の複雑さ  
Spring Frameworkとは？  
Springの働くところ  
Spring利用の方法  
JDKについて  
STSを準備する  
Mavenを準備する  

### 1.2 Spring Tool Suiteの基礎知識
STSを起動する  
STSのビューについて  
ビューを開く  
パースペクティブについて  
プロジェクトの作成について  

1. Javaアプリケーションのプロジェクト
2. Springの基本的なプロジェクト
3. Maven利用のSpringプロジェクト

## Chapter 2 Springプロジェクトの基本
### 2.1 Springのコア機能を押さえる
DIはSpringの「コア」  
SpringとIoCコンテナ  
コアコンテナの機能  

### 2.2 MavenによるSpringプロジェクトの作成
Mavenか、STSか？  
Mavenでプロジェクトを作成する  
生成されるプロジェクト  
サンプルクラス「App.java」を見る  
pom.xmlの中身をチェック  
pom.xmlの基本タグ  
依存ライブラリの設定  
Mavenによるビルドと実行  

### 2.3 STSによるプロジェクト作成
STSでプロジェクトを作る  
Springレガシープロジェクトを作成する  
STSによるプロジェクトの内容  
pom編集エディタについて  
pom.xmlのソースコード  
Appクラスを作成する  
App.javaをチェックしよう  
プログラムを実行する  
プロジェクトをビルドする  

### 2.4 Gradleによる開発
Gradleによる開発は？  
Gradleのインストール  
Gradleプロジェクトを作る  
ソースコードを用意する  
build.gradleの編集  
プログラムのビルドと実行  

## Chapter 3 Dependency Injectionの基本
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
