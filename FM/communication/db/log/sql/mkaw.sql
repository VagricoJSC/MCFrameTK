SET DEFINE OFF


create table AWT_KN_TAGS (
  ARTICLE_ID VARCHAR2(24) not null
  , TAG_NAME VARCHAR2(100 CHAR) not null
  , TAG_VALUE VARCHAR2(100 CHAR) default '#NULL#' not null
  , TAG_TYPE NUMBER(1) not null
  , USER_ID VARCHAR2(500 CHAR)
  , constraint AWT_KN_TAGS_PKC primary key (ARTICLE_ID,TAG_NAME,TAG_VALUE)
) ;


create table AWT_KN_COMMENT_FILES (
  ARTICLE_ID VARCHAR2(24 CHAR) not null
  , ID VARCHAR2(24 CHAR) not null
  , BID VARCHAR2(16 CHAR) not null
  , constraint AWT_KN_COMMENT_FILES_PKC primary key (ARTICLE_ID,ID,BID)
) ;


create table AWT_KN_COMMENTS (
  ARTICLE_ID VARCHAR2(24 CHAR) not null
  , ID VARCHAR2(24 CHAR) not null
  , TEXT CLOB
  , USER_ID VARCHAR2(500 CHAR)
  , POST_DATE TIMESTAMP(3)
  , constraint AWT_KN_COMMENTS_PKC primary key (ARTICLE_ID,ID)
) ;


create table AWT_KN_POSTDATE (
  ARTICLE_ID VARCHAR2(24 CHAR) not null
  , USER_ID VARCHAR2(500 CHAR) not null
  , POST_DATE TIMESTAMP(3) not null
  , POST_TYPE CHAR(2 CHAR)
  , constraint AWT_KN_POSTDATE_PKC primary key (ARTICLE_ID,USER_ID,POST_DATE)
) ;


create table AWT_KN_ATTACHMENTS (
  ARTICLE_ID VARCHAR2(24 CHAR) not null
  , BID VARCHAR2(16 CHAR) not null
  , constraint AWT_KN_ATTACHMENTS_PKC primary key (ARTICLE_ID,BID)
) ;


create table AWT_ARTICLE (
  ID VARCHAR2(24) not null
  , TITLE VARCHAR2(100 CHAR)
  , TEXT CLOB
  , USER_ID VARCHAR2(500 CHAR) not null
  , GROUP_ID VARCHAR2(31 CHAR) not null
  , POST_DATE TIMESTAMP(3) not null
  , UPD_CNTR NUMBER(24,0) DEFAULT 0 not null
  , constraint AWT_ARTICLE_PKC primary key (ID)
) ;


create table AWT_USER_INIT (
  USER_ID VARCHAR2(500 CHAR) not null
  , constraint AWT_USER_INIT_PKC primary key (USER_ID)
) ;


create table AWT_TL_TAGS (
  ACTIVITY_ID VARCHAR2(24) not null
  , TAG_NAME VARCHAR2(100 CHAR) not null
  , TAG_VALUE VARCHAR2(100 CHAR) default '#NULL#' not null
  , TAG_TYPE NUMBER(1) not null
  , USER_ID VARCHAR2(500 CHAR)
  , constraint AWT_TL_TAGS_PKC primary key (ACTIVITY_ID,TAG_NAME,TAG_VALUE)
) ;


create table AWT_TL_COMMENT_FILES (
  ACTIVITY_ID VARCHAR2(24 CHAR) not null
  , ID VARCHAR2(24 CHAR) not null
  , BID VARCHAR2(16 CHAR) not null
  , constraint AWT_TL_COMMENT_FILES_PKC primary key (ACTIVITY_ID,ID,BID)
) ;


create table AWT_TL_POSTDATE (
  ACTIVITY_ID VARCHAR2(24 CHAR) not null
  , POST_DATE TIMESTAMP(3) not null
  , POST_TYPE CHAR(2 CHAR)
  , constraint AWT_TL_POSTDATE_PKC primary key (ACTIVITY_ID,POST_DATE)
) ;


