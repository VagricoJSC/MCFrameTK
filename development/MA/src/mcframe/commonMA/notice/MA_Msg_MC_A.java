package mcframe.commonMA.notice;

public class MA_Msg_MC_A {
	/** LEVEL[W]<br>次のデータは既に存在します。<br>仕訳パタンＣＤ：{1}<br>連番：{2}<p>
	 */
	public static String MABCP0001 = "MABCP0001";

	/** LEVEL[W]<br>部門情報が登録されています。<br>既存の期間に対して変更する場合は、操作種別に「訂正する」を指定してください。<br>組織変更を行なう場合は、操作種別に「組織変更する」を指定してください。<p>
	 */
	public static String MABCP0002 = "MABCP0002";

	/** LEVEL[W]<br>対象の部門を上位部門とするレコードが登録されています。<br>対象の部門を上位部門とするレコードを全て削除してください。<p>
	 */
	public static String MABCP0003 = "MABCP0003";

	/** LEVEL[W]<br>対象の部門を上位部門とするレコードが登録されています。<br>対象の部門を上位部門とするレコードを全て削除してください。<br>（論理削除をオンにしてください）<p>
	 */
	public static String MABCP0004 = "MABCP0004";

	/** LEVEL[W]<br>上位部門が論理削除されています。上位部門に対して論理削除取消を行なってください。<br>（論理削除をオフにしてください）<p>
	 */
	public static String MABCP0005 = "MABCP0005";

	/** LEVEL[I]<br>得意先に関する項目をクリアします。よろしいですか？<p>
	 */
	public static String MABCP0006 = "MABCP0006";

	/** LEVEL[I]<br>売掛先に関する項目をクリアします。よろしいですか？<p>
	 */
	public static String MABCP0007 = "MABCP0007";

	/** LEVEL[I]<br>請求先に関する項目をクリアします。よろしいですか？<p>
	 */
	public static String MABCP0008 = "MABCP0008";

	/** LEVEL[I]<br>入金先に関する項目をクリアします。よろしいですか？<p>
	 */
	public static String MABCP0009 = "MABCP0009";

	/** LEVEL[I]<br>納品先に関する項目をクリアします。よろしいですか？<p>
	 */
	public static String MABCP0010 = "MABCP0010";

	/** LEVEL[I]<br>発注先に関する項目をクリアします。よろしいですか？<p>
	 */
	public static String MABCP0011 = "MABCP0011";

	/** LEVEL[I]<br>買掛先に関する項目をクリアします。よろしいですか？<p>
	 */
	public static String MABCP0012 = "MABCP0012";

	/** LEVEL[I]<br>支払予定管理先に関する項目をクリアします。よろしいですか？<p>
	 */
	public static String MABCP0013 = "MABCP0013";

	/** LEVEL[I]<br>支払先に関する項目をクリアします。よろしいですか？<p>
	 */
	public static String MABCP0014 = "MABCP0014";

	/** LEVEL[W]<br>対象の販売品目体系を上位販売品目体系とするレコードが登録されています。<br>対象の販売品目体系を上位販売品目体系とするレコードを全て削除してください。<p>
	 */
	public static String MABCP0015 = "MABCP0015";

	/** LEVEL[W]<br>対象の販売品目体系を上位販売品目体系とするレコードが登録されています。<br>対象の販売品目体系を上位販売品目体系とするレコードを全て削除してください。<br>（論理削除をオンにしてください）<p>
	 */
	public static String MABCP0016 = "MABCP0016";

	/** LEVEL[W]<br>上位販売品目体系が論理削除されています。<br>上位販売品目体系に対して論理削除取消を行なってください。<br>（論理削除をオフにしてください）<p>
	 */
	public static String MABCP0017 = "MABCP0017";

	/** LEVEL[W]<br>品目単位マスタに登録してください。<br>項目：{1}<br>単位ＣＤ：{2}<p>
	 */
	public static String MABCP0018 = "MABCP0018";

	/** LEVEL[W]<br>品目単位マスタに梱包単位として登録してください。<br>項目：{1}<br>単位ＣＤ：{2}<p>
	 */
	public static String MABCP0019 = "MABCP0019";

	/** LEVEL[W]<br>指定されたファイルが見つからないか実行に失敗しました。<br>パス：{1}<p>
	 */
	public static String MABCP0020 = "MABCP0020";

	/** LEVEL[W]<br>削除対象が存在しません。<p>
	 */
	public static String MABCL0001 = "MABCL0001";

	/** LEVEL[W]<br>すでにデフォルトがオンのデータが登録されています。有効な期間内において、同一の会計伝票区分・自動仕訳キー・自動仕訳グループの中で1件のみデフォルトをオンにできます。<br>会計伝票区分：{1}<br>自動仕訳キーＣＤ：{2}<br>自動仕訳グループ：{3}<br>{4}<p>
	 */
	public static String MABCL0002 = "MABCL0002";

	/** LEVEL[W]<br>対象の仕訳グループは、自動仕訳パタンマスタで使用されているため、削除できません。<br>仕訳グループＣＤ：{1}<br>{2}<p>
	 */
	public static String MABCL0003 = "MABCL0003";

	/** LEVEL[W]<br>換算元通貨と換算先通貨に同じ値を指定できません。<br>{1}<p>
	 */
	public static String MABCL0004 = "MABCL0004";

	/** LEVEL[W]<br>補助勘定科目を使用する勘定科目を指定した場合は補助勘定科目は必須です。<br>勘定科目ＣＤ：{1}<br>{2}<p>
	 */
	public static String MABCL0005 = "MABCL0005";

	/** LEVEL[W]<br>換算元単位と換算先単位は異なる単位を指定してください。<br>{1}<p>
	 */
	public static String MABCL0006 = "MABCL0006";

	/** LEVEL[W]<br>補助勘定科目を使用する勘定科目を指定した場合のみ補助勘定科目を指定できます。<br>勘定科目ＣＤ：{1}<br>{2}<p>
	 */
	public static String MABCL0007 = "MABCL0007";

	/** LEVEL[W]<br>取引先を使用する勘定科目を指定した場合のみ取引先を使用する取引先区分を指定できます。<br>勘定科目ＣＤ：{1}<br>{2}<p>
	 */
	public static String MABCL0008 = "MABCL0008";

	/** LEVEL[W]<br>取引先を使用する勘定科目に対して取引先区分に「X：使用しない」を指定できません。<br>勘定科目ＣＤ：{1}<br>{2}<p>
	 */
	public static String MABCL0009 = "MABCL0009";

	/** LEVEL[W]<br>仕向先１が未指定の場合は、仕向先２を指定できません。<p>
	 */
	public static String MABCL0010 = "MABCL0010";

	/** LEVEL[W]<br>仕向先２が未指定の場合は、仕向先３を指定できません。<p>
	 */
	public static String MABCL0011 = "MABCL0011";

	/** LEVEL[W]<br>ロスをオンとした場合のみ固定ロスをオンにできます。<br>{1}<p>
	 */
	public static String MABCL0012 = "MABCL0012";

	/** LEVEL[W]<br>すでに固定ロスがオンのデータが登録されています。業務理由マスタに対して1件のみ固定ロスをオンにできます。<br>{1}<p>
	 */
	public static String MABCL0013 = "MABCL0013";

	/** LEVEL[W]<br>仕入をオンとした場合のみ仕入ソート順を指定できます。<br>{1}<p>
	 */
	public static String MABCL0014 = "MABCL0014";

	/** LEVEL[W]<br>仕入返品をオンとした場合のみ仕入返品ソート順を指定できます。<br>{1}<p>
	 */
	public static String MABCL0015 = "MABCL0015";

	/** LEVEL[W]<br>仕入または仕入返品をオンとした場合のみ経費購買をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0016 = "MABCL0016";

	/** LEVEL[W]<br>仕入調整をオンとした場合のみ仕入調整管轄区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0017 = "MABCL0017";

	/** LEVEL[W]<br>仕入調整をオンとした場合のみ仕入調整ソート順を指定できます。<br>{1}<p>
	 */
	public static String MABCL0018 = "MABCL0018";

	/** LEVEL[W]<br>売上をオンとした場合のみ売上ソート順を指定できます。<br>{1}<p>
	 */
	public static String MABCL0019 = "MABCL0019";

	/** LEVEL[W]<br>売上返品をオンとした場合のみ売上返品ソート順を指定できます。<br>{1}<p>
	 */
	public static String MABCL0020 = "MABCL0020";

	/** LEVEL[W]<br>売上または売上返品がオンの場合のみ販売他勘定をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0021 = "MABCL0021";

	/** LEVEL[W]<br>売上調整をオンとした場合のみ売上調整ソート順を指定できます。<br>{1}<p>
	 */
	public static String MABCL0022 = "MABCL0022";

	/** LEVEL[W]<br>経費購買をオンとした場合のみ受注紐付経費購買をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0023 = "MABCL0023";

	/** LEVEL[W]<br>廃棄をオンとした場合のみ廃棄ソート順を指定できます。<br>{1}<p>
	 */
	public static String MABCL0024 = "MABCL0024";

	/** LEVEL[W]<br>在庫振替をオンとした場合のみ在庫振替ソート順を指定できます。<br>{1}<p>
	 */
	public static String MABCL0025 = "MABCL0025";

	/** LEVEL[W]<br>移送をオンとした場合のみ移送ソート順を指定できます。<br>{1}<p>
	 */
	public static String MABCL0026 = "MABCL0026";

	/** LEVEL[W]<br>出来高をオンとした場合のみ出来高ソート順を指定できます。<br>{1}<p>
	 */
	public static String MABCL0027 = "MABCL0027";

	/** LEVEL[W]<br>他勘定入庫をオンとした場合のみ他勘定入庫ソート順を指定できます。<br>{1}<p>
	 */
	public static String MABCL0028 = "MABCL0028";

	/** LEVEL[W]<br>ロスをオンとした場合のみロットトレース対象外をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0029 = "MABCL0029";

	/** LEVEL[W]<br>検査不良をオンとした場合のみ検査不良ソート順を指定できます。<br>{1}<p>
	 */
	public static String MABCL0030 = "MABCL0030";

	/** LEVEL[W]<br>他勘定出庫をオンとした場合のみ他勘定出庫ソート順を指定できます。<br>{1}<p>
	 */
	public static String MABCL0031 = "MABCL0031";

	/** LEVEL[W]<br>在庫管理区分に「2.在庫管理しない」、資産管理区分に「1.資産管理する」を指定した場合、以下のいずれかの手配ＮＯ管理区分に「2.管理する（必須）」を指定する必要があります。<br>手配ＮＯ１管理区分<br>手配ＮＯ２管理区分<br>手配ＮＯ３管理区分<br>手配ＮＯ４管理区分<br>{1}<p>
	 */
	public static String MABCL0032 = "MABCL0032";

	/** LEVEL[W]<br>他勘定入庫または他勘定出庫をオンとした場合のみ投入他勘定ソート順を指定できます。<br>{1}<p>
	 */
	public static String MABCL0033 = "MABCL0033";

	/** LEVEL[W]<br>品目区分に「7.架空品」を指定した場合は、以下の項目をオンにできません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0034 = "MABCL0034";

	/** LEVEL[W]<br>品目区分に「7.架空品」を指定した場合は、以下の項目を指定できません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0035 = "MABCL0035";

	/** LEVEL[W]<br>債権のワーキンググループを指定した場合のみ債権部門をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0036 = "MABCL0036";

	/** LEVEL[W]<br>債務のワーキンググループを指定した場合のみ債務部門をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0037 = "MABCL0037";

	/** LEVEL[W]<br>販売のワーキンググループを指定した場合のみ営業部門をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0038 = "MABCL0038";

	/** LEVEL[W]<br>購買のワーキンググループを指定した場合のみ購買部門をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0039 = "MABCL0039";

	/** LEVEL[W]<br>物流もしくは製造のワーキンググループを指定した場合のみ以下の項目をオンにできます。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0040 = "MABCL0040";

	/** LEVEL[W]<br>製造のワーキンググループを指定した場合のみ製造部門をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0041 = "MABCL0041";

	/** LEVEL[W]<br>需給のワーキンググループを指定した場合のみ需給部門をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0042 = "MABCL0042";

	/** LEVEL[W]<br>発注先を指定した場合のみメーカを指定できます。<br>{1}<p>
	 */
	public static String MABCL0043 = "MABCL0043";

	/** LEVEL[W]<br>発注先を指定した場合は、管轄区分には「2.生産」以外を指定できません。<br>{1}<p>
	 */
	public static String MABCL0044 = "MABCL0044";

	/** LEVEL[W]<br>引当余裕日数にマイナス値を指定した場合のみ移動・移送引当対象外をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0045 = "MABCL0045";

	/** LEVEL[W]<br>発注先を指定した場合は、物流標準場所をオンにできません。<br>{1}<p>
	 */
	public static String MABCL0046 = "MABCL0046";

	/** LEVEL[W]<br>すでに口座科目設定マスタ取込１がオンのデータが登録されています。仕訳グループマスタに対して1件のみ口座科目設定マスタ取込１をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0047 = "MABCL0047";

	/** LEVEL[W]<br>在庫管理区分に「3.架空品」を指定した場合は、資産管理区分に「3.架空品」以外を指定できません。<br>{1}<p>
	 */
	public static String MABCL0048 = "MABCL0048";

	/** LEVEL[W]<br>資産管理区分に「3.架空品」を指定した場合は、在庫管理区分に「3.架空品」以外を指定できません。<br>{1}<p>
	 */
	public static String MABCL0049 = "MABCL0049";

	/** LEVEL[W]<br>在庫管理区分に「3.架空品」を指定した場合は、諸口品をオンにできません。<br>{1}<p>
	 */
	public static String MABCL0050 = "MABCL0050";

	/** LEVEL[W]<br>在庫管理区分に「2.在庫管理しない」を指定、かつ資産管理区分に「2.資産管理しない」を指定した場合のみ、値引品目をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0051 = "MABCL0051";

	/** LEVEL[W]<br>単位マスタに設定されている小数部有効桁数以下の値のみ指定できます。<br>単位ＣＤ：{1}<br>小数部有効桁数：{2}<br>小数部有効桁数（単位マスタ）：{3}<p>
	 */
	public static String MABCL0052 = "MABCL0052";

	/** LEVEL[W]<br>容積単位を指定した場合のみ容積を指定できます。<br>{1}<p>
	 */
	public static String MABCL0053 = "MABCL0053";

	/** LEVEL[W]<br>重量単位を指定した場合のみ重量を指定できます。<br>{1}<p>
	 */
	public static String MABCL0054 = "MABCL0054";

	/** LEVEL[W]<br>入り目単位を指定した場合のみ入り目数を指定できます。<br>{1}<p>
	 */
	public static String MABCL0055 = "MABCL0055";

	/** LEVEL[W]<br>ＪＡＮ区分に「1.ＪＡＮ」を指定した場合は、ＪＡＮに１３桁以下の文字列のみ指定できます。<br>{1}<p>
	 */
	public static String MABCL0056 = "MABCL0056";

	/** LEVEL[W]<br>ＪＡＮ区分に「2.短縮ＪＡＮ」を指定した場合は、ＪＡＮに８桁以下の文字列のみ指定できます。<br>{1}<p>
	 */
	public static String MABCL0057 = "MABCL0057";

	/** LEVEL[W]<br>在庫管理区分に「3.架空品」を指定した場合は、品目区分に「7.架空品」以外を指定できません。<br>{1}<p>
	 */
	public static String MABCL0058 = "MABCL0058";

	/** LEVEL[W]<br>在庫管理区分に「1.在庫管理する」以外を指定した場合は、以下の項目をオンにできません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0059 = "MABCL0059";

	/** LEVEL[W]<br>市場出荷判定対象がオフの場合は、以下の項目を指定できません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0060 = "MABCL0060";

	/** LEVEL[W]<br>ロット管理区分に「3.同一ロット不許可」以外、またはサブロット管理区分に「3.ロット内同一サブロット不許可」以外を指定した場合は、以下の項目をオンにできません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0061 = "MABCL0061";

	/** LEVEL[W]<br>期限管理対象がオフの場合は、期限管理種別を指定できません。<br>{1}<p>
	 */
	public static String MABCL0062 = "MABCL0062";

	/** LEVEL[W]<br>有効成分対象がオフの場合は、以下の項目を指定できません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0063 = "MABCL0063";

	/** LEVEL[W]<br>在庫管理区分に「3.架空品」を指定した場合は、「1.管理しない」のみ指定できます。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0064 = "MABCL0064";

	/** LEVEL[W]<br>手配ＮＯ管理区分に「1.管理しない」を指定した場合は、以下の項目をオンにできません。<br>項目：{1}<br>制御項目：{2}<br>{3}<p>
	 */
	public static String MABCL0065 = "MABCL0065";

	/** LEVEL[W]<br>手配ＮＯ管理区分に「2.管理する（必須）」を指定した場合は、以下の項目をオフにできません。<br>項目：{1}<br>制御項目：{2}<br>{3}<p>
	 */
	public static String MABCL0066 = "MABCL0066";

	/** LEVEL[W]<br>手配ＮＯ管理区分に「1.管理しない」を指定した場合は、以下の項目を指定できません。<br>項目：{1}<br>制御項目：{2}<br>{3}<p>
	 */
	public static String MABCL0067 = "MABCL0067";

	/** LEVEL[W]<br>手配ＮＯ発番区分に「1.手動」を指定した場合は、以下の項目を指定できません。<br>項目：{1}<br>制御項目：{2}<br>{3}<p>
	 */
	public static String MABCL0068 = "MABCL0068";

	/** LEVEL[W]<br>在庫管理区分に「1.在庫管理する」以外を指定した場合は、ロット管理区分に「1.ロット管理しない」のみ指定できます。<br>{1}<p>
	 */
	public static String MABCL0069 = "MABCL0069";

	/** LEVEL[W]<br>ロット管理区分に「1.ロット管理しない」を指定した場合は、ロットＮＯ発番区分を指定できません。<br>{1}<p>
	 */
	public static String MABCL0070 = "MABCL0070";

	/** LEVEL[W]<br>ロットＮＯ発番区分に「1.手動」を指定した場合は、ロットＮＯ発番パタンＣＤを指定できません。<br>{1}<p>
	 */
	public static String MABCL0071 = "MABCL0071";

	/** LEVEL[W]<br>ロット管理区分に「1.ロット管理しない」を指定した場合は、サブロット管理区分に「1.サブロット管理しない」または「4.在庫のみサブロット管理する」のみ指定できます。<br>{1}<p>
	 */
	public static String MABCL0072 = "MABCL0072";

	/** LEVEL[W]<br>サブロット管理区分に「1.サブロット管理しない」を指定した場合は、サブロットＮＯ発番区分を指定できません。<br>{1}<p>
	 */
	public static String MABCL0073 = "MABCL0073";

	/** LEVEL[W]<br>サブロットＮＯ発番区分に「1.手動」を指定した場合は、サブロットＮＯ発番パタンＣＤを指定できません。<br>{1}<p>
	 */
	public static String MABCL0074 = "MABCL0074";

	/** LEVEL[W]<br>ロット管理区分に「3.同一ロット不許可」を指定、もしくはサブロット管理区分に「3.ロット内同一サブロット不許可」を指定した場合のみ、検査実施単位区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0075 = "MABCL0075";

	/** LEVEL[W]<br>在庫管理区分に「2.在庫管理しない」を指定した場合のみ、輸出入諸掛区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0076 = "MABCL0076";

	/** LEVEL[W]<br>所要手配ＮＯ必須がオンの場合は、「2.自動」または「3.手動_未指定:自動」を指定できます。<br>項目：{1}<br>制御項目：{2}<br>{3}<p>
	 */
	public static String MABCL0077 = "MABCL0077";

	/** LEVEL[W]<br>在庫管理区分に「3.架空品」を指定した場合は、以下の項目をオンにできません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0078 = "MABCL0078";

	/** LEVEL[W]<br>在庫管理区分に「3.架空品」を指定した場合は、以下の項目を指定できません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0079 = "MABCL0079";

	/** LEVEL[W]<br>以下の2つの期で不備があります。漏れ、重複のないように期を指定してください。<br>期１：{1}～{2}<br>期２：{3}～{4}<p>
	 */
	public static String MABCL0080 = "MABCL0080";

	/** LEVEL[W]<br>課税対象の税を指定した場合のみ内税をオン、または税率に0以外を指定できます。<br>税ＣＤ：{1}<br>{2}<p>
	 */
	public static String MABCL0081 = "MABCL0081";

	/** LEVEL[W]<br>新部門を指定した場合は、新部門対するデータを新組織一覧に指定してください。<br>部門ＣＤ：{1}<br>{2}<p>
	 */
	public static String MABCL0082 = "MABCL0082";

	/** LEVEL[W]<br>新部門を指定した場合は、部門に対するデータを新組織一覧に指定できません。<br>部門ＣＤ：{1}<br>{2}<p>
	 */
	public static String MABCL0083 = "MABCL0083";

	/** LEVEL[W]<br>新組織への切替日は過去日付を指定できません。<br>運用日付より後の日付を指定してください。<br>{1}<p>
	 */
	public static String MABCL0084 = "MABCL0084";

	/** LEVEL[W]<br>ロット管理区分に「1.ロット管理しない」を指定した場合は、版管理対象を指定できません。<br>{1}<p>
	 */
	public static String MABCL0085 = "MABCL0085";

	/** LEVEL[W]<br>品目評価が使用可能な承認機能区分を指定した場合のみ品目を指定できます。<br>{1}<p>
	 */
	public static String MABCL0086 = "MABCL0086";

	/** LEVEL[W]<br>品目評価が使用可能な承認機能区分を指定した場合のみ品目分類区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0087 = "MABCL0087";

	/** LEVEL[W]<br>部門評価が使用可能な承認機能区分を指定した場合のみ部門を指定できます。<br>{1}<p>
	 */
	public static String MABCL0088 = "MABCL0088";

	/** LEVEL[W]<br>取引先評価が使用可能な承認機能区分を指定した場合のみ取引先を指定できます。<br>{1}<p>
	 */
	public static String MABCL0089 = "MABCL0089";

	/** LEVEL[W]<br>取引先評価が使用可能な承認機能区分を指定した場合のみ取引先分類区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0090 = "MABCL0090";

	/** LEVEL[W]<br>金額評価１が使用可能な承認機能区分を指定した場合のみ通貨１を指定できます。<br>{1}<p>
	 */
	public static String MABCL0091 = "MABCL0091";

	/** LEVEL[W]<br>承認対象金額２として評価される承認機能区分を指定した、かつ通貨１を指定した場合のみ結合条件区分１を指定できます。<br>{1}<p>
	 */
	public static String MABCL0092 = "MABCL0092";

	/** LEVEL[W]<br>承認対象金額３として評価される承認機能区分を指定した、かつ通貨１、通貨２を指定した場合のみ結合条件区分２を指定できます。<br>{1}<p>
	 */
	public static String MABCL0093 = "MABCL0093";

	/** LEVEL[W]<br>通貨１を指定した場合のみ金額１下限値、金額１上限値を指定できます。<br>{1}<p>
	 */
	public static String MABCL0094 = "MABCL0094";

	/** LEVEL[W]<br>通貨２を指定した場合のみ金額２下限値、金額２上限値を指定できます。<br>{1}<p>
	 */
	public static String MABCL0095 = "MABCL0095";

	/** LEVEL[W]<br>通貨３を指定した場合のみ金額３下限値、金額３上限値を指定できます。<br>{1}<p>
	 */
	public static String MABCL0096 = "MABCL0096";

	/** LEVEL[W]<br>主部門を指定した場合のみ兼務部門１を指定できます。<br>{1}<p>
	 */
	public static String MABCL0097 = "MABCL0097";

	/** LEVEL[W]<br>兼務部門１を指定した場合のみ兼務部門２を指定できます。<br>{1}<p>
	 */
	public static String MABCL0098 = "MABCL0098";

	/** LEVEL[W]<br>兼務部門２を指定した場合のみ兼務部門３を指定できます。<br>{1}<p>
	 */
	public static String MABCL0099 = "MABCL0099";

	/** LEVEL[W]<br>兼務部門３を指定した場合のみ兼務部門４を指定できます。<br>{1}<p>
	 */
	public static String MABCL0100 = "MABCL0100";

	/** LEVEL[W]<br>兼務部門４を指定した場合のみ兼務部門５を指定できます。<br>{1}<p>
	 */
	public static String MABCL0101 = "MABCL0101";

	/** LEVEL[W]<br>兼務部門５を指定した場合のみ兼務部門６を指定できます。<br>{1}<p>
	 */
	public static String MABCL0102 = "MABCL0102";

	/** LEVEL[W]<br>兼務部門６を指定した場合のみ兼務部門７を指定できます。<br>{1}<p>
	 */
	public static String MABCL0103 = "MABCL0103";

	/** LEVEL[W]<br>兼務部門７を指定した場合のみ兼務部門８を指定できます。<br>{1}<p>
	 */
	public static String MABCL0104 = "MABCL0104";

	/** LEVEL[W]<br>兼務部門８を指定した場合のみ兼務部門９を指定できます。<br>{1}<p>
	 */
	public static String MABCL0105 = "MABCL0105";

	/** LEVEL[W]<br>承認役割（主）を指定した場合のみ承認役割１（主）を指定できます。<br>{1}<p>
	 */
	public static String MABCL0106 = "MABCL0106";

	/** LEVEL[W]<br>承認役割１（主）を指定した場合のみ承認役割２（主）を指定できます。<br>{1}<p>
	 */
	public static String MABCL0107 = "MABCL0107";

	/** LEVEL[W]<br>承認役割２（主）を指定した場合のみ承認役割３（主）を指定できます。<br>{1}<p>
	 */
	public static String MABCL0108 = "MABCL0108";

	/** LEVEL[W]<br>承認役割３（主）を指定した場合のみ承認役割４（主）を指定できます。<br>{1}<p>
	 */
	public static String MABCL0109 = "MABCL0109";

	/** LEVEL[W]<br>承認役割４（主）を指定した場合のみ承認役割５（主）を指定できます。<br>{1}<p>
	 */
	public static String MABCL0110 = "MABCL0110";

	/** LEVEL[W]<br>承認役割５（主）を指定した場合のみ承認役割６（主）を指定できます。<br>{1}<p>
	 */
	public static String MABCL0111 = "MABCL0111";

	/** LEVEL[W]<br>承認役割６（主）を指定した場合のみ承認役割７（主）を指定できます。<br>{1}<p>
	 */
	public static String MABCL0112 = "MABCL0112";

	/** LEVEL[W]<br>承認役割７（主）を指定した場合のみ承認役割８（主）を指定できます。<br>{1}<p>
	 */
	public static String MABCL0113 = "MABCL0113";

	/** LEVEL[W]<br>承認役割８（主）を指定した場合のみ承認役割９（主）を指定できます。<br>{1}<p>
	 */
	public static String MABCL0114 = "MABCL0114";

	/** LEVEL[W]<br>承認役割（副）を指定した場合のみ承認役割１（副）を指定できます。<br>{1}<p>
	 */
	public static String MABCL0115 = "MABCL0115";

	/** LEVEL[W]<br>承認役割１（副）を指定した場合のみ承認役割２（副）を指定できます。<br>{1}<p>
	 */
	public static String MABCL0116 = "MABCL0116";

	/** LEVEL[W]<br>承認役割２（副）を指定した場合のみ承認役割３（副）を指定できます。<br>{1}<p>
	 */
	public static String MABCL0117 = "MABCL0117";

	/** LEVEL[W]<br>承認役割３（副）を指定した場合のみ承認役割４（副）を指定できます。<br>{1}<p>
	 */
	public static String MABCL0118 = "MABCL0118";

	/** LEVEL[W]<br>承認役割４（副）を指定した場合のみ承認役割５（副）を指定できます。<br>{1}<p>
	 */
	public static String MABCL0119 = "MABCL0119";

	/** LEVEL[W]<br>承認役割５（副）を指定した場合のみ承認役割６（副）を指定できます。<br>{1}<p>
	 */
	public static String MABCL0120 = "MABCL0120";

	/** LEVEL[W]<br>承認役割６（副）を指定した場合のみ承認役割７（副）を指定できます。<br>{1}<p>
	 */
	public static String MABCL0121 = "MABCL0121";

	/** LEVEL[W]<br>承認役割７（副）を指定した場合のみ承認役割８（副）を指定できます。<br>{1}<p>
	 */
	public static String MABCL0122 = "MABCL0122";

	/** LEVEL[W]<br>承認役割８（副）を指定した場合のみ承認役割９（副）を指定できます。<br>{1}<p>
	 */
	public static String MABCL0123 = "MABCL0123";

	/** LEVEL[W]<br>主部門、兼務部門１～９に同じ値を指定できません。<br>{1}<p>
	 */
	public static String MABCL0124 = "MABCL0124";

	/** LEVEL[W]<br>承認役割（主）、承認役割１～９（主）、承認役割（副）、承認役割１～９（副）に同じ値を指定できません。<br>{1}<p>
	 */
	public static String MABCL0125 = "MABCL0125";

	/** LEVEL[W]<br>取引先が国内の場合のみ下請対象をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0126 = "MABCL0126";

	/** LEVEL[W]<br>下請対象をオン、支給積送管理区分に「1.着荷登録不要（積送管理しない）」を指定した場合は、支給計上区分には「3.使用基準」以外を指定できません。<br>{1}<p>
	 */
	public static String MABCL0127 = "MABCL0127";

	/** LEVEL[W]<br>下請対象をオフ、支給積送管理区分に「1.着荷登録不要（積送管理しない）」を指定した場合は、支給計上区分には「1.出荷基準」または「3.使用基準」以外を指定できません。<br>{1}<p>
	 */
	public static String MABCL0128 = "MABCL0128";

	/** LEVEL[W]<br>支給積送管理区分に「1.着荷登録不要（積送管理しない）」以外を指定した場合は、支給計上区分には「2.着荷基準」または「3.使用基準」以外を指定できません。<br>{1}<p>
	 */
	public static String MABCL0129 = "MABCL0129";

	/** LEVEL[W]<br>請求部門区分に「3.請求部門」を指定した場合のみ請求先担当部門を指定できます。<br>{1}<p>
	 */
	public static String MABCL0130 = "MABCL0130";

	/** LEVEL[W]<br>請求締処理区分に「1.バッチ締日請求」を指定した場合のみ請求締遅延日数を指定できます。<br>{1}<p>
	 */
	public static String MABCL0131 = "MABCL0131";

	/** LEVEL[W]<br>請求締処理区分に「1.バッチ締日請求」、「2.マニュアル締日請求」または「3.マニュアル選択請求」を指定した場合のみ売上明細書出力区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0132 = "MABCL0132";

	/** LEVEL[W]<br>請求締処理区分に「4.売上都度請求」を指定した場合は、請求書前月残高表示をオンにできません。<br>{1}<p>
	 */
	public static String MABCL0133 = "MABCL0133";

	/** LEVEL[W]<br>金額考慮をオンとした場合のみ手数料計算をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0134 = "MABCL0134";

	/** LEVEL[W]<br>債権部門区分に「2.債権部門」を指定した場合のみ債権部門を指定できます。<br>{1}<p>
	 */
	public static String MABCL0135 = "MABCL0135";

	/** LEVEL[W]<br>売上計上区分に「2.検収基準」を指定した場合は、請求起算区分には「1.売上基準」以外を指定できません。<br>{1}<p>
	 */
	public static String MABCL0136 = "MABCL0136";

	/** LEVEL[W]<br>売上計上区分を指定した場合のみ請求起算区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0137 = "MABCL0137";

	/** LEVEL[W]<br>品群構成区分に「3.品目仕訳」を指定した場合のみ品目仕訳を指定できます。<br>{1}<p>
	 */
	public static String MABCL0138 = "MABCL0138";

	/** LEVEL[W]<br>品群構成区分に「4.会計品目分類」を指定した場合のみ会計品目分類を指定できます。<br>{1}<p>
	 */
	public static String MABCL0139 = "MABCL0139";

	/** LEVEL[W]<br>品目分類が指定できる品群構成区分を指定した場合のみ品目分類区分または品目分類を指定できます。<br>{1}<p>
	 */
	public static String MABCL0140 = "MABCL0140";

	/** LEVEL[W]<br>在庫管理区分に「3.架空品」を指定した場合は、構成・仕様管理区分に「1.構成・仕様管理しない」以外を指定できません。<br>{1}<p>
	 */
	public static String MABCL0141 = "MABCL0141";

	/** LEVEL[W]<br>期限管理対象がオフの場合は、出荷ロット逆転禁止をオンにできません。<br>{1}<p>
	 */
	public static String MABCL0142 = "MABCL0142";

	/** LEVEL[W]<br>在庫管理区分に「3.架空品」を指定、またはロット管理区分に「1.ロット管理しない」を指定した場合は、出荷有効期限グループを指定できません。<br>{1}<p>
	 */
	public static String MABCL0143 = "MABCL0143";

	/** LEVEL[W]<br>在庫管理区分に「1.在庫管理する」「3.架空品」を指定した場合は、入荷不要をオンにできません。<br>{1}<p>
	 */
	public static String MABCL0144 = "MABCL0144";

	/** LEVEL[W]<br>値引品目がオンの場合は、以下の項目をオフにできません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0145 = "MABCL0145";

	/** LEVEL[W]<br>増加量には最小値と最大値との差より小さい値を指定してください。<br>増加量：{1}<br>{2}<p>
	 */
	public static String MABCL0146 = "MABCL0146";

	/** LEVEL[W]<br>指定の発番情報は、既に登録されています。<br>発番業務区分：{1}<br>発番パタンＣＤ：{2}<br>キー要素：{3}<p>
	 */
	public static String MABCL0147 = "MABCL0147";

	/** LEVEL[W]<br>シーケンスの最大値が発番パタンマスタに指定された連番の桁数を超えています。<br>最大桁数：{1}<br>{2}<p>
	 */
	public static String MABCL0148 = "MABCL0148";

	/** LEVEL[W]<br>すでに物流標準場所がオンのデータが登録されています。同一物流グループの中で1件のみ物流標準場所をオンにできます。<br>物流グループＣＤ：{1}<br>{2}<p>
	 */
	public static String MABCL0149 = "MABCL0149";

	/** LEVEL[W]<br>資源１と資源２に同じ値を指定できません。<br>{1}<p>
	 */
	public static String MABCL0150 = "MABCL0150";

	/** LEVEL[W]<br>送信処理のＩＦ処理区分を指定した場合のみ外部システムを指定できます。<p>
	 */
	public static String MABCL0151 = "MABCL0151";

	/** LEVEL[W]<br>親品群と品群に同じ値を指定できません。<br>{1}<p>
	 */
	public static String MABCL0152 = "MABCL0152";

	/** LEVEL[W]<br>配送先をオンとした場合のみ配送先経由区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0153 = "MABCL0153";

	/** LEVEL[W]<br>出来高をオンとした場合のみ出来高区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0154 = "MABCL0154";

	/** LEVEL[W]<br>出来高区分に「2.不良品」を指定した場合のみ非在庫をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0155 = "MABCL0155";

	/** LEVEL[W]<br>すでに受注紐付経費購買がオンのデータが登録されています。業務理由マスタに対して1件のみ受注紐付経費購買をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0156 = "MABCL0156";

	/** LEVEL[W]<br>債権決済方法をオンとした場合のみ債権決済区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0157 = "MABCL0157";

	/** LEVEL[W]<br>債権決済区分に「1.現金」または「2.振込」または「3.手形」を指定した場合のみ入金登録区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0158 = "MABCL0158";

	/** LEVEL[W]<br>債権決済区分に「7.振替」を指定した場合は、会計理由を指定できません。<br>{1}<p>
	 */
	public static String MABCL0159 = "MABCL0159";

