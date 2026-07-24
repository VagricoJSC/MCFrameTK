package mcframe.commonPF.notice;

public class PF_Msg_MC_A {
	/** LEVEL[W]<br>{1}<p>
	 */
	public static String PFBAL0001 = "PFBAL0001";

	/** LEVEL[W]<br>ＳＡＰのAPI呼び出しでエラーが発生しました。<br>仕訳送信ＩＦ確認画面でエラーメッセージを確認してください。<br>データＮＯ：{1}<p>
	 */
	public static String PFBAL0002 = "PFBAL0002";

	/** LEVEL[I]<br>ＳＡＰのAPI呼び出しが終了しました。メッセージがあります。<br>仕訳送信ＩＦ確認画面でメッセージを確認してください。<br>データＮＯ：{1}<p>
	 */
	public static String PFBAL0003 = "PFBAL0003";

	/** LEVEL[I]<br>処理を開始します。（GA連携バッチ受信実行）<p>
	 */
	public static String PFBBL0001 = "PFBBL0001";

	/** LEVEL[I]<br>処理を終了しました。（GA連携バッチ受信実行）<p>
	 */
	public static String PFBBL0002 = "PFBBL0002";

	/** LEVEL[W]<br>会計関連のＩＦ処理区分を指定してください。<br>ＩＦ処理区分：{1}<p>
	 */
	public static String PFBBL0003 = "PFBBL0003";

	/** LEVEL[W]<br>外部システムマスタでＷｅｂ　ＡＰＩフラグがオンである外部システムＣＤを指定してください。<br>外部システムＣＤ：{1}<p>
	 */
	public static String PFBBL0004 = "PFBBL0004";

	/** LEVEL[W]<br>GA受信実行で有効なＩＦ処理区分が指定されていません。<br>ＩＦ処理区分：{1}<p>
	 */
	public static String PFBBL0005 = "PFBBL0005";

	/** LEVEL[W]<br>ＩＦ制御区分の設定を取得できませんでした。<br>ＩＦ通信ルールマスタの設定を確認してください。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<br>ＩＦ制御区分：{3}<p>
	 */
	public static String PFBBL0006 = "PFBBL0006";

	/** LEVEL[W]<br>Ｗｅｂ　ＡＰＩオペレーションが取得できませんでした。<br>ＩＦアダプタマスタの設定を確認してください。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<p>
	 */
	public static String PFBBL0007 = "PFBBL0007";

	/** LEVEL[W]<br>ＧＡのAPI呼び出しでエラーが発生しました。ＧＡのエラーメッセージを確認してください。<br>{1}<p>
	 */
	public static String PFBBL0008 = "PFBBL0008";

	/** LEVEL[W]<br>ＧＡのAPI呼び出しで例外エラーが発生しました。<br>{1}<p>
	 */
	public static String PFBBL0009 = "PFBBL0009";

	/** LEVEL[W]<br>GAに接続するためのユーザ情報が取得できませんでした。<br>外部システムユーザマスタの設定を確認してください。<br>外部システムＣＤ：{1}<p>
	 */
	public static String PFBBL0010 = "PFBBL0010";

	/** LEVEL[W]<br>ＧＡのAPI呼び出しでエラーが発生しました。<br>売上伝票送信ＩＦ確認画面でエラーメッセージを確認してください。<br>データＮＯ：{1}<br>売上伝票ＮＯ：{2}<br>インボイスＮＯ：{3}<br>売上実績ＮＯ：{4}<br>支給実績ＮＯ：{5}<p>
	 */
	public static String PFBBL0101 = "PFBBL0101";

	/** LEVEL[W]<br>{1}<p>
	 */
	public static String PFBBL0102 = "PFBBL0102";

	/** LEVEL[W]<br>ＧＡのAPI呼び出しでエラーが発生しました。<br>仕入伝票送信ＩＦ確認画面でエラーメッセージを確認してください。<br>データＮＯ：{1}<br>仕入伝票ＮＯ：{2}<br>受領インボイスＮＯ：{3}<br>受領インボイス管理ＮＯ：{4}<br>仕入実績ＮＯ：{5}<p>
	 */
	public static String PFBBL0103 = "PFBBL0103";

	/** LEVEL[W]<br>複数の売上伝票をまとめて送信した際に他の伝票でエラーが発生したため、ＧＡに反映できませんでした。<br>売上伝票ＩＦ一覧照会画面から未反映の売上伝票を再送信してください。<br>データＮＯ：{1}<br>売上伝票ＮＯ：{2}<br>インボイスＮＯ：{3}<br>売上実績ＮＯ：{4}<br>支給実績ＮＯ：{5}<p>
	 */
	public static String PFBBL0104 = "PFBBL0104";

	/** LEVEL[W]<br>複数の仕入伝票をまとめて送信した際に他の伝票でエラーが発生したため、ＧＡに反映できませんでした。<br>仕入伝票ＩＦ一覧照会画面から未反映の仕入伝票を再送信してください。<br>データＮＯ：{1}<br>仕入伝票ＮＯ：{2}<br>受領インボイスＮＯ：{3}<br>受領インボイス管理ＮＯ：{4}<br>仕入実績ＮＯ：{5}<p>
	 */
	public static String PFBBL0105 = "PFBBL0105";

