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
 * ブロック"OrdSendIf_Oper_InstAct_Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class OrdSendIf_Oper_InstAct_Srch01_RsltR_MC_A extends MCConstRow {

	public static final String $ope_act = "ope_act";

	public static final String $ext_itm_ord_no = $ope_act + ".ext_itm_ord_no";
	public static final String $ext_oper_ord_no = $ope_act + ".ext_oper_ord_no";
	public static final String $wg_cd = $ope_act + ".wg_cd";
	public static final String $itm_ord_no = $ope_act + ".itm_ord_no";
	public static final String $oper_ord_no = $ope_act + ".oper_ord_no";
	public static final String $itm_mfg_inst_no = $ope_act + ".itm_mfg_inst_no";
	public static final String $itm_ord_sts_typ = $ope_act + ".itm_ord_sts_typ";
	public static final String $oper_ord_sts_typ = $ope_act + ".oper_ord_sts_typ";
	public static final String $mfg_st_schd_dt = $ope_act + ".mfg_st_schd_dt";
	public static final String $mfg_end_schd_dt = $ope_act + ".mfg_end_schd_dt";
	public static final String $st_schd_tm = $ope_act + ".st_schd_tm";
	public static final String $end_schd_tm = $ope_act + ".end_schd_tm";
	public static final String $oper_schd_qty = $ope_act + ".oper_schd_qty";
	public static final String $oper_inst_schd_qty = $ope_act + ".oper_inst_schd_qty";
	public static final String $oper_act_qty = $ope_act + ".oper_act_qty";
	public static final String $base_unit_cd = $ope_act + ".base_unit_cd";
	public static final String $base_unit_nm = $ope_act + ".base_unit_nm";
	public static final String $inst_st_schd_tm = $ope_act + ".inst_st_schd_tm";
	public static final String $inst_end_schd_tm = $ope_act + ".inst_end_schd_tm";
	public static final String $act_st_tm = $ope_act + ".act_st_tm";
	public static final String $act_end_tm = $ope_act + ".act_end_tm";

	public static final MCMeta ope_act_META = createInnerRowMeta($ope_act, mcframe.serverMS.dbc.MST_ORDSND_OPE_ACT_IF_R.class);

	protected static final ConstMetaList<OrdSendIf_Oper_InstAct_Srch01_RsltR> constMetas = new ConstMetaList<OrdSendIf_Oper_InstAct_Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_act_META
		},
		new String[][]{
			{
				"ext_itm_ord_no",
				"ext_oper_ord_no",
				"wg_cd",
				"itm_ord_no",
				"oper_ord_no",
				"itm_mfg_inst_no",
				"itm_ord_sts_typ",
				"oper_ord_sts_typ",
				"mfg_st_schd_dt",
				"mfg_end_schd_dt",
				"st_schd_tm",
				"end_schd_tm",
				"oper_schd_qty",
				"oper_inst_schd_qty",
				"oper_act_qty",
				"base_unit_cd",
				"base_unit_nm",
				"inst_st_schd_tm",
				"inst_end_schd_tm",
				"act_st_tm",
				"act_end_tm"
			},
			{
				$ext_itm_ord_no,
				$ext_oper_ord_no,
				$wg_cd,
				$itm_ord_no,
				$oper_ord_no,
				$itm_mfg_inst_no,
				$itm_ord_sts_typ,
				$oper_ord_sts_typ,
				$mfg_st_schd_dt,
				$mfg_end_schd_dt,
				$st_schd_tm,
				$end_schd_tm,
				$oper_schd_qty,
				$oper_inst_schd_qty,
				$oper_act_qty,
				$base_unit_cd,
				$base_unit_nm,
				$inst_st_schd_tm,
				$inst_end_schd_tm,
				$act_st_tm,
				$act_end_tm
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
	protected OrdSendIf_Oper_InstAct_Srch01_RsltR_MC_A(ConstMetaList<? extends OrdSendIf_Oper_InstAct_Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdSendIf_Oper_InstAct_Srch01_RsltR clone() {
		return (OrdSendIf_Oper_InstAct_Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdSendIf_Oper_InstAct_Srch01_RsltR createInstance() {
		return (OrdSendIf_Oper_InstAct_Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdSendIf_Oper_InstAct_Srch01_RsltR getValues(String... names) {
		return (OrdSendIf_Oper_InstAct_Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_ORDSND_OPE_ACT_IF_R ope_act(){
		return (mcframe.serverMS.dbc.MST_ORDSND_OPE_ACT_IF_R) getConstInnerRow(offset + 0, $ope_act);
	}
	
	public void ope_act(mcframe.serverMS.dbc.MST_ORDSND_OPE_ACT_IF_R row){
		setConstInnerRow(offset + 0, $ope_act, row);
	}






	public MCRow getInnerRow(String name) {
		if ($ope_act.equalsIgnoreCase(name)) {
			return ope_act();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ope_act.equalsIgnoreCase(name)) {
			ope_act(
				((MCContainerMeta) ope_act_META).castInnerRow(mcframe.serverMS.dbc.MST_ORDSND_OPE_ACT_IF_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public String ext_itm_ord_no() {
		return ope_act().ext_itm_ord_no();
	}

	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public void ext_itm_ord_no(String value) {
		ope_act().ext_itm_ord_no(value);
	}

	/**
	 * External operation order No. 外部工程オーダＮＯ.<p>
	 *
	 */
	public String ext_oper_ord_no() {
		return ope_act().ext_oper_ord_no();
	}

	/**
	 * External operation order No. 外部工程オーダＮＯ.<p>
	 *
	 */
	public void ext_oper_ord_no(String value) {
		ope_act().ext_oper_ord_no(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return ope_act().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		ope_act().wg_cd(value);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return ope_act().itm_ord_no();
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		ope_act().itm_ord_no(value);
	}

	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public String oper_ord_no() {
		return ope_act().oper_ord_no();
	}

	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public void oper_ord_no(String value) {
		ope_act().oper_ord_no(value);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return ope_act().itm_mfg_inst_no();
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		ope_act().itm_mfg_inst_no(value);
	}

	/**
	 * Item order status type 品目オーダ状況区分.<p>
	 *
	 */
	public String itm_ord_sts_typ() {
		return ope_act().itm_ord_sts_typ();
	}

	/**
	 * Item order status type 品目オーダ状況区分.<p>
	 *
	 */
	public void itm_ord_sts_typ(String value) {
		ope_act().itm_ord_sts_typ(value);
	}

	/**
	 * Operation order status type 工程オーダ状況区分.<p>
	 *
	 */
	public String oper_ord_sts_typ() {
		return ope_act().oper_ord_sts_typ();
	}

	/**
	 * Operation order status type 工程オーダ状況区分.<p>
	 *
	 */
	public void oper_ord_sts_typ(String value) {
		ope_act().oper_ord_sts_typ(value);
	}

	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt() {
		return ope_act().mfg_st_schd_dt();
	}

	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public void mfg_st_schd_dt(MCDate value) {
		ope_act().mfg_st_schd_dt(value);
	}

	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public MCDate mfg_end_schd_dt() {
		return ope_act().mfg_end_schd_dt();
	}

	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public void mfg_end_schd_dt(MCDate value) {
		ope_act().mfg_end_schd_dt(value);
	}

	/**
	 * Scheduled operation start date and time 工程着手予定日時.<p>
	 *
	 */
	public MCDate st_schd_tm() {
		return ope_act().st_schd_tm();
	}

	/**
	 * Scheduled operation start date and time 工程着手予定日時.<p>
	 *
	 */
	public void st_schd_tm(MCDate value) {
		ope_act().st_schd_tm(value);
	}

	/**
	 * Scheduled operation end date and time 工程終了予定日時.<p>
	 *
	 */
	public MCDate end_schd_tm() {
		return ope_act().end_schd_tm();
	}

	/**
	 * Scheduled operation end date and time 工程終了予定日時.<p>
	 *
	 */
	public void end_schd_tm(MCDate value) {
		ope_act().end_schd_tm(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public MCNumber oper_schd_qty() {
		return ope_act().oper_schd_qty();
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(MCNumber value) {
		ope_act().oper_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(int value) {
		ope_act().oper_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(long value) {
		ope_act().oper_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(float value) {
		ope_act().oper_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(double value) {
		ope_act().oper_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. (order) 工程指図予定数量（指図）.<p>
	 *
	 */
	public MCNumber oper_inst_schd_qty() {
		return ope_act().oper_inst_schd_qty();
	}

	/**
	 * Operation order scheduled qty. (order) 工程指図予定数量（指図）.<p>
	 *
	 */
	public void oper_inst_schd_qty(MCNumber value) {
		ope_act().oper_inst_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. (order) 工程指図予定数量（指図）.<p>
	 *
	 */
	public void oper_inst_schd_qty(int value) {
		ope_act().oper_inst_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. (order) 工程指図予定数量（指図）.<p>
	 *
	 */
	public void oper_inst_schd_qty(long value) {
		ope_act().oper_inst_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. (order) 工程指図予定数量（指図）.<p>
	 *
	 */
	public void oper_inst_schd_qty(float value) {
		ope_act().oper_inst_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. (order) 工程指図予定数量（指図）.<p>
	 *
	 */
	public void oper_inst_schd_qty(double value) {
		ope_act().oper_inst_schd_qty(value);
	}

	/**
	 * Operation result qty. 工程実績数量.<p>
	 *
	 */
	public MCNumber oper_act_qty() {
		return ope_act().oper_act_qty();
	}

	/**
	 * Operation result qty. 工程実績数量.<p>
	 *
	 */
	public void oper_act_qty(MCNumber value) {
		ope_act().oper_act_qty(value);
	}

	/**
	 * Operation result qty. 工程実績数量.<p>
	 *
	 */
	public void oper_act_qty(int value) {
		ope_act().oper_act_qty(value);
	}

	/**
	 * Operation result qty. 工程実績数量.<p>
	 *
	 */
	public void oper_act_qty(long value) {
		ope_act().oper_act_qty(value);
	}

	/**
	 * Operation result qty. 工程実績数量.<p>
	 *
	 */
	public void oper_act_qty(float value) {
		ope_act().oper_act_qty(value);
	}

	/**
	 * Operation result qty. 工程実績数量.<p>
	 *
	 */
	public void oper_act_qty(double value) {
		ope_act().oper_act_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return ope_act().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		ope_act().base_unit_cd(value);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return ope_act().base_unit_nm();
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		ope_act().base_unit_nm(value);
	}

	/**
	 * Earliest scheduled operation start date and time (Order) 最早工程着手予定日時（指図）.<p>
	 *
	 */
	public MCDate inst_st_schd_tm() {
		return ope_act().inst_st_schd_tm();
	}

	/**
	 * Earliest scheduled operation start date and time (Order) 最早工程着手予定日時（指図）.<p>
	 *
	 */
	public void inst_st_schd_tm(MCDate value) {
		ope_act().inst_st_schd_tm(value);
	}

	/**
	 * Latest scheduled operation end date and time (Order) 最遅工程終了予定日時（指図）.<p>
	 *
	 */
	public MCDate inst_end_schd_tm() {
		return ope_act().inst_end_schd_tm();
	}

	/**
	 * Latest scheduled operation end date and time (Order) 最遅工程終了予定日時（指図）.<p>
	 *
	 */
	public void inst_end_schd_tm(MCDate value) {
		ope_act().inst_end_schd_tm(value);
	}

	/**
	 * Actual earliest operation start date and time 最早工程着手実績日時.<p>
	 *
	 */
	public MCDate act_st_tm() {
		return ope_act().act_st_tm();
	}

	/**
	 * Actual earliest operation start date and time 最早工程着手実績日時.<p>
	 *
	 */
	public void act_st_tm(MCDate value) {
		ope_act().act_st_tm(value);
	}

	/**
	 * Actual latest operation end date and time 最遅工程終了実績日時.<p>
	 *
	 */
	public MCDate act_end_tm() {
		return ope_act().act_end_tm();
	}

	/**
	 * Actual latest operation end date and time 最遅工程終了実績日時.<p>
	 *
	 */
	public void act_end_tm(MCDate value) {
		ope_act().act_end_tm(value);
	}

}