	/** LEVEL[W]<br>債権決済区分に「4.相殺（借方）」もしくは債権決済区分に「6.相殺」を指定した場合のみ売上仕入税区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0160 = "MABCL0160";

	/** LEVEL[W]<br>債権決済区分に「1.現金」または「2.振込」または「3.手形」を指定した場合のみ手数料計算をオンにできます<br>{1}<p>
	 */
	public static String MABCL0161 = "MABCL0161";

	/** LEVEL[W]<br>債権決済区分に「1.現金」または「2.振込」または「3.手形」を指定した場合のみ相殺方法を指定できます。<br>{1}<p>
	 */
	public static String MABCL0162 = "MABCL0162";

	/** LEVEL[W]<br>債権決済区分に「4.相殺（借方）」または「5.相殺（貸方）」を指定した場合のみ債権債務先識別区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0163 = "MABCL0163";

	/** LEVEL[W]<br>債務決済方法をオンとした場合のみ債務決済区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0164 = "MABCL0164";

	/** LEVEL[W]<br>債務決済区分に「6.相殺」を指定した場合のみ債務相殺先区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0165 = "MABCL0165";

	/** LEVEL[W]<br>要素区分に「SEQ.連番」を指定した場合は、デフォルトシーケンス区分は必須です。<br>{1}<p>
	 */
	public static String MABCL0166 = "MABCL0166";

	/** LEVEL[W]<br>キー項目桁数は連番より前の要素に対する桁数の合計以下としてください。<br>キー項目桁数：{1}<br>連番より前の要素に対する桁数の合計：{2}<br>{3}<p>
	 */
	public static String MABCL0167 = "MABCL0167";

	/** LEVEL[W]<br>キー項目桁数は要素に対する桁数の合計以下としてください。<br>キー項目桁数：{1}<br>要素に対する桁数の合計：{2}<br>{3}<p>
	 */
	public static String MABCL0168 = "MABCL0168";

	/** LEVEL[W]<br>発番時の表示要素がありません。要素の桁数及び非表示のオン／オフを見直してください。<br>全要素の桁数合計：{1}<br>非表示となる要素の桁数の合計：{2}<br>{3}<p>
	 */
	public static String MABCL0169 = "MABCL0169";

	/** LEVEL[W]<br>表示桁数は、{1}桁以下としてください。<br>表示桁数：{2}<br>{3}<br><br>表示桁数 = 要素に対する桁数の合計 - 非表示要素に対する桁数の合計<p>
	 */
	public static String MABCL0170 = "MABCL0170";

	/** LEVEL[W]<br>表示桁数は、{1}以下としてください。<br>表示桁数の合計：{2}<br>{3}<br><br>表示桁数 = 要素に対する桁数の合計 - 非表示要素に対する桁数の合計<p>
	 */
	public static String MABCL0171 = "MABCL0171";

	/** LEVEL[W]<br>要素に対する桁数の合計は、{1}以下としてください。<br>要素に対する桁数の合計：{2}<br>{3}<br><p>
	 */
	public static String MABCL0172 = "MABCL0172";

	/** LEVEL[W]<br>資産管理区分に「1.資産管理する」以外を指定した場合は、支給単価変更許可をオンにできません。<br>{1}<p>
	 */
	public static String MABCL0173 = "MABCL0173";

	/** LEVEL[W]<br>在庫管理区分に「2.在庫管理しない」を指定した場合は、受注手配区分に「2.仕入直送」のみ指定できます。<br>{1}<p>
	 */
	public static String MABCL0174 = "MABCL0174";

	/** LEVEL[W]<br>在庫管理区分に「1.在庫管理する」を指定した場合は、出荷指図区分に「1.ピッキングあり」「3.対象外」のみ指定できます。<br>{1}<p>
	 */
	public static String MABCL0175 = "MABCL0175";

	/** LEVEL[W]<br>以下の項目は在庫管理区分に「1.在庫管理する」を指定、かつ諸口品がオンの場合、「4.管理する（任意：在庫対象外）」を指定できません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0176 = "MABCL0176";

	/** LEVEL[W]<br>在庫管理区分に「1.在庫管理する」を指定、かつ諸口品がオンの場合、以下のいずれかの手配ＮＯ管理区分に「2.管理する（必須）」を指定する必要があります。<br>手配ＮＯ１管理区分<br>手配ＮＯ２管理区分<br>手配ＮＯ３管理区分<br>手配ＮＯ４管理区分<p>
	 */
	public static String MABCL0177 = "MABCL0177";

	/** LEVEL[W]<br>構成・仕様管理区分に「2.構成・仕様管理する」を指定した場合のみ受注時構成改訂許可をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0178 = "MABCL0178";

	/** LEVEL[W]<br>受注手配区分に「2.仕入直送」を指定した場合は、出荷指図区分に「3.対象外」のみ指定できます。<br>{1}<p>
	 */
	public static String MABCL0179 = "MABCL0179";

	/** LEVEL[W]<br>発注先を指定した場合のみ以下の項目をオンにできます。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0180 = "MABCL0180";

	/** LEVEL[W]<br>請求締処理区分に「4.売上都度請求」を指定した場合は、請求税計算をオンにできません。<br>{1}<p>
	 */
	public static String MABCL0181 = "MABCL0181";

	/** LEVEL[W]<br>ロット管理区分に「1.ロット管理しない」を指定した場合は、版管理対象をオンにできません。<br>{1}<p>
	 */
	public static String MABCL0182 = "MABCL0182";

	/** LEVEL[W]<br>値引品目がオンの場合は、以下の項目を指定できません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0183 = "MABCL0183";

	/** LEVEL[W]<br>ロット管理区分を指定した場合のみロットＮＯ発番区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0184 = "MABCL0184";

	/** LEVEL[W]<br>ロット管理区分に「1.ロット管理しない」を指定した場合は、ロットＮＯ発番区分を指定できません。<br>{1}<p>
	 */
	public static String MABCL0185 = "MABCL0185";

	/** LEVEL[W]<br>ロットＮＯ発番区分を指定した場合のみロットＮＯ発番パタンを指定できます。<br>{1}<p>
	 */
	public static String MABCL0186 = "MABCL0186";

	/** LEVEL[W]<br>ロットＮＯ発番区分に「1.手動」を指定した場合は、ロットＮＯ発番パタンを指定できません。<br>{1}<p>
	 */
	public static String MABCL0187 = "MABCL0187";

	/** LEVEL[W]<br>サブロット管理区分を指定した場合のみサブロットＮＯ発番区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0188 = "MABCL0188";

	/** LEVEL[W]<br>サブロット管理区分に「1.サブロット管理しない」を指定した場合は、サブロットＮＯ発番区分を指定できません。<br>{1}<p>
	 */
	public static String MABCL0189 = "MABCL0189";

	/** LEVEL[W]<br>サブロットＮＯ発番区分を指定した場合のみサブロットＮＯ発番パタンを指定できます。<br>{1}<p>
	 */
	public static String MABCL0190 = "MABCL0190";

	/** LEVEL[W]<br>サブロットＮＯ発番区分に「1.手動」を指定した場合は、サブロットＮＯ発番パタンを指定できません。<br>{1}<p>
	 */
	public static String MABCL0191 = "MABCL0191";

	/** LEVEL[W]<br>手配ＮＯ１管理区分に「1.管理しない」を指定した場合は、受注手配ＮＯ１必須をオンにできません。<br>{1}<p>
	 */
	public static String MABCL0192 = "MABCL0192";

	/** LEVEL[W]<br>手配ＮＯ１管理区分に「1.管理しない」を指定した場合は、所要手配ＮＯ１必須をオンにできません。<br>{1}<p>
	 */
	public static String MABCL0193 = "MABCL0193";

	/** LEVEL[W]<br>手配ＮＯ１管理区分に「2.管理する（必須）」を指定した場合は、受注手配ＮＯ１必須をオンにしてください。<br>{1}<p>
	 */
	public static String MABCL0194 = "MABCL0194";

	/** LEVEL[W]<br>手配ＮＯ１管理区分に「2.管理する（必須）」を指定した場合は、所要手配ＮＯ１必須をオンにしてください。<br>{1}<p>
	 */
	public static String MABCL0195 = "MABCL0195";

	/** LEVEL[W]<br>手配ＮＯ１管理区分に「1.管理しない」を指定した場合は、手配ＮＯ１発番区分を指定できません。<br>{1}<p>
	 */
	public static String MABCL0196 = "MABCL0196";

	/** LEVEL[W]<br>手配ＮＯ１管理区分を指定した場合のみ手配ＮＯ１発番区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0197 = "MABCL0197";

	/** LEVEL[W]<br>手配ＮＯ１発番区分に「1.手動」を指定した場合は、手配ＮＯ１発番パタンを指定できません。<br>{1}<p>
	 */
	public static String MABCL0198 = "MABCL0198";

	/** LEVEL[W]<br>手配ＮＯ１発番区分を指定した場合のみ手配ＮＯ１発番パタンを指定できます。<br>{1}<p>
	 */
	public static String MABCL0199 = "MABCL0199";

	/** LEVEL[W]<br>手配ＮＯ２管理区分に「1.管理しない」を指定した場合は、受注手配ＮＯ２必須をオンにできません。<br>{1}<p>
	 */
	public static String MABCL0200 = "MABCL0200";

	/** LEVEL[W]<br>手配ＮＯ２管理区分に「1.管理しない」を指定した場合は、所要手配ＮＯ２必須をオンにできません。<br>{1}<p>
	 */
	public static String MABCL0201 = "MABCL0201";

	/** LEVEL[W]<br>手配ＮＯ２管理区分に「2.管理する（必須）」を指定した場合は、受注手配ＮＯ２必須をオンにしてください。<br>{1}<p>
	 */
	public static String MABCL0202 = "MABCL0202";

	/** LEVEL[W]<br>手配ＮＯ２管理区分に「2.管理する（必須）」を指定した場合は、所要手配ＮＯ２必須をオンにしてください。<br>{1}<p>
	 */
	public static String MABCL0203 = "MABCL0203";

	/** LEVEL[W]<br>手配ＮＯ２管理区分に「1.管理しない」を指定した場合は、手配ＮＯ２発番区分を指定できません。<br>{1}<p>
	 */
	public static String MABCL0204 = "MABCL0204";

	/** LEVEL[W]<br>手配ＮＯ２管理区分を指定した場合のみ手配ＮＯ２発番区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0205 = "MABCL0205";

	/** LEVEL[W]<br>手配ＮＯ２発番区分に「1.手動」を指定した場合は、手配ＮＯ２発番パタンを指定できません。<br>{1}<p>
	 */
	public static String MABCL0206 = "MABCL0206";

	/** LEVEL[W]<br>手配ＮＯ２発番区分を指定した場合のみ手配ＮＯ２発番パタンを指定できます。<br>{1}<p>
	 */
	public static String MABCL0207 = "MABCL0207";

	/** LEVEL[W]<br>手配ＮＯ３管理区分に「1.管理しない」を指定した場合は、受注手配ＮＯ３必須をオンにできません。<br>{1}<p>
	 */
	public static String MABCL0208 = "MABCL0208";

	/** LEVEL[W]<br>手配ＮＯ３管理区分に「1.管理しない」を指定した場合は、所要手配ＮＯ３必須をオンにできません。<br>{1}<p>
	 */
	public static String MABCL0209 = "MABCL0209";

	/** LEVEL[W]<br>手配ＮＯ３管理区分に「2.管理する（必須）」を指定した場合は、受注手配ＮＯ３必須をオンにしてください。<br>{1}<p>
	 */
	public static String MABCL0210 = "MABCL0210";

	/** LEVEL[W]<br>手配ＮＯ３管理区分に「2.管理する（必須）」を指定した場合は、所要手配ＮＯ３必須をオンにしてください。<br>{1}<p>
	 */
	public static String MABCL0211 = "MABCL0211";

	/** LEVEL[W]<br>手配ＮＯ３管理区分に「1.管理しない」を指定した場合は、手配ＮＯ３発番区分を指定できません。<br>{1}<p>
	 */
	public static String MABCL0212 = "MABCL0212";

	/** LEVEL[W]<br>手配ＮＯ３管理区分を指定した場合のみ手配ＮＯ３発番区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0213 = "MABCL0213";

	/** LEVEL[W]<br>手配ＮＯ３発番区分に「1.手動」を指定した場合は、手配ＮＯ３発番パタンを指定できません。<br>{1}<p>
	 */
	public static String MABCL0214 = "MABCL0214";

	/** LEVEL[W]<br>手配ＮＯ３発番区分を指定した場合のみ手配ＮＯ３発番パタンを指定できます。<br>{1}<p>
	 */
	public static String MABCL0215 = "MABCL0215";

	/** LEVEL[W]<br>手配ＮＯ４管理区分に「1.管理しない」を指定した場合は、受注手配ＮＯ４必須をオンにできません。<br>{1}<p>
	 */
	public static String MABCL0216 = "MABCL0216";

	/** LEVEL[W]<br>手配ＮＯ４管理区分に「1.管理しない」を指定した場合は、所要手配ＮＯ４必須をオンにできません。<br>{1}<p>
	 */
	public static String MABCL0217 = "MABCL0217";

	/** LEVEL[W]<br>手配ＮＯ４管理区分に「2.管理する（必須）」を指定した場合は、受注手配ＮＯ４必須をオンにしてください。<br>{1}<p>
	 */
	public static String MABCL0218 = "MABCL0218";

	/** LEVEL[W]<br>手配ＮＯ４管理区分に「2.管理する（必須）」を指定した場合は、所要手配ＮＯ４必須をオンにしてください。<br>{1}<p>
	 */
	public static String MABCL0219 = "MABCL0219";

	/** LEVEL[W]<br>手配ＮＯ４管理区分に「1.管理しない」を指定した場合は、手配ＮＯ４発番区分を指定できません。<br>{1}<p>
	 */
	public static String MABCL0220 = "MABCL0220";

	/** LEVEL[W]<br>手配ＮＯ４管理区分を指定した場合のみ手配ＮＯ４発番区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0221 = "MABCL0221";

	/** LEVEL[W]<br>手配ＮＯ４発番区分に「1.手動」を指定した場合は、手配ＮＯ４発番パタンを指定できません。<br>{1}<p>
	 */
	public static String MABCL0222 = "MABCL0222";

	/** LEVEL[W]<br>手配ＮＯ４発番区分を指定した場合のみ手配ＮＯ４発番パタンを指定できます。<br>{1}<p>
	 */
	public static String MABCL0223 = "MABCL0223";

	/** LEVEL[W]<br>棚卸対象をオンにした場合のみ以下の項目をオンにできます。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0224 = "MABCL0224";

	/** LEVEL[W]<br>工場出荷承認対象をオンとした場合のみ工場出荷承認役割を指定できます。<br>{1}<p>
	 */
	public static String MABCL0225 = "MABCL0225";

	/** LEVEL[W]<br>検査承認対象をオンとした場合のみ検査承認役割を指定できます。<br>{1}<p>
	 */
	public static String MABCL0226 = "MABCL0226";

	/** LEVEL[W]<br>製造承認対象をオンとした場合のみ製造承認役割を指定できます。<br>{1}<p>
	 */
	public static String MABCL0227 = "MABCL0227";

	/** LEVEL[W]<br>手配ＮＯ管理区分に「1.管理しない」を指定した場合は、手配ＮＯ区分に「2.展開しない」以外を指定できません。<br>手配ＮＯ項目：{1}<br>{2}<p>
	 */
	public static String MABCL0228 = "MABCL0228";

	/** LEVEL[W]<br>手配ＮＯ管理区分に「2.管理する（必須）」を指定した場合は、手配ＮＯ区分に「1.展開」以外を指定できません。<br>手配ＮＯ項目：{1}<br>{2}<p>
	 */
	public static String MABCL0229 = "MABCL0229";

	/** LEVEL[W]<br>手配ＮＯ管理区分に「4.管理する（任意：在庫対象外）」を指定した場合は、手配ＮＯ区分に「3.展開(無し可)」以外を指定できません。<br>手配ＮＯ項目：{1}<br>{2}<p>
	 */
	public static String MABCL0230 = "MABCL0230";

	/** LEVEL[W]<br>手配ＮＯ管理区分を指定した場合のみ手配ＮＯ区分を指定できます。<br>手配ＮＯ項目：{1}<br>{2}<p>
	 */
	public static String MABCL0231 = "MABCL0231";

	/** LEVEL[W]<br>ロット管理区分に「1.ロット管理しない」以外を指定、かつサブロット管理区分に「1：サブロット管理しない」以外を指定した場合に新規ロット入力不可をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0232 = "MABCL0232";

	/** LEVEL[W]<br>すでに口座科目設定マスタ取込２がオンのデータが登録されています。仕訳グループマスタに対して1件のみ口座科目設定マスタ取込２をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0233 = "MABCL0233";

	/** LEVEL[W]<br>ロット管理区分に「1.ロット管理しない」以外を指定した場合のみロット混在をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0244 = "MABCL0244";

	/** LEVEL[W]<br>サブロット管理区分に「1.サブロット管理しない」以外を指定した場合のみサブロット混在をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0245 = "MABCL0245";

	/** LEVEL[W]<br>副産品がオフの場合のみ引継対象子品目をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0246 = "MABCL0246";

	/** LEVEL[W]<br>請求締処理区分に「1.バッチ締日請求」もしくは「2.マニュアル締日請求」を指定した場合のみ、請求締日を指定できます。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0247 = "MABCL0247";

	/** LEVEL[W]<br>費目数とそれに紐付く費目グループ数の合計が１００より多くなっています。有効な費目数と費目グループ数は１００以下としてください。<p>
	 */
	public static String MABCL0248 = "MABCL0248";

	/** LEVEL[W]<br>登録対象が既に存在します。検索後に更新してください。<p>
	 */
	public static String MABCL0249 = "MABCL0249";

	/** LEVEL[E]<br>データ更新区分には「3.削除」を指定できません。<br>{1}<p>
	 */
	public static String MABCL0250 = "MABCL0250";

	/** LEVEL[W]<br>同一の品目・手配ＮＯには同一品名を指定してください。<br>{1}<p>
	 */
	public static String MABCL0251 = "MABCL0251";

	/** LEVEL[W]<br>指定した品目、手配ＮＯは既に諸口品マスタに登録されています。<br>品目：{1}<br>手配ＮＯ：{2}<br>{3}<p>
	 */
	public static String MABCL0252 = "MABCL0252";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ１管理区分に「1.管理しない」が設定されているため、手配ＮＯ１を指定できません。<br>{1}<p>
	 */
	public static String MABCL0253 = "MABCL0253";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ２管理区分に「1.管理しない」が設定されているため、手配ＮＯ２を指定できません。<br>{1}<p>
	 */
	public static String MABCL0254 = "MABCL0254";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ３管理区分に「1.管理しない」が設定されているため、手配ＮＯ３を指定できません。<br>{1}<p>
	 */
	public static String MABCL0255 = "MABCL0255";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ４管理区分に「1.管理しない」が設定されているため、手配ＮＯ４を指定できません。<br>{1}<p>
	 */
	public static String MABCL0256 = "MABCL0256";

	/** LEVEL[W]<br>住所設定をオンにした場合のみ以下の項目を指定できます。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0257 = "MABCL0257";

	/** LEVEL[W]<br>製造をオンにした場合のみ以下の項目を指定できます。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0258 = "MABCL0258";

	/** LEVEL[W]<br>物流もしくは製造をオンにした場合のみ以下の項目を指定できます。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0259 = "MABCL0259";

	/** LEVEL[W]<br>期限管理対象がオフの場合は、出荷有効期限グループを指定できません。<br>{1}<p>
	 */
	public static String MABCL0260 = "MABCL0260";

	/** LEVEL[W]<br>場所設定をオフにした場合は、以下の項目を指定できません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0261 = "MABCL0261";

	/** LEVEL[W]<br>有償支給先をオンとした場合のみ、以下の項目を指定できます。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0262 = "MABCL0262";

	/** LEVEL[W]<br>コピー元データが対象マスタに存在しません。<br>対象マスタ：{1}<br>コピー元品目：{2}<br>{3}<p>
	 */
	public static String MABCL0263 = "MABCL0263";

	/** LEVEL[W]<br>共通（全社）の品目情報としてすでに登録されています。<br>コピー先品目：{1}<br>{2}<p>
	 */
	public static String MABCL0264 = "MABCL0264";

	/** LEVEL[W]<br>コピー元とコピー先に同じ品目を指定できません。<br>{1}<p>
	 */
	public static String MABCL0265 = "MABCL0265";

	/** LEVEL[W]<br>コピー先品目とコピー元品目の属性が一致していません。<br>コピー先品目：{1}<br>コピー元品目：{2}<br>{3}<p>
	 */
	public static String MABCL0266 = "MABCL0266";

	/** LEVEL[W]<br>以下の項目には「1～31, 99」の数値を指定してください。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0267 = "MABCL0267";

	/** LEVEL[W]<br>部門構成区分に「3.物流Ｇ」を指定した場合のみ物流グループを指定できます。<br>{1}<p>
	 */
	public static String MABCL0268 = "MABCL0268";

	/** LEVEL[W]<br>部門構成区分に「4.製造場所Ｇ」を指定した場合のみ製造場所グループを指定できます。<br>{1}<p>
	 */
	public static String MABCL0269 = "MABCL0269";

	/** LEVEL[W]<br>部門構成区分に「5.ＷＧ」を指定した場合のみワーキンググループを指定できます。<br>{1}<p>
	 */
	public static String MABCL0270 = "MABCL0270";

	/** LEVEL[W]<br>部門構成区分に「6.工場・物流倉庫」を指定した場合のみ工場・物流倉庫を指定できます。<br>{1}<p>
	 */
	public static String MABCL0271 = "MABCL0271";

	/** LEVEL[W]<br>外部システム区分に「1.ＥＤＩ」「6.ＥＤＩ（ＭＣＦ）」を指定した場合は、ＥＤＩ用のＩＦ処理区分のみ指定できます。<br>外部システムＣＤ：{1}<br>外部システム区分：{2}<br>ＩＦ処理区分：{3}<p>
	 */
	public static String MABCL0272 = "MABCL0272";

	/** LEVEL[W]<br>外部システム区分に「3.ＰＬＭ」を指定した場合は、ＰＬＭ用のＩＦ処理区分のみ指定できます。<br>外部システムＣＤ：{1}<br>外部システム区分：{2}<br>ＩＦ処理区分：{3}<p>
	 */
	public static String MABCL0273 = "MABCL0273";

	/** LEVEL[W]<br>対応するＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタにＥＤＩ用のＩＦ処理区分が設定されているため、外部システム区分を変更できません。<br>外部システムＣＤ：{1}<br>外部システム区分：{2}<p>
	 */
	public static String MABCL0274 = "MABCL0274";

	/** LEVEL[W]<br>対応するＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタにＰＬＭ用のＩＦ処理区分が設定されているため、外部システム区分を変更できません。<br>外部システムＣＤ：{1}<br>外部システム区分：{2}<p>
	 */
	public static String MABCL0275 = "MABCL0275";

	/** LEVEL[W]<br>本バージョンでは在庫管理区分が「2.在庫管理しない」、かつ資産管理区分が「1.資産管理する」の指定を行うことはできません。<br>{1}<p>
	 */
	public static String MABCL0276 = "MABCL0276";

	/** LEVEL[W]<br>在庫管理区分に「2.在庫管理しない」を指定した場合は、サブロット管理区分に「1.サブロット管理しない」のみ指定できます。<br>{1}<p>
	 */
	public static String MABCL0278 = "MABCL0278";

	/** LEVEL[W]<br>債権決済区分が「6：源泉税」の決済方法がすでに登録されています。債権決済区分が「6：源泉税」の決済方法は１件のみ登録できます。<br>{1}<p>
	 */
	public static String MABCL0279 = "MABCL0279";

	/** LEVEL[W]<br>債権決済区分が「7：振替」の決済方法がすでに登録されています。債権決済区分が「7：振替」の決済方法は１件のみ登録できます。<br>{1}<p>
	 */
	public static String MABCL0280 = "MABCL0280";

	/** LEVEL[W]<br>週次内示は当日から最大で１５週（３ヶ月）の登録が可能です。週次開始位置＋週次内示期間≦１６となるように指定してください。<br>{1}<p>
	 */
	public static String MABCL0281 = "MABCL0281";

	/** LEVEL[W]<br>旬次内示は当日から最大で９旬（３ヶ月）の登録が可能です。旬次開始位置＋旬次内示期間≦１０となるように指定してください。<br>{1}<p>
	 */
	public static String MABCL0282 = "MABCL0282";

	/** LEVEL[W]<br>月次内示は当日から最大で１２ヶ月（１年）の登録が可能です。月次開始位置＋月次内示期間≦１３となるように指定してください。<br>{1}<p>
	 */
	public static String MABCL0283 = "MABCL0283";

	/** LEVEL[W]<br>週次内示期間、旬次内示期間、月次内示期間のいづれか１つには１以上の値を指定してください。<br>{1}<p>
	 */
	public static String MABCL0284 = "MABCL0284";

	/** LEVEL[W]<br>場所設定をオフにした場合は、以下の項目をオンにできません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0285 = "MABCL0285";

	/** LEVEL[W]<br>以下の項目が設定できない取引パタン区分が指定されています。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0286 = "MABCL0286";

	/** LEVEL[W]<br>すでに自動時採用がオンのデータが登録されています。同一取引パタン区分の中で1件のみ自動時採用をオンにできます。<br>取引パタン区分：{1}<br>{2}<p>
	 */
	public static String MABCL0287 = "MABCL0287";

	/** LEVEL[W]<br>指定したプッシュ通知区分に対しては通知先ワーキンググループを指定できません。<br>{1}<p>
	 */
	public static String MABCL0288 = "MABCL0288";

	/** LEVEL[W]<br>指定したプッシュ通知区分に対しては通知先部門を指定できません。<br>{1}<p>
	 */
	public static String MABCL0289 = "MABCL0289";

	/** LEVEL[W]<br>指定したプッシュ通知区分に対しては通知先承認役割を指定できません。<br>{1}<p>
	 */
	public static String MABCL0290 = "MABCL0290";

	/** LEVEL[W]<br>支払締日１～５に同じ値を指定できません。<br>{1}<p>
	 */
	public static String MABCL0291 = "MABCL0291";

	/** LEVEL[W]<br>請求締日１～５に同じ値を指定できません。<br>{1}<p>
	 */
	public static String MABCL0292 = "MABCL0292";

	/** LEVEL[W]<br>指定した品目の品目マスタ（共通）が登録されていません。<br>{1}<p>
	 */
	public static String MABCL0293 = "MABCL0293";

	/** LEVEL[W]<br>購買単価マスタに承認中のレコードが存在するため削除できません。<br>{1}<p>
	 */
	public static String MABCL0294 = "MABCL0294";

	/** LEVEL[W]<br>加工単価マスタに承認中のレコードが存在するため削除できません。<br>{1}<p>
	 */
	public static String MABCL0295 = "MABCL0295";

	/** LEVEL[W]<br>支給単価マスタに承認中のレコードが存在するため削除できません。<br>{1}<p>
	 */
	public static String MABCL0296 = "MABCL0296";

	/** LEVEL[W]<br>標準販売単価マスタに承認中のレコードが存在するため削除できません。<br>{1}<p>
	 */
	public static String MABCL0297 = "MABCL0297";

	/** LEVEL[W]<br>品目販売単価マスタに承認中のレコードが存在するため削除できません。<br>{1}<p>
	 */
	public static String MABCL0298 = "MABCL0298";

	/** LEVEL[W]<br>得意先販売単価マスタに承認中のレコードが存在するため削除できません。<br>{1}<p>
	 */
	public static String MABCL0299 = "MABCL0299";

	/** LEVEL[W]<br>リリース済みの品目のため更新できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MABCL0300 = "MABCL0300";

	/** LEVEL[W]<br>請求締遅延日数に0を指定した場合のみ請求締前後区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0301 = "MABCL0301";

	/** LEVEL[W]<br>請求先カレンダを指定した場合のみ入金予定前後区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0302 = "MABCL0302";

	/** LEVEL[W]<br>品目と参照品目に同じ品目を指定できません。<br>{1}<p>
	 */
	public static String MABCL0303 = "MABCL0303";

	/** LEVEL[W]<br>品目マスタで以下の単位に登録されているため、論理削除／削除できません。<br>単位項目：{1}<br>{2}<p>
	 */
	public static String MABCL0304 = "MABCL0304";

	/** LEVEL[W]<br>以下の項目に設定されている単位が品目単位マスタに登録されていません。品目マスタ及び品目単位マスタを確認してください。<br>単位項目：{1}<br>単位：{2}<br>{3}<p>
	 */
	public static String MABCL0305 = "MABCL0305";

	/** LEVEL[W]<br>登録不可の値が設定されています。<br>項目：{1}<br>値：{2}<br>{3}<p>
	 */
	public static String MABCL0306 = "MABCL0306";

	/** LEVEL[W]<br>補助勘定科目を使用しない勘定科目に対して補助勘定科目が指定されています。<br>勘定科目ＣＤ：{1} <br>{2}<p>
	 */
	public static String MABCL0307 = "MABCL0307";

	/** LEVEL[W]<br>納税通貨に基準通貨を指定できません。<br>{1}<p>
	 */
	public static String MABCL0308 = "MABCL0308";

	/** LEVEL[W]<br>基準単位と異なる単位を指定してください。<br>{1}<p>
	 */
	public static String MABCL0309 = "MABCL0309";

	/** LEVEL[W]<br>基準単位へ換算する際に小数部が桁落ちする可能性があるため、登録できません。<br>品目：{1}<br>単位ＣＤ：{2}<br>最小値：{3}<br>最小値（基準単位）：{4}<br>小数部有効桁数（基準単位）：{5}<br>{6}<p>
	 */
	public static String MABCL0310 = "MABCL0310";

	/** LEVEL[W]<br>請求税計算をオフとした場合は、請求税額端数処理区分を指定できません。<br>{1}<p>
	 */
	public static String MABCL0311 = "MABCL0311";

	/** LEVEL[W]<br>指定した対象日に対する期が対象期間マスタに登録されていません。<br>対象日：{1}<p>
	 */
	public static String MABCL0312 = "MABCL0312";

	/** LEVEL[W]<br>モジュールＩＤを指定した場合のみロジックＩＤを指定できます。<br>{1}<p>
	 */
	public static String MABCL0313 = "MABCL0313";

	/** LEVEL[W]<br>投入をオンとした場合のみ投入ソート順を指定できます。<br>{1}<p>
	 */
	public static String MABCL0314 = "MABCL0314";

	/** LEVEL[W]<br>場所マスタに登録されていません。<br>場所ＣＤ：{1}<br>{2}<p>
	 */
	public static String MABCL0315 = "MABCL0315";

	/** LEVEL[W]<br>棚・ラインマスタに登録されていません。<br>場所ＣＤ：{1}<br>棚・ラインＣＤ：{2}<br>{3}<p>
	 */
	public static String MABCL0316 = "MABCL0316";

	/** LEVEL[W]<br>すでに外部システム区分が「6.ＥＤＩ（ＭＣＦ）」のデータが登録されています。外部システムマスタで1件のみ外部システム区分が「6.ＥＤＩ（ＭＣＦ）」のデータを登録できます。<br>{1}<p>
	 */
	public static String MABCL0317 = "MABCL0317";

	/** LEVEL[W]<br>旧部門と新部門に同じ部門は指定できません。<br>{1}<p>
	 */
	public static String MABCL0318 = "MABCL0318";

	/** LEVEL[W]<br>場所マスタで棚・ライン対象がオンの場所のみ指定できます。<br>場所ＣＤ：{1}<br>{2}<p>
	 */
	public static String MABCL0319 = "MABCL0319";

	/** LEVEL[W]<br>以下の制御項目がオフの場合はチェック項目を指定できません。<br>制御項目：{1}<br>チェック項目：{2}<br>{3}<p>
	 */
	public static String MABCL0320 = "MABCL0320";

	/** LEVEL[W]<br>以下の項目はシステムパラメータで利用できないように制御されています。<br>パラメータ：{1}<br>項目：{2}<br>{3}<p>
	 */
	public static String MABCL0321 = "MABCL0321";

	/** LEVEL[W]<br>品目ＣＤが指定されていますが、対応する枝番１～３が指定されていません。<br>枝番を使用しない場合は枝番項目にＮＵＬＬ文字を指定してください。<br>もしくは枝番のみ指定されています。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0322 = "MABCL0322";

	/** LEVEL[W]<br>在庫管理区分に「3.架空品」以外を指定した場合は、品目区分に「7.架空品」を指定できません。<br>{1}<p>
	 */
	public static String MABCL0323 = "MABCL0323";

	/** LEVEL[W]<br>ＩＦ項目区分に「ITM.品目」以外を指定した場合のみ自社用ＣＤを指定できます。<br>{1}<p>
	 */
	public static String MABCL0501 = "MABCL0501";

	/** LEVEL[W]<br>ＩＦ項目区分に「ITM.品目」を指定した場合のみ品目を指定できます。<br>{1}<p>
	 */
	public static String MABCL0502 = "MABCL0502";

	/** LEVEL[W]<br>ＩＦ項目区分に「ITM.品目」を指定した場合のみ相手先枝番１を指定できます。<br>{1}<p>
	 */
	public static String MABCL0503 = "MABCL0503";

	/** LEVEL[W]<br>指定した自社用ＣＤもしくは相手先ＣＤはすでに登録済みです（もしくは自社用ＣＤもしくは相手先ＣＤが同じデータが登録対象にあります）。同一外部システム・ＩＦ項目区分・取引先で自社用ＣＤもしくは相手先ＣＤが同じ値のデータは登録できません。<br>※送信変換や受信変換で変換先を一意に決定するため<br>外部システムＣＤ：{1}<br>ＩＦ項目区分：{2}<br>取引先ＣＤ：{3}<br>自社用ＣＤ：{4}<br>相手先ＣＤ：{5}<br>{6}<p>
	 */
	public static String MABCL0504 = "MABCL0504";

	/** LEVEL[W]<br>相手先枝番１を指定した場合のみ相手先枝番２を指定できます。<br>{1}<p>
	 */
	public static String MABCL0505 = "MABCL0505";

	/** LEVEL[W]<br>相手先枝番２を指定した場合のみ相手先枝番３を指定できます。<br>{1}<p>
	 */
	public static String MABCL0506 = "MABCL0506";

	/** LEVEL[W]<br>指定した品目もしくは相手先ＣＤ・相手先枝番１～３はすでに登録済みです（もしくは品目もしくは相手先ＣＤ・相手先枝番１～３が同じデータが登録対象にあります）。同一外部システム・ＩＦ項目区分・取引先で品目もしくは相手先ＣＤ・相手先枝番１～３が同じ値のデータは登録できません。<br>※送信変換や受信変換で変換先を一意に決定するため<br>外部システムＣＤ：{1}<br>ＩＦ項目区分：{2}<br>取引先ＣＤ：{3}<br>品目：{4}<br>相手先ＣＤ：{5}<br>相手先枝番１：{6}<br>相手先枝番２：{7}<br>相手先枝番３：{8}<br>{9}<p>
	 */
	public static String MABCL0507 = "MABCL0507";