	/** LEVEL[W]<br>必須のコマンド引数が取得できませんでした。<br>ＩＦ通信ルールマスタを確認してください。<br>CMD_PATH：{1}<br>CMD_ARG01：{2}<br>CMD_ARG04：{3}<br>CMD_ARG05：{4}<br>CMD_ARG06：{5}<p>
	 */
	public static String PFBCL0001 = "PFBCL0001";

	/** LEVEL[W]<br>BI Linkバッチ制御テーブルをロックできませんでした。<br>処理を中断します。<br>ＩＦ処理区分：{1}<br>外部システムＣＤ：{2}<br>会社ＣＤ：{3}<p>
	 */
	public static String PFBCL0002 = "PFBCL0002";

	/** LEVEL[W]<br>BI Linkバッチ制御テーブルのロックを解除できませんでした。<br>送信ＩＦ実行確認画面でロックを解除してください。<br>ＩＦ処理区分：{1}<br>外部システムＣＤ：{2}<br>会社ＣＤ：{3}<p>
	 */
	public static String PFBCL0003 = "PFBCL0003";

	/** LEVEL[I]<br>変換処理を実行します。よろしいですか？<p>
	 */
	public static String PFBZP0001 = "PFBZP0001";

	/** LEVEL[I]<br>変換処理を実行しました。<p>
	 */
	public static String PFBZP0002 = "PFBZP0002";

	/** LEVEL[I]<br>変換対象が選択されていません。<p>
	 */
	public static String PFBZP0003 = "PFBZP0003";

	/** LEVEL[I]<br>更新処理を実行します。よろしいですか？<p>
	 */
	public static String PFBZP0004 = "PFBZP0004";

	/** LEVEL[I]<br>更新処理を実行しました。<p>
	 */
	public static String PFBZP0005 = "PFBZP0005";

	/** LEVEL[I]<br>更新対象が選択されていません。<p>
	 */
	public static String PFBZP0006 = "PFBZP0006";

	/** LEVEL[I]<br>変換・送信取消処理を実行します。よろしいですか？<p>
	 */
	public static String PFBZP0007 = "PFBZP0007";

	/** LEVEL[I]<br>変換・送信取消処理を実行しました。<p>
	 */
	public static String PFBZP0008 = "PFBZP0008";

	/** LEVEL[I]<br>変換・送信取消対象が選択されていません。<p>
	 */
	public static String PFBZP0009 = "PFBZP0009";

	/** LEVEL[W]<br>変換先が取得できませんでした。<br>ＩＦコード変換マスタの設定を確認してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>取引先ＣＤ：{4}<br>ＩＦ項目：{5}（{6}）<br>ＩＦ項目区分：{7}<br>自社用ＣＤ：{8}<br>相手先ＣＤ：{9}<p>
	 */
	public static String PFBZL0001 = "PFBZL0001";

	/** LEVEL[W]<br>インスタンスが生成できませんでした。<br>クラス：{1}<p>
	 */
	public static String PFBZL0002 = "PFBZL0002";

	/** LEVEL[W]<br>ファイルが存在しませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<p>
	 */
	public static String PFBZL0003 = "PFBZL0003";

	/** LEVEL[W]<br>送信対象のデータが存在しませんでした。<br>テーブル名：{1}<p>
	 */
	public static String PFBZL0004 = "PFBZL0004";

	/** LEVEL[W]<br>指定されたファイル形式は扱えません。<br>ＩＦ通信ルールマスタの設定を確認してください。<br>外部システムＣＤ：{1}<br>ＩＦ制御区分：{2}<br>内容（文字列）：{3}<p>
	 */
	public static String PFBZL0005 = "PFBZL0005";

	/** LEVEL[W]<br>コード変換の結果、項目定義に適合しない項目があります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>項目名：{3}（{4}）<br>値：{5}<p>
	 */
	public static String PFBZL0006 = "PFBZL0006";

	/** LEVEL[W]<br>変換先のコードが複数件取得されました。<br>ＩＦコード変換マスタの設定を確認してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>取引先ＣＤ：{4}<br>ＩＦ項目：{5}（{6}）<br>ＩＦ項目区分：{7}<br>自社用ＣＤ：{8}<br>相手先ＣＤ：{9}<p>
	 */
	public static String PFBZL0007 = "PFBZL0007";

	/** LEVEL[W]<br>ファイルの値が不正です。<br>ファイルパス：{1}<br>ファイル名：{2}<br>行番号：{3}<br>項目名：{4}（{5}）<br>書式：{6}<br>値：{7}<p>
	 */
	public static String PFBZL0008 = "PFBZL0008";

	/** LEVEL[W]<br>項目定義に適合しない値が指定されています。<br>ファイルパス：{1}<br>ファイル名：{2}<br>行番号：{3}<br>項目名：{4}（{5}）<br>値：{6}<p>
	 */
	public static String PFBZL0009 = "PFBZL0009";

