https://qiita.com/whim0321/items/9640a69e6466a22245f3

## Gitの初期設定

```Console
$ git config --global user.name 'username'
$ git config --global user.email 'username@example.com'
$ git config --global core.editor 'code --wait'
$ git config --global merge.tool 'code --wait "$MERGED"'
$ git config --global push.default simple
$ git config --global pull.rebase false
$ git config --global core.quotepath false
```

- 基本的には「Ctrl+Shift+P」でコマンド画面をだして「git　○○」で検索しても操作できる。

- ターミナルで操作する場合


### stage
> git add ○○

### 確認
> git status

### commit 
> git commit --=「コメント」

### puch
> git push ○○

### create branch

> git branch ○○

### git 切り替え

> git branch でブランチ名を確認して  
> git checkout [ブランチ名]

### delete branch
### ※消す前にはマージしないとエラー（強制的に消す場合は別）
> git branch -d ○○  
> git push --delete origin ○○