	/** LEVEL[W]<br>仕訳キー設定項目区分に取引先分類を指定した場合のみ取引先仕訳キー設定項目区分を指定できます。<br>{1}<p>
	 */
	public static String MABCL0508 = "MABCL0508";

	/** LEVEL[W]<br>原価用の会計伝票区分が指定されています。原価をオンで登録してください。<br>{1}<p>
	 */
	public static String MABCL0509 = "MABCL0509";

	/** LEVEL[W]<br>原価で使用しない会計伝票区分が指定されています。原価をオフで登録してください。<br>{1}<p>
	 */
	public static String MABCL0510 = "MABCL0510";

	/** LEVEL[W]<br>原価にオンを指定した場合は、会計原価情報の項目を指定してください。<br>{1}<p>
	 */
	public static String MABCL0511 = "MABCL0511";

	/** LEVEL[W]<br>受払情報の会計伝票区分を指定した場合は、会計受払情報の項目を指定してください。<br>{1}<p>
	 */
	public static String MABCL0512 = "MABCL0512";

	/** LEVEL[W]<br>在庫情報の会計伝票区分を指定した場合は、会計在庫情報の項目を指定してください。<br>{1}<p>
	 */
	public static String MABCL0513 = "MABCL0513";

	/** LEVEL[W]<br>入金情報の会計伝票区分を指定した場合は、会計入金情報の項目を指定してください。<br>{1}<p>
	 */
	public static String MABCL0514 = "MABCL0514";

	/** LEVEL[W]<br>外部システム区分に「2.ＳＣＭ」もしくは「7.ＳＣＭ（ＭＤ）」を指定した場合のみ、以下の項目をオンにできます。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0515 = "MABCL0515";

	/** LEVEL[W]<br>外部システム区分に「2.ＳＣＭ」もしくは「7.ＳＣＭ（ＭＤ）」を指定した場合のみ、以下の項目を指定できます。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0516 = "MABCL0516";

	/** LEVEL[W]<br>外部システム区分に「1.ＥＤＩ」「2.ＳＣＭ」「6.ＥＤＩ（ＭＣＦ）」「7.ＳＣＭ（ＭＤ）」を指定した場合のみ、以下の項目をオンにできます。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0517 = "MABCL0517";

	/** LEVEL[W]<br>業務担当者通知をオンとした場合のみ受信メッセージレベルを指定できます。<br>{1}<p>
	 */
	public static String MABCL0518 = "MABCL0518";

	/** LEVEL[W]<br>すでに外部システム区分が「7.ＳＣＭ（ＭＤ）」のデータが登録されています。外部システムマスタで1件のみ外部システム区分が「7.ＳＣＭ（ＭＤ）」のデータを登録できます。<br>{1}<p>
	 */
	public static String MABCL0519 = "MABCL0519";

	/** LEVEL[W]<br>外部システム区分に「7.ＳＣＭ（ＭＤ）」を指定した場合は、以下の項目をオフにできません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0520 = "MABCL0520";

	/** LEVEL[W]<br>支払情報の会計伝票区分を指定した場合は、会計支払情報の項目を指定してください。<br>{1}<p>
	 */
	public static String MABCL0521 = "MABCL0521";

	/** LEVEL[W]<br>パラメータ「DEF_LOC_GRP_CD」のパラメータ値を登録するためには、パラメータ「DEF_WG_CD」のパラメータ値を登録してください。<br>{1}<p>
	 */
	public static String MABCL0522 = "MABCL0522";

	/** LEVEL[W]<br>パラメータ「DEF_LOC_GRP_CD」のパラメータ値が登録されているため、パラメータ「DEF_WG_CD」のパラメータ値をクリアできません。<br>{1}<p>
	 */
	public static String MABCL0523 = "MABCL0523";

	/** LEVEL[W]<br>パラメータ「DEF_LOC_GRP_CD」のパラメータ値が登録されているため、パラメータ「DEF_WG_CD」を削除できません。<br>{1}<p>
	 */
	public static String MABCL0524 = "MABCL0524";

	/** LEVEL[W]<br>パラメータ「SNO_TYP」が無効のときは、パラメータ「WRK_ENABLE_FLG」も無効にしてください。<br>{1}<p>
	 */
	public static String MABCL0525 = "MABCL0525";

	/** LEVEL[W]<br>Ｗｅｂ　ＡＰＩまたはコマンド実行がオンの場合は、ファイル入出力オペレーションを指定できません。<br>{1}<p>
	 */
	public static String MABCL0526 = "MABCL0526";

	/** LEVEL[W]<br>Ｗｅｂ　ＡＰＩがオフの場合は、Ｗｅｂ　ＡＰＩオペレーションを指定できません。<br>{1}<p>
	 */
	public static String MABCL0527 = "MABCL0527";

	/** LEVEL[W]<br>外部システム区分に「5.会計」を指定した場合は、会計用のＩＦ処理区分のみ指定できます。<br>外部システムＣＤ：{1}<br>外部システム区分：{2}<br>ＩＦ処理区分：{3}<p>
	 */
	public static String MABCL0528 = "MABCL0528";

	/** LEVEL[W]<br>外部システム区分に「2.ＳＣＭ」「7.ＳＣＭ（ＭＤ）」を指定した場合は、ＳＣＭ用のＩＦ処理区分のみ指定できます。<br>外部システムＣＤ：{1}<br>外部システム区分：{2}<br>ＩＦ処理区分：{3}<p>
	 */
	public static String MABCL0529 = "MABCL0529";

	/** LEVEL[W]<br>外部システム区分に「8.ＦＢ」を指定した場合は、ＦＢ用のＩＦ処理区分のみ指定できます。<br>外部システムＣＤ：{1}<br>外部システム区分：{2}<br>ＩＦ処理区分：{3}<p>
	 */
	public static String MABCL0530 = "MABCL0530";

	/** LEVEL[W]<br>外部システム区分に「1.ＥＤＩ」「6.ＥＤＩ（ＭＣＦ）」を指定した場合のみ、以下の項目をオンにできます。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABCL0531 = "MABCL0531";

	/** LEVEL[W]<br>債務決済区分に「B.照合済残高振替受入」を指定した場合は、会計理由を指定できません。<br>{1}<p>
	 */
	public static String MABCL0532 = "MABCL0532";

	/** LEVEL[W]<br>債務決済区分に「D.未照合残高振替受入」を指定した場合は、会計理由を指定できません。<br>{1}<p>
	 */
	public static String MABCL0533 = "MABCL0533";

	/** LEVEL[W]<br>債務決済区分が「B.照合済残高振替受入」の決済方法がすでに登録されています。<br>債務決済区分が「B.照合済残高振替受入」の決済方法は１件のみ登録できます。<br>{1}<p>
	 */
	public static String MABCL0534 = "MABCL0534";

	/** LEVEL[W]<br>債務決済区分が「D.未照合残高振替受入」の決済方法がすでに登録されています。<br>債務決済区分が「D.未照合残高振替受入」の決済方法は１件のみ登録できます。<br>{1}<p>
	 */
	public static String MABCL0535 = "MABCL0535";

	/** LEVEL[I]<br>マスタ送信ＩＦ処理を開始します。<br>外部システムＣＤ：{1}<br>ＩＦ処理区分：{2}<p>
	 */
	public static String MABCL0536 = "MABCL0536";

	/** LEVEL[I]<br>マスタ送信ＩＦ処理が終了しました。<p>
	 */
	public static String MABCL0537 = "MABCL0537";

	/** LEVEL[W]<br>外部システムマスタに外部システム区分が「4.ＢＩ」として登録されていません。<br>{1}<p>
	 */
	public static String MABCL0538 = "MABCL0538";

	/** LEVEL[W]<br>ＩＦ処理区分がマスタ送信ＩＦ処理の区分ではありません。<br>{1}<p>
	 */
	public static String MABCL0539 = "MABCL0539";

	/** LEVEL[W]<br>外部システム区分に「4.ＢＩ」を指定した場合は、ＢＩ用のＩＦ処理区分のみ指定できます。<br>外部システムＣＤ：{1}<br>外部システム区分：{2}<br>ＩＦ処理区分：{3}<p>
	 */
	public static String MABCL0540 = "MABCL0540";

	/** LEVEL[W]<br>Ｗｅｂ　ＡＰＩとコマンド実行は、いずれかのみオンとして登録できます。<br>{1}<p>
	 */
	public static String MABCL0541 = "MABCL0541";

	/** LEVEL[W]<br>コマンド実行がオフの場合は、コマンド実行オペレーションを指定できません。<br>{1}<p>
	 */
	public static String MABCL0542 = "MABCL0542";

	/** LEVEL[W]<br>下請対象をオンとした場合は、仕入計上区分を指定できません。<br>{1}<p>
	 */
	public static String MABCL0543 = "MABCL0543";

	/** LEVEL[W]<br>指定した取引先の取引先マスタ（共通）が登録されていません。<br>{1}<p>
	 */
	public static String MABCL0601 = "MABCL0601";

	/** LEVEL[W]<br>売上計上区分に「3.着荷基準」を指定した場合は、請求起算区分に「2.納品基準」を指定してください。<br>{1}<p>
	 */
	public static String MABCL0602 = "MABCL0602";

	/** LEVEL[W]<br>発注先フラグがオンかつ配送先フラグがオンの場合は登録できません。<br>{1}<p>
	 */
	public static String MABCL0603 = "MABCL0603";

	/** LEVEL[W]<br>配送先フラグがオンかつ配送先必須フラグがオンの場合は登録できません。<br>{1}<p>
	 */
	public static String MABCL0604 = "MABCL0604";

	/** LEVEL[W]<br>対応するＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタに会計用のＩＦ処理区分が設定されているため、外部システム区分を変更できません。<br>外部システムＣＤ：{1}<br>外部システム区分：{2}<p>
	 */
	public static String MABCL0605 = "MABCL0605";

	/** LEVEL[W]<br>対応するＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタにＳＣＭ用のＩＦ処理区分が設定されているため、外部システム区分を変更できません。<br>外部システムＣＤ：{1}<br>外部システム区分：{2}<p>
	 */
	public static String MABCL0606 = "MABCL0606";

	/** LEVEL[W]<br>対応するＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタにＦＢ用のＩＦ処理区分が設定されているため、外部システム区分を変更できません。<br>外部システムＣＤ：{1}<br>外部システム区分：{2}<p>
	 */
	public static String MABCL0607 = "MABCL0607";

	/** LEVEL[W]<br>対応するＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタにＢＩ用のＩＦ処理区分が設定されているため、外部システム区分を変更できません。<br>外部システムＣＤ：{1}<br>外部システム区分：{2}<p>
	 */
	public static String MABCL0608 = "MABCL0608";

	/** LEVEL[W]<br>発注先納品書ＣＤが設定されている場合のみ、「発注時納品書」「納入指示時納品書」「納期回答受領時納品書」をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0651 = "MABCL0651";

	/** LEVEL[W]<br>入荷不要品がオンの場合のみ、購買納品書対象をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0652 = "MABCL0652";

	/** LEVEL[W]<br>指定した帳票ＩＤは存在しません。<br>帳票ＩＤ：{1}<p>
	 */
	public static String MABCL0654 = "MABCL0654";

	/** LEVEL[W]<br>リリース済みの品目は削除できません。<br>品目：{1}<p>
	 */
	public static String MABCD0001 = "MABCD0001";

	/** LEVEL[W]<br>指定した日付に対して部門マスタに登録されていません。部門マスタを確認してください。<br>部門ＣＤ：{1}<br>日付：{2}<p>
	 */
	public static String MABCD0002 = "MABCD0002";

	/** LEVEL[W]<br>対象期間マスタが登録されていません。<br>基準日：{1}<p>
	 */
	public static String MABCD0003 = "MABCD0003";

	/** LEVEL[W]<br>請求書発行区分に「4.発行対象外」を指定した場合はチェック項目を指定できません。<br>チェック項目：{1}<br>{2}<p>
	 */
	public static String MABCL0655 = "MABCL0655";

	/** LEVEL[W]<br>支払通知書発行対象がオフの場合はチェック項目を指定できません。<br>チェック項目：{1}<br>{2}<p>
	 */
	public static String MABCL0656 = "MABCL0656";

	/** LEVEL[W]<br>対応するＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタに会計（ＳＡＰ）用のＩＦ処理区分が設定されているため、外部システム区分を変更できません。<br>外部システムＣＤ：{1}<br>外部システム区分：{2}<p>
	 */
	public static String MABCL0701 = "MABCL0701";

	/** LEVEL[W]<br>外部システム区分に「A.会計（ＳＡＰ）」を指定した場合は、会計（ＳＡＰ）用のＩＦ処理区分のみ指定できます。<br>外部システムＣＤ：{1}<br>外部システム区分：{2}<br>ＩＦ処理区分：{3}<p>
	 */
	public static String MABCL0702 = "MABCL0702";

	/** LEVEL[W]<br>ロット管理区分に「1.ロット管理しない」以外を指定した場合のみ期限管理対象をオンにできます。<br>{1}<p>
	 */
	public static String MABCL0703 = "MABCL0703";

	/** LEVEL[W]<br>対応するＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタにＳＣＭ（ＰＣＭ）用のＩＦ処理区分が設定されているため、外部システム区分を変更できません。<br>外部システムＣＤ：{1}<br>外部システム区分：{2}<p>
	 */
	public static String MABCL0704 = "MABCL0704";

	/** LEVEL[W]<br>外部システム区分に「B.ＳＣＭ（ＰＣＭ）」を指定した場合は、ＳＣＭ（ＰＣＭ）用のＩＦ処理区分のみ指定できます。<br>外部システムＣＤ：{1}<br>外部システム区分：{2}<br>ＩＦ処理区分：{3}<p>
	 */
	public static String MABCL0705 = "MABCL0705";

	/** LEVEL[I]<br>単価取得処理を実行します。よろしいですか？<p>
	 */
	public static String MABSP0001 = "MABSP0001";

	/** LEVEL[W]<br>単価が取得できませんでした。<br>{1}<p>
	 */
	public static String MABSP0002 = "MABSP0002";

	/** LEVEL[W]<br>旧品目と新品目に同じ値を指定できません。<p>
	 */
	public static String MABSP0003 = "MABSP0003";

	/** LEVEL[W]<br>旧代替グループと新代替グループに同じ値を指定できません。<p>
	 */
	public static String MABSP0004 = "MABSP0004";

	/** LEVEL[W]<br>出荷元物流グループと出荷先物流グループに同じ値を指定できません。<br>{1}<p>
	 */
	public static String MABSL0001 = "MABSL0001";

	/** LEVEL[W]<br>定性定量区分に「1.定性検査」を指定した場合は、単位を指定できません。<br>{1}<p>
	 */
	public static String MABSL0002 = "MABSL0002";

	/** LEVEL[W]<br>定性定量区分に「1.定性検査」を指定した場合は、自動合否判定をオンにできません。<br>{1}<p>
	 */
	public static String MABSL0003 = "MABSL0003";

	/** LEVEL[W]<br>検査方法区分に「2.全数検査」を指定した場合は、抜取数／回に0以外を指定できません。<br>{1}<p>
	 */
	public static String MABSL0004 = "MABSL0004";

	/** LEVEL[W]<br>規格検査必須をオンとした場合のみ規格検査確認必須をオンにできます。<br>{1}<p>
	 */
	public static String MABSL0005 = "MABSL0005";

	/** LEVEL[W]<br>定性定量区分に「2.定量検査」を指定した場合は、定性規格値を指定できません。<br>{1}<p>
	 */
	public static String MABSL0006 = "MABSL0006";

	/** LEVEL[W]<br>定性定量区分に「1.定性検査」を指定した場合は、以下の項目を指定できません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABSL0007 = "MABSL0007";

	/** LEVEL[W]<br>検査方法区分に「4.抜取規格検査」を指定した場合のみ、規格検査必須をオンにできます。<br>{1}<p>
	 */
	public static String MABSL0008 = "MABSL0008";

	/** LEVEL[W]<br>定性定量区分に「2.定量検査」を指定した場合は、下記項目のいずれか1つは指定が必要です。<br>外規格下限値<br>外規格上限値<br>内規格下限値<br>内規格上限値<br>{1}<p>
	 */
	public static String MABSL0009 = "MABSL0009";

	/** LEVEL[W]<br>下記項目が同じレコードには、代替品目選択区分に同じ値を設定してください。<br>親品目：{1}<br>ワーキンググループＣＤ：{2}<br>構成パタン：{3}<br>工程ＣＤ：{4}<br>工程連番：{5}<br>適用開始日：{6}<br>適用終了日：{7}<br>代替グループＣＤ：{8}<br>{9}<p>
	 */
	public static String MABSL0010 = "MABSL0010";

	/** LEVEL[W]<br>有効成分管理が異なる品目を同じ代替グループにできません。<br>{1}<p>
	 */
	public static String MABSL0011 = "MABSL0011";

	/** LEVEL[W]<br>申請内容に既存データに対する更新データが含まれていますが、更新先のデータが存在していません。承認を却下とし、申請データを再登録してください。<br>承認ＮＯ：{1}<p>
	 */
	public static String MABSL0012 = "MABSL0012";

	/** LEVEL[W]<br>外規格上限値符号区分に「EQ.＝」または「NE.≠」を指定した場合は、外規格下限値を指定できません。<br>{1}<p>
	 */
	public static String MABSL0013 = "MABSL0013";

	/** LEVEL[W]<br>外規格下限値符号区分に「EQ.＝」または「NE.≠」を指定した場合は、外規格上限値符号区分を指定できません。<br>{1}<p>
	 */
	public static String MABSL0014 = "MABSL0014";

	/** LEVEL[W]<br>内規格上限値符号区分に「EQ.＝」または「NE.≠」を指定した場合は、内規格下限値を指定できません。<br>{1}<p>
	 */
	public static String MABSL0015 = "MABSL0015";

	/** LEVEL[W]<br>内規格下限値符号区分に「EQ.＝」または「NE.≠」を指定した場合は、内規格上限値符号区分を指定できません。<br>{1}<p>
	 */
	public static String MABSL0016 = "MABSL0016";

	/** LEVEL[W]<br>発注先を指定した場合のみメーカを指定できます。<br>{1}<p>
	 */
	public static String MABSL0017 = "MABSL0017";

	/** LEVEL[W]<br>製造場所もしくは発注先を指定している場合は、工場・物流倉庫を指定できません。<br>{1}<p>
	 */
	public static String MABSL0018 = "MABSL0018";

	/** LEVEL[W]<br>検査対象外をオンとした場合は、検査パタンを指定できません。<br>{1}<p>
	 */
	public static String MABSL0019 = "MABSL0019";

	/** LEVEL[W]<br>品目マスタの期限管理対象がオフに設定されている場合は、期限起算日区分に以下の値を指定できます。<br>「1.製造着手日」<br>「2.製造完了日」<br>「6.入荷実績日」<br>「7.子品目起算日引継ぎ」<br>{1}<p>
	 */
	public static String MABSL0020 = "MABSL0020";

	/** LEVEL[W]<br>品目マスタの期限管理対象が設定されていない場合は、有効期間に0のみ指定できます。<br>{1}<p>
	 */
	public static String MABSL0021 = "MABSL0021";

	/** LEVEL[W]<br>品目マスタの期限管理対象が設定されていない場合は、使用期間に0のみ指定できます。<br>{1}<p>
	 */
	public static String MABSL0022 = "MABSL0022";

	/** LEVEL[W]<br>品目マスタの期限管理対象が設定されていない場合は、以下の項目を指定できません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABSL0023 = "MABSL0023";

	/** LEVEL[W]<br>マスタ変更の承認申請中のため、更新できません。<br>{1}<p>
	 */
	public static String MABSL0024 = "MABSL0024";

	/** LEVEL[W]<br>品目マスタの期限管理対象が設定されている場合は、期限起算日区分（延長時）に以下の値を指定できます。<br>「3.検査判定日」<br>「8.現有効期限」<br>{1}<p>
	 */
	public static String MABSL0025 = "MABSL0025";

	/** LEVEL[W]<br>期限起算日区分に「8.現有効期限」は指定できません。<br>{1}<p>
	 */
	public static String MABSL0026 = "MABSL0026";

	/** LEVEL[W]<br>検査対象外をオンとした場合は、先行検査有効をオンにできません。<br>{1}<p>
	 */
	public static String MABSL0027 = "MABSL0027";

	/** LEVEL[W]<br>マスタ変更の承認申請中のため、削除できません。<br>{1}<p>
	 */
	public static String MABSL0028 = "MABSL0028";

	/** LEVEL[W]<br>工程管理単位に品目の基準単位と同じ値を指定できません。<br>{1}<p>
	 */
	public static String MABSL0029 = "MABSL0029";

	/** LEVEL[W]<br>工程管理単位を指定した場合のみ工程基準単位数を指定できます。<br>{1}<p>
	 */
	public static String MABSL0030 = "MABSL0030";

	/** LEVEL[W]<br>工程管理単位を指定した場合のみ工程換算単位数を指定できます。<br>{1}<p>
	 */
	public static String MABSL0031 = "MABSL0031";

	/** LEVEL[W]<br>工程管理単位を指定した場合のみ小数部有効桁数を指定できます。<br>{1}<p>
	 */
	public static String MABSL0032 = "MABSL0032";

	/** LEVEL[W]<br>出来高計上工程をオンとした場合のみ出来高工程比率を指定できます。<br>{1}<p>
	 */
	public static String MABSL0033 = "MABSL0033";

	/** LEVEL[W]<br>工程場所には場所に対するワーキンググループと同じワーキンググループを持つ場所のみ指定できます。<br>場所ワーキンググループＣＤ：{1}<br>工程場所ワーキンググループＣＤ：{2}<br>{3}<p>
	 */
	public static String MABSL0034 = "MABSL0034";

	/** LEVEL[W]<br>支払予定日を使用しないサイト区分を指定した場合は、支払予定日１を指定できません。<br>{1}<p>
	 */
	public static String MABSL0035 = "MABSL0035";

	/** LEVEL[W]<br>支払予定日１を指定した場合のみ支払予定日２を指定できます。<br>{1}<p>
	 */
	public static String MABSL0036 = "MABSL0036";

	/** LEVEL[W]<br>支払予定日２を指定した場合のみ支払予定日３を指定できます。<br>{1}<p>
	 */
	public static String MABSL0037 = "MABSL0037";

	/** LEVEL[W]<br>支払予定日３を指定した場合のみ支払予定日４を指定できます。<br>{1}<p>
	 */
	public static String MABSL0038 = "MABSL0038";

	/** LEVEL[W]<br>支払予定日４を指定した場合のみ支払予定日５を指定できます。<br>{1}<p>
	 */
	public static String MABSL0039 = "MABSL0039";

	/** LEVEL[W]<br>支払サイト１を指定した場合のみ支払サイト２を指定できます。<br>{1}<p>
	 */
	public static String MABSL0040 = "MABSL0040";

	/** LEVEL[W]<br>支払サイト２を指定した場合のみ支払サイト３を指定できます。<br>{1}<p>
	 */
	public static String MABSL0041 = "MABSL0041";

	/** LEVEL[W]<br>支払サイト３を指定した場合のみ支払サイト４を指定できます。<br>{1}<p>
	 */
	public static String MABSL0042 = "MABSL0042";

	/** LEVEL[W]<br>支払サイト４を指定した場合のみ支払サイト５を指定できます。<br>{1}<p>
	 */
	public static String MABSL0043 = "MABSL0043";

	/** LEVEL[W]<br>サイト区分に「2.日」を指定した場合は、以下の項目を指定できません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABSL0044 = "MABSL0044";

	/** LEVEL[W]<br>入金予定日１を指定した場合のみ入金予定日２を指定できます。<br>{1}<p>
	 */
	public static String MABSL0045 = "MABSL0045";

	/** LEVEL[W]<br>入金予定日２を指定した場合のみ入金予定日３を指定できます。<br>{1}<p>
	 */
	public static String MABSL0046 = "MABSL0046";

	/** LEVEL[W]<br>入金予定日３を指定した場合のみ入金予定日４を指定できます。<br>{1}<p>
	 */
	public static String MABSL0047 = "MABSL0047";

	/** LEVEL[W]<br>入金予定日４を指定した場合のみ入金予定日５を指定できます。<br>{1}<p>
	 */
	public static String MABSL0048 = "MABSL0048";

	/** LEVEL[W]<br>入金サイト１を指定した場合のみ入金サイト２を指定できます。<br>{1}<p>
	 */
	public static String MABSL0049 = "MABSL0049";

	/** LEVEL[W]<br>入金サイト２を指定した場合のみ入金サイト３を指定できます。<br>{1}<p>
	 */
	public static String MABSL0050 = "MABSL0050";

	/** LEVEL[W]<br>入金サイト３を指定した場合のみ入金サイト４を指定できます。<br>{1}<p>
	 */
	public static String MABSL0051 = "MABSL0051";

	/** LEVEL[W]<br>入金サイト４を指定した場合のみ入金サイト５を指定できます。<br>{1}<p>
	 */
	public static String MABSL0052 = "MABSL0052";

	/** LEVEL[W]<br>すでに通常構成がオンのデータが登録されています。同一品目・品目構成グループにおいて１件のみ通常構成をオンにできます。<br>品目：{1}<br>品目構成グループＣＤ：{2}<br>{3}<p>
	 */
	public static String MABSL0053 = "MABSL0053";

	/** LEVEL[W]<br>場所マスタの管轄区分に「2.生産」が設定されている場所のみ指定できます。<br>{1}<p>
	 */
	public static String MABSL0054 = "MABSL0054";

	/** LEVEL[W]<br>外規格下限値を指定した場合のみ外規格下限値符号区分を指定できます。<br>{1}<p>
	 */
	public static String MABSL0055 = "MABSL0055";

	/** LEVEL[W]<br>外規格上限値符号区分を指定した場合のみ外規格上限値を指定できます。<br>{1}<p>
	 */
	public static String MABSL0056 = "MABSL0056";

	/** LEVEL[W]<br>内規格下限値を指定した場合のみ内規格下限値符号区分を指定できます。<br>{1}<p>
	 */
	public static String MABSL0057 = "MABSL0057";

	/** LEVEL[W]<br>内規格上限値符号区分を指定した場合のみ内規格上限値を指定できます。<br>{1}<p>
	 */
	public static String MABSL0058 = "MABSL0058";

	/** LEVEL[W]<br>資産管理対象外の品目を指定した場合は、製造場所を指定できません。<br>{1}<p>
	 */
	public static String MABSL0059 = "MABSL0059";

	/** LEVEL[W]<br>発注先を指定した場合のみメーカを指定できます。<br>{1}<p>
	 */
	public static String MABSL0060 = "MABSL0060";

	/** LEVEL[W]<br>製造場所を指定した場合のみ以下の項目を指定できます。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABSL0061 = "MABSL0061";

	/** LEVEL[W]<br>資産管理対象外の品目を指定した場合は、購買識別区分に「4.ＶＭＩ」を指定できません。<br>{1}<p>
	 */
	public static String MABSL0062 = "MABSL0062";

	/** LEVEL[W]<br>代替グループマスタに登録されていません。<br>ワーキンググループＣＤ：{1}<br>代替グループＣＤ：{2}<br>{3}<p>
	 */
	public static String MABSL0063 = "MABSL0063";

	/** LEVEL[W]<br>発注先を指定した場合のみ以下の項目を指定できます。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABSL0064 = "MABSL0064";

	/** LEVEL[W]<br>発注先を指定した場合、または製造場所に外注先となる場所（場所マスタで発注先が設定されている場所）を指定した場合のみ以下の項目を指定できます。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABSL0065 = "MABSL0065";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ管理区分に「1.管理しない」が設定されている品目を指定した場合は、手配ＮＯを指定できません。<br>手配ＮＯ項目：{1}<br>{2}<p>
	 */
	public static String MABSL0066 = "MABSL0066";

	/** LEVEL[W]<br>購買識別区分に「2.無償受給」または「4.ＶＭＩ」を指定した場合は、検収ＬＴを指定できません。<br>{1}<p>
	 */
	public static String MABSL0068 = "MABSL0068";

	/** LEVEL[W]<br>製造場所に外注先となる場所（場所マスタで発注先が設定されている場所）を指定した場合は、購買識別区分に「2.無償受給」または「4.ＶＭＩ」を指定できません。<br>{1}<p>
	 */
	public static String MABSL0069 = "MABSL0069";

	/** LEVEL[W]<br>曜日まとめ区分を指定した場合のみ曜日まとめ期間（週）を指定できます。<br>{1}<p>
	 */
	public static String MABSL0070 = "MABSL0070";

	/** LEVEL[W]<br>製造場所に社内となる場所（場所マスタで発注先が設定されていない場所）を指定した場合のみ出来高予定数量に1以外を指定できます。<br>{1}<p>
	 */
	public static String MABSL0072 = "MABSL0072";

	/** LEVEL[W]<br>製造場所に社内となる場所（場所マスタで発注先が設定されていない場所）を指定した場合のみ製造指図数量に1以外を指定できます。<br>{1}<p>
	 */
	public static String MABSL0073 = "MABSL0073";

	/** LEVEL[W]<br>製造場所に社内となる場所（場所マスタで発注先が設定されていない場所）を指定した場合のみ固定必要数量に0以外を指定できます。<br>{1}<p>
	 */
	public static String MABSL0074 = "MABSL0074";

	/** LEVEL[W]<br>製造場所を指定した場合のみロット発番タイミング区分を指定できます。<br>{1}<p>
	 */
	public static String MABSL0075 = "MABSL0075";

	/** LEVEL[W]<br>構成パタンを指定した場合のみバックフラッシュ許可をオンにできます。<br>{1}<p>
	 */
	public static String MABSL0076 = "MABSL0076";

	/** LEVEL[W]<br>子固定必要数量に０（ゼロ）以外が指定された代替品が存在するため、代替品目選択区分に「1.混在可」を指定できません。<br>{1}<p>
	 */
	public static String MABSL0077 = "MABSL0077";

	/** LEVEL[W]<br>製造場所に社内となる場所（場所マスタで発注先が設定されていない場所）を指定した場合のみ以下の項目を指定できます。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABSL0078 = "MABSL0078";

	/** LEVEL[W]<br>製造指図承認機能が有効な場合のみ以下の項目を指定できます。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABSL0079 = "MABSL0079";

	/** LEVEL[W]<br>製造場所に社内となる場所（場所マスタで発注先が設定されていない場所）を指定した場合のみ以下の項目をオンにできます。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABSL0080 = "MABSL0080";

	/** LEVEL[W]<br>発注先を指定し、かつ在庫管理対象外の品目を指定した場合は、購買識別区分に「1.通常購買」以外を指定できません。<br>{1}<p>
	 */
	public static String MABSL0085 = "MABSL0085";

	/** LEVEL[W]<br>製造場所を指定した場合は構成パタンは必須です。<br>{1}<p>
	 */
	public static String MABSL0086 = "MABSL0086";

	/** LEVEL[W]<br>副産品を指定した場合は子投入数量と子必要数量に異なる値を指定できません。<br>{1}<p>
	 */
	public static String MABSL0087 = "MABSL0087";

	/** LEVEL[W]<br>品目マスタの資産管理区分に「3.架空品」が設定されている品目を子品目に指定した場合は架空をオフにできません。<br>{1}<p>
	 */
	public static String MABSL0088 = "MABSL0088";

	/** LEVEL[W]<br>移動先場所に対する物流グループと移動元場所に対する物流グループが同じ場合は、移送ロット単位数量を入力できません。<br>{1}<p>
	 */
	public static String MABSL0096 = "MABSL0096";

	/** LEVEL[W]<br>移動元場所と移動先場所に同じ場所を指定できません。<br>{1}<p>
	 */
	public static String MABSL0097 = "MABSL0097";

	/** LEVEL[W]<br>移動元場所には移動先場所に対するワーキンググループと同じワーキンググループを持つ場所を指定してください。<br>{1}<p>
	 */
	public static String MABSL0098 = "MABSL0098";

	/** LEVEL[W]<br>移動先場所に対する物流グループと移動元場所に対する物流グループが異なる場合は、投入場所指定をオンにできません。<br>{1}<p>
	 */
	public static String MABSL0099 = "MABSL0099";

	/** LEVEL[W]<br>出荷元工場・物流倉庫と工場・物流倉庫に同じ値を指定できません。<br>{1}<p>
	 */
	public static String MABSL0100 = "MABSL0100";

	/** LEVEL[W]<br>発注先となる取引先、かつ諸口品ではない品目を指定した場合のみ購買内示グループを指定できます。<br>{1}<p>
	 */
	public static String MABSL0101 = "MABSL0101";

	/** LEVEL[W]<br>購買内示グループを指定した場合のみ購買内示確定及び引取責任をオンにできます。<br>{1}<p>
	 */
	public static String MABSL0102 = "MABSL0102";

	/** LEVEL[W]<br>製造場所に対して場所マスタで資源１が設定されている場合のみ資源標準値１を指定できます。<br>{1}<p>
	 */
	public static String MABSL0110 = "MABSL0110";

	/** LEVEL[W]<br>製造場所に対して場所マスタで資源１が設定されている場合のみ資源単位数量１を指定できます。<br>{1}<p>
	 */
	public static String MABSL0111 = "MABSL0111";

	/** LEVEL[W]<br>製造場所に対して場所マスタで資源２が設定されている場合のみ資源標準値２を指定できます。<br>{1}<p>
	 */
	public static String MABSL0112 = "MABSL0112";

	/** LEVEL[W]<br>製造場所に対して場所マスタで資源２が設定されている場合のみ資源単位数量２を指定できます。<br>{1}<p>
	 */
	public static String MABSL0113 = "MABSL0113";

	/** LEVEL[W]<br>外規格下限値に定量値整数部桁数より大きい数値を指定できません。<br>数値：{1}<br>整数部桁数：{2}<br>{3}<p>
	 */
	public static String MABSL0114 = "MABSL0114";

	/** LEVEL[W]<br>外規格下限値＜外規格上限値の関係で指定してください。<br> {1}<p>
	 */
	public static String MABSL0115 = "MABSL0115";

	/** LEVEL[W]<br>外規格上限値に定量値整数部桁数より大きい数値を指定できません。<br>数値：{1}<br>整数部桁数：{2}<br>{3}<p>
	 */
	public static String MABSL0116 = "MABSL0116";

	/** LEVEL[W]<br>内規格下限値＜内規格上限値の関係で指定してください。<br> {1}<p>
	 */
	public static String MABSL0117 = "MABSL0117";

	/** LEVEL[W]<br>内規格下限値に定量値整数部桁数より大きい数値を指定できません。<br>数値：{1}<br>整数部桁数：{2}<br>{3}<p>
	 */
	public static String MABSL0118 = "MABSL0118";

	/** LEVEL[W]<br>内規格上限値に定量値整数部桁数より大きい数値を指定できません。<br>数値：{1}<br>整数部桁数：{2}<br>{3}<p>
	 */
	public static String MABSL0120 = "MABSL0120";