	/** LEVEL[W]<br>NotNull制約の項目にNullが指定されています。<br>ファイルパス：{1}<br>ファイル名：{2}<br>行番号：{3}<br>項目名：{4}（{5}）<p>
	 */
	public static String PFBZL0010 = "PFBZL0010";

	/** LEVEL[W]<br>ファイルサイズが０バイトです。<br>ＩＦ処理区分：{1}<br>ファイルパス：{2}<br>ファイル名：{3}<p>
	 */
	public static String PFBZL0011 = "PFBZL0011";

	/** LEVEL[W]<br>変換対象のデータが存在しませんでした。<br>テーブル名：{1}<p>
	 */
	public static String PFBZL0012 = "PFBZL0012";

	/** LEVEL[W]<br>ファイル出力オペレーションが取得できませんでした。送信対象から除外します。<br>ＩＦ処理区分：{1}<br>外部システムＣＤ：{2}<br>データＮＯ：{3}<p>
	 */
	public static String PFBZL0013 = "PFBZL0013";

	/** LEVEL[W]<br>ＩＦ処理区分が不正です。送信対象から除外します。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<br>データＮＯ：{3}<p>
	 */
	public static String PFBZL0014 = "PFBZL0014";

	/** LEVEL[I]<br>送信変換処理を開始します。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<br>会社ＣＤ：{3}<br>コード変換オペレーション：{4}<br>ファイル入出力オペレーション：{5}<p>
	 */
	public static String PFBZL0015 = "PFBZL0015";

	/** LEVEL[I]<br>コード変換処理を開始します。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<br>コード変換オペレーション：{3}<p>
	 */
	public static String PFBZL0016 = "PFBZL0016";

	/** LEVEL[I]<br>コード変換対象がありませんでした。<p>
	 */
	public static String PFBZL0017 = "PFBZL0017";

	/** LEVEL[I]<br>コード変換処理が終了しました。<br>処理対象：{1}<br>変換件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String PFBZL0018 = "PFBZL0018";

	/** LEVEL[I]<br>送信変換対象がありませんでした。<p>
	 */
	public static String PFBZL0019 = "PFBZL0019";

	/** LEVEL[I]<br>送信変換処理が終了しました。<br>処理対象：{1}<br>作成件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String PFBZL0020 = "PFBZL0020";

	/** LEVEL[I]<br>受信変換処理を開始します。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<br>ローカルディレクトリ：{3}<br>ファイル転送ロック方式：{4}<p>
	 */
	public static String PFBZL0021 = "PFBZL0021";

	/** LEVEL[I]<br>受信変換対象がありませんでした。以下の可能性があります。<br>・対象ファイルが存在しない<br>・IF通信ルールマスタのLOCAL_DIRの指定が間違っている<p>
	 */
	public static String PFBZL0022 = "PFBZL0022";

	/** LEVEL[I]<br>受信変換処理が終了しました。<br>処理対象：{1}<br>取込件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String PFBZL0023 = "PFBZL0023";

	/** LEVEL[I]<br>受信ファイル名：{1}<p>
	 */
	public static String PFBZL0024 = "PFBZL0024";

	/** LEVEL[I]<br>データ取込処理を実行しました。<br>取込処理オペレーション：{1}<p>
	 */
	public static String PFBZL0025 = "PFBZL0025";

	/** LEVEL[W]<br>データ取込処理の実行に失敗しました。<br>取込処理オペレーション：{1}<p>
	 */
	public static String PFBZL0026 = "PFBZL0026";

	/** LEVEL[W]<br>実行に必要なライセンスが割り当てられていないため、データ取込処理の実行をスキップしました。<br>取込処理オペレーション：{1}<p>
	 */
	public static String PFBZL0027 = "PFBZL0027";

	/** LEVEL[W]<br>ファイル受信に必要なＦＴＰ情報が設定されていません。<br>ＩＦ通信ルールマスタの設定を確認してください。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<br>送信先ＤＩＲ：{3}<br>ホスト：{4}<br>ユーザ：{5}<br>パスワード：{6}<p>
	 */
	public static String PFBZL0028 = "PFBZL0028";

	/** LEVEL[I]<br>ファイル送信処理を開始します。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<br>送信区分：{3}<br>ローカルディレクトリ：{4}<br>送信先ディレクトリ：{5}<br>ホスト名：{6}<br>ユーザ名：{7}<br>オプション：{8}<p>
	 */
	public static String PFBZL0029 = "PFBZL0029";

	/** LEVEL[I]<br>ファイル送信対象がありませんでした。<p>
	 */
	public static String PFBZL0030 = "PFBZL0030";

	/** LEVEL[I]<br>ファイル送信処理が終了しました。<br>送信対象：{1}<br>送信件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String PFBZL0031 = "PFBZL0031";

	/** LEVEL[I]<br>送信ファイル名：{1}<p>
	 */
	public static String PFBZL0032 = "PFBZL0032";

