package mcframe.serverMSLA.MSLAL9310;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"OrdSendIf_Ord_Lnk_Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class OrdSendIf_Ord_Lnk_Srch01_RsltR_MC_A extends MCConstRow {

	public static final String $ord_lnk = "ord_lnk";

	public static final String $wg_cd = $ord_lnk + ".wg_cd";
	public static final String $itm_ord_typ = $ord_lnk + ".itm_ord_typ";
	public static final String $itm_ord_no = $ord_lnk + ".itm_ord_no";
	public static final String $par_itm_ord_no = $ord_lnk + ".par_itm_ord_no";
	public static final String $par_oper_ord_no = $ord_lnk + ".par_oper_ord_no";
	public static final String $oper_ptn = $ord_lnk + ".oper_ptn";
	public static final String $oper_cd = $ord_lnk + ".oper_cd";
	public static final String $oper_seq = $ord_lnk + ".oper_seq";
	public static final String $itm_cd = $ord_lnk + ".itm_cd";
	public static final String $itm_sub1 = $ord_lnk + ".itm_sub1";
	public static final String $itm_sub2 = $ord_lnk + ".itm_sub2";
	public static final String $itm_sub3 = $ord_lnk + ".itm_sub3";
	public static final String $cal_cd = $ord_lnk + ".cal_cd";
	public static final String $xfr_lt = $ord_lnk + ".xfr_lt";
	public static final String $insp_offst = $ord_lnk + ".insp_offst";
	public static final String $insp_lt = $ord_lnk + ".insp_lt";
	public static final String $accpt_insp_lt = $ord_lnk + ".accpt_insp_lt";

	public static final MCMeta ord_lnk_META = createInnerRowMeta($ord_lnk, mcframe.serverMS.dbc.MST_ORDSND_ORD_LNK_IF_R.class);

	protected static final ConstMetaList<OrdSendIf_Ord_Lnk_Srch01_RsltR> constMetas = new ConstMetaList<OrdSendIf_Ord_Lnk_Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ord_lnk_META
		},
		new String[][]{
			{
				"wg_cd",
				"itm_ord_typ",
				"itm_ord_no",
				"par_itm_ord_no",
				"par_oper_ord_no",
				"oper_ptn",
				"oper_cd",
				"oper_seq",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"cal_cd",
				"xfr_lt",
				"insp_offst",
				"insp_lt",
				"accpt_insp_lt"
			},
			{
				$wg_cd,
				$itm_ord_typ,
				$itm_ord_no,
				$par_itm_ord_no,
				$par_oper_ord_no,
				$oper_ptn,
				$oper_cd,
				$oper_seq,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$cal_cd,
				$xfr_lt,
				$insp_offst,
				$insp_lt,
				$accpt_insp_lt
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected OrdSendIf_Ord_Lnk_Srch01_RsltR_MC_A(ConstMetaList<? extends OrdSendIf_Ord_Lnk_Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdSendIf_Ord_Lnk_Srch01_RsltR clone() {
		return (OrdSendIf_Ord_Lnk_Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdSendIf_Ord_Lnk_Srch01_RsltR createInstance() {
		return (OrdSendIf_Ord_Lnk_Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdSendIf_Ord_Lnk_Srch01_RsltR getValues(String... names) {
		return (OrdSendIf_Ord_Lnk_Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_ORDSND_ORD_LNK_IF_R ord_lnk(){
		return (mcframe.serverMS.dbc.MST_ORDSND_ORD_LNK_IF_R) getConstInnerRow(offset + 0, $ord_lnk);
	}
	
	public void ord_lnk(mcframe.serverMS.dbc.MST_ORDSND_ORD_LNK_IF_R row){
		setConstInnerRow(offset + 0, $ord_lnk, row);
	}






	public MCRow getInnerRow(String name) {
		if ($ord_lnk.equalsIgnoreCase(name)) {
			return ord_lnk();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ord_lnk.equalsIgnoreCase(name)) {
			ord_lnk(
				((MCContainerMeta) ord_lnk_META).castInnerRow(mcframe.serverMS.dbc.MST_ORDSND_ORD_LNK_IF_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return ord_lnk().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		ord_lnk().wg_cd(value);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_typ() {
		return ord_lnk().itm_ord_typ();
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_typ(String value) {
		ord_lnk().itm_ord_typ(value);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return ord_lnk().itm_ord_no();
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		ord_lnk().itm_ord_no(value);
	}

	/**
	 * Parent item order No. 親品目オーダＮＯ.<p>
	 *
	 */
	public String par_itm_ord_no() {
		return ord_lnk().par_itm_ord_no();
	}

	/**
	 * Parent item order No. 親品目オーダＮＯ.<p>
	 *
	 */
	public void par_itm_ord_no(String value) {
		ord_lnk().par_itm_ord_no(value);
	}

	/**
	 * Parent operation order No. 親工程オーダＮＯ.<p>
	 *
	 */
	public String par_oper_ord_no() {
		return ord_lnk().par_oper_ord_no();
	}

	/**
	 * Parent operation order No. 親工程オーダＮＯ.<p>
	 *
	 */
	public void par_oper_ord_no(String value) {
		ord_lnk().par_oper_ord_no(value);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return ord_lnk().oper_ptn();
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		ord_lnk().oper_ptn(value);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return ord_lnk().oper_cd();
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		ord_lnk().oper_cd(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return ord_lnk().oper_seq();
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		ord_lnk().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		ord_lnk().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		ord_lnk().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		ord_lnk().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		ord_lnk().oper_seq(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return ord_lnk().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		ord_lnk().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return ord_lnk().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		ord_lnk().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return ord_lnk().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		ord_lnk().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return ord_lnk().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		ord_lnk().itm_sub3(value);
	}

	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public String cal_cd() {
		return ord_lnk().cal_cd();
	}

	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public void cal_cd(String value) {
		ord_lnk().cal_cd(value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public MCNumber xfr_lt() {
		return ord_lnk().xfr_lt();
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(MCNumber value) {
		ord_lnk().xfr_lt(value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(int value) {
		ord_lnk().xfr_lt(value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(long value) {
		ord_lnk().xfr_lt(value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(float value) {
		ord_lnk().xfr_lt(value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(double value) {
		ord_lnk().xfr_lt(value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public MCNumber insp_offst() {
		return ord_lnk().insp_offst();
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(MCNumber value) {
		ord_lnk().insp_offst(value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(int value) {
		ord_lnk().insp_offst(value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(long value) {
		ord_lnk().insp_offst(value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(float value) {
		ord_lnk().insp_offst(value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(double value) {
		ord_lnk().insp_offst(value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public MCNumber insp_lt() {
		return ord_lnk().insp_lt();
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(MCNumber value) {
		ord_lnk().insp_lt(value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(int value) {
		ord_lnk().insp_lt(value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(long value) {
		ord_lnk().insp_lt(value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(float value) {
		ord_lnk().insp_lt(value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(double value) {
		ord_lnk().insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public MCNumber accpt_insp_lt() {
		return ord_lnk().accpt_insp_lt();
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(MCNumber value) {
		ord_lnk().accpt_insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(int value) {
		ord_lnk().accpt_insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(long value) {
		ord_lnk().accpt_insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(float value) {
		ord_lnk().accpt_insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(double value) {
		ord_lnk().accpt_insp_lt(value);
	}

}

