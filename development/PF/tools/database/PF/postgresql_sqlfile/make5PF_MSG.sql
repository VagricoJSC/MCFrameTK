\encoding UTF-8

DELETE FROM FCT_MSG WHERE MSGID = 'PFBAL0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBAL0001',
	'W',
	'{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBAL0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBAL0002',
	'W',
	'ＳＡＰのAPI呼び出しでエラーが発生しました。\n仕訳送信ＩＦ確認画面でエラーメッセージを確認してください。\nデータＮＯ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBAL0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBAL0003',
	'I',
	'ＳＡＰのAPI呼び出しが終了しました。メッセージがあります。\n仕訳送信ＩＦ確認画面でメッセージを確認してください。\nデータＮＯ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBBL0001',
	'I',
	'処理を開始します。（GA連携バッチ受信実行）');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBBL0002',
	'I',
	'処理を終了しました。（GA連携バッチ受信実行）');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBBL0003',
	'W',
	'会計関連のＩＦ処理区分を指定してください。\nＩＦ処理区分：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0004' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBBL0004',
	'W',
	'外部システムマスタでＷｅｂ　ＡＰＩフラグがオンである外部システムＣＤを指定してください。\n外部システムＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0005' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBBL0005',
	'W',
	'GA受信実行で有効なＩＦ処理区分が指定されていません。\nＩＦ処理区分：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0006' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBBL0006',
	'W',
	'ＩＦ制御区分の設定を取得できませんでした。\nＩＦ通信ルールマスタの設定を確認してください。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}\nＩＦ制御区分：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0007' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBBL0007',
	'W',
	'Ｗｅｂ　ＡＰＩオペレーションが取得できませんでした。\nＩＦアダプタマスタの設定を確認してください。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0008' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBBL0008',
	'W',
	'ＧＡのAPI呼び出しでエラーが発生しました。ＧＡのエラーメッセージを確認してください。\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0009' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBBL0009',
	'W',
	'ＧＡのAPI呼び出しで例外エラーが発生しました。\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0010' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBBL0010',
	'W',
	'GAに接続するためのユーザ情報が取得できませんでした。\n外部システムユーザマスタの設定を確認してください。\n外部システムＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0101' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBBL0101',
	'W',
	'ＧＡのAPI呼び出しでエラーが発生しました。\n売上伝票送信ＩＦ確認画面でエラーメッセージを確認してください。\nデータＮＯ：{1}\n売上伝票ＮＯ：{2}\nインボイスＮＯ：{3}\n売上実績ＮＯ：{4}\n支給実績ＮＯ：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0102' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBBL0102',
	'W',
	'{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0103' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBBL0103',
	'W',
	'ＧＡのAPI呼び出しでエラーが発生しました。\n仕入伝票送信ＩＦ確認画面でエラーメッセージを確認してください。\nデータＮＯ：{1}\n仕入伝票ＮＯ：{2}\n受領インボイスＮＯ：{3}\n受領インボイス管理ＮＯ：{4}\n仕入実績ＮＯ：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0104' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBBL0104',
	'W',
	'複数の売上伝票をまとめて送信した際に他の伝票でエラーが発生したため、ＧＡに反映できませんでした。\n売上伝票ＩＦ一覧照会画面から未反映の売上伝票を再送信してください。\nデータＮＯ：{1}\n売上伝票ＮＯ：{2}\nインボイスＮＯ：{3}\n売上実績ＮＯ：{4}\n支給実績ＮＯ：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0105' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBBL0105',
	'W',
	'複数の仕入伝票をまとめて送信した際に他の伝票でエラーが発生したため、ＧＡに反映できませんでした。\n仕入伝票ＩＦ一覧照会画面から未反映の仕入伝票を再送信してください。\nデータＮＯ：{1}\n仕入伝票ＮＯ：{2}\n受領インボイスＮＯ：{3}\n受領インボイス管理ＮＯ：{4}\n仕入実績ＮＯ：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBCL0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBCL0001',
	'W',
	'必須のコマンド引数が取得できませんでした。\nＩＦ通信ルールマスタを確認してください。\nCMD_PATH：{1}\nCMD_ARG01：{2}\nCMD_ARG04：{3}\nCMD_ARG05：{4}\nCMD_ARG06：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBCL0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBCL0002',
	'W',
	'BI Linkバッチ制御テーブルをロックできませんでした。\n処理を中断します。\nＩＦ処理区分：{1}\n外部システムＣＤ：{2}\n会社ＣＤ：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBCL0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBCL0003',
	'W',
	'BI Linkバッチ制御テーブルのロックを解除できませんでした。\n送信ＩＦ実行確認画面でロックを解除してください。\nＩＦ処理区分：{1}\n外部システムＣＤ：{2}\n会社ＣＤ：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZP0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZP0001',
	'I',
	'変換処理を実行します。よろしいですか？');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZP0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZP0002',
	'I',
	'変換処理を実行しました。');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZP0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZP0003',
	'I',
	'変換対象が選択されていません。');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZP0004' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZP0004',
	'I',
	'更新処理を実行します。よろしいですか？');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZP0005' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZP0005',
	'I',
	'更新処理を実行しました。');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZP0006' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZP0006',
	'I',
	'更新対象が選択されていません。');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZP0007' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZP0007',
	'I',
	'変換・送信取消処理を実行します。よろしいですか？');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZP0008' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZP0008',
	'I',
	'変換・送信取消処理を実行しました。');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZP0009' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZP0009',
	'I',
	'変換・送信取消対象が選択されていません。');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0001',
	'W',
	'変換先が取得できませんでした。\nＩＦコード変換マスタの設定を確認してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n取引先ＣＤ：{4}\nＩＦ項目：{5}（{6}）\nＩＦ項目区分：{7}\n自社用ＣＤ：{8}\n相手先ＣＤ：{9}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0002',
	'W',
	'インスタンスが生成できませんでした。\nクラス：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0003',
	'W',
	'ファイルが存在しませんでした。\nディレクトリ：{1}\nファイル名：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0004' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0004',
	'W',
	'送信対象のデータが存在しませんでした。\nテーブル名：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0005' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0005',
	'W',
	'指定されたファイル形式は扱えません。\nＩＦ通信ルールマスタの設定を確認してください。\n外部システムＣＤ：{1}\nＩＦ制御区分：{2}\n内容（文字列）：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0006' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0006',
	'W',
	'コード変換の結果、項目定義に適合しない項目があります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n項目名：{3}（{4}）\n値：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0007' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0007',
	'W',
	'変換先のコードが複数件取得されました。\nＩＦコード変換マスタの設定を確認してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n取引先ＣＤ：{4}\nＩＦ項目：{5}（{6}）\nＩＦ項目区分：{7}\n自社用ＣＤ：{8}\n相手先ＣＤ：{9}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0008' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0008',
	'W',
	'ファイルの値が不正です。\nファイルパス：{1}\nファイル名：{2}\n行番号：{3}\n項目名：{4}（{5}）\n書式：{6}\n値：{7}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0009' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0009',
	'W',
	'項目定義に適合しない値が指定されています。\nファイルパス：{1}\nファイル名：{2}\n行番号：{3}\n項目名：{4}（{5}）\n値：{6}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0010' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0010',
	'W',
	'NotNull制約の項目にNullが指定されています。\nファイルパス：{1}\nファイル名：{2}\n行番号：{3}\n項目名：{4}（{5}）');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0011' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0011',
	'W',
	'ファイルサイズが０バイトです。\nＩＦ処理区分：{1}\nファイルパス：{2}\nファイル名：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0012' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0012',
	'W',
	'変換対象のデータが存在しませんでした。\nテーブル名：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0013' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0013',
	'W',
	'ファイル出力オペレーションが取得できませんでした。送信対象から除外します。\nＩＦ処理区分：{1}\n外部システムＣＤ：{2}\nデータＮＯ：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0014' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0014',
	'W',
	'ＩＦ処理区分が不正です。送信対象から除外します。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}\nデータＮＯ：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0015' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0015',
	'I',
	'送信変換処理を開始します。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}\n会社ＣＤ：{3}\nコード変換オペレーション：{4}\nファイル入出力オペレーション：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0016' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0016',
	'I',
	'コード変換処理を開始します。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}\nコード変換オペレーション：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0017' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0017',
	'I',
	'コード変換対象がありませんでした。');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0018' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0018',
	'I',
	'コード変換処理が終了しました。\n処理対象：{1}\n変換件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0019' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0019',
	'I',
	'送信変換対象がありませんでした。');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0020' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0020',
	'I',
	'送信変換処理が終了しました。\n処理対象：{1}\n作成件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0021' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0021',
	'I',
	'受信変換処理を開始します。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}\nローカルディレクトリ：{3}\nファイル転送ロック方式：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0022' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0022',
	'I',
	'受信変換対象がありませんでした。以下の可能性があります。\n・対象ファイルが存在しない\n・IF通信ルールマスタのLOCAL_DIRの指定が間違っている');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0023' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0023',
	'I',
	'受信変換処理が終了しました。\n処理対象：{1}\n取込件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0024' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0024',
	'I',
	'受信ファイル名：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0025' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0025',
	'I',
	'データ取込処理を実行しました。\n取込処理オペレーション：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0026' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0026',
	'W',
	'データ取込処理の実行に失敗しました。\n取込処理オペレーション：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0027' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0027',
	'W',
	'実行に必要なライセンスが割り当てられていないため、データ取込処理の実行をスキップしました。\n取込処理オペレーション：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0028' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0028',
	'W',
	'ファイル受信に必要なＦＴＰ情報が設定されていません。\nＩＦ通信ルールマスタの設定を確認してください。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}\n送信先ＤＩＲ：{3}\nホスト：{4}\nユーザ：{5}\nパスワード：{6}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0029' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0029',
	'I',
	'ファイル送信処理を開始します。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}\n送信区分：{3}\nローカルディレクトリ：{4}\n送信先ディレクトリ：{5}\nホスト名：{6}\nユーザ名：{7}\nオプション：{8}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0030' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0030',
	'I',
	'ファイル送信対象がありませんでした。');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0031' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0031',
	'I',
	'ファイル送信処理が終了しました。\n送信対象：{1}\n送信件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0032' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0032',
	'I',
	'送信ファイル名：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0033' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0033',
	'I',
	'受信ファイル名：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0034' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0034',
	'W',
	'送信に失敗しました。{1} 秒後にリトライします。\nリトライ回数：{2}/{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0035' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0035',
	'I',
	'ファイル受信処理を開始します。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}\n受信区分：{3}\nローカルディレクトリ：{4}\n受信元ディレクトリ：{5}\nホスト名：{6}\nユーザ名：{7}\n転送タイプ：{8}\nオプション：{9}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0036' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0036',
	'I',
	'ファイル受信対象がありませんでした。');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0037' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0037',
	'I',
	'ファイル受信処理が終了しました。\n受信対象：{1}\n受信件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0038' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0038',
	'W',
	'サーバからファイルが取得できませんでした。\nホスト名：{1}\n受信区分：{2}\nユーザ：{3}\nサーバパス：{4}\nファイル名：{5}\nＩＦ処理区分：{6}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0039' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0039',
	'I',
	'{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0040' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0040',
	'I',
	'処理を開始します。（送信変換バッチ）');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0041' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0041',
	'I',
	'処理を終了しました。（送信変換バッチ）');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0042' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0042',
	'I',
	'処理を開始します。（ファイル送信バッチ）');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0043' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0043',
	'I',
	'処理を終了しました。（ファイル送信バッチ）');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0044' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0044',
	'I',
	'処理を開始します。（ファイル受信バッチ）');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0045' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0045',
	'I',
	'処理を終了しました。（ファイル受信バッチ）');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0046' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0046',
	'I',
	'処理を開始します。（受信変換バッチ）');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0047' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0047',
	'I',
	'処理を終了しました。（受信変換バッチ）');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0048' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0048',
	'W',
	'処理対象のデータがありません。');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0049' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0049',
	'W',
	'更新対象のＥＳＢ連携テーブルの指定がありません。\n定数定義：ＩＦ処理区分を確認してください。');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0050' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0050',
	'W',
	'更新対象のＥＳＢ連携テーブルが見つかりません。\n定数定義：ＩＦ処理区分のを確認してください。\n更新対象テーブル：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0051' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0051',
	'W',
	'ＩＦ処理区分が不正です。送信対象から除外します。\nＩＦ処理区分：{1}\nデータＮＯ：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0052' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0052',
	'W',
	'外部システムＣＤが不正です。送信対象から除外します。\n外部システムＣＤ：{1}\nデータＮＯ：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0053' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0053',
	'W',
	'ファイル送信に必要なＦＴＰ情報が設定されていません。\nＩＦ通信ルールマスタの設定を確認してください。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}\nＩＦ制御区分：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0054' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0054',
	'W',
	'処理対象のＩＦ処理区分、外部システムＣＤが指定されていません。処理を中止します。\nＩＦ処理区分：{1}\n外部システムＣＤ：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0055' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0055',
	'W',
	'ファイル送信に必要なＦＴＰ情報が設定されていません。\nＩＦ通信ルールマスタの設定を確認してください。\nＩＦ処理区分：{1}\n外部システムＣＤ：{2}\nＩＦ制御区分：{3}\n');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0056' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0056',
	'W',
	'ＩＦ送受信制御テーブルの登録に失敗しました。\n以下のファイルをtrashもしくはerrorフォルダからreadyに戻し、受信変換処理を再実行してください。\nファイル名：{1}\nファイルパス：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0057' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0057',
	'I',
	'---------- FTP PUT START ----------');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0058' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0058',
	'I',
	'---------- FTP PUT END   ----------');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0059' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0059',
	'I',
	'---------- FILE COPY START ----------');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0060' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0060',
	'I',
	'---------- FILE COPY END   ----------');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0061' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0061',
	'I',
	'待機中のスレッドに割込みが発生しました。（参考情報）');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0062' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0062',
	'W',
	'待機中のスレッドに割込みが発生しました。\n安全のために処理を中断します。');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0063' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0063',
	'W',
	'ファイル送信方法が無効のため送信できません。送信対象から除外します。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}\nファイル送信方法（ＩＦ制御区分のSEND_TYP）：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0064' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0064',
	'W',
	'送信先ディレクトリが指定されていません。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0065' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0065',
	'I',
	'送信変換処理を開始します。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}\n会社ＣＤ：{3}\nコード変換オペレーション：{4}\nＷｅｂＡＰＩオペレーション：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0066' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0066',
	'I',
	'送信変換処理を開始します。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}\n会社ＣＤ：{3}\nコード変換オペレーション：{4}\nコマンド実行オペレーション：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0067' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0067',
	'I',
	'処理を開始します。（コマンド実行バッチ）');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0068' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0068',
	'I',
	'処理を終了しました。（コマンド実行バッチ）');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0069' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0069',
	'I',
	'コマンドは正常に終了しました。\nＩＦ処理区分：{1}\n外部システムＣＤ：{2}\n終了コード：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0070' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0070',
	'W',
	'コマンド実行中にエラーが発生しました。\nＩＦ処理区分：{1}\n外部システムＣＤ：{2}\n終了コード：{3}\n内容：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0071' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0071',
	'I',
	'処理対象外である送受信状況区分のため、処理をスキップしました。\nデータＮＯ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0072' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0072',
	'W',
	'ファイル受信に必要なＳＦＴＰ情報が設定されていません。\nＩＦ通信ルールマスタの設定を確認してください。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}\n送信先ＤＩＲ：{3}\nホスト：{4}\nユーザ：{5}\nパスワード：{6}\n秘密鍵ファイルパス：{7}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0073' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0073',
	'W',
	'ファイル送信に必要なＳＦＴＰ情報が設定されていません。\nＩＦ通信ルールマスタの設定を確認してください。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}\nＩＦ制御区分：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0074' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0074',
	'W',
	'パスワード認証方式の場合はパスワードを指定してください。\nＩＦ通信ルールマスタの設定を確認してください。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}\nＩＦ制御区分：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0075' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0075',
	'W',
	'ファイル受信方法が無効のため受信できません。受信対象から除外します。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}\nファイル受信方法（ＩＦ制御区分のRECV_TYP）：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0076' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0076',
	'I',
	'---------- SFTP PUT START ----------');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0077' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0077',
	'I',
	'---------- SFTP PUT END   ----------');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0078' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0078',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\nシノニムの参照先が見つかりませんでした。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0079' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0079',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\nマッピングの参照先が見つかりませんでした。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0080' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0080',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n項目のデータ型とマッピングの参照先のデータ型が一致しませんでした。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0081' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0081',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n項目名が重複しています。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0082' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0082',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n制御項目の値が重複しています。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0083' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0083',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n項目のデータ型とダミー値のデータ型が一致しませんでした。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0084' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0084',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\nキーに対して値が指定されていませんでした。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0085' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0085',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n指定可能な値の範囲を超えて指定されています。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}\n値：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0086' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0086',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\nキーに対する値のデータ型が次の通りではありませんでした。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}\nデータ型：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0087' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0087',
	'W',
	'固定長形式ファイルの送受信に必要な情報が設定されていません。\nＩＦ通信ルールマスタの設定を確認してください。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}\nＩＦ制御区分：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0088' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0088',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n指定可能な値と異なる値が指定されています。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}\n値：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0089' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0089',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\nキー：{5} と同じ値は指定できません。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}\n値：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0090' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0090',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n次のキーに対する値の組み合わせは指定できません。\nディレクトリ：{1}\nファイル名：{2}\nキー1（{3}：{4}）\nキー2（{5}：{6}）');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0091' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0091',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n次のキーに対する値の組み合わせは指定できません。\nディレクトリ：{1}\nファイル名：{2}\nキー1（{3}：{4}）\nキー2（{5}：{6}）\nキー3（{7}：{8}）');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0092' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0092',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n次のキーに対する値の組み合わせは指定できません。\nディレクトリ：{1}\nファイル名：{2}\nキー1（{3}：{4}）\nキー2（{5}：{6}）\nキー3（{7}：{8}）\nキー4（{9}：{10}）');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0093' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0093',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n制御項目の数とレコードの数が一致しませんでした。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0094' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0094',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\nキーに対する値は指定できません。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0095' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0095',
	'W',
	'ファイル入出力オペレーションが固定長形式に対応してません。\nＩＦ通信ルールマスタの設定を確認してください。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0096' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0096',
	'W',
	'文字のエンコーディングがサポートされていません。\nEncode：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0097' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0097',
	'W',
	'ファイル出力できませんでした。\nディレクトリ：{1}\nファイル名：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0098' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0098',
	'W',
	'指定のバイト数に値を変換できませんでした。\n項目名：{1}\nバイト数：{2}\n値：{3}\n埋め文字：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0099' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0099',
	'W',
	'属性項目の値として参照先の値は使用できません。\n項目名：{1}\n属性項目：参照先：値\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0100' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0100',
	'I',
	'ファイルクローズ処理に失敗しましたが、処理は続行します。');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0101' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0101',
	'W',
	'ファイルへデータを書き込みできませんでした。\nディレクトリ：{1}\nファイル名：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0102' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0102',
	'W',
	'ファイルからデータを読み込みできませんでした。\nディレクトリ：{1}\nファイル名：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0103' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0103',
	'W',
	'BOM付きのファイルとして扱う設定ですが、ファイルの先頭にBOMが検出されませんでした。\nディレクトリ：{1}\nファイル名：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0104' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0104',
	'W',
	'読み込み対象の項目が定義されていません。\nディレクトリ：{1}\nファイル名：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0105' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0105',
	'W',
	'レコードの長さのデータを読み込む前に、EOFが検出されました。\nディレクトリ：{1}\nファイル名：{2}\n行番号：{3}\nレコードの種類：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0106' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0106',
	'W',
	'出力ストリームにデータを書き込みできませんでした。\nディレクトリ：{1}\nファイル名：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0107' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0107',
	'W',
	'ファイルから読み込んだ値が指定された値と一致しませんでした。\nディレクトリ：{1}\nファイル名：{2}\nレコード番号：{3}\n項目名：{4}\n読み込んだ値：{5}\n指定された値：{6}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0108' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0108',
	'W',
	'ファイルから読み込んだ値が計算値と一致しませんでした。\nディレクトリ：{1}\nファイル名：{2}\nレコード番号：{3}\n項目名：{4}\n読み込んだ値：{5}\n計算値：{6}\n計算方法：{7}\n引数：{8}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0109' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0109',
	'W',
	'制御項目の値に対応するレコードの定義がありませんでした。\nディレクトリ：{1}\nファイル名：{2}\nレコード番号：{3}\n項目名：{4}\n値：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0110' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0110',
	'W',
	'対応するheaderレコードが存在しません。\nディレクトリ：{1}\nファイル名：{2}\nレコード番号：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0111' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0111',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n制御項目に対応する項目が定義されていません。\nディレクトリ：{1}\nファイル名：{2}\n項目名：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0112' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0112',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n制御項目のデータ型は文字型を指定してください。\nディレクトリ：{1}\nファイル名：{2}\n項目名：{3}\nキー：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0113' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0113',
	'W',
	'ファイルから読み込んだ値を指定されたデータ型に変換できませんでした。\nディレクトリ：{1}\nファイル名：{2}\nレコード番号：{3}\n項目名：{4}\n値：{5}\n書式：{6}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0114' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0114',
	'W',
	'ファイルから読み込んだ値を指定されたデータ型に変換できませんでした。\nディレクトリ：{1}\nファイル名：{2}\nレコード番号：{3}\n項目名：{4}\n値：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0115' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0115',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n文字数が{5}以下の値を指定してください。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}\n値：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0116' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0116',
	'W',
	'対応するtrailerレコードが存在しません。\nディレクトリ：{1}\nファイル名：{2}\nレコード番号：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0117' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0117',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n項目のデータ型とRowのデータ型が一致しませんでした。\n項目名：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0118' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0118',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}\nディレクトリ：{3}\nファイル名：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0501' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0501',
	'W',
	'変換先が取得できませんでした。\nＩＦコード変換マスタの設定を確認してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n取引先ＣＤ：{4}\nＩＦ項目：{5}（{6}）\nＩＦ項目区分：{7}\n自社用品目：{8}\n相手先ＣＤ：{9}\n相手先枝番１：{10}\n相手先枝番２：{11}\n相手先枝番３：{12}\n自社用ＣＤ：{13}\n自社用枝番１：{14}\n自社用枝番２：{15}\n自社用枝番３：{16}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0502' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0502',
	'W',
	'変換先のコードが複数件取得されました。\nＩＦコード変換マスタの設定を確認してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n取引先ＣＤ：{4}\nＩＦ項目：{5}（{6}）\nＩＦ項目区分：{7}\n自社用品目：{8}\n相手先ＣＤ：{9}\n相手先枝番１：{10}\n相手先枝番２：{11}\n相手先枝番３：{12}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0503' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0503',
	'W',
	'ファイル名が重複しました。\nＩＦ通信ルールマスタの設定を確認してください。\nファイル名：{1}\n外部システムＣＤ：{2}\nＩＦ制御区分：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0504' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0504',
	'W',
	'指定した外部システムが外部システムマスタに登録されていない、または、外部システム区分に「6.ＥＤＩ（ＭＣＦ）」が指定されています。\n外部システムマスタの設定を確認してください。\n外部システムCD：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0505' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFBZL0505',
	'W',
	'外部システムマスタで外部システム区分が「6.ＥＤＩ（ＭＣＦ）」以外の場合、会社ＣＤは指定できません。\nＩＦ処理区分：{1}\n外部システムＣＤ：{2}\n会社ＣＤ：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUCL0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUCL0001',
	'W',
	'コード変換オペレーションの実行に失敗しました。\nオペレーション：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUCL0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUCL0002',
	'W',
	'送信変換オペレーションの実行に失敗しました。\nオペレーション：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUCL0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUCL0003',
	'W',
	'受信変換オペレーションの実行に失敗しました。\nオペレーション：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUCL0004' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUCL0004',
	'W',
	'オペレーションが設定されていません。');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUCL0005' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUCL0005',
	'W',
	'ディレクトリが設定されていません。\nＩＦ通信ルールマスタの設定を確認してください。\n外部システムＣＤ：{1}\nＩＦ制御区分：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUCL0006' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUCL0006',
	'W',
	'移動元のファイルが存在しませんでした。\nファイル名：{1}\n移動元パス：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUCL0007' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUCL0007',
	'W',
	'ファイルの移動に失敗しました。\nファイル名：{1}\n移動元パス：{2}\n移動先パス：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUCL0008' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUCL0008',
	'W',
	'会社間連携オペレーションの実行に失敗しました。\nオペレーション：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUCL0009' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUCL0009',
	'W',
	'外部システム区分が「6.ＥＤＩ（ＭＣＦ）」の外部システムマスタが登録されていないため、処理できません。');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUDL0001',
	'W',
	'ファイルが存在しませんでした。\nディレクトリ：{1}\nファイル名：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUDL0002',
	'W',
	'ファイルをJSON形式として解析できませんでした。\nファイルの内容がJSON形式でないか、文字コードが「UTF-8（BOMなし）」ではありません。\nディレクトリ：{1}\nファイル名：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUDL0003',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\nルートに対して次のキーが存在しませんでした。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0004' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUDL0004',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n親キーに対して次の子キーが存在しませんでした。\nディレクトリ：{1}\nファイル名：{2}\n親キー：{3}\n子キー：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0005' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUDL0005',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\nキーに対する値のデータ型が次の通りではありませんでした。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}\nデータ型：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0006' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUDL0006',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\nキーに対する値が指定されていませんでした。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0007' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUDL0007',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n指定可能な値と異なる値が指定されています。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}\n値：{4}\n指定可能な値：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0008' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUDL0008',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n整数を指定してください。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}\n値：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0009' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUDL0009',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n配列のサイズは１以上としてください。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0010' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUDL0010',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n配列の要素に「null」は指定できません。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0011' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUDL0011',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n配列の要素に同じ値は指定できません。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}\n値：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0012' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUDL0012',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\nルートに対して次のキーを少なくとも１つは指定してください。\nディレクトリ：{1}\nファイル名：{2}\nキー：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0013' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUDL0013',
	'W',
	'フォーマットファイルの記述が不正です。訂正してください。\n親キーに対して次の子キーを少なくとも１つは指定してください。\nディレクトリ：{1}\nファイル名：{2}\n親キー：{3}\n子キー：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0100' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUDL0100',
	'W',
	'呼び出し先APIのメタデータを解析できませんでした。\nＩＦ通信ルールマスタの「EXT_SYS_STR1」、「EXT_SYS_STR2」、「EXT_SYS_STR3」、「WEB_URL」を確認してください。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0101' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUDL0101',
	'W',
	'呼び出し先APIの接続先情報を取得できませんでした。\nＩＦ通信ルールマスタの「WEB_URL」、「EXT_SYS_STR1」を確認してください。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0102' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUDL0102',
	'W',
	'呼び出し先APIの認証でエラーが発生しました。外部システムユーザマスタの設定を確認してください。\n接続先URL：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0103' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUDL0103',
	'W',
	'呼び出し先APIの認証でエラーが発生しました。外部システムユーザマスタの設定を確認してください。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}\nデータＮＯ：{3}\nデータ行ＮＯ：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0104' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'PFUDL0104',
	'W',
	'APIの呼び出し処理でエラーが発生しました。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}\nデータＮＯ：{3}\nデータ行ＮＯ：{4}\nメッセージ：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBAL0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBAL0001',
	'en_US',
	'W',
	'{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBAL0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBAL0002',
	'en_US',
	'W',
	'An error has occurred while calling the API of SAP.\nSee the error message on the Journal Export (IF) screen.\nData No.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBAL0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBAL0003',
	'en_US',
	'I',
	'The SAP API call has been completed. There is a message.\nConfirm the message on the Journal Export (IF) screen. \nData NO: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBBL0001',
	'en_US',
	'I',
	'Starting the processing (GA linkage batch import execution).');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBBL0002',
	'en_US',
	'I',
	'The processing completed (GA linkage batch import execution).');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBBL0003',
	'en_US',
	'W',
	'Specify the IF processing type related to accounting.\nIF process type: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBBL0004',
	'en_US',
	'W',
	'Specify the External system cd. whose Web API flg. in the External System master is turned on.\nExternal system cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBBL0005',
	'en_US',
	'W',
	'The IF process type valid for GA import execution is not specified.\nIF process type: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBBL0006',
	'en_US',
	'W',
	'Could not acquire the value of the IF control type. \nSee the setting of the IF Communication Rules master.\nExternal system cd.: {1}\nIF process type: {2}\nIF control type: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0007' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBBL0007',
	'en_US',
	'W',
	'Could not acquire the Web API operation.\nSee the setting of the IF Adapter master.\nExternal system cd.: {1}\nIF process type: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0008' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBBL0008',
	'en_US',
	'W',
	'An error has occurred while calling an API of GA. See the error message of GA.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0009' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBBL0009',
	'en_US',
	'W',
	'An exceptional error has occurred while calling an API of GA. \n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0010' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBBL0010',
	'en_US',
	'W',
	'Could not acquire the user information for connecting to GA.\nSee the settings of the External System User master.\nExternal system cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0101' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBBL0101',
	'en_US',
	'W',
	'An error has occurred while calling the API of GA.\nSee the error message on the Sales Slip Export (IF) screen.\nData No.: {1}\nSales slip No.: {2}\nInvoice No.: {3}\nSales result No.: {4}\nSupply result No.: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0102' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBBL0102',
	'en_US',
	'W',
	'{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0103' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBBL0103',
	'en_US',
	'W',
	'An error has occurred while calling an API of GA. \nSee the error message on the Purchase Slip Export (IF) screen.\nData No.: {1}\nPurchase slip No.: {2}\nPurchase invoice No.: {3}\nPurchase invoice management No.: {4}\nPurchase result No.: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0104' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBBL0104',
	'en_US',
	'W',
	'Could not reflect slip data in GA because an error occurred in a slip other than sales slip while exporting multiple sales slips at once. \nExport the unreflected sales slips again from the Sales Slip IF screen.\nData No.: {1}\nSales slip No.: {2}\nInvoice No.: {3}\nSales result No.: {4}\nSupply result No.: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBBL0105' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBBL0105',
	'en_US',
	'W',
	'Could not reflect slip data in GA because an error occurred in a slip other than purchase slip while exporting multiple purchase slips at once. \nExport the unreflected purchase slips again from the Purchase Slip IF screen.\nData No.: {1}\nPurchase slip No.: {2}\nPurchase invoice No.: {3}\nPurchase invoice management No.: {4}\nPurchase result No.: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBCL0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBCL0001',
	'en_US',
	'W',
	'Could not acquire the required command arguments.\nSee the setting of the IF Communication Rules master.\n CMD_PATH：{1}\n CMD_ARG01：{2}\n CMD_ARG04：{3}\n CMD_ARG05：{4}\n CMD_ARG06：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBCL0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBCL0002',
	'en_US',
	'W',
	'Could not lock the BI Link Batch Control table.\nAborting the processing.\nIF process type: {1}\nExternal system cd.: {2}\nCompany cd.: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBCL0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBCL0003',
	'en_US',
	'W',
	'Could not unlock the BI Link Batch Control table.\nUnlock the table on the Export IF Execution Status screen.\nIF process type: {1}\nExternal system cd.: {2}\nCompany cd.: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZP0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZP0001',
	'en_US',
	'I',
	'Executing the conversion processing. Continue?');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZP0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZP0002',
	'en_US',
	'I',
	'The conversion processing has been executed.');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZP0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZP0003',
	'en_US',
	'I',
	'The conversion target is not selected.');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZP0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZP0004',
	'en_US',
	'I',
	'Executing the update processing. Continue?');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZP0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZP0005',
	'en_US',
	'I',
	'The update processing has been executed.');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZP0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZP0006',
	'en_US',
	'I',
	'The update target is not selected.');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZP0007' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZP0007',
	'en_US',
	'I',
	'Canceling the conversion/exporting processing. Continue?');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZP0008' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZP0008',
	'en_US',
	'I',
	'Canceled the conversion/exporting processing.');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZP0009' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZP0009',
	'en_US',
	'I',
	'The conversion/exporting cancel target is not selected.');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0001',
	'en_US',
	'W',
	'Could not acquire the conversion destination.\nSee the setting of the IF Code Conversion master.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nBP cd.: {4}\nIF column: {5} ({6})\nIF column type: {7}\nCompany cd.: {8}\nCounterpart cd.: {9}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0002',
	'en_US',
	'W',
	'Could not generate an instance.\nClass: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0003',
	'en_US',
	'W',
	'Could not find file.\nDirectory: {1}\nFile name: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0004',
	'en_US',
	'W',
	'Could not find data to be exported.\nTable name: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0005',
	'en_US',
	'W',
	'Cannot process the specified file format.\nSee the setting of the IF Communication Rules master.\nExternal system cd.: {1}\nIF control type: {2}\nContents (string): {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0006',
	'en_US',
	'W',
	'Due to the code conversion, some columns do not match with the column definition.\nData No.: {1}\nData row No.: {2}\nColumn name: {3} ({4})\nValue: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0007' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0007',
	'en_US',
	'W',
	'Found multiple codes for conversion destination.\nSee the setting of the IF Code Conversion master.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nBP cd.: {4}\nIF column: {5} ({6})\nIF column type: {7}\nCompany cd.: {8}\nCounterpart cd.: {9}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0008' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0008',
	'en_US',
	'W',
	'Invalid file value.\nFile path: {1}\nFile name: {2}\nRow number: {3}\nColumn name: {4} ({5})\nFormat: {6}\nValue: {7}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0009' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0009',
	'en_US',
	'W',
	'A value that does not match with the column definition is specified.\nFile path: {1}\nFile name: {2}\nRow number: {3}\nColumn name: {4} ({5})\nValue: {6}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0010' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0010',
	'en_US',
	'W',
	'NotNull constraint failed.\nFile path: {1}\nFile name: {2}\nRow number: {3}\nColumn name: {4} ({5})');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0011' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0011',
	'en_US',
	'W',
	'The file size is 0 byte.\nIF process type: {1}\nFile path: {2}\nFile name: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0012' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0012',
	'en_US',
	'W',
	'Could not find data to be converted.\nTable name: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0013' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0013',
	'en_US',
	'W',
	'Could not acquire the file output operation. Excluded from the export target.\nIF process type: {1}\nExternal system cd.: {2}\nData No.: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0014' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0014',
	'en_US',
	'W',
	'The IF process type is invalid. Excluded from the export target.\nExternal system cd.: {1}\nIF process type: {2}\nData No.: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0015' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0015',
	'en_US',
	'I',
	'Starting the exporting conversion processing.\nExternal system cd.: {1}\nIF process type: {2}\nCompany cd.: {3}\nCode conversion operation: {4}\nFile I/O operations : {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0016' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0016',
	'en_US',
	'I',
	'Starting the code conversion processing.\nExternal system cd.: {1}\nIF process type: {2}\nCode conversion operation: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0017' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0017',
	'en_US',
	'I',
	'Could not find the code conversion target.');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0018' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0018',
	'en_US',
	'I',
	'The code conversion processing completed.\nProcess target: {1}\nNumber of converted codes: {2}\nNumber of errors: {3}\nNumber of skips: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0019' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0019',
	'en_US',
	'I',
	'Could not find the exporting conversion target.');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0020' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0020',
	'en_US',
	'I',
	'The exporting conversion processing completed.\nProcessing target: {1}\nNumber of created files: {2}\nNumber of errors: {3}\nNumber of skips: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0021' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0021',
	'en_US',
	'I',
	'Starting the importing conversion processing.\nExternal system cd.: {1}\nIF process type: {2}\nLocal directory: {3}\nFile transfer lock method: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0022' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0022',
	'en_US',
	'I',
	'Could not find the importing conversion target. This may be caused by any of the following:\n-The target file does not exist.\n-LOCAL_DIR in the IF Communication Rules master is invalid.');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0023' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0023',
	'en_US',
	'I',
	'The importing conversion processing completed.\nProcessing target: {1}\nNumber of imported files: {2}\nNumber of errors: {3}\nNumber of skips: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0024' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0024',
	'en_US',
	'I',
	'Imported file name: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0025' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0025',
	'en_US',
	'I',
	'The data import processing started.\nImport process operation: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0026' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0026',
	'en_US',
	'W',
	'Failed to execute the data import processing.\nImport process operation: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0027' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0027',
	'en_US',
	'W',
	'Skipped the data import processing because a license required for execution has not been assigned.\nImport process operation: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0028' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0028',
	'en_US',
	'W',
	'FTP information required for importing files is not entered.\nSee the settings of the IF Communication Rules master.\nExternal system cd.: {1}\nIF process type: {2}\nExport-to DIR: {3}\nHost: {4}\nUser: {5}\nPassword: {6}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0029' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0029',
	'en_US',
	'I',
	'Starting the file exporting processing.\nExternal system cd.: {1}\nIF process type: {2}\nExporting type: {3}\nLocal directory: {4}\nExport-to directory: {5}\nHost name: {6}\nUser name: {7}\nOption: {8}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0030' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0030',
	'en_US',
	'I',
	'Could not find the export target.');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0031' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0031',
	'en_US',
	'I',
	'The file exporting processing completed.\nProcessing target: {1}\nNumber of exported files: {2}\nNumber of errors: {3}\nNumber of skips: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0032' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0032',
	'en_US',
	'I',
	'Export file name: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0033' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0033',
	'en_US',
	'I',
	'Import file name: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0034' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0034',
	'en_US',
	'W',
	'Failed to export. Retry in {1} seconds.\nRetry count: {2}/{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0035' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0035',
	'en_US',
	'I',
	'Starting the file importing processing.\nExternal system cd.: {1}\nIF process type: {2}\nImporting type:{3}\nLocal directory: {4}\nImport source directory: {5}\nHost name: {6}\nUser name: {7}\nTransfer type: {8}\nOption: {9}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0036' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0036',
	'en_US',
	'I',
	'Could not find file to be imported.');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0037' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0037',
	'en_US',
	'I',
	'The file importing processing is completed.\nProcessing target: {1}\nNumber of imported files: {2}\nNumber of errors: {3}\nNumber of skips: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0038' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0038',
	'en_US',
	'W',
	'Could not acquire the file from the server.\nHost name: {1}\nImporting type:{2}\nUser: {3}\nServer path: {4}\nFile name: {5}\nIF process type: {6}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0039' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0039',
	'en_US',
	'I',
	'{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0040' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0040',
	'en_US',
	'I',
	'Starting the processing (Exporting conversion batch).');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0041' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0041',
	'en_US',
	'I',
	'The processing completed (Exporting conversion batch).');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0042' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0042',
	'en_US',
	'I',
	'Starting the processing (File exporting batch).');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0043' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0043',
	'en_US',
	'I',
	'The processing completed (File exporting batch).');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0044' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0044',
	'en_US',
	'I',
	'Starting the processing (File importing batch).');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0045' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0045',
	'en_US',
	'I',
	'The processing completed (File importing batch).');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0046' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0046',
	'en_US',
	'I',
	'Starting the processing (Importing conversion batch).');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0047' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0047',
	'en_US',
	'I',
	'The processing completed (Importing conversion batch).');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0048' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0048',
	'en_US',
	'W',
	'Could not find data to be processed.');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0049' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0049',
	'en_US',
	'W',
	'An ESB linkage table to be updated is not specified.\nSee the IF process type in the constant definition.');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0050' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0050',
	'en_US',
	'W',
	'An ESB linkage table to be updated is not found.\nSee the IF process Type in the constant definition.\nUpdate target table: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0051' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0051',
	'en_US',
	'W',
	'The IF process type is invalid. Excluded from the export target.\nIF process type: {1}\nData No.: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0052' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0052',
	'en_US',
	'W',
	'The External system cd. is invalid. Excluded from the export target.\nExternal system cd.: {1}\nData No.: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0053' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0053',
	'en_US',
	'W',
	'FTP information required for exporting files is not entered.\nSee the setting of the IF Communication Rules master.\nExternal system cd.: {1}\nIF process type: {2}\nIF control type: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0054' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0054',
	'en_US',
	'W',
	'The IF process type and External system cd. for the processing target are not specified. The processing stopped.\nIF process type: {1}\nExternal system cd.: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0055' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0055',
	'en_US',
	'W',
	'FTP information required for exporting files is not entered.\nSee the setting of the IF Communication Rules master.\nIF process type: {1}\nExternal system cd.: {2}\nIF control type: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0056' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0056',
	'en_US',
	'W',
	'Failed to enter the IF exporting/importing control table.\nBring back the following files from a trash folder or an error folder to ready.\nThen, retry the importing conversion processing.\nFile name: {1}\nFile path: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0057' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0057',
	'en_US',
	'I',
	'---------- FTP PUT START ----------');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0058' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0058',
	'en_US',
	'I',
	'---------- FTP PUT END ----------');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0059' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0059',
	'en_US',
	'I',
	'---------- FILE COPY START ----------');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0060' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0060',
	'en_US',
	'I',
	'---------- FILE COPY END ----------');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0061' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0061',
	'en_US',
	'I',
	'An interruption has occurred in the waiting thread. (Reference information)');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0062' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0062',
	'en_US',
	'W',
	'An interruption has occurred in the waiting thread.\nThe processing stopped for safety reason.');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0063' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0063',
	'en_US',
	'W',
	'Cannot export because the file exporting method is invalid. Excluded from the export target.\nExternal system cd.: {1}\nIF process type: {2}\nFile exporting method (SEND_TYP of IF control type): {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0064' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0064',
	'en_US',
	'W',
	'Export-to directory must be specified.\nExternal system cd.: {1}\nIF process type: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0065' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0065',
	'en_US',
	'I',
	'Starting the exporting conversion processing.\nExternal system cd.: {1}\nIF process type: {2}\nCompany cd.: {3}\nCode conversion operation: {4}\nWeb API operation: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0066' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0066',
	'en_US',
	'I',
	'Starting the exporting conversion processing.\nExternal system cd.: {1}\nIF process type: {2}\nCompany cd.: {3}\nCode conversion operation: {4}\nCommand execution operation: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0067' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0067',
	'en_US',
	'I',
	'Starting the processing (The Command Execution batch).');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0068' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0068',
	'en_US',
	'I',
	'The processing completed (The Command Execution batch).');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0069' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0069',
	'en_US',
	'I',
	'The command completed successfully.\nIF process type: {1}\nExternal system cd.: {2}\nExit code: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0070' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0070',
	'en_US',
	'W',
	'An error occurred while executing the command.\nIF process type: {1}\nExternal system cd.: {2}\nExit code: {3}\nError details: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0071' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0071',
	'en_US',
	'I',
	'Skipped the processing because its Exporting and importing type is not to be processed.\nData No.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0072' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0072',
	'en_US',
	'W',
	'SFTP information required for importing files is not entered.\nSee the settings of the IF Communication Rules master.\nExternal system cd.: {1}\nIF process type: {2}\nExport-to DIR: {3}\nHost: {4}\nUser: {5}\nPassword: {6}\nPath of the private key file: {7}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0073' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0073',
	'en_US',
	'W',
	'SFTP information required for exporting files is not entered.\nSee the setting of the IF Communication Rules master.\nIF process type: {1}\nExternal system cd.: {2}\nIF control type: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0074' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0074',
	'en_US',
	'W',
	'When the password authentication method is used, the password must be specified.\nSee the setting of the IF Communication Rules master.\nExternal system cd.: {1}\nIF process type: {2}\nIF control type: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0075' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0075',
	'en_US',
	'W',
	'Cannot import because the file importing method is invalid. Excluded from the import target.\nExternal system cd.: {1}\nIF process type: {2}\nFile importing method (RECV_TYP of IF control type): {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0076' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0076',
	'en_US',
	'I',
	'---------- SFTP PUT START ----------');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0077' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0077',
	'en_US',
	'I',
	'---------- SFTP PUT END   ----------');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0078' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0078',
	'en_US',
	'W',
	'The description in the format file is invalid. Correct the description.\nThe reference destination of synonym was not found.\nDirectory: {1}\nFile name: {2}\nKey: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0079' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0079',
	'en_US',
	'W',
	'The description in the format file is invalid. Correct the description.\nThe reference destination of mapping was not found.\nDirectory: {1}\nFile name: {2}\nKey: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0080' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0080',
	'en_US',
	'W',
	'The description in the format file is invalid. Correct the description.\nThe data types of the column and of the reference destination of mapping did not match.\nDirectory: {1}\nFile name: {2}\nKey: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0081' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0081',
	'en_US',
	'W',
	'The description in the format file is invalid. Correct the description.\nThe column name is duplicated.\nDirectory: {1}\nFile name: {2}\nKey: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0082' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0082',
	'en_US',
	'W',
	'The description in the format file is invalid. Correct the description.\nThe control column value is duplicated.\nDirectory: {1}\nFile name: {2}\nKey: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0083' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0083',
	'en_US',
	'W',
	'The description in the format file is invalid. Correct the description.\nThe data types of the column and of the dummy value did not match.\nDirectory: {1}\nFile name: {2}\nKey: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0084' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0084',
	'en_US',
	'W',
	'The description in the format file is invalid. Correct the description.\nNo value was specified for the key.\nDirectory: {1}\nFile name: {2}\nKey: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0085' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0085',
	'en_US',
	'W',
	'The description in the format file is invalid. Correct the description.\nThe specified value is out of acceptable range.\nDirectory: {1}\nFile name: {2}\nKey: {3}\nValue: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0086' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0086',
	'en_US',
	'W',
	'The description in the format file is invalid. Correct the description.\nThe data type of the value for the key was not as follows:\nDirectory: {1}\nFile name: {2}\nKey: {3}\nData types: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0087' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0087',
	'en_US',
	'W',
	'The information required to export/import fixed-length format files has not been set.\nSee the setting of the IF Communication Rules master.\nExternal system cd.: {1}\nIF process type: {2}\nIF control type: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0088' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0088',
	'en_US',
	'W',
	'The description in the format file is invalid. Correct the description.\nA value different from specifiable values has been specified.\nDirectory: {1}\nFile name: {2}\nKey: {3}\nValue: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0089' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0089',
	'en_US',
	'W',
	'The description in the format file is invalid. Correct the description.\nThe same value as key: {5} cannot be specified.\nDirectory: {1}\nFile name: {2}\nKey: {3}\nValue: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0090' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0090',
	'en_US',
	'W',
	'The description in the format file is invalid. Correct the description.\nThis combination of values cannot be specified for the following keys:\nDirectory: {1}\nFile name: {2}\nKey1 ({3} : {4})\nKey2 ({5} : {6})');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0091' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0091',
	'en_US',
	'W',
	'The description in the format file is invalid. Correct the description.\nThis combination of values cannot be specified for the following keys:\nDirectory: {1}\nFile name: {2}\nKey1 ({3} : {4})\nKey2 ({5} : {6})\nKey3 ({7} : {8})');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0092' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0092',
	'en_US',
	'W',
	'The description in the format file is invalid. Correct the description.\nThis combination of values cannot be specified for the following keys:\nDirectory: {1}\nFile name: {2}\nKey1 ({3} : {4})\nKey2 ({5} : {6})\nKey3 ({7} : {8})\nKey4 ({9} : {10})');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0093' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0093',
	'en_US',
	'W',
	'The description in the format file is invalid. Correct the description.\nThe number of control columns did not match the number of records.\nDirectory: {1}\nFile name: {2}\nKey: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0094' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0094',
	'en_US',
	'W',
	'The description in the format file is invalid. Correct the description.\nA value cannot be specified for the key.\nDirectory: {1}\nFile name: {2}\nKey: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0095' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0095',
	'en_US',
	'W',
	'File I/O operations do not support the fixed-length format.\nSee the setting of the IF Communication Rules master.\nExternal system cd.: {1}\nIF process type: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0096' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0096',
	'en_US',
	'W',
	'The character encoding is not supported.\nEncode: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0097' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0097',
	'en_US',
	'W',
	'Could not complete file output.\nDirectory: {1}\nFile name: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0098' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0098',
	'en_US',
	'W',
	'Could not convert the value to the specified number of bytes.\nColumn name: {1}\nNumber of bytes: {2}\nValue: {3}\nFill character: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0099' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0099',
	'en_US',
	'W',
	'The value of the reference destination cannot be used as the value of the attribute column.\nColumn name: {1}\nAttribute column: Reference destination: Value\n{2}\n');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0100' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0100',
	'en_US',
	'I',
	'The file close processing faild, but the processing continues.');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0101' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0101',
	'en_US',
	'W',
	'Could not write the data to a file.\nDirectory: {1}\nFile name: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0102' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0102',
	'en_US',
	'W',
	'Could not read data from the file.\nDirectory: {1}\nFile name: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0103' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0103',
	'en_US',
	'W',
	'According to the setting, the file should be treated as a file with BOM, but no BOM was detected at the beginning of the file.\nDirectory: {1}\nFile name: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0104' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0104',
	'en_US',
	'W',
	'No column to be read is defined.\nDirectory: {1}\nFile name: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0105' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0105',
	'en_US',
	'W',
	'Detected EOF before reading the data corresponds to the record length.\nDirectory: {1}\nFile name: {2}\nRow number: {3}\nRecord type: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0106' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0106',
	'en_US',
	'W',
	'Could not write data to the output stream.\nDirectory: {1}\nFile name: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0107' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0107',
	'en_US',
	'W',
	'The value read from the file did not match the specified value.\nDirectory: {1}\nFile name: {2}\nRecord number: {3}\nColumn name: {4}\nRead value: {5}\nSpecified value: {6}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0108' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0108',
	'en_US',
	'W',
	'The value read from the file did not match the calculated value.\nDirectory: {1}\nFile name: {2}\nRecord number: {3}\nColumn name: {4}\nRead value: {5}\nCalculated value: {6}\nCalculation method: {7}\nArgument: {8}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0109' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0109',
	'en_US',
	'W',
	'Could not find a record definition corresponding to the control column value.\nDirectory: {1}\nFile name: {2}\nRecord number: {3}\nColumn name: {4}\nValue: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0110' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0110',
	'en_US',
	'W',
	'Could not find the corresponding header record.\nDirectory: {1}\nFile name: {2}\nRecord number: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0111' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0111',
	'en_US',
	'W',
	'The description in the format file is invalid. Correct the description.\nNo column corresponding to the control column is defined.\nDirectory: {1}\nFile name: {2}\nColumn name: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0112' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0112',
	'en_US',
	'W',
	'The description in the format file is invalid. Correct the description.\nSpecify the character type for the data type of control columns.\nDirectory: {1}\nFile name: {2}\nColumn name: {3}\nKey: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0113' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0113',
	'en_US',
	'W',
	'Could not convert the value read from the file to the specified data type.\nDirectory: {1}\nFile name: {2}\nRecord number: {3}\nColumn name: {4}\nValue: {5}\nFormat: {6}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0114' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0114',
	'en_US',
	'W',
	'Could not convert the value read from the file to the specified data type.\nDirectory: {1}\nFile name: {2}\nRecord number: {3}\nColumn name: {4}\nValue: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0115' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0115',
	'en_US',
	'W',
	'The description in the format file is invalid. Correct the description.\nSpecify a value with {5} or less characters.\nDirectory: {1} \nFile name: {2} \nKey: {3} \nValue: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0116' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0116',
	'en_US',
	'W',
	'Could not find the corresponding trailer record.\nDirectory: {1}\nFile name: {2}\nRecord number: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0117' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0117',
	'en_US',
	'W',
	'The description in the format file is invalid. Correct the description.\nThe data types of the column and of the row did not match.\nColumn name: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0118' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0118',
	'en_US',
	'W',
	'The description of the format file is invalid. Correct the description.\nExternal system cd.: {1}\nIF process type: {2}\nDirectory: {3}\nFile name: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0501' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0501',
	'en_US',
	'W',
	'Could not acquire the conversion destination.\nSee the setting of the IF Code Conversion master.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nBP cd.: {4}\nIF column: {5} ({6})\nIF column type: {7}\nCompany''s own item: {8}\nCounterpart cd.: {9}\nCounterpart branch No. 1: {10}\nCounterpart branch No. 2: {11}\nCounterpart branch No. 3: {12}\nCd. for own company: {13}\nBranch No. 1 for own compay: {14}\nBranch No. 2 for own compay: {15}\nBranch No. 3 for own compay: {16}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0502' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0502',
	'en_US',
	'W',
	'Found multiple codes for conversion destination.\nSee the setting of the IF Code Conversion master.\nData No.: {1}\nData row No.: {2}\nExternal system cd.: {3}\nBP cd.: {4}\nIF column: {5} ({6})\nIF column type: {7}\nCompany''s own item: {8}\nCounterpart cd.: {9}\nCounterpart branch No. 1: {10}\nCounterpart branch No. 2: {11}\nCounterpart branch No. 3: {12}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0503' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0503',
	'en_US',
	'W',
	'The file name is duplicated.\nSee the settings of the IF Communication Rules master.\nFile name: {1}\nExternal system cd.: {2}\nIF process type: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0504' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0504',
	'en_US',
	'W',
	'The specified external system is not entered in the External System master, or the External system type is set to "6. EDI (MCF)".\nSee the settings of the External System master.\nExternal system cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFBZL0505' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFBZL0505',
	'en_US',
	'W',
	'Company cd. cannot be specified if the External system type is other than "6. EDI (MCF)" in the External System master.\nIF process type: {1}\nExternal system cd.: {2}\nCompany cd.: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUCL0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUCL0001',
	'en_US',
	'W',
	'Failed to execute the code conversion operation.\nOperation: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUCL0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUCL0002',
	'en_US',
	'W',
	'Failed to execute the exporting conversion operation.\nOperation: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUCL0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUCL0003',
	'en_US',
	'W',
	'Failed to execute the importing conversion operation.\nOperation: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUCL0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUCL0004',
	'en_US',
	'W',
	'Operation is not set.');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUCL0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUCL0005',
	'en_US',
	'W',
	'Directory is not set.\nSee the setting of the IF Communication Rules master.\nExternal system cd.: {1}\nIF control type: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUCL0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUCL0006',
	'en_US',
	'W',
	'Could not find the source file.\nFile name: {1}\nSource path: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUCL0007' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUCL0007',
	'en_US',
	'W',
	'Failed to move the file.\nFile name: {1}\nSource path: {2}\nDestination path: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUCL0008' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUCL0008',
	'en_US',
	'W',
	'Failed to execute the intercompany linkage operation.\nOperation: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUCL0009' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUCL0009',
	'en_US',
	'W',
	'Cannot process because there is no record whose External system type is "6. EDI (MCF)" in the External System master.');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUDL0001',
	'en_US',
	'W',
	'Could not find file.\nDirectory: {1}\nFile name: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUDL0002',
	'en_US',
	'W',
	'Could not parse the file as JSON format.\nThe content of the file is not in JSON format or the character code is not "UTF-8 (without BOM)".\nDirectory: {1}\nFile name: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUDL0003',
	'en_US',
	'W',
	'The description of the format file is invalid. Correct the description.\nThe following key did not exist for the root.\nDirectory: {1}\nFile name: {2}\nKey: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUDL0004',
	'en_US',
	'W',
	'The description of the format file is invalid. Correct the description.\nThe following child key did not exist for the parent key.\nDirectory: {1}\nFile name: {2}\nParent key: {3}\nChild key: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUDL0005',
	'en_US',
	'W',
	'The description of the format file is invalid. Correct the description.\nThe data type of the value for the key was not as follows:\nDirectory: {1}\nFile name: {2}\nKey: {3}\nData type: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUDL0006',
	'en_US',
	'W',
	'The description of the format file is invalid. Correct the description.\nA value for the key was not specified.\nDirectory: {1}\nFile name: {2}\nKey: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0007' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUDL0007',
	'en_US',
	'W',
	'The description of the format file is invalid. Correct the description.\nA value different from the specifiable value is specified.\nDirectory: {1}\nFile name: {2}\nKey: {3}\nValue: {4}\nSpecifiable value: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0008' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUDL0008',
	'en_US',
	'W',
	'The description of the format file is invalid. Correct the description.\nSpecify an integer.\nDirectory: {1}\nFile name: {2}\nKey: {3}\nValue: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0009' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUDL0009',
	'en_US',
	'W',
	'The description of the format file is invalid. Correct the description.\nThe size of the array must be 1 or more.\nDirectory: {1}\nFile name: {2}\nKey: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0010' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUDL0010',
	'en_US',
	'W',
	'The description of the format file is invalid. Correct the description.\n"null" cannot be specified for the elements of the array.\nDirectory: {1}\nFile name: {2}\nKey: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0011' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUDL0011',
	'en_US',
	'W',
	'The description of the format file is invalid. Correct the description.\nDuplicate values cannot be specified for the elements of the array.\nDirectory: {1}\nFile name: {2}\nKey: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0012' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUDL0012',
	'en_US',
	'W',
	'The description of the format file is invalid. Correct the description.\nSpecify at least one of the following keys for the route.\nDirectory: {1}\nFile name: {2}\nKey: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0013' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUDL0013',
	'en_US',
	'W',
	'The description of the format file is invalid. Correct the description.\nSpecify at least one of the following child keys for the parent key:\nDirectory: {1}\nFile name: {2}\nParent key: {3}\nChild key: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0100' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUDL0100',
	'en_US',
	'W',
	'Could not parse the metadata of the called API.\nCheck "EXT_SYS_STR1", "EXT_SYS_STR2", "EXT_SYS_STR3", and "WEB_URL" in the IF Communication Rules master.\nExternal system cd.: {1}\nIF process type: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0101' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUDL0101',
	'en_US',
	'W',
	'Could not acquire connection destination information for the called API.\nCheck "WEB_URL" and "EXT_SYS_STR1" in the IF Communication Rules master.\nExternal system cd.: {1}\nIF process type: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0102' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUDL0102',
	'en_US',
	'W',
	'An error occurred in the authentication of the called API.\nCheck the External System User master settings.\nConnection destination URL: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0103' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUDL0103',
	'en_US',
	'W',
	'An error occurred in the authentication of the called API.\nCheck the External System User master settings.\nExternal system cd.: {1}\nIF process type: {2}\nData No.: {3}\nData row No.: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'PFUDL0104' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'PFUDL0104',
	'en_US',
	'W',
	'An error occurred in the API call processing.\nExternal system cd.: {1}\nIF process type: {2}\nData No.: {3}\nData row No.: {4}\nMessage: {5}');