	/** LEVEL[I]<br>受信ファイル名：{1}<p>
	 */
	public static String PFBZL0033 = "PFBZL0033";

	/** LEVEL[W]<br>送信に失敗しました。{1} 秒後にリトライします。<br>リトライ回数：{2}/{3}<p>
	 */
	public static String PFBZL0034 = "PFBZL0034";

	/** LEVEL[I]<br>ファイル受信処理を開始します。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<br>受信区分：{3}<br>ローカルディレクトリ：{4}<br>受信元ディレクトリ：{5}<br>ホスト名：{6}<br>ユーザ名：{7}<br>転送タイプ：{8}<br>オプション：{9}<p>
	 */
	public static String PFBZL0035 = "PFBZL0035";

	/** LEVEL[I]<br>ファイル受信対象がありませんでした。<p>
	 */
	public static String PFBZL0036 = "PFBZL0036";

	/** LEVEL[I]<br>ファイル受信処理が終了しました。<br>受信対象：{1}<br>受信件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String PFBZL0037 = "PFBZL0037";

	/** LEVEL[W]<br>サーバからファイルが取得できませんでした。<br>ホスト名：{1}<br>受信区分：{2}<br>ユーザ：{3}<br>サーバパス：{4}<br>ファイル名：{5}<br>ＩＦ処理区分：{6}<p>
	 */
	public static String PFBZL0038 = "PFBZL0038";

	/** LEVEL[I]<br>{1}<p>
	 */
	public static String PFBZL0039 = "PFBZL0039";

	/** LEVEL[I]<br>処理を開始します。（送信変換バッチ）<p>
	 */
	public static String PFBZL0040 = "PFBZL0040";

	/** LEVEL[I]<br>処理を終了しました。（送信変換バッチ）<p>
	 */
	public static String PFBZL0041 = "PFBZL0041";

	/** LEVEL[I]<br>処理を開始します。（ファイル送信バッチ）<p>
	 */
	public static String PFBZL0042 = "PFBZL0042";

	/** LEVEL[I]<br>処理を終了しました。（ファイル送信バッチ）<p>
	 */
	public static String PFBZL0043 = "PFBZL0043";

	/** LEVEL[I]<br>処理を開始します。（ファイル受信バッチ）<p>
	 */
	public static String PFBZL0044 = "PFBZL0044";

	/** LEVEL[I]<br>処理を終了しました。（ファイル受信バッチ）<p>
	 */
	public static String PFBZL0045 = "PFBZL0045";

	/** LEVEL[I]<br>処理を開始します。（受信変換バッチ）<p>
	 */
	public static String PFBZL0046 = "PFBZL0046";

	/** LEVEL[I]<br>処理を終了しました。（受信変換バッチ）<p>
	 */
	public static String PFBZL0047 = "PFBZL0047";

	/** LEVEL[W]<br>処理対象のデータがありません。<p>
	 */
	public static String PFBZL0048 = "PFBZL0048";

	/** LEVEL[W]<br>更新対象のＥＳＢ連携テーブルの指定がありません。<br>定数定義：ＩＦ処理区分を確認してください。<p>
	 */
	public static String PFBZL0049 = "PFBZL0049";

	/** LEVEL[W]<br>更新対象のＥＳＢ連携テーブルが見つかりません。<br>定数定義：ＩＦ処理区分のを確認してください。<br>更新対象テーブル：{1}<p>
	 */
	public static String PFBZL0050 = "PFBZL0050";

	/** LEVEL[W]<br>ＩＦ処理区分が不正です。送信対象から除外します。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<p>
	 */
	public static String PFBZL0051 = "PFBZL0051";

	/** LEVEL[W]<br>外部システムＣＤが不正です。送信対象から除外します。<br>外部システムＣＤ：{1}<br>データＮＯ：{2}<p>
	 */
	public static String PFBZL0052 = "PFBZL0052";

	/** LEVEL[W]<br>ファイル送信に必要なＦＴＰ情報が設定されていません。<br>ＩＦ通信ルールマスタの設定を確認してください。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<br>ＩＦ制御区分：{3}<p>
	 */
	public static String PFBZL0053 = "PFBZL0053";

	/** LEVEL[W]<br>処理対象のＩＦ処理区分、外部システムＣＤが指定されていません。処理を中止します。<br>ＩＦ処理区分：{1}<br>外部システムＣＤ：{2}<p>
	 */
	public static String PFBZL0054 = "PFBZL0054";

	/** LEVEL[W]<br>ファイル送信に必要なＦＴＰ情報が設定されていません。<br>ＩＦ通信ルールマスタの設定を確認してください。<br>ＩＦ処理区分：{1}<br>外部システムＣＤ：{2}<br>ＩＦ制御区分：{3}<br><p>
	 */
	public static String PFBZL0055 = "PFBZL0055";

	/** LEVEL[W]<br>ＩＦ送受信制御テーブルの登録に失敗しました。<br>以下のファイルをtrashもしくはerrorフォルダからreadyに戻し、受信変換処理を再実行してください。<br>ファイル名：{1}<br>ファイルパス：{2}<p>
	 */
	public static String PFBZL0056 = "PFBZL0056";