	/** LEVEL[W]<br>代替グループを指定した場合は、投入制御区分に「3.ＭＲＰ対象外（指図書のみ）」を指定できません。<br>{1}<p>
	 */
	public static String MABSL0121 = "MABSL0121";

	/** LEVEL[W]<br>業務理由マスタの固定ロスがオンに設定されているロス理由を指定した場合は、初期表示をオンにできません。<br>{1}<p>
	 */
	public static String MABSL0122 = "MABSL0122";

	/** LEVEL[W]<br>すでに初期表示がオンのデータが登録されています。同一の品目区分・品目区分詳細の中で１件のみ初期表示をオンにできます。<br>品目区分：{1}<br>品目区分詳細ＣＤ：{2}<br>{3}<p>
	 */
	public static String MABSL0123 = "MABSL0123";

	/** LEVEL[W]<br>副産品を指定した場合は子固定必要数量に０（ゼロ）のみ指定できます。<br>{1}<p>
	 */
	public static String MABSL0124 = "MABSL0124";

	/** LEVEL[W]<br>下限手配ＮＯと上限手配ＮＯの大小関係が不正です。上限手配ＮＯに下限手配ＮＯより小さい値（文字列で比較した場合の値）を指定できません。<br>{1}：{2}<br>{3}：{4}<br>{5}<p>
	 */
	public static String MABSL0125 = "MABSL0125";

	/** LEVEL[W]<br>代替品目選択区分が「1.混在可」となる代替品の場合は子固定必要数量に０（ゼロ）のみ指定できます。<br>{1}<p>
	 */
	public static String MABSL0126 = "MABSL0126";

	/** LEVEL[W]<br>場所と同じ値を指定できません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABSL0127 = "MABSL0127";

	/** LEVEL[W]<br>品目マスタのロット管理区分に「3.同一ロット不許可」が設定されていない、もしくは品目マスタのサブロット管理区分に「3.ロット内同一サブロット不許可」が設定されていないためオンにできません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABSL0128 = "MABSL0128";

	/** LEVEL[W]<br>品目マスタのロット管理区分に「1.ロット管理しない」が設定されているため、以下の項目をオンにできません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABSL0129 = "MABSL0129";

	/** LEVEL[W]<br>副産品が指定されている場合は、以下の項目をオンにできません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABSL0130 = "MABSL0130";

	/** LEVEL[E]<br>承認提供サービスの下り電文を取得できません。<br>申請ＮＯ：{1}<p>
	 */
	public static String MABSL0131 = "MABSL0131";

	/** LEVEL[W]<br>申請ＮＯと承認ＮＯが一意に対応していません。<br>申請ＮＯ：{1}<br>承認ＮＯ：{2}<p>
	 */
	public static String MABSL0132 = "MABSL0132";

	/** LEVEL[W]<br>承認情報が存在しません。<br>申請ＮＯ：{1}<p>
	 */
	public static String MABSL0133 = "MABSL0133";

	/** LEVEL[W]<br>承認情報の承認作成元ＮＯが申請ＮＯと一致しません。<br>申請ＮＯ：{1}<br>承認ＮＯ：{2}<br>承認作成元ＮＯ：{3}<p>
	 */
	public static String MABSL0134 = "MABSL0134";

	/** LEVEL[W]<br>承認対象ではありません。承認側のマスタや申請部門について確認してください。<br>部門ＣＤ：{1}<p>
	 */
	public static String MABSL0135 = "MABSL0135";

	/** LEVEL[E]<br>ＤＢコンテナを作成できません。<br>クラス：{1}<p>
	 */
	public static String MABSL0136 = "MABSL0136";

	/** LEVEL[W]<br>検査対象外をオンとした場合は期限起算日区分に「3.検査判定日」、「9.手入力」は指定できません。<br>{1}<p>
	 */
	public static String MABSL0137 = "MABSL0137";

	/** LEVEL[W]<br>指定した親品目・ワーキンググループ・構成パタンについて登録済みのレコードが存在しています。操作種別を「訂正する」に変更してから検索してください。<br>親品目：{1}<br>ワーキンググループ：{2}<br>構成パタン：{3}<p>
	 */
	public static String MABSL0138 = "MABSL0138";

	/** LEVEL[W]<br>単価ロット数量は単価単位を指定した場合のみ指定できます。<br>{1}<p>
	 */
	public static String MABSL0139 = "MABSL0139";

	/** LEVEL[W]<br>複数の計画品目を割り当てないように期間を見直してください。<br>品目：{1}<br>{2}<p>
	 */
	public static String MABSL0140 = "MABSL0140";

	/** LEVEL[W]<br>出荷元物流グループと出荷先物流グループが同じ組み合わせのレコードは、インボイス取引の設定を同じにしてください。<br>出荷条件違いでインボイス取引の設定を変更できません。<br>出荷元物流グループＣＤ：{1}<br>出荷先物流グループＣＤ：{2}<br>{3}<p>
	 */
	public static String MABSL0141 = "MABSL0141";

	/** LEVEL[W]<br>指定のＭＲＰ発番用接頭語は既に使用されています。別の値を指定してください。<br>ＭＲＰ発番用接頭語：{1}<br>{2}<p>
	 */
	public static String MABSL0142 = "MABSL0142";

	/** LEVEL[W]<br>出荷先物流グループに納品先に対する物流グループ（物流グループマスタで場所設定が設定されていない物流グループ）を指定した場合はインボイス取引をオンにできません。<br>{1}<p>
	 */
	public static String MABSL0143 = "MABSL0143";

	/** LEVEL[W]<br>代替品目をオンとした場合は、子品目を指定できません。または、代替品目をオフとした場合は、子品目を指定してください。<br>{1}<p>
	 */
	public static String MABSL0144 = "MABSL0144";

	/** LEVEL[W]<br>架空をオン、または子品目を指定した場合は、代替品目をオンにできません。<br>{1}<p>
	 */
	public static String MABSL0145 = "MABSL0145";

	/** LEVEL[W]<br>以下の条件に１つでも該当する場合は、版ＮＯを指定できません。<br>・代替グループが指定されており、かつ代替品目がオン<br>・架空がオン<br>・副産品がオン<br>・子品目に版管理対象外品目を指定<br>{1}<p>
	 */
	public static String MABSL0146 = "MABSL0146";

	/** LEVEL[W]<br>子品目の手配ＮＯ管理区分が「1.管理しない」の場合は、手配ＮＯ区分に「2.展開しない」のみ指定できます。<br>手配ＮＯ項目：{1}<br>{2}<p>
	 */
	public static String MABSL0147 = "MABSL0147";

	/** LEVEL[W]<br>子品目の手配ＮＯ管理区分が「2.管理する（必須）」の場合は、手配ＮＯ区分に「1.展開」のみ指定できます。<br>手配ＮＯ項目：{1}<br>{2}<p>
	 */
	public static String MABSL0148 = "MABSL0148";

	/** LEVEL[W]<br>子品目の手配ＮＯ管理区分が「4.管理する（任意：在庫対象外）」の場合は、手配ＮＯ区分に「3.展開（無し可）」のみ指定できます。<br>手配ＮＯ項目：{1}<br>{2}<p>
	 */
	public static String MABSL0149 = "MABSL0149";

	/** LEVEL[W]<br>副産品がオン、または架空がオンの場合は、バックフラッシュ区分に「6.対象外」のみ指定できます。<br>{1}<p>
	 */
	public static String MABSL0150 = "MABSL0150";

	/** LEVEL[W]<br>副産品がオン、または架空がオンの場合は、代替グループを指定できません。<br>{1}<p>
	 */
	public static String MABSL0151 = "MABSL0151";

	/** LEVEL[W]<br>副産品がオン、または架空がオンの場合は、投入制御区分に「1.ＭＲＰ・投入対象」のみ指定できます。<br>{1}<p>
	 */
	public static String MABSL0152 = "MABSL0152";

	/** LEVEL[W]<br>子品目のロット管理区分が「1.ロット管理しない」かつサブロット管理区分が「1.サブロット管理しない」、または架空をオンの場合は、指図時ロット指定をオンにできません。<br>{1}<p>
	 */
	public static String MABSL0153 = "MABSL0153";

	/** LEVEL[W]<br>子品目のロット管理区分が「1.ロット管理しない」、または架空をオンの場合は、ロット混在をオンにできません。<br>{1}<p>
	 */
	public static String MABSL0154 = "MABSL0154";

	/** LEVEL[W]<br>子品目のサブロット管理区分が「1.サブロット管理しない」、または架空がオンの場合は、サブロット混在をオンにできません。<br>{1}<p>
	 */
	public static String MABSL0155 = "MABSL0155";

	/** LEVEL[W]<br>以下の条件に１つでも該当する場合は、引当制御区分に「1.引当対象外」のみ指定できます。<br>・子品目の在庫管理区分が「2.在庫管理しない」<br>・投入制御区分に「3.ＭＲＰ対象外（指図書のみ）」を指定<br>・架空がオン<br>・副産品がオン<br>{1}<p>
	 */
	public static String MABSL0156 = "MABSL0156";

	/** LEVEL[W]<br>副産品がオン、または架空がオンの場合は、引継対象子品目をオンにできません。<br>{1}<p>
	 */
	public static String MABSL0157 = "MABSL0157";

	/** LEVEL[W]<br>副産品がオン、または架空がオンの場合は、収率計算用をオンにできません。<br>{1}<p>
	 */
	public static String MABSL0158 = "MABSL0158";

	/** LEVEL[W]<br>指定したワーキンググループと格納場所に対するワーキンググループが異なるため登録できません。<br>ワーキンググループＣＤ：{1}<br>格納場所ワーキンググループＣＤ：{2}<br>{3}<p>
	 */
	public static String MABSL0159 = "MABSL0159";

	/** LEVEL[W]<br>引当物流グループを指定した場合は、引当物流グループに属する場所のみ出荷場所に指定できます。<br>{1}<p>
	 */
	public static String MABSL0160 = "MABSL0160";

	/** LEVEL[W]<br>総量引当場所グループを指定した場合は、総量引当場所グループに属する場所のみ出荷場所に指定できます。<br>{1}<p>
	 */
	public static String MABSL0161 = "MABSL0161";

	/** LEVEL[W]<br>引当場所を指定した場合は、引当場所と同じ場所のみ出荷場所に指定できます。<br>{1}<p>
	 */
	public static String MABSL0162 = "MABSL0162";

	/** LEVEL[W]<br>格納場所に対するワーキンググループと依頼先場所に対するワーキンググループが同じため登録できません。<br>{1}<p>
	 */
	public static String MABSL0163 = "MABSL0163";

	/** LEVEL[W]<br>ワーキンググループと製造場所に対するワーキンググループが異なるため登録できません。<br>製造場所ワーキンググループＣＤ：{1}<br>{2}<p>
	 */
	public static String MABSL0164 = "MABSL0164";

	/** LEVEL[W]<br>ワーキンググループと依頼先場所に対するワーキンググループが同じため登録できません。<br>{1}<p>
	 */
	public static String MABSL0165 = "MABSL0165";

	/** LEVEL[W]<br>支給区分に無償支給は指定できません。<br>{1}<p>
	 */
	public static String MABSL0166 = "MABSL0166";

	/** LEVEL[W]<br>有償支給先でない取引先、あるいは資産管理しない品目を指定した場合は、支給区分には「3.自給」のみ指定できます。<br>{1}<p>
	 */
	public static String MABSL0167 = "MABSL0167";

	/** LEVEL[W]<br>依頼元ワーキンググループと依頼先ワーキンググループに同じ値を指定できません。<br>{1}<p>
	 */
	public static String MABSL0168 = "MABSL0168";

	/** LEVEL[W]<br>すでにデフォルトがオンのデータが登録されています。同一物流グループ・品目出荷グループ・ワーキンググループの中で1件のみデフォルトをオンにできます。<br>物流グループＣＤ：{1}<br>品目出荷グループＣＤ：{2}<br>ワーキンググループＣＤ：{3}<br>{4}<p>
	 */
	public static String MABSL0169 = "MABSL0169";

	/** LEVEL[W]<br>引当場所を指定した場合は、引当物流グループもしくは総量引当場所グループを指定できません。<br>{1}<p>
	 */
	public static String MABSL0170 = "MABSL0170";

	/** LEVEL[W]<br>引当範囲区分に「1.場所引当」を指定した場合は、引当場所もしくは引当物流グループのどちらか一方のみ指定が可能です。また、総量引当場所グループは指定できません。<br>{1}<p>
	 */
	public static String MABSL0171 = "MABSL0171";

	/** LEVEL[W]<br>正式な単価マスタに同一キーのレコードが存在します。適用開始日を変更してください。<br>{1}<p>
	 */
	public static String MABSL0172 = "MABSL0172";

	/** LEVEL[W]<br>正式な単価マスタに期間が重複するレコードが存在します。<br>{1}<p>
	 */
	public static String MABSL0173 = "MABSL0173";

	/** LEVEL[W]<br>申請中のレコードと期間が重複するレコードが存在します。<br>{1}<p>
	 */
	public static String MABSL0174 = "MABSL0174";

	/** LEVEL[W]<br>申請中のレコードと同一キーのレコードが存在します。<br>{1}<p>
	 */
	public static String MABSL0175 = "MABSL0175";

	/** LEVEL[W]<br>サイト区分に「1：月」を指定し、取引先に対して締日が設定されていない場合は、サイトと予定日を指定できません。<br>締日項目：{1}<br>サイト項目：{2}<br>予定日項目：{3}<br>{4}<p>
	 */
	public static String MABSL0176 = "MABSL0176";

	/** LEVEL[W]<br>サイト区分に「1.月」を指定し、取引先に対して締日が設定されている場合は、サイトと予定日は必須です。<br>締日項目：{1}<br>サイト項目：{2}<br>予定日項目：{3}<br>{4}<p>
	 */
	public static String MABSL0177 = "MABSL0177";

	/** LEVEL[W]<br>サイト区分に「2.日」を指定し、取引先に対して締日が設定されている場合は、サイトは必須です。<br>締日項目：{1}<br>サイト項目：{2}<br>{3}<p>
	 */
	public static String MABSL0178 = "MABSL0178";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ管理区分に「2.管理する（必須）」が設定されている品目は、手配ＮＯを管理しない（手配ＮＯ管理区分に「2.管理する（必須）」が設定されていない）親品目の子品目に指定できません。<br>手配ＮＯ項目：{1}<br>{2}<p>
	 */
	public static String MABSL0179 = "MABSL0179";

	/** LEVEL[W]<br>ワーキンググループ間依頼種類区分に「1.移送依頼」を指定した場合は、得意先を指定できません。<br>{1}<p>
	 */
	public static String MABSL0180 = "MABSL0180";

	/** LEVEL[W]<br>ワーキンググループ間依頼種類区分に「1.移送依頼」もしくは「3.出荷依頼」を指定した場合は、依頼先ワーキンググループに物流機能もしくは製造機能を持つワーキンググループが指定できます。<br>{1}<p>
	 */
	public static String MABSL0181 = "MABSL0181";

	/** LEVEL[W]<br>ワーキンググループ間依頼種類区分に「2.購買依頼」を指定した場合は、依頼先ワーキンググループに購買機能を持つワーキンググループが指定できます。<br>{1}<p>
	 */
	public static String MABSL0182 = "MABSL0182";

	/** LEVEL[W]<br>親品目と子品目に同じ品目を指定できません。<br>{1}<p>
	 */
	public static String MABSL0183 = "MABSL0183";

	/** LEVEL[W]<br>以下のいずれかの項目に0以外の数値を入力する必要があります。<br>子品目投入比率<br>子固定必要数量<br>{1}<p>
	 */
	public static String MABSL0184 = "MABSL0184";

	/** LEVEL[W]<br>以下のいずれかの項目に0以外の数値を入力する必要があります。<br>子投入数量<br>子固定必要数量<br>{1}<p>
	 */
	public static String MABSL0185 = "MABSL0185";

	/** LEVEL[W]<br>インボイス取引をオンにした場合、または出荷先物流グループに納品先に対する物流グループ（物流グループマスタで場所設定が設定されていない物流グループ）を指定した場合のみ標準配送先を指定できます。<br>{1}<p>
	 */
	public static String MABSL0186 = "MABSL0186";

	/** LEVEL[W]<br>ロット管理区分に「1.ロット管理しない」以外が設定されている子品目が代替品となる場合に、代替品目選択区分が「1.混在可」かつロット混在不可の組み合わせは指定できません。<br>{1}<p>
	 */
	public static String MABSL0187 = "MABSL0187";

	/** LEVEL[W]<br>ロット管理区分に「1.ロット管理しない」以外が設定されている子品目が代替品となる場合に、代替品目選択区分が「1.混在可」かつロット混在不可の組み合わせは指定できません。<br>{1}<p>
	 */
	public static String MABSL0188 = "MABSL0188";

	/** LEVEL[W]<br>サブロット管理区分に「1.サブロット管理しない」以外が設定されている子品目が代替品となる場合に、代替品目選択区分が「1.混在可」かつサブロット混在不可の組み合わせは指定できません。<br>{1}<p>
	 */
	public static String MABSL0189 = "MABSL0189";

	/** LEVEL[W]<br>発注点在庫数量が指定されていない場合は、以下の項目を指定できません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABSL0190 = "MABSL0190";

	/** LEVEL[W]<br>指定した物流グループと総量引当場所グループに対する物流グループが異なるため登録できません。<br>物流グループＣＤ：{1}<br>総量引当場所グループＣＤ：{2}<br>{3}<p>
	 */
	public static String MABSL0191 = "MABSL0191";

	/** LEVEL[W]<br>指定した場所と総量引当場所グループに対する場所が異なるため登録できません。<br>場所ＣＤ：{1}<br>総量引当場所グループＣＤ：{2}<br>{3}<p>
	 */
	public static String MABSL0192 = "MABSL0192";

	/** LEVEL[W]<br>指定した場所と物流グループに対する場所が異なるため登録できません。<br>場所ＣＤ：{1}<br>物流グループＣＤ：{2}<br>{3}<p>
	 */
	public static String MABSL0193 = "MABSL0193";

	/** LEVEL[W]<br>総量引当場所グループ及び物流グループを指定した場合は、引当範囲区分に「2.総量引当」のみ指定できます。<br>引当範囲区分：{1}<br>{2}<p>
	 */
	public static String MABSL0194 = "MABSL0194";

	/** LEVEL[W]<br>総量引当場所グループ及び場所を指定した場合は、引当範囲区分に「1.場所引当」のみ指定できます。<br>引当範囲区分：{1}<br>{2}<p>
	 */
	public static String MABSL0195 = "MABSL0195";

	/** LEVEL[W]<br>物流グループ及び場所を指定した場合は、引当範囲区分に「1.場所引当」のみ指定できます。<br>引当範囲区分：{1}<br>{2}<p>
	 */
	public static String MABSL0196 = "MABSL0196";

	/** LEVEL[W]<br>部門は計画品目を指定した場合のみ指定できます。<br>{1}<p>
	 */
	public static String MABSL0197 = "MABSL0197";

	/** LEVEL[W]<br>同じ親品目、構成パタン、工程、工程連番、子品目のレコードでロット混在もしくはサブロット混在を異なる設定にできません。<br>{1}<p>
	 */
	public static String MABSL0198 = "MABSL0198";

	/** LEVEL[W]<br>以下のいずれかの項目に0以外の数値を入力する必要があります。<br>子品目必要比率<br>子固定必要数量<br>{1}<p>
	 */
	public static String MABSL0199 = "MABSL0199";

	/** LEVEL[W]<br>継承項目区分に「ACT_CONT_FCTR.実際有効成分係数」を指定した場合は、子品目に有効成分対象がオンの品目のみ指定できます。<br>{1}<p>
	 */
	public static String MABSL0501 = "MABSL0501";

	/** LEVEL[W]<br>継承項目区分に「ACT_CONT_FCTR.実際有効成分係数」を指定した場合は、親品目に有効成分対象がオンの品目のみ指定できます。<br>{1}<p>
	 */
	public static String MABSL0502 = "MABSL0502";

	/** LEVEL[W]<br>有効成分機能が無効な場合は継承項目区分に「ACT_CONT_FCTR.実際有効成分係数」を指定できません。<br>{1}<p>
	 */
	public static String MABSL0503 = "MABSL0503";

	/** LEVEL[W]<br>継承項目区分に「LOT_SUB_CHAR1～5.ロット予備（文字列）１～５」を指定した場合のみ、継承方法区分に「1.文字列結合」を指定できます。<br>{1}<p>
	 */
	public static String MABSL0504 = "MABSL0504";

	/** LEVEL[W]<br>継承項目区分と追加結合項目区分に同じ値は指定できません。<br>{1}<p>
	 */
	public static String MABSL0505 = "MABSL0505";

	/** LEVEL[W]<br>継承方法区分に「1.文字列結合」を指定した場合のみ、追加結合項目区分を指定できます。<br>{1}<p>
	 */
	public static String MABSL0506 = "MABSL0506";

	/** LEVEL[W]<br>追加結合項目区分は「LOT_SUB_CHAR1～5.ロット予備（文字列）１～５」もしくは「LOT_RMRKS.ロット備考」のみ指定できます。<br>{1}<p>
	 */
	public static String MABSL0507 = "MABSL0507";

	/** LEVEL[W]<br>継承方法区分に「1.文字列結合」を指定した場合のみ、桁数超過時エラーをオンにできます。<br>{1}<p>
	 */
	public static String MABSL0508 = "MABSL0508";

	/** LEVEL[W]<br>指定したＩＦ処理区分では使用できない項目が設定されています。<br>ＩＦ処理区分：{1}<br>項目：{2}<br>{3}<p>
	 */
	public static String MABSL0509 = "MABSL0509";

	/** LEVEL[W]<br>ＩＦ処理区分が「F1070.工数実績受信」または「F1080.工数予定送信」であり、かつ、工程または工数管理を指定する場合は、場所も指定してください。<br>{1}<p>
	 */
	public static String MABSL0510 = "MABSL0510";

	/** LEVEL[W]<br>送信処理対象のＩＦ処理区分を指定した場合のみ、外部システムを指定できます。<br>{1}<p>
	 */
	public static String MABSL0511 = "MABSL0511";

	/** LEVEL[W]<br>指定した入庫場所が不正です。以下の入庫場所は指定できません。<br>・場所を指定した場合、指定した場所の物流グループと入庫場所の物流グループが一致する。<br>・物流グループを指定した場合、指定した物流グループと入庫場所の物流グループが一致する。<br>{1}<p>
	 */
	public static String MABSL0512 = "MABSL0512";

	/** LEVEL[W]<br>ＩＦ処理区分に「F1070.工数実績受信」または「F1080.工数予定送信」を指定した場合は、品目を指定できません。<br>{1}<p>
	 */
	public static String MABSL0513 = "MABSL0513";

	/** LEVEL[W]<br>決済方法マスタで債務決済区分に「2.預金（手数料）」もしくは「4.現金（手数料）」が指定されている決済方法を指定した場合は比率に０のみ登録可能です。<br>{1}<p>
	 */
	public static String MABSL0520 = "MABSL0520";

	/** LEVEL[W]<br>決済方法マスタで債務決済区分に「2.預金（手数料）」もしくは「4.現金（手数料）」以外が指定されている決済方法を指定した場合は比率に０は登録できません。<br>{1}<p>
	 */
	public static String MABSL0521 = "MABSL0521";

	/** LEVEL[W]<br>ＦＢ ＩＦ制御マスタの債権決済区分に「1.現金」「2.振込」「3.手形」以外を指定できません。<br>{1}<p>
	 */
	public static String MABSL0522 = "MABSL0522";

	/** LEVEL[W]<br>債権決済区分に「2.振込」以外が指定されている場合は、銀行を指定できません。<br>{1}<p>
	 */
	public static String MABSL0523 = "MABSL0523";

	/** LEVEL[W]<br>債権決済区分に「2.振込」以外が指定されている場合は、口座を指定できません。<br>{1}<p>
	 */
	public static String MABSL0524 = "MABSL0524";

	/** LEVEL[W]<br>取引先が指定されている場合は、取引先無しをオンにできません。<br>{1}<p>
	 */
	public static String MABSL0525 = "MABSL0525";

	/** LEVEL[W]<br>発注点在庫数量が設定されていない、または発注点依頼数量が設定されている場合はロットサイジングをオンにできません。<br>{1}<p>
	 */
	public static String MABSL0526 = "MABSL0526";

	/** LEVEL[W]<br>投入品出庫場所の製造場所グループと場所の製造場所グループが異なっています。<br>{1}<p>
	 */
	public static String MABSL0527 = "MABSL0527";

	/** LEVEL[W]<br>出荷品出庫場所の総量引当場所グループと場所の総量引当場所グループが異なっています。<br>{1}<p>
	 */
	public static String MABSL0528 = "MABSL0528";

	/** LEVEL[W]<br>仕入計上区分に「1.入荷基準」を指定した場合は、検収ＬＴを指定できません。<br>{1}<p>
	 */
	public static String MABSL0529 = "MABSL0529";

	/** LEVEL[W]<br>以下の条件をすべて満たす場合は、検収ＬＴを指定できません。<br>・品目詳細マスタの仕入計上区分が設定されていない<br>・取引先マスタで仕入計上区分に「1.入荷基準」が指定されている<br>取引先ＣＤ：{1}<br>{2}<p>
	 */
	public static String MABSL0530 = "MABSL0530";

	/** LEVEL[W]<br>取引先マスタで下請対象をオンとした場合は、検収ＬＴを指定できません。<br>取引先ＣＤ：{1}<br>{2}<br><p>
	 */
	public static String MABSL0531 = "MABSL0531";

	/** LEVEL[W]<br>取引先マスタで下請対象をオンとした場合は、仕入計上区分を指定できません。<br>取引先ＣＤ：{1}<br>{2}<p>
	 */
	public static String MABSL0532 = "MABSL0532";

	/** LEVEL[W]<br>版マスタに登録されていません。<br>品目：{1}<br>版ＮＯ：{2}<br>{3}<p>
	 */
	public static String MABSL0533 = "MABSL0533";

	/** LEVEL[W]<br>掛率を使用しますが、標準販売単価マスタが登録されていないため単価を取得できません。<br>品目：{1}<br>単位ＣＤ：{2}<br>通貨ＣＤ：{3}<br>ワーキンググループＣＤ：{4}<br>適用日：{5}<br>数量：{6}<p>
	 */
	public static String MABSD0001 = "MABSD0001";

	/** LEVEL[W]<br>場所から取得された部門が指定した日付に対して部門マスタに登録されていません。部門マスタを確認してください。<br>場所ＣＤ：{1}<br>部門ＣＤ：{2}<br>日付：{3}<p>
	 */
	public static String MABSD0002 = "MABSD0002";

	/** LEVEL[W]<br>場所・日付に対する資産管理部門を取得できません。場所マスタ及び場所補助マスタを確認してください。<br>場所ＣＤ：{1}<br>日付：{2}<p>
	 */
	public static String MABSD0003 = "MABSD0003";

	/** LEVEL[W]<br>場所・日付に対する売上部門を取得できません。場所マスタ及び場所補助マスタを確認してください。<br>場所ＣＤ：{1}<br>日付：{2}<p>
	 */
	public static String MABSD0004 = "MABSD0004";

	/** LEVEL[W]<br>取引先から取得された部門が指定した日付に対して部門マスタに登録されていません。部門マスタを確認してください。<br>取引先ＣＤ：{1}<br>部門ＣＤ：{2}<br>日付：{3}<p>
	 */
	public static String MABSD0005 = "MABSD0005";

	/** LEVEL[W]<br>得意先・日付に対する債権部門を取得できません。取引先マスタ及び取引先補助マスタを確認してください。<br>得意先ＣＤ：{1}<br>日付：{2}<p>
	 */
	public static String MABSD0006 = "MABSD0006";

	/** LEVEL[W]<br>請求先・日付に対する請求先担当部門を取得できません。取引先マスタ及び取引先補助マスタを確認してください。<br>請求先ＣＤ：{1}<br>日付：{2}<p>
	 */
	public static String MABSD0007 = "MABSD0007";

	/** LEVEL[W]<br>発注先・日付に対するＶＭＩ購買部門を取得できません。取引先マスタ及び取引先補助マスタを確認してください。<br>発注先ＣＤ：{1}<br>日付：{2}<p>
	 */
	public static String MABSD0008 = "MABSD0008";

	/** LEVEL[W]<br>買掛先・日付に対する債務部門を取得できません。取引先マスタ及び取引先補助マスタを確認してください。<br>買掛先ＣＤ：{1}<br>日付：{2}<p>
	 */
	public static String MABSD0009 = "MABSD0009";

	/** LEVEL[W]<br>支払予定管理先・日付に対する支払予定管理先担当部門を取得できません。取引先マスタ及び取引先補助マスタを確認してください。<br>支払予定管理先ＣＤ：{1}<br>日付：{2}<p>
	 */
	public static String MABSD0010 = "MABSD0010";

	/** LEVEL[W]<br>売上部門に対する場所を取得できません。場所マスタ及び場所補助マスタを確認してください。<br>売上部門ＣＤ：{1}<br>日付：{2}<p>
	 */
	public static String MABSD0011 = "MABSD0011";

	/** LEVEL[W]<br>支払先・日付に対する支払部門を取得できません。取引先マスタ及び取引先補助マスタを確認してください。<br>支払先ＣＤ：{1}<br>日付：{2}<p>
	 */
	public static String MABSD0050 = "MABSD0050";

	/** LEVEL[I]<br>原価ログイン情報のキャッシュをクリアし、再設定しました。<p>
	 */
	public static String MABGP0001 = "MABGP0001";

	/** LEVEL[W]<br>計画月次比率をオフ、または実績月次比率をオンとした場合は、計画基準を指定できません。<br>{1}<p>
	 */
	public static String MABGL0001 = "MABGL0001";

	/** LEVEL[W]<br>計画月次比率をオフ、かつ実績月次比率をオフとした場合は、比率指定区分を指定できません。<br>{1}<p>
	 */
	public static String MABGL0002 = "MABGL0002";

	/** LEVEL[W]<br>集計レポート行と対象レポート行に同じレポート行を指定できません。<br>レポート行：{1}<br>{2}<p>
	 */
	public static String MABGL0003 = "MABGL0003";

	/** LEVEL[W]<br>部門引継をオンとした場合は、配賦先部門を指定できません。<br>配賦先部門ＣＤ：{1}<br>{2}<p>
	 */
	public static String MABGL0005 = "MABGL0005";

	/** LEVEL[W]<br>取引先引継をオンとした場合は、配賦先取引先を指定できません。<br>配賦先取引先ＣＤ：{1}<br>{2}<p>
	 */
	public static String MABGL0006 = "MABGL0006";

	/** LEVEL[W]<br>ロットＮＯ引継をオンとした場合は、配賦先ロットＮＯを指定できません。<br>配賦先ロットＮＯ：{1}<br>{2}<p>
	 */
	public static String MABGL0007 = "MABGL0007";

	/** LEVEL[W]<br>サブロットＮＯ引継をオンとした場合は、配賦先サブロットＮＯを指定できません。<br>配賦先サブロットＮＯ：{1}<br>{2}<p>
	 */
	public static String MABGL0008 = "MABGL0008";

	/** LEVEL[W]<br>手配ＮＯ１引継をオンとした場合は、配賦先手配ＮＯ１を指定できません。<br>配賦先手配ＮＯ１：{1}<br>{2}<p>
	 */
	public static String MABGL0009 = "MABGL0009";

	/** LEVEL[W]<br>手配ＮＯ２引継をオンとした場合は、配賦先手配ＮＯ２を指定できません。<br>配賦先手配ＮＯ２：{1}<br>{2}<p>
	 */
	public static String MABGL0010 = "MABGL0010";

	/** LEVEL[W]<br>手配ＮＯ３引継をオンとした場合は、配賦先手配ＮＯ３を指定できません。<br>配賦先手配ＮＯ３：{1}<br>{2}<p>
	 */
	public static String MABGL0011 = "MABGL0011";

	/** LEVEL[W]<br>一次配賦基準マスタの計画月次比率がオンとされている一次配賦基準を指定した場合は、計画データ予実区分を指定できません。<br>{1}<p>
	 */
	public static String MABGL0012 = "MABGL0012";

	/** LEVEL[W]<br>一次配賦基準マスタの計画月次比率がオンとされている一次配賦基準を指定した場合は、計画キー予実区分を指定できません。<br>{1}<p>
	 */
	public static String MABGL0013 = "MABGL0013";

	/** LEVEL[W]<br>一次配賦基準マスタの計画月次比率がオンとされている一次配賦基準を指定した場合は、計画キー対象年月を指定できません。<br>{1}<p>
	 */
	public static String MABGL0014 = "MABGL0014";

	/** LEVEL[W]<br>一次配賦基準マスタの実績月次比率がオンとされている一次配賦基準を指定した場合は、実績データ予実区分を指定できません。<br>{1}<p>
	 */
	public static String MABGL0015 = "MABGL0015";

	/** LEVEL[W]<br>一次配賦基準マスタの実績月次比率がオンとされている一次配賦基準を指定した場合は、実績キー予実区分を指定できません。<br>{1}<p>
	 */
	public static String MABGL0016 = "MABGL0016";

	/** LEVEL[W]<br>一次配賦基準マスタの実績月次比率がオンとされている一次配賦基準を指定した場合は、実績キー対象年月を指定できません。<br>{1}<p>
	 */
	public static String MABGL0017 = "MABGL0017";

	/** LEVEL[W]<br>金額設定区分に「3.直近確定総平均単価」または「4.直近確定総平均単価（標準）」を指定した場合のみ計算グループを指定できます。<br>{1}<p>
	 */
	public static String MABGL0018 = "MABGL0018";

	/** LEVEL[W]<br>登録対象が既に存在します。検索後に更新してください。<br>{1}<p>
	 */
	public static String MABGL0019 = "MABGL0019";

	/** LEVEL[W]<br>配賦対象区分に「4.売上」以外を指定した場合は、費目区分が「1.製造・売上原価費目」となる費目のみ指定できます。<br>{1}<p>
	 */
	public static String MABGL0020 = "MABGL0020";

	/** LEVEL[W]<br>配賦対象区分に「4.売上」を指定した場合は、費目区分が「2.販売・一般管理費目」となる費目のみ指定できます。<br>{1}<p>
	 */
	public static String MABGL0021 = "MABGL0021";

	/** LEVEL[W]<br>配賦対象区分に「1.製造」を指定した場合は、配賦方法区分に「5.利益」を指定できません。<br>{1}<p>
	 */
	public static String MABGL0022 = "MABGL0022";

	/** LEVEL[W]<br>配賦対象区分に「2.購買」を指定した場合は、配賦方法区分に「1.工数」、「5.利益」または「6.投入数量」を指定できません。<br>{1}<p>
	 */
	public static String MABGL0023 = "MABGL0023";

	/** LEVEL[W]<br>配賦対象区分に「3.製造・購買」を指定した場合は、配賦方法区分に「5.利益」を指定できません。<br>{1}<p>
	 */
	public static String MABGL0024 = "MABGL0024";

