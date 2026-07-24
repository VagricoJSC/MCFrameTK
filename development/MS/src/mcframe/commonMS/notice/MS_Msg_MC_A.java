package mcframe.commonMS.notice;

public class MS_Msg_MC_A {
	/** LEVEL[I]<br>画面に存在しない行は取込みません。<br>ファイル行：{1}<br>品目：{2}<br>場所：{3}<p>
	 */
	public static String MSBAP0001 = "MSBAP0001";

	/** LEVEL[W]<br>同一ワーキンググループの依頼は登録できません。<br>依頼元ワーキンググループＣＤ：{1}<br>依頼先ワーキンググループＣＤ：{2}<br>{3}<p>
	 */
	public static String MSBAL0001 = "MSBAL0001";

	/** LEVEL[W]<br>発注先が指定されていません。<br>{1}<p>
	 */
	public static String MSBAL0002 = "MSBAL0002";

	/** LEVEL[W]<br>依頼先場所が指定されていません。<br>{1}<p>
	 */
	public static String MSBAL0003 = "MSBAL0003";

	/** LEVEL[I]<br>需要情報作成バッチを開始します。<p>
	 */
	public static String MSBAL0004 = "MSBAL0004";

	/** LEVEL[I]<br>需要情報作成バッチが終了しました。<p>
	 */
	public static String MSBAL0005 = "MSBAL0005";

	/** LEVEL[W]<br>需要情報分割マスタもしくは受注引当マスタに登録されていません。<br>品目：{1}<br>品目出荷グループＣＤ：{2}<br>物流グループＣＤ：{3}<br>ワーキンググループＣＤ：{4}<br>部門ＣＤ：{5}<br>適用日：{6}<p>
	 */
	public static String MSBAL0006 = "MSBAL0006";

	/** LEVEL[I]<br>ＷＧ間依頼が登録されました。<br>依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}<p>
	 */
	public static String MSBAL0007 = "MSBAL0007";

	/** LEVEL[I]<br>ＷＧ間依頼が訂正されました。<br>依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}<p>
	 */
	public static String MSBAL0008 = "MSBAL0008";

	/** LEVEL[I]<br>ＷＧ間依頼が削除されました。<br>依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}<p>
	 */
	public static String MSBAL0009 = "MSBAL0009";

	/** LEVEL[I]<br>ＷＧ間依頼に対する回答が登録されました。<br>依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}<p>
	 */
	public static String MSBAL0010 = "MSBAL0010";

	/** LEVEL[I]<br>ＷＧ間依頼に対する回答が削除されました。<br>依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}<p>
	 */
	public static String MSBAL0011 = "MSBAL0011";

	/** LEVEL[I]<br>ＷＧ間依頼に対する予定が指図登録されました。<br>依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}<p>
	 */
	public static String MSBAL0012 = "MSBAL0012";

	/** LEVEL[I]<br>ＷＧ間依頼に対する予定が実績登録されました。<br>依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}<p>
	 */
	public static String MSBAL0013 = "MSBAL0013";

	/** LEVEL[I]<br>ＷＧ間依頼に対する予定の指図が取り消されました。<br>依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}<p>
	 */
	public static String MSBAL0014 = "MSBAL0014";

	/** LEVEL[I]<br>ＷＧ間依頼に対する予定の実績が取り消されました。<br>依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}<p>
	 */
	public static String MSBAL0015 = "MSBAL0015";

	/** LEVEL[I]<br>ＷＧ間依頼に対する回答数量が不足しています。<br>依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}<p>
	 */
	public static String MSBAL0016 = "MSBAL0016";

	/** LEVEL[I]<br>ＷＧ間依頼に対する回答納期が遅れています。<br>依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}<p>
	 */
	public static String MSBAL0017 = "MSBAL0017";

	/** LEVEL[W]<br>品目詳細マスタに登録されていません。<br>品目：{1}<br>構成パタン：{2}<br>製造場所ＣＤ：{3}<br>発注先ＣＤ：{4}<br>依頼先場所ＣＤ：{5}<br>マスタ適用日：{6}<br>{7}<p>
	 */
	public static String MSBAL0018 = "MSBAL0018";

	/** LEVEL[W]<br>受注登録にて作成されたＷＧ間依頼は更新できません。<br>ＷＧ間依頼ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBAL0019 = "MSBAL0019";

	/** LEVEL[W]<br>取り消し済のＷＧ間依頼は更新できません。<br>ＷＧ間依頼ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBAL0020 = "MSBAL0020";

	/** LEVEL[W]<br>需要情報一覧登録にて登録したその他需要以外、更新できません。<br>需要ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBAL0021 = "MSBAL0021";

	/** LEVEL[W]<br>仕入直送に対する購買依頼の場合、1件で依頼数量分のみ確定可能です。<br>ＷＧ間依頼ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBAL0022 = "MSBAL0022";

	/** LEVEL[W]<br>品目詳細マスタがないため、発注先または依頼先場所を特定できません。<br>品目：{1}<br>ワーキンググループＣＤ：{2}<br>マスタ適用日：{3}<br>{4}<p>
	 */
	public static String MSBAL0023 = "MSBAL0023";

	/** LEVEL[W]<br>出荷依頼のＷＧ間依頼はＷＧ間依頼登録では登録できません。<br>{1}<p>
	 */
	public static String MSBAL0024 = "MSBAL0024";

	/** LEVEL[W]<br>取引が経費購買の場合、資産管理する品目を登録できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBAL0025 = "MSBAL0025";

	/** LEVEL[W]<br>資産管理する品目は経費購買の理由を設定できません。<br>品目：{1}<br>理由ＣＤ：{2}<br>{3}<p>
	 */
	public static String MSBAL0026 = "MSBAL0026";

	/** LEVEL[W]<br>資産管理しない品目は経費購買の理由を設定してください。<br>品目：{1}<br>理由ＣＤ：{2}<br>{3}<p>
	 */
	public static String MSBAL0027 = "MSBAL0027";

	/** LEVEL[W]<br>負担発注ＮＯに対応する発注情報が見つかりません。<br>負担発注ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBAL0028 = "MSBAL0028";

	/** LEVEL[W]<br>負担受注ＮＯに対応する受注情報が見つかりません。<br>負担受注ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBAL0029 = "MSBAL0029";

	/** LEVEL[W]<br>負担インボイスＮＯに対応するインボイス情報あるいは受領インボイス情報が見つかりません。<br>負担インボイスＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBAL0030 = "MSBAL0030";

	/** LEVEL[W]<br>依頼先ワーキンググループが依頼時と異なる回答は登録できません。<br>依頼先ワーキンググループＣＤ(依頼)：{1}<br>依頼先ワーキンググループＣＤ(回答)：{2}<br>{3}<p>
	 */
	public static String MSBAL0031 = "MSBAL0031";

	/** LEVEL[I]<br>後続業務が進行しています。必要に応じ依頼先と調整してください。<br>{1}<p>
	 */
	public static String MSBAL0032 = "MSBAL0032";

	/** LEVEL[W]<br>購買依頼に対する回答は、製造場所を指定なしから指定あり、指定ありから指定なしに変更できません。<br>変更する場合は登録済の行を削除し、新規行を追加してください。<br>{1}<p>
	 */
	public static String MSBAL0033 = "MSBAL0033";

	/** LEVEL[I]<br>対象日で需要元部門が無効です。<br>需要情報の作成対象外です。<br>対象日：{1}<br>需要元部門ＣＤ：{2}<p>
	 */
	public static String MSBAL0034 = "MSBAL0034";

	/** LEVEL[W]<br>入庫ワーキンググループと依頼先ワーキンググループが同一となる移送依頼は登録できません。<br>入庫ワーキンググループＣＤ：{1}<br>依頼先ワーキンググループＣＤ：{2}<br>{3}<p>
	 */
	public static String MSBAL0035 = "MSBAL0035";

	/** LEVEL[W]<br>供給計画に紐づく品目オーダが確定されている場合、供給計画は更新できません。<br>日次供給ＮＯ：{1}<p>
	 */
	public static String MSBAL0036 = "MSBAL0036";

	/** LEVEL[I]<br>発注予定日が運用日付よりも過去日となっています。<br>品目：{1}<br>発注先ＣＤ：{2}<br>メーカＣＤ：{3}<br>発注予定日：{4}<br>運用日付：{5}<br>{6}<p>
	 */
	public static String MSBAL0100 = "MSBAL0100";

	/** LEVEL[W]<br>入庫依頼日時から計算した発注予定日を適用期間にもつ品目詳細マスタが登録されていません。<br>品目：{1}<br>入庫ワーキンググループＣＤ：{2}<br>発注先ＣＤ：{3}<br>メーカＣＤ：{4}<br>製造場所ＣＤ：{5}<br>構成パタン：{6}<br>入庫依頼日時：{7}<br>{8}<p>
	 */
	public static String MSBAL0101 = "MSBAL0101";

	/** LEVEL[W]<br>回答入庫日時から計算した発注予定日を適用期間にもつ品目詳細マスタが登録されていません。<br>品目：{1}<br>入庫ワーキンググループＣＤ：{2}<br>発注先ＣＤ：{3}<br>メーカＣＤ：{4}<br>製造場所ＣＤ：{5}<br>構成パタン：{6}<br>回答入庫日時：{7}<br>{8}<p>
	 */
	public static String MSBAL0102 = "MSBAL0102";

	/** LEVEL[W]<br>入庫依頼日時から計算した出庫依頼日を適用期間にもつ品目詳細マスタが登録されていません。<br>品目：{1}<br>入庫ワーキンググループＣＤ：{2}<br>依頼先場所ＣＤ：{3}<br>入庫依頼日時：{4}<br>{5}<p>
	 */
	public static String MSBAL0103 = "MSBAL0103";

	/** LEVEL[I]<br>仕様を選択していませんが、登録処理を実行してよろしいですか？<p>
	 */
	public static String MSBBP0001 = "MSBBP0001";

	/** LEVEL[W]<br>期間は24ヵ月以内になるように指定してください。<p>
	 */
	public static String MSBBP0002 = "MSBBP0002";

	/** LEVEL[I]<br>数量金額計算処理を実行します。よろしいですか？<br>入力対象の数量（金額）から金額（数量）が計算されます。<p>
	 */
	public static String MSBBP0003 = "MSBBP0003";

	/** LEVEL[I]<br>集計処理を実行します。よろしいですか？<br>入力担当者の数量（金額）を集計して計画数量（計画金額）が計算されます。<p>
	 */
	public static String MSBBP0004 = "MSBBP0004";

	/** LEVEL[I]<br>内訳再展開処理を実行します。よろしいですか？<br>合計数量（合計金額）から入力対象の数量（金額）が計算されます。<br>入力対象外の金額（数量）は数量金額計算処理で計算されます。<p>
	 */
	public static String MSBBP0005 = "MSBBP0005";

	/** LEVEL[I]<br>有効期限を過ぎていますがよろしいですか？<br>有効期限：{1}<p>
	 */
	public static String MSBBP0006 = "MSBBP0006";

	/** LEVEL[W]<br>見積経由の実績は参照登録できません。<p>
	 */
	public static String MSBBP0007 = "MSBBP0007";

	/** LEVEL[W]<br>受注経由の実績は参照登録できません。<p>
	 */
	public static String MSBBP0008 = "MSBBP0008";

	/** LEVEL[W]<br>納品書経由の実績は参照登録できません。<p>
	 */
	public static String MSBBP0009 = "MSBBP0009";

	/** LEVEL[W]<br>単価再取得対象がありません。<p>
	 */
	public static String MSBBP0010 = "MSBBP0010";

	/** LEVEL[I]<br>単価再取得処理を実行します。よろしいですか？<p>
	 */
	public static String MSBBP0011 = "MSBBP0011";

	/** LEVEL[I]<br>単価が変更されました。<br>変更前単価：{1} <br>変更後単価：{2}<br>{3}<p>
	 */
	public static String MSBBP0012 = "MSBBP0012";

	/** LEVEL[W]<br>売上表示期間は1ヶ月以上、{1}ヶ月以内で指定してください。<p>
	 */
	public static String MSBBP0013 = "MSBBP0013";

	/** LEVEL[W]<br>指定した案件は取消済のため、訂正できません。<p>
	 */
	public static String MSBBP0014 = "MSBBP0014";

	/** LEVEL[W]<br>画面に存在しない行は取込みできません。<br>ファイル行：{1}<br>部門ＣＤ：{2}<br>得意先ＣＤ：{3}<br>案件ＮＯ：{4}<br>計画品目ＣＤ：{5}<br>品目：{6}<p>
	 */
	public static String MSBBP0015 = "MSBBP0015";

	/** LEVEL[W]<br>指定した販売年月の計画数量・計画金額は入力できません。<br>ファイル行：{1}<br>項目：{2}<br>販売年月：{3}<p>
	 */
	public static String MSBBP0016 = "MSBBP0016";

	/** LEVEL[W]<br>小数部有効桁数を超えた数値が指定されています。<br>ファイル行：{1}<br>項目：{2}<br>数値：{3}<br>小数部有効桁数：{4}<p>
	 */
	public static String MSBBP0017 = "MSBBP0017";

	/** LEVEL[I]<br>参考情報取得処理を実行します。よろしいですか？<p>
	 */
	public static String MSBBP0018 = "MSBBP0018";

	/** LEVEL[I]<br>単価取得処理を実行します。よろしいですか？<p>
	 */
	public static String MSBBP0019 = "MSBBP0019";

	/** LEVEL[I]<br>単価取得処理を実行しました。<p>
	 */
	public static String MSBBP0020 = "MSBBP0020";

	/** LEVEL[I]<br>為替レート取得処理を実行します。よろしいですか？<p>
	 */
	public static String MSBBP0021 = "MSBBP0021";

	/** LEVEL[I]<br>為替レート取得処理を実行しました。<p>
	 */
	public static String MSBBP0022 = "MSBBP0022";

	/** LEVEL[W]<br>基準通貨以外の行が選択されていません。<p>
	 */
	public static String MSBBP0023 = "MSBBP0023";

	/** LEVEL[I]<br>税取得処理を実行します。よろしいですか？<p>
	 */
	public static String MSBBP0024 = "MSBBP0024";

	/** LEVEL[I]<br>税取得処理を実行しました。<p>
	 */
	public static String MSBBP0025 = "MSBBP0025";

	/** LEVEL[W]<br>入荷済の明細があるため、取り消せません。<br>{1}<p>
	 */
	public static String MSBBP0026 = "MSBBP0026";

	/** LEVEL[W]<br>取消データは取り消せません。<p>
	 */
	public static String MSBBP0027 = "MSBBP0027";

	/** LEVEL[W]<br>確定がオフの明細が存在します。確定がオフの明細は採用の対象となりませんがよろしいですか？<p>
	 */
	public static String MSBBP0028 = "MSBBP0028";

	/** LEVEL[W]<br>インボイス経由の実績は参照登録できません。<p>
	 */
	public static String MSBBP0101 = "MSBBP0101";

	/** LEVEL[W]<br>船積港、船卸港、経由地には異なる値を指定してください。<p>
	 */
	public static String MSBBP0102 = "MSBBP0102";

	/** LEVEL[W]<br>検索モードに「ヘッダ」を指定してください。<p>
	 */
	public static String MSBBP0103 = "MSBBP0103";

	/** LEVEL[W]<br>操作種別に「実績を参照する」、検索モードに「ヘッダ」を指定してください。<p>
	 */
	public static String MSBBP0104 = "MSBBP0104";

	/** LEVEL[W]<br>操作種別に「参照する」、検索モードに「ヘッダ」を指定してください。<p>
	 */
	public static String MSBBP0105 = "MSBBP0105";

	/** LEVEL[W]<br>インボイス取引対象の売上実績を訂正・取消する場合は、インボイスＮＯで検索してください。<p>
	 */
	public static String MSBBP0106 = "MSBBP0106";

	/** LEVEL[W]<br>指定した手配ＮＯは別の案件ＮＯに紐付いています。<p>
	 */
	public static String MSBBL0001 = "MSBBL0001";

	/** LEVEL[W]<br>自動発番しない場合は、手配ＮＯ１を指定してください。<p>
	 */
	public static String MSBBL0002 = "MSBBL0002";

	/** LEVEL[W]<br>諸口の得意先では、得意先名を指定してください。<p>
	 */
	public static String MSBBL0003 = "MSBBL0003";

	/** LEVEL[W]<br>この品目は既に登録済みです。<p>
	 */
	public static String MSBBL0004 = "MSBBL0004";

	/** LEVEL[W]<br>この品目はリリース済みのため新規や変更、改訂での登録はできません。<p>
	 */
	public static String MSBBL0005 = "MSBBL0005";

	/** LEVEL[W]<br>この品目は見積または、受注で使用されているため、変更、改訂での登録はできません。<p>
	 */
	public static String MSBBL0006 = "MSBBL0006";

	/** LEVEL[W]<br>仕様が存在するため、更新できません。<br>構成を変更する場合は、構成改訂してください。<p>
	 */
	public static String MSBBL0007 = "MSBBL0007";

	/** LEVEL[W]<br>指定した得意先は見積が禁止されています。<br>得意先ＣＤ：{1}<br>見積日：{2}<p>
	 */
	public static String MSBBL0008 = "MSBBL0008";

	/** LEVEL[W]<br>見積書が発行済のため、見積区分を作成中に戻せません。<p>
	 */
	public static String MSBBL0009 = "MSBBL0009";

	/** LEVEL[W]<br>この品目、手配ＮＯと同一の仕様が既に登録済みです。<p>
	 */
	public static String MSBBL0010 = "MSBBL0010";

	/** LEVEL[W]<br>この品目は見積または、受注で使用されているため、変更、改訂での登録はできません。<p>
	 */
	public static String MSBBL0011 = "MSBBL0011";

	/** LEVEL[W]<br>この品目はリリース済みのため新規や変更、改訂での登録はできません。<p>
	 */
	public static String MSBBL0012 = "MSBBL0012";

	/** LEVEL[W]<br>この品目は品目未定義のため変更、改訂での登録はできません。<p>
	 */
	public static String MSBBL0013 = "MSBBL0013";

	/** LEVEL[W]<br>指定した品目は見積が禁止されています。<br>品目：{1}<br>見積日：{2}<br>{3}<p>
	 */
	public static String MSBBL0014 = "MSBBL0014";

	/** LEVEL[W]<br>指定した品目は輸出が禁止されています。<br>品目：{1}<br>国ＣＤ：{2}<br>基準日：{3}<br>{4}<p>
	 */
	public static String MSBBL0015 = "MSBBL0015";

	/** LEVEL[W]<br>案件管理をする場合は手配ＮＯ１は必須です。手配ＮＯ発番をオンにするか、手配ＮＯ１を指定してください。<br>{1}<p>
	 */
	public static String MSBBL0016 = "MSBBL0016";

	/** LEVEL[W]<br>指定した手配ＮＯ１は別の案件ＮＯに紐付いています。手配ＮＯ１を別の値に変更するか、案件登録画面で案件ＮＯと手配ＮＯの紐付きを削除してください。<br>手配ＮＯ１：{1}<br>別の案件ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBBL0017 = "MSBBL0017";

	/** LEVEL[W]<br>見積が受注もしくは実績に引き継がれているため、承認対象となるような更新はできません。<p>
	 */
	public static String MSBBL0018 = "MSBBL0018";

	/** LEVEL[W]<br>案件管理が登録されていません。<br>{1}<p>
	 */
	public static String MSBBL0019 = "MSBBL0019";

	/** LEVEL[W]<br>見積受注理由が登録されていません。<br>{1}<p>
	 */
	public static String MSBBL0020 = "MSBBL0020";

	/** LEVEL[W]<br>次の販売期間に対応する入力担当者別の販売計画が既に登録されているため、訂正または取消できません。<br>部門ＣＤ：{1} <br>得意先ＣＤ：{2}<br>案件ＮＯ：{3}<br>計画品目：{4}<br>品目：{5}<br>販売年月：{6}～{7}<br>{8}<p>
	 */
	public static String MSBBL0021 = "MSBBL0021";

	/** LEVEL[W]<br>次の販売期間に対応する集計担当者別の販売計画が既に登録されているため、訂正または取消できません。<br>部門ＣＤ：{1} <br>得意先ＣＤ：{2}<br>案件ＮＯ：{3}<br>計画品目：{4}<br>品目：{5}<br>販売年月：{6}～{7}<br>{8}<p>
	 */
	public static String MSBBL0022 = "MSBBL0022";

	/** LEVEL[W]<br>この品目の構成は既に登録済みのため新規で登録できません。<br>品目：{1}<p>
	 */
	public static String MSBBL0023 = "MSBBL0023";

	/** LEVEL[W]<br>この構成は他の見積や受注で使用されているため変更できません。<br>品目：{1}<p>
	 */
	public static String MSBBL0024 = "MSBBL0024";

	/** LEVEL[W]<br>この品目は他の受注で使用されているため改訂できません。<br>品目：{1}<p>
	 */
	public static String MSBBL0025 = "MSBBL0025";

	/** LEVEL[W]<br>この品目はリリース済のため新規や変更、改訂での登録はできません。<p>
	 */
	public static String MSBBL0026 = "MSBBL0026";

	/** LEVEL[W]<br>この仕様は既に登録済みです。<br>品目：{1},{2}<p>
	 */
	public static String MSBBL0027 = "MSBBL0027";

	/** LEVEL[W]<br>この仕様は他の見積や受注で使用されているため仕様を変更できません。<br>品目：{1},{2}<p>
	 */
	public static String MSBBL0028 = "MSBBL0028";

	/** LEVEL[W]<br>この品目の構成に対する仕様が他に存在するため更新できません。<br>品目：{1}<p>
	 */
	public static String MSBBL0029 = "MSBBL0029";

	/** LEVEL[W]<br>品目体系を指定しない場合は、品目集計対象外はオンにできません。<p>
	 */
	public static String MSBBL0030 = "MSBBL0030";

	/** LEVEL[W]<br>次の部門は指定した販売年月で営業部門として設定されていないため、登録できません。<br>部門ＣＤ：{1}<br>販売年月：{2}～{3}<br>{4}<p>
	 */
	public static String MSBBL0031 = "MSBBL0031";

	/** LEVEL[W]<br>販売計画を登録する構成と異なるデータのため、登録できません。販売計画の構成情報をご確認ください。<br>部門ＣＤ：{1}<br>得意先ＣＤ：{2}<br>案件ＮＯ：{3}<br>計画品目ＣＤ：{4}<br>品目：{5}<br>通貨ＣＤ：{6}<br>販売年月：{7}<br>{8}<p>
	 */
	public static String MSBBL0032 = "MSBBL0032";

	/** LEVEL[W]<br>次の計画品目は指定した販売年月で販売計画の立案対象として設定されていません。販売計画品目構成マスタをご確認ください。<br>計画品目：{1}<br>販売年月：{2}～{3}<br>{4}<p>
	 */
	public static String MSBBL0033 = "MSBBL0033";

	/** LEVEL[W]<br>次の品目は指定した販売年月で販売計画の立案対象として設定されていません。販売計画品目構成マスタをご確認ください。<br>品目：{1}<br>販売年月：{2}～{3}<br>{4}<p>
	 */
	public static String MSBBL0034 = "MSBBL0034";

	/** LEVEL[W]<br>販売年月が重複するレコードが存在するため、登録できません。重複期間を補正してください。<br>計画品目：{1}<br>品目：{2}<br>重複期間：{3}～{4}<br>{5}<p>
	 */
	public static String MSBBL0035 = "MSBBL0035";

	/** LEVEL[W]<br>同一品目に対して異なる設定区分を指定できません。いずれか１つとなるように指定してください。<br>部門ＣＤ：{1}<br>品目：{2}<br>{3}<p>
	 */
	public static String MSBBL0036 = "MSBBL0036";

	/** LEVEL[W]<br>予算分類が登録されていません。<br>{1}<p>
	 */
	public static String MSBBL0037 = "MSBBL0037";

	/** LEVEL[W]<br>案件管理に案件状況として登録されていません。<br>{1}<p>
	 */
	public static String MSBBL0038 = "MSBBL0038";

	/** LEVEL[W]<br>案件管理に受注確度として登録されていません。<br>{1}<p>
	 */
	public static String MSBBL0039 = "MSBBL0039";

	/** LEVEL[W]<br>案件管理に活動状況として登録されていません。<br>{1}<p>
	 */
	public static String MSBBL0040 = "MSBBL0040";

	/** LEVEL[W]<br>見積受注理由に受注取消として登録されていません。<br>{1}<p>
	 */
	public static String MSBBL0041 = "MSBBL0041";

	/** LEVEL[W]<br>見積受注理由に見積結果として登録されていません。<br>{1}<p>
	 */
	public static String MSBBL0042 = "MSBBL0042";

	/** LEVEL[W]<br>見積受注理由に見積条件として登録されていません。<br>{1}<p>
	 */
	public static String MSBBL0043 = "MSBBL0043";

	/** LEVEL[W]<br>作成中の見積は、見積書を発行できません。<br>見積ＮＯ：{1}-{2}<p>
	 */
	public static String MSBBL0044 = "MSBBL0044";

	/** LEVEL[W]<br>承認対象の見積は、承認されるまで見積書を発行できません。<br>見積ＮＯ：{1}-{2}<p>
	 */
	public static String MSBBL0045 = "MSBBL0045";

	/** LEVEL[W]<br>見積が取り消されているため、見積書を発行できません。<br>見積ＮＯ：{1}-{2}<p>
	 */
	public static String MSBBL0046 = "MSBBL0046";

	/** LEVEL[W]<br>発行対象の見積が存在しません。<br>見積ＮＯ：{1}-{2}<p>
	 */
	public static String MSBBL0047 = "MSBBL0047";

	/** LEVEL[W]<br>案件ＮＯが登録されていません。<br>{1}<p>
	 */
	public static String MSBBL0048 = "MSBBL0048";

	/** LEVEL[W]<br>伝票状況区分が新規の参照売上情報が存在しません。<br>参照売上実績ＮＯ：{1}<br>参照売上実績連番：{2}<br>参照売上実績明細ＮＯ：{3}<br>参照売上実績明細連番：{4}<p>
	 */
	public static String MSBBL0049 = "MSBBL0049";

	/** LEVEL[W]<br>得意先と仕向先が、国内または国外に統一されていません。<p>
	 */
	public static String MSBBL0050 = "MSBBL0050";

	/** LEVEL[W]<br>販売計画が既に訂正不可として設定されているため、登録できません。<br>部門ＣＤ：{1}<br>得意先ＣＤ：{2}<br>案件ＮＯ：{3}<br>計画年月：{4}<br>バージョン：{5}<p>
	 */
	public static String MSBBL0051 = "MSBBL0051";

	/** LEVEL[W]<br>同じ計画年月で既に採用されたバージョンが存在するため、採用をオンに更新できません。<br>計画年月：{1}<br>バージョン：{2}<p>
	 */
	public static String MSBBL0052 = "MSBBL0052";

	/** LEVEL[W]<br>発注に対応する受注が承認されていないため、発注できません。<br>受注ＮＯ：{1}<p>
	 */
	public static String MSBBL0053 = "MSBBL0053";

	/** LEVEL[W]<br>指定したコピー先バージョンの販売計画が既に存在しているため、登録できません。<br>部門ＣＤ：{1}<br>得意先ＣＤ：{2}<br>案件ＮＯ：{3}<br>計画年月：{4}<br>バージョン：{5}<p>
	 */
	public static String MSBBL0054 = "MSBBL0054";

	/** LEVEL[W]<br>指定した売上実績ＮＯの明細を取得できません。<br>売上実績ＮＯ：{1}<br>売上実績改訂番号：{2}<p>
	 */
	public static String MSBBL0055 = "MSBBL0055";

	/** LEVEL[W]<br>指定した期間において、計画品目の内訳に設定されていない品目が指定されているため、登録できません。<br>計画品目ＣＤ：{1}<br>品目：{2}<br>販売年月：{3}<br>{4}<p>
	 */
	public static String MSBBL0056 = "MSBBL0056";

	/** LEVEL[W]<br>更新対象である集計販売計画の明細データが存在しないため、更新できません。<br>計画品目ＣＤ：{1} <br>通貨ＣＤ：{2}<br>販売年月：{3}<br>{4}<p>
	 */
	public static String MSBBL0057 = "MSBBL0057";

	/** LEVEL[W]<br>計画品目に対する全ての品目を上り電文に指定してください。<br>計画品目ＣＤ：{1}<p>
	 */
	public static String MSBBL0059 = "MSBBL0059";

	/** LEVEL[W]<br>指定した受注ＮＯのデータが存在しません。<br>受注ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0060 = "MSBBL0060";

	/** LEVEL[W]<br>指定した受注ＮＯ、受注明細ＮＯのデータが存在しません。<br>受注ＮＯ：{1}<br>受注明細ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBBL0061 = "MSBBL0061";

	/** LEVEL[W]<br>受注明細ＮＯを指定した場合は、受注ＮＯも指定してください。<br>{1}<p>
	 */
	public static String MSBBL0062 = "MSBBL0062";

	/** LEVEL[I]<br>複数の伝票が作成されました。<p>
	 */
	public static String MSBBL0063 = "MSBBL0063";

	/** LEVEL[I]<br>売上実績ＮＯ：{1}<p>
	 */
	public static String MSBBL0064 = "MSBBL0064";

	/** LEVEL[W]<br>伝票帳票を取得できません。<br>得意先ＣＤ：{1}<br>取引ＣＤ：{2}<p>
	 */
	public static String MSBBL0065 = "MSBBL0065";

	/** LEVEL[W]<br>承認対象に対し、伝票分割が発生したため登録できません。<p>
	 */
	public static String MSBBL0066 = "MSBBL0066";

	/** LEVEL[W]<br>受注引当マスタに登録されている場所ではありません。<br>納品先ＣＤ：{1}<br>配送先ＣＤ：{2}<br>売上部門ＣＤ：{3}<br>基準日：{4}<br>品目：{5}<br>{6}<p>
	 */
	public static String MSBBL0067 = "MSBBL0067";

	/** LEVEL[W]<br>受注引当マスタに登録されている総量引当場所グループではありません。<br>納品先ＣＤ：{1}<br>配送先ＣＤ：{2}<br>売上部門ＣＤ：{3}<br>基準日：{4}<br>品目：{5}<br>{6}<p>
	 */
	public static String MSBBL0068 = "MSBBL0068";

	/** LEVEL[W]<br>受注引当マスタに登録されている物流グループではありません。<br>納品先ＣＤ：{1}<br>配送先ＣＤ：{2}<br>売上部門ＣＤ：{3}<br>基準日：{4}<br>品目：{5}<br>{6}<p>
	 */
	public static String MSBBL0069 = "MSBBL0069";

	/** LEVEL[W]<br>打切となった明細・詳細がある場合、取消できません。<br>打切を解除した後に取り消してください。<p>
	 */
	public static String MSBBL0070 = "MSBBL0070";

	/** LEVEL[W]<br>既に登録済のインボイスＮＯのため登録できません。まだ登録されていないインボイスＮＯを指定してください。<p>
	 */
	public static String MSBBL0071 = "MSBBL0071";

	/** LEVEL[W]<br>インボイスＮＯを自動発番する場合、インボイスＮＯは指定しないでください。<p>
	 */
	public static String MSBBL0072 = "MSBBL0072";

	/** LEVEL[W]<br>出荷返品となる場合、同時計上はオン（入荷同時計上）としてください。<p>
	 */
	public static String MSBBL0073 = "MSBBL0073";

	/** LEVEL[W]<br>仕向先１が未指定の場合、仕向先２を指定できません。<p>
	 */
	public static String MSBBL0074 = "MSBBL0074";

	/** LEVEL[W]<br>仕向先２が未指定の場合、仕向先３を指定できません。<p>
	 */
	public static String MSBBL0075 = "MSBBL0075";

	/** LEVEL[W]<br>同一受注内に預り売上と出荷指図対象外売上が混在しています。<br>売上実績一覧登録画面から売上計上登録を行ってください。<p>
	 */
	public static String MSBBL0076 = "MSBBL0076";

	/** LEVEL[W]<br>出荷返品の場合、数量の上限は出荷実績登録されている数量までです。<p>
	 */
	public static String MSBBL0077 = "MSBBL0077";

	/** LEVEL[W]<br>物流グループが異なる場所を混在させることはできません。<br>同一の物流グループとなる場所を指定してください。<p>
	 */
	public static String MSBBL0078 = "MSBBL0078";

	/** LEVEL[W]<br>明細の数量と詳細の合計数量が異なっています。<br>各数量を手動で調整するか、明細反映を行って明細と詳細の合計数量を合わせてください。<p>
	 */
	public static String MSBBL0079 = "MSBBL0079";

	/** LEVEL[W]<br>明細の手配ＮＯと詳細の手配ＮＯが異なっています。<br>明細と詳細の手配ＮＯを合わせるか、詳細が複数の手配ＮＯとなる場合は明細の手配ＮＯをクリアしてください。<p>
	 */
	public static String MSBBL0080 = "MSBBL0080";

	/** LEVEL[W]<br>明細のロットＮＯと詳細のロットＮＯが異なっています。<br>明細と詳細のロットＮＯを合わせるか、詳細が複数のロットＮＯとなる場合は明細のロットＮＯをクリアしてください。<p>
	 */
	public static String MSBBL0081 = "MSBBL0081";

	/** LEVEL[W]<br>明細のサブロットＮＯと詳細のサブロットＮＯが異なっています。<br>明細と詳細のサブロットＮＯを合わせるか、詳細が複数のサブロットＮＯとなる場合は明細のサブロットＮＯをクリアしてください。<p>
	 */
	public static String MSBBL0082 = "MSBBL0082";

	/** LEVEL[W]<br>明細の場所と詳細の場所が異なっています。<br>明細と詳細の場所を合わせるか、詳細が複数の場所となる場合は明細の場所をクリアしてください。<p>
	 */
	public static String MSBBL0083 = "MSBBL0083";

	/** LEVEL[W]<br>明細の棚・ラインと詳細の棚・ラインが異なっています。<br>明細と詳細の棚・ラインを合わせるか、詳細が複数の棚・ラインとなる場合は明細の棚・ラインをクリアしてください。<p>
	 */
	public static String MSBBL0084 = "MSBBL0084";

	/** LEVEL[W]<br>明細の格付と詳細の格付が異なっています。<br>明細と詳細の格付を合わせるか、詳細が複数の格付となる場合は明細の格付をクリアしてください。<p>
	 */
	public static String MSBBL0085 = "MSBBL0085";

	/** LEVEL[W]<br>受注引当格付マスタに登録されていない格付、または受注可能として格付マスタに登録されていない格付です。<br>得意先ＣＤ：{1}<br>納品先ＣＤ：{2}<br>{3}<p>
	 */
	public static String MSBBL0086 = "MSBBL0086";

	/** LEVEL[W]<br>該当の売上実績はインボイス取引対象のため当画面では処理できません。<br>売上実績一覧登録で処理を行ってください。<p>
	 */
	public static String MSBBL0087 = "MSBBL0087";

	/** LEVEL[W]<br>該当の売上実績は仕入直送売上のため当画面では処理できません。<br>売上実績一覧登録または仕入直送売上登録画面で処理を行ってください。<p>
	 */
	public static String MSBBL0088 = "MSBBL0088";

	/** LEVEL[W]<br>指定した得意先は売上・出荷が禁止されています。<br>得意先ＣＤ：{1}<br>売上日：{2}<br>{3}<p>
	 */
	public static String MSBBL0089 = "MSBBL0089";

	/** LEVEL[W]<br>指定した品目は売上・出荷が禁止されています。<br>品目：{1}<br>売上日：{2}<br>{3}<p>
	 */
	public static String MSBBL0090 = "MSBBL0090";

	/** LEVEL[W]<br>引継可能な明細が存在しません。<p>
	 */
	public static String MSBBL0091 = "MSBBL0091";

	/** LEVEL[W]<br>指定した見積の明細を取得できません。<p>
	 */
	public static String MSBBL0092 = "MSBBL0092";

	/** LEVEL[W]<br>構成管理品を見積から引き継ぐことはできません。受注から引き継いでください。<br>{1}<p>
	 */
	public static String MSBBL0093 = "MSBBL0093";

	/** LEVEL[W]<br>受注ＮＯを指定していますが、受注を引継いだ明細がありません。<p>
	 */
	public static String MSBBL0094 = "MSBBL0094";

	/** LEVEL[W]<br>見積ＮＯを指定していますが、見積を引継いだ明細がありません。<p>
	 */
	public static String MSBBL0095 = "MSBBL0095";

	/** LEVEL[W]<br>納品書ＮＯを指定していますが、納品伝票を引継いだ明細がありません。<p>
	 */
	public static String MSBBL0096 = "MSBBL0096";

	/** LEVEL[W]<br>計上済の実績が存在するため、打切のまま行削除できません。<br>訂正種別で打切解除をした後に、行削除を行ってください。<br>{1}<p>
	 */
	public static String MSBBL0097 = "MSBBL0097";

	/** LEVEL[W]<br>計上済の実績が存在しているため、数量を0にしての打切はできません。<br>残数を全て打切る場合は、登録されている売上実績に対して打切の登録を行ってください。<br>{1}<p>
	 */
	public static String MSBBL0098 = "MSBBL0098";

	/** LEVEL[W]<br>見積から引継可能な数量を超えています。<br>見積明細ＮＯ：{1}<br>引継可能数量：{2}<br>{3}<p>
	 */
	public static String MSBBL0099 = "MSBBL0099";

	/** LEVEL[W]<br>売上数量が売上予定の数量を超えているため、登録できません。<br>売上予定数量：{1}<br>売上済数量：{2}<br>{3}<p>
	 */
	public static String MSBBL0100 = "MSBBL0100";

	/** LEVEL[W]<br>同一納品先に対して価格印字のオン・オフが混在しています。<br>同一納品先に対する価格印字はいずれかに統一してください。<p>
	 */
	public static String MSBBL0101 = "MSBBL0101";

	/** LEVEL[W]<br>納入指示受領が可能な数量を超えるため登録できません。<br>受注明細ＮＯ：{1}<br>納入指示受領数量：{2}<br>納入指示受領可能数量：{3}<br>{4}<p>
	 */
	public static String MSBBL0102 = "MSBBL0102";

	/** LEVEL[W]<br>出荷指図（実績）済のため納入指示を更新、取消できません。<br>{1}<p>
	 */
	public static String MSBBL0103 = "MSBBL0103";

	/** LEVEL[W]<br>受注明細を打切した場合、あるいは受注明細に対応する出荷予定を全数打切した場合、納入指示受領は登録できません。<br>{1}<p>
	 */
	public static String MSBBL0104 = "MSBBL0104";

	/** LEVEL[W]<br>指定した納入指示数量が、打切されていない数量を超えるため登録できません。<br>{1}<p>
	 */
	public static String MSBBL0105 = "MSBBL0105";

	/** LEVEL[W]<br>仕入直送の受注が既に売上計上済のため、納入指示受領登録できません。<br>{1}<p>
	 */
	public static String MSBBL0106 = "MSBBL0106";

	/** LEVEL[W]<br>指定した納入指示数量が出荷指図（実績）済数量を下回るため更新できません。<br>{1}<p>
	 */
	public static String MSBBL0107 = "MSBBL0107";

	/** LEVEL[W]<br>打切のまま取消できません。<br>訂正種別で打切解除をした後に、取り消してください。<br>{1}<p>
	 */
	public static String MSBBL0108 = "MSBBL0108";

	/** LEVEL[W]<br>手配ＮＯ１発番パタンが品目マスタに登録されていないため、手配ＮＯを発番できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBBL0109 = "MSBBL0109";

	/** LEVEL[W]<br>手配ＮＯ２発番パタンが品目マスタに登録されていないため、手配ＮＯを発番できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBBL0110 = "MSBBL0110";

	/** LEVEL[W]<br>手配ＮＯ３発番パタンが品目マスタに登録されていないため、手配ＮＯを発番できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBBL0111 = "MSBBL0111";

	/** LEVEL[W]<br>手配ＮＯ４発番パタンが品目マスタに登録されていないため、手配ＮＯを発番できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBBL0112 = "MSBBL0112";

	/** LEVEL[W]<br>異なる案件ＮＯに紐付く手配ＮＯ１を混在させることはできません。<p>
	 */
	public static String MSBBL0113 = "MSBBL0113";

	/** LEVEL[W]<br>売上返品理由が他勘定のため、単価はゼロ、値引額は未指定にしてください。<p>
	 */
	public static String MSBBL0114 = "MSBBL0114";

	/** LEVEL[W]<br>打切となる数量はありません。打切をオフにしてください。<br>{1}<p>
	 */
	public static String MSBBL0115 = "MSBBL0115";

	/** LEVEL[W]<br>後続業務が行われているため、出荷予定は削除できません。<br>出荷予定ＮＯ：{1}<p>
	 */
	public static String MSBBL0117 = "MSBBL0117";

	/** LEVEL[W]<br>打切された出荷予定は削除できません。打切取消してから削除してください。<br>出荷予定ＮＯ：{1}<p>
	 */
	public static String MSBBL0118 = "MSBBL0118";

	/** LEVEL[W]<br>後続業務の数量を下回る変更はできません。<br>出荷予定ＮＯ：{1}<br>後続業務の数量：{2}<p>
	 */
	public static String MSBBL0119 = "MSBBL0119";

	/** LEVEL[W]<br>再出荷予定は打切で登録できません。<br>{1}<p>
	 */
	public static String MSBBL0120 = "MSBBL0120";

	/** LEVEL[W]<br>出荷予定数量の合計は、受注明細の数量と同じにしてください。<p>
	 */
	public static String MSBBL0121 = "MSBBL0121";

	/** LEVEL[W]<br>与信使用額が与信限度額に超えています。<br>与信管理先ＣＤ：{1}<br>通貨ＣＤ：{2}<br>与信使用額：{3}<br>与信限度額：{4}<p>
	 */
	public static String MSBBL0124 = "MSBBL0124";

	/** LEVEL[W]<br>コピー元バージョンの販売計画が存在しないため、または、確定済データが存在しないため、登録できません。<br>部門ＣＤ：{1}<br>得意先ＣＤ：{2}<br>案件ＮＯ：{3}<br>計画年月：{4}<br>バージョン：{5}<p>
	 */
	public static String MSBBL0125 = "MSBBL0125";

	/** LEVEL[W]<br>指定した売上値引・売上値増のデータは、承認対象外または最終承認済ではないため訂正できません。<br>売上実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0126 = "MSBBL0126";

	/** LEVEL[W]<br>受注を引き継いだ明細がありません。<p>
	 */
	public static String MSBBL0127 = "MSBBL0127";

	/** LEVEL[W]<br>指定した品目は受注が禁止されています。<br>品目：{1}<br>基準日：{2}<br>{3}<p>
	 */
	public static String MSBBL0128 = "MSBBL0128";

	/** LEVEL[W]<br>明細のロット作成がオンの場合、詳細のロット作成をオフにできません。<br>明細のロット作成をオフにするか、詳細のロット作成を全てオンにしてください。<br>{1}<p>
	 */
	public static String MSBBL0129 = "MSBBL0129";

	/** LEVEL[W]<br>明細の出荷元期限と詳細の出荷元期限が異なっています。<br>明細と詳細の出荷元期限を合わせるか、詳細が複数の出荷元期限となる場合は明細の出荷元期限をクリアしてください。<br>{1}<p>
	 */
	public static String MSBBL0130 = "MSBBL0130";

	/** LEVEL[W]<br>明細の版ＮＯと詳細の版ＮＯが異なっています。<br>明細と詳細の版ＮＯを合わせるか、詳細が複数の版ＮＯとなる場合は明細の版ＮＯをクリアしてください。<br>{1}<p>
	 */
	public static String MSBBL0131 = "MSBBL0131";

	/** LEVEL[W]<br>仕入後計上では仕入済数以下の数量を指定してください。<br>{1}<p>
	 */
	public static String MSBBL0132 = "MSBBL0132";

	/** LEVEL[W]<br>対象受注が承認されていないため、登録できません。<br>受注ＮＯ：{1}<br>承認状況区分：{2}<p>
	 */
	public static String MSBBL0133 = "MSBBL0133";

	/** LEVEL[W]<br>同時計上の場合、同一の売上実績に含まれる全ての入荷実績の入荷日、計上日を揃えて登録してください。<br>売上実績ＮＯ：{1}<p>
	 */
	public static String MSBBL0135 = "MSBBL0135";

	/** LEVEL[W]<br>同時計上の場合、同一の売上実績に含まれる入荷実績の計上日を揃えて取り消してください。<br>売上実績ＮＯ：{1}<p>
	 */
	public static String MSBBL0136 = "MSBBL0136";

	/** LEVEL[W]<br>対象の売上実績明細が存在しないため、更新できません。<br>売上実績明細ＮＯ：{1}<br>売上実績明細連番：{2}<p>
	 */
	public static String MSBBL0137 = "MSBBL0137";

	/** LEVEL[W]<br>ロット管理情報に登録されていません。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<p>
	 */
	public static String MSBBL0138 = "MSBBL0138";

	/** LEVEL[W]<br>承認状況区分が承認中のため更新できません。<p>
	 */
	public static String MSBBL0139 = "MSBBL0139";

	/** LEVEL[W]<br>構成管理品の場合は構成・仕様登録画面で構成を登録してください。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBBL0140 = "MSBBL0140";

	/** LEVEL[W]<br>単価が設定されていない構成品が存在します。構成・仕様登録画面で構成品の単価を指定してください。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBBL0141 = "MSBBL0141";

	/** LEVEL[W]<br>手配ＮＯを指定した場合は仕様を指定してください。<br>手配ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0142 = "MSBBL0142";

	/** LEVEL[W]<br>見積から引継可能な数量を満たしてないため、構成改訂できません。<br>見積行ＮＯ：{1}<br>引継可能数量：{2}<br>{3}<p>
	 */
	public static String MSBBL0143 = "MSBBL0143";

	/** LEVEL[W]<br>出荷予定が分割されている明細がある場合は、品揃する設定はできません。<br>{1}<p>
	 */
	public static String MSBBL0144 = "MSBBL0144";

	/** LEVEL[W]<br>出荷予定が分割されている明細に品揃ＧＮＯを指定できません。<br>受注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0145 = "MSBBL0145";

	/** LEVEL[W]<br>貸出出荷の場合、インボイス取引対象の得意先を指定できません。<p>
	 */
	public static String MSBBL0146 = "MSBBL0146";

	/** LEVEL[W]<br>貸出出荷の場合、国外の納品先を指定できません。<br>{1}<p>
	 */
	public static String MSBBL0147 = "MSBBL0147";

	/** LEVEL[W]<br>得意先、納品先に国内・国外の組み合わせを指定できません。<br>{1}<p>
	 */
	public static String MSBBL0148 = "MSBBL0148";

	/** LEVEL[W]<br>諸口納品先の場合、納品先名は必須です。<br>{1}<p>
	 */
	public static String MSBBL0149 = "MSBBL0149";

	/** LEVEL[W]<br>国内の諸口納品先の場合、郵便番号は必須です。<br>{1}<p>
	 */
	public static String MSBBL0150 = "MSBBL0150";

	/** LEVEL[W]<br>諸口納品先の場合、住所１は必須です。<br>{1}<p>
	 */
	public static String MSBBL0151 = "MSBBL0151";

	/** LEVEL[W]<br>諸口配送先の場合、配送先名は必須です。<br>{1}<p>
	 */
	public static String MSBBL0152 = "MSBBL0152";

	/** LEVEL[W]<br>国内の諸口配送先の場合、配送先郵便番号は必須です。<br>{1}<p>
	 */
	public static String MSBBL0153 = "MSBBL0153";

	/** LEVEL[W]<br>諸口配送先の場合、配送先住所１は必須です。<br>{1}<p>
	 */
	public static String MSBBL0154 = "MSBBL0154";

	/** LEVEL[W]<br>貸出出荷では非在庫品は登録できません。<br>{1}<p>
	 */
	public static String MSBBL0155 = "MSBBL0155";

	/** LEVEL[W]<br>諸口品の場合、品名は必須です。<br>{1}<p>
	 */
	public static String MSBBL0156 = "MSBBL0156";

	/** LEVEL[W]<br>承認されているため受注を更新できません。<p>
	 */
	public static String MSBBL0157 = "MSBBL0157";

	/** LEVEL[W]<br>打切された出荷予定を含む明細の品目を変更できません。<br>{1}<p>
	 */
	public static String MSBBL0158 = "MSBBL0158";

	/** LEVEL[W]<br>打切された出荷予定を含む明細の単位を変更できません。<br>{1}<p>
	 */
	public static String MSBBL0159 = "MSBBL0159";

	/** LEVEL[W]<br>後続業務が行われているため、削除できません。<br>受注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0160 = "MSBBL0160";

	/** LEVEL[W]<br>承認状況が一次承認済または最終承認済のため取消できません。<p>
	 */
	public static String MSBBL0161 = "MSBBL0161";

	/** LEVEL[W]<br>承認状況が一次承認済または最終承認済のため追加のデータを取り込むことができません。<p>
	 */
	public static String MSBBL0162 = "MSBBL0162";

	/** LEVEL[W]<br>仕入直送の受注明細は売上計上に進んだ状態では打切ることができません。<br>受注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0163 = "MSBBL0163";

	/** LEVEL[W]<br>指図区分が出荷指図対象の受注明細は出荷指図に進んだ状態では打切ることができません。<br>受注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0164 = "MSBBL0164";

	/** LEVEL[W]<br>指図区分が出荷指図対象外の受注明細は出荷実績に進んだ状態では打切ることができません。<br>受注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0165 = "MSBBL0165";

	/** LEVEL[W]<br>受注引当マスタに、デフォルトがオンのレコードが登録されていません。<br>物流グループＣＤ：{1}<br>品目出荷グループＣＤ：{2}<br>ワーキンググループＣＤ：{3}<br>引当場所ＣＤ：{4}<br>引当物流グループＣＤ：{5}<br>総量引当場所グループＣＤ：{6}<br>{7}<p>
	 */
	public static String MSBBL0166 = "MSBBL0166";

	/** LEVEL[W]<br>品目詳細マスタから、仕入直送時の発注先を取得できません。<br>{1}<p>
	 */
	public static String MSBBL0167 = "MSBBL0167";

	/** LEVEL[W]<br>受注に対して、指図もしくは出荷が登録されているため、承認対象となるような更新はできません。<p>
	 */
	public static String MSBBL0168 = "MSBBL0168";

	/** LEVEL[W]<br>承認処理対象となる売上値引・売上値増の売上実績が存在しないため、更新できません。<br>売上実績ＮＯ：{1}<p>
	 */
	public static String MSBBL0169 = "MSBBL0169";

	/** LEVEL[W]<br>指定した受注情報は取り消されています。<p>
	 */
	public static String MSBBL0171 = "MSBBL0171";

	/** LEVEL[W]<br>受注引当マスタに登録されていません。<br>物流グループＣＤ：{1}<br>品目出荷グループＣＤ：{2}<br>ワーキンググループＣＤ：{3}<br>引当場所ＣＤ：{4}<br>引当物流グループＣＤ：{5}<br>総量引当場所グループＣＤ：{6}<br>{7}<p>
	 */
	public static String MSBBL0172 = "MSBBL0172";

	/** LEVEL[W]<br>受注明細に対応する見積明細が取得できません。<br>受注明細ＮＯ：{1}<br>見積明細ＮＯ：{2}<p>
	 */
	public static String MSBBL0173 = "MSBBL0173";

	/** LEVEL[W]<br>受注引当マスタに登録されている場所ではありません。<br>納品先ＣＤ：{1}<br>配送先ＣＤ：{2}<br>売上部門ＣＤ：{3}<br>基準日：{4}<br>品目：{5}<br>{6}<p>
	 */
	public static String MSBBL0174 = "MSBBL0174";

	/** LEVEL[W]<br>市場出荷判定対象の場合は、事前に購買納期調整登録画面でロットＮＯを指定してください。<br>{1}<p>
	 */
	public static String MSBBL0175 = "MSBBL0175";

	/** LEVEL[W]<br>受注時の取引通貨と異なる通貨では前受金を登録できません。<br>受注ＮＯ：{1}<br>受注時の取引通貨ＣＤ：{2}<br>前受金の取引通貨ＣＤ：{3}<br>{4}<p>
	 */
	public static String MSBBL0176 = "MSBBL0176";

	/** LEVEL[I]<br>販売単価が設定されていない、または販売単価が0です。<br>品目：{1}<br>得意先ＣＤ：{2}<br>通貨ＣＤ：{3}<br>単位ＣＤ：{4}<br>販売年月：{5}<br>{6}<p>
	 */
	public static String MSBBL0177 = "MSBBL0177";

	/** LEVEL[W]<br>指定した案件ＮＯは既に見積登録されているため、取消できません。<p>
	 */
	public static String MSBBL0178 = "MSBBL0178";

	/** LEVEL[W]<br>指定した案件ＮＯは既に受注登録されているため、取消できません。<p>
	 */
	public static String MSBBL0179 = "MSBBL0179";

	/** LEVEL[W]<br>開始年月終了年月に重複期間があります。開始年月、終了年月が同じため自動調整できませんでした。<br>{1}<br>{2}<p>
	 */
	public static String MSBBL0181 = "MSBBL0181";

	/** LEVEL[W]<br>インボイス登録済みのため、仕入予定の変更、取消はできません。<br>仕入予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0182 = "MSBBL0182";

	/** LEVEL[W]<br>品目詳細マスタに登録されていません。<br>品目：{1}<br>ワーキンググループＣＤ：{2}<br>発注先ＣＤ：{3}<br>メーカＣＤ：{4}<br>マスタ適用日：{5}<br>{6}<p>
	 */
	public static String MSBBL0183 = "MSBBL0183";

	/** LEVEL[W]<br>指定した手配ＮＯ１は、他の案件ＮＯと紐づいています。新しく手配ＮＯ１を発番するか、案件登録画面で紐付きを削除してください。<br>手配ＮＯ１：{1}<br>既に紐づいている案件ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBBL0184 = "MSBBL0184";

	/** LEVEL[W]<br>内示開始期間と内示終了期間は異なる値を指定してください。<br>{1}<p>
	 */
	public static String MSBBL0185 = "MSBBL0185";

	/** LEVEL[W]<br>入荷済みのため、打切以外の訂正はできません。<br>{1}<p>
	 */
	public static String MSBBL0186 = "MSBBL0186";

	/** LEVEL[W]<br>打切や打切解除する場合は、同時に他の項目の新規登録、訂正、取消はできません。<br>{1}<p>
	 */
	public static String MSBBL0187 = "MSBBL0187";

	/** LEVEL[W]<br>未入荷の返品予定は打切できません。<br>{1}<p>
	 */
	public static String MSBBL0188 = "MSBBL0188";

	/** LEVEL[I]<br>受注集計処理を開始します。<p>
	 */
	public static String MSBBL0191 = "MSBBL0191";

	/** LEVEL[I]<br>受注集計処理が終了しました。<p>
	 */
	public static String MSBBL0192 = "MSBBL0192";

	/** LEVEL[W]<br>依頼先場所は品目詳細マスタに登録されていません。<br>品目：{1}<br>依頼先場所ＣＤ：{2}<br>ワーキンググループＣＤ:{3}<br>マスタ適用日：{4}<br>{5}<p>
	 */
	public static String MSBBL0193 = "MSBBL0193";

	/** LEVEL[W]<br>指定した得意先は受注禁止です。<br>得意先ＣＤ：{1}<p>
	 */
	public static String MSBBL0194 = "MSBBL0194";

	/** LEVEL[W]<br>指図区分が「2：ピッキングなし」の明細のみで登録できません。「3：指図対象外」とするか、「１：ピッキングあり」の明細を含めて登録してください。<p>
	 */
	public static String MSBBL0195 = "MSBBL0195";

	/** LEVEL[W]<br>指定した品目は受注禁止です。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBBL0196 = "MSBBL0196";

	/** LEVEL[W]<br>貸出出荷の場合、インボイス取引対象の得意先を指定できません。<br>{1}<p>
	 */
	public static String MSBBL0197 = "MSBBL0197";

	/** LEVEL[W]<br>出荷指図、出荷実績、インボイス、売上のいずれかが登録されているため、更新できません。<br>受注明細ＮＯ：{1}<p>
	 */
	public static String MSBBL0198 = "MSBBL0198";

	/** LEVEL[W]<br>出荷指図、出荷実績、インボイス、売上のいずれかが登録されているため、削除できません。<br>受注明細ＮＯ：{1}<p>
	 */
	public static String MSBBL0199 = "MSBBL0199";

	/** LEVEL[W]<br>出荷指図、出荷実績、インボイス、売上のいずれかが登録されているため、打切できません。<br>受注明細ＮＯ：{1}<p>
	 */
	public static String MSBBL0200 = "MSBBL0200";

	/** LEVEL[W]<br>インボイス登録済のため、受注明細を追加できません。<br>{1}<p>
	 */
	public static String MSBBL0201 = "MSBBL0201";

	/** LEVEL[W]<br>出荷指図、出荷実績、インボイス、売上のいずれかが登録されているため、取消できません。<p>
	 */
	public static String MSBBL0202 = "MSBBL0202";

	/** LEVEL[W]<br>打切された受注明細を含むため、取消できません。<p>
	 */
	public static String MSBBL0203 = "MSBBL0203";

	/** LEVEL[W]<br>インボイスの全明細が更新対象となっていません。<br>インボイス取引対象の場合、インボイスの全明細を表示した状態で更新してください。<br>インボイスＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0204 = "MSBBL0204";

	/** LEVEL[W]<br>インボイス登録済みのため、納入指示受領登録はできません。<br>{1}<p>
	 */
	public static String MSBBL0206 = "MSBBL0206";

	/** LEVEL[W]<br>顧客内示情報ファイルのヘッダ項目値は一致しません。{1}<p>
	 */
	public static String MSBBL0207 = "MSBBL0207";

	/** LEVEL[W]<br>承認状況区分が一次承認済または最終承認済の場合、見積区分を作成中に変更できません。<br>承認を取り消してから作成中に変更してください。<p>
	 */
	public static String MSBBL0208 = "MSBBL0208";

	/** LEVEL[W]<br>見積区分を作成中に変更する場合、失注をオンにできません。<p>
	 */
	public static String MSBBL0209 = "MSBBL0209";

	/** LEVEL[W]<br>受注明細に対して一部数量を打切した場合は、打切できません。<br>受注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0215 = "MSBBL0215";

	/** LEVEL[W]<br>納入指示に対応する出荷予定が確定済みのため、取消できません。<br>{1}<p>
	 */
	public static String MSBBL0216 = "MSBBL0216";

	/** LEVEL[W]<br>納入指示に対応する出荷予定が確定済みのため、数量の訂正はできません。<br>{1}<p>
	 */
	public static String MSBBL0217 = "MSBBL0217";

	/** LEVEL[W]<br>納入指示に対応する出荷予定が確定済みのため、納入希望日時の訂正はできません。<br>{1}<p>
	 */
	public static String MSBBL0218 = "MSBBL0218";

	/** LEVEL[W]<br>同一受付日のレコードが既に存在するため、登録できません。<br>得意先：{1}<br>納品先：{2}<br>担当部門：{3}<br>担当者：{4}<br>案件ＮＯ：{5}<br>受付日：{6}<p>
	 */
	public static String MSBBL0219 = "MSBBL0219";

	/** LEVEL[W]<br>確定されている出荷予定が存在するため、納入指示を出荷予定に反映できません。<p>
	 */
	public static String MSBBL0220 = "MSBBL0220";

	/** LEVEL[W]<br>インボイス対象取引でない得意先の場合、配送先経由区分は「2：経由しない」を入力してください。<p>
	 */
	public static String MSBBL0221 = "MSBBL0221";

	/** LEVEL[W]<br>インボイスＮＯを指定した場合、仕入直送の受注明細が登録できません。<br>{1}<p>
	 */
	public static String MSBBL0222 = "MSBBL0222";

	/** LEVEL[W]<br>インボイスＮＯを指定した場合、出荷予定分割区分を「分割しない」に指定してください。<br>{1}<p>
	 */
	public static String MSBBL0223 = "MSBBL0223";

	/** LEVEL[W]<br>インボイスＮＯを指定した場合、出荷物流Gの指定が必須です。指定できない場合、受注引当マスタを確認してください。<br>{1}<p>
	 */
	public static String MSBBL0224 = "MSBBL0224";

	/** LEVEL[W]<br>インボイスＮＯを指定した場合、出荷指図済のため、受注明細を追加できません。<p>
	 */
	public static String MSBBL0225 = "MSBBL0225";

	/** LEVEL[W]<br>インボイスＮＯを指定した場合、受注明細の納品先は複数混在しているため、登録できません。<p>
	 */
	public static String MSBBL0226 = "MSBBL0226";

	/** LEVEL[W]<br>インボイスＮＯを指定した場合、受注明細の配送先は複数混在しているため、登録できません。<p>
	 */
	public static String MSBBL0227 = "MSBBL0227";

	/** LEVEL[W]<br>受注時にインボイスＮＯを指定した場合は、納入指示を受領できません。<p>
	 */
	public static String MSBBL0228 = "MSBBL0228";

	/** LEVEL[W]<br>納入指示受領済の出荷予定の合計数量と納入指示受領の数量が一致しません。<br>納入指示受領ＮＯ：{1}<br>出荷予定数量合計：{2}<br>納入指示受領数量：{3}<p>
	 */
	public static String MSBBL0229 = "MSBBL0229";

	/** LEVEL[W]<br>回答数量と対応する出荷予定の合計数量が一致しません。<br>回答数量：{1}<br>出荷予定数量合計：{2}<br>{3}<p>
	 */
	public static String MSBBL0230 = "MSBBL0230";

	/** LEVEL[W]<br>出荷予定が分割されているため、売上実績の訂正・取消はできません。<br>{1}<p>
	 */
	public static String MSBBL0231 = "MSBBL0231";

	/** LEVEL[W]<br>インボイスＮＯを指定した場合、受注明細の出荷物流Ｇは複数混在しているため、登録できません。<p>
	 */
	public static String MSBBL0232 = "MSBBL0232";

	/** LEVEL[W]<br>預り売上した数量の範囲内で、出荷予定を調整してください。<br>売上実績明細ＮＯ：{1}<br>調整前の数量：{2}<br>調整後の数量：{3}<p>
	 */
	public static String MSBBL0233 = "MSBBL0233";

	/** LEVEL[W]<br>預り売上が既に登録されているため、受注明細の訂正・取消・打切はできません。<br>受注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0234 = "MSBBL0234";

	/** LEVEL[W]<br>出荷予定の基準単位数量が、預り売上した在庫の荷姿単位数量に換算できないため、登録できません。<br>出荷予定ＮＯ：{1}<br>基準単位数量：{2}<br>荷姿単位：{3}<br>換算基準数量：{4}<br>単位換算数：{5}<br>小数部有効桁数：{6}<p>
	 */
	public static String MSBBL0235 = "MSBBL0235";

	/** LEVEL[W]<br>貸出出荷と預り売上を同時に指定することはできません。<br>{1}<p>
	 */
	public static String MSBBL0236 = "MSBBL0236";

	/** LEVEL[W]<br>預り売上の場合、インボイス取引対象の得意先を指定できません。<br>{1}<p>
	 */
	public static String MSBBL0237 = "MSBBL0237";

	/** LEVEL[W]<br>品揃区分が「2：品揃する」で指定されて、且つ明細の品揃GNOが設定された場合、同一の品揃GNOの明細は、出荷物流G、納品先、配送先の項目も同じ値を指定してください。<br>{1}<p>
	 */
	public static String MSBBL0238 = "MSBBL0238";

	/** LEVEL[W]<br>明細の貸出格付と詳細の貸出格付が異なっています。<br>明細と詳細の貸出格付を合わせるか、詳細が複数の貸出格付となる場合は明細の貸出格付をクリアしてください。<p>
	 */
	public static String MSBBL0239 = "MSBBL0239";

	/** LEVEL[W]<br>同時計上する・しないを混在させることはできません。全数仕入計上してから売上計上してください。<p>
	 */
	public static String MSBBL0240 = "MSBBL0240";

	/** LEVEL[W]<br>受注数に対して、一部仕入された状態で、仕入直送売上を全数登録することができません。全数仕入してもらうか、仕入を取り消してから売上計上してください。<p>
	 */
	public static String MSBBL0241 = "MSBBL0241";

	/** LEVEL[W]<br>数量は、引継数量以下にはできません。<br>見積明細ＮＯ：{1}<br>数量：{2}<br>引継数量：{3}<br>{4}<p>
	 */
	public static String MSBBL0242 = "MSBBL0242";

	/** LEVEL[W]<br>引継済の明細があるため、取消できません。<p>
	 */
	public static String MSBBL0243 = "MSBBL0243";

	/** LEVEL[W]<br>入力担当者別の販売計画が変更されているため、再検索した後、再集計してください。<br>計画品目：{1}<br>品目：{2}<br>販売年月：{3}<br>{4}<p>
	 */
	public static String MSBBL0244 = "MSBBL0244";

	/** LEVEL[W]<br>金額の合計をマイナスにはできません。<p>
	 */
	public static String MSBBL0245 = "MSBBL0245";

	/** LEVEL[W]<br>未出荷の受注に対して、再出荷を登録できません。<br>{1}<p>
	 */
	public static String MSBBL0246 = "MSBBL0246";

	/** LEVEL[W]<br>インボイスが登録されているため出荷返品は登録できません。インボイスを取消してください。<br>Ｉ／Ｖ ＮＯ：{1}<p>
	 */
	public static String MSBBL0247 = "MSBBL0247";

	/** LEVEL[W]<br>インボイス単位出荷に対する出荷返品は、一部明細および一部数量の登録はできません。<br>Ｉ／Ｖ ＮＯ：{1}<p>
	 */
	public static String MSBBL0248 = "MSBBL0248";

	/** LEVEL[W]<br>インボイス単位出荷に対する出荷返品予定は打切できません。<br>{1}<p>
	 */
	public static String MSBBL0249 = "MSBBL0249";

	/** LEVEL[W]<br>同一の納品書明細に対する返品予定が既に登録されているため、登録できません。<br>既に登録されている売上返品予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0250 = "MSBBL0250";

	/** LEVEL[W]<br>在庫管理する諸口品ですが、諸口品マスタに登録されていません。<br>品目：{1}<br>手配ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBBL0251 = "MSBBL0251";

	/** LEVEL[W]<br>指定した受注ＮＯのデータが存在しないか、貸出出荷の受注ではありません。<br>受注ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0252 = "MSBBL0252";

	/** LEVEL[W]<br>指定した受注ＮＯ、受注明細ＮＯのデータが存在しないか、貸出出荷の受注明細ではありません。<br>受注ＮＯ：{1}<br>受注明細ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBBL0253 = "MSBBL0253";

	/** LEVEL[W]<br>インボイスが登録されていません。<br>{1}<p>
	 */
	public static String MSBBL0254 = "MSBBL0254";

	/** LEVEL[W]<br>売上済みのため、仕入実績の数量変更、取消はできません。<br>仕入実績明細ＮＯ：{1}<p>
	 */
	public static String MSBBL0255 = "MSBBL0255";

	/** LEVEL[W]<br>インボイス登録済みのため、仕入実績の数量変更、取消はできません。<br>仕入実績明細ＮＯ：{1}<p>
	 */
	public static String MSBBL0256 = "MSBBL0256";

	/** LEVEL[W]<br>明細のロット作成がオンの場合は詳細の業者ロットＮＯに同じ値を指定して下さい。<br>{1}<p>
	 */
	public static String MSBBL0257 = "MSBBL0257";

	/** LEVEL[W]<br>明細行の仕入有効成分が詳細行の仕入有効成分の合計と異なります。<br>明細行の数量：{1}<br>詳細行の合計数量：{2}<br>{3}<p>
	 */
	public static String MSBBL0258 = "MSBBL0258";

	/** LEVEL[W]<br>伝票分割が発生し、計画外の明細のみが別の伝票になるため、登録できません。<br>売上実績登録画面で計画外の売上を登録してください。<p>
	 */
	public static String MSBBL0259 = "MSBBL0259";

	/** LEVEL[W]<br>指定した売上実績受払数量が、仕入実績受払残数を超えるため登録できません。<br>売上実績受払の合計数量：{1}<br>仕入実績受払の残数：{2}<br>仕入実績受払ＮＯ：{3}<p>
	 */
	public static String MSBBL0260 = "MSBBL0260";

	/** LEVEL[W]<br>出荷実績と同時に計上された売上実績は訂正できません。<br>売上実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0261 = "MSBBL0261";

	/** LEVEL[W]<br>出荷実績と同時に計上された売上実績は取消できません。<br>売上実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0262 = "MSBBL0262";

	/** LEVEL[W]<br>輸出実績と同時に計上された売上実績は訂正できません。<br>売上実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0263 = "MSBBL0263";

	/** LEVEL[W]<br>輸出実績と同時に計上された売上実績は取消できません。<br>売上実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0264 = "MSBBL0264";

	/** LEVEL[W]<br>明細の貸出場所と詳細の貸出場所が異なっています。<br>明細と詳細の貸出場所を合わせるか、詳細が複数の貸出場所となる場合は明細の貸出場所をクリアしてください。<p>
	 */
	public static String MSBBL0265 = "MSBBL0265";

	/** LEVEL[W]<br>明細の貸出棚・ラインと詳細の貸出棚・ラインが異なっています。<br>明細と詳細の貸出棚・ラインを合わせるか、詳細が複数の貸出棚・ラインとなる場合は明細の貸出棚・ラインをクリアしてください。<p>
	 */
	public static String MSBBL0266 = "MSBBL0266";

	/** LEVEL[W]<br>明細の返品先情報が複数混在しているため登録できません。<br>同一の返品先情報とするか、異なる返品先の明細を行削除して別の売上返品として登録してください。<p>
	 */
	public static String MSBBL0267 = "MSBBL0267";

	/** LEVEL[W]<br>購買依頼が作られる場合はロット指定できません。<br>{1}<p>
	 */
	public static String MSBBL0268 = "MSBBL0268";

	/** LEVEL[W]<br>売上返品予定引継でインボイス取引対象の場合、一部明細および一部数量の返品計上はできません。<br>売上返品予定ＮＯ：{1}<p>
	 */
	public static String MSBBL0269 = "MSBBL0269";

	/** LEVEL[W]<br>明細の版ＮＯと詳細の版ＮＯが異なっています。<br>明細と詳細の版ＮＯを合わせるか、詳細が複数の版ＮＯとなる場合は明細の版ＮＯをクリアしてください。<p>
	 */
	public static String MSBBL0270 = "MSBBL0270";

	/** LEVEL[W]<br>ロット管理情報に登録されていません。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>版ＮＯ：{4}<p>
	 */
	public static String MSBBL0271 = "MSBBL0271";

	/** LEVEL[W]<br>出荷予定の削除または打切と、出荷依頼の再調整依頼は同時に行えません。<br>出荷予定ＮＯ：{1}<p>
	 */
	public static String MSBBL0272 = "MSBBL0272";

	/** LEVEL[W]<br>計画品目の数量・金額を案分する対象の品目が存在しないため、登録できません。<br>部門ＣＤ：{1}<br>計画品目ＣＤ：{2}<br>販売年月：{3}<br>{4}<p>
	 */
	public static String MSBBL0273 = "MSBBL0273";

	/** LEVEL[W]<br>場所が未決定のため登録できません。<br>売上実績登録画面で登録するか、出荷予定変更登録画面で場所を指定してください。<br>{1}<p>
	 */
	public static String MSBBL0274 = "MSBBL0274";

	/** LEVEL[W]<br>納入指示に対応する出荷予定が打切されたため、取消できません。<br>{1}<p>
	 */
	public static String MSBBL0275 = "MSBBL0275";

	/** LEVEL[W]<br>納入指示に対応する出荷予定が打切されたため、数量の訂正はできません。<br>{1}<p>
	 */
	public static String MSBBL0276 = "MSBBL0276";

	/** LEVEL[W]<br>納入指示に対応する出荷予定が打切されたため、納入希望日時の訂正はできません。<br>{1}<p>
	 */
	public static String MSBBL0277 = "MSBBL0277";

	/** LEVEL[W]<br>納入指示受領の合計数量が受注明細の数量を超えているため、登録できません。<br>納入指示受領の合計数量：{1}<br>受注明細の数量：{2}<p>
	 */
	public static String MSBBL0278 = "MSBBL0278";

	/** LEVEL[I]<br>出荷予定が変更されたため、受注納期回答が削除されました。必要に応じて回答を再度登録してください。<br>受注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0279 = "MSBBL0279";

	/** LEVEL[W]<br>一部でも売上登録された複数詳細の売上予定は、売上実績一覧登録画面では登録できません。<br>売上実績登録画面または仕入直送売上登録画面で登録してください。<br>{1}<p>
	 */
	public static String MSBBL0280 = "MSBBL0280";

	/** LEVEL[W]<br>仕入直送の発注が登録されているため、受注区分を仮受注に変更できません。<br>受注ＮＯ：{1}<p>
	 */
	public static String MSBBL0281 = "MSBBL0281";

	/** LEVEL[W]<br>引当範囲区分が「2.総量引当」の場合はロットＮＯおよびサブロットＮＯを指定できません。<br>{1}<p>
	 */
	public static String MSBBL0282 = "MSBBL0282";

	/** LEVEL[W]<br>貸出の変更はできません。<br>受注ＮＯ：{1}<br>受注明細ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBBL0283 = "MSBBL0283";

	/** LEVEL[W]<br>データ更新中に、データの競合が発生しました。<br>処理を再実行してください。<p>
	 */
	public static String MSBBL0284 = "MSBBL0284";

	/** LEVEL[W]<br>指定したインボイスＮＯはすでに存在します。<br>インボイスＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0290 = "MSBBL0290";

	/** LEVEL[W]<br>仕入直送売上の売上返品に対して伝票分割の発生する訂正は、売上返品登録画面で行ってください。<br>売上実績ＮＯ：{1}<p>
	 */
	public static String MSBBL0291 = "MSBBL0291";

	/** LEVEL[W]<br>預り売上がオンの場合、指図区分「2：ピッキングなし」を指定できません。<br>{1}<p>
	 */
	public static String MSBBL0292 = "MSBBL0292";

	/** LEVEL[W]<br>単価が0の場合、売上理由は必須です。<br>{1}<p>
	 */
	public static String MSBBL0293 = "MSBBL0293";

	/** LEVEL[W]<br>同一仕入実績に対して返品先情報が複数混在しているため登録できません。<br>同一の返品先情報とするか、異なる返品先の明細を行削除して別の売上返品として登録してください。<br>仕入実績ＮＯ：{1}<p>
	 */
	public static String MSBBL0294 = "MSBBL0294";

	/** LEVEL[W]<br>指定された単位から出荷時の単位に換算できないため、登録できません。<br>単位：{1}<br>数量：{2}<br>基準単位：{3}<br>基準単位数量：{4}<br>出荷時の単位：{5}<br>{6}<p>
	 */
	public static String MSBBL0295 = "MSBBL0295";

	/** LEVEL[W]<br>出荷予定に指定された出荷物流グループから変更後の配送先物流グループへのは出荷できません。受注引当マスタを確認してください。<br>ワーキンググループＣＤ：{1}<br>品目出荷グループＣＤ：{2}<br>出荷物流グループＣＤ：{3}<br>配送先物流グループＣＤ：{4}<br>配送先ＣＤ：{5}<br>{6}<p>
	 */
	public static String MSBBL0401 = "MSBBL0401";

	/** LEVEL[W]<br>出荷予定に指定された出荷物流グループから変更後の納品先物流グループへのは出荷できません。受注引当マスタを確認してください。<br>ワーキンググループＣＤ：{1}<br>品目出荷グループＣＤ：{2}<br>出荷物流グループＣＤ：{3}<br>納品先物流グループＣＤ：{4}<br>納品先ＣＤ：{5}<br>{6}<p>
	 */
	public static String MSBBL0402 = "MSBBL0402";

	/** LEVEL[W]<br>指定された納品先が受注引当格付マスタに存在しないため、更新できません。<br>得意先ＣＤ：{1}<br>納品先ＣＤ：{2}<br>格付ＣＤ：{3}<br>{4}<p>
	 */
	public static String MSBBL0403 = "MSBBL0403";

	/** LEVEL[I]<br>指図区分が「2:ピッキングなし」の明細が出荷できない状態です。<br>指図区分が「2:ピッキングなし」の明細を出荷する場合は、指図区分が「1:ピッキングあり」の受注明細あるいは出荷予定に、以下の配送先を指定してください。<br>受注ＮＯ：{1}<br>受注明細ＮＯ：{2}<br>配送先ＣＤ：{3}<p>
	 */
	public static String MSBBL0404 = "MSBBL0404";

	/** LEVEL[I]<br>指図区分が「2:ピッキングなし」の明細が出荷できない状態です。<br>指図区分が「2:ピッキングなし」の明細を出荷する場合は、指図区分が「1:ピッキングあり」の受注明細あるいは出荷予定に、以下の納品先を指定してください。<br>受注ＮＯ：{1}<br>受注明細ＮＯ：{2}<br>納品先ＣＤ：{3}<p>
	 */
	public static String MSBBL0405 = "MSBBL0405";

	/** LEVEL[W]<br>出荷予定日時から計算した依頼先出庫予定日を適用期間にもつ品目詳細マスタが登録されていません。<br>品目：{1}<br>依頼先場所ＣＤ：{2}<br>ワーキンググループＣＤ:{3}<br>出荷予定日時：{4}<br>{5}<p>
	 */
	public static String MSBBL0406 = "MSBBL0406";

	/** LEVEL[W]<br>出荷予定日から計算した発注予定日を適用期間にもつ品目詳細マスタが登録されていません。<br>品目：{1}<br>ワーキンググループＣＤ：{2}<br>構成パタン：{3}<br>製造場所ＣＤ：{4}<br>発注先ＣＤ：{5}<br>メーカＣＤ：{6}<br>出荷予定日：{7}<br>{8}<p>
	 */
	public static String MSBBL0407 = "MSBBL0407";

	/** LEVEL[W]<br>納入希望日から計算した発注予定日を適用期間にもつ品目詳細マスタが登録されていません。<br>品目：{1}<br>ワーキンググループＣＤ：{2}<br>構成パタン：{3}<br>製造場所ＣＤ：{4}<br>発注先ＣＤ：{5}<br>メーカＣＤ：{6}<br>納入希望日：{7}<br>{8}<p>
	 */
	public static String MSBBL0408 = "MSBBL0408";

	/** LEVEL[W]<br>受注引当マスタの引当場所が取得できませんでした。場所マスタの設定を確認してください。<br>場所ＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBBL0296 = "MSBBL0296";

	/** LEVEL[W]<br>受注引当マスタの出荷場所が取得できませんでした。場所マスタの設定を確認してください。<br>場所ＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBBL0297 = "MSBBL0297";

	/** LEVEL[W]<br>受注引当マスタの引当物流Ｇが取得できませんでした。物流グループマスタの設定を確認してください。<br>物流グループＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBBL0298 = "MSBBL0298";

	/** LEVEL[W]<br>受注引当マスタの総量引当場所Ｇが取得できませんでした。総量引当場所グループマスタの設定を確認してください。<br>総量引当場所グループＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBBL0299 = "MSBBL0299";

	/** LEVEL[W]<br>同一売上実績ヘッダに紐づく他の売上実績明細の品目が、有効な品目として品目マスタに登録されていません。<br>売上実績明細NO：{1}<br>{2}<p>
	 */
	public static String MSBBL0301 = "MSBBL0301";

	/** LEVEL[W]<br>インボイス登録済みの出荷返品の場合、数量の上限は出荷実績登録されている数量とインボイス登録されている数量の差数までです。<br>数量の上限：{1}<br>{2}<p>
	 */
	public static String MSBBL0302 = "MSBBL0302";

	/** LEVEL[W]<br>対象のロットは存在しません。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBBL0303 = "MSBBL0303";

	/** LEVEL[W]<br>売上締が解除されているため、計上日、売上担当者、売上部門は変更できません。<br>訂正前の計上日：{1}<br>{2}<p>
	 */
	public static String MSBBL0304 = "MSBBL0304";

	/** LEVEL[W]<br>後続業務が行われているため、前受金請求額を下回る入金額に訂正できません。<br>前受金請求額：{1}<br>前受金入金額合計：{2}<p>
	 */
	public static String MSBBL0305 = "MSBBL0305";

	/** LEVEL[W]<br>前受金が存在するため、前受金出荷制御区分を出荷可能に変更できません。<br>先に前受金入金を取消してください。<p>
	 */
	public static String MSBBL0306 = "MSBBL0306";

	/** LEVEL[W]<br>前受金が存在するため、取消できません。<br>先に前受金入金を取消してください。<p>
	 */
	public static String MSBBL0307 = "MSBBL0307";

	/** LEVEL[W]<br>受注時の得意先に対応した請求先と異なる請求先は前受金を登録できません。<br>受注ＮＯ：{1}<br>受注時の得意先に対応した請求先ＣＤ：{2}<br>前受金の請求先ＣＤ：{3}<p>
	 */
	public static String MSBBL0308 = "MSBBL0308";

	/** LEVEL[W]<br>指定した計上日は不正です。<br>指定した計上日で、売上担当者、売上部門に対する担当者権限マスタが設定されていることを確認してください。<br>計上日：{1}<br>売上担当者ＣＤ：{2}<br>売上部門ＣＤ：{3}<p>
	 */
	public static String MSBBL0309 = "MSBBL0309";

	/** LEVEL[W]<br>品揃区分に「2：品揃する」を指定した場合、受注明細に出荷物流Ｇ、納品先、配送先のいずれかが複数混在していると登録できません。<p>
	 */
	public static String MSBBL0310 = "MSBBL0310";

	/** LEVEL[W]<br>品揃ＧＮＯを指定した場合、同一の品揃ＧＮＯを指定した明細の、出荷物流Ｇ、納品先、配送先には同じ値を指定してください。<br>{1}<p>
	 */
	public static String MSBBL0311 = "MSBBL0311";

	/** LEVEL[W]<br>前回登録したデータがＧＡに未反映です。<br>売上伝票ＩＦ一覧照会画面から未反映の売上伝票を再送信してください。<br>データＮＯ：{1}<br>売上伝票ＮＯ：{2}<br>インボイスＮＯ：{3}<br>売上実績ＮＯ：{4}<br>支給実績ＮＯ：{5}<p>
	 */
	public static String MSBBL0501 = "MSBBL0501";

	/** LEVEL[W]<br>有償支給の売上伝票を送信する際に使用する決済方法ＣＤが取得できませんでした。<br>システムパラメータマスタの設定を確認してください。<br>パラメータキー：{1}<p>
	 */
	public static String MSBBL0502 = "MSBBL0502";

	/** LEVEL[I]<br>売上実績計上処理を開始します。<p>
	 */
	public static String MSBBL0503 = "MSBBL0503";

	/** LEVEL[I]<br>売上実績計上処理が終了しました。<br>処理対象：{1}						<br>登録件数：{2}				<br>エラー件数：{3}<p>
	 */
	public static String MSBBL0504 = "MSBBL0504";

	/** LEVEL[W]<br>売上・出荷が禁止されているため、売上実績を計上できません。<br>取引先禁止マスタをご確認ください。<br>得意先ＣＤ：{1}<br>売上日：{2}<p>
	 */
	public static String MSBBL0505 = "MSBBL0505";

	/** LEVEL[W]<br>入金予定日が指定されていないため、売上実績を計上できません。<br>受注ＮＯ：{1}<br>インボイスＮＯ：{2}<br>明細件数：{3}<p>
	 */
	public static String MSBBL0506 = "MSBBL0506";

	/** LEVEL[W]<br>該当の売上実績はＧＡに登録されていません。<br>ＧＡに登録されていないデータは訂正・取消できません。<br>売上実績ＮＯ：{1}<br>インボイスＮＯ：{2}<p>
	 */
	public static String MSBBL0507 = "MSBBL0507";

	/** LEVEL[W]<br>該当の支給実績はＧＡに登録されていません。<br>ＧＡに登録されていないデータは訂正・取消できません。<br>支給実績ＮＯ：{1}<p>
	 */
	public static String MSBBL0508 = "MSBBL0508";

	/** LEVEL[W]<br>売上・出荷が禁止されているため、売上実績を計上できません。<br>品目禁止マスタをご確認ください。<br>品目：{1}<br>売上日：{2}<p>
	 */
	public static String MSBBL0509 = "MSBBL0509";

	/** LEVEL[W]<br>入金予定制御マスタの設定が不正です。ＧＡに連携する入金予定日を計算できませんでした。<br>計上日時点のワーキンググループに対応するサイト区分と、請求締年月日時点のワーキンググループに対応するサイト区分に同じ値を設定してください。<br><br>計上日時点のワーキンググループ：{1}<br>請求締年月日時点のワーキンググループ：{2}<br>請求先：{3}<br>通貨：{4}<br>金額：{5}<p>
	 */
	public static String MSBBL0510 = "MSBBL0510";

	/** LEVEL[W]<br>入金予定制御マスタの設定が不正です。ＧＡに連携する入金予定日を計算できませんでした。<br>請求先の請求締処理区分がマニュアル選択請求、または売上都度請求かつインボイス取引対象外の場合は、サイト区分に「日」を指定してください。<br>ワーキンググループ：{1}<br>請求先：{2}<br>通貨：{3}<br>金額：{4}<p>
	 */
	public static String MSBBL0511 = "MSBBL0511";

	/** LEVEL[W]<br>出荷予定と納期回答の関係が不正です。納品予定反映ボタンを押下してから再度登録してください。<br>受注明細ＮＯ：{1}<br>受注納期回答ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBBL0512 = "MSBBL0512";

	/** LEVEL[W]<br>ロットＮＯ発番区分が手動でロットＮＯもしくは、サブロットＮＯを指定していない発注明細が含まれています。<br>売上実績計上バッチを実行する前に購買納期調整登録または仕入実績登録でロットＮＯもしくは、サブロットＮＯを指定してください。<br>受注ＮＯ：{1}<br>受注明細ＮＯ：{2}<br>発注ＮＯ：{3}<br>発注明細ＮＯ：{4}<br>得意先ＣＤ：{5}<br>品目ＣＤ：{6}<p>
	 */
	public static String MSBBL0513 = "MSBBL0513";

	/** LEVEL[W]<br>出荷返品の場合、数量の上限は未売上数量までです。<br>数量（基準単位）：{1}<br>未売上数量（基準単位）：{2}<p>
	 */
	public static String MSBBL0514 = "MSBBL0514";

	/** LEVEL[W]<br>打切または打切解除と同時に以下の項目を変更することはできません。<br>・得意先<br>・売上担当者<br>・売上部門<p>
	 */
	public static String MSBBL0515 = "MSBBL0515";

	/** LEVEL[W]<br>受領インボイスを登録済の場合、以下の項目は更新できません。<br>ヘッダ項目：{1}<br>受注ＮＯ：{2}<br>受注明細ＮＯ：{3}<p>
	 */
	public static String MSBBL0518 = "MSBBL0518";

	/** LEVEL[W]<br>受領インボイスを登録済の場合、以下の項目は更新できません。<br>明細項目：{1}<br>受注ＮＯ：{2}<br>受注明細ＮＯ：{3}<p>
	 */
	public static String MSBBL0519 = "MSBBL0519";

	/** LEVEL[W]<br>納入指示受領に対応する受注明細を特定する為に、受注明細ＮＯまたは以下の項目を指定してください。<br>得意先ＣＤ、得意先注文ＮＯ、得意先注文明細ＮＯ<br>{1}<p>
	 */
	public static String MSBBL0601 = "MSBBL0601";

	/** LEVEL[W]<br>納入指示受領に対応する受注明細を特定できません。<br>受注明細ＮＯ：{1}<br>得意先ＣＤ：{2}<br>得意先注文ＮＯ：{3}<br>得意先注文明細ＮＯ：{4}<p>
	 */
	public static String MSBBL0602 = "MSBBL0602";

	/** LEVEL[W]<br>場所が未決定のため登録できません。<br>売上実績登録画面で登録してください。<br>{1}<p>
	 */
	public static String MSBBL0603 = "MSBBL0603";

	/** LEVEL[W]<br>売上実績登録画面でインボイスを新規登録する場合は、明細間で異なる納品先を指定できません。<p>
	 */
	public static String MSBBL0604 = "MSBBL0604";

	/** LEVEL[W]<br>売上部門を取得できませんでした。売上部門ＣＤを指定して取込むか、得意先担当マスタを登録してください。<br>得意先：{1}<br>適用日：{2}<br>{3}<p>
	 */
	public static String MSBBL0605 = "MSBBL0605";

	/** LEVEL[W]<br>売上担当者を元に、売上部門を取得できませんでした。担当者権限マスタに営業部門を指定してください。<br>売上担当者：{1}<br>適用日：{2}<br>{3}<p>
	 */
	public static String MSBBL0606 = "MSBBL0606";

	/** LEVEL[W]<br>諸口品の場合、品名は必須です。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBBL0607 = "MSBBL0607";

	/** LEVEL[W]<br>デフォルト格付が取得できませんでした。<br>{1}<p>
	 */
	public static String MSBBL0608 = "MSBBL0608";

	/** LEVEL[W]<br>数量の小数部桁数が正しくありません。<br>数量：{1}<br>小数部有効桁数：{2}<br>{3}<p>
	 */
	public static String MSBBL0609 = "MSBBL0609";

	/** LEVEL[W]<br>単価の小数部桁数が正しくありません。<br>単価：{1}<br>小数部有効桁数：{2}<br>{3}<p>
	 */
	public static String MSBBL0610 = "MSBBL0610";

	/** LEVEL[W]<br>指定された単価と、マスタの単価が異なります。マスタと異なる値を登録するには単価取得対象外をオンにしてください。<br>指定された単価：{1}<br>マスタの単価：{2}<br>{3}<p>
	 */
	public static String MSBBL0611 = "MSBBL0611";

	/** LEVEL[W]<br>諸口納品先の場合、納品先名は必須です。<br>納品先：{1}<br>{2}<p>
	 */
	public static String MSBBL0612 = "MSBBL0612";

	/** LEVEL[W]<br>諸口配送先の場合、配送先名は必須です。<br>配送先：{1}<br>{2}<p>
	 */
	public static String MSBBL0613 = "MSBBL0613";

	/** LEVEL[W]<br>値引額を設定した場合は、値引理由が必須です。業務理由マスタに売上調整の理由を登録してください。<br>{1}<p>
	 */
	public static String MSBBL0614 = "MSBBL0614";

	/** LEVEL[W]<br>資産管理する品目、かつ単価が0の場合は、販売他勘定の売上理由が必須です。<br>業務理由マスタに販売他勘定の売上理由を登録してください。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBBL0615 = "MSBBL0615";

	/** LEVEL[W]<br>資産管理しない品目、かつ単価が0の場合は、販売他勘定ではない売上理由が必須です。<br>業務理由マスタに販売他勘定ではない売上理由を登録してください。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBBL0616 = "MSBBL0616";

	/** LEVEL[W]<br>資産管理する品目、かつ単価が0の場合は、負担部門が必須です。<br>売上部門を負担部門として設定する為、部門マスタの負担部門をオンにしてください。<br>品目：{1}<br>売上部門：{2}<br>{3}<p>
	 */
	public static String MSBBL0617 = "MSBBL0617";

	/** LEVEL[W]<br>配送先が必須です。配送先を指定して取込むか、物流制御マスタに標準配送先を登録してください。<br>納品先：{1}<br>{2}<p>
	 */
	public static String MSBBL0618 = "MSBBL0618";

	/** LEVEL[W]<br>指定された仮単価と、マスタの仮単価が異なります。マスタと異なる値を登録するには単価取得対象外をオンにしてください。<br>指定された仮単価：{1}<br>マスタの仮単価：{2}<br>{3}<p>
	 */
	public static String MSBBL0619 = "MSBBL0619";

	/** LEVEL[W]<br>インボイス単価の初期値とする販売単価が取得できないため、取り込みできませんでした。<br>インボイス取引、かつ単価が0の場合は、インボイス単価が必須です。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBBL0620 = "MSBBL0620";

	/** LEVEL[W]<br>承認状況区分が一次承認済または最終承認済のため、削除できません。<br>受注ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0621 = "MSBBL0621";

	/** LEVEL[W]<br>依頼先場所と発注先の両方に値を設定できません。<br>依頼先場所と発注先のいずれかを設定してください。<br>依頼先場所ＣＤ：{1}<br>発注先ＣＤ：{2}<br>{3}<p>
	 */
	public static String MSBBL0622 = "MSBBL0622";

	/** LEVEL[W]<br>品目マスタの販売単価変更許可がオフ、かつ取引先マスタの販売単価変更許可がオフのため、単価取得対象外をオンにできません。<br>品目：{1}<br>得意先：{2}<br>{3}<p>
	 */
	public static String MSBBL0623 = "MSBBL0623";

	/** LEVEL[W]<br>手配ＮＯ１管理区分が「管理しない」品目に対して手配ＮＯ１が指定されています。<br>品目：{1}<br>手配ＮＯ１：{2}<br>{3}<p>
	 */
	public static String MSBBL0624 = "MSBBL0624";

	/** LEVEL[W]<br>手配ＮＯ２管理区分が「管理しない」品目に対して手配ＮＯ２が指定されています。<br>品目：{1}<br>手配ＮＯ２：{2}<br>{3}<p>
	 */
	public static String MSBBL0625 = "MSBBL0625";

	/** LEVEL[W]<br>手配ＮＯ３管理区分が「管理しない」品目に対して手配ＮＯ３が指定されています。<br>品目：{1}<br>手配ＮＯ３：{2}<br>{3}<p>
	 */
	public static String MSBBL0626 = "MSBBL0626";

	/** LEVEL[W]<br>手配ＮＯ４管理区分が「管理しない」品目に対して手配ＮＯ４が指定されています。<br>品目:{1}<br>手配ＮＯ４:{2}<br>{3}<p>
	 */
	public static String MSBBL0627 = "MSBBL0627";

	/** LEVEL[W]<br>手配ＮＯ１管理区分が「管理しない」「管理する（必須）」品目に対して手配ＮＯ１無し可が指定されています。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBBL0628 = "MSBBL0628";

	/** LEVEL[W]<br>手配ＮＯ２管理区分が「管理しない」「管理する（必須）」品目に対して手配ＮＯ２無し可が指定されています。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBBL0629 = "MSBBL0629";

	/** LEVEL[W]<br>手配ＮＯ３管理区分が「管理しない」「管理する（必須）」品目に対して手配ＮＯ３無し可が指定されています。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBBL0630 = "MSBBL0630";

	/** LEVEL[W]<br>手配ＮＯ４管理区分が「管理しない」「管理する（必須）」品目に対して手配ＮＯ４無し可が指定されています。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBBL0631 = "MSBBL0631";

	/** LEVEL[W]<br>得意先品目のみを指定していますが品目を特定できませんでした。取引先品目マスタを設定するか、品目を指定してください。<br>マスタ適用日：{1}<br>得意先：{2}<br>得意先品目：{3}<br>{4}<p>
	 */
	public static String MSBBL0632 = "MSBBL0632";

	/** LEVEL[W]<br>見積ＮＯを指定していますが、引継可能な明細が存在しません。<br>見積ＮＯ：{1}-{2}<br>見積明細ＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBBL0633 = "MSBBL0633";

	/** LEVEL[W]<br>得意先インボイス対象外の得意先から、得意先インボイス対象の得意先への変更はできません。<p>
	 */
	public static String MSBBL0634 = "MSBBL0634";

	/** LEVEL[W]<br>在庫品の場合、指図区分に「ピッキングなし」を指定できません。<br>{1}<p>
	 */
	public static String MSBBL0635 = "MSBBL0635";

	/** LEVEL[W]<br>該当の売上実績は仕入直送売上のため当画面では処理できません。<br>売上実績一覧登録画面で処理を行ってください。<p>
	 */
	public static String MSBBL0636 = "MSBBL0636";

	/** LEVEL[W]<br>インボイス取引対象の売上実績を訂正・取消する場合は、インボイスＮＯで検索してください。<p>
	 */
	public static String MSBBL0637 = "MSBBL0637";

	/** LEVEL[W]<br>同一売上実績ＮＯに紐づく売上実績明細において、明細間で異なる売上担当者ＣＤ、売上部門ＣＤ、債権部門ＣＤは指定できません。<p>
	 */
	public static String MSBBL0638 = "MSBBL0638";

	/** LEVEL[W]<br>インボイス対象の明細を行追加する場合、登録済みの明細と異なる売上担当者ＣＤ、売上部門ＣＤ、債権部門ＣＤは指定できません。<br>{1}<p>
	 */
	public static String MSBBL0639 = "MSBBL0639";

	/** LEVEL[W]<br>インボイス登録済みのため、納入指示受領の取消はできません。<br>{1}<p>
	 */
	public static String MSBBL0640 = "MSBBL0640";

	/** LEVEL[W]<br>インボイスが既に登録されているため、受注明細の訂正・取消・打切はできません。<br>受注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBBL0641 = "MSBBL0641";

	/** LEVEL[I]<br>仮単価のまま売上を計上します。<br>仮単価を本単価に訂正するには、インボイスを訂正してください。<br>インボイスＮＯ：{1}<br>インボイス明細ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBBL0642 = "MSBBL0642";

	/** LEVEL[W]<br>出荷予定と納期回答の関係が不正です。受注明細単位で更新してください。<br>受注明細ＮＯ：{1}<br>受注納期回答ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBBL0643 = "MSBBL0643";

	/** LEVEL[W]<br>納期回答に紐づく出荷予定がありません。納期回答を削除してください。<br>受注明細ＮＯ：{1}<br>受注納期回答ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBBL0644 = "MSBBL0644";

	/** LEVEL[W]<br>税を取得できませんでした。<br>会社マスタ、取引先マスタ、品目マスタの設定を確認してください。<br>適用日：{1}<br>得意先：{2}<br>計画品目：{3}<br>品目：{4}<p>
	 */
	public static String MSBBL0645 = "MSBBL0645";

	/** LEVEL[W]<br>納入指示受領に対して、確定がオンとオフの出荷予定が混在しています。<br>出荷予定の確定はいずれかに統一してください。<br>納入指示受領ＮＯ：{1}<p>
	 */
	public static String MSBBL0646 = "MSBBL0646";

	/** LEVEL[W]<br>ロットＮＯの混在が不可の明細でロットが混在しているため、処理できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBBL0701 = "MSBBL0701";

	/** LEVEL[W]<br>サブロットＮＯの混在が不可の明細でサブロットが混在しているため、処理できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBBL0702 = "MSBBL0702";

	/** LEVEL[W]<br>単価が0ではない場合、販売他勘定の売上理由は指定できません。<br>単価：{1}<br>売上理由：{2}<br>{3}<p>
	 */
	public static String MSBBL0703 = "MSBBL0703";

	/** LEVEL[I]<br>手配ＮＯ発番処理を実行します。よろしいですか？<p>
	 */
	public static String MSBCP0001 = "MSBCP0001";

	/** LEVEL[W]<br>期間は93日以内になるように指定してください。<p>
	 */
	public static String MSBCP0002 = "MSBCP0002";

	/** LEVEL[W]<br>期間は60ヶ月以内になるように指定してください。<p>
	 */
	public static String MSBCP0003 = "MSBCP0003";

	/** LEVEL[W]<br>以下の項目の何れかが変更された後に、製造指図の再展開が行われていないため、登録できません。<br>・製造場所<br>・指図数量<br>・出来高予定数量<br>・着手予定日<br>・終了予定日<br>・手配ＮＯ<br>・構成パタン<br>・工程パタン<p>
	 */
	public static String MSBCP1001 = "MSBCP1001";

	/** LEVEL[W]<br>工程の以下の項目の何れかが変更された後に、予定再展開が行われていないため、登録できません。<br>・基準単位数量<br>・着手予定日<br>・終了予定日<p>
	 */
	public static String MSBCP1002 = "MSBCP1002";

	/** LEVEL[W]<br>再計算を行うためには、同一工程指図ＮＯの工程を同時に処理対象とする必要があります。<br>同一工程指図ＮＯの工程を全て選択してください。<br>{1}<p>
	 */
	public static String MSBCP1004 = "MSBCP1004";

	/** LEVEL[W]<br>ＢＯＭマスタに存在する投入品は削除できません。<p>
	 */
	public static String MSBCP1005 = "MSBCP1005";

	/** LEVEL[W]<br>ロットまたはサブロットのチェックをオンにしてください。<p>
	 */
	public static String MSBCP1006 = "MSBCP1006";

	/** LEVEL[I]<br>日付計算処理を実行します。よろしいですか？<p>
	 */
	public static String MSBCP1007 = "MSBCP1007";

	/** LEVEL[I]<br>ロット発番処理を実行します。よろしいですか？<p>
	 */
	public static String MSBCP1008 = "MSBCP1008";

	/** LEVEL[I]<br>再展開処理を実行します。よろしいですか？<p>
	 */
	public static String MSBCP1009 = "MSBCP1009";

	/** LEVEL[I]<br>ロット提案処理を実行します。よろしいですか？<p>
	 */
	public static String MSBCP1010 = "MSBCP1010";

	/** LEVEL[I]<br>再計算処理を実行します。よろしいですか？<p>
	 */
	public static String MSBCP1011 = "MSBCP1011";

	/** LEVEL[W]<br>再展開する工程の再展開対象チェックをオンにしてください。<p>
	 */
	public static String MSBCP1012 = "MSBCP1012";

	/** LEVEL[W]<br>投入・工数・副産品チェックの何れか一つをオンにしてください。<p>
	 */
	public static String MSBCP1013 = "MSBCP1013";

	/** LEVEL[W]<br>品目工程マスタが変更されているため、予定再展開を実行できません。<br>再展開を実行してください。<p>
	 */
	public static String MSBCP1014 = "MSBCP1014";

	/** LEVEL[I]<br>工程オーダ展開処理を実行します。よろしいですか？<p>
	 */
	public static String MSBCP1015 = "MSBCP1015";

	/** LEVEL[I]<br>品目実際収率が品目下限収率を下回っています。<br>品目実際収率：{1}<br>品目下限収率：{2}<br>{3}<p>
	 */
	public static String MSBCP1016 = "MSBCP1016";

	/** LEVEL[I]<br>品目実際収率が品目上限収率を上回っています。<br>品目実際収率：{1}<br>品目上限収率：{2}<br>{3}<p>
	 */
	public static String MSBCP1017 = "MSBCP1017";

	/** LEVEL[I]<br>工程実際収率が工程下限収率を下回っています。<br>工程実際収率：{1}<br>工程下限収率：{2}<br>{3}<p>
	 */
	public static String MSBCP1018 = "MSBCP1018";

	/** LEVEL[I]<br>工程実際収率が工程上限収率を上回っています。<br>工程実際収率：{1}<br>工程上限収率：{2}<br>{3}<p>
	 */
	public static String MSBCP1019 = "MSBCP1019";

	/** LEVEL[W]<br>同じ工程、代替グループ、代替グループ連番に代替品目指定がオンの品目が存在する場合、<br>代替品目指定がオフの品目に対してロット提案を実行できません。<br>代替品目指定のチェックをオンにするか、ロット提案対象のチェックをオフにしてください。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCP1020 = "MSBCP1020";

	/** LEVEL[W]<br>同一投入予定に打切チェックがオンとオフの投入実績が混在するため、登録できません。<br>打切を行う場合は、選択チェックをオンにしたすべての投入実績の打切チェックをオンにしてください。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCP1021 = "MSBCP1021";

	/** LEVEL[W]<br>同一工数予定に打切チェックがオンとオフの工数実績が混在するため、登録できません。<br>打切を行う場合は、選択チェックをオンにしたすべての工数実績の打切チェックをオンにしてください。<br>工数：{1}<br>{2}<p>
	 */
	public static String MSBCP1022 = "MSBCP1022";

	/** LEVEL[I]<br>標準有効成分と実際有効成分が異なっています。<br>反映しますか？<p>
	 */
	public static String MSBCP1023 = "MSBCP1023";

	/** LEVEL[W]<br>確定されているため、備考と予備項目しか訂正できません。<br>所要ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL0001 = "MSBCL0001";

	/** LEVEL[W]<br>確定されているため、取消できません。<br>所要ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL0002 = "MSBCL0002";

	/** LEVEL[W]<br>手配ＮＯ管理対象外の品目のため指定できません。<br>品目：{1}<br>{2}:{3}<br>{4}<p>
	 */
	public static String MSBCL0003 = "MSBCL0003";

	/** LEVEL[W]<br>対応する品目詳細マスタが存在しません。<br>品目：{1}<br>ワーキンググループＣＤ：{2}<br>{3}<br>{4}<br><p>
	 */
	public static String MSBCL0004 = "MSBCL0004";

	/** LEVEL[W]<br>品目禁止マスタで所要の登録が禁止されています。<br>品目：{1}<br>納期：{2}<br>禁止日：{3}<br>{4}<br><p>
	 */
	public static String MSBCL0005 = "MSBCL0005";

	/** LEVEL[W]<br>対応する品目詳細マスタが存在しません。<br>品目：{1}<br>ワーキンググループＣＤ：{2}<br>{3}<br><p>
	 */
	public static String MSBCL0006 = "MSBCL0006";

	/** LEVEL[W]<br>ＭＲＰ発番用接頭語が取得できませんでした。ＷＧマスタの接頭語項目の設定を確認してください。<br>ワーキンググループ：{1}<p>
	 */
	public static String MSBCL0023 = "MSBCL0023";

	/** LEVEL[W]<br>所要量計算が正しく実行されないＷＧが存在します。<br>ＷＧＣＤ：{1}<p>
	 */
	public static String MSBCL0024 = "MSBCL0024";

	/** LEVEL[W]<br>ＭＲＰ用発番に対して、登録しようとした接頭語は他のＷＧ用にすでに登録されています。<br>ＷＧマスタの接頭語項目の設定を確認してください。<br>ＷＧＣＤ：{1}<br>接頭語：{2}<p>
	 */
	public static String MSBCL0025 = "MSBCL0025";

	/** LEVEL[W]<br>ＷＧＣＤ：{1}がスケジューリング中のため所要量計算を実行しませんでした。<p>
	 */
	public static String MSBCL0026 = "MSBCL0026";

	/** LEVEL[W]<br>ＷＧＣＤ：{1}の所要量計算が正しく実行されませんでした。<br>{2}<p>
	 */
	public static String MSBCL0027 = "MSBCL0027";

	/** LEVEL[I]<br>ＷＧＣＤ：{1}の所要量計算が正常終了しました。<br>{2}<p>
	 */
	public static String MSBCL0028 = "MSBCL0028";

	/** LEVEL[W]<br>新しい変更ＮＯが追加されています。再検索して確認してください。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL0029 = "MSBCL0029";

	/** LEVEL[W]<br>品目詳細マスタに登録されていません。<br>品目：{1}<br>構成パタン：{2}<br>製造場所ＣＤ：{3}<br>発注先ＣＤ：{4}<br>メーカＣＤ：{5}<br>依頼先場所ＣＤ：{6}<br>ＷＧＣＤ：{7}<br>マスタ適用日：{8}<br>{9}<p>
	 */
	public static String MSBCL0030 = "MSBCL0030";

	/** LEVEL[W]<br>オーダに指定したＷＧはＷＧマスタに製造または物流機能を持つＷＧとして登録されていません。<br>ＷＧＣＤ：{1}<p>
	 */
	public static String MSBCL0031 = "MSBCL0031";

	/** LEVEL[W]<br>オーダに指定したＷＧと異なるＷＧの格納場所は指定できません。<br>オーダＷＧＣＤ：{1}<br>格納場所ＣＤ：{2}<br>格納場所ＷＧＣＤ：{3}<p>
	 */
	public static String MSBCL0032 = "MSBCL0032";

	/** LEVEL[W]<br>格納場所と製造場所が異なるＷＧの場所を指定できません。<br>格納場所ＣＤ：{1}<br>格納場所ＷＧＣＤ：{2}<br>製造場所ＣＤ：{3}<br>製造場所ＷＧＣＤ：{4}<p>
	 */
	public static String MSBCL0033 = "MSBCL0033";

	/** LEVEL[W]<br>格納場所と依頼先場所が異なるＷＧの場所を指定できません。<br>格納場所ＣＤ：{1}<br>格納場所ＷＧＣＤ：{2}<br>依頼先場所ＣＤ：{3}<br>依頼先場所ＷＧＣＤ：{4}<p>
	 */
	public static String MSBCL0034 = "MSBCL0034";

	/** LEVEL[W]<br>格納場所と依頼先場所が同じ物流Ｇの場所を指定できません。<br>格納場所ＣＤ：{1}<br>格納場所物流グループＣＤ：{2}<br>依頼先場所ＣＤ：{3}<br>依頼先場所物流グループＣＤ：{4}<p>
	 */
	public static String MSBCL0035 = "MSBCL0035";

	/** LEVEL[W]<br>格納場所と依頼先場所が同じＷＧの場所を指定できません。<br>格納場所ＣＤ：{1}<br>依頼先場所ＣＤ：{2}<br>ＷＧＣＤ：{3}<p>
	 */
	public static String MSBCL0036 = "MSBCL0036";

	/** LEVEL[W]<br>オーダ区分が「1.製造」の品目オーダには製造着手予定日、製造終了予定日、格納完了予定日、使用可能予定日が必須です。<p>
	 */
	public static String MSBCL0037 = "MSBCL0037";

	/** LEVEL[W]<br>オーダ区分が「2.購買」の品目オーダには発注予定日、格納完了予定日、検収予定日、使用可能予定日が必須です。<p>
	 */
	public static String MSBCL0038 = "MSBCL0038";

	/** LEVEL[W]<br>オーダ区分が「3.外注」の品目オーダには製造着手予定日、製造終了予定日、発注予定日、格納完了予定日、検収予定日、使用可能予定日が必須です。<p>
	 */
	public static String MSBCL0039 = "MSBCL0039";

	/** LEVEL[W]<br>オーダ区分が「4.移送」の品目オーダには出庫予定日、格納完了予定日、使用可能予定日が必須です。<p>
	 */
	public static String MSBCL0040 = "MSBCL0040";

	/** LEVEL[W]<br>オーダ区分が「5.ＷＧ間移送」の品目オーダには出庫予定日、格納完了予定日、使用可能予定日が必須です。<p>
	 */
	public static String MSBCL0041 = "MSBCL0041";

	/** LEVEL[W]<br>検査対象の品目オーダには検査着手予定日、検査終了予定日が必須です。<p>
	 */
	public static String MSBCL0042 = "MSBCL0042";

	/** LEVEL[W]<br>製造着手予定日、製造終了予定日、格納完了予定日、使用可能予定日の日付前後関係が不正です。<br>製造着手予定日：{1}<br>製造終了予定日：{2}<br>格納完了予定日：{3}<br>使用可能予定日：{4}<p>
	 */
	public static String MSBCL0043 = "MSBCL0043";

	/** LEVEL[W]<br>発注予定日、格納完了予定日、検収予定日、使用可能予定日の日付の前後関係が不正です。<br>発注予定日：{1}<br>格納完了予定日：{2}<br>検収予定日：{3}<br>使用可能予定日：{4}<p>
	 */
	public static String MSBCL0044 = "MSBCL0044";

	/** LEVEL[W]<br>発注予定日、製造着手予定日、製造終了予定日、検収予定日、格納完了予定日、使用可能予定日の日付前後関係が不正です。<br>発注予定日：{1}<br>製造着手予定日：{2}<br>製造終了予定日：{3}<br>検収予定日：{4}<br>格納完了予定日：{5}<br>使用可能予定日：{6}<p>
	 */
	public static String MSBCL0045 = "MSBCL0045";

	/** LEVEL[W]<br>出庫予定日、格納完了予定日、使用可能予定日の日付前後関係が不正です。<br>出庫予定日：{1}<br>格納完了予定日：{2}<br>使用可能予定日：{3}<p>
	 */
	public static String MSBCL0046 = "MSBCL0046";

	/** LEVEL[W]<br>検査着手予定日、検査終了予定日、使用可能予定日の日付前後関係が不正です。<br>検査着手予定日：{1}<br>検査終了予定日：{2}<br>使用可能予定日：{3}<p>
	 */
	public static String MSBCL0047 = "MSBCL0047";

	/** LEVEL[W]<br>格納完了予定日≦検査着手予定日の日付前後関係を満たしていません。<br>格納完了予定日：{1}<br>検査着手予定日：{2}<p>
	 */
	public static String MSBCL0048 = "MSBCL0048";

	/** LEVEL[W]<br>版管理品のため版ＮＯが必須です。<br>品目：{1}<p>
	 */
	public static String MSBCL0049 = "MSBCL0049";

	/** LEVEL[W]<br>有効な版ＮＯではありません。<br>品目：{1}<br>工場・物流倉庫ＣＤ：{2}<br>版ＮＯ：{3}<p>
	 */
	public static String MSBCL0050 = "MSBCL0050";

	/** LEVEL[W]<br>ＷＧを変更する訂正はできません。<br>品目オーダＮＯ：{1}<br>変更前ＷＧＣＤ：{2}<br>変更後ＷＧＣＤ：{3}<p>
	 */
	public static String MSBCL0051 = "MSBCL0051";

	/** LEVEL[W]<br>品目オーダが確定されているため、訂正・取消はできません。<br>品目オーダＮＯ：{1}<p>
	 */
	public static String MSBCL0052 = "MSBCL0052";

	/** LEVEL[W]<br>手配不可の品目のため、確定に更新できません。<br>品目：{1}<br>手配ＮＯ：{2}<p>
	 */
	public static String MSBCL0053 = "MSBCL0053";

	/** LEVEL[W]<br>品目禁止マスタでオーダ禁止品目となっているため登録・訂正ができません。<br>品目：{1}<br>オーダ禁止日：{2}<br>マスタ適用日：{3}<p>
	 */
	public static String MSBCL0054 = "MSBCL0054";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ１管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ１が必須です。<br>品目：{1}<p>
	 */
	public static String MSBCL0055 = "MSBCL0055";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ２管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ２が必須です。<br>品目：{1}<p>
	 */
	public static String MSBCL0056 = "MSBCL0056";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ３管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ３が必須です。<br>品目：{1}<p>
	 */
	public static String MSBCL0057 = "MSBCL0057";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ４管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ４が必須です。<br>品目：{1}<p>
	 */
	public static String MSBCL0058 = "MSBCL0058";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ１管理区分に「1.管理しない」が指定されているため、手配ＮＯ１は指定できません。<br>品目：{1}<br>手配ＮＯ１：{2}<p>
	 */
	public static String MSBCL0059 = "MSBCL0059";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ２管理区分に「1.管理しない」が指定されているため、手配ＮＯ２は指定できません。<br>品目：{1}<br>手配ＮＯ２：{2}<p>
	 */
	public static String MSBCL0060 = "MSBCL0060";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ３管理区分に「1.管理しない」が指定されているため、手配ＮＯ３は指定できません。<br>品目：{1}<br>手配ＮＯ３：{2}<p>
	 */
	public static String MSBCL0061 = "MSBCL0061";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ４管理区分に「1.管理しない」が指定されているため、手配ＮＯ４は指定できません。<br>品目：{1}<br>手配ＮＯ４：{2}<p>
	 */
	public static String MSBCL0062 = "MSBCL0062";

	/** LEVEL[W]<br>デフォルト工程が必要な品目オーダに対応するデフォルト工程が存在しません。<p>
	 */
	public static String MSBCL0063 = "MSBCL0063";

	/** LEVEL[W]<br>スケジューラ実行中のオーダのため更新できません。<br>品目オーダＮＯ：{1}<p>
	 */
	public static String MSBCL0064 = "MSBCL0064";

	/** LEVEL[W]<br>下記日付のいずれか1つは指定する必要があります。<br>製造着手予定日、製造終了予定日、格納完了予定日、使用可能予定日<p>
	 */
	public static String MSBCL0065 = "MSBCL0065";

	/** LEVEL[W]<br>下記日付のいずれか1つは指定する必要があります。<br>発注予定日、格納完了予定日、検収予定日、使用可能予定日<p>
	 */
	public static String MSBCL0066 = "MSBCL0066";

	/** LEVEL[W]<br>下記日付のいずれか1つは指定する必要があります。<br>発注予定日、製造着手予定日、製造終了予定日、検収予定日、格納完了予定日、使用可能予定日<p>
	 */
	public static String MSBCL0067 = "MSBCL0067";

	/** LEVEL[W]<br>下記日付のいずれか1つは指定する必要があります。<br>出庫予定日、格納完了予定日、使用可能予定日<p>
	 */
	public static String MSBCL0068 = "MSBCL0068";

	/** LEVEL[W]<br>マスタ適用日が指定されていません。<p>
	 */
	public static String MSBCL0069 = "MSBCL0069";

	/** LEVEL[W]<br>製造・外注オーダに対して製造場所、構成パタンが指定されていません。<p>
	 */
	public static String MSBCL0070 = "MSBCL0070";

	/** LEVEL[W]<br>購買オーダに対して発注先が指定されていません。<p>
	 */
	public static String MSBCL0071 = "MSBCL0071";

	/** LEVEL[W]<br>移送・ＷＧ間移送オーダに対して依頼先場所が指定されていません。<p>
	 */
	public static String MSBCL0072 = "MSBCL0072";

	/** LEVEL[W]<br>格納場所が指定されていません。<p>
	 */
	public static String MSBCL0073 = "MSBCL0073";

	/** LEVEL[W]<br>工程着手予定日時、工程終了予定日時の日付前後関係が不正です。<br>工程着手予定日時：{1}<br>工程終了予定日時：{2}<br>品目オーダＮＯ：{3}<p>
	 */
	public static String MSBCL0074 = "MSBCL0074";

	/** LEVEL[W]<br>工程オーダ状況が未確定・保存ではありません。<br>品目オーダＮＯ：{1}<p>
	 */
	public static String MSBCL0075 = "MSBCL0075";

	/** LEVEL[W]<br>工程場所が不正です。品目オーダの製造場所もしくは品目工程マスタの工程場所と一致する必要があります。<br>工程ＣＤ：{1}<br>工程連番：{2}<br>工程場所ＣＤ：{3}<p>
	 */
	public static String MSBCL0076 = "MSBCL0076";

	/** LEVEL[W]<br>対象の工程オーダの中で、品目工程マスタに存在しない工程ＣＤ、工程連番が含まれています。<br>工程ＣＤ：{1}<br>工程連番：{2}<p>
	 */
	public static String MSBCL0077 = "MSBCL0077";

	/** LEVEL[W]<br>必要な工程管理ＮＯの工程オーダが不足しています。工程オーダと品目工程マスタを確認してください。<br>工程ＣＤ：{1}<br>工程連番：{2}<p>
	 */
	public static String MSBCL0078 = "MSBCL0078";

	/** LEVEL[W]<br>下記のいずれか1つは指定する必要があります。<br>指図予定数量、出来高予定数量<p>
	 */
	public static String MSBCL0079 = "MSBCL0079";

	/** LEVEL[W]<br>オーダ区分が「1.製造」以外で、指図予定数量と出来高予定数量が異なっている場合、指図予定数を出来高予定数に設定します。<p>
	 */
	public static String MSBCL0080 = "MSBCL0080";

	/** LEVEL[W]<br>確定以降のオーダを訂正・取消できません。<br>品目オーダＮＯ：{1}<p>
	 */
	public static String MSBCL0081 = "MSBCL0081";

	/** LEVEL[W]<br>引当可能な在庫、受払予定が存在しません。<br>品目：{1}<br>投入場所：{2}<p>
	 */
	public static String MSBCL0082 = "MSBCL0082";

	/** LEVEL[W]<br>対象の品目オーダは確定されているため、反映解除できません。<br>品目オーダＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL0083 = "MSBCL0083";

	/** LEVEL[W]<br>ＭＰＳ品目マスタに登録されていません。<br>品目：{1}<br>ワーキンググループＣＤ：{2}<br>{3}<p>
	 */
	public static String MSBCL0084 = "MSBCL0084";

	/** LEVEL[W]<br>依頼数が生産可能数を超過したため、以下の数量分の日次生産依頼が作成できませんでした。 <br>品目：{1}<br>ＭＰＳグループ：{2}<br>生産年月：{3}<br>依頼残数:：{4}<p>
	 */
	public static String MSBCL0085 = "MSBCL0085";

	/** LEVEL[W]<br>割付可能な稼動日がありません。<br>期間開始：{1}<br>期間終了：{2}<br>カレンダＣＤ：{3}<p>
	 */
	public static String MSBCL0086 = "MSBCL0086";

	/** LEVEL[I]<br>格納先場所と依頼先場所のワークグループが同一のため、オーダ区分をＷＧ間移送から移送へ変更しました。<br>場所：{1}<br>場所ＷＧ：{2}<br>依頼先場所：{3}<br>依頼先ＷＧ：{4}<br>品目：{5}<p>
	 */
	public static String MSBCL0087 = "MSBCL0087";

	/** LEVEL[I]<br>格納先場所と依頼先場所のワークグループが異なるため、オーダ区分を移送からＷＧ間移送へ変更しました。<br>場所：{1}<br>場所ＷＧ：{2}<br>依頼先場所：{3}<br>依頼先ＷＧ：{4}<br>品目：{5}<p>
	 */
	public static String MSBCL0088 = "MSBCL0088";

	/** LEVEL[I]<br>品目オーダＮＯに対応する保存の工程オーダが存在するため、品目オーダの品目オーダ状況を未確定から保存へ変更しました。<br>品目オーダＮＯ：{1}<br>品目：{2}<p>
	 */
	public static String MSBCL0089 = "MSBCL0089";

	/** LEVEL[W]<br>工程オーダの工程指図数が品目オーダの指図予定数と一致ではありません。<br>品目オーダＮＯ：{1}<p>
	 */
	public static String MSBCL0090 = "MSBCL0090";

	/** LEVEL[W]<br>工程指図数の合計が指図予定数と一致していません。<br>工程ＣＤ：{1}<br>工程連番：{2}<br>工程指図数合計：{3}<br>指図予定数：{4}<p>
	 */
	public static String MSBCL0091 = "MSBCL0091";

	/** LEVEL[W]<br>工程指図数には0以下の値を指定できません。<br>工程ＣＤ：{1}<br>工程連番：{2}<p>
	 */
	public static String MSBCL0092 = "MSBCL0092";

	/** LEVEL[W]<br>工程着手予定日時≦工程終了予定日時の関係で指定してください。<br>工程着手予定日時：{1}<br>工程終了予定日時：{2}<p>
	 */
	public static String MSBCL0093 = "MSBCL0093";

	/** LEVEL[W]<br>シミュレーションＮＯのＷＧと異なるＷＧの格納場所は登録できません。ＷＧ：{1} 格納場所：{2} {3}<p>
	 */
	public static String MSBCL0094 = "MSBCL0094";

	/** LEVEL[W]<br>ＷＧを訂正することはできません。ＷＧ：{1} 訂正前ＷＧ：{2} {3}<p>
	 */
	public static String MSBCL0095 = "MSBCL0095";

	/** LEVEL[W]<br>指定したシミュレーションＮＯに紐づかない所要ＮＯが指定されています。<br>指定シミュレーションＮＯ：{1}<br>所要ＮＯ：{2}<br>シミュレーションＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBCL0096 = "MSBCL0096";

	/** LEVEL[W]<br>想定しないステータスのデータが含まれてます。<br>変更前品目オーダ負荷状況区分：{1}<br>変更後品目オーダ負荷状況区分：{2}<p>
	 */
	public static String MSBCL0097 = "MSBCL0097";

	/** LEVEL[I]<br>オーダ自動確定処理を開始します。<p>
	 */
	public static String MSBCL0098 = "MSBCL0098";

	/** LEVEL[I]<br>オーダ自動確定処理が終了しました。<br>処理対象：{1}<br>確定件数：{2}<br>エラー件数：{3}<p>
	 */
	public static String MSBCL0099 = "MSBCL0099";

	/** LEVEL[W]<br>所要量計算排他情報をロックできませんでした。処理を中止します。<br>ワーキンググループ：{1}<p>
	 */
	public static String MSBCL0100 = "MSBCL0100";

	/** LEVEL[W]<br>所要量計算排他情報を登録できませんでした。処理を中止します。<br>ワーキンググループ：{1}<p>
	 */
	public static String MSBCL0101 = "MSBCL0101";

	/** LEVEL[W]<br>取引先禁止マスタで所要の登録が禁止されています。<br>取引先：{1}<br>納期：{2}<br>禁止日：{3}<br>{4}<p>
	 */
	public static String MSBCL0102 = "MSBCL0102";

	/** LEVEL[W]<br>取引先禁止マスタでオーダ禁止取引先となっているため登録・訂正ができません。<br>取引先：{1}<br>オーダ禁止日：{2}<br>マスタ適用日：{3}<p>
	 */
	public static String MSBCL0103 = "MSBCL0103";

	/** LEVEL[I]<br>所要量計算処理を開始します。<p>
	 */
	public static String MSBCL0104 = "MSBCL0104";

	/** LEVEL[I]<br>所要量計算処理が終了しました。<p>
	 */
	public static String MSBCL0105 = "MSBCL0105";

	/** LEVEL[I]<br>先行手配用所要量計算処理を開始します。<p>
	 */
	public static String MSBCL0106 = "MSBCL0106";

	/** LEVEL[I]<br>先行手配用所要量計算処理が終了しました。<p>
	 */
	public static String MSBCL0107 = "MSBCL0107";

	/** LEVEL[W]<br>生産計画立案区分が「2.月次生産依頼機能を使用」ではないため、登録・訂正できません。<br>品目：{1}<br>ワーキンググループＣＤ：{2}<br>{3}<p>
	 */
	public static String MSBCL0108 = "MSBCL0108";

	/** LEVEL[I]<br>生産計画立案区分が「2.月次生産依頼機能を使用」ではないため、日ばらし処理の対象外にします。<br>品目：{1}<br>ワーキンググループＣＤ：{2}<p>
	 */
	public static String MSBCL0109 = "MSBCL0109";

	/** LEVEL[W]<br>製造指図ＮＯ、分割連番、工程に対する工程実績が登録されていません。<br>製造指図ＮＯ、分割連番、工程を指定した場合、対応する工程実績を事前に登録しておく必要があります。<br>製造指図ＮＯ：{1}<br>分割連番：{2}<br>工程ＣＤ：{3}<br>{4}<p>
	 */
	public static String MSBCL1001 = "MSBCL1001";

	/** LEVEL[W]<br>工数予定に対応する工程実績が登録されていません。<br>工数実績を登録するためには、事前に工程実績を登録する必要があります。<br>工程指図ＮＯ：{1}<br>分割連番：{2}<br>{3}<p>
	 */
	public static String MSBCL1002 = "MSBCL1002";

	/** LEVEL[W]<br>投入実績に対して不正な在庫識別区分が指定されているため、登録できません。<br>在庫識別区分：{1}<br>{2}<p>
	 */
	public static String MSBCL1003 = "MSBCL1003";

	/** LEVEL[W]<br>投入品に不良品のロットが指定されています。<br>投入品：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBCL1004 = "MSBCL1004";

	/** LEVEL[W]<br>指図時にロット指定が必要な投入品ですが、サブロットＮＯが指定されていません。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1005 = "MSBCL1005";

	/** LEVEL[I]<br>指図時にロット指定が必要な投入品ですが、サブロットＮＯが指定されていないため、<br>製造状況を指図保存として登録しました。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1006 = "MSBCL1006";

	/** LEVEL[W]<br>外注製造指図が、発注訂正・取消不可となっているため、処理できません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1007 = "MSBCL1007";

	/** LEVEL[W]<br>外注製造指図が承認済みのため、処理できません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1008 = "MSBCL1008";

	/** LEVEL[W]<br>外注製造実績が登録済みのため、処理できません。<br>発注明細ＮＯ：{1}<br>製造指図ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBCL1009 = "MSBCL1009";

	/** LEVEL[W]<br>外注製造指図に未指図数量が残っているため、処理できません。<br>発注明細ＮＯ：{1}<br>製造指図ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBCL1010 = "MSBCL1010";

	/** LEVEL[W]<br>外注製造指図が分割されているため、処理できません。<br>発注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1011 = "MSBCL1011";

	/** LEVEL[W]<br>既に製造指図済の発注予定は、他の発注予定と同一の発注明細にまとめられません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1012 = "MSBCL1012";

	/** LEVEL[W]<br>再入荷予定に対応する外注製造指図が、発注訂正・取消不可となっているため、処理できません。<br>仕入実績明細ＮＯ:{1}<br>製造指図ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBCL1013 = "MSBCL1013";

	/** LEVEL[W]<br>再入荷予定に対応する外注製造指図が承認済みのため、処理できません。<br>仕入実績明細ＮＯ:{1}<br>製造指図ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBCL1014 = "MSBCL1014";

	/** LEVEL[W]<br>再入荷予定に対応する外注製造実績が登録済みのため、処理できません。<br>仕入実績明細ＮＯ:{1}<br>製造指図ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBCL1015 = "MSBCL1015";

	/** LEVEL[W]<br>外注製造指図が承認済みのため、打切できません。<br>入荷予定ＮＯ：{1}<br>製造指図ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBCL1016 = "MSBCL1016";

	/** LEVEL[W]<br>外注製造実績が登録済みのため、打切できません。<br>入荷予定ＮＯ：{1}<br>製造指図ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBCL1017 = "MSBCL1017";

	/** LEVEL[W]<br>同一製造指図の入荷予定の打切数量と製造指図数量が異なるため、入荷予定の打切はできません。<br>同一製造指図の入荷予定は同時に打切してください。<br>入荷予定ＮＯ：{1}<br>製造指図ＮＯ：{2}<br>打切対象の入荷予定の基準単位数量：{3}<br>打切対象の入荷予定の基準単位合計数量：{4}<br>製造指図数量：{5}<br>{6}<p>
	 */
	public static String MSBCL1018 = "MSBCL1018";

	/** LEVEL[W]<br>指定した製造指図ＮＯの製造指図が存在しません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1019 = "MSBCL1019";

	/** LEVEL[W]<br>製造指図ＮＯが指定されていないため、打切できません。<br>入荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1020 = "MSBCL1020";

	/** LEVEL[W]<br>既に製造着手されているため、製造指図承認の取消はできません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1021 = "MSBCL1021";

	/** LEVEL[W]<br>製造承認対象の製造指図ではないため、処理できません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1022 = "MSBCL1022";

	/** LEVEL[W]<br>入荷・仕入実績の登録前に外注製造実績の登録が必要な外注製造場所ですが、<br>外注製造実績が登録されていないため、処理できません。<br>{1}<p>
	 */
	public static String MSBCL1023 = "MSBCL1023";

	/** LEVEL[W]<br>外注製造指図が承認されていないため、処理できません。<br>{1}<p>
	 */
	public static String MSBCL1024 = "MSBCL1024";

	/** LEVEL[W]<br>外注製造実績が既に承認されているため、処理できません。<br>{1}<p>
	 */
	public static String MSBCL1025 = "MSBCL1025";

	/** LEVEL[W]<br>指図時にロット指定が必要な投入品ですが、ロットＮＯが指定されていません。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1026 = "MSBCL1026";

	/** LEVEL[I]<br>指図時にロット指定が必要な投入品ですが、ロットＮＯが指定されていないため、<br>製造状況を指図保存として登録しました。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1027 = "MSBCL1027";

	/** LEVEL[W]<br>引当可能な在庫・入庫予定が存在しないため、処理できません。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1028 = "MSBCL1028";

	/** LEVEL[I]<br>引当可能な在庫・入庫予定が存在しないため、製造状況を指図保存として登録しました。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1029 = "MSBCL1029";

	/** LEVEL[W]<br>ロットＮＯの混在が不可の投入品でロットが混在しているため、処理できません。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1030 = "MSBCL1030";

	/** LEVEL[W]<br>サブロットＮＯの混在が不可の投入品でサブロットが混在しているため、処理できません。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1031 = "MSBCL1031";

	/** LEVEL[W]<br>混在不可の代替グループ内で投入品が混在しているため、処理できません。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1032 = "MSBCL1032";

	/** LEVEL[W]<br>ＢＯＭマスタに存在しない投入品は追加できません。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1033 = "MSBCL1033";

	/** LEVEL[W]<br>指図対象の工程が１件もありません。対象の工程を選択してください。<br>{1}<p>
	 */
	public static String MSBCL1034 = "MSBCL1034";

	/** LEVEL[W]<br>品目禁止マスタにおいて、製造指図が禁止されている品目です。<br>品目：{1}<br>製造指図日：{2}<br>{3}<p>
	 */
	public static String MSBCL1035 = "MSBCL1035";

	/** LEVEL[W]<br>取引先禁止マスタにおいて、製造指図が禁止されている外注先です。<br>外注先ＣＤ：{1}<br>製造指図日：{2}<br>{3}<p>
	 */
	public static String MSBCL1036 = "MSBCL1036";

	/** LEVEL[W]<br>製造指図時にロットを発番する品目としてマスタ設定されていますが、ロットＮＯ、サブロットＮＯが発番できません。<br>{1}<p>
	 */
	public static String MSBCL1037 = "MSBCL1037";

	/** LEVEL[W]<br>製造指図承認日よりも過去の着手実績日が指定されています。<br>製造指図承認日：{1}<br>着手実績日:{2}<br>{3}<p>
	 */
	public static String MSBCL1038 = "MSBCL1038";

	/** LEVEL[W]<br>外注品の入荷・仕入に先行して製造実績登録することが、許可されていない製造場所です。<br>外注製造実績を先行して登録することを許可する場合は、場所マスタにて、外注製造場所の「外注実績先行」をオンにしてください。<br>{1}<p>
	 */
	public static String MSBCL1039 = "MSBCL1039";

	/** LEVEL[W]<br>既に発注済のため、発注明細に紐付く外注製造指図は取り消しできません。<br>発注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1040 = "MSBCL1040";

	/** LEVEL[W]<br>既に入荷実績または仕入実績が登録されているため、外注製造実績の取り消しはできません。<br>{1}<p>
	 */
	public static String MSBCL1041 = "MSBCL1041";

	/** LEVEL[W]<br>製造指図が承認されていないため、製造実績の登録はできません。<br>{1}<p>
	 */
	public static String MSBCL1042 = "MSBCL1042";

	/** LEVEL[W]<br>既に製造実績が承認されているため、製造実績の訂正・取り消しはできません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1043 = "MSBCL1043";

	/** LEVEL[W]<br>指定したロットの有効期限が投入予定日より古いため、処理できません。<br>有効期限：{1}<br>投入予定日：{2}<br>{3}<p>
	 */
	public static String MSBCL1044 = "MSBCL1044";

	/** LEVEL[W]<br>指定したロットの有効期限が投入実績日より古いため、処理できません。<br>有効期限：{1}<br>投入実績日：{2}<br>{3}<p>
	 */
	public static String MSBCL1045 = "MSBCL1045";

	/** LEVEL[I]<br>製造指図の登録後に品目工程マスタが変更されていますが、既に実績が登録されている工程のため、<br>再展開しませんでした。<br>工程ＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBCL1046 = "MSBCL1046";

	/** LEVEL[I]<br>製造指図の登録後にＢＯＭマスタが変更されていますが、既に実績が登録されている投入品のため、<br>ＢＯＭマスタの変更を反映しませんでした。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1047 = "MSBCL1047";

	/** LEVEL[I]<br>製造指図の登録後にＢＯＭマスタが変更されていますが、既に実績が登録されている副産品のため、<br>ＢＯＭマスタの変更を反映しませんでした。<br>副産品：{1}<br>{2}<p>
	 */
	public static String MSBCL1048 = "MSBCL1048";

	/** LEVEL[I]<br>製造指図の登録後に工程工数マスタが変更されていますが、既に実績が登録されている工数予定のため、<br>工程工数マスタの変更を反映しませんでした。<br>工数管理ＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBCL1049 = "MSBCL1049";

	/** LEVEL[W]<br>指図時に引当が必須の投入品のため、引当をオンにしてください。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1050 = "MSBCL1050";

	/** LEVEL[W]<br>外注品に対する発注が登録されていないため、製造実績は登録できません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1051 = "MSBCL1051";

	/** LEVEL[I]<br>ロット管理しない品目のため、ロットＮＯを発番しませんでした。<br>{1}<p>
	 */
	public static String MSBCL1052 = "MSBCL1052";

	/** LEVEL[I]<br>サブロット管理しない品目のため、サブロットＮＯを発番しませんでした。<br>{1}<p>
	 */
	public static String MSBCL1053 = "MSBCL1053";

	/** LEVEL[W]<br>製造実績を登録する場合、１件以上の工程実績を登録する必要があります。<br>製造指図ＮＯ：{1}<br>製造実績ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBCL1054 = "MSBCL1054";

	/** LEVEL[W]<br>前回改訂番号の製造指図から変更がないため、工程・ＢＯＭマスタ変更リスト発行はできません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1055 = "MSBCL1055";

	/** LEVEL[I]<br>既にロットＮＯが指定されているため、ロットＮＯを発番しませんでした。<br>{1}<p>
	 */
	public static String MSBCL1056 = "MSBCL1056";

	/** LEVEL[I]<br>既にサブロットＮＯが指定されているため、サブロットＮＯを発番しませんでした。<br>{1}<p>
	 */
	public static String MSBCL1057 = "MSBCL1057";

	/** LEVEL[W]<br>外注品に対する発注が承認されていないため、製造実績は登録できません。<br>発注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1058 = "MSBCL1058";

	/** LEVEL[I]<br>製造指図の承認依頼が登録されました。<br>件数：{1}<p>
	 */
	public static String MSBCL1059 = "MSBCL1059";

	/** LEVEL[I]<br>製造指図の承認依頼が取り消されました。<br>件数：{1}<p>
	 */
	public static String MSBCL1060 = "MSBCL1060";

	/** LEVEL[I]<br>製造指図が承認されました。<br>件数：{1}<p>
	 */
	public static String MSBCL1061 = "MSBCL1061";

	/** LEVEL[I]<br>製造指図の承認が取り消されました。<br>件数：{1}<p>
	 */
	public static String MSBCL1062 = "MSBCL1062";

	/** LEVEL[I]<br>製造実績の承認依頼が登録されました。<br>件数：{1}<p>
	 */
	public static String MSBCL1063 = "MSBCL1063";

	/** LEVEL[I]<br>製造実績の承認依頼が取り消されました。<br>件数：{1}<p>
	 */
	public static String MSBCL1064 = "MSBCL1064";

	/** LEVEL[I]<br>製造実績が承認されました。<br>件数：{1}<p>
	 */
	public static String MSBCL1065 = "MSBCL1065";

	/** LEVEL[I]<br>製造実績の承認が取り消されました。<br>件数：{1}<p>
	 */
	public static String MSBCL1066 = "MSBCL1066";

	/** LEVEL[W]<br>既に在庫締が行われているため、登録できません。<br>着手計上日：{1}<br>製造指図ＮＯ：{2}<br>製造実績ＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBCL1067 = "MSBCL1067";

	/** LEVEL[W]<br>既に在庫締が行われているため、登録できません。<br>終了計上日：{1}<br>製造指図ＮＯ：{2}<br>製造実績ＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBCL1068 = "MSBCL1068";

	/** LEVEL[W]<br>既に在庫締が行われているため、登録できません。<br>更新前の着手計上日：{1}<br>製造指図ＮＯ：{2}<br>製造実績ＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBCL1069 = "MSBCL1069";

	/** LEVEL[W]<br>既に在庫締が行われているため、登録できません。<br>更新前の終了計上日：{1}<br>製造指図ＮＯ：{2}<br>製造実績ＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBCL1070 = "MSBCL1070";

	/** LEVEL[W]<br>投入実績に対応する支給実績が登録されているため、投入場所・在庫着荷先・在庫識別区分は変更できません。<br>変更する場合は、投入実績を削除後に再度投入実績を登録してください。<br>更新前の投入場所ＣＤ：{1}<br>更新前の在庫着荷先ＣＤ：{2}<br>更新前の在庫識別区分：{3}<br>{4}<p>
	 */
	public static String MSBCL1071 = "MSBCL1071";

	/** LEVEL[W]<br>既に外注品に対する発注が登録されているため、発注数量以上の指図数量は指定できません。<br>発注数量：{1}<br>指定した指図数量：{2}<br>同一発注明細の他の製造指図数量：{3}<br>{4}<p>
	 */
	public static String MSBCL1072 = "MSBCL1072";

	/** LEVEL[W]<br>指図日よりも過去の承認日が指定されています。<br>指図日：{1}<br>承認日:{2}<br>{3}<p>
	 */
	public static String MSBCL1073 = "MSBCL1073";

	/** LEVEL[W]<br>完了実績日よりも過去の承認日が指定されています。<br>完了実績日：{1}<br>承認日:{2}<br>{3}<p>
	 */
	public static String MSBCL1074 = "MSBCL1074";

	/** LEVEL[W]<br>既に在庫締が行われているため、登録できません。<br>更新前の計上日：{1}<br>{2}<p>
	 */
	public static String MSBCL1075 = "MSBCL1075";

	/** LEVEL[W]<br>実績に対応する工程実績が更新対象となっていないため、処理できません。<br>対応する工程実績も更新対象としてください<br>{1}<p>
	 */
	public static String MSBCL1076 = "MSBCL1076";

	/** LEVEL[W]<br>使用可能な在庫・入庫予定が不足しているため、処理できません。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1077 = "MSBCL1077";

	/** LEVEL[I]<br>投入引当処理を開始します。<p>
	 */
	public static String MSBCL1078 = "MSBCL1078";

	/** LEVEL[I]<br>投入引当処理が終了しました。<br>処理対象の製造指図件数：{1}<br>全投入品の引当が成功した製造指図件数：{2}<br>一部でも引当が失敗した製造指図件数：{3}<p>
	 */
	public static String MSBCL1079 = "MSBCL1079";

	/** LEVEL[I]<br>バックフラッシュ処理を開始します。<p>
	 */
	public static String MSBCL1080 = "MSBCL1080";

	/** LEVEL[I]<br>バックフラッシュ処理が終了しました。<br>処理対象の工程実績件数：{1}<br>全投入品の登録が成功した工程実績件数：{2}<br>一部でも登録が失敗した工程実績件数：{3}<p>
	 */
	public static String MSBCL1081 = "MSBCL1081";

	/** LEVEL[W]<br>ワーキンググループＣＤが指定されていないため処理を行いませんでした。<p>
	 */
	public static String MSBCL1082 = "MSBCL1082";

	/** LEVEL[I]<br>引当できなかった投入品が存在します。<br>引当対象の投入品の件数：{1}<br>引当が成功した件数：{2}<br>引当が失敗した件数：{3}<br>{4}<p>
	 */
	public static String MSBCL1083 = "MSBCL1083";

	/** LEVEL[W]<br>出来高計上の有無が変わるような出来高区分・出来高理由の変更はできません。<br>変更する場合は、出来高実績を削除後に再度出来高実績を登録してください。<br>出来高実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1084 = "MSBCL1084";

	/** LEVEL[I]<br>実績登録できなかった投入品が存在します。<br>実績登録対象の投入品の件数：{1}<br>実績登録が成功した投入品の件数：{2}<br>実績登録が失敗した投入品の件数：{3}<br>{4}<p>
	 */
	public static String MSBCL1085 = "MSBCL1085";

	/** LEVEL[W]<br>製造指図の状況が指図保存のため、実績の登録ができません。<br>先に製造指図を指図済にしてください。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1086 = "MSBCL1086";

	/** LEVEL[W]<br>既に製造指図が打切済のため、処理できません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1087 = "MSBCL1087";

	/** LEVEL[W]<br>出来高実績が登録されていないため、工程実績の終了実績日は指定できません。<br>製造指図ＮＯ：{1}<br>工程指図ＮＯ：{2}<br>出来高予定ＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBCL1088 = "MSBCL1088";

	/** LEVEL[W]<br>副産品実績が登録されていないため、工程実績の終了実績日は指定できません。<br>製造指図ＮＯ：{1}<br>工程指図ＮＯ：{2}<br>出来高予定ＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBCL1089 = "MSBCL1089";

	/** LEVEL[W]<br>発注数量と再入荷予定数量の合計以上の指図数量は指定できません。<br>発注数量：{1}<br>再入荷予定数量：{2}<br>指定した指図数量：{3}<br>同一発注明細の他の製造指図数量：{4}<br>{5}<p>
	 */
	public static String MSBCL1090 = "MSBCL1090";

	/** LEVEL[W]<br>再入荷予定に紐付く製造指図は取り消しできません。<br>製造指図ＮＯ：{1}<br>入荷予定ＮＯ：{2}<br><p>
	 */
	public static String MSBCL1091 = "MSBCL1091";

	/** LEVEL[W]<br>再入荷予定に対応する外注製造指図が分割済みのため、処理できません。<br>仕入実績明細ＮＯ:{1}<br>製造指図ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBCL1092 = "MSBCL1092";

	/** LEVEL[W]<br>製造指図ＮＯが指定されていないため、処理できません。<br>仕入実績明細ＮＯ:{1}<br>{2}<p>
	 */
	public static String MSBCL1093 = "MSBCL1093";

	/** LEVEL[W]<br>製造実績を完了する場合、全ての工程実績に対して終了実績日を指定し、未完了フラグをオフにしてください。<br>製造指図ＮＯ:{1}<br>{2}<p>
	 */
	public static String MSBCL1094 = "MSBCL1094";

	/** LEVEL[W]<br>製造指図の状況が指図保存のため、製造指図書発行はできません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1095 = "MSBCL1095";

	/** LEVEL[W]<br>製造実績が完了していないため、製造記録書発行はできません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1096 = "MSBCL1096";

	/** LEVEL[W]<br>工程実績が完了しているため、出来高実績を削除できません。<br>出来高実績を削除する場合は、工程実績の終了実績日をクリアするか、未完了フラグをオンにしてください。<br>製造指図ＮＯ：{1}<br>工程実績ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBCL1097 = "MSBCL1097";

	/** LEVEL[W]<br>工程実績が完了しているため、副産品実績を削除できません。<br>副産品実績を削除する場合は、工程実績の終了実績日をクリアするか、未完了フラグをオンにしてください。<br>製造指図ＮＯ：{1}<br>工程実績ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBCL1098 = "MSBCL1098";

	/** LEVEL[I]<br>使用可能な在庫が不足しているため、投入実績を登録しませんでした。<br>投入品：{1}<br>製造指図ＮＯ：{2}<br>製造実績ＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBCL1099 = "MSBCL1099";

	/** LEVEL[I]<br>使用可能な在庫または投入場所への入庫予定が不足しているため、投入実績を登録しませんでした。<br>マイナス在庫を許可する投入品であっても、投入実績を登録するためには使用可能な入庫予定が存在する必要があります。<br>投入品：{1}<br>製造指図ＮＯ：{2}<br>製造実績ＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBCL1100 = "MSBCL1100";

	/** LEVEL[W]<br>計画外製造指図の場合、未指図打切はできません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1101 = "MSBCL1101";

	/** LEVEL[W]<br>製造指図が打切済のため、製造指図書発行はできません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1102 = "MSBCL1102";

	/** LEVEL[W]<br>取消済の製造指図の訂正はできません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1103 = "MSBCL1103";

	/** LEVEL[W]<br>指定された工数予定ＮＯ、分割連番に対応する工数予定が存在しません。<br>工数予定ＮＯ：{1}<br>分割連番：{2}<br>{3}<p>
	 */
	public static String MSBCL1104 = "MSBCL1104";

	/** LEVEL[W]<br>ロット情報と異なる版ＮＯは指定できません。<br>品目：{1}<br>指定した版ＮＯ：{2}<br>ロット情報の版ＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBCL1105 = "MSBCL1105";

	/** LEVEL[W]<br>受注紐付きの外注製造指図の場合、手配ＮＯは変更できません。<br>受注明細ＮＯ：{1}<br>変更前の値<br>{2}：{3}<br>{4}<p>
	 */
	public static String MSBCL1106 = "MSBCL1106";

	/** LEVEL[I]<br>バックフラッシュでロット提案を実施しましたが、他の投入実績とロットが混在してしまうため、<br>投入実績を登録しませんでした。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1107 = "MSBCL1107";

	/** LEVEL[I]<br>バックフラッシュでロット提案を実施しましたが、他の投入実績とサブロットが混在してしまうため、<br>投入実績を登録しませんでした。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1108 = "MSBCL1108";

	/** LEVEL[W]<br>工程単位製造指図の場合、最初に登録した製造指図を取り消すためには、<br>後で登録した製造指図がすべて取り消されている必要があります。<br>同じ品目製造指図ＮＯに紐付く他の製造指図を先に取り消してください。<br>製造指図ＮＯ：{1}<br>品目製造指図ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBCL1109 = "MSBCL1109";

	/** LEVEL[I]<br>バックフラッシュで使用する出来高実績が登録されていないため、投入実績を登録しませんでした。<br>出来高を元にバックフラッシュする場合は、数量が0より大きい出来高実績を事前に登録する必要があります。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1110 = "MSBCL1110";

	/** LEVEL[I]<br>バックフラッシュで使用する工程実績が登録されていないため、投入実績を登録しませんでした。<br>工程実績を元にバックフラッシュする場合は、数量が0より大きく、終了日が指定された工程実績を<br>事前に登録する必要があります。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1111 = "MSBCL1111";

	/** LEVEL[W]<br>投入制御区分が「3:ＭＲＰ対象外（指図書のみ）」の投入品は引当できません。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1112 = "MSBCL1112";

	/** LEVEL[W]<br>仕入直送の外注製造指図の場合、製造指図数量は変更できません。<br>製造指図ＮＯ：{1}<br>変更前数量：{2}<br>{3}<p>
	 */
	public static String MSBCL1113 = "MSBCL1113";

	/** LEVEL[W]<br>仕入直送の外注製造指図の場合、格納先場所は変更できません。<br>製造指図ＮＯ：{1}<br>変更前格納先場所：{2}<br>{3}<p>
	 */
	public static String MSBCL1114 = "MSBCL1114";

	/** LEVEL[W]<br>同じ工程、代替グループ、代替グループ連番に代替品目指定がオンの品目が存在する場合、<br>代替品目指定がオフの品目の引当フラグをオンにすることはできません。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1115 = "MSBCL1115";

	/** LEVEL[W]<br>同じ工程、代替グループ、代替グループ連番に代替品目指定がオンの品目が存在する場合、<br>代替品目指定がオフの品目の投入数量、必要数量、固定必要数量はすべて0にしてください。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1116 = "MSBCL1116";

	/** LEVEL[W]<br>必要数量と固定必要数量の何れか一方に、0より大きい数値を入力してください。<br>{1}<p>
	 */
	public static String MSBCL1117 = "MSBCL1117";

	/** LEVEL[W]<br>工数（数量依存）と工数（固定）の何れか一方に、0より大きい数値を入力してください。<br>{1}<p>
	 */
	public static String MSBCL1118 = "MSBCL1118";

	/** LEVEL[W]<br>自給品は引当できません。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1119 = "MSBCL1119";

	/** LEVEL[I]<br>ロットＮＯが自動発番できなかったため、製造状況を指図保存に変更しました。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBCL1120 = "MSBCL1120";

	/** LEVEL[I]<br>サブロットＮＯが自動発番できなかったため、製造状況を指図保存に変更しました。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBCL1121 = "MSBCL1121";

	/** LEVEL[W]<br>未指図打切済のため、製造指図の取り消しはできません。<br>先に未指図打切をオフに訂正してください。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1122 = "MSBCL1122";

	/** LEVEL[W]<br>残数打切済のため、製造実績の取り消しはできません。<br>先に残数打切をオフに訂正してください。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1123 = "MSBCL1123";

	/** LEVEL[W]<br>既に製造指図が承認されているため、製造指図の訂正・取り消しはできません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1124 = "MSBCL1124";

	/** LEVEL[W]<br>既に製造実績が登録されているため、製造指図の取り消しはできません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1125 = "MSBCL1125";

	/** LEVEL[W]<br>製造実績が完了しているため、工程実績は削除できません。<br>製造指図ＮＯ：{1}<br>工程実績ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBCL1126 = "MSBCL1126";

	/** LEVEL[W]<br>既に実績登録済みのため、削除できません。<br>{1}：{2}<br>{3}<p>
	 */
	public static String MSBCL1127 = "MSBCL1127";

	/** LEVEL[W]<br>出来高予定が１件も存在しないため、処理できません。<br>{1}<p>
	 */
	public static String MSBCL1128 = "MSBCL1128";

	/** LEVEL[W]<br>工程単位製造指図の場合、最初に登録した製造指図以外は未指図打切をオンにできません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1129 = "MSBCL1129";

	/** LEVEL[W]<br>指定した製造指図ＮＯのデータが存在しません。<br>{1}<p>
	 */
	public static String MSBCL1130 = "MSBCL1130";

	/** LEVEL[W]<br>ロットＮＯを自動発番できませんでした。<br>品目ＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBCL1131 = "MSBCL1131";

	/** LEVEL[W]<br>サブロットＮＯを自動発番できませんでした。<br>品目ＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBCL1132 = "MSBCL1132";

	/** LEVEL[W]<br>使用可能な在庫または投入場所への入庫予定が不足しているため、処理できません。<br>マイナス在庫を許可する投入品であっても、投入実績を登録するためには使用可能な入庫予定が存在する必要があります。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1133 = "MSBCL1133";

	/** LEVEL[W]<br>打切がオフの場合、投入数量、ロス数量、固定ロス数量の何れか一つに0より大きい数値を入力してください。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1134 = "MSBCL1134";

	/** LEVEL[W]<br>打切がオフの場合、工数には0より大きい数値を入力してください。<br>工数：{1}<br>{2}<p>
	 */
	public static String MSBCL1135 = "MSBCL1135";

	/** LEVEL[W]<br>工数実績一覧登録画面で工数実績が追加されているため、取消できません。<br>追加した工数実績を先に取り消してください。<br>製造実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1136 = "MSBCL1136";

	/** LEVEL[W]<br>在庫識別区分が「9.自給」の投入品は追加できません。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1137 = "MSBCL1137";

	/** LEVEL[W]<br>終了時刻は{1}から{2}までの時刻でなければなりません。<br>日付をまたいだ工数実績を登録する場合は、日付ごとに行を分けて登録する必要があります。<br>{3}<p>
	 */
	public static String MSBCL1138 = "MSBCL1138";

	/** LEVEL[I]<br>子品目に有償支給品を含む外注に対して内税の税ＣＤが指定されているため、単価を計算できませんでした。<br>品目：{1}<br>発注先：{2}<br>税：{3}<br>{4}<p>
	 */
	public static String MSBCL1139 = "MSBCL1139";

	/** LEVEL[W]<br>ＩＦ送信済のため更新できません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1201 = "MSBCL1201";

	/** LEVEL[I]<br>工程実績完了処理を開始します。<p>
	 */
	public static String MSBCL1202 = "MSBCL1202";

	/** LEVEL[I]<br>工程実績完了処理が終了しました。 <br>処理対象の工程実績件数：{1} <br>処理が成功した工程実績件数：{2} <br>処理が失敗した工程実績件数：{3}<p>
	 */
	public static String MSBCL1203 = "MSBCL1203";

	/** LEVEL[W]<br>着手数量には製造残数量以下の値を入力してください。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1204 = "MSBCL1204";

	/** LEVEL[W]<br>投入品の締チェックで以下のエラーが発生しました。<br>製造実績ＮＯ：{1}<br>投入品目：{2}<p>
	 */
	public static String MSBCL1205 = "MSBCL1205";

	/** LEVEL[W]<br>オーダ区分が「1.製造」の品目オーダに対する格納場所には、外注場所を指定できません。<br>{1}<p>
	 */
	public static String MSBCL1206 = "MSBCL1206";

	/** LEVEL[W]<br>同一製造指図の入荷予定の打切解除数量と製造指図数量が異なるため、入荷予定の打切解除はできません。<br>同一製造指図の入荷予定は同時に打切解除してください。<br>入荷予定ＮＯ：{1}<br>製造指図ＮＯ：{2}<br>打切解除対象の入荷予定の基準単位数量：{3}<br>打切解除対象の入荷予定の基準単位合計数量：{4}<br>製造指図数量：{5}<br>{6}<p>
	 */
	public static String MSBCL1207 = "MSBCL1207";

	/** LEVEL[W]<br>オーダ区分が「1.製造」の品目オーダに対する製造場所には、社外場所を指定できません。<br>{1}<p>
	 */
	public static String MSBCL1208 = "MSBCL1208";

	/** LEVEL[W]<br>オーダ区分が「3.外注」の品目オーダに対する製造場所には、社内場所を指定できません。<br>{1}<p>
	 */
	public static String MSBCL1209 = "MSBCL1209";

	/** LEVEL[W]<br>オーダ区分が「4.移送」の品目オーダには、製造場所または発注先は指定できません。<br>{1}<p>
	 */
	public static String MSBCL1210 = "MSBCL1210";

	/** LEVEL[W]<br>同じ工程、工程連番の同一子品目のレコードでロット混在もしくはサブロット混在を異なる設定にできません。<br>投入品：{1}<br>{2}<p>
	 */
	public static String MSBCL1211 = "MSBCL1211";

	/** LEVEL[W]<br>製造指図承認日よりも過去の実績日が指定されています。<br>製造指図承認日：{1}<br>実績日:{2}<br>{3}<p>
	 */
	public static String MSBCL1212 = "MSBCL1212";

	/** LEVEL[I]<br>同一製造指図に紐づく工程のうち、一部工程のみ製造指図することはできないため、<br>製造状況を指図保存として登録しました。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1213 = "MSBCL1213";

	/** LEVEL[W]<br>実績が登録済みの工程指図に対して、出来高計上工程フラグが変更されるような訂正はできません。<br>先に工程実績を取り消してください。<br>工程指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1214 = "MSBCL1214";

	/** LEVEL[W]<br>削除対象の工程に紐づく出来高予定があります。<br>再検索後、工程を手動で削除してください。<br>工程指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1215 = "MSBCL1215";

	/** LEVEL[W]<br>製造状況区分には、着手中あるいは完了を指定してください。<br>{1}<p>
	 */
	public static String MSBCL1301 = "MSBCL1301";

	/** LEVEL[W]<br>計画外実績として製造承認対象の品目は登録できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBCL1302 = "MSBCL1302";

	/** LEVEL[W]<br>計画外実績として製造品以外は指定できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBCL1303 = "MSBCL1303";

	/** LEVEL[W]<br>計画外実績としてロットＮＯ発番パタンが子品目ロット引継ぎの品目は登録できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBCL1304 = "MSBCL1304";

	/** LEVEL[W]<br>計画外実績として外注品は指定できません。<br>品目：{1}<br>製造場所：{2}<br>{3}<p>
	 */
	public static String MSBCL1305 = "MSBCL1305";

	/** LEVEL[W]<br>製造場所と格納場所のワーキンググループが異なるため登録できません。<br>製造場所：{1}<br>製造場所ワーキンググループＣＤ：{2}<br>格納場所：{3}<br>格納場所ワーキンググループＣＤ：{4}<br>{5}<p>
	 */
	public static String MSBCL1306 = "MSBCL1306";

	/** LEVEL[W]<br>工程が削除されています。品目工程マスタに登録されているすべての工程を登録する必要があります。<br>品目：{1}<br>工程パタン：{2}<br>場所：{3}<p>
	 */
	public static String MSBCL1308 = "MSBCL1308";

	/** LEVEL[W]<br>工程ＣＤが品目工程マスタに登録されていません。<br>品目：{1}<br>工程パタン：{2}<br>場所：{3}<p>
	 */
	public static String MSBCL1309 = "MSBCL1309";

	/** LEVEL[I]<br>発注予定日が運用日付よりも過去日であるオーダが確定されました。<br>品目オーダＮＯ：{1}<br>発注予定日：{2}<br>運用日付：{3}<p>
	 */
	public static String MSBCL1310 = "MSBCL1310";

	/** LEVEL[W]<br>ロットＮＯまたはサブロットＮＯを自動発番できませんでした。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBCL1311 = "MSBCL1311";

	/** LEVEL[W]<br>既に納入指示または納期回答受領が登録されているため、発注明細に紐付く外注製造指図は取り消しできません。<br>発注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBCL1312 = "MSBCL1312";

	/** LEVEL[W]<br>納入指示の合計数量よりも少ない指図数量は指定できません。<br>納入指示数量合計（基準単位）：{1}<br>指定した指図数量：{2}<br>発注明細ＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBCL1313 = "MSBCL1313";

	/** LEVEL[W]<br>納期回答受領の合計数量よりも少ない指図数量は指定できません。<br>回答数量合計（基準単位）：{1}<br>指定した指図数量：{2}<br>発注明細ＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBCL1314 = "MSBCL1314";

	/** LEVEL[W]<br>オーダ受信されたオーダのため、オーダ確認画面では更新できません。<br>更新する場合は、オーダ登録画面で行ってください。<br>品目オーダＮＯ：{1}<p>
	 */
	public static String MSBCL1315 = "MSBCL1315";

	/** LEVEL[W]<br>場所マスタに有効な場所として登録されていません。<br>指図時の投入場所ＣＤ：{1}<br>投入予定ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBCL1316 = "MSBCL1316";

	/** LEVEL[W]<br>場所マスタに有効な場所として登録されていません。<br>指図時の格納場所ＣＤ：{1}<br>出来高予定ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBCL1317 = "MSBCL1317";

	/** LEVEL[W]<br>ロットＮＯの混在が不可の投入品でロットが混在しているため、処理できません。<br>製造実績ＮＯ：{1}<br>投入予定ＮＯ：{2}<br>投入品：{3}<br>{4}<p>
	 */
	public static String MSBCL1318 = "MSBCL1318";

	/** LEVEL[W]<br>サブロットＮＯの混在が不可の投入品でサブロットが混在しているため、処理できません。<br>製造実績ＮＯ：{1}<br>投入予定ＮＯ：{2}<br>投入品：{3}<br>{4}<p>
	 */
	public static String MSBCL1319 = "MSBCL1319";

	/** LEVEL[W]<br>混在不可の代替グループ内で投入品が混在しているため、処理できません。<br>製造実績ＮＯ：{1}<br>投入予定ＮＯ：{2}<br>投入品：{3}<br>{4}<p>
	 */
	public static String MSBCL1320 = "MSBCL1320";

	/** LEVEL[W]<br>エラーにより、すべてのデータの更新処理が失敗しました。<p>
	 */
	public static String MSBCL1321 = "MSBCL1321";

	/** LEVEL[W]<br>スケジューラ凍結対象のオーダのため、更新できません。<br>品目オーダＮＯ：{1}<p>
	 */
	public static String MSBCL1401 = "MSBCL1401";

	/** LEVEL[W]<br>スケジューラ凍結対象のオーダのため、ファイル取込できません。<br>品目オーダＮＯ：{1}<p>
	 */
	public static String MSBCL1402 = "MSBCL1402";

	/** LEVEL[W]<br>指定した品目オーダＮＯの品目オーダ情報が存在しません。<br>品目オーダＮＯ：{1}<p>
	 */
	public static String MSBCL1403 = "MSBCL1403";

	/** LEVEL[W]<br>ファイルを保存することができませんでした。<br>{1}<p>
	 */
	public static String MSBCL1404 = "MSBCL1404";

	/** LEVEL[W]<br>下請法対象取引先の発注先に対する納入希望日は、仕入予定日と同日である必要があります。<br>{1}<p>
	 */
	public static String MSBDP0001 = "MSBDP0001";

	/** LEVEL[W]<br>基準単位数量から数量を換算できない単位です。<p>
	 */
	public static String MSBDP0003 = "MSBDP0003";

	/** LEVEL[W]<br>発注ヘッダ情報が異なる明細が選択されているため、遷移できません。<p>
	 */
	public static String MSBDP0004 = "MSBDP0004";

	/** LEVEL[I]<br>単価が変更されました。<br>項目名：{1}<br>変更前単価：{2}<br>最新単価：{3}<br>{4}<p>
	 */
	public static String MSBDP0005 = "MSBDP0005";

	/** LEVEL[I]<br>納入場所の場所グループ（ワーキンググループ）が変更されました。<br>処理を続行しますか？<br>変更前ワーキンググループ：{1}<br>変更後ワーキンググループ：{2}<br>{3}<p>
	 */
	public static String MSBDP0006 = "MSBDP0006";

	/** LEVEL[W]<br>以下の項目が他行と異なるため、まとめることができません。<br>{1}<br>{2}<p>
	 */
	public static String MSBDP0007 = "MSBDP0007";

	/** LEVEL[W]<br>単価取得対象が存在しません。<p>
	 */
	public static String MSBDP0008 = "MSBDP0008";

	/** LEVEL[W]<br>製造指図済の明細をまとめることはできません。<br>{1}<p>
	 */
	public static String MSBDP0009 = "MSBDP0009";

	/** LEVEL[I]<br>繰越処理を実行します。よろしいですか？<p>
	 */
	public static String MSBDP0010 = "MSBDP0010";

	/** LEVEL[W]<br>検査不合格の在庫を検収しようとしています。<br>{1}<p>
	 */
	public static String MSBDP0011 = "MSBDP0011";

	/** LEVEL[W]<br>外注品の明細が含まれているため、参照登録はできません。<p>
	 */
	public static String MSBDP0012 = "MSBDP0012";

	/** LEVEL[I]<br>単価再取得対象がありません。<p>
	 */
	public static String MSBDP0013 = "MSBDP0013";

	/** LEVEL[W]<br>単価再取得処理を実行します。よろしいですか？<p>
	 */
	public static String MSBDP0014 = "MSBDP0014";

	/** LEVEL[I]<br>依頼元の情報を反映します（納入場所、棚・ライン、納品先情報、配送先情報）。よろしいですか？<p>
	 */
	public static String MSBDP0015 = "MSBDP0015";

	/** LEVEL[I]<br>予定日・マスタ取得処理を実行します。よろしいですか？<p>
	 */
	public static String MSBDP0016 = "MSBDP0016";

	/** LEVEL[I]<br>対象の明細をまとめます。よろしいですか？<p>
	 */
	public static String MSBDP0017 = "MSBDP0017";

	/** LEVEL[I]<br>納入場所の場所グループ（物流グループ）が変更されました。<br>処理を続行しますか？<br>変更前物流グループ：{1}<br>変更後物流グループ：{2}<br>{3}<p>
	 */
	public static String MSBDP0018 = "MSBDP0018";

	/** LEVEL[I]<br>納入場所の場所グループ（製造場所グループ）が変更されました。<br>処理を続行しますか？<br>変更前製造場所グループ：{1}<br>変更後製造場所グループ：{2}<br>{3}<p>
	 */
	public static String MSBDP0019 = "MSBDP0019";

	/** LEVEL[W]<br>まとめ対象がありません。2件以上の明細を選択してください。<p>
	 */
	public static String MSBDP0020 = "MSBDP0020";

	/** LEVEL[W]<br>入荷実績あるいは仕入実績が登録済みの明細をまとめることはできません。<br>{1}<p>
	 */
	public static String MSBDP0021 = "MSBDP0021";

	/** LEVEL[W]<br>購買識別区分が無償受給、ＶＭＩ以外の入荷実績のため引継できません。<p>
	 */
	public static String MSBDP0022 = "MSBDP0022";

	/** LEVEL[I]<br>単価取得処理を実行します。よろしいですか？<p>
	 */
	public static String MSBDP0023 = "MSBDP0023";

	/** LEVEL[I]<br>単価取得処理を実行しました。<p>
	 */
	public static String MSBDP0024 = "MSBDP0024";

	/** LEVEL[I]<br>為替レート取得処理を実行します。よろしいですか？<p>
	 */
	public static String MSBDP0025 = "MSBDP0025";

	/** LEVEL[I]<br>為替レート取得処理を実行しました。<p>
	 */
	public static String MSBDP0026 = "MSBDP0026";

	/** LEVEL[W]<br>基準通貨以外の行が選択されていません。<p>
	 */
	public static String MSBDP0027 = "MSBDP0027";

	/** LEVEL[I]<br>税取得処理を実行します。よろしいですか？<p>
	 */
	public static String MSBDP0028 = "MSBDP0028";

	/** LEVEL[I]<br>税取得処理を実行しました。<p>
	 */
	public static String MSBDP0029 = "MSBDP0029";

	/** LEVEL[W]<br>計画外の登録では下請対象の発注先は指定できません。<br>発注先：{1}<p>
	 */
	public static String MSBDP0030 = "MSBDP0030";

	/** LEVEL[W]<br>仕入実績登録画面ではインボイス取引対象の発注先は指定できません。<br>発注先：{1}<p>
	 */
	public static String MSBDP0031 = "MSBDP0031";

	/** LEVEL[W]<br>明細に対応する詳細行の納入場所のＷＧ、または物流倉庫ＣＤが全行で一致していません。<br>{1}<p>
	 */
	public static String MSBDP0032 = "MSBDP0032";

	/** LEVEL[W]<br>売上返品登録により登録されている仕入返品実績の為、訂正または取消できません。<p>
	 */
	public static String MSBDP0033 = "MSBDP0033";

	/** LEVEL[W]<br>手配依頼の明細が含まれているため、参照登録はできません。<p>
	 */
	public static String MSBDP0034 = "MSBDP0034";

	/** LEVEL[W]<br>値引品目の明細をまとめることはできません。<br>{1}<p>
	 */
	public static String MSBDP0035 = "MSBDP0035";

	/** LEVEL[I]<br>単価が変更されました。金額が負の値になったため、値引額と値引理由をクリアしました。<br>値引額と値引理由を再入力してください。<br>変更前値引額：{1}<br>変更前値引理由：{2}<br>変更前値引理由名：{3}<br>{4}<p>
	 */
	public static String MSBDP0036 = "MSBDP0036";

	/** LEVEL[I]<br>検査が完了されていませんが、仕入実績を登録しますか？<br>{1}<p>
	 */
	public static String MSBDP0037 = "MSBDP0037";

	/** LEVEL[W]<br>検索モードに「ヘッダ」を指定してください。<p>
	 */
	public static String MSBDP0100 = "MSBDP0100";

	/** LEVEL[W]<br>操作種別に「帳票発行」を指定する、または、操作種別に「返品実績を参照する」を指定し、検索モードに「ヘッダ」を指定してください。<p>
	 */
	public static String MSBDP0101 = "MSBDP0101";

	/** LEVEL[W]<br>打切り可能な予定が存在しません。<br>{1}<p>
	 */
	public static String MSBDL0001 = "MSBDL0001";

	/** LEVEL[W]<br>仕入対象外の仕入予定に対して仕入実績を計上できません。<br>{1}<p>
	 */
	public static String MSBDL0002 = "MSBDL0002";

	/** LEVEL[W]<br>発注訂正理由に登録されていません。<br>{1}<p>
	 */
	public static String MSBDL0003 = "MSBDL0003";

	/** LEVEL[W]<br>対応する発注情報明細が見つかりません。<br>発注ＮＯ：{1}<p>
	 */
	public static String MSBDL0004 = "MSBDL0004";

	/** LEVEL[W]<br>在庫識別区分には「自社在庫」、「ＶＭＩ」、「検収不良」、「無償受給」、「有償支給」のいずれかを指定してください。<br>在庫識別区分：{1}<br>{2}<p>
	 */
	public static String MSBDL0005 = "MSBDL0005";

	/** LEVEL[W]<br>在庫識別区分に「有償支給」を指定する場合は、返品元場所には外注場所を指定してください。<br>返品元場所ＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBDL0006 = "MSBDL0006";

	/** LEVEL[W]<br>返品対象に自社資産在庫が含まれる場合、通貨を指定してください。<p>
	 */
	public static String MSBDL0007 = "MSBDL0007";

	/** LEVEL[W]<br>ＶＭＩ品の買掛計上処理で、税ＣＤが取得できませんでした。マスタ設定を確認してください。<br>品目：{1}<br>適用日：{2}<p>
	 */
	public static String MSBDL0008 = "MSBDL0008";

	/** LEVEL[W]<br>ＶＭＩ品の買掛計上処理で、為替レートが取得できませんでした。マスタ設定を確認してください。<br>換算元通貨：{1}<br>換算先通貨：{2}<br>適用日：{3}<p>
	 */
	public static String MSBDL0009 = "MSBDL0009";

	/** LEVEL[W]<br>ＶＭＩ品の買掛計上処理で、単価が取得できませんでした。マスタ設定を確認してください。<br>品目：{1}<br>発注先：{2}<br>メーカ：{3}<br>単位：{4}<br>通貨：{5}<br>ＷＧ：{6}<br>適用日：{7}<p>
	 */
	public static String MSBDL0010 = "MSBDL0010";

	/** LEVEL[W]<br>分割されていないため、登録できません。<p>
	 */
	public static String MSBDL0011 = "MSBDL0011";

	/** LEVEL[W]<br>仕入直送は分割できません。<br>発注予定ＮＯ：{1}<p>
	 */
	public static String MSBDL0012 = "MSBDL0012";

	/** LEVEL[W]<br>値引品目は分割できません。<p>
	 */
	public static String MSBDL0013 = "MSBDL0013";

	/** LEVEL[I]<br>発注が承認されていないため、注文書は発行できません。<br>発注ＮＯ：{1}<br>承認ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBDL0014 = "MSBDL0014";

	/** LEVEL[W]<br>発注が承認されていないため、納入指示書は発行できません。<br>発注ＮＯ：{1}<br>納入指示ＮＯ：{2}<br>承認ＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBDL0015 = "MSBDL0015";

	/** LEVEL[I]<br>発注が承認されていないため、納品書は発行できません。<br>発注ＮＯ：{1}<br>承認ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBDL0016 = "MSBDL0016";

	/** LEVEL[W]<br>既に仕入返品実績が登録されているため、仕入返品予定は取消できません。<br>仕入返品予定ＮＯ：{1}<br>仕入返品実績ＮＯ：{2}<p>
	 */
	public static String MSBDL0017 = "MSBDL0017";

	/** LEVEL[W]<br>未引当の在庫が存在しません。引当済みの在庫は使用できません。<br>品目：{1}<br>場所：{2}<br>棚・ライン：{3}<br>ロットＮＯ：{4}<br>サブロットＮＯ：{5}<br>手配ＮＯ：{6}<br>荷姿単位：{7}<br>格付：{8}<br>良品区分：{9}<br>在庫識別区分：{10}<br>在庫取引先：{11}<br>在庫着荷先：{12}<p>
	 */
	public static String MSBDL0018 = "MSBDL0018";

	/** LEVEL[W]<br>詳細の値が明細の値と異なります。明細に値が設定されている場合は、詳細にも同じ値を指定して下さい。<br>項目名：{1}<br>{2}<p>
	 */
	public static String MSBDL0019 = "MSBDL0019";

	/** LEVEL[I]<br>購買内示情報登録処理が開始しました。<p>
	 */
	public static String MSBDL0020 = "MSBDL0020";

	/** LEVEL[I]<br>購買内示情報登録処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<p>
	 */
	public static String MSBDL0021 = "MSBDL0021";

	/** LEVEL[W]<br>購買内示情報登録処理にエラーが発生したため、購買内示情報は登録できませんでした。<br>内示日：{1}<br>発注先ＣＤ：{2}<br>ワーキンググループ：{3}<p>
	 */
	public static String MSBDL0022 = "MSBDL0022";

	/** LEVEL[W]<br>帳票発行済のため削除できません。取消帳票を発行後に削除してください。<br>内示日：{1}<br>発注先ＣＤ：{2}<br>ワーキンググループ：{3}<p>
	 */
	public static String MSBDL0023 = "MSBDL0023";

	/** LEVEL[I]<br>購買内示情報削除処理が開始しました。<p>
	 */
	public static String MSBDL0024 = "MSBDL0024";

	/** LEVEL[I]<br>購買内示情報削除処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<p>
	 */
	public static String MSBDL0025 = "MSBDL0025";

	/** LEVEL[W]<br>購買内示情報削除処理にエラーが発生したため、購買内示情報は削除できませんでした。<br>内示日：{1}<br>発注先ＣＤ：{2}<br>ワーキンググループ：{3}<p>
	 */
	public static String MSBDL0026 = "MSBDL0026";

	/** LEVEL[W]<br>分割先の明細が既に分割されているため、取消できません。<br>発注予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0027 = "MSBDL0027";

	/** LEVEL[W]<br>仕入・入荷禁止の発注先のため、仕入実績は登録できません。<br>発注先：{1}<br>{2}<p>
	 */
	public static String MSBDL0028 = "MSBDL0028";

	/** LEVEL[W]<br>仕入・入荷禁止の品目のため、仕入実績は登録できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBDL0029 = "MSBDL0029";

	/** LEVEL[W]<br>受領インボイス登録されている仕入予定に対する仕入実績は、受領インボイス単位で登録・訂正してください。<br>受領インボイス管理ＮＯ：{1}<p>
	 */
	public static String MSBDL0030 = "MSBDL0030";

	/** LEVEL[W]<br>受領インボイス登録されている仕入予定に対する仕入実績は、受領インボイス単位で削除してください。<br>受領インボイス管理ＮＯ：{1}<p>
	 */
	public static String MSBDL0031 = "MSBDL0031";

	/** LEVEL[W]<br>未入荷で仕入のみを登録、または訂正する場合、仕入予定を打切ることはできません。<br>仕入予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0032 = "MSBDL0032";

	/** LEVEL[W]<br>予定に対して既に入荷実績が存在する為、仕入実績のみを登録することはできません。<br>{1}<p>
	 */
	public static String MSBDL0033 = "MSBDL0033";

	/** LEVEL[W]<br>既に入荷実績が登録されているため、入荷実績を新規登録することはできません。<br>{1}<p>
	 */
	public static String MSBDL0034 = "MSBDL0034";

	/** LEVEL[W]<br>入荷後に仕入を行う場合、入荷数量より多くの仕入数量を登録することはできません。<br>入荷実績ＮＯ：{1}<br>入荷数量（基準単位）：{2}<br>仕入数量（基準単位）：{3}<br>{4}<p>
	 */
	public static String MSBDL0035 = "MSBDL0035";

	/** LEVEL[W]<br>対応する入荷実績の登録件数と仕入実績受払の登録件数が異なるため、入荷実績を同時に訂正できません。<br>入荷実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0036 = "MSBDL0036";

	/** LEVEL[W]<br>対応する入荷実績の入荷数と仕入実績受払の仕入数が異なるため、入荷実績を同時に訂正することはできません。<br>入荷実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0037 = "MSBDL0037";

	/** LEVEL[W]<br>対応する入荷実績の登録件数と仕入実績受払の登録件数が異なるため、入荷実績を同時に取り消すことはできません。<br>入荷実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0038 = "MSBDL0038";

	/** LEVEL[W]<br>対応する入荷実績の入荷数と仕入実績受払の仕入数が異なるため、入荷実績を同時に取り消すことはできません。<br>入荷実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0039 = "MSBDL0039";

	/** LEVEL[W]<br>未入荷で仕入のみを登録する場合、仕入予定数より少ない仕入数で登録することはできません。<br>{1}<p>
	 */
	public static String MSBDL0040 = "MSBDL0040";

	/** LEVEL[W]<br>既に入荷実績が登録されているため、仕入実績の数量・場所などの訂正はできません。<br>{1}<p>
	 */
	public static String MSBDL0041 = "MSBDL0041";

	/** LEVEL[W]<br>仕入数量が仕入直送売上の売上数量よりも少なくなるため、訂正することはできません。<br>{1}<p>
	 */
	public static String MSBDL0042 = "MSBDL0042";

	/** LEVEL[W]<br>仕入数量が仕入直送売上の売上数量よりも少なくなるため、削除することはできません。<br>{1}<p>
	 */
	public static String MSBDL0043 = "MSBDL0043";

	/** LEVEL[W]<br>既に入荷実績が登録されているため、仕入実績受払の数量・場所などの変更はできません。<br>入荷実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0044 = "MSBDL0044";

	/** LEVEL[W]<br>既に入荷実績が登録されているため、仕入実績受払のみを削除することはできません。<br>入荷実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0045 = "MSBDL0045";

	/** LEVEL[W]<br>発注が打切されているため、仕入実績を登録することはできません。<br>発注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0046 = "MSBDL0046";

	/** LEVEL[W]<br>数量0で打切ることはできません。<p>
	 */
	public static String MSBDL0047 = "MSBDL0047";

	/** LEVEL[W]<br>仕入予定が打切られているため、仕入実績を登録できません。<p>
	 */
	public static String MSBDL0048 = "MSBDL0048";

	/** LEVEL[W]<br>1つの仕入予定に対して、複数の仕入実績明細を登録する場合、打切チェックは全てオン、または全てオフにしてください。<br>仕入予定ＮＯ：{1}<p>
	 */
	public static String MSBDL0049 = "MSBDL0049";

	/** LEVEL[W]<br>予定数以上の数量で打切りすることはできません。<br>{1}<p>
	 */
	public static String MSBDL0050 = "MSBDL0050";

	/** LEVEL[W]<br>予定が打切られている仕入実績明細を取消できません。<br>先に仕入予定の打切を解除して下さい。<br>{1}<p>
	 */
	public static String MSBDL0051 = "MSBDL0051";

	/** LEVEL[W]<br>下請法対象取引先の発注先に対して、計画外の仕入実績を登録することはできません。<br>発注先：{1}<p>
	 */
	public static String MSBDL0052 = "MSBDL0052";

	/** LEVEL[W]<br>下請法対象取引先の発注先に対して、仕入実績のみを登録することはできません。<br>発注先：{1}<p>
	 */
	public static String MSBDL0053 = "MSBDL0053";

	/** LEVEL[W]<br>再入荷予定に対して既に納入指示または納期回答受領が登録されているため、再入荷をオフにすることはできません。<br>納入指示ＮＯ：{1}<br>納期回答受領ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBDL0054 = "MSBDL0054";

	/** LEVEL[W]<br>再入荷予定に対して既に納入指示または納期回答受領が登録されているため、仕入実績明細を削除することはできません。<br>納入指示ＮＯ：{1}<br>納期回答受領ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBDL0055 = "MSBDL0055";

	/** LEVEL[W]<br>再入荷予定に対して既に入荷実績が登録されているため、仕入実績明細を取消できません。<br>入荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0056 = "MSBDL0056";

	/** LEVEL[W]<br>再入荷予定数量は検収不良数量よりも多い数量で登録することはできません。<br>再入荷予定数量：{1}<br>検収不良数量：{2}<br>{3}<p>
	 */
	public static String MSBDL0057 = "MSBDL0057";

	/** LEVEL[W]<br>諸口品マスタに登録されていません。<br>品目：{1}<br>手配ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBDL0058 = "MSBDL0058";

	/** LEVEL[W]<br>予定時のワーキンググループと異なるワーキンググループの納入場所は登録できません。<br>入荷予定の場所：{1}<br>入荷予定のワーキンググループ：{2}<br>納入場所：{3}<br>ワーキンググループ:{4}<p>
	 */
	public static String MSBDL0059 = "MSBDL0059";

	/** LEVEL[W]<br>予定時の納入場所に設定されている発注先ＣＤと異なる発注先ＣＤが設定されている納入場所は登録できません。<br>入荷予定の場所：{1}<br>入荷予定の場所の発注先：{2}<br>納入場所：{3}<br>納入場所の発注先：{4}<p>
	 */
	public static String MSBDL0060 = "MSBDL0060";

	/** LEVEL[W]<br>指定されるワーキンググループは購買機能を持つワーキンググループとして設定されていません。<br>ワーキンググループ：{1}<p>
	 */
	public static String MSBDL0061 = "MSBDL0061";

	/** LEVEL[W]<br>確定期間は連続する期間を指定してください。<br>内示日：{1}<br>発注先ＣＤ：{2}<br>ワーキンググループＣＤ：{3}<br>品目：{4}<br>内示期間開始日：{5}<br>内示期間終了日：{6}<br>{7}<p>
	 */
	public static String MSBDL0062 = "MSBDL0062";

	/** LEVEL[W]<br>最小パケット以外の期間は確定期間に指定できません。<br>内示日：{1}<br>発注先ＣＤ：{2}<br>ワーキンググループＣＤ：{3}<br>品目：{4}<br>内示期間開始日：{5}<br>内示期間終了日：{6}<br>{7}<p>
	 */
	public static String MSBDL0063 = "MSBDL0063";

	/** LEVEL[W]<br>購買内示ＮＯが同一データ内でエラーが発生しているため、処理を中止しました。<br>購買内示ＮＯ：{1}<p>
	 */
	public static String MSBDL0064 = "MSBDL0064";

	/** LEVEL[W]<br>再入荷がオンの場合、検収不良をオフに変更することはできません。先に再入荷をオフに更新してください。<br>{1}<p>
	 */
	public static String MSBDL0065 = "MSBDL0065";

	/** LEVEL[W]<br>予定時の物流グループと異なる物流グループの納入場所は指定できません。<br>入荷予定の場所：{1}<br>入荷予定の物流Ｇ：{2}<br>納入場所：{3}<br>物流Ｇ:{4}<p>
	 */
	public static String MSBDL0066 = "MSBDL0066";

	/** LEVEL[W]<br>予定時の製造場所グループと異なる製造場所グループの納入場所は登録できません。<br>入荷予定の場所：{1}<br>入荷予定の製造場所Ｇ：{2}<br>納入場所：{3}<br>製造場所Ｇ:{4}<p>
	 */
	public static String MSBDL0067 = "MSBDL0067";

	/** LEVEL[W]<br>対応する取引マスタが存在しません。<br>{1}<p>
	 */
	public static String MSBDL0068 = "MSBDL0068";

	/** LEVEL[W]<br>発注済のため発注予定を更新できません。<br>発注予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0069 = "MSBDL0069";

	/** LEVEL[W]<br>製造指図済のため発注予定を更新できません。<br>発注予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0070 = "MSBDL0070";

	/** LEVEL[W]<br>依頼元更新不可となっているため発注予定を更新できません。<br>発注予定ＮＯ：{1}<p>
	 */
	public static String MSBDL0071 = "MSBDL0071";

	/** LEVEL[W]<br>打切済のため発注予定を更新できません。<br>発注予定ＮＯ：{1}<p>
	 */
	public static String MSBDL0072 = "MSBDL0072";

	/** LEVEL[W]<br>分割済のため発注予定を更新できません。<br>発注予定ＮＯ：{1}<p>
	 */
	public static String MSBDL0073 = "MSBDL0073";

	/** LEVEL[W]<br>下請法対象取引先の発注先に対する納入希望日は仕入予定日と同日である必要があります。<br>{1}<p>
	 */
	public static String MSBDL0074 = "MSBDL0074";

	/** LEVEL[W]<br>確定されている明細が存在しないため、内示書を発行できません。<br>内示日：{1}<br>発注先：{2}<br>ワーキンググループ：{3}<br>{4}<p>
	 */
	public static String MSBDL0075 = "MSBDL0075";

	/** LEVEL[W]<br>外注品の購買識別区分には、有償受給あるいは通常購買を指定してください。<br>{1}<p>
	 */
	public static String MSBDL0076 = "MSBDL0076";

	/** LEVEL[W]<br>支給直送の場合、購買識別区分にＶＭＩを指定できません。<br>{1}<p>
	 */
	public static String MSBDL0077 = "MSBDL0077";

	/** LEVEL[W]<br>取消の内示書を印刷していないため、取消の戻しができません。<br>内示書ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0078 = "MSBDL0078";

	/** LEVEL[W]<br>経費購買の場合、仕入理由には経費理由から選択してください。<br>{1}<p>
	 */
	public static String MSBDL0079 = "MSBDL0079";

	/** LEVEL[W]<br>外注品を経費購買することはできません。<br>{1}<p>
	 */
	public static String MSBDL0080 = "MSBDL0080";

	/** LEVEL[W]<br>まとめ処理と打切を同時に行えません。<br>{1}<p>
	 */
	public static String MSBDL0081 = "MSBDL0081";

	/** LEVEL[W]<br>製造指図済の明細をまとめることはできません。<br>{1}<p>
	 */
	public static String MSBDL0082 = "MSBDL0082";

	/** LEVEL[W]<br>経費購買の理由を選択することはできません。<br>{1}<p>
	 */
	public static String MSBDL0083 = "MSBDL0083";

	/** LEVEL[W]<br>発注ＮＯに対応する発注情報が見つかりません。<br>発注ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0084 = "MSBDL0084";

	/** LEVEL[W]<br>既に仕入返品実績明細が登録されているため、更新できません。<br>仕入返品予定明細ＮＯ：{1}<br>仕入返品実績明細ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBDL0085 = "MSBDL0085";

	/** LEVEL[W]<br>返品が完了しているため、打切できません。<br>仕入返品予定明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0086 = "MSBDL0086";

	/** LEVEL[W]<br>次の明細項目は、詳細の同一項目に複数の値が含まれている場合は指定できません。<br>項目名：{1}<br>{2}<p>
	 */
	public static String MSBDL0087 = "MSBDL0087";

	/** LEVEL[W]<br>対応する受注情報の納品先または配送先が変更されています。納品先取得ボタンを押下してから再度登録を行ってください。<br><p>
	 */
	public static String MSBDL0088 = "MSBDL0088";

	/** LEVEL[W]<br>品目禁止マスタにおいて、発注が禁止されています。<br>品目：{1}<br>発注日：{2}<br>禁止日：{3}<br>{4}<p>
	 */
	public static String MSBDL0089 = "MSBDL0089";

	/** LEVEL[W]<br>取引先禁止マスタにおいて、発注が禁止されています。<br>発注先ＣＤ：{1}<br>発注日：{2}<br>{3}<p>
	 */
	public static String MSBDL0090 = "MSBDL0090";

	/** LEVEL[W]<br>取引先禁止マスタにおいて、発注が禁止されています。<br>発注先ＣＤ：{1}<br>発注日：{2}<p>
	 */
	public static String MSBDL0091 = "MSBDL0091";

	/** LEVEL[W]<br>値引品目のみの登録はできません。<br>{1}<p>
	 */
	public static String MSBDL0092 = "MSBDL0092";

	/** LEVEL[W]<br>次処理（入荷、仕入、受領インボイス登録）が行われているため、打切できません。<br>{1}<p>
	 */
	public static String MSBDL0093 = "MSBDL0093";

	/** LEVEL[W]<br>次処理（入荷、仕入、受領インボイス登録）が行われている明細をまとめることはできません。<br>{1}<p>
	 */
	public static String MSBDL0094 = "MSBDL0094";

	/** LEVEL[W]<br>承認状況区分が承認中のため更新できません。<p>
	 */
	public static String MSBDL0095 = "MSBDL0095";

	/** LEVEL[W]<br>案件の異なる手配ＮＯに変更できません。<br>発注時案件：{1}<br>発注明細ＮＯ：{2}<br>手配ＮＯ1：{3}<br>案件：{4}<br>{5}<p>
	 */
	public static String MSBDL0096 = "MSBDL0096";

	/** LEVEL[W]<br>複数の案件を1つの発注伝票にまとめることはできません。<br>手配ＮＯ1：{1}<br>案件：{2}<br>{3}<p>
	 */
	public static String MSBDL0097 = "MSBDL0097";

	/** LEVEL[W]<br>次処理（入荷、仕入、受領インボイス登録）が行われているため、取消できません。<br>{1}<p>
	 */
	public static String MSBDL0098 = "MSBDL0098";

	/** LEVEL[W]<br>ヘッダの案件と、明細の手配ＮＯ１に対応する案件が異なるため、登録できません。<br>ヘッダ案件：{1}<br>明細案件：{2}<br>{3}<p>
	 */
	public static String MSBDL0099 = "MSBDL0099";

	/** LEVEL[W]<br>打切済の発注予定は分割および分割取消できません。<br>発注予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0100 = "MSBDL0100";

	/** LEVEL[W]<br>発注に対して次処理（納入指示、納期回答受領、受領インボイス登録、入荷、仕入）が行われているため、承認対象となるような更新はできません。<br>{1}<p>
	 */
	public static String MSBDL0101 = "MSBDL0101";

	/** LEVEL[W]<br>指定された伝票には、値引対象の明細が含まれていません。<br>参照仕入実績ＮＯ：{1}<p>
	 */
	public static String MSBDL0102 = "MSBDL0102";

	/** LEVEL[W]<br>上り電文が不正です。<br>内示日：{1}<br>発注先：{2}<br>ワーキンググループ：{3}<br>品目：{4}<p>
	 */
	public static String MSBDL0103 = "MSBDL0103";

	/** LEVEL[W]<br>検収不良、または、全数打切の仕入情報を参照情報として仕入値引登録をすることはできません。<br>仕入実績ＮＯ：{1}<br>仕入実績明細ＮＯ：{2}<p>
	 */
	public static String MSBDL0104 = "MSBDL0104";

	/** LEVEL[W]<br>指定した製造指図ＮＯは存在しません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0105 = "MSBDL0105";

	/** LEVEL[W]<br>指定した品目、手配ＮＯ、製造指図ＮＯに対応する情報が見つかりません。<br>品目：{1}<br>手配ＮＯ：{2}<br>製造指図ＮＯ：{3}<p>
	 */
	public static String MSBDL0106 = "MSBDL0106";

	/** LEVEL[W]<br>指定した発注先、製造指図ＮＯに対応する情報が見つかりません。<br>発注先：{1}<br>製造指図ＮＯ：{2}<p>
	 */
	public static String MSBDL0107 = "MSBDL0107";

	/** LEVEL[W]<br>指定した製造指図の製造場所に対応する資産管理部門が負担部門と一致しません。<br>負担部門：{1}<br>資産管理部門：{2}<br>製造指図ＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBDL0108 = "MSBDL0108";

	/** LEVEL[W]<br>下請対象発注先の発注を取消・訂正する場合は訂正理由が必須です。発注ヘッダ単位で取消する場合は検索モードに「ヘッダ」を指定し、訂正理由を指定して取消してください。一部の明細を行削除する場合は、発注登録画面で訂正してください。<br>発注ＮＯ：{1}<br>発注明細ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBDL0109 = "MSBDL0109";

	/** LEVEL[W]<br>無償受給品、または有償受給品に対しての納入指示はできません。<br>発注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0110 = "MSBDL0110";

	/** LEVEL[W]<br>納期回答受領が入荷予定反映済の為、納入指示を登録できません。<br>先に入荷予定反映を解除してください。<br>発注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0111 = "MSBDL0111";

	/** LEVEL[W]<br>納入指示に対する納期回答受領が入荷予定反映済の為、訂正できません。<br>納期回答受領ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0112 = "MSBDL0112";

	/** LEVEL[W]<br>納入指示に対する納期回答受領が入荷予定反映済の為、取消できません。<br>納期回答受領ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0113 = "MSBDL0113";

	/** LEVEL[W]<br>未入荷数量より多くの納入指示は登録できません。<br>発注明細ＮＯ：{1}<br>超過数量：{2}<p>
	 */
	public static String MSBDL0114 = "MSBDL0114";

	/** LEVEL[W]<br>納入指示で作成した入荷予定、または仕入予定に対して実績が計上されているため、取消できません。<br>納入指示明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0115 = "MSBDL0115";

	/** LEVEL[W]<br>製造指図数量よりも大きい数量での納入指示は登録できません。<br>製造指図ＮＯ：{1}<br>製造指図数量（基準単位）：{2}<br>納入指示数量合計（基準単位）：{3}<p>
	 */
	public static String MSBDL0116 = "MSBDL0116";

	/** LEVEL[W]<br>納期回答受領日は納入指示日よりも早い日付で登録できません。<br>{1}<p>
	 */
	public static String MSBDL0117 = "MSBDL0117";

	/** LEVEL[W]<br>入荷予定、または仕入予定に対して実績が登録されている為、解除できません。<br>納期回答受領ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0118 = "MSBDL0118";

	/** LEVEL[W]<br>入荷予定、または仕入予定が打切されている為、解除できません。<br>納期回答受領ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0119 = "MSBDL0119";

	/** LEVEL[W]<br>対象の発注情報が既に取消されているため、更新できません。<br>発注ＮＯ：{1}<p>
	 */
	public static String MSBDL0120 = "MSBDL0120";

	/** LEVEL[W]<br>実績数量未満には更新できません。<br>納入指示明細ＮＯ：{1}<br>実績数量：{2}<br>納入指示数量：{3}<br>{4}<p>
	 */
	public static String MSBDL0121 = "MSBDL0121";

	/** LEVEL[W]<br>納入指示数量よりも大きい数量での納期回答受領は登録できません。<br>納入指示明細ＮＯ：{1}<br>納入指示数量（基準単位）：{2}<br>回答数量合計（基準単位）：{3}<br><p>
	 */
	public static String MSBDL0122 = "MSBDL0122";

	/** LEVEL[W]<br>納入指示ヘッダに紐づく明細が1行も存在しません。<br>ヘッダに紐づく明細を1行以上登録対象にしてください。<br>{1}<p>
	 */
	public static String MSBDL0123 = "MSBDL0123";

	/** LEVEL[W]<br>納期回答受領ヘッダに紐づく明細が1行も存在しません。<br>ヘッダに紐づく明細を1行以上登録対象にしてください。<br>{1}<p>
	 */
	public static String MSBDL0124 = "MSBDL0124";

	/** LEVEL[W]<br>入荷予定、仕入予定に対して全数打切する場合は同時に打切してください。<br>入荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0125 = "MSBDL0125";

	/** LEVEL[W]<br>仕入検収済です。入荷予定を全数打切できません。<br>入荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0126 = "MSBDL0126";

	/** LEVEL[W]<br>入荷予定、仕入予定の残数量が同数でないため、同時に打切できません。<br>入荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0127 = "MSBDL0127";

	/** LEVEL[W]<br>入荷予定、仕入予定がそれぞれ実績登録済のため、同時に打切してください。<br>入荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0128 = "MSBDL0128";

	/** LEVEL[W]<br>検索した発注情報の発注先はインボイス取引対象のため、仕入実績登録画面では表示できません。受領インボイス登録画面で検索または更新してください。<br>発注先：{1}<p>
	 */
	public static String MSBDL0129 = "MSBDL0129";

	/** LEVEL[W]<br>再入荷数量は実績数量未満には更新できません。<br>仕入実績明細ＮＯ：{1}<br>再入荷予定の入荷予定ＮＯ：{2}<br>再入荷予定の入荷実績数量：{3}<br>{4}<p>
	 */
	public static String MSBDL0130 = "MSBDL0130";

	/** LEVEL[W]<br>再入荷予定に対して既に入荷実績が登録されているため、再入荷チェックをオフにできません。<br>入荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0131 = "MSBDL0131";

	/** LEVEL[W]<br>業務理由マスタに経費購買がオンのレコードが存在しません。<br>品目:{1}<br>{2}<p>
	 */
	public static String MSBDL0132 = "MSBDL0132";

	/** LEVEL[W]<br>有効なＶＭＩ購買部門が取得できません。<br>在庫取引先：{1}<br>ＶＭＩ購買部門：{2}<br>マスタ適用日：{3}<br>{4}<p>
	 */
	public static String MSBDL0133 = "MSBDL0133";

	/** LEVEL[W]<br>同一のヘッダにまとめられる他の明細でエラーが発生しました。<br>{1}<p>
	 */
	public static String MSBDL0134 = "MSBDL0134";

	/** LEVEL[W]<br>明細行の数量と詳細行の合計数量が異なります。<br>明細行の数量（基準単位）：{1}<br>詳細行の合計数量（基準単位）：{2}<br>{3}<p>
	 */
	public static String MSBDL0135 = "MSBDL0135";

	/** LEVEL[W]<br>入荷数より多く仕入れることはできません。<br>入荷実績ＮＯ：{1}<br>入荷済数量（基準単位）：{2}<br>合計の仕入数量（基準単位）：{3}<br>{4}<p>
	 */
	public static String MSBDL0136 = "MSBDL0136";

	/** LEVEL[W]<br>未入荷数量より多くの納期回答受領は登録できません。<br>発注明細ＮＯ：{1}<br>超過数量：{2}<p>
	 */
	public static String MSBDL0137 = "MSBDL0137";

	/** LEVEL[W]<br>製造指図数量よりも大きい数量での納期回答受領は登録できません。<br>製造指図ＮＯ：{1}<br>製造指図数量（基準単位）：{2}<br>回答数量合計（基準単位）：{3}<p>
	 */
	public static String MSBDL0138 = "MSBDL0138";

	/** LEVEL[W]<br>実績数量未満には更新できません。<br>納期回答受領明細ＮＯ：{1}<br>実績数量：{2}<br>納期回答受領数量：{3}<br>{4}<p>
	 */
	public static String MSBDL0139 = "MSBDL0139";

	/** LEVEL[I]<br>複数の伝票が作成されました。<p>
	 */
	public static String MSBDL0140 = "MSBDL0140";

	/** LEVEL[I]<br>仕入実績ＮＯ：{1}<p>
	 */
	public static String MSBDL0141 = "MSBDL0141";

	/** LEVEL[W]<br>取引マスタに自動時採用がオンのレコードが存在しません。<br>取引パタン区分：{1}<br>{2}<p>
	 */
	public static String MSBDL0142 = "MSBDL0142";

	/** LEVEL[W]<br>明細を全行削除する場合は、ヘッダも削除してください。<br>納入指示ヘッダＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0143 = "MSBDL0143";

	/** LEVEL[W]<br>明細を全行削除する場合は、ヘッダも削除してください。<br>納期回答受領ヘッダＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0144 = "MSBDL0144";

	/** LEVEL[W]<br>入荷実績あるいは仕入実績が登録されているため、製造指図ＮＯは変更できません。<br>{1}<p>
	 */
	public static String MSBDL0145 = "MSBDL0145";

	/** LEVEL[W]<br>仕入実績の計上日に複数の日付が設定されたため、変更できません。<br>入荷実績一覧登録で仕入実績を同時に訂正する場合、入荷実績の計上日には全て同じ日付にしてください。<br>仕入実績ＮＯ：{1}<p>
	 */
	public static String MSBDL0146 = "MSBDL0146";

	/** LEVEL[W]<br>仕入実績の仕入日に複数の日付が設定されたため、変更できません。<br>入荷実績一覧登録で仕入実績を同時に訂正する場合、入荷実績の入荷日には全て同じ日付にしてください。<br>仕入実績ＮＯ：{1}<p>
	 */
	public static String MSBDL0147 = "MSBDL0147";

	/** LEVEL[W]<br>資産管理しない品目は、購買識別区分にＶＭＩを指定できません。<br>{1}<p>
	 */
	public static String MSBDL0148 = "MSBDL0148";

	/** LEVEL[W]<br>取引が経費購買の場合、資産管理する品目を登録できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBDL0149 = "MSBDL0149";

	/** LEVEL[W]<br>資産管理する品目は経費購買の理由を設定できません。<br>品目：{1}<br>理由ＣＤ：{2}<br>{3}<p>
	 */
	public static String MSBDL0150 = "MSBDL0150";

	/** LEVEL[W]<br>資産管理しない品目は経費購買の理由を設定してください。<br>品目：{1}<br>理由ＣＤ：{2}<br>{3}<p>
	 */
	public static String MSBDL0151 = "MSBDL0151";

	/** LEVEL[W]<br>未入荷の場合、検収不良の仕入実績を登録できません。<br>発注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0152 = "MSBDL0152";

	/** LEVEL[W]<br>金額の合計をマイナスにはできません。<p>
	 */
	public static String MSBDL0153 = "MSBDL0153";

	/** LEVEL[W]<br>発注ＮＯを指定していますが、発注を引継いだ明細がありません。<p>
	 */
	public static String MSBDL0154 = "MSBDL0154";

	/** LEVEL[W]<br>仕入直送の場合は購買識別区分に通常購買を指定してください。<br>購買識別区分：{1}<br>{2}<p>
	 */
	public static String MSBDL0155 = "MSBDL0155";

	/** LEVEL[W]<br>内示書の発行処理でエラーが発生したため、内示書を発行できませんでした。<p>
	 */
	public static String MSBDL0156 = "MSBDL0156";

	/** LEVEL[W]<br>負担部門には、ワーキンググループが設定されていない部門は指定できません。<br>負担部門：{1}<br>ワーキンググループ：{2}<br>{3}<p>
	 */
	public static String MSBDL0157 = "MSBDL0157";

	/** LEVEL[W]<br>支給直送の場合、検収不良を訂正できません。<br>{1}<p>
	 */
	public static String MSBDL0158 = "MSBDL0158";

	/** LEVEL[W]<br>入荷実績に対応する仕入実績を登録する場合は、入荷実績と同じ次の値を指定してください。<br>項目：{1}<br>入荷実績ＮＯ：{3}<br>入荷実績項目：{2}<br>入荷実績の値：{4}<br>{5}<p>
	 */
	public static String MSBDL0159 = "MSBDL0159";

	/** LEVEL[W]<br>明細行の仕入有効成分が詳細行の仕入有効成分の合計と異なります。<br>明細行の数量：{1}<br>詳細行の合計数量：{2}<br>{3}<p>
	 */
	public static String MSBDL0160 = "MSBDL0160";

	/** LEVEL[W]<br>仕入直送受注の数量と発注数量に差があります。<br>受注数量（基準単位）：{1}<br>発注数量（基準単位）：{2}<br>{3}<p>
	 */
	public static String MSBDL0161 = "MSBDL0161";

	/** LEVEL[W]<br>入荷後の仕入では、入荷数量と仕入数量が同じ数量でないと打切りできません。<br>入荷数量（基準単位）：{1}<br>仕入数量（基準単位）：{2}<br>入荷予定ＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBDL0162 = "MSBDL0162";

	/** LEVEL[W]<br>入荷実績登録済みのため、訂正できません。<br>{1}<p>
	 */
	public static String MSBDL0163 = "MSBDL0163";

	/** LEVEL[W]<br>入荷実績登録済みのため、取り消しできません。<br>{1}<p>
	 */
	public static String MSBDL0164 = "MSBDL0164";

	/** LEVEL[W]<br>社内場所から社外場所に変更できません。<br>変更前場所ＣＤ：{1}<br>変更後場所ＣＤ：{2}<br>変更後場所の発注先ＣＤ：{3}<br>{4}<p>
	 */
	public static String MSBDL0165 = "MSBDL0165";

	/** LEVEL[W]<br>社外場所から他の場所に変更できません。<br>変更前場所ＣＤ：{1}<br>変更前場所の発注先ＣＤ：{2}<br>変更後場所ＣＤ：{3}<br>{4}<p>
	 */
	public static String MSBDL0166 = "MSBDL0166";

	/** LEVEL[I]<br>発注に対応するすべての発注明細が、取消あるいは入荷完了（入荷不要を含む）の状態であるため、納品書の発行対象が存在しません。<br>発注ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0167 = "MSBDL0167";

	/** LEVEL[I]<br>納入指示に対応するすべての発注明細が、取消あるいは入荷完了（入荷不要を含む）の状態であるため、納品書の発行対象が存在しません。<br>納入指示ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0168 = "MSBDL0168";

	/** LEVEL[W]<br>納入指示が取消されているため、納品書の発行対象が存在しません。<br>納入指示ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0169 = "MSBDL0169";

	/** LEVEL[W]<br>検索した仕入実績は既に取り消されているため、訂正または取消できません。<br>仕入実績ＮＯ：{1}<p>
	 */
	public static String MSBDL0170 = "MSBDL0170";

	/** LEVEL[W]<br>検索した仕入返品実績は売上返品登録により登録されているため、訂正または取消できません。<p>
	 */
	public static String MSBDL0171 = "MSBDL0171";

	/** LEVEL[W]<br>納入指示可能な入荷予定が存在しません。<br>発注明細ＮＯ：{1}<p>
	 */
	public static String MSBDL0172 = "MSBDL0172";

	/** LEVEL[W]<br>入荷、仕入、受領インボイス登録のいずれかが行われているため、削除できません。<br>納期回答受領明細ＮＯ:{1}<br>{2}<p>
	 */
	public static String MSBDL0173 = "MSBDL0173";

	/** LEVEL[W]<br>インボイス取引対象の発注先ですが受領インボイスが登録されていない仕入予定があります。受領インボイスを登録してください。<br>発注先：{1}<br>仕入予定ＮＯ：{2}<p>
	 */
	public static String MSBDL0174 = "MSBDL0174";

	/** LEVEL[W]<br>負担発注ＮＯに対応する発注情報が見つかりません。<br>負担発注ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0175 = "MSBDL0175";

	/** LEVEL[W]<br>受注ＮＯに対応する受注情報が見つかりません。<br>受注ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0176 = "MSBDL0176";

	/** LEVEL[W]<br>負担受注ＮＯに対応する受注情報が見つかりません。<br>負担受注ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0177 = "MSBDL0177";

	/** LEVEL[W]<br>負担品目、負担ロットＮＯ、負担サブロットＮＯの組合せに対応するロット情報が見つかりません。<br>負担品目：{1}<br>負担ロットＮＯ：{2}<br>負担サブロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBDL0178 = "MSBDL0178";

	/** LEVEL[W]<br>負担インボイスＮＯに対応するインボイス情報あるいは受領インボイス情報が見つかりません。<br>負担インボイスＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0179 = "MSBDL0179";

	/** LEVEL[W]<br>納入指示明細ＮＯと仕入実績明細ＮＯの組み合わせが不正です。<br>納入指示明細ＮＯ：{1}<br>仕入実績明細ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBDL0180 = "MSBDL0180";

	/** LEVEL[W]<br>未入荷数量より多くの納入指示は登録できません。<br>発注明細ＮＯ：{1}<br>仕入実績明細ＮＯ：{2}<br>超過数量：{3}<p>
	 */
	public static String MSBDL0181 = "MSBDL0181";

	/** LEVEL[W]<br>未入荷数量より多くの納期回答受領は登録できません。<br>発注明細ＮＯ：{1}<br>仕入実績明細ＮＯ：{2}<br>超過数量：{3}<p>
	 */
	public static String MSBDL0182 = "MSBDL0182";

	/** LEVEL[W]<br>受領インボイス登録済のため訂正できません。<br>納期回答受領明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0183 = "MSBDL0183";

	/** LEVEL[W]<br>受領インボイス登録済のため訂正できません。<br>納入指示明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0184 = "MSBDL0184";

	/** LEVEL[W]<br>受領インボイス登録済のため訂正できません。<br>納期回答受領ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0185 = "MSBDL0185";

	/** LEVEL[W]<br>受領インボイス登録済のため取消できません。<br>納入指示明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0186 = "MSBDL0186";

	/** LEVEL[W]<br>仕入予定数量以上の数量で打切りすることはできません。<br>仕入予定数量（基準単位）：{1}<br>仕入数量（基準単位）：{2}<br>{3}<p>
	 */
	public static String MSBDL0187 = "MSBDL0187";

	/** LEVEL[W]<br>入荷が完了していないため、仕入の打切りはできません。<br>入荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0188 = "MSBDL0188";

	/** LEVEL[W]<br>入荷不要の品目は、購買識別区分に無償受給を指定できません。<br>{1}<p>
	 */
	public static String MSBDL0189 = "MSBDL0189";

	/** LEVEL[W]<br>値引品目は購買識別区分に通常購買を指定してください。<br>{1}<p>
	 */
	public static String MSBDL0190 = "MSBDL0190";

	/** LEVEL[W]<br>単価が「0」の場合は値引額を指定できません。<br>{1}<p>
	 */
	public static String MSBDL0191 = "MSBDL0191";

	/** LEVEL[W]<br>明細の手配ＮＯ１に対応する案件が異なる他の明細が存在するため、登録できません。<br>明細案件：{1}<br>{2}<p>
	 */
	public static String MSBDL0192 = "MSBDL0192";

	/** LEVEL[W]<br>金額をマイナスで登録することはできません。<br>{1}<p>
	 */
	public static String MSBDL0193 = "MSBDL0193";

	/** LEVEL[W]<br>取引が経費購買返品の場合、資産管理する品目を登録できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBDL0194 = "MSBDL0194";

	/** LEVEL[W]<br>取引が経費値引、または経費値増の場合、資産管理する品目を登録できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBDL0195 = "MSBDL0195";

	/** LEVEL[I]<br>仕入返品実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0196 = "MSBDL0196";

	/** LEVEL[W]<br>検査実績登録で抜取実績の荷姿振替が実施されています。抜取実績で荷姿振替された分を基準単位に振り替えて登録してください。<br>入荷実績ＮＯ：{1}<br>抜取実績の引落数量：{2}<br>抜取実績の荷姿振替数量：{3}<br>{4}<p>
	 */
	public static String MSBDL0197 = "MSBDL0197";

	/** LEVEL[W]<br>税マスタに登録されていません。<br>税ＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBDL0198 = "MSBDL0198";

	/** LEVEL[W]<br>納期回答可能な入荷予定が存在しません。<br>発注明細ＮＯ：{1}<br>仕入実績明細ＮＯ：{2}<br>製造指図ＮＯ：{3}<p>
	 */
	public static String MSBDL0199 = "MSBDL0199";

	/** LEVEL[W]<br>仕入実績の取消計上日に複数の日付が設定されたため、変更できません。<br>入荷実績一覧登録で仕入実績を同時に訂正する場合、入荷実績の取消計上日には全て同じ日付にしてください。<br>仕入実績ＮＯ：{1}<p>
	 */
	public static String MSBDL0200 = "MSBDL0200";

	/** LEVEL[W]<br>下請法対象取引先の発注先に対する再入荷希望日は再入荷仕入予定日と同日である必要があります。<br>{1}<p>
	 */
	public static String MSBDL0201 = "MSBDL0201";

	/** LEVEL[W]<br>指定した発注先・メーカと製造場所の場所マスタの発注先・メーカが異なります。<br>指定した発注先：{1}<br>指定したメーカ：{2}<br>場所マスタの発注先：{3}<br>場所マスタのメーカ：{4}<br>{5}<p>
	 */
	public static String MSBDL0202 = "MSBDL0202";

	/** LEVEL[W]<br>再入荷予定に対して後続業務が行われています。再入荷予定が変更される項目の訂正と、仕入実績の取消はできません。<br>・後続業務は以下のいずれかです。<br>　　納入指示、納期回答受領、入荷、仕入<br>・訂正ができない項目は以下の通りです。<br>　　再入荷、再入荷数量、再入荷場所、再入荷棚・ライン、再入荷希望日時、再入荷仕入予定日、再入荷同時計上<br>仕入実績明細ＮＯ：{1}<br>{2}<br><p>
	 */
	public static String MSBDL0203 = "MSBDL0203";

	/** LEVEL[W]<br>仮受注のため発注を登録できません。<br>受注ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0204 = "MSBDL0204";

	/** LEVEL[W]<br>受領インボイス登録対象のときは、仕入予定数と同じ実績数で登録してください。<br>受領インボイス管理ＮＯ：{1}<br>仕入予定ＮＯ：{2}<br>仕入予定数：{3}<br>仕入予定に対応する実績数の合計：{4}<p>
	 */
	public static String MSBDL0205 = "MSBDL0205";

	/** LEVEL[W]<br>入荷予定がIF送信対象のため、明細行もしくは明細に対応する詳細行は分割できません。<br>{1}<p>
	 */
	public static String MSBDL0301 = "MSBDL0301";

	/** LEVEL[W]<br>前受金入金額が請求額に達していないため発注を登録できません。<br>受注ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0302 = "MSBDL0302";

	/** LEVEL[W]<br>品目仕訳マスタに登録されていません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBDL0303 = "MSBDL0303";

	/** LEVEL[W]<br>場所マスタに有効な場所として登録されていません。<br>訂正前の納入場所：{1}<br>{2}<p>
	 */
	public static String MSBDL0304 = "MSBDL0304";

	/** LEVEL[W]<br>場所マスタに有効な場所として登録されていません。<br>発注予定の納入場所：{1}<br>{2}<p>
	 */
	public static String MSBDL0305 = "MSBDL0305";

	/** LEVEL[W]<br>場所マスタに有効な場所として登録されていません。<br>納入場所：{1}<br>{2}<p>
	 */
	public static String MSBDL0306 = "MSBDL0306";

	/** LEVEL[W]<br>品目仕訳マスタに登録されていません。<br>品目仕訳CD：{1}<br>{2}<p>
	 */
	public static String MSBDL0307 = "MSBDL0307";

	/** LEVEL[W]<br>仕入締が解除されているため、計上日は変更できません。<br>訂正前の計上日：{1}<br>{2}<p>
	 */
	public static String MSBDL0308 = "MSBDL0308";

	/** LEVEL[W]<br>未入荷で仕入のみを登録、または訂正する場合、仕入実績ヘッダを分割できません。<br>仕入実績ヘッダが1件になるように、日付、税などを変更してください。<br>仕入予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0309 = "MSBDL0309";

	/** LEVEL[I]<br>発注一括登録処理を開始しました。<p>
	 */
	public static String MSBDL0401 = "MSBDL0401";

	/** LEVEL[I]<br>発注一括登録処理が終了しました。<br>処理対象の発注予定件数：{1}<br>処理が成功した発注予定件数：{2}<br>処理が失敗した発注予定件数：{3}<p>
	 */
	public static String MSBDL0402 = "MSBDL0402";

	/** LEVEL[W]<br>指定された購買部門は無効です。<br>購買部門：{1}<p>
	 */
	public static String MSBDL0403 = "MSBDL0403";

	/** LEVEL[W]<br>指定された購買部門と購買担当者の組み合わせは無効です。<br>購買担当者：{1}<br>購買部門：{2}<br><p>
	 */
	public static String MSBDL0404 = "MSBDL0404";

	/** LEVEL[W]<br>他の処理によって更新されました。対象から除外します。<br>発注予定ＮＯ：{1}<p>
	 */
	public static String MSBDL0405 = "MSBDL0405";

	/** LEVEL[W]<br>他の明細のチェック処理でエラーが発生しました。処理を停止します。<p>
	 */
	public static String MSBDL0406 = "MSBDL0406";

	/** LEVEL[W]<br>指定された納品先が受注引当格付マスタに存在しないため、更新できません。<br>得意先ＣＤ：{1}<br>納品先ＣＤ：{2}<br>格付ＣＤ：{3}<br>{4}<p>
	 */
	public static String MSBDL0407 = "MSBDL0407";

	/** LEVEL[W]<br>納入指示に対して受領インボイスが登録されています。納入指示明細の数量に受領インボイスと同じ値を指定ください。<br>納入指示明細ＮＯ：{1}<br>受領インボイス数量：{2}<br>{3}<p>
	 */
	public static String MSBDL0408 = "MSBDL0408";

	/** LEVEL[W]<br>納期回答受領に対して受領インボイスが登録されています。納期回答受領明細の数量に受領インボイスと同じ値を指定ください。<br>納期回答受領明細ＮＯ：{1}<br>受領インボイス数量：{2}<br>{3}<p>
	 */
	public static String MSBDL0409 = "MSBDL0409";

	/** LEVEL[W]<br>仕入計上区分が「１：入荷基準」の場合は、納入希望日と仕入予定日は同日である必要があります。<br>{1}<p>
	 */
	public static String MSBDL0410 = "MSBDL0410";

	/** LEVEL[W]<br>仕入計上区分が「１：入荷基準」の場合は、同時計上フラグはオンである必要があります。<br>{1}<p>
	 */
	public static String MSBDL0411 = "MSBDL0411";

	/** LEVEL[W]<br>仕入計上区分が「２：検収基準」の場合は、同時計上フラグはオフである必要があります。<br>{1}<p>
	 */
	public static String MSBDL0412 = "MSBDL0412";

	/** LEVEL[W]<br>仕入計上区分が「１：入荷基準」の場合は、再入荷希望日と再入荷仕入予定日は同日である必要があります。<br>{1}<p>
	 */
	public static String MSBDL0413 = "MSBDL0413";

	/** LEVEL[W]<br>仕入計上区分が「１：入荷基準」の場合は、再入荷同時計上フラグはオンである必要があります。<br>{1}<p>
	 */
	public static String MSBDL0414 = "MSBDL0414";

	/** LEVEL[W]<br>仕入計上区分が「２：検収基準」の場合は、再入荷同時計上フラグはオフである必要があります。<br>{1}<p>
	 */
	public static String MSBDL0415 = "MSBDL0415";

	/** LEVEL[W]<br>加工単価と有償支給単価の合計が、単価と異なります。<br>加工単価と有償支給単価の合計：{1}<br>単価：{2}<br>{3}<p>
	 */
	public static String MSBDL0501 = "MSBDL0501";

	/** LEVEL[W]<br>前回登録したデータがＧＡに未反映です。<br>仕入伝票ＩＦ一覧照会画面から未反映の仕入伝票を再送信してください。<br>データＮＯ：{1}<br>仕入伝票ＮＯ：{2}<br>受領インボイスＮＯ：{3}<br>受領インボイス管理ＮＯ：{4}<br>仕入実績ＮＯ：{5}<p>
	 */
	public static String MSBDL0502 = "MSBDL0502";

	/** LEVEL[W]<br>該当の仕入実績はＧＡに登録されていません。<br>ＧＡに登録されていないデータは訂正・取消できません。<br>仕入実績ＮＯ：{1}<br>受領インボイスＮＯ：{2}<br>受領インボイス管理ＮＯ：{3}<p>
	 */
	public static String MSBDL0503 = "MSBDL0503";

	/** LEVEL[W]<br>支払予定制御マスタの設定が不正です。ＧＡに連携する支払予定日を計算できませんでした。<br>計上日時点のワーキンググループに対応するサイト区分と、支払予定管理先締年月日時点のワーキンググループに対応するサイト区分に同じ値を設定してください。<br><br>計上日時点のワーキンググループ：{1}<br>支払予定管理先締年月日時点のワーキンググループ：{2}<br>支払予定管理先：{3}<br>通貨：{4}<br>金額：{5}<p>
	 */
	public static String MSBDL0504 = "MSBDL0504";

	/** LEVEL[W]<br>支払予定制御マスタの設定が不正です。ＧＡに連携する支払予定日を計算できませんでした。<br>支払予定管理先が都度支払かつインボイス取引対象外の場合は、サイト区分に「日」を指定してください。<br>ワーキンググループ：{1}<br>支払予定管理先：{2}<br>通貨：{3}<br>金額：{4}<p>
	 */
	public static String MSBDL0505 = "MSBDL0505";

	/** LEVEL[W]<br>品目単位マスタが存在しません<br>品目：{1}<br>単位：{2}<br>{3}<p>
	 */
	public static String MSBDL0506 = "MSBDL0506";

	/** LEVEL[I]<br>購買内示情報登録処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSBDL0507 = "MSBDL0507";

	/** LEVEL[W]<br>計画外の場合は購買品以外は登録できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBDL0508 = "MSBDL0508";

	/** LEVEL[W]<br>購買部門が不正です。<br>計上日、購買担当者、購買部門に対する担当者権限マスタが設定されていることを確認してください。<br>計上日：{1}<br>購買担当者ＣＤ：{2}<br>購買部門ＣＤ：{3}<p>
	 */
	public static String MSBDL0509 = "MSBDL0509";

	/** LEVEL[W]<br>購買部門が不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの購買部門がオンになっていること<br>適用日：{1}<br>購買部門ＣＤ：{2}<p>
	 */
	public static String MSBDL0510 = "MSBDL0510";

	/** LEVEL[W]<br>納入指示明細ＮＯを指定しない場合は、納入指示されていない数量を超える数量の納期回答受領を登録できません。<br>数量を修正するか、納入指示明細ＮＯを指定してください。<br>発注明細ＮＯ：{1}<br>納入指示未登録数量（基準単位）：{2}<br>回答数量合計（基準単位）：{3}<p>
	 */
	public static String MSBDL0601 = "MSBDL0601";

	/** LEVEL[W]<br>納期回答受領済のため、納入指示を登録・訂正・取消できません。<br>発注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0602 = "MSBDL0602";

	/** LEVEL[W]<br>会社間取引の場合、発注時の取引単位ＣＤと異なる取引単位ＣＤは登録できません。<br>発注明細ＮＯ：{1}<br>発注時の取引単位ＣＤ：{2}<br>{3}<p>
	 */
	public static String MSBDL0603 = "MSBDL0603";

	/** LEVEL[W]<br>会社間取引であり、かつ納入指示で作成した入荷予定または仕入予定に対して実績が計上されている場合、訂正できません。<br>納入指示明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0604 = "MSBDL0604";

	/** LEVEL[W]<br>会社間取引の場合、再入荷予定に対する納入指示は登録できません。<br>{1}<p>
	 */
	public static String MSBDL0605 = "MSBDL0605";

	/** LEVEL[W]<br>受領インボイス未登録の数量より多くの納入指示は登録できません。<br>発注明細ＮＯ：{1}<br>超過数量：{2}<p>
	 */
	public static String MSBDL0606 = "MSBDL0606";

	/** LEVEL[W]<br>受領インボイス未登録の数量より多くの納期回答受領は登録できません。<br>発注明細ＮＯ：{1}<br>超過数量：{2}<p>
	 */
	public static String MSBDL0607 = "MSBDL0607";

	/** LEVEL[W]<br>同時計上の場合、同一の受領インボイス明細に含まれる全ての入荷実績の入荷日、計上日を揃えて登録してください。<br>受領インボイス明細ＮＯ：{1}<p>
	 */
	public static String MSBDL0608 = "MSBDL0608";

	/** LEVEL[W]<br>発注明細が打切されているため訂正、取消できません。<br>訂正、取消する場合は、発注明細を打切解除してください。<br>発注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0609 = "MSBDL0609";

	/** LEVEL[W]<br>発注明細の取引単位が品目単位マスタに存在しません。<br>品目：{1}<br>単位：{2}<br>発注明細ＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBDL0610 = "MSBDL0610";

	/** LEVEL[W]<br>入荷予定の取引単位が品目単位マスタに存在しません。<br>品目：{1}<br>単位：{2}<br>入荷予定ＮＯ ：{3}<br>{4}<p>
	 */
	public static String MSBDL0611 = "MSBDL0611";

	/** LEVEL[W]<br>納期回答受領明細の取引単位が品目単位マスタに存在しません。<br>品目：{1}<br>単位：{2}<br>納期回答受領明細ＮＯ ：{3}<br>{4}<p>
	 */
	public static String MSBDL0612 = "MSBDL0612";

	/** LEVEL[W]<br>指定された取引が不正です。以下の取引パタン区分に対応した取引を指定してください。<br>取引ＣＤ：{1}<br>取引パタン区分：{2}<br>{3}<p>
	 */
	public static String MSBDL0613 = "MSBDL0613";

	/** LEVEL[W]<br>売上・仕入の同時計上が混在するような訂正はできません。<br>仕入実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBDL0614 = "MSBDL0614";

	/** LEVEL[W]<br>売上と同時に登録された仕入実績に、売上と紐づかない仕入実績明細が含まれるため、訂正・取消できません。<br>売上と紐づかない仕入実績明細を削除してから、売上実績を訂正・取消してください。<br>売上実績明細ＮＯ：{1}<br>仕入実績ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBDL0615 = "MSBDL0615";

	/** LEVEL[W]<br>同一のヘッダにまとめられる他の明細でエラーが発生しました。<br>エラー内容は他に出力されたエラーメッセージを確認してください。<br>選択されていない明細にエラーが発生した場合、当該のエラーメッセージには行番号が表示されません。<br>仕入実績明細ＮＯ：{1}<br>エラーが発生した仕入実績明細ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBDL0616 = "MSBDL0616";

	/** LEVEL[W]<br>入力値チェックの下限を下回りました。<br>入力値（基準単位数量）：{1}<br>下限（移動指図数量*{2}）：{3}<br>移動指図明細ＮＯ：{4}<p>
	 */
	public static String MSBEP0001 = "MSBEP0001";

	/** LEVEL[W]<br>選択行の内、遷移元の画面と値が異なるカラム値は画面遷移時に引き継がれません。<br>値が引き継がれないカラム名：{1}<p>
	 */
	public static String MSBEP0002 = "MSBEP0002";

	/** LEVEL[W]<br>入力値チェックの下限を下回りました。<br>入力値（基準単位数量）：{1}<br>下限（移動予定数量*{2}）：{3}<br>移動引当状況ＮＯ：{4}<p>
	 */
	public static String MSBEP0003 = "MSBEP0003";

	/** LEVEL[W]<br>受領インボイスに対して仕入実績が登録されているため、訂正、取消できません。<p>
	 */
	public static String MSBEP0004 = "MSBEP0004";

	/** LEVEL[W]<br>指定の制御対象日あるいは棚卸年月ではまだ棚卸を実施できません。<p>
	 */
	public static String MSBEP0005 = "MSBEP0005";

	/** LEVEL[I]<br>選択行内で異なる値が指定されている項目について、画面遷移時に引き継ぎません。<br>値を引き継がない項目：{1}<p>
	 */
	public static String MSBEP0006 = "MSBEP0006";

	/** LEVEL[I]<br>純重量と容積を再取得しますか？<p>
	 */
	public static String MSBEP0007 = "MSBEP0007";

	/** LEVEL[W]<br>指定されたインボイスは既に輸出実績が登録済のため、更新できません。<p>
	 */
	public static String MSBEP0008 = "MSBEP0008";

	/** LEVEL[W]<br>選択行内で異なる値が指定されていますが、以下の項目は選択行内の値を引き継ぎます。<br>値を引き継ぐ項目：{1}<p>
	 */
	public static String MSBEP0009 = "MSBEP0009";

	/** LEVEL[W]<br>入力値チェックの上限を上回りました。<br>入力値（基準単位数量）：{1}<br>上限（移動指図数量*{2}）：{3}<br>移動指図明細ＮＯ：{4}<p>
	 */
	public static String MSBEP0011 = "MSBEP0011";

	/** LEVEL[W]<br>入力値チェックの上限を上回りました。<br>入力値（基準単位数量）：{1}<br>上限（移動予定数量*{2}）：{3}<br>移動引当状況ＮＯ：{4}<p>
	 */
	public static String MSBEP0013 = "MSBEP0013";

	/** LEVEL[W]<br>船積港、船卸港、経由地には異なる値を指定してください。<p>
	 */
	public static String MSBEP0014 = "MSBEP0014";

	/** LEVEL[W]<br>明細なし、または行追加した明細だけの登録はできません。<p>
	 */
	public static String MSBEP0015 = "MSBEP0015";

	/** LEVEL[W]<br>仕入を先に計上する予定ですが、入荷を先に計上します。<p>
	 */
	public static String MSBEP0016 = "MSBEP0016";

	/** LEVEL[W]<br>画面の表示に失敗しました。<br>親画面が指定されていません。<br>モジュールＩＤ：{1}<br>スクリーンＩＤ：{2}<p>
	 */
	public static String MSBEP0017 = "MSBEP0017";

	/** LEVEL[W]<br>画面の表示に失敗しました。<br>親画面はmcframe.clientMSUD.MSUDP0020.IfStkInspBaseインタフェースを実装している必要があります。<br>モジュールＩＤ：{1}<br>スクリーンＩＤ：{2}<br>親画面クラス：{3}<p>
	 */
	public static String MSBEP0018 = "MSBEP0018";

	/** LEVEL[W]<br>入力不可の検索項目に値が設定されていません。遷移元の画面より値を設定してください。<br>検索項目：{1}<p>
	 */
	public static String MSBEP0019 = "MSBEP0019";

	/** LEVEL[I]<br>単価取得処理を実行します。よろしいですか？<p>
	 */
	public static String MSBEP0020 = "MSBEP0020";

	/** LEVEL[I]<br>単価取得処理を実行しました。<p>
	 */
	public static String MSBEP0021 = "MSBEP0021";

	/** LEVEL[I]<br>為替レート取得処理を実行します。よろしいですか？<p>
	 */
	public static String MSBEP0022 = "MSBEP0022";

	/** LEVEL[I]<br>為替レート取得処理を実行しました。<p>
	 */
	public static String MSBEP0023 = "MSBEP0023";

	/** LEVEL[W]<br>基準通貨以外の行が選択されていません。<p>
	 */
	public static String MSBEP0024 = "MSBEP0024";

	/** LEVEL[W]<br>品揃え対象の明細が揃っていません。<br>受注ＮＯ：{1}<br>品揃区分：{2}<br>品揃グループＮＯ：{3}<p>
	 */
	public static String MSBEP0025 = "MSBEP0025";

	/** LEVEL[W]<br>ロット提案処理を実行します。よろしいですか？<p>
	 */
	public static String MSBEP0026 = "MSBEP0026";

	/** LEVEL[I]<br>税取得処理を実行します。よろしいですか？<p>
	 */
	public static String MSBEP0027 = "MSBEP0027";

	/** LEVEL[I]<br>税取得処理を実行しました。<p>
	 */
	public static String MSBEP0028 = "MSBEP0028";

	/** LEVEL[W]<br>インボイス明細の数量が出荷予定数を超えています。<br>インボイス登録可能数量：{1}<br>{2}<p>
	 */
	public static String MSBEP0029 = "MSBEP0029";

	/** LEVEL[W]<br>入荷と仕入を同時計上する予定ですが、別々で計上します。<p>
	 */
	public static String MSBEP0030 = "MSBEP0030";

	/** LEVEL[W]<br>入荷と仕入を別々に計上する予定ですが、同時計上します。<p>
	 */
	public static String MSBEP0031 = "MSBEP0031";

	/** LEVEL[W]<br>既に出荷されていますが、インボイスを取消ししてもよろしいですか？<p>
	 */
	public static String MSBEP0032 = "MSBEP0032";

	/** LEVEL[W]<br>入荷を先に計上する予定ですが、仕入を先に計上します。<p>
	 */
	public static String MSBEP0033 = "MSBEP0033";

	/** LEVEL[W]<br>予定経由の実績は参照登録できません。<p>
	 */
	public static String MSBEP0034 = "MSBEP0034";

	/** LEVEL[W]<br>指図経由の実績は参照登録できません。<p>
	 */
	public static String MSBEP0035 = "MSBEP0035";

	/** LEVEL[I]<br>現品票確認枚数を超えている行がありますが、このまま印刷しますか？<br>現品票確認枚数：{1}<p>
	 */
	public static String MSBEP0036 = "MSBEP0036";

	/** LEVEL[W]<br>ロット・場所提案処理を実行します。よろしいですか？<p>
	 */
	public static String MSBEP0037 = "MSBEP0037";

	/** LEVEL[W]<br>納品伝票を作成していない行が選択されています。選択行に対して納品伝票を作成しますがよろしいですか？<p>
	 */
	public static String MSBEP0038 = "MSBEP0038";

	/** LEVEL[W]<br>選択した在庫情報を反映できません。次の項目が同じ値である在庫情報を選択してください。<br>項目：{1}<br><p>
	 */
	public static String MSBEP0039 = "MSBEP0039";

	/** LEVEL[W]<br>仕入計上区分が「入荷基準」の場合は仕入予定日を変更できないため、仕入予定日が異なる明細をまとめられません。<p>
	 */
	public static String MSBEP0040 = "MSBEP0040";

	/** LEVEL[I]<br>仕入予定日が異なる明細が選択されています。<br>仕入計上区分が「入荷基準」の場合は仕入予定日を変更できないため、仕入計上区分が「入荷基準」の明細の仕入予定日を引き継ぎます。<p>
	 */
	public static String MSBEP0041 = "MSBEP0041";

	/** LEVEL[W]<br>インボイス明細の数量が出荷指図数を超えています。<br>インボイス登録可能数量：{1}<br>{2}<p>
	 */
	public static String MSBEP0101 = "MSBEP0101";

	/** LEVEL[W]<br>インボイス明細の数量が出荷数を超えています。<br>インボイス登録可能数量：{1}<br>{2}<p>
	 */
	public static String MSBEP0102 = "MSBEP0102";

	/** LEVEL[W]<br>受領インボイス登録画面ではインボイス取引対象外の発注先は指定できません。<br>発注先：{1}<p>
	 */
	public static String MSBEP0103 = "MSBEP0103";

	/** LEVEL[W]<br>検索モードに「ヘッダ」を指定してください。<p>
	 */
	public static String MSBEP0104 = "MSBEP0104";

	/** LEVEL[W]<br>納品先識別区分が「納品先」のインボイスを指定してください。<p>
	 */
	public static String MSBEP0105 = "MSBEP0105";

	/** LEVEL[W]<br>仕入直送の明細が含まれているため、参照登録はできません。<p>
	 */
	public static String MSBEP0106 = "MSBEP0106";

	/** LEVEL[W]<br>仕入対象外の明細が含まれているため、参照登録はできません。<p>
	 */
	public static String MSBEP0107 = "MSBEP0107";

	/** LEVEL[W]<br>ロットＮＯが指定されていません。<br>{1}<p>
	 */
	public static String MSBEL0001 = "MSBEL0001";

	/** LEVEL[W]<br>サブロットＮＯが指定されていません。<br>{1}<p>
	 */
	public static String MSBEL0002 = "MSBEL0002";

	/** LEVEL[W]<br>業者ロットＮＯが指定されていません。<br>{1}<p>
	 */
	public static String MSBEL0003 = "MSBEL0003";

	/** LEVEL[W]<br>指定された他勘定振替予定ＮＯの他勘定振替予定はありません。<br>他勘定振替予定ＮＯ：{1}<p>
	 */
	public static String MSBEL0004 = "MSBEL0004";

	/** LEVEL[W]<br>指定された他勘定振替指図ＮＯの明細を取得することができません。<br>他勘定振替指図ＮＯ：{1}<p>
	 */
	public static String MSBEL0005 = "MSBEL0005";

	/** LEVEL[W]<br>指定された他勘定振替実績ＮＯの明細を取得することができません。<br>他勘定振替実績ＮＯ：{1}<p>
	 */
	public static String MSBEL0006 = "MSBEL0006";

	/** LEVEL[W]<br>物流グループの異なる場所へは入荷、または仕入できません。<br>変更前場所ＣＤ：{1}<br>変更前物流グループＣＤ：{2}<br>変更後場所ＣＤ：{3}<br>変更後物流グループＣＤ：{4}<br>{5}<p>
	 */
	public static String MSBEL0007 = "MSBEL0007";

	/** LEVEL[W]<br>外注先の異なる場所へは入荷できません。<br>{1}<p>
	 */
	public static String MSBEL0008 = "MSBEL0008";

	/** LEVEL[W]<br>ロット管理情報が取得できません。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<p>
	 */
	public static String MSBEL0009 = "MSBEL0009";

	/** LEVEL[W]<br>ロットに有効期限が指定されていないため、有効期限のチェックができません。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<p>
	 */
	public static String MSBEL0010 = "MSBEL0010";

	/** LEVEL[W]<br>ロットに有効期限が指定されていないため、ロット逆転のチェックができません。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<p>
	 */
	public static String MSBEL0011 = "MSBEL0011";

	/** LEVEL[W]<br>指定した納品内容では有効期限を満たしていません。<br>得意先ＣＤ：{1}<br>納品先ＣＤ：{2}<br>出荷有効期限グループＣＤ：{3}<br>納品（予定）日：{4}<br>品目：{5}<br>ロットＮＯ：{6}<br>サブロットＮＯ：{7}<br>有効期限：{8}<br>許可する有効期限：{9}～<p>
	 */
	public static String MSBEL0012 = "MSBEL0012";

	/** LEVEL[W]<br>ロット逆転が発生しました。<br>得意先ＣＤ：{1}<br>納品先ＣＤ：{2}<br>納品（予定）日：{3}<br>品目：{4}<br>ロットＮＯ：{5}<br>サブロットＮＯ：{6}<br>有効期限：{7}<br>許可する有効期限：{8}～{9}<p>
	 */
	public static String MSBEL0013 = "MSBEL0013";

	/** LEVEL[W]<br>出荷ロット排他情報を登録できませんでした。処理の対象から除外します。<br>得意先ＣＤ：{1}<br>納品先ＣＤ：{2}<br>品目：{3}<p>
	 */
	public static String MSBEL0014 = "MSBEL0014";

	/** LEVEL[W]<br>出荷ロット排他情報をロックできませんでした。処理の対象から除外します。<br>得意先ＣＤ：{1}<br>納品先ＣＤ：{2}<br>品目：{3}<p>
	 */
	public static String MSBEL0015 = "MSBEL0015";

	/** LEVEL[W]<br>指定の品目は出荷禁止です。<br>品目：{1}<br>出荷日：{2}<br>売上・出荷禁止日：{3}<br>{4}<p>
	 */
	public static String MSBEL0016 = "MSBEL0016";

	/** LEVEL[W]<br>指定の品目は移送禁止です。<br>品目：{1}<br>出荷日：{2}<br>移送・移動禁止日：{3}<br>{4}<p>
	 */
	public static String MSBEL0017 = "MSBEL0017";

	/** LEVEL[W]<br>指定の品目は輸出禁止です。<br>品目：{1}<br>納品先国：{2}<br>{3}<p>
	 */
	public static String MSBEL0018 = "MSBEL0018";

	/** LEVEL[W]<br>指定のロットは引当禁止です。<br>品目：{1}<br>ロット：{2}<br>サブロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBEL0019 = "MSBEL0019";

	/** LEVEL[W]<br>出荷作業を伴わない品目が出荷の対象に含まれていません。<br>出荷対象に含めて出荷を行ってください。<p>
	 */
	public static String MSBEL0020 = "MSBEL0020";

	/** LEVEL[W]<br>出荷予定をまとめているインボイスＮＯと、受注のインボイスＮＯが異なります。<br>インボイスＮＯ（出荷）：{1}<br>インボイスＮＯ（受注）：{2}<p>
	 */
	public static String MSBEL0021 = "MSBEL0021";

	/** LEVEL[W]<br>インボイス取引対象と対象外の出荷予定が混在しているため、出荷できません。<br>インボイス取引対象の出荷予定は、インボイスＮＯを指定して出荷してください。<p>
	 */
	public static String MSBEL0022 = "MSBEL0022";

	/** LEVEL[W]<br>インボイスＮＯ指定の場合は、対象インボイスの出荷予定を全て指定してください。<p>
	 */
	public static String MSBEL0023 = "MSBEL0023";

	/** LEVEL[W]<br>品揃区分が「2：品揃する」、もしくは品揃グループＮＯが指定されている場合、出荷予定を分割して出荷できません。<br>受注ＮＯ：{1}<br>品揃区分：{2}<br>品揃グループＮＯ：{3}<br>出荷予定ＮＯ：{4}<br>予定数量(基準単位)：{5}<br>出荷数量(基準単位)：{6}<p>
	 */
	public static String MSBEL0024 = "MSBEL0024";

	/** LEVEL[W]<br>打切済みのため、行削除できません。<br>削除する場合は、先に打切を解除してください。<br>{1}<p>
	 */
	public static String MSBEL0025 = "MSBEL0025";

	/** LEVEL[W]<br>売上計上済みのため、更新または取り消しできません。<br>{1}<p>
	 */
	public static String MSBEL0026 = "MSBEL0026";

	/** LEVEL[W]<br>入荷済みのため、更新または取り消しできません。<br>{1}<p>
	 */
	public static String MSBEL0027 = "MSBEL0027";

	/** LEVEL[W]<br>インボイス出荷済みのため、更新または取り消しできません。<br>{1}<p>
	 */
	public static String MSBEL0028 = "MSBEL0028";

	/** LEVEL[W]<br>出荷返品対象のため、更新または取り消しできません。<br>{1}<p>
	 */
	public static String MSBEL0029 = "MSBEL0029";

	/** LEVEL[W]<br>打切済みのため、取り消しできません。<br>取り消しする場合は、先に打切を解除してください。<br>{1}<p>
	 */
	public static String MSBEL0030 = "MSBEL0030";

	/** LEVEL[W]<br>出荷予定ＮＯが指定されていません。<br>指図まとめされた出荷以外では、出荷予定ＮＯを指定する必要があります。<br>{1}<p>
	 */
	public static String MSBEL0031 = "MSBEL0031";

	/** LEVEL[W]<br>出荷実績のヘッダ項目が異なる出荷予定が指定されています。<br>{1}<p>
	 */
	public static String MSBEL0032 = "MSBEL0032";

	/** LEVEL[W]<br>データ更新中に、データの競合が発生しました。<br>処理を再実行してください。<p>
	 */
	public static String MSBEL0033 = "MSBEL0033";

	/** LEVEL[W]<br>在庫の数量がマイナスとなるため更新できません。<br>品目：{1}<br>場所ＣＤ：{2}<br>棚・ラインＣＤ：{3}<br>在庫着荷先ＣＤ：{4}<br>ロットＮＯ：{5}<br>サブロットＮＯ：{6}<br>手配ＮＯ：{7}<br>確定ＮＯ区分：{8}<br>確定ＮＯ：{9}<br>荷姿単位ＣＤ：{10}<br>格付ＣＤ：{11}<br>積送品区分：{12}<br>良品区分：{13}<br>資産区分：{14}<br>在庫検査区分：{15}<br>在庫識別区分：{16}<br>在庫取引先ＣＤ：{17}<br>荷姿単位数量：{18}<br>基準単位数量：{19}<p>
	 */
	public static String MSBEL0034 = "MSBEL0034";

	/** LEVEL[W]<br>月次受払在庫で月末在庫の数量がマイナスとなるため更新できません。<br>年月：{1}<br>受払区分：{2}<br>品目：{3}<br>場所ＣＤ：{4}<br>棚・ラインＣＤ：{5}<br>在庫着荷先ＣＤ：{6}<br>ロットＮＯ：{7}<br>サブロットＮＯ：{8}<br>手配ＮＯ：{9}<br>確定ＮＯ区分：{10}<br>確定ＮＯ：{11}<br>荷姿単位ＣＤ：{12}<br>格付ＣＤ：{13}<br>積送品区分：{14}<br>良品区分：{15}<br>資産区分：{16}<br>在庫検査区分：{17}<br>在庫識別区分：{18}<br>在庫取引先ＣＤ：{19}<br>荷姿単位数量：{20}<br>基準単位数量：{21}<p>
	 */
	public static String MSBEL0035 = "MSBEL0035";

	/** LEVEL[W]<br>在庫の数量が有効桁数を超えています。<br>品目：{1}<br>場所ＣＤ：{2}<br>棚・ラインＣＤ：{3}<br>在庫着荷先ＣＤ：{4}<br>ロットＮＯ：{5}<br>サブロットＮＯ：{6}<br>手配ＮＯ：{7}<br>確定ＮＯ区分：{8}<br>確定ＮＯ：{9}<br>荷姿単位ＣＤ：{10}<br>格付ＣＤ：{11}<br>積送品区分：{12}<br>良品区分：{13}<br>資産区分：{14}<br>在庫検査区分：{15}<br>在庫識別区分：{16}<br>在庫取引先ＣＤ：{17}<br>荷姿単位数量：{18}<br>基準単位数量：{19}<br>整数の有効桁数：{20}<br>小数点以下の有効桁数：{21}<p>
	 */
	public static String MSBEL0036 = "MSBEL0036";

	/** LEVEL[W]<br>取引の数量が有効桁数を超えています。<br>年月：{1}<br>受払区分：{2}<br>品目：{3}<br>場所ＣＤ：{4}<br>棚・ラインＣＤ：{5}<br>在庫着荷先ＣＤ：{6}<br>ロットＮＯ：{7}<br>サブロットＮＯ：{8}<br>手配ＮＯ：{9}<br>確定ＮＯ区分：{10}<br>確定ＮＯ：{11}<br>荷姿単位ＣＤ：{12}<br>格付ＣＤ：{13}<br>積送品区分：{14}<br>良品区分：{15}<br>資産区分：{16}<br>在庫検査区分：{17}<br>在庫識別区分：{18}<br>在庫取引先ＣＤ：{19}<br>荷姿単位数量：{20}<br>基準単位数量：{21}<br>整数の有効桁数：{22}<br>小数点以下の有効桁数：{23}<p>
	 */
	public static String MSBEL0037 = "MSBEL0037";

	/** LEVEL[W]<br>出荷留めが指定されているため、出荷できません。<br>出荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0038 = "MSBEL0038";

	/** LEVEL[W]<br>引当可能な在庫、受払予定が存在しないため、引当できませんでした。<p>
	 */
	public static String MSBEL0039 = "MSBEL0039";

	/** LEVEL[W]<br>自社から自社へ移動・移送する場合、在庫識別区分には「自社在庫」「VMI」「検収不良」「無償受給」のいずれかを指定してください。<br>出庫場所ＣＤ：{1}<br>入庫場所ＣＤ：{2}<br>在庫識別区分：{3}<br>{4}<p>
	 */
	public static String MSBEL0040 = "MSBEL0040";

	/** LEVEL[W]<br>外注先から自社へ移動・移送する場合、在庫識別区分には「自社在庫」「検収不良」「無償受給」「有償支給」のいずれかを指定してください。<br>出庫場所ＣＤ：{1}<br>入庫場所ＣＤ：{2}<br>在庫識別区分：{3}<br>{4}<p>
	 */
	public static String MSBEL0041 = "MSBEL0041";

	/** LEVEL[W]<br>自社から外注先へ移動・移送する場合、在庫識別区分には「自社在庫」「VMI」「無償受給」のいずれかを指定してください。<br>出庫場所ＣＤ：{1}<br>入庫場所ＣＤ：{2}<br>在庫識別区分：{3}<br>{4}<p>
	 */
	public static String MSBEL0042 = "MSBEL0042";

	/** LEVEL[W]<br>外注先から外注先へ移動・移送する場合、在庫識別区分には「自社在庫」「無償受給」「有償支給」のいずれかを指定してください。<br>出庫場所ＣＤ：{1}<br>入庫場所ＣＤ：{2}<br>在庫識別区分：{3}<br>{4}<p>
	 */
	public static String MSBEL0043 = "MSBEL0043";

	/** LEVEL[W]<br>自社から自社へ移動・移送するインボイス取引の場合、在庫識別区分には「自社在庫」「VMI」「検収不良」「無償受給」のいずれかを指定してください。<br>出庫場所ＣＤ：{1}<br>入庫場所ＣＤ：{2}<br>在庫識別区分：{3}<br>{4}<p>
	 */
	public static String MSBEL0044 = "MSBEL0044";

	/** LEVEL[W]<br>入荷済です。入荷予定は訂正、取り消しできません。<br>入荷予定ＮＯ：{1}<p>
	 */
	public static String MSBEL0045 = "MSBEL0045";

	/** LEVEL[W]<br>仕入検収済です。入荷予定は訂正、取り消しできません。<br>入荷予定ＮＯ：{1}<p>
	 */
	public static String MSBEL0046 = "MSBEL0046";

	/** LEVEL[W]<br>売上計上済です。入荷予定は訂正、取り消しできません。<br>入荷予定ＮＯ：{1}<p>
	 */
	public static String MSBEL0047 = "MSBEL0047";

	/** LEVEL[W]<br>入荷予定は打切済みです。打切解除後に訂正してください。<br>入荷予定ＮＯ：{1}<p>
	 */
	public static String MSBEL0048 = "MSBEL0048";

	/** LEVEL[W]<br>製造指図ＮＯが設定されていないため、入荷予定は打切できません。<br>入荷予定ＮＯ：{1}<p>
	 */
	public static String MSBEL0049 = "MSBEL0049";

	/** LEVEL[W]<br>配送先を経由して出荷する場合、送付先に配送先を指定してください。<p>
	 */
	public static String MSBEL0050 = "MSBEL0050";

	/** LEVEL[W]<br>指定された取引は利用できません。<br>下記の取引パタン区分が指定された取引を指定してください。<br>取引パタン区分：「売上」「出荷」「移動・移送」「移動・移送返品」「支給」「支給返品」<br>取引ＣＤ：{1}<br>取引パタン区分：{2}<br>{3}<p>
	 */
	public static String MSBEL0051 = "MSBEL0051";

	/** LEVEL[W]<br>取引と送付先の関係が不正です。<br>下記の取引パタン区分が指定された取引を使用する場合は、送付先に「納品先」を指定してください。<br>取引パタン区分：「売上」「出荷」<br>取引ＣＤ：{1}<br>取引パタン区分：{2}<br>送付先識別区分：{3}<br>{4}<p>
	 */
	public static String MSBEL0052 = "MSBEL0052";

	/** LEVEL[W]<br>取引と送付先の関係が不正です。<br>下記の取引パタン区分が設定された取引を使用する場合は、送付先に「場所」を指定してください。<br>取引パタン区分：「移動・移送」「移動・移送返品」「支給」「支給返品」<br>取引ＣＤ：{1}<br>取引パタン区分：{2}<br>送付先識別区分：{3}<br>{4}<p>
	 */
	public static String MSBEL0053 = "MSBEL0053";

	/** LEVEL[W]<br>取引と納品先の関係が不正です。<br>下記の取引パタン区分が指定された取引を使用する場合は、納品先に「納品先」を指定してください。<br>取引パタン区分：「売上」「出荷」<br>取引ＣＤ：{1}<br>取引パタン区分：{2}<br>納品先識別区分：{3}<br>{4}<p>
	 */
	public static String MSBEL0054 = "MSBEL0054";

	/** LEVEL[W]<br>取引と送付先の関係が不正です。<br>下記の取引パタン区分が設定された取引を使用する場合は、納品先に「場所」を指定してください。<br>取引パタン区分：「移動・移送」「移動・移送返品」「支給」「支給返品」<br>取引ＣＤ：{1}<br>取引パタン区分：{2}<br>納品先識別区分：{3}<br>{4}<p>
	 */
	public static String MSBEL0055 = "MSBEL0055";

	/** LEVEL[W]<br>入庫場所もしくは出庫場所が外注先の場合、指定した在庫検査区分は使用できません。<br>入庫場所ＣＤ：{1}<br>出庫場所ＣＤ：{2}<br>在庫検査区分：{3}<p>
	 */
	public static String MSBEL0056 = "MSBEL0056";

	/** LEVEL[W]<br>物流グループ内の移送は指定できません。<br>出荷先物流グループＣＤ：{1}<br>出荷元物流グループＣＤ：{2}<br>{3}<p>
	 */
	public static String MSBEL0057 = "MSBEL0057";

	/** LEVEL[W]<br>指定された他勘定振替予定は未承認のため、指図できません。<br>他勘定振替予定ＮＯ：{1}<p>
	 */
	public static String MSBEL0058 = "MSBEL0058";

	/** LEVEL[W]<br>指定された他勘定振替予定は未承認のため、実績計上できません。<br>他勘定振替予定ＮＯ：{1}<p>
	 */
	public static String MSBEL0059 = "MSBEL0059";

	/** LEVEL[W]<br>出庫場所と入庫場所において、異なる物流Ｇの設定はできません。<br>出庫場所と入庫場所の物流Ｇを一致させてください。<br>出庫場所ＣＤ：{1}<br>入庫場所ＣＤ：{2}<br>{3}<p>
	 */
	public static String MSBEL0060 = "MSBEL0060";

	/** LEVEL[W]<br>指定された実績の出庫情報を取得することができません。<br>在庫振替実績ＮＯ：{1}<p>
	 */
	public static String MSBEL0061 = "MSBEL0061";

	/** LEVEL[W]<br>指定された実績の入庫情報を取得することができません。<br>在庫振替実績ＮＯ：{1}<p>
	 */
	public static String MSBEL0062 = "MSBEL0062";

	/** LEVEL[W]<br>手配ＮＯ１管理区分が「管理しない」「管理する（任意：在庫対象外）」品目に対して手配ＮＯ１が指定されています。<br>品目:{1}<br>手配ＮＯ１管理区分:{2}<br>手配ＮＯ１:{3}<br>{4}<p>
	 */
	public static String MSBEL0063 = "MSBEL0063";

	/** LEVEL[W]<br>手配ＮＯ２管理区分が「管理しない」「管理する（任意：在庫対象外）」品目に対して手配ＮＯ２が指定されています。<br>品目:{1}<br>手配ＮＯ２管理区分:{2}<br>手配ＮＯ２:{3}<br>{4}<p>
	 */
	public static String MSBEL0064 = "MSBEL0064";

	/** LEVEL[W]<br>手配ＮＯ３管理区分が「管理しない」「管理する（任意：在庫対象外）」品目に対して手配ＮＯ３が指定されています。<br>品目:{1}<br>手配ＮＯ３管理区分:{2}<br>手配ＮＯ３:{3}<br>{4}<p>
	 */
	public static String MSBEL0065 = "MSBEL0065";

	/** LEVEL[W]<br>手配ＮＯ４管理区分が「管理しない」「管理する（任意：在庫対象外）」品目に対して手配ＮＯ４が指定されています。<br>品目:{1}<br>手配ＮＯ４管理区分:{2}<br>手配ＮＯ４:{3}<br>{4}<p>
	 */
	public static String MSBEL0066 = "MSBEL0066";

	/** LEVEL[W]<br>ロット管理区分が「ロット管理しない」品目に対してロットＮＯが指定されています。<br>品目:{1}<br>ロット管理区分:{2}<br>ロットＮＯ:{3}<br>{4}<p>
	 */
	public static String MSBEL0067 = "MSBEL0067";

	/** LEVEL[W]<br>サブロット管理区分が「ロット管理しない」品目に対してサブロットＮＯが指定されています。<br>品目:{1}<br>サブロット管理区分:{2}<br>サブロットＮＯ:{3}<br>{4}<p>
	 */
	public static String MSBEL0068 = "MSBEL0068";

	/** LEVEL[W]<br>在庫識別区分が「自社在庫」品目に対して在庫取引先が指定されています。<br>品目:{1}<br>在庫識別区分:{2}<br>在庫取引先ＣＤ:{3}<br>{4}<p>
	 */
	public static String MSBEL0069 = "MSBEL0069";

	/** LEVEL[W]<br>出庫明細複数、入庫明細複数の振替はできません。<br>出庫明細数:{1}<br>入庫明細数:{2}<p>
	 */
	public static String MSBEL0070 = "MSBEL0070";

	/** LEVEL[W]<br>資産管理対象品目と非管理対象品目が混在する品目振替はできません。<p>
	 */
	public static String MSBEL0071 = "MSBEL0071";

	/** LEVEL[W]<br>振替内容が一致した在庫振替はできません。<br>{1}<p>
	 */
	public static String MSBEL0072 = "MSBEL0072";

	/** LEVEL[W]<br>入出庫対象の品目が一致する品目振替はできません。<br>品目:{1}<p>
	 */
	public static String MSBEL0073 = "MSBEL0073";

	/** LEVEL[W]<br>出庫情報の「基準単位数量」の合計と入庫情報の「基準単位数量」の合計が異なっています。<br>出庫数量:{1}<br>入庫数量:{2}<p>
	 */
	public static String MSBEL0074 = "MSBEL0074";

	/** LEVEL[W]<br>次の項目の値が1種類となるように指定してください。<br>項目名:{1}<p>
	 */
	public static String MSBEL0075 = "MSBEL0075";

	/** LEVEL[W]<br>受領インボイスに対して仕入実績が登録されているため、訂正、取消できません。<br>{1}<p>
	 */
	public static String MSBEL0076 = "MSBEL0076";

	/** LEVEL[W]<br>船積港、船卸港、経由地には異なる値を指定してください。<p>
	 */
	public static String MSBEL0077 = "MSBEL0077";

	/** LEVEL[W]<br>取引通貨と基準通貨に対する為替レートが取得できませんでした。為替レートマスタを設定してください。<br>取引通貨：{1}<br>基準通貨：{2}<br>適用日：{3}<br>{4}<p>
	 */
	public static String MSBEL0078 = "MSBEL0078";

	/** LEVEL[W]<br>指定された他勘定振替予定ＮＯは、未承認ではありません。まずは承認状況を取り消してください。<br>他勘定振替予定ＮＯ：{1}<p>
	 */
	public static String MSBEL0079 = "MSBEL0079";

	/** LEVEL[W]<br>送付先として登録されていません。<br>送付先識別区分：{1}<br>{2}<p>
	 */
	public static String MSBEL0080 = "MSBEL0080";

	/** LEVEL[W]<br>納品先として登録されていません。<br>納品先識別区分：{1}<br>{2}<p>
	 */
	public static String MSBEL0081 = "MSBEL0081";

	/** LEVEL[W]<br>指定された在庫識別区分は、「他勘定振替出庫」では使用できません。正しい在庫識別区分を指定してください。<br>{1}<p>
	 */
	public static String MSBEL0082 = "MSBEL0082";

	/** LEVEL[W]<br>指定された在庫識別区分は、「他勘定振替入庫」では使用できません。正しい在庫識別区分を指定してください。<br>{1}<p>
	 */
	public static String MSBEL0083 = "MSBEL0083";

	/** LEVEL[W]<br>指定された在庫識別区分は、「廃棄」では使用できません。正しい在庫識別区分を指定してください。<br>{1}<p>
	 */
	public static String MSBEL0084 = "MSBEL0084";

	/** LEVEL[W]<br>未引当の在庫が存在しません。引当済みの在庫は使用できません。<br>品目：{1}<br>場所：{2}<br>棚・ライン：{3}<br>ロットＮＯ：{4}<br>サブロットＮＯ：{5}<br>手配ＮＯ：{6}<br>荷姿単位：{7}<br>格付：{8}<br>良品区分：{9}<br>在庫識別区分：{10}<br>在庫取引先：{11}<p>
	 */
	public static String MSBEL0085 = "MSBEL0085";

	/** LEVEL[W]<br>既にインボイス登録されているため受領インボイスは訂正、取消できません。<br>インボイスＮＯ：{1}<p>
	 */
	public static String MSBEL0086 = "MSBEL0086";

	/** LEVEL[W]<br>指図済みです。出荷予定は訂正、取消できません。<br>{1}<p>
	 */
	public static String MSBEL0087 = "MSBEL0087";

	/** LEVEL[W]<br>出荷済です。出荷予定は訂正、取消できません。<br>{1}<p>
	 */
	public static String MSBEL0088 = "MSBEL0088";

	/** LEVEL[W]<br>インボイスでまとめられているため、出荷予定は訂正、取消できません。<br>{1}<p>
	 */
	public static String MSBEL0089 = "MSBEL0089";

	/** LEVEL[W]<br>出荷予定は打切済みです。打切解除後に取消してください。<br>{1}<p>
	 */
	public static String MSBEL0090 = "MSBEL0090";

	/** LEVEL[W]<br>指図まとめが行われているため、出荷予定は訂正できません。<br>{1}<p>
	 */
	public static String MSBEL0091 = "MSBEL0091";

	/** LEVEL[I]<br>品揃えが指定されているため、物流グループごとに出荷予定を分割できません。<br>物流グループの異なる出荷予定は、出荷元物流グループの出荷予定にまとめて作成します。<br>{1}<p>
	 */
	public static String MSBEL0092 = "MSBEL0092";

	/** LEVEL[W]<br>確定した出荷予定があるため、品目、単位、格付、ロットなど引当処理に影響のある項目は変更できません。<br>{1}<p>
	 */
	public static String MSBEL0093 = "MSBEL0093";

	/** LEVEL[W]<br>確定した出荷予定数量を下回る数量に訂正できません。<br>{1}<p>
	 */
	public static String MSBEL0094 = "MSBEL0094";

	/** LEVEL[W]<br>確定した出荷予定があるため、削除できません。<br>{1}<p>
	 */
	public static String MSBEL0095 = "MSBEL0095";

	/** LEVEL[W]<br>指定の棚卸基準日、場所、品目では実棚情報を登録できません。<br>棚卸基準日：{1}<br>場所ＣＤ：{2}<br>品目：{3}<br>{4}<p>
	 */
	public static String MSBEL0096 = "MSBEL0096";

	/** LEVEL[W]<br>棚卸中ではないため実棚情報を登録できません。<br>{1}<p>
	 */
	public static String MSBEL0097 = "MSBEL0097";

	/** LEVEL[W]<br>ＶＭＩ品は棚卸対象外です。<br>{1}<p>
	 */
	public static String MSBEL0098 = "MSBEL0098";

	/** LEVEL[W]<br>返品検収前の在庫は棚卸対象外です。<br>{1}<p>
	 */
	public static String MSBEL0099 = "MSBEL0099";

	/** LEVEL[W]<br>仕入検収前の在庫は棚卸対象外です。<br>{1}<p>
	 */
	public static String MSBEL0100 = "MSBEL0100";

	/** LEVEL[W]<br>積送中の在庫は棚卸対象外です。<br>{1}<p>
	 */
	public static String MSBEL0101 = "MSBEL0101";

	/** LEVEL[W]<br>既に存在する在庫のため追加できません。<br>{1}<p>
	 */
	public static String MSBEL0102 = "MSBEL0102";

	/** LEVEL[W]<br>指定の日付以降で棚卸を実施しているため、理論在庫は作成できません。<br>{1}<p>
	 */
	public static String MSBEL0103 = "MSBEL0103";

	/** LEVEL[W]<br>以前に開始した棚卸がまだ終了していないため、理論在庫は作成できません。<br>{1}<p>
	 */
	public static String MSBEL0104 = "MSBEL0104";

	/** LEVEL[W]<br>実棚入力が完了していないため、在庫確定できません。<br>{1}<p>
	 */
	public static String MSBEL0105 = "MSBEL0105";

	/** LEVEL[W]<br>理論在庫作成後に在庫が更新されました。理論在庫を再作成するか、理論在庫チェック不要をオンにして実行してください。<br>{1}<p>
	 */
	public static String MSBEL0106 = "MSBEL0106";

	/** LEVEL[W]<br>棚卸を開始していないため、出力できません。<br>{1}<p>
	 */
	public static String MSBEL0107 = "MSBEL0107";

	/** LEVEL[W]<br>理論在庫の数量がマイナスとなるため更新できません。<br>{1}<p>
	 */
	public static String MSBEL0108 = "MSBEL0108";

	/** LEVEL[W]<br>出荷依頼先として登録されていません。<br>出荷依頼先識別区分：{1}<br>{2}<p>
	 */
	public static String MSBEL0109 = "MSBEL0109";

	/** LEVEL[W]<br>打切済のため、移動実績を登録できません。<br>移動引当状況ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0110 = "MSBEL0110";

	/** LEVEL[W]<br>指定された取引は計画外入荷できません。<br>下記の取引パタン区分が指定された取引を指定してください。<br>取引パタン区分：「入荷」「出荷返品」<br>取引ＣＤ：{1}<br>取引パタン区分：{2}<br>{3}<p>
	 */
	public static String MSBEL0111 = "MSBEL0111";

	/** LEVEL[W]<br>入荷できません。<br>計画外入荷（「無償受給」「ＶＭＩ」「預り在庫」、および「貸出返品」）で扱える入荷の良品区分は「良品」のみです。<br>{1}<p>
	 */
	public static String MSBEL0112 = "MSBEL0112";

	/** LEVEL[W]<br>インボイス取引対象の発注先は計画外入荷できません。<br>発注先：{1}<br>{2}<p>
	 */
	public static String MSBEL0113 = "MSBEL0113";

	/** LEVEL[W]<br>指定の取引パタン区分では未着管理はできません。<br>{1}<p>
	 */
	public static String MSBEL0114 = "MSBEL0114";

	/** LEVEL[W]<br>ロットが未確定のため、入荷できません。<br>{1}<p>
	 */
	public static String MSBEL0115 = "MSBEL0115";

	/** LEVEL[W]<br>未着管理の入荷は打ち切りできません。<br>{1}<p>
	 */
	public static String MSBEL0116 = "MSBEL0116";

	/** LEVEL[W]<br>入荷場所が社外の場合、ＶＭＩ品の入荷はできません。<br>{1}<p>
	 */
	public static String MSBEL0117 = "MSBEL0117";

	/** LEVEL[W]<br>出荷元期限が指定されていないため、登録できません。<br>{1}<p>
	 */
	public static String MSBEL0118 = "MSBEL0118";

	/** LEVEL[W]<br>下請対象の発注先から計画外の入荷はできません。<br>{1}<p>
	 */
	public static String MSBEL0119 = "MSBEL0119";

	/** LEVEL[W]<br>同時計上でないため、登録できません。<br>下請対象の発注先は入荷と仕入を同時に登録してください。<br>{1}<p>
	 */
	public static String MSBEL0120 = "MSBEL0120";

	/** LEVEL[W]<br>仕入検収済みのため、更新できません。<br>{1}<p>
	 */
	public static String MSBEL0121 = "MSBEL0121";

	/** LEVEL[W]<br>未着管理の場合、入荷数には仕入数以下の数量を指定してください。<br>{1}<p>
	 */
	public static String MSBEL0122 = "MSBEL0122";

	/** LEVEL[W]<br>同時計上をオンからオフ、またはオフからオンに変更できません。<br>{1}<p>
	 */
	public static String MSBEL0123 = "MSBEL0123";

	/** LEVEL[W]<br>購買適用開始日が納入希望日以前の版マスタが登録されていません。<br>品目：{1}<br>工場・物流倉庫ＣＤ：{2}<br>納入希望日：{3}<br>{4}<p>
	 */
	public static String MSBEL0124 = "MSBEL0124";

	/** LEVEL[W]<br>仕入直送で未着管理はできません。<br>{1}<p>
	 */
	public static String MSBEL0125 = "MSBEL0125";

	/** LEVEL[W]<br>製造指図ＮＯが設定されていないため、入荷できません。<br>{1}<p>
	 */
	public static String MSBEL0126 = "MSBEL0126";

	/** LEVEL[W]<br>売上計上済みのため、更新できません。<br>{1}<p>
	 */
	public static String MSBEL0127 = "MSBEL0127";

	/** LEVEL[W]<br>指定したインボイスに含まれる品目は、売上・出荷が禁止されています。<br>インボイスＮＯ：{1}<br>品目：{2}<br>完了日：{3}<br>{4}<p>
	 */
	public static String MSBEL0128 = "MSBEL0128";

	/** LEVEL[W]<br>返品元場所と入荷場所の物流グループが異なるため入荷できません。<br>返品元場所ＣＤ：{1}<br>返品元物流グループＣＤ：{2}<br>入荷場所ＣＤ：{3}<br>入荷物流グループＣＤ：{4}<br>{5}<p>
	 */
	public static String MSBEL0129 = "MSBEL0129";

	/** LEVEL[W]<br>移送、移送返品、支給、および支給返品の入荷は打切できません。<p>
	 */
	public static String MSBEL0130 = "MSBEL0130";

	/** LEVEL[W]<br>打切済みのため、取り消しできません。<br>取り消しする場合は、先に打切を解除してください。<br>{1}<p>
	 */
	public static String MSBEL0131 = "MSBEL0131";

	/** LEVEL[W]<br>仕入検収済みのため、取り消しできません。<br>{1}<p>
	 */
	public static String MSBEL0132 = "MSBEL0132";

	/** LEVEL[W]<br>売上計上済みのため、取り消しできません。<br>{1}<p>
	 */
	public static String MSBEL0133 = "MSBEL0133";

	/** LEVEL[W]<br>指定されたインボイスが存在しません。<br>インボイスＮＯ：{1}<p>
	 */
	public static String MSBEL0134 = "MSBEL0134";

	/** LEVEL[W]<br>指定されたインボイスは既に輸出実績が登録済のため、更新できません。<br>インボイスＮＯ：{1}<p>
	 */
	public static String MSBEL0135 = "MSBEL0135";

	/** LEVEL[W]<br>指定されたインボイスはパッキングリストの登録対象外です。<br>インボイスＮＯ：{1}<p>
	 */
	public static String MSBEL0136 = "MSBEL0136";

	/** LEVEL[W]<br>品目、品名、手配ＮＯ、原産地、単位、得意先注文ＮＯ、得意先注文明細ＮＯ、得意先品目、得意先品名単位で合計した数量がインボイス明細の合計数量と一致しません。<br>品目：{1}<br>品名：{2}<br>手配ＮＯ：{3}<br>原産地：{4}<br>単位：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<br>得意先品目：{8}<br>得意先品名：{9}<p>
	 */
	public static String MSBEL0137 = "MSBEL0137";

	/** LEVEL[W]<br>指定された出荷予定は在庫品ではないため、対象外です。<p>
	 */
	public static String MSBEL0138 = "MSBEL0138";

	/** LEVEL[W]<br>指定された出荷予定は保留ではないため、対象外です。<p>
	 */
	public static String MSBEL0139 = "MSBEL0139";

	/** LEVEL[W]<br>同じ納品書ＮＯに紐づく納品書明細において、計上日、税率、為替レート、納税為替レート、源泉税率、基準通貨ＣＤ、納税通貨ＣＤが異なる明細があるため更新できません。<br>納品書ＮＯ：{1}<p>
	 */
	public static String MSBEL0140 = "MSBEL0140";

	/** LEVEL[W]<br>指定された出荷予定引当区分が、即引当または後引当ではないため、対象外です。<p>
	 */
	public static String MSBEL0141 = "MSBEL0141";

	/** LEVEL[W]<br>変更可能な出荷予定、引当可能な在庫・入庫予定がありません。<p>
	 */
	public static String MSBEL0142 = "MSBEL0142";

	/** LEVEL[W]<br>指定したインボイスの出荷依頼先は、売上・出荷が禁止されています。<br>出荷依頼先：{1}<br>完了日：{2}<br>{3}<p>
	 */
	public static String MSBEL0143 = "MSBEL0143";

	/** LEVEL[W]<br>出荷時の荷姿単位に換算できないため、輸出実績が登録できません。<br>インボイスＮＯ：{1}<br>インボイス明細ＮＯ：{2}<br>基準単位数量：{3}<br>出荷時の荷姿単位：{4}<p>
	 */
	public static String MSBEL0144 = "MSBEL0144";

	/** LEVEL[W]<br>インボイス単位出荷はできません。インボイスまとめ対象の出荷予定が、すでに出荷指図または出荷実績登録されています。<br>出荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0145 = "MSBEL0145";

	/** LEVEL[W]<br>インボイスＮＯに「{1}」は指定できません。<p>
	 */
	public static String MSBEL0146 = "MSBEL0146";

	/** LEVEL[W]<br>発番しようとしたインボイスＮＯは既に存在します。<p>
	 */
	public static String MSBEL0147 = "MSBEL0147";

	/** LEVEL[W]<br>既にパッキングリストが登録されているため、インボイスを取消できません。<p>
	 */
	public static String MSBEL0148 = "MSBEL0148";

	/** LEVEL[W]<br>インボイス単位出荷とする場合は、インボイスの数量を、出荷予定の数量から変更できません。<br>インボイスの数量：{1}<br>出荷予定の数量：{2}<br>{3}<p>
	 */
	public static String MSBEL0149 = "MSBEL0149";

	/** LEVEL[W]<br>振替元の引当数量を超える数量を振り替えることはできません。<br>{1}<p>
	 */
	public static String MSBEL0150 = "MSBEL0150";

	/** LEVEL[W]<br>引当振替数量の合計が、振替先の保留数量を超えているため登録できません。<br>保留数量：{1}<br>引当振替数量の合計：{2}<p>
	 */
	public static String MSBEL0151 = "MSBEL0151";

	/** LEVEL[E]<br>受払区分が判定できません。<br>取引パタン区分：{1}<br>トランザクション区分：{2}<p>
	 */
	public static String MSBEL0152 = "MSBEL0152";

	/** LEVEL[W]<br>合計が出荷予定数量と異なる数量は指定できません。<br>出荷予定ＮＯ：{1}<br>出荷予定数量：{2}<br>入力合計：{3}<br>{4}<p>
	 */
	public static String MSBEL0153 = "MSBEL0153";

	/** LEVEL[W]<br>出荷予定に対して、全数を打ち切ることはできません。全数打ち切る場合は依頼元の受注または移動・移送予定を取り消してください。<br>出荷予定ＮＯ：{1}<p>
	 */
	public static String MSBEL0154 = "MSBEL0154";

	/** LEVEL[W]<br>物流制御マスタが登録されていません。<br>出荷先物流グループＣＤ：{1}<br>出荷元物流グループＣＤ：{2}<br>出荷条件ＣＤ：{3}<p>
	 */
	public static String MSBEL0155 = "MSBEL0155";

	/** LEVEL[W]<br>出荷元のカレンダＣＤが設定されていません。<br>物流グループマスタ、または会社マスタの設定を確認してください。<br>出荷元物流グループＣＤ：{1}<p>
	 */
	public static String MSBEL0156 = "MSBEL0156";

	/** LEVEL[W]<br>出荷先のカレンダＣＤが設定されていません。<br>場所マスタ、または会社マスタの設定を確認してください。<br>送付先識別区分：{1}<br>送付先識別区分ＣＤ：{2}<p>
	 */
	public static String MSBEL0157 = "MSBEL0157";

	/** LEVEL[W]<br>出荷先のカレンダＣＤが設定されていません。<br>取引先マスタ、または会社マスタの設定を確認してください。<br>送付先識別区分：{1}<br>送付先識別区分ＣＤ：{2}<p>
	 */
	public static String MSBEL0158 = "MSBEL0158";

	/** LEVEL[W]<br>出荷可能な日が取得できませんでした。<br>出荷先物流グループＣＤ：{1}<br>出荷元物流グループＣＤ：{2}<br>出荷条件ＣＤ：{3}<br>着曜日：{4}<p>
	 */
	public static String MSBEL0159 = "MSBEL0159";

	/** LEVEL[W]<br>出荷可能な日が取得できませんでした。<br>出荷先物流グループＣＤ：{1}<br>出荷元物流グループＣＤ：{2}<br>出荷条件ＣＤ：{3}<p>
	 */
	public static String MSBEL0160 = "MSBEL0160";

	/** LEVEL[W]<br>納品可能な日が取得できませんでした。<br>出荷先物流グループＣＤ：{1}<br>出荷元物流グループＣＤ：{2}<br>出荷条件ＣＤ：{3}<br>着曜日：{4}<p>
	 */
	public static String MSBEL0161 = "MSBEL0161";

	/** LEVEL[I]<br>納品予定日時が納入希望日時よりも後の出荷予定があります。<br>納品予定日時：{1}<br>納入希望日時：{2}<br>{3}<p>
	 */
	public static String MSBEL0162 = "MSBEL0162";

	/** LEVEL[I]<br>出荷予定日時が出荷希望日時よりも後の出荷予定があります。<br>出荷予定日時：{1}<br>出荷希望日時：{2}<br>{3}<p>
	 */
	public static String MSBEL0163 = "MSBEL0163";

	/** LEVEL[W]<br>振替先に引当できない振替元明細です。<br>{1}<p>
	 */
	public static String MSBEL0164 = "MSBEL0164";

	/** LEVEL[W]<br>自社から外注先へ移動・移送するインボイス取引の場合、在庫識別区分には「自社在庫」「VMI」「無償受給」のいずれかを指定してください。<br>出庫場所ＣＤ：{1}<br>入庫場所ＣＤ：{2}<br>在庫識別区分：{3}<br>{4}<p>
	 */
	public static String MSBEL0165 = "MSBEL0165";

	/** LEVEL[W]<br>取引通貨と納税通貨に対する為替レートが取得できませんでした。為替レートマスタを設定してください。<br>取引通貨：{1}<br>納税通貨：{2}<br>適用日：{3}<br>{4}<p>
	 */
	public static String MSBEL0166 = "MSBEL0166";

	/** LEVEL[W]<br>指定された取引は利用できません。<br>下記の取引パタン区分が指定された取引を指定してください。<br>取引パタン区分：「仕入」「経費購買」「売上返品」「出荷返品」「移動・移送」「移動・移送返品」「支給」「支給返品」「入荷」<br>取引ＣＤ：{1}<br>取引パタン区分：{2}<br>{3}<p>
	 */
	public static String MSBEL0167 = "MSBEL0167";

	/** LEVEL[W]<br>入荷の取引で資産管理しない品目は、経費購買以外の理由は設定できません。<br>取引ＣＤ：{1}<br>品目：{2}<br>理由ＣＤ：{3}<br>{4}<p>
	 */
	public static String MSBEL0168 = "MSBEL0168";

	/** LEVEL[W]<br>出庫数を満たす貸出在庫が存在しません。<br>品目：{1}<br>在庫着荷先：{2}<br>ロットＮＯ：{3}<br>サブロットＮＯ：{4}<br>手配ＮＯ：{5}<br>確定ＮＯ区分：{6}<br>確定ＮＯ：{7}<br>荷姿単位：{8}<br>格付：{9}<br>積送品区分：{10}<br>良品区分：{11}<br>在庫検査区分：{12}<br>在庫識別区分：{13}<br>在庫取引先：{14}<p>
	 */
	public static String MSBEL0169 = "MSBEL0169";

	/** LEVEL[W]<br>出庫数を満たす在庫が存在しません。<br>品目：{1}<br>場所：{2}<br>棚・ライン：{3}<br>在庫着荷先：{4}<br>ロットＮＯ：{5}<br>サブロットＮＯ：{6}<br>手配ＮＯ：{7}<br>荷姿単位：{8}<br>格付：{9}<br>積送品区分：{10}<br>良品区分：{11}<br>在庫検査区分：{12}<br>在庫識別区分：{13}<br>在庫取引先：{14}<p>
	 */
	public static String MSBEL0170 = "MSBEL0170";

	/** LEVEL[W]<br>検査済でない在庫が存在しません。<br>品目：{1}<br>場所：{2}<br>棚・ライン：{3}<br>在庫着荷先：{4}<br>ロットＮＯ：{5}<br>サブロットＮＯ：{6}<br>手配ＮＯ：{7}<br>荷姿単位：{8}<br>格付：{9}<br>積送品区分：{10}<br>良品区分：{11}<br>在庫検査区分：{12}<br>在庫識別区分：{13}<br>在庫取引先：{14}<p>
	 */
	public static String MSBEL0171 = "MSBEL0171";

	/** LEVEL[W]<br>出荷実績が登録されているため、取消できません。<br>出荷指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0172 = "MSBEL0172";

	/** LEVEL[W]<br>確定ＮＯ区分が「なし」の在庫に対して確定ＮＯが指定されています。<br>確定ＮＯ区分:{1}<br>確定ＮＯ:{2}<br>{3}<p>
	 */
	public static String MSBEL0173 = "MSBEL0173";

	/** LEVEL[W]<br>出荷する在庫が確定していないため、登録できません。<br>出荷指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0174 = "MSBEL0174";

	/** LEVEL[W]<br>貸出在庫が存在しないため、入荷予定が作成できません。<p>
	 */
	public static String MSBEL0175 = "MSBEL0175";

	/** LEVEL[W]<br>得意先抽出区分を指定した場合は、得意先を指定してください。<p>
	 */
	public static String MSBEL0176 = "MSBEL0176";

	/** LEVEL[W]<br>得意先を指定した場合は、得意先抽出区分を指定してください。<p>
	 */
	public static String MSBEL0177 = "MSBEL0177";

	/** LEVEL[W]<br>引当処理中に出荷予定が更新されたため、引当処理を実施しませんでした。再実行してください。<br>場所ＣＤ：{1}<br>物流グループＣＤ：{2}<br>総量引当グループＣＤ：{3}<br>品目：{4}<p>
	 */
	public static String MSBEL0178 = "MSBEL0178";

	/** LEVEL[I]<br>在庫一括引当処理が終了しました。<br>処理対象件数：{1}<br>全数引当できた件数：{2}<br>一部引当できた件数：{3}<br>引当できなかった件数：{4}<br>エラー件数：{5}<p>
	 */
	public static String MSBEL0179 = "MSBEL0179";

	/** LEVEL[W]<br>物流制御マスタが登録されていません。<br>出荷元物流グループＣＤ：{1}<br>出荷先物流グループＣＤ：{2}<br>出荷条件ＣＤ：{3}<br>{4}<p>
	 */
	public static String MSBEL0180 = "MSBEL0180";

	/** LEVEL[I]<br>在庫再引当処理を開始します。<p>
	 */
	public static String MSBEL0181 = "MSBEL0181";

	/** LEVEL[I]<br>在庫再引当処理が終了しました。<br>処理対象件数：{1}<br>全数引当できた件数：{2}<br>一部引当できた件数：{3}<br>引当できなかった件数：{4}<br>エラー件数：{5}<p>
	 */
	public static String MSBEL0182 = "MSBEL0182";

	/** LEVEL[W]<br>自給品は登録できません。<br>{1}<p>
	 */
	public static String MSBEL0183 = "MSBEL0183";

	/** LEVEL[W]<br>確定ＮＯが設定されている貸出在庫は棚卸対象外です。<br>{1}<p>
	 */
	public static String MSBEL0184 = "MSBEL0184";

	/** LEVEL[W]<br>指定の在庫着荷先は棚卸対象外です。<br>{1}<p>
	 */
	public static String MSBEL0185 = "MSBEL0185";

	/** LEVEL[W]<br>指定の制御対象日あるいは棚卸年月ではまだ棚卸を実施できません。<br>{1}<p>
	 */
	public static String MSBEL0186 = "MSBEL0186";

	/** LEVEL[W]<br>指定の場所、良品区分、在庫検査区分、積送品区分、在庫識別区分、在庫取引先、確定ＮＯ有無、在庫着荷先の組み合わせでは登録できません。<br>{1}<p>
	 */
	public static String MSBEL0187 = "MSBEL0187";

	/** LEVEL[W]<br>支給の取引を選択した場合、入庫場所には外注場所を登録してください。<br>取引ＣＤ：{1}<br>入庫場所ＣＤ：{2}<p>
	 */
	public static String MSBEL0188 = "MSBEL0188";

	/** LEVEL[W]<br>支給返品の取引を選択した場合、入庫場所には社内場所を登録してください。<br>取引ＣＤ：{1}<br>入庫場所ＣＤ：{2}<p>
	 */
	public static String MSBEL0189 = "MSBEL0189";

	/** LEVEL[W]<br>支給返品の取引を選択した場合、出庫場所には外注場所を登録してください。<br>取引ＣＤ：{1}<br>出庫場所ＣＤ：{2}<p>
	 */
	public static String MSBEL0190 = "MSBEL0190";

	/** LEVEL[W]<br>移動・移送、もしくは移動・移送返品の取引を選択した場合、入庫場所には社内場所を登録してください。<br>取引ＣＤ：{1}<br>入庫場所ＣＤ：{2}<p>
	 */
	public static String MSBEL0191 = "MSBEL0191";

	/** LEVEL[W]<br>移動・移送、もしくは移動・移送返品の取引を選択した場合、出庫場所には社内場所を登録してください。<br>取引ＣＤ：{1}<br>出庫場所ＣＤ：{2}<p>
	 */
	public static String MSBEL0192 = "MSBEL0192";

	/** LEVEL[W]<br>同一の受領インボイスＮＯで複数件のデータが登録されています。受領インボイス一覧照会画面で対象の受領インボイスを選択して本画面に画面遷移してください。<br>受領インボイスＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0194 = "MSBEL0194";

	/** LEVEL[W]<br>引当済のため、引当できません。<br>移動引当状況ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0195 = "MSBEL0195";

	/** LEVEL[W]<br>未引当のため、引当解除できません。<br>移動引当状況ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0196 = "MSBEL0196";

	/** LEVEL[W]<br>引当可能な在庫、受払予定が存在しないため、引当できませんでした。<br>{1}<p>
	 */
	public static String MSBEL0197 = "MSBEL0197";

	/** LEVEL[W]<br>伝票帳票が取得できませんでした。<br>取引先マスタ、または取引マスタを確認してください。<br>取引先ＣＤ：{1}<br>取引ＣＤ：{2}<p>
	 */
	public static String MSBEL0198 = "MSBEL0198";

	/** LEVEL[W]<br>出庫場所が設定されていません。先に引当するか、移動実績登録画面で登録してください。<br>{1}<p>
	 */
	public static String MSBEL0199 = "MSBEL0199";

	/** LEVEL[W]<br>移動・移送予定ＮＯ単位での基準単位数量の合計が更新前後で一致していません。<br>移動・移送予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0200 = "MSBEL0200";

	/** LEVEL[W]<br>移動実績ＮＯ、移動実績明細ＮＯ、データ更新区分の組み合わせが不正です。<br>移動実績ＮＯ：{1}<br>移動実績明細ＮＯ：{2}<br>データ更新区分：{3}<p>
	 */
	public static String MSBEL0201 = "MSBEL0201";

	/** LEVEL[W]<br>インボイス単位出荷はできません。受注インボイスＮＯが同じ出荷予定がインボイス登録対象に含まれていません。<br>出荷予定ＮＯ：{1}<p>
	 */
	public static String MSBEL0202 = "MSBEL0202";

	/** LEVEL[W]<br>選択した出荷予定ＮＯの出荷予定が取得できませんでした。<br>出荷予定ＮＯ：{1}<p>
	 */
	public static String MSBEL0203 = "MSBEL0203";

	/** LEVEL[W]<br>インボイス単位出荷のインボイスが混在しているため出荷できません。<br>インボイスＮＯ：{1}<p>
	 */
	public static String MSBEL0204 = "MSBEL0204";

	/** LEVEL[W]<br>受注登録時に指定したインボイスＮＯに対して、インボイスが登録されていないため出荷できません。<br>インボイスＮＯ：{1}<p>
	 */
	public static String MSBEL0205 = "MSBEL0205";

	/** LEVEL[W]<br>インボイス単位出荷でインボイス登録された出荷予定が含まれているため出荷できません。<br>出荷予定ＮＯ：{1}<br>インボイスＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBEL0206 = "MSBEL0206";

	/** LEVEL[W]<br>インボイス単位出荷でインボイス登録された出荷予定が含まれているため出荷指図を登録できません。<br>出荷予定ＮＯ：{1}<br>インボイスＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBEL0207 = "MSBEL0207";

	/** LEVEL[W]<br>出荷対象がありません。<p>
	 */
	public static String MSBEL0208 = "MSBEL0208";

	/** LEVEL[W]<br>有償支給対象に指定していますが、支給単価マスタから単価を取得できませんでした。無償支給とするか、単価を指定してください。<br>品目ＣＤ：{1}<br>支給先ＣＤ：{2}<br>通貨ＣＤ：{3}<br>ワーキンググループＣＤ：{4}<br>適用日：{5}<br>{6}<p>
	 */
	public static String MSBEL0209 = "MSBEL0209";

	/** LEVEL[W]<br>取引先マスタ、品目マスタ、会社マスタのいずれからも支給税ＣＤが取得できませんでした。支給税ＣＤを指定してください。<br>品目ＣＤ：{1}<br>支給先ＣＤ：{2}<br>適用日：{3}<br>{4}<p>
	 */
	public static String MSBEL0210 = "MSBEL0210";

	/** LEVEL[W]<br>入庫場所と出庫場所は異なる場所を指定してください。<br>入庫場所：{1}<br>出庫場所：{2}<br>{3}<p>
	 */
	public static String MSBEL0211 = "MSBEL0211";

	/** LEVEL[W]<br>移動・移送、移動・移送返品、もしくは支給返品の取引を選択した場合、納品先には社内場所を登録してください。<br>取引ＣＤ：{1}<br>納品先識別ＣＤ：{2}<p>
	 */
	public static String MSBEL0212 = "MSBEL0212";

	/** LEVEL[W]<br>支給の取引を選択した場合、納品先には外注場所を登録してください。<br>取引ＣＤ：{1}<br>納品先識別ＣＤ：{2}<p>
	 */
	public static String MSBEL0213 = "MSBEL0213";

	/** LEVEL[W]<br>売上、出荷、移動・移送、移動・移送返品の取引を選択した場合、出荷場所には社内場所を登録してください。<br>取引ＣＤ：{1}<br>出荷場所ＣＤ：{2}<br>{3}<p>
	 */
	public static String MSBEL0214 = "MSBEL0214";

	/** LEVEL[W]<br>支給返品の取引を選択した場合、出荷場所には外注場所を登録してください。<br>取引ＣＤ：{1}<br>出荷場所ＣＤ：{2}<br>{3}<p>
	 */
	public static String MSBEL0215 = "MSBEL0215";

	/** LEVEL[W]<br>売上、もしくは出荷で扱える在庫は、自社在庫、預りのみです。<br>上記以外の在庫は出荷できません。<br>取引ＣＤ：{1}<br>在庫識別区分：{2}<br>{3}<p>
	 */
	public static String MSBEL0216 = "MSBEL0216";

	/** LEVEL[W]<br>移動・移送、もしくは移動・移送返品の取引で扱える在庫は、自社在庫、返品検収前、預り、ＶＭＩ、検収不良、無償受給のみです。<br>上記以外の在庫は出荷できません。<br>取引ＣＤ：{1}<br>在庫識別区分：{2}<br>{3}<p>
	 */
	public static String MSBEL0217 = "MSBEL0217";

	/** LEVEL[W]<br>支給の取引で扱える在庫は、自社在庫、ＶＭＩ、無償受給、有償支給のみです。<br>上記以外の在庫は出荷できません。<br>取引ＣＤ：{1}<br>在庫識別区分：{2}<br>{3}<p>
	 */
	public static String MSBEL0218 = "MSBEL0218";

	/** LEVEL[W]<br>支給返品の取引で扱える在庫は、自社在庫、検収不良、無償受給、有償支給のみです。<br>上記以外の在庫は出荷できません。<br>取引ＣＤ：{1}<br>在庫識別区分：{2}<br>{3}<p>
	 */
	public static String MSBEL0219 = "MSBEL0219";

	/** LEVEL[W]<br>有償支給もしくは無償支給の在庫、または支給返品の取引でかつ検収不良、無償受給の在庫の場合、在庫着荷先には発注先を指定してください。<br>取引ＣＤ：{1}<br>在庫識別区分：{2}<br>在庫着荷先ＣＤ：{3}<br>{4}<p>
	 */
	public static String MSBEL0220 = "MSBEL0220";

	/** LEVEL[W]<br>支給区分に自給は指定できません。「無償支給」または「有償支給」を指定してください。<br>{1}<p>
	 */
	public static String MSBEL0221 = "MSBEL0221";

	/** LEVEL[W]<br>返品検収前、預りの在庫の場合、在庫取引先には得意先を指定してください。<br>取引ＣＤ：{1}<br>在庫識別区分：{2}<br>在庫取引先ＣＤ：{3}<br>{4}<p>
	 */
	public static String MSBEL0222 = "MSBEL0222";

	/** LEVEL[W]<br>ＶＭＩ、検収不良、無償受給、有償支給の在庫の場合、在庫取引先には発注先を指定してください。<br>取引ＣＤ：{1}<br>在庫識別区分：{2}<br>在庫取引先ＣＤ：{3}<br>{4}<p>
	 */
	public static String MSBEL0223 = "MSBEL0223";

	/** LEVEL[W]<br>在庫検査区分が「４：検査済」以外の場合、工場・物流倉庫が入庫場所と一致する出庫場所を指定してください。<br><br>入庫工場・物流倉庫ＣＤ：{1}<br>出庫工場・物流倉庫ＣＤ：{2}<p>
	 */
	public static String MSBEL0224 = "MSBEL0224";

	/** LEVEL[W]<br>入庫場所もしくは出庫場所が外注先の場合、指定した良品区分は使用できません。<br>入庫場所ＣＤ：{1}<br>出庫場所ＣＤ：{2}<br>良品区分：{3}<p>
	 */
	public static String MSBEL0225 = "MSBEL0225";

	/** LEVEL[W]<br>インボイス取引対象の場合、出荷予定数量を上回る出荷指図数量は指定できません。<br>出荷予定ＮＯ：{1}<br>出荷指図数量：{2}<br>出荷予定数量：{3}<p>
	 */
	public static String MSBEL0226 = "MSBEL0226";

	/** LEVEL[W]<br>インボイス情報を登録済の場合、打切はできません。<br>出荷予定ＮＯ：{1}<p>
	 */
	public static String MSBEL0227 = "MSBEL0227";

	/** LEVEL[W]<br>インボイス単位出荷の場合、インボイス数量と異なる出荷指図数量は指定できません。<br>Ｉ／Ｖ明細ＮＯ：{1}<br>出荷指図数量：{2}<br>インボイス数量：{3}<br>{4}<p>
	 */
	public static String MSBEL0228 = "MSBEL0228";

	/** LEVEL[W]<br>引当可能な在庫、受払予定が足りませんでした。<br>{1}<p>
	 */
	public static String MSBEL0229 = "MSBEL0229";

	/** LEVEL[W]<br>実績計上済の指図があります。そのため取消できません。<p>
	 */
	public static String MSBEL0230 = "MSBEL0230";

	/** LEVEL[W]<br>販売単価が取得できないため、受注なしの出荷実績は登録できません。<br>販売単価に関するマスタを確認するか、受注を登録してから出荷実績を登録してください。<br>{1}<p>
	 */
	public static String MSBEL0231 = "MSBEL0231";

	/** LEVEL[W]<br>輸出対象の出荷予定の出荷実績数が輸出対象数量を満たしません。<br>インボイスＮＯ：{1}<br>インボイス明細ＮＯ：{2}<br>出荷予定ＮＯ：{3}<br>数量(基準単位)：{4}<p>
	 */
	public static String MSBEL0232 = "MSBEL0232";

	/** LEVEL[W]<br>資産管理対象外のＶＭＩ品は入荷できません。<br>{1}<p>
	 */
	public static String MSBEL0233 = "MSBEL0233";

	/** LEVEL[W]<br>売上済です。出荷予定は訂正、取消できません。<br>{1}<p>
	 */
	public static String MSBEL0234 = "MSBEL0234";

	/** LEVEL[W]<br>出荷対象の受注が出荷許可と判定されていないため、出荷できません。受注を確認してください。<br>受注ＮＯ：{1}<br>出荷予定ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBEL0235 = "MSBEL0235";

	/** LEVEL[W]<br>出荷留めが指定されているため、出荷指図を登録できません。<br>出荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0236 = "MSBEL0236";

	/** LEVEL[W]<br>出荷許可と判定されていないため、出荷指図を登録できません。<br>出荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0237 = "MSBEL0237";

	/** LEVEL[W]<br>品揃区分が「2：品揃する」の受注、もしくは品揃グループＮＯが指定されている受注について、明細が一部含まれていないため、出荷指図を登録できません。<br>受注ＮＯ：{1}<br>品揃区分：{2}<br>品揃グループＮＯ：{3}<br>出荷予定ＮＯ：{4}<br>{5}<p>
	 */
	public static String MSBEL0238 = "MSBEL0238";

	/** LEVEL[W]<br>品揃区分が「2：品揃する」の受注、もしくは品揃グループＮＯが指定されている受注について、数量を分割して出荷指図を登録できません。<br>受注ＮＯ：{1}<br>品揃区分：{2}<br>品揃グループＮＯ：{3}<br>出荷予定ＮＯ：{4}<br>予定数量(基準単位)：{5}<br>出荷数量(基準単位)：{6}<br>{7}<p>
	 */
	public static String MSBEL0239 = "MSBEL0239";

	/** LEVEL[W]<br>出荷返品対象の在庫が存在しないため、入荷予定を作成できません。<p>
	 */
	public static String MSBEL0240 = "MSBEL0240";

	/** LEVEL[W]<br>仕入・入荷禁止の発注先のため、入荷実績は登録できません。<br>発注先：{1}<br>{2}<p>
	 */
	public static String MSBEL0241 = "MSBEL0241";

	/** LEVEL[W]<br>仕入・入荷禁止の品目のため、入荷実績は登録できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBEL0242 = "MSBEL0242";

	/** LEVEL[W]<br>出荷指図禁止の得意先のため、出荷指図は登録できません。<br>得意先：{1}<br>出荷指図日：{2}<br>出荷指図禁止日：{3}<br>{4}<p>
	 */
	public static String MSBEL0243 = "MSBEL0243";

	/** LEVEL[W]<br>出荷指図禁止の品目のため、出荷指図は登録できません。<br>品目：{1}<br>出荷指図日：{2}<br>出荷指図禁止日：{3}<br>{2}<p>
	 */
	public static String MSBEL0244 = "MSBEL0244";

	/** LEVEL[W]<br>売上・出荷禁止の得意先のため、出荷実績は登録できません。<br>得意先：{1}<br>出荷日：{2}<br>売上・出荷禁止日：{3}<br>{4}<p>
	 */
	public static String MSBEL0245 = "MSBEL0245";

	/** LEVEL[W]<br>出荷場所に社内場所、社外場所が混在しているため支給の出荷実績は登録できません。<br>出荷場所には社内場所のみ、または同一の社外場所のみを指定してください。<br>{1}<p>
	 */
	public static String MSBEL0246 = "MSBEL0246";

	/** LEVEL[W]<br>入荷数量が予定数量と異なるため入荷できません。<br>入荷予定ＮＯ：{1}<br>入荷予定数量（基準単位）：{2}<br>合計の入荷数量（基準単位）：{3}<br>{4}<p>
	 */
	public static String MSBEL0247 = "MSBEL0247";

	/** LEVEL[W]<br>計画外の出荷実績では、インボイス取引対象の得意先を指定できません。<p>
	 */
	public static String MSBEL0248 = "MSBEL0248";

	/** LEVEL[W]<br>指定した受領インボイスＮＯが複数件存在します。受領インボイス一覧照会画面から遷移してください。<p>
	 */
	public static String MSBEL0249 = "MSBEL0249";

	/** LEVEL[W]<br>在庫管理しない品目は、登録できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBEL0250 = "MSBEL0250";

	/** LEVEL[W]<br>資産管理しない品目は、有償支給できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBEL0251 = "MSBEL0251";

	/** LEVEL[W]<br>自動時採用フラグがオンのレコードが取得できませんでした。取引マスタの設定を確認してください。<br>取引パタン区分：{1}<br>{2}<p>
	 */
	public static String MSBEL0252 = "MSBEL0252";

	/** LEVEL[W]<br>取引先マスタで下請け対象として登録されている場合、有償支給時の支給計上区分は着荷基準または使用基準にしてください。<br>取引先ＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBEL0253 = "MSBEL0253";

	/** LEVEL[W]<br>出庫場所と入庫場所、出庫・棚ラインと入庫・棚ラインのいずれか一方は異なるように登録してください。<br>{1}<p>
	 */
	public static String MSBEL0254 = "MSBEL0254";

	/** LEVEL[W]<br>入出庫場所の物流グループが異なるか否かが変わる（移動⇔移送）更新はできません。取消を行った後、新規登録してください。<br>{1}<p>
	 */
	public static String MSBEL0255 = "MSBEL0255";

	/** LEVEL[W]<br>指図済など進捗状況が進んでいるため、更新できません。<br>移動移送予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0256 = "MSBEL0256";

	/** LEVEL[W]<br>進捗状況が未指図でないため、更新できません。<br>{1}<p>
	 */
	public static String MSBEL0257 = "MSBEL0257";

	/** LEVEL[W]<br>出荷元物流グループが混在しているため、インボイス単位出荷はできません。<p>
	 */
	public static String MSBEL0258 = "MSBEL0258";

	/** LEVEL[W]<br>打切りされているため、指図できません。<br>移動引当状況ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0259 = "MSBEL0259";

	/** LEVEL[W]<br>出荷指図区分がピッキングありでないため、指図できません。<br>移動引当状況ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0260 = "MSBEL0260";

	/** LEVEL[W]<br>物流標準場所が取得できませんでした。場所マスタの設定を確認してください。<br>物流グループＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBEL0261 = "MSBEL0261";

	/** LEVEL[W]<br>未指図であるため、実績を登録できません。<br>移動引当状況ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0262 = "MSBEL0262";

	/** LEVEL[W]<br>取引パタン区分が変わる更新はできません。取消を行った後、新規登録してください。<br>{1}<p>
	 */
	public static String MSBEL0263 = "MSBEL0263";

	/** LEVEL[W]<br>ワーキンググループ間の依頼は、マニュアル追加できません。ＷＧ間依頼登録画面などから登録してください。<br>{1}<p>
	 */
	public static String MSBEL0264 = "MSBEL0264";

	/** LEVEL[W]<br>処理結果件数が期待した件数と異なりました。<br>期待した件数：{1}<br>実際の結果件数：{2}<br>テーブル名：{3}<br>{4}<br>{5}<p>
	 */
	public static String MSBEL0265 = "MSBEL0265";

	/** LEVEL[W]<br>インボイスが登録されていないため出荷できません。<br>配送先を経由しないインボイス取引の場合、出荷作業を行う前にインボイス単位出荷でインボイスを登録してください。<p>
	 */
	public static String MSBEL0266 = "MSBEL0266";

	/** LEVEL[W]<br>インボイス単位出荷でないため出荷できません。<br>配送先を経由しないインボイス取引の場合、インボイス単位出荷でインボイスを登録してください。<p>
	 */
	public static String MSBEL0267 = "MSBEL0267";

	/** LEVEL[W]<br>物流標準場所が取得できません。出庫場所を指定するか、場所マスタで物流標準場所を指定してください。<br>物流グループＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBEL0268 = "MSBEL0268";

	/** LEVEL[W]<br>出庫場所には、入庫場所と同じ物流グループの場所を指定してください。<br>出庫場所の物流グループＣＤ：{1}<br>入庫場所の物流グループＣＤ：{2}<br>{3}<p>
	 */
	public static String MSBEL0269 = "MSBEL0269";

	/** LEVEL[W]<br>支給区分に「有償支給」を指定するには、支給先の有償支給先がオンである必要があります。支給区分に無償支給を指定するか、取引先マスタの有償支給先を確認してください。<br>支給先（取引先）：{1}<br>{2}<p>
	 */
	public static String MSBEL0270 = "MSBEL0270";

	/** LEVEL[W]<br>支給区分に「有償支給」を指定するには、品目の資産管理区分が「資産管理する」である必要があります。無償支給とするか、品目マスタの資産管理区分を確認してください。<br>品目：{1}<br>資産管理区分：{2}<br>{3}<p>
	 */
	public static String MSBEL0271 = "MSBEL0271";

	/** LEVEL[W]<br>取引と出庫場所、入庫場所の関係が不正です。<br>取引パタン区分が「移動・移送」または「移動・移送返品」となる取引の場合、出庫場所、入庫場所には社内場所を指定してください（空白は社内場所扱いです）。<br>取引ＣＤ：{1}<br>取引パタン区分：{2}<br>出庫場所ＣＤ：{3}<br>入庫場所ＣＤ：{4}<br>{5}<p>
	 */
	public static String MSBEL0272 = "MSBEL0272";

	/** LEVEL[W]<br>取引と入庫場所の関係が不正です。<br>取引パタン区分が「支給」となる取引の場合、入庫場所には外注場所を指定してください。<br>取引ＣＤ：{1}<br>取引パタン区分：{2}<br>入庫場所ＣＤ：{3}<br>{4}<p>
	 */
	public static String MSBEL0273 = "MSBEL0273";

	/** LEVEL[W]<br>取引と出庫場所の関係が不正です。<br>取引パタン区分が「支給返品」となる取引の場合、出庫場所には外注場所を指定してください。<br>取引ＣＤ：{1}<br>取引パタン区分：{2}<br>出庫場所ＣＤ：{3}<br>{4}<p>
	 */
	public static String MSBEL0274 = "MSBEL0274";

	/** LEVEL[W]<br>打切済のため、引当できません。<br>移動引当状況ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0275 = "MSBEL0275";

	/** LEVEL[W]<br>打切済のため、引当解除できません。<br>移動引当状況ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0276 = "MSBEL0276";

	/** LEVEL[W]<br>取引と良品区分の関係が不正です。<br>取引パタン区分が「支給」となる取引の場合、良品区分には良品を指定してください。<br>取引ＣＤ：{1}<br>取引パタン区分：{2}<br>良品区分：{3}<br>{4}<p>
	 */
	public static String MSBEL0277 = "MSBEL0277";

	/** LEVEL[W]<br>出庫場所が指定されていません。取引パタン区分が「支給返品」となる取引の場合、出庫場所には外注場所を必ず指定してください。<br>{1}<p>
	 */
	public static String MSBEL0278 = "MSBEL0278";

	/** LEVEL[W]<br>取引先マスタで得意先が指定されていません。<br>{1}<p>
	 */
	public static String MSBEL0279 = "MSBEL0279";

	/** LEVEL[W]<br>取引先マスタで発注先が指定されていません。<br>{1}<p>
	 */
	public static String MSBEL0280 = "MSBEL0280";

	/** LEVEL[W]<br>取引先マスタに有効な取引先が登録されていません。<br>{1}<p>
	 */
	public static String MSBEL0281 = "MSBEL0281";

	/** LEVEL[W]<br>出荷指図対象と出荷指図対象外の出荷予定が混在しているため、インボイス単位出荷はできません。<p>
	 */
	public static String MSBEL0282 = "MSBEL0282";

	/** LEVEL[W]<br>預り売上で売上が登録されていないため、出荷指図を登録できません。<br>受注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0283 = "MSBEL0283";

	/** LEVEL[W]<br>打ち切られた明細が含まれているため、出荷指図を取り消しできません。<br>{1}<p>
	 */
	public static String MSBEL0284 = "MSBEL0284";

	/** LEVEL[W]<br>インボイスが登録されていないため出荷指図を登録できません。<br>配送先を経由しないインボイス取引の場合、出荷作業を行う前にインボイス単位出荷でインボイスを登録してください。<br>{1}<p>
	 */
	public static String MSBEL0285 = "MSBEL0285";

	/** LEVEL[W]<br>インボイス単位出荷でないため出荷指図を登録できません。<br>配送先を経由しないインボイス取引の場合、インボイス単位出荷でインボイスを登録してください。<br>{1}<p>
	 */
	public static String MSBEL0286 = "MSBEL0286";

	/** LEVEL[W]<br>インボイス単位出荷は解除できません。インボイスまとめ対象の出荷予定が、すでに出荷指図または出荷実績登録されています。<br>出荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0287 = "MSBEL0287";

	/** LEVEL[W]<br>指定した品目は、品目禁止マスタにおいて移動が禁止されています。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBEL0288 = "MSBEL0288";

	/** LEVEL[W]<br>指定した入庫場所の発注先は、取引先禁止マスタにおいて移送・移動が禁止されています。<br>取引先：{1}<br>{2}<p>
	 */
	public static String MSBEL0289 = "MSBEL0289";

	/** LEVEL[W]<br>インボイス単位出荷が指定されているインボイスの明細が一部含まれていないため、出荷指図を登録できません。<br>出荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0290 = "MSBEL0290";

	/** LEVEL[W]<br>預り売上で売上が登録されていないため、出荷実績を登録できません。<br>受注明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0291 = "MSBEL0291";

	/** LEVEL[W]<br>インボイスが取り消されているため、更新または取り消しできません。<br>インボイスＮＯ：{1}<p>
	 */
	public static String MSBEL0292 = "MSBEL0292";

	/** LEVEL[W]<br>インボイス取引対象の得意先からの出荷返品の場合、予定と異なる単位または数量の入荷はできません。<br>入荷予定ＮＯ：{1}<br>得意先ＣＤ：{2}<br>予定取引単位ＣＤ：{3}<br>予定取引単位数量：{4}<br>取引単位ＣＤ：{5}<br>取引単位数量：{6}<br>{7}<p>
	 */
	public static String MSBEL0293 = "MSBEL0293";

	/** LEVEL[W]<br>パッキングリスト作成対象ですが、パッキングリストが登録されていません。<br>インボイスＮＯ：{1}<p>
	 */
	public static String MSBEL0294 = "MSBEL0294";

	/** LEVEL[W]<br>売上計上済みのため、更新または取り消しできません。<br>インボイスＮＯ：{1}<p>
	 */
	public static String MSBEL0295 = "MSBEL0295";

	/** LEVEL[W]<br>入荷済みのため、更新または取り消しできません。<br>インボイスＮＯ：{1}<p>
	 */
	public static String MSBEL0296 = "MSBEL0296";

	/** LEVEL[W]<br>預り在庫は棚卸対象外です。<br>{1}<p>
	 */
	public static String MSBEL0297 = "MSBEL0297";

	/** LEVEL[W]<br>検収不良の在庫は棚卸対象外です。<br>{1}<p>
	 */
	public static String MSBEL0298 = "MSBEL0298";

	/** LEVEL[W]<br>すでに出荷指図済の出荷予定がある為、インボイスは取消できません。<br>出荷予定ＮＯ：{1}<p>
	 */
	public static String MSBEL0299 = "MSBEL0299";

	/** LEVEL[W]<br>出荷返品、移動・移送、移動・移送返品、支給、支給返品、入荷の取引では非在庫品は入荷できません。<br>取引ＣＤ：{1}<br>品目：{2}<br>{3}<p>
	 */
	public static String MSBEL0300 = "MSBEL0300";

	/** LEVEL[W]<br>資産管理する品目の場合、入荷の取引で扱える購買識別区分は、無償受給、ＶＭＩのみです。<br>上記以外の購買識別区分は入荷できません。<br>取引ＣＤ：{1}<br>品目：{2}<br>購買識別区分：{3}<br>{4}<p>
	 */
	public static String MSBEL0301 = "MSBEL0301";

	/** LEVEL[W]<br>入荷の取引で資産管理する品目は仕入の理由以外、または経費購買の理由は設定できません。<br>取引ＣＤ：{1}<br>品目：{2}<br>理由ＣＤ：{3}<br>{4}<p>
	 */
	public static String MSBEL0302 = "MSBEL0302";

	/** LEVEL[W]<br>移送の取引では移送の理由以外は設定できません。<br>取引ＣＤ：{1}<br>理由ＣＤ：{2}<br>{3}<p>
	 */
	public static String MSBEL0303 = "MSBEL0303";

	/** LEVEL[W]<br>移送返品、支給、支給返品の取引では移送の理由以外、または他勘定出庫の理由は設定できません。<br>取引ＣＤ：{1}<br>理由ＣＤ：{2}<br>{3}<p>
	 */
	public static String MSBEL0304 = "MSBEL0304";

	/** LEVEL[W]<br>出荷返品の取引では売上返品の理由以外、または販売他勘定の理由は設定できません。<br>取引ＣＤ：{1}<br>理由ＣＤ：{2}<br>{3}<p>
	 */
	public static String MSBEL0305 = "MSBEL0305";

	/** LEVEL[W]<br>入荷の取引では購買識別区分、預りの両方に値を設定できません。<br>購買識別区分、預りのいずれかを設定してください。<br>取引ＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBEL0306 = "MSBEL0306";

	/** LEVEL[W]<br>資産管理しない品目の場合、入荷の取引で扱える購買識別区分は無償受給のみです。<br>上記以外の購買識別区分は入荷できません。<br>取引ＣＤ：{1}<br>品目：{2}<br>購買識別区分：{3}<br>{4}<p>
	 */
	public static String MSBEL0307 = "MSBEL0307";

	/** LEVEL[W]<br>指定された確定ＮＯ区分は、「他勘定振替出庫」では使用できません。正しい確定ＮＯ区分を指定してください。<br>{1}<p>
	 */
	public static String MSBEL0308 = "MSBEL0308";

	/** LEVEL[W]<br>指定の場所、良品区分、在庫識別区分、在庫取引先、確定ＮＯ区分、在庫着荷先の組み合わせでは登録できません。<br>{1}<p>
	 */
	public static String MSBEL0309 = "MSBEL0309";

	/** LEVEL[W]<br>承認されている他勘定振替予定の数量より多い数量では登録できません。<br>{1}<p>
	 */
	public static String MSBEL0310 = "MSBEL0310";

	/** LEVEL[W]<br>新規ロット入力不可の品目のため、ロット作成できません。<br>{1}<p>
	 */
	public static String MSBEL0311 = "MSBEL0311";

	/** LEVEL[W]<br>現品票印刷上限枚数を超えているため、印刷できません。<br>現品票印刷上限枚数：{1}<br>{2}<p>
	 */
	public static String MSBEL0312 = "MSBEL0312";

	/** LEVEL[W]<br>インボイス取引対象の場合、出荷予定数量を上回る出荷実績数量は指定できません。<br>出荷予定ＮＯ：{1}<br>出荷実績数量：{2}<br>出荷予定数量：{3}<br>{4}<p>
	 */
	public static String MSBEL0313 = "MSBEL0313";

	/** LEVEL[W]<br>インボイス単位出荷の場合、インボイス数量と異なる出荷実績数量は指定できません。<br>Ｉ／Ｖ明細ＮＯ：{1}<br>出荷実績数量：{2}<br>インボイス数量：{3}<br>{4}<p>
	 */
	public static String MSBEL0314 = "MSBEL0314";

	/** LEVEL[W]<br>指定したインボイスは、パッキングリスト登録対象外です。<p>
	 */
	public static String MSBEL0315 = "MSBEL0315";

	/** LEVEL[W]<br>指定したインボイスは、パッキングリストが既に登録されているため、新規登録できません。<p>
	 */
	public static String MSBEL0316 = "MSBEL0316";

	/** LEVEL[W]<br>指定したインボイスは、パッキングリストが登録されていません。<p>
	 */
	public static String MSBEL0317 = "MSBEL0317";

	/** LEVEL[W]<br>移送・移動禁止の支給先のため、出荷実績は登録できません。<br>支給先：{1}<br>出荷日：{2}<br>移送・移動禁止日：{3}<br>{4}<p>
	 */
	public static String MSBEL0318 = "MSBEL0318";

	/** LEVEL[W]<br>移送・移動禁止の支給先のため、出荷指図は登録できません。<br>支給先：{1}<br>出荷指図日：{2}<br>移送・移動禁止日：{3}<br>{4}<p>
	 */
	public static String MSBEL0319 = "MSBEL0319";

	/** LEVEL[W]<br>インボイス未登録のため、パッキングリストを発行できません。<br>{1}<p>
	 */
	public static String MSBEL0320 = "MSBEL0320";

	/** LEVEL[W]<br>パッキングリスト省略のため、パッキングリストを発行できません。<br>インボイスＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0321 = "MSBEL0321";

	/** LEVEL[W]<br>インボイス未登録のため、インボイスを発行できません。<br>{1}<p>
	 */
	public static String MSBEL0322 = "MSBEL0322";

	/** LEVEL[W]<br>パッキングリスト未登録のため、パッキングリストを発行できません。<br>インボイスＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0323 = "MSBEL0323";

	/** LEVEL[W]<br>出荷予定が確定されています。<br>一部指図すると出荷予定が分割されるため、確定された出荷予定は一部指図できません。<br>出荷予定ＮＯ：{1}<br>指図数量(基準単位)：{2}<br>予定数量(基準単位)：{3}<br>{4}<p>
	 */
	public static String MSBEL0324 = "MSBEL0324";

	/** LEVEL[W]<br>インボイス取引対象の発注先からの入荷の場合、予定数量以上の入荷はできません。<br>入荷予定ＮＯ：{1}<br>発注先ＣＤ：{2}<br>予定基準単位数量：{3}<br>合計基準単位数量：{4}<br>{5}<p>
	 */
	public static String MSBEL0325 = "MSBEL0325";

	/** LEVEL[W]<br>入荷予定に対して入荷数量が異なるため入荷できません。<br>支給に対する入荷の場合、入荷数量は予定と同数であること、また納品書の明細分をまとめて入荷（または入荷を取り消し）する必要があります。<br>入荷予定ＮＯ：{1}<br>納品書ＮＯ：{2}<br>入荷予定数量（基準単位）：{3}<br>合計の入荷数量（基準単位）：{4}<br>{5}<p>
	 */
	public static String MSBEL0326 = "MSBEL0326";

	/** LEVEL[W]<br>支給の納品書に対して入荷が不足しているため入荷できません。<br>支給に対する入荷の場合、納品書の明細分をまとめて入荷（または入荷を取り消し）する必要があります。<br>入荷予定ＮＯ：{1}<br>納品書ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBEL0327 = "MSBEL0327";

	/** LEVEL[W]<br>予定に対する実績登録済みの数量の合計が予定数量以上のため、打切できません。<br>予定数量(基準単位)：{1}<br>実績数量(基準単位)：{2}<br>{3}<p>
	 */
	public static String MSBEL0328 = "MSBEL0328";

	/** LEVEL[W]<br>理論在庫数量がマイナスの場合は棚卸対象外です。<br>{1}<p>
	 */
	public static String MSBEL0329 = "MSBEL0329";

	/** LEVEL[W]<br>外注場所で、在庫識別区分が「無償受給」かつ在庫着荷先の指定がない場合は棚卸対象外です。<br>{1}<p>
	 */
	public static String MSBEL0330 = "MSBEL0330";

	/** LEVEL[W]<br>自社場所で、在庫識別区分が「自社在庫」かつ確定ＮＯ区分が「なし」の場合、在庫着荷先は指定できません。<br>{1}<p>
	 */
	public static String MSBEL0331 = "MSBEL0331";

	/** LEVEL[I]<br>引当できなかった指図明細が存在します。<br>引当対象の指図明細の件数：{1}<br>引当が成功した件数：{2}<br>引当が失敗した件数：{3}<br>{4}<p>
	 */
	public static String MSBEL0332 = "MSBEL0332";

	/** LEVEL[W]<br>仮受注のためインボイスを登録できません。<br>受注ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0333 = "MSBEL0333";

	/** LEVEL[W]<br>支給先に対する買掛先と日付から債務部門を取得できません。取引先マスタ及び取引先補助マスタを確認してください。<br>支給先ＣＤ：{1}<br>買掛先ＣＤ：{2}<br>日付：{3}<br>{4}<p>
	 */
	public static String MSBEL0334 = "MSBEL0334";

	/** LEVEL[W]<br>支給先に対する買掛先から取得された部門が指定した日付に対して部門マスタに登録されていません。部門マスタを確認してください。<br>支給先ＣＤ：{1}<br>買掛先ＣＤ：{2}<br>部門ＣＤ：{3}<br>日付：{4}<br>{5}<p>
	 */
	public static String MSBEL0335 = "MSBEL0335";

	/** LEVEL[W]<br>指定した日付に対して部門マスタに登録されていません。部門マスタを確認してください。<br>債務部門ＣＤ：{1}<br>日付：{2}<br>{3}<p>
	 */
	public static String MSBEL0336 = "MSBEL0336";

	/** LEVEL[W]<br>ロット・場所提案できませんでした。<p>
	 */
	public static String MSBEL0337 = "MSBEL0337";

	/** LEVEL[W]<br>提案対象が、他の処理によって更新されています。再検索してください。<br>{1}<p>
	 */
	public static String MSBEL0338 = "MSBEL0338";

	/** LEVEL[W]<br>出荷予定が打切されているため訂正、取消できません。訂正、取消する場合は打切解除してください。<br>{1}<p>
	 */
	public static String MSBEL0339 = "MSBEL0339";

	/** LEVEL[W]<br>自社から自社への移動実績を登録する場合、在庫識別区分には「自社在庫」「VMI」「検収不良」「無償受給」「返品検収前」「仕入検収前」のいずれかを指定してください。<br>出庫場所ＣＤ：{1}<br>入庫場所ＣＤ：{2}<br>在庫識別区分：{3}<br>{4}<p>
	 */
	public static String MSBEL0340 = "MSBEL0340";

	/** LEVEL[W]<br>自社から自社への出荷実績を登録する場合、在庫識別区分には「自社在庫」「VMI」「検収不良」「無償受給」「返品検収前」「預り」のいずれかを指定してください。<br>出庫場所ＣＤ：{1}<br>入庫場所ＣＤ：{2}<br>在庫識別区分：{3}<br>{4}<p>
	 */
	public static String MSBEL0341 = "MSBEL0341";

	/** LEVEL[W]<br>ロット逆転が発生しました。<br>有効期限の許可範囲が逆転しています。<br>過去にロットチェック無視で出荷したロットが存在する可能性があります。<br>得意先ＣＤ：{1}<br>納品先ＣＤ：{2}<br>納品（予定）日：{3}<br>品目：{4}<br>ロットＮＯ：{5}<br>サブロットＮＯ：{6}<br>有効期限：{7}<br>許可する有効期限：{8}～{9}<p>
	 */
	public static String MSBEL0342 = "MSBEL0342";

	/** LEVEL[W]<br>移動実績が登録されているため、訂正できません。<br>移動引当状況ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0343 = "MSBEL0343";

	/** LEVEL[W]<br>移動実績が登録されているため、取消できません。<br>移動指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0344 = "MSBEL0344";

	/** LEVEL[W]<br>出荷予定の数量の合計が、受注明細もしくは移動・移送予定の数量と異なるため、更新できません。<br>受注明細ＮＯ：{1}<br>移動・移送予定ＮＯ：{2}<br>出荷予定数量：{3}<br>入力合計：{4}<br>{5}<p>
	 */
	public static String MSBEL0345 = "MSBEL0345";

	/** LEVEL[W]<br>出荷予定に紐付く出荷引当状況が複数存在するため、出荷予定をまとめられません。<br>出荷予定をまとめるには、先に引当状況モードで出荷引当状況をひとつにまとめてください。<br>出荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL0346 = "MSBEL0346";

	/** LEVEL[W]<br>引当可能な在庫、受払予定が存在しないため、引当できませんでした。<br>出荷予定を変更するには、先に引当状況モードで出荷引当状況の場所引当をオフにするか、引当解除登録画面で引当を解除してください。<br>{1}<p>
	 */
	public static String MSBEL0347 = "MSBEL0347";

	/** LEVEL[W]<br>インボイス単位出荷とする場合は、インボイス明細まとめはできません。<br>出荷予定をまとめてからインボイス登録するか、出荷予定ごとにインボイス登録してください。<br>{1}<p>
	 */
	public static String MSBEL0348 = "MSBEL0348";

	/** LEVEL[W]<br>インボイス情報を登録済の場合、インボイス数量より少ない出荷実績数量は指定できません。<br>出荷予定ＮＯ：{1}<br>出荷実績数量：{2}<br>出荷予定数量：{3}<br>インボイス数量：{4}<br>{5}<p>
	 */
	public static String MSBEL0349 = "MSBEL0349";

	/** LEVEL[W]<br>出荷予定のインボイス数量と出荷実績数量が異なるため、打切はできません。<br>出荷予定ＮＯ：{1}<br>出荷実績数量：{2}<br>出荷予定数量：{3}<br>インボイス数量：{4}<br>{5}<p>
	 */
	public static String MSBEL0350 = "MSBEL0350";

	/** LEVEL[W]<br>品目単位マスタが存在しません<br>品目：{1}<br>単位：{2}<p>
	 */
	public static String MSBEL0351 = "MSBEL0351";

	/** LEVEL[W]<br>税マスタに売上税として登録されていません。<br>税ＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBEL0352 = "MSBEL0352";

	/** LEVEL[W]<br>税マスタに支給税として登録されていません。<br>税ＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBEL0353 = "MSBEL0353";

	/** LEVEL[W]<br>取引先マスタ、品目マスタ、会社マスタのいずれからも売上税ＣＤが取得できませんでした。売上税ＣＤを指定してください。<br>品目ＣＤ：{1}<br>得意先ＣＤ：{2}<br>適用日：{3}<br>{4}<p>
	 */
	public static String MSBEL0354 = "MSBEL0354";

	/** LEVEL[W]<br>再出荷予定の数量の合計が、元の再出荷予定数量と異なるため、更新できません。<br>受注明細ＮＯ：{1}<br>元の再出荷予定数量：{2}<br>入力合計：{3}<br>{4}<p>
	 */
	public static String MSBEL0355 = "MSBEL0355";

	/** LEVEL[W]<br>仕入実績に対応する入荷実績の負担部門が不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの負担部門がオンになっていること<br>適用日：{1}<br>負担部門ＣＤ：{2}<br>入荷実績ＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBEL0356 = "MSBEL0356";

	/** LEVEL[I]<br>投入品在庫補充処理（登録）を開始します。<p>
	 */
	public static String MSBEL1001 = "MSBEL1001";

	/** LEVEL[I]<br>実行条件：<br>投入予定日：{1}～{2}<br>受払予定状況：{3}未確定 {4}オーダ保存 {5}依頼 {6}予定 {7}製造保存 {8}指図済 {9}着手中<br>処理対象：{10}不足情報削除 {11}移送予定削除 {12}不足情報作成 {13}移送予定作成 <br>場所、棚・ライン：{14}<p>
	 */
	public static String MSBEL1002 = "MSBEL1002";

	/** LEVEL[I]<br>投入品在庫補充処理（登録）を終了しました。<br>不足情報の削除件数：{1}<br>移送予定の削除件数：{2}<br>受払予定の処理件数：{3}<br>不足情報の作成件数：{4}<br>移送予定の作成件数：{5}<br>移送予定エラー件数：{6}<p>
	 */
	public static String MSBEL1003 = "MSBEL1003";

	/** LEVEL[I]<br>投入品在庫補充処理（削除）を開始します。<p>
	 */
	public static String MSBEL1004 = "MSBEL1004";

	/** LEVEL[I]<br>実行条件：<br>入庫予定日：{1}～{2}<br>処理対象：{3}不足情報削除 {4}移送予定削除<br>場所、棚・ライン：{5}<p>
	 */
	public static String MSBEL1005 = "MSBEL1005";

	/** LEVEL[I]<br>投入品在庫補充処理（削除）を終了しました。<br>不足情報の削除件数：{1}<br>移送予定の削除件数：{2}<br><p>
	 */
	public static String MSBEL1006 = "MSBEL1006";

	/** LEVEL[W]<br>投入品在庫補充処理が実行中のため、処理を中断しました。<br>場所、棚・ライン：{1}<p>
	 */
	public static String MSBEL1007 = "MSBEL1007";

	/** LEVEL[W]<br>不足している投入品があるため、不足情報を作成しました。<br>場所ＣＤ：{1}<br>棚・ラインＣＤ：{2}<p>
	 */
	public static String MSBEL1008 = "MSBEL1008";

	/** LEVEL[W]<br>引当可能な在庫、受払予定が存在しませんでした。<br>データＮＯ：{1}<p>
	 */
	public static String MSBEL1009 = "MSBEL1009";

	/** LEVEL[W]<br>引当可能な在庫、受払予定が足りませんでした。一部補充しました。<br>データＮＯ：{1}<p>
	 */
	public static String MSBEL1010 = "MSBEL1010";

	/** LEVEL[I]<br>発注点在庫補充処理を開始します。<p>
	 */
	public static String MSBEL1012 = "MSBEL1012";

	/** LEVEL[I]<br>発注点在庫補充処理を終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<p>
	 */
	public static String MSBEL1013 = "MSBEL1013";

	/** LEVEL[W]<br>下記の品目で在庫補充方法が設定されていないため、発注情報は登録できませんでした。<br>格納場所：{1}<br>品目：{2}<p>
	 */
	public static String MSBEL1014 = "MSBEL1014";

	/** LEVEL[W]<br>指定された出荷予定は指図済みのため、対象外です。<p>
	 */
	public static String MSBEL1015 = "MSBEL1015";

	/** LEVEL[W]<br>指定された出荷予定は出荷済みのため、対象外です。<p>
	 */
	public static String MSBEL1016 = "MSBEL1016";

	/** LEVEL[W]<br>振替先の出荷予定日に対して引当可能日数が到来してないため、対象外です。<p>
	 */
	public static String MSBEL1017 = "MSBEL1017";

	/** LEVEL[W]<br>振替先の出荷予定日に対して引当可能日数が到来してないため、登録できません。<p>
	 */
	public static String MSBEL1018 = "MSBEL1018";

	/** LEVEL[W]<br>出荷が完了しているため、新規で出荷実績を登録できません。<br>出荷指図ＮＯ：{1}<br>出荷指図明細ＮＯ：{2}<br>出荷予定ＮＯ：{3}<br>出荷引当状況ＮＯ：{4}<br>{5}<p>
	 */
	public static String MSBEL1019 = "MSBEL1019";

	/** LEVEL[W]<br>入荷が完了しているため、新規で入荷実績を登録できません。<br>入荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL1020 = "MSBEL1020";

	/** LEVEL[W]<br>対応する入荷予定情報が入荷不要のため、取り込むことができません。<br>入荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL1021 = "MSBEL1021";

	/** LEVEL[I]<br>出荷品在庫補充処理（登録）を開始します。<p>
	 */
	public static String MSBEL1022 = "MSBEL1022";

	/** LEVEL[I]<br>実行条件：<br>出荷予定日時：{1}～{2}<br>受払予定状況：{3}予定 {4}受注 {5}納期回答 {6}納入指示 {7}指図済<br>処理対象：{8}不足情報削除 {9}移動予定削除 {10}不足情報作成 {11}移動予定作成 {12}未引当 {13}引当<br>出荷条件ＣＤ：{14}<br>出荷作業ＣＤ：{15}<br>場所、棚・ライン：{16}<p>
	 */
	public static String MSBEL1023 = "MSBEL1023";

	/** LEVEL[W]<br>出荷品在庫補充処理が実行中のため、処理を中断しました。<br>場所、棚・ライン：{1}<p>
	 */
	public static String MSBEL1024 = "MSBEL1024";

	/** LEVEL[I]<br>出荷品在庫補充処理（登録）を終了しました。<br>不足情報の削除件数：{1}<br>移動予定の削除件数：{2}<br>受払予定の処理件数：{3}<br>不足情報の作成件数：{4}<br>移動予定の作成件数：{5}<br>移動予定エラー件数：{6}<p>
	 */
	public static String MSBEL1025 = "MSBEL1025";

	/** LEVEL[I]<br>出荷品在庫補充処理（削除）を開始します。<p>
	 */
	public static String MSBEL1026 = "MSBEL1026";

	/** LEVEL[I]<br>出荷品在庫補充処理（削除）を終了しました。<br>不足情報の削除件数：{1}<br>移動予定の削除件数：{2}<p>
	 */
	public static String MSBEL1027 = "MSBEL1027";

	/** LEVEL[W]<br>使用可能な在庫が不足しているため、出荷実績を登録できません。<br>品目：{1}<br>場所：{2}<br>棚・ライン：{3}<br>ロットＮＯ：{4}<br>サブロットＮＯ：{5}<br>手配ＮＯ：{6}<br>荷姿単位：{7}<br>格付：{8}<br>良品区分：{9}<br>在庫識別区分：{10}<br>在庫取引先：{11}<br>{12}<p>
	 */
	public static String MSBEL1028 = "MSBEL1028";

	/** LEVEL[W]<br>使用可能な在庫または投入場所への入庫予定が不足しているため、出荷実績を登録できません。<br>マイナス在庫を許可する品目であっても、出荷実績を登録するためには使用可能な入庫予定が存在する必要があります。<br>品目：{1}<br>場所：{2}<br>棚・ライン：{3}<br>ロットＮＯ：{4}<br>サブロットＮＯ：{5}<br>手配ＮＯ：{6}<br>荷姿単位：{7}<br>格付：{8}<br>良品区分：{9}<br>在庫識別区分：{10}<br>在庫取引先：{11}<br>{12}<p>
	 */
	public static String MSBEL1029 = "MSBEL1029";

	/** LEVEL[W]<br>使用可能な在庫が不足しているため、移動実績を登録できません。<br>品目：{1}<br>場所：{2}<br>棚・ライン：{3}<br>ロットＮＯ：{4}<br>サブロットＮＯ：{5}<br>手配ＮＯ：{6}<br>荷姿単位：{7}<br>格付：{8}<br>良品区分：{9}<br>在庫識別区分：{10}<br>在庫取引先：{11}<br>{12}<p>
	 */
	public static String MSBEL1030 = "MSBEL1030";

	/** LEVEL[W]<br>使用可能な在庫または投入場所への入庫予定が不足しているため、移動実績を登録できません。<br>マイナス在庫を許可する品目であっても、移動実績を登録するためには使用可能な入庫予定が存在する必要があります。<br>品目：{1}<br>場所：{2}<br>棚・ライン：{3}<br>ロットＮＯ：{4}<br>サブロットＮＯ：{5}<br>手配ＮＯ：{6}<br>荷姿単位：{7}<br>格付：{8}<br>良品区分：{9}<br>在庫識別区分：{10}<br>在庫取引先：{11}<br>{12}<p>
	 */
	public static String MSBEL1031 = "MSBEL1031";

	/** LEVEL[W]<br>取引と送付先の関係が不正です。<br>下記の取引パタン区分が指定された取引を使用する場合は、送付先に「配送先」を指定できません。<br>取引パタン区分：「支給返品」<br>取引ＣＤ：{1}<br>取引パタン区分：{2}<br>送付先識別区分：{3}<br>{4}<p>
	 */
	public static String MSBEL1032 = "MSBEL1032";

	/** LEVEL[W]<br>取引と理由の関係が不正です。<br>下記の取引パタン区分が指定された取引を使用する場合は、「売上」の理由を指定してください。<br>取引パタン区分：「売上」「出荷」<br>取引ＣＤ：{1}<br>取引パタン区分：{2}<br>理由ＣＤ：{3}<br>{4}<p>
	 */
	public static String MSBEL1033 = "MSBEL1033";

	/** LEVEL[W]<br>取引と理由の関係が不正です。<br>下記の取引パタン区分が指定された取引を使用する場合は、「販売他勘定」の理由を指定できません。<br>取引パタン区分：「出荷」<br>取引ＣＤ：{1}<br>取引パタン区分：{2}<br>理由ＣＤ：{3}<br>{4}<p>
	 */
	public static String MSBEL1034 = "MSBEL1034";

	/** LEVEL[W]<br>取引と理由の関係が不正です。<br>下記の取引パタン区分が指定された取引を使用する場合は、「移送」の理由を指定してください。<br>取引パタン区分：「移動・移送」「移動・移送返品」「支給」「支給返品」<br>取引ＣＤ：{1}<br>取引パタン区分：{2}<br>理由ＣＤ：{3}<br>{4}<p>
	 */
	public static String MSBEL1035 = "MSBEL1035";

	/** LEVEL[W]<br>取引と理由の関係が不正です。<br>下記の取引パタン区分が指定された取引を使用する場合は、「他勘定出庫」の理由を指定できません。<br>取引パタン区分：「移動・移送返品」「支給」「支給返品」<br>取引ＣＤ：{1}<br>取引パタン区分：{2}<br>理由ＣＤ：{3}<br>{4}<p>
	 */
	public static String MSBEL1036 = "MSBEL1036";

	/** LEVEL[W]<br>取引と品目の関係が不正です。<br>下記の取引パタン区分が指定された取引を使用する場合は、「在庫管理品」を指定ください。<br>取引パタン区分：「出荷」「移動・移送」「移動・移送返品」「支給」「支給返品」<br>取引ＣＤ：{1}<br>取引パタン区分：{2}<br>品目：{3}<br>在庫管理区分：{4}<br>{5}<p>
	 */
	public static String MSBEL1037 = "MSBEL1037";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ１管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ１が必須です。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBEL1038 = "MSBEL1038";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ２管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ２が必須です。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBEL1039 = "MSBEL1039";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ３管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ３が必須です。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBEL1040 = "MSBEL1040";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ４管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ４が必須です。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBEL1041 = "MSBEL1041";

	/** LEVEL[W]<br>インボイス取引対象の発注先からの入荷は打ち切りできません。<p>
	 */
	public static String MSBEL1042 = "MSBEL1042";

	/** LEVEL[W]<br>インボイス取引対象の得意先からの入荷は打ち切りできません。<p>
	 */
	public static String MSBEL1043 = "MSBEL1043";

	/** LEVEL[W]<br>値引品目の入荷は打ち切りできません。<p>
	 */
	public static String MSBEL1044 = "MSBEL1044";

	/** LEVEL[W]<br>ＩＦ送信済のため更新できません。<br>出荷指図ＮＯ：{1}<p>
	 */
	public static String MSBEL1045 = "MSBEL1045";

	/** LEVEL[W]<br>ＩＦ送信対象に対して打ち切り、もしくは打切解除を行う場合、明細分割など、明細の件数が変わる訂正を同時に行うことはできません。<br>出荷指図明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL1046 = "MSBEL1046";

	/** LEVEL[W]<br>ＩＦ送信済のため更新できません。<br>移動指図ＮＯ：{1}<p>
	 */
	public static String MSBEL1047 = "MSBEL1047";

	/** LEVEL[I]<br>実行条件：<br>入庫予定日時：{1}～{2}<br>処理対象：{3}不足情報削除 {4}移動予定削除<br>場所、棚・ライン：{5}<p>
	 */
	public static String MSBEL1048 = "MSBEL1048";

	/** LEVEL[W]<br>指定された出荷指図が存在しません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>出荷指図ＮＯ：{3}<p>
	 */
	public static String MSBEL1049 = "MSBEL1049";

	/** LEVEL[W]<br>出荷返品の取引では出荷時に登録したロットＮＯ、サブロットＮＯを指定してください。<br>納品書ＮＯ：{1}<br>納品書明細ＮＯ：{2}<br>ロットＮＯ：{3}<br>サブロットＮＯ：{4}<br>{5}<p>
	 */
	public static String MSBEL1050 = "MSBEL1050";

	/** LEVEL[W]<br>出荷返品の取引では出荷時に登録した数量より多い数量で返品することはできません。<br>納品書ＮＯ：{1}<br>納品書明細ＮＯ：{2}<br>ロットＮＯ：{3}<br>サブロットＮＯ：{4}<br>数量：{5}<br>{6}<p>
	 */
	public static String MSBEL1051 = "MSBEL1051";

	/** LEVEL[W]<br>指定したロットＮＯ、サブロットＮＯは出荷返品済です。<br>納品書ＮＯ：{1}<br>納品書明細ＮＯ：{2}<br>ロットＮＯ：{3}<br>サブロットＮＯ：{4}<br>{5}<p>
	 */
	public static String MSBEL1052 = "MSBEL1052";

	/** LEVEL[W]<br>受領インボイス登録されている仕入予定に対する仕入実績は、受領インボイス単位で登録してください。同時計上ＦＬＧがオンの入荷は、仕入実績が登録できないため入荷実績も登録しませんでした。<br>受領インボイスＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL1053 = "MSBEL1053";

	/** LEVEL[W]<br>インボイス明細の数量が受領インボイス未登録の数量を超えています。<br>超過する数量で登録する場合、確定フラグをオンで登録してください。<br>超過数量：{1}<br>{2}<p>
	 */
	public static String MSBEL1054 = "MSBEL1054";

	/** LEVEL[W]<br>行追加した明細は在庫管理しない品目を設定してください。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBEL1055 = "MSBEL1055";

	/** LEVEL[W]<br>行追加した明細は資産管理しない品目を設定してください。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBEL1056 = "MSBEL1056";

	/** LEVEL[W]<br>資産管理しない品目の仕入理由は経費購買の理由を設定してください。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBEL1057 = "MSBEL1057";

	/** LEVEL[W]<br>行追加した明細だけの登録はできません。<p>
	 */
	public static String MSBEL1058 = "MSBEL1058";

	/** LEVEL[W]<br>インボイス明細の数量が入荷数量より少ないため登録できません。<br>入荷数量より少なく登録する場合は受領インボイスを取り消してから、受領インボイス登録対象選択画面の「入荷実績」モードで受領インボイスを再登録してください。<br>仕入予定数量（基準単位）：{1}<br>入荷数量（基準単位）：{2}<br>{3}<p>
	 */
	public static String MSBEL1059 = "MSBEL1059";

	/** LEVEL[W]<br>行追加した明細は取引パタン区分「仕入」の取引を設定してください。<br>取引ＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBEL1060 = "MSBEL1060";

	/** LEVEL[W]<br>インボイス明細に対応する入荷予定に製造指図が紐付けられていないため、受領インボイスを登録できません。<br>入荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL1061 = "MSBEL1061";

	/** LEVEL[W]<br>取引先マスタに有効な得意先として登録されていません。<br>得意先ＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBEL1062 = "MSBEL1062";

	/** LEVEL[W]<br>出荷済の入荷予定については、出荷時に登録したロットＮＯ、サブロットＮＯ、格付を指定してください。<br>入荷予定ＮＯ：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>格付：{4}<br>{5}<p>
	 */
	public static String MSBEL1063 = "MSBEL1063";

	/** LEVEL[W]<br>インボイス単位出荷で出荷済みのため、取り消しできません。<p>
	 */
	public static String MSBEL1064 = "MSBEL1064";

	/** LEVEL[W]<br>指図区分が「2：ピッキングなし」の明細のみで登録できません。「１：ピッキングあり」の明細を含めて登録してください。<p>
	 */
	public static String MSBEL1065 = "MSBEL1065";

	/** LEVEL[W]<br>仕入締が解除されているため、計上日は変更できません。<br>訂正前の計上日：{1}<br>{2}<p>
	 */
	public static String MSBEL1066 = "MSBEL1066";

	/** LEVEL[W]<br>出荷計上日よりも過去の売上計上日が指定されています。<br>出荷計上日：{1}<br>売上計上日：{2}<br>{3}<p>
	 */
	public static String MSBEL1067 = "MSBEL1067";

	/** LEVEL[W]<br>出荷計上日よりも過去の売上計上日が指定されています。<br>出荷計上日：{1}<br>売上計上日：{2}<br>出荷実績ＮＯ：{3}<p>
	 */
	public static String MSBEL1068 = "MSBEL1068";

	/** LEVEL[W]<br>入荷予定、仕入予定の残数量が同数でないため、同時に打切できません。<br>入荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL1069 = "MSBEL1069";

	/** LEVEL[W]<br>預り売上した数量の範囲内で、出荷予定を調整してください。<br>売上実績明細ＮＯ：{1}<br>出荷予定NO：{2}<br>調整前の数量：{3}<br>調整後の数量：{4}<p>
	 */
	public static String MSBEL1070 = "MSBEL1070";

	/** LEVEL[W]<br>預り売上が既に登録されているため、出荷予定の取消はできません。<br>出荷予定ＮＯ：{1}<p>
	 */
	public static String MSBEL1071 = "MSBEL1071";

	/** LEVEL[W]<br>場所マスタに有効な場所として登録されていません。<br>入荷場所ＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBEL1072 = "MSBEL1072";

	/** LEVEL[W]<br>同じヘッダに対する他の他勘定振替実績の取り込み処理でエラーが発生したため、取り込みできませんでした。<br>外部他勘定振替実績ＮＯ：{1}<br>取引：{2}<br>場所：{3}<br>他勘定振替実績日時：{4}<br>実施部門：{5}<br>実施担当者：{6}<p>
	 */
	public static String MSBEL1073 = "MSBEL1073";

	/** LEVEL[W]<br>不良品のロットが指定されています。<br>該当の取引では不良品のロットは指定できません。<br>取引ＣＤ：{1}<br>取引パタン区分：{2}<br>品目：{3}<br>ロットＮＯ：{4}<br>サブロットＮＯ：{5}<br>{6}<p>
	 */
	public static String MSBEL1074 = "MSBEL1074";

	/** LEVEL[W]<br>納入指示済もしくは納期回答受領済のため、数量を訂正できません。<br>{1}<p>
	 */
	public static String MSBEL1101 = "MSBEL1101";

	/** LEVEL[W]<br>受注明細が打切されているため訂正、取消できません。<br>訂正、取消する場合は、受注明細を打切解除してください。<br>{1}<p>
	 */
	public static String MSBEL1102 = "MSBEL1102";

	/** LEVEL[W]<br>発注明細が打切されているため訂正、取消できません。<br>訂正、取消する場合は、発注明細を打切解除してください。<br>{1}<p>
	 */
	public static String MSBEL1103 = "MSBEL1103";

	/** LEVEL[W]<br>返品元納品書ＮＯまたは返品元支給実績ＮＯより、返品元の支給計上日が取得できませんでした。入力値を確認するか支給計上日（基）を直接入力してください。<br>返品元納品書ＮＯ：{1}<br>返品元支給実績ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBEL1104 = "MSBEL1104";

	/** LEVEL[W]<br>支給返品の場合は、支給計上日（基）を入力してください。<br>{1}<p>
	 */
	public static String MSBEL1105 = "MSBEL1105";

	/** LEVEL[W]<br>支給返品以外の場合は、支給元情報を入力しないでください。<br>{1}<p>
	 */
	public static String MSBEL1106 = "MSBEL1106";

	/** LEVEL[W]<br>指定したインボイスＮＯが複数件存在します。インボイス一覧照会画面から遷移してください。<p>
	 */
	public static String MSBEL1109 = "MSBEL1109";

	/** LEVEL[W]<br>出荷指図を元にインボイスが登録済のため、インボイス数量を下回る数量に訂正できません。<br>出荷指図明細ＮＯ：{1}<br>出荷指図数量（合計）：{2}<br>インボイス数量：{3}<br>{4}<p>
	 */
	public static String MSBEL1110 = "MSBEL1110";

	/** LEVEL[W]<br>インボイス情報が登録済の場合、インボイス未指図数量を上回る出荷指図数量は指定できません。<br>出荷予定ＮＯ：{1}<br>Ｉ／Ｖ明細ＮＯ：{2}<br>出荷指図数量：{3}<br>インボイス未指図数量：{4}<br>{5}<p>
	 */
	public static String MSBEL1111 = "MSBEL1111";

	/** LEVEL[W]<br>出荷実績を元にインボイスが登録済のため、インボイス数量を下回る数量に訂正できません。<br>出荷実績明細ＮＯ：{1}<br>出荷実績数量：{2}<br>インボイス数量：{3}<br>{4}<p>
	 */
	public static String MSBEL1112 = "MSBEL1112";

	/** LEVEL[W]<br>インボイス情報が登録済の場合、インボイス未出荷数量を上回る出荷実績数量は指定できません。<br>出荷予定ＮＯ：{1}<br>Ｉ／Ｖ明細ＮＯ：{2}<br>出荷実績数量：{3}<br>インボイス未出荷数量：{4}<br>{5}<p>
	 */
	public static String MSBEL1113 = "MSBEL1113";

	/** LEVEL[W]<br>出荷実績が登録されているため、出荷数量を下回るインボイス数量は指定できません。<br>Ｉ／Ｖ明細ＮＯ：{1}<br>インボイス数量：{2}<br>出荷数量：{3}<br>{4}<p>
	 */
	public static String MSBEL1114 = "MSBEL1114";

	/** LEVEL[W]<br>指定された入荷実績は受領インボイスが登録されているため、受領インボイスＮＯを仮登録できません。<br>入荷実績ＮＯ：{1}<br>受領インボイスＮＯ：{2}<br>受領インボイス管理ＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBEL1115 = "MSBEL1115";

	/** LEVEL[W]<br>出荷指図を元にインボイスが登録済のため、行削除または取消できません。<br>出荷指図明細ＮＯ：{1}<br>出荷引当状況ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBEL1116 = "MSBEL1116";

	/** LEVEL[W]<br>出荷実績を元にインボイスが登録済のため、行削除または取消できません。<br>出荷実績明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL1117 = "MSBEL1117";

	/** LEVEL[W]<br>受領インボイスＮＯが重複しているため、登録できません。<br>受領インボイスＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL1118 = "MSBEL1118";

	/** LEVEL[W]<br>出荷指図が登録されているため、出荷指図数量を下回るインボイス数量は指定できません。<br>Ｉ／Ｖ明細ＮＯ：{1}<br>インボイス数量：{2}<br>出荷指図数量：{3}<br>{4}<p>
	 */
	public static String MSBEL1119 = "MSBEL1119";

	/** LEVEL[W]<br>行追加した明細に在庫管理または資産管理する品目を設定している場合、確定をオンからオフに変更できません。<br>行削除してください。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBEL1120 = "MSBEL1120";

	/** LEVEL[W]<br>出荷指図が登録されているため、行削除または取消できません。<br>Ｉ／Ｖ明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL1121 = "MSBEL1121";

	/** LEVEL[W]<br>出荷実績が登録されているため、行削除または取消できません。<br>Ｉ／Ｖ明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL1122 = "MSBEL1122";

	/** LEVEL[W]<br>予定数以上の数量で打切りすることはできません。<br>{1}<p>
	 */
	public static String MSBEL1123 = "MSBEL1123";

	/** LEVEL[W]<br>インボイスが登録されていないため出荷できません。<br>売上計上区分が出荷基準の場合、出荷作業を行う前にインボイスを登録してください。<p>
	 */
	public static String MSBEL1124 = "MSBEL1124";

	/** LEVEL[W]<br>計画外の出荷実績では、売上計上区分が出荷基準の場合、インボイス取引対象の得意先を指定できません。<p>
	 */
	public static String MSBEL1125 = "MSBEL1125";

	/** LEVEL[W]<br>インボイスが登録されていないため出荷できません。<br>売上計上区分が出荷基準の場合、出荷作業を行う前にインボイスを登録してください。<br>出荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL1126 = "MSBEL1126";

	/** LEVEL[W]<br>インボイスが登録済みのため、更新または取り消しできません。<br>{1}<p>
	 */
	public static String MSBEL1127 = "MSBEL1127";

	/** LEVEL[W]<br>検索した受領インボイスは既に取り消されているため、訂正または取消できません。<br>受領インボイスＮＯ：{1}<p>
	 */
	public static String MSBEL1128 = "MSBEL1128";

	/** LEVEL[I]<br>確定をオフにすると仕入実績の項目がクリアされますがよろしいですか？<p>
	 */
	public static String MSBEL1129 = "MSBEL1129";

	/** LEVEL[W]<br>売上計上区分が出荷基準かつ配送先経由しない場合、同一のインボイスに含まれる全ての出荷実績の出荷日、計上日を揃えて登録してください。<br>インボイスＮＯ：{1}<br>出荷指図ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBEL1130 = "MSBEL1130";

	/** LEVEL[W]<br>売上計上区分が出荷基準かつ配送先経由しない場合、同一のインボイスに含まれる全ての対象を指定してください。<br>インボイスＮＯ：{1}<br>出荷指図ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBEL1131 = "MSBEL1131";

	/** LEVEL[W]<br>売上計上区分が出荷基準かつ配送先経由しない場合、インボイスに対して一部出荷となるような登録はできません。<br>Ｉ／Ｖ明細ＮＯ：{1}<br>出荷実績数量の合計：{2}<br>インボイス数量：{3}<br>{4}<p>
	 */
	public static String MSBEL1132 = "MSBEL1132";

	/** LEVEL[I]<br>仮単価の明細が含まれています。<br>売上を計上するまでに、仮単価を本単価に訂正してください。<br>{1}<p>
	 */
	public static String MSBEL1133 = "MSBEL1133";

	/** LEVEL[I]<br>仮単価の明細が含まれています。<br>受領インボイスを確定するまでに、仮単価を本単価に訂正してください。<br>{1}<p>
	 */
	public static String MSBEL1134 = "MSBEL1134";

	/** LEVEL[I]<br>仮単価のまま仕入を計上します。<br>必要に応じて本単価に訂正してください。<br>{1}<p>
	 */
	public static String MSBEL1135 = "MSBEL1135";

	/** LEVEL[W]<br>入荷予定を元に作成された受領インボイスに対して、仕入実績が登録されているため、登録できません。<br>受領インボイスＮＯ：{1}<br>入荷予定ＮＯ：{2}<br>発注明細ＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBEL1136 = "MSBEL1136";

	/** LEVEL[W]<br>ロットＮＯの混在が不可の出荷予定でロットが混在しているため、処理できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBEL1201 = "MSBEL1201";

	/** LEVEL[W]<br>サブロットＮＯの混在が不可の出荷予定でサブロットが混在しているため、処理できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBEL1202 = "MSBEL1202";

	/** LEVEL[W]<br>在庫識別区分に「VMI」を指定する場合は、入庫場所には自社場所のみを指定してください。<br>入庫場所：{1}<br>{2}<p>
	 */
	public static String MSBEL1203 = "MSBEL1203";

	/** LEVEL[W]<br>在庫識別区分に「返品検収前」、「預り」、「VMI」を指定する場合は、入庫場所には自社場所のみを指定してください。<br>入庫場所：{1}<br>{2}<p>
	 */
	public static String MSBEL1204 = "MSBEL1204";

	/** LEVEL[W]<br>在庫識別区分に「有償支給」を指定する場合は、入庫場所には外注場所のみを指定してください。<br>入庫場所：{1}<br>{2}<p>
	 */
	public static String MSBEL1205 = "MSBEL1205";

	/** LEVEL[W]<br>出荷可能な日が取得できませんでした。<br>出荷先物流グループＣＤ：{1}<br>出荷元物流グループＣＤ：{2}<br>出荷条件ＣＤ：{3}<br>着曜日：{4}<br>出荷作業ＣＤ：{5}<p>
	 */
	public static String MSBEL1206 = "MSBEL1206";

	/** LEVEL[W]<br>出荷可能な日が取得できませんでした。<br>出荷先物流グループＣＤ：{1}<br>出荷元物流グループＣＤ：{2}<br>出荷条件ＣＤ：{3}<br>出荷作業ＣＤ：{4}<p>
	 */
	public static String MSBEL1207 = "MSBEL1207";

	/** LEVEL[W]<br>納品可能な日が取得できませんでした。<br>出荷先物流グループＣＤ：{1}<br>出荷元物流グループＣＤ：{2}<br>出荷条件ＣＤ：{3}<br>着曜日：{4}<br>出荷作業ＣＤ：{5}<p>
	 */
	public static String MSBEL1208 = "MSBEL1208";

	/** LEVEL[W]<br>納品可能な日が取得できませんでした。<br>出荷先物流グループＣＤ：{1}<br>出荷元物流グループＣＤ：{2}<br>出荷条件ＣＤ：{3}<br>出荷作業ＣＤ：{4}<p>
	 */
	public static String MSBEL1209 = "MSBEL1209";

	/** LEVEL[W]<br>入力された期限がロットに設定されている期限と異なります。<br>出荷元期限：{1}<br>ロット管理情報の有効期限：{2}<br>ロット管理情報の使用期限：{3}<br>{4}<p>
	 */
	public static String MSBEL1301 = "MSBEL1301";

	/** LEVEL[W]<br>同じロットが設定されているレコードに、異なる有効期限または期限起算日が設定されています。<br>入荷予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBEL1302 = "MSBEL1302";

	/** LEVEL[W]<br>取得した販売単価が0でした。<br>販売単価が0の場合、売上理由は必須です。<br>{1}<p>
	 */
	public static String MSBEL1303 = "MSBEL1303";

	/** LEVEL[I]<br>品目品管マスタに先行検査有効として登録されていません。<p>
	 */
	public static String MSBFP0001 = "MSBFP0001";

	/** LEVEL[W]<br>受入検査・製造検査・ロット検査以外の検査予定をまとめることはできないため、画面遷移できません。<p>
	 */
	public static String MSBFP0002 = "MSBFP0002";

	/** LEVEL[W]<br>検査実施単位が実績単位もしくは未定の場合、検査予定をまとめることはできないため、画面遷移できません。<p>
	 */
	public static String MSBFP0003 = "MSBFP0003";

	/** LEVEL[W]<br>まとめ不可能な検査予定が選択されているため、画面遷移できません。<p>
	 */
	public static String MSBFP0004 = "MSBFP0004";

	/** LEVEL[I]<br>品目検査パタンマスタに検査方法区分が「４：抜取規格検査」として登録されていません。<p>
	 */
	public static String MSBFP0005 = "MSBFP0005";

	/** LEVEL[I]<br>不合格の検査項目があります。<br>検査ＮＯ：{1}<p>
	 */
	public static String MSBFP0006 = "MSBFP0006";

	/** LEVEL[I]<br>特採の検査項目があります。<br>検査ＮＯ：{1}<p>
	 */
	public static String MSBFP0007 = "MSBFP0007";

	/** LEVEL[W]<br>処理対象の品目又はその構成品に、検査判定が行われていないロットが存在します。<br>ロットトレース（原因調査）画面で確認してください。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBFL0001 = "MSBFL0001";

	/** LEVEL[W]<br>処理対象の品目又はその構成品に、良品以外のロットが存在します。<br>ロットトレース（原因調査）画面で確認してください。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBFL0002 = "MSBFL0002";

	/** LEVEL[W]<br>処理対象の品目又はその構成品に、製造記録承認が行われていないロットが存在します。<br>ロットトレース（原因調査）画面で確認してください。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBFL0003 = "MSBFL0003";

	/** LEVEL[W]<br>製造記録承認が行われていないロットが存在します。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBFL0004 = "MSBFL0004";

	/** LEVEL[W]<br>指定された品目は市場出荷判定の対象ではないため登録できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBFL0005 = "MSBFL0005";

	/** LEVEL[W]<br>ロット管理していない品目の場合、市場出荷判定を行うことはできません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBFL0006 = "MSBFL0006";

	/** LEVEL[W]<br>対象のロット情報は既に登録されています。<br>品目：{1}<br>ロットＮＯ：{2}<p>
	 */
	public static String MSBFL0007 = "MSBFL0007";

	/** LEVEL[W]<br>市場出荷判定情報を登録しているため取り消しできません。<br>品目：{1}<br>ロットＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBFL0008 = "MSBFL0008";

	/** LEVEL[W]<br>市場出荷判定にて出荷許可と判定されていないロットが選択されています。<br>市場出荷判定状況区分：{1}<br>品目：{2}<br>ロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBFL0009 = "MSBFL0009";

	/** LEVEL[W]<br>ログインユーザに対する承認役割権限がありません。<br>{1}<p>
	 */
	public static String MSBFL0010 = "MSBFL0010";

	/** LEVEL[W]<br>工場出荷承認情報を取得できませんでした。<br>{1}<p>
	 */
	public static String MSBFL0011 = "MSBFL0011";

	/** LEVEL[W]<br>工場出荷承認済または工場出荷却下済のため、処理できませんでした。<br>{1}<p>
	 */
	public static String MSBFL0012 = "MSBFL0012";

	/** LEVEL[W]<br>製造が完了していないため、出荷承認又は却下は行えません。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBFL0013 = "MSBFL0013";

	/** LEVEL[W]<br>処理対象の品目又はその構成品に、以下のいずれかのロットが存在します。<br>・製造記録承認されていないロット<br>・検査判定されていないロット<br>・良品以外のロット<br>{1}<p>
	 */
	public static String MSBFL0014 = "MSBFL0014";

	/** LEVEL[W]<br>承認済または却下以外のデータは更新できません。<br>工場出荷承認ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0015 = "MSBFL0015";

	/** LEVEL[W]<br>該当のサブロットに対するロット検査、受入検査、製造検査が存在します。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>手配ＮＯ：{4}<br>{5}<p>
	 */
	public static String MSBFL0016 = "MSBFL0016";

	/** LEVEL[W]<br>着荷先に存在する在庫の検査予定を作成することはできません。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>手配ＮＯ：{4}<br>{5}<p>
	 */
	public static String MSBFL0017 = "MSBFL0017";

	/** LEVEL[W]<br>再検査済のため、検査予定情報の取消は行えません。<br>検査予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0018 = "MSBFL0018";

	/** LEVEL[W]<br>検査予定の検査種類区分にロット検査が指定されていないため、検査予定を取り消すことはできません。<br>検査予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0019 = "MSBFL0019";

	/** LEVEL[W]<br>検査予定の検査予定状況区分に未指図が指定されていないため、検査予定を取り消すことはできません。<br>検査予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0020 = "MSBFL0020";

	/** LEVEL[W]<br>検査実施単位が実績単位の場合、検査予定をまとめることはできません。<br>{1}<p>
	 */
	public static String MSBFL0021 = "MSBFL0021";

	/** LEVEL[W]<br>まとめ不可能な検査予定が指定されています。<br>検査予定の内容を確認してください。<br>{1}<p>
	 */
	public static String MSBFL0022 = "MSBFL0022";

	/** LEVEL[W]<br>既に検査実績が登録されているため、検査指図の更新・取消は行えません。<br>検査ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0023 = "MSBFL0023";

	/** LEVEL[W]<br>既に検査規格の実績が登録されているため、検査指図の更新・取消は行えません。<br>検査ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0024 = "MSBFL0024";

	/** LEVEL[W]<br>既に検査規格の実績が登録されているため、検査指図承認の取消は行えません。<br>検査ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0025 = "MSBFL0025";

	/** LEVEL[W]<br>検査中の先行検査が存在するので登録できません。<br>{1}<p>
	 */
	public static String MSBFL0026 = "MSBFL0026";

	/** LEVEL[W]<br>良品区分に工程不良品を設定することはできません。<br>検査ＮＯ：{1}<br>検査実績ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBFL0027 = "MSBFL0027";

	/** LEVEL[W]<br>指定した先行検査が存在しません。<br>{1}<p>
	 */
	public static String MSBFL0028 = "MSBFL0028";

	/** LEVEL[W]<br>検査予定状況区分が未指図以外のため、取り消しできません。<br>{1}<p>
	 */
	public static String MSBFL0029 = "MSBFL0029";

	/** LEVEL[W]<br>有効な出来高指図が存在するため、ロットを削除することはできません。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBFL0030 = "MSBFL0030";

	/** LEVEL[W]<br>有効な入荷予定が存在するため、ロットを削除することはできません。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBFL0031 = "MSBFL0031";

	/** LEVEL[W]<br>有効な入庫実績が存在するため、ロットを削除することはできません。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBFL0032 = "MSBFL0032";

	/** LEVEL[W]<br>ロットＮＯが重複しています。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBFL0033 = "MSBFL0033";

	/** LEVEL[W]<br>サブロットＮＯが重複しています。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBFL0034 = "MSBFL0034";

	/** LEVEL[W]<br>対象のロットは存在しません。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBFL0035 = "MSBFL0035";

	/** LEVEL[W]<br>工場出荷承認にて承認済とされていないロットが選択されています。<br>工場出荷承認状況区分：{1}<br>品目：{2}<br>ロットＮＯ：{3}<br>サブロットＮＯ：{4}<br>{5}<p>
	 */
	public static String MSBFL0036 = "MSBFL0036";

	/** LEVEL[W]<br>検査が完了しているため処理を行えませんでした。<p>
	 */
	public static String MSBFL0037 = "MSBFL0037";

	/** LEVEL[W]<br>市場出荷判定対象の品目は、購買納期調整登録で事前にロットを作成してください。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBFL0038 = "MSBFL0038";

	/** LEVEL[W]<br>有効な品目検査規格マスタが設定されていないため、規格検査情報が取得できません。<br>品目：{1}<br>検査パタン：{2}<br>マスタ適用日：{3}<br>{4}<p>
	 */
	public static String MSBFL0039 = "MSBFL0039";

	/** LEVEL[W]<br>検査指図済のため、削除できませんでした。<br>出来高予定ＮＯ：{1}<br>出来高実績ＮＯ：{2}<br>{3}<br><p>
	 */
	public static String MSBFL0040 = "MSBFL0040";

	/** LEVEL[W]<br>既に全数検査指図済のため、出来高の単位、数量を変更することはできません。<br>製造指図ＮＯ：{1}<br>品目製造指図ＮＯ：{2}<br>出来高予定ＮＯ：{3}<br>出来高実績ＮＯ：{4}<br>{5}<p>
	 */
	public static String MSBFL0041 = "MSBFL0041";

	/** LEVEL[W]<br>既に検査指図済のため、良品以外に更新することはできません。<br>製造指図ＮＯ：{1}<br>品目製造指図ＮＯ：{2}<br>出来高予定ＮＯ：{3}<br>出来高実績ＮＯ：{4}<br>{5}<p>
	 */
	public static String MSBFL0042 = "MSBFL0042";

	/** LEVEL[W]<br>既に検査指図済のため、品目ＣＤ、ロットＮＯ、サブロットＮＯを変更することはできません。<br>製造指図ＮＯ：{1}<br>品目製造指図ＮＯ：{2}<br>出来高予定ＮＯ：{3}<br>出来高実績ＮＯ：{4}<br>{5}<p>
	 */
	public static String MSBFL0043 = "MSBFL0043";

	/** LEVEL[W]<br>既に検査指図済のため、品目ＣＤ、ロットＮＯを変更することはできません。<br>製造指図ＮＯ：{1}<br>品目製造指図ＮＯ：{2}<br>出来高予定ＮＯ：{3}<br>出来高実績ＮＯ：{4}<br>{5}<p>
	 */
	public static String MSBFL0044 = "MSBFL0044";

	/** LEVEL[W]<br>既に検査実績が登録されているため、出来高の格付を変更することはできません。<br>製造指図ＮＯ：{1}<br>品目製造指図ＮＯ：{2}<br>出来高予定ＮＯ：{3}<br>出来高実績ＮＯ：{4}<br>{5}<p>
	 */
	public static String MSBFL0045 = "MSBFL0045";

	/** LEVEL[W]<br>既に検査実績が登録されているため、出来高の単位を変更することはできません。<br>製造指図ＮＯ：{1}<br>品目製造指図ＮＯ：{2}<br>出来高予定ＮＯ：{3}<br>出来高実績ＮＯ：{4}<br>{5}<p>
	 */
	public static String MSBFL0046 = "MSBFL0046";

	/** LEVEL[W]<br>既に検査指図済のため、入荷実績の更新は行えません。<br>入荷実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0047 = "MSBFL0047";

	/** LEVEL[W]<br>工場出荷承認済または工場出荷却下済のため、処理できませんでした。<br>{1}<p>
	 */
	public static String MSBFL0048 = "MSBFL0048";

	/** LEVEL[W]<br>既に検査指図されているため、製造指図承認の取消はできません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0049 = "MSBFL0049";

	/** LEVEL[W]<br>既に工場出荷承認されているため、製造記録承認の取消はできません。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0050 = "MSBFL0050";

	/** LEVEL[W]<br>既に検査完了しているため、処理できませんでした。<br>{1}<p>
	 */
	public static String MSBFL0051 = "MSBFL0051";

	/** LEVEL[W]<br>検査状況区分が検査予定または未指図の場合に、実績登録することはできません。<br>検査ＮＯ：{1}<p>
	 */
	public static String MSBFL0052 = "MSBFL0052";

	/** LEVEL[W]<br>検査承認状況区分が指図未承認の場合に、実績登録することはできません。<br>検査ＮＯ：{1}<br>検査実績ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBFL0053 = "MSBFL0053";

	/** LEVEL[W]<br>検査状況区分が完了でない場合に、判定することはできません。<br>検査ＮＯ：{1}<br>検査実績ＮＯ：{2}<br>検査状況区分：{3}<br>{4}<p>
	 */
	public static String MSBFL0054 = "MSBFL0054";

	/** LEVEL[W]<br>検査承認状況区分が未判定でない場合に、判定することはできません。<br>検査ＮＯ：{1}<br>検査実績ＮＯ：{2}<br>検査承認状況区分：{3}<br>{4}<br><p>
	 */
	public static String MSBFL0055 = "MSBFL0055";

	/** LEVEL[W]<br>工場出荷承認済または工場出荷却下済のため、処理できませんでした。<br>検査ＮＯ：{1}<br>検査実績ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBFL0056 = "MSBFL0056";

	/** LEVEL[W]<br>既に再検査の情報が指図されているため、実績更新は行えません。<br>検査ＮＯ：{1}<br>検査実績ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBFL0057 = "MSBFL0057";

	/** LEVEL[W]<br>検査指図が承認されていないため、実績登録は行えません。<br>検査ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0058 = "MSBFL0058";

	/** LEVEL[W]<br>規格検査結果区分が設定されていないため、確認できません。<br>規格検査実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0059 = "MSBFL0059";

	/** LEVEL[W]<br>検査が完了し、規格検査必須がオンの場合は、取り消しできません。<br>検査ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0060 = "MSBFL0060";

	/** LEVEL[W]<br>確認済の規格検査実績情報があるため、取消できません。<br>検査ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0061 = "MSBFL0061";

	/** LEVEL[W]<br>下記の検査ＮＯが重複しているため、処理できません。<br>検査ＮＯ：{1}<p>
	 */
	public static String MSBFL0062 = "MSBFL0062";

	/** LEVEL[W]<br>規格検査実績の検査ＮＯがヘッダ中に存在していないため、更新できません。<br>検査ＮＯ：{1}<p>
	 */
	public static String MSBFL0063 = "MSBFL0063";

	/** LEVEL[W]<br>規格検査実績の規格検査指図ＮＯが重複しているため、更新できません。<br>規格検査指図ＮＯ：{1}<p>
	 */
	public static String MSBFL0064 = "MSBFL0064";

	/** LEVEL[W]<br>規格検査実績の規格検査指図ＮＯが存在していないため、更新できません。<br>規格検査指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0065 = "MSBFL0065";

	/** LEVEL[W]<br>{1}に整数部有効桁数を超えた数値が指定されています。<br>数値：{2}<br>整数部有効桁数：{3}<br>{4}<p>
	 */
	public static String MSBFL0066 = "MSBFL0066";

	/** LEVEL[W]<br>条件に該当するロットが存在しません。<p>
	 */
	public static String MSBFL0067 = "MSBFL0067";

	/** LEVEL[W]<br>条件に該当する品目製造指図または出来高実績が存在しません。<p>
	 */
	public static String MSBFL0068 = "MSBFL0068";

	/** LEVEL[W]<br>処理対象の品目はロット継承の対象ではありません。<p>
	 */
	public static String MSBFL0069 = "MSBFL0069";

	/** LEVEL[W]<br>良品区分、格付、検査終了日時のいずれかを指定する場合、左記の項目は全て必須項目です。<br>検査ＮＯ：{1}<br>検査実績ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBFL0070 = "MSBFL0070";

	/** LEVEL[W]<br>検査実績明細の荷姿単位数量は必須項目です。<br>検査ＮＯ：{1}<br>検査実績ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBFL0071 = "MSBFL0071";

	/** LEVEL[W]<br>検査実績明細の良品区分は必須項目です。<br>検査ＮＯ：{1}<br>検査実績ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBFL0072 = "MSBFL0072";

	/** LEVEL[W]<br>検査実績明細の格付は必須項目です。<br>検査ＮＯ：{1}<br>検査実績ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBFL0073 = "MSBFL0073";

	/** LEVEL[W]<br>検査抜取実績の抜取数量は必須項目です。<br>検査ＮＯ：{1}<br>検査実績ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBFL0074 = "MSBFL0074";

	/** LEVEL[I]<br>製造所からの出荷承認結果、品質管理結果、製造管理結果を自動取得します。<br>よろしいですか？<p>
	 */
	public static String MSBFL0075 = "MSBFL0075";

	/** LEVEL[I]<br>自動取得を行いました。<p>
	 */
	public static String MSBFL0076 = "MSBFL0076";

	/** LEVEL[W]<br>検査実績明細の検査ＮＯがヘッダ中に存在していないため、更新できません。<br>検査ＮＯ：{1}<p>
	 */
	public static String MSBFL0077 = "MSBFL0077";

	/** LEVEL[W]<br>検査抜取実績の検査ＮＯがヘッダ中に存在していないため、更新できません。<br>検査ＮＯ：{1}<p>
	 */
	public static String MSBFL0078 = "MSBFL0078";

	/** LEVEL[W]<br>同一ロットの行が複数行選択されています。いずれか一行のみを選択して下さい。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>手配ＮＯ：{4}<br>{5}<p>
	 */
	public static String MSBFL0079 = "MSBFL0079";

	/** LEVEL[W]<br>検査方法区分に抜取規格検査が指定されている場合は、規格検査項目を１件以上指定しないと登録できません。<br>{1}<p>
	 */
	public static String MSBFL0080 = "MSBFL0080";

	/** LEVEL[W]<br>該当データが既にロット管理情報に存在します。<br>{1}<p>
	 */
	public static String MSBFL0081 = "MSBFL0081";

	/** LEVEL[W]<br>ロット管理しない品目のロット管理情報は作成できません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBFL0082 = "MSBFL0082";

	/** LEVEL[W]<br>工場出荷承認にて却下されているロットが選択されています。<br>工場出荷承認状況区分：{1}<br>品目：{2}<br>ロットＮＯ：{3}<br>サブロットＮＯ：{4}<br>{5}<p>
	 */
	public static String MSBFL0083 = "MSBFL0083";

	/** LEVEL[W]<br>市場出荷判定にて出荷禁止と判定されているロットが選択されています。<br>市場出荷判定状況区分：{1}<br>品目：{2}<br>ロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBFL0084 = "MSBFL0084";

	/** LEVEL[W]<br>工場出荷承認対象であるため格納場所に販売場所を指定することはできません。<br>{1}<p>
	 */
	public static String MSBFL0085 = "MSBFL0085";

	/** LEVEL[I]<br>検査指図の承認依頼が登録されました。<br>件数：{1}<p>
	 */
	public static String MSBFL0086 = "MSBFL0086";

	/** LEVEL[I]<br>検査指図の承認依頼が取り消されました。<br>件数：{1}<p>
	 */
	public static String MSBFL0087 = "MSBFL0087";

	/** LEVEL[I]<br>検査指図が承認されました。<br>件数：{1}<p>
	 */
	public static String MSBFL0088 = "MSBFL0088";

	/** LEVEL[I]<br>検査指図の承認が取り消されました。<br>件数：{1}<p>
	 */
	public static String MSBFL0089 = "MSBFL0089";

	/** LEVEL[I]<br>検査実績の判定依頼が登録されました。<br>件数：{1}<p>
	 */
	public static String MSBFL0090 = "MSBFL0090";

	/** LEVEL[I]<br>検査実績の判定依頼が取り消されました。<br>件数：{1}<p>
	 */
	public static String MSBFL0091 = "MSBFL0091";

	/** LEVEL[I]<br>検査実績が判定されました。<br>件数：{1}<p>
	 */
	public static String MSBFL0092 = "MSBFL0092";

	/** LEVEL[I]<br>検査実績の判定が取り消されました。<br>件数：{1}<p>
	 */
	public static String MSBFL0093 = "MSBFL0093";

	/** LEVEL[I]<br>工場出荷の承認依頼が登録されました。<br>件数：{1}<p>
	 */
	public static String MSBFL0094 = "MSBFL0094";

	/** LEVEL[I]<br>工場出荷が承認されました。<br>件数：{1}<p>
	 */
	public static String MSBFL0095 = "MSBFL0095";

	/** LEVEL[I]<br>工場出荷の承認が取り消されました。<br>件数：{1}<p>
	 */
	public static String MSBFL0096 = "MSBFL0096";

	/** LEVEL[I]<br>市場出荷の判定依頼が登録されました。<br>件数：{1}<p>
	 */
	public static String MSBFL0097 = "MSBFL0097";

	/** LEVEL[I]<br>市場出荷が判定されました。<br>件数：{1}<p>
	 */
	public static String MSBFL0098 = "MSBFL0098";

	/** LEVEL[I]<br>市場出荷の判定が取り消されました。<br>件数：{1}<p>
	 */
	public static String MSBFL0099 = "MSBFL0099";

	/** LEVEL[I]<br>市場出荷の判定依頼が取り消されました。<br>件数：{1}<p>
	 */
	public static String MSBFL0100 = "MSBFL0100";

	/** LEVEL[I]<br>工場出荷の承認依頼が取り消されました。<br>件数：{1}<p>
	 */
	public static String MSBFL0101 = "MSBFL0101";

	/** LEVEL[W]<br>製造検査または受入検査の場合、検査指図時に抜取検査または抜取規格検査から全数検査へ変更できません。<br>{1}<p>
	 */
	public static String MSBFL0102 = "MSBFL0102";

	/** LEVEL[W]<br>製造検査または受入検査の場合、検査指図時に全数検査から抜取検査または抜取規格検査へ変更できません。<br>{1}<p>
	 */
	public static String MSBFL0103 = "MSBFL0103";

	/** LEVEL[W]<br>対象のロットは存在しません。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSBFL0104 = "MSBFL0104";

	/** LEVEL[W]<br>対象のサブロットは存在しません。<br>品目：{1}<br>ロットＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBFL0105 = "MSBFL0105";

	/** LEVEL[W]<br>先行検査の場合、抜取規格検査以外の検査方法区分を指定することはできません。<br>{1}<p>
	 */
	public static String MSBFL0106 = "MSBFL0106";

	/** LEVEL[W]<br>期限再検査の場合、検査方法区分に全数検査を指定することはできません。<br>{1}<p>
	 */
	public static String MSBFL0107 = "MSBFL0107";

	/** LEVEL[W]<br>検査種類区分が先行検査ではないため、取り消しできません。<br>{1}<p>
	 */
	public static String MSBFL0108 = "MSBFL0108";

	/** LEVEL[W]<br>未判定の規格検査実績が存在するため検査を完了することはできません。<br>検査ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0109 = "MSBFL0109";

	/** LEVEL[W]<br>未確認の規格検査実績が存在するため検査を完了することはできません。<br>検査ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0110 = "MSBFL0110";

	/** LEVEL[W]<br>品目品管マスタが登録されていないため、登録できません。<br>品目：{1}<br>製造場所ＣＤ：{2}<br>発注先ＣＤ：{3}<br>メーカＣＤ：{4}<br>マスタ適用日：{5}<br>{6}<p>
	 */
	public static String MSBFL0111 = "MSBFL0111";

	/** LEVEL[W]<br>品目品管マスタが登録されていないため、有効期限、使用期限が計算できません。<br>検査ＮＯ：{1}<br>品目：{2}<br>{3}<p>
	 */
	public static String MSBFL0112 = "MSBFL0112";

	/** LEVEL[W]<br>着手時には全数引き落としできません。完了時に引き落としてください。<br>検査ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0113 = "MSBFL0113";

	/** LEVEL[W]<br>完了時に全数引き落とされた場合、着手中に戻すことはできません。引落数を変更するか、抜取明細を行削除してください。<br>検査ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0114 = "MSBFL0114";

	/** LEVEL[W]<br>再検査対象の在庫が存在しないため、再検査できません。<br>検査ＮＯ：{1}<br>検査実績ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBFL0115 = "MSBFL0115";

	/** LEVEL[I]<br>既に仕入実績が登録されているため引落の受払実績が更新されませんでした。<br>引落の受払実績を更新するためには、仕入実績登録画面で仕入実績を更新してください<br>検査ＮＯ：{1}<br>仕入実績ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBFL0116 = "MSBFL0116";

	/** LEVEL[W]<br>ロット情報と異なる版ＮＯは指定できません。<br>品目：{1}<br>指定した版ＮＯ：{2}<br>ロット情報の版ＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBFL0117 = "MSBFL0117";

	/** LEVEL[W]<br>工場出荷承認役割を取得できません。品目マスタ（工場・物流倉庫）を確認してください。<br>品目：{1}<br>工場・物流倉庫：{2}<br>{3}<p>
	 */
	public static String MSBFL0118 = "MSBFL0118";

	/** LEVEL[W]<br>仕入実績が登録されているため処理できません。先に仕入実績を取り消してください。<br>検査ＮＯ：{1}<br>仕入実績ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBFL0119 = "MSBFL0119";

	/** LEVEL[W]<br>検査指図済のため、削除できませんでした。<br>入荷実績ＮＯ：{1}<br>{2}<br><p>
	 */
	public static String MSBFL0120 = "MSBFL0120";

	/** LEVEL[W]<br>結合可能な文字数を超えたため、処理を中断しました。投入品のロット情報を訂正してください。<br>結合文字列：{1}<br>結合文字数：{2}<br>最大文字数：{3}<br>継承項目：{4}<br>親品目：{5}<br>親ロットＮＯ：{6}<br>親サブロットＮＯ：{7}<br>品目製造指図ＮＯ：{8}<br>{9}<p>
	 */
	public static String MSBFL0121 = "MSBFL0121";

	/** LEVEL[I]<br>結合可能な文字数を超えたため、最大文字数で切り捨てました。投入品のロット情報を訂正してください。<br>結合文字列：{1}<br>結合文字数：{2}<br>最大文字数：{3}<br>継承項目：{4}<br>親品目：{5}<br>親ロットＮＯ：{6}<br>親サブロットＮＯ：{7}<br>品目製造指図ＮＯ：{8}<br>{9}<p>
	 */
	public static String MSBFL0122 = "MSBFL0122";

	/** LEVEL[I]<br>結合可能な文字数を超えたため、最大文字数で切り捨てました。<br>結合文字列：{1}<br>結合文字数：{2}<br>最大文字数：{3}<br>継承項目：{4}<br>親品目：{5}<br>親ロットＮＯ：{6}<br>親サブロットＮＯ：{7}<br>品目製造指図ＮＯ：{8}<br>{9}<p>
	 */
	public static String MSBFL0123 = "MSBFL0123";

	/** LEVEL[W]<br>条件に該当するロットが存在しません。<br>親品目：{1}<br>親ロットＮＯ：{2}<br>親サブロットＮＯ：{3}<p>
	 */
	public static String MSBFL0124 = "MSBFL0124";

	/** LEVEL[W]<br>条件に該当する品目製造指図または出来高実績が存在しません。<br>親品目：{1}<br>親ロットＮＯ：{2}<br>親サブロットＮＯ：{3}<br>ワーキンググループＣＤ：{4}<p>
	 */
	public static String MSBFL0125 = "MSBFL0125";

	/** LEVEL[W]<br>処理対象の品目製造指図が存在しません。<br>品目製造指図ＮＯ：{1}<p>
	 */
	public static String MSBFL0126 = "MSBFL0126";

	/** LEVEL[W]<br>処理対象の品目はロット継承の対象ではありません。<br>親品目：{1}<br>構成パタン：{2}<br>ワーキンググループＣＤ：{3}<br>品目製造指図ＮＯ：{4}<p>
	 */
	public static String MSBFL0127 = "MSBFL0127";

	/** LEVEL[W]<br>検査実績時に指定した良品区分が良品以外の場合、判定結果に合格または特採を指定することはできません。<br>検査ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0128 = "MSBFL0128";

	/** LEVEL[W]<br>検査実績時に良品の行が１行も登録されていないため、判定結果に合格または特採を指定することはできません。<br>検査ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0129 = "MSBFL0129";

	/** LEVEL[W]<br>対象のロットは存在しません。<br>品目：{1}<br>ロットＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBFL0130 = "MSBFL0130";

	/** LEVEL[W]<br>新規登録時に仕入実績を登録した際に複数の検査実績がまとめられたため、一部の検査実績のみの日付を変更することができません。<br>検査実績一覧登録で同時に登録した検査実績の日付をすべて同じ日付にするか、検査実績を取り消して再登録してください。<br>検査実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0131 = "MSBFL0131";

	/** LEVEL[W]<br>新規登録時に仕入実績を登録した際に複数の検査実績明細がまとめられたため、一部の検査実績のみの計上日を変更することができません。<br>検査実績一覧登録で同時に登録した検査実績明細の計上日をすべて同じ日付にするか、検査実績を取り消して再登録してください。<br>検査実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0132 = "MSBFL0132";

	/** LEVEL[W]<br>有効な出来高指図が存在するため、ロットを変更することはできません。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBFL0133 = "MSBFL0133";

	/** LEVEL[W]<br>有効な入荷予定が存在するため、ロットを変更することはできません。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBFL0134 = "MSBFL0134";

	/** LEVEL[W]<br>有効な入庫実績が存在するため、ロットを変更することはできません。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBFL0135 = "MSBFL0135";

	/** LEVEL[W]<br>製造検査または受入検査、かつ、以下のいずれかの場合は、検査指図時に抜取検査または抜取規格検査から全数検査へ変更できません。<br>・検査指図タイミング区分：出来高実績前可<br>・検査中ロット使用許可：オン<br>{1}<p>
	 */
	public static String MSBFL0136 = "MSBFL0136";

	/** LEVEL[W]<br>該当のロット、サブロットに対する期限再検査が存在します。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>手配ＮＯ：{4}<br>{5}<p>
	 */
	public static String MSBFL0137 = "MSBFL0137";

	/** LEVEL[I]<br>継承元ロットの継承項目に値が設定されていない状態で、ロットが継承されました。<br>継承項目：{1}<br>継承元品目：{2}<br>継承元ロットNO：{3}<br>継承元サブロットNO：{4}<p>
	 */
	public static String MSBFL0138 = "MSBFL0138";

	/** LEVEL[W]<br>まとめ対象となる同一ロットの検査予定が存在します。<br>検査指図一覧登録画面で再検索し、まとめて検査指図してください。<br>検査予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0139 = "MSBFL0139";

	/** LEVEL[W]<br>品目検査パタンマスタ、または品目品管マスタが取得できない、もしくは検査対象外となっています。<br>製造指図ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0140 = "MSBFL0140";

	/** LEVEL[W]<br>有効な品目製造指図が存在するため、ロットを削除することはできません。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBFL0141 = "MSBFL0141";

	/** LEVEL[W]<br>有効な品目製造指図が存在するため、ロットを変更することはできません。<br>品目：{1}<br>ロットＮＯ：{2}<br>サブロットＮＯ：{3}<br>{4}<p>
	 */
	public static String MSBFL0142 = "MSBFL0142";

	/** LEVEL[W]<br>品目単位マスタが存在しません。<br>品目：{1}<br>単位：{2}<br>{3}<p>
	 */
	public static String MSBFL0143 = "MSBFL0143";

	/** LEVEL[W]<br>ＩＦ送信済のため更新できません。<br>検査ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBFL0200 = "MSBFL0200";

	/** LEVEL[W]<br>入力された期限がロットに設定されている期限と異なります。<br>使用期限：{1}<br>ロット管理情報の有効期限：{2}<br>ロット管理情報の使用期限：{3}<br>{4}<p>
	 */
	public static String MSBFL0201 = "MSBFL0201";

	/** LEVEL[W]<br>同じロットが設定されているレコードに、異なる期限または期限起算日が設定されています。<br>{1}<p>
	 */
	public static String MSBFL0202 = "MSBFL0202";

	/** LEVEL[I]<br>請求明細選択画面で選択した情報がクリアされますがよろしいですか？<p>
	 */
	public static String MSBGP0001 = "MSBGP0001";

	/** LEVEL[I]<br>選択した明細がありません。<br>このまま確定すると明細の無い請求書が発行されますがよろしいですか？<p>
	 */
	public static String MSBGP0002 = "MSBGP0002";

	/** LEVEL[I]<br>請求明細の選択を確定しますか？<p>
	 */
	public static String MSBGP0003 = "MSBGP0003";

	/** LEVEL[W]<br>既に入金処理済です。更新できません。<p>
	 */
	public static String MSBGP0004 = "MSBGP0004";

	/** LEVEL[W]<br>請求先の売上仮単価締がオフの場合、仮単価の明細を選択できません。<br>{1}<p>
	 */
	public static String MSBGP0005 = "MSBGP0005";

	/** LEVEL[W]<br>一部請求金額には、元の金額以下の値を指定してください。<br>元の金額：{1}<br>指定した金額：{2}<p>
	 */
	public static String MSBGP0006 = "MSBGP0006";

	/** LEVEL[W]<br>一部請求税額には、元の税額以下の値を指定してください。<br>元の税額：{1}<br>指定した税額：{2}<p>
	 */
	public static String MSBGP0007 = "MSBGP0007";

	/** LEVEL[I]<br>明細の消込を確定しますか？<p>
	 */
	public static String MSBGP0008 = "MSBGP0008";

	/** LEVEL[I]<br>消込対象の明細がありません。<br>このまま確定してよろしいですか？<p>
	 */
	public static String MSBGP0009 = "MSBGP0009";

	/** LEVEL[I]<br>振替元と振替先に同一の請求部門、売掛先、債権部門、案件が指定されていますが、よろしいですか？<p>
	 */
	public static String MSBGP0010 = "MSBGP0010";

	/** LEVEL[W]<br>取引と入金情報の組み合わせが不正です。<br>前受金入金に対応した取引では、入金登録で登録された入金情報以外を処理できません。<p>
	 */
	public static String MSBGP0011 = "MSBGP0011";

	/** LEVEL[W]<br>取引と入金情報の組み合わせが不正です。<br>仮受金入金に対応した取引では、入金登録で登録された入金情報以外を処理できません。<p>
	 */
	public static String MSBGP0012 = "MSBGP0012";

	/** LEVEL[W]<br>取引と入金情報の組み合わせが不正です。<br>仮受金前受金相殺に対応した取引では、仮受金として登録された入金情報以外を処理できません。<p>
	 */
	public static String MSBGP0013 = "MSBGP0013";

	/** LEVEL[W]<br>取引と入金情報の組み合わせが不正です。<br>仮受金その他勘定相殺に対応した取引では、仮受金として登録された入金情報以外を処理できません。<p>
	 */
	public static String MSBGP0014 = "MSBGP0014";

	/** LEVEL[W]<br>取引と入金情報の組み合わせが不正です。<br>前受金その他勘定相殺に対応した取引では、前受金として登録された入金情報以外を処理できません。<p>
	 */
	public static String MSBGP0015 = "MSBGP0015";

	/** LEVEL[W]<br>取引と入金情報の組み合わせが不正です。<br>売上代金入金に対応した取引では、入金情報登録で登録された入金情報以外を処理できません。<p>
	 */
	public static String MSBGP0016 = "MSBGP0016";

	/** LEVEL[W]<br>取引と入金情報の組み合わせが不正です。<br>前受金相殺に対応した取引では、前受金として登録された入金情報以外を処理できません。<p>
	 */
	public static String MSBGP0017 = "MSBGP0017";

	/** LEVEL[W]<br>取引と入金情報の組み合わせが不正です。<br>仮受金売掛金相殺に対応した取引では、仮受金として登録された入金情報以外を処理できません。<p>
	 */
	public static String MSBGP0018 = "MSBGP0018";

	/** LEVEL[W]<br>取引と入金情報の組み合わせが不正です。<br>その他勘定売掛金相殺に対応した取引では、買掛金相殺として登録された入金情報以外を処理できません。<p>
	 */
	public static String MSBGP0019 = "MSBGP0019";

	/** LEVEL[W]<br>入金を参照している場合は入金額の合計を0にできません。<p>
	 */
	public static String MSBGP0020 = "MSBGP0020";

	/** LEVEL[W]<br>入金を参照している場合は相殺額の合計を0にできません。<p>
	 */
	public static String MSBGP0021 = "MSBGP0021";

	/** LEVEL[W]<br>{1}と消込対象の合計金額の符号が異なるので自動消込できません。<p>
	 */
	public static String MSBGP0022 = "MSBGP0022";

	/** LEVEL[I]<br>既に請求書を発行済ですが、入金予定調整登録を行います。よろしいですか？<p>
	 */
	public static String MSBGP0023 = "MSBGP0023";

	/** LEVEL[W]<br>一部請求税込金額には、元の税込金額以下の値を指定してください。<br>元の税込金額：{1}<br>指定した税込金額：{2}<p>
	 */
	public static String MSBGP0024 = "MSBGP0024";

	/** LEVEL[W]<br>0以上で元の金額未満の値を設定してください。<br>項目：{1}<br>元の値：{2}<br>指定された値：{3}<p>
	 */
	public static String MSBGP0025 = "MSBGP0025";

	/** LEVEL[W]<br>元の金額より大きく、0以下の値を設定してください。<br>項目：{1}<br>元の値：{2}<br>指定された値：{3}<p>
	 */
	public static String MSBGP0026 = "MSBGP0026";

	/** LEVEL[W]<br>一部請求金額および一部請求税額のいずれか１つ以上に、元の値と異なる値を入力してください。<br>元の金額：{1}<br>元の税額：{2}<br>指定された金額：{3}<br>指定された税額：{4}<p>
	 */
	public static String MSBGP0027 = "MSBGP0027";

	/** LEVEL[W]<br>請求書出力対象の明細と請求対象の明細で、金額の合計および税額の合計が一致するように入力してください。<br>明細実績ＮＯ：{1}<br>請求書出力対象の金額合計：{2}<br>請求書出力対象の税額合計：{3}<br>請求対象の金額合計：{4}<br>請求対象の税額合計：{5}<p>
	 */
	public static String MSBGP0028 = "MSBGP0028";

	/** LEVEL[W]<br>分割前の入金予定額と分割後の入金予定額が一致しません。<br>分割前入金予定額：{1}<br>分割後入金予定額：{2}<p>
	 */
	public static String MSBGL0001 = "MSBGL0001";

	/** LEVEL[W]<br>同一の入金予定日、入金方法の入金予定が既に存在しているため登録できません。<br>入金予定日：{1}<br>入金方法：{2}<br>{3}<p>
	 */
	public static String MSBGL0002 = "MSBGL0002";

	/** LEVEL[W]<br>指定した入金情報は、当画面で処理できません。<p>
	 */
	public static String MSBGL0003 = "MSBGL0003";

	/** LEVEL[W]<br>分割先の入金情報は、当画面で処理できません。<p>
	 */
	public static String MSBGL0004 = "MSBGL0004";

	/** LEVEL[W]<br>同じ請求先、請求部門を指定して入金分割はできません。<br>請求先ＣＤ：{1}<br>請求部門ＣＤ：{2}<br>{3}<p>
	 */
	public static String MSBGL0005 = "MSBGL0005";

	/** LEVEL[W]<br>入金方法は、決済方法マスタで入金登録区分が「１：登録不可」「２：登録可能」の債権決済方法を指定してください。<br>入金方法：{1}<p>
	 */
	public static String MSBGL0006 = "MSBGL0006";

	/** LEVEL[W]<br>既に分割処理済のため、訂正や取消はできません。<p>
	 */
	public static String MSBGL0007 = "MSBGL0007";

	/** LEVEL[W]<br>消込額が消込対象額を超えています。<p>
	 */
	public static String MSBGL0008 = "MSBGL0008";

	/** LEVEL[W]<br>消込額が不正です。消込対象額を超えて消し込みを行っていないか確認してください。<br>消込額：{1}<br>未消込額：{2}<p>
	 */
	public static String MSBGL0009 = "MSBGL0009";

	/** LEVEL[W]<br>請求先に対する請求部門を指定してください。<br>請求先ＣＤ：{1}<br>請求部門ＣＤ：{2}<p>
	 */
	public static String MSBGL0010 = "MSBGL0010";

	/** LEVEL[W]<br>入金方法は、決済方法マスタで債権決済区分が「現金」「振込」「手形」の債権決済方法を指定してください。<br>入金方法：{1}<p>
	 */
	public static String MSBGL0011 = "MSBGL0011";

	/** LEVEL[W]<br>入金方法が現金・手形の場合は口座、振込人名を指定できません。<p>
	 */
	public static String MSBGL0012 = "MSBGL0012";

	/** LEVEL[W]<br>入金方法が振込の場合は口座を指定してください。<p>
	 */
	public static String MSBGL0013 = "MSBGL0013";

	/** LEVEL[W]<br>自動入金消込対象がオフの場合は、振込手数料、自動消込基準日は指定できません。<p>
	 */
	public static String MSBGL0014 = "MSBGL0014";

	/** LEVEL[W]<br>自動入金消込対象がオンの場合は、自動消込基準日を指定してください。<p>
	 */
	public static String MSBGL0015 = "MSBGL0015";

	/** LEVEL[W]<br>入金方法が手形以外の場合は、手形項目（手形番号、手形区分、振出日、支払期日、振出人名、裏書人、引受人、手形理由ＣＤ、振出銀行、振出支店、予備１、予備２、予備３）は指定できません。<p>
	 */
	public static String MSBGL0016 = "MSBGL0016";

	/** LEVEL[W]<br>振込手数料は、変更前の振込手数料以内で指定してください。<br>変更前振込手数料：{1}<br>変更後振込手数料：{2}<p>
	 */
	public static String MSBGL0017 = "MSBGL0017";

	/** LEVEL[W]<br>入金方法が手形で入金区分が「為替手形」の場合は、引受人を指定してください。<p>
	 */
	public static String MSBGL0018 = "MSBGL0018";

	/** LEVEL[W]<br>入金予定制御マスタが取得できませんでした。入金予定制御マスタを設定してください。<br>請求先ＣＤ：{1}<br>ワーキンググループＣＤ：{2}<br>取引通貨ＣＤ：{3}<p>
	 */
	public static String MSBGL0019 = "MSBGL0019";

	/** LEVEL[W]<br>入金タブの未処理残高が0の場合、振込手数料の全額を分割先の入金に引き継いでください。<br>振込手数料残高：{1}<p>
	 */
	public static String MSBGL0020 = "MSBGL0020";

	/** LEVEL[W]<br>請求締日{1}に対応する入金予定日{1}、入金サイト{1}が取得できません。<br>入金予定制御マスタの設定を確認してください。<br>請求先ＣＤ：{2}<p>
	 */
	public static String MSBGL0021 = "MSBGL0021";

	/** LEVEL[W]<br>訂正対象のインボイスに対して既に売掛消込されています。<br>訂正するためには売掛消込を先に取り消してください。<br>インボイスＮＯ：{1}<p>
	 */
	public static String MSBGL0022 = "MSBGL0022";

	/** LEVEL[W]<br>分割する入金額は、入金処理額以上の金額を指定してください。<br>分割先入金ＮＯ：{1}<br>入金額：{2}<br>入金処理額：{3}<br>{4}<p>
	 */
	public static String MSBGL0023 = "MSBGL0023";

	/** LEVEL[W]<br>削除対象の分割先入金情報は入金処理済のため削除できません。<br>分割先入金ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBGL0024 = "MSBGL0024";

	/** LEVEL[I]<br>与信限度額マスタが登録されていないため、与信限度額管理の対象外とします。<br>与信管理先ＣＤ：{1}<br>通貨ＣＤ：{2}<p>
	 */
	public static String MSBGL0025 = "MSBGL0025";

	/** LEVEL[I]<br>アラーム使用率を超過しました。<br>与信管理先ＣＤ：{1}<br>通貨ＣＤ：{2}<br>与信使用額：{3}<br>与信限度額：{4}<br>アラーム使用率：{5}<p>
	 */
	public static String MSBGL0026 = "MSBGL0026";

	/** LEVEL[W]<br>源泉税に対応する相殺方法が指定されていないため処理できません。<br>源泉税を消し込む場合は源泉税に対応する相殺方法を指定してください。<p>
	 */
	public static String MSBGL0027 = "MSBGL0027";

	/** LEVEL[W]<br>債権決済区分「7：振替」に対応する決済方法マスタが登録されていないため処理できません。<br>決済方法マスタを登録してください。<p>
	 */
	public static String MSBGL0028 = "MSBGL0028";

	/** LEVEL[W]<br>会社マスタの売上税または仕入税と同じ税率で内税がオンの税ＣＤが税マスタに存在しないため処理できませんでした。<p>
	 */
	public static String MSBGL0029 = "MSBGL0029";

	/** LEVEL[W]<br>請求部門を指定する場合は請求先を指定してください。<p>
	 */
	public static String MSBGL0030 = "MSBGL0030";

	/** LEVEL[W]<br>与信限度額を超過したため、登録しませんでした。<p>
	 */
	public static String MSBGL0031 = "MSBGL0031";

	/** LEVEL[W]<br>請求先、請求部門が指定されている入金情報は、当画面で処理できません。<p>
	 */
	public static String MSBGL0032 = "MSBGL0032";

	/** LEVEL[W]<br>入金先が指定されていない入金情報は、当画面で処理できません。<p>
	 */
	public static String MSBGL0033 = "MSBGL0033";

	/** LEVEL[W]<br>税マスタに登録されていません。<br>税ＣＤ：{1}<p>
	 */
	public static String MSBGL0034 = "MSBGL0034";

	/** LEVEL[W]<br>消込額対象額の合計が0でないため処理をスキップします。<br>債権部門ＣＤ：{1}<br>売掛先ＣＤ：{2}<br>インボイスＮＯ：{3}<br>取引通貨ＣＤ：{4}<br>案件ＮＯ：{5}<br>債権区分：{6}<p>
	 */
	public static String MSBGL0035 = "MSBGL0035";

	/** LEVEL[W]<br>仮単価の請求明細が存在するため、請求書を発行できません。<br>売上明細訂正登録で仮単価の情報を確認・変更してください。<br>請求書ＮＯ：{1}<p>
	 */
	public static String MSBGL0036 = "MSBGL0036";

	/** LEVEL[W]<br>源泉税額を含む請求明細を請求残高振替する場合、源泉税額をすべて売掛明細消込してから振り替えてください。<br>未消込源泉税額：{1}<br>{2}<p>
	 */
	public static String MSBGL0037 = "MSBGL0037";

	/** LEVEL[W]<br>相殺額が不正です。源泉税を消し込む場合、未消込額以内の金額を指定してください。<br>相殺額：{1}<br>未消込額：{2}<br>{3}<p>
	 */
	public static String MSBGL0038 = "MSBGL0038";

	/** LEVEL[W]<br>請求先の請求書発行区分が「4.発行対象外」のため、請求書を発行できません。<br>請求書ＮＯ：{1}<br>請求先ＣＤ：{2}<p>
	 */
	public static String MSBGL0039 = "MSBGL0039";

	/** LEVEL[W]<br>指定された計上日で振替元の債権部門が無効です。<br>仕訳対象外の取引を選択するか、計上日を見直してください。<br>振替元の債権部門ＣＤ：{1}<p>
	 */
	public static String MSBGL0040 = "MSBGL0040";

	/** LEVEL[W]<br>入金実績ヘッダ情報の印刷データが存在しません。<p>
	 */
	public static String MSBGL0041 = "MSBGL0041";

	/** LEVEL[W]<br>入金実績明細情報の印刷データが存在しません。<p>
	 */
	public static String MSBGL0042 = "MSBGL0042";

	/** LEVEL[W]<br>入金情報の印刷データが存在しません。<p>
	 */
	public static String MSBGL0043 = "MSBGL0043";

	/** LEVEL[I]<br>与信限度額を超過しました。<br>与信管理先ＣＤ：{1}<br>通貨ＣＤ：{2}<br>与信使用額：{3}<br>与信限度額：{4}<p>
	 */
	public static String MSBGL0044 = "MSBGL0044";

	/** LEVEL[W]<br>この取引を本画面で処理できません。<p>
	 */
	public static String MSBGL0045 = "MSBGL0045";

	/** LEVEL[W]<br>更新対象の明細が消込処理されています。<br>消込処理された明細の請求繰越回数は更新できません。<br>{1}<p>
	 */
	public static String MSBGL0046 = "MSBGL0046";

	/** LEVEL[W]<br>決済方法マスタの売上仕入税区分が登録されていないため、処理できません。<br>債権決済区分が「4.相殺（借方）」の決済方法に売上仕入税区分を指定してください。<p>
	 */
	public static String MSBGL0047 = "MSBGL0047";

	/** LEVEL[W]<br>入金情報に振込手数料が指定されていますが、振込手数料は消込されませんでした。<br>入金ＮＯ：{1}<br>入金額：{2}<br>振込手数料：{3}<p>
	 */
	public static String MSBGL0048 = "MSBGL0048";

	/** LEVEL[W]<br>処理対象の入金実績情報が取得できませんでした。<p>
	 */
	public static String MSBGL0049 = "MSBGL0049";

	/** LEVEL[W]<br>指定した入金実績は既に取消済です。<p>
	 */
	public static String MSBGL0050 = "MSBGL0050";

	/** LEVEL[W]<br>指定した入金に対して既に消込処理がされているため、変更・取消はできません。<p>
	 */
	public static String MSBGL0051 = "MSBGL0051";

	/** LEVEL[W]<br>指定した入金情報は取り消されています。<p>
	 */
	public static String MSBGL0055 = "MSBGL0055";

	/** LEVEL[W]<br>取引と入金情報の組み合わせが不正です。<br>売上代金入金に対応した取引では、入金登録で登録された入金情報以外を処理できません。<p>
	 */
	public static String MSBGL0056 = "MSBGL0056";

	/** LEVEL[W]<br>取引と入金情報の組み合わせが不正です。<br>前受金入金に対応した取引では、入金登録で登録された入金情報以外を処理できません。<p>
	 */
	public static String MSBGL0057 = "MSBGL0057";

	/** LEVEL[W]<br>取引と入金情報の組み合わせが不正です。<br>仮受金入金に対応した取引では、入金登録で登録された入金情報以外を処理できません。<p>
	 */
	public static String MSBGL0058 = "MSBGL0058";

	/** LEVEL[W]<br>取引と入金情報の組み合わせが不正です。<br>前受金相殺に対応した取引では、前受金として登録された入金情報以外を処理できません。<p>
	 */
	public static String MSBGL0059 = "MSBGL0059";

	/** LEVEL[W]<br>取引と入金情報の組み合わせが不正です。<br>仮受金売掛金相殺に対応した取引では、仮受金として登録された入金情報以外を処理できません。<p>
	 */
	public static String MSBGL0060 = "MSBGL0060";

	/** LEVEL[W]<br>取引と入金情報の組み合わせが不正です。<br>仮受金その他勘定相殺に対応した取引では、仮受金として登録された入金情報以外を処理できません。<p>
	 */
	public static String MSBGL0061 = "MSBGL0061";

	/** LEVEL[W]<br>取引と入金情報の組み合わせが不正です。<br>前受金その他勘定相殺に対応した取引では、前受金として登録された入金情報以外を処理できません。<p>
	 */
	public static String MSBGL0062 = "MSBGL0062";

	/** LEVEL[W]<br>取引と入金情報の組み合わせが不正です。<br>仮受金前受金相殺に対応した取引では、仮受金として登録された入金情報以外を処理できません。<p>
	 */
	public static String MSBGL0063 = "MSBGL0063";

	/** LEVEL[W]<br>取引と入金情報の組み合わせが不正です。<br>その他勘定売掛金相殺に対応した取引では、買掛金相殺として登録された入金情報以外を処理できません。<p>
	 */
	public static String MSBGL0064 = "MSBGL0064";

	/** LEVEL[W]<br>取引と入金情報の組み合わせが不正です。<br>入金情報を処理できない取引です。<p>
	 */
	public static String MSBGL0065 = "MSBGL0065";

	/** LEVEL[W]<br>入金区分が手形の場合には手形ＮＯが必須です。<p>
	 */
	public static String MSBGL0066 = "MSBGL0066";

	/** LEVEL[W]<br>該当する帳票のフォーマットが存在しません。<p>
	 */
	public static String MSBGL0067 = "MSBGL0067";

	/** LEVEL[W]<br>売上都度請求先には振替できません。<p>
	 */
	public static String MSBGL0068 = "MSBGL0068";

	/** LEVEL[W]<br>振替元の請求明細が更新されています。<br>再検索してください。<p>
	 */
	public static String MSBGL0069 = "MSBGL0069";

	/** LEVEL[W]<br>振替対象の明細が消込処理されています。<br>消込処理された明細を振替えることはできません。<br>取引ＣＤ：{1}<br>実績ＮＯ：{2}<br>改訂番号：{3}<p>
	 */
	public static String MSBGL0070 = "MSBGL0070";

	/** LEVEL[W]<br>指定した入金方法は決済方法マスタに登録されていません。<br>入金登録区分：{1}<br>入金先ＣＤ：{2}<br>債権決済区分：{3}<br>{4}<p>
	 */
	public static String MSBGL0071 = "MSBGL0071";

	/** LEVEL[W]<br>債権決済区分「6：源泉税」に対応する決済方法マスタが登録されていないため処理できません。<br>決済方法マスタを登録してください。<p>
	 */
	public static String MSBGL0072 = "MSBGL0072";

	/** LEVEL[W]<br>入金予定情報を作成できません。<br>入金予定制御マスタの設定を確認してください。<br>請求先ＣＤ：{1}<br>請求部門ＣＤ：{2}<br>通貨ＣＤ：{3}<p>
	 */
	public static String MSBGL0073 = "MSBGL0073";

	/** LEVEL[W]<br>指定した請求年月・締日での締処理は行えません。<br>請求先ＣＤ：{1}<br>請求部門ＣＤ：{2}<br>取引通貨ＣＤ：{3}<br>インボイスＮＯ：{4}<br>案件ＮＯ：{5}<br>請求締年月日：{6}<p>
	 */
	public static String MSBGL0074 = "MSBGL0074";

	/** LEVEL[W]<br>仮単価の請求明細が存在するため、請求締処理ができません。<br>売上明細訂正登録で仮単価の情報を確認・変更してください。<br>請求先ＣＤ：{1}<br>請求部門ＣＤ：{2}<br>取引通貨ＣＤ：{3}<br>インボイスＮＯ：{4}<br>案件ＮＯ：{5}<br>請求締年月日：{6}<p>
	 */
	public static String MSBGL0075 = "MSBGL0075";

	/** LEVEL[I]<br>請求締処理を開始します。<p>
	 */
	public static String MSBGL0076 = "MSBGL0076";

	/** LEVEL[I]<br>請求締処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<p>
	 */
	public static String MSBGL0077 = "MSBGL0077";

	/** LEVEL[W]<br>指定した請求は締解除できません。請求締年月日が最新の請求から締解除してください。<br>請求先ＣＤ：{1}<br>請求締年月日：{2}<p>
	 */
	public static String MSBGL0078 = "MSBGL0078";

	/** LEVEL[W]<br>請求先が無効です。締解除できません。<br>請求先ＣＤ：{1}<p>
	 */
	public static String MSBGL0079 = "MSBGL0079";

	/** LEVEL[W]<br>マニュアル選択請求の請求先で、請求対象の明細を選択していません。<br>請求先：{1}<p>
	 */
	public static String MSBGL0080 = "MSBGL0080";

	/** LEVEL[W]<br>取引パタン区分に対応した取引が取得できません。<br>取引マスタを確認してください。<br>取引パタン区分：{1}<p>
	 */
	public static String MSBGL0081 = "MSBGL0081";

	/** LEVEL[W]<br>指定した入金実績は取り消されているため、処理できません。<br>入金実績ＮＯ：{1}<br>改訂番号：{2}<p>
	 */
	public static String MSBGL0082 = "MSBGL0082";

	/** LEVEL[W]<br>複数の入金実績に対しての消込処理はできません。<p>
	 */
	public static String MSBGL0083 = "MSBGL0083";

	/** LEVEL[W]<br>対象年月が指定されていないため、処理できません。<p>
	 */
	public static String MSBGL0084 = "MSBGL0084";

	/** LEVEL[W]<br>指定した取引は、無効あるいは取消状態です。<p>
	 */
	public static String MSBGL0085 = "MSBGL0085";

	/** LEVEL[W]<br>指定した取引は、当画面で処理できません。<p>
	 */
	public static String MSBGL0086 = "MSBGL0086";

	/** LEVEL[W]<br>指定した入金実績の取引は、当画面で処理できません。<p>
	 */
	public static String MSBGL0087 = "MSBGL0087";

	/** LEVEL[W]<br>指定した入金情報と取引パタン区分の組み合わせが不正です。<p>
	 */
	public static String MSBGL0088 = "MSBGL0088";

	/** LEVEL[W]<br>指定した入金情報の手形の振出日が翌日以降となっているため処理できません。<p>
	 */
	public static String MSBGL0090 = "MSBGL0090";

	/** LEVEL[W]<br>指定した入金情報は、未処理残高が0であるため処理できません。<p>
	 */
	public static String MSBGL0091 = "MSBGL0091";

	/** LEVEL[W]<br>入金を参照している場合は入金額の合計を0にできません。<p>
	 */
	public static String MSBGL0092 = "MSBGL0092";

	/** LEVEL[W]<br>入金を参照している場合は相殺額の合計を0にできません。<p>
	 */
	public static String MSBGL0093 = "MSBGL0093";

	/** LEVEL[W]<br>消込対象の明細がありません。<p>
	 */
	public static String MSBGL0094 = "MSBGL0094";

	/** LEVEL[W]<br>売掛明細消込金額合計と、売掛消込額が一致しません。<br>売掛明細消込金額合計：{1}<br>売掛消込額：{2}<p>
	 */
	public static String MSBGL0095 = "MSBGL0095";

	/** LEVEL[W]<br>未処理残高をマイナスにはできません。<p>
	 */
	public static String MSBGL0096 = "MSBGL0096";

	/** LEVEL[W]<br>未処理残高を相殺額よりも大きくできません。<p>
	 */
	public static String MSBGL0097 = "MSBGL0097";

	/** LEVEL[W]<br>相殺額の合計をマイナスにはできません。<p>
	 */
	public static String MSBGL0098 = "MSBGL0098";

	/** LEVEL[W]<br>未処理残高をプラスにはできません。<p>
	 */
	public static String MSBGL0099 = "MSBGL0099";

	/** LEVEL[W]<br>相殺額を未処理残高よりも大きくできません。<p>
	 */
	public static String MSBGL0100 = "MSBGL0100";

	/** LEVEL[W]<br>相殺額の合計をプラスにはできません。<p>
	 */
	public static String MSBGL0101 = "MSBGL0101";

	/** LEVEL[W]<br>未処理残高を残すことはできません。<p>
	 */
	public static String MSBGL0102 = "MSBGL0102";

	/** LEVEL[W]<br>未処理残高を入金額よりも大きくできません。<p>
	 */
	public static String MSBGL0103 = "MSBGL0103";

	/** LEVEL[W]<br>入金額の合計をマイナスにはできません。<p>
	 */
	public static String MSBGL0104 = "MSBGL0104";

	/** LEVEL[W]<br>入金自動消込処理でエラーが発生したため、次の入金先は処理できませんでした。<br>入金先ＣＤ：{1}<p>
	 */
	public static String MSBGL0105 = "MSBGL0105";

	/** LEVEL[I]<br>入金自動消込処理を開始します。<p>
	 */
	public static String MSBGL0106 = "MSBGL0106";

	/** LEVEL[I]<br>入金自動消込処理が終了しました。<br>処理対象件数：{1}<br>金額一致で完了した件数：{2}<br>手数料込で完了した件数：{3}<br>過入金で完了した件数：{4}<br>入金額不足で完了した件数：{5}<br>自動消込不可件数：{6}<br>エラー件数：{7}<p>
	 */
	public static String MSBGL0107 = "MSBGL0107";

	/** LEVEL[W]<br>案件処理区分が未選択の場合は振替元に複数の案件を選択できません。<p>
	 */
	public static String MSBGL0108 = "MSBGL0108";

	/** LEVEL[W]<br>振替元の計上年月と異なる計上年月には振替できません。<br>振替元計上年月：{1}<br>振替先計上年月：{2}<br>{3}<p>
	 */
	public static String MSBGL0109 = "MSBGL0109";

	/** LEVEL[I]<br>受取手形決済処理を開始します。<p>
	 */
	public static String MSBGL0110 = "MSBGL0110";

	/** LEVEL[I]<br>受取手形決済処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<p>
	 */
	public static String MSBGL0111 = "MSBGL0111";

	/** LEVEL[W]<br>指定した入金実績の明細を取得できません。<p>
	 */
	public static String MSBGL0112 = "MSBGL0112";

	/** LEVEL[W]<br>請求締が解除されています。再検索してください。<br>請求書ＮＯ ： {1}<p>
	 */
	public static String MSBGL0113 = "MSBGL0113";

	/** LEVEL[I]<br>前回請求額が無く請求明細の出力対象も無いため印刷しませんでした。<br>請求書ＮＯ：{1}<p>
	 */
	public static String MSBGL0114 = "MSBGL0114";

	/** LEVEL[I]<br>与信額補正処理を開始します。<p>
	 */
	public static String MSBGL0115 = "MSBGL0115";

	/** LEVEL[I]<br>与信額補正処理が終了しました。<p>
	 */
	public static String MSBGL0116 = "MSBGL0116";

	/** LEVEL[W]<br>指定した入金方法は決済方法マスタに登録されていません、もしくは債権決済区分が手形として登録されています。<br>入金登録区分：{1}<br>入金先ＣＤ：{2}<br>債権決済区分：{3}<br>{4}<p>
	 */
	public static String MSBGL0117 = "MSBGL0117";

	/** LEVEL[W]<br>自動売掛明細消込処理にて、売掛明細の消込を全額行うことができませんでした。<br>消込残額は売掛明細消込登録画面でマニュアルで消込してください。<br>入金実績明細ＮＯ：{1}<p>
	 */
	public static String MSBGL0118 = "MSBGL0118";

	/** LEVEL[W]<br>請求書発行区分が「3：入金予定調整後」の請求先は、入金予定を調整するまで請求書を発行できません。<br>請求書ＮＯ：{1}<p>
	 */
	public static String MSBGL0119 = "MSBGL0119";

	/** LEVEL[W]<br>指定された計上日で引継元の部門が無効です。<br>仕訳対象外の相殺方法を選択するか、計上日を見直してください。<br>引継元の入金実績ＮＯ：{1}<br>引継元の部門ＣＤ：{2}<p>
	 */
	public static String MSBGL0120 = "MSBGL0120";

	/** LEVEL[W]<br>指定された計上日で引継元の部門が無効です。<br>引継元の入金実績の部門を振り替えてから登録するか、計上日を見直してください。<br>引継元の入金実績ＮＯ：{1}<br>引継元の部門ＣＤ：{2}<p>
	 */
	public static String MSBGL0121 = "MSBGL0121";

	/** LEVEL[W]<br>指定された日付において有効な債権部門として登録されていません。<br>債権部門：{1}<br>日付：{2}<br>{3}<p>
	 */
	public static String MSBGL0122 = "MSBGL0122";

	/** LEVEL[W]<br>取引先マスタの請求締日２～５を設定している場合は、入金予定制御マスタを請求先ごとに設定してください。もしくは入金サイト、入金予定日の設定を確認してください。<br>請求先ＣＤ：{1}<br>ワーキンググループＣＤ：{2}<br>取引通貨ＣＤ：{3}<p>
	 */
	public static String MSBGL0123 = "MSBGL0123";

	/** LEVEL[W]<br>支払実績に対応する入金情報が処理済のため、更新、取消できません。<br>入金ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBGL0124 = "MSBGL0124";

	/** LEVEL[W]<br>決済方法マスタで債権決済方法がオン、債権決済区分が「4：相殺（借方）」、債権債務先識別区分が「1：支払予定管理先」の決済方法を指定してください。<br>決済方法ＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBGL0125 = "MSBGL0125";

	/** LEVEL[W]<br>指定した請求に含まれる、一部請求に対応する繰越分の請求明細が未請求残高振替済みのため締解除できません。<br>請求書ＮＯ：{1}<p>
	 */
	public static String MSBGL0126 = "MSBGL0126";

	/** LEVEL[W]<br>指定した請求に含まれる、一部請求に対応する繰越分の請求明細が売掛明細消込済みのため締解除できません。<br>請求書ＮＯ：{1}<p>
	 */
	public static String MSBGL0127 = "MSBGL0127";

	/** LEVEL[W]<br>無効な品目が請求明細に存在するため、請求締処理ができません。<br>請求先ＣＤ：{1}<br>請求部門ＣＤ：{2}<br>取引通貨ＣＤ：{3}<br>インボイスＮＯ：{4}<br>案件ＮＯ：{5}<br>請求締年月日：{6}<p>
	 */
	public static String MSBGL0128 = "MSBGL0128";

	/** LEVEL[W]<br>無効な品目が請求明細に存在するため、締解除できません。<br>請求書ＮＯ：{1}<p>
	 */
	public static String MSBGL0129 = "MSBGL0129";

	/** LEVEL[W]<br>取引先マスタに有効な売掛先として登録されていません。<br>売掛先ＣＤ：{1}<p>
	 */
	public static String MSBGL0130 = "MSBGL0130";

	/** LEVEL[W]<br>取引先マスタに有効な請求先として登録されていません。<br>請求先ＣＤ：{1}<p>
	 */
	public static String MSBGL0131 = "MSBGL0131";

	/** LEVEL[W]<br>選択された請求明細の組み合わせが不正です。<br>以下の入金実績明細を元に売掛明細消込された請求明細を全て選択するか、売掛明細消込を取り消してから請求締処理を行ってください。<br>請求先ＣＤ：{1}<br>請求部門ＣＤ：{2}<br>取引通貨ＣＤ：{3}<br>インボイスＮＯ：{4}<br>案件ＮＯ：{5}<br>請求締年月日：{6}<br>入金実績明細ＮＯ：{7}<p>
	 */
	public static String MSBGL0132 = "MSBGL0132";

	/** LEVEL[W]<br>請求部門が不正です。以下を確認してください。<br>・指定した部門、適用日に対応する部門マスタが設定されていること<br>・部門マスタの債権部門がオンになっていること<br>・取引先マスタで請求先に対する請求先部門として指定されていること<br>適用日：{1}<br>請求先ＣＤ：{2}<br>請求部門ＣＤ：{3}<p>
	 */
	public static String MSBGL0133 = "MSBGL0133";

	/** LEVEL[W]<br>基準通貨を取引通貨として設定する場合は、1以外の数値を為替レートに指定できません。<br>為替レート：{1}<p>
	 */
	public static String MSBGL0300 = "MSBGL0300";

	/** LEVEL[W]<br>決済方法マスタで「現金」「振込」「手形」以外の債権決済区分が指定された入金方法は使用できません。<br>入金方法：{1}<p>
	 */
	public static String MSBGL0301 = "MSBGL0301";

	/** LEVEL[W]<br>債権決済区分が「現金」「手形」の場合は口座、振込人名を指定できません。<p>
	 */
	public static String MSBGL0302 = "MSBGL0302";

	/** LEVEL[W]<br>債権決済区分が「振込」の場合は口座を指定してください。<p>
	 */
	public static String MSBGL0303 = "MSBGL0303";

	/** LEVEL[W]<br>債権決済区分が「手形」以外の場合は、手形項目（手形番号、手形区分、振出日、支払期日、振出人名、裏書人、引受人、手形理由ＣＤ、振出銀行、振出支店、予備１、予備２、予備３）は指定できません。<p>
	 */
	public static String MSBGL0304 = "MSBGL0304";

	/** LEVEL[W]<br>債権決済区分が「手形」で手形区分が「為替手形」の場合は、引受人を指定してください。<p>
	 */
	public static String MSBGL0305 = "MSBGL0305";

	/** LEVEL[W]<br>前受金しか存在しないため、請求締処理ができません。<br>請求締処理に前受金を含める場合は、売上または入金の請求明細を含めて実行してください。<br>請求先ＣＤ：{1}<br>請求部門ＣＤ：{2}<br>取引通貨ＣＤ：{3}<br>インボイスＮＯ：{4}<br>案件ＮＯ：{5}<br>請求締年月日：{6}<p>
	 */
	public static String MSBGL0501 = "MSBGL0501";

	/** LEVEL[W]<br>指定されたＩＦ処理区分は実行対象外です。<br>ＩＦ処理区分：{1}<p>
	 */
	public static String MSBGL0601 = "MSBGL0601";

	/** LEVEL[I]<br>処理を開始します。（請求ＩＦ送信サービス実行）<p>
	 */
	public static String MSBGL0602 = "MSBGL0602";

	/** LEVEL[I]<br>送信処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSBGL0603 = "MSBGL0603";

	/** LEVEL[I]<br>処理を終了しました。（請求ＩＦ送信サービス実行）<p>
	 */
	public static String MSBGL0604 = "MSBGL0604";

	/** LEVEL[W]<br>保存先のパスを取得できませんでした。帳票保存先マスタにて、「取引先が未指定」のレコードを登録してください。<br>業務区分：{1}<p>
	 */
	public static String MSBGL0605 = "MSBGL0605";

	/** LEVEL[I]<br>支払予定明細を設定します。よろしいですか？<p>
	 */
	public static String MSBHP0001 = "MSBHP0001";

	/** LEVEL[I]<br>税差額を取得します。よろしいですか？<p>
	 */
	public static String MSBHP0002 = "MSBHP0002";

	/** LEVEL[I]<br>相殺先に買掛先と異なる値が入力されています。よろしいですか？<br>相殺先：{1}<br>買掛先：{2}<p>
	 */
	public static String MSBHP0003 = "MSBHP0003";

	/** LEVEL[I]<br>相殺対象残高がマイナスとなっています。よろしいですか？<br>相殺対象残高：{1}<br>債務相殺先区分：{2}<br>相殺先：{3}<br>相殺部門：{4}<p>
	 */
	public static String MSBHP0004 = "MSBHP0004";

	/** LEVEL[I]<br>今回有償支給額を取得します。よろしいですか？<p>
	 */
	public static String MSBHP0005 = "MSBHP0005";

	/** LEVEL[I]<br>手形サイトが手形サイト上限を超えています。よろしいですか？<br>支払先：{1}<br>振出日：{2}<br>支払期日：{3}<br>手形サイト：{4}<br>手形サイト上限：{5}<p>
	 */
	public static String MSBHP0006 = "MSBHP0006";

	/** LEVEL[W]<br>すでに支払予定が登録されてるため、訂正できません。<p>
	 */
	public static String MSBHP0007 = "MSBHP0007";

	/** LEVEL[W]<br>すでに支払予定が登録されてるため、取消できません。<p>
	 */
	public static String MSBHP0008 = "MSBHP0008";

	/** LEVEL[W]<br>都度支払の場合、以下の項目の値が異なる買掛明細はまとめられません。<br>　　支払予定管理先、通貨、案件ＮＯ、仕入実績ＮＯ、受領インボイス管理ＮＯ<br>都度支払でない場合、以下の項目の値が異なる買掛明細はまとめられません。<br>　　支払予定管理先、通貨、案件ＮＯ<p>
	 */
	public static String MSBHP0009 = "MSBHP0009";

	/** LEVEL[W]<br>振替元と振替先に同一の支払予定管理先担当部門、買掛先、債務部門、案件が指定されていますが、よろしいですか？<p>
	 */
	public static String MSBHP0010 = "MSBHP0010";

	/** LEVEL[I]<br>支払実績を設定します。よろしいですか？<p>
	 */
	public static String MSBHP0151 = "MSBHP0151";

	/** LEVEL[I]<br>前渡金実績を設定します。よろしいですか？<p>
	 */
	public static String MSBHP0152 = "MSBHP0152";

	/** LEVEL[W]<br>支払予定管理先、基準日を元に支払予定管理先担当部門を取得できませんでした。<br>支払予定管理先ＣＤ：{1}<br>基準日：{2}<br>{3}<p>
	 */
	public static String MSBHL0001 = "MSBHL0001";

	/** LEVEL[W]<br>支払予定管理先締年月日を計算できませんでした。<br>支払予定管理先ＣＤ：{1}<br>支払起算日：{2}<br>支払繰越回数：{3}<br>{4}<p>
	 */
	public static String MSBHL0002 = "MSBHL0002";

	/** LEVEL[W]<br>最新の支払予定以外は登録・訂正・取消できません。<br>登録・訂正・取消対象の支払予定の締年月日以降の締年月日で支払予定が登録されていないか確認してください。<br>支払予定管理先ＣＤ：{1}<br>支払予定管理先担当部門ＣＤ：{2}<br>取引通貨ＣＤ：{3}<br>案件ＮＯ：{4}<br>締年月日：{5}<br>支払照合ＮＯ：{6}<p>
	 */
	public static String MSBHL0003 = "MSBHL0003";

	/** LEVEL[W]<br>仮単価の買掛明細が含まれているため、登録できません。<br>仕入実績明細ＮＯ：{1}<br>買掛明細ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBHL0004 = "MSBHL0004";

	/** LEVEL[W]<br>最新の支払予定以外は登録・訂正・取消できません。<br>登録・訂正・取消対象の支払予定の締年月日以降の締年月日で支払予定が登録されていないか確認してください。<br>支払予定管理先ＣＤ：{1}<br>支払予定管理先担当部門ＣＤ（訂正前）：{2}<br>取引通貨ＣＤ：{3}<br>案件ＮＯ：{4}<br>締年月日（訂正前）：{5}<br>支払照合ＮＯ：{6}<p>
	 */
	public static String MSBHL0005 = "MSBHL0005";

	/** LEVEL[W]<br>買掛明細の源泉税額合計と、債務決済区分が「源泉税」の支払予定額合計が一致しません。<br>支払予定管理先ＣＤ：{1}<br>買掛明細の合計金額：{2}<br>支払予定の合計金額：{3}<p>
	 */
	public static String MSBHL0006 = "MSBHL0006";

	/** LEVEL[W]<br>支払予定登録時に支払実績を同時計上する場合は、支払予定日に運用日付以前の日付を指定してください。<br>支払予定日と同じ日付が支払実績の計上日に設定されます。<br>支払予定日：{1}<br>{2}<p>
	 */
	public static String MSBHL0007 = "MSBHL0007";

	/** LEVEL[W]<br>税差額を再計算した結果が、指定された税差額と一致しませんでした。税差額取得ボタンを押下してから再度登録してください。<br>支払予定管理先ＣＤ：{1}<p>
	 */
	public static String MSBHL0008 = "MSBHL0008";

	/** LEVEL[W]<br>同一のヘッダにまとめられる他の明細でエラーが発生しました。<br>{1}<p>
	 */
	public static String MSBHL0009 = "MSBHL0009";

	/** LEVEL[W]<br>照合済の買掛明細が含まれているため、登録できません。<br>支払予定管理先ＣＤ：{1}<br>買掛明細ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBHL0010 = "MSBHL0010";

	/** LEVEL[W]<br>承認状況が一次承認済または最終承認済のため、取消できません。<br>支払照合ＮＯ：{1}<p>
	 */
	public static String MSBHL0011 = "MSBHL0011";

	/** LEVEL[W]<br>同じ支払予定管理先において先に処理した支払予定でエラーが発生したため、登録できませんでした。<br>支払予定管理先ＣＤ：{1}<br>締日：{2}<p>
	 */
	public static String MSBHL0012 = "MSBHL0012";

	/** LEVEL[W]<br>支払状況区分が一部支払または支払済の支払予定が存在するため、取消できません。<br>支払照合ＮＯ：{1}<p>
	 */
	public static String MSBHL0013 = "MSBHL0013";

	/** LEVEL[W]<br>繰越分の買掛明細が照合済みのため、取消できません。<br>支払照合ＮＯ：{1}<p>
	 */
	public static String MSBHL0014 = "MSBHL0014";

	/** LEVEL[W]<br>金額と税額の合計が0になっています。<br>買掛明細ＮＯ：{1}<br>支払方式区分：{2}<p>
	 */
	public static String MSBHL0015 = "MSBHL0015";

	/** LEVEL[W]<br>買掛先、債務部門、債務区分ごとの買掛明細の金額と支払予定の金額が一致していないため、支払予定を登録できません。<br>買掛先ＣＤ：{1}<br>債務部門ＣＤ：{2}<br>債務区分：{3}<br>買掛明細の金額合計：{4}<br>支払予定の金額合計：{5}<p>
	 */
	public static String MSBHL0016 = "MSBHL0016";

	/** LEVEL[W]<br>前渡金と相殺する場合、0より大きい金額を指定してください。<br>前渡金支払実績ＮＯ：{1}<br>金額：{2}<br>{3}<p>
	 */
	public static String MSBHL0017 = "MSBHL0017";

	/** LEVEL[W]<br>手数料行のみの登録はできません。<br>支払予定管理先ＣＤ：{1}<p>
	 */
	public static String MSBHL0018 = "MSBHL0018";

	/** LEVEL[I]<br>支払予定登録処理を開始します。<p>
	 */
	public static String MSBHL0019 = "MSBHL0019";

	/** LEVEL[I]<br>支払予定登録処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<p>
	 */
	public static String MSBHL0020 = "MSBHL0020";

	/** LEVEL[W]<br>支払予定管理先締年月日が設定されてない買掛明細情報を処理対象外としました。支払予定登録画面から登録してください。<br>支払予定管理先：{1}<p>
	 */
	public static String MSBHL0021 = "MSBHL0021";

	/** LEVEL[W]<br>支払予定制御マスタが取得できませんでした。支払予定制御マスタを設定してください。<br>支払予定管理先：{1}<br>ワーキンググループ：{2}<br>取引通貨：{3}<p>
	 */
	public static String MSBHL0022 = "MSBHL0022";

	/** LEVEL[W]<br>都度支払の支払予定を自動で作成する処理で以下のエラーが発生したため、支払予定を登録しませんでした。マニュアルで支払予定を登録してください。<p>
	 */
	public static String MSBHL0023 = "MSBHL0023";

	/** LEVEL[W]<br>会社マスタの仕入税と同じ税率で内税がオンの税ＣＤが税マスタに存在しないため処理できませんでした。<p>
	 */
	public static String MSBHL0024 = "MSBHL0024";

	/** LEVEL[W]<br>債務決済区分「7：源泉税」に対応する決済方法マスタが登録されていないため処理できません。<br>決済方法マスタを登録してください。<p>
	 */
	public static String MSBHL0025 = "MSBHL0025";

	/** LEVEL[W]<br>支払予定管理先に対応する取引先マスタが取得できませんでした。取引先マスタを設定してください。<br>支払予定管理先：{1}<p>
	 */
	public static String MSBHL0026 = "MSBHL0026";

	/** LEVEL[W]<br>0より大きいかつ元の金額より小さい値を設定してください。<br>元の金額：{1}<br>入力した金額：{2}<br>{3}<p>
	 */
	public static String MSBHL0027 = "MSBHL0027";

	/** LEVEL[W]<br>0より小さいかつ元の金額より大きい値を設定してください。<br>元の金額：{1}<br>入力した金額：{2}<br>{3}<p>
	 */
	public static String MSBHL0028 = "MSBHL0028";

	/** LEVEL[W]<br>0以上かつ元の税金額より小さい値を設定してください。<br>元の税金額：{1}<br>入力した税金額：{2}<br>{3}<p>
	 */
	public static String MSBHL0029 = "MSBHL0029";

	/** LEVEL[W]<br>0以下かつ元の税金額より大きい値を設定してください。<br>元の税金額：{1}<br>入力した税金額：{2}<br>{3}<p>
	 */
	public static String MSBHL0030 = "MSBHL0030";

	/** LEVEL[W]<br>承認対象の支払予定は、承認されるまで支払予定表を発行できません。<br>支払予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBHL0031 = "MSBHL0031";

	/** LEVEL[W]<br>承認対象の支払予定は、承認されるまで支払予定明細を発行できません。<br>支払照合ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBHL0032 = "MSBHL0032";

	/** LEVEL[W]<br>支払予定日が取得できませんでした。支払予定制御マスタを設定してください。<br>支払予定管理先ＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBHL0033 = "MSBHL0033";

	/** LEVEL[W]<br>支払部門が取得できませんでした。取引先マスタに設定してください。<br>支払先ＣＤ：{1}<br>基準日：{2}<br>{3}<p>
	 */
	public static String MSBHL0034 = "MSBHL0034";

	/** LEVEL[W]<br>支払予定が承認されていないため、支払実績を登録できません。<br>支払照合ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBHL0035 = "MSBHL0035";

	/** LEVEL[W]<br>手形サイトが手形サイト上限を超えているため登録できません。<br>支払先：{1}<br>振出日：{2}<br>支払期日：{3}<br>手形サイト：{4}<br>手形サイト上限：{5}<br>{6}<p>
	 */
	public static String MSBHL0036 = "MSBHL0036";

	/** LEVEL[W]<br>支払予定に対応する支払実績を１件以上含める必要があります。<br>{1}<p>
	 */
	public static String MSBHL0037 = "MSBHL0037";

	/** LEVEL[W]<br>支払実績の訂正で全行削除はできません。支払実績を取り消してください。<br>支払実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBHL0038 = "MSBHL0038";

	/** LEVEL[W]<br>支払実績が登録されているため、為替差損益に影響する仕入実績は訂正できません。支払実績を取り消した後、訂正してください。<br>仕入実績ＮＯ：{1}<br>受領インボイス管理ＮＯ：{2}<br>{3}<p>
	 */
	public static String MSBHL0039 = "MSBHL0039";

	/** LEVEL[W]<br>既に支払予定が登録されてるため、前渡金実績を訂正できません。<br>前渡金実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBHL0040 = "MSBHL0040";

	/** LEVEL[W]<br>既に支払予定が登録されてるため、前渡金実績を取消できません。<br>前渡金実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBHL0041 = "MSBHL0041";

	/** LEVEL[W]<br>前渡金と相殺する場合は、相殺部門、債務部門に前渡金の負担部門と同じ部門を指定してください。<br>相殺部門：{1}<br>債務部門：{2}<br>前渡金の負担部門：{3}<br>{4}<p>
	 */
	public static String MSBHL0042 = "MSBHL0042";

	/** LEVEL[W]<br>指定された前渡金実績が存在しないため、支払予定を登録できません。<br>前渡金実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBHL0043 = "MSBHL0043";

	/** LEVEL[W]<br>買掛消込予定に対する支払金額の合計が支払予定額を超えているため、支払実績を登録できません。<br>買掛消込予定ＮＯ：{1}<br>買掛消込予定に対する支払金額合計：{2}<br>支払予定額：{3}<br>{4}<p>
	 */
	public static String MSBHL0044 = "MSBHL0044";

	/** LEVEL[W]<br>前渡金相殺予定額が前渡金額を超えているため、支払予定を登録できません。<br>前渡金相殺予定額：{1}<br>前渡金額：{2}<br>前渡金支払実績ＮＯ：{3}<p>
	 */
	public static String MSBHL0045 = "MSBHL0045";

	/** LEVEL[I]<br>支払実績計上処理を開始します。<p>
	 */
	public static String MSBHL0046 = "MSBHL0046";

	/** LEVEL[I]<br>支払実績計上処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<p>
	 */
	public static String MSBHL0047 = "MSBHL0047";

	/** LEVEL[W]<br>支払予定時税差額の買掛明細しか設定されていないため、支払予定を登録できません。<br>支払予定管理先ＣＤ：{1}<p>
	 */
	public static String MSBHL0048 = "MSBHL0048";

	/** LEVEL[W]<br>支払予定に指定されている買掛先、債務部門、債務区分が買掛明細に存在しないため、支払予定を登録できません。<br>買掛先ＣＤ：{1}<br>債務部門ＣＤ：{2}<br>債務区分：{3}<br>{4}<p>
	 */
	public static String MSBHL0049 = "MSBHL0049";

	/** LEVEL[W]<br>既に支払締が行われているため、支払予定時税差額の買掛明細を登録できません。<br>計上日：{1}<br>{2}<p>
	 */
	public static String MSBHL0050 = "MSBHL0050";

	/** LEVEL[W]<br>相殺先に指定した値が取引先マスタに存在しません。<br>相殺先ＣＤ：{1}<br>{2}<p>
	 */
	public static String MSBHL0051 = "MSBHL0051";

	/** LEVEL[W]<br>支払照合に対して次処理（支払実績の登録）が行われているため、承認対象となるような更新はできません。<br>支払照合ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBHL0052 = "MSBHL0052";

	/** LEVEL[W]<br>先に処理した支払予定でエラーが発生したため、処理対象から除外しました。<br>支払予定管理先ＣＤ：{1}<br>支払予定管理先担当部門ＣＤ：{2}<br>仕入実績ＮＯ：{3}<br>受領インボイス管理ＮＯ：{4}<br>受領インボイスＮＯ：{5}<br>取引通貨ＣＤ：{6}<br>案件ＮＯ：{7}<br>締年月日：{8}<p>
	 */
	public static String MSBHL0053 = "MSBHL0053";

	/** LEVEL[W]<br>支払予定に設定されている買掛先、債務部門、債務区分に対応する買掛明細が存在しないため、支払予定を登録できません。<br>買掛先ＣＤ：{1}<br>債務部門ＣＤ：{2}<br>債務区分：{3}<br>支払予定の金額合計：{4}<p>
	 */
	public static String MSBHL0054 = "MSBHL0054";

	/** LEVEL[W]<br>０より小さい数字を指定してください。<br>列名：{1}<br>{2}<p>
	 */
	public static String MSBHL0055 = "MSBHL0055";

	/** LEVEL[W]<br>案件が取得できませんでした。<br>案件ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBHL0101 = "MSBHL0101";

	/** LEVEL[W]<br>手数料は振り替えできません。<br>支払予定ＮＯ：{1}<br>債務決済方法ＣＤ：{2}<br>債務決済区分：{3}<br>{4}<p>
	 */
	public static String MSBHL0102 = "MSBHL0102";

	/** LEVEL[W]<br>源泉税は振り替えできません。<br>支払予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBHL0103 = "MSBHL0103";

	/** LEVEL[W]<br>支払済の支払予定は振り替えできません。<br>支払予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBHL0104 = "MSBHL0104";

	/** LEVEL[W]<br>承認対象の支払予定は承認されるまで振り替えできません。<br>支払予定ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBHL0105 = "MSBHL0105";

	/** LEVEL[W]<br>無効の買掛明細は振り替えできません。<br>買掛明細ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBHL0106 = "MSBHL0106";

	/** LEVEL[W]<br>指定された計上日で振替元の債務部門が無効です。<br>仕訳対象外の債務決済方法を指定するか、計上日を見直してください。<br>支払予定ＮＯ：{1}<br>買掛明細ＮＯ：{2}<br>債務部門ＣＤ：{3}<br>計上日：{4}<br>{5}<p>
	 */
	public static String MSBHL0107 = "MSBHL0107";

	/** LEVEL[W]<br>指定された債務決済方法ＣＤが不正です。<br>次の債務決済区分に対応する債務決済方法ＣＤを指定してください。<br>債務決済方法ＣＤ：{1}<br>債務決済区分：{2}<br>{3}<p>
	 */
	public static String MSBHL0108 = "MSBHL0108";

	/** LEVEL[W]<br>次の債務決済区分に対応する決済方法マスタが登録されていないため処理できません。<br>決済方法マスタを登録してください。<br>債務決済区分：{1}<br>{2}<p>
	 */
	public static String MSBHL0109 = "MSBHL0109";

	/** LEVEL[W]<br>買掛先、債務部門、債務区分ごとの買掛明細に対応する支払予定が設定されていないため、支払予定を登録できません。<br>支払予定設定ボタンを押下してから再度登録してください。<br>買掛先ＣＤ：{1}<br>債務部門ＣＤ：{2}<br>債務区分：{3}<br>買掛明細の合計金額：{4}<p>
	 */
	public static String MSBHL0110 = "MSBHL0110";

	/** LEVEL[W]<br>繰越分の買掛明細が振替済みのため、訂正・取消できません。<br>支払照合ＮＯ：{1}<br>買掛明細ＮＯ：{2}<p>
	 */
	public static String MSBHL0111 = "MSBHL0111";

	/** LEVEL[W]<br>0より大きいかつ元の加工金額より小さい値を設定してください。<br>元の加工金額：{1}<br>入力した加工金額：{2}<br>{3}<p>
	 */
	public static String MSBHL0201 = "MSBHL0201";

	/** LEVEL[W]<br>0より小さいかつ元の加工金額より大きい値を設定してください。<br>元の加工金額：{1}<br>入力した加工金額：{2}<br>{3}<p>
	 */
	public static String MSBHL0202 = "MSBHL0202";

	/** LEVEL[W]<br>0より大きいかつ元の有償支給金額より小さい値を設定してください。<br>元の有償支給金額：{1}<br>入力した有償支給金額：{2}<br>{3}<p>
	 */
	public static String MSBHL0203 = "MSBHL0203";

	/** LEVEL[W]<br>0より小さいかつ元の有償支給金額より大きい値を設定してください。<br>元の有償支給金額：{1}<br>入力した有償支給金額：{2}<br>{3}<p>
	 */
	public static String MSBHL0204 = "MSBHL0204";

	/** LEVEL[W]<br>加工金額と有償支給金額の合計が、金額と異なります。<br>加工金額と有償支給金額の合計：{1}<br>金額：{2}<br>{3}<p>
	 */
	public static String MSBHL0205 = "MSBHL0205";

	/** LEVEL[W]<br>前渡金実績が他の支払照合ヘッダに紐づくため、登録できません。<br>前渡金実績ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBHL0251 = "MSBHL0251";

	/** LEVEL[W]<br>前渡金しか存在しないため、支払照合ができません。<br>支払照合に前渡金を含める場合は、支払予定または支払実績の明細を含めて実行してください。<br>支払予定管理先ＣＤ：{1}<br>支払予定管理先部門ＣＤ：{2}<br>取引通貨ＣＤ：{3}<br>受領インボイスＮＯ：{4}<br>仕入実績ＮＯ：{5}<br>案件ＮＯ：{6}<br>支払予定管理先締年月：{7}<p>
	 */
	public static String MSBHL0252 = "MSBHL0252";

	/** LEVEL[W]<br>承認対象の支払予定は、承認されるまで支払通知書を発行できません。<br>支払照合ＮＯ：{1}<br>{2}<p>
	 */
	public static String MSBHL0253 = "MSBHL0253";

	/** LEVEL[W]<br>支払予定管理先の支払通知書発行対象がオフのため、支払通知書を発行できません。<br>支払照合ＮＯ：{1}<br>支払予定管理先ＣＤ：{2}<p>
	 */
	public static String MSBHL0254 = "MSBHL0254";

	/** LEVEL[W]<br>任意売掛先の仮締解除を行う場合は、仮締解除する売掛先を1件以上行削除してください。<p>
	 */
	public static String MSBIP0001 = "MSBIP0001";

	/** LEVEL[W]<br>任意買掛先の仮締解除を行う場合は、仮締解除する買掛先を1件以上行削除してください。<p>
	 */
	public static String MSBIP0002 = "MSBIP0002";

	/** LEVEL[W]<br>前月の売上締あるいは入金締が完了していません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0001 = "MSBIL0001";

	/** LEVEL[W]<br>前月の仕入締あるいは支払締が完了していません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0002 = "MSBIL0002";

	/** LEVEL[W]<br>前月の売上締が完了していません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0003 = "MSBIL0003";

	/** LEVEL[W]<br>前月の入金締が完了していません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0004 = "MSBIL0004";

	/** LEVEL[W]<br>前月の仕入締が完了していません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0005 = "MSBIL0005";

	/** LEVEL[W]<br>前月の支払締が完了していません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0006 = "MSBIL0006";

	/** LEVEL[W]<br>既に当月の売上締あるいは入金締が行われています。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0007 = "MSBIL0007";

	/** LEVEL[W]<br>既に当月の仕入締あるいは支払締が行われています。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0008 = "MSBIL0008";

	/** LEVEL[W]<br>既に当月の売上締が行われています。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0009 = "MSBIL0009";

	/** LEVEL[W]<br>既に当月の入金締が行われています。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0010 = "MSBIL0010";

	/** LEVEL[W]<br>既に当月の仕入締が行われています。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0011 = "MSBIL0011";

	/** LEVEL[W]<br>既に当月の支払締が行われています。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0012 = "MSBIL0012";

	/** LEVEL[W]<br>既に次月の売掛仮締が行われているため、売掛仮締を解除できません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0013 = "MSBIL0013";

	/** LEVEL[W]<br>既に次月の買掛仮締が行われているため、買掛仮締を解除できません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0014 = "MSBIL0014";

	/** LEVEL[W]<br>既に次月の売上締が行われています。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0015 = "MSBIL0015";

	/** LEVEL[W]<br>既に次月の入金締が行われています。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0016 = "MSBIL0016";

	/** LEVEL[W]<br>既に次月の仕入締が行われています。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0017 = "MSBIL0017";

	/** LEVEL[W]<br>既に次月の支払締が行われています。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0018 = "MSBIL0018";

	/** LEVEL[W]<br>売掛仮締の解除対象がありません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0019 = "MSBIL0019";

	/** LEVEL[W]<br>買掛仮締の解除対象がありません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0020 = "MSBIL0020";

	/** LEVEL[W]<br>売掛仮締が行われていません。<br>処理対象年月：{1}<br>売掛先：{2}<p>
	 */
	public static String MSBIL0021 = "MSBIL0021";

	/** LEVEL[W]<br>買掛仮締が行われていません。<br>処理対象年月：{1}<br>買掛先：{2}<p>
	 */
	public static String MSBIL0022 = "MSBIL0022";

	/** LEVEL[W]<br>当月の売上締が行われていません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0023 = "MSBIL0023";

	/** LEVEL[W]<br>当月の入金締が行われていません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0024 = "MSBIL0024";

	/** LEVEL[W]<br>当月の仕入締が行われていません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0025 = "MSBIL0025";

	/** LEVEL[W]<br>当月の支払締が行われていません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0026 = "MSBIL0026";

	/** LEVEL[W]<br>仮単価の売上実績明細が存在するため、売上締処理ができません。<p>
	 */
	public static String MSBIL0027 = "MSBIL0027";

	/** LEVEL[I]<br>締年月に未処理の入金が存在しました。<p>
	 */
	public static String MSBIL0028 = "MSBIL0028";

	/** LEVEL[W]<br>仮単価の仕入実績明細が存在するため、仕入締処理ができません。<p>
	 */
	public static String MSBIL0029 = "MSBIL0029";

	/** LEVEL[W]<br>未処理の入金（買掛金相殺）が存在するため、支払締処理ができません。<p>
	 */
	public static String MSBIL0030 = "MSBIL0030";

	/** LEVEL[W]<br>前月の在庫締が完了していません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0031 = "MSBIL0031";

	/** LEVEL[W]<br>既に当月の在庫締が行われています。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0032 = "MSBIL0032";

	/** LEVEL[W]<br>既に次月の在庫締が行われています。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0033 = "MSBIL0033";

	/** LEVEL[W]<br>当月の在庫締が行われていません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0034 = "MSBIL0034";

	/** LEVEL[W]<br>既に当月の売掛仮締が行われています。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0035 = "MSBIL0035";

	/** LEVEL[W]<br>既に当月の売掛仮締が行われています。<br>処理対象年月：{1}<br>売掛先：{2}<p>
	 */
	public static String MSBIL0036 = "MSBIL0036";

	/** LEVEL[W]<br>既に当月の買掛仮締が行われています。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0037 = "MSBIL0037";

	/** LEVEL[W]<br>既に当月の買掛仮締が行われています。<br>処理対象年月：{1}<br>買掛先：{2}<p>
	 */
	public static String MSBIL0038 = "MSBIL0038";

	/** LEVEL[W]<br>訂正前の計上日で入出庫制限が行われているため、登録できません。<br>場所：{1}<br>品目：{2}<br>計上日：{3}<br>{4}<p>
	 */
	public static String MSBIL0039 = "MSBIL0039";

	/** LEVEL[W]<br>入出庫制限が行われているため、登録できません。<br>場所：{1}<br>品目：{2}<br>計上日：{3}<br>{4}<br><p>
	 */
	public static String MSBIL0040 = "MSBIL0040";

	/** LEVEL[W]<br>既に売上締が行われているため、登録できません。<br>計上日：{1}<br>{2}<p>
	 */
	public static String MSBIL0041 = "MSBIL0041";

	/** LEVEL[W]<br>既に売掛仮締が行われているため、登録できません。<br>計上日：{1}<br>{2}<p>
	 */
	public static String MSBIL0042 = "MSBIL0042";

	/** LEVEL[W]<br>既に売掛仮締が行われているため、登録できません。<br>計上日：{1}<br>売掛先：{2}<br>{3}<p>
	 */
	public static String MSBIL0043 = "MSBIL0043";

	/** LEVEL[W]<br>既に入金締が行われているため、登録できません。<br>計上日：{1}<br>{2}<p>
	 */
	public static String MSBIL0044 = "MSBIL0044";

	/** LEVEL[W]<br>既に仕入締が行われているため、登録できません。<br>計上日：{1}<br>{2}<p>
	 */
	public static String MSBIL0045 = "MSBIL0045";

	/** LEVEL[W]<br>既に買掛仮締が行われているため、登録できません。<br>計上日：{1}<br>{2}<p>
	 */
	public static String MSBIL0046 = "MSBIL0046";

	/** LEVEL[W]<br>既に買掛仮締が行われているため、登録できません。<br>計上日：{1}<br>買掛先：{2}<br>{3}<p>
	 */
	public static String MSBIL0047 = "MSBIL0047";

	/** LEVEL[W]<br>既に支払締が行われているため、登録できません。<br>計上日：{1}<br>{2}<p>
	 */
	public static String MSBIL0048 = "MSBIL0048";

	/** LEVEL[W]<br>既に在庫締が行われているため、登録できません。<br>計上日：{1}<br>{2}<p>
	 */
	public static String MSBIL0049 = "MSBIL0049";

	/** LEVEL[W]<br>棚卸中の場所があるため、在庫締処理ができません。 <br>在庫締日：{1} <br>制御対象日：{2} <br>場所：{3} <br>品目：{4} <br>棚卸種別区分：{5}<br>{6}<p>
	 */
	public static String MSBIL0050 = "MSBIL0050";

	/** LEVEL[W]<br>月次締処理でエラーが発生しました。<p>
	 */
	public static String MSBIL0051 = "MSBIL0051";

	/** LEVEL[I]<br>月次締処理を開始します。<p>
	 */
	public static String MSBIL0052 = "MSBIL0052";

	/** LEVEL[I]<br>月次締処理が終了しました。<p>
	 */
	public static String MSBIL0053 = "MSBIL0053";

	/** LEVEL[W]<br>訂正前の計上日が売上締済のため、訂正できません。<br>計上日：{1}<br>{2}<p>
	 */
	public static String MSBIL0054 = "MSBIL0054";

	/** LEVEL[W]<br>訂正前の計上日が入金締済のため、訂正できません。<br>計上日：{1}<br>{2}<p>
	 */
	public static String MSBIL0055 = "MSBIL0055";

	/** LEVEL[W]<br>訂正前の計上日が仕入締済のため、訂正できません。<br>計上日：{1}<br>{2}<p>
	 */
	public static String MSBIL0056 = "MSBIL0056";

	/** LEVEL[W]<br>訂正前の計上日が支払締済のため、訂正できません。<br>計上日：{1}<br>{2}<p>
	 */
	public static String MSBIL0057 = "MSBIL0057";

	/** LEVEL[W]<br>訂正前の計上日が在庫締済のため、訂正できません。<br>計上日：{1}<br>{2}<p>
	 */
	public static String MSBIL0058 = "MSBIL0058";

	/** LEVEL[W]<br>既に次月の売掛仮締が行われているため、売上締を解除できません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0059 = "MSBIL0059";

	/** LEVEL[W]<br>既に次月の売掛仮締が行われているため、入金締を解除できません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0060 = "MSBIL0060";

	/** LEVEL[W]<br>既に次月の買掛仮締が行われているため、仕入締を解除できません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0061 = "MSBIL0061";

	/** LEVEL[W]<br>既に次月の買掛仮締が行われているため、支払締を解除できません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0062 = "MSBIL0062";

	/** LEVEL[W]<br>訂正前の計上日が売掛仮締済のため、登録できません。<br>計上日：{1}<br>{2}<p>
	 */
	public static String MSBIL0063 = "MSBIL0063";

	/** LEVEL[W]<br>訂正前の計上日が売掛仮締済のため、登録できません。<br>計上日：{1}<br>売掛先：{2}<br>{3}<p>
	 */
	public static String MSBIL0064 = "MSBIL0064";

	/** LEVEL[W]<br>訂正前の計上日が買掛仮締済のため、登録できません。<br>計上日：{1}<br>{2}<p>
	 */
	public static String MSBIL0065 = "MSBIL0065";

	/** LEVEL[W]<br>訂正前の計上日が買掛仮締済のため、登録できません。<br>計上日：{1}<br>買掛先：{2}<br>{3}<p>
	 */
	public static String MSBIL0066 = "MSBIL0066";

	/** LEVEL[W]<br>月次受払在庫で月末在庫の数量がマイナスとなるため登録できません。<br>年月：{1}<br>受払区分：{2}<br>品目：{3}<br>場所ＣＤ：{4}<br>棚・ラインＣＤ：{5}<br>在庫着荷先ＣＤ：{6}<br>ロットＮＯ：{7}<br>サブロットＮＯ：{8}<br>手配ＮＯ：{9}<br>確定ＮＯ区分：{10}<br>確定ＮＯ：{11}<br>荷姿単位ＣＤ：{12}<br>格付ＣＤ：{13}<br>積送品区分：{14}<br>良品区分：{15}<br>資産区分：{16}<br>在庫検査区分：{17}<br>在庫識別区分：{18}<br>在庫取引先ＣＤ：{19}<br>荷姿単位数量：{20}<br>基準単位数量：{21}<br>{22}<p>
	 */
	public static String MSBIL0067 = "MSBIL0067";

	/** LEVEL[W]<br>入出庫制限が行われているため、登録できません。<br>場所：{1}<br>計上日：{2}<br>{3}<br><p>
	 */
	public static String MSBIL0068 = "MSBIL0068";

	/** LEVEL[W]<br>訂正前の計上日で入出庫制限が行われているため、登録できません。<br>場所：{1}<br>計上日：{2}<br>{3}<br><p>
	 */
	public static String MSBIL0069 = "MSBIL0069";

	/** LEVEL[W]<br>指定した処理対象年月以降の年月で売上締あるいは入金締が行われているため、仮締できません。<br>処理対象年月：{1}<br>{2}<p>
	 */
	public static String MSBIL0070 = "MSBIL0070";

	/** LEVEL[W]<br>指定した処理対象年月以降の年月で仕入締が行われているため、仮締できません。<br>処理対象年月：{1}<br>{2}<p>
	 */
	public static String MSBIL0071 = "MSBIL0071";

	/** LEVEL[W]<br>指定した処理対象年月以降の年月で売上締あるいは入金締が行われているため、仮締を解除できません。<br>処理対象年月：{1}<br>{2}<p>
	 */
	public static String MSBIL0072 = "MSBIL0072";

	/** LEVEL[W]<br>指定した処理対象年月以降の年月で仕入締が行われているため、仮締を解除できません。<br>処理対象年月：{1}<br>{2}<p>
	 */
	public static String MSBIL0073 = "MSBIL0073";

	/** LEVEL[W]<br>既に当月の仕入締が行われています。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0074 = "MSBIL0074";

	/** LEVEL[W]<br>前月の仕入締が完了していません。<br>処理対象年月：{1}<p>
	 */
	public static String MSBIL0075 = "MSBIL0075";

	/** LEVEL[W]<br><p>
	 */
	public static String MSLAP0001 = "MSLAP0001";

	/** LEVEL[I]<br>受注受信ＩＦ取込処理を開始します。<p>
	 */
	public static String MSLAL0001 = "MSLAL0001";

	/** LEVEL[I]<br>受注受信ＩＦ取込処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSLAL0002 = "MSLAL0002";

	/** LEVEL[W]<br>同じ得意先、得意先注文ＮＯにおいて先に処理した注文でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<p>
	 */
	public static String MSLAL0003 = "MSLAL0003";

	/** LEVEL[W]<br>同じ得意先、得意先注文ＮＯにおいて、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<p>
	 */
	public static String MSLAL0004 = "MSLAL0004";

	/** LEVEL[W]<br>受注受信ＩＦ取込処理でエラーが発生しました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>メッセージＩＤ：{3}<br>メッセージ：<br>{4}<p>
	 */
	public static String MSLAL0005 = "MSLAL0005";

	/** LEVEL[W]<br>同じ得意先、得意先注文ＮＯに対する他の注文の取り込み処理でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<p>
	 */
	public static String MSLAL0006 = "MSLAL0006";

	/** LEVEL[W]<br>同一の得意先注文明細ＮＯが存在するため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0007 = "MSLAL0007";

	/** LEVEL[W]<br>売上部門を取得できませんでした。売上部門ＣＤを指定して取込むか、得意先担当マスタを登録してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>適用日：{4}<p>
	 */
	public static String MSLAL0008 = "MSLAL0008";

	/** LEVEL[W]<br>売上担当者を元に、売上部門を取得できませんでした。担当者権限マスタに営業部門を指定してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>売上担当者：{3}<br>適用日：{4}<p>
	 */
	public static String MSLAL0009 = "MSLAL0009";

	/** LEVEL[W]<br>諸口品の場合、品名は必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<p>
	 */
	public static String MSLAL0010 = "MSLAL0010";

	/** LEVEL[W]<br>デフォルト格付が取得できませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0011 = "MSLAL0011";

	/** LEVEL[W]<br>数量の小数部桁数が正しくありません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>数量：{3}<br>小数部有効桁数：{4}<p>
	 */
	public static String MSLAL0012 = "MSLAL0012";

	/** LEVEL[W]<br>税を決定することができませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>税率：{3}<br>税区分：{4}<br>内税：{5}<p>
	 */
	public static String MSLAL0013 = "MSLAL0013";

	/** LEVEL[W]<br>注文時の税率に対応する税と、マスタから算出した税が異なります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>注文時の税率に対応する税：{3}<br>マスタから算出した税：{4}<p>
	 */
	public static String MSLAL0014 = "MSLAL0014";

	/** LEVEL[W]<br>後続業務が行われているため、受注のヘッダ項目を変更できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0015 = "MSLAL0015";

	/** LEVEL[W]<br>単価の小数部桁数が正しくありません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>単価：{3}<br>小数部有効桁数：{4}<p>
	 */
	public static String MSLAL0016 = "MSLAL0016";

	/** LEVEL[W]<br>注文時に指定された単価と、マスタの単価が異なります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>注文時に指定された単価：{3}<br>マスタの単価：{4}<p>
	 */
	public static String MSLAL0017 = "MSLAL0017";

	/** LEVEL[W]<br>注文時に指定された金額と、マスタから算出した金額が異なります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>注文時に指定された金額：{3}<br>マスタから算出した金額：{4}<p>
	 */
	public static String MSLAL0018 = "MSLAL0018";

	/** LEVEL[W]<br>注文時に指定された税額と、マスタから算出した税額が異なります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>注文時に指定された税額：{3}<br>マスタから算出した税額：{4}<p>
	 */
	public static String MSLAL0019 = "MSLAL0019";

	/** LEVEL[W]<br>同一の得意先注文が既に存在するため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0020 = "MSLAL0020";

	/** LEVEL[W]<br>対応する受注情報が複数件取得できたため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0021 = "MSLAL0021";

	/** LEVEL[W]<br>対応する受注情報が取得できないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0022 = "MSLAL0022";

	/** LEVEL[I]<br>納期回答受信ＩＦ取込処理を開始します。<p>
	 */
	public static String MSLAL0023 = "MSLAL0023";

	/** LEVEL[I]<br>納期回答受信ＩＦ取込処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSLAL0024 = "MSLAL0024";

	/** LEVEL[W]<br>同じ発注明細において先に処理したデータでエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注ＮＯ：{3}<br>発注明細ＮＯ：{4}<p>
	 */
	public static String MSLAL0025 = "MSLAL0025";

	/** LEVEL[W]<br>同じ発注明細において、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注ＮＯ：{3}<br>発注明細ＮＯ：{4}<p>
	 */
	public static String MSLAL0026 = "MSLAL0026";

	/** LEVEL[W]<br>諸口納品先の場合、納品先名は必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>納品先：{3}<p>
	 */
	public static String MSLAL0027 = "MSLAL0027";

	/** LEVEL[W]<br>諸口配送先の場合、配送先名は必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>配送先：{3}<p>
	 */
	public static String MSLAL0028 = "MSLAL0028";

	/** LEVEL[W]<br>取引の変更を伴う更新はできません。既存のデータを削除してから、新規データとして取り込んでください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>受注ＮＯ：{3}<br>受注明細ＮＯ：{4}<br>変更前の取引：{5}<br>変更後の取引：{6}<p>
	 */
	public static String MSLAL0029 = "MSLAL0029";

	/** LEVEL[W]<br>同じ発注ＮＯ、発注明細ＮＯに対する他の納期回答の取り込み処理でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注：{3}<br>発注明細ＮＯ：{4}<p>
	 */
	public static String MSLAL0030 = "MSLAL0030";

	/** LEVEL[W]<br>納期回答受信ＩＦ取込処理でエラーが発生しました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注ＮＯ：{3}<br>発注明細ＮＯ：{4}<br>メッセージＩＤ：{5}<br>メッセージ：{6}<p>
	 */
	public static String MSLAL0031 = "MSLAL0031";

	/** LEVEL[W]<br>納入指示明細が取消されているため、ＥＤＩ出荷実績を取り込みできません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注ＮＯ：{3}<br>発注明細ＮＯ：{4}<br>納入指示明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0032 = "MSLAL0032";

	/** LEVEL[W]<br>指定された発注が存在しません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注ＮＯ：{3}<br>発注改訂番号：{4}<p>
	 */
	public static String MSLAL0033 = "MSLAL0033";

	/** LEVEL[W]<br>指定された発注が存在しません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注ＮＯ：{3}<br><p>
	 */
	public static String MSLAL0034 = "MSLAL0034";

	/** LEVEL[W]<br>発注時の発注先と異なる発注先が指定されています。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注ＮＯ：{3}<br>発注時の発注先：{4}<br>ＩＦデータの発注先：{5}<p>
	 */
	public static String MSLAL0035 = "MSLAL0035";

	/** LEVEL[W]<br>発注が取消されているため、納期回答を取り込みできません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注ＮＯ：{3}<p>
	 */
	public static String MSLAL0036 = "MSLAL0036";

	/** LEVEL[W]<br>発注時の品目と異なる品目は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注ＮＯ：{3}<br>発注明細ＮＯ：{4}<br>発注時の品目：{5}<br>ＩＦデータの品目：{6}<p>
	 */
	public static String MSLAL0037 = "MSLAL0037";

	/** LEVEL[W]<br>回答数量の小数部桁数が正しくありません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注ＮＯ：{3}<br>発注明細ＮＯ：{4}<br>回答数量：{5}<br>取引単位：{6}<br>小数部有効桁数：{7}<p>
	 */
	public static String MSLAL0038 = "MSLAL0038";

	/** LEVEL[W]<br>指定された納入指示明細が存在しません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注ＮＯ：{3}<br>発注明細ＮＯ：{4}<br>納入指示明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0039 = "MSLAL0039";

	/** LEVEL[W]<br>納入指示明細が取消されているため、納期回答を取り込みできません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注ＮＯ：{3}<br>発注明細ＮＯ：{4}<br>納入指示明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0040 = "MSLAL0040";

	/** LEVEL[W]<br>値引額を設定した場合は、値引理由が必須です。業務理由マスタに売上調整の理由を登録してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0041 = "MSLAL0041";

	/** LEVEL[W]<br>資産管理する品目、かつ単価が0の場合は、販売他勘定の売上理由が必須です。<br>業務理由マスタに販売他勘定の売上理由を登録してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<p>
	 */
	public static String MSLAL0042 = "MSLAL0042";

	/** LEVEL[W]<br>納期回答の取り込み処理でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注：{3}<br>発注明細ＮＯ：{4}<p>
	 */
	public static String MSLAL0043 = "MSLAL0043";

	/** LEVEL[W]<br>品目単位マスタが存在しません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注ＮＯ：{3}<br>発注明細ＮＯ：{4}<br>品目：{5}<br>単位：{6}<p>
	 */
	public static String MSLAL0044 = "MSLAL0044";

	/** LEVEL[W]<br>メーカが指定されている場合、発注先を特定する為に、受注引当マスタに引当場所を登録する必要があります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>メーカ：{3}<p>
	 */
	public static String MSLAL0045 = "MSLAL0045";

	/** LEVEL[W]<br>手配区分が仕入直送、かつメーカが指定されている場合、発注先を特定する為に、仕入直送中継場所を設定する必要があります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>メーカ：{3}<p>
	 */
	public static String MSLAL0046 = "MSLAL0046";

	/** LEVEL[W]<br>該当のメーカに対応する発注先が取得できませんでした。品目詳細マスタを登録してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>メーカ：{3}<p>
	 */
	public static String MSLAL0047 = "MSLAL0047";

	/** LEVEL[I]<br>入荷実績受信ＩＦ取込処理を開始します。<p>
	 */
	public static String MSLAL0048 = "MSLAL0048";

	/** LEVEL[I]<br>入荷実績受信ＩＦ取込処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSLAL0049 = "MSLAL0049";

	/** LEVEL[W]<br>同じ入荷物流グループ、外部システムＣＤ、外部入荷実績ＮＯにおいて先に処理した入荷実績でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>入荷物流グループ：{3}<br>外部システムＣＤ：{4}<br>外部入荷実績ＮＯ：{5}<p>
	 */
	public static String MSLAL0050 = "MSLAL0050";

	/** LEVEL[W]<br>同じ入荷物流グループ、外部システムＣＤ、外部入荷実績ＮＯにおいて、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>入荷物流グループ：{3}<br>外部システムＣＤ：{4}<br>外部入荷実績ＮＯ：{5}<p>
	 */
	public static String MSLAL0051 = "MSLAL0051";

	/** LEVEL[W]<br>入荷実績受信ＩＦ取込処理でエラーが発生しました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>メッセージＩＤ：{3}<br>メッセージ：<br>{4}<p>
	 */
	public static String MSLAL0052 = "MSLAL0052";

	/** LEVEL[W]<br>同じ入荷物流グループ、および下記ＮＯに対する他の入荷実績の取り込み処理でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>入荷物流グループ：{3}<br>受領インボイスＮＯ：{4}<br>発注ＮＯ：{5}<br>売上返品予定ＮＯ：{6}<br>インボイスＮＯ：{7}<br>納品書ＮＯ：{8}<p>
	 */
	public static String MSLAL0053 = "MSLAL0053";

	/** LEVEL[W]<br>対応する入荷予定情報が取得できないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0054 = "MSLAL0054";

	/** LEVEL[W]<br>入荷予定に対して既に入荷実績が登録されているため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部入荷実績ＮＯ：{4}<p>
	 */
	public static String MSLAL0055 = "MSLAL0055";

	/** LEVEL[W]<br>入荷実績情報が登録済みのため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部入荷実績ＮＯ：{4}<p>
	 */
	public static String MSLAL0056 = "MSLAL0056";

	/** LEVEL[W]<br>対応する入荷実績情報が取得できないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部入荷実績ＮＯ：{4}<p>
	 */
	public static String MSLAL0057 = "MSLAL0057";

	/** LEVEL[W]<br>入荷物流グループが入荷予定と異なるため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>入荷物流グループ：{3}<br>入荷物流グループ（予定）：{4}<p>
	 */
	public static String MSLAL0058 = "MSLAL0058";

	/** LEVEL[W]<br>版ＮＯが入荷予定と異なるため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>版ＮＯ：{3}<br>版ＮＯ（予定）：{4}<p>
	 */
	public static String MSLAL0059 = "MSLAL0059";

	/** LEVEL[W]<br>発注日≦回答納入日の関係で指定してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注ＮＯ：{3}<br>発注明細ＮＯ：{4}<br>発注日：{5}<br>回答納入日：{6}<p>
	 */
	public static String MSLAL0060 = "MSLAL0060";

	/** LEVEL[W]<br>資産管理しない品目、かつ単価が0の場合は、販売他勘定ではない売上理由が必須です。<br>業務理由マスタに販売他勘定ではない売上理由を登録してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<p>
	 */
	public static String MSLAL0061 = "MSLAL0061";

	/** LEVEL[W]<br>資産管理する品目、かつ単価が0の場合は、負担部門が必須です。<br>売上部門を負担部門として設定する為、部門マスタの負担部門をオンにしてください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<br>売上部門：{4}<p>
	 */
	public static String MSLAL0062 = "MSLAL0062";

	/** LEVEL[W]<br>発注明細が以下のいずれかの状態であるため、回答を取り込みできません。<br>・入荷完了<br>・仕入完了<br>・受領インボイス登録済<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注ＮＯ：{3}<br>発注明細ＮＯ：{4}<p>
	 */
	public static String MSLAL0063 = "MSLAL0063";

	/** LEVEL[I]<br>製造実績受信ＩＦ取込処理を開始します。<p>
	 */
	public static String MSLAL0069 = "MSLAL0069";

	/** LEVEL[I]<br>製造実績受信ＩＦ取込処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSLAL0070 = "MSLAL0070";

	/** LEVEL[I]<br>ＳＣＭ制御マスタの設定により、受信対象外のデータであるため、スキップしました。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<p>
	 */
	public static String MSLAL0071 = "MSLAL0071";

	/** LEVEL[I]<br>同じ外部システムＣＤ、外部実績ＮＯにおいて、外部システムデータＮＯが大きい更新データを処理しているため、スキップしました。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<p>
	 */
	public static String MSLAL0072 = "MSLAL0072";

	/** LEVEL[I]<br>工程実績の取消レコードを受信しました。そのため、取消対象の工程に紐づく実績の取込をスキップしました。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<p>
	 */
	public static String MSLAL0073 = "MSLAL0073";

	/** LEVEL[I]<br>全工程実績作成の出来高実績の受信により、取込をスキップしました。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<p>
	 */
	public static String MSLAL0074 = "MSLAL0074";

	/** LEVEL[I]<br>製造取消により、取込をスキップしました。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<p>
	 */
	public static String MSLAL0075 = "MSLAL0075";

	/** LEVEL[I]<br>製造実績取込時、処理対象外工数であるため、スキップしました。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<p>
	 */
	public static String MSLAL0076 = "MSLAL0076";

	/** LEVEL[W]<br>同じ製造指図に紐づくレコードの取込処理でエラーが発生しました。エラーが発生しているレコードを確認してください。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<br>製造指図ＮＯ：{4}<p>
	 */
	public static String MSLAL0077 = "MSLAL0077";

	/** LEVEL[W]<br>同一の外部システムＣＤ、外部システムデータＮＯを持つ他の実績の取込処理でエラーが発生したため、取り込みできませんでした。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<p>
	 */
	public static String MSLAL0078 = "MSLAL0078";

	/** LEVEL[I]<br>工程完了処理を開始します。<br>工程実績件数：{1}<p>
	 */
	public static String MSLAL0079 = "MSLAL0079";

	/** LEVEL[I]<br>工程完了処理が終了しました。<br>成功件数：{1}<br>失敗件数：{2}<br>未処理件数：{3}<p>
	 */
	public static String MSLAL0080 = "MSLAL0080";

	/** LEVEL[W]<br>製造実績受信ＩＦ取込処理でエラーが発生しました。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<br>メッセージＩＤ：{4}<br>メッセージ：<br>{5}<p>
	 */
	public static String MSLAL0083 = "MSLAL0083";

	/** LEVEL[W]<br>実績登録の対象工程は見つかりませんでした。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<p>
	 */
	public static String MSLAL0084 = "MSLAL0084";

	/** LEVEL[W]<br>指定された製造指図ＮＯ、工程ＣＤ、工程連番の組み合わせで取得される工程指図が複数存在します。そのため、実績登録の対象工程を特定できませんでした。<br>工程指図ＮＯを指定し、対象工程を特定できるようにしてください。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<p>
	 */
	public static String MSLAL0085 = "MSLAL0085";

	/** LEVEL[W]<br>登録対象の工程指図は存在しません。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<br>工程指図ＮＯ：{4}<p>
	 */
	public static String MSLAL0086 = "MSLAL0086";

	/** LEVEL[W]<br>製造指図に設定されている製造指図ＮＯが、取込対象のレコードに設定されている製造指図ＮＯと一致しておらず、不整合が発生しています。取込レコードに設定されている製造指図ＮＯを確認してください。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<br>取込対象の製造指図ＮＯ：{4}<br>製造指図の製造指図ＮＯ：{5}<p>
	 */
	public static String MSLAL0087 = "MSLAL0087";

	/** LEVEL[W]<br>製造指図に設定されている製造指図改訂番号が、取込対象のレコードに設定されている製造指図改訂番号と一致しておらず、不整合が発生しています。取込レコードに設定されている改訂番号を確認してください。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<br>取込対象の製造指図改訂番号：{4}<br>製造指図の製造指図改訂番号：{5}<br>製造指図ＮＯ：{6}<p>
	 */
	public static String MSLAL0088 = "MSLAL0088";

	/** LEVEL[W]<br>工程指図に設定されている工程ＣＤが、取込対象のレコードに設定されている工程ＣＤと一致しておらず、不整合が発生しています。取込レコードに設定されている工程ＣＤを確認してください。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<br>取込対象の工程ＣＤ：{4}<br>工程指図の工程ＣＤ：{5}<br>工程指図ＮＯ：{6}<p>
	 */
	public static String MSLAL0089 = "MSLAL0089";

	/** LEVEL[W]<br>工程指図に設定されている工程連番が、取込対象のレコードに設定されている工程連番と一致しておらず、不整合が発生しています。取込レコードに設定されている工程連番を確認してください。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<br>取込対象の工程連番：{4}<br>工程指図の工程連番：{5}<br>工程指図ＮＯ：{6}<p>
	 */
	public static String MSLAL0090 = "MSLAL0090";

	/** LEVEL[W]<br>投入予定は見つかりませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>投入予定ＮＯ：{3}<p>
	 */
	public static String MSLAL0091 = "MSLAL0091";

	/** LEVEL[W]<br>工数予定は見つかりませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>工数予定ＮＯ：{3}<p>
	 */
	public static String MSLAL0092 = "MSLAL0092";

	/** LEVEL[W]<br>出来高予定は見つかりませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>出来高予定ＮＯ：{3}<p>
	 */
	public static String MSLAL0093 = "MSLAL0093";

	/** LEVEL[W]<br>何も指定されていない上り電文があります。<p>
	 */
	public static String MSLAL0094 = "MSLAL0094";

	/** LEVEL[W]<br>製造実績がないため、訂正や取消はできません。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<br>製造指図ＮＯ：{4}<p>
	 */
	public static String MSLAL0095 = "MSLAL0095";

	/** LEVEL[W]<br>製造分割の場合、MES受信できません。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<br>製造指図ＮＯ：{4}<p>
	 */
	public static String MSLAL0096 = "MSLAL0096";

	/** LEVEL[W]<br>ロス実績のロス数量、または、有効成分は必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0097 = "MSLAL0097";

	/** LEVEL[W]<br>工程実績の着手実績日時は必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0098 = "MSLAL0098";

	/** LEVEL[W]<br>投入実績の実績日時は必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0099 = "MSLAL0099";

	/** LEVEL[W]<br>投入実績の投入数量、または、有効成分は必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0100 = "MSLAL0100";

	/** LEVEL[W]<br>工数実績の計上日は必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0101 = "MSLAL0101";

	/** LEVEL[W]<br>出来高実績の実績日時は必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0102 = "MSLAL0102";

	/** LEVEL[W]<br>出来高実績の取引単位数量は必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0103 = "MSLAL0103";

	/** LEVEL[W]<br>出来高実績の取引単位ＣＤは必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0104 = "MSLAL0104";

	/** LEVEL[W]<br>同じ外部工程実績ＮＯ、外部システムＣＤの工程実績を重複登録できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部工程実績ＮＯ：{3}<br>外部システムＣＤ：{4}<p>
	 */
	public static String MSLAL0105 = "MSLAL0105";

	/** LEVEL[W]<br>同じ外部工程実績ＮＯ、外部システムＣＤの工程実績は既に存在しているため、登録できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部工程実績ＮＯ：{3}<br>外部システムＣＤ：{4}<p>
	 */
	public static String MSLAL0106 = "MSLAL0106";

	/** LEVEL[W]<br>受信しようとした工程に、すでに画面から実績が登録されているため、登録できません。製造実績登録画面から該当の実績を削除し、再度取込をしてください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>工程指図ＮＯ：{3}<p>
	 */
	public static String MSLAL0107 = "MSLAL0107";

	/** LEVEL[W]<br>工程の着手実績日時は終了実績日時の以前に指定する必要があります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>着手実績日時：{3}<br>終了実績日時：{4}<p>
	 */
	public static String MSLAL0108 = "MSLAL0108";

	/** LEVEL[W]<br>同じ外部投入実績ＮＯ、外部システムＣＤの投入実績を重複登録できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部投入実績ＮＯ：{3}<br>外部システムＣＤ：{4}<p>
	 */
	public static String MSLAL0109 = "MSLAL0109";

	/** LEVEL[W]<br>同じ外部投入実績ＮＯ、外部システムＣＤの投入実績は既に存在しているため、登録できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部投入実績ＮＯ：{3}<br>外部システムＣＤ：{4}<p>
	 */
	public static String MSLAL0110 = "MSLAL0110";

	/** LEVEL[W]<br>追加投入の場合、品目を指定する必要があります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0111 = "MSLAL0111";

	/** LEVEL[W]<br>投入の他勘定振替数量がある場合、他勘定振替理由は必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0112 = "MSLAL0112";

	/** LEVEL[W]<br>投入の他勘定振替数量がある場合、他勘定振替負担部門は必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0113 = "MSLAL0113";

	/** LEVEL[W]<br>同じ外部工数実績ＮＯ、外部システムＣＤの工数実績を重複登録できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部工数実績ＮＯ：{3}<br>外部システムＣＤ：{4}<p>
	 */
	public static String MSLAL0114 = "MSLAL0114";

	/** LEVEL[W]<br>同じ外部工数実績ＮＯ、外部システムＣＤの工数実績は既に存在しているため、登録できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部工数実績ＮＯ：{3}<br>外部システムＣＤ：{4}<p>
	 */
	public static String MSLAL0115 = "MSLAL0115";

	/** LEVEL[W]<br>追加工数の場合、工数管理ＣＤを指定する必要があります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0116 = "MSLAL0116";

	/** LEVEL[W]<br>工数の着手時刻は計上日と同じ日に指定する必要があります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>計上日：{3}<br>着手時刻：{4}<p>
	 */
	public static String MSLAL0117 = "MSLAL0117";

	/** LEVEL[W]<br>工数の終了時刻は計上日と同じ日に指定する必要があります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>計上日：{3}<br>終了時刻：{4}<p>
	 */
	public static String MSLAL0118 = "MSLAL0118";

	/** LEVEL[W]<br>工数の着手時刻は終了時刻の以前に指定する必要があります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>着手時刻：{3}<br>終了時刻：{4}<p>
	 */
	public static String MSLAL0119 = "MSLAL0119";

	/** LEVEL[W]<br>同じ外部出来高実績ＮＯ、外部システムＣＤの出来高実績を重複登録できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部出来高実績ＮＯ：{3}<br>外部システムＣＤ：{4}<p>
	 */
	public static String MSLAL0120 = "MSLAL0120";

	/** LEVEL[W]<br>同じ外部出来高実績ＮＯ、外部システムＣＤの出来高実績は既に存在しているため、登録できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部出来高実績ＮＯ：{3}<br>外部システムＣＤ：{4}<p>
	 */
	public static String MSLAL0121 = "MSLAL0121";

	/** LEVEL[W]<br>登録対象となる出来高予定を特定できませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0122 = "MSLAL0122";

	/** LEVEL[W]<br>追加副産品の場合、品目を指定する必要があります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0123 = "MSLAL0123";

	/** LEVEL[W]<br>追加副産品の場合、良品区分を指定する必要があります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0124 = "MSLAL0124";

	/** LEVEL[W]<br>出来高不良品の場合、出来高理由を指定する必要があります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0125 = "MSLAL0125";

	/** LEVEL[W]<br>工程実績は見つかりませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部工程実績ＮＯ：{3}<br>外部システムＣＤ：{4}<p>
	 */
	public static String MSLAL0126 = "MSLAL0126";

	/** LEVEL[W]<br>投入実績は見つかりませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部投入実績ＮＯ：{3}<br>外部システムＣＤ：{4}<p>
	 */
	public static String MSLAL0127 = "MSLAL0127";

	/** LEVEL[W]<br>工数実績は見つかりませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部工数実績ＮＯ：{3}<br>外部システムＣＤ：{4}<p>
	 */
	public static String MSLAL0128 = "MSLAL0128";

	/** LEVEL[W]<br>出来高実績は見つかりませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部出来高実績ＮＯ：{3}<br>外部システムＣＤ：{4}<p>
	 */
	public static String MSLAL0129 = "MSLAL0129";

	/** LEVEL[W]<br>ロス品目と親の投入品目と一致しません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>ロス品目：{3}<br>投入品目：{4}<p>
	 */
	public static String MSLAL0130 = "MSLAL0130";

	/** LEVEL[W]<br>追加ロスの場合、品目を指定する必要があります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0131 = "MSLAL0131";

	/** LEVEL[W]<br>ロス品目にロス理由は定義されていません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>ロス品目：{3}<p>
	 */
	public static String MSLAL0132 = "MSLAL0132";

	/** LEVEL[W]<br>固定ロスと初期表示ロス以外の場合、ロス理由ＣＤは必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0133 = "MSLAL0133";

	/** LEVEL[W]<br>ロス品目に下記のロス理由ＣＤは定義されていません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>ロス理由ＣＤ：{3}<p>
	 */
	public static String MSLAL0134 = "MSLAL0134";

	/** LEVEL[W]<br>同じロス理由ＣＤで２回以上ロス実績を登録できません。<br>前回データ行ＮＯ：{1}<br>今回データ行ＮＯ：{2}<br>ロス理由ＣＤ：{3}<p>
	 */
	public static String MSLAL0135 = "MSLAL0135";

	/** LEVEL[W]<br>同じロス理由ＣＤで２回以上ロス実績を取り消せません。<br>前回データ行ＮＯ：{1}<br>今回データ行ＮＯ：{2}<br>ロス理由ＣＤ：{3}<p>
	 */
	public static String MSLAL0136 = "MSLAL0136";

	/** LEVEL[W]<br>同じロス理由ＣＤのロス実績は既に存在しているため、登録できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>ロス理由ＣＤ：{3}<p>
	 */
	public static String MSLAL0137 = "MSLAL0137";

	/** LEVEL[W]<br>ロス実績は見つかりませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部投入実績ＮＯ：{3}<br>外部システムＣＤ：{4}<br>ロス理由ＣＤ：{5}<p>
	 */
	public static String MSLAL0138 = "MSLAL0138";

	/** LEVEL[W]<br>投入品目は見つかりませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<p>
	 */
	public static String MSLAL0139 = "MSLAL0139";

	/** LEVEL[W]<br>版管理対象投入品目のロット情報は見つかりませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<p>
	 */
	public static String MSLAL0140 = "MSLAL0140";

	/** LEVEL[W]<br>有効成分対象外の品目、投入数量は必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0141 = "MSLAL0141";

	/** LEVEL[W]<br>ロス実績の数量は正数で必要があります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0142 = "MSLAL0142";

	/** LEVEL[W]<br>工程実績の実績数量は必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0143 = "MSLAL0143";

	/** LEVEL[W]<br>製造指図に設定されている製造場所が、取込対象のレコードに設定されている製造場所と一致しておらず、不整合が発生しています。取込レコードに設定されている製造場所を確認してください。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<br>取込対象の製造場所：{4}<br>製造指図の製造場所：{5}<br>製造指図ＮＯ：{6}<p>
	 */
	public static String MSLAL0144 = "MSLAL0144";

	/** LEVEL[W]<br>製造指図に設定されている製造品目が、取込対象のレコードに設定されている製造品目と一致しておらず、不整合が発生しています。取込レコードに設定されている製造品目を確認してください。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<br>取込対象の製造品目：{4}<br>製造指図の製造品目：{5}<br>製造指図ＮＯ：{6}<p>
	 */
	public static String MSLAL0145 = "MSLAL0145";

	/** LEVEL[W]<br>工程指図に対して既に実績が上がっているため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>工程指図ＮＯ：{3}<p>
	 */
	public static String MSLAL0146 = "MSLAL0146";

	/** LEVEL[W]<br>投入予定に対して既に実績が上がっているため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>投入予定ＮＯ：{3}<p>
	 */
	public static String MSLAL0147 = "MSLAL0147";

	/** LEVEL[W]<br>工数予定に対して既に実績が上がっているため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>工数予定ＮＯ：{3}<p>
	 */
	public static String MSLAL0148 = "MSLAL0148";

	/** LEVEL[W]<br>出来高予定に対して既に実績が上がっているため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>出来高予定ＮＯ：{3}<p>
	 */
	public static String MSLAL0149 = "MSLAL0149";

	/** LEVEL[W]<br>工数受信の製造指図改訂番号と最新の製造指図改訂番号と一致しません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>製造指図ＮＯ：{3}<p>
	 */
	public static String MSLAL0150 = "MSLAL0150";

	/** LEVEL[I]<br>工数実績受信ＩＦ取込処理を開始します。<p>
	 */
	public static String MSLAL0151 = "MSLAL0151";

	/** LEVEL[I]<br>工数実績受信ＩＦ取込処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSLAL0152 = "MSLAL0152";

	/** LEVEL[W]<br>工数実績受信ＩＦ取込処理でエラーが発生しました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>メッセージＩＤ：{3}<br>メッセージ：<br>{4}<p>
	 */
	public static String MSLAL0153 = "MSLAL0153";

	/** LEVEL[W]<br>指図外工数で、品目がある場合、場所ＣＤは必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0154 = "MSLAL0154";

	/** LEVEL[W]<br>指図外工数の場合、部門ＣＤは必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0155 = "MSLAL0155";

	/** LEVEL[I]<br>ＳＣＭ実績受信ＩＦ一括取込処理を開始します。<p>
	 */
	public static String MSLAL0156 = "MSLAL0156";

	/** LEVEL[I]<br>ＳＣＭ実績受信ＩＦ一括取込処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSLAL0157 = "MSLAL0157";

	/** LEVEL[W]<br>処理中のレコードが存在するため処理を中止しました。<p>
	 */
	public static String MSLAL0158 = "MSLAL0158";

	/** LEVEL[I]<br>出荷実績受信ＩＦ取込処理を開始します。<p>
	 */
	public static String MSLAL0159 = "MSLAL0159";

	/** LEVEL[I]<br>出荷実績受信ＩＦ取込処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSLAL0160 = "MSLAL0160";

	/** LEVEL[W]<br>同じ出荷元物流グループ、出荷指図ＮＯにおいて先に処理した出荷情報でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>出荷元物流グループ：{3}<br>出荷指図ＮＯ：{4}<p>
	 */
	public static String MSLAL0161 = "MSLAL0161";

	/** LEVEL[W]<br>同じ出荷元物流グループ、外部システムＣＤ、外部出荷実績ＮＯにおいて、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>出荷元物流グループ：{3}<br>外部システムＣＤ：{4}<br>外部出荷実績ＮＯ：{5}<p>
	 */
	public static String MSLAL0162 = "MSLAL0162";

	/** LEVEL[W]<br>出荷実績受信ＩＦ取込処理でエラーが発生しました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>メッセージＩＤ：{3}<br>メッセージ：<br>{4}<p>
	 */
	public static String MSLAL0163 = "MSLAL0163";

	/** LEVEL[W]<br>同じ出荷元物流グループ、出荷指図ＮＯに対する他の出荷実績の取り込み処理でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>出荷元物流グループ：{3}<br>出荷指図ＮＯ：{4}<p>
	 */
	public static String MSLAL0164 = "MSLAL0164";

	/** LEVEL[W]<br>同一の外部出荷実績ＮＯが存在するため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部出荷実績ＮＯ：{4}<p>
	 */
	public static String MSLAL0165 = "MSLAL0165";

	/** LEVEL[W]<br>同一の外部出荷実績ＮＯが既に存在するため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部出荷実績ＮＯ：{4}<p>
	 */
	public static String MSLAL0166 = "MSLAL0166";

	/** LEVEL[W]<br>対応する出荷実績情報が複数件取得できたため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0167 = "MSLAL0167";

	/** LEVEL[W]<br>対応する出荷実績情報が取得できないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0168 = "MSLAL0168";

	/** LEVEL[W]<br>下記項目のいずれか1つを指定してください。<br>出荷引当状況ＮＯ、出荷指図明細ＮＯ、インボイス明細ＮＯ、インボイスＮＯ、納品書明細ＮＯ、納品書ＮＯ<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0169 = "MSLAL0169";

	/** LEVEL[W]<br>出荷実績受信ＩＦ情報に対応する出荷引当状況を特定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>出荷引当状況ＮＯ：{3}<br>出荷指図明細ＮＯ：{4}<br>インボイス明細ＮＯ：{5}<br>インボイスＮＯ：{6}<br>納品書明細ＮＯ：{7}<br>納品書ＮＯ：{8}<br>出荷場所ＣＤ：{9}<br>出荷棚・ラインＣＤ：{10}<br>ロットＮＯ：{11}<br>サブロットＮＯ：{12}<br>手配ＮＯ：{13}<p>
	 */
	public static String MSLAL0170 = "MSLAL0170";

	/** LEVEL[I]<br>移動実績受信ＩＦ取込処理を開始します。<p>
	 */
	public static String MSLAL0171 = "MSLAL0171";

	/** LEVEL[I]<br>移動実績受信ＩＦ取込処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSLAL0172 = "MSLAL0172";

	/** LEVEL[W]<br>ＩＦ処理区分に対応する取込オペレーションの設定が正しくないため、受信IFサービスを実行できません。<br>ＩＦ処理区分：{1}<br>取込オペレーション：{2}<p>
	 */
	public static String MSLAL0173 = "MSLAL0173";

	/** LEVEL[I]<br>ＥＤＩ出荷実績受信ＩＦ取込処理を開始します。<p>
	 */
	public static String MSLAL0174 = "MSLAL0174";

	/** LEVEL[I]<br>ＥＤＩ出荷実績受信ＩＦ取込処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSLAL0175 = "MSLAL0175";

	/** LEVEL[W]<br>指定された発注明細が存在しません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注明細ＮＯ：{3}<p>
	 */
	public static String MSLAL0176 = "MSLAL0176";

	/** LEVEL[W]<br>発注時の発注先と異なる発注先が指定されています。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注明細ＮＯ：{3}<br>発注時の発注先：{4}<br>ＩＦデータの発注先：{5}<p>
	 */
	public static String MSLAL0177 = "MSLAL0177";

	/** LEVEL[W]<br>品目単位マスタが存在しません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注明細ＮＯ：{3}<br>業者納品書ＮＯ：{4}<br>業者納品書明細ＮＯ：{5}<br>品目：{6}<br>単位：{7}<p>
	 */
	public static String MSLAL0178 = "MSLAL0178";

	/** LEVEL[W]<br>発注時の品目と異なる品目は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注明細ＮＯ：{3}<br>発注時の品目：{4}<br>ＩＦデータの品目：{5}<p>
	 */
	public static String MSLAL0179 = "MSLAL0179";

	/** LEVEL[W]<br>指定された納入指示が存在しません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注明細ＮＯ：{3}<br>納入指示ＮＯ：{4}<br><p>
	 */
	public static String MSLAL0180 = "MSLAL0180";

	/** LEVEL[W]<br>入荷予定が打切されているため取り込みできません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注明細ＮＯ：{3}<br>業者納品書ＮＯ：{4}<br>業者納品書明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0181 = "MSLAL0181";

	/** LEVEL[W]<br>外部入荷実績ＮＯが重複しています。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部入荷実績ＮＯ：{4}<p>
	 */
	public static String MSLAL0182 = "MSLAL0182";

	/** LEVEL[W]<br>業者納品書ＮＯと業者納品書明細ＮＯの組み合わせが重複しています。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注先：{3}<br>発注明細ＮＯ：{4}<br>業者納品書ＮＯ：{5}<br>業者納品書明細ＮＯ：{6}<p>
	 */
	public static String MSLAL0183 = "MSLAL0183";

	/** LEVEL[W]<br>取引単位数量の小数部桁数が正しくありません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注明細ＮＯ：{3}<br>業者納品書ＮＯ：{4}<br>業者納品書明細ＮＯ：{5}<br>取引単位数量：{6}<br>取引単位：{7}<br>小数部有効桁数：{8}<br><p>
	 */
	public static String MSLAL0184 = "MSLAL0184";

	/** LEVEL[W]<br>同じ物流グループ、外部システムＣＤ、外部移動実績ＮＯにおいて先に処理した移動実績でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>物流グループＣＤ：{3}<br>外部システムＣＤ：{4}<br>外部移動実績ＮＯ：{５}<p>
	 */
	public static String MSLAL0185 = "MSLAL0185";

	/** LEVEL[W]<br>同じ物流グループ、外部システムＣＤ、外部移動実績ＮＯにおいて、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>物流グループ：{3}<br>外部システムＣＤ：{4}<br>外部移動実績ＮＯ：{5}<p>
	 */
	public static String MSLAL0186 = "MSLAL0186";

	/** LEVEL[W]<br>移動実績受信ＩＦ取込処理でエラーが発生しました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>メッセージＩＤ：{3}<br>メッセージ：<br>{4}<p>
	 */
	public static String MSLAL0187 = "MSLAL0187";

	/** LEVEL[W]<br>発注明細ＮＯと納入指示明細ＮＯの組み合わせが不正です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注明細ＮＯ：{3}<br>納入指示明細ＮＯ：{4}<p>
	 */
	public static String MSLAL0188 = "MSLAL0188";

	/** LEVEL[W]<br>配送先が必須です。配送先を指定して取込むか、物流制御マスタに標準配送先を登録してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>納品先：{3}<p>
	 */
	public static String MSLAL0189 = "MSLAL0189";

	/** LEVEL[W]<br>品目が入荷予定と異なるため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<br>品目（予定）：{4}<p>
	 */
	public static String MSLAL0190 = "MSLAL0190";

	/** LEVEL[W]<br>注文時に指定された仮単価と、マスタの仮単価が異なります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>注文時に指定された仮単価：{3}<br>マスタの仮単価：{4}<p>
	 */
	public static String MSLAL0191 = "MSLAL0191";

	/** LEVEL[W]<br>指定された取引は利用できません。<br>下記の取引パタン区分が指定された取引を指定してください。<br>取引パタン区分：「移動・移送」「移動・移送返品」「支給」「支給返品」<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>取引ＣＤ：{3}<br>取引パタン区分：{4}<p>
	 */
	public static String MSLAL0192 = "MSLAL0192";

	/** LEVEL[W]<br>対応する移動引当状況情報が取得できないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0193 = "MSLAL0193";

	/** LEVEL[W]<br>移動指図に対して既に移動実績が登録されているため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部移動実績ＮＯ：{3}<br>外部システムＣＤ：{4}<p>
	 */
	public static String MSLAL0194 = "MSLAL0194";

	/** LEVEL[W]<br>対応する移動実績情報が取得できないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部移動実績ＮＯ：{3}<br>外部システムＣＤ：{4}<p>
	 */
	public static String MSLAL0195 = "MSLAL0195";

	/** LEVEL[W]<br>指定された移動指図が存在しません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>移動指図ＮＯ：{3}<p>
	 */
	public static String MSLAL0196 = "MSLAL0196";

	/** LEVEL[W]<br>同一の移動実績が既に存在するため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部移動実績ＮＯ：{3}<br>外部システムＣＤ：{4}<p>
	 */
	public static String MSLAL0197 = "MSLAL0197";

	/** LEVEL[W]<br>同じ物流グループ、外部システムＣＤに対する他の移動実績の取り込み処理でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>物流グループ：{3}<br>外部システムＣＤ：{4}<p>
	 */
	public static String MSLAL0198 = "MSLAL0198";

	/** LEVEL[W]<br>同じ物流グループ、外部システムＣＤ、外部移動実績ＮＯにおいて先に処理した移動実績でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>物流グループＣＤ：{3}<br>外部システムＣＤ：{4}<br>外部移動実績ＮＯ：{５}<p>
	 */
	public static String MSLAL0199 = "MSLAL0199";

	/** LEVEL[W]<br>インボイス単価の初期値とする販売単価が取得できないため、取り込みできませんでした。<br>インボイス取引、かつ単価が0の場合は、インボイス単価が必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<p>
	 */
	public static String MSLAL0200 = "MSLAL0200";

	/** LEVEL[W]<br>承認状況区分が一次承認済または最終承認済のため、、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先注文ＮＯ：{3}<br>受注NO：{4}<p>
	 */
	public static String MSLAL0201 = "MSLAL0201";

	/** LEVEL[W]<br>指定された納入指示が存在しません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注ＮＯ：{3}<br>発注明細ＮＯ：{4}<br>納入指示ＮＯ：{5}<br>納入指示改訂番号：{6}<p>
	 */
	public static String MSLAL0202 = "MSLAL0202";

	/** LEVEL[W]<br>発注明細が取消されているため、納期回答を取り込みできません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注明細ＮＯ：{3}<p>
	 */
	public static String MSLAL0203 = "MSLAL0203";

	/** LEVEL[W]<br>同じヘッダに対する他の出荷実績の取り込み処理でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>出荷元物流グループ：{3}<br>出荷日時：{4}<br>納品日時：{5}<br>得意先：{6}<br>依頼元部門：{7}<br>依頼元担当者：{8}<br>出荷部門：{9}<br>出荷担当者：{10}<br>送付先識別区分：{11}<br>送付先識別：{12}<p>
	 */
	public static String MSLAL0204 = "MSLAL0204";

	/** LEVEL[W]<br>発生処理：{1}<br>発生日時：{2}<br>会社：{3}<br>ワーキンググループＣＤ：{4}<br>得意先ＣＤ：{5}<br>エラー内容：{6}<p>
	 */
	public static String MSLAL0205 = "MSLAL0205";

	/** LEVEL[W]<br>発生処理：{1}<br>発生日時：{2}<br>会社：{3}<br>ワーキンググループＣＤ：{4}<br>発注先ＣＤ：{5}<br>エラー内容：{6}<p>
	 */
	public static String MSLAL0206 = "MSLAL0206";

	/** LEVEL[W]<br>出荷引当状況に対して既に出荷実績が登録されているため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部出荷実績ＮＯ：{4}<p>
	 */
	public static String MSLAL0207 = "MSLAL0207";

	/** LEVEL[W]<br>取消可能な回答が存在しません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注明細ＮＯ：{3}<br><p>
	 */
	public static String MSLAL0208 = "MSLAL0208";

	/** LEVEL[W]<br>品目の変更を伴う更新はできません。既存のデータを削除してから、新規データとして取り込んでください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>変更前の品目：{3}<br>変更後の品目：{4}<p>
	 */
	public static String MSLAL0209 = "MSLAL0209";

	/** LEVEL[W]<br>指定されたインボイスＮＯと出荷指図のインボイスＮＯが一致しません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>指定されたインボイスＮＯ：{3}<br>出荷指図のインボイスＮＯ：{4}<p>
	 */
	public static String MSLAL0210 = "MSLAL0210";

	/** LEVEL[W]<br>取引パタン区分が支給の場合、送付先の変更を伴う更新はできません。既存のデータを削除してから、新規データとして取り込んでください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>変更前の送付先識別区分：{3}<br>変更前の送付先識別ＣＤ：{4}<br>変更後の送付先識別区分：{5}<br>変更後の送付先識別ＣＤ：{6}<p>
	 */
	public static String MSLAL0211 = "MSLAL0211";

	/** LEVEL[W]<br>取引パタン区分が支給返品の場合、出荷場所の変更を伴う更新はできません。既存のデータを削除してから、新規データとして取り込んでください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>変更前の出荷場所ＣＤ：{3}<br>変更後の出荷場所ＣＤ：{4}<p>
	 */
	public static String MSLAL0212 = "MSLAL0212";

	/** LEVEL[W]<br>取引パタン区分が支給返品の場合、出荷棚・ラインの変更を伴う更新はできません。既存のデータを削除してから、新規データとして取り込んでください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>変更前の出荷棚・ラインＣＤ：{3}<br>変更後の出荷棚・ラインＣＤ：{4}<p>
	 */
	public static String MSLAL0213 = "MSLAL0213";

	/** LEVEL[W]<br>入庫場所の変更を伴う更新はできません。既存のデータを削除してから、新規データとして取り込んでください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>変更前の入庫場所ＣＤ：{3}<br>変更後の入庫場所ＣＤ：{4}<p>
	 */
	public static String MSLAL0214 = "MSLAL0214";

	/** LEVEL[W]<br>取引パタン区分が支給返品の場合、出庫場所の変更を伴う更新はできません。既存のデータを削除してから、新規データとして取り込んでください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>変更前の出庫場所ＣＤ：{3}<br>変更後の出庫場所ＣＤ：{4}<p>
	 */
	public static String MSLAL0215 = "MSLAL0215";

	/** LEVEL[W]<br>工場・物流倉庫が異なる場合は「検査済」のみ指定可能です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>入庫工場・物流倉庫ＣＤ：{3}<br>出庫工場・物流倉庫ＣＤ：{4}<br>在庫検査区分：{5}<p>
	 */
	public static String MSLAL0216 = "MSLAL0216";

	/** LEVEL[W]<br>出荷指図区分が対象外のため、移動実績を取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0217 = "MSLAL0217";

	/** LEVEL[W]<br>同じ発注明細に対する回答に異なる発注改訂番号が設定されています。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注ＮＯ：{3}<br>発注明細ＮＯ：{4}<br>発注改訂番号：{5}<p>
	 */
	public static String MSLAL0218 = "MSLAL0218";

	/** LEVEL[I]<br>入荷予定が入荷不要のため取り込みできません。取込対象から除外します。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注明細ＮＯ：{3}<br>業者納品書ＮＯ：{4}<br>業者納品書明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0219 = "MSLAL0219";

	/** LEVEL[W]<br>購買識別区分が「2：無償受給」または「3：有償受給」のデータは取り込めません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>購買識別区分：{3}<p>
	 */
	public static String MSLAL0220 = "MSLAL0220";

	/** LEVEL[W]<br>指定された納入指示が存在しません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注明細ＮＯ：{3}<br>納入指示ＮＯ：{4}<br>納入指示明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0221 = "MSLAL0221";

	/** LEVEL[W]<br>投入数量、固定必要数量が共に０の投入予定に対して実績を登録することはできません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>投入予定ＮＯ：{3}<p>
	 */
	public static String MSLAL0222 = "MSLAL0222";

	/** LEVEL[W]<br>投入制御区分がＭＲＰ対象外（指図書のみ）の投入予定に対して実績を登録することはできません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>投入予定ＮＯ：{3}<p>
	 */
	public static String MSLAL0223 = "MSLAL0223";

	/** LEVEL[I]<br>他勘定振替実績受信ＩＦ取込処理を開始します。<p>
	 */
	public static String MSLAL0300 = "MSLAL0300";

	/** LEVEL[I]<br>他勘定実績受信ＩＦ取込処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSLAL0301 = "MSLAL0301";

	/** LEVEL[W]<br>同じ他勘定振替指図ＮＯにおいて先に処理した他勘定振替情報でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>他勘定振替指図ＮＯ：{3}<p>
	 */
	public static String MSLAL0302 = "MSLAL0302";

	/** LEVEL[W]<br>同じ他勘定振替明細において、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部他勘定振替実績ＮＯ：{4}<p>
	 */
	public static String MSLAL0303 = "MSLAL0303";

	/** LEVEL[W]<br>他勘定振替実績受信ＩＦ取込処理でエラーが発生しました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>メッセージＩＤ：{3}<br>メッセージ：<br>{4}<p>
	 */
	public static String MSLAL0304 = "MSLAL0304";

	/** LEVEL[W]<br>同じ他勘定振替指図ＮＯに対する他の他勘定振替実績の取り込み処理でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>他勘定振替指図ＮＯ：{3}<p>
	 */
	public static String MSLAL0305 = "MSLAL0305";

	/** LEVEL[W]<br>同じヘッダに対する他の他勘定振替実績の取り込み処理でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>取引：{3}<br>場所：{4}<br>他勘定振替実績日時：{5}<br>実施部門：{6}<br>実施担当者：{7}<p>
	 */
	public static String MSLAL0306 = "MSLAL0306";

	/** LEVEL[W]<br>同一の外部他勘定振替実績ＮＯが存在するため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部他勘定振替実績ＮＯ：{4}<p>
	 */
	public static String MSLAL0307 = "MSLAL0307";

	/** LEVEL[W]<br>同一の外部他勘定振替実績ＮＯが既に存在するため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部他勘定振替実績ＮＯ：{4}<p>
	 */
	public static String MSLAL0308 = "MSLAL0308";

	/** LEVEL[W]<br>指定された他勘定振替指図が存在しません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>他勘定振替指図ＮＯ：{3}<p>
	 */
	public static String MSLAL0309 = "MSLAL0309";

	/** LEVEL[W]<br>対応する他勘定振替実績情報が複数件取得できたため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0310 = "MSLAL0310";

	/** LEVEL[W]<br>対応する他勘定振替実績情報が取得できないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0311 = "MSLAL0311";

	/** LEVEL[W]<br>他勘定振替実績受信ＩＦ情報に対応する他勘定振替指図明細を特定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>他勘定振替指図ＮＯ：{3}<br>他勘定振替指図明細ＮＯ：{4}<br>品目：{5}<br>棚・ラインＣＤ：{6}<br>ロットＮＯ：{7}<br>サブロットＮＯ：{8}<br>手配ＮＯ：{9}<p>
	 */
	public static String MSLAL0312 = "MSLAL0312";

	/** LEVEL[W]<br>他勘定振替指図明細に対して既に他勘定振替実績が登録されているため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部他勘定振替実績ＮＯ：{4}<p>
	 */
	public static String MSLAL0313 = "MSLAL0313";

	/** LEVEL[W]<br>場所の変更を伴う更新はできません。既存のデータを削除してから、新規データとして取り込んでください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>変更前の場所ＣＤ：{3}<br>変更後の場所ＣＤ：{4}<p>
	 */
	public static String MSLAL0314 = "MSLAL0314";

	/** LEVEL[W]<br>同じ外部システムＣＤ、外部他勘定振替実績ＮＯにおいて先に処理した他勘定振替情報でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部他勘定振替実績ＮＯ：{4}<p>
	 */
	public static String MSLAL0316 = "MSLAL0316";

	/** LEVEL[W]<br>取引の変更を伴う更新はできません。既存のデータを削除してから、新規データとして取り込んでください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>変更前の取引ＣＤ：{3}<br>変更前の取引パタン区分：{4}<br>変更後の場所ＣＤ：{5}<br>変更後の取引パタン区分：{6}<p>
	 */
	public static String MSLAL0317 = "MSLAL0317";

	/** LEVEL[I]<br>検収受信ＩＦ取込処理を開始します。<p>
	 */
	public static String MSLAL0400 = "MSLAL0400";

	/** LEVEL[I]<br>検収受信ＩＦ取込処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSLAL0401 = "MSLAL0401";

	/** LEVEL[W]<br>売上計上可能な売上予定が取得できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0402 = "MSLAL0402";

	/** LEVEL[W]<br>売上計上可能な売上予定が取得できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>インボイスＮＯ：{4}<br>インボイス明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0403 = "MSLAL0403";

	/** LEVEL[W]<br>売上計上可能な売上予定が取得できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0404 = "MSLAL0404";

	/** LEVEL[W]<br>対応する受注情報が取得できないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<br>品目：{6}<br>手配ＮＯ：{7}<p>
	 */
	public static String MSLAL0405 = "MSLAL0405";

	/** LEVEL[W]<br>対応する受注情報が複数件取得できたため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>品目：{5}<br>手配ＮＯ：{6}<p>
	 */
	public static String MSLAL0406 = "MSLAL0406";

	/** LEVEL[W]<br>対応するインボイス情報が取得できないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>インボイスＮＯ：{4}<br>インボイス明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<br>品目：{8}<br>手配ＮＯ：{9}<p>
	 */
	public static String MSLAL0407 = "MSLAL0407";

	/** LEVEL[W]<br>対応するインボイス情報が複数件取得できたため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>インボイスＮＯ：{4}<br>インボイス明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<br>品目：{8}<br>手配ＮＯ：{9}<p>
	 */
	public static String MSLAL0408 = "MSLAL0408";

	/** LEVEL[W]<br>対応する納品伝票情報が取得できないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<br>品目：{8}<br>手配ＮＯ：{9}<p>
	 */
	public static String MSLAL0409 = "MSLAL0409";

	/** LEVEL[W]<br>対応する納品伝票情報が複数件取得できたため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<br>品目：{8}<br>手配ＮＯ：{9}<p>
	 */
	public static String MSLAL0410 = "MSLAL0410";

	/** LEVEL[I]<br>検収不良のデータであるため、スキップしました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<p>
	 */
	public static String MSLAL0411 = "MSLAL0411";

	/** LEVEL[W]<br>同じ得意先、納品書ＮＯ、得意先注文ＮＯにおいて先に処理した売上でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>得意先注文ＮＯ：{5}<p>
	 */
	public static String MSLAL0412 = "MSLAL0412";

	/** LEVEL[W]<br>同じ外部システムＣＤ、外部仕入実績明細ＮＯにおいて、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部仕入実績明細ＮＯ：{4}<p>
	 */
	public static String MSLAL0413 = "MSLAL0413";

	/** LEVEL[W]<br>売上計上区分が検収基準売上または着荷基準売上ではないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<p>
	 */
	public static String MSLAL0414 = "MSLAL0414";

	/** LEVEL[W]<br>売上計上区分が検収基準売上または着荷基準売上ではないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>インボイスＮＯ：{4}<p>
	 */
	public static String MSLAL0415 = "MSLAL0415";

	/** LEVEL[W]<br>入金予定日が指定されていないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>インボイスＮＯ：{4}<br>インボイス明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<p>
	 */
	public static String MSLAL0416 = "MSLAL0416";

	/** LEVEL[W]<br>検収受信ＩＦ取込処理でエラーが発生しました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>メッセージＩＤ：{3}<br>メッセージ：<br>{4}<p>
	 */
	public static String MSLAL0417 = "MSLAL0417";

	/** LEVEL[W]<br>同じ得意先、納品書ＮＯ、得意先注文ＮＯに対する他の売上の取り込み処理でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>得意先注文ＮＯ：{5}<p>
	 */
	public static String MSLAL0418 = "MSLAL0418";

	/** LEVEL[W]<br>受注または納品伝票またはインボイスを特定できないか、売上計上可能な売上予定が取得できないため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<br>品目：{6}<br>手配ＮＯ：{7}<p>
	 */
	public static String MSLAL0419 = "MSLAL0419";

	/** LEVEL[W]<br>インボイスの単位と異なる単位は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>インボイスＮＯ：{4}<br>インボイス明細ＮＯ：{5}<br>インボイスの単位：{6}<br>ＩＦデータの単位：{7}<p>
	 */
	public static String MSLAL0420 = "MSLAL0420";

	/** LEVEL[W]<br>品目単位マスタに存在しない単位は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<br>ＩＦデータの単位：{8}<p>
	 */
	public static String MSLAL0421 = "MSLAL0421";

	/** LEVEL[W]<br>受注時の通貨と異なる通貨は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<br>受注ＮＯ：{6}<br>受注時の通貨：{7}<br>ＩＦデータの通貨：{8}<p>
	 */
	public static String MSLAL0422 = "MSLAL0422";

	/** LEVEL[W]<br>インボイスの通貨と異なる通貨は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>インボイスＮＯ：{4}<br>インボイスの通貨：{5}<br>ＩＦデータの通貨：{6}<p>
	 */
	public static String MSLAL0423 = "MSLAL0423";

	/** LEVEL[W]<br>納品書の通貨と異なる通貨は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書の通貨：{5}<br>ＩＦデータの通貨：{6}<p>
	 */
	public static String MSLAL0424 = "MSLAL0424";

	/** LEVEL[W]<br>受注時の単価と異なる単価は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<br>受注ＮＯ：{6}<br>受注明細ＮＯ：{7}<br>受注時の単価（単位換算後）：{8}<br>ＩＦデータの単価：{9}<p>
	 */
	public static String MSLAL0425 = "MSLAL0425";

	/** LEVEL[W]<br>インボイスの単価と異なる単価は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>インボイスＮＯ：{4}<br>インボイス明細ＮＯ：{5}<br>インボイスの単価：{6}<br>ＩＦデータの単価：{7}<p>
	 */
	public static String MSLAL0426 = "MSLAL0426";

	/** LEVEL[W]<br>納品書の単価と異なる単価は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>納品書の単価：{6}<br>ＩＦデータの単価：{7}<p>
	 */
	public static String MSLAL0427 = "MSLAL0427";

	/** LEVEL[W]<br>受注時の金額と異なる金額は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<br>受注ＮＯ：{6}<br>受注明細ＮＯ：{7}<br>受注時の金額（数量・税換算後）：{8}<br>ＩＦデータの金額：{9}<p>
	 */
	public static String MSLAL0428 = "MSLAL0428";

	/** LEVEL[W]<br>インボイスの金額と異なる金額は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>インボイスＮＯ：{4}<br>インボイス明細ＮＯ：{5}<br>インボイスの金額：{6}<br>ＩＦデータの金額：{7}<p>
	 */
	public static String MSLAL0429 = "MSLAL0429";

	/** LEVEL[W]<br>納品書の金額と異なる金額は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>納品書の金額（数量・税換算後）：{6}<br>ＩＦデータの金額：{7}<p>
	 */
	public static String MSLAL0430 = "MSLAL0430";

	/** LEVEL[W]<br>受注時の値引額と異なる値引額は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<br>受注ＮＯ：{6}<br>受注明細ＮＯ：{7}<br>受注時の値引額（数量換算後）：{8}<br>ＩＦデータの値引額：{9}<p>
	 */
	public static String MSLAL0431 = "MSLAL0431";

	/** LEVEL[W]<br>インボイスの値引額と異なる値引額は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>インボイスＮＯ：{4}<br>インボイス明細ＮＯ：{5}<br>インボイスの値引額：{6}<br>ＩＦデータの値引額：{7}<p>
	 */
	public static String MSLAL0432 = "MSLAL0432";

	/** LEVEL[W]<br>納品書の値引額と異なる値引額は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>納品書の値引額（数量換算後）：{6}<br>ＩＦデータの値引額：{7}<p>
	 */
	public static String MSLAL0433 = "MSLAL0433";

	/** LEVEL[W]<br>受注時の値引理由と異なる値引理由は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<br>受注ＮＯ：{6}<br>受注明細ＮＯ：{7}<br>受注時の値引理由：{8}<br>ＩＦデータの値引理由：{9}<p>
	 */
	public static String MSLAL0434 = "MSLAL0434";

	/** LEVEL[W]<br>インボイスの値引理由と異なる値引理由は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>インボイスＮＯ：{4}<br>インボイス明細ＮＯ：{5}<br>インボイスの値引理由：{6}<br>ＩＦデータの値引理由：{7}<p>
	 */
	public static String MSLAL0435 = "MSLAL0435";

	/** LEVEL[W]<br>納品書に紐づく受注の値引理由と異なる値引理由は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>受注ＮＯ：{6}<br>受注明細ＮＯ：{7}<br>受注時の値引理由：{8}<br>ＩＦデータの値引理由：{9}<p>
	 */
	public static String MSLAL0436 = "MSLAL0436";

	/** LEVEL[W]<br>税チェック対象の場合、ＩＦデータの税率に対応する税と受注時の税率と異なる税は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<br>受注ＮＯ：{6}<br>受注明細ＮＯ：{7}<br>受注時の税：{8}<br>ＩＦデータの税率に対応する税：{9}<p>
	 */
	public static String MSLAL0437 = "MSLAL0437";

	/** LEVEL[W]<br>税チェック対象の場合、ＩＦデータの税率に対応する税とインボイスの税率と異なる税率は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>インボイスＮＯ：{4}<br>インボイス明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<br>インボイスの税：{8}<br>ＩＦデータの税率に対応する税：{9}<p>
	 */
	public static String MSLAL0438 = "MSLAL0438";

	/** LEVEL[W]<br>税チェック対象の場合、ＩＦデータの税率に対応する税と納品書の税率と異なる税は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>納品書の税：{6}<br>ＩＦデータの税率に対応する税：{7}<p>
	 */
	public static String MSLAL0439 = "MSLAL0439";

	/** LEVEL[W]<br>単価がゼロの場合、売上理由が必須になるため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0440 = "MSLAL0440";

	/** LEVEL[W]<br>同じ受注ＮＯに対する他の明細でエラーが発生したため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<br>受注ＮＯ：{6}<p>
	 */
	public static String MSLAL0441 = "MSLAL0441";

	/** LEVEL[W]<br>同じインボイスＮＯに対する他の明細でエラーが発生したため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>インボイスＮＯ：{4}<p>
	 */
	public static String MSLAL0442 = "MSLAL0442";

	/** LEVEL[W]<br>同じ納品書ＮＯに対する他の明細でエラーが発生したため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<p>
	 */
	public static String MSLAL0443 = "MSLAL0443";

	/** LEVEL[W]<br>仕入後計上となる場合、売上予定の売上可能数量を超過する数量は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<br>受注ＮＯ：{6}<br>受注明細ＮＯ：{7}<br>売上可能数量（基準単位）：{8}<br>ＩＦデータの数量（基準単位）：{9}<p>
	 */
	public static String MSLAL0444 = "MSLAL0444";

	/** LEVEL[W]<br>インボイス取引の場合、インボイス数量と異なる数量は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<br>インボイス数量：{8}<br>ＩＦデータの数量：{9}<p>
	 */
	public static String MSLAL0445 = "MSLAL0445";

	/** LEVEL[W]<br>検収基準売上または着荷基準売上の場合、売上予定の売上可能数量を超過する数量は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<br>売上可能数量（基準単位）：{8}<br>ＩＦデータの数量（基準単位）：{9}<p>
	 */
	public static String MSLAL0446 = "MSLAL0446";

	/** LEVEL[W]<br>打切となる残数量がないため、打切指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<br>受注ＮＯ：{6}<br>受注明細ＮＯ：{7}<p>
	 */
	public static String MSLAL0447 = "MSLAL0447";

	/** LEVEL[W]<br>インボイス取引の場合、打切指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<p>
	 */
	public static String MSLAL0448 = "MSLAL0448";

	/** LEVEL[W]<br>打切となる残数量がないため、打切指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<p>
	 */
	public static String MSLAL0449 = "MSLAL0449";

	/** LEVEL[W]<br>インボイスの全明細が処理対象となっていないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<br>外部システムＣＤ：{8}<br>外部仕入実績明細ＮＯ：{9}<p>
	 */
	public static String MSLAL0450 = "MSLAL0450";

	/** LEVEL[W]<br>同一インボイスで異なる入金予定日が指定されているため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>インボイスＮＯ：{4}<br>インボイス明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<p>
	 */
	public static String MSLAL0451 = "MSLAL0451";

	/** LEVEL[W]<br>ＩＦデータに対応する売上実績情報が取得できないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<br>品目：{8}<br>手配ＮＯ：{9}<br>外部システムＣＤ：{10}<br>外部仕入実績明細ＮＯ：{11}<p>
	 */
	public static String MSLAL0452 = "MSLAL0452";

	/** LEVEL[W]<br>打切のまま取消することはできません。打切解除した後に取込を行ってください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<p>
	 */
	public static String MSLAL0453 = "MSLAL0453";

	/** LEVEL[W]<br>対象の得意先は売上が禁止されているため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<br>売上日：{8}<p>
	 */
	public static String MSLAL0454 = "MSLAL0454";

	/** LEVEL[W]<br>対象の品目は売上が禁止されているため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<br>品目：{8}<br>売上日：{9}<p>
	 */
	public static String MSLAL0455 = "MSLAL0455";

	/** LEVEL[W]<br>仕入済の数量と異なる数量ため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<br>仕入済数量（基準単位）：{6}<br>ＩＦデータの数量（基準単位）：{7}<p>
	 */
	public static String MSLAL0456 = "MSLAL0456";

	/** LEVEL[W]<br>対象の外部システムＣＤ、外部仕入実績明細ＮＯに対する売上実績が既に登録されているため、新規で取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<br>外部システムＣＤ：{8}<br>外部仕入実績明細ＮＯ：{9}<br>登録済売上実績ＮＯ：{10}<p>
	 */
	public static String MSLAL0457 = "MSLAL0457";

	/** LEVEL[W]<br>下記項目のいずれかあるいは両方を指定してください。<br>納品書ＮＯ、得意先注文ＮＯ<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<p>
	 */
	public static String MSLAL0458 = "MSLAL0458";

	/** LEVEL[W]<br>指定された税額と、算出した税額が異なります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>ＩＦデータの税額：{3}<br>算出した税額：{4}<p>
	 */
	public static String MSLAL0459 = "MSLAL0459";

	/** LEVEL[W]<br>取引単位数量の小数部桁数が正しくありません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<br>取引単位：{8}<br>取引単位数量：{9}<br>小数部有効桁数：{10}<p>
	 */
	public static String MSLAL0460 = "MSLAL0460";

	/** LEVEL[W]<br>同一処理グループ、同一データ更新区分で、外部システムＣＤ、外部仕入実績明細ＮＯが重複しているため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<br>外部システムＣＤ：{8}<br>外部仕入実績明細ＮＯ：{9}<p>
	 */
	public static String MSLAL0461 = "MSLAL0461";

	/** LEVEL[W]<br>外部システムＣＤ、外部仕入実績明細ＮＯに紐づく売上実績が特定できないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<br>外部システムＣＤ：{8}<br>外部仕入実績明細ＮＯ：{9}<p>
	 */
	public static String MSLAL0462 = "MSLAL0462";

	/** LEVEL[W]<br>ロット発番区分が手動のため、ロットＮＯ、サブロットＮＯを発番して取り込むことができません。<br>仕入直送売上登録または売上実績一覧登録でロットＮＯ、サブロットＮＯを指定して登録してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<br>品目：{8}<p>
	 */
	public static String MSLAL0463 = "MSLAL0463";

	/** LEVEL[W]<br>注文時の税（税率、税区分、内税）と、マスタから算出した税が異なります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>注文時の税率：{3}<br>注文時の税区分：{4}<br>注文時の内税：{5}<br>マスタから算出した税：{6}<br>マスタから算出した税率：{7}<br>マスタから算出した税区分：{8}<br>マスタから算出した内税：{9}<p>
	 */
	public static String MSLAL0464 = "MSLAL0464";

	/** LEVEL[W]<br>ロットＮＯの混在が不可の投入品でロットが混在しているため、処理できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>投入予定ＮＯ：{3}<p>
	 */
	public static String MSLAL0465 = "MSLAL0465";

	/** LEVEL[W]<br>サブロットＮＯの混在が不可の投入品でサブロットが混在しているため、処理できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>投入予定ＮＯ：{3}<p>
	 */
	public static String MSLAL0466 = "MSLAL0466";

	/** LEVEL[W]<br>混在不可の代替グループ内で投入品が混在しているため、処理できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>投入予定ＮＯ：{3}<p>
	 */
	public static String MSLAL0467 = "MSLAL0467";

	/** LEVEL[I]<br>発注受信ＩＦ取込処理を開始します。<p>
	 */
	public static String MSLAL0470 = "MSLAL0470";

	/** LEVEL[I]<br>発注受信ＩＦ取込処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSLAL0471 = "MSLAL0471";

	/** LEVEL[W]<br>発注受信ＩＦ取込処理でエラーが発生しました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>メッセージＩＤ：{3}<br>メッセージ：<br>{4}<p>
	 */
	public static String MSLAL0472 = "MSLAL0472";

	/** LEVEL[W]<br>発生処理：{1}<br>発生日時：{2}<br>会社：{3}<br>ワーキンググループＣＤ：{4}<br>外部発注NO：{5}<br>エラー内容：{6}<p>
	 */
	public static String MSLAL0473 = "MSLAL0473";

	/** LEVEL[W]<br>同じ外部システムＣＤ、外部発注ＮＯにおいて先に処理したデータでエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<p>
	 */
	public static String MSLAL0474 = "MSLAL0474";

	/** LEVEL[I]<br>同じ外部システムＣＤ、外部発注ＮＯにおいて、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<p>
	 */
	public static String MSLAL0475 = "MSLAL0475";

	/** LEVEL[W]<br>同一の発注明細が既に存在するため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<br>外部発注明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0476 = "MSLAL0476";

	/** LEVEL[W]<br>対応する発注明細が取得できなかったため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0477 = "MSLAL0477";

	/** LEVEL[W]<br>対応する発注情報が複数件取得できたため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0478 = "MSLAL0478";

	/** LEVEL[W]<br>同一の外部発注ＮＯを持つ他の発注明細でエラーが発生したため、取り込みできませんでした。<p>
	 */
	public static String MSLAL0479 = "MSLAL0479";

	/** LEVEL[W]<br>今回の取込対象データのなかに、外部発注ＮＯ、外部発注明細ＮＯの組が重複しているデータが存在します。<p>
	 */
	public static String MSLAL0480 = "MSLAL0480";

	/** LEVEL[W]<br>値引品目のみの登録はできません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<br>外部発注明細ＮＯ：{5}<br><br><p>
	 */
	public static String MSLAL0481 = "MSLAL0481";

	/** LEVEL[W]<br>承認状況区分が一次承認済または最終承認済のため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部発注ＮＯ：{3}<br>発注NO：{4}<p>
	 */
	public static String MSLAL0482 = "MSLAL0482";

	/** LEVEL[W]<br>同一の外部発注ＮＯを持つ明細の中に、次処理（入荷、仕入、受領インボイス登録）が行われている明細があるため、処理できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<p>
	 */
	public static String MSLAL0483 = "MSLAL0483";

	/** LEVEL[W]<br>取引先禁止マスタにおいて、発注が禁止されています。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注先ＣＤ：{3}<br>発注日：{4}<p>
	 */
	public static String MSLAL0484 = "MSLAL0484";

	/** LEVEL[W]<br>品目禁止マスタにおいて、発注が禁止されています。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<br>発注日：{4}<br>禁止日：{5}<p>
	 */
	public static String MSLAL0485 = "MSLAL0485";

	/** LEVEL[W]<br>外注品の購買識別区分には、有償受給あるいは通常購買を指定してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<br>外部発注明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0486 = "MSLAL0486";

	/** LEVEL[W]<br>外注品を経費購買できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<br>外部発注明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0487 = "MSLAL0487";

	/** LEVEL[W]<br>値引品目は購買識別区分に通常購買を指定してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<br>外部発注明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0488 = "MSLAL0488";

	/** LEVEL[W]<br>資産管理しない品目は、購買識別区分にＶＭＩを指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<br>外部発注明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0489 = "MSLAL0489";

	/** LEVEL[W]<br>入荷不要の品目は、購買識別区分に無償受給を指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<br>外部発注明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0490 = "MSLAL0490";

	/** LEVEL[W]<br>取引が経費購買の場合、資産管理する品目を登録できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<br>外部発注明細ＮＯ：{5}<br>品目：{6}<p>
	 */
	public static String MSLAL0491 = "MSLAL0491";

	/** LEVEL[W]<br>資産管理する品目は経費購買の理由を設定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<br>外部発注明細ＮＯ：{5}<br>品目：{6}<br>理由ＣＤ：{7}<p>
	 */
	public static String MSLAL0492 = "MSLAL0492";

	/** LEVEL[W]<br>資産管理しない品目は経費購買の理由を設定してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<br>外部発注明細ＮＯ：{5}<br>品目：{6}<br>理由ＣＤ：{7}<p>
	 */
	public static String MSLAL0493 = "MSLAL0493";

	/** LEVEL[W]<br>下請法対象取引先の発注先に対する納入希望日は仕入予定日と同日である必要があります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<br>外部発注明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0494 = "MSLAL0494";

	/** LEVEL[W]<br>負担発注ＮＯに対応する発注情報が見つかりません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<br>外部発注明細ＮＯ：{5}<br>負担発注ＮＯ：{6}<p>
	 */
	public static String MSLAL0495 = "MSLAL0495";

	/** LEVEL[W]<br>負担受注ＮＯに対応する受注情報が見つかりません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<br>外部発注明細ＮＯ：{5}<br>負担受注ＮＯ：{6}<p>
	 */
	public static String MSLAL0496 = "MSLAL0496";

	/** LEVEL[W]<br>負担インボイスＮＯに対応するインボイス情報あるいは受領インボイス情報が見つかりません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<br>外部発注明細ＮＯ：{5}<br>負担インボイスＮＯ：{6}<p>
	 */
	public static String MSLAL0497 = "MSLAL0497";

	/** LEVEL[W]<br>外部発注明細ＮＯに紐づかない発注明細があるため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<p>
	 */
	public static String MSLAL0498 = "MSLAL0498";

	/** LEVEL[W]<br>対応する発注明細が複数件取得できたため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0499 = "MSLAL0499";

	/** LEVEL[W]<br>支給直送の場合、購買識別区分にＶＭＩを指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<br>外部発注明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0500 = "MSLAL0500";

	/** LEVEL[W]<br>指定された取引は利用できません。<br>下記の取引パタン区分が指定された取引を指定してください。<br>取引パタン区分：「仕入」「経費購買」<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<br>外部発注明細ＮＯ：{5}<br>取引ＣＤ：{6}<p>
	 */
	public static String MSLAL0501 = "MSLAL0501";

	/** LEVEL[W]<br>外部発注ＮＯが同じである各明細行の中で、手配ＮＯ１に対応する案件ＮＯが異なってます。<br>外部発注ＮＯを分割するか、手配ＮＯ１を変更して、１つの外部発注ＮＯに対して１つの案件ＮＯとなるように変更してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<br>外部発注明細ＮＯ：{5}<br>手配ＮＯ１：{6}<br>案件ＮＯ：{7}<br>案件名：{8}<p>
	 */
	public static String MSLAL0502 = "MSLAL0502";

	/** LEVEL[W]<br>発注ヘッダの案件ＮＯと、手配ＮＯ１に対応する案件ＮＯが異なっているため訂正できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<br>外部発注明細ＮＯ：{5}<br>手配ＮＯ１：{6}<br>案件ＮＯ：{7}<br>案件名：{8}<br>発注ヘッダの案件ＮＯ：{9}<br>発注ヘッダの案件名：{10}<p>
	 */
	public static String MSLAL0503 = "MSLAL0503";

	/** LEVEL[W]<br>加工単価の小数部桁数が正しくありません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>単価：{3}<br>小数部有効桁数：{4}<p>
	 */
	public static String MSLAL0504 = "MSLAL0504";

	/** LEVEL[W]<br>有償支給単価の小数部桁数が正しくありません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>単価：{3}<br>小数部有効桁数：{4}<p>
	 */
	public static String MSLAL0505 = "MSLAL0505";

	/** LEVEL[W]<br>品目マスタの購買単価変更許可がオフ、かつ、取引マスタの購買単価変更許可がオフであるため、単価を指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0506 = "MSLAL0506";

	/** LEVEL[W]<br>同一の外部発注ＮＯを持つ明細の中に、打切済の明細が含まれているため、処理できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部発注ＮＯ：{4}<p>
	 */
	public static String MSLAL0507 = "MSLAL0507";

	/** LEVEL[W]<br>値引額小数部桁数が正しくありません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>値引額：{3}<br>小数部有効桁数：{4}<p>
	 */
	public static String MSLAL0508 = "MSLAL0508";

	/** LEVEL[W]<br>出荷指図明細が存在しません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0509 = "MSLAL0509";

	/** LEVEL[W]<br>指定された出荷指図明細が存在しません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>出荷指図明細ＮＯ：{3}<p>
	 */
	public static String MSLAL0510 = "MSLAL0510";

	/** LEVEL[W]<br>外部移動実績ＮＯが重複しています。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部移動実績ＮＯ：{4}<p>
	 */
	public static String MSLAL0512 = "MSLAL0512";

	/** LEVEL[I]<br>入金受信ＩＦ取込処理を開始します。<p>
	 */
	public static String MSLAL0600 = "MSLAL0600";

	/** LEVEL[I]<br>入金受信ＩＦ取込処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSLAL0601 = "MSLAL0601";

	/** LEVEL[W]<br>入金受信ＩＦ取込処理でエラーが発生しました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>メッセージＩＤ：{3}<br>メッセージ：<br>{4}<p>
	 */
	public static String MSLAL0602 = "MSLAL0602";

	/** LEVEL[W]<br>発生処理：{1}<br>発生日時：{2}<br>会社：{3}<br>ワーキンググループＣＤ：{4}<br>入金先ＣＤ：{5}<br>エラー内容：{6}<p>
	 */
	public static String MSLAL0603 = "MSLAL0603";

	/** LEVEL[W]<br>同じ外部システムＣＤ、外部入金ＮＯにおいて先に処理したデータでエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部入金ＮＯ：{4}<p>
	 */
	public static String MSLAL0604 = "MSLAL0604";

	/** LEVEL[I]<br>同じ外部システムＣＤ、外部入金ＮＯにおいて、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部入金ＮＯ：{4}<p>
	 */
	public static String MSLAL0605 = "MSLAL0605";

	/** LEVEL[W]<br>指定された口座と銀行の組み合わせが口座マスタに登録されていません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>口座：{3}<br>銀行：{4}<p>
	 */
	public static String MSLAL0606 = "MSLAL0606";

	/** LEVEL[W]<br>指定された債権決済区分と入金方法の組み合わせが決済方法マスタに登録されていません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>債権決済区分：{3}<br>入金方法：{4}<p>
	 */
	public static String MSLAL0607 = "MSLAL0607";

	/** LEVEL[W]<br>同一の入金が既に存在するため、取り込みができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部入金ＮＯ：{4}<p>
	 */
	public static String MSLAL0608 = "MSLAL0608";

	/** LEVEL[W]<br>対応する入金情報が複数件取得できたため、取り込みができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部入金ＮＯ：{4}<p>
	 */
	public static String MSLAL0609 = "MSLAL0609";

	/** LEVEL[W]<br>対応する入金情報が取得できないため、取り込みができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部入金ＮＯ：{4}<p>
	 */
	public static String MSLAL0610 = "MSLAL0610";

	/** LEVEL[W]<br>ロットＮＯが指定されていません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0611 = "MSLAL0611";

	/** LEVEL[W]<br>サブロットＮＯが指定されていません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0612 = "MSLAL0612";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ１管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ１が必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<p>
	 */
	public static String MSLAL0613 = "MSLAL0613";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ２管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ２が必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<p>
	 */
	public static String MSLAL0614 = "MSLAL0614";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ３管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ３が必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<p>
	 */
	public static String MSLAL0615 = "MSLAL0615";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ４管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ４が必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<p>
	 */
	public static String MSLAL0616 = "MSLAL0616";

	/** LEVEL[W]<br>計画外実績の新規登録では、出来高予定ＮＯ、工程指図ＮＯ、製造指図ＮＯ、製造指図改定番号を指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0617 = "MSLAL0617";

	/** LEVEL[W]<br>計画外実績として出来高区分に副産品は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0618 = "MSLAL0618";

	/** LEVEL[W]<br>計画外実績の新規登録では工数管理ＣＤが必須です。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0619 = "MSLAL0619";

	/** LEVEL[W]<br>計画外実績としてロットＮＯ発番パタンが子品目ロット引継ぎの品目は登録できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<p>
	 */
	public static String MSLAL0621 = "MSLAL0621";

	/** LEVEL[W]<br>計画外実績としてサブロットＮＯ発番パタンが子品目サブロット引継ぎの品目は登録できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<p>
	 */
	public static String MSLAL0622 = "MSLAL0622";

	/** LEVEL[W]<br>計画外実績として製造品以外の品目は登録できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<p>
	 */
	public static String MSLAL0623 = "MSLAL0623";

	/** LEVEL[W]<br>計画外実績として外注品は登録できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<br>製造場所：{4}<p>
	 */
	public static String MSLAL0624 = "MSLAL0624";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ１管理区分に「1.管理しない」が指定されているため、手配ＮＯ１は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<p>
	 */
	public static String MSLAL0625 = "MSLAL0625";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ２管理区分に「1.管理しない」が指定されているため、手配ＮＯ２は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<p>
	 */
	public static String MSLAL0626 = "MSLAL0626";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ３管理区分に「1.管理しない」が指定されているため、手配ＮＯ３は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<p>
	 */
	public static String MSLAL0627 = "MSLAL0627";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ４管理区分に「1.管理しない」が指定されているため、手配ＮＯ４は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<p>
	 */
	public static String MSLAL0628 = "MSLAL0628";

	/** LEVEL[W]<br>計画外実績として製造承認対象の品目は登録できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<p>
	 */
	public static String MSLAL0629 = "MSLAL0629";

	/** LEVEL[W]<br>計画外実績の新規登録では、打切をオンにできません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0630 = "MSLAL0630";

	/** LEVEL[W]<br>同じ外部出来高実績ＮＯを持つ出来高実績ＩＦでエラーとなったため、取り込みできませんでした。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<br>外部出来高実績ＮＯ：{4}<p>
	 */
	public static String MSLAL0631 = "MSLAL0631";

	/** LEVEL[W]<br>入金登録区分に「登録不可」が指定されている入金方法では、入金情報を登録できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>入金方法：{3}<p>
	 */
	public static String MSLAL0632 = "MSLAL0632";

	/** LEVEL[W]<br>今回の取込対象データのなかに、外部システムＣＤ、外部入金ＮＯの組が重複しているデータが存在します。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部入金ＮＯ：{4}<p>
	 */
	public static String MSLAL0633 = "MSLAL0633";

	/** LEVEL[W]<br>「ＦＢ」以外の外部システム区分が指定されている外部システムからは取込みができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<p>
	 */
	public static String MSLAL0634 = "MSLAL0634";

	/** LEVEL[I]<br>オーダ受信ＩＦ取込処理を開始します。<p>
	 */
	public static String MSLAL0635 = "MSLAL0635";

	/** LEVEL[I]<br>オーダ受信ＩＦ取込処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSLAL0636 = "MSLAL0636";

	/** LEVEL[W]<br>オーダ受信ＩＦ取込処理でエラーが発生しました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>メッセージＩＤ：{3}<br>メッセージ：<br>{4}<p>
	 */
	public static String MSLAL0637 = "MSLAL0637";

	/** LEVEL[W]<br>同じ外部システムＣＤ、外部品目オーダＮＯにおいて先に処理したデータでエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部品目オーダＮＯ：{4}<p>
	 */
	public static String MSLAL0638 = "MSLAL0638";

	/** LEVEL[I]<br>同じ外部システムＣＤ、外部品目オーダＮＯにおいて、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部品目オーダＮＯ：{4}<p>
	 */
	public static String MSLAL0639 = "MSLAL0639";

	/** LEVEL[W]<br>同一の工程オーダが既に存在するため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部品目オーダＮＯ：{4}<br>外部工程オーダＮＯ：{5}<p>
	 */
	public static String MSLAL0640 = "MSLAL0640";

	/** LEVEL[W]<br>対応する工程オーダが取得できなかったため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0641 = "MSLAL0641";

	/** LEVEL[W]<br>対応するオーダ情報が複数件取得できたため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0642 = "MSLAL0642";

	/** LEVEL[W]<br>同一の外部品目オーダＮＯを持つ他の工程オーダでエラーが発生したため、取り込みできませんでした。<p>
	 */
	public static String MSLAL0643 = "MSLAL0643";

	/** LEVEL[W]<br>今回の取込対象データのなかに、外部品目オーダＮＯ、外部工程オーダＮＯの組が重複しているデータが存在します。<p>
	 */
	public static String MSLAL0644 = "MSLAL0644";

	/** LEVEL[W]<br>外部工程オーダＮＯに紐づかない工程オーダがあるため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部品目オーダＮＯ：{4}<p>
	 */
	public static String MSLAL0645 = "MSLAL0645";

	/** LEVEL[W]<br>対応する工程オーダが複数件取得できたため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0646 = "MSLAL0646";

	/** LEVEL[W]<br>品目オーダ区分には「製造」、「外注」のいずれかを指定してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部品目オーダＮＯ：{4}<br>外部工程オーダＮＯ：{5}<br>品目オーダ区分：{6}<p>
	 */
	public static String MSLAL0647 = "MSLAL0647";

	/** LEVEL[W]<br>対象の工程オーダの中で、品目工程マスタに存在しない工程ＣＤ、工程連番が含まれています。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部品目オーダＮＯ：{4}<br>外部工程オーダＮＯ：{5}<br>工程ＣＤ：{6}<br>工程連番：{7}<p>
	 */
	public static String MSLAL0648 = "MSLAL0648";

	/** LEVEL[W]<br>必要な工程オーダが不足しています。品目工程マスタを確認してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部品目オーダＮＯ：{4}<br>場所ＣＤ：{5}<br>品目：{6}<p>
	 */
	public static String MSLAL0649 = "MSLAL0649";

	/** LEVEL[W]<br>同じ受注ＮＯに対する他の明細でエラーが発生したため、取り込むことができません。<br>バッチログ確認で内容を確認してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<br>受注ＮＯ：{6}<p>
	 */
	public static String MSLAL0650 = "MSLAL0650";

	/** LEVEL[W]<br>品目単位マスタに存在しない単位は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>品目：{3}<br>単位：{4}<p>
	 */
	public static String MSLAL0651 = "MSLAL0651";

	/** LEVEL[W]<br>同じ出荷元物流グループ、外部システムＣＤ、外部出荷実績ＮＯにおいて先に処理した出荷情報でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>出荷元物流グループ：{3}<br>外部システムＣＤ：{4}<br>外部出荷実績ＮＯ：{5}<p>
	 */
	public static String MSLAL0652 = "MSLAL0652";

	/** LEVEL[W]<br>受注時に指定された税ＣＤが税マスタに存在しないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<br>受注ＮＯ：{6}<br>受注明細ＮＯ：{7}<br>受注時の税：{8}<p>
	 */
	public static String MSLAL0653 = "MSLAL0653";

	/** LEVEL[W]<br>インボイスに指定された税ＣＤが税マスタに存在しないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>インボイスＮＯ：{4}<br>インボイス明細ＮＯ：{5}<br>得意先注文ＮＯ：{6}<br>得意先注文明細ＮＯ：{7}<br>インボイスの税：{8}<p>
	 */
	public static String MSLAL0654 = "MSLAL0654";

	/** LEVEL[W]<br>納品書に指定された税ＣＤが税マスタに存在しないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>納品書ＮＯ：{4}<br>納品書明細ＮＯ：{5}<br>納品書の税：{6}<p>
	 */
	public static String MSLAL0655 = "MSLAL0655";

	/** LEVEL[I]<br>品目マスタ送信ＩＦ処理を開始します。<br>外部システムＣＤ：{1}<br>マスタ適用日：{2}<br>ワーキンググループＣＤ：{3}<br>製造場所グループＣＤ：{4}<br>連携スケジューラ区分：{5}<p>
	 */
	public static String MSLAL0700 = "MSLAL0700";

	/** LEVEL[I]<br>品目マスタ送信ＩＦ処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<p>
	 */
	public static String MSLAL0701 = "MSLAL0701";

	/** LEVEL[W]<br>必須項目が未入力です。<br>{1}<p>
	 */
	public static String MSLAL0702 = "MSLAL0702";

	/** LEVEL[W]<br>ＧＡのAPI呼び出しでエラーが発生しました。<br>発注送信ＩＦ確認画面でエラーメッセージを確認してください。<br>データＮＯ：{1}<br>発注ＮＯ：{2}<p>
	 */
	public static String MSLAL0703 = "MSLAL0703";

	/** LEVEL[W]<br>{1}<p>
	 */
	public static String MSLAL0704 = "MSLAL0704";

	/** LEVEL[W]<br>複数の発注をまとめて送信した際に他の伝票でエラーが発生したため、ＧＡに反映できませんでした。<br>発注一覧登録から未反映の発注を再送信してください。<br>データＮＯ：{1}<br>発注ＮＯ：{2}<p>
	 */
	public static String MSLAL0705 = "MSLAL0705";

	/** LEVEL[I]<br>品目工程マスタ送信ＩＦ処理を開始します。<br>外部システムＣＤ：{1}<br>マスタ適用日：{2}<br>ワーキンググループＣＤ：{3}<br>製造場所グループＣＤ：{4}<br>工場物流倉庫ＣＤ：{5}<br>場所ＣＤ：{6}<br>連携スケジューラ区分：{7}<p>
	 */
	public static String MSLAL0706 = "MSLAL0706";

	/** LEVEL[I]<br>品目工程マスタ送信ＩＦ処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<p>
	 */
	public static String MSLAL0707 = "MSLAL0707";

	/** LEVEL[I]<br>品目詳細マスタ送信ＩＦ処理を開始します。<br>外部システムCD：{1}<br>マスタ適用日：{2}<br>ワーキンググループＣＤ：{3}<br>製造場所グループＣＤ：{4}<br>工場物流倉庫ＣＤ：{5}<br>製造場所ＣＤ：{6}<br>連携スケジューラ区分：{7}<p>
	 */
	public static String MSLAL0708 = "MSLAL0708";

	/** LEVEL[I]<br>品目詳細マスタ送信ＩＦ処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<p>
	 */
	public static String MSLAL0709 = "MSLAL0709";

	/** LEVEL[I]<br>ＢＯＭマスタ送信ＩＦ処理を開始します。<br>外部システムCD：{1}<br>マスタ適用日：{2}<br>ワーキンググループＣＤ：{3}<p>
	 */
	public static String MSLAL0710 = "MSLAL0710";

	/** LEVEL[I]<br>ＢＯＭマスタ送信ＩＦ処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<p>
	 */
	public static String MSLAL0711 = "MSLAL0711";

	/** LEVEL[I]<br>場所マスタ送信ＩＦ処理を開始します。<br>外部システムCD：{1}<br>ワーキンググループＣＤ：{2}<br>工場物流倉庫：{3}<br>場所：{4}<p>
	 */
	public static String MSLAL0712 = "MSLAL0712";

	/** LEVEL[I]<br>場所マスタ送信ＩＦ処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<p>
	 */
	public static String MSLAL0713 = "MSLAL0713";

	/** LEVEL[I]<br>稼働カレンダマスタ送信ＩＦ処理を開始します。<br>外部システムCD：{1}<br>マスタ適用日：{2}<p>
	 */
	public static String MSLAL0714 = "MSLAL0714";

	/** LEVEL[I]<br>稼働カレンダマスタ送信ＩＦ処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<p>
	 */
	public static String MSLAL0715 = "MSLAL0715";

	/** LEVEL[I]<br>臨時カレンダマスタ送信ＩＦ処理を開始します。<br>外部システムＣＤ：{1}<p>
	 */
	public static String MSLAL0716 = "MSLAL0716";

	/** LEVEL[I]<br>臨時カレンダマスタ送信ＩＦ処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<p>
	 */
	public static String MSLAL0717 = "MSLAL0717";

	/** LEVEL[I]<br>入庫予定送信ＩＦ処理を開始します。<br>外部システムＣＤ：{1}<br>ワーキンググループＣＤ：{2}<br>製造場所グループＣＤ：{3}<br>工場物流倉庫ＣＤ：{4}<br>場所ＣＤ：{5}<br>対象期間ＦＲＯＭ：{6}<br>対象期間ＴＯ：{7}<br>連携スケジューラ区分：{8}<p>
	 */
	public static String MSLAL0718 = "MSLAL0718";

	/** LEVEL[I]<br>入庫予定送信ＩＦ処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<p>
	 */
	public static String MSLAL0719 = "MSLAL0719";

	/** LEVEL[I]<br>出庫予定送信ＩＦ処理を開始します。<br>外部システムＣＤ：{1}<br>ワーキンググループＣＤ：{2}<br>製造場所グループＣＤ：{3}<br>工場物流倉庫ＣＤ：{4}<br>場所ＣＤ：{5}<br>対象期間ＦＲＯＭ：{6}<br>対象期間ＴＯ：{7}<br>連携スケジューラ区分：{8}<p>
	 */
	public static String MSLAL0720 = "MSLAL0720";

	/** LEVEL[I]<br>出庫予定送信ＩＦ処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<p>
	 */
	public static String MSLAL0721 = "MSLAL0721";

	/** LEVEL[I]<br>在庫情報送信ＩＦ処理を開始します。<br>外部システムＣＤ：{1}<br>ワーキンググループＣＤ：{2}<br>製造場所グループＣＤ：{3}<br>工場物流倉庫ＣＤ：{4}<br>場所ＣＤ：{5}<br>連携スケジューラ区分：{6}<p>
	 */
	public static String MSLAL0722 = "MSLAL0722";

	/** LEVEL[I]<br>在庫情報送信ＩＦ処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<p>
	 */
	public static String MSLAL0723 = "MSLAL0723";

	/** LEVEL[I]<br>日次需要送信ＩＦ処理を開始します。<br>外部システムCD：{1}<br>ワーキンググループＣＤ：{2}<br>工場物流倉庫：{3}<br>場所：{4}<p>
	 */
	public static String MSLAL0724 = "MSLAL0724";

	/** LEVEL[I]<br>日次需要送信ＩＦ処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<p>
	 */
	public static String MSLAL0725 = "MSLAL0725";

	/** LEVEL[I]<br>オーダ送信ＩＦ処理を開始します。<br>外部システムＣＤ：{1}<br>ワーキンググループＣＤ：{2}<br>製造場所グループＣＤ：{3}<br>工場物流倉庫ＣＤ：{4}<br>製造場所ＣＤ：{5}<br>対象期間ＦＲＯＭ：{6}<br>対象期間ＴＯ：{7}<br>未確定を含む：{8}<br>連携スケジューラ区分：{9}<p>
	 */
	public static String MSLAL0726 = "MSLAL0726";

	/** LEVEL[I]<br>オーダ送信ＩＦ処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<p>
	 */
	public static String MSLAL0727 = "MSLAL0727";

	/** LEVEL[I]<br>同じ発注ＮＯにおいて、先に処理したデータでエラーが発生したため、送信対象から除外しました。<br>データＮＯ：{1}<br>発注ＮＯ：{2}<p>
	 */
	public static String MSLAL0728 = "MSLAL0728";

	/** LEVEL[W]<br>同じ発注ＮＯにおいて、他の発注送信処理でエラーが発生したため、ＧＡに反映できませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>発注ＮＯ：{3}<p>
	 */
	public static String MSLAL0729 = "MSLAL0729";

	/** LEVEL[I]<br>納入指示受信ＩＦ取込処理を開始します。<p>
	 */
	public static String MSLAL0730 = "MSLAL0730";

	/** LEVEL[I]<br>納入指示受信ＩＦ取込処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSLAL0731 = "MSLAL0731";

	/** LEVEL[W]<br>納入指示受信ＩＦ取込処理でエラーが発生しました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>メッセージＩＤ：{3}<br>メッセージ：<br>{4}<p>
	 */
	public static String MSLAL0732 = "MSLAL0732";

	/** LEVEL[W]<br>同じ得意先、得意先注文ＮＯ、得意先注文明細ＮＯに対する他の納入指示の取り込み処理でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0733 = "MSLAL0733";

	/** LEVEL[W]<br>対応する受注情報が複数件取得できたため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0734 = "MSLAL0734";

	/** LEVEL[W]<br>対応する受注情報が取得できないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0735 = "MSLAL0735";

	/** LEVEL[W]<br>受注明細が取消されているため、納入指示を取り込みできません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0736 = "MSLAL0736";

	/** LEVEL[W]<br>同じ得意先、得意先注文ＮＯ、得意先注文明細ＮＯに対する納入指示に異なる注文改訂番号が設定されています。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<br>注文改訂番号：{6}<p>
	 */
	public static String MSLAL0737 = "MSLAL0737";

	/** LEVEL[W]<br>注文時の品目と異なる品目は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<br>注文時の品目：{6}<br>ＩＦデータの品目：{7}<p>
	 */
	public static String MSLAL0738 = "MSLAL0738";

	/** LEVEL[W]<br>納入指示受信ＩＦ取込処理でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>メッセージＩＤ：{3}<br>メッセージ：<br>{4}<p>
	 */
	public static String MSLAL0739 = "MSLAL0739";

	/** LEVEL[W]<br>受注明細の出荷指図区分が「ピッキングなし」であるため、納入指示を取り込みできません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0741 = "MSLAL0741";

	/** LEVEL[W]<br>同じ得意先、得意先注文ＮＯ、得意先注文明細ＮＯにおいて先に処理したデータでエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0742 = "MSLAL0742";

	/** LEVEL[W]<br>同じ得意先、得意先注文ＮＯ、得意先注文明細ＮＯにおいて、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0743 = "MSLAL0743";

	/** LEVEL[W]<br>注文時の単位と異なる単位は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<br>注文時の取引単位：{6}<br>ＩＦデータの取引単位：{7}<p>
	 */
	public static String MSLAL0744 = "MSLAL0744";

	/** LEVEL[W]<br>取引単位数量の小数部桁数が正しくありません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<br>取引単位：{6}<br>取引単位数量：{7}<br>小数部有効桁数：{8}<p>
	 */
	public static String MSLAL0745 = "MSLAL0745";

	/** LEVEL[W]<br>受注明細が打切されているため、納入指示を取り込みできません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0747 = "MSLAL0747";

	/** LEVEL[W]<br>同一の得意先納入指示が既に存在するため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>得意先：{3}<br>得意先注文ＮＯ：{4}<br>得意先注文明細ＮＯ：{5}<br>得意先納入指示ＮＯ：{6}<p>
	 */
	public static String MSLAL0748 = "MSLAL0748";

	/** LEVEL[I]<br>請求受信ＩＦ取込処理を開始します。<p>
	 */
	public static String MSLAL0750 = "MSLAL0750";

	/** LEVEL[I]<br>請求受信ＩＦ取込処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSLAL0751 = "MSLAL0751";

	/** LEVEL[W]<br>同じ請求元、請求書ＮＯにおいて先に処理したデータでエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>請求元ＣＤ：{3}<br>請求書ＮＯ：{4}<p>
	 */
	public static String MSLAL0752 = "MSLAL0752";

	/** LEVEL[W]<br>同じ請求元、請求書ＮＯにおいて外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>請求元ＣＤ：{3}<br>請求書ＮＯ：{4}<p>
	 */
	public static String MSLAL0753 = "MSLAL0753";

	/** LEVEL[W]<br>同じ請求元、請求書ＮＯに対する他の請求の取り込み処理でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>請求元ＣＤ：{3}<br>請求書ＮＯ：{4}<p>
	 */
	public static String MSLAL0754 = "MSLAL0754";

	/** LEVEL[W]<br>請求受信ＩＦ取込処理でエラーが発生しました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>メッセージＩＤ：{3}<br>メッセージ：{4}<p>
	 */
	public static String MSLAL0755 = "MSLAL0755";

	/** LEVEL[W]<br>データ更新区分が新規以外のデータを取り込むことはできません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>請求元ＣＤ：{3}<br>請求書ＮＯ：{4}<p>
	 */
	public static String MSLAL0756 = "MSLAL0756";

	/** LEVEL[W]<br>今回の取込対象データのなかに、請求元ＣＤ、請求書ＮＯ、請求明細ＮＯの組が重複しているデータが存在します。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>請求元ＣＤ：{3}<br>請求書ＮＯ：{4}<br>請求明細ＮＯ：{5}<p>
	 */
	public static String MSLAL0757 = "MSLAL0757";

	/** LEVEL[W]<br>同じ外部システムデータＮＯ、請求元ＣＤ、請求書ＮＯのなかで、ヘッダ項目値が一致していないデータが存在します。	<br>データＮＯ：{1}	<br>データ行ＮＯ：{2}	<br>請求元ＣＤ：{3}	<br>請求書ＮＯ：{4}	<p>
	 */
	public static String MSLAL0758 = "MSLAL0758";

	/** LEVEL[W]<br>発生処理：{1}<br>発生日時：{2}<br>会社：{3}<br>請求元ＣＤ：{4}<br>エラー内容：{5}<p>
	 */
	public static String MSLAL0759 = "MSLAL0759";

	/** LEVEL[W]<br>オーダ洗い替えＦＬＧがオンの場合、データ更新区分が新規以外のデータを同時に取り込むことができません。<br>取り込み対象のデータのデータ更新区分を新規のみにしてください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部品目オーダＮＯ：{4}<br>外部工程オーダＮＯ：{5}<p>
	 */
	public static String MSLAL0760 = "MSLAL0760";

	/** LEVEL[I]<br>請求送信ＩＦデータを作成しました。<p>
	 */
	public static String MSLAL0761 = "MSLAL0761";

	/** LEVEL[W]<br>発生処理：{1}<br>発生日時：{2}<br>会社：{3}<br>請求先ＣＤ：{4}<br>請求書ＮＯ：{5}<br>エラー内容：{6}<p>
	 */
	public static String MSLAL0762 = "MSLAL0762";

	/** LEVEL[W]<br>ＩＦ通信ルールマスタの設定が不正です。ＩＦ通信ルールマスタの以下設定を確認してください。<br>・FILE_USE_HEADINGが「true」であること<br>・SEND_FILE_GRPが「2」であること<br>ＩＦ処理区分：{1}<br>外部システムＣＤ：{2}<br>データNO：{3}<p>
	 */
	public static String MSLAL0763 = "MSLAL0763";

	/** LEVEL[W]<br>送信変換処理中にエラーが発生しました。<p>
	 */
	public static String MSLAL0764 = "MSLAL0764";

	/** LEVEL[I]<br>以下の引数は、指定の連携スケジューラ区分では無効です。<br>そのため指定された引数の条件は無視されました。<br>連携スケジューラ区分：{1}<br>引数名：{2}<p>
	 */
	public static String MSLAL0901 = "MSLAL0901";

	/** LEVEL[W]<br>更新対象となる品目オーダ情報が存在しないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部品目オーダＮＯ：{4}<p>
	 */
	public static String MSLAL0902 = "MSLAL0902";

	/** LEVEL[W]<br>更新対象となる品目オーダ情報の品目オーダ状況区分が「保存」ではないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部品目オーダＮＯ：{4}<br>品目オーダ状況区分：{5}<p>
	 */
	public static String MSLAL0903 = "MSLAL0903";

	/** LEVEL[W]<br>更新対象となる品目オーダ情報はオーダ送信されていないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部品目オーダＮＯ：{4}<p>
	 */
	public static String MSLAL0904 = "MSLAL0904";

	/** LEVEL[W]<br>他のオーダ受信ＩＦデータでエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部品目オーダＮＯ：{4}<p>
	 */
	public static String MSLAL0905 = "MSLAL0905";

	/** LEVEL[W]<br>スケジューラ凍結対象の品目オーダにおいて、<br>紐づく工程オーダの中に凍結前状態の工程オーダが含まれているため、<br>品目オーダが確定できませんでした。<br>品目オーダＮＯ：{1}<p>
	 */
	public static String MSLAL0906 = "MSLAL0906";

	/** LEVEL[I]<br>工程指図実績送信ＩＦ処理を開始します。<br>外部システムＣＤ：{1}<br>ワーキンググループＣＤ：{2}<br>製造場所グループＣＤ：{3}<br>工場物流倉庫ＣＤ：{4}<br>製造場所ＣＤ：{5}<br>対象期間ＦＲＯＭ：{6}<br>対象期間ＴＯ：{7}<br>連携スケジューラ区分：{8}<p>
	 */
	public static String MSLAL0907 = "MSLAL0907";

	/** LEVEL[I]<br>工程指図実績送信ＩＦ処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<p>
	 */
	public static String MSLAL0908 = "MSLAL0908";

	/** LEVEL[W]<br>指定された連携スケジューラ区分が無効です。<br>連携スケジューラ区分に「2：FLEXSCHE」を指定してください。<br>連携スケジューラ区分：{1}<p>
	 */
	public static String MSLAL0909 = "MSLAL0909";

	/** LEVEL[I]<br>処理を開始します。（スケジューラＩＦファイル連携サービス実行）<p>
	 */
	public static String MSLAL0910 = "MSLAL0910";

	/** LEVEL[W]<br>連携スケジューラ区分は「FLEXSCHE」を設定してください。<p>
	 */
	public static String MSLAL0911 = "MSLAL0911";

	/** LEVEL[W]<br>指定されたＩＦ処理区分は実行対象外です。<br>ＩＦ処理区分：{1}<p>
	 */
	public static String MSLAL0912 = "MSLAL0912";

	/** LEVEL[W]<br>リソースに連携対象のパスが登録されていません。<p>
	 */
	public static String MSLAL0913 = "MSLAL0913";

	/** LEVEL[W]<br>連携対象のパスが存在しません。<p>
	 */
	public static String MSLAL0914 = "MSLAL0914";

	/** LEVEL[W]<br>リソースに連携対象のファイルが登録されていません。<p>
	 */
	public static String MSLAL0915 = "MSLAL0915";

	/** LEVEL[W]<br>連携対象のファイルが存在しません。<p>
	 */
	public static String MSLAL0916 = "MSLAL0916";

	/** LEVEL[W]<br>ＩＦ通信ルールマスタにローカルディレクトリが設定されていません。<br>外部システムＣＤ：{1}<p>
	 */
	public static String MSLAL0917 = "MSLAL0917";

	/** LEVEL[I]<br>指定されたフォルダに以下のファイルが存在しないため、送信処理をスキップしました。<br>ファイル名：{1}<br>フォルダ：{2}<p>
	 */
	public static String MSLAL0918 = "MSLAL0918";

	/** LEVEL[I]<br>処理を終了しました。（スケジューラＩＦファイル連携サービス実行）<p>
	 */
	public static String MSLAL0919 = "MSLAL0919";

	/** LEVEL[I]<br>送信処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSLAL0920 = "MSLAL0920";

	/** LEVEL[I]<br>受信処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSLAL0921 = "MSLAL0921";

	/** LEVEL[W]<br>連携スケジューラ区分が「FLEXSCHE」、オーダ区分が「外注」かつ外注スケジューリング許可ＦＬＧがオフの場合は、各種日付情報は更新できません。<br>そのため、工程オーダ情報の「工程着手予定日時」または品目オーダ情報の「使用可能予定日」が、取込前後で変更されるデータは取り込めません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部品目オーダＮＯ：{4}<br>工程着手予定日時：{5}<br>使用可能予定日：{6}<p>
	 */
	public static String MSLAL0922 = "MSLAL0922";

	/** LEVEL[I]<br>オーダ引当送信ＩＦ処理を開始します。<br>外部システムＣＤ：{1}<br>ワーキンググループＣＤ：{2}<br>製造場所グループＣＤ：{3}<br>工場物流倉庫ＣＤ：{4}<br>製造場所ＣＤ：{5}<br>対象期間ＦＲＯＭ：{6}<br>対象期間ＴＯ：{7}<br>連携スケジューラ区分：{8}<p>
	 */
	public static String MSLAL0923 = "MSLAL0923";

	/** LEVEL[I]<br>オーダ引当送信ＩＦ処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<p>
	 */
	public static String MSLAL0924 = "MSLAL0924";

	/** LEVEL[I]<br>品目詳細ＢＯＭマスタ送信ＩＦ処理を開始します。<br>外部システムＣＤ：{1}<br>マスタ適用日：{2}<br>ワーキンググループＣＤ：{3}<br>製造場所グループＣＤ：{4}<br>工場物流倉庫ＣＤ：{5}<br>製造場所ＣＤ：{6}<br>連携スケジューラ区分：{7}<p>
	 */
	public static String MSLAL0925 = "MSLAL0925";

	/** LEVEL[I]<br>品目詳細BOMマスタ送信ＩＦ処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<p>
	 */
	public static String MSLAL0926 = "MSLAL0926";

	/** LEVEL[I]<br>実績数量送信ＩＦ処理を開始します。<br>外部システムＣＤ：{1}<br>ワーキンググループＣＤ：{2}<br>製造場所グループＣＤ：{3}<br>工場物流倉庫ＣＤ：{4}<br>製造場所ＣＤ：{5}<br>対象期間ＦＲＯＭ：{6}<br>対象期間ＴＯ：{7}<br>連携スケジューラ区分：{8}<p>
	 */
	public static String MSLAL0927 = "MSLAL0927";

	/** LEVEL[I]<br>実績数量送信ＩＦ処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<p>
	 */
	public static String MSLAL0928 = "MSLAL0928";

	/** LEVEL[W]<br>新規登録と同時に打切はできません。打切ＦＬＧをオフにして取り込んでください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<p>
	 */
	public static String MSLAL0929 = "MSLAL0929";

	/** LEVEL[W]<br>更新対象となる品目オーダ情報の品目と取込対象データの品目が一致していないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部品目オーダＮＯ：{4}<br>品目：{5}<p>
	 */
	public static String MSLAL0930 = "MSLAL0930";

	/** LEVEL[W]<br>同じ製造指図に紐づく異なるＩＦ処理区分または外部実績ＮＯのレコードでエラーが発生しました。<br>「MSLAL0095」または「MSLAL0096」のエラーが発生している他のレコードを確認してください。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<br>製造指図ＮＯ：{4}<p>
	 */
	public static String MSLAL0931 = "MSLAL0931";

	/** LEVEL[W]<br>同じ製造指図に紐づく工程実績の取込処理でエラーが発生しました。エラーが発生している工程実績のレコードを確認してください。<br>ＩＦ処理区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<br>製造指図ＮＯ：{4}<p>
	 */
	public static String MSLAL0932 = "MSLAL0932";

	/** LEVEL[W]<br>売上日における税が税マスタに存在しないため、取り込むことができません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>売上日における税ＣＤ：{3}<p>
	 */
	public static String MSLAL0933 = "MSLAL0933";

	/** LEVEL[W]<br>税チェック対象の場合、売上日における税と異なる税は指定できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>売上日における税ＣＤ：{3}<br>ＩＦデータの税率に対応する税ＣＤ：{4}<p>
	 */
	public static String MSLAL0934 = "MSLAL0934";

	/** LEVEL[I]<br>検査実績受信ＩＦ取込処理を開始します。<p>
	 */
	public static String MSLAL1001 = "MSLAL1001";

	/** LEVEL[I]<br>検査実績受信ＩＦ取込処理が終了しました。<br>処理対象：{1}<br>登録件数：{2}<br>エラー件数：{3}<br>スキップ件数：{4}<p>
	 */
	public static String MSLAL1002 = "MSLAL1002";

	/** LEVEL[W]<br>データ更新区分が新規の場合、判定のみ取込ＦＬＧをオンにできないため、取り込めません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>検査ＮＯ：{3}<p>
	 */
	public static String MSLAL1003 = "MSLAL1003";

	/** LEVEL[W]<br>データ更新区分が更新または削除であり、かつ外部検査実績明細ＮＯまたは外部検査抜取実績ＮＯが指定されたレコードでは、判定のみ取込ＦＬＧをオンにできないため、取り込めません。<br>データ更新区分：{1}<br>データＮＯ：{2}<br>データ行ＮＯ：{3}<br>外部検査実績ＮＯ：{4}<br>外部検査実績明細ＮＯ：{5}<br>外部検査抜取実績ＮＯ：{6}<p>
	 */
	public static String MSLAL1004 = "MSLAL1004";

	/** LEVEL[W]<br>外部検査実績明細ＮＯと外部検査抜取実績ＮＯが両方指定されているため、取り込めません。いずれか片方の値のみを設定してください。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部検査実績明細ＮＯ：{3}<br>外部検査抜取実績ＮＯ：{4}<p>
	 */
	public static String MSLAL1005 = "MSLAL1005";

	/** LEVEL[W]<br>データ更新区分が新規であり、かつ外部検査実績明細ＮＯまたは外部検査抜取実績ＮＯが既に登録済みであるため、取り込めません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部検査実績明細ＮＯ：{4}<br>外部検査抜取実績ＮＯ：{5}<p>
	 */
	public static String MSLAL1006 = "MSLAL1006";

	/** LEVEL[W]<br>指定された外部検査実績ＮＯは既に登録済みであり、かつ外部検査実績明細ＮＯまたは外部検査抜取実績ＮＯがいずれも未指定のため、データ更新区分が新規のデータは、取り込めません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部検査実績ＮＯ：{4}<p>
	 */
	public static String MSLAL1007 = "MSLAL1007";

	/** LEVEL[W]<br>指定された外部システムＣＤおよび外部検査実績ＮＯに紐づく検査実績が取得できないため、取り込めません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部検査実績ＮＯ：{4}<p>
	 */
	public static String MSLAL1008 = "MSLAL1008";

	/** LEVEL[W]<br>指定された外部システムＣＤおよび外部検査実績明細ＮＯに紐づく検査実績明細が取得できないため、取り込めません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部検査実績明細ＮＯ：{4}<p>
	 */
	public static String MSLAL1009 = "MSLAL1009";

	/** LEVEL[W]<br>指定された外部システムＣＤおよび外部検査抜取実績ＮＯに紐づく検査抜取明細が取得できないため、取り込めません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部検査抜取実績ＮＯ：{4}<p>
	 */
	public static String MSLAL1010 = "MSLAL1010";

	/** LEVEL[W]<br>指定された検査ＮＯが、外部検査実績ＮＯから取得した検査ＮＯと一致しないため、取り込めません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>指定された検査ＮＯ：{3}<br>外部検査実績ＮＯ：{4}<br>取得した検査ＮＯ：{5}<p>
	 */
	public static String MSLAL1011 = "MSLAL1011";

	/** LEVEL[W]<br>指定された検査ＮＯが、外部検査実績明細ＮＯから取得した検査ＮＯと一致しないため、取り込めません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>指定された検査ＮＯ：{3}<br>外部検査実績明細ＮＯ:{4}<br>取得した検査ＮＯ：{5}<p>
	 */
	public static String MSLAL1012 = "MSLAL1012";

	/** LEVEL[W]<br>指定された検査ＮＯが、外部検査抜取実績ＮＯから取得した検査ＮＯと一致しないため、取り込めません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>指定された検査ＮＯ：{3}<br>外部検査抜取実績ＮＯ：{4}<br>取得した検査ＮＯ：{5}<p>
	 */
	public static String MSLAL1013 = "MSLAL1013";

	/** LEVEL[W]<br>指定された外部検査実績ＮＯから取得した検査実績のヘッダ項目が、ＩＦレコードのヘッダ項目の値と一致しないため、取り込めません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部検査実績ＮＯ：{3}<p>
	 */
	public static String MSLAL1014 = "MSLAL1014";

	/** LEVEL[W]<br>指定された検査ＮＯから取得した検査指図の検査方法区分が、外部検査実績明細ＮＯまたは外部検査抜取実績ＮＯの組み合わせと一致しないため、取り込めません。検査方法区分に沿ったいずれかの項目のみを指定してください。<br>全数検査の場合：外部検査実績明細ＮＯ、全数検査以外の場合：外部検査抜取実績ＮＯを指定する必要があります。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>検査ＮＯ：{3}<br>検査方法区分：{4}<br>外部検査実績明細ＮＯ：{5}<br>外部検査抜取実績ＮＯ：{6}<p>
	 */
	public static String MSLAL1015 = "MSLAL1015";

	/** LEVEL[W]<br>同じ検査ＮＯにおいて先に処理したデータでエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>検査ＮＯ：{3}<p>
	 */
	public static String MSLAL1016 = "MSLAL1016";

	/** LEVEL[W]<br>同じ検査ＮＯにおいて、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>検査ＮＯ：{3}<p>
	 */
	public static String MSLAL1017 = "MSLAL1017";

	/** LEVEL[W]<br>検査実績が未完了のため、判定を登録できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>検査ＮＯ：{3}<p>
	 */
	public static String MSLAL1018 = "MSLAL1018";

	/** LEVEL[W]<br>以下の情報から、対応する現状在庫の情報を取得できないため、取り込めません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>検査予定ＮＯ：{3}<br>在庫場所ＣＤ：{4}<br>在庫棚・ラインＣＤ：{5}<br>荷姿単位ＣＤ：{6}<br>基準単位ＣＤ：{7}<p>
	 */
	public static String MSLAL1019 = "MSLAL1019";

	/** LEVEL[W]<br>同じ外部システムＣＤ、データＮＯ、データ更新区分、検査ＮＯにおいて、判定のみ取込ＦＬＧのオン・オフは混在させられないため、取り込めません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部システムデータＮＯ：{4}<br>データ更新区分：{5}<br>検査ＮＯ：{6}<p>
	 */
	public static String MSLAL1020 = "MSLAL1020";

	/** LEVEL[W]<br>同じ外部システムＣＤ、データＮＯ、データ更新区分、検査ＮＯにおいて、外部検査実績明細実績ＮＯまたは外部検査抜取実績ＮＯの指定あり・指定なしは混在させられないため、取り込めません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部システムデータＮＯ：{4}<br>データ更新区分：{5}<br>検査ＮＯ：{6}<p>
	 */
	public static String MSLAL1021 = "MSLAL1021";

	/** LEVEL[W]<br>検査実績受信ＩＦ取込処理でエラーが発生しました。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>メッセージＩＤ：{3}<br>メッセージ：{4}<p>
	 */
	public static String MSLAL1022 = "MSLAL1022";

	/** LEVEL[W]<br>検査ＮＯに紐づく検査予定の中に、指定された検査予定ＮＯが見つからないため、取り込めません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>検査ＮＯ：{3}<br>検査予定ＮＯ：{4}<p>
	 */
	public static String MSLAL1023 = "MSLAL1023";

	/** LEVEL[W]<br>検査承認担当者ではないため、判定を登録できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>判定者ＣＤ：{3}<p>
	 */
	public static String MSLAL1024 = "MSLAL1024";

	/** LEVEL[W]<br>検査承認機能が無効のため、判定を登録できません。<p>
	 */
	public static String MSLAL1025 = "MSLAL1025";

	/** LEVEL[W]<br>検査承認対象外のため、判定を登録できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>検査ＮＯ：{4}<p>
	 */
	public static String MSLAL1026 = "MSLAL1026";

	/** LEVEL[W]<br>同じ外部システムＣＤ、外部システムデータＮＯ、データ更新区分、外部検査実績ＮＯのなかで、ヘッダ項目値を混在させられないため、取り込めません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3} <br>外部システムデータＮＯ：{4} <br>データ更新区分：{5}<br>外部検査実績ＮＯ：{6}<p>
	 */
	public static String MSLAL1027 = "MSLAL1027";

	/** LEVEL[W]<br>同一取込単位内で、外部検査実績ＮＯが重複しているため、取り込めません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部システムデータＮＯ：{4}<br>データ更新区分：{5}<br>検査ＮＯ：{6}<br>外部検査実績ＮＯ：{7}<p>
	 */
	public static String MSLAL1028 = "MSLAL1028";

	/** LEVEL[W]<br>同一取込単位内で、外部検査実績明細ＮＯが重複しているため、取り込めません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部システムデータＮＯ：{4}<br>データ更新区分：{5}<br>検査ＮＯ：{6}<br>外部検査実績明細ＮＯ：{7}<p>
	 */
	public static String MSLAL1029 = "MSLAL1029";

	/** LEVEL[W]<br>同一取込単位内で、外部検査抜取実績ＮＯが重複しているため、取り込めません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>外部システムＣＤ：{3}<br>外部システムデータＮＯ：{4}<br>データ更新区分：{5}<br>検査ＮＯ：{6}<br>外部検査抜取実績ＮＯ：{7}<p>
	 */
	public static String MSLAL1030 = "MSLAL1030";

	/** LEVEL[W]<br>同じ検査ＮＯに対する他の検査実績の取り込み処理でエラーが発生したため、取り込みできませんでした。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>検査ＮＯ：{3}<p>
	 */
	public static String MSLAL1031 = "MSLAL1031";

	/** LEVEL[W]<br>移動が完了しているため、新規で移動実績を登録できません。<br>データＮＯ：{1}<br>データ行ＮＯ：{2}<br>移動指図ＮＯ：{3}<br>移動引当状況ＮＯ：{4}<p>
	 */
	public static String MSLAL1032 = "MSLAL1032";

	/** LEVEL[W]<br><p>
	 */
	public static String MSLBP0001 = "MSLBP0001";

	/** LEVEL[W]<br><p>
	 */
	public static String MSLBL0001 = "MSLBL0001";

	/** LEVEL[W]<br>ＩＦ処理区分のbi_opeの値が設定されていません。<br>ＩＦ処理区分：{1}<p>
	 */
	public static String MSLCB0001 = "MSLCB0001";

	/** LEVEL[W]<br>ＩＦ処理区分のbi_opeの値が不正です。<br>ＩＦ処理区分：{1}<p>
	 */
	public static String MSLCB0002 = "MSLCB0002";

	/** LEVEL[W]<br>指定されたＩＦ処理区分は存在しません。<br>ＩＦ処理区分：{1}<p>
	 */
	public static String MSLCB0003 = "MSLCB0003";

	/** LEVEL[W]<br>指定されたＩＦ処理区分は実行対象外です。<br>ＩＦ処理区分：{1}<p>
	 */
	public static String MSLCB0004 = "MSLCB0004";

	/** LEVEL[I]<br>ＢＩ Ｌｉｎｋバッチ処理を開始します。<br>ＩＦ処理区分：{1}<br>外部システムＣＤ：{2}<br>抽出年月日ＦＲＯＭ：{3}<br>抽出年月日ＴＯ：{4}<br>滞留比較日：{5}<br>滞留基準日数：{6}<br>会社ＣＤ：{7}<p>
	 */
	public static String MSLCB0005 = "MSLCB0005";

	/** LEVEL[I]<br>ＢＩ Ｌｉｎｋバッチ処理を終了しました。<p>
	 */
	public static String MSLCB0006 = "MSLCB0006";

	/** LEVEL[W]<br>ＩＦ処理区分が不正です。<br>ＩＦ処理区分：{1}<p>
	 */
	public static String MSLCL0001 = "MSLCL0001";

	/** LEVEL[I]<br>受払予定送信ＩＦ処理を開始します。<br>会社ＣＤ：{1}<br>ＩＦ処理区分：{2}<p>
	 */
	public static String MSLCL0002 = "MSLCL0002";

	/** LEVEL[I]<br>受払予定送信ＩＦ処理が終了しました。<br>会社ＣＤ：{1}<br>処理対象：{2}<br>新規件数：{3}<br>エラー件数：{4}<br>削除件数：{5}<p>
	 */
	public static String MSLCL0003 = "MSLCL0003";

	/** LEVEL[I]<br>月末在庫送信ＩＦ処理を開始します。<br>会社ＣＤ：{1}<br>ＩＦ処理区分：{2}<p>
	 */
	public static String MSLCL0004 = "MSLCL0004";

	/** LEVEL[I]<br>月末在庫送信ＩＦ処理が終了しました。<br>会社ＣＤ：{1}<br>処理対象：{2}<br>新規件数：{3}<br>エラー件数：{4}<p>
	 */
	public static String MSLCL0005 = "MSLCL0005";

	/** LEVEL[I]<br>受払実績送信ＩＦ処理を開始します。<br>会社ＣＤ：{1}<br>ＩＦ処理区分：{2}<p>
	 */
	public static String MSLCL0006 = "MSLCL0006";

	/** LEVEL[I]<br>受払実績送信ＩＦ処理が終了しました。<br>会社ＣＤ：{1}<br>処理対象：{2}<br>新規件数：{3}<br>エラー件数：{4}<p>
	 */
	public static String MSLCL0007 = "MSLCL0007";

	/** LEVEL[I]<br>品目オーダ情報送信ＩＦ処理を開始します。<br>会社ＣＤ：{1}<br>ＩＦ処理区分：{2}<p>
	 */
	public static String MSLCL0008 = "MSLCL0008";

	/** LEVEL[I]<br>品目オーダ情報送信ＩＦ処理が終了しました。<br>会社ＣＤ：{1}<br>処理対象：{2}<br>新規件数：{3}<br>エラー件数：{4}<br>削除件数：{5}<p>
	 */
	public static String MSLCL0009 = "MSLCL0009";

	/** LEVEL[I]<br>出荷進捗送信ＩＦ処理を開始します。<br>会社ＣＤ：{1}<br>ＩＦ処理区分：{2}<p>
	 */
	public static String MSLCL0010 = "MSLCL0010";

	/** LEVEL[I]<br>出荷進捗送信ＩＦ処理が終了しました。<br>会社ＣＤ：{1}<br>処理対象：{2}<br>新規件数：{3}<br>エラー件数：{4}<br>削除件数：{5}<p>
	 */
	public static String MSLCL0011 = "MSLCL0011";

	/** LEVEL[I]<br>滞留在庫情報送信ＩＦ処理を開始します。<br>会社ＣＤ：{1}<br>ＩＦ処理区分：{2}<p>
	 */
	public static String MSLCL0012 = "MSLCL0012";

	/** LEVEL[I]<br>滞留在庫情報送信ＩＦ処理が終了しました。<br>会社ＣＤ：{1}<br>処理対象：{2}<br>新規件数：{3}<br>エラー件数：{4}<p>
	 */
	public static String MSLCL0013 = "MSLCL0013";

	/** LEVEL[W]<br>バッチログＮＯ、ログサブキー１、ログサブキー２の設定に失敗したデータがあります。<br>送信確認画面でデータを確認してください。<p>
	 */
	public static String MSLCL0014 = "MSLCL0014";

	/** LEVEL[I]<br>受払予定送信ＩＦ処理を開始します。<p>
	 */
	public static String MSLCL0015 = "MSLCL0015";

	/** LEVEL[I]<br>受払予定送信ＩＦ処理が終了しました。<p>
	 */
	public static String MSLCL0016 = "MSLCL0016";

	/** LEVEL[I]<br>月末在庫送信ＩＦ処理を開始します。<p>
	 */
	public static String MSLCL0017 = "MSLCL0017";

	/** LEVEL[I]<br>月末在庫送信ＩＦ処理が終了しました。<p>
	 */
	public static String MSLCL0018 = "MSLCL0018";

	/** LEVEL[I]<br>受払実績送信ＩＦ処理を開始します。<p>
	 */
	public static String MSLCL0019 = "MSLCL0019";

	/** LEVEL[I]<br>受払実績送信ＩＦ処理が終了しました。<p>
	 */
	public static String MSLCL0020 = "MSLCL0020";

	/** LEVEL[I]<br>品目オーダ情報送信ＩＦ処理を開始します。<p>
	 */
	public static String MSLCL0021 = "MSLCL0021";

	/** LEVEL[I]<br>品目オーダ情報送信ＩＦ処理が終了しました。<p>
	 */
	public static String MSLCL0022 = "MSLCL0022";

	/** LEVEL[I]<br>出荷進捗送信ＩＦ処理を開始します。<p>
	 */
	public static String MSLCL0023 = "MSLCL0023";

	/** LEVEL[I]<br>出荷進捗送信ＩＦ処理が終了しました。<p>
	 */
	public static String MSLCL0024 = "MSLCL0024";

	/** LEVEL[I]<br>滞留在庫情報送信ＩＦ処理を開始します。<p>
	 */
	public static String MSLCL0025 = "MSLCL0025";

	/** LEVEL[I]<br>滞留在庫情報送信ＩＦ処理が終了しました。<p>
	 */
	public static String MSLCL0026 = "MSLCL0026";

	/** LEVEL[I]<br>入荷進捗送信ＩＦ処理を開始します。<br>会社ＣＤ：{1}<br>ＩＦ処理区分：{2}<p>
	 */
	public static String MSLCL0101 = "MSLCL0101";

	/** LEVEL[I]<br>入荷進捗送信ＩＦ処理が終了しました。<br>会社ＣＤ：{1}<br>処理対象：{2}<br>新規件数：{3}<br>エラー件数：{4}<br>削除件数：{5}<p>
	 */
	public static String MSLCL0102 = "MSLCL0102";

	/** LEVEL[I]<br>検査実績送信ＩＦ処理を開始します。<br>会社ＣＤ：{1}<br>ＩＦ処理区分：{2}<p>
	 */
	public static String MSLCL0103 = "MSLCL0103";

	/** LEVEL[I]<br>検査実績送信ＩＦ処理が終了しました。<br>会社ＣＤ：{1}<br>処理対象：{2}<br>新規件数：{3}<br>エラー件数：{4}<br>削除件数：{5}<p>
	 */
	public static String MSLCL0104 = "MSLCL0104";

	/** LEVEL[I]<br>入荷進捗送信ＩＦ処理を開始します。<p>
	 */
	public static String MSLCL0105 = "MSLCL0105";

	/** LEVEL[I]<br>入荷進捗送信ＩＦ処理が終了しました。<p>
	 */
	public static String MSLCL0106 = "MSLCL0106";

	/** LEVEL[I]<br>検査実績送信ＩＦ処理を開始します。<p>
	 */
	public static String MSLCL0107 = "MSLCL0107";

	/** LEVEL[I]<br>検査実績送信ＩＦ処理が終了しました。<p>
	 */
	public static String MSLCL0108 = "MSLCL0108";

	/** LEVEL[W]<br>品目詳細マスタに、適用日・品目・ワーキンググループ・製造場所に対応する構成パタンとして登録されていません。<br>適用日：{1}<br>品目：{2}<br>ワーキンググループＣＤ：{3}<br>製造場所ＣＤ：{4}<br>発注先ＣＤ：{5}<br>メーカＣＤ：{6}<br>依頼先場所ＣＤ：{7}<br>{8}<p>
	 */
	public static String MSUAL0006 = "MSUAL0006";

	/** LEVEL[W]<br>場所マスタに有効な発注先として登録されていません。<br>場所ＣＤ：{1}<br>{2}<p>
	 */
	public static String MSUAL0007 = "MSUAL0007";

	/** LEVEL[W]<br>品目工程マスタに、適用日・品目・工程パタン・工程ＣＤ・工程連番に対応する場所として登録されていません。<br>適用日：{1}<br>品目：{2}<br>工程パタン：{3}<br>工程ＣＤ：{4}<br>工程連番：{5}<br>{6}<p>
	 */
	public static String MSUAL0008 = "MSUAL0008";

	/** LEVEL[W]<br>モード指定メソッド（setSnoMode）を実装してください。<p>
	 */
	public static String MSUBP0001 = "MSUBP0001";

	/** LEVEL[W]<br>画面遷移可能な行が選択されていません。<p>
	 */
	public static String MSUBP0002 = "MSUBP0002";

	/** LEVEL[W]<br><p>
	 */
	public static String MSUBL0001 = "MSUBL0001";

	/** LEVEL[W]<br>期間は93日以内になるように指定してください。<p>
	 */
	public static String MSUCP0001 = "MSUCP0001";

	/** LEVEL[W]<br>期間は60ヶ月以内になるように指定してください。<p>
	 */
	public static String MSUCP0002 = "MSUCP0002";

	/** LEVEL[W]<br>買掛締年月が取得できませんでした。仕入締および支払締を行ってください。<p>
	 */
	public static String MSUCP0003 = "MSUCP0003";

	/** LEVEL[W]<br>売掛締年月が取得できませんでした。売上締および入金締を行ってください。<p>
	 */
	public static String MSUCP0004 = "MSUCP0004";

	/** LEVEL[W]<br>支払締年月が取得できませんでした。支払締を行ってください。<p>
	 */
	public static String MSUCP0005 = "MSUCP0005";

	/** LEVEL[W]<br>仕入締年月が取得できませんでした。仕入締を行ってください。<p>
	 */
	public static String MSUCP0006 = "MSUCP0006";

	/** LEVEL[W]<br>入金締年月が取得できませんでした。入金締を行ってください。<p>
	 */
	public static String MSUCP0007 = "MSUCP0007";

	/** LEVEL[W]<br>売上締年月が取得できませんでした。売上締を行ってください。<p>
	 */
	public static String MSUCP0008 = "MSUCP0008";

	/** LEVEL[W]<br>在庫締年月が取得できませんでした。在庫締を行ってください。<p>
	 */
	public static String MSUCP0009 = "MSUCP0009";

	/** LEVEL[W]<br>親品目を指定した場合は、ワーキンググループ、構成パタン、マスタ適用日も指定してください。<p>
	 */
	public static String MSUCP0010 = "MSUCP0010";

	/** LEVEL[W]<br>期間は3年以内になるように指定してください。<p>
	 */
	public static String MSUCP0101 = "MSUCP0101";

	/** LEVEL[W]<br>期間は498日以内になるように指定してください。<p>
	 */
	public static String MSUCP0102 = "MSUCP0102";

	/** LEVEL[W]<br>ログインユーザに対して、担当者権限マスタにおいて必要な権限が登録されていないため、処理できません。<br>{1}<p>
	 */
	public static String MSUCL0001 = "MSUCL0001";

	/** LEVEL[W]<br>買掛締年月が取得できませんでした。仕入締および支払締を行ってください。<p>
	 */
	public static String MSUCL0002 = "MSUCL0002";

	/** LEVEL[W]<br>売掛締年月が取得できませんでした。売上締および入金締を行ってください。<p>
	 */
	public static String MSUCL0003 = "MSUCL0003";

	/** LEVEL[W]<br>支払締年月が取得できませんでした。支払締を行ってください。<p>
	 */
	public static String MSUCL0004 = "MSUCL0004";

	/** LEVEL[W]<br>仕入締年月が取得できませんでした。仕入締を行ってください。<p>
	 */
	public static String MSUCL0005 = "MSUCL0005";

	/** LEVEL[W]<br>入金締年月が取得できませんでした。入金締を行ってください。<p>
	 */
	public static String MSUCL0006 = "MSUCL0006";

	/** LEVEL[W]<br>売上締年月が取得できませんでした。売上締を行ってください。<p>
	 */
	public static String MSUCL0007 = "MSUCL0007";

	/** LEVEL[W]<br>在庫締年月が取得できませんでした。在庫締を行ってください。<p>
	 */
	public static String MSUCL0008 = "MSUCL0008";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ１管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ１が必須です。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSUCL0009 = "MSUCL0009";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ２管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ２が必須です。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSUCL0010 = "MSUCL0010";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ３管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ３が必須です。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSUCL0011 = "MSUCL0011";

	/** LEVEL[W]<br>品目マスタの手配ＮＯ４管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ４が必須です。<br>品目：{1}<br>{2}<p>
	 */
	public static String MSUCL0012 = "MSUCL0012";

	/** LEVEL[W]<br>ヘッダ項目にエラーが存在します。エラーの内容は{1}行目を参照してください。<br>{2}<p>
	 */
	public static String MSUCL0020 = "MSUCL0020";

	/** LEVEL[W]<br>同一ヘッダに紐づく他の明細行にエラーが存在します。<br>他の明細の行番号：{1}<br>{2}<p>
	 */
	public static String MSUCL0021 = "MSUCL0021";
}