	/** LEVEL[I]<br>---------- FTP PUT START ----------<p>
	 */
	public static String PFBZL0057 = "PFBZL0057";

	/** LEVEL[I]<br>---------- FTP PUT END   ----------<p>
	 */
	public static String PFBZL0058 = "PFBZL0058";

	/** LEVEL[I]<br>---------- FILE COPY START ----------<p>
	 */
	public static String PFBZL0059 = "PFBZL0059";

	/** LEVEL[I]<br>---------- FILE COPY END   ----------<p>
	 */
	public static String PFBZL0060 = "PFBZL0060";

	/** LEVEL[I]<br>待機中のスレッドに割込みが発生しました。（参考情報）<p>
	 */
	public static String PFBZL0061 = "PFBZL0061";

	/** LEVEL[W]<br>待機中のスレッドに割込みが発生しました。<br>安全のために処理を中断します。<p>
	 */
	public static String PFBZL0062 = "PFBZL0062";

	/** LEVEL[W]<br>ファイル送信方法が無効のため送信できません。送信対象から除外します。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<br>ファイル送信方法（ＩＦ制御区分のSEND_TYP）：{3}<p>
	 */
	public static String PFBZL0063 = "PFBZL0063";

	/** LEVEL[W]<br>送信先ディレクトリが指定されていません。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<p>
	 */
	public static String PFBZL0064 = "PFBZL0064";

	/** LEVEL[I]<br>送信変換処理を開始します。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<br>会社ＣＤ：{3}<br>コード変換オペレーション：{4}<br>ＷｅｂＡＰＩオペレーション：{5}<p>
	 */
	public static String PFBZL0065 = "PFBZL0065";

	/** LEVEL[I]<br>送信変換処理を開始します。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<br>会社ＣＤ：{3}<br>コード変換オペレーション：{4}<br>コマンド実行オペレーション：{5}<p>
	 */
	public static String PFBZL0066 = "PFBZL0066";

	/** LEVEL[I]<br>処理を開始します。（コマンド実行バッチ）<p>
	 */
	public static String PFBZL0067 = "PFBZL0067";

	/** LEVEL[I]<br>処理を終了しました。（コマンド実行バッチ）<p>
	 */
	public static String PFBZL0068 = "PFBZL0068";

	/** LEVEL[I]<br>コマンドは正常に終了しました。<br>ＩＦ処理区分：{1}<br>外部システムＣＤ：{2}<br>終了コード：{3}<p>
	 */
	public static String PFBZL0069 = "PFBZL0069";

	/** LEVEL[W]<br>コマンド実行中にエラーが発生しました。<br>ＩＦ処理区分：{1}<br>外部システムＣＤ：{2}<br>終了コード：{3}<br>内容：{4}<p>
	 */
	public static String PFBZL0070 = "PFBZL0070";

	/** LEVEL[I]<br>処理対象外である送受信状況区分のため、処理をスキップしました。<br>データＮＯ：{1}<p>
	 */
	public static String PFBZL0071 = "PFBZL0071";

	/** LEVEL[W]<br>ファイル受信に必要なＳＦＴＰ情報が設定されていません。<br>ＩＦ通信ルールマスタの設定を確認してください。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<br>送信先ＤＩＲ：{3}<br>ホスト：{4}<br>ユーザ：{5}<br>パスワード：{6}<br>秘密鍵ファイルパス：{7}<p>
	 */
	public static String PFBZL0072 = "PFBZL0072";

	/** LEVEL[W]<br>ファイル送信に必要なＳＦＴＰ情報が設定されていません。<br>ＩＦ通信ルールマスタの設定を確認してください。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<br>ＩＦ制御区分：{3}<p>
	 */
	public static String PFBZL0073 = "PFBZL0073";

	/** LEVEL[W]<br>パスワード認証方式の場合はパスワードを指定してください。<br>ＩＦ通信ルールマスタの設定を確認してください。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<br>ＩＦ制御区分：{3}<p>
	 */
	public static String PFBZL0074 = "PFBZL0074";

	/** LEVEL[W]<br>ファイル受信方法が無効のため受信できません。受信対象から除外します。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<br>ファイル受信方法（ＩＦ制御区分のRECV_TYP）：{3}<p>
	 */
	public static String PFBZL0075 = "PFBZL0075";

	/** LEVEL[I]<br>---------- SFTP PUT START ----------<p>
	 */
	public static String PFBZL0076 = "PFBZL0076";