	/** LEVEL[W]<br>配賦対象区分に「4.売上」を指定した場合は、配賦方法区分に「1.工数」または「6.投入数量」を指定できません。<br>{1}<p>
	 */
	public static String MABGL0025 = "MABGL0025";

	/** LEVEL[W]<br>配賦対象区分に「5.汎用配賦」を指定した場合は、配賦方法区分に「1.工数」、「4.費目別原価」、「5.利益」または「6.投入数量」を指定できません。<br>{1}<p>
	 */
	public static String MABGL0026 = "MABGL0026";

	/** LEVEL[W]<br>配賦対象区分が「4.売上」となる配賦パタンを指定した場合は、自工程対象をオンにできません。<br>{1}<p>
	 */
	public static String MABGL0027 = "MABGL0027";

	/** LEVEL[W]<br>配賦対象区分が「4.売上」となる配賦パタンを指定した場合は、投入対象区分を指定できません。<br>{1}<p>
	 */
	public static String MABGL0028 = "MABGL0028";

	/** LEVEL[W]<br>投入対象区分に「4.全投入品目」を指定した場合のみ品群または品目を指定できます。<br>{1}<p>
	 */
	public static String MABGL0029 = "MABGL0029";

	/** LEVEL[W]<br>レポート対象区分に「5.入出庫」または「R.入出庫金額」を指定した場合のみ原価入出庫区分を指定できます。<br>{1}<p>
	 */
	public static String MABGL0030 = "MABGL0030";

	/** LEVEL[W]<br>帳票ＩＤに原価管理の帳票ではないＩＤが指定されています。<br>{1}<p>
	 */
	public static String MABGL0031 = "MABGL0031";

	/** LEVEL[W]<br>新規追加行は、既に登録されています。<br>計算グループＣＤ：{1}<br>優先順位：{2}<br>計算カテゴリ区分：{3}<p>
	 */
	public static String MABGL0032 = "MABGL0032";

	/** LEVEL[W]<br>レポート対象区分に「Z.配賦」を指定した場合のみ配賦科目グループ１～３および配賦科目を指定できます。<br>{1}<p>
	 */
	public static String MABGL0057 = "MABGL0057";

	/** LEVEL[W]<br>入出庫振替区分に「1.費用振替」または「2.投入振替」を指定した場合のみ配賦科目を指定できます。<br>{1}<p>
	 */
	public static String MABGL0058 = "MABGL0058";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ配賦振替をオンにできます。<br>{1}<p>
	 */
	public static String MABGL0059 = "MABGL0059";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ部門引継をオンにできます。<br>{1}<p>
	 */
	public static String MABGL0061 = "MABGL0061";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ配賦先部門を指定できます。<br>{1}<p>
	 */
	public static String MABGL0062 = "MABGL0062";

	/** LEVEL[W]<br>部門引継をオンとした場合は、配賦先部門を指定できません。<br>{1}<p>
	 */
	public static String MABGL0063 = "MABGL0063";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ場所引継をオンにできます。<br>{1}<p>
	 */
	public static String MABGL0064 = "MABGL0064";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ配賦先場所を指定できます。<br>{1}<p>
	 */
	public static String MABGL0065 = "MABGL0065";

	/** LEVEL[W]<br>場所引継をオンとした場合は、配賦先場所を指定できません。<br>{1}<p>
	 */
	public static String MABGL0066 = "MABGL0066";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ工程引継をオンにできます。<br>{1}<p>
	 */
	public static String MABGL0067 = "MABGL0067";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ配賦先工程を指定できます。<br>{1}<p>
	 */
	public static String MABGL0068 = "MABGL0068";

	/** LEVEL[W]<br>工程引継をオンとした場合は、配賦先工程を指定できません。<br>{1}<p>
	 */
	public static String MABGL0069 = "MABGL0069";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ取引先引継をオンにできます。<br>{1}<p>
	 */
	public static String MABGL0070 = "MABGL0070";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ配賦先取引先を指定できます。<br>{1}<p>
	 */
	public static String MABGL0071 = "MABGL0071";

	/** LEVEL[W]<br>取引先引継をオンとした場合は、配賦先取引先を指定できません。<br>{1}<p>
	 */
	public static String MABGL0072 = "MABGL0072";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ品群引継をオンにできます。<br>{1}<p>
	 */
	public static String MABGL0073 = "MABGL0073";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ配賦先品群を指定できます。<br>{1}<p>
	 */
	public static String MABGL0074 = "MABGL0074";

	/** LEVEL[W]<br>品群引継をオンとした場合は、配賦先品群を指定できません。<br>{1}<p>
	 */
	public static String MABGL0075 = "MABGL0075";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ品目引継をオンにできます。<br>{1}<p>
	 */
	public static String MABGL0076 = "MABGL0076";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ配賦品目を指定できます。<br>{1}<p>
	 */
	public static String MABGL0077 = "MABGL0077";

	/** LEVEL[W]<br>品目引継をオンとした場合は、配賦品目を指定できません。<br>{1}<p>
	 */
	public static String MABGL0078 = "MABGL0078";

	/** LEVEL[W]<br>配賦科目を指定した場合のみロットＮＯ引継をオンにできます。<br>{1}<p>
	 */
	public static String MABGL0079 = "MABGL0079";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ配賦先ロットＮＯを指定できます。<br>{1}<p>
	 */
	public static String MABGL0080 = "MABGL0080";

	/** LEVEL[W]<br>ロットＮＯ引継をオンとした場合は、配賦先ロットＮＯを指定できません。<br>{1}<p>
	 */
	public static String MABGL0081 = "MABGL0081";

	/** LEVEL[W]<br>配賦科目を指定した場合のみサブロットＮＯ引継をオンにできます。<br>{1}<p>
	 */
	public static String MABGL0082 = "MABGL0082";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ配賦先サブロットＮＯを指定できます。<br>{1}<p>
	 */
	public static String MABGL0083 = "MABGL0083";

	/** LEVEL[W]<br>サブロットＮＯ引継をオンとした場合は、配賦先サブロットＮＯを指定できません。<br>{1}<p>
	 */
	public static String MABGL0084 = "MABGL0084";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ手配ＮＯ１引継をオンにできます。<br>{1}<p>
	 */
	public static String MABGL0085 = "MABGL0085";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ配賦先手配ＮＯ１を指定できます。<br>{1}<p>
	 */
	public static String MABGL0086 = "MABGL0086";

	/** LEVEL[W]<br>手配ＮＯ１引継をオンとした場合は、配賦先手配ＮＯ１を指定できません。<br>{1}<p>
	 */
	public static String MABGL0087 = "MABGL0087";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ手配ＮＯ２引継をオンにできます。<br>{1}<p>
	 */
	public static String MABGL0088 = "MABGL0088";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ配賦先手配ＮＯ２を指定できます。<br>{1}<p>
	 */
	public static String MABGL0089 = "MABGL0089";

	/** LEVEL[W]<br>手配ＮＯ２引継をオンとした場合は、配賦先手配ＮＯ２を指定できません。<br>{1}<p>
	 */
	public static String MABGL0090 = "MABGL0090";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ手配ＮＯ３引継をオンにできます。<br>{1}<p>
	 */
	public static String MABGL0091 = "MABGL0091";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ配賦先手配ＮＯ３を指定できます。<br>{1}<p>
	 */
	public static String MABGL0092 = "MABGL0092";

	/** LEVEL[W]<br>手配ＮＯ３引継をオンとした場合は、配賦先手配ＮＯ３を指定できません。<br>{1}<p>
	 */
	public static String MABGL0093 = "MABGL0093";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ品目指図ＮＯ引継をオンにできます。<br>{1}<p>
	 */
	public static String MABGL0094 = "MABGL0094";

	/** LEVEL[W]<br>入出庫振替区分に「2.投入振替」を指定した場合のみ投入場所区分１を指定できます。<br>{1}<p>
	 */
	public static String MABGL0095 = "MABGL0095";

	/** LEVEL[W]<br>投入場所区分１を指定した場合のみ投入場所区分２を指定できます。<br>{1}<p>
	 */
	public static String MABGL0096 = "MABGL0096";

	/** LEVEL[W]<br>投入場所区分２を指定した場合のみ投入場所区分３を指定できます。<br>{1}<p>
	 */
	public static String MABGL0097 = "MABGL0097";

	/** LEVEL[W]<br>数量を管理していないレポート対象区分を指定した場合は、数量単位区分を指定できません。<br>{1}<p>
	 */
	public static String MABGL0098 = "MABGL0098";

	/** LEVEL[W]<br>計算区分に「3.原価計算（在庫計算）」以外を指定した場合は、金額評価区分を指定できません。<br>{1}<p>
	 */
	public static String MABGL0100 = "MABGL0100";

	/** LEVEL[W]<br>計算順序グループを指定した場合のみ計算順序を指定できます。<br>{1}<p>
	 */
	public static String MABGL0101 = "MABGL0101";

	/** LEVEL[W]<br>配賦係数構成区分に「1.配賦係数構成マスタ」を指定した場合は、数量単位区分を指定できません。<br>{1}<p>
	 */
	public static String MABGL0102 = "MABGL0102";

	/** LEVEL[W]<br>手配ＮＯ４引継をオンとした場合は、配賦先手配ＮＯ４を指定できません。<br>配賦先手配ＮＯ４：{1}<br>{2}<p>
	 */
	public static String MABGL0103 = "MABGL0103";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ手配ＮＯ４引継をオンにできます。<br>{1}<p>
	 */
	public static String MABGL0104 = "MABGL0104";

	/** LEVEL[W]<br>配賦科目を指定した場合のみ配賦先手配ＮＯ４を指定できます。<br>{1}<p>
	 */
	public static String MABGL0105 = "MABGL0105";

	/** LEVEL[W]<br>手配ＮＯ４引継をオンとした場合は、配賦先手配ＮＯ４を指定できません。<br>{1}<p>
	 */
	public static String MABGL0106 = "MABGL0106";

	/** LEVEL[W]<br>集計行をオンとした場合は、以下の項目を指定できません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABGL0107 = "MABGL0107";

	/** LEVEL[W]<br>集計列をオンとした場合は、以下の項目を指定できません。<br>項目：{1}<br>{2}<p>
	 */
	public static String MABGL0108 = "MABGL0108";

	/** LEVEL[W]<br>配賦科目配賦区分には「2.対象外（引き継がない）」を指定できません。<br>{1}<p>
	 */
	public static String MABGL0109 = "MABGL0109";

	/** LEVEL[W]<br>ワーキンググループ配賦区分には「2.対象外（引き継がない）」を指定できません。<br>{1}<p>
	 */
	public static String MABGL0110 = "MABGL0110";

	/** LEVEL[W]<br>配賦振替を指定した場合のみ配賦ワーキンググループを指定できます。<br>{1}<p>
	 */
	public static String MABGL0111 = "MABGL0111";

	/** LEVEL[W]<br>指定された会計伝票区分は本画面で指定できません。<br>{1}<p>
	 */
	public static String MABGL0112 = "MABGL0112";

	/** LEVEL[W]<br>原価テーブル区分で「ACT_SLS_IF.売上実績ＩＦ」を指定した場合は、対象項目区分に「PO_NO.発注ＮＯ」を指定できません。<br>{1}<p>
	 */
	public static String MABGL0113 = "MABGL0113";

	/** LEVEL[W]<br>切捨をオフにした場合は、費目を指定できません。<br>{1}<p>
	 */
	public static String MABGL0114 = "MABGL0114";

	/** LEVEL[W]<br>一括指定をオフにした場合は、評価率（％）を指定できません。<br>{1}<br><p>
	 */
	public static String MABGL0115 = "MABGL0115";

	/** LEVEL[W]<br>一括指定をオンにした場合は、単価設定区分を指定できません。<br>{1}<p>
	 */
	public static String MABGL0116 = "MABGL0116";

	/** LEVEL[W]<br>配賦係数に対する配賦係数構成区分と品目分類区分の組み合わせが正しくありません。<br>配賦構成区分：{1}<br>品目分類区分：{2}<br>{3}<p>
	 */
	public static String MABGL0117 = "MABGL0117";

	/** LEVEL[W]<br>配賦係数構成区分に「2.品目仕訳」を指定した配賦係数の場合のみ品目仕訳を指定できます。<br>{1}<p>
	 */
	public static String MABGL0118 = "MABGL0118";

	/** LEVEL[W]<br>配賦係数構成区分に「A.品目分類１」～「J.品目分類１０」を指定した配賦係数の場合のみ品目分類を指定できます。<br>{1}<p>
	 */
	public static String MABGL0119 = "MABGL0119";

	/** LEVEL[W]<br>単位数量区分が設定されている配賦係数の場合のみ単位を指定できます。<br>{1}<p>
	 */
	public static String MABGL0120 = "MABGL0120";

	/** LEVEL[W]<br>レポートキー区分に対する品目分類区分と品目分類に対する品目分類区分が一致していません。<br>品目分類ＣＤ：{1}<br>{2}<p>
	 */
	public static String MABGL0121 = "MABGL0121";

	/** LEVEL[W]<br>展開計算区分に「1.計算対象外」が指定されている、または計算区分に「3.原価計算（在庫計算）」以外が指定されている場合は、移動計算をオンにできません。<br>{1}<p>
	 */
	public static String MABGL0122 = "MABGL0122";

	/** LEVEL[W]<br>受払集計単位区分に「3.受払対象・会計伝票・会計理由単位」以外を指定した場合は、会計理由ＣＤを指定できません。<br>受払表ＩＤ：{1}<br>受払項目ＣＤ：{2}<br>{3}<p>
	 */
	public static String MABGL0123 = "MABGL0123";

	/** LEVEL[W]<br>指定の受払対象区分の場合は、受払集計単位区分に「1.受払対象単位」のみ指定できます。<br>受払表ＩＤ：{1}<br>受払項目ＣＤ：{2}<br>受払対象区分：{3}<br>{4}<p>
	 */
	public static String MABGL0124 = "MABGL0124";

	/** LEVEL[W]<br>受払対象区分 に「T.総平均単価」を指定した場合は、差額計算区分に「1.対象外」のみ指定できます。<br>受払表ＩＤ：{1}<br>受払項目ＣＤ：{2}<br>{3}<p>
	 */
	public static String MABGL0125 = "MABGL0125";

	/** LEVEL[W]<br>銀行マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0001 = "MAUAL0001";

	/** LEVEL[W]<br>銀行支店マスタで銀行に対する支店として指定されていません。<br>銀行ＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0002 = "MAUAL0002";

	/** LEVEL[W]<br>汎用分類マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0003 = "MAUAL0003";

	/** LEVEL[W]<br>担当者マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0004 = "MAUAL0004";

	/** LEVEL[W]<br>会計部門マスタで適用日に対する会計部門として指定されていません。<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0005 = "MAUAL0005";

	/** LEVEL[W]<br>予備科目区分マスタで予備科目区分に対する科目区分として指定されていません。<br>予備科目区分：{1}<br>{2}<p>
	 */
	public static String MAUAL0006 = "MAUAL0006";

	/** LEVEL[W]<br>会計税マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0007 = "MAUAL0007";

	/** LEVEL[W]<br>勘定科目マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0008 = "MAUAL0008";

	/** LEVEL[W]<br>補助勘定科目マスタで勘定科目に対する補助勘定科目として指定されていません。<br>勘定科目ＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0009 = "MAUAL0009";

	/** LEVEL[W]<br>自動仕訳キーマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0010 = "MAUAL0010";

	/** LEVEL[W]<br>手形理由マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0011 = "MAUAL0011";

	/** LEVEL[W]<br>仕訳実行マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0012 = "MAUAL0012";

	/** LEVEL[W]<br>仕訳グループマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0013 = "MAUAL0013";

	/** LEVEL[W]<br>自動仕訳パタン基本マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0014 = "MAUAL0014";

	/** LEVEL[W]<br>会計理由マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0015 = "MAUAL0015";

	/** LEVEL[W]<br>口座マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0016 = "MAUAL0016";

	/** LEVEL[W]<br>品目仕訳マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0017 = "MAUAL0017";

	/** LEVEL[W]<br>通貨マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0018 = "MAUAL0018";

	/** LEVEL[W]<br>総量引当場所グループマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0019 = "MAUAL0019";

	/** LEVEL[W]<br>カレンダ基本マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0020 = "MAUAL0020";

	/** LEVEL[W]<br>業務理由マスタに他勘定出庫理由として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0021 = "MAUAL0021";

	/** LEVEL[W]<br>国マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0022 = "MAUAL0022";

	/** LEVEL[W]<br>物流グループマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0023 = "MAUAL0023";

	/** LEVEL[W]<br>製造場所グループマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0024 = "MAUAL0024";

	/** LEVEL[W]<br>伝票帳票マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0025 = "MAUAL0025";

	/** LEVEL[W]<br>輸送方法マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0026 = "MAUAL0026";

	/** LEVEL[W]<br>単位マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0027 = "MAUAL0027";

	/** LEVEL[W]<br>地域マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0028 = "MAUAL0028";

	/** LEVEL[W]<br>為替レート基本マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0029 = "MAUAL0029";

	/** LEVEL[W]<br>ＨＳ分類マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0030 = "MAUAL0030";

	/** LEVEL[W]<br>ＨＳマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0031 = "MAUAL0031";

	/** LEVEL[W]<br>品目分類マスタで品目分類区分に対する品目分類として指定されていません。<br>品目分類区分：{1}<br>{2}<p>
	 */
	public static String MAUAL0032 = "MAUAL0032";

	/** LEVEL[W]<br>会計品目分類マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0033 = "MAUAL0033";

	/** LEVEL[W]<br>業務理由マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0034 = "MAUAL0034";

	/** LEVEL[W]<br>工数理由マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0035 = "MAUAL0035";

	/** LEVEL[W]<br>工数管理マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0036 = "MAUAL0036";

	/** LEVEL[W]<br>工程マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0037 = "MAUAL0037";

	/** LEVEL[W]<br>取引先分類マスタで取引先分類区分に対する取引先分類として指定されていません。<br>取引先分類区分：{1}<br>{2}<p>
	 */
	public static String MAUAL0038 = "MAUAL0038";

	/** LEVEL[W]<br>取引条件マスタで取引条件区分に対する取引条件として指定されていません。<br>取引条件区分：{1}<br>{2}<p>
	 */
	public static String MAUAL0039 = "MAUAL0039";

	/** LEVEL[W]<br>相殺グループマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0040 = "MAUAL0040";

	/** LEVEL[W]<br>出荷条件マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0041 = "MAUAL0041";

	/** LEVEL[W]<br>品群グループマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0042 = "MAUAL0042";

	/** LEVEL[W]<br>港マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0043 = "MAUAL0043";

	/** LEVEL[W]<br>輸出梱包容器マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0044 = "MAUAL0044";

	/** LEVEL[W]<br>格付マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0045 = "MAUAL0045";

	/** LEVEL[W]<br>取引マスタで以下の条件に対する取引として指定されていません。<br>取引パタン区分：{1}<br>機能ＩＤ：{2}<br>{3}<p>
	 */
	public static String MAUAL0046 = "MAUAL0046";

	/** LEVEL[W]<br>販売単価分類マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0047 = "MAUAL0047";

	/** LEVEL[W]<br>販売単価ランクマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0048 = "MAUAL0048";

	/** LEVEL[W]<br>品目出荷グループマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0049 = "MAUAL0049";

	/** LEVEL[W]<br>出荷有効期限グループマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0050 = "MAUAL0050";

	/** LEVEL[W]<br>版マスタで以下の条件に対する版ＮＯとして指定されていません。<br>品目：{1}<br>工場・物流倉庫ＣＤ：{2}<br>{3}<p>
	 */
	public static String MAUAL0051 = "MAUAL0051";

	/** LEVEL[W]<br>原価費目グループマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0052 = "MAUAL0052";

	/** LEVEL[W]<br>原価費目マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0053 = "MAUAL0053";

	/** LEVEL[W]<br>原価メニューマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0054 = "MAUAL0054";

	/** LEVEL[W]<br>工場・物流倉庫マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0055 = "MAUAL0055";

	/** LEVEL[W]<br>ワーキンググループマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0056 = "MAUAL0056";

	/** LEVEL[W]<br>場所マスタに有効な場所として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0057 = "MAUAL0057";

	/** LEVEL[W]<br>棚・ラインマスタで場所に対する棚・ラインとして指定されていません。<br>場所ＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0058 = "MAUAL0058";

	/** LEVEL[W]<br>品目区分詳細マスタで品目区分に対する品目区分詳細として指定されていません。<br>品目区分：{1}<br>{2}<p>
	 */
	public static String MAUAL0059 = "MAUAL0059";

	/** LEVEL[W]<br>仕様マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0060 = "MAUAL0060";

	/** LEVEL[W]<br>仕様項目マスタで仕様に対する仕様項目として指定されていません。<br>仕様ＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0061 = "MAUAL0061";

	/** LEVEL[W]<br>品目仕様分類マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0062 = "MAUAL0062";

	/** LEVEL[W]<br>品目構成グループマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0063 = "MAUAL0063";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・担当者が所属する部門として担当者権限マスタに設定されていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0064 = "MAUAL0064";

	/** LEVEL[W]<br>部門階層マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0065 = "MAUAL0065";

	/** LEVEL[W]<br>データアクセス基本マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0066 = "MAUAL0066";

	/** LEVEL[W]<br>承認役割マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0067 = "MAUAL0067";

	/** LEVEL[W]<br>発番パタンマスタで発番業務区分に対する発番パタンとして指定されていません。<br>発番業務区分：{1}<br>{2}<p>
	 */
	public static String MAUAL0068 = "MAUAL0068";

	/** LEVEL[W]<br>対象期間マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0069 = "MAUAL0069";

	/** LEVEL[W]<br>予備科目区分マスタに予備科目区分１として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0070 = "MAUAL0070";

	/** LEVEL[W]<br>予備科目区分マスタに予備科目区分２として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0071 = "MAUAL0071";

	/** LEVEL[W]<br>予備科目区分マスタに予備科目区分３として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0072 = "MAUAL0072";

	/** LEVEL[W]<br>予備科目区分マスタに予備科目区分４として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0073 = "MAUAL0073";

	/** LEVEL[W]<br>予備科目区分マスタに予備科目区分５として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0074 = "MAUAL0074";

	/** LEVEL[W]<br>予備科目区分マスタにＡＰ科目区分として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0075 = "MAUAL0075";

	/** LEVEL[W]<br>予備科目区分マスタにＡＲ科目区分として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0076 = "MAUAL0076";

	/** LEVEL[W]<br>税マスタに売上税として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0077 = "MAUAL0077";

	/** LEVEL[W]<br>税マスタに仕入税として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0078 = "MAUAL0078";

	/** LEVEL[W]<br>税マスタに支給税として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0079 = "MAUAL0079";

	/** LEVEL[W]<br>注文書表示マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0080 = "MAUAL0080";

	/** LEVEL[W]<br>計算パタンマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0081 = "MAUAL0081";

	/** LEVEL[W]<br>計算グループマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0082 = "MAUAL0082";

	/** LEVEL[W]<br>品目分類マスタに品目分類１として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0083 = "MAUAL0083";

	/** LEVEL[W]<br>品目分類マスタに品目分類２として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0084 = "MAUAL0084";

	/** LEVEL[W]<br>品目分類マスタに品目分類３として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0085 = "MAUAL0085";

	/** LEVEL[W]<br>品目分類マスタに品目分類４として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0086 = "MAUAL0086";

	/** LEVEL[W]<br>品目分類マスタに品目分類５として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0087 = "MAUAL0087";

	/** LEVEL[W]<br>品目分類マスタに品目分類６として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0088 = "MAUAL0088";

	/** LEVEL[W]<br>品目分類マスタに品目分類７として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0089 = "MAUAL0089";

	/** LEVEL[W]<br>品目分類マスタに品目分類８として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0090 = "MAUAL0090";

	/** LEVEL[W]<br>品目分類マスタに品目分類９として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0091 = "MAUAL0091";

	/** LEVEL[W]<br>品目分類マスタに品目分類１０として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0092 = "MAUAL0092";

	/** LEVEL[W]<br>取引先分類マスタに取引先分類１として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0093 = "MAUAL0093";

	/** LEVEL[W]<br>取引先分類マスタに取引先分類２として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0094 = "MAUAL0094";

	/** LEVEL[W]<br>取引先分類マスタに取引先分類３として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0095 = "MAUAL0095";

	/** LEVEL[W]<br>取引先分類マスタに取引先分類４として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0096 = "MAUAL0096";

	/** LEVEL[W]<br>取引先分類マスタに取引先分類５として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0097 = "MAUAL0097";

	/** LEVEL[W]<br>取引先分類マスタに取引先分類６として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0098 = "MAUAL0098";

	/** LEVEL[W]<br>取引先分類マスタに取引先分類７として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0099 = "MAUAL0099";

	/** LEVEL[W]<br>取引先分類マスタに取引先分類８として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0100 = "MAUAL0100";

	/** LEVEL[W]<br>取引先分類マスタに取引先分類９として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0101 = "MAUAL0101";

	/** LEVEL[W]<br>取引先分類マスタに取引先分類１０として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0102 = "MAUAL0102";

	/** LEVEL[W]<br>取引先マスタで得意先がオンに設定されていません。<br>{1}<p>
	 */
	public static String MAUAL0103 = "MAUAL0103";

	/** LEVEL[W]<br>取引先マスタで売掛先がオンに設定されていません。<br>{1}<p>
	 */
	public static String MAUAL0104 = "MAUAL0104";

	/** LEVEL[W]<br>取引先マスタで請求先がオンに設定されていません。<br>{1}<p>
	 */
	public static String MAUAL0105 = "MAUAL0105";

	/** LEVEL[W]<br>取引先マスタで入金先がオンに設定されていません。<br>{1}<p>
	 */
	public static String MAUAL0106 = "MAUAL0106";

	/** LEVEL[W]<br>取引先マスタで発注先がオンに設定されていません。<br>{1}<p>
	 */
	public static String MAUAL0107 = "MAUAL0107";

	/** LEVEL[W]<br>取引先マスタで買掛先がオンに設定されていません。<br>{1}<p>
	 */
	public static String MAUAL0108 = "MAUAL0108";

	/** LEVEL[W]<br>取引先マスタで支払予定管理先がオンに設定されていません。<br>{1}<p>
	 */
	public static String MAUAL0109 = "MAUAL0109";

	/** LEVEL[W]<br>取引先マスタで支払先がオンに設定されていません。<br>{1}<p>
	 */
	public static String MAUAL0110 = "MAUAL0110";

	/** LEVEL[W]<br>取引先マスタで与信管理先がオンに設定されていません。<br>{1}<p>
	 */
	public static String MAUAL0111 = "MAUAL0111";

	/** LEVEL[W]<br>取引先マスタで納品先がオンに設定されていません。<br>{1}<p>
	 */
	public static String MAUAL0112 = "MAUAL0112";

	/** LEVEL[W]<br>取引先マスタでメーカがオンに設定されていません。<br>{1}<p>
	 */
	public static String MAUAL0113 = "MAUAL0113";

	/** LEVEL[W]<br>取引先マスタで仕向先がオンに設定されていません。<br>{1}<p>
	 */
	public static String MAUAL0114 = "MAUAL0114";

	/** LEVEL[W]<br>購買内示マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0115 = "MAUAL0115";

	/** LEVEL[W]<br>会社マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0116 = "MAUAL0116";

	/** LEVEL[W]<br>取引先マスタに有効な取引先として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0117 = "MAUAL0117";

	/** LEVEL[W]<br>原価個別受払表マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0118 = "MAUAL0118";

	/** LEVEL[W]<br>原価個別受払表構成マスタで以下の条件に対する受払項目として指定されていません。<br>受払表ＩＤ：{1}<br>受払集計単位区分：{2}<br>{3}<p>
	 */
	public static String MAUAL0119 = "MAUAL0119";

	/** LEVEL[W]<br>自動仕訳パタンマスタで仕訳パタンに対する連番として指定されていません。<br>仕訳パタンＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0120 = "MAUAL0120";

	/** LEVEL[W]<br>税マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0121 = "MAUAL0121";

	/** LEVEL[W]<br>業務理由マスタに仕入理由として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0122 = "MAUAL0122";

	/** LEVEL[W]<br>業務理由マスタに仕入返品理由として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0123 = "MAUAL0123";

	/** LEVEL[W]<br>業務理由マスタに仕入調整理由として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0124 = "MAUAL0124";

	/** LEVEL[W]<br>業務理由マスタに売上理由として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0125 = "MAUAL0125";

	/** LEVEL[W]<br>業務理由マスタに売上返品理由として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0126 = "MAUAL0126";

	/** LEVEL[W]<br>業務理由マスタに売上調整理由として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0127 = "MAUAL0127";

	/** LEVEL[W]<br>業務理由マスタに他勘定入庫理由として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0128 = "MAUAL0128";

	/** LEVEL[W]<br>業務理由マスタに廃棄理由として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0129 = "MAUAL0129";

	/** LEVEL[W]<br>業務理由マスタに在庫振替理由として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0130 = "MAUAL0130";

	/** LEVEL[W]<br>業務理由マスタに移送理由として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0131 = "MAUAL0131";

	/** LEVEL[W]<br>業務理由マスタに出来高理由として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0132 = "MAUAL0132";

	/** LEVEL[W]<br>業務理由マスタにロス理由として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0133 = "MAUAL0133";

	/** LEVEL[W]<br>業務理由マスタに検査不良理由として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0134 = "MAUAL0134";

	/** LEVEL[W]<br>業務理由マスタに工程外注理由として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0135 = "MAUAL0135";

	/** LEVEL[W]<br>業務理由マスタに投入他勘定入庫理由として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0136 = "MAUAL0136";

	/** LEVEL[W]<br>配賦パタンマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0137 = "MAUAL0137";

	/** LEVEL[W]<br>配賦科目グループマスタで配賦科目グループ区分に対する配賦科目グループとして指定されていません。<br>配賦科目グループ区分：{1}<br>{2}<p>
	 */
	public static String MAUAL0138 = "MAUAL0138";

	/** LEVEL[W]<br>配賦科目マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0139 = "MAUAL0139";

	/** LEVEL[W]<br>個別受払表構成マスタに未登録のものが、受払表マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0140 = "MAUAL0140";

	/** LEVEL[W]<br>計算カテゴリマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0141 = "MAUAL0141";

	/** LEVEL[W]<br>配賦科目グループマスタに配賦科目グループ区分１として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0142 = "MAUAL0142";

	/** LEVEL[W]<br>配賦科目グループマスタに配賦科目グループ区分２として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0143 = "MAUAL0143";

	/** LEVEL[W]<br>配賦科目グループマスタに配賦科目グループ区分３として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0144 = "MAUAL0144";

	/** LEVEL[W]<br>取引条件マスタに取引条件区分１として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0145 = "MAUAL0145";

	/** LEVEL[W]<br>取引条件マスタに取引条件区分２として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0146 = "MAUAL0146";

	/** LEVEL[W]<br>取引条件マスタに取引条件区分３として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0147 = "MAUAL0147";

	/** LEVEL[W]<br>販売分析マスタに販売分析区分１として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0148 = "MAUAL0148";

	/** LEVEL[W]<br>販売分析マスタに販売分析区分２として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0149 = "MAUAL0149";

	/** LEVEL[W]<br>販売分析マスタに販売分析区分３として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0150 = "MAUAL0150";

	/** LEVEL[W]<br>販売分析マスタで販売分析区分に対する販売分析として指定されていません。<br>販売分析区分：{1}<br>{2}<p>
	 */
	public static String MAUAL0151 = "MAUAL0151";

	/** LEVEL[W]<br>売上分類マスタで売上分類区分に対する売上分類として指定されていません。<br>売上分類区分：{1}<br>{2}<p>
	 */
	public static String MAUAL0152 = "MAUAL0152";

	/** LEVEL[W]<br>原価売上分類マスタに売上分類区分１として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0153 = "MAUAL0153";

	/** LEVEL[W]<br>原価売上分類マスタに売上分類区分２として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0154 = "MAUAL0154";

	/** LEVEL[W]<br>原価売上分類マスタに売上分類区分３として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0155 = "MAUAL0155";

	/** LEVEL[W]<br>原価売上分類マスタに売上分類区分４として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0156 = "MAUAL0156";

	/** LEVEL[W]<br>原価売上分類マスタに売上分類区分５として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0157 = "MAUAL0157";

	/** LEVEL[W]<br>汎用配賦分類マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0158 = "MAUAL0158";

	/** LEVEL[W]<br>格付マスタに出荷可能な格付として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0159 = "MAUAL0159";

	/** LEVEL[W]<br>格付マスタに投入引当可能な格付として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0160 = "MAUAL0160";

	/** LEVEL[W]<br>輸送方法マスタに、出荷に対して使用可能な輸送方法として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0161 = "MAUAL0161";

	/** LEVEL[W]<br>輸送方法マスタに、輸出に対して使用可能な輸送方法として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0162 = "MAUAL0162";

	/** LEVEL[W]<br>輸送方法マスタに、輸入に対して使用可能な輸送方法として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0163 = "MAUAL0163";

	/** LEVEL[W]<br>ワーキンググループマスタに販売機能を持つワーキンググループとして登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0164 = "MAUAL0164";

	/** LEVEL[W]<br>ワーキンググループマスタに物流機能を持つワーキンググループとして登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0165 = "MAUAL0165";

	/** LEVEL[W]<br>ワーキンググループマスタに製造機能を持つワーキンググループとして登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0166 = "MAUAL0166";

	/** LEVEL[W]<br>ワーキンググループマスタに購買機能を持つワーキンググループとして登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0167 = "MAUAL0167";

	/** LEVEL[W]<br>ワーキンググループマスタに債権機能を持つワーキンググループとして登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0168 = "MAUAL0168";

	/** LEVEL[W]<br>ワーキンググループマスタに債務機能を持つワーキンググループとして登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0169 = "MAUAL0169";

	/** LEVEL[W]<br>ワーキンググループマスタに需給機能を持つワーキンググループとして登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0170 = "MAUAL0170";

	/** LEVEL[W]<br>口座マスタに社内口座として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0171 = "MAUAL0171";

	/** LEVEL[W]<br>口座マスタに社外口座として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0172 = "MAUAL0172";

	/** LEVEL[W]<br>決済方法マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0173 = "MAUAL0173";

	/** LEVEL[W]<br>決済方法マスタに債権決済区分が「4.相殺（借方）」として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0174 = "MAUAL0174";

	/** LEVEL[W]<br>一次配賦パタンマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0175 = "MAUAL0175";

	/** LEVEL[W]<br>配賦係数マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0176 = "MAUAL0176";

	/** LEVEL[W]<br>原価部門マスタで適用年月に対する原価部門として指定されていません。<br>適用年月：{1}<br>{2}<p>
	 */
	public static String MAUAL0177 = "MAUAL0177";

	/** LEVEL[W]<br>一次配賦先部門マスタで期に対する配賦先部門パタンとして指定されていません。<br>期：{1}<br>{2}<p>
	 */
	public static String MAUAL0178 = "MAUAL0178";

	/** LEVEL[W]<br>ワーキンググループマスタに物流機能もしくは製造機能を持つワーキンググループとして登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0179 = "MAUAL0179";

	/** LEVEL[W]<br>物流グループマスタに有効な物流グループとして登録されていない、もしくは物流グループマスタで場所設定にオフが指定されています。<br>{1}<p>
	 */
	public static String MAUAL0180 = "MAUAL0180";

