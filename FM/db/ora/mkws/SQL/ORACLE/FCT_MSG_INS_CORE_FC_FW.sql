DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0001',
	'W',
	'ラジオボタンの選択を変更できませんでした。\n画面：{1}\n項目：{2}\n値：{3}\n指定可能な値：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0002',
	'W',
	'削除する行がありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0003',
	'T',
	'ValidationChangeイベント開始\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0004',
	'T',
	'ValidationChangeイベント終了\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0005',
	'T',
	'NotificationChangeイベント開始\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0006',
	'T',
	'NotificationChangeイベント終了\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0007',
	'T',
	'NotificationEntryイベント開始\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0008',
	'T',
	'NotificationEntryイベント終了\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0009',
	'T',
	'NotificationExitイベント開始\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0010',
	'T',
	'NotificationExitイベント終了\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0011',
	'T',
	'ListChangedイベント開始\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0012',
	'T',
	'ListChangedイベント終了\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0013',
	'T',
	'モード設定処理開始\n項目：{1}.{2}.{3}\nモード：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0014',
	'T',
	'モード設定処理終了\n項目：{1}.{2}.{3}\nモード：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0015',
	'D',
	'MCMessageBoxのクラスが指定されませんでした。\nデフォルトのMCMessageBoxを使用します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0016',
	'W',
	'全てのデータを出力することができませんでした。\n出力対象行数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0017',
	'D',
	'DoubleClickedイベント開始\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0018',
	'D',
	'DoubleClickedイベント終了\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0021',
	'D',
	'ダイアログを表示します。\nメッセージ：\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0022',
	'D',
	'マルチメッセージ画面を表示します。\nメッセージ：\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0023',
	'E',
	'マルチメッセージ画面を作成できませんでした。\nマルチメッセージ画面はMCMessagePanelインターフェースを実装している必要があります。\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0024',
	'E',
	'GUI 部品の名前を設定できませんでした。\n名前に null や空文字を設定することはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0025',
	'D',
	'ActionPerformedイベント開始\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0028',
	'D',
	'アイコンを設定できませんでした。\n指定されたリソースキーのアイコンが見つかりませんでした。\n項目：{1}.{2}.{3}\nリソース：MCBeans\nリソースキー：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0030',
	'E',
	'アイコンを設定できませんでした。\n指定されたファイルパスのアイコンが見つかりませんでした。\n項目：{1}.{2}.{3}\nファイルパス：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0031',
	'E',
	'パスワード入力ダイアログクラスの設定に失敗しました。\nパスワード入力ダイアログクラスに null を指定することはできません。\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0032',
	'W',
	'設定できない値が指定されました。\n画面：{1}\n項目：{2}\n値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0033',
	'W',
	'かな漢字変換ソフトウェアが起動しているため値を設定できません。\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0035',
	'E',
	'ダイアログを表示できませんでした。\nダイアログタイプを確認してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0036',
	'E',
	'ダイアログ画面を作成できませんでした。\nダイアログ画面はMCDialogPanelインターフェースを実装している必要があります。\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0037',
	'E',
	'MCMessageBoxのクラスを作成できませんでした。\nクラス名を確認してください。\nデフォルトのMCMessageBoxを使用します。\nリソース：MCPlugin\nクラス名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0038',
	'W',
	'設定できない値が指定されました。\n画面：{1}\n項目：{2}\n行番号：{3}\n値：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0040',
	'E',
	'レコードの高さの設定に失敗しました。\n行インデックスの指定が範囲外です。\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0041',
	'E',
	'レコードの高さの取得に失敗しました。\n行インデックスの指定が範囲外です。\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0043',
	'E',
	'パスワード入力ダイアログクラスの作成に失敗しました。\nMCScreen リソースを確認してください。\n項目：{1}.{2}.{3}.{4}\nリソースキー：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0044',
	'D',
	'SingleClickedイベント開始\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0045',
	'D',
	'SingleClickedイベント終了\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0046',
	'W',
	'最大文字数を超えています。\n画面：{1}\n項目：{2}\n値：{3}\n最大文字数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0047',
	'W',
	'負の値を指定することはできません。\n画面：{1}\n項目：{2}\n値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0048',
	'W',
	'日付の指定可能範囲を超えています。\n画面：{1}\n項目：{2}\n日付：{3}\n指定可能範囲：{4}～{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0049',
	'W',
	'日付の指定可能範囲を超えています。\n画面：{1}\n項目：{2}\n日付：{3}\n指定不可能範囲：{4}～{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0050',
	'W',
	'リストに存在しない値が指定されました。\n画面：{1}\n項目：{2}\n値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0051',
	'W',
	'最大文字数を超えています。\n画面：{1}\n項目：{2}\n行番号：{3}\n値：{4}\n最大文字数：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0052',
	'E',
	'値の設定に失敗しました。String型の値を設定してください。\n項目：{1}.{2}\n行番号：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0053',
	'E',
	'値の設定に失敗しました。MCDate型の値を設定してください。\n項目：{1}.{2}\n行番号：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0054',
	'W',
	'日付の指定可能範囲を超えています。\n画面：{1}\n項目：{2}\n行番号：{3}\n日付：{4}\n指定可能範囲：{5}～{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0055',
	'W',
	'日付の指定可能範囲を超えています。\n画面：{1}\n項目：{2}\n行番号：{3}\n日付：{4}\n指定不可能範囲：{5}～{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0056',
	'E',
	'値の設定に失敗しました。MCNumber型の値を設定してください。\n項目：{1}.{2}\n行番号：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0057',
	'W',
	'負の値を指定することはできません。\n画面：{1}\n項目：{2}\n行番号：{3}\n値：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0058',
	'W',
	'有効桁数を超えています。\n画面：{1}\n項目：{2}\n行番号：{3}\n値：{4}\n整数の有効桁数：{5}\n小数点以下の有効桁数：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0059',
	'E',
	'値の設定に失敗しました。boolean型の値を設定してください。\n項目：{1}.{2}\n行番号：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0060',
	'W',
	'パスワードに全角文字を指定することはできません。\n画面：{1}\n項目：{2}\n値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0061',
	'W',
	'パスワードに全角文字を指定することはできません。\n画面：{1}\n項目：{2}\n行番号：{3}\n値：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0062',
	'E',
	'GUI部品と連携するコンテナが画面にありません。\n画面：{1}\nGUI部品：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0063',
	'E',
	'カラムと連携するテーブルが画面にありません。\n画面：{1}\nカラム：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0064' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0064',
	'E',
	'マップの第1要素がリスト付きGUI部品の項目ではありません。\nマップの第1要素：{1}\nリスト付きGUI部品：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0065' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0065',
	'E',
	'予期せぬ型が設定されています。\n型：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0066' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0066',
	'E',
	'ファイルの出力処理に失敗しました。\nHTMLの解析に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0067' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0067',
	'E',
	'値の設定に失敗しました。boolean型の値を設定してください。\n項目：{1}.{2}.{3}.{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0068',
	'E',
	'値の設定に失敗しました。String型の値を設定してください。\n項目：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0069',
	'E',
	'値の設定に失敗しました。MCDate型の値を設定してください。\n項目：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0070',
	'E',
	'値の設定に失敗しました。MCNumber型の値を設定してください。\n項目：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0072',
	'I',
	'画面のデータが変更されています。\n画面を閉じてもよろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0073',
	'D',
	'ActionPerformedイベント終了\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0074',
	'E',
	'パスワード入力ダイアログクラスの設定に失敗しました。\nクラスパスに null を指定することはできません。\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0075' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0075',
	'E',
	'パスワード入力ダイアログクラスの設定に失敗しました。\nモジュールIDやスクリーンIDに null を指定することはできません。\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0076' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0076',
	'E',
	'リストコンフィグの設定に失敗しました。\nリストコンフィグに null を指定することはできません。\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0077' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0077',
	'E',
	'値の設定に失敗しました。MCBinary型の値を設定してください。\n項目：{1}.{2}.{3}.{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0078' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0078',
	'E',
	'値の設定に失敗しました。MCBinary型の値を設定してください。\n項目：{1}.{2}\n行番号：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0081' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0081',
	'E',
	'Listコンテナの設定に失敗しました。\nListコンテナにnullを指定することはできません。\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0083' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0083',
	'E',
	'日付フォーマットの初期化に失敗しました。\nデータ型が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0087' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0087',
	'E',
	'値の設定に失敗しました。MCTimestamp型の値を設定してください。\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0094' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0094',
	'E',
	'値の設定に失敗しました。行のインデックス値が不正です。\n項目：{1}.{2}.{3}\nインデックス値：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0098' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0098',
	'I',
	'入力中のデータがクリアされます。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0099' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0099',
	'I',
	'検索結果がありませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0100',
	'I',
	'登録しますか？');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0101',
	'I',
	'登録しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0102',
	'W',
	'登録対象がありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0103',
	'E',
	'スクロールバーの設定に失敗しました。\nGUI 部品が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0104',
	'E',
	'スクロールバーの設定に失敗しました。\nスクロールペインが指定されていません。\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0105',
	'E',
	'レイアウト情報の取得に失敗しました。\nGUI 部品が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0106',
	'E',
	'MCCaller の初期化に失敗しました。\n画面または MCCallerPanelBridge が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0107' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0107',
	'E',
	'値の設定に失敗しました。\nテーブルに配置されていないカラムに値を設定することはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0108' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0108',
	'W',
	'リストに存在しない値が指定されました。\n画面：{1}\n項目：{2}\n行番号：{3}\n値：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0109' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0109',
	'E',
	'値の取得に失敗しました。\nテーブルに配置されていないカラムに値を設定することはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0110' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0110',
	'E',
	'カラムの移動に失敗しました。\nカラムが指定されていません。\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0111' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0111',
	'E',
	'リストに存在しないカラム名が指定されました。\nMCListPutterのカラム名の指定を確認してください。\n項目：{1}.{2}.{3}\nリストのカラム名：{5}\n指定されたカラム名：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0112' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0112',
	'E',
	'テーブルのリスト選択モデルの初期化に失敗しました。\nテーブルが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0113' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0113',
	'I',
	'入力中の値がクリアされます。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0114' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0114',
	'E',
	'カラムタイプの設定に失敗しました。\nカラムタイプが指定されていません。\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0115' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0115',
	'E',
	'カレンダ画面の設定に失敗しました。\nモジュール ID とスクリーン ID が指定されていません。\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0116' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0116',
	'E',
	'ポップアップの表示に失敗しました。\nポップアップに配置する画面が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0117' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0117',
	'E',
	'フォーカスの移動に失敗しました。\n指定された[行のインデックス位置]の行が存在しません。\nテーブル：{1}.{2}.{3}\n行数：{4}\n行のインデックス位置：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0118' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0118',
	'E',
	'フォーカスの移動に失敗しました。\n指定された[テーブルカラム]が配置されていません。\nテーブル：{1}.{2}.{3}\nテーブルカラム：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0119' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0119',
	'E',
	'フォーカスの移動に失敗しました。\nテーブルカラムが指定されていません。\nテーブル：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0121' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0121',
	'E',
	'ラジオボタンをボタングループに所属させることができませんでした。\nMCRadioButtonはMCButtonGroupにのみ所属することができます。\nラジオボタン：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0122' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0122',
	'E',
	'テーブルの行追加に失敗しました。\nテーブルが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0123' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0123',
	'E',
	'テーブルの行追加に失敗しました。\n行のインデックス値が不正です。\n行のインデックス値は 0 以上、[テーブルの行数]以内の整数値を指定してください。\nテーブル：{1}.{2}.{3}\nインデックス値：{4}\nテーブルの行数：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0124' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0124',
	'E',
	'テーブルの行削除に失敗しました。\nテーブルが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0125' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0125',
	'E',
	'テーブルの行削除に失敗しました。\n行のインデックス値が不正です。\n行のインデックス値は 0 以上かつ[テーブルの行数]より小さい整数値を指定してください。\nテーブル：{1}.{2}.{3}\nインデックス値：{4}\nテーブルの行数：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0126' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0126',
	'E',
	'テーブルの行削除に失敗しました。\nテーブルに List コンテナが設定されていません。\nテーブル：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0127' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0127',
	'I',
	'通信定型処理を実行します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0128' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0128',
	'I',
	'通信定型処理が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0131' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0131',
	'E',
	'レイアウトの設定に失敗しました。\n画面が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0132' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0132',
	'D',
	'レイアウトを設定できませんでした。\n[見出し][一覧][ボタン]枠が配置されている画面を指定してください。\n[一覧]枠にはテーブルが配置されている必要があります。\nスクリーンID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0133' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0133',
	'I',
	'指定されたファイルは既に存在します。\n上書きしてもよろしいですか？\nファイル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0134' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0134',
	'W',
	'ファイル名に使用できない文字が含まれています。\nファイル名：{1}\n使用できない文字：? " < > | :');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0135' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0135',
	'W',
	'指定されたファイルは読み取り専用ファイルです。\n別のファイルを指定してください。\nファイル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0136' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0136',
	'D',
	'BeforeOpenイベント開始\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0137' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0137',
	'D',
	'BeforeOpenイベント終了\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0138' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0138',
	'D',
	'AfterOpenイベント開始\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0139' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0139',
	'D',
	'AfterOpenイベント終了\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0140' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0140',
	'D',
	'BeforeCloseイベント開始\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0141' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0141',
	'D',
	'BeforeCloseイベント終了\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0142' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0142',
	'E',
	'画面の表示に失敗しました。\n表示する画面が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0143' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0143',
	'E',
	'画面の表示に失敗しました。\n画面がフレームに配置されていません。\n画面の作成方法を確認してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0145' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0145',
	'W',
	'有効桁数を超えています。\n画面：{1}\n項目：{2}\n値：{3}\n整数の有効桁数：{4}\n小数点以下の有効桁数：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0146' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0146',
	'D',
	'レイアウトを設定できませんでした。\n[見出し][一覧][ボタン][見出し２]枠が配置されている画面を指定してください。\n[一覧]枠にはテーブルが配置されている必要があります。\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0147' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0147',
	'D',
	'レイアウトを設定できませんでした。\nレイアウトクラスを探すためのリソースキーが設定されていません。\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0148' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0148',
	'D',
	'レイアウトを設定できませんでした。\nレイアウトクラスが見つかりませんでした。リソースキーの指定を確認してください。\n画面：{1}.{2}\nリソースキー：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0149' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0149',
	'D',
	'レイアウトを設定できませんでした。\nレイアウトクラスが設定されていません。\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0150' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0150',
	'D',
	'レイアウトを設定できませんでした。レイアウトクラスが正しく指定されていません。\n画面：{1}.{2}\nレイアウトクラス：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0151' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0151',
	'E',
	'ポップアップの初期化に失敗しました。\nGUI部品が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0154' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0154',
	'E',
	'画面の作成に失敗しました。\n画面クラスに null を指定することはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0156' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0156',
	'E',
	'画面の作成に失敗しました。\n指定されたモジュールID、スクリーンIDの画面が見つかりませんでした。\nモジュールID、スクリーンIDを確認してください。\nMCScreenリソースの画面のクラスパスの定義を確認してください。\nモジュールID：{1}\nスクリーンID：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0158' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0158',
	'W',
	'デスクトップのイメージの作成に失敗しました。\n指定されたイメージファイルが見つかりませんでした。\n処理を続行します。\nファイル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0159' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0159',
	'W',
	'デスクトップのイメージの作成に失敗しました。\nイメージファイルの読み込みに失敗しました。\n処理を続行します。\nファイル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0160' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0160',
	'E',
	'パスワード入力ダイアログの作成に失敗しました。\nパスワード入力ダイアログクラスが設定されていません。\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0161' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0161',
	'E',
	'数値ドキュメントの初期化に失敗しました。\n数値フィールドが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0165' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0165',
	'W',
	'指定されたファイルを開けませんでした。\n別のアプリケーションから使用されている可能性があります。\nファイル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0166' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0166',
	'W',
	'画面を表示できませんでした。画面を表示するライセンスまたは権限がありません。\n画面：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0167' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0167',
	'E',
	'カレンダポップアップの初期化に失敗しました。\nGUI部品が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0168' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0168',
	'W',
	'画面を表示できませんでした。パスワードが入力されませんでした。\n画面：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0171' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0171',
	'D',
	'指定されたモードはリソースに定義されていません。\n使用するモードをリソースに定義してください。\nデフォルトのモードが使用されます。\nモード名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0172' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0172',
	'D',
	'画面表示処理開始\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0173' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0173',
	'D',
	'画面表示処理終了\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0174' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0174',
	'D',
	'画面作成処理開始\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0175' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0175',
	'D',
	'画面作成処理終了\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0176' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0176',
	'W',
	'出力するデータが表示されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0180' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0180',
	'D',
	'ファイルが選択されました。\nファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0181' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0181',
	'D',
	'ファイル選択ダイアログが表示されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0182' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0182',
	'D',
	'ファイル選択ダイアログが閉じられました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0183' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0183',
	'E',
	'Rowコンテナの設定に失敗しました。\nRowコンテナとメタ情報にnullを指定することはできません。\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0184' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0184',
	'E',
	'Rowコンテナの設定に失敗しました。\n指定されたRowコンテナに指定されたメタ情報を持つカラムが存在しません。\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0187' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0187',
	'E',
	'日付のフォーマットパターンの作成に失敗しました。\nフォーマットIDが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0188' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0188',
	'E',
	'日付のフォーマットパターンの作成に失敗しました。\nフォーマットの定義が不足しています。\nMCFormatリソースを確認してください。\nフォーマットID：{1}\n入力用フォーマット：{2}\n出力用フォーマット：{3}\n出力用ブランク：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0189' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0189',
	'E',
	'日付のフォーマットパターンの作成に失敗しました。\n指定されたフォーマットパターンIDが定義されていません。\nMCFormatリソースを確認してください。\nフォーマットID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0190' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0190',
	'E',
	'日付のフォーマットパターンの作成に失敗しました。\nフォーマットの定義が不足しています。\nフォーマットID：{1}\n入力用フォーマット：{2}\n出力用フォーマット：{3}\n出力用ブランク：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0191' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0191',
	'E',
	'日付のフォーマットパターンの設定に失敗しました。\nフォーマットパターンが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0192' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0192',
	'E',
	'数値のフォーマットパターンの作成に失敗しました。\nフォーマットIDが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0193' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0193',
	'E',
	'数値のフォーマットパターンの作成に失敗しました。\nフォーマットパターンが指定されていません。\nフォーマットID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0194' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0194',
	'E',
	'数値のフォーマットパターンの作成に失敗しました。\n指定されたフォーマットパターンIDが定義されていません。\nMCFormatリソースを確認してください。\nフォーマットID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0195' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0195',
	'E',
	'数値のフォーマットパターンの作成に失敗しました。\nフォーマットパターンが定義されていません。\nMCFormatリソースを確認してください。\nフォーマットID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0196' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0196',
	'E',
	'数値のフォーマットパターンの設定に失敗しました。\nフォーマットパターンが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0197' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0197',
	'E',
	'ListPutter のカラムの設定に失敗しました。\nカラム名が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0198' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0198',
	'E',
	'ListPutter の初期化に失敗しました。\nGUI 部品に null を指定することはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0199' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0199',
	'W',
	'ファイルにアクセスできませんでした。\n使用できない場所にフォルダがあるか、フォルダがパスワードで保護されているか、\nファイル名に "/" または "\\" が含まれている可能性があります。\nファイル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0201' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0201',
	'W',
	'ダイアログに表示するアイコンの作成に失敗しました。\nダイアログの表示処理を続行します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0202' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0202',
	'E',
	'値の比較に失敗しました。GUI 部品に null を指定することはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0203' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0203',
	'E',
	'値の比較に失敗しました。テーブルカラムに null を指定することはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0205' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0205',
	'E',
	'子画面の表示に失敗しました。\n親画面と同じ画面を子画面に指定することはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0206' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0206',
	'W',
	'ファイルにアクセスできませんでした。\nファイルが存在しません。\nファイル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0207' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0207',
	'E',
	'日付のフォーマットパターンの設定に失敗しました。\nMCDateFieldのフォーマットにミリ秒を指定することはできません。\nミリ秒を使用する場合はMCTimestampFieldを使用してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0211' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0211',
	'E',
	'MCTreeのデータモデルを設定できませんでした。\nMCTreeModelを指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0212' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0212',
	'E',
	'MCTreeNodeのユーザオブジェクトを設定できませんでした。\nMCConstRowを指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0214' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0214',
	'W',
	'ツリーに表示できないレコードが存在します。\nレコードの親子関係がループしています。\nこのレコードの子レコードに、親レコードが含まれています。\nこのレコードを無視して処理を続行します。\nキー：{1}\n親キー：{2}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0215' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0215',
	'W',
	'ツリーに表示できないレコードが存在します。\n[親]に指定されたレコードが存在しません。\nこのレコードを無視して処理を続行します。\nキー：{1}\n親キー：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0216' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0216',
	'I',
	'指定されたレコードとその子レコードを削除します。\nよろしいですか？\nレコード：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0221' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0221',
	'I',
	'画面が表示されました。\n画面：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0222' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0222',
	'I',
	'画面が閉じられました。\n画面：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0223' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0223',
	'I',
	'ボタンが押されました。ボタン処理を開始します。\n画面：{1}.{2}\n画面名：{3}\nボタン：{4}\nボタン名：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0224' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0224',
	'I',
	'ボタンが押されました。ボタン処理を終了します。\n画面：{1}.{2}\n画面名：{3}\nボタン：{4}\nボタン名：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0269' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0269',
	'E',
	'クライアント実行エラーです。クライアントログを確認してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0270' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0270',
	'E',
	'クライアントメモリエラーです。クライアントログを確認してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0271' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0271',
	'T',
	'ダイアログに表示するメッセージを置き換えました。\n置換前：{1}\n置換前メッセージ：{2}\n置換後：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0272' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0272',
	'D',
	'マルチメッセージ画面に表示できないメッセージが含まれています。\nこのメッセージを除外して処理を続行します。\nメッセージID：{1}\nメッセージ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0273' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0273',
	'E',
	'マルチメッセージ画面を表示できませんでした。\nマルチメッセージ画面に表示できるメッセージがありませんでした。\nメッセージID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0274' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0274',
	'E',
	'ダイアログに表示できないメッセージが指定されました。\nメッセージID：{1}\nメッセージ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0287' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0287',
	'E',
	'リストロジッククラスの初期化に失敗しました。\n画面が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0289' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0289',
	'E',
	'メニューXMLファイルの読込に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0290' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0290',
	'E',
	'親階層の無いメニューに、子のメニューを追加しようとしました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0291' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0291',
	'E',
	'メニューのXMLファイルのINCLUDEによる参照が循環しています。{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0292' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0292',
	'E',
	'メニュー[{1}]が存在しません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0293' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0293',
	'E',
	'INCLUDEタグの属性が設定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0294' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0294',
	'E',
	'{1}タグの属性[{2}]が設定されていません。\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0295' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0295',
	'E',
	'{1}タグの属性[{2}]に設定された値に誤りがあります。\nvalue={3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0296' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0296',
	'P',
	'メニュー階層が正しく構成されていないか、使用できるメニューアイテムが存在しないため、システムを終了します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0297' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0297',
	'E',
	'サブメニューが定義されていないメニューアイテムがあります。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0298' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0298',
	'W',
	'MCMenuに設定されている値がMCScreenで見つかりません。無視します。\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0299' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0299',
	'W',
	'メニューに指定された下記のクラスが見つかりません。無視します。\nclass:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0300' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0300',
	'I',
	'ファイル出力が完了しました。\nファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0301' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0301',
	'W',
	'出力対象の項目がありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0302' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0302',
	'W',
	'入力対象の項目がありませんでした。\nファイルを確認してください。\nファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0303' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0303',
	'W',
	'数値文字列が解析できませんでした。\n画面：{1}\n項目：{2}\n数値文字列：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0304' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0304',
	'W',
	'日時文字列が解析できませんでした。\n画面：{1}\n項目：{2}\n日時文字列：{3}\n書式：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0305' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0305',
	'W',
	'値を解析できませんでした。\n画面：{1}\n項目：{2}\n文字列：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0306' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0306',
	'W',
	'数値文字列が解析できませんでした。\n画面：{1}\n項目：{2}\n行番号：{3}\n数値文字列：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0307' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0307',
	'W',
	'日時文字列が解析できませんでした。\n画面：{1}\n項目：{2}\n行番号：{3}\n日時文字列：{4}\n書式：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0308' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0308',
	'W',
	'値を解析できませんでした。\n画面：{1}\n項目：{2}\n行番号：{3}\n文字列：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0309' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0309',
	'E',
	'SplitPaneを配置する箇所にSplitPaneに配置されないものが定義されています。\nName : {1}\nPstn : {2}\n階層 : {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0310' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0310',
	'E',
	'SplitPaneの左側に対応する右側のPanelが見つかりません。\nName : {1}\nPstn : {2}\n階層 : {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0311' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0311',
	'E',
	'SplitPaneの右側に対応する左側のPanelが見つかりません。\nName : {1}\nPstn : {2}\n階層 : {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0312' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0312',
	'E',
	'SplitPaneの上側に対応する下側のPanelが見つかりません。\nName : {1}\nPstn : {2}\n階層 : {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0313' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0313',
	'E',
	'SplitPaneの下側に対応する上側のPanelが見つかりません。\nName : {1}\nPstn : {2}\n階層 : {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0314' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0314',
	'T',
	'LayouterでMCPanelのサイズを設定しました。\nName: {1} Pstn: {2} PrefSize: {3} MinSize: {4} Size: {5} ID:{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0315' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0315',
	'T',
	'Layouter結果のTrace : {1}({2}) : {3} pref(X,W,Y,H) {4},{5},{6},{7} min(W,H) {8},{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0316' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0316',
	'E',
	'再帰レイアウトのマーク（{1}）は、レイアウトポジションの最終文字にのみ使用できます。\nName : {2} \nPstn : {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0317' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0317',
	'E',
	'使用できない文字がポジション情報にセットされています。\nName : {1} \nPstn : {2}\n使用できない文字 : {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0318' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0318',
	'E',
	'再帰レイアウト対象の中にMCPanel MCRootPanel以外のオブジェクトが含まれる場合は、\n再帰レイアウトは使用できません。\nName : {1}\n配置できないオブジェクト : {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0319' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0319',
	'E',
	'再帰レイアウト対象の中にMCPanel MCRootPanelが混合されている場合は、\n再帰レイアウトは使用できません。\nName : {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0320' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0320',
	'E',
	'再帰レイアウト対象の中にMCRootPanelが複数存在している場合は、\n再帰レイアウトは使用できません。\nName : {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0321' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0321',
	'E',
	'GeneralLayouterの予期せぬエラー。\nPstn：{1}\ndepth : {2}\nブロック名：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0322' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0322',
	'E',
	'GeneralLayouterの予期せぬクラスを検出しました。\nClass : {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0323' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0323',
	'D',
	'タブ移動順を設定できませんでした。\n指定された項目は既に設定されています。\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0324' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0324',
	'E',
	'メニューバーのフォント取得に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0325' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0325',
	'E',
	'メニューバーのフォント設定に失敗しました。\nNAME:{1}\nSTYLE:{2}\nSIZE:{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0326' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0326',
	'E',
	'メニューからのメソッド実行の設定に誤りがあります。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0327' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0327',
	'E',
	'メニュー挿入タグのPATHの値に該当するメニューが存在しませんでした。\nPATH:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0328' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0328',
	'E',
	'メニュー読込処理前に、メニュー情報が参照されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0329' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0329',
	'T',
	'GeneralLayouterで、マージン設定用のパネルを挿入します。\n土台のパネル：{1}\nマージンの位置：{2}\nマージンのサイズ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0330' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0330',
	'W',
	'画像ではありません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0331' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0331',
	'W',
	'画像の取り込みに失敗しました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0332' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0332',
	'W',
	'デスクトップの壁紙には、JPGかまたはGIFを指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0333' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0333',
	'E',
	'入力許可文字パターンの設定に失敗しました。\n失敗したパターン：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0334' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0334',
	'E',
	'電文のコンテナコピーに失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0335' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0335',
	'E',
	'コンテナリストの要素数が異なります。(ソース[{1}] コピー先[{2}])');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0336' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0336',
	'E',
	'ListChanged イベントリスナが無効なカラムにMCLCListenerを設定しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0337' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0337',
	'E',
	'カラムを自身のベーステーブルとは異なるベーステーブルに設定することはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0338' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0338',
	'E',
	'ActionPerformed イベントリスナが無効なカラムにMCAPListenerを設定しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0339' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0339',
	'I',
	'メニュー削除タグのPATHの値に該当するメニューが存在しませんでしたが、処理は続行します。\nPATH:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0340' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0340',
	'I',
	'INCLUDEタグに該当するメニューが存在しませんでしたが、処理は続行します。\nPATH:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0341' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0341',
	'W',
	'指定された画面は、メニューに存在しませんでした。\nモジュールID:{1}\n画面ID:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0342' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0342',
	'W',
	'画面IDを指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0343' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0343',
	'E',
	'デスクトップのレイアウト情報の設定に失敗しました。左上端のx座標、左上端のy座標、幅、高さの４要素をカンマ区切りで定義してください。\nリソース：{1}#{2}\nリソース値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0345' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0345',
	'W',
	'いくつかのステータスバーが生成できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0346' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0346',
	'E',
	'ステータスバーの画面生成に失敗しました。\nモジュールID:{1}\n画面ID:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0348' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0348',
	'E',
	'MCProgressPanelではない画面を作成しようとしました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0350' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0350',
	'E',
	'値のフォーマットに失敗しました。MCNumber型の値を設定してください。\n項目：{1}.{2}\n値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0351' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0351',
	'E',
	'値のフォーマットに失敗しました。MCDate型の値を設定してください。\n項目：{1}.{2}\n値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0352' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0352',
	'E',
	'値のフォーマットに失敗しました。MCTimestamp型の値を設定してください。\n項目：{1}.{2}\n値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0353' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0353',
	'E',
	'値のフォーマットに失敗しました。MCNumber型の値を設定してください。\n項目：{1}.{2}\n行番号：{3}\n値：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0354' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0354',
	'E',
	'値のフォーマットに失敗しました。MCDate型の値を設定してください。\n項目：{1}.{2}\n行番号：{3}\n値：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0355' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0355',
	'E',
	'値のフォーマットに失敗しました。MCTimestamp型の値を設定してください。\n項目：{1}.{2}\n行番号：{3}\n値：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0356' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0356',
	'E',
	'データベースからのメニュー読込に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0357' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0357',
	'W',
	'【注意】CapsLock キーがオンになっています。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0358' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0358',
	'E',
	'画像選択画面の設定に失敗しました。\nモジュール ID とスクリーン ID が指定されていません。\n項目：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0359' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0359',
	'E',
	'画像選択画面の設定に失敗しました。\n画像選択画面はMCImagePanelインターフェースを実装している必要があります。\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0360' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0360',
	'E',
	'コンボリストの表示に失敗しました。\nコンボリストのRowに表示用カラムが設定されていません。\n表示用カラム：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0361' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0361',
	'E',
	'行フィルタの判断条件を設定できませんでした。\nカラム名が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0362' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0362',
	'E',
	'行フィルタの判断条件を設定できませんでした。無効なデータ型が指定されました。\nデータ型：{1}\n有効なデータ型：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0363' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0363',
	'E',
	'行フィルタの判断条件を設定できませんでした。指定されたデータ型と条件値の型が合っていません。\nデータ型：{1}\n条件値：{2}\n条件値の型：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0364' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0364',
	'E',
	'行フィルタの判断条件を設定できませんでした。無効な比較演算子が指定されました。\nデータ型：{1}\n比較演算子：{2}\n有効な比較演算子：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0365' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0365',
	'E',
	'該当するメニュー情報が存在しません。\n親メニューID：{1}\nメニューID：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0366' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0366',
	'E',
	'ChartDatasetをnullにはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0367' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0367',
	'W',
	'フィルタすることができませんでした。\nテーブルが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0368' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0368',
	'W',
	'フィルタすることができませんでした。\nテーブルの行選択を解除することができませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0369' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0369',
	'I',
	'処理対象行に非表示の行が含まれています。処理を続行してもよろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0370' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0370',
	'W',
	'フィルタすることができませんでした。\n指定された条件と一致する行が存在しませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0371' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0371',
	'W',
	'一万年を超える日付が指定されました。\n画面：{1}\n項目：{2}\n日付：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0372' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0372',
	'W',
	'一万年を超える日付が指定されました。\n画面：{1}\n項目：{2}\n行番号：{3}\n日付：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0373' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0373',
	'W',
	'ガントチャートExcel出力用ファイルを読み込めませんでした。\nConfigClientリソースキー：{1}\n値：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0374' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0374',
	'I',
	'処理中です。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0376' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0376',
	'W',
	'画面の作成に失敗しました。\n指定されたモジュールID、スクリーンIDの画面が見つかりませんでした。\nモジュールID、スクリーンIDを確認してください。\nMCScreenリソースの画面のクラスパスの定義を確認してください。\nモジュールID：{1}\nスクリーンID：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0377' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0377',
	'W',
	'表示中の画面が閉じられなかったため画面が表示できませんでした。\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0378' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0378',
	'W',
	'画面にいくつかの値が設定できませんでした。\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0379' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0379',
	'W',
	'指定された項目が編集不可なため、値が設定できませんでした。\n項目識別キー：{1}\n項目：[{2}] {3}\n値：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0380' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0380',
	'W',
	'指定された項目が見つかりませんでした。\n画面項目識別キー：{1}\n値：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0381' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0381',
	'W',
	'指定されたボタンが見つかりませんでした。\n画面項目識別キー：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0382' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0382',
	'P',
	'メニューの作成に失敗しました。\nシステムを終了します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0383' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0383',
	'T',
	'BeforeOpenイベント開始\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0384' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0384',
	'T',
	'BeforeOpenイベント終了\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0385' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0385',
	'T',
	'AfterOpenイベント開始\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0386' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0386',
	'T',
	'AfterOpenイベント終了\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0387' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0387',
	'T',
	'BeforeCloseイベント開始\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0388' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0388',
	'T',
	'BeforeCloseイベント終了\n画面：{1}.{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0389' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0389',
	'W',
	'削除する行を選択してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0390' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0390',
	'D',
	'コンボリストのマウスドラッグイベントが実行されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0391' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0391',
	'I',
	'■タスクの操作');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0392' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0392',
	'I',
	'≪タスクを１つ選択する。関連するタスク間の矢印を表示する≫\n・タスクを「クリック」');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0393' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0393',
	'I',
	'≪タスクを複数選択する。関連するタスク間の矢印を表示する≫\n・タスクを「Ctrl + クリック」');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0394' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0394',
	'I',
	'≪タスクを移動する。タスクの幅を変更する≫\n・移動：タスクをドラッグ\n・幅変更：タスクの端をドラッグ');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0395' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0395',
	'I',
	'≪undo、redoする≫\n・undo：「Ctrl+Z」\n・redo：「Ctrl+Y」');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0396' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0396',
	'I',
	'■表示領域の操作');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0397' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0397',
	'I',
	'≪表示領域を拡大、縮小する≫\n・拡大縮小：「Ctrl+マウスホイール」\n・拡大縮小（縦）：「Ctrl+Shift+マウスホイール」\n・拡大縮小（横）：「Ctrl+Alt+マウスホイール」');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0398' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0398',
	'I',
	'≪表示領域を移動する≫\n・上に移動：「↑」、「PageUp」、「マウスホイール」\n・左に移動：「←」、「Alt+PageUp」、「Shift+Alt+マウスホイール」\n・下に移動：「↓」、「PageDown」、「マウスホイール」\n・右に移動：「→」、「Alt+PageDown」、「Shift+Alt+マウスホイール」');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0399' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0399',
	'I',
	'■縦軸の操作');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0400' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0400',
	'I',
	'≪縦軸を移動する≫\n・縦軸をドラッグ');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0401' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0401',
	'I',
	'≪縦軸を自動調整する≫\n・「Ctrl+T」\n・縦軸をダブルクリック');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0402' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0402',
	'W',
	'プログレスダイアログを表示できなかったため、処理を行いませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0403' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0403',
	'D',
	'画面起動高速化のためのクラス及びリソースの先読み処理を実行しました。\nリソースキー：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0404' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0404',
	'D',
	'画面起動高速化のためのクラス及びリソースの先読み処理をスキップします。\nリソースキー：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0405' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0405',
	'D',
	'画面起動高速化のためのクラス及びリソースの先読み処理でエラーが発生しました。\nリソースキー：{1}\nモジュールＩＤ：{2}\n画面ＩＤ：{3}\nエラー内容：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0406' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0406',
	'D',
	'画面起動高速化のためのクラス及びリソースの先読み処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0407' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0407',
	'E',
	'キャンセル処理中に異常終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0408' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0408',
	'T',
	'画面左上アイコン設定処理開始');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0409' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0409',
	'T',
	'画面左上アイコン設定処理終了：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0410' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0410',
	'T',
	'ダイアログテキストエリア枠線設定処理開始');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0411' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0411',
	'T',
	'ダイアログテキストエリア枠線設定処理終了：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0412' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0412',
	'T',
	'ダイアログスクロールペイン枠線設定処理開始');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0413' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0413',
	'T',
	'ダイアログスクロールペイン枠線設定処理終了：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0414' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0414',
	'I',
	'ファイル入力を実行します。よろしいですか？\n※一度に大量のデータを入力すると、サーバとの通信回数が多くなることがあり、取込に時間が掛かる場合があります。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0415' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0415',
	'W',
	'指定されたファイル名では保存できません。\nファイル名={1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0416' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0416',
	'T',
	'ユーザ操作によるボタン処理呼出\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0417' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0417',
	'W',
	'エディタを起動できませんでした。\nエディタ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0418' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0418',
	'D',
	'タスクトレイにメッセージを表示しました。\nメッセージタイプ：{1}\nメッセージ：\n{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0419' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0419',
	'T',
	'キャッシュを返します。\nキー:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0420' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0420',
	'T',
	'GCによってキャッシュした値が削除されています。\nキー:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0421' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0421',
	'T',
	'キャッシュはありません。\nキー:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0422' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0422',
	'T',
	'キャッシュします。\nキー:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0423' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0423',
	'T',
	'GCによって削除されたキャッシュ値のエントリーを削除します。\nキー:\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0424' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0424',
	'T',
	'キーまたは値がnullなのでキャッシュしません。\nキー:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0425' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0425',
	'I',
	'選択行を変更できなかったため、テーブルのファイル入力を中断しました。\n行番号：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0426' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0426',
	'W',
	'ファイル入力中に発生した警告数が上限数を超えたため、処理を中断しました。\n上限数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0427' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0427',
	'W',
	'複数のファイル、フォルダをドロップすることはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0428' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0428',
	'W',
	'フォルダをドロップすることはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0429' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0429',
	'W',
	'ファイルをドロップすることはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0430' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0430',
	'W',
	'ドロップできない拡張子のファイルが指定されました。\nファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0431' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0431',
	'I',
	'ファイル入力を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0432' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0432',
	'E',
	'ガジェットの生成に失敗しました。\nガジェット：{1}\nタイプ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0433' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0433',
	'I',
	'タブを削除します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0434' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0434',
	'E',
	'設定のデータ型が不正です。\nガジェット：{1}\n設定：{2}（{3}）\nデータ型：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0435' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0435',
	'W',
	'{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0436' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0436',
	'E',
	'ガジェットタイプが不正です。\nガジェット：{1}\nタイプ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0437' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0437',
	'E',
	'必須属性の値が不正です。\nガジェット：{1}\n属性：{2}\n値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0438' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0438',
	'E',
	'画面遷移パラメータの値が不正です。\nガジェット：{1}\nパラメータ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0439' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0439',
	'E',
	'マッピングするカラム名にnullは指定できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0440' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0440',
	'E',
	'イベントディスパッチスレッドではありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0441' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0441',
	'W',
	'運用日付が登録されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0442' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0442',
	'W',
	'積み上げグラフ利用時は１種類しか指定できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0443' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0443',
	'W',
	'同時利用可能なグラフ種類は２種類までです。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0444' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0444',
	'I',
	'{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0445' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0445',
	'W',
	'マイニングに対応していないオペレーションです。\n{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0446' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0446',
	'W',
	'ガジェットが削除されています。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0447' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0447',
	'W',
	'登録済みの定義名称です。\n別の名称を設定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0448' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0448',
	'W',
	'検索時の通信に含まれない項目が検索条件に追加されています。\n項目名：{1} {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0449' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0449',
	'E',
	'集計元のオペレーションの実行結果取得でエラーが発生しました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0450' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0450',
	'I',
	'初期化中です。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0451' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0451',
	'E',
	'MCListViewのモデルにMCListViewModel以外が設定されました。\nName：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0452' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0452',
	'W',
	'マイニング定義が使用できないか削除されています。\nID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0453' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0453',
	'E',
	'ガジェットのキャッシュデータ作成時にエラーが発生しました。\nタスク：{1}\nファイル：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0454' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0454',
	'E',
	'ガジェットのキャッシュデータ取得時にエラーが発生しました。\nガジェット：{1}\nファイル：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0455' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0455',
	'W',
	'タスク定義が使用できないか削除されています。\nID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0456' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0456',
	'W',
	'ユーザ定義ではガジェットのキャッシュは利用できません。\nID：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0457' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0457',
	'W',
	'編集可能な検索条件がある場合、ガジェットのキャッシュを利用できません。\nID：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0458' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0458',
	'W',
	'ガジェットのキャッシュを利用しない定義ではキャッシュを作成することはできません。\nID：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0459' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0459',
	'W',
	'３層環境以外ではタスク管理サーバ処理はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0460' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0460',
	'W',
	'タスク管理サーバが登録されていないか、複数登録されています。（{1}）');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0461' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0461',
	'I',
	'タスク管理サーバに昇格します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0462' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0462',
	'I',
	'タスク管理サーバに昇格しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0463' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0463',
	'W',
	'タスク管理サーバへのスケジュールの登録で問題が発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0464' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0464',
	'W',
	'新しいタスク管理サーバが正常に動作していません。（{1}）');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0465' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0465',
	'I',
	'タスク管理サーバを切替えます。（{1}）');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0466' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0466',
	'I',
	'タスク管理サーバを切替えました。（{1}）');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0467' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0467',
	'I',
	'現在のタスク管理サーバが指定されました。（{1}）');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0468' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0468',
	'W',
	'タスク管理サーバの切替に失敗しました。（{1}）\n現在のタスク管理サーバ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0469' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0469',
	'W',
	'現在のタスク管理サーバへの再スケジュールに失敗しました。（{1}）\n現在のタスク管理サーバ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0470' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0470',
	'W',
	'タスク管理サーバ切替中です。\nしばらくお待ちください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0471' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0471',
	'W',
	'タスク管理サーバが正常に動作していません。（{1}）');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0472' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0472',
	'I',
	'タスク管理サーバから降格します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0473' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0473',
	'I',
	'タスク管理サーバから降格しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0474' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0474',
	'E',
	'タスクスケジュールの設定に誤りがあります。\nタスク：{1}\n設定値：{2}/{3}/{4},{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0475' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0475',
	'I',
	'タスクが正常終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0476' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0476',
	'W',
	'タスク管理サーバ切替やDBセッション切断などの理由で、終了が検知できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0477' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0477',
	'W',
	'集計情報間の関連に問題があります。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0478' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0478',
	'W',
	'有効な集計情報がないため集計後計算はできません。\nID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0479' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0479',
	'I',
	'{1}\n( {2} )');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0480' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0480',
	'W',
	'グラフにする集計情報がありません。\nガジェット：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0481' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0481',
	'W',
	'組込ガジェットのモジュールＩＤまたはロジックＩＤが設定されていません。\nリソースキー：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC0482' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC0482',
	'W',
	'外部コマンドを実行できませんでした。\n外部コマンド：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBAC9000' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBAC9000',
	'D',
	'[ignore]java bug ID:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0001',
	'E',
	'コンテナメタの属性にnull値が設定されました。\nカラム名：{1}\nデータ型：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0002',
	'E',
	'ROW型のコンテナメタの属性にInnerRowのクラス指定がありません。\nカラム名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0003',
	'E',
	'InnerRowのインスタンスが生成できませんでした。\nRowクラス：{1}\nカラム名：{2}\nInnerRowクラス：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0004',
	'E',
	'Rowの生成に失敗しました。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0005',
	'E',
	'Rowの固定カラムの定義がありません。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0006',
	'E',
	'Rowの初期化に失敗しました。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0007',
	'T',
	'一時カラムを追加しました。\nクラス：{1}\nカラム：{2}\nデータ型：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0008',
	'D',
	'追加しようとした一時カラムと同じ名前のカラムまたはエイリアスが既に存在します。\n一時カラムは追加しません。\nクラス：{1}\nカラム：{2}\nデータ型：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0009',
	'E',
	'コピー元とコピー先のいずれかまたは両方のRowが null です。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0010',
	'E',
	'異なるクラス間でRowのコピーを行おうとしました。\nコピー元：{1}\nコピー先：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0011',
	'E',
	'比較するRowはこのRowと同じクラス、サブクラスのいずれでもありません。\n比較元Row：{1}\n比較先Row：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0012',
	'E',
	'比較するRowのカラムのデータ型が異なります。\n比較元Row：{1}\n比較元カラム名：{2}\n比較元データ型：{3}\n比較先Row：{4}\n比較先カラム名：{5}\n比較先データ型：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0013',
	'E',
	'リスナを追加するカラムが見つかりません。\nクラス：{1}\nカラム名：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0014',
	'E',
	'リスナを削除するカラムが見つかりません。\nクラス：{1}\nカラム名：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0015',
	'E',
	'不正な固定カラム位置から値を取得しようとしました。\nクラス：{1}\nカラム数：{2}\nカラム位置：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0016',
	'E',
	'不正な固定カラム位置に値を設定しようとしました。\nクラス：{1}\nカラム数：{2}\nカラム位置：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0017',
	'E',
	'不正な一時カラム位置から値を取得しようとしました。\nクラス：{1}\nカラム数：{2}\nカラム位置：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0018',
	'E',
	'不正な一時カラム位置に値を設定しようとしました。\nクラス：{1}\nカラム数：{2}\nカラム位置：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0019',
	'E',
	'固定カラムから値が取得できませんでした。\nクラス：{1}\nカラム：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0020',
	'E',
	'一時カラムから値が取得できませんでした。\nクラス：{1}\nカラム：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0021',
	'E',
	'固定カラムに値が設定できませんでした。\nクラス：{1}\nカラム：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0022',
	'E',
	'一時カラムに値が設定できませんでした。\nクラス：{1}\nカラム：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0023',
	'E',
	'InnerRowへの値の設定に失敗しました。\nカラムのクラス：{1}\n値のクラス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0024',
	'E',
	'固定カラムではないカラムで同じRowかどうか比較しました。\nクラス：{1}\nカラム：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0025',
	'E',
	'設定元のRowが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0026',
	'E',
	'設定元または設定先のカラム名が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0027',
	'E',
	'設定元と設定先のカラム名の数が異なります。\nカラム数：{1}\n設定元カラム数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0028',
	'E',
	'設定先カラムと設定元カラムのデータ型が異なります。\nクラス：{1}\nカラム：{2}\nカラムのデータ型：{3}\n設定元クラス：{4}\n設定元カラム：{5}\n設定元カラムのデータ型：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0029',
	'E',
	'設定元カラムと設定先カラムのマッピング定義が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0030',
	'E',
	'設定先のRowが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0031',
	'E',
	'Listに格納可能なRowを生成できませんでした。\nクラス：{1}\nRowクラス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0032',
	'E',
	'Listの生成に失敗しました。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0033',
	'E',
	'インデックスの範囲が不正です。\nクラス：{1}\nサイズ：{2}\nインデックス：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0034',
	'E',
	'終了インデックスより大きい開始インデックスが指定されました。\nクラス：{1}\nサイズ：{2}\n開始インデックス：{3}\n終了インデックス：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0035',
	'E',
	'ListのRowの一覧が変更されています。既存のイテレータは利用できせん。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0036',
	'E',
	'イテレータで繰り返し処理前に要素を削除しようとしたか、削除済みの要素を再度削除しようとしました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0037',
	'E',
	'イテレータで繰り返し処理前に要素を入替ようとしたか、入替済みの要素を再度入替ようとしました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0038',
	'E',
	'ListのRowの一覧が変更されています。既存のインデックスは利用できせん。\n変更されたクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0039',
	'E',
	'Listインデックスのイテレータで remove は未サポートです。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0040',
	'E',
	'Listインデックス用のRowComparatorが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0042',
	'E',
	'指定されたListインデックスキーはこのListのものではありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0043',
	'E',
	'Listインデックスキーにnullが指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0044',
	'E',
	'Rowの比較でエラーが発生しました。\n比較元クラス：{1}\n比較先クラス：{2}\n比較カラム：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0045',
	'E',
	'比較するカラムのデータ型が異なります。\nカラム名：{1}\n比較元データ型：{2}\n比較先データ型：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0046',
	'E',
	'ソート方法にnullが指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0047',
	'E',
	'グループ化するカラムを集計カラムに設定することはできません。\nカラム：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0048',
	'E',
	'集計するカラムにnullが指定されました。\n集計方法：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0049',
	'E',
	'数値カラム以外で合計値を求めようとしました。\nカラム：{1}\nデータ型：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0050',
	'E',
	'数値カラム以外で平均値を求めようとしました。\nカラム：{1}\nデータ型：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0051',
	'E',
	'カラムパス中にInnerRow以外のカラムが含まれています。\nクラス：{1}\nカラムパス：{2}\nカラム：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0052',
	'E',
	'Rowにないカラムを空かどうか判定しようとしました。\nクラス：{1}\nカラム：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0053',
	'E',
	'同じ名前の固定カラムまたはエイリアスがあるため一時カラムは追加できませんでした。\nクラス：{1}\nカラム：{2}\nデータ型：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0054',
	'E',
	'同じ名前の一時カラムがみつかりましたがデータ型が異なります。\nクラス：{1}\nカラム：{2}\nデータ型：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0055',
	'E',
	'Listに一時カラムを追加できませんでした。\nクラス：{1}\nカラム：{2}\nデータ型：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0056',
	'E',
	'ROW型の一時カラムは追加できません。\nクラス：{1}\nカラム：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0057',
	'E',
	'ListのRowの一覧が変更されています。既存のJOIN情報は利用できせん。\n変更されたクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0058',
	'E',
	'JOINキーにnullが指定されました。JOINされたコンテナは取得できません。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0059',
	'E',
	'このRow用ではないJOINキーが指定されました。JOINされたコンテナは取得できません。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0060',
	'E',
	'JOINされたRowがありません。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0061',
	'E',
	'Listに格納するRowのクラスが指定されていません。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0062',
	'E',
	'Rowにないカラムの値を検証しようとしました。\nクラス：{1}\nカラム：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0063',
	'W',
	'文字列長がカラムの桁数制限を超えています。\nクラス：{1}\nカラム：{2}\n桁数：{3}\n値：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0064' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0064',
	'W',
	'数値がカラムの桁数制限を超えています。\nクラス：{1}\nカラム：{2}\n桁数：{3},{4}\n値：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0065' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0065',
	'W',
	'負の値を許容しないカラムの値が負の値です。\nクラス：{1}\nカラム：{2}\n値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0066' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0066',
	'E',
	'追加する一時カラムにRowに格納できないクラスの値が設定されました。\nクラス：{1}\n追加するカラム：{2}\n値のクラス：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0067' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0067',
	'E',
	'比較するRowに null が指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0068',
	'E',
	'Rowにないカラムが指定されました。\nクラス：{1}\nカラム：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0069',
	'E',
	'Rowにないカラムが指定されました。\nクラス：{1}\nカラム：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0070',
	'E',
	'Row間のカラムコピーでエラーが発生しました。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0071' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0071',
	'E',
	'InnerRowではないカラムでListを作ろうとしました。\nクラス：{1}\nカラム：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0072',
	'E',
	'カラムパスの解析対象の Row に null が指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0073',
	'E',
	'カラム名に null が指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0074',
	'E',
	'指定されたRowクラスとInnerRowのクラスが異なります。\n指定：{1}\nInnerRow：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0075' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0075',
	'E',
	'指定されたSortPolicyインデックスが不正です。(size={1}, index={2})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0076' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0076',
	'E',
	'不正な位置のエイリアスを解析しようとしました。\nクラス：{1}\nエイリアス数：{2}\n位置：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0077' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0077',
	'E',
	'エイリアスで定義されているカラムパスが指す固定カラムが見つかりません。\nクラス：{1}\nエイリアス：{2}\nカラムパス：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBBC0078' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBBC0078',
	'W',
	'通信時暗号化カラムに半角文字以外が指定されています。\nクラス：{1}\nカラム：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0003',
	'T',
	'コンテナ作成開始');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0004',
	'T',
	'コンテナ作成終了');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0005',
	'E',
	'検索結果のデータ型変換に失敗しました。\n項目[{1}]で{2}が期待されましたが、{3}が返されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0006',
	'E',
	'テーブル名が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0007',
	'E',
	'OUT引数のカラムが指定されておりません。\nCOLUMN:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0008',
	'E',
	'ストアドプロシージャの実行中にエラーが発生しました。\n後処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0009',
	'E',
	'ストアドプロシージャの後処理中にエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0010',
	'E',
	'デフォルト・トランザクションが取得できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0011',
	'E',
	'データベースでエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0012',
	'E',
	'テーブル名が定義されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0013',
	'E',
	'SQLの実行結果の解析に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0014',
	'E',
	'SQLの実行結果から値を取得する際にエラーが発生しました。\n項目名:{1}\nデータ型:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0015',
	'E',
	'SQL文を文字列で設定しているため、MCSelectText#toStringForCount()メソッドは使用できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0016',
	'T',
	'SQL解析を開始しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0017',
	'T',
	'SQL解析が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0018',
	'E',
	'解析対象のSQL文が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0019',
	'E',
	'SQL実行時にデータベースでエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0020',
	'E',
	'SQL実行の終了時にデータベースでエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0021',
	'E',
	'ストアドプロシージャの実行中にデータベースでエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0022',
	'E',
	'ストアドプロシージャの実行の終了時にデータベースでエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0023',
	'E',
	'SQL実行の初期化処理でエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0024',
	'E',
	'データベースのコネクションが取得できないためSQL解析処理を中断止しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0025',
	'E',
	'SQL実行の初期化処理(TIMEOUT値設定)でエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0026',
	'E',
	'SQLバッチ実行のバインドリストの設定に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0027',
	'E',
	'SQL文のバインド変数の値の変換に失敗しました。\nKEY:{1}\nVALUE:{2}\nVALUE TYPE:{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0028',
	'E',
	'ストアドプロシージャのOUT引数の設定に失敗しました。\nINDEX:{1}\nVALUE:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0029',
	'E',
	'ストアドプロシージャの戻り値(OUT)の取得に失敗しました。\nINDEX:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0030',
	'E',
	'SQLの構文が不正のため、SQL実行を中止しました。 \n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0031',
	'E',
	'SQL文の解析に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0032',
	'E',
	'ロック対象のデータが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0033',
	'E',
	'ロック対象外のデータが含まれています。\nテーブル名:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0034',
	'E',
	'ロック対象の行が複数件見つかりました。\nロック対象のテーブル[{1}]のキー項目を再確認してください。\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0035',
	'W',
	'更新対象の行は、他の処理で更新されたため、最新の状態ではありません。更新処理は中断されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0036',
	'E',
	'更新カウンタを同期するデータが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0037',
	'E',
	'更新カウンタを同期するデータがデータベースに存在しません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0038',
	'E',
	'更新カウンタを同期する行が複数件見つかりました。\nロック対象のテーブル[%TABLE%]のキー項目を再確認してください。\n%KEYS%');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0039',
	'E',
	'検索結果が１件と想定される箇所で、複数件のデータが検索されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0040',
	'E',
	'データベースコネクションの初期化に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0041',
	'E',
	'データソース作成時にエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0042',
	'E',
	'有効なデータベースコネクションが取得できません。\nサーバのMaxConnectionPoolを最大数を増加することお勧めいたします。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0043',
	'E',
	'データベースコネクションの作成時にエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0044',
	'E',
	'開放するコネクションが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0045',
	'E',
	'コネクションのメタデータ取得に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0046',
	'E',
	'データベースのトランザクション・コミット時にエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0047',
	'E',
	'データベースのトランザクション・ロールバック時にエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0048',
	'E',
	'データベースのトランザクション・クローズ時にエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0049',
	'E',
	'データベースのトランザクション・ロールバック時にエラーが発生しました。(セーブポイント)');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0050',
	'E',
	'データベースのトランザクション・セーブポイントの取得時にエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0051',
	'E',
	'データベースのストアドプロシージャ実行の初期化処理でエラーが発生しました。\n{1}\n{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0052',
	'W',
	'データベースコネクションのコネクション数が上限に達しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0053',
	'I',
	'JDBC driver version:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0054',
	'E',
	'JDBCドライバの初期化に失敗しました。(データベースアクセスエラー）');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0055',
	'E',
	'JDBCドライバのクラスが見つかりません。\nクラスパスを再確認してください。\nPATH:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0056',
	'E',
	'JDBCドライバの初期化に失敗しました。(インスタンス化エラー）');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0057',
	'E',
	'JDBCドライバにアクセスできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0058',
	'E',
	'データベースの接続に失敗しました。\n詳しくはサーバのログファイルを確認してください。\nデータベース接続文字列:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0059',
	'E',
	'JDBCライブラリ内部でエラーが発生しました。\nOCI接続を使っている場合は、JDBCライブラリの配置場所及びOracleへのPATHを確認してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0060',
	'E',
	'データベースコネクションの設定に失敗しました。（AutoCommit=false)');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0061',
	'T',
	'コネクションプール[{1}]のガベージコレクタが実行されました({2} -> {3})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0066' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0066',
	'T',
	'DBTransaction : FAILURE [ {1} ]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0069',
	'E',
	'指定されたトランザクションは終了しています。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0070',
	'E',
	'未設定のセーブポイントに対しトランザクションをロールバックしようとしました。\nSavePoint ID:{1}\nName:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0071' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0071',
	'E',
	'定義済みの識別名でセーブポイントを作成しようとしました。\nSavePoint Name:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0072',
	'E',
	'フレームワークのストアドプロシージャの呼び出しに失敗しました。\n{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0073',
	'E',
	'PLSQLからの戻り値評価に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0074',
	'E',
	'NotNull制約の項目にNullが指定されています。\nテーブル名:{1}\n項目名:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0075' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0075',
	'E',
	'文字列の桁数制限をオーバーしています。\nテーブル名:{1}\n項目名:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0076' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0076',
	'E',
	'数値の桁数制限をオーバーしています。\nテーブル名:{1}\n項目名:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0077' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0077',
	'E',
	'Boolean型の桁数制限をオーバーしています。\nテーブル名:{1}\n項目名:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0078' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0078',
	'E',
	'予期せぬデータ型が指定されています。\nテーブル名:{1}\n項目名:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0079' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0079',
	'E',
	'SELECT句の指定がありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0080' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0080',
	'E',
	'VALUES句の指定がありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0081' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0081',
	'E',
	'SET句の指定がありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0082' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0082',
	'E',
	'FROM句の指定がありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0083' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0083',
	'E',
	'データベース接続先の設定がありません。databaseタグの記述に誤りがないかを確認してください。\nNotFound:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0084' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0084',
	'E',
	'同期対象の項目が存在しないDBContainerで同期処理が行われました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0085' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0085',
	'D',
	'接続先Database\nURL:{1}\nUSER:{2}\nMIN:{3}\nMAX:{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0086' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0086',
	'T',
	'コネクション・プール 初期化終了');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0087' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0087',
	'T',
	'スレッド・トランザクション初期化');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0088' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0088',
	'T',
	'スレッド・トランザクション開放');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0089' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0089',
	'T',
	'スレッド・トランザクション ロールバック');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0090' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0090',
	'T',
	'コネクション取得開始');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0091' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0091',
	'T',
	'コネクション取得終了');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0096' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0096',
	'T',
	'Analyzing SQL\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0097' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0097',
	'T',
	'Generated execute SQL\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0098' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0098',
	'E',
	'参照日時が設定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0099' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0099',
	'T',
	'SQL実行時エラーの後処理内エラー\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0100',
	'I',
	'SELECTの実行結果に、予期せぬデータ型が存在しました。\nTYPE:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0101',
	'T',
	'Binding\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0102',
	'T',
	'No Binding');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0103',
	'E',
	'現在、カーソルが有効な位置にありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0104',
	'E',
	'すでにクローズされているか、オープンされていないMCCursorに対して、位置移動を行いました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0105',
	'E',
	'MCCursorのオープン時にエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0106',
	'E',
	'MCCursorのコンストラクタの引数のResultSetにNull値が指定されたため、処理を中断します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0107' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0107',
	'E',
	'MCCursorのコンストラクタの引数のRowクラス名にNull値が指定されたため、処理を中断します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0108' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0108',
	'E',
	'MCCursorのクローズ時にエラーが発生しました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0109' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0109',
	'E',
	'カレントのデータベーストランザクションの取得に失敗しました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0110' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0110',
	'W',
	'対象のデータが、他の処理によってロックされています。\n処理を中止しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0111' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0111',
	'E',
	'指定されたインデックスのバインド値が指定されていません。\nINDEX:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0112' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0112',
	'E',
	'比較項目が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0113' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0113',
	'E',
	'Databaseのシステム日時が取得できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0114' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0114',
	'E',
	'通常用のバインド変数のリスト件数が、拡張用のリスト件数と一致しないため、SQLバッチ実行が行えません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0115' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0115',
	'D',
	'DBセッションへのログイン情報は設定されませんでした。\nUSER ID:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0116' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0116',
	'E',
	'DBセッションへの情報設定に失敗しました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0117' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0117',
	'T',
	'DBセッションへ情報を設定しました。\nATTRIBUTE:{1}\nVALUE:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0118' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0118',
	'T',
	'DBセッションの情報をクリアしました。\nATTRIBUTE:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0119' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0119',
	'E',
	'DBセッションの情報クリアに失敗しました。\nATTRIBUTE:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0120' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0120',
	'E',
	'DBセッションの情報取得に失敗しました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0121' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0121',
	'D',
	'{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0122' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0122',
	'T',
	'アプリケーションコンテキストに、ユーザ情報を設定しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0123' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0123',
	'E',
	'キー項目が設定されていないコンテナに対し、dbRowLock()が実行されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0124' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0124',
	'D',
	'処理対象のデータが無いため、下記のSQLは実行しません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0125' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0125',
	'E',
	'外部参照定義の無いテーブルが指定されました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0126' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0126',
	'T',
	'バインド変数 設定開始');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0127' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0127',
	'T',
	'バインド変数 設定終了');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0128' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0128',
	'E',
	'DBContainerのSQL文操作中に、DBContainerに存在しない項目名が指定されました。\n項目名:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0129' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0129',
	'E',
	'DBContainerのSQL文操作中に、すでにSQL文に設定されている項目名が追加されました。\n項目名:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0130' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0130',
	'E',
	'DBContainerのSQL文操作中に、SQL文に存在しない項目名を削除しようとしました。\n項目名:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0131' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0131',
	'E',
	'更新対象外の項目がSET句に指定されました。\nテーブル名:{1}\n項目名:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0132' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0132',
	'E',
	'引数の数に誤りがあります。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0133' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0133',
	'T',
	'SQL Execute START\nSQLID:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0134' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0134',
	'T',
	'SQL Execute END\nSQLID:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0135' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0135',
	'T',
	'{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0136' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0136',
	'E',
	'データ更新時に、一意制約違反が発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0137' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0137',
	'E',
	'挿入しようとしたレコードには、参照する親レコードが存在していません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0138' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0138',
	'E',
	'削除しようとしたレコードに子レコードが存在するため削除できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0139' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0139',
	'E',
	'SQL文に不正なキーワードが含まれています。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0140' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0140',
	'E',
	'表またはビューが存在しません。またはアプリケーションがその表へのアクセス権を持っていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0141' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0141',
	'E',
	'DMLAgentクラスの生成に失敗しました。\nクラス:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0142' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0142',
	'E',
	'FCT_BINARYテーブルよりBLOBデータを取得する際に、エラーが発生しました。\nBID:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0143' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0143',
	'E',
	'FCT_BINARYテーブルへBLOBデータを更新する際に、エラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0144' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0144',
	'E',
	'FCT_BINARYテーブルへBLOBデータを更新する際に、エラーが発生しました。(行ロック失敗)');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0145' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0145',
	'E',
	'プロセスIDの発番に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0146' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0146',
	'E',
	'キー項目が設定されていないテーブルで、キー項目に関わる操作を実行しました。\nテーブル名:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0147' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0147',
	'D',
	'検索結果を格納するコンテナが指定されていないため、検索結果は破棄されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0148' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0148',
	'E',
	'参照先のテーブルにデータが存在しません。\n参照元テーブル名:{1}\n参照先テーブル名:{2}\nキー項目:{3}\n値:{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0149' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0149',
	'E',
	'2個目以降のトランザクション開放時にエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0150' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0150',
	'D',
	'リクエストNoを発行しました。\nリクエストNo：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0151' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0151',
	'D',
	'Connection Pool Status\nCOUNT:{1}\nUSE  :{2}\nFREE :{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0152' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0152',
	'E',
	'一貫性制御の更新処理でエラーが発生しました。\nERR:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0154' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0154',
	'E',
	'セーブポイント名にNull値は使用できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0155' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0155',
	'W',
	'データ更新中に、データの競合が発生しました。\n処理を再実行してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0156' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0156',
	'E',
	'データベース側でエラーが発生した可能性があります。\nデータベースのalertログなどを確認してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0157' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0157',
	'I',
	'データベースコネクションが無効であるため、以下の処理は実行しませんでした。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0158' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0158',
	'E',
	'セーブポイント名に数字のみは使用できません。\nNAME:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0159' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0159',
	'E',
	'DBコネクションが使用できないか、切断されているため、処理を中断しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0160' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0160',
	'E',
	'バインド変数をインデックスで設定する場合、値には、MCRow、MCListは使用できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0161' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0161',
	'T',
	'スレッド・トランザクション 最終開放');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0162' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0162',
	'W',
	'2個目以降のトランザクション最終開放時にエラーが発生しましたが、処理は続行します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0163' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0163',
	'E',
	'ストアドプロシージャのOUT引数を指定した場合は、Rowを指定する必要があります。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0164' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0164',
	'T',
	'Statement Start:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0165' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0165',
	'T',
	'Statement End  :{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0166' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0166',
	'E',
	'DBトランザクションの初期化でDBコネクションの受け取りに失敗したため、\nDBトランザクションを終了しました。BLOBの参照も破棄されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0167' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0167',
	'I',
	'DBセッション制御が無効になっているため、セッション切断処理は行いません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0168' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0168',
	'W',
	'セッションＩＤ、シリアルＮＯのいずれかが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0169' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0169',
	'I',
	'切断対象のセッションが見つかりませんでした。\nユーザＩＤ:{1}\n会社ＣＤ:{2}\nクライアントリクエストＮＯ:{3}\nクライアント送信日時:{4}\nモジュールＩＤ:{5}\nロジックＩＤ:{6}\nオペレーションＩＤ:{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0174' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0174',
	'E',
	'コミット処理日時の登録に失敗しました。\nERR:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0175' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0175',
	'I',
	'コミット処理日時の削除に失敗しましたが、処理を続行します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0176' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0176',
	'E',
	'コミット処理の排他制御用のデータ登録に失敗しました。\nERR:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0177' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0177',
	'I',
	'セッション破棄対象外のエラーコードに、数値以外の値が設定されています。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0180' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0180',
	'E',
	'指定されたDBトランザクションのリスナークラスが存在しません。\nID:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0183' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0183',
	'E',
	'排他制御対象外のテーブルに対し、排他チェックを実施しました。\nテーブル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0184' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0184',
	'I',
	'サーバ処理管理機能によりオペレーションが中断されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0201' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0201',
	'E',
	'バインド値の数がキー項目の数と異なります。\nテーブル名： {1}\nキー項目の数： {2}\nバインド値の数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0300' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0300',
	'D',
	'SQL実行を開始しました。[{1}]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0301' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0301',
	'D',
	'SQL実行が終了しました。[{1}]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0302' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0302',
	'D',
	'DBTransaction : COMMIT [{1}]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0303' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0303',
	'D',
	'DBTransaction : ROLLBACK [{1}]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0304' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0304',
	'T',
	'コネクション開放\n [{1}]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0305' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0305',
	'T',
	'DBTransaction :LogicEnd COMMIT [{1}]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0306' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0306',
	'D',
	'SQLを実行します。[{1}]\nSQL:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0307' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0307',
	'T',
	'SQL実行が終了しました。[{1}]\nSQL:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0308' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0308',
	'T',
	'コネクション取得 空きコネクションが見つかりました。\n [{1}]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0309' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0309',
	'T',
	'コネクション取得 空きコネクションが見つかりましたが、再作成しました。\n [{1}]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0310' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0310',
	'T',
	'コネクション取得 新規コネクションを作成しました。\n [{1}]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0311' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0311',
	'I',
	'切断対象のセッションが見つかりませんでした。[{1}]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0312' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0312',
	'E',
	'DBセッション制御情報の更新に失敗しました。[{1}]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0313' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0313',
	'I',
	'切断対象のセッションはデフォルトトランザクションに使用されているため、切断できません。[{1}]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0314' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0314',
	'I',
	'セッションが使用中であるため、セッション切断は中止しました。[{1}]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0315' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0315',
	'I',
	'検索処理のキャンセル、またはサーバ処理管理機能によりデータベースセッションが切断されたため、SQL実行を中断します。[{1}]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0316' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0316',
	'E',
	'オートコミットが有効な場合、このメソッドは実行できません。\nメソッド：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0317' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0317',
	'E',
	'未設定のセーブポイントを削除しようとしました。\nSavePoint ID:{1}\nName:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC0318' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC0318',
	'E',
	'データベースのトランザクション・セーブポイントの削除時にエラーが発生しました。\nSavePoint ID:{1}\nName:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC5001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC5001',
	'D',
	'処理を開始しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC5002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC5002',
	'D',
	'正常終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC5003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC5003',
	'E',
	'異常終了しました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC5004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC5004',
	'I',
	'FCT_BINARYを参照しているテーブルはありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC5005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC5005',
	'E',
	'FCT_BINARYのデータ削除処理で異常が発生しました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC5006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC5006',
	'I',
	'FCT_BINARYのデータ削除処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC5007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC5007',
	'I',
	'FCT_BINARYのデータ削除処理を終了します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC5008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC5008',
	'I',
	'FCT_PRINT_DATのデータ削除処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC5009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC5009',
	'I',
	'FCT_PRINT_DATのデータ削除処理を終了します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC5010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC5010',
	'E',
	'FCT_PRINT_DATのデータ削除処理で異常が発生しました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC5011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC5011',
	'E',
	'定数に存在しない値が設定されました。\n存在しない値：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC5012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC5012',
	'I',
	'FCT_SRV_REQUESTのデータ削除処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC5013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC5013',
	'I',
	'FCT_SRV_REQUESTのデータ削除処理を終了します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBCC5014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBCC5014',
	'E',
	'FCT_SRV_REQUESTのデータ削除処理で異常が発生しました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBDC0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBDC0001',
	'E',
	'暗号化に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBDC0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBDC0002',
	'E',
	'復号化に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBDC0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBDC0003',
	'E',
	'暗号化実装クラスのインスタンス化に失敗しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0001',
	'E',
	'指定されたクラスが見つかりません。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0002',
	'E',
	'取得したクラスは指定された親クラスの派生クラスではありません。\n取得したクラス：{1}\n親クラス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0003',
	'E',
	'インスタンスが生成できませんでした。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0004',
	'I',
	'mcframeクライアントの初期化を開始しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0005',
	'I',
	'mcframeクライアントの初期化が完了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0006',
	'I',
	'Client MCF_HOME：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0007',
	'I',
	'Server MCF_HOME：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0008',
	'I',
	'mcframeサーバの初期化を開始しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0009',
	'I',
	'mcframeサーバの初期化が完了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0010',
	'E',
	'メソッドが実行できませんでした。\n実行するメソッドを実装するオブジェクトが指定されませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0011',
	'E',
	'メソッドが実行できませんでした。\n実行するメソッドが指定されませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0012',
	'E',
	'メソッドが実行できませんでした。\n実行する静的メソッドを実装するクラスが指定されませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0013',
	'E',
	'メソッドが実行できませんでした。\nメソッドにアクセスできません。\nメソッド：{1}#{2}({3})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0014',
	'E',
	'メソッドが実行できませんでした。\n実行対象のオブジェクトにメソッドがないか、引数の数または型が異なります。\nメソッド：{1}#{2}({3})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0015',
	'E',
	'メソッドが実行できませんでした。\nメソッドがみつかりませんでした。\nメソッド：{1}#{2}({3})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0016',
	'E',
	'指定されたクラスが見つかりませんでした。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0017',
	'E',
	'想定外のクラスが見つかりました。\n見つかったクラス：{1}\n想定しているクラス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0018',
	'E',
	'インスタンスが生成できませんでした。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0019',
	'I',
	'初期化中...');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0020',
	'E',
	'Javaが暗号化に対応していません。暗号化に対応していないJavaは使用できません。\n必要な暗号化方式：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0021',
	'E',
	'ファイルのハッシュ値の計算に失敗しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0022',
	'E',
	'BASE64デコードできません。BASE64データが不正です。\nデータ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0023',
	'E',
	'BASE64デコードできません。BASE64データ長が不正です。\nデータ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0024',
	'W',
	'INIファイルが見つかりませんでした。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0025',
	'E',
	'INIファイルの読込みに失敗しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0026',
	'W',
	'カタログファイルが見つかりませんでした。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0027',
	'E',
	'カタログファイルの読込みに失敗しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0028',
	'I',
	'外部コマンドを実行します。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0029',
	'I',
	'外部コマンドを実行しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0030',
	'E',
	'外部コマンドが実行できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0031',
	'E',
	'外部コマンドが設定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0032',
	'E',
	'外部コマンドが見つからないかアクセス権がありませんでした。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0033',
	'E',
	'リモート実行用レジストリが参照できませんでした。({1}:{2})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0034',
	'E',
	'リモート実行用レジストリにスタブが登録されていません。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0035',
	'E',
	'リモート実行用レジストリとの通信に失敗しました。({1}:{2})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0036',
	'I',
	'{1} # Request Thread[{2}]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0037',
	'I',
	'{1} # Client[{2}] User[{3}] ServerRequestNo[{4}]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0039',
	'I',
	'{1} # Command[{2}] Wait[{3}] Stdout[{4}] Stderr[{5}]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0040',
	'I',
	'{1} # ExitCode[{2}]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0041',
	'I',
	'{1} # Stdout -----\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0042',
	'I',
	'{1} # Stderr -----\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0043',
	'I',
	'コマンド実行サーバメッセージ ({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0044',
	'E',
	'コマンド実行サーバ異常メッセージ ({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0045',
	'E',
	'バイトデータに変換する16進数文字列の長さは2の倍数でなければなりません。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0046',
	'E',
	'16進数文字列として無効な字が含まれていました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0047',
	'W',
	'メニュー画面が表示できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0048',
	'D',
	'NotificationStartupイベント開始\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0049',
	'D',
	'NotificationStartupイベント終了\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0050',
	'W',
	'指定されたスタートアップリスナが見つかりません。\nこのリスナをスキップし処理を継続します。\nキー：{1}\nクラス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0051',
	'I',
	'MCシステム時刻を同期しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0052',
	'I',
	'{1} - {2} {3} ({4})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0053',
	'I',
	'[{1}] {2} {3} ({4})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0054',
	'I',
	'別プロセスで起動中のため終了します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0055',
	'E',
	'多重起動制御処理でエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0056',
	'W',
	'外部からのリクエストの解析でエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0057',
	'W',
	'外部コマンドを強制終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0058',
	'E',
	'バッチＣＤが不正です。\nバッチＣＤ１：{1}\nバッチＣＤ２：{2}\nバッチＣＤ３：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0059',
	'W',
	'計算式に文法エラーがあります。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0060',
	'W',
	'計算式で実行エラーが発生しました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBEC0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBEC0061',
	'E',
	'同じ定義のユーザ関数が既に登録されています。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0001',
	'E',
	'書式文字列に null が指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0002',
	'E',
	'書式文字列が解析できませんでした。\n書式文字列：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0003',
	'E',
	'数値文字列が解析できませんでした。\n数値文字列：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0004',
	'E',
	'数値の精度に負の値が指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0005',
	'E',
	'丸め方法に丸め不要が指定されたときに演算結果が丸め不要な値になりませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0006',
	'E',
	'演算結果の小数点以下が無限になりました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0007',
	'E',
	'割る数に 0 が指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0008',
	'E',
	'丸めモードが不正です。\n丸めモード：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0009',
	'E',
	'スケールがオーバーフローしました。\n指定されたスケール：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0010',
	'E',
	'日時フィールドに不正な値が設定されました。\n日時：{1}\n設定値：{2} ({3})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0011',
	'E',
	'日時変換で不正な値が指定されました。\nフィールド：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0012',
	'E',
	'日時文字列が解析できませんでした。\n日時文字列：{1}\n書式：{2}\n問題の位置：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0013',
	'E',
	'比較する日時フィールドが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0014',
	'E',
	'比較する日時が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0015',
	'E',
	'比較する日時フィールドが不正です。\nフィールド：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0016',
	'E',
	'取得する日時フィールドが不正です。\nフィールド：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0017',
	'E',
	'数値文字列の書式が指定されませんでした。\n文字列：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0018',
	'E',
	'日付文字列の書式が指定されませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0019',
	'E',
	'日付オフセットのためのタイムゾーンが指定されませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0020',
	'E',
	'データ型が一致しませんでした。キャストに失敗しました。\n{1} -> {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0021',
	'E',
	'ブール値に null は指定できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0022',
	'E',
	'累乗する指数が上限の999999999を超えています。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0023',
	'E',
	'null 日時と差を求めることはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0024',
	'E',
	'不正なDBポインタが指定されました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0025',
	'E',
	'存在しないかファイル以外のパスが指定されました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0026',
	'E',
	'不正な書式の文字列が指定されました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0027',
	'E',
	'比較するバイナリが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0028',
	'E',
	'メタをインスタンス化できませんでした。引数が不正です。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0029',
	'E',
	'数値情報が失われるデータ型に変換しようとしました。\n値：{1}\nデータ型：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0030',
	'E',
	'比較する値が指定されたデータ型と異なります。データ型：{1}\n値：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBFC0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBFC0031',
	'E',
	'比較する値に比較できないデータ型または条件が設定されました。\nデータ型：{1}\n条件：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0001',
	'E',
	'ユーザ情報が初期化されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0002',
	'E',
	'ライセンスユニットIDにnullが指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0003',
	'E',
	'ユーザIDにnullが指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0004',
	'E',
	'ログイン時間にnullが指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0005',
	'E',
	'ログインシーケンスにnullが指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0006',
	'E',
	'クライアント処理通番にnullが指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0007',
	'E',
	'ユーザ情報が初期化されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0008',
	'E',
	'MCDPフォーマットエラーです。\n行: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0009',
	'E',
	'コンテナ定義が不正です。\nID: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0010',
	'E',
	'解析ハンドラが予期せぬ方法で使用されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0011',
	'E',
	'データの変換に失敗しました。\n型：{1}\n文字列：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0012',
	'E',
	'不正な型が検出されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0013',
	'E',
	'電文定義クラスのインスタンス化に失敗しました。\nID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0014',
	'E',
	'MCDP電文テキスト化に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0015',
	'E',
	'パラメータクラスが不正です。\nロジックパラメータクラス名：{1}\nコンテナ名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0016',
	'E',
	'通信データの変換に失敗しました。\n原因：\n({1})\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0017',
	'E',
	'電文定義中のロジックIDが不正です。\nロジックID: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0018',
	'E',
	'電文定義の取得に失敗しました。\nID： {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0019',
	'E',
	'電文定義のIDにnullが指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0021',
	'E',
	'通信方式の設定が不正です。\n通信方式: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0022',
	'E',
	'通信ストリームの生成に失敗しました。\nURL: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0023',
	'E',
	'データ送信中にエラーが発生しました。\nURL: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0024',
	'E',
	'データ受信中にエラーが発生しました。\nURL: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0025',
	'E',
	'受信データのコード変換に失敗しました。\n変換コード: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0026',
	'E',
	'通信に失敗しました。\nURL：{2}\n原因：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0027',
	'E',
	'クライアント初期化エラーです。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0028',
	'E',
	'リクエスタの生成に失敗しました。\nシステムプロパティ: {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0029',
	'E',
	'リクエスタがロジックの実行に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0030',
	'E',
	'ロジックの実行に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0031',
	'E',
	'クライアントサイドの初期化エラーです。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0032',
	'E',
	'クライアントの通信層でエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0033',
	'E',
	'サーバ実行エラーです。サーバログを確認してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0034',
	'E',
	'パラメータにnullが指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0035',
	'E',
	'ロジックが予期せぬ初期化処理をされました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0036',
	'E',
	'ロジック連携に失敗しました。\nID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0037',
	'E',
	'不正なロジックパラメータが返されました。\nID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0038',
	'E',
	'ロジック実行フェーズで失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0039',
	'E',
	'リクエストオブジェクトが初期化されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0040',
	'E',
	'サーバサイドの初期化エラーです。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0041',
	'E',
	'ロジックビフォアの実行に失敗しました。\nクラス名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0042',
	'E',
	'ロジックビフォアフェーズで失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0043',
	'E',
	'コンボボックスや汎用検索項目のコントロールクラスのパッケージパスやメソッド名を確認してください。\n呼び出そうとしたクラス：{1}\n呼び出そうとしたメソッド名：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0044',
	'F',
	'サーバサイドの初期化エラーです。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0045',
	'E',
	'コンテキストの生成に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0046',
	'E',
	'コンテキストの生成に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0047',
	'E',
	'サーバでメモリエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0048',
	'W',
	'禁止上限量違反により、送信できませんでした。\n送信量：{1}\n禁止上限量：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0049',
	'E',
	'NULL不可の入力項目にNULLが指定されました。\nブロック番号：{1}\n行番号：{2}\nカラムパス：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0050',
	'E',
	'パラメータを生成できませんでした。\nモジュールID：{1}\nロジックID：{2}\nオペレーションID：{3}\nバージョン：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0051',
	'W',
	'オペレーションは正常終了しましたが、禁止上限量違反のため下り電文が取得できませんでした。\n上限量：{1}\n実際量：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0052',
	'E',
	'NULL不可の出力項目にNULLが指定されました。\nブロック番号：{1}\n行番号：{2}\nカラムパス：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0053',
	'E',
	'ロジッククラスの操作に失敗しました。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0054',
	'W',
	'オペレーションは正常終了しましたが、フレームワークエラーのため下り電文が取得できませんでした。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0055',
	'E',
	'フェーズ後処理でエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0056',
	'E',
	'ロジック連携に失敗しました。\nモジュールID：{1}\nロジックID：{2}\nオペレーションID：{3}\nバージョン：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0057',
	'E',
	'並行処理制御フェーズでエラーが起きました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0058',
	'W',
	'現在実行中の業務処理によりオペレーションが実行できませんでした。\n時間を置いてから再度該当オペレーションを実行してください。\n今回の実行\n待ち時間：{1}ミリ秒\nリトライ回数：{2}回');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0059',
	'E',
	'実行数処理制御フェーズで失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0060',
	'W',
	'現在サーバがビジーです。\n時間を置いてから再度該当オペレーションを実行してください。\n今回の実行\n待ち時間：{1}ミリ秒\nリトライ回数：{2}回');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0061',
	'E',
	'ディレクトリの作成に失敗しました。\nディレクトリ：\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0062',
	'E',
	'ファイルがすでに存在しているため、ファイルを作成できませんでした。\nディレクトリ：\n{1}\nファイル：\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0063',
	'E',
	'ファイルへのデータ保存が失敗しました。\nディレクトリ：\n{1}\nファイル：\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0064' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0064',
	'E',
	'ファイルの削除に失敗しました。\nディレクトリ：\n{1}\nファイル：\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0065' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0065',
	'E',
	'読み込むファイルが見つかりません。\nディレクトリ：\n{1}\nファイル：\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0066' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0066',
	'E',
	'読み込みに失敗しました。\nディレクトリ：\n{1}\nファイル：\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0067' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0067',
	'E',
	'ファイルのクローズに失敗しました。\nディレクトリ：\n{1}\nファイル：\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0068',
	'E',
	'ファイルのクローズに失敗しました。\nディレクトリ：\n{1}\nファイル：\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0069',
	'E',
	'ロジッククラスが見つかりませんでした。\nクラス：\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0070',
	'E',
	'ページングしようしたブロックが不正です。\nオペレーション：{1}\nブロック：{2}\nクラス：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0071' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0071',
	'W',
	'オペレーションのバージョンが一致しませんでした。\nID：{1}.{2}.{3}\n要求したバージョン：{4}\nサーバのバージョン：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0072',
	'E',
	'通信ライブラリの呼び出しに失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0073',
	'E',
	'ダウンロードファイルが保存できませんでした。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0074',
	'E',
	'ダウンロードファイルが開けませんでした。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0075' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0075',
	'E',
	'ダウンロードファイル書き込みでエラーが発生しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0076' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0076',
	'E',
	'ダウンロードデータ読み込みでエラーが発生しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0077' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0077',
	'E',
	'サーバ上でダウンロードを行うことはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0078' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0078',
	'E',
	'ダウンロードするファイルが見つかりません。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0079' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0079',
	'E',
	'ダウンロードに失敗しました。\nダウンロード元：{1}\n保存先：{2}/{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0080' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0080',
	'E',
	'ダウンロード元に null が指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0081' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0081',
	'E',
	'MCBinaryのデータURLの取得に失敗しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0082' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0082',
	'E',
	'ダウンロード用ではない電文でダウンロードしようとしました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0083' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0083',
	'E',
	'不正なURLからダウンロードしようとしました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0084' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0084',
	'E',
	'リソースに通信先のURLが設定されていません。({1}#{2})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0085' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0085',
	'E',
	'ダウンロードするバイナリデータが見つかりません。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0086' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0086',
	'E',
	'サーバのダウンロード処理でエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0087' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0087',
	'E',
	'アップロードファイルを保存するファイルが開けませんでした。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0088' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0088',
	'E',
	'保存先ディレクトリにファイルが指定されました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0089' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0089',
	'E',
	'電文解析中に予想しない電文の終端を検出しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0090' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0090',
	'E',
	'アップロードファイル書き込みでエラーが発生しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0091' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0091',
	'W',
	'サーバステータス：\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0092' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0092',
	'W',
	'サーバステータスの制御が不正です。\n不明なステータスを検出しました。\nステータス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0093' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0093',
	'E',
	'サーバステータス制御フェーズでエラーが起きました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0094' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0094',
	'E',
	'ページングバッファの初期化に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0095' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0095',
	'E',
	'このバッファはすでにフラッシュ済みです。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0096' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0096',
	'E',
	'オペレーションの情報が取得できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0097' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0097',
	'E',
	'オペレーションが要求する必須項目に対応するコンテナの項目がnullでした。\n[オペレーションの情報]\nID：{1}.{2}.{3}\nバージョン：{4}\nブロック番号：{5}\n行番号：{6}\nカラム番号：{6}\n[コンテナの情報]\nコンテナクラス：{7}\n項目名：{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0098' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0098',
	'W',
	'システムで作成可能なレコードの上限に達したためオペレーションを中断しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0099' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0099',
	'W',
	'オペレーションで作成可能なレコードの上限に達したためオペレーションを中断しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0100',
	'I',
	'オペレーション({1}.{2}.{3}) 作成Row数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0101',
	'I',
	'同時実行数制御\nRow作成上限：{1} ({2})\n必須ボリューム：{3} ({4})\nメモリ使用量：{5}（{6}）');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0102',
	'W',
	'オペレーションで使用可能なメモリの上限に達したためオペレーションを中断しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0103',
	'W',
	'システムで使用可能なメモリの上限に達したためオペレーションを中断しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0104',
	'I',
	'ファイルをダウンロードします。({1}):{2} > {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0105',
	'I',
	'ファイルをダウンロードしました。{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0106',
	'I',
	'アップロードファイルを一時保存します。{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0107' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0107',
	'I',
	'アップロードファイルを一時保存しました。{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0108' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0108',
	'D',
	'使用可能なメモリの上限に達したためSystem.gc()を実行しました。\nGC所要時間（ミリ秒）：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0109' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0109',
	'D',
	'使用可能なメモリの上限に達しましたが、前回からの経過時間に達していないためSystem.gc()を実行しませんでした。\n経過時間（ミリ秒）：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0110' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0110',
	'I',
	'ＤＢトランザクションの生成に失敗したため、生成済のＤＢトランザクションで処理を続行します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0111' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0111',
	'D',
	'スレッドプールの数を変更しました。\nスレッドプール数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0112' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0112',
	'E',
	'スレッドプールがシャットダウン済のため、タスクを追加できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0113' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0113',
	'E',
	'マルチスレッドで実行した処理でエラーが発生しました。\n受付番号：{1}\nスレッド番号：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0114' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0114',
	'D',
	'マルチスレッドで実行中の処理が中断されました。\n受付番号：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0115' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0115',
	'I',
	'エラーが発生したためマルチスレッドで実行中の全ての処理を中断します。\n受付番号：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0116' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0116',
	'D',
	'マルチスレッド処理を開始します。\n受付番号：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0117' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0117',
	'D',
	'マルチスレッド処理が終了しました。\n受付番号：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0118' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0118',
	'T',
	'マルチスレッド処理を受付ました。\n受付番号：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0119' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0119',
	'D',
	'エラーが発生しましたが他のマルチスレッド処理は続行します。\n受付番号：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0120' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0120',
	'T',
	'マルチスレッドで実行した処理は正常に終了しています。\n受付番号：{1}\nスレッド番号：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0121' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0121',
	'E',
	'マルチスレッドで実行中のスレッドからはマルチスレッドのタスクを追加できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0122' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0122',
	'D',
	'マルチスレッド処理を開始します。\n受付番号：{1}\nスレッド番号：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0123' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0123',
	'D',
	'マルチスレッド処理が終了しました。\n受付番号：{1}\nスレッド番号：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0124' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0124',
	'E',
	'上り電文にリストブロックが複数存在するため、オペレーション分割処理を中断しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0125' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0125',
	'E',
	'上り電文のリストブロックが分割できなかったため、オペレーション分割処理を中断しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0126' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0126',
	'D',
	'マルチスレッド処理を受け付けました。\n全ての処理が完了するまで呼び出し元の処理を待機します。\n件数：{1}\nスレッド上限数：{2}\n自動コミット：{3}\n呼び出し元ＤＢトランザクション使用：{4}\nエラー時シャットダウン：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0127' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0127',
	'D',
	'マルチスレッド処理を受け付けました。\n呼び出し元の処理はマルチスレッド処理の完了を待たずに続行されます。\n件数：{1}\nスレッド上限数：{2}\n自動コミット：{3}\n呼び出し元ＤＢトランザクション使用：{4}\nエラー時シャットダウン：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0129' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0129',
	'D',
	'マルチスレッド処理で使用するＤＢトランザクションを生成します。\n現在のスレッドプール数：{1}\n生成予定数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0130' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0130',
	'E',
	'マルチスレッドで実行した処理でエラーが発生しました。\n受付番号：{1}\nスレッド番号：{2}\nメッセージ：\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0131' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0131',
	'E',
	'マルチスレッド処理で子スレッドから実行できないメソッドが実行されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0132' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0132',
	'I',
	'実行済ステータスを保存する対象のオペレーションではないため、ファイルを登録しませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0133' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0133',
	'E',
	'指定されたファイルが存在しません。\nファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0134' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0134',
	'I',
	'>>>>>>>>>>>>>>>>>>>> バッチオンライン処理開始 >>>>>>>>>>>>>>>>>>>>');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0135' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0135',
	'I',
	'<<<<<<<<<<<<<<<<<<<< バッチオンライン処理終了 <<<<<<<<<<<<<<<<<<<<');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0136' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0136',
	'D',
	'バッチオンライン処理の上り電文データです。\n-----\nID：{1}.{2}.{3}\n電文：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0137' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0137',
	'D',
	'バッチオンライン処理の下り電文データです。\n-----\nID：{1}.{2}.{3}\n電文：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0138' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0138',
	'E',
	'オペレーションの生成処理でエラーが発生しました。\nモジュールＩＤ：{1}\nロジックＩＤ：{2}\nオペレーションＩＤ：{3}\nバージョン：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0139' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0139',
	'E',
	'上り電文が不正です。\nモジュールＩＤ：{1}\nロジックＩＤ：{2}\nオペレーションＩＤ：{3}\nバージョン：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0140' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0140',
	'E',
	'実行ステータスの更新処理でエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0141' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0141',
	'E',
	'会社ＣＤが指定されませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0142' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0142',
	'E',
	'会社連携機能を実行する権限がありません。ログインユーザに以下の権限を付与する必要があります。\n会社ＣＤ：{1}\nＡＣ対象：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0143' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0143',
	'E',
	'会社連携機能で実行した処理でエラーが発生しました。\n会社ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0144' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0144',
	'E',
	'会社連携機能の初期化処理でエラーが発生しました。\n会社ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0145' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0145',
	'D',
	'会社連携処理を開始します。\n会社ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0146' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0146',
	'D',
	'会社連携処理が終了しました。\n会社ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0147' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0147',
	'T',
	'会社連携処理を受付ました。\n会社ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0148' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0148',
	'D',
	'新規スレッドを生成しました。\nスレッド名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0149' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0149',
	'E',
	'会社連携機能で実行されているオペレーションでは会社連携機能を実行できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0150' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0150',
	'T',
	'{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0151' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0151',
	'I',
	'コンテナ生成処理が中断されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0152' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0152',
	'I',
	'オペレーション中断指示を受信したため、処理を中断します。\nサーバリクエストＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0153' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0153',
	'E',
	'サーバシグナル監視スレッド実行中にエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0154' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0154',
	'I',
	'オペレーション中断指示を送信しました。\nサーバリクエストＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0155' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0155',
	'I',
	'中断するオペレーションを特定することができませんでした。\nユーザID:{1}\n拡張属性1:{2}\n拡張属性2:{3}\n拡張属性3:{4}\nクライアントリクエストNO:{5}\nクライアント送信日時:{6}\nモジュールID:{7}\nロジックID:{8}\nオペレーションID:{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0156' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0156',
	'I',
	'中断するオペレーションを特定することができませんでした。\nセッションＩＤ:{1}\nシリアルＮＯ:{2}\nインスタンスＩＤ:{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0157' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0157',
	'E',
	'サーバシグナル検索時にエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0158' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0158',
	'I',
	'システム管理者の操作によりオペレーションの処理が中断されました。\nサーバリクエストＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0159' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0159',
	'I',
	'サーバシグナルの不要なレコードを削除する処理を中断します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0160' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0160',
	'I',
	'オペレーション中断指示は送信済みです。\nサーバリクエストＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0161' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0161',
	'T',
	'ファイルをダウンロードします。({1}):{2} > {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0162' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0162',
	'T',
	'ファイルをダウンロードしました。{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0163' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0163',
	'I',
	'オペレーション中断指示から一定時間経過しましたが、オペレーションが終了していません。ＤＢセッションを切断してオペレーションを中断します。\n経過時間:{1}分\nサーバリクエストＮＯ:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0164' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0164',
	'D',
	'新規スレッドを生成しました。\nスレッド番号：{1}\nSESSION：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0165' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0165',
	'I',
	'中断するオペレーションを特定することができませんでした。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0200' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0200',
	'T',
	'画面の入力データからパラメータを生成します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0201' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0201',
	'I',
	'クライアントのリクエスト処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0202' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0202',
	'I',
	'クライアントのリクエスト処理が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0203' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0203',
	'T',
	'3層実行環境用のリクエスタが選択されました。\nプロパティ：{1}\nクラス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0204' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0204',
	'T',
	'2層実行環境用のリクエスタが選択されました。\nプロパティ：{1}\nクラス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0205' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0205',
	'D',
	'クライアントサイドの上り電文ログです。\n電文：\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0206' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0206',
	'D',
	'クライアントサイドの下り電文ログです。\nID：{1}.{2}.{3}\n電文：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0207' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0207',
	'T',
	'不正な通信メソッドが使用されました。\n通信メソッド：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0208' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0208',
	'I',
	'通信を開始します。\nURL：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0209' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0209',
	'I',
	'通信が終了しました。\nHTTP応答コード：{1}\nURL：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0210' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0210',
	'D',
	'HTTP送信データのログです。\nURL：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0211' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0211',
	'T',
	'不正な文字コードがHTTP通信に使用されました。\n文字コード：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0212' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0212',
	'T',
	'リクエスト処理中にエラーが発生しました。\nURL：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0213' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0213',
	'T',
	'レスポンス処理中にエラーが発生しました。\nURL：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0214' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0214',
	'T',
	'標準（非SSL）のHTTPクライアントを生成しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0215' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0215',
	'T',
	'SSL対応のHTTPクライアントを生成しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0216' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0216',
	'T',
	'パラメータクラスを捜査します。\n操作中のクラス名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0217' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0217',
	'T',
	'パラメータクラスが見つかりました。\nクラス名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0218' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0218',
	'D',
	'サーバサイドの初期化処理が正常終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0219' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0219',
	'D',
	'サーバサイドの初期化処理に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0220' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0220',
	'T',
	'サーバサイドは正常に初期化されています。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0221' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0221',
	'I',
	'サーバ処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0222' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0222',
	'I',
	'サーバ処理を終了します。\nサーバID：{1}\nサーバ処理番号：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0223' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0223',
	'T',
	'上り電文を解析します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0224' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0224',
	'T',
	'上り電文の解析が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0225' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0225',
	'T',
	'下り電文を解析します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0226' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0226',
	'T',
	'下り電文の解析が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0227' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0227',
	'I',
	'クライアント：{1}-{2}\nサーバ：{3}-{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0228' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0228',
	'T',
	'リクエスト処理を終了します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0229' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0229',
	'T',
	'リクエストオブジェクトにこのリクエストの情報を登録しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0230' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0230',
	'T',
	'リクエストオブジェクトにからこのリクエストの情報を開放しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0231' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0231',
	'T',
	'リクエスタで処理をロールバックしました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0232' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0232',
	'T',
	'ディスパッチャの処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0233' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0233',
	'T',
	'ディスパッチャの処理を終了します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0234' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0234',
	'D',
	'サーバサイドの上り電文データです。\n-----\nID：{1}.{2}.{3}\n電文：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0235' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0235',
	'D',
	'サーバサイドの下り電文データです。\n-----\nID：{1}.{2}.{3}\n電文：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0236' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0236',
	'D',
	'電文ログ化に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0238' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0238',
	'T',
	'下り電文の上限量をチェックします。\n電文上限量：{1}\n禁止上限量：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0239' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0239',
	'T',
	'ブロック数：{1}\nROWブロック：{2}\nDATASETブロック：{3}\n合計：{4}行');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0240' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0240',
	'D',
	'コンテキストにnullが設定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0241' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0241',
	'D',
	'変換元のパラメータにnullが指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0242' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0242',
	'D',
	'ロジッククラスをインスタンスかできませんでした。\nクラス名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0243' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0243',
	'T',
	'呼び出し元と呼び出し先のオペレーション情報とバージョンをチェックします。\n呼び出し元：\n    ID：{1}.{2}.{3}\n    バージョン：{4}\n呼び出し先：\n    ID：{5}.{6}.{7}\n    バージョン：{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0244' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0244',
	'D',
	'パラメータのバージョンが違います。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0245' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0245',
	'D',
	'コンテキストのタイプにnullが指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0246' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0246',
	'D',
	'変換先のパラメータにnullが指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0247' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0247',
	'D',
	'パラメータのブロック数が違います。\n変換元：{1}ブロック\n変換先：{2}ブロック');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0248' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0248',
	'T',
	'ブロックを解析します。\nブロック番号：{1}\n変換元：\n    電文定義ID：{2}\n    型：{3}\n変換先：\n    電文定義ID：{4}\n    型：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0249' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0249',
	'D',
	'InnerRowの解析にRow以外が指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0250' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0250',
	'T',
	'InnerRowを解析します。\nブロック番号：{1}\n行番号：{2}\n変換元：\n    電文定義ID：{3}\n    型：{4}\n    カラムパス：{5}\n変換先：\n    電文定義ID：{6}\n    型：{7}\n    カラムパス：{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0251' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0251',
	'D',
	'不正な型同士で変換しようとしました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0252' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0252',
	'D',
	'通信項目の不一致が発生しました。\n変換元：\n    項目名：{1}\n変換先：\n    項目名：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0253' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0253',
	'D',
	'通信できない型が指定されました。\n変換元：\n    項目名：{1}\n    型：{2}\n変換先：\n    項目名：{3}\n    型：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0254' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0254',
	'D',
	'通信項目の型に不一致が発生しました。\n変換元：\n    項目名：{1}\n    型：{2}\n変換先：\n    項目名：{3}\n    型：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0255' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0255',
	'T',
	'メッセージを解析します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0256' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0256',
	'T',
	'例外を解析します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0257' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0257',
	'T',
	'ブロックを解析します。\nブロック番号：{1}\n電文定義ID：{2}\n型：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0258' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0258',
	'D',
	'InnerRowの解析にRow以外が指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0259' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0259',
	'D',
	'通信できない型が指定されました。\n項目名：{1}\n型：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0260' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0260',
	'D',
	'不正な通信項目が指定されました。\n項目名：{1}\n型：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0261' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0261',
	'D',
	'HEADERタグ行のフォーマットが不正です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0262' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0262',
	'D',
	'電文のフォーマットバージョンが違います。\n解釈しようとしたバージョン：{1}\n渡された電文：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0263' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0263',
	'D',
	'HEADER行のフォーマットが不正です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0264' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0264',
	'D',
	'下り通信時に、変換先のパラメータにnullが指定されました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0265' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0265',
	'D',
	'ROWタグ行のフォーマットが不正です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0266' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0266',
	'D',
	'ブロックの型が不一致です。\n電文上ではロウ型を期待しましたが、指定された変換先のクラスはロウ型ではありませんでした。\nブロック番号：{1}\n変換先のクラス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0267' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0267',
	'D',
	'項目数（フレームワーク項目含む）が不正です。\n送信元からの電文の項目数：{1}\n送信先で定義されている項目数:{2}(アプリケーション：{3} + フレームワーク：{4})\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0268' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0268',
	'D',
	'不正な項目です。\n項目名：{1}\n型：{2}\n値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0269' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0269',
	'D',
	'Inner Rowの参照元が見つかりません。\n次のポインタが示す参照元が電文上に存在しないか、電文のフォーマットが間違っています。\n（参照先のInnerRowの情報は、参照元よりも後に記述します）\nポインタ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0270' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0270',
	'T',
	'ブロックを解析します。\nブロック番号：{1}\n電文定義ID：{2}\n型：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0271' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0271',
	'T',
	'InnerRowを解析します。\nブロック番号：{1}\n行番号：{2}\n電文定義ID：{3}\n型：{4}\nカラムパス：{5}\nポインタ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0272' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0272',
	'D',
	'ROWタグ行のフォーマットが不正です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0273' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0273',
	'D',
	'DATASETタグ行のフォーマットが不正です。\nDATASETブロックを参照にすることはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0274' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0274',
	'D',
	'ブロックの型が不一致です。\n電文上ではリスト型を期待しましたが、指定された変換先のクラスはリスト型ではありませんでした。\nブロック番号：{1}\n変換先のクラス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0275' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0275',
	'D',
	'ERRORタグ行のフォーマットが不正です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0276' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0276',
	'D',
	'MESSAGEタグ行のフォーマットが不正です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0277' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0277',
	'D',
	'ERROR行のフォーマットが不正です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0278' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0278',
	'D',
	'MESSAGE行のフォーマットが不正です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0279' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0279',
	'D',
	'不正なエラーの型が指定されました。\n値：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0280' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0280',
	'D',
	'電文上限違反の電文を取得するための管理モジュールが生成できませんでした。\nモジュールID：M\nロジックID：MNA1000\nオペレーションクラス名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0281' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0281',
	'D',
	'例外の型にnullが指定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0282' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0282',
	'D',
	'上り電文に例外が設定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0283' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0283',
	'D',
	'上り電文にメッセージが設定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0284' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0284',
	'D',
	'ヘッダ情報がありません。\n{1}行目');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0285' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0285',
	'D',
	'例外情報がありません。\n{1}行目');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0286' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0286',
	'D',
	'メッセージ情報がありません。\n{1}行目');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0287' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0287',
	'D',
	'Row情報がありません。\n{1}行目\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0288' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0288',
	'D',
	'電文が不正です。\n{1}行目');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0289' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0289',
	'D',
	'例外時の電文にコンテナブロックが設定されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0290' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0290',
	'D',
	'ヘッダブロックが複数検出されました。\n{1}行目');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0291' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0291',
	'D',
	'例外ブロックが複数検出されました。\n{1}行目');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0292' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0292',
	'D',
	'メッセージブロックが複数検出されました。\n{1}行目');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0293' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0293',
	'D',
	'パラメータの生成に失敗しました。\nロジッククラス：{1}\nメソッド：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0294' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0294',
	'T',
	'パラメータ->電文テキスト\n解析時間：{1}ミリ秒');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0295' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0295',
	'T',
	'電文テキスト->パラメータ\n解析時間：{1}ミリ秒');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0296' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0296',
	'T',
	'パラメータ->パラメータ\n解析時間：{1}ミリ秒');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0297' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0297',
	'T',
	'オペレーションの実行に失敗しました。\nID：{1}.{2}.{3}\nバージョン：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0298' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0298',
	'D',
	'オペレーションの実行に失敗しました。\nロジッククラス：{1}\nオペレーション実行メソッド：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0299' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0299',
	'D',
	'ロジッククラスとMCOperation.xmlが不一致です。\n次のメソッドが定義されていませんでした。\nロジッククラス：{1}\nメソッド：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0300' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0300',
	'D',
	'ロジッククラスのインスタンス化に失敗しました。\nロジッククラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0301' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0301',
	'D',
	'不正な項目を検出しました。\nブロック番号：{1}\nブロック行番号：{2}\nカラム番号：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0302' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0302',
	'D',
	'行ステータス、参照日時、またはブロック位置情報に不正な値が設定されています。\nブロック番号：{1}\nブロック行番号：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0303' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0303',
	'D',
	'電文定義IDが不正です。次のブロックが解析できませんでした。\nブロック番号：{1}\nブロック行番号：{2}\n電文定義、または解析しようとした電文が不正です。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0304' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0304',
	'I',
	'==================== オペレーション開始 ({1}.{2}.{3} ver.{4}) ====================');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0305' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0305',
	'I',
	'==================== オペレーション終了 ({1}.{2}.{3} ver.{4}) ====================');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0306' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0306',
	'T',
	'並行処理制御の設定です。\nリトライ回数：{1}回\nリトライ間隔：{2}ミリ秒');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0307' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0307',
	'D',
	'並行処理制御でリトライします。\nリトライ回数：{1}回\n現在の待ち時間：{2}ミリ秒');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0308' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0308',
	'T',
	'並行処理制御を通過しました。\n総待ち時間：{1}ミリ秒\n総リトライ回数：{2}回');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0309' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0309',
	'D',
	'並行処理制御が異常終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0310' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0310',
	'D',
	'並行処理制御を通過できませんでした。\n総待ち時間：{1}ミリ秒\n総リトライ回数：{2}回');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0311' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0311',
	'T',
	'実行数制御の設定です。\nリトライ回数：{1}回\nリトライ間隔：{2}ミリ秒');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0312' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0312',
	'D',
	'実行数制御でリトライします。\n現在の待ち時間：{1}ミリ秒\nリトライ回数：{2}/{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0313' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0313',
	'T',
	'実行数制御を通過しました。\n総待ち時間：{1}ミリ秒\n総リトライ回数：{2}回');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0314' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0314',
	'D',
	'実行数制御が異常終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0315' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0315',
	'D',
	'実行数制御を通過できませんでした。\n総待ち時間：{1}ミリ秒\n総リトライ回数：{2}回');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0316' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0316',
	'I',
	'並行処理制御の設定が不正なため、デフォルトの設定を採用します。\n原因：\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0317' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0317',
	'I',
	'同時実行制御の設定が不正なため、デフォルトの設定を採用します。\n原因：\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0318' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0318',
	'T',
	'ロジッククラス名の取得に失敗しました。\nモジュールID：{1}\nロジックID：{2}\nオペレーションID：{3}\n原因：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0319' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0319',
	'T',
	'ロジッククラスのメソッド名取得に失敗しました。\nモジュールID：{1}\nロジックID：{2}\nオペレーションID：{3}\n原因：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0320' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0320',
	'D',
	'電文解析時にエラーが起きました。文法エラーです。予想された次の行が見つかりません。\n解析した行{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0321' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0321',
	'D',
	'上り電文の解析時に不正なリーダが使われました。\n使用されたリーダ：\nmcframe.commonCore.pio.MCDP2ParamReader\n正しいリーダ：\nmcframe.serverCore.pio.MCDP2ParamReader');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0322' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0322',
	'D',
	'コンテナの定義と電文定義が不一致です。\n次の項目がコンテナに定義されていません。\n項目名：{1}\n[コンテナの情報]\nクラス名：{2}\n[オペレーションの情報]\nID：{3}.{4}.{5}\nバージョン：{6}\nブロック番号：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0323' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0323',
	'D',
	'オペレーションの必須項目に対応するコンテナの項目がnullでした。\n[オペレーションの情報]\nID：{1}.{2}.{3}\nバージョン：{4}\nブロック番号：{5}\n行番号：{6}\nカラム番号：{7}\n[コンテナの情報]\nコンテナクラス：{8}\n項目名：{9}\nRowダンプ：{10}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0324' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0324',
	'T',
	'電文の項目チェックをします。\nブロック番号:{1}\n項目：\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0325' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0325',
	'D',
	'オペレーションの必須項目に対応する電文の値がnullでした。\nID：{1}.{2}.{3}\nバージョン：{4}\nブロック番号：{5}\n行番号：{6}\nカラム番号：{7}\n[コンテナの情報]\nコンテナクラス：{8}\n項目名：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0326' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0326',
	'T',
	'認証フェーズを実行します。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0327' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0327',
	'T',
	'権限フェーズを実行します。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0328' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0328',
	'T',
	'並行処理制御フェーズを実行します。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0329' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0329',
	'T',
	'同時実行数制御フェーズを実行します。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0330' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0330',
	'T',
	'オペレーション前処理フェーズを実行します。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0331' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0331',
	'T',
	'オペレーション実行フェーズを実行します。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0332' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0332',
	'T',
	'送信上限チェックフェーズを実行します。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0333' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0333',
	'T',
	'次のメッセージがメッセージプールに追加されました。\nID：{1}\nメッセージ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0334' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0334',
	'T',
	'次のメッセージが削除されました。\nID：{1}\nメッセージ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0335' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0335',
	'T',
	'ロジック連携の上り電文ログです。\n電文：\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0336' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0336',
	'T',
	'ロジック連携の下り電文ログです。\nID：{1}.{2}.{3}\n電文：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0337' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0337',
	'D',
	'InnerRowブロックの型が不一致です。\n電文上ではロウ型を期待しましたが、指定された変換先のクラスはロウ型ではありませんでした。\nブロック番号：{1}\nブロック行番号：{2}\n参照：{3}\n変換先のクラス：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0338' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0338',
	'D',
	'電文定義でコンテナにマッピングできない項目が指定されました。\nブロック番号：{1}\nカラム番号：{2}\nコンテナ：{3}\n項目名：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0339' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0339',
	'D',
	'ブロックの情報を格納するためのコンテナが指定されませんでした。\nブロック番号：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0340' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0340',
	'I',
	'******************** サーバ要求を受付ました。({2} @ {1}) ********************');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0341' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0341',
	'I',
	'ユーザ：{1} (属性：{3} / {4} / {5}) (Seq：{2})\nクライアント要求ID：{7} @ {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0342' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0342',
	'I',
	'******************** サーバ要求に応答しました。({2} @ {1}) ********************');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0343' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0343',
	'I',
	'>>>>>>>>>>>>>>>>>>>> サーバ処理開始 >>>>>>>>>>>>>>>>>>>>');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0344' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0344',
	'I',
	'<<<<<<<<<<<<<<<<<<<< サーバ処理終了 <<<<<<<<<<<<<<<<<<<<');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0345' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0345',
	'D',
	'ユーザ：{1} (属性：{3} / {4} / {5}) (Seq：{2})\nクライアント要求ID：{7} @ {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0346' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0346',
	'D',
	'HTTPリクエスト\n-----\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0347' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0347',
	'D',
	'HTTPレスポンス\n-----\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0348' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0348',
	'D',
	'下り電文データです。\n-----\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0349' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0349',
	'D',
	'アップロードファイル\n-----\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0350' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0350',
	'I',
	'バッチ処理の終了コードです。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0351' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0351',
	'T',
	'サーバステータス制御フェーズを実行します。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0352' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0352',
	'E',
	'メールサーバ種別が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0353' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0353',
	'E',
	'メールサーバが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0354' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0354',
	'E',
	'未サポートのメールプロトコルです。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0355' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0355',
	'W',
	'メールサーバ接続の切断に失敗しました。処理は継続します。({1}:{2} protocol:{3})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0356' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0356',
	'I',
	'メールサーバと接続しました。({1}:{2} protocol:{3} user:{4})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0357' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0357',
	'E',
	'メールサーバとの接続に失敗しました。({1}:{2} protocol:{3} user:{4})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0358' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0358',
	'E',
	'メールサーバと接続していません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0359' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0359',
	'E',
	'メールサーバの認証ユーザが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0360' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0360',
	'W',
	'メールの送信に失敗しました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0361' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0361',
	'E',
	'メールサーバのメールフォルダにアクセスできませんでした。({1}:{2} user:{3} folder:{4})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0362' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0362',
	'W',
	'メールの受信に失敗しました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0363' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0363',
	'W',
	'メールサーバ接続を切断しました。({1}:{2} protocol:{3})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0364' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0364',
	'E',
	'メールヘッダの解析に失敗しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0365' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0365',
	'E',
	'メールメッセージの解析に失敗しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0366' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0366',
	'E',
	'メール本文以外を本文として扱いました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0367' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0367',
	'E',
	'メール文字列のデコードに失敗しました。({1} - {2})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0368' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0368',
	'E',
	'メール文字列のエンコードに失敗しました。({1} - {2})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0369' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0369',
	'E',
	'添付ファイルが見つかりません。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0370' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0370',
	'E',
	'添付ファイルデータのI/Oに失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0371' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0371',
	'E',
	'添付ファイルの保存に失敗しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0372' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0372',
	'E',
	'不正なメールアドレスが指定されました。({1} - {2})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0373' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0373',
	'E',
	'メールアドレスが指定されていません。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0374' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0374',
	'E',
	'メールヘッダの設定に失敗しました。({1} = {2})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0375' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0375',
	'E',
	'メールメッセージの生成に失敗しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0376' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0376',
	'E',
	'受信メールが指定されませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0377' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0377',
	'E',
	'メールファイルが作成できませんでした。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0378' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0378',
	'E',
	'メールファイルの書き出しに失敗しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0379' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0379',
	'E',
	'メールファイルが見つかりませんでした。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0380' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0380',
	'E',
	'メールファイルの読み込みに失敗しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0381' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0381',
	'E',
	'メールデータの変換でエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0382' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0382',
	'D',
	'ネイティブのオペレーションの引数情報です。\nID：{1}.{2}.{3}\nサービス名：{4}\n上り電文ボディ：\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0383' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0383',
	'D',
	'ネイティブのオペレーションの結果情報です。\nID：{1}.{2}.{3}\nサービス名：{4}\nリターンコード：{5}\n下り電文ボディ：\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0384' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0384',
	'E',
	'ネイティブのオペレーションの実行に失敗しました。\nID：{1}.{2}.{3}\nサービス名：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0385' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0385',
	'I',
	'>>>>>>>>>>>>>>>>>>>> デコレータ処理開始 >>>>>>>>>>>>>>>>>>>>');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0386' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0386',
	'I',
	'<<<<<<<<<<<<<<<<<<<< デコレータ処理終了 <<<<<<<<<<<<<<<<<<<<');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0387' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0387',
	'D',
	'デコレータ処理の上り電文データです。\n-----\nID：{1}.{2}.{3}\n電文：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0388' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0388',
	'D',
	'デコレータ処理の下り電文データです。\n-----\nID：{1}.{2}.{3}\n電文：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0389' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0389',
	'I',
	'>>>>>>>>>>>>>>>>>>>> 非同期処理開始 >>>>>>>>>>>>>>>>>>>>');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0390' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0390',
	'I',
	'<<<<<<<<<<<<<<<<<<<< 非同期処理終了 <<<<<<<<<<<<<<<<<<<<');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0391' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0391',
	'D',
	'非同期処理の上り電文データです。\n-----\nID：{1}.{2}.{3}\n電文：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0392' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0392',
	'D',
	'非同期処理の下り電文データです。\n-----\nID：{1}.{2}.{3}\n電文：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0393' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0393',
	'E',
	'ユーザIDが設定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0394' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0394',
	'E',
	'非同期処理中にシステムエラーが発生しました。(要求ID:{1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0395' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0395',
	'E',
	'非同期処理の初期化でシステムエラーが発生しました。(要求ID:{1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0396' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0396',
	'E',
	'非同期処理の後処理でシステムエラーが発生しました。(要求ID:{1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0397' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0397',
	'E',
	'非同期処理の後処理で下り電文の保存に失敗しました。(要求ID:{1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0398' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0398',
	'I',
	'#################### サーブレット開始 [{1}({2})] ####################');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0399' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0399',
	'I',
	'#################### サーブレット終了 [{1}({2})] ####################');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0400' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0400',
	'T',
	'HTTPリクエスト詳細情報\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0401' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0401',
	'T',
	'リクエストオブジェクトをクリアしました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0402' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0402',
	'T',
	'通信先URLをリソースから取得しました。\nURL：{1}\nサーブレットID：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0403' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0403',
	'T',
	'フェーズ後処理を実行しました。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0404' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0404',
	'W',
	'プッシュサーバURLが設定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0405' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0405',
	'I',
	'プッシュサーバURL : {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0406' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0406',
	'D',
	'*** push *** WebSocketスレッド開始');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0407' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0407',
	'D',
	'*** push *** exec JavaScript\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0408' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0408',
	'D',
	'*** push *** open on JavaScript');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0409' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0409',
	'D',
	'*** push *** message on JavaScript\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0410' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0410',
	'D',
	'*** push *** error on JavaScript');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0411' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0411',
	'D',
	'*** push *** close on JavaScript');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0412' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0412',
	'D',
	'*** push *** send on JavaScript\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0413' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0413',
	'I',
	'{1} 件のメッセージが届いています。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0414' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0414',
	'E',
	'起動引数が不足しています。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0415' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0415',
	'I',
	'プッシュサーバから切断しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0416' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0416',
	'I',
	'プッシュサーバに接続しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0417' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0417',
	'D',
	'*** push *** 他プロセスにリクエストしました。\nURL : {1}\nHTTP Status : {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0418' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0418',
	'I',
	'プッシュクライアントを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0419' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0419',
	'E',
	'不正なプッシュメッセージコマンドです。\nコマンド：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0420' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0420',
	'I',
	'{1} 件の新しいメッセージがあります。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0421' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0421',
	'D',
	'*** push *** open : session[{1}] client[{2}({3})]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0422' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0422',
	'D',
	'*** push *** send : ({1}) msssage \n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0423' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0423',
	'D',
	'*** push *** message : user[{1}] session[{2}] client[{3}({4})]\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0424' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0424',
	'D',
	'*** push *** error : user[{1}] session[{2}] client[{3}({4})]\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0425' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0425',
	'D',
	'*** push *** close : user[{1}] session[{2}] client[{3}({4})]\n({5}) {6}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0426' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0426',
	'I',
	'#################### プッシュ通知開始 [{1}({2})] ####################');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0427' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0427',
	'I',
	'#################### プッシュ通知終了 [{1}({2})] ####################');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0428' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0428',
	'E',
	'プッシュ通知の認証に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0429' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0429',
	'E',
	'認証していないセッションからプッシュ要求がありました。\nsession[{1}]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0430' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0430',
	'E',
	'プッシュ認証要求のあったセッションが見つかりませんでした。\nユーザ：{1}\nログインシーケンス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0431' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0431',
	'I',
	'{1}[{2}]が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0432' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0432',
	'W',
	'サーバに接続できませんでした。{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0433' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0433',
	'I',
	'分散リクエスト処理を開始します。\n処理No：{1}\nサーバ：{2}\n要求ID：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0434' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0434',
	'I',
	'分散リクエスト処理が終了しました。\n処理No：{1}\nサーバ：{2}\n要求ID：{3}\nリクエストNo：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0435' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0435',
	'W',
	'分散リクエストのサーバまたは電文が指定されていません。このリクエストはスキップします。\n処理No：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0436' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0436',
	'I',
	'分散リクエストを行います。\nサーバ：{1}\n分散処理数：{2}\n多重度：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0437' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0437',
	'W',
	'タスクトレイに表示できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0438' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0438',
	'D',
	'*** push *** TrayIcon action performed');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0439' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0439',
	'W',
	'プッシュ通知の依頼先でエラーが発生しました。\n処理No：{1}\nサーバ：{2}\n要求ID：{3}\nリクエストNo：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0440' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0440',
	'W',
	'プッシュ通知の送信に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0441' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0441',
	'I',
	'{1}\n\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0442' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0442',
	'D',
	'*** push *** send : ({1}) user[{2}] session[{3}] client[{4}({5})]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0443' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0443',
	'E',
	'分散リクエスト処理でエラーが発生しました。\n処理No：{1}\nサーバ：{2}\n要求ID：{3}\nリクエストNo：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0444' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0444',
	'I',
	'マイニング定義が更新されました。\nガジェット一覧を更新します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0445' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0445',
	'W',
	'オペレーションは正常終了しましたが、以下の理由により下り電文は取得できませんでした。\n\nメッセージ：\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0446' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0446',
	'W',
	'プッシュ通知のメール送信に失敗しました。\nユーザID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0447' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0447',
	'W',
	'メールアドレス未設定のため、プッシュ通知のメールが送信できませんでした。\nユーザID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0448' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0448',
	'I',
	'#################### Webサービス開始 [{1}({2})] ####################');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0449' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0449',
	'I',
	'#################### Webサービス終了 [{1}({2})] ####################');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0450' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0450',
	'I',
	'マイニングデータが更新されました。\nガジェットを更新します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0451' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0451',
	'W',
	'サーバの識別情報が設定されていないか不正です。\nURL：{1}\nサーバ名：{2}\nサーブレット名：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0452' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0452',
	'I',
	'#################### スケジュールタスク開始 [{1}({2})] ####################');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0453' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0453',
	'I',
	'#################### スケジュールタスク終了 [{1}({2})] ####################');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0454' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0454',
	'I',
	'スケジュールタスク [{1}({2})]\n実行サーバ：{3}({4})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0455' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0455',
	'W',
	'利用可能なサーバがないため、分散リクエストを中止しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0456' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0456',
	'W',
	'{1}[{2}]が終了しました。メッセージがあります。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0457' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0457',
	'D',
	'未対応の電文のフォーマットバージョンです。\n解析しようとしたバージョン：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0458' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0458',
	'W',
	'バージョンがサーバと一致しません。ダウンローダで更新してください。\nシステムID：{1}\nバージョン：{2}\nビルド：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0459' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0459',
	'I',
	'プッシュサーバから切断しました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0460' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0460',
	'E',
	'サーバのプッシュ通知サービスが停止しています。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0461' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0461',
	'W',
	'利用可能なサーバがないため、タスク実行を中止しました。\nスケジュールタスク [{1}({2})]');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0462' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0462',
	'W',
	'サーバロールの更新依頼先でエラーが発生しました。\n処理No：{1}\nサーバ：{2}\n要求ID：{3}\nリクエストNo：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0463' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0463',
	'W',
	'無効なサーバ名です。{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0470' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0470',
	'E',
	'システムキャッシュ更新依頼でエラーがありました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0471' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0471',
	'E',
	'システムキャッシュ更新の依頼先でエラーが発生しました。\n処理No：{1}\nサーバ：{2}\n要求ID：{3}\nリクエストNo：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0472' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0472',
	'I',
	'システムキャッシュを初期化します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0473' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0473',
	'I',
	'システムキャッシュを初期化しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0474' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0474',
	'W',
	'システムキャッシュ作成用トランザクションが取得できませんでした。\nシステムキャッシュ作成同時実行数を削減します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0475' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0475',
	'E',
	'システムキャッシュ更新でエラーが発生しました。\nテーブル：{1}\n会社コード：{2}\nロケール：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0476' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0476',
	'D',
	'システムキャッシュを更新します。\nテーブル：{1}\n要求スレッド数：{2}\n実際スレッド数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0477' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0477',
	'E',
	'一時キャッシュを更新することはできません。\nテーブル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0478' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0478',
	'D',
	'システムキャッシュを更新しました。\nテーブル：{1}\n会社コード：{2}\nロケール：{3}\nキャッシュ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0479' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0479',
	'E',
	'システムキャッシュにデータを追加することはできません。\nテーブル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0480' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0480',
	'D',
	'一時キャッシュにデータを追加しました。\nテーブル：{1}\n会社コード：{2}\nロケール：{3}\nキャッシュ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0481' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0481',
	'E',
	'JOINの条件値数がJOINするテーブルのキーカラム数と異なります。\nテーブル：{1}\nキーカラム数：{2}\n条件値数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC0482' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC0482',
	'W',
	'更新できなかったシステムキャッシュがあります。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1000' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1000',
	'W',
	'下り電文が上限量を超えています。取得しますか？\n上限量：{1}\n実際量：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1001',
	'W',
	'送信データ行数が上限量を超えています。\nサーバの処理に時間がかかる場合があります。\n継続しますか？\n上限量：{1}\n実際量：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1002',
	'I',
	'サーバへの処理要求をキャンセルしました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1003',
	'W',
	'下り電文が大きすぎるため、取得することができませんでした。\n上限バイト数：{1}\n実際バイト数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1100',
	'W',
	'これより先のデータはありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1101',
	'E',
	'ページングの指定が不正です。\nFROM：{1}\nTO：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1102',
	'W',
	'通信に失敗しました。({1})\n次のことを確認してください。\n・ネットワーク状態\n・インターネットの設定\n・通信先：{2}\n詳細はmc_net.logを確認してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1103',
	'E',
	'アプリケーションサーバでシステムエラーが発生しました。\nHTTPステータス：{1}\n通信先：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1104',
	'W',
	'通信に失敗しました。({1})\n次のことを確認してください。\n・ネットワーク状態\n・インターネットの設定\n・通信先：{2}\n詳細はログを確認してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1105',
	'W',
	'通信がタイムアウトしました。({1}ms)\n次のことを確認してください。\n・ネットワーク状態\n・インターネットの設定\n・環境設定の通信の設定\n・通信先：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1200' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1200',
	'I',
	'以下の番号でオペレーションの非同期実行要求を受け付けました。\nリクエストＮＯ：{1}\nオペレーション：{2}.{3}.{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1201' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1201',
	'E',
	'電文形式が不正です。\n要求形式：{1}\n実際形式：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1208' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1208',
	'W',
	'FTPサーバに接続できませんでした。\nHost：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1209' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1209',
	'W',
	'FTPサーバーにログインできませんでした。\nHost：{1}\nUser：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1210' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1210',
	'W',
	'FTP転送元のファイルにアクセスできませんでした。\nフォルダ：{1}\nファイル：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1211' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1211',
	'W',
	'FTP送信が失敗しました。{1}\nLocalファイル：{2}\nHost：{3}\nUser：{4}\nRemoteファイル：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1212' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1212',
	'W',
	'未定義のFTP送信モードが指定されました。{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1213' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1213',
	'E',
	'FTP転送中に例外が発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1214' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1214',
	'W',
	'送信元のファイルにアクセスできませんでした。\nフォルダ：{1}\nファイル：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1215' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1215',
	'W',
	'FTP転送先のファイルにアクセスできませんでした。\nフォルダ：{1}\nファイル：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1216' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1216',
	'W',
	'FTP送信にて、対応する送信元ファイルが指定されていませんでした。\nフォルダ：{1}\nファイル：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1217' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1217',
	'W',
	'FTP送信にて、対応する送信先ファイルが指定されていませんでした。\nフォルダ：{1}\nファイル：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1218' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1218',
	'W',
	'送信が失敗しました。\n送信元ファイル：{1}\n送信先ファイル：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1219' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1219',
	'W',
	'送信先のファイルにアクセスできませんでした。\nフォルダ：{1}\nファイル：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1220' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1220',
	'D',
	'FTP送信がCallされました。\nHost:{1}\nPort:{2}\nUser:{3}\nFtpMode:{4}\nPassive:{5}\nFtpOpts:{6}\nfromFiles:{7}\ntoPath:{8}\ntoFiles{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1221' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1221',
	'D',
	'FTP受信がCallされました。\nHost:{1}\nPort:{2}\nUser:{3}\nFtpMode:{4}\nPassive:{5}\nFtpOpts:{6}\nfromRemotePath:{7}\ntoPath:{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1222' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1222',
	'E',
	'コピー元のディレクトリが見つかりません。{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1300' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1300',
	'E',
	'レスポンスデータの生成時にエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1301' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1301',
	'E',
	'認証用トークンの生成時にエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBGC1302' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBGC1302',
	'E',
	'認証用トークンの検証に失敗しました。（{1}）');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0001',
	'W',
	'既にログインしています。\nユーザID：{1}\nログインクライアント：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0002',
	'W',
	'ログインセッションが見つかりませんでした。ログアウト処理は継続します。\nユーザID：{1}\nシーケンス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0003',
	'I',
	'ログインしました。\nユーザID：{1}\nクライアント：{2}\nシーケンス：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0004',
	'W',
	'ユーザIDが無効かパスワードが異なります。\nユーザID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0005',
	'W',
	'認証用データベースの接続先が異なります。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0006',
	'W',
	'電文に不正な情報が含まれています。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0007',
	'W',
	'パスワードの有効期限が切れています。変更してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0008',
	'I',
	'パスワードを変更しました。\nユーザID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0009',
	'I',
	'古いログインセッションが見つかりました。今回のログインで置き換えます。\nユーザID：{1}\n前回クライアント：{2}\n今回クライアント：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0010',
	'I',
	'ログアウトしました。\nユーザID：{1}\nシーケンス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0011',
	'W',
	'ログインセッションが無効です。一旦ログアウトしてから再度ログインしてください。\nユーザID：{1}\nシーケンス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0012',
	'E',
	'パスワード有効期限の設定が不正です。\nリソース：{1}#{2}={3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0013',
	'I',
	'パスワードの有効期限が近づいています。（残り{1}日）\nパスワードを変更しますか？');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0014',
	'E',
	'期限の設定が不正です。\n設定値：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0018',
	'I',
	'権限情報を取得しました。\n種類：{1}\nユーザ：{2} (属性：{3} / {4} / {5})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0019',
	'E',
	'規格に準じていないパスワード変更画面を表示しようとしました。\nパスワード変更画面は MCPasswordChangePanel を実装している必要があります。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0020',
	'W',
	'セッションがタイムアウトしました。一旦ログアウトしてから再度ログインしてください。\nユーザID：{1}\nシーケンス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0021',
	'T',
	'実行権限がありませんでした。\n機能：{1}.{2}.{3}\nACタイプ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0022',
	'T',
	'機能の実行にパスワードが必要です。\n機能：{1}.{2}.{3}\nACタイプ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0023',
	'W',
	'Privateタイプのオペレーションはリモートから実行できません。\nオペレーション：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0024',
	'W',
	'ライセンスまたは実行権限がないためオペレーションを実行できませんでした。\nオペレーション：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0025',
	'D',
	'権限一覧：\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0026',
	'I',
	'古いログインセッションが見つかりました。今回のログインで置き換えます。\n前回のログインクライアント：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0027',
	'W',
	'ユーザが無効になりました。ログアウトしてください。\nユーザID：{1}\nシーケンス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0028',
	'T',
	'機能の履歴をとります。\n機能：{1}.{2}.{3}\nACタイプ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0029',
	'W',
	'ログイン後処理中でエラーが発生したためログアウトしました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0030',
	'W',
	'サーバ処理で問題がありましたが、ログアウトを継続します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0031',
	'W',
	'ログアウト前処理で問題がありましたが、ログアウトを継続します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0032',
	'W',
	'ログアウト後処理で問題がありましたが、ログアウトを継続します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0033',
	'E',
	'指定されたログインリスナが見つかりません。\nキー：{1}\nクラス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0034',
	'W',
	'指定されたログアウトリスナが見つかりません。\nログアウトイベントは全て無効になりますが、ログアウト処理を継続します。\nキー：{1}\nクラス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0035',
	'E',
	'ランタイムライブラリの呼び出しに失敗しました。\n関数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0036',
	'W',
	'mcframeシングルサインオンの実行でエラーが発生しましたが処理は継続します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0037',
	'W',
	'パスワードは{1}文字以上で設定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0038',
	'W',
	'過去{1}回以内に設定したパスワードとは異なるパスワードを設定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0039',
	'W',
	'古いパスワードが一致しません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0040',
	'I',
	'ロケールを変更します。\nロケール：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0041',
	'E',
	'MCScreenに不正なログイン画面が登録されています。ログインできません。(画面ID {1}.{2})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0042',
	'E',
	'MCScreenに不正なログアウト画面が登録されています。ログアウトできません。(画面ID {1}.{2})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0043',
	'E',
	'MCScreenに不正な会社切替確認画面が登録されています。切替できません。(画面ID {1}.{2})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0044',
	'W',
	'ログアウトできません。\n強制終了しますか？');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0045',
	'W',
	'会社は切り替えられません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0046',
	'D',
	'NotificationLoginイベント開始\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0047',
	'D',
	'NotificationLoginイベント終了\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0048',
	'D',
	'ValidationLogoutイベント開始\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0049',
	'D',
	'ValidationLogoutイベント終了\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0050',
	'D',
	'NotificationLogoutイベント開始\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0051',
	'D',
	'NotificationLogoutイベント終了\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0052',
	'D',
	'登録されていないユーザを認証しようとしました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0053',
	'D',
	'無効なユーザを認証しようとしました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0054',
	'D',
	'発効日前にユーザを認証しようとしました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0055',
	'D',
	'失効日以降にユーザを認証しようとしました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0056',
	'D',
	'パスワードが一致しませんでした。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0057',
	'W',
	'有効なライセンスが割当てられていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0058',
	'W',
	'上限数に達しているためライセンスを使用できません。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0059',
	'F',
	'ライセンスが不正に使用されています。直ちに使用を中止してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0060',
	'F',
	'不正なライセンスが見つかりました。直ちに使用を中止してください。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0061',
	'W',
	'期限切れのライセンスに割当があります。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0062',
	'W',
	'登録できないライセンスが含まれています。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0063',
	'W',
	'ライセンスの有効期限が切れています。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0064' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0064',
	'W',
	'不正なライセンスです。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0065' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0065',
	'W',
	'このバージョンでは使用できないライセンスです。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0066' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0066',
	'W',
	'登録されていないユーザにライセンス手続きを行おうとしました。(ユーザID：{1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0067' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0067',
	'W',
	'未登録のライセンスに手続きを行おうとしました。(ライセンスID：{1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0068',
	'W',
	'異なる形態のライセンスが混在しています。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0070',
	'W',
	'登録済みのライセンス割当を再登録しようとしました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0071' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0071',
	'W',
	'未登録のライセンス割当を削除しようとしました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0072',
	'W',
	'未登録製品のライセンスは追加できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0073',
	'E',
	'LDAPサーバに接続できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0074',
	'E',
	'LDAPサーバとの入出力でエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0075' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0075',
	'E',
	'LDAPサーバで同じユーザ情報が複数見つかりました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0076' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0076',
	'W',
	'LDAPサーバから取得したユーザ情報にユーザIDが含まれていません。このユーザ情報を無視します。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0077' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0077',
	'W',
	'現在の認証モードではmcframeからパスワード変更はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0078' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0078',
	'E',
	'LDAPサーバからユーザを検索するためのバインド先が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0079' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0079',
	'E',
	'LDAPサーバからコンピュータを検索するためのバインド先が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0080' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0080',
	'I',
	'ユーザ認証モード({1}) 多重ログイン制御({2})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0081' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0081',
	'W',
	'Windowsドメインで管理されていないコンピュータからは処理できません。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0082' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0082',
	'E',
	'Windowsドメインで同じコンピュータ情報が複数見つかりました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0083' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0083',
	'W',
	'登録済みのライセンスが指定されました。現在の登録が維持されます。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0084' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0084',
	'W',
	'次の文字はユーザIDに使用することができません。\n {1}\nまた、以下のユーザIDは禁止されています。\n - 空または最低長未満のユーザID（最低長：{2}）\n - 全て空白文字のユーザID\n - 全てピリオド(.)のユーザID');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0085' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0085',
	'I',
	'{1}\n今回のログインで置き換えますか？\n(前回のログインは無効になります)');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0086' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0086',
	'W',
	'未登録のロケールがロケールリストに見つかりました。ロケールリストから除外します。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0087' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0087',
	'W',
	'バッチ認証モードではバッチ実行ユーザにバッチライセンスが必要です。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0088' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0088',
	'W',
	'ライセンスが不正に登録されています。直ちに使用を中止してください。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0089' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0089',
	'I',
	'LDAPサーバと接続しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0090' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0090',
	'I',
	'LDAPサーバと切断しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0091' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0091',
	'T',
	'実行ライセンスがありませんでした。\n機能：{1}.{2}.{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0092' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0092',
	'W',
	'子ロールIDが設定されていません。（ロール：{1}）');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0093' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0093',
	'W',
	'子ロールIDに数字以外の文字が含まれています。（ロール：{1} 子ロール：{2}）');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0095' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0095',
	'W',
	'LDAP環境プロパティに不正な設定が見つかりました。この設定を無視します。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0096' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0096',
	'W',
	'ライセンスの割当が更新されています。最新の状態で再度選択してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0097' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0097',
	'E',
	'MCScreenに不正なモジュール選択画面が登録されています。モジュール選択できません。(画面ID {1}.{2})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0098' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0098',
	'I',
	'表示中の画面を全てクローズして処理を続行します。\n未確定のデータは破棄されます。\nよろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0099' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0099',
	'W',
	'選択したモジュールに使用できないものがありました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0100',
	'E',
	'指定されたラベル取得リスナが見つかりません。\nキー：{1}\nクラス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0101',
	'E',
	'指定されたメッセージ取得リスナが見つかりません。\nキー：{1}\nクラス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0102',
	'E',
	'指定されたDBラベル取得リスナが見つかりません。\nキー：{1}\nクラス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0103',
	'E',
	'指定されたLogicラベル取得リスナが見つかりません。\nキー：{1}\nクラス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0104',
	'E',
	'指定されたReportラベル取得リスナが見つかりません。\nキー：{1}\nクラス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0105',
	'I',
	'通信処理が終わるまでお待ちください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0110' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0110',
	'E',
	'ラベル取得リスナで例外が発生しました。\nキー：{1}\nラベル：{2}\nロケール：{3}\n例外メッセージ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0111' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0111',
	'E',
	'メッセージ取得リスナで例外が発生しました。\nキー：{1}\nメッセージ：{2}\nロケール：{3}\n例外メッセージ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0112' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0112',
	'E',
	'DBラベル取得リスナで例外が発生しました。\nキー：{1}\nラベル：{2}\nロケール：{3}\n例外メッセージ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0113' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0113',
	'E',
	'Logicラベル取得リスナで例外が発生しました。\nキー：{1}\nラベル：{2}\nロケール：{3}\n例外メッセージ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0114' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0114',
	'E',
	'Reportラベル取得リスナで例外が発生しました。\nキー：{1}\nラベル：{2}\nロケール：{3}\n例外メッセージ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0115' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0115',
	'I',
	'ログアウトしますか？\n待機中の印刷がある場合は、印刷をキャンセルします。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0116' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0116',
	'I',
	'このmcframeを閉じますか？');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0117' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0117',
	'W',
	'サーバ処理で問題がありましたが、終了処理を継続します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0118' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0118',
	'W',
	'終了の前処理で問題がありましたが、処理を継続します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0119' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0119',
	'W',
	'終了の後処理で問題がありましたが、処理を継続します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0120' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0120',
	'E',
	'指定されたクライアント起動情報取得処理クラスが見つかりません。\nキー：{1}\nクラス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0121' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0121',
	'D',
	'TransferStartupInfo開始\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0122' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0122',
	'D',
	'TransferStartupInfo終了\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0123' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0123',
	'E',
	'ライセンスが不正に割当てられています。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0124' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0124',
	'I',
	'パスワードの有効期限が近づいています。（残り{1}日）');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0125' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0125',
	'W',
	'会社に所属していません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0126' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0126',
	'W',
	'指定された会社でログインする権限がありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0127' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0127',
	'E',
	'ユーザID解析に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0128' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0128',
	'E',
	'ユーザID解析用のインデックス指定が不正です。（{1}）');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0129' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0129',
	'E',
	'ユーザID解析プラグインが設定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0130' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0130',
	'E',
	'管理識別子が不正です。\n管理識別子：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0131' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0131',
	'E',
	'ユーザIDが不正です。\nユーザID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0132' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0132',
	'E',
	'管理先ユーザまたは管理識別子が不正です。\n管理先ユーザ：{1}\n管理識別子：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0133' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0133',
	'E',
	'MCFRAME管理方式の管理先が２つ以上設定されています。（{1}）');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0134' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0134',
	'W',
	'ユーザIDが無効かアクセストークンが不正です。\nユーザID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0135' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0135',
	'E',
	'不正なアクセストークンです。（{1}）');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0136' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0136',
	'E',
	'アクセストークンの有効期限が切れています。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0137' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0137',
	'E',
	'アクセストークンのユーザIDが一致しません。（{1}）');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0138' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0138',
	'E',
	'アクセストークンのシステムIDが一致しません。（{1}）');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0139' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0139',
	'E',
	'MCScreenに不正なSAML認証画面が登録されています。切替できません。(画面ID {1}.{2})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0140' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0140',
	'E',
	'SAML認証の設定が不正です。SPのURLが設定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0141' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0141',
	'E',
	'SAML認証でエラーが発生しました。\nメッセージ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0142' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0142',
	'E',
	'接続に失敗しました。\nURL:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0143' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0143',
	'D',
	'SAMLのログイン処理を実行します。\nURL：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0144' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0144',
	'W',
	'認証サーバに接続できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0145' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0145',
	'D',
	'SAMLのログアウト処理がキャンセルされました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0146' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0146',
	'T',
	'接続：{1}\nステータス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0147' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0147',
	'D',
	'SAMLのログアウト処理を実行します。\nURL:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0148' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0148',
	'D',
	'SAML認証に成功しました。\nユーザＩＤ:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0149' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0149',
	'E',
	'SAMLの認証情報を取得できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0150' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0150',
	'W',
	'外部認証に対応していないクライアントです。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0151' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0151',
	'E',
	'外部認証情報が未確認です。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0152' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0152',
	'E',
	'不正な外部認証モードです。（{1}）');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0153' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0153',
	'E',
	'外部認証情報が設定されていません。（{1}）');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0154' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0154',
	'E',
	'外部認証情報が無効です。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0155' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0155',
	'E',
	'外部認証の確認に失敗しました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0156' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0156',
	'D',
	'ログインレコードを登録します。\nユーザ：{1}\nアーキテクチャＣＤ：{2}\nクライアントＩＤ：{3}\nログイン時刻：{4}\nＲＯＷＩＤ：{5}\n接続種別：{6}\nログインシーケンス：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0157' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0157',
	'D',
	'ログイン履歴レコードを登録します。\nユーザ：{1}\nアーキテクチャＣＤ：{2}\nクライアントＩＤ：{3}\nログイン時刻：{4}\nＲＯＷＩＤ：{5}\n接続種別：{6}\nログインシーケンス：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0158' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0158',
	'W',
	'パスワードの変更禁止期間のため、パスワードを変更できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0159' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0159',
	'W',
	'英小文字を含むパスワードを設定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0160' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0160',
	'W',
	'英大文字を含むパスワードを設定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0161' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0161',
	'W',
	'数字を含むパスワードを設定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0162' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0162',
	'W',
	'以下のいずれかの記号を含むパスワードを設定してください。\n記号：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0163' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0163',
	'W',
	'英小文字、英大文字、数字、記号のうち、{1}種類以上を組み合わせたパスワードを設定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBHC0164' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBHC0164',
	'W',
	'パスワードに使用できない文字が含まれています。\n使用できない文字：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0001',
	'E',
	'jcom.dllが見つかりませんでした。\nExcel機能を使用する場合はjcom.dllをパスに設定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0002',
	'D',
	'ファイル出力を開始しました。\nファイル名={1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0003',
	'D',
	'ファイル出力が終了しました。\nファイル名={1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0004',
	'E',
	'セルに情報が設定できませんでした。\n項目名={1}\n行数={2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0005',
	'W',
	'ファイルを出力できませんでした。ファイルを確認してください。\n出力先={1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0006',
	'E',
	'ファイル出力ディレクトリへのアクセスに失敗しました。\nファイル名={1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0007',
	'E',
	'書き込みモードでのファイル起動に失敗しました。\nファイル名={1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0008',
	'E',
	'データ変換に失敗しました。\n項目名={1}\n行数={2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0009',
	'W',
	'ファイル入力に失敗しました。\nファイル名={1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0010',
	'D',
	'ファイル読込を開始しました。\nファイル名={1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0011',
	'D',
	'ファイル読込が終了しました。\nファイル名={1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0012',
	'W',
	'データを読み込めませんでした。ファイル内容を確認してください。\n空のファイルまたは一行目にデータのないファイルが選択された可能性があります。\nファイルの種類={1}\nファイル名={2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0013',
	'E',
	'マクロの実行に失敗しました。\nExcelのセキュリティに原因がある可能性があります。\n実行引数={1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0014',
	'W',
	'ファイルに空または不正な項目名が含まれています。\nファイルの種類={1}\nファイル名={2}\n行={3}\n項目名={4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0015',
	'W',
	'ファイルを正しく読み込めませんでした。\nCSVの書式が間違っている可能性があります。\nファイルの種類={1}\nファイル名={2}\n行={3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0016',
	'T',
	'ファイル出力を開始しました。\nファイル名={1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0017',
	'T',
	'ファイル出力が終了しました。\nファイル名={1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0018',
	'W',
	'ファイル名に使用できない文字が含まれています。\n使用できない文字： < > ? [ ] : | *\nファイル名={1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0019',
	'W',
	'半角218文字より長いファイルパスでは出力できません。\nファイルパス={1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0020',
	'E',
	'後処理に無効なクラス、メソッドが指定されました。\nクラス名:{1}\nメソッド名:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0021',
	'E',
	'クライアント印刷実行が失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0022',
	'E',
	'ファイル削除の期間指定(deletePeriod)に誤りがあります。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0023',
	'E',
	'印刷処理中に異常が発生したため、処理中断しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0024',
	'E',
	'サーバからの情報が設定されていません。\n項目名:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0025',
	'E',
	'印刷後処理の実行に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0026',
	'E',
	'帳票定義体が見つかりません。\nFILE:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0027',
	'E',
	'印刷用一時データファイルの準備に失敗しました。\nFILE:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0028',
	'W',
	'印刷用一時データファイルの削除に失敗しました。リトライします。\nFILE:{1}\nRETRY:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0029',
	'W',
	'印刷用一時データファイルの作成に失敗しました。リトライします。\nFILE:{1}\nRETRY:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0031',
	'E',
	'オプション記述ファイルが作成できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0032',
	'W',
	'帳票ツールの起動に失敗しました。\n帳票ID:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0033',
	'E',
	'ReportSetに該当するブロックが存在しません。\nRow:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0034',
	'E',
	'文字のエンコーディングがサポートされていません。\nEncode:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0035',
	'E',
	'ファイルが見つかりません。\nFILE:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0036',
	'E',
	'データ出力先のファイルがオープンされていません。\nFILE:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0037',
	'E',
	'ファイル出力に失敗しました。\nFILE:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0038',
	'E',
	'不正な印刷種類が指定されました。\nTYPE:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0039',
	'T',
	'ReportThread start');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0040',
	'T',
	'ReportThread end');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0041',
	'W',
	'Excelに出力可能な列数を超えています。\n列数={1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0042',
	'I',
	'待機中の印刷をキャンセルして処理を継続しますか？');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0043',
	'E',
	'ファイル出力時に、メタ情報を確定できませんでした。\n帳票ID:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0044',
	'E',
	'mcframe Reportが異常終了しました。\nリターンCD:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0045',
	'E',
	'無効なIndexが指定されました。\nIndex:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0046',
	'E',
	'印刷カートリッジクラスが生成できなかったため印刷できません。\n適切なカートリッジを選択するか、独自のカートリッジを実装してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0047',
	'D',
	'印刷カートリッジをインスタンス化しました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0048',
	'D',
	'指定された印刷カートリッジクラスを生成できなかったので、デフォルト・カートリッジを使用します。\n生成できないクラス:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0049',
	'I',
	'印刷アプリケーションに指定されたパスが設定されていないか、\n実行ファイルが存在しなかったため、印刷処理を中断しました。\n印刷アプリケーション:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0050',
	'E',
	'追加するRow(List)に対するブロック種別が指定されていません。\nRow:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0051',
	'I',
	'クライアント－サーバ印刷処理で、異なる印刷タイプが指定されました。\nTYPE:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0052',
	'W',
	'印刷対象の帳票フォームが存在しないため、印刷処理を中断しました。\n帳票フォーム:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0053',
	'I',
	'クライアント－サーバ印刷処理を実行しましたが、サーバ側からの印刷情報が設定されていませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0054',
	'E',
	'データファイルの重複が{1}件を超えたため中断します。\nRequestNo:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0055',
	'E',
	'マクロの挿入に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0056',
	'E',
	'ファイル名が指定されていないため、処理を中断しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0057',
	'E',
	'マクロの実行に失敗しました。\n実行引数={1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0058',
	'W',
	'印刷部数が指定されましたが、適正な値ではないので部数は指定されませんでした。\n部数:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0059',
	'E',
	'出力に必要なファイルが設定されていません。\nファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0060',
	'E',
	'出力に必要なファイルが見つかりません。\nファイル：{1}\nファイルパス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0061',
	'E',
	'Excelの起動に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0062',
	'E',
	'Excelファイルを開くことができませんでした。\nファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0063',
	'E',
	'ExcelファイルをCSVファイルに変換できませんでした。\n実行引数={1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0064' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0064',
	'E',
	'新規ワークブックを作成できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0065' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0065',
	'E',
	'ワークブック名を取得できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0066' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0066',
	'E',
	'ファイルを保存できませんでした。\n実行引数={1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0068',
	'E',
	'ファイル作成用VBAを実行中にエラーが発生したためファイルを出力できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0069',
	'E',
	'フォーマットファイルの読み込みに失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0070',
	'E',
	'ワークシートを取得できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0071' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0071',
	'E',
	'Worksheetsを取得できませんでした');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0072',
	'E',
	'指定されたシートが見つかりません。\nファイル：{1}\nシート：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0073',
	'D',
	'帳票フォーム検索\n帳票ID：{1}\nバージョン:{2}\nロケール：{3}\n検索されたフォーム名：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0074',
	'E',
	'シートの追加ができませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0075' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0075',
	'E',
	'読込先のReportSetが設定されていないので、読込処理を中断しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0076' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0076',
	'E',
	'読込先のコンテナのカラム順が、読込データと異なるため、処理を中断します。\n行数：{1}\nコンテナクラス名：{2}\nコンテナのカラム名：{3}\nデータの項目名：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0077' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0077',
	'E',
	'指定されたディレクトリが存在しません。\nディレクトリ:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0078' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0078',
	'E',
	'印刷情報にデータファイルが設定されていませんでした。\n帳票ID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0079' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0079',
	'E',
	'指定されたフォームファイルが存在しません.\nファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0080' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0080',
	'I',
	'カートリッジ名称「{1}」が設定されていないため、デフォルトの値を使用します。\n設定キー:{2}\nデフォルト値:{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0081' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0081',
	'W',
	'指定されたインターフェースファイルディレクトリは不正なパスです。\n環境設定画面で正しいパスを指定してください。\nディレクトリ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0082' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0082',
	'W',
	'指定された帳票データディレクトリは不正なパスです。\n環境設定画面で正しいパスを指定してください。\nディレクトリ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0083' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0083',
	'W',
	'指定されたプリンタIDに対するプリンタ名が設定されていません。\n環境設定画面で正しいプリンタ名を指定してください。\nプリンタID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0084' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0084',
	'I',
	'印刷処理に、空の帳票コンテナが指定されましたが、処理は続行します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0085' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0085',
	'E',
	'Excelの印刷処理の実行に失敗しました。\n帳票ＩＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0086' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0086',
	'E',
	'Excelの印刷処理が中断されました。\n帳票ＩＤ：{1}\nプリンタＩＤ：{2}\n部数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0087' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0087',
	'E',
	'ファイル読込処理の初期化処理に失敗しました。\nファイル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0088' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0088',
	'E',
	'ファイル読込処理の後処理に失敗しました。\nファイル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0089' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0089',
	'E',
	'ファイル読込処理の行読込処理に失敗しました。\nファイル名：{1}\n行番号：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0090' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0090',
	'E',
	'ファイル読込処理のコンテナ化に失敗しました。\nファイル名：{1}\n行番号：{2}\n項目番号：{3}\n項目名：{4}\n値：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0091' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0091',
	'I',
	'ファイルクローズ処理に失敗しましたが、処理は続行します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0092' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0092',
	'E',
	'ファイル出力処理の初期化処理に失敗しました。\nファイル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0093' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0093',
	'E',
	'ファイル出力処理の後処理に失敗しました。\nファイル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0094' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0094',
	'E',
	'ファイル出力処理の行書込処理に失敗しました。\nファイル名：{1}\n行番号：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0095' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0095',
	'E',
	'ファイル出力処理のデータ取得に失敗しました。\nファイル名：{1}\n行番号：{2}\n項目番号：{3}\n項目名：{4}\n値：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0096' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0096',
	'I',
	'印刷済みデータから再印刷を実行しようとしましたが、該当の印刷データが存在しませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0097' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0097',
	'W',
	'印刷対象データが0件であるため、印刷実行が中断されました。\n帳票ＩＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0098' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0098',
	'T',
	'印刷マスタの情報を適用します。\n値：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0099' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0099',
	'W',
	'クライアント印刷の情報が見つかりませんでした。印刷マスタを確認してください。\n帳票ＩＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0100',
	'I',
	'サーバ印刷処理をリクエストしました。\n帳票ＩＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0101',
	'E',
	'帳票サーバ側のPDFファイルパスが取得できなかったため、処理を中断します。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0102',
	'E',
	'PDFファイルの起動に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0103',
	'E',
	'このカートリッジでは、クライアント側でデータファイル作成はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0104',
	'W',
	'印刷データファイルの出力に失敗したため、印刷データ登録は行われません。\n帳票ＩＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0105',
	'I',
	'印刷データを登録しました。\n帳票ＩＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0106',
	'W',
	'ファイル入力可能な行数を超えたため、全てのデータを入力できませんでした。\n最大行数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0107' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0107',
	'E',
	'Web/Clientの印刷処理に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0108' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0108',
	'W',
	'Web/Clientの印刷処理がタイムアウトしました。\n印刷データ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0109' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0109',
	'E',
	'待機中の印刷処理実行時にエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0110' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0110',
	'W',
	'項目名にブロック名が付加されていない、または使用できないブロック名が付加されています。\n項目名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0111' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0111',
	'E',
	'Web Direct Printの印刷処理に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBIC0112' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBIC0112',
	'W',
	'Web Direct Printの印刷処理がタイムアウトしました。\n印刷データ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0001',
	'W',
	'メッセージIDが見つかりません。\nメッセージID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0002',
	'W',
	'メッセージIDに指定されているレベルが不正です。\nメッセージID：{1}\nメッセージ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0003',
	'W',
	'メッセージIDに指定されているレベルが不正です。\nメッセージID：{1}\nメッセージレベル：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0004',
	'W',
	'ログファイルローテーション間隔が未設定です。\nログファイルローテーションは行いません。\nログ種別：{1}\nファイル名：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0005',
	'W',
	'ログファイルローテーションの設定が不正です。\nログファイルローテーションは行いません。\nログ種別：{1}\nローテーション設定：{2}\nファイル名：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0006',
	'W',
	'ログファイルバックアップの履歴数が未設定です。\nログファイルのバックアップ履歴は残りません。\nログ種別：{1}\nファイル名：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0007',
	'W',
	'ログファイルのエンコード設定が不正か現在のJava環境で使用できないエンコードが設定されています。\n代わりにOSのエンコードを使用します。\n指定されたエンコード：{1}\nファイル名：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0008',
	'W',
	'ログファイルをオープンできませんでした。\nファイル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0009',
	'W',
	'古いバックアップログファイルの削除に失敗しました。\nログファイルのローテーションはできませんでした。\n現在のログファイルに追記されます。\n削除できなかったファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0010',
	'W',
	'バックアップログファイルのリネームに失敗しました。\nログファイルのローテーションはできませんでした。\n現在のログファイルに追記されます。\nリネームできなかったファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0011',
	'W',
	'メッセージレベルの解析に失敗しました。\n不正なメッセージレベルの短縮文字が指定されました。\n短縮文字：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0013',
	'W',
	'スタックトレース用のログレベル設定が不正です。代替レベルで出力します。\n代替レベル：{1}\nメッセージID：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0014',
	'W',
	'ログの書き込みに失敗しました。\nファイル名：{1}\nログ：\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0015',
	'W',
	'ログファイルをクローズできませんでした。\nファイル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0016',
	'D',
	'リソースを読み込みました。({1})\n入力元：\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0017',
	'F',
	'リソースファイルの解析エンジンでエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0018',
	'F',
	'リソースファイルの読み込みでI/Oエラーが発生しました。ファイルを確認してください。\nファイル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0019',
	'F',
	'リソースファイルの解析でエラーが発生しました。ファイルを確認してください。\nファイル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0020',
	'W',
	'リソースファイル解析でXML解析仕様エラーが発生しました。処理は継続します。\nメッセージ：{1}\nファイル名：{2}\n行：{3}\nカラム：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0021',
	'F',
	'フレームワークのデフォルトリソースファイルが見つかりませんでした。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0022',
	'F',
	'プロジェクトパスファイル(ProjectPath.xml)が見つかりませんでした。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0023',
	'F',
	'モジュールパスファイル(ModulePath.xml)が見つかりませんでした。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0024',
	'F',
	'リソースファイルの読み込みでエラーが発生しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0025',
	'E',
	'数値のリソースに数値に変換できない値が設定されています。MCNumberに変換できませんでした。({1}#{2})\nリソース値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0026',
	'E',
	'整数値のリソースに整数値に変換できない値が設定されています。intに変換できませんでした。({1}#{2})\nリソース値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0027',
	'E',
	'読み取り専用のリソースに値を保存しようとしました。({1}#{2})\nリソース値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0028',
	'E',
	'システム例外が発生しました。\n内容：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0029',
	'E',
	'メッセージも原因の例外も指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0030',
	'T',
	'リソース：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0031',
	'E',
	'アイコンに変換できないリソース値をIconとして取得しようとしました。\nリソースキー：{1}\nリソース値：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0032',
	'E',
	'色情報に変換できないリソース値を色情報として取得しようとしました。\nリソースキー：{1}\nリソース値：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0033',
	'E',
	'Dimension値に変換できないリソース値をDimension値として取得しようとしました。\nリソースキー：{1}\nリソース値：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0034',
	'E',
	'クラスに変換できないリソース値をクラスとして取得しようとしました。\nリソースキー：{1}\nリソース値：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0035',
	'E',
	'期間を指定するリソースの設定値の書式が正しくありません。({1}#{2})\nリソース値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0036',
	'E',
	'リソースファイルの書き込みでエラーが発生しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0037',
	'E',
	'リソースファイルの書き込みでサポートしないエンコードが指定されました。\nエンコード：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0038',
	'D',
	'リソースを書き込みました。({1})\n出力先：\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0039',
	'D',
	'リソース読み込みトレース\n[ {1} ]\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0040',
	'D',
	'リソース書き込みトレース\n[ {1} ]\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0041',
	'E',
	'インクルードリソースファイルが見つかりませんでした。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0043',
	'T',
	'リソースを取得しました。({1}#{2})\n値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0044',
	'T',
	'リソースを設定しました。({1}#{2})\n値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0045',
	'T',
	'リソース値がないため代替値を採用しました。({1}#{2})\n代替値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0047',
	'I',
	'ログインユーザのリソースを読み込みます。\nユーザID：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0048',
	'E',
	'オペレーションの設定が不正です。({1})\nキー：{2}\n値：{3}\nキー：{4}\n値：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0049',
	'E',
	'オペレーションの設定が不正です。({1}#{2})\n値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0050',
	'E',
	'１文字のリソースに文字に変換できない値または文字列が設定されています。charに変換できませんでした。({1}#{2})\nリソース値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0051',
	'E',
	'フォントに変換できないリソース値をフォントとして取得しようとしました。\nリソースキー：{1}\nリソース値：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0052',
	'E',
	'キーが未指定なためリソース値を設定できません。({1}#{2})\nリソース値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0053',
	'E',
	'リソースファイルの書き込みに失敗しました。ファイルが開けませんでした。\nファイル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0054',
	'E',
	'リソースファイルの書き込みで入出力エラーが発生しました。正しく書き込めなかった可能性があります。\nファイル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0055',
	'E',
	'リソースファイルの保存先が見つかりませんでした。\nリソース：{1}\nパス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0056',
	'E',
	'リソースのバインド変数が循環参照されています。リソースの設定を見直し再起動してください。({1}#{2})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0057',
	'E',
	'指定されたアイコンが見つかりませんでした。({1}#{2})\nアイコン：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0058',
	'E',
	'リソースが見つかりませんでした。({1}#{2})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0059',
	'E',
	'プラグインにオーダー指定されているキーが見つかりません。({1}#{2})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0060',
	'E',
	'フォントに変換できない値が指定されました。\n値：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0061',
	'E',
	'色に変換できない値が指定されました。\n値：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0062',
	'W',
	'パーソナライズデータのインポートに失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0063',
	'W',
	'インポートするキーが不正です。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0064' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0064',
	'I',
	'パーソナライズデータをインポートしました。{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0065' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0065',
	'I',
	'パーソナライズデータをエクスポートしました。{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0066' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0066',
	'E',
	'定数に存在しない値が設定されました。\n存在しない値：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0067' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0067',
	'W',
	'統合リソースファイルが見つかりませんでした。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0068',
	'I',
	'統合リソースファイルの代わりに分割リソースファイルを読み込みます。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0069',
	'I',
	'指定されたログファイルが見つかりません。\nログファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0070',
	'W',
	'ログファイルの読込に失敗しました。\nログファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0071' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0071',
	'W',
	'読込上限数を超えたため、ログファイルの読み込みを中断します。\nログファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0072',
	'I',
	'指定されたディレクトリパスが存在しません。\nディレクトリ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0073',
	'I',
	'ログファイルのパスが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0074',
	'I',
	'ディレクトリパスが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0075' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0075',
	'I',
	'指定されたディレクトリパスには、対象ユーザのログファイルは存在しませんでした。\nディレクトリ：{1}\nユーザ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0076' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0076',
	'I',
	'ログファイル名の設定が取得できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0077' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0077',
	'W',
	'ログファイル名にユーザ名が設定されていないため、解析を中断しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0078' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0078',
	'W',
	'パーソナライズデータの取得でエラーが発生しました。\n一部のパーソナライズデータが反映されていない可能性があります。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0079' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0079',
	'W',
	'指定されたパスは、ログファイルではありません。\nパス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0080' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0080',
	'I',
	'{1}行目の読込でエラーが発生しましたが、処理続行します。\nエラー内容：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0081' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0081',
	'W',
	'クライアントが複数起動しているため、設定情報を保存できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0082' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0082',
	'W',
	'最大桁数を越えたリソース値を設定しようとしました。({1}#{2})\nリソース値桁数：{3}\n最大桁数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBJC0083' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBJC0083',
	'W',
	'更新対象が、他の処理によって更新されています。\n再ログインしてください。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBKC0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBKC0001',
	'E',
	'Webサービスコンテナの行ステータスが変換できませんでした。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBKC0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBKC0002',
	'E',
	'Webサービスデータ変換のためのクラスが見つかりませんでした。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC0001',
	'W',
	'ファイルが見つかりません。\nファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC0002',
	'W',
	'{1}シートが見つかりません。\nブック：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC0003',
	'W',
	'エクセルブックではありません。\nファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC0004',
	'I',
	'フォルダを作成しませんでした。\nフォルダ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC0005',
	'W',
	'フォルダを作成できませんでした。\nフォルダ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC0006',
	'W',
	'ファイルが開けませんでした。\nファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC0007',
	'E',
	'.xlsxファイルの解析エンジンでエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC0008',
	'E',
	'.xlsxファイルの読み込みでI/Oエラーが発生しました。ファイルを確認してください。\nファイル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC0009',
	'E',
	'.xlsxファイルの解析でエラーが発生しました。ファイルを確認してください。\nファイル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC1001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC1001',
	'W',
	'描画に必要なカラム数が、最大カラム数を超えました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC1002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC1002',
	'W',
	'{1}ヘッダ情報に以下が不足しています。\n不足：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC2001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC2001',
	'W',
	'既存ファイルを削除できないため上書きができませんでした。ファイルを確認してください。\nファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC2002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC2002',
	'E',
	'フォームファイルの読み込み処理でエラーが発生しました。\nファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC2003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC2003',
	'E',
	'ファイル作成処理でエラーが発生しました。\nデータファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC2004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC2004',
	'W',
	'全てのデータを出力することができませんでした。\n出力可能行数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC2005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC2005',
	'I',
	'改ページ処理が中断していますが処理を続けます。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC2006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC2006',
	'W',
	'ファイルを保存できませんでした。\nファイル：{1}\n形式：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC2007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC2007',
	'W',
	'印刷処理を実行できませんでした。\n部数：{1}\nプレビュー：{2}\nプリンタ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC2008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC2008',
	'W',
	'印刷対象データが0件であるため、印刷実行が中断されました。\nデータファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC2009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC2009',
	'W',
	'帳票フォームのパスワードが一致しないため、印刷実行が中断されました。\n帳票フォームファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC3001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC3001',
	'W',
	'ファイル・コンテナ間の入出力対象カラムを特定することができませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC3002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC3002',
	'W',
	'処理対象のカラムがファイルに存在しません。\nカラム名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC3003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC3003',
	'W',
	'ファイル読み込み時に値が解析できませんでした。\n行数：{1}\nカラム名：{2}\nカラム値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC3004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC3004',
	'W',
	'ファイル書き込み時に値が解析できませんでした。\n行数：{1}\nカラム名：{2}\nカラム値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC3005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC3005',
	'W',
	'ファイルを保存することができませんでした。\nファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBLC3006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBLC3006',
	'W',
	'ファイル読み込み時に値が解析できませんでした。\nセルの値に数式を利用している可能性があります。\n現在のファイル入力設定では、数式を利用したセルを含んだファイル読み込みはできません。\n設定を確認してください。\n行数：{1}\nカラム名：{2}\nカラム値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBMC0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBMC0001',
	'E',
	'コンシューマ定義が設定されていません。\nリソース：MCPlugin\nキー：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBMC0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBMC0002',
	'E',
	'メッセージキュー監視スレッド実行中にエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBMC0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBMC0003',
	'I',
	'コンシューマを実行します。\nメッセージキューＩＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBMC0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBMC0004',
	'I',
	'コンシューマが正常終了しました。\nメッセージキューＩＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBMC0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBMC0005',
	'W',
	'コンシューマが異常終了しました。\nメッセージキューＩＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCBMC0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCBMC0006',
	'E',
	'コンシューマの処理中にエラーが発生しました。\nメッセージキューＩＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCUCC0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCUCC0001',
	'E',
	'XMLファイル[{1}]が存在しません。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCUCC0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCUCC0002',
	'E',
	'XMLファイル[{1}]の読込に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCUCC0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCUCC0003',
	'E',
	'XMLファイル[{1}]の作成に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'FCUCC0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCUCC0005',
	'E',
	'不正なURIを変換しようとしました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCUCC0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCUCC0006',
	'E',
	'不正なURLを変換しようとしました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCUCC0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCUCC0007',
	'E',
	'不正なFileを変換しようとしました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCUCC0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCUCC0008',
	'E',
	'コピー元ファイルが見つかりません。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCUCC0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCUCC0009',
	'E',
	'コピー先ファイルが作成できません。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCUCC0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCUCC0010',
	'E',
	'コピー中に入出力でエラーが発生しました。({1} > {2})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCUCC0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCUCC0011',
	'E',
	'ディレクトリが作成できませんでした。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCUCC0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCUCC0012',
	'E',
	'未サポートの文字セットが指定されました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCUCC0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCUCC0013',
	'E',
	'ファイルが見つからないか他の理由で開くことができませんでした。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCUCC0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCUCC0014',
	'E',
	'ファイルの読込みでエラーが発生しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCUCC0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCUCC0015',
	'E',
	'ファイルの書込みでエラーが発生しました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCUCC0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCUCC0016',
	'E',
	'コピー元がディレクトリではありません。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCUCC0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCUCC0017',
	'E',
	'ディレクトリのコピー先にファイルが指定されました。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCUCC0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCUCC0018',
	'E',
	'ディレクトリが削除できませんでした。({1})');
DELETE FROM FCT_MSG WHERE MSGID = 'FCUCC0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCUCC0019',
	'E',
	'次の引数は必須です。\nメソッド：{1}\n引数 ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'FCUCC0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'FCUCC0020',
	'E',
	'リソースの設定値が不正です。\nリソース：{1}\nキー：{2}\n値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'C_SQL001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'C_SQL001',
	'D',
	'Analyzing SQL\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'C_SQL002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'C_SQL002',
	'D',
	'Generated execute SQL\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'C_SQL003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'C_SQL003',
	'D',
	'Binding\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'C_SQL004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'C_SQL004',
	'D',
	'No Binding');