	/** LEVEL[I]<br>---------- SFTP PUT END   ----------<p>
	 */
	public static String PFBZL0077 = "PFBZL0077";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>シノニムの参照先が見つかりませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<p>
	 */
	public static String PFBZL0078 = "PFBZL0078";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>マッピングの参照先が見つかりませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<p>
	 */
	public static String PFBZL0079 = "PFBZL0079";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>項目のデータ型とマッピングの参照先のデータ型が一致しませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<p>
	 */
	public static String PFBZL0080 = "PFBZL0080";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>項目名が重複しています。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<p>
	 */
	public static String PFBZL0081 = "PFBZL0081";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>制御項目の値が重複しています。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<p>
	 */
	public static String PFBZL0082 = "PFBZL0082";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>項目のデータ型とダミー値のデータ型が一致しませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<p>
	 */
	public static String PFBZL0083 = "PFBZL0083";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>キーに対して値が指定されていませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<p>
	 */
	public static String PFBZL0084 = "PFBZL0084";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>指定可能な値の範囲を超えて指定されています。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<br>値：{4}<p>
	 */
	public static String PFBZL0085 = "PFBZL0085";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>キーに対する値のデータ型が次の通りではありませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<br>データ型：{4}<p>
	 */
	public static String PFBZL0086 = "PFBZL0086";

	/** LEVEL[W]<br>固定長形式ファイルの送受信に必要な情報が設定されていません。<br>ＩＦ通信ルールマスタの設定を確認してください。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<br>ＩＦ制御区分：{3}<p>
	 */
	public static String PFBZL0087 = "PFBZL0087";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>指定可能な値と異なる値が指定されています。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<br>値：{4}<p>
	 */
	public static String PFBZL0088 = "PFBZL0088";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>キー：{5} と同じ値は指定できません。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<br>値：{4}<p>
	 */
	public static String PFBZL0089 = "PFBZL0089";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>次のキーに対する値の組み合わせは指定できません。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー1（{3}：{4}）<br>キー2（{5}：{6}）<p>
	 */
	public static String PFBZL0090 = "PFBZL0090";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>次のキーに対する値の組み合わせは指定できません。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー1（{3}：{4}）<br>キー2（{5}：{6}）<br>キー3（{7}：{8}）<p>
	 */
	public static String PFBZL0091 = "PFBZL0091";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>次のキーに対する値の組み合わせは指定できません。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー1（{3}：{4}）<br>キー2（{5}：{6}）<br>キー3（{7}：{8}）<br>キー4（{9}：{10}）<p>
	 */
	public static String PFBZL0092 = "PFBZL0092";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>制御項目の数とレコードの数が一致しませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<p>
	 */
	public static String PFBZL0093 = "PFBZL0093";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>キーに対する値は指定できません。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<p>
	 */
	public static String PFBZL0094 = "PFBZL0094";

	/** LEVEL[W]<br>ファイル入出力オペレーションが固定長形式に対応してません。<br>ＩＦ通信ルールマスタの設定を確認してください。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<p>
	 */
	public static String PFBZL0095 = "PFBZL0095";

	/** LEVEL[W]<br>文字のエンコーディングがサポートされていません。<br>Encode：{1}<p>
	 */
	public static String PFBZL0096 = "PFBZL0096";

	/** LEVEL[W]<br>ファイル出力できませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<p>
	 */
	public static String PFBZL0097 = "PFBZL0097";

	/** LEVEL[W]<br>指定のバイト数に値を変換できませんでした。<br>項目名：{1}<br>バイト数：{2}<br>値：{3}<br>埋め文字：{4}<p>
	 */
	public static String PFBZL0098 = "PFBZL0098";

	/** LEVEL[W]<br>属性項目の値として参照先の値は使用できません。<br>項目名：{1}<br>属性項目：参照先：値<br>{2}<p>
	 */
	public static String PFBZL0099 = "PFBZL0099";

	/** LEVEL[I]<br>ファイルクローズ処理に失敗しましたが、処理は続行します。<p>
	 */
	public static String PFBZL0100 = "PFBZL0100";

	/** LEVEL[W]<br>ファイルへデータを書き込みできませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<p>
	 */
	public static String PFBZL0101 = "PFBZL0101";

	/** LEVEL[W]<br>ファイルからデータを読み込みできませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<p>
	 */
	public static String PFBZL0102 = "PFBZL0102";

	/** LEVEL[W]<br>BOM付きのファイルとして扱う設定ですが、ファイルの先頭にBOMが検出されませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<p>
	 */
	public static String PFBZL0103 = "PFBZL0103";

	/** LEVEL[W]<br>読み込み対象の項目が定義されていません。<br>ディレクトリ：{1}<br>ファイル名：{2}<p>
	 */
	public static String PFBZL0104 = "PFBZL0104";

	/** LEVEL[W]<br>レコードの長さのデータを読み込む前に、EOFが検出されました。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>行番号：{3}<br>レコードの種類：{4}<p>
	 */
	public static String PFBZL0105 = "PFBZL0105";

	/** LEVEL[W]<br>出力ストリームにデータを書き込みできませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<p>
	 */
	public static String PFBZL0106 = "PFBZL0106";

	/** LEVEL[W]<br>ファイルから読み込んだ値が指定された値と一致しませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>レコード番号：{3}<br>項目名：{4}<br>読み込んだ値：{5}<br>指定された値：{6}<p>
	 */
	public static String PFBZL0107 = "PFBZL0107";