	/** LEVEL[W]<br>配賦方法マスタで期に対する費目別原価または利益として指定されていません。<br>期：{1}<br>{2}<p>
	 */
	public static String MAUAL0181 = "MAUAL0181";

	/** LEVEL[W]<br>一次配賦基準マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0182 = "MAUAL0182";

	/** LEVEL[W]<br>一次配賦基準カテゴリマスタで計算カテゴリとワーキンググループ、期に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで比率設定区分に対する一次配賦基準として指定されていません。<br>計算カテゴリＣＤ：{1}<br>ワーキンググループＣＤ：{2}<br>期：{3}<br>比率設定区分：{4}<br>{5}<p>
	 */
	public static String MAUAL0183 = "MAUAL0183";

	/** LEVEL[W]<br>原価品群マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0184 = "MAUAL0184";

	/** LEVEL[W]<br>部門基本マスタに登録されていない、もしくは過去に同じ部門ＣＤを使用しています。<br>{1}<p>
	 */
	public static String MAUAL0185 = "MAUAL0185";

	/** LEVEL[W]<br>組織変更履歴マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0186 = "MAUAL0186";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの資産管理部門がオンになっていること<br>・担当者が所属する部門として担当者権限マスタに設定されていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0187 = "MAUAL0187";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの営業部門がオンになっていること<br>・担当者が所属する部門として担当者権限マスタに設定されていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0188 = "MAUAL0188";

	/** LEVEL[W]<br>品目マスタに有効な品目として登録されていません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0189 = "MAUAL0189";

	/** LEVEL[W]<br>原価レポート比較マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0190 = "MAUAL0190";

	/** LEVEL[W]<br>原価レポート比較構成マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0191 = "MAUAL0191";

	/** LEVEL[W]<br>計算グループレポートマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0192 = "MAUAL0192";

	/** LEVEL[W]<br>原価レポートパタンマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0193 = "MAUAL0193";

	/** LEVEL[W]<br>原価レポートキーマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0194 = "MAUAL0194";

	/** LEVEL[W]<br>原価レポート構成マスタで以下の条件に対するレポート行として指定されていません。<br>レポートパタンＣＤ：{1}<br>集計：{2}<br>{3}<p>
	 */
	public static String MAUAL0195 = "MAUAL0195";

	/** LEVEL[W]<br>計算グループマスタに「2.原価計算（在庫対象外）」または「3.原価計算（在庫計算）」として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0196 = "MAUAL0196";

	/** LEVEL[W]<br>品目マスタに資産管理可能な品目として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0197 = "MAUAL0197";

	/** LEVEL[W]<br>販売品目体系マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0198 = "MAUAL0198";

	/** LEVEL[W]<br>決済方法マスタに債権決済方法として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0199 = "MAUAL0199";

	/** LEVEL[W]<br>品目マスタに在庫管理可能な品目として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0200 = "MAUAL0200";

	/** LEVEL[W]<br>場所マスタに有効な場所として登録されていない、もしくは場所マスタで製造のワーキンググループが指定されていません。<br>{1}<p>
	 */
	public static String MAUAL0201 = "MAUAL0201";

	/** LEVEL[W]<br>検査項目マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0202 = "MAUAL0202";

	/** LEVEL[W]<br>指定した品目ＣＤの枝番１として品目マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0203 = "MAUAL0203";

	/** LEVEL[W]<br>指定した品目ＣＤの枝番２として品目マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0204 = "MAUAL0204";

	/** LEVEL[W]<br>指定した品目ＣＤの枝番３として品目マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0205 = "MAUAL0205";

	/** LEVEL[W]<br>物流グループマスタに有効な物流グループとして登録されていない、もしくは物流グループマスタで場所設定にオンが指定されています。<br>{1}<p>
	 */
	public static String MAUAL0206 = "MAUAL0206";

	/** LEVEL[W]<br>原価レポートキー構成マスタが登録済みのレポートキーは指定できません。<br>{1}<p>
	 */
	public static String MAUAL0207 = "MAUAL0207";

	/** LEVEL[W]<br>原価レポート構成マスタが登録済みのレポートパタンは指定できません。<br>{1}<p>
	 */
	public static String MAUAL0208 = "MAUAL0208";

	/** LEVEL[W]<br>検査パタンマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0209 = "MAUAL0209";

	/** LEVEL[W]<br>原価費目マスタに費目区分「1.製造・売上原価費目」または「2.販売・一般管理費目」として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0210 = "MAUAL0210";

	/** LEVEL[W]<br>配賦方法マスタで期に対する配賦パタンとして指定されていない、もしくは配賦方法マスタで配賦方法区分に「1.工数」が指定されていません。<br>期：{1}<br>{2}<p>
	 */
	public static String MAUAL0211 = "MAUAL0211";

	/** LEVEL[W]<br>外部システムマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0212 = "MAUAL0212";

	/** LEVEL[W]<br>承認ルートマスタで指定した承認機能区分の承認ルートパタンとして指定されていません。<br>承認機能区分：{1}<br>{2}<p>
	 */
	public static String MAUAL0213 = "MAUAL0213";

	/** LEVEL[W]<br>ワーキンググループマスタに物流または製造または販売機能を持つワーキンググループとして登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0214 = "MAUAL0214";

	/** LEVEL[W]<br>品目検査パタンマスタで以下の条件に対する検査パタンとして指定されていません。<br>品目：{1}<br>適用日：{2}<br>{3}<p>
	 */
	public static String MAUAL0215 = "MAUAL0215";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの債権部門がオンになっていること<br>・担当者が所属する部門として担当者権限マスタに設定されていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0216 = "MAUAL0216";

	/** LEVEL[W]<br>場所マスタに取引先未登録として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0217 = "MAUAL0217";

	/** LEVEL[W]<br>取引先マスタで得意先と発注先がいずれも指定されていません。<br>{1}<p>
	 */
	public static String MAUAL0218 = "MAUAL0218";

	/** LEVEL[W]<br>計算グループマスタに計算区分「3.原価計算（在庫計算）」として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0219 = "MAUAL0219";

	/** LEVEL[W]<br>品目検査パタンマスタで以下の条件に対する検査パタンとして指定されていない、もしくは品目検査パタンマスタで検査方法区分に「4.抜取規格検査」が指定されていません。<br>品目：{1}<br>適用日：{2}<br>{3}<p>
	 */
	public static String MAUAL0220 = "MAUAL0220";

	/** LEVEL[W]<br>ワーキンググループマスタに検索可能かつ販売機能を持つワーキンググループとして登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0221 = "MAUAL0221";

	/** LEVEL[W]<br>ワーキンググループマスタに更新可能かつ販売機能を持つワーキンググループとして登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0222 = "MAUAL0222";

	/** LEVEL[W]<br>品目品管マスタで品目に対する検査パタンとして指定されていません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0223 = "MAUAL0223";

	/** LEVEL[W]<br>レポートパタン集計マスタを使用するレポート行として原価レポート構成マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0224 = "MAUAL0224";

	/** LEVEL[W]<br>ＭＰＳグループマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0225 = "MAUAL0225";

	/** LEVEL[W]<br>販売計画品目マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0226 = "MAUAL0226";

	/** LEVEL[W]<br>指定した場所が不正です。以下を確認してください。<br>・場所マスタに有効な場所として登録されていること<br>・場所マスタに移動先場所と異なる場所として登録されていること<br>・場所マスタに移動先場所のワーキンググループと同一のワーキンググループが指定されていること<br>移動先場所ＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0227 = "MAUAL0227";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの債務部門がオンになっていること<br>・担当者が所属する部門として担当者権限マスタに設定されていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0228 = "MAUAL0228";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの購買部門がオンになっていること<br>・担当者が所属する部門として担当者権限マスタに設定されていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0229 = "MAUAL0229";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの負担部門がオンになっていること<br>・担当者が所属する部門として担当者権限マスタに設定されていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0230 = "MAUAL0230";

	/** LEVEL[W]<br>品目マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0231 = "MAUAL0231";

	/** LEVEL[W]<br>勤務種類マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0232 = "MAUAL0232";

	/** LEVEL[W]<br>資源マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0233 = "MAUAL0233";

	/** LEVEL[W]<br>品揃グループマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0234 = "MAUAL0234";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの検査部門がオンになっていること<br>・担当者が所属する部門として担当者権限マスタに設定されていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0235 = "MAUAL0235";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの製造部門がオンになっていること<br>・担当者が所属する部門として担当者権限マスタに設定されていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0236 = "MAUAL0236";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの出荷部門がオンになっていること<br>・担当者が所属する部門として担当者権限マスタに設定されていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0237 = "MAUAL0237";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの入荷部門がオンになっていること<br>・担当者が所属する部門として担当者権限マスタに設定されていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0238 = "MAUAL0238";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの需給部門がオンになっていること<br>・担当者が所属する部門として担当者権限マスタに設定されていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0239 = "MAUAL0239";

	/** LEVEL[W]<br>ワーキンググループマスタにＰＬＭ機能を持つワーキンググループとして登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0240 = "MAUAL0240";

	/** LEVEL[W]<br>業務理由マスタに棚卸理由として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0241 = "MAUAL0241";

	/** LEVEL[W]<br>品目単位マスタで品目に対する単位として指定されていません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0242 = "MAUAL0242";

	/** LEVEL[W]<br>検索可能なワーキンググループではありません。<br>{1}<p>
	 */
	public static String MAUAL0243 = "MAUAL0243";

	/** LEVEL[W]<br>更新可能なワーキンググループではありません。<br>{1}<p>
	 */
	public static String MAUAL0244 = "MAUAL0244";

	/** LEVEL[W]<br>検索可能な物流グループではありません。<br>{1}<p>
	 */
	public static String MAUAL0245 = "MAUAL0245";

	/** LEVEL[W]<br>更新可能な物流グループではありません。<br>{1}<p>
	 */
	public static String MAUAL0246 = "MAUAL0246";

	/** LEVEL[W]<br>検索可能な部門ではありません。<br>{1}<p>
	 */
	public static String MAUAL0247 = "MAUAL0247";

	/** LEVEL[W]<br>更新可能な部門ではありません。<br>{1}<p>
	 */
	public static String MAUAL0248 = "MAUAL0248";

	/** LEVEL[W]<br>検索可能な場所ではありません。<br>{1}<p>
	 */
	public static String MAUAL0249 = "MAUAL0249";

	/** LEVEL[W]<br>更新可能な場所ではありません。<br>{1}<p>
	 */
	public static String MAUAL0250 = "MAUAL0250";

	/** LEVEL[W]<br>代替グループマスタでワーキンググループに対する代替グループとして指定されていません。<br>ワーキンググループＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0251 = "MAUAL0251";

	/** LEVEL[W]<br>品目仕様マスタで以下の条件に対する仕様として指定されていません。<br>品目：{1}<br>品目仕様分類ＣＤ：{2}<br>{3}<p>
	 */
	public static String MAUAL0252 = "MAUAL0252";

	/** LEVEL[W]<br>取引先品目マスタで以下の条件に対する取引先品目として指定されていません。<br>取引先ＣＤ：{1}<br>品目：{2}<br>適用日：{3}<br>{4}<p>
	 */
	public static String MAUAL0253 = "MAUAL0253";

	/** LEVEL[W]<br>品目マスタ（ロケール別情報）に登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0254 = "MAUAL0254";

	/** LEVEL[W]<br>品目工程マスタで以下の条件に対する工程パタンとして指定されていません。<br>品目：{1}<br>場所ＣＤ：{2}<br>適用日：{3}<br>{4}<p>
	 */
	public static String MAUAL0255 = "MAUAL0255";

	/** LEVEL[W]<br>品目詳細マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0256 = "MAUAL0256";

	/** LEVEL[W]<br>ロス理由マスタで以下の条件に対するロス理由として指定されていません。<br>品目区分：{1}<br>品目区分詳細ＣＤ：{2}<br>{3}<p>
	 */
	public static String MAUAL0257 = "MAUAL0257";

	/** LEVEL[W]<br>出荷作業マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0258 = "MAUAL0258";

	/** LEVEL[W]<br>出荷作業グループマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0259 = "MAUAL0259";

	/** LEVEL[W]<br>取引先マスタで得意先が指定されていない、もしくは得意先諸口が設定されています。<br>{1}<p>
	 */
	public static String MAUAL0260 = "MAUAL0260";

	/** LEVEL[W]<br>取引先マスタで配送先が指定されていません。<br>{1}<p>
	 */
	public static String MAUAL0261 = "MAUAL0261";

	/** LEVEL[W]<br>取引先マスタで有償支給先が指定されていません。<br>{1}<p>
	 */
	public static String MAUAL0262 = "MAUAL0262";

	/** LEVEL[W]<br>以下の条件に対する得意先として得意先納品先マスタに登録されていません。<br>納品先ＣＤ：{1}<br>適用日：{2}<br>{3}<p>
	 */
	public static String MAUAL0263 = "MAUAL0263";

	/** LEVEL[W]<br>以下の条件に対する納品先として得意先納品先マスタに登録されていません。<br>得意先ＣＤ：{1}<br>適用日：{2}<br>{3}<p>
	 */
	public static String MAUAL0264 = "MAUAL0264";

	/** LEVEL[W]<br>取引先マスタで請求先がオンに設定されていない、もしくは取引先マスタで入金先に対する請求先として指定されていません。<br>入金先ＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0265 = "MAUAL0265";

	/** LEVEL[W]<br>取引先マスタで納品先がオンに設定されていない、もしくは納品先以外も指定されています。<br>{1}<p>
	 */
	public static String MAUAL0266 = "MAUAL0266";

	/** LEVEL[W]<br>取引先マスタでメーカがオンに設定されていない、もしくはメーカ以外も指定されています。<br>{1}<p>
	 */
	public static String MAUAL0267 = "MAUAL0267";

	/** LEVEL[W]<br>取引先マスタで仕向先がオンに設定されていない、もしくは仕向先以外も指定されています。<br>{1}<p>
	 */
	public static String MAUAL0268 = "MAUAL0268";

	/** LEVEL[W]<br>取引先マスタで納品先と発注先がいずれもオンに設定されていません。<br>{1}<p>
	 */
	public static String MAUAL0269 = "MAUAL0269";

	/** LEVEL[W]<br>取引先品目マスタで購買内示グループが指定されていません。<br>{1}<p>
	 */
	public static String MAUAL0270 = "MAUAL0270";

	/** LEVEL[W]<br>取引先マスタで請求先と入金先がいずれもオンに設定されていません。<br>{1}<p>
	 */
	public static String MAUAL0271 = "MAUAL0271";

	/** LEVEL[W]<br>販売品目体系マスタに有効な販売品目体系が登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0272 = "MAUAL0272";

	/** LEVEL[W]<br>システムパラメータ概要テーブルに有効なシステムパラメータ概要が登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0273 = "MAUAL0273";

	/** LEVEL[W]<br>システムパラメータ概要テーブルに有効な業務分類が登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0274 = "MAUAL0274";

	/** LEVEL[W]<br>以下の条件に対する部門として部門マスタに登録されていません。<br>適用開始日：{1}<br>適用終了日：{2}<br>{3}<p>
	 */
	public static String MAUAL0275 = "MAUAL0275";

	/** LEVEL[W]<br>品目マスタに有効な品目として登録されていない、もしくは資産管理区分に「3.架空品」が指定されています。<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0276 = "MAUAL0276";

	/** LEVEL[W]<br>品目マスタに有効な品目として登録されていない、もしくは在庫管理区分に「1.在庫管理する」が指定されていません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0277 = "MAUAL0277";

	/** LEVEL[W]<br>品目マスタに有効な品目として登録されていない、もしくは在庫管理区分に「2.在庫管理しない」が指定されていません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0278 = "MAUAL0278";

	/** LEVEL[W]<br>品目マスタに有効な品目として登録されていない、もしくは在庫管理区分に「3.架空品」が指定されていません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0279 = "MAUAL0279";

	/** LEVEL[W]<br>品目マスタに有効な品目として登録されていない、もしくは資産管理区分に「1.資産管理する」が指定されていません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0280 = "MAUAL0280";

	/** LEVEL[W]<br>品目マスタに有効な品目として登録されていない、もしくは資産管理区分に「2.資産管理対しない」が指定されていません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0281 = "MAUAL0281";

	/** LEVEL[W]<br>品目マスタに有効な品目として登録されていない、もしくは資産管理区分に「3.架空品」が指定されていません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0282 = "MAUAL0282";

	/** LEVEL[W]<br>指定した品目が不正です。以下を確認してください。<br>・品目マスタに有効な品目として登録されていること<br>・品目マスタの在庫管理区分に「1.在庫管理する」が指定されていること<br>・品目マスタの資産管理区分に「1.資産管理する」が指定されていること<br>品目：{1} <br>{2}<p>
	 */
	public static String MAUAL0283 = "MAUAL0283";

	/** LEVEL[W]<br>指定した品目が不正です。以下を確認してください。<br>・品目マスタに有効な品目として登録されていること<br>・品目マスタの在庫管理区分に「1.在庫管理する」が指定されていること<br>・品目マスタの資産管理区分に「2.資産管理しない」が指定されていること<br>品目：{1} <br>{2}<p>
	 */
	public static String MAUAL0284 = "MAUAL0284";

	/** LEVEL[W]<br>指定した品目が不正です。以下を確認してください。<br>・品目マスタに有効な品目として登録されていること<br>・品目マスタの在庫管理区分に「2.在庫管理しない」が指定されていること<br>・品目マスタの資産管理区分に「1.資産管理する」が指定されていること<br>品目：{1} <br>{2}<p>
	 */
	public static String MAUAL0285 = "MAUAL0285";

	/** LEVEL[W]<br>指定した品目が不正です。以下を確認してください。<br>・品目マスタに有効な品目として登録されていること<br>・品目マスタの在庫管理区分に「2.在庫管理しない」が指定されていること<br>・品目マスタの資産管理区分に「2.資産管理しない」が指定されていること<br>品目：{1} <br>{2}<p>
	 */
	public static String MAUAL0286 = "MAUAL0286";

	/** LEVEL[W]<br>品目マスタに有効な品目として登録されていない、もしくは品目マスタで諸口品がオンに設定されていません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0287 = "MAUAL0287";

	/** LEVEL[W]<br>指定した品目が不正です。以下を確認してください。<br>・品目マスタに有効な品目として登録されていること<br>・品目マスタで在庫管理区分が「1.在庫管理する」が指定されていること<br>・品目マスタで諸口品がオフであること<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0288 = "MAUAL0288";

	/** LEVEL[W]<br>指定した品目が不正です。以下を確認してください。<br>・品目マスタに有効な品目として登録されていること<br>・品目マスタの資産管理区分に「1.資産管理する」が指定されていること<br>・品目マスタの諸口品にオフが指定されていること<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0289 = "MAUAL0289";

	/** LEVEL[W]<br>指定した品目が不正です。以下を確認してください。<br>・品目マスタに有効な品目として登録されていること<br>・品目マスタの在庫管理区分に「1.在庫管理する」が指定されていること<br>・品目マスタの資産管理区分に「1.資産管理する」が指定されていること<br>・品目マスタの諸口品にオフが指定されていること<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0290 = "MAUAL0290";

	/** LEVEL[W]<br>指定した品目が不正です。以下を確認してください。<br>・品目マスタに有効な品目として登録されていること<br>・品目マスタの在庫管理区分に「1.在庫管理する」が指定されていること<br>・品目マスタの資産管理区分に「2.資産管理しない」が指定されていること<br>・品目マスタの諸口品にオフが指定されていること<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0291 = "MAUAL0291";

	/** LEVEL[W]<br>指定した品目が不正です。以下を確認してください。<br>・品目マスタに有効な品目として登録されていること<br>・品目マスタの在庫管理区分に「2.在庫管理しない」が指定されていること<br>・品目マスタの資産管理区分に「1.資産管理する」が指定されていること<br>・品目マスタの諸口品にオフが指定されていること<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0292 = "MAUAL0292";

	/** LEVEL[W]<br>品目マスタに有効な品目として登録されていない、もしくは品目マスタで版管理対象がオンに設定されていません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0293 = "MAUAL0293";

	/** LEVEL[W]<br>品目マスタに有効な品目として登録されていない、もしくは品目検査パタンマスタに品目が登録されていません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0294 = "MAUAL0294";

	/** LEVEL[W]<br>指定した品目が不正です。以下を確認してください。<br>・品目マスタに有効な品目として登録されていること<br>・販売計画品目構成マスタに品目が登録されていること<br>・販売計画品目構成マスタの計画品目にＮＵＬＬ文字が指定されていること<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0295 = "MAUAL0295";

	/** LEVEL[W]<br>品目マスタに有効な品目として登録されていない、もしくは品目マスタで資産管理区分に「1.資産管理する」、または「3.架空品」が指定されていません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0296 = "MAUAL0296";

	/** LEVEL[W]<br>品目マスタに有効な品目として登録されていない、もしくは品目マスタで構成主品目にオンが指定されていません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0297 = "MAUAL0297";

	/** LEVEL[W]<br>指定した品目が不正です。以下を確認してください。<br>・品目マスタに有効な品目として登録されていること<br>・品目マスタの資産管理区分に「3.架空品」以外が指定されていること<br>・品目マスタの構成・仕様管理区分に「2.構成・仕様管理する」以外が指定されていること<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0298 = "MAUAL0298";

	/** LEVEL[W]<br>指定した品目が不正です。以下を確認してください。<br>・品目マスタに有効な品目として登録されていること<br>・品目マスタの在庫管理区分に「1.在庫管理する」が指定されていること<br>・品目マスタの構成・仕様管理区分に「2.構成・仕様管理する」以外が指定されていること<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0299 = "MAUAL0299";

	/** LEVEL[W]<br>指定した品目が不正です。以下を確認してください。<br>・品目マスタに有効な品目として登録されていること<br>・取引先品目マスタに品目が登録されていること<br>・取引先品目マスタの購買内示グループが指定されていること<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0300 = "MAUAL0300";

	/** LEVEL[W]<br>指定した品目が不正です。以下を確認してください。<br>・品目マスタに有効な品目として登録されていること<br>・品目検査パタンマスタに品目が登録されていること<br>・品目検査パタンマスタで検査方法区分に「4.抜取規格検査」が指定されていること<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0301 = "MAUAL0301";

	/** LEVEL[W]<br>指定した品目が不正です。以下を確認してください。<br>・品目マスタに有効な品目として登録されていること<br>・品目マスタのロット管理区分に「2.同一ロット許可」、または「3.同一ロット不許可」が指定されていません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0302 = "MAUAL0302";

	/** LEVEL[W]<br>指定した品目が不正です。以下を確認してください。<br>・品目マスタに有効な品目として登録されていること<br>・補充マスタに品目が登録されていること<br>・補充マスタの発注点在庫数量に0以上が指定されていること<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0303 = "MAUAL0303";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの債権部門、または債務部門がオンになっていること<br>・担当者が所属する部門として担当者権限マスタに設定されていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0304 = "MAUAL0304";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの債権部門がオンになっていること<br>・担当者が所属する部門として担当者権限マスタに設定されていること<br>・取引先マスタで請求先に対する請求先部門として指定されていません。<br>適用日：{1}<br>請求先ＣＤ：{2}<br>{3}<p>
	 */
	public static String MAUAL0305 = "MAUAL0305";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの営業部門、購買部門、出荷部門、入荷部門、製造部門、検査部門のいずれかがオンになっていること<br>・担当者が所属する部門として担当者権限マスタに設定されていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0306 = "MAUAL0306";

	/** LEVEL[W]<br>場所マスタに有効な場所として登録されていない、もしくは場所マスタで物流ワーキンググループが指定されていません。<br>{1}<p>
	 */
	public static String MAUAL0307 = "MAUAL0307";

	/** LEVEL[W]<br>指定した場所が不正です。以下を確認してください。<br>・場所マスタに有効な場所として登録されていること<br>・指定したワーキンググループが場所マスタで設定されていること<br>・ワーキンググループマスタで指定したワーキンググループの製造がオンであること<br>ワーキンググループＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0308 = "MAUAL0308";

	/** LEVEL[W]<br>場所マスタに有効な場所として登録されていない、もしくは管轄区分に「1.販売」が指定されていません。<br>{1}<p>
	 */
	public static String MAUAL0309 = "MAUAL0309";

	/** LEVEL[W]<br>場所マスタに有効な場所として登録されていない、もしくは管轄区分に「2.生産」が指定されていません。<br>{1}<p>
	 */
	public static String MAUAL0310 = "MAUAL0310";

	/** LEVEL[W]<br>場所マスタに有効な場所として登録されていない、もしくは場所マスタの発注先が指定されています。<br>{1}<p>
	 */
	public static String MAUAL0311 = "MAUAL0311";

	/** LEVEL[W]<br>場所マスタに有効な場所として登録されていない、もしくは場所マスタで発注先が指定されていません。<br>{1}<p>
	 */
	public static String MAUAL0312 = "MAUAL0312";

	/** LEVEL[W]<br>指定した場所が不正です。以下を確認してください。<br>・場所マスタに有効な場所として登録されていること<br>・場所マスタの管轄区分に「2.生産」が指定されていること<br>・場所マスタの発注先が指定されていること<br>{1}<p>
	 */
	public static String MAUAL0313 = "MAUAL0313";

	/** LEVEL[W]<br>指定した場所が不正です。以下を確認してください。<br>・場所マスタに有効な場所として登録されていること<br>・指定したワーキンググループが場所マスタで設定されていること<br>・ワーキンググループマスタで指定したワーキンググループの発注先が指定されていないこと<br>ワーキンググループＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0314 = "MAUAL0314";

	/** LEVEL[W]<br>場所マスタに有効な場所として登録されていない、もしくは場所マスタの棚卸対象にオンが指定されていません。<br>{1}<p>
	 */
	public static String MAUAL0315 = "MAUAL0315";

	/** LEVEL[W]<br>場所マスタに有効な場所として登録されていない、もしくは場所マスタにワーキンググループに対する場所として登録されていません。<br>ワーキンググループＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0316 = "MAUAL0316";

	/** LEVEL[W]<br>場所マスタに有効な場所として登録されていない、もしくは場所マスタに物流グループに対する場所として登録されていません。<br>物流グループＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0317 = "MAUAL0317";

	/** LEVEL[W]<br>場所マスタに有効な場所として登録されていない、もしくは場所マスタに工場・物流倉庫に対する場所として登録されていません。<br>工場・物流倉庫ＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0318 = "MAUAL0318";

	/** LEVEL[W]<br>場所マスタに有効な場所として登録されていない、もしくは場所マスタに製造場所グループに対する場所として登録されていません。<br>製造場所グループＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0319 = "MAUAL0319";

	/** LEVEL[W]<br>指定した場所が不正です。以下を確認してください。<br>・場所マスタに有効な場所として登録されていること<br>・場所マスタの発注先が指定されていないこと<br>・場所マスタの製造ワーキンググループが指定されていること<br>{1}<p>
	 */
	public static String MAUAL0320 = "MAUAL0320";

	/** LEVEL[W]<br>業務理由マスタで以下の条件に対する仕入理由として指定されていません。<br>経費購買：{1}<br>{2}<p>
	 */
	public static String MAUAL0321 = "MAUAL0321";

	/** LEVEL[W]<br>業務理由マスタで以下の条件に対する仕入返品理由として指定されていません。<br>経費購買：{1}<br>{2}<p>
	 */
	public static String MAUAL0322 = "MAUAL0322";

	/** LEVEL[W]<br>税マスタで以下の条件に対する税として指定されていません。<br>内税：{1}<br>売上：{2}<br>仕入：{3}<br>支給：{4}<br>{5}<p>
	 */
	public static String MAUAL0323 = "MAUAL0323";

	/** LEVEL[W]<br>物流グループマスタでワーキンググループに対する物流グループとして指定されていない、もしくは物流グループマスタで場所設定にオフが指定されています。<br>ワーキンググループＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0324 = "MAUAL0324";

	/** LEVEL[W]<br>業務理由マスタで仕入調整管轄区分に対する仕入調整理由として指定されていません。<br>仕入調整管轄区分：{1}<br>{2}<p>
	 */
	public static String MAUAL0325 = "MAUAL0325";

	/** LEVEL[W]<br>業務理由マスタで出来高区分に対する出来高理由として指定されていません。<br>出来高区分：{1}<br>{2}<p>
	 */
	public static String MAUAL0326 = "MAUAL0326";

	/** LEVEL[W]<br>物流グループマスタでワーキンググループに対する物流グループとして指定されていません。<br>ワーキンググループＣＤ：{1}<br>場所設定：{2}<br>{3}<p>
	 */
	public static String MAUAL0327 = "MAUAL0327";

	/** LEVEL[W]<br>製造場所グループマスタでワーキンググループに対する製造場所グループとして指定されていません。<br>ワーキンググループＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0328 = "MAUAL0328";

	/** LEVEL[W]<br>原価費目マスタで以下の条件に対する原価費目として指定されていません。<br>費目区分：{1}<br>直間区分：{2}<br>固変区分：{3}<br>費目グループＣＤ：{4}<br>{5}<p>
	 */
	public static String MAUAL0329 = "MAUAL0329";

	/** LEVEL[W]<br>決済方法マスタで債権決済区分に対する決済方法として指定されていません。<br>債権決済区分：{1}<br>{2}<p>
	 */
	public static String MAUAL0330 = "MAUAL0330";

	/** LEVEL[W]<br>原価品群マスタで品群構成区分に対する品群として指定されていません。<br>品群構成区分：{1}<br>{2}<p>
	 */
	public static String MAUAL0331 = "MAUAL0331";

	/** LEVEL[W]<br>一次配賦基準マスタで一次配賦パタンに対する一次配賦基準として指定されていません。<br>一次配賦パタンＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0332 = "MAUAL0332";

	/** LEVEL[W]<br>販売品目体系マスタで販売品目体系階層に対する品目体系として指定されていません。<br>販売品目体系階層：{1}<br>{2}<p>
	 */
	public static String MAUAL0333 = "MAUAL0333";

	/** LEVEL[W]<br>物流グループマスタでワーキンググループに対する物流グループとして指定されていない、もしくは物流グループマスタで場所設定にオンが指定されています。<br>ワーキンググループＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0334 = "MAUAL0334";

	/** LEVEL[W]<br>計算グループレポートマスタでレポートパタンとレポートキーに対する計算グループとして指定されていません。<br>比較パタンＣＤ：{1}<br>レポートパタンＣＤ：{2}<br>レポートキーＣＤ：{3}<br>{4}<p>
	 */
	public static String MAUAL0335 = "MAUAL0335";

	/** LEVEL[W]<br>場所マスタで場所に対する資源１と資源２として指定されていません。<br>場所ＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0336 = "MAUAL0336";

	/** LEVEL[W]<br>業務理由マスタで以下の条件に対する業務理由として指定されていません。<br>他勘定入庫：{1}<br>他勘定出庫：{2}<br>廃棄：{3}<br>{4}<p>
	 */
	public static String MAUAL0337 = "MAUAL0337";

	/** LEVEL[W]<br>業務理由マスタで以下の条件に対する業務理由として指定されていません。<br>仕入：{1}<br>経費購買：{2}<br>売上返品：{3}<br>移送：{4}<br>{5}<p>
	 */
	public static String MAUAL0338 = "MAUAL0338";

	/** LEVEL[W]<br>業務理由マスタで以下の条件に対する業務理由として指定されていません。<br>売上：{1}<br>移送：{2}<br>{3}<p>
	 */
	public static String MAUAL0339 = "MAUAL0339";

	/** LEVEL[W]<br>業務理由マスタで以下の条件に対する業務理由として指定されていません。<br>売上：{1}<br>売上返品：{2}<br>売上調整：{3}<br>販売他勘定：{4}<br>{5}<p>
	 */
	public static String MAUAL0340 = "MAUAL0340";

	/** LEVEL[W]<br>原価レポート比較構成マスタで以下の条件に対する項目として指定されていません。<br>比較パタンＣＤ：{1}<br>集計列：{2}<br>{3}<p>
	 */
	public static String MAUAL0341 = "MAUAL0341";

	/** LEVEL[W]<br>一次配賦基準カテゴリマスタで計算カテゴリとワーキンググループ、期に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで比率設定区分に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで計画月次比率にオフが指定されています。<br>計算カテゴリＣＤ：{1}<br>ワーキンググループＣＤ：{2}<br>期：{3}<br>比率設定区分：{4}<br>{5}<p>
	 */
	public static String MAUAL0342 = "MAUAL0342";

	/** LEVEL[W]<br>一次配賦基準カテゴリマスタで計算カテゴリとワーキンググループ、期に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで比率設定区分に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで実績月次比率にオフが指定されています。<br>計算カテゴリＣＤ：{1}<br>ワーキンググループＣＤ：{2}<br>期：{3}<br>比率設定区分：{4}<br>{5}<p>
	 */
	public static String MAUAL0343 = "MAUAL0343";

	/** LEVEL[W]<br>一次配賦基準カテゴリマスタで計算カテゴリとワーキンググループ、期に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで比率設定区分に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで計画月次比率と実績月次比率のいずれかにオフが指定されています。<br>計算カテゴリＣＤ：{1}<br>ワーキンググループＣＤ：{2}<br>期：{3}<br>比率設定区分：{4}<br>{5}<p>
	 */
	public static String MAUAL0344 = "MAUAL0344";

	/** LEVEL[W]<br>一次配賦基準カテゴリマスタで計算カテゴリとワーキンググループ、期に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで比率設定区分に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで計画月次比率と実績月次比率の両方にオフが指定されています。<br>計算カテゴリＣＤ：{1}<br>ワーキンググループＣＤ：{2}<br>期：{3}<br>比率設定区分：{4}<br>{5}<p>
	 */
	public static String MAUAL0345 = "MAUAL0345";

	/** LEVEL[W]<br>出荷条件マスタで有効な出荷条件として指定されていない、もしくは物流制御マスタで以下の条件に対する出荷条件として指定されていません。<br>出荷元物流グループＣＤ：{1}<br>出荷先物流グループＣＤ：{2}<br>{3}<p>
	 */
	public static String MAUAL0346 = "MAUAL0346";

	/** LEVEL[W]<br>出荷作業マスタで有効な出荷作業として指定されていない、もしくは出荷作業判定マスタで以下の条件に対する出荷作業として指定されていません。<br>出荷作業グループＣＤ：{1}<br>出荷予定時刻：{2}<br>{3}<p>
	 */
	public static String MAUAL0347 = "MAUAL0347";

	/** LEVEL[W]<br>取引先マスタで得意先と納品先、発注先がいずれも指定されていません。<br>{1}<p>
	 */
	public static String MAUAL0348 = "MAUAL0348";

	/** LEVEL[W]<br>取引先マスタで発注先が指定されていない、もしくは発注先インボイス取引にオンが指定されています。<br>{1}<p>
	 */
	public static String MAUAL0349 = "MAUAL0349";