create table AWT_TL_COMMENTS (
  ACTIVITY_ID VARCHAR2(24 CHAR) not null
  , ID VARCHAR2(24 CHAR) not null
  , TEXT CLOB
  , USER_ID VARCHAR2(500 CHAR)
  , POST_DATE TIMESTAMP(3)
  , constraint AWT_TL_COMMENTS_PKC primary key (ACTIVITY_ID,ID)
) ;


create table AWT_BINARY (
  BID VARCHAR2(16 CHAR) not null
  , NAME VARCHAR2(100 CHAR) not null
  , DATA BLOB
  , constraint AWT_BINARY_PKC primary key (BID)
) ;


create table AWT_TL_ATTACHMENTS (
  ACTIVITY_ID VARCHAR2(24 CHAR) not null
  , BID VARCHAR2(16 CHAR) not null
  , constraint AWT_TL_ATTACHMENTS_PKC primary key (ACTIVITY_ID,BID)
) ;


create table AWT_GROUP_FOLLOWERS (
  USER_ID VARCHAR2(500 CHAR) not null
  , GROUP_ID VARCHAR2(31 CHAR) not null
  , AUTO_REGISTERED CHAR(1) not null
  , constraint AWT_GROUP_FOLLOWERS_PKC primary key (USER_ID,GROUP_ID)
) ;


create table AWT_TIMELINE (
  USER_ID VARCHAR2(500 CHAR) not null
  , ACTIVITY_ID VARCHAR2(24 CHAR) not null
  , constraint AWT_TIMELINE_PKC primary key (USER_ID,ACTIVITY_ID)
) ;


create table AWT_ACTIVITIES (
  ID VARCHAR2(24) not null
  , TITLE VARCHAR2(100 CHAR)
  , TEXT CLOB
  , USER_ID VARCHAR2(500 CHAR) not null
  , GROUP_ID VARCHAR2(31 CHAR) not null
  , POST_DATE TIMESTAMP(3) not null
  , constraint AWT_ACTIVITIES_PKC primary key (ID)
) ;


create table AWT_USER_FOLLOWERS (
  USER_ID VARCHAR2(500 CHAR) not null
  , FOLLOW_ID VARCHAR2(500 CHAR) not null
  , AUTO_REGISTERED CHAR(1) not null
  , constraint AWT_USER_FOLLOWERS_PKC primary key (USER_ID,FOLLOW_ID)
) ;


create table AWM_USERS_AFFILIATIONS (
  USER_ID VARCHAR2(500 CHAR) not null
  , GROUP_ID VARCHAR2(31 CHAR) not null
  , ADMIN_TYPE VARCHAR2(1 CHAR) not null
  , constraint AWM_USERS_AFFILIATIONS_PKC primary key (USER_ID,GROUP_ID)
) ;


create table AWM_GROUPS (
  ID VARCHAR2(31 CHAR) not null
  , NAME VARCHAR2(100 CHAR)
  , DESCRIPTION VARCHAR2(200 CHAR)
  , ACCESS_TYPE CHAR(1 CHAR) not null
  , IS_CLOSED VARCHAR2(1 CHAR)  DEFAULT '0' not null
  , UPD_CNTR NUMBER(24) not null
  , BID VARCHAR2(16 CHAR)
  , constraint AWM_GROUPS_PKC primary key (ID)
) ;


create table AWM_COMPANY_AFFILIATIONS (
   COMPANY VARCHAR2(30 CHAR) not null
  , GROUP_ID VARCHAR2(31 CHAR) not null
  , constraint AWM_COMPANY_AFFILIATIONS_PKC primary key (COMPANY,GROUP_ID)
) ;


create table AWM_USERS (
  ID VARCHAR2(500 CHAR) not null
  , NAME VARCHAR2(500 CHAR)
  , constraint AWM_USERS_PKC primary key (ID)
) ;