	/** LEVEL[W]<br>ファイルから読み込んだ値が計算値と一致しませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>レコード番号：{3}<br>項目名：{4}<br>読み込んだ値：{5}<br>計算値：{6}<br>計算方法：{7}<br>引数：{8}<p>
	 */
	public static String PFBZL0108 = "PFBZL0108";

	/** LEVEL[W]<br>制御項目の値に対応するレコードの定義がありませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>レコード番号：{3}<br>項目名：{4}<br>値：{5}<p>
	 */
	public static String PFBZL0109 = "PFBZL0109";

	/** LEVEL[W]<br>対応するheaderレコードが存在しません。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>レコード番号：{3}<p>
	 */
	public static String PFBZL0110 = "PFBZL0110";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>制御項目に対応する項目が定義されていません。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>項目名：{3}<p>
	 */
	public static String PFBZL0111 = "PFBZL0111";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>制御項目のデータ型は文字型を指定してください。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>項目名：{3}<br>キー：{4}<p>
	 */
	public static String PFBZL0112 = "PFBZL0112";

	/** LEVEL[W]<br>ファイルから読み込んだ値を指定されたデータ型に変換できませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>レコード番号：{3}<br>項目名：{4}<br>値：{5}<br>書式：{6}<p>
	 */
	public static String PFBZL0113 = "PFBZL0113";

	/** LEVEL[W]<br>ファイルから読み込んだ値を指定されたデータ型に変換できませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>レコード番号：{3}<br>項目名：{4}<br>値：{5}<p>
	 */
	public static String PFBZL0114 = "PFBZL0114";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>文字数が{5}以下の値を指定してください。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<br>値：{4}<p>
	 */
	public static String PFBZL0115 = "PFBZL0115";

	/** LEVEL[W]<br>対応するtrailerレコードが存在しません。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>レコード番号：{3}<p>
	 */
	public static String PFBZL0116 = "PFBZL0116";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>項目のデータ型とRowのデータ型が一致しませんでした。<br>項目名：{1}<p>
	 */
	public static String PFBZL0117 = "PFBZL0117";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<br>ディレクトリ：{3}<br>ファイル名：{4}<p>
	 */
	public static String PFBZL0118 = "PFBZL0118";

	/** LEVEL[W]<br>変換先が取得できませんでした。<br>ＩＦコード変換マスタの設定を確認してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>取引先ＣＤ：{4}<br>ＩＦ項目：{5}（{6}）<br>ＩＦ項目区分：{7}<br>自社用品目：{8}<br>相手先ＣＤ：{9}<br>相手先枝番１：{10}<br>相手先枝番２：{11}<br>相手先枝番３：{12}<br>自社用ＣＤ：{13}<br>自社用枝番１：{14}<br>自社用枝番２：{15}<br>自社用枝番３：{16}<p>
	 */
	public static String PFBZL0501 = "PFBZL0501";

	/** LEVEL[W]<br>変換先のコードが複数件取得されました。<br>ＩＦコード変換マスタの設定を確認してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>取引先ＣＤ：{4}<br>ＩＦ項目：{5}（{6}）<br>ＩＦ項目区分：{7}<br>自社用品目：{8}<br>相手先ＣＤ：{9}<br>相手先枝番１：{10}<br>相手先枝番２：{11}<br>相手先枝番３：{12}<p>
	 */
	public static String PFBZL0502 = "PFBZL0502";

	/** LEVEL[W]<br>ファイル名が重複しました。<br>ＩＦ通信ルールマスタの設定を確認してください。<br>ファイル名：{1}<br>外部システムＣＤ：{2}<br>ＩＦ制御区分：{3}<p>
	 */
	public static String PFBZL0503 = "PFBZL0503";

	/** LEVEL[W]<br>指定した外部システムが外部システムマスタに登録されていない、または、外部システム区分に「6.ＥＤＩ（ＭＣＦ）」が指定されています。<br>外部システムマスタの設定を確認してください。<br>外部システムCD：{1}<p>
	 */
	public static String PFBZL0504 = "PFBZL0504";

	/** LEVEL[W]<br>外部システムマスタで外部システム区分が「6.ＥＤＩ（ＭＣＦ）」以外の場合、会社ＣＤは指定できません。<br>ＩＦ処理区分：{1}<br>外部システムＣＤ：{2}<br>会社ＣＤ：{3}<p>
	 */
	public static String PFBZL0505 = "PFBZL0505";

	/** LEVEL[W]<br>コード変換オペレーションの実行に失敗しました。<br>オペレーション：{1}<p>
	 */
	public static String PFUCL0001 = "PFUCL0001";

	/** LEVEL[W]<br>送信変換オペレーションの実行に失敗しました。<br>オペレーション：{1}<p>
	 */
	public static String PFUCL0002 = "PFUCL0002";

	/** LEVEL[W]<br>受信変換オペレーションの実行に失敗しました。<br>オペレーション：{1}<p>
	 */
	public static String PFUCL0003 = "PFUCL0003";