	/** LEVEL[W]<br>外部システムマスタに外部システム区分が「1.ＥＤＩ」または「6.ＥＤＩ（ＭＣＦ）」として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0350 = "MAUAL0350";

	/** LEVEL[W]<br>決済方法マスタに債務決済方法として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0351 = "MAUAL0351";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0352 = "MAUAL0352";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの資産管理部門がオンになっていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0353 = "MAUAL0353";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの債権部門がオンになっていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0354 = "MAUAL0354";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの債務部門がオンになっていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0355 = "MAUAL0355";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの営業部門がオンになっていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0356 = "MAUAL0356";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの購買部門がオンになっていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0357 = "MAUAL0357";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの出荷部門がオンになっていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0358 = "MAUAL0358";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの入荷部門がオンになっていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0359 = "MAUAL0359";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの製造部門がオンになっていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0360 = "MAUAL0360";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの需給部門がオンになっていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0361 = "MAUAL0361";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの検査部門がオンになっていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0362 = "MAUAL0362";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの負担部門がオンになっていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0363 = "MAUAL0363";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの債権部門、または債務部門がオンになっていること<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0364 = "MAUAL0364";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの債権部門がオンになっていること<br>・取引先マスタで請求先に対する請求先部門として指定されていません。<br>適用日：{1}<br>請求先ＣＤ：{2}<br>{3}<p>
	 */
	public static String MAUAL0365 = "MAUAL0365";

	/** LEVEL[W]<br>指定した部門は不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの営業部門、購買部門、出荷部門、入荷部門、製造部門、検査部門のいずれかがオンになっていること<br>・取引先マスタで請求先に対する請求先部門として指定されていません。<br>適用日：{1}<br>{2}<p>
	 */
	public static String MAUAL0366 = "MAUAL0366";

	/** LEVEL[W]<br>決済方法マスタに、債権決済区分が相殺（借方）もしくは源泉税の決済方法として指定されていません。<br>{1}<p>
	 */
	public static String MAUAL0367 = "MAUAL0367";

	/** LEVEL[W]<br>業務理由マスタで以下の条件に対する売上理由として指定されていません。<br>販売他勘定：{1}<br>{2}<p>
	 */
	public static String MAUAL0368 = "MAUAL0368";

	/** LEVEL[W]<br>業務理由マスタで以下の条件に対する売上返品理由として指定されていません。<br>販売他勘定：{1}<br>{2}<p>
	 */
	public static String MAUAL0369 = "MAUAL0369";

	/** LEVEL[W]<br>総量引当場所グループ及び物流グループがある場所に対する総量引当場所グループ、物流グループとして登録されていません。場所マスタの総量引当場所グループ、物流グループを確認してください。<br>{1}<p>
	 */
	public static String MAUAL0370 = "MAUAL0370";

	/** LEVEL[W]<br>ワーキンググループマスタに販売、物流、製造、購買、いずれかの機能を持つワーキンググループとして登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0371 = "MAUAL0371";

	/** LEVEL[W]<br>原価部門マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0372 = "MAUAL0372";

	/** LEVEL[W]<br>原価部門マスタで期に対する部門配賦グループとして登録されていません。<br>期：{1}<br>{2}<p>
	 */
	public static String MAUAL0373 = "MAUAL0373";

	/** LEVEL[W]<br>計算グループマスタで計算区分に対する計算グループとして指定されていません。<br>計算区分：{1}<br>{2}<p>
	 */
	public static String MAUAL0374 = "MAUAL0374";

	/** LEVEL[W]<br>場所マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0375 = "MAUAL0375";

	/** LEVEL[W]<br>取引先マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0376 = "MAUAL0376";

	/** LEVEL[W]<br>原価レポート構成マスタに登録されていません。<br>レポートパタンＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0377 = "MAUAL0377";

	/** LEVEL[W]<br>ワーキンググループマスタに条件に対するワーキンググループとして指定されていません。<br>{1}<p>
	 */
	public static String MAUAL0378 = "MAUAL0378";

	/** LEVEL[W]<br>計算実行パタンに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0379 = "MAUAL0379";

	/** LEVEL[W]<br>配賦方法マスタで期に対する投入数量として指定されていません。<br>期：{1}<br>{2}<p>
	 */
	public static String MAUAL0380 = "MAUAL0380";

	/** LEVEL[W]<br>配賦方法マスタで期に対する任意配賦基準値として指定されていません。<br>期：{1}<br>{2}<p>
	 */
	public static String MAUAL0381 = "MAUAL0381";

	/** LEVEL[W]<br>配賦方法マスタで期に対する汎用配賦として指定されていません。<br>期：{1}<br>{2}<p>
	 */
	public static String MAUAL0382 = "MAUAL0382";

	/** LEVEL[W]<br>一次配賦基準カテゴリマスタで計算カテゴリとワーキンググループ、期に対する一次配賦基準として指定されていません。<br>計算カテゴリＣＤ：{1}<br>ワーキンググループＣＤ：{2}<br>期：{3}<br>{4}<p>
	 */
	public static String MAUAL0383 = "MAUAL0383";

	/** LEVEL[W]<br>一次配賦基準カテゴリマスタで計算カテゴリとワーキンググループ、期に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで計画月次比率にオフが指定されています。<br>計算カテゴリＣＤ：{1}<br>ワーキンググループＣＤ：{2}<br>期：{3}<br>{4}<p>
	 */
	public static String MAUAL0384 = "MAUAL0384";

	/** LEVEL[W]<br>一次配賦基準カテゴリマスタで計算カテゴリとワーキンググループ、期に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで実績月次比率にオフが指定されています。<br>計算カテゴリＣＤ：{1}<br>ワーキンググループＣＤ：{2}<br>期：{3}<br>{4}<p>
	 */
	public static String MAUAL0385 = "MAUAL0385";

	/** LEVEL[W]<br>一次配賦基準カテゴリマスタで計算カテゴリとワーキンググループ、期に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで計画月次比率と実績月次比率のいずれかにオフが指定されています。<br>計算カテゴリＣＤ：{1}<br>ワーキンググループＣＤ：{2}<br>期：{3}<br>{4}<p>
	 */
	public static String MAUAL0386 = "MAUAL0386";

	/** LEVEL[W]<br>一次配賦基準カテゴリマスタで計算カテゴリとワーキンググループ、期に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで計画月次比率と実績月次比率の両方にオフが指定されています。<br>計算カテゴリＣＤ：{1}<br>ワーキンググループＣＤ：{2}<br>期：{3}<br>{4}<p>
	 */
	public static String MAUAL0387 = "MAUAL0387";

	/** LEVEL[W]<br>原価メニュー構成マスタに未登録のものが、原価メニューマスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0388 = "MAUAL0388";

	/** LEVEL[W]<br>原価会計伝票区分仕訳マスタで計算グループに対する会計伝票区分として指定されていません。<br>計算グループ：{1}<br>{2}<p>
	 */
	public static String MAUAL0389 = "MAUAL0389";

	/** LEVEL[W]<br>在庫評価マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0390 = "MAUAL0390";

	/** LEVEL[W]<br>配賦係数マスタに有効な配賦係数として登録されていない、もしくは配賦係数構成区分に「1.配賦係数構成マスタ」として指定されていません。<br>{1}<p>
	 */
	public static String MAUAL0391 = "MAUAL0391";

	/** LEVEL[W]<br>配賦係数マスタに有効な配賦係数として登録されていない、もしくは配賦係数構成区分に「1.配賦係数構成マスタ」以外として指定されていません。<br>{1}<p>
	 */
	public static String MAUAL0392 = "MAUAL0392";

	/** LEVEL[W]<br>会計部門マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0393 = "MAUAL0393";

	/** LEVEL[W]<br>ワーキンググループマスタに機能を持たないワーキンググループとして指定されていません。<br>{1}<p>
	 */
	public static String MAUAL0394 = "MAUAL0394";

	/** LEVEL[W]<br>指定した場所が不正です。以下を確認してください。<br>・場所マスタに有効な場所として登録されていること<br>・指定したワーキンググループが場所マスタで設定されていること<br>・場所マスタの発注先が指定されていること<br>ワーキンググループＣＤ：{1}<br>{2}<p>
	 */
	public static String MAUAL0395 = "MAUAL0395";

	/** LEVEL[W]<br>業務理由マスタに投入理由として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0396 = "MAUAL0396";

	/** LEVEL[W]<br>取引先マスタで得意先、発注先、請求先、支払予定管理先がいずれも指定されていません。<br>{1}<p>
	 */
	public static String MAUAL0397 = "MAUAL0397";

	/** LEVEL[W]<br>指定した計算グループが不正です。計算グループマスタで以下のどちらかの条件に一致しているか確認してください。<br>・計算区分に「2.原価計算（在庫対象外）」または「3.原価計算（在庫計算）」が指定されていること<br>・計算区分に「4.その他」が指定されている、かつ一次配賦計算区分に「2.計算」が指定されていること<br>{1}<p>
	 */
	public static String MAUAL0502 = "MAUAL0502";

	/** LEVEL[W]<br>指定した品目が不正です。以下を確認してください。<br>・品目マスタに有効な品目として登録されていること<br>・品目マスタの在庫管理区分に「1.在庫管理する」が指定されていること<br>・品目マスタの資産管理区分に「1.資産管理する」が指定されていること<br>・品目マスタのロット管理区分に「3.同一ロット不許可」、もしくはサブロット管理区分に「3.ロット内同一サブロット不許可」が指定されていること<br>品目：{1}<br>{2}<p>
	 */
	public static String MAUAL0501 = "MAUAL0501";

	/** LEVEL[W]<br>倉庫事業者マスタに登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0503 = "MAUAL0503";

	/** LEVEL[W]<br>外部システムマスタに外部システム区分が「2.ＳＣＭ」または「7.ＳＣＭ（ＭＤ）」として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0504 = "MAUAL0504";

	/** LEVEL[W]<br>物流制御マスタに登録されていません。<br>出荷元物流グループＣＤ：{1}<br>出荷先物流グループＣＤ：{2}<br>{3}<p>
	 */
	public static String MAUAL0505 = "MAUAL0505";

	/** LEVEL[W]<br>決済方法が不正です。決済方法マスタで債務決済がオフもしくは債務決済区分に以下が指定されている決済方法は指定できません。<br>・「7.源泉税」<br>{1}<p>
	 */
	public static String MAUAL0506 = "MAUAL0506";

	/** LEVEL[W]<br>場所マスタに有効な場所として登録されていない、もしくは場所マスタの棚・ライン対象がオンではありません。<br>{1}<p>
	 */
	public static String MAUAL0507 = "MAUAL0507";

	/** LEVEL[W]<br>指定した場所が不正です。以下を確認してください。<br>・場所マスタに有効な場所として登録されていること<br>・場所マスタで製造もしくは物流のワーキンググループが指定されていること<br>{1}<p>
	 */
	public static String MAUAL0508 = "MAUAL0508";

	/** LEVEL[W]<br>買戻義務をオンとした場合は、課税対象の税を支給税に指定できません。<br>{1}<p>
	 */
	public static String MAUAL0601 = "MAUAL0601";

	/** LEVEL[W]<br>外部システムマスタに外部システム区分が「5：会計」または「A：会計（ＳＡＰ）」として登録されていません。<br>{1}<p>
	 */
	public static String MAUAL0701 = "MAUAL0701";

	/** LEVEL[E]<br>予期せぬデータ型がセットされました。{1}<p>
	 */
	public static String MAUCC0001 = "MAUCC0001";

	/** LEVEL[I]<br>{1}：{2}：{3}<p>
	 * {1}：時 {2}：分 {3}：秒<br>
	 */
	public static String MAUCC0007 = "MAUCC0007";

	/** LEVEL[W]<br>要求数の合計と割当可能総数の符号が異なっています。<br>要求数合計：{1}<br>割当可能総数：{2}<p>
	 */
	public static String MAUCL0001 = "MAUCL0001";

	/** LEVEL[W]<br>割当比率の合計は0以外の数である必要があります。<br>割当比率合計：{1}<p>
	 */
	public static String MAUCL0002 = "MAUCL0002";

	/** LEVEL[T]<br>振り分け処理で残数が発生しました。残数：{1}<p>
	 */
	public static String MAUCL0003 = "MAUCL0003";

	/** LEVEL[W]<br>自社情報を取得できませんでした。<p>
	 */
	public static String MAUCL0004 = "MAUCL0004";

	/** LEVEL[W]<br>基準通貨情報が取得できませんでした。<p>
	 */
	public static String MAUCL0005 = "MAUCL0005";

	/** LEVEL[W]<br>ユーザ情報が取得できませんでした。<p>
	 */
	public static String MAUCL0006 = "MAUCL0006";

	/** LEVEL[E]<br>使用するデータベースのServerConfigリソースにネットサービス名が指定されていません。<br>本システムではネットサービス名を使用します。<br>キー：{1}<p>
	 */
	public static String MAUCL0007 = "MAUCL0007";

	/** LEVEL[W]<br>以下の項目に小数部有効桁数を超えた数値が指定されています。<br>項目：{1}<br>数値：{2}<br>小数部有効桁数：{3}<br>{4}<p>
	 */
	public static String MAUCL0008 = "MAUCL0008";

	/** LEVEL[W]<br>納税通貨情報が取得できませんでした。<p>
	 */
	public static String MAUCL0009 = "MAUCL0009";

	/** LEVEL[W]<br>データが見つかりませんでした。<br>モジュール：{1}<br>テーブル：{2}<br>キー：{3}<br>{4}<p>
	 */
	public static String MAUCL0010 = "MAUCL0010";

	/** LEVEL[W]<br>以下の項目に不整合な値が指定されました。<br>項目：{1}<br>上り電文データ：{2}<br>DB上の値：{3}<p>
	 */
	public static String MAUCL0011 = "MAUCL0011";

	/** LEVEL[W]<br>品目に使用できない文字が含まれています。<br>品目：{1}<br>使用できない文字：{2}<p>
	 */
	public static String MAUCL0012 = "MAUCL0012";

	/** LEVEL[W]<br>枝番１に使用できない文字が含まれています。<br>枝番１：{1}<br>使用できない文字：{2}<p>
	 */
	public static String MAUCL0013 = "MAUCL0013";

	/** LEVEL[W]<br>枝番２に使用できない文字が含まれています。<br>枝番２：{1}<br>使用できない文字：{2}<p>
	 */
	public static String MAUCL0014 = "MAUCL0014";

	/** LEVEL[W]<br>品目ＣＤのＮ番目のデリミタが未設定にも関わらず、枝番Ｎ以降に値が設定されています。<br>枝番１：{1}<br>枝番２：{2}<br>枝番３：{3}<br>Ｎ：{4}<p>
	 */
	public static String MAUCL0015 = "MAUCL0015";

	/** LEVEL[D]<br>基準単位への換算処理をスキップします。<br>数量：{1}<br>単位換算数：{2}<br>小数部有効桁数：{3}<br>単位換算端数処理区分：{4}<p>
	 * 基準単位以外から基準単位への換算処理を実行しなかったときのメッセージ<br>
	 */
	public static String MAUCL0016 = "MAUCL0016";

	/** LEVEL[D]<br>単位換算処理をスキップします。<br>基準単位数量：{1}<br>単位換算数：{2}<br>小数部有効桁数：{3}<br>単位換算端数処理区分：{4}<p>
	 * 基準単位から基準単位以外の単位への換算処理を実行しなかったときのメッセージ<br>
	 */
	public static String MAUCL0017 = "MAUCL0017";

	/** LEVEL[D]<br>単位換算処理をスキップします。<br>数量：{1}<br>変換元単位の単位換算数：{2}<br>変換先単位の単位換算数：{2}<br>小数部有効桁数：{3}<br>単位換算端数処理区分：{4}<p>
	 * 基準単位以外から別の基準単位以外の単位への換算処理を実行しなかったときのメッセージ<br>
	 */
	public static String MAUCL0018 = "MAUCL0018";

	/** LEVEL[D]<br>有効成分単位への換算処理をスキップします。<br>基準単位数量：{1}<br>有効成分係数：{2}<br>有効成分小数部有効桁数：{3}<br>有効成分単位換算端数処理区分：{4}<p>
	 * 基準単位から有効成分単位への換算処理を実行しなかったときのメッセージ<br>
	 */
	public static String MAUCL0019 = "MAUCL0019";

	/** LEVEL[D]<br>有効成分単位から基準単位への換算処理をスキップします。<br>有効成分：{1}<br>有効成分係数：{2}<br>基準単位小数部有効桁数：{3}<br>基準単位換算端数処理区分：{4}<p>
	 * 有効成分単位から基準単位への換算処理を実行しなかったときのメッセージ<br>
	 */
	public static String MAUCL0020 = "MAUCL0020";

	/** LEVEL[D]<br>有効成分係数の計算処理をスキップします。<br>基準単位数量：{1}<br>有効成分：{2}<br>有効成分小数部有効桁数：{3}<p>
	 * 有効成分係数の計算処理を実行しなかったときのメッセージ<br>
	 */
	public static String MAUCL0021 = "MAUCL0021";

	/** LEVEL[D]<br>キャッシュの上限値を超えたのでキャッシュを破棄します。<br>キャッシュ上限値：{1}<br>破棄したキー：{2}<br>破棄後のサイズ：{3}<p>
	 */
	public static String MAUCL0022 = "MAUCL0022";

	/** LEVEL[T]<br>キャッシュがありません。<br>キー値：{1}<br>キャッシュクラス：{2}<p>
	 */
	public static String MAUCL0023 = "MAUCL0023";

	/** LEVEL[T]<br>キャッシュを使いました。<br>キー値：{1}<br>キャッシュクラス：{2}<p>
	 */
	public static String MAUCL0024 = "MAUCL0024";

	/** LEVEL[W]<br>原価会社パラメータ情報を取得できませんでした。<p>
	 */
	public static String MAUCL0025 = "MAUCL0025";

	/** LEVEL[E]<br>案分対象のリストが存在しないか0件です。<p>
	 */
	public static String MAUCL0026 = "MAUCL0026";

	/** LEVEL[E]<br>案分対象のリストの、割当比率が格納されている列のデータがありません。<br>割当比率が格納されている列名：{1}<p>
	 */
	public static String MAUCL0027 = "MAUCL0027";

	/** LEVEL[W]<br>経営会社パラメータ情報を取得できませんでした。<p>
	 */
	public static String MAUCL0028 = "MAUCL0028";

	/** LEVEL[W]<br>登録対象の行は、開始年月終了年月が重複するレコードが既に存在します。<p>
	 */
	public static String MAUCL0029 = "MAUCL0029";

	/** LEVEL[W]<br>登録済データ間で期間重複があります。<p>
	 */
	public static String MAUCL0030 = "MAUCL0030";

	/** LEVEL[W]<br>登録対象データ間で期間重複があります。<p>
	 */
	public static String MAUCL0031 = "MAUCL0031";

	/** LEVEL[W]<br>登録対象データと登録済データ間で期間重複があります。<p>
	 */
	public static String MAUCL0032 = "MAUCL0032";

	/** LEVEL[D]<br>金額計算処理をスキップします。<br>単価：{1}<br>数量：{2}<br>小数部有効桁数：{3}<br>金額端数処理区分：{4}<p>
	 */
	public static String MAUCL0033 = "MAUCL0033";

	/** LEVEL[D]<br>単価計算処理をスキップします。<br>金額：{1}<br>数量：{2}<br>単価小数部有効桁数：{3}<p>
	 */
	public static String MAUCL0034 = "MAUCL0034";

	/** LEVEL[D]<br>税金額計算処理をスキップします。<br>金額：{1}<br>税率：{2}<br>金額小数部有効桁数：{3}<br>税額端数処理区分：{4}<p>
	 */
	public static String MAUCL0035 = "MAUCL0035";

	/** LEVEL[W]<br>新規追加行は、既に登録されています。<br>モジュール：{1}<br>テーブル：{2}<br>キー：{3}<br>{4}<p>
	 */
	public static String MAUCL0036 = "MAUCL0036";

	/** LEVEL[W]<br>原価会社パラメータ情報を取得できませんでした。<p>
	 */
	public static String MAUCL0037 = "MAUCL0037";

	/** LEVEL[W]<br>品目ＣＤが不正です。<br>品目ＣＤ：{1}<p>
	 */
	public static String MAUCL0039 = "MAUCL0039";

	/** LEVEL[W]<br>品番を {1} にすることはできません。<br>品目ＣＤ：{2}<p>
	 */
	public static String MAUCL0040 = "MAUCL0040";

	/** LEVEL[W]<br>枝番１を {1} にすることはできません。<br>品目ＣＤ：{2}<p>
	 */
	public static String MAUCL0041 = "MAUCL0041";

	/** LEVEL[W]<br>枝番２を {1} にすることはできません。<br>品目ＣＤ：{2}<p>
	 */
	public static String MAUCL0042 = "MAUCL0042";

	/** LEVEL[W]<br>枝番３を {1} にすることはできません。<br>品目ＣＤ：{2}<p>
	 */
	public static String MAUCL0043 = "MAUCL0043";

	/** LEVEL[W]<br>品番が設定可能な文字数を超えています。<br>品目ＣＤ：{1}<br>品番：{2}<br>品番の文字数：{3}<br>設定可能な最大の文字数：{4}<p>
	 */
	public static String MAUCL0044 = "MAUCL0044";

	/** LEVEL[W]<br>枝番１が設定可能な文字数を超えています。<br>品目ＣＤ：{1}<br>枝番１：{2}<br>枝番１の文字数：{3}<br>設定可能な最大の文字数：{4}<p>
	 */
	public static String MAUCL0045 = "MAUCL0045";

	/** LEVEL[W]<br>枝番２が設定可能な文字数を超えています。<br>品目ＣＤ：{1}<br>枝番２：{2}<br>枝番２の文字数：{3}<br>設定可能な最大の文字数：{4}<p>
	 */
	public static String MAUCL0046 = "MAUCL0046";

	/** LEVEL[W]<br>枝番３が設定可能な文字数を超えています。<br>品目ＣＤ：{1}<br>枝番３：{2}<br>枝番３の文字数：{3}<br>設定可能な最大の文字数：{4}<p>
	 */
	public static String MAUCL0047 = "MAUCL0047";

	/** LEVEL[W]<br>品目ＣＤが設定可能な文字数を超えています。<br>品目ＣＤ：{1}<br>品目ＣＤの文字数：{2}<br>設定可能な最大の文字数：{3}<p>
	 */
	public static String MAUCL0048 = "MAUCL0048";

	/** LEVEL[W]<br>品目ＣＤに品番の終端を示す文字が含まれていません。<br>品目ＣＤ：{1}<br>品番の終端を示す文字：{2}<p>
	 */
	public static String MAUCL0049 = "MAUCL0049";

	/** LEVEL[W]<br>品目ＣＤに枝番１の終端を示す文字が含まれていません。<br>品目ＣＤ：{1}<br>枝番１の終端を示す文字：{2}<p>
	 */
	public static String MAUCL0050 = "MAUCL0050";

	/** LEVEL[W]<br>品目ＣＤに枝番２の終端を示す文字が含まれていません。<br>品目ＣＤ：{1}<br>枝番２の終端を示す文字：{2}<p>
	 */
	public static String MAUCL0051 = "MAUCL0051";

	/** LEVEL[W]<br>品番が未設定です。<br>品目ＣＤ：{1}<p>
	 */
	public static String MAUCL0053 = "MAUCL0053";

	/** LEVEL[W]<br>枝番２が設定されている場合は枝番１の設定は必須です。<br>品目ＣＤ：{1}<br>枝番２：{2}<p>
	 */
	public static String MAUCL0054 = "MAUCL0054";

	/** LEVEL[W]<br>枝番３が設定されている場合は枝番２の設定は必須です。<br>品目ＣＤ：{1}<br>枝番３：{2}<p>
	 */
	public static String MAUCL0055 = "MAUCL0055";

	/** LEVEL[W]<br>実行中の処理があるためデータアクセス制御情報を更新できません。<br>処理が終了するまで待つか、ログアウトしてから再度ログインしてください。<br>ログインシーケンス：{1}<br>サーバリクエストＮＯ：{2}<p>
	 */
	public static String MAUCL0056 = "MAUCL0056";

	/** LEVEL[W]<br>振り分け処理で残数が発生しました。残数：{1}<p>
	 */
	public static String MAUCL0057 = "MAUCL0057";

	/** LEVEL[W]<br>担当者権限マスタから担当者の主部門が取得できませんでした。<br>担当者ＣＤ：{1}<br>マスタ適用日：{2}<p>
	 */
	public static String MAUCL0058 = "MAUCL0058";

	/** LEVEL[W]<br>更新権限がありません。<br>部門ＣＤ：{1}<br>{2}<p>
	 * DACの更新権限用<br>
	 */
	public static String MAUCL0059 = "MAUCL0059";

	/** LEVEL[W]<br>更新権限がありません。<br>物流グループＣＤ：{1}<br>{2}<p>
	 * DACの更新権限用<br>
	 */
	public static String MAUCL0060 = "MAUCL0060";

	/** LEVEL[W]<br>更新権限がありません。<br>場所ＣＤ：{1}<br>{2}<p>
	 * DACの更新権限用<br>
	 */
	public static String MAUCL0061 = "MAUCL0061";

	/** LEVEL[W]<br>更新権限がありません。<br>ワーキンググループＣＤ：{1}<br>{2}<p>
	 * DACの更新権限用<br>
	 */
	public static String MAUCL0062 = "MAUCL0062";

	/** LEVEL[W]<br>更新権限がありません。<br>総量引当場所グループＣＤ：{1}<br>{2}<p>
	 * DACの更新権限用<br>
	 */
	public static String MAUCL0063 = "MAUCL0063";

	/** LEVEL[W]<br>システムパラメータ情報を取得できませんでした。システムパラメータマスタを確認してください。<br>パラメータキー：{1}<p>
	 */
	public static String MAUCL0106 = "MAUCL0106";

	/** LEVEL[E]<br>チェック対象の部門が指定されていません。<p>
	 */
	public static String MAUCL0107 = "MAUCL0107";

	/** LEVEL[E]<br>チェック対象の物流グループが指定されていません。<p>
	 */
	public static String MAUCL0108 = "MAUCL0108";

	/** LEVEL[E]<br>チェック対象の場所が指定されていません。<p>
	 */
	public static String MAUCL0109 = "MAUCL0109";

	/** LEVEL[E]<br>チェック対象のワーキンググループが指定されていません。<p>
	 */
	public static String MAUCL0110 = "MAUCL0110";

	/** LEVEL[D]<br>通貨換算処理をスキップします。<br>単価または金額：{1}<br>為替レート：{2}<br>小数部有効桁数：{3}<br>為替端数処理区分：{4}<p>
	 */
	public static String MAUCL0111 = "MAUCL0111";

	/** LEVEL[W]<br>指定されたロケール・コードはロケールエントリに存在しません。<br>{1}<p>
	 */
	public static String MAUCL0112 = "MAUCL0112";

	/** LEVEL[E]<br>チェック対象の総量引当場所グループが指定されていません。<p>
	 */
	public static String MAUCL0113 = "MAUCL0113";

	/** LEVEL[I]<br>バッチ処理が開始しました。<br>処理グループ名：{1}<br>ログＮＯ：{2}<br>ロジック名：{3}<br>オペレーション名：{4}<p>
	 */
	public static String MAUCL0114 = "MAUCL0114";

	/** LEVEL[I]<br>バッチ処理が終了しました。<br>処理グループ名：{1}<br>ログＮＯ：{2}<br>ロジック名：{3}<br>オペレーション名：{4}<p>
	 */
	public static String MAUCL0115 = "MAUCL0115";

	/** LEVEL[W]<br>バッチ処理でエラーが発生しました。<br>処理グループ名：{1}<br>ログＮＯ：{2}<br>ロジック名：{3}<br>オペレーション名：{4}<p>
	 */
	public static String MAUCL0116 = "MAUCL0116";

	/** LEVEL[W]<br>原価管理がインストールされていないため、配賦情報の更新ができませんでした。<p>
	 */
	public static String MAUCL0117 = "MAUCL0117";

	/** LEVEL[W]<br>指定された日付において有効な部門として登録されていません。<br>部門：{1}<br>日付：{2}<br>{3}<p>
	 */
	public static String MAUCL0118 = "MAUCL0118";

	/** LEVEL[W]<br>ＩＦ処理区分もしくは実行会社ＣＤが設定されていません。<p>
	 */
	public static String MAUCL0119 = "MAUCL0119";

	/** LEVEL[W]<br>実行会社ＣＤが一致しないため、更新ができません。<br>ＩＦ処理区分：{1}<br>会社ＣＤ：{2}<br>実行会社ＣＤ：{3}<p>
	 */
	public static String MAUCL0120 = "MAUCL0120";

	/** LEVEL[W]<br>BI Linkバッチ制御の更新に失敗しました。<br>ＩＦ処理区分：{1}<br>会社ＣＤ：{2}<br>実行会社ＣＤ：{3}<p>
	 */
	public static String MAUCL0121 = "MAUCL0121";

	/** LEVEL[W]<br>指定された期の情報がみつかりません。<br>指定された期：{1}<p>
	 */
	public static String MAUCP0001 = "MAUCP0001";

	/** LEVEL[W]<br>値の設定に失敗しました。<p>
	 */
	public static String MAUCP0022 = "MAUCP0022";

	/** LEVEL[W]<br>入力値チェックの上限を上回りました。<br>入力値（{1}）：{2}<br>上限（{3}*{4}）：{5}<br>{6}<br>{7}<p>
	 */
	public static String MAUCP0023 = "MAUCP0023";

	/** LEVEL[W]<br>入力値チェックの下限を下回りました。<br>入力値（{1}）：{2}<br>下限（{3}*{4}）：{5}<br>{6}<br>{7}<p>
	 */
	public static String MAUCP0024 = "MAUCP0024";

	/** LEVEL[I]<br>{1}：{2}<p>
	 * {1} カラム名（メッセージ用名称）<br>
	 */
	public static String MAUCP0025 = "MAUCP0025";

	/** LEVEL[W]<br>品目に使用できない文字が含まれています。<br>品目：{1}<br>使用できない文字：{2}<p>
	 */
	public static String MAUCP0031 = "MAUCP0031";

	/** LEVEL[W]<br>枝番１に使用できない文字が含まれています。<br>枝番１：{1}<br>使用できない文字：{2}<p>
	 */
	public static String MAUCP0032 = "MAUCP0032";

	/** LEVEL[W]<br>枝番２に使用できない文字が含まれています。<br>枝番２：{1}<br>使用できない文字：{2}<p>
	 */
	public static String MAUCP0033 = "MAUCP0033";

	/** LEVEL[W]<br>品目ＣＤのＮ番目のデリミタが未設定にも関わらず、枝番Ｎ以降に値が設定されています。<br>枝番１：{1}<br>枝番２：{2}<br>枝番３：{3}<br>Ｎ：{4}<p>
	 */
	public static String MAUCP0034 = "MAUCP0034";

	/** LEVEL[D]<br>基準単位への換算処理をスキップします。<br>数量：{1}<br>単位換算数：{2}<br>小数部有効桁数：{3}<br>単位換算端数処理区分：{4}<p>
	 * 基準単位以外から基準単位への換算処理を実行しなかったときのメッセージ<br>
	 */
	public static String MAUCP0035 = "MAUCP0035";

	/** LEVEL[D]<br>単位換算処理をスキップします。<br>基準単位数量：{1}<br>単位換算数：{2}<br>小数部有効桁数：{3}<br>単位換算端数処理区分：{4}<p>
	 * 基準単位から基準単位以外の単位への換算処理を実行しなかったときのメッセージ<br>
	 */
	public static String MAUCP0036 = "MAUCP0036";

	/** LEVEL[D]<br>単位換算処理をスキップします。<br>数量：{1}<br>変換元単位の単位換算数：{2}<br>変換先単位の単位換算数：{2}<br>小数部有効桁数：{3}<br>単位換算端数処理区分：{4}<p>
	 * 基準単位以外から別の基準単位以外の単位への換算処理を実行しなかったときのメッセージ<br>
	 */
	public static String MAUCP0037 = "MAUCP0037";

	/** LEVEL[D]<br>有効成分単位への換算処理をスキップします。<br>基準単位数量：{1}<br>有効成分係数：{2}<br>有効成分小数部有効桁数：{3}<br>有効成分単位換算端数処理区分：{4}<p>
	 * 基準単位から有効成分単位への換算処理を実行しなかったときのメッセージ<br>
	 */
	public static String MAUCP0038 = "MAUCP0038";

	/** LEVEL[D]<br>有効成分単位から基準単位への換算処理をスキップします。<br>有効成分：{1}<br>有効成分係数：{2}<br>基準単位小数部有効桁数：{3}<br>基準単位換算端数処理区分：{4}<p>
	 * 有効成分単位から基準単位への換算処理を実行しなかったときのメッセージ<br>
	 */
	public static String MAUCP0039 = "MAUCP0039";

	/** LEVEL[D]<br>有効成分係数の計算処理をスキップします。<br>基準単位数量：{1}<br>有効成分：{2}<br>有効成分小数部有効桁数：{3}<p>
	 * 有効成分係数の計算処理を実行しなかったときのメッセージ<br>
	 */
	public static String MAUCP0040 = "MAUCP0040";

	/** LEVEL[D]<br>通貨換算処理をスキップします。<br>単価または金額：{1}<br>為替レート：{2}<br>小数部有効桁数：{3}<br>為替端数処理区分：{4}<p>
	 */
	public static String MAUCP0041 = "MAUCP0041";

	/** LEVEL[D]<br>金額計算処理をスキップします。<br>単価：{1}<br>数量：{2}<br>小数部有効桁数：{3}<br>金額端数処理区分：{4}<p>
	 */
	public static String MAUCP0047 = "MAUCP0047";

	/** LEVEL[D]<br>単価計算処理をスキップします。<br>金額：{1}<br>数量：{2}<br>単価小数部有効桁数：{3}<p>
	 */
	public static String MAUCP0048 = "MAUCP0048";

	/** LEVEL[D]<br>税金額計算処理をスキップします。<br>金額：{1}<br>税率：{2}<br>金額小数部有効桁数：{3}<br>税額端数処理区分：{4}<p>
	 */
	public static String MAUCP0049 = "MAUCP0049";

	/** LEVEL[D]<br>基準通貨金額計算処理をスキップします。<br>金額：{1}<br>為替レート：{2}<br>小数部有効桁数：{3}<br>端数処理区分：{4}<p>
	 */
	public static String MAUCP0050 = "MAUCP0050";

	/** LEVEL[D]<br>基準通貨単価計算処理をスキップします。<br>単価：{1}<br>為替レート：{2}<br>小数部有効桁数：{3}<br>端数処理区分：{4}<p>
	 */
	public static String MAUCP0051 = "MAUCP0051";

	/** LEVEL[D]<br>基準通貨税金額計算処理をスキップします。<br>税金額：{1}<br>為替レート：{2}<br>小数部有効桁数：{3}<br>端数処理区分：{4}<p>
	 */
	public static String MAUCP0052 = "MAUCP0052";

	/** LEVEL[W]<br>指定された開始年月の期情報がみつかりません。<br>指定された期開始年月：{1}<p>
	 */
	public static String MAUCP0053 = "MAUCP0053";

	/** LEVEL[E]<br>案分対象のリストが存在しないか0件です。<p>
	 */
	public static String MAUCP0056 = "MAUCP0056";

