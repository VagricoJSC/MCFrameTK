package mcframe.serverMSBF.MSBFL5210;

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
 * ブロック"Lot_Upd05_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Lot_Upd05_CndR_MC_A extends MCConstRow {

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public static final String $insp_typ = "insp_typ";
	/**
	 * Re-inspection for expiration flg. 期限再検査ＦＬＧ.<p>
	 *
	 */
	public static final String $lmt_up_flg = "lmt_up_flg";
	public static final String $lot_p = "lot_p";
	/**
	 * Lot inspection schedule flg. ロット検査予定ＦＬＧ.<p>
	 *
	 */
	public static final String $lot_insp_schd_flg = "lot_insp_schd_flg";
	/**
	 * Inspection order flg. 検査指図ＦＬＧ.<p>
	 *
	 */
	public static final String $insp_inst_flg = "insp_inst_flg";
	/**
	 * Inspection order approval flg. 検査指図承認ＦＬＧ.<p>
	 *
	 */
	public static final String $insp_inst_aprv_flg = "insp_inst_aprv_flg";
	/**
	 * Inspection result flg. 検査実績ＦＬＧ.<p>
	 *
	 */
	public static final String $insp_act_flg = "insp_act_flg";
	/**
	 * Inspection decision flg. 検査判定ＦＬＧ.<p>
	 *
	 */
	public static final String $insp_judg_flg = "insp_judg_flg";
	/**
	 * Factory release approval flg. 工場出荷承認ＦＬＧ.<p>
	 *
	 */
	public static final String $plnt_aprv_flg = "plnt_aprv_flg";
	/**
	 * Market release decision flg. 市場出荷判定ＦＬＧ.<p>
	 *
	 */
	public static final String $mrkt_judg_flg = "mrkt_judg_flg";
	/**
	 * Allow inspecting use flg. 検査中使用許可ＦＬＧ.<p>
	 *
	 */
	public static final String $in_prmt_insp_flg = "in_prmt_insp_flg";
	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public static final String $insp_bind_typ = "insp_bind_typ";

	public static final String $itm_cd = $lot_p + ".itm_cd";
	public static final String $itm_sub1 = $lot_p + ".itm_sub1";
	public static final String $itm_sub2 = $lot_p + ".itm_sub2";
	public static final String $itm_sub3 = $lot_p + ".itm_sub3";
	public static final String $lot_no = $lot_p + ".lot_no";
	public static final String $sublot_no = $lot_p + ".sublot_no";
	public static final String $stk_insp_typ = $lot_p + ".stk_insp_typ";
	public static final String $quality_typ = $lot_p + ".quality_typ";
	public static final String $plnt_aprv_sts_typ = $lot_p + ".plnt_aprv_sts_typ";
	public static final String $insp_aprv_sts_typ = $lot_p + ".insp_aprv_sts_typ";
	public static final String $mrkt_judg_sts_typ = $lot_p + ".mrkt_judg_sts_typ";

	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta insp_typ_META = createCommonMeta($insp_typ, mcframe.commonMS.meta.MS_META.INSP_TYP);
	public static final MCMeta lmt_up_flg_META = createCommonMeta($lmt_up_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_p_META = createInnerRowMeta($lot_p, mcframe.serverMS.dbc.MST_LOT_R.class);
	public static final MCMeta lot_insp_schd_flg_META = createCommonMeta($lot_insp_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_inst_flg_META = createCommonMeta($insp_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_inst_aprv_flg_META = createCommonMeta($insp_inst_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_act_flg_META = createCommonMeta($insp_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_judg_flg_META = createCommonMeta($insp_judg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta plnt_aprv_flg_META = createCommonMeta($plnt_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_flg_META = createCommonMeta($mrkt_judg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta in_prmt_insp_flg_META = createCommonMeta($in_prmt_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_bind_typ_META = createCommonMeta($insp_bind_typ, mcframe.commonMA.meta.MA_META.INSP_BIND_TYP);

	protected static final ConstMetaList<Lot_Upd05_CndR> constMetas = new ConstMetaList<Lot_Upd05_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			insp_no_META,
			insp_typ_META,
			lmt_up_flg_META,
			lot_p_META,
			lot_insp_schd_flg_META,
			insp_inst_flg_META,
			insp_inst_aprv_flg_META,
			insp_act_flg_META,
			insp_judg_flg_META,
			plnt_aprv_flg_META,
			mrkt_judg_flg_META,
			in_prmt_insp_flg_META,
			insp_bind_typ_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"lot_no",
				"sublot_no",
				"stk_insp_typ",
				"quality_typ",
				"plnt_aprv_sts_typ",
				"insp_aprv_sts_typ",
				"mrkt_judg_sts_typ"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$lot_no,
				$sublot_no,
				$stk_insp_typ,
				$quality_typ,
				$plnt_aprv_sts_typ,
				$insp_aprv_sts_typ,
				$mrkt_judg_sts_typ
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
	protected Lot_Upd05_CndR_MC_A(ConstMetaList<? extends Lot_Upd05_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Lot_Upd05_CndR clone() {
		return (Lot_Upd05_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Lot_Upd05_CndR createInstance() {
		return (Lot_Upd05_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Lot_Upd05_CndR getValues(String... names) {
		return (Lot_Upd05_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 0, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 0, $insp_no, value);
	}


	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public String insp_typ() {
		return getConstString(offset + 1, $insp_typ);
	}

	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public void insp_typ(String value) {
		setConstString(offset + 1, $insp_typ, value);
	}


	/**
	 * Re-inspection for expiration flg. 期限再検査ＦＬＧ.<p>
	 *
	 */
	public boolean lmt_up_flg() {
		return getConstBoolean(offset + 2, $lmt_up_flg);
	}

	/**
	 * Re-inspection for expiration flg. 期限再検査ＦＬＧ.<p>
	 *
	 */
	public void lmt_up_flg(boolean value) {
		setConstBoolean(offset + 2, $lmt_up_flg, value);
	}


	public mcframe.serverMS.dbc.MST_LOT_R lot_p(){
		return (mcframe.serverMS.dbc.MST_LOT_R) getConstInnerRow(offset + 3, $lot_p);
	}
	
	public void lot_p(mcframe.serverMS.dbc.MST_LOT_R row){
		setConstInnerRow(offset + 3, $lot_p, row);
	}


	/**
	 * Lot inspection schedule flg. ロット検査予定ＦＬＧ.<p>
	 *
	 */
	public boolean lot_insp_schd_flg() {
		return getConstBoolean(offset + 4, $lot_insp_schd_flg);
	}

	/**
	 * Lot inspection schedule flg. ロット検査予定ＦＬＧ.<p>
	 *
	 */
	public void lot_insp_schd_flg(boolean value) {
		setConstBoolean(offset + 4, $lot_insp_schd_flg, value);
	}


	/**
	 * Inspection order flg. 検査指図ＦＬＧ.<p>
	 *
	 */
	public boolean insp_inst_flg() {
		return getConstBoolean(offset + 5, $insp_inst_flg);
	}

	/**
	 * Inspection order flg. 検査指図ＦＬＧ.<p>
	 *
	 */
	public void insp_inst_flg(boolean value) {
		setConstBoolean(offset + 5, $insp_inst_flg, value);
	}


	/**
	 * Inspection order approval flg. 検査指図承認ＦＬＧ.<p>
	 *
	 */
	public boolean insp_inst_aprv_flg() {
		return getConstBoolean(offset + 6, $insp_inst_aprv_flg);
	}

	/**
	 * Inspection order approval flg. 検査指図承認ＦＬＧ.<p>
	 *
	 */
	public void insp_inst_aprv_flg(boolean value) {
		setConstBoolean(offset + 6, $insp_inst_aprv_flg, value);
	}


	/**
	 * Inspection result flg. 検査実績ＦＬＧ.<p>
	 *
	 */
	public boolean insp_act_flg() {
		return getConstBoolean(offset + 7, $insp_act_flg);
	}

	/**
	 * Inspection result flg. 検査実績ＦＬＧ.<p>
	 *
	 */
	public void insp_act_flg(boolean value) {
		setConstBoolean(offset + 7, $insp_act_flg, value);
	}


	/**
	 * Inspection decision flg. 検査判定ＦＬＧ.<p>
	 *
	 */
	public boolean insp_judg_flg() {
		return getConstBoolean(offset + 8, $insp_judg_flg);
	}

	/**
	 * Inspection decision flg. 検査判定ＦＬＧ.<p>
	 *
	 */
	public void insp_judg_flg(boolean value) {
		setConstBoolean(offset + 8, $insp_judg_flg, value);
	}


	/**
	 * Factory release approval flg. 工場出荷承認ＦＬＧ.<p>
	 *
	 */
	public boolean plnt_aprv_flg() {
		return getConstBoolean(offset + 9, $plnt_aprv_flg);
	}

	/**
	 * Factory release approval flg. 工場出荷承認ＦＬＧ.<p>
	 *
	 */
	public void plnt_aprv_flg(boolean value) {
		setConstBoolean(offset + 9, $plnt_aprv_flg, value);
	}


	/**
	 * Market release decision flg. 市場出荷判定ＦＬＧ.<p>
	 *
	 */
	public boolean mrkt_judg_flg() {
		return getConstBoolean(offset + 10, $mrkt_judg_flg);
	}

	/**
	 * Market release decision flg. 市場出荷判定ＦＬＧ.<p>
	 *
	 */
	public void mrkt_judg_flg(boolean value) {
		setConstBoolean(offset + 10, $mrkt_judg_flg, value);
	}


	/**
	 * Allow inspecting use flg. 検査中使用許可ＦＬＧ.<p>
	 *
	 */
	public boolean in_prmt_insp_flg() {
		return getConstBoolean(offset + 11, $in_prmt_insp_flg);
	}

	/**
	 * Allow inspecting use flg. 検査中使用許可ＦＬＧ.<p>
	 *
	 */
	public void in_prmt_insp_flg(boolean value) {
		setConstBoolean(offset + 11, $in_prmt_insp_flg, value);
	}


	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public String insp_bind_typ() {
		return getConstString(offset + 12, $insp_bind_typ);
	}

	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public void insp_bind_typ(String value) {
		setConstString(offset + 12, $insp_bind_typ, value);
	}


	public String getString(String name) {
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			return insp_bind_typ();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			return lmt_up_flg();
		}
		if ($lot_insp_schd_flg.equalsIgnoreCase(name)) {
			return lot_insp_schd_flg();
		}
		if ($insp_inst_flg.equalsIgnoreCase(name)) {
			return insp_inst_flg();
		}
		if ($insp_inst_aprv_flg.equalsIgnoreCase(name)) {
			return insp_inst_aprv_flg();
		}
		if ($insp_act_flg.equalsIgnoreCase(name)) {
			return insp_act_flg();
		}
		if ($insp_judg_flg.equalsIgnoreCase(name)) {
			return insp_judg_flg();
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_flg();
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			return insp_bind_typ();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			return lmt_up_flg();
		}
		if ($lot_insp_schd_flg.equalsIgnoreCase(name)) {
			return lot_insp_schd_flg();
		}
		if ($insp_inst_flg.equalsIgnoreCase(name)) {
			return insp_inst_flg();
		}
		if ($insp_inst_aprv_flg.equalsIgnoreCase(name)) {
			return insp_inst_aprv_flg();
		}
		if ($insp_act_flg.equalsIgnoreCase(name)) {
			return insp_act_flg();
		}
		if ($insp_judg_flg.equalsIgnoreCase(name)) {
			return insp_judg_flg();
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_flg();
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			insp_bind_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			lmt_up_flg(value);
			return;
		}
		if ($lot_insp_schd_flg.equalsIgnoreCase(name)) {
			lot_insp_schd_flg(value);
			return;
		}
		if ($insp_inst_flg.equalsIgnoreCase(name)) {
			insp_inst_flg(value);
			return;
		}
		if ($insp_inst_aprv_flg.equalsIgnoreCase(name)) {
			insp_inst_aprv_flg(value);
			return;
		}
		if ($insp_act_flg.equalsIgnoreCase(name)) {
			insp_act_flg(value);
			return;
		}
		if ($insp_judg_flg.equalsIgnoreCase(name)) {
			insp_judg_flg(value);
			return;
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			plnt_aprv_flg(value);
			return;
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			mrkt_judg_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			insp_bind_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			lmt_up_flg(value);
			return;
		}
		if ($lot_insp_schd_flg.equalsIgnoreCase(name)) {
			lot_insp_schd_flg(value);
			return;
		}
		if ($insp_inst_flg.equalsIgnoreCase(name)) {
			insp_inst_flg(value);
			return;
		}
		if ($insp_inst_aprv_flg.equalsIgnoreCase(name)) {
			insp_inst_aprv_flg(value);
			return;
		}
		if ($insp_act_flg.equalsIgnoreCase(name)) {
			insp_act_flg(value);
			return;
		}
		if ($insp_judg_flg.equalsIgnoreCase(name)) {
			insp_judg_flg(value);
			return;
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			plnt_aprv_flg(value);
			return;
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			mrkt_judg_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($lot_p.equalsIgnoreCase(name)) {
			return lot_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($lot_p.equalsIgnoreCase(name)) {
			lot_p(
				((MCContainerMeta) lot_p_META).castInnerRow(mcframe.serverMS.dbc.MST_LOT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return lot_p().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		lot_p().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return lot_p().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		lot_p().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return lot_p().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		lot_p().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return lot_p().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		lot_p().itm_sub3(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return lot_p().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		lot_p().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return lot_p().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		lot_p().sublot_no(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return lot_p().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		lot_p().stk_insp_typ(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return lot_p().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		lot_p().quality_typ(value);
	}

	/**
	 * Factory release approval type 工場出荷承認区分.<p>
	 *
	 */
	public String plnt_aprv_sts_typ() {
		return lot_p().plnt_aprv_sts_typ();
	}

	/**
	 * Factory release approval type 工場出荷承認区分.<p>
	 *
	 */
	public void plnt_aprv_sts_typ(String value) {
		lot_p().plnt_aprv_sts_typ(value);
	}

	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public String insp_aprv_sts_typ() {
		return lot_p().insp_aprv_sts_typ();
	}

	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public void insp_aprv_sts_typ(String value) {
		lot_p().insp_aprv_sts_typ(value);
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public String mrkt_judg_sts_typ() {
		return lot_p().mrkt_judg_sts_typ();
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public void mrkt_judg_sts_typ(String value) {
		lot_p().mrkt_judg_sts_typ(value);
	}

}

