package mcframe.clientMSBH.MSBHP0110;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * AP amount 買掛金.<p>
	 *
	 */
	public static final String $ap_typ_ap = "ap_typ_ap";
	/**
	 * Other accounts payable amount 未払金.<p>
	 *
	 */
	public static final String $ap_typ_ac = "ap_typ_ac";
	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public static final String $ap_typ_temp_ap = "ap_typ_temp_ap";
	/**
	 * Recording month FROM 計上年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ac_ym_fr = "ac_ym_fr";
	/**
	 * Recording month TO 計上年月ＴＯ.<p>
	 *
	 */
	public static final String $ac_ym_to = "ac_ym_to";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public static final String $ap_dpt_nm = "ap_dpt_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public static final String $asppl_nm = "asppl_nm";
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	public static final String $wrk_no_p = "wrk_no_p";
	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public static final String $ap_dpt_flg = "ap_dpt_flg";
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public static final String $wg_flg = "wg_flg";
	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public static final String $asppl_flg = "asppl_flg";
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no_flg = "rcpt_iv_no_flg";
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no_flg = "rcpt_iv_mng_no_flg";
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no_flg = "purc_act_no_flg";
	/**
	 * Currency 通貨.<p>
	 *
	 */
	public static final String $trd_cur_flg = "trd_cur_flg";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no_flg = "wrk_no_flg";
	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public static final String $ap_typ_flg = "ap_typ_flg";
	public static final String $asppl_grp_p = "asppl_grp_p";

	public static final String $wrk_no = $wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $wrk_no_p + ".wrk_nm";
	public static final String $asppl_grp_lab1 = $asppl_grp_p + ".bp_grp_lab1";
	public static final String $asppl_grp_flg1 = $asppl_grp_p + ".bp_grp_flg1";
	public static final String $asppl_grp_cd1 = $asppl_grp_p + ".bp_grp_cd1";
	public static final String $asppl_grp_nm1 = $asppl_grp_p + ".bp_grp_nm1";
	public static final String $asppl_grp_lab2 = $asppl_grp_p + ".bp_grp_lab2";
	public static final String $asppl_grp_flg2 = $asppl_grp_p + ".bp_grp_flg2";
	public static final String $asppl_grp_cd2 = $asppl_grp_p + ".bp_grp_cd2";
	public static final String $asppl_grp_nm2 = $asppl_grp_p + ".bp_grp_nm2";
	public static final String $asppl_grp_lab3 = $asppl_grp_p + ".bp_grp_lab3";
	public static final String $asppl_grp_flg3 = $asppl_grp_p + ".bp_grp_flg3";
	public static final String $asppl_grp_cd3 = $asppl_grp_p + ".bp_grp_cd3";
	public static final String $asppl_grp_nm3 = $asppl_grp_p + ".bp_grp_nm3";
	public static final String $asppl_grp_lab4 = $asppl_grp_p + ".bp_grp_lab4";
	public static final String $asppl_grp_flg4 = $asppl_grp_p + ".bp_grp_flg4";
	public static final String $asppl_grp_cd4 = $asppl_grp_p + ".bp_grp_cd4";
	public static final String $asppl_grp_nm4 = $asppl_grp_p + ".bp_grp_nm4";
	public static final String $asppl_grp_lab5 = $asppl_grp_p + ".bp_grp_lab5";
	public static final String $asppl_grp_flg5 = $asppl_grp_p + ".bp_grp_flg5";
	public static final String $asppl_grp_cd5 = $asppl_grp_p + ".bp_grp_cd5";
	public static final String $asppl_grp_nm5 = $asppl_grp_p + ".bp_grp_nm5";
	public static final String $asppl_grp_lab6 = $asppl_grp_p + ".bp_grp_lab6";
	public static final String $asppl_grp_flg6 = $asppl_grp_p + ".bp_grp_flg6";
	public static final String $asppl_grp_cd6 = $asppl_grp_p + ".bp_grp_cd6";
	public static final String $asppl_grp_nm6 = $asppl_grp_p + ".bp_grp_nm6";
	public static final String $asppl_grp_lab7 = $asppl_grp_p + ".bp_grp_lab7";
	public static final String $asppl_grp_flg7 = $asppl_grp_p + ".bp_grp_flg7";
	public static final String $asppl_grp_cd7 = $asppl_grp_p + ".bp_grp_cd7";
	public static final String $asppl_grp_nm7 = $asppl_grp_p + ".bp_grp_nm7";
	public static final String $asppl_grp_lab8 = $asppl_grp_p + ".bp_grp_lab8";
	public static final String $asppl_grp_flg8 = $asppl_grp_p + ".bp_grp_flg8";
	public static final String $asppl_grp_cd8 = $asppl_grp_p + ".bp_grp_cd8";
	public static final String $asppl_grp_nm8 = $asppl_grp_p + ".bp_grp_nm8";
	public static final String $asppl_grp_lab9 = $asppl_grp_p + ".bp_grp_lab9";
	public static final String $asppl_grp_flg9 = $asppl_grp_p + ".bp_grp_flg9";
	public static final String $asppl_grp_cd9 = $asppl_grp_p + ".bp_grp_cd9";
	public static final String $asppl_grp_nm9 = $asppl_grp_p + ".bp_grp_nm9";
	public static final String $asppl_grp_lab10 = $asppl_grp_p + ".bp_grp_lab10";
	public static final String $asppl_grp_flg10 = $asppl_grp_p + ".bp_grp_flg10";
	public static final String $asppl_grp_cd10 = $asppl_grp_p + ".bp_grp_cd10";
	public static final String $asppl_grp_nm10 = $asppl_grp_p + ".bp_grp_nm10";

	public static final MCMeta ap_typ_ap_META = createCommonMeta($ap_typ_ap, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_typ_ac_META = createCommonMeta($ap_typ_ac, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_typ_temp_ap_META = createCommonMeta($ap_typ_temp_ap, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_ym_fr_META = createCommonMeta($ac_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_ym_to_META = createCommonMeta($ac_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_nm_META = createCommonMeta($asppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta wrk_no_p_META = createInnerRowMeta($wrk_no_p, mcframe.clientMSUB.MSUBP0010.WrkNoR.class);
	public static final MCMeta ap_dpt_flg_META = createCommonMeta($ap_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_flg_META = createCommonMeta($wg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_flg_META = createCommonMeta($asppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_no_flg_META = createCommonMeta($rcpt_iv_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_mng_no_flg_META = createCommonMeta($rcpt_iv_mng_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_act_no_flg_META = createCommonMeta($purc_act_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_flg_META = createCommonMeta($trd_cur_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_no_flg_META = createCommonMeta($wrk_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_typ_flg_META = createCommonMeta($ap_typ_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_grp_p_META = createInnerRowMeta($asppl_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ap_typ_ap_META,
			ap_typ_ac_META,
			ap_typ_temp_ap_META,
			ac_ym_fr_META,
			ac_ym_to_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			asppl_cd_META,
			asppl_nm_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			purc_act_no_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			wrk_no_p_META,
			ap_dpt_flg_META,
			wg_flg_META,
			asppl_flg_META,
			rcpt_iv_no_flg_META,
			rcpt_iv_mng_no_flg_META,
			purc_act_no_flg_META,
			trd_cur_flg_META,
			wrk_no_flg_META,
			ap_typ_flg_META,
			asppl_grp_p_META
		},
		new String[][]{
			{
				"wrk_no",
				"wrk_nm",
				"asppl_grp_flg1",
				"asppl_grp_cd1",
				"asppl_grp_nm1",
				"asppl_grp_flg2",
				"asppl_grp_cd2",
				"asppl_grp_nm2",
				"asppl_grp_flg3",
				"asppl_grp_cd3",
				"asppl_grp_nm3",
				"asppl_grp_flg4",
				"asppl_grp_cd4",
				"asppl_grp_nm4",
				"asppl_grp_flg5",
				"asppl_grp_cd5",
				"asppl_grp_nm5",
				"asppl_grp_flg6",
				"asppl_grp_cd6",
				"asppl_grp_nm6",
				"asppl_grp_flg7",
				"asppl_grp_cd7",
				"asppl_grp_nm7",
				"asppl_grp_flg8",
				"asppl_grp_cd8",
				"asppl_grp_nm8",
				"asppl_grp_flg9",
				"asppl_grp_cd9",
				"asppl_grp_nm9",
				"asppl_grp_flg10",
				"asppl_grp_cd10",
				"asppl_grp_nm10"
			},
			{
				$wrk_no,
				$wrk_nm,
				$asppl_grp_flg1,
				$asppl_grp_cd1,
				$asppl_grp_nm1,
				$asppl_grp_flg2,
				$asppl_grp_cd2,
				$asppl_grp_nm2,
				$asppl_grp_flg3,
				$asppl_grp_cd3,
				$asppl_grp_nm3,
				$asppl_grp_flg4,
				$asppl_grp_cd4,
				$asppl_grp_nm4,
				$asppl_grp_flg5,
				$asppl_grp_cd5,
				$asppl_grp_nm5,
				$asppl_grp_flg6,
				$asppl_grp_cd6,
				$asppl_grp_nm6,
				$asppl_grp_flg7,
				$asppl_grp_cd7,
				$asppl_grp_nm7,
				$asppl_grp_flg8,
				$asppl_grp_cd8,
				$asppl_grp_nm8,
				$asppl_grp_flg9,
				$asppl_grp_cd9,
				$asppl_grp_nm9,
				$asppl_grp_flg10,
				$asppl_grp_cd10,
				$asppl_grp_nm10
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$ap_dpt_cd, "dpt_nm"},	// ap_dpt_cd
				{$asppl_cd, "bp_nm"},	// asppl_cd
				{$trd_cur_cd, "cur_nm"}	// trd_cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$ap_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.AP"},	// ap_dpt_cd
				{$asppl_cd, "MAC_BP_IS_SRCH_TYP.ASPPL"}	// asppl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$ap_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"},	// ap_dpt_cd
				{$asppl_cd, "bp_is_srch_typ"}	// asppl_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$wg_flg, "WG"},	// wg_flg
				{$wrk_no_flg, "WRK"}	// wrk_no_flg
			}
		))
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * AP amount 買掛金.<p>
	 *
	 */
	public boolean ap_typ_ap() {
		return getConstBoolean(offset + 0, $ap_typ_ap);
	}

	/**
	 * AP amount 買掛金.<p>
	 *
	 */
	public void ap_typ_ap(boolean value) {
		setConstBoolean(offset + 0, $ap_typ_ap, value);
	}


	/**
	 * Other accounts payable amount 未払金.<p>
	 *
	 */
	public boolean ap_typ_ac() {
		return getConstBoolean(offset + 1, $ap_typ_ac);
	}

	/**
	 * Other accounts payable amount 未払金.<p>
	 *
	 */
	public void ap_typ_ac(boolean value) {
		setConstBoolean(offset + 1, $ap_typ_ac, value);
	}


	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public boolean ap_typ_temp_ap() {
		return getConstBoolean(offset + 2, $ap_typ_temp_ap);
	}

	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public void ap_typ_temp_ap(boolean value) {
		setConstBoolean(offset + 2, $ap_typ_temp_ap, value);
	}


	/**
	 * Recording month FROM 計上年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ac_ym_fr() {
		return getConstDate(offset + 3, $ac_ym_fr);
	}

	/**
	 * Recording month FROM 計上年月ＦＲＯＭ.<p>
	 *
	 */
	public void ac_ym_fr(MCDate value) {
		setConstDate(offset + 3, $ac_ym_fr, value);
	}


	/**
	 * Recording month TO 計上年月ＴＯ.<p>
	 *
	 */
	public MCDate ac_ym_to() {
		return getConstDate(offset + 4, $ac_ym_to);
	}

	/**
	 * Recording month TO 計上年月ＴＯ.<p>
	 *
	 */
	public void ac_ym_to(MCDate value) {
		setConstDate(offset + 4, $ac_ym_to, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 5, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 5, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 6, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 6, $ap_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 7, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 7, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 8, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 8, $wg_nm, value);
	}


	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 9, $asppl_cd);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 9, $asppl_cd, value);
	}


	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public String asppl_nm() {
		return getConstString(offset + 10, $asppl_nm);
	}

	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public void asppl_nm(String value) {
		setConstString(offset + 10, $asppl_nm, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 11, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 11, $rcpt_iv_no, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 12, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 12, $rcpt_iv_mng_no, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 13, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 13, $purc_act_no, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 14, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 14, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 15, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 15, $trd_cur_nm, value);
	}


	public mcframe.clientMSUB.MSUBP0010.WrkNoR wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP0010.WrkNoR) getConstInnerRow(offset + 16, $wrk_no_p);
	}
	
	public void wrk_no_p(mcframe.clientMSUB.MSUBP0010.WrkNoR row){
		setConstInnerRow(offset + 16, $wrk_no_p, row);
	}


	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public boolean ap_dpt_flg() {
		return getConstBoolean(offset + 17, $ap_dpt_flg);
	}

	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public void ap_dpt_flg(boolean value) {
		setConstBoolean(offset + 17, $ap_dpt_flg, value);
	}


	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public boolean wg_flg() {
		return getConstBoolean(offset + 18, $wg_flg);
	}

	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public void wg_flg(boolean value) {
		setConstBoolean(offset + 18, $wg_flg, value);
	}


	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public boolean asppl_flg() {
		return getConstBoolean(offset + 19, $asppl_flg);
	}

	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public void asppl_flg(boolean value) {
		setConstBoolean(offset + 19, $asppl_flg, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public boolean rcpt_iv_no_flg() {
		return getConstBoolean(offset + 20, $rcpt_iv_no_flg);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no_flg(boolean value) {
		setConstBoolean(offset + 20, $rcpt_iv_no_flg, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public boolean rcpt_iv_mng_no_flg() {
		return getConstBoolean(offset + 21, $rcpt_iv_mng_no_flg);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no_flg(boolean value) {
		setConstBoolean(offset + 21, $rcpt_iv_mng_no_flg, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public boolean purc_act_no_flg() {
		return getConstBoolean(offset + 22, $purc_act_no_flg);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no_flg(boolean value) {
		setConstBoolean(offset + 22, $purc_act_no_flg, value);
	}


	/**
	 * Currency 通貨.<p>
	 *
	 */
	public boolean trd_cur_flg() {
		return getConstBoolean(offset + 23, $trd_cur_flg);
	}

	/**
	 * Currency 通貨.<p>
	 *
	 */
	public void trd_cur_flg(boolean value) {
		setConstBoolean(offset + 23, $trd_cur_flg, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public boolean wrk_no_flg() {
		return getConstBoolean(offset + 24, $wrk_no_flg);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no_flg(boolean value) {
		setConstBoolean(offset + 24, $wrk_no_flg, value);
	}


	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public boolean ap_typ_flg() {
		return getConstBoolean(offset + 25, $ap_typ_flg);
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public void ap_typ_flg(boolean value) {
		setConstBoolean(offset + 25, $ap_typ_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR asppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 26, $asppl_grp_p);
	}
	
	public void asppl_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 26, $asppl_grp_p, row);
	}


	public String getString(String name) {
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($ac_ym_fr.equalsIgnoreCase(name)) {
			return ac_ym_fr();
		}
		if ($ac_ym_to.equalsIgnoreCase(name)) {
			return ac_ym_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($ap_typ_ap.equalsIgnoreCase(name)) {
			return ap_typ_ap();
		}
		if ($ap_typ_ac.equalsIgnoreCase(name)) {
			return ap_typ_ac();
		}
		if ($ap_typ_temp_ap.equalsIgnoreCase(name)) {
			return ap_typ_temp_ap();
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			return ap_dpt_flg();
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			return asppl_flg();
		}
		if ($rcpt_iv_no_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_no_flg();
		}
		if ($rcpt_iv_mng_no_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no_flg();
		}
		if ($purc_act_no_flg.equalsIgnoreCase(name)) {
			return purc_act_no_flg();
		}
		if ($trd_cur_flg.equalsIgnoreCase(name)) {
			return trd_cur_flg();
		}
		if ($wrk_no_flg.equalsIgnoreCase(name)) {
			return wrk_no_flg();
		}
		if ($ap_typ_flg.equalsIgnoreCase(name)) {
			return ap_typ_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_ym_fr.equalsIgnoreCase(name)) {
			return ac_ym_fr();
		}
		if ($ac_ym_to.equalsIgnoreCase(name)) {
			return ac_ym_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ap_typ_ap.equalsIgnoreCase(name)) {
			return ap_typ_ap();
		}
		if ($ap_typ_ac.equalsIgnoreCase(name)) {
			return ap_typ_ac();
		}
		if ($ap_typ_temp_ap.equalsIgnoreCase(name)) {
			return ap_typ_temp_ap();
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			return ap_dpt_flg();
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			return asppl_flg();
		}
		if ($rcpt_iv_no_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_no_flg();
		}
		if ($rcpt_iv_mng_no_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no_flg();
		}
		if ($purc_act_no_flg.equalsIgnoreCase(name)) {
			return purc_act_no_flg();
		}
		if ($trd_cur_flg.equalsIgnoreCase(name)) {
			return trd_cur_flg();
		}
		if ($wrk_no_flg.equalsIgnoreCase(name)) {
			return wrk_no_flg();
		}
		if ($ap_typ_flg.equalsIgnoreCase(name)) {
			return ap_typ_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_ym_fr.equalsIgnoreCase(name)) {
			ac_ym_fr(value);
			return;
		}
		if ($ac_ym_to.equalsIgnoreCase(name)) {
			ac_ym_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($ap_typ_ap.equalsIgnoreCase(name)) {
			ap_typ_ap(value);
			return;
		}
		if ($ap_typ_ac.equalsIgnoreCase(name)) {
			ap_typ_ac(value);
			return;
		}
		if ($ap_typ_temp_ap.equalsIgnoreCase(name)) {
			ap_typ_temp_ap(value);
			return;
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			ap_dpt_flg(value);
			return;
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			asppl_flg(value);
			return;
		}
		if ($rcpt_iv_no_flg.equalsIgnoreCase(name)) {
			rcpt_iv_no_flg(value);
			return;
		}
		if ($rcpt_iv_mng_no_flg.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no_flg(value);
			return;
		}
		if ($purc_act_no_flg.equalsIgnoreCase(name)) {
			purc_act_no_flg(value);
			return;
		}
		if ($trd_cur_flg.equalsIgnoreCase(name)) {
			trd_cur_flg(value);
			return;
		}
		if ($wrk_no_flg.equalsIgnoreCase(name)) {
			wrk_no_flg(value);
			return;
		}
		if ($ap_typ_flg.equalsIgnoreCase(name)) {
			ap_typ_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_ym_fr.equalsIgnoreCase(name)) {
			ac_ym_fr(value);
			return;
		}
		if ($ac_ym_to.equalsIgnoreCase(name)) {
			ac_ym_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($ap_typ_ap.equalsIgnoreCase(name)) {
			ap_typ_ap(value);
			return;
		}
		if ($ap_typ_ac.equalsIgnoreCase(name)) {
			ap_typ_ac(value);
			return;
		}
		if ($ap_typ_temp_ap.equalsIgnoreCase(name)) {
			ap_typ_temp_ap(value);
			return;
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			ap_dpt_flg(value);
			return;
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			asppl_flg(value);
			return;
		}
		if ($rcpt_iv_no_flg.equalsIgnoreCase(name)) {
			rcpt_iv_no_flg(value);
			return;
		}
		if ($rcpt_iv_mng_no_flg.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no_flg(value);
			return;
		}
		if ($purc_act_no_flg.equalsIgnoreCase(name)) {
			purc_act_no_flg(value);
			return;
		}
		if ($trd_cur_flg.equalsIgnoreCase(name)) {
			trd_cur_flg(value);
			return;
		}
		if ($wrk_no_flg.equalsIgnoreCase(name)) {
			wrk_no_flg(value);
			return;
		}
		if ($ap_typ_flg.equalsIgnoreCase(name)) {
			ap_typ_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			return wrk_no_p();
		}
		if ($asppl_grp_p.equalsIgnoreCase(name)) {
			return asppl_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			wrk_no_p(
				((MCContainerMeta) wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0010.WrkNoR.class, value)
			);
			return;
		}
		if ($asppl_grp_p.equalsIgnoreCase(name)) {
			asppl_grp_p(
				((MCContainerMeta) asppl_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String wrk_no() {
		return wrk_no_p().wrk_no();
	}

	public void wrk_no(String value) {
		wrk_no_p().wrk_no(value);
	}

	public String wrk_nm() {
		return wrk_no_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		wrk_no_p().wrk_nm(value);
	}

	/**
	 * AP supplier classification 1 買掛先分類１.<p>
	 *
	 */
	public boolean asppl_grp_flg1() {
		return asppl_grp_p().bp_grp_flg1();
	}

	/**
	 * AP supplier classification 1 買掛先分類１.<p>
	 *
	 */
	public void asppl_grp_flg1(boolean value) {
		asppl_grp_p().bp_grp_flg1(value);
	}

	/**
	 * AP supplier classification cd. 1 買掛先分類ＣＤ１.<p>
	 *
	 */
	public String asppl_grp_cd1() {
		return asppl_grp_p().bp_grp_cd1();
	}

	/**
	 * AP supplier classification cd. 1 買掛先分類ＣＤ１.<p>
	 *
	 */
	public void asppl_grp_cd1(String value) {
		asppl_grp_p().bp_grp_cd1(value);
	}

	/**
	 * AP supplier classification name 1 買掛先分類名１.<p>
	 *
	 */
	public String asppl_grp_nm1() {
		return asppl_grp_p().bp_grp_nm1();
	}

	/**
	 * AP supplier classification name 1 買掛先分類名１.<p>
	 *
	 */
	public void asppl_grp_nm1(String value) {
		asppl_grp_p().bp_grp_nm1(value);
	}

	/**
	 * AP supplier classification 2 買掛先分類２.<p>
	 *
	 */
	public boolean asppl_grp_flg2() {
		return asppl_grp_p().bp_grp_flg2();
	}

	/**
	 * AP supplier classification 2 買掛先分類２.<p>
	 *
	 */
	public void asppl_grp_flg2(boolean value) {
		asppl_grp_p().bp_grp_flg2(value);
	}

	/**
	 * AP supplier classification cd. 2 買掛先分類ＣＤ２.<p>
	 *
	 */
	public String asppl_grp_cd2() {
		return asppl_grp_p().bp_grp_cd2();
	}

	/**
	 * AP supplier classification cd. 2 買掛先分類ＣＤ２.<p>
	 *
	 */
	public void asppl_grp_cd2(String value) {
		asppl_grp_p().bp_grp_cd2(value);
	}

	/**
	 * AP supplier classification name 2 買掛先分類名２.<p>
	 *
	 */
	public String asppl_grp_nm2() {
		return asppl_grp_p().bp_grp_nm2();
	}

	/**
	 * AP supplier classification name 2 買掛先分類名２.<p>
	 *
	 */
	public void asppl_grp_nm2(String value) {
		asppl_grp_p().bp_grp_nm2(value);
	}

	/**
	 * AP supplier classification 3 買掛先分類３.<p>
	 *
	 */
	public boolean asppl_grp_flg3() {
		return asppl_grp_p().bp_grp_flg3();
	}

	/**
	 * AP supplier classification 3 買掛先分類３.<p>
	 *
	 */
	public void asppl_grp_flg3(boolean value) {
		asppl_grp_p().bp_grp_flg3(value);
	}

	/**
	 * AP supplier classification cd. 3 買掛先分類ＣＤ３.<p>
	 *
	 */
	public String asppl_grp_cd3() {
		return asppl_grp_p().bp_grp_cd3();
	}

	/**
	 * AP supplier classification cd. 3 買掛先分類ＣＤ３.<p>
	 *
	 */
	public void asppl_grp_cd3(String value) {
		asppl_grp_p().bp_grp_cd3(value);
	}

	/**
	 * AP supplier classification name 3 買掛先分類名３.<p>
	 *
	 */
	public String asppl_grp_nm3() {
		return asppl_grp_p().bp_grp_nm3();
	}

	/**
	 * AP supplier classification name 3 買掛先分類名３.<p>
	 *
	 */
	public void asppl_grp_nm3(String value) {
		asppl_grp_p().bp_grp_nm3(value);
	}

	/**
	 * AP supplier classification 4 買掛先分類４.<p>
	 *
	 */
	public boolean asppl_grp_flg4() {
		return asppl_grp_p().bp_grp_flg4();
	}

	/**
	 * AP supplier classification 4 買掛先分類４.<p>
	 *
	 */
	public void asppl_grp_flg4(boolean value) {
		asppl_grp_p().bp_grp_flg4(value);
	}

	/**
	 * AP supplier classification cd. 4 買掛先分類ＣＤ４.<p>
	 *
	 */
	public String asppl_grp_cd4() {
		return asppl_grp_p().bp_grp_cd4();
	}

	/**
	 * AP supplier classification cd. 4 買掛先分類ＣＤ４.<p>
	 *
	 */
	public void asppl_grp_cd4(String value) {
		asppl_grp_p().bp_grp_cd4(value);
	}

	/**
	 * AP supplier classification name 4 買掛先分類名４.<p>
	 *
	 */
	public String asppl_grp_nm4() {
		return asppl_grp_p().bp_grp_nm4();
	}

	/**
	 * AP supplier classification name 4 買掛先分類名４.<p>
	 *
	 */
	public void asppl_grp_nm4(String value) {
		asppl_grp_p().bp_grp_nm4(value);
	}

	/**
	 * AP supplier classification 5 買掛先分類５.<p>
	 *
	 */
	public boolean asppl_grp_flg5() {
		return asppl_grp_p().bp_grp_flg5();
	}

	/**
	 * AP supplier classification 5 買掛先分類５.<p>
	 *
	 */
	public void asppl_grp_flg5(boolean value) {
		asppl_grp_p().bp_grp_flg5(value);
	}

	/**
	 * AP supplier classification cd. 5 買掛先分類ＣＤ５.<p>
	 *
	 */
	public String asppl_grp_cd5() {
		return asppl_grp_p().bp_grp_cd5();
	}

	/**
	 * AP supplier classification cd. 5 買掛先分類ＣＤ５.<p>
	 *
	 */
	public void asppl_grp_cd5(String value) {
		asppl_grp_p().bp_grp_cd5(value);
	}

	/**
	 * AP supplier classification name 5 買掛先分類名５.<p>
	 *
	 */
	public String asppl_grp_nm5() {
		return asppl_grp_p().bp_grp_nm5();
	}

	/**
	 * AP supplier classification name 5 買掛先分類名５.<p>
	 *
	 */
	public void asppl_grp_nm5(String value) {
		asppl_grp_p().bp_grp_nm5(value);
	}

	/**
	 * AP supplier classification 6 買掛先分類６.<p>
	 *
	 */
	public boolean asppl_grp_flg6() {
		return asppl_grp_p().bp_grp_flg6();
	}

	/**
	 * AP supplier classification 6 買掛先分類６.<p>
	 *
	 */
	public void asppl_grp_flg6(boolean value) {
		asppl_grp_p().bp_grp_flg6(value);
	}

	/**
	 * AP supplier classification cd. 6 買掛先分類ＣＤ６.<p>
	 *
	 */
	public String asppl_grp_cd6() {
		return asppl_grp_p().bp_grp_cd6();
	}

	/**
	 * AP supplier classification cd. 6 買掛先分類ＣＤ６.<p>
	 *
	 */
	public void asppl_grp_cd6(String value) {
		asppl_grp_p().bp_grp_cd6(value);
	}

	/**
	 * AP supplier classification name 6 買掛先分類名６.<p>
	 *
	 */
	public String asppl_grp_nm6() {
		return asppl_grp_p().bp_grp_nm6();
	}

	/**
	 * AP supplier classification name 6 買掛先分類名６.<p>
	 *
	 */
	public void asppl_grp_nm6(String value) {
		asppl_grp_p().bp_grp_nm6(value);
	}

	/**
	 * AP supplier classification 7 買掛先分類７.<p>
	 *
	 */
	public boolean asppl_grp_flg7() {
		return asppl_grp_p().bp_grp_flg7();
	}

	/**
	 * AP supplier classification 7 買掛先分類７.<p>
	 *
	 */
	public void asppl_grp_flg7(boolean value) {
		asppl_grp_p().bp_grp_flg7(value);
	}

	/**
	 * AP supplier classification cd. 7 買掛先分類ＣＤ７.<p>
	 *
	 */
	public String asppl_grp_cd7() {
		return asppl_grp_p().bp_grp_cd7();
	}

	/**
	 * AP supplier classification cd. 7 買掛先分類ＣＤ７.<p>
	 *
	 */
	public void asppl_grp_cd7(String value) {
		asppl_grp_p().bp_grp_cd7(value);
	}

	/**
	 * AP supplier classification name 7 買掛先分類名７.<p>
	 *
	 */
	public String asppl_grp_nm7() {
		return asppl_grp_p().bp_grp_nm7();
	}

	/**
	 * AP supplier classification name 7 買掛先分類名７.<p>
	 *
	 */
	public void asppl_grp_nm7(String value) {
		asppl_grp_p().bp_grp_nm7(value);
	}

	/**
	 * AP supplier classification 8 買掛先分類８.<p>
	 *
	 */
	public boolean asppl_grp_flg8() {
		return asppl_grp_p().bp_grp_flg8();
	}

	/**
	 * AP supplier classification 8 買掛先分類８.<p>
	 *
	 */
	public void asppl_grp_flg8(boolean value) {
		asppl_grp_p().bp_grp_flg8(value);
	}

	/**
	 * AP supplier classification cd. 8 買掛先分類ＣＤ８.<p>
	 *
	 */
	public String asppl_grp_cd8() {
		return asppl_grp_p().bp_grp_cd8();
	}

	/**
	 * AP supplier classification cd. 8 買掛先分類ＣＤ８.<p>
	 *
	 */
	public void asppl_grp_cd8(String value) {
		asppl_grp_p().bp_grp_cd8(value);
	}

	/**
	 * AP supplier classification name 8 買掛先分類名８.<p>
	 *
	 */
	public String asppl_grp_nm8() {
		return asppl_grp_p().bp_grp_nm8();
	}

	/**
	 * AP supplier classification name 8 買掛先分類名８.<p>
	 *
	 */
	public void asppl_grp_nm8(String value) {
		asppl_grp_p().bp_grp_nm8(value);
	}

	/**
	 * AP supplier classification 9 買掛先分類９.<p>
	 *
	 */
	public boolean asppl_grp_flg9() {
		return asppl_grp_p().bp_grp_flg9();
	}

	/**
	 * AP supplier classification 9 買掛先分類９.<p>
	 *
	 */
	public void asppl_grp_flg9(boolean value) {
		asppl_grp_p().bp_grp_flg9(value);
	}

	/**
	 * AP supplier classification cd. 9 買掛先分類ＣＤ９.<p>
	 *
	 */
	public String asppl_grp_cd9() {
		return asppl_grp_p().bp_grp_cd9();
	}

	/**
	 * AP supplier classification cd. 9 買掛先分類ＣＤ９.<p>
	 *
	 */
	public void asppl_grp_cd9(String value) {
		asppl_grp_p().bp_grp_cd9(value);
	}

	/**
	 * AP supplier classification name 9 買掛先分類名９.<p>
	 *
	 */
	public String asppl_grp_nm9() {
		return asppl_grp_p().bp_grp_nm9();
	}

	/**
	 * AP supplier classification name 9 買掛先分類名９.<p>
	 *
	 */
	public void asppl_grp_nm9(String value) {
		asppl_grp_p().bp_grp_nm9(value);
	}

	/**
	 * AP supplier classification 10 買掛先分類１０.<p>
	 *
	 */
	public boolean asppl_grp_flg10() {
		return asppl_grp_p().bp_grp_flg10();
	}

	/**
	 * AP supplier classification 10 買掛先分類１０.<p>
	 *
	 */
	public void asppl_grp_flg10(boolean value) {
		asppl_grp_p().bp_grp_flg10(value);
	}

	/**
	 * AP supplier classification cd. 10 買掛先分類ＣＤ１０.<p>
	 *
	 */
	public String asppl_grp_cd10() {
		return asppl_grp_p().bp_grp_cd10();
	}

	/**
	 * AP supplier classification cd. 10 買掛先分類ＣＤ１０.<p>
	 *
	 */
	public void asppl_grp_cd10(String value) {
		asppl_grp_p().bp_grp_cd10(value);
	}

	/**
	 * AP supplier classification name 10 買掛先分類名１０.<p>
	 *
	 */
	public String asppl_grp_nm10() {
		return asppl_grp_p().bp_grp_nm10();
	}

	/**
	 * AP supplier classification name 10 買掛先分類名１０.<p>
	 *
	 */
	public void asppl_grp_nm10(String value) {
		asppl_grp_p().bp_grp_nm10(value);
	}

}

