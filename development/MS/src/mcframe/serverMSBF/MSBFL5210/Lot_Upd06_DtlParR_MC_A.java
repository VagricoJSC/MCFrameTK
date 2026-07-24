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
 * ブロック"Lot_Upd06_DtlPar"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Lot_Upd06_DtlParR_MC_A extends MCConstRow {

	/**
	 * Copy-from child item pegging No. 引継対象子品目紐付けＮＯ.<p>
	 *
	 */
	public static final String $chd_peg_no = "chd_peg_no";
	/**
	 * Storage location factory/distribution warehouse cd. 格納場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * GR date 入庫日.<p>
	 *
	 */
	public static final String $gr_dt = "gr_dt";
	public static final String $lot_p = "lot_p";
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public static final String $master_dt = "master_dt";
	/**
	 * Update flg. 更新ＦＬＧ.<p>
	 *
	 */
	public static final String $upd_flg = "upd_flg";

	public static final String $itm_cd = $lot_p + ".itm_cd";
	public static final String $itm_sub1 = $lot_p + ".itm_sub1";
	public static final String $itm_sub2 = $lot_p + ".itm_sub2";
	public static final String $itm_sub3 = $lot_p + ".itm_sub3";
	public static final String $lot_no = $lot_p + ".lot_no";
	public static final String $sublot_no = $lot_p + ".sublot_no";
	public static final String $vld_dt = $lot_p + ".vld_dt";
	public static final String $lmt_dt = $lot_p + ".lmt_dt";
	public static final String $unreg_lmt_flg = $lot_p + ".unreg_lmt_flg";
	public static final String $lmt_dt_frm = $lot_p + ".lmt_dt_frm";
	public static final String $lmt_dt_frm_typ = $lot_p + ".lmt_dt_frm_typ";

	public static final MCMeta chd_peg_no_META = createCommonMeta($chd_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gr_dt_META = createCommonMeta($gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_p_META = createInnerRowMeta($lot_p, mcframe.serverMS.dbc.MST_LOT_R.class);
	public static final MCMeta master_dt_META = createCommonMeta($master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta upd_flg_META = createCommonMeta($upd_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Lot_Upd06_DtlParR> constMetas = new ConstMetaList<Lot_Upd06_DtlParR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			chd_peg_no_META,
			site_cd_META,
			mfg_loc_cd_META,
			gr_dt_META,
			lot_p_META,
			master_dt_META,
			upd_flg_META
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
				"unreg_lmt_flg",
				"lmt_dt_frm",
				"lmt_dt_frm_typ"
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
				$unreg_lmt_flg,
				$lmt_dt_frm,
				$lmt_dt_frm_typ
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
	protected Lot_Upd06_DtlParR_MC_A(ConstMetaList<? extends Lot_Upd06_DtlParR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Lot_Upd06_DtlParR clone() {
		return (Lot_Upd06_DtlParR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Lot_Upd06_DtlParR createInstance() {
		return (Lot_Upd06_DtlParR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Lot_Upd06_DtlParR getValues(String... names) {
		return (Lot_Upd06_DtlParR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Copy-from child item pegging No. 引継対象子品目紐付けＮＯ.<p>
	 *
	 */
	public MCNumber chd_peg_no() {
		return getConstNumber(offset + 0, $chd_peg_no);
	}

	/**
	 * Copy-from child item pegging No. 引継対象子品目紐付けＮＯ.<p>
	 *
	 */
	public void chd_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $chd_peg_no, value);
	}

	/**
	 * Copy-from child item pegging No. 引継対象子品目紐付けＮＯ.<p>
	 *
	 */
	public void chd_peg_no(int value) {
		setConstNumber(offset + 0, $chd_peg_no, value);
	}

	/**
	 * Copy-from child item pegging No. 引継対象子品目紐付けＮＯ.<p>
	 *
	 */
	public void chd_peg_no(long value) {
		setConstNumber(offset + 0, $chd_peg_no, value);
	}

	/**
	 * Copy-from child item pegging No. 引継対象子品目紐付けＮＯ.<p>
	 *
	 */
	public void chd_peg_no(float value) {
		setConstNumber(offset + 0, $chd_peg_no, value);
	}

	/**
	 * Copy-from child item pegging No. 引継対象子品目紐付けＮＯ.<p>
	 *
	 */
	public void chd_peg_no(double value) {
		setConstNumber(offset + 0, $chd_peg_no, value);
	}


	/**
	 * Storage location factory/distribution warehouse cd. 格納場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 1, $site_cd);
	}

	/**
	 * Storage location factory/distribution warehouse cd. 格納場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 1, $site_cd, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 2, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 2, $mfg_loc_cd, value);
	}


	/**
	 * GR date 入庫日.<p>
	 *
	 */
	public MCDate gr_dt() {
		return getConstDate(offset + 3, $gr_dt);
	}

	/**
	 * GR date 入庫日.<p>
	 *
	 */
	public void gr_dt(MCDate value) {
		setConstDate(offset + 3, $gr_dt, value);
	}


	public mcframe.serverMS.dbc.MST_LOT_R lot_p(){
		return (mcframe.serverMS.dbc.MST_LOT_R) getConstInnerRow(offset + 4, $lot_p);
	}
	
	public void lot_p(mcframe.serverMS.dbc.MST_LOT_R row){
		setConstInnerRow(offset + 4, $lot_p, row);
	}


	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 5, $master_dt);
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 5, $master_dt, value);
	}


	/**
	 * Update flg. 更新ＦＬＧ.<p>
	 *
	 */
	public boolean upd_flg() {
		return getConstBoolean(offset + 6, $upd_flg);
	}

	/**
	 * Update flg. 更新ＦＬＧ.<p>
	 *
	 */
	public void upd_flg(boolean value) {
		setConstBoolean(offset + 6, $upd_flg, value);
	}


	public String getString(String name) {
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($chd_peg_no.equalsIgnoreCase(name)) {
			return chd_peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($gr_dt.equalsIgnoreCase(name)) {
			return gr_dt();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($upd_flg.equalsIgnoreCase(name)) {
			return upd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($chd_peg_no.equalsIgnoreCase(name)) {
			return chd_peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($gr_dt.equalsIgnoreCase(name)) {
			return gr_dt();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($upd_flg.equalsIgnoreCase(name)) {
			return upd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($chd_peg_no.equalsIgnoreCase(name)) {
			chd_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($chd_peg_no.equalsIgnoreCase(name)) {
			chd_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($chd_peg_no.equalsIgnoreCase(name)) {
			chd_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($chd_peg_no.equalsIgnoreCase(name)) {
			chd_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($chd_peg_no.equalsIgnoreCase(name)) {
			chd_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($gr_dt.equalsIgnoreCase(name)) {
			gr_dt(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($upd_flg.equalsIgnoreCase(name)) {
			upd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($chd_peg_no.equalsIgnoreCase(name)) {
			chd_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($chd_peg_no.equalsIgnoreCase(name)) {
			chd_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($chd_peg_no.equalsIgnoreCase(name)) {
			chd_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($chd_peg_no.equalsIgnoreCase(name)) {
			chd_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($chd_peg_no.equalsIgnoreCase(name)) {
			chd_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($gr_dt.equalsIgnoreCase(name)) {
			gr_dt(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($upd_flg.equalsIgnoreCase(name)) {
			upd_flg(value);
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
	 * Without expiration flg. 期限未設定ＦＬＧ.<p>
	 *
	 */
	public boolean unreg_lmt_flg() {
		return lot_p().unreg_lmt_flg();
	}

	/**
	 * Without expiration flg. 期限未設定ＦＬＧ.<p>
	 *
	 */
	public void unreg_lmt_flg(boolean value) {
		lot_p().unreg_lmt_flg(value);
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

}