create view AWV_KN_COMMENT as 
SELECT
	COMM.ARTICLE_ID,
	COMM.ID,
	COMM.TEXT,
	COMM.USER_ID,
	COMM.POST_DATE,
	COMMF.BID,
	BIN.NAME FILE_NAME
FROM
	AWT_KN_COMMENTS COMM
	LEFT OUTER JOIN
	AWT_KN_COMMENT_FILES COMMF
	ON
	COMM.ARTICLE_ID = COMMF.ARTICLE_ID AND
	COMM.ID = COMMF.ID
	LEFT OUTER JOIN
	AWT_BINARY BIN
	ON
	COMMF.BID = BIN.BID
;


create view AWV_TL_COMMENT as 
SELECT
	COMM.ACTIVITY_ID,
	COMM.ID,
	COMM.TEXT,
	COMM.USER_ID,
	COMM.POST_DATE,
	COMMF.BID,
	BIN.NAME FILE_NAME
FROM
	AWT_TL_COMMENTS COMM
	LEFT OUTER JOIN
	AWT_TL_COMMENT_FILES COMMF
	ON
	COMM.ACTIVITY_ID = COMMF.ACTIVITY_ID AND
	COMM.ID = COMMF.ID
	LEFT OUTER JOIN
	AWT_BINARY BIN
	ON
	COMMF.BID = BIN.BID
;


comment on table AWT_KN_TAGS is 'ナレッジタグ';

comment on column AWT_KN_TAGS.ARTICLE_ID is 'アーティクルID';

comment on column AWT_KN_TAGS.TAG_NAME is 'タグ名';

comment on column AWT_KN_TAGS.TAG_VALUE is 'タグ値	 未入力時は「#NULL#」とする。これを予約語としてタグ値には指定できないようにする。';

comment on column AWT_KN_TAGS.TAG_TYPE is 'タグ区分	 1：共通、2：パーソナル';

comment on column AWT_KN_TAGS.USER_ID is '登録ユーザ';


comment on table AWT_KN_COMMENT_FILES is 'ナレッジコメント添付ファイル';

comment on column AWT_KN_COMMENT_FILES.ARTICLE_ID is 'アーティクルID';

comment on column AWT_KN_COMMENT_FILES.ID is 'コメントID';

comment on column AWT_KN_COMMENT_FILES.BID is 'ファイルID';


comment on table AWT_KN_COMMENTS is 'ナレッジコメント';

comment on column AWT_KN_COMMENTS.ARTICLE_ID is 'アーティクルID';

comment on column AWT_KN_COMMENTS.ID is 'コメントID';

comment on column AWT_KN_COMMENTS.TEXT is '本文';

comment on column AWT_KN_COMMENTS.USER_ID is 'コメントユーザID';

comment on column AWT_KN_COMMENTS.POST_DATE is 'コメント日時';


comment on table AWT_KN_POSTDATE is 'ナレッジ投稿日時';

comment on column AWT_KN_POSTDATE.ARTICLE_ID is 'アーティクルID';

comment on column AWT_KN_POSTDATE.USER_ID is '投稿者';

comment on column AWT_KN_POSTDATE.POST_DATE is '投稿日時';

comment on column AWT_KN_POSTDATE.POST_TYPE is '投稿区分	 1:新規登録、2:コメント';


comment on table AWT_KN_ATTACHMENTS is 'ナレッジ添付ファイル';

comment on column AWT_KN_ATTACHMENTS.ARTICLE_ID is 'アーティクルID';

comment on column AWT_KN_ATTACHMENTS.BID is 'ファイルID';


comment on table AWT_ARTICLE is 'ナレッジアーティクル';

comment on column AWT_ARTICLE.ID is 'アーティクルID';

comment on column AWT_ARTICLE.TITLE is 'タイトル';

comment on column AWT_ARTICLE.TEXT is '本文';

comment on column AWT_ARTICLE.USER_ID is '投稿者';

comment on column AWT_ARTICLE.GROUP_ID is '投稿先グループ';

