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
