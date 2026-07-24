package mcframe.serverMSBC.MSBCL6100;

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
 * ブロック"VerChgUpd_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class VerChgUpd_DtlR_MC_A extends MCConstRow {

	public static final String $ver_chg_p = "ver_chg_p";
	/**
	 * Version switching info. available flg. 版切替情報有りＦＬＧ.<p>
	 *
	 */
	public static final String $ver_chg_exists_flg = "ver_chg_exists_flg";
	/**
	 * With change flg. 変更有りＦＬＧ.<p>
	 *
	 */
	public static final String $chg_flg = "chg_flg";
	public static final String $old_ver_chg_p = "old_ver_chg_p";

	public static final String $par_itm_cd = $ver_chg_p + ".par_itm_cd";
	public static final String $par_itm_sub1 = $ver_chg_p + ".par_itm_sub1";
	public static final String $par_itm_sub2 = $ver_chg_p + ".par_itm_sub2";
	public static final String $par_itm_sub3 = $ver_chg_p + ".par_itm_sub3";
	public static final String $chd_itm_cd = $ver_chg_p + ".chd_itm_cd";
	public static final String $chd_itm_sub1 = $ver_chg_p + ".chd_itm_sub1";
	public static final String $chd_itm_sub2 = $ver_chg_p + ".chd_itm_sub2";
	public static final String $chd_itm_sub3 = $ver_chg_p + ".chd_itm_sub3";
	public static final String $ver_no = $ver_chg_p + ".ver_no";
	public static final String $bom_ptn = $ver_chg_p + ".bom_ptn";
	public static final String $wg_cd = $ver_chg_p + ".wg_cd";
	public static final String $site_cd = $ver_chg_p + ".site_cd";
	public static final String $ver_chg_sts_typ = $ver_chg_p + ".ver_chg_sts_typ";
	public static final String $first_inst_st_tm = $ver_chg_p + ".first_inst_st_tm";
	public static final String $first_inst_lot_no = $ver_chg_p + ".first_inst_lot_no";
	public static final String $first_inst_sublot_no = $ver_chg_p + ".first_inst_sublot_no";
	public static final String $first_mfg_inst_no = $ver_chg_p + ".first_mfg_inst_no";
	public static final String $first_act_st_tm = $ver_chg_p + ".first_act_st_tm";
	public static final String $first_act_lot_no = $ver_chg_p + ".first_act_lot_no";
	public static final String $first_act_sublot_no = $ver_chg_p + ".first_act_sublot_no";
	public static final String $first_mfg_act_no = $ver_chg_p + ".first_mfg_act_no";
	public static final String $last_act_st_tm = $ver_chg_p + ".last_act_st_tm";
	public static final String $last_act_lot_no = $ver_chg_p + ".last_act_lot_no";
	public static final String $last_act_sublot_no = $ver_chg_p + ".last_act_sublot_no";
	public static final String $last_mfg_act_no = $ver_chg_p + ".last_mfg_act_no";

	public static final MCMeta ver_chg_p_META = createInnerRowMeta($ver_chg_p, mcframe.serverMS.dbc.MST_VER_CHG_R.class);
	public static final MCMeta ver_chg_exists_flg_META = createCommonMeta($ver_chg_exists_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chg_flg_META = createCommonMeta($chg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_ver_chg_p_META = createInnerRowMeta($old_ver_chg_p, mcframe.serverMS.dbc.MST_VER_CHG_R.class);

	protected static final ConstMetaList<VerChgUpd_DtlR> constMetas = new ConstMetaList<VerChgUpd_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ver_chg_p_META,
			ver_chg_exists_flg_META,
			chg_flg_META,
			old_ver_chg_p_META
		},
		new String[][]{
			{
				"par_itm_cd",
				"par_itm_sub1",
				"par_itm_sub2",
				"par_itm_sub3",
				"chd_itm_cd",
				"chd_itm_sub1",
				"chd_itm_sub2",
				"chd_itm_sub3",
				"ver_no",
				"bom_ptn",
				"wg_cd",
				"site_cd",
				"ver_chg_sts_typ",
				"first_inst_st_tm",
				"first_inst_lot_no",
				"first_inst_sublot_no",
				"first_mfg_inst_no",
				"first_act_st_tm",
				"first_act_lot_no",
				"first_act_sublot_no",
				"first_mfg_act_no",
				"last_act_st_tm",
				"last_act_lot_no",
				"last_act_sublot_no",
				"last_mfg_act_no"
			},
			{
				$par_itm_cd,
				$par_itm_sub1,
				$par_itm_sub2,
				$par_itm_sub3,
				$chd_itm_cd,
				$chd_itm_sub1,
				$chd_itm_sub2,
				$chd_itm_sub3,
				$ver_no,
				$bom_ptn,
				$wg_cd,
				$site_cd,
				$ver_chg_sts_typ,
				$first_inst_st_tm,
				$first_inst_lot_no,
				$first_inst_sublot_no,
				$first_mfg_inst_no,
				$first_act_st_tm,
				$first_act_lot_no,
				$first_act_sublot_no,
				$first_mfg_act_no,
				$last_act_st_tm,
				$last_act_lot_no,
				$last_act_sublot_no,
				$last_mfg_act_no
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
	protected VerChgUpd_DtlR_MC_A(ConstMetaList<? extends VerChgUpd_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public VerChgUpd_DtlR clone() {
		return (VerChgUpd_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public VerChgUpd_DtlR createInstance() {
		return (VerChgUpd_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public VerChgUpd_DtlR getValues(String... names) {
		return (VerChgUpd_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_VER_CHG_R ver_chg_p(){
		return (mcframe.serverMS.dbc.MST_VER_CHG_R) getConstInnerRow(offset + 0, $ver_chg_p);
	}
	
	public void ver_chg_p(mcframe.serverMS.dbc.MST_VER_CHG_R row){
		setConstInnerRow(offset + 0, $ver_chg_p, row);
	}


	/**
	 * Version switching info. available flg. 版切替情報有りＦＬＧ.<p>
	 *
	 */
	public boolean ver_chg_exists_flg() {
		return getConstBoolean(offset + 1, $ver_chg_exists_flg);
	}

	/**
	 * Version switching info. available flg. 版切替情報有りＦＬＧ.<p>
	 *
	 */
	public void ver_chg_exists_flg(boolean value) {
		setConstBoolean(offset + 1, $ver_chg_exists_flg, value);
	}


	/**
	 * With change flg. 変更有りＦＬＧ.<p>
	 *
	 */
	public boolean chg_flg() {
		return getConstBoolean(offset + 2, $chg_flg);
	}

	/**
	 * With change flg. 変更有りＦＬＧ.<p>
	 *
	 */
	public void chg_flg(boolean value) {
		setConstBoolean(offset + 2, $chg_flg, value);
	}


	public mcframe.serverMS.dbc.MST_VER_CHG_R old_ver_chg_p(){
		return (mcframe.serverMS.dbc.MST_VER_CHG_R) getConstInnerRow(offset + 3, $old_ver_chg_p);
	}
	
	public void old_ver_chg_p(mcframe.serverMS.dbc.MST_VER_CHG_R row){
		setConstInnerRow(offset + 3, $old_ver_chg_p, row);
	}


	public boolean getBoolean(String name) {
		if ($ver_chg_exists_flg.equalsIgnoreCase(name)) {
			return ver_chg_exists_flg();
		}
		if ($chg_flg.equalsIgnoreCase(name)) {
			return chg_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($ver_chg_exists_flg.equalsIgnoreCase(name)) {
			return ver_chg_exists_flg();
		}
		if ($chg_flg.equalsIgnoreCase(name)) {
			return chg_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($ver_chg_exists_flg.equalsIgnoreCase(name)) {
			ver_chg_exists_flg(value);
			return;
		}
		if ($chg_flg.equalsIgnoreCase(name)) {
			chg_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($ver_chg_exists_flg.equalsIgnoreCase(name)) {
			ver_chg_exists_flg(value);
			return;
		}
		if ($chg_flg.equalsIgnoreCase(name)) {
			chg_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ver_chg_p.equalsIgnoreCase(name)) {
			return ver_chg_p();
		}
		if ($old_ver_chg_p.equalsIgnoreCase(name)) {
			return old_ver_chg_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ver_chg_p.equalsIgnoreCase(name)) {
			ver_chg_p(
				((MCContainerMeta) ver_chg_p_META).castInnerRow(mcframe.serverMS.dbc.MST_VER_CHG_R.class, value)
			);
			return;
		}
		if ($old_ver_chg_p.equalsIgnoreCase(name)) {
			old_ver_chg_p(
				((MCContainerMeta) old_ver_chg_p_META).castInnerRow(mcframe.serverMS.dbc.MST_VER_CHG_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return ver_chg_p().par_itm_cd();
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		ver_chg_p().par_itm_cd(value);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return ver_chg_p().par_itm_sub1();
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		ver_chg_p().par_itm_sub1(value);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return ver_chg_p().par_itm_sub2();
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		ver_chg_p().par_itm_sub2(value);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return ver_chg_p().par_itm_sub3();
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		ver_chg_p().par_itm_sub3(value);
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public String chd_itm_cd() {
		return ver_chg_p().chd_itm_cd();
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		ver_chg_p().chd_itm_cd(value);
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return ver_chg_p().chd_itm_sub1();
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		ver_chg_p().chd_itm_sub1(value);
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return ver_chg_p().chd_itm_sub2();
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		ver_chg_p().chd_itm_sub2(value);
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return ver_chg_p().chd_itm_sub3();
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		ver_chg_p().chd_itm_sub3(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return ver_chg_p().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		ver_chg_p().ver_no(value);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return ver_chg_p().bom_ptn();
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		ver_chg_p().bom_ptn(value);
	}

	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return ver_chg_p().wg_cd();
	}

	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		ver_chg_p().wg_cd(value);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return ver_chg_p().site_cd();
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		ver_chg_p().site_cd(value);
	}

	/**
	 * Version change status type 版切替状況区分.<p>
	 *
	 */
	public String ver_chg_sts_typ() {
		return ver_chg_p().ver_chg_sts_typ();
	}

	/**
	 * Version change status type 版切替状況区分.<p>
	 *
	 */
	public void ver_chg_sts_typ(String value) {
		ver_chg_p().ver_chg_sts_typ(value);
	}

	/**
	 * Start changing date and time (Order) 切替開始日時（指図）.<p>
	 *
	 */
	public MCDate first_inst_st_tm() {
		return ver_chg_p().first_inst_st_tm();
	}

	/**
	 * Start changing date and time (Order) 切替開始日時（指図）.<p>
	 *
	 */
	public void first_inst_st_tm(MCDate value) {
		ver_chg_p().first_inst_st_tm(value);
	}

	/**
	 * Start lot No. (Order) 開始ロットＮＯ（指図）.<p>
	 *
	 */
	public String first_inst_lot_no() {
		return ver_chg_p().first_inst_lot_no();
	}

	/**
	 * Start lot No. (Order) 開始ロットＮＯ（指図）.<p>
	 *
	 */
	public void first_inst_lot_no(String value) {
		ver_chg_p().first_inst_lot_no(value);
	}

	/**
	 * Start sublot No. (Order) 開始サブロットＮＯ（指図）.<p>
	 *
	 */
	public String first_inst_sublot_no() {
		return ver_chg_p().first_inst_sublot_no();
	}

	/**
	 * Start sublot No. (Order) 開始サブロットＮＯ（指図）.<p>
	 *
	 */
	public void first_inst_sublot_no(String value) {
		ver_chg_p().first_inst_sublot_no(value);
	}

	/**
	 * Mfg. order starting No. 開始製造指図ＮＯ.<p>
	 *
	 */
	public String first_mfg_inst_no() {
		return ver_chg_p().first_mfg_inst_no();
	}

	/**
	 * Mfg. order starting No. 開始製造指図ＮＯ.<p>
	 *
	 */
	public void first_mfg_inst_no(String value) {
		ver_chg_p().first_mfg_inst_no(value);
	}

	/**
	 * Start changing date and time (Result) 切替開始日時（実績）.<p>
	 *
	 */
	public MCDate first_act_st_tm() {
		return ver_chg_p().first_act_st_tm();
	}

	/**
	 * Start changing date and time (Result) 切替開始日時（実績）.<p>
	 *
	 */
	public void first_act_st_tm(MCDate value) {
		ver_chg_p().first_act_st_tm(value);
	}

	/**
	 * Start lot No. (Result) 開始ロットＮＯ（実績）.<p>
	 *
	 */
	public String first_act_lot_no() {
		return ver_chg_p().first_act_lot_no();
	}

	/**
	 * Start lot No. (Result) 開始ロットＮＯ（実績）.<p>
	 *
	 */
	public void first_act_lot_no(String value) {
		ver_chg_p().first_act_lot_no(value);
	}

	/**
	 * Starting sublot No. (Result) 開始サブロットＮＯ（実績）.<p>
	 *
	 */
	public String first_act_sublot_no() {
		return ver_chg_p().first_act_sublot_no();
	}

	/**
	 * Starting sublot No. (Result) 開始サブロットＮＯ（実績）.<p>
	 *
	 */
	public void first_act_sublot_no(String value) {
		ver_chg_p().first_act_sublot_no(value);
	}

	/**
	 * First mfg. result No. 開始製造実績ＮＯ.<p>
	 *
	 */
	public String first_mfg_act_no() {
		return ver_chg_p().first_mfg_act_no();
	}

	/**
	 * First mfg. result No. 開始製造実績ＮＯ.<p>
	 *
	 */
	public void first_mfg_act_no(String value) {
		ver_chg_p().first_mfg_act_no(value);
	}

	/**
	 * Last start date and time 最終着手日時.<p>
	 *
	 */
	public MCDate last_act_st_tm() {
		return ver_chg_p().last_act_st_tm();
	}

	/**
	 * Last start date and time 最終着手日時.<p>
	 *
	 */
	public void last_act_st_tm(MCDate value) {
		ver_chg_p().last_act_st_tm(value);
	}

	/**
	 * Last lot No. (Result) 最終ロットＮＯ（実績）.<p>
	 *
	 */
	public String last_act_lot_no() {
		return ver_chg_p().last_act_lot_no();
	}

	/**
	 * Last lot No. (Result) 最終ロットＮＯ（実績）.<p>
	 *
	 */
	public void last_act_lot_no(String value) {
		ver_chg_p().last_act_lot_no(value);
	}

	/**
	 * Last sublot No. (Result) 最終サブロットＮＯ（実績）.<p>
	 *
	 */
	public String last_act_sublot_no() {
		return ver_chg_p().last_act_sublot_no();
	}

	/**
	 * Last sublot No. (Result) 最終サブロットＮＯ（実績）.<p>
	 *
	 */
	public void last_act_sublot_no(String value) {
		ver_chg_p().last_act_sublot_no(value);
	}

	/**
	 * Last mfg. result No. 最終製造実績ＮＯ.<p>
	 *
	 */
	public String last_mfg_act_no() {
		return ver_chg_p().last_mfg_act_no();
	}

	/**
	 * Last mfg. result No. 最終製造実績ＮＯ.<p>
	 *
	 */
	public void last_mfg_act_no(String value) {
		ver_chg_p().last_mfg_act_no(value);
	}

}