comment on column AWT_ARTICLE.POST_DATE is '投稿日時	 新規投稿日のみ保持する';

comment on column AWT_ARTICLE.UPD_CNTR is '更新カウンタ';


comment on table AWT_USER_INIT is 'ユーザ初期化テーブル';

comment on column AWT_USER_INIT.USER_ID is 'ユーザID';


comment on table AWT_TL_TAGS is 'タイムラインタグ';

comment on column AWT_TL_TAGS.ACTIVITY_ID is 'アクティビティID';

comment on column AWT_TL_TAGS.TAG_NAME is 'タグ名';

comment on column AWT_TL_TAGS.TAG_VALUE is 'タグ値	 未入力時は「#NULL#」とする。これを予約語としてタグ値には指定できないようにする。';

comment on column AWT_TL_TAGS.TAG_TYPE is 'タグ区分	 1：共通、2：パーソナル';

comment on column AWT_TL_TAGS.USER_ID is '登録ユーザ';


comment on table AWT_TL_COMMENT_FILES is 'タイムラインコメント添付ファイル';

comment on column AWT_TL_COMMENT_FILES.ACTIVITY_ID is '活動ID';

comment on column AWT_TL_COMMENT_FILES.ID is 'コメントID';

comment on column AWT_TL_COMMENT_FILES.BID is 'ファイルID';


comment on table AWT_TL_POSTDATE is 'タイムライン投稿日時';

comment on column AWT_TL_POSTDATE.ACTIVITY_ID is '活動ID';

comment on column AWT_TL_POSTDATE.POST_DATE is '投稿日時';

comment on column AWT_TL_POSTDATE.POST_TYPE is '投稿区分	 1:新規登録、2:コメント';


comment on table AWT_TL_COMMENTS is 'タイムラインコメント';

comment on column AWT_TL_COMMENTS.ACTIVITY_ID is '活動ID';

comment on column AWT_TL_COMMENTS.ID is 'コメントID';

comment on column AWT_TL_COMMENTS.TEXT is '本文';

comment on column AWT_TL_COMMENTS.USER_ID is 'コメントユーザID';

comment on column AWT_TL_COMMENTS.POST_DATE is 'コメント日時';


comment on table AWT_BINARY is 'バイナリファイル';

comment on column AWT_BINARY.BID is 'BID';

comment on column AWT_BINARY.NAME is '名称';

comment on column AWT_BINARY.DATA is 'データ';


comment on table AWT_TL_ATTACHMENTS is 'タイムライン添付ファイル';

comment on column AWT_TL_ATTACHMENTS.ACTIVITY_ID is '活動ID';

comment on column AWT_TL_ATTACHMENTS.BID is 'ファイルID';


comment on table AWT_GROUP_FOLLOWERS is 'グループフォロワー';

comment on column AWT_GROUP_FOLLOWERS.USER_ID is 'ユーザID	 フォローする人';

comment on column AWT_GROUP_FOLLOWERS.GROUP_ID is 'フォローグループID	 USER_IDがフォローしているグループID';

comment on column AWT_GROUP_FOLLOWERS.AUTO_REGISTERED is 'システム自動登録	 ''1''：自動登録、''0''：通常登録';


comment on table AWT_TIMELINE is 'タイムライン';

comment on column AWT_TIMELINE.USER_ID is 'ユーザID';

comment on column AWT_TIMELINE.ACTIVITY_ID is '活動ID';


comment on table AWT_ACTIVITIES is 'タイムラインアクティビティ';

comment on column AWT_ACTIVITIES.ID is 'アクティビティID';

comment on column AWT_ACTIVITIES.TITLE is 'タイトル';

comment on column AWT_ACTIVITIES.TEXT is '本文';

comment on column AWT_ACTIVITIES.USER_ID is '投稿者';

comment on column AWT_ACTIVITIES.GROUP_ID is '投稿先グループ';

comment on column AWT_ACTIVITIES.POST_DATE is '投稿日時	 新規投稿日のみ保持する';