	/** LEVEL[E]<br>案分対象のリストの、割当比率が格納されている列のデータがありません。<br>割当比率が格納されている列名：{1}<p>
	 */
	public static String MAUCP0057 = "MAUCP0057";

	/** LEVEL[W]<br>開始年月終了年月に重複期間があります。<br>行：{1}<br>行：{2}<p>
	 */
	public static String MAUCP0062 = "MAUCP0062";

	/** LEVEL[W]<br>開始年月終了年月に重複期間があったため、自動調整しました。<br>行：{1}<br>行：{2}<p>
	 */
	public static String MAUCP0063 = "MAUCP0063";

	/** LEVEL[W]<br>開始年月終了年月に重複期間があります。開始年月が同じため自動調整できませんでした。<br>行：{1}<br>行：{2}<p>
	 */
	public static String MAUCP0064 = "MAUCP0064";

	/** LEVEL[W]<br>振り分け処理で残数が発生しました。残数：{1}<p>
	 */
	public static String MAUCP0067 = "MAUCP0067";

	/** LEVEL[W]<br>担当者権限マスタからログインユーザの主部門が取得できませんでした。<br>マスタ適用日：{1}<p>
	 */
	public static String MAUCP0068 = "MAUCP0068";

	/** LEVEL[W]<br>合計値が入力値チェックの上限を上回りました。<br>入力値（{1}）：{2}<br>登録済実績値（{3}）：{4}<br>合計値（入力値＋登録済実績値）：{5}<br>上限（{6}*{7}）：{8}<br>{9}<br>{10}<p>
	 */
	public static String MAUCP0069 = "MAUCP0069";

	/** LEVEL[W]<br>合計値が入力値チェックの下限を下回りました。<br>入力値（{1}）：{2}<br>登録済実績値（{3}）：{4}<br>合計値（入力値＋登録済実績値）：{5}<br>下限（{6}*{7}）：{8}<br>{9}<br>{10}<p>
	 */
	public static String MAUCP0070 = "MAUCP0070";

	/** LEVEL[W]<br>年は{1}から{2}の範囲で指定してください。<p>
	 */
	public static String MAUCP0307 = "MAUCP0307";

	/** LEVEL[W]<br>開始日終了日に重複期間があります。<br>行：{1}<br>行：{2}<p>
	 */
	public static String MAUCP0331 = "MAUCP0331";

	/** LEVEL[W]<br>開始日終了日に重複期間があったため、自動調整しました。<br>行：{1}<br>行：{2}<p>
	 */
	public static String MAUCP0332 = "MAUCP0332";

	/** LEVEL[W]<br>開始日終了日に重複期間があります。開始日が同じため自動調整できませんでした。<br>行：{1}<br>行：{2}<p>
	 */
	public static String MAUCP0333 = "MAUCP0333";

	/** LEVEL[W]<br>定数が数値に変換できません。<br>定数名：{1}<br>設定値：{2}<p>
	 */
	public static String MAUCD0001 = "MAUCD0001";

	/** LEVEL[W]<br>既に使用されているオブジェクト名です。<br>設定値：{1}<p>
	 */
	public static String MAUCD0002 = "MAUCD0002";

	/** LEVEL[W]<br>定数にしている文字列が指定された数値の精度を超えています。定数名：{1}  設定値：{2}<p>
	 */
	public static String MAUCD0003 = "MAUCD0003";

	/** LEVEL[T]<br>引数のシーケンス区分を変更します。<br>旧：{1}<br>新：{2}<p>
	 */
	public static String MAUCD0004 = "MAUCD0004";

	/** LEVEL[W]<br>発番情報テーブルのロックに失敗しました。(エラーコード：{1})<br>発番業務区分：{2}<br>発番パタンＣＤ：{3}<br>要素区分：{4}<p>
	 */
	public static String MAUCD0005 = "MAUCD0005";

	/** LEVEL[W]<br>発番ロジックでシーケンスの発番に失敗しました。(エラーコード：{1})<br>発番業務区分：{2}<br>発番パタン：{3}<br>要素区分：{4}<br>シーケンス名：{5}<p>
	 * 対処方法としては,シーケンス作成処理に問題があるか,MAT_SEQのORA_SEQ_NMが編集されていないかなどを調査する<br>
	 */
	public static String MAUCD0006 = "MAUCD0006";

	/** LEVEL[W]<br>発番情報テーブルで自動セット不許可のカウンタが最大値を超えました。<br>発番業務区分：{1}<br>発番パタン：{2}<br>要素区分：{3}<p>
	 * 対処方法：MAT_SEQ又は,MAM_NUM_PTNメンテナンスが必要<br>
	 */
	public static String MAUCD0007 = "MAUCD0007";

	/** LEVEL[W]<br>場所マスタが登録されていません。<br>場所：{1}<p>
	 */
	public static String MAUCD0008 = "MAUCD0008";

	/** LEVEL[W]<br>発番情報テーブルの排他処理エラーが発生しました。<br>発番業務区分：{1}<br>発番パタンＣＤ：{2}<br>要素区分：{3}<br>シーケンス区分(前)：{4}<br>シーケンス区分(今)：{5}<p>
	 */
	public static String MAUCD0009 = "MAUCD0009";

	/** LEVEL[W]<br>要素区分に予期せぬ値がセットされました。<br>発番業務区分：{1}<br>発番パタン：{2}<br>要素区分：{3}<p>
	 */
	public static String MAUCD0010 = "MAUCD0010";

	/** LEVEL[W]<br>発番パタンマスタが見つかりません。<br>発番業務区分：{1}<br>発番パタン：{2}<p>
	 */
	public static String MAUCD0011 = "MAUCD0011";

	/** LEVEL[W]<br>シーケンス区分に予期せぬ値がセットされました。<br>発番業務区分：{1}<br>発番パタン：{2}<br>要素区分：{3}<br>シーケンス区分：{4}<p>
	 */
	public static String MAUCD0012 = "MAUCD0012";

	/** LEVEL[W]<br>発番結果が非表示項目用文字列の桁数を超えました。<br>発番業務区分：{1}<br>発番パタンＣＤ：{2}<br>カラム名：{3}<br>結合文字列１：{4}<br>結合文字列２：{5}<p>
	 */
	public static String MAUCD0013 = "MAUCD0013";

	/** LEVEL[W]<br>発番情報テーブルの設定値が不正です（最小値が最大値より大きい）。<br>発番業務区分：{1}<br>発番パタンＣＤ：{2}<br>要素区分：{3}<p>
	 */
	public static String MAUCD0014 = "MAUCD0014";

	/** LEVEL[W]<br>シーケンス発番処理に失敗しました(エラーコード：{1})。<br>シーケンス名： {2}<p>
	 */
	public static String MAUCD0015 = "MAUCD0015";

	/** LEVEL[W]<br>会社マスタが登録されていません。<p>
	 */
	public static String MAUCD0016 = "MAUCD0016";

	/** LEVEL[W]<br>シーケンスの作成に失敗しました。<br>発番処理用定数のデフォルトの最小値は最大値より小さい必要があります。<br>最小値のデフォルト：{1}<br>最大値のデフォルト：{2}<p>
	 */
	public static String MAUCD0017 = "MAUCD0017";

	/** LEVEL[W]<br>端数処理区分が不正なため、端数処理に失敗しました。<br>端数処理区分：{1}<p>
	 */
	public static String MAUCD0018 = "MAUCD0018";

	/** LEVEL[W]<br>格付マスタから有効な格付が1件も取得できませんでした。<p>
	 */
	public static String MAUCD0019 = "MAUCD0019";

	/** LEVEL[W]<br>取引パタン区分に対して取引マスタから自動時採用が設定されている取引が取得できませんでした。<br>取引パタン区分：{1}<p>
	 */
	public static String MAUCD0020 = "MAUCD0020";

	/** LEVEL[W]<br>業務理由マスタから固定ロスが設定されている業務理由を取得できませんでした。<p>
	 */
	public static String MAUCD0021 = "MAUCD0021";

	/** LEVEL[W]<br>発番結果が表示用文字列の桁数を超えました。<br>発番業務区分：{1}<br>発番パタンＣＤ：{2}<br>カラム名：{3}<br>結合文字列１：{4}<br>結合文字列２：{5}<p>
	 */
	public static String MAUCD0022 = "MAUCD0022";

	/** LEVEL[W]<br>通貨マスタが取得できませんでした。<br>通貨ＣＤ：{1}<p>
	 */
	public static String MAUCD0023 = "MAUCD0023";

	/** LEVEL[W]<br>為替レートマスタが取得できませんでした。<br>換算元通貨ＣＤ：{1}<br>換算先通貨ＣＤ：{2}<br>為替レートＣＤ：{3}<br>基準日：{4}<p>
	 */
	public static String MAUCD0024 = "MAUCD0024";

	/** LEVEL[W]<br>為替レート換算の結果、桁あふれが発生しました。入力値やマスタの設定を確認してください。<br>金額：{1}<br>為替レート：{2}<br>換算結果：{3}<p>
	 */
	public static String MAUCD0025 = "MAUCD0025";

	/** LEVEL[W]<br>ロットＮＯが未指定のため、発番できません。<br>発番業務区分：{1}<br>発番パタンＣＤ：{2}<br>要素区分：{3}<p>
	 */
	public static String MAUCD0026 = "MAUCD0026";

	/** LEVEL[W]<br>手配ＮＯ１が未指定のため、発番できません。<br>発番業務区分：{1}<br>発番パタンＣＤ：{2}<br>要素区分：{3}<p>
	 */
	public static String MAUCD0027 = "MAUCD0027";

	/** LEVEL[W]<br>手配ＮＯ２が未指定のため、発番できません。<br>発番業務区分：{1}<br>発番パタンＣＤ：{2}<br>要素区分：{3}<p>
	 */
	public static String MAUCD0028 = "MAUCD0028";

	/** LEVEL[W]<br>手配ＮＯ３が未指定のため、発番できません。<br>発番業務区分：{1}<br>発番パタンＣＤ：{2}<br>要素区分：{3}<p>
	 */
	public static String MAUCD0029 = "MAUCD0029";

	/** LEVEL[W]<br>手配ＮＯ４が未指定のため、発番できません。<br>発番業務区分：{1}<br>発番パタンＣＤ：{2}<br>要素区分：{3}<p>
	 */
	public static String MAUCD0030 = "MAUCD0030";

	/** LEVEL[W]<br>発番パタンが未指定のため、発番できません。<br>発番業務区分：{1}<p>
	 */
	public static String MAUCD0031 = "MAUCD0031";

	/** LEVEL[W]<br>発番要素となる項目に値が指定されていないため、発番できません。<br>項目：{1}<br>発番業務区分：{2}<br>発番パタンＣＤ：{3}<br>要素区分：{4}<p>
	 */
	public static String MAUCD0032 = "MAUCD0032";

	/** LEVEL[W]<br>品目マスタ（工場・物流倉庫）に対象レコードが存在しないため、発番できません。<br>発番業務区分：{1}<br>発番パタンＣＤ：{2}<br>要素区分：{3}<br>品目：{4}<br>工場・物流倉庫ＣＤ：{5}<p>
	 */
	public static String MAUCD0033 = "MAUCD0033";

	/** LEVEL[W]<br>品目マスタに対象レコードが存在しないため、発番できません。<br>発番業務区分：{1}<br>発番パタンＣＤ：{2}<br>要素区分：{3}<br>品目：{4}<p>
	 */
	public static String MAUCD0034 = "MAUCD0034";

	/** LEVEL[W]<br>取引先マスタに対象レコードが存在しないため、発番できません。<br>発番業務区分：{1}<br>発番パタンＣＤ：{2}<br>要素区分：{3}<br>取引先ＣＤ：{4}<p>
	 */
	public static String MAUCD0035 = "MAUCD0035";

	/** LEVEL[E]<br>MAM_ITM_UNITは使用できません。MAVM_ITM_UNITを使用してください。<p>
	 */
	public static String MAUDD0001 = "MAUDD0001";

	/** LEVEL[E]<br>MAM_ITM_WGは使用できません。MAVM_ITM_WGを使用してください。<p>
	 */
	public static String MAUDD0002 = "MAUDD0002";

	/** LEVEL[W]<br>発番パタンマスタが見つかりません。<br>発番業務区分：{1}<br>発番パタン：{2}<p>
	 */
	public static String MAUDD0311 = "MAUDD0311";

	/** LEVEL[I]<br>{1}：{2}<p>
	 */
	public static String MAUDL0001 = "MAUDL0001";

	/** LEVEL[I]<br>行番号：{1}<p>
	 */
	public static String MAUDL0002 = "MAUDL0002";

	/** LEVEL[W]<br>次のデータは既に存在します。<br>{1}<p>
	 * {1}はキーの項目名と値<br>
	 */
	public static String MAUDL0003 = "MAUDL0003";

	/** LEVEL[W]<br>更新できませんでした。<p>
	 */
	public static String MAUDL0004 = "MAUDL0004";

	/** LEVEL[W]<br>取り消しできませんでした。<p>
	 */
	public static String MAUDL0005 = "MAUDL0005";

	/** LEVEL[W]<br>削除できませんでした。<p>
	 */
	public static String MAUDL0006 = "MAUDL0006";

	/** LEVEL[W]<br>ヘッダに紐づく明細が1行も存在しません。<br>ヘッダに紐づく明細を1行以上登録対象にしてください。<p>
	 */
	public static String MAUDL0007 = "MAUDL0007";

	/** LEVEL[I]<br>今回のバッチ処理で対象となるデータが1件も存在しません。<p>
	 */
	public static String MAUDL0008 = "MAUDL0008";

	/** LEVEL[W]<br>エラーが発生しています。バッチログ確認で内容を確認してください。<p>
	 */
	public static String MAUDL0009 = "MAUDL0009";

	/** LEVEL[W]<br>処理中にエラーが発生しました。<p>
	 */
	public static String MAUDL0010 = "MAUDL0010";

	/** LEVEL[W]<br>発行できませんでした。<p>
	 */
	public static String MAUDL0011 = "MAUDL0011";

	/** LEVEL[W]<br>明細に紐づく詳細が1行も存在しません。<br>明細に紐づく詳細を1行以上登録対象にしてください。<br>{1}<p>
	 */
	public static String MAUDL0012 = "MAUDL0012";

	/** LEVEL[W]<br>関連する行でエラーになりました。<br>エラー行：{1}<br>関連する行：{2}<p>
	 */
	public static String MAUDL0013 = "MAUDL0013";

	/** LEVEL[E]<br>発番の引数が不正です。<br>発番業務区分：{1}<br>引数の情報：<br>{2}<p>
	 */
	public static String MAUDL0021 = "MAUDL0021";

	/** LEVEL[W]<br>印刷対象のデータがありません。<p>
	 */
	public static String MAUDL0029 = "MAUDL0029";

	/** LEVEL[W]<br>登録対象の行は、開始日終了日が重複するレコードが既に存在します。<p>
	 */
	public static String MAUDL0324 = "MAUDL0324";

	/** LEVEL[W]<br>登録済データ間で期間重複があります。<p>
	 */
	public static String MAUDL0379 = "MAUDL0379";

	/** LEVEL[W]<br>登録対象データ間で期間重複があります。<p>
	 */
	public static String MAUDL0380 = "MAUDL0380";

	/** LEVEL[W]<br>登録対象データと登録済データ間で期間重複があります。<p>
	 */
	public static String MAUDL0381 = "MAUDL0381";

	/** LEVEL[W]<br>登録対象データと登録済データ間で期間重複（同一期間）があります。<p>
	 */
	public static String MAUDL0382 = "MAUDL0382";

	/** LEVEL[E]<br>ファイル出力対象のMCListが指定されていません。<p>
	 */
	public static String MAUDL0401 = "MAUDL0401";

	/** LEVEL[W]<br>ダウンロードする権限がありません。<p>
	 */
	public static String MAUDL0402 = "MAUDL0402";

	/** LEVEL[E]<br>非対応のファイル形式で出力先が指定されています。<br>出力先：{1}<p>
	 */
	public static String MAUDL0403 = "MAUDL0403";

	/** LEVEL[W]<br>ファイルの列数の上限を超えたデータが出力対象となっています。<p>
	 */
	public static String MAUDL0404 = "MAUDL0404";

	/** LEVEL[W]<br>上限より多いデータが検索されました。一部を取得します。<br>上限件数：{1}<br>検索件数：{2}<p>
	 */
	public static String MAUDL0405 = "MAUDL0405";

	/** LEVEL[I]<br>処理を開始しました。<br>ロジックＩＤ：{1}<br>オペレーションＩＤ：{2}<p>
	 */
	public static String MAUDL0406 = "MAUDL0406";

	/** LEVEL[I]<br>処理が終了しました。<br>ロジックＩＤ：{1}<br>オペレーションＩＤ：{2}<p>
	 */
	public static String MAUDL0407 = "MAUDL0407";

	/** LEVEL[W]<br>エラー件数が上限を超えたので、チェック処理を中断しました。<br>上限件数：{1}<br>エラー件数：{2}<p>
	 */
	public static String MAUDL0408 = "MAUDL0408";

	/** LEVEL[I]<br>{1}<p>
	 */
	public static String MAUDL0409 = "MAUDL0409";

	/** LEVEL[W]<br>エラーが多数発生しました。バッチログ確認画面でエラー内容を確認してください。<p>
	 */
	public static String MAUDL0410 = "MAUDL0410";

	/** LEVEL[W]<br>指定した会社ＣＤに対する権限がありません。<br>会社ＣＤ：{1}<p>
	 */
	public static String MAUDL0411 = "MAUDL0411";

	/** LEVEL[W]<br>指定した外部システムＣＤは存在しません。<br>外部システムＣＤ：{1}<p>
	 */
	public static String MAUDL0412 = "MAUDL0412";

	/** LEVEL[W]<br>指定した外部システムＣＤの外部システム区分が不正です。<br>外部システムＣＤ：{1}<br>外部システム区分：{2}<p>
	 */
	public static String MAUDL0413 = "MAUDL0413";

	/** LEVEL[W]<br>バッチは現在実行中のため、実行することができません。<br>ＩＦ処理区分：{1}<br>会社ＣＤ：{2}<p>
	 */
	public static String MAUDL0414 = "MAUDL0414";

	/** LEVEL[W]<br>ＤＢコンテナを作成できません。<br>クラス：{1}<p>
	 */
	public static String MAUDL0415 = "MAUDL0415";

	/** LEVEL[I]<br>処理（{1}）を実行します。よろしいですか？<p>
	 * {1}には操作種別のラベルを設定<br>
	 */
	public static String MAUDP0001 = "MAUDP0001";

	/** LEVEL[I]<br>処理（{1}）が終了しました。<p>
	 * {1}には操作種別のラベルを設定<br>
	 */
	public static String MAUDP0002 = "MAUDP0002";

	/** LEVEL[W]<br>処理（{1}）に失敗しました。<p>
	 * {1}には操作種別のラベルを設定<br>
	 */
	public static String MAUDP0003 = "MAUDP0003";

	/** LEVEL[W]<br>ファイルにアクセスできませんでした。<br>ファイルが存在しません。<br>ファイル名：{1}<p>
	 */
	public static String MAUDP0004 = "MAUDP0004";

	/** LEVEL[I]<br>更新前のチェック処理が終了しました。更新処理を実行してください。<p>
	 */
	public static String MAUDP0005 = "MAUDP0005";

	/** LEVEL[W]<br>更新前のチェックができませんでした。<p>
	 */
	public static String MAUDP0006 = "MAUDP0006";

	/** LEVEL[W]<br>過去リビジョンのデータを変更することはできません。<p>
	 */
	public static String MAUDP0007 = "MAUDP0007";

	/** LEVEL[E]<br>入力補助画面を起動できない検索区分が指定されました。<br>検索区分：{1}<p>
	 */
	public static String MAUDP0008 = "MAUDP0008";

	/** LEVEL[W]<br>取消データを変更することはできません。<p>
	 */
	public static String MAUDP0009 = "MAUDP0009";

	/** LEVEL[W]<br>登録対象が共通の場合は、以下の項目を指定できません。<br>項目：{1}<p>
	 */
	public static String MAUDP0010 = "MAUDP0010";

	/** LEVEL[W]<br>登録できませんでした。<p>
	 */
	public static String MAUDP0012 = "MAUDP0012";

	/** LEVEL[W]<br>次のデータは既に存在します。<br>{1}<p>
	 * {1}はキーの項目名と値<br>
	 */
	public static String MAUDP0013 = "MAUDP0013";

	/** LEVEL[W]<br>次のデータは「{1}」で使用されています。<br>{2}<p>
	 * {1}はテーブル名<br>
	 * {2}はキーの項目名と値<br>
	 */
	public static String MAUDP0014 = "MAUDP0014";

	/** LEVEL[W]<br>対象のデータを選択してください。<p>
	 */
	public static String MAUDP0038 = "MAUDP0038";

	/** LEVEL[E]<br>型変換エラー。<br>引数は、getCheckedRowListBlock()で指定したリストのRowクラス<br>の代入互換できるクラスを指定する必要があります。<br>getCheckedRowListBlock()で指定したリストのRowクラス：{1}<br>引数で指定されたクラス：{2}<p>
	 */
	public static String MAUDP0039 = "MAUDP0039";

	/** LEVEL[D]<br>checkInvisibleRowInUpParamを開始します。<p>
	 */
	public static String MAUDP0068 = "MAUDP0068";

	/** LEVEL[D]<br>checkInvisibleRowInUpParamを終了しました。<p>
	 */
	public static String MAUDP0069 = "MAUDP0069";

	/** LEVEL[W]<br>会社が取得できません。<p>
	 */
	public static String MAUDP0087 = "MAUDP0087";

	/** LEVEL[W]<br>次のデータが「{1}」に存在しません。マスタが変更、または削除されています。<br>値：{2}<p>
	 * {1}はテーブル名<br>
	 */
	public static String MAUDP0092 = "MAUDP0092";

	/** LEVEL[I]<br>以下のメッセージがあります。処理を続行しますか？<p>
	 */
	public static String MAUDP0093 = "MAUDP0093";

	/** LEVEL[W]<br>更新権限がありません。<p>
	 * DACの更新権限用<br>
	 */
	public static String MAUDP0094 = "MAUDP0094";

	/** LEVEL[W]<br>更新権限がありません。<br>行：{1}<p>
	 * DACの更新権限用<br>
	 */
	public static String MAUDP0095 = "MAUDP0095";

	/** LEVEL[I]<br>取消処理を実行します。よろしいですか？<p>
	 */
	public static String MAUDP0098 = "MAUDP0098";

	/** LEVEL[I]<br>取り消しました。<p>
	 */
	public static String MAUDP0099 = "MAUDP0099";

	/** LEVEL[W]<br>取消できませんでした。<p>
	 */
	public static String MAUDP0100 = "MAUDP0100";

	/** LEVEL[D]<br>clearを開始します。<p>
	 */
	public static String MAUDP0106 = "MAUDP0106";

	/** LEVEL[D]<br>clearを終了しました。<p>
	 */
	public static String MAUDP0107 = "MAUDP0107";

	/** LEVEL[D]<br>beforeCallPartsを開始します。<p>
	 */
	public static String MAUDP0108 = "MAUDP0108";

	/** LEVEL[D]<br>beforeCallPartsを終了しました。<p>
	 */
	public static String MAUDP0109 = "MAUDP0109";

	/** LEVEL[D]<br>setupParamを開始します。<p>
	 */
	public static String MAUDP0110 = "MAUDP0110";

	/** LEVEL[D]<br>setupParamを終了しました。<p>
	 */
	public static String MAUDP0111 = "MAUDP0111";

	/** LEVEL[D]<br>beforeCallを開始します。<p>
	 */
	public static String MAUDP0112 = "MAUDP0112";

	/** LEVEL[D]<br>beforeCallを終了しました。<p>
	 */
	public static String MAUDP0113 = "MAUDP0113";

	/** LEVEL[D]<br>setLimitParamSizeを開始します。<p>
	 */
	public static String MAUDP0114 = "MAUDP0114";

	/** LEVEL[D]<br>setLimitParamSizeを終了しました。<p>
	 */
	public static String MAUDP0115 = "MAUDP0115";

	/** LEVEL[D]<br>callを開始します。<p>
	 */
	public static String MAUDP0118 = "MAUDP0118";

	/** LEVEL[D]<br>callを終了しました。<p>
	 */
	public static String MAUDP0119 = "MAUDP0119";

	/** LEVEL[D]<br>handleMCExを開始します。<p>
	 */
	public static String MAUDP0120 = "MAUDP0120";

	/** LEVEL[D]<br>setModeNoDownを開始します。<p>
	 */
	public static String MAUDP0121 = "MAUDP0121";

	/** LEVEL[D]<br>setModeNoDownを終了しました。<p>
	 */
	public static String MAUDP0122 = "MAUDP0122";

	/** LEVEL[D]<br>moveFocusNoDownを開始します。<p>
	 */
	public static String MAUDP0123 = "MAUDP0123";

	/** LEVEL[D]<br>moveFocusNoDownを終了しました。<p>
	 */
	public static String MAUDP0124 = "MAUDP0124";

	/** LEVEL[D]<br>afterCapErrorを開始します。<p>
	 */
	public static String MAUDP0125 = "MAUDP0125";

	/** LEVEL[D]<br>afterCapErrorを終了しました。<p>
	 */
	public static String MAUDP0126 = "MAUDP0126";

	/** LEVEL[D]<br>afterCallを開始します。<p>
	 */
	public static String MAUDP0127 = "MAUDP0127";

	/** LEVEL[D]<br>afterCallを終了しました。<p>
	 */
	public static String MAUDP0128 = "MAUDP0128";

	/** LEVEL[D]<br>showを開始します。<p>
	 */
	public static String MAUDP0129 = "MAUDP0129";

	/** LEVEL[D]<br>showを終了しました。<p>
	 */
	public static String MAUDP0130 = "MAUDP0130";

	/** LEVEL[D]<br>adjustListを開始します。<p>
	 */
	public static String MAUDP0131 = "MAUDP0131";

	/** LEVEL[D]<br>adjustListを終了しました。<p>
	 */
	public static String MAUDP0132 = "MAUDP0132";

	/** LEVEL[D]<br>setModeを開始します。<p>
	 */
	public static String MAUDP0133 = "MAUDP0133";

	/** LEVEL[D]<br>setModeを終了しました。<p>
	 */
	public static String MAUDP0134 = "MAUDP0134";

	/** LEVEL[D]<br>moveFocusを開始します。<p>
	 */
	public static String MAUDP0135 = "MAUDP0135";

	/** LEVEL[D]<br>moveFocusを終了しました。<p>
	 */
	public static String MAUDP0136 = "MAUDP0136";

	/** LEVEL[D]<br>showMsgを開始します。<p>
	 */
	public static String MAUDP0137 = "MAUDP0137";

	/** LEVEL[D]<br>showMsgを終了しました。<p>
	 */
	public static String MAUDP0138 = "MAUDP0138";

	/** LEVEL[D]<br>printを開始します。<p>
	 */
	public static String MAUDP0139 = "MAUDP0139";

	/** LEVEL[D]<br>printを終了しました。<p>
	 */
	public static String MAUDP0140 = "MAUDP0140";

	/** LEVEL[D]<br>resultSuccessを開始します。<p>
	 */
	public static String MAUDP0141 = "MAUDP0141";

	/** LEVEL[D]<br>resultSuccessを終了しました。<p>
	 */
	public static String MAUDP0142 = "MAUDP0142";

	/** LEVEL[D]<br>setModeNoDownを開始します。<p>
	 */
	public static String MAUDP0143 = "MAUDP0143";

	/** LEVEL[D]<br>setModeNoDownを終了しました。<p>
	 */
	public static String MAUDP0144 = "MAUDP0144";

	/** LEVEL[D]<br>moveFocusNoDownを開始します。<p>
	 */
	public static String MAUDP0145 = "MAUDP0145";

	/** LEVEL[D]<br>moveFocusNoDownを終了しました。<p>
	 */
	public static String MAUDP0146 = "MAUDP0146";

	/** LEVEL[D]<br>showNoDownDataMsgを開始します。<p>
	 */
	public static String MAUDP0147 = "MAUDP0147";

	/** LEVEL[D]<br>showNoDownDataMsgを終了しました。<p>
	 */
	public static String MAUDP0148 = "MAUDP0148";

	/** LEVEL[D]<br>resultNoDataFoundを開始します。<p>
	 */
	public static String MAUDP0149 = "MAUDP0149";

	/** LEVEL[D]<br>resultNoDataFoundを終了しました。<p>
	 */
	public static String MAUDP0150 = "MAUDP0150";

	/** LEVEL[D]<br>afterCallPartsを開始します。<p>
	 */
	public static String MAUDP0155 = "MAUDP0155";

	/** LEVEL[D]<br>afterCallPartsを終了しました。<p>
	 */
	public static String MAUDP0156 = "MAUDP0156";

	/** LEVEL[D]<br>sortを開始します。<p>
	 */
	public static String MAUDP0157 = "MAUDP0157";

	/** LEVEL[D]<br>sortを終了しました。<p>
	 */
	public static String MAUDP0158 = "MAUDP0158";

	/** LEVEL[D]<br>showMergeを開始します。<p>
	 */
	public static String MAUDP0159 = "MAUDP0159";

	/** LEVEL[D]<br>showMergeを終了しました。<p>
	 */
	public static String MAUDP0160 = "MAUDP0160";

	/** LEVEL[W]<br>0以外の数字を指定してください。<br>項目：{1}<p>
	 */
	public static String MAUDP0161 = "MAUDP0161";

	/** LEVEL[W]<br>0以外の数字を指定してください。<br>列：{1}<br>行：{2}<p>
	 */
	public static String MAUDP0162 = "MAUDP0162";

	/** LEVEL[D]<br>showCanceledMsgを開始します。<p>
	 */
	public static String MAUDP0164 = "MAUDP0164";

	/** LEVEL[D]<br>showCanceledMsgを終了しました。<p>
	 */
	public static String MAUDP0165 = "MAUDP0165";

	/** LEVEL[D]<br>checkLimitULSizeを開始します。<p>
	 */
	public static String MAUDP0166 = "MAUDP0166";

	/** LEVEL[D]<br>checkLimitULSizeを終了しました。<p>
	 */
	public static String MAUDP0167 = "MAUDP0167";

	/** LEVEL[I]<br>承認処理を実行します。よろしいですか？<p>
	 */
	public static String MAUDP0168 = "MAUDP0168";

	/** LEVEL[I]<br>承認処理を実行しました。<p>
	 */
	public static String MAUDP0169 = "MAUDP0169";

	/** LEVEL[I]<br>承認取消処理を実行します。よろしいですか？<p>
	 */
	public static String MAUDP0170 = "MAUDP0170";

	/** LEVEL[I]<br>承認取消処理を実行しました。<p>
	 */
	public static String MAUDP0171 = "MAUDP0171";

	/** LEVEL[I]<br>判定処理を実行します。よろしいですか？<p>
	 */
	public static String MAUDP0172 = "MAUDP0172";

	/** LEVEL[I]<br>判定処理を実行しました。<p>
	 */
	public static String MAUDP0173 = "MAUDP0173";

	/** LEVEL[I]<br>判定取消処理を実行します。よろしいですか？<p>
	 */
	public static String MAUDP0174 = "MAUDP0174";

	/** LEVEL[I]<br>判定取消処理を実行しました。<p>
	 */
	public static String MAUDP0175 = "MAUDP0175";

	/** LEVEL[I]<br>却下取消処理を実行します。よろしいですか？<p>
	 */
	public static String MAUDP0176 = "MAUDP0176";

	/** LEVEL[I]<br>却下取消処理を実行しました。<p>
	 */
	public static String MAUDP0177 = "MAUDP0177";

	/** LEVEL[W]<br>終了年度には開始年度より小さな年度を指定することはできません。<p>
	 */
	public static String MAUDP0311 = "MAUDP0311";

	/** LEVEL[W]<br>年は{1}から{2}の範囲で指定してください。<p>
	 */
	public static String MAUDP0321 = "MAUDP0321";

	/** LEVEL[W]<br>同一期間のレコードが登録済みのため補正できませんでした。<br>検索して確認してください。<br>{1}<p>
	 */
	public static String MAUDP0372 = "MAUDP0372";

	/** LEVEL[W]<br>この登録対象行と適用期間が重複するため、登録済みの行の適用期間を補正しました。<br>{1}<p>
	 * {1}には開始日以外のキーを設定<br>
	 */
	public static String MAUDP0373 = "MAUDP0373";

	/** LEVEL[W]<br>登録済みの行どうしで期間が重複するレコードがありました。<br>適用期間を補正してください。<br>{1}<p>
	 * {1}には開始日以外のキーを設定<br>
	 */
	public static String MAUDP0374 = "MAUDP0374";

	/** LEVEL[I]<br>重複期間を補正する対象のデータはありませんでした。<p>
	 */
	public static String MAUDP0375 = "MAUDP0375";

	/** LEVEL[I]<br>重複期間を補正しますか？<p>
	 */
	public static String MAUDP0376 = "MAUDP0376";

	/** LEVEL[I]<br>重複期間の補正を実行しました。<p>
	 */
	public static String MAUDP0377 = "MAUDP0377";

	/** LEVEL[I]<br>ダウンロードを実行します。よろしいですか？<p>
	 */
	public static String MAUDP0401 = "MAUDP0401";

	/** LEVEL[I]<br>バックグラウンドでダウンロードを実行しています。<p>
	 */
	public static String MAUDP0402 = "MAUDP0402";

	/** LEVEL[I]<br>待機中のダウンロードをキャンセルして処理を継続しますか？<br>対象：{1}<p>
	 */
	public static String MAUDP0403 = "MAUDP0403";

	/** LEVEL[I]<br>ダウンロードが終了しました。<br>対象：{1}<br>出力先：{2}<br>ファイル名：{3}<p>
	 */
	public static String MAUDP0404 = "MAUDP0404";

	/** LEVEL[W]<br>指定された出力先ディレクトリは不正なパスです。<br>ディレクトリ：{1}<p>
	 */
	public static String MAUDP0405 = "MAUDP0405";

	/** LEVEL[I]<br>上限より多いデータが検索されました。画面には一部を表示します。<br>全データをファイルで取得しますか？<br>上限件数：{1}<br>検索件数：{2}<p>
	 */
	public static String MAUDP0406 = "MAUDP0406";

	/** LEVEL[I]<br>上限より多いデータが検索されました。画面には一部を表示します。<br>上限件数：{1}<br>検索件数：{2}<p>
	 */
	public static String MAUDP0407 = "MAUDP0407";

	/** LEVEL[W]<br>ダウンロードに失敗しました。<br>指定したファイルが開かれている場合はファイルを閉じてからダウンロードしてください。<br>指定ファイル：{1}<p>
	 */
	public static String MAUDP0408 = "MAUDP0408";

	/** LEVEL[I]<br>行番号：{1}<p>
	 */
	public static String MAUDP0409 = "MAUDP0409";

	/** LEVEL[W]<br>日付の範囲は{1}日以内になるように指定してください。<p>
	 */
	public static String MAUDP0410 = "MAUDP0410";

	/** LEVEL[W]<br>年月の範囲は{1}ヶ月以内になるように指定してください。<p>
	 */
	public static String MAUDP0411 = "MAUDP0411";
}
