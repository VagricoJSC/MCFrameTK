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
 * ブロック"Lot_Upd04_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Lot_Upd04_CndR_MC_A extends MCConstRow {

	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public static final String $insp_typ = "insp_typ";
	/**
	 * Expiration date update flg. 有効期限更新ＦＬＧ.<p>
	 *
	 */
	public static final String $vld_dt_flg = "vld_dt_flg";
	public static final String $lot_p = "lot_p";

	public static final String $itm_cd = $lot_p + ".itm_cd";
	public static final String $itm_sub1 = $lot_p + ".itm_sub1";
	public static final String $itm_sub2 = $lot_p + ".itm_sub2";
	public static final String $itm_sub3 = $lot_p + ".itm_sub3";
	public static final String $lot_no = $lot_p + ".lot_no";
	public static final String $sublot_no = $lot_p + ".sublot_no";
	public static final String $vld_dt = $lot_p + ".vld_dt";
	public static final String $lmt_dt = $lot_p + ".lmt_dt";
	public static final String $lmt_dt_frm_typ = $lot_p + ".lmt_dt_frm_typ";
	public static final String $lmt_dt_frm = $lot_p + ".lmt_dt_frm";
	public static final String $act_cont_fctr = $lot_p + ".act_cont_fctr";
	public static final String $base_gr_dt = $lot_p + ".base_gr_dt";

	public static final MCMeta insp_typ_META = createCommonMeta($insp_typ, mcframe.commonMS.meta.MS_META.INSP_TYP);
	public static final MCMeta vld_dt_flg_META = createCommonMeta($vld_dt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_p_META = createInnerRowMeta($lot_p, mcframe.serverMS.dbc.MST_LOT_R.class);

	protected static final ConstMetaList<Lot_Upd04_CndR> constMetas = new ConstMetaList<Lot_Upd04_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			insp_typ_META,
			vld_dt_flg_META,
			lot_p_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"lot_no",
				"sublot_no",
				"vld_dt",
				"lmt_dt",
				"lmt_dt_frm_typ",
				"lmt_dt_frm",
				"act_cont_fctr",
				"base_gr_dt"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$lot_no,
				$sublot_no,
				$vld_dt,
				$lmt_dt,
				$lmt_dt_frm_typ,
				$lmt_dt_frm,
				$act_cont_fctr,
				$base_gr_dt
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
	protected Lot_Upd04_CndR_MC_A(ConstMetaList<? extends Lot_Upd04_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Lot_Upd04_CndR clone() {
		return (Lot_Upd04_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Lot_Upd04_CndR createInstance() {
		return (Lot_Upd04_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Lot_Upd04_CndR getValues(String... names) {
		return (Lot_Upd04_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public String insp_typ() {
		return getConstString(offset + 0, $insp_typ);
	}

	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public void insp_typ(String value) {
		setConstString(offset + 0, $insp_typ, value);
	}


	/**
	 * Expiration date update flg. 有効期限更新ＦＬＧ.<p>
	 *
	 */
	public boolean vld_dt_flg() {
		return getConstBoolean(offset + 1, $vld_dt_flg);
	}

	/**
	 * Expiration date update flg. 有効期限更新ＦＬＧ.<p>
	 *
	 */
	public void vld_dt_flg(boolean value) {
		setConstBoolean(offset + 1, $vld_dt_flg, value);
	}


	public mcframe.serverMS.dbc.MST_LOT_R lot_p(){
		return (mcframe.serverMS.dbc.MST_LOT_R) getConstInnerRow(offset + 2, $lot_p);
	}
	
	public void lot_p(mcframe.serverMS.dbc.MST_LOT_R row){
		setConstInnerRow(offset + 2, $lot_p, row);
	}


	public String getString(String name) {
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($vld_dt_flg.equalsIgnoreCase(name)) {
			return vld_dt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($vld_dt_flg.equalsIgnoreCase(name)) {
			return vld_dt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($vld_dt_flg.equalsIgnoreCase(name)) {
			vld_dt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($vld_dt_flg.equalsIgnoreCase(name)) {
			vld_dt_flg(value);
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
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return lot_p().vld_dt();
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		lot_p().vld_dt(value);
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return lot_p().lmt_dt();
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		lot_p().lmt_dt(value);
	}

	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public String lmt_dt_frm_typ() {
		return lot_p().lmt_dt_frm_typ();
	}

	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public void lmt_dt_frm_typ(String value) {
		lot_p().lmt_dt_frm_typ(value);
	}

	/**
	 * Base date 起算日.<p>
	 *
	 */
	public MCDate lmt_dt_frm() {
		return lot_p().lmt_dt_frm();
	}

	/**
	 * Base date 起算日.<p>
	 *
	 */
	public void lmt_dt_frm(MCDate value) {
		lot_p().lmt_dt_frm(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return lot_p().act_cont_fctr();
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		lot_p().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		lot_p().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		lot_p().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		lot_p().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		lot_p().act_cont_fctr(value);
	}

	/**
	 * Base GR date and time 基準入庫日時.<p>
	 *
	 */
	public MCDate base_gr_dt() {
		return lot_p().base_gr_dt();
	}

	/**
	 * Base GR date and time 基準入庫日時.<p>
	 *
	 */
	public void base_gr_dt(MCDate value) {
		lot_p().base_gr_dt(value);
	}

}