comment on table AWT_USER_FOLLOWERS is 'ユーザフォロワー';

comment on column AWT_USER_FOLLOWERS.USER_ID is 'ユーザID';

comment on column AWT_USER_FOLLOWERS.FOLLOW_ID is 'フォローユーザID	 USER_IDがフォローしているユーザのユーザID';

comment on column AWT_USER_FOLLOWERS.AUTO_REGISTERED is 'システム自動登録	 ''1''：自動登録、''0''：通常登録';


comment on table AWM_USERS_AFFILIATIONS is '所属グループ';

comment on column AWM_USERS_AFFILIATIONS.USER_ID is 'ユーザID';

comment on column AWM_USERS_AFFILIATIONS.GROUP_ID is 'グループID';

comment on column AWM_USERS_AFFILIATIONS.ADMIN_TYPE is '管理者区分	 1：管理者、2：通常ユーザ';


comment on table AWM_GROUPS is 'グループ';

comment on column AWM_GROUPS.ID is 'グループID	 GROUP ID';

comment on column AWM_GROUPS.NAME is 'グループ名';

comment on column AWM_GROUPS.DESCRIPTION is '説明';

comment on column AWM_GROUPS.ACCESS_TYPE is '公開形式	 1:PUBLIC、2:PRIVATE';

comment on column AWM_GROUPS.IS_CLOSED is '閉じる';

comment on column AWM_GROUPS.UPD_CNTR is '更新カウンタ';

comment on column AWM_GROUPS.BID is 'グループアイコン';


comment on table AWM_USERS is 'ユーザ';

comment on column AWM_USERS.ID is 'ユーザID	 ユーザID';

comment on column AWM_USERS.NAME is 'ユーザ名	 ユーザ名';


comment on table AWM_COMPANY_AFFILIATIONS is '会社所属グループ';

comment on column AWM_COMPANY_AFFILIATIONS.COMPANY is '会社';

comment on column AWM_COMPANY_AFFILIATIONS.GROUP_ID is 'グループID';

CREATE SEQUENCE AWS_ACTIVITYID
start with 1
minvalue 1
maxvalue 999999999999999999999999
cycle
ORDER;

CREATE SEQUENCE AWS_BINARYID
start with 1
minvalue 1
maxvalue 9999999999999999
cycle
ORDER;

CREATE SEQUENCE AWS_TL_COMMENTID
start with 1
minvalue 1
maxvalue 999999999999999999999999
cycle
ORDER;

CREATE SEQUENCE AWS_GROUPID
start with 1
minvalue 1
maxvalue 9999999999999999
cycle
ORDER;

CREATE SEQUENCE AWS_ARTICLEID
start with 1
minvalue 1
maxvalue 999999999999999999999999
cycle
ORDER;

CREATE SEQUENCE AWS_KN_COMMENTID
start with 1
minvalue 1
maxvalue 999999999999999999999999
cycle
ORDER;

DELETE FROM AWM_GROUPS;

INSERT INTO AWM_GROUPS(ID, NAME, DESCRIPTION, ACCESS_TYPE, UPD_CNTR) VALUES('0', 'ALL', 'ALL', 1, 0);

INSERT INTO AWM_USERS_AFFILIATIONS(USER_ID, GROUP_ID, ADMIN_TYPE) VALUES('admin1', '0', '1');

INSERT INTO AWM_USERS_AFFILIATIONS(USER_ID, GROUP_ID, ADMIN_TYPE) VALUES('admin2', '0', '1');

INSERT INTO AWM_USERS_AFFILIATIONS(USER_ID, GROUP_ID, ADMIN_TYPE) VALUES('admin3', '0', '1');

INSERT INTO AWT_USER_INIT(USER_ID) VALUES('admin1');

INSERT INTO AWT_USER_INIT(USER_ID) VALUES('admin2');

INSERT INTO AWT_USER_INIT(USER_ID) VALUES('admin3');

SET DEFINE ON