	/** LEVEL[W]<br>オペレーションが設定されていません。<p>
	 */
	public static String PFUCL0004 = "PFUCL0004";

	/** LEVEL[W]<br>ディレクトリが設定されていません。<br>ＩＦ通信ルールマスタの設定を確認してください。<br>外部システムＣＤ：{1}<br>ＩＦ制御区分：{2}<p>
	 */
	public static String PFUCL0005 = "PFUCL0005";

	/** LEVEL[W]<br>移動元のファイルが存在しませんでした。<br>ファイル名：{1}<br>移動元パス：{2}<p>
	 */
	public static String PFUCL0006 = "PFUCL0006";

	/** LEVEL[W]<br>ファイルの移動に失敗しました。<br>ファイル名：{1}<br>移動元パス：{2}<br>移動先パス：{3}<p>
	 */
	public static String PFUCL0007 = "PFUCL0007";

	/** LEVEL[W]<br>会社間連携オペレーションの実行に失敗しました。<br>オペレーション：{1}<p>
	 */
	public static String PFUCL0008 = "PFUCL0008";

	/** LEVEL[W]<br>外部システム区分が「6.ＥＤＩ（ＭＣＦ）」の外部システムマスタが登録されていないため、処理できません。<p>
	 */
	public static String PFUCL0009 = "PFUCL0009";

	/** LEVEL[W]<br>ファイルが存在しませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<p>
	 */
	public static String PFUDL0001 = "PFUDL0001";

	/** LEVEL[W]<br>ファイルをJSON形式として解析できませんでした。<br>ファイルの内容がJSON形式でないか、文字コードが「UTF-8（BOMなし）」ではありません。<br>ディレクトリ：{1}<br>ファイル名：{2}<p>
	 */
	public static String PFUDL0002 = "PFUDL0002";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>ルートに対して次のキーが存在しませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<p>
	 */
	public static String PFUDL0003 = "PFUDL0003";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>親キーに対して次の子キーが存在しませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>親キー：{3}<br>子キー：{4}<p>
	 */
	public static String PFUDL0004 = "PFUDL0004";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>キーに対する値のデータ型が次の通りではありませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<br>データ型：{4}<p>
	 */
	public static String PFUDL0005 = "PFUDL0005";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>キーに対する値が指定されていませんでした。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<p>
	 */
	public static String PFUDL0006 = "PFUDL0006";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>指定可能な値と異なる値が指定されています。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<br>値：{4}<br>指定可能な値：{5}<p>
	 */
	public static String PFUDL0007 = "PFUDL0007";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>整数を指定してください。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<br>値：{4}<p>
	 */
	public static String PFUDL0008 = "PFUDL0008";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>配列のサイズは１以上としてください。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<p>
	 */
	public static String PFUDL0009 = "PFUDL0009";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>配列の要素に「null」は指定できません。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<p>
	 */
	public static String PFUDL0010 = "PFUDL0010";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>配列の要素に同じ値は指定できません。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<br>値：{4}<p>
	 */
	public static String PFUDL0011 = "PFUDL0011";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>ルートに対して次のキーを少なくとも１つは指定してください。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>キー：{3}<p>
	 */
	public static String PFUDL0012 = "PFUDL0012";

	/** LEVEL[W]<br>フォーマットファイルの記述が不正です。訂正してください。<br>親キーに対して次の子キーを少なくとも１つは指定してください。<br>ディレクトリ：{1}<br>ファイル名：{2}<br>親キー：{3}<br>子キー：{4}<p>
	 */
	public static String PFUDL0013 = "PFUDL0013";

	/** LEVEL[W]<br>呼び出し先APIのメタデータを解析できませんでした。<br>ＩＦ通信ルールマスタの「EXT_SYS_STR1」、「EXT_SYS_STR2」、「EXT_SYS_STR3」、「WEB_URL」を確認してください。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<p>
	 */
	public static String PFUDL0100 = "PFUDL0100";

	/** LEVEL[W]<br>呼び出し先APIの接続先情報を取得できませんでした。<br>ＩＦ通信ルールマスタの「WEB_URL」、「EXT_SYS_STR1」を確認してください。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<p>
	 * f<br>
	 */
	public static String PFUDL0101 = "PFUDL0101";

	/** LEVEL[W]<br>呼び出し先APIの認証でエラーが発生しました。外部システムユーザマスタの設定を確認してください。<br>接続先URL：{1}<p>
	 */
	public static String PFUDL0102 = "PFUDL0102";

	/** LEVEL[W]<br>呼び出し先APIの認証でエラーが発生しました。外部システムユーザマスタの設定を確認してください。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<br>データＮＯ：{3}<br>データ行ＮＯ：{4}<p>
	 */
	public static String PFUDL0103 = "PFUDL0103";

	/** LEVEL[W]<br>APIの呼び出し処理でエラーが発生しました。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<br>データＮＯ：{3}<br>データ行ＮＯ：{4}<br>メッセージ：{5}<p>
	 */
	public static String PFUDL0104 = "PFUDL0104";
}
