package mcframe.clientMSBB.MSBBP1040;

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
	 * Sales project start date FROM 案件開始日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $st_dt_fr = "st_dt_fr";
	/**
	 * Sales project start date TO 案件開始日ＴＯ.<p>
	 *
	 */
	public static final String $st_dt_to = "st_dt_to";
	/**
	 * Sales project end date FROM 案件終了日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $end_dt_fr = "end_dt_fr";
	/**
	 * Sales project end date TO 案件終了日ＴＯ.<p>
	 *
	 */
	public static final String $end_dt_to = "end_dt_to";
	/**
	 * Sales project status cd. 案件状況ＣＤ.<p>
	 *
	 */
	public static final String $wrk_sts_cd = "wrk_sts_cd";
	/**
	 * Sales project status name 案件状況名.<p>
	 *
	 */
	public static final String $wrk_sts_nm = "wrk_sts_nm";
	/**
	 * Sales order accuracy cd. 受注確度ＣＤ.<p>
	 *
	 */
	public static final String $slo_acc_cd = "slo_acc_cd";
	/**
	 * Sales order accuracy name 受注確度名.<p>
	 *
	 */
	public static final String $slo_acc_nm = "slo_acc_nm";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	public static final String $budget_fr_p = "budget_fr_p";
	public static final String $budget_to_p = "budget_to_p";
	/**
	 * Sales order reason 受注理由.<p>
	 *
	 */
	public static final String $slo_rsn = "slo_rsn";
	/**
	 * Failed order reason 失注理由.<p>
	 *
	 */
	public static final String $fail_rsn = "fail_rsn";
	/**
	 * Sales project remarks 案件備考.<p>
	 *
	 */
	public static final String $wrk_rmrks = "wrk_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public static final String $inc_can_flg = "inc_can_flg";
	public static final String $bp_grp_p = "bp_grp_p";

	public static final String $budget_fr = $budget_fr_p + ".amt";
	public static final String $budget_to = $budget_to_p + ".amt";
	public static final String $cst_grp_lab1 = $bp_grp_p + ".bp_grp_lab1";
	public static final String $cst_grp_flg1 = $bp_grp_p + ".bp_grp_flg1";
	public static final String $cst_grp_cd1 = $bp_grp_p + ".bp_grp_cd1";
	public static final String $cst_grp_nm1 = $bp_grp_p + ".bp_grp_nm1";
	public static final String $cst_grp_lab2 = $bp_grp_p + ".bp_grp_lab2";
	public static final String $cst_grp_flg2 = $bp_grp_p + ".bp_grp_flg2";
	public static final String $cst_grp_cd2 = $bp_grp_p + ".bp_grp_cd2";
	public static final String $cst_grp_nm2 = $bp_grp_p + ".bp_grp_nm2";
	public static final String $cst_grp_lab3 = $bp_grp_p + ".bp_grp_lab3";
	public static final String $cst_grp_flg3 = $bp_grp_p + ".bp_grp_flg3";
	public static final String $cst_grp_cd3 = $bp_grp_p + ".bp_grp_cd3";
	public static final String $cst_grp_nm3 = $bp_grp_p + ".bp_grp_nm3";
	public static final String $cst_grp_lab4 = $bp_grp_p + ".bp_grp_lab4";
	public static final String $cst_grp_flg4 = $bp_grp_p + ".bp_grp_flg4";
	public static final String $cst_grp_cd4 = $bp_grp_p + ".bp_grp_cd4";
	public static final String $cst_grp_nm4 = $bp_grp_p + ".bp_grp_nm4";
	public static final String $cst_grp_lab5 = $bp_grp_p + ".bp_grp_lab5";
	public static final String $cst_grp_flg5 = $bp_grp_p + ".bp_grp_flg5";
	public static final String $cst_grp_cd5 = $bp_grp_p + ".bp_grp_cd5";
	public static final String $cst_grp_nm5 = $bp_grp_p + ".bp_grp_nm5";
	public static final String $cst_grp_lab6 = $bp_grp_p + ".bp_grp_lab6";
	public static final String $cst_grp_flg6 = $bp_grp_p + ".bp_grp_flg6";
	public static final String $cst_grp_cd6 = $bp_grp_p + ".bp_grp_cd6";
	public static final String $cst_grp_nm6 = $bp_grp_p + ".bp_grp_nm6";
	public static final String $cst_grp_lab7 = $bp_grp_p + ".bp_grp_lab7";
	public static final String $cst_grp_flg7 = $bp_grp_p + ".bp_grp_flg7";
	public static final String $cst_grp_cd7 = $bp_grp_p + ".bp_grp_cd7";
	public static final String $cst_grp_nm7 = $bp_grp_p + ".bp_grp_nm7";
	public static final String $cst_grp_lab8 = $bp_grp_p + ".bp_grp_lab8";
	public static final String $cst_grp_flg8 = $bp_grp_p + ".bp_grp_flg8";
	public static final String $cst_grp_cd8 = $bp_grp_p + ".bp_grp_cd8";
	public static final String $cst_grp_nm8 = $bp_grp_p + ".bp_grp_nm8";
	public static final String $cst_grp_lab9 = $bp_grp_p + ".bp_grp_lab9";
	public static final String $cst_grp_flg9 = $bp_grp_p + ".bp_grp_flg9";
	public static final String $cst_grp_cd9 = $bp_grp_p + ".bp_grp_cd9";
	public static final String $cst_grp_nm9 = $bp_grp_p + ".bp_grp_nm9";
	public static final String $cst_grp_lab10 = $bp_grp_p + ".bp_grp_lab10";
	public static final String $cst_grp_flg10 = $bp_grp_p + ".bp_grp_flg10";
	public static final String $cst_grp_cd10 = $bp_grp_p + ".bp_grp_cd10";
	public static final String $cst_grp_nm10 = $bp_grp_p + ".bp_grp_nm10";

	public static final MCMeta st_dt_fr_META = createCommonMeta($st_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_dt_to_META = createCommonMeta($st_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_fr_META = createCommonMeta($end_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_to_META = createCommonMeta($end_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wrk_sts_cd_META = createCommonMeta($wrk_sts_cd, mcframe.commonMS.meta.MS_META.WRK_MNG_CD);
	public static final MCMeta wrk_sts_nm_META = createCommonMeta($wrk_sts_nm, mcframe.commonMS.meta.MS_META.WRK_MNG_NM);
	public static final MCMeta slo_acc_cd_META = createCommonMeta($slo_acc_cd, mcframe.commonMS.meta.MS_META.WRK_MNG_CD);
	public static final MCMeta slo_acc_nm_META = createCommonMeta($slo_acc_nm, mcframe.commonMS.meta.MS_META.WRK_MNG_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta budget_fr_p_META = createInnerRowMeta($budget_fr_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta budget_to_p_META = createInnerRowMeta($budget_to_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta slo_rsn_META = createCommonMeta($slo_rsn, mcframe.commonMS.meta.MS_META.WRK_SLO_RSN);
	public static final MCMeta fail_rsn_META = createCommonMeta($fail_rsn, mcframe.commonMS.meta.MS_META.WRK_FAIL_RSN);
	public static final MCMeta wrk_rmrks_META = createCommonMeta($wrk_rmrks, mcframe.commonMS.meta.MS_META.WRK_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.WRK_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.WRK_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.WRK_SUB_CHAR3);
	public static final MCMeta inc_can_flg_META = createCommonMeta($inc_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_p_META = createInnerRowMeta($bp_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			st_dt_fr_META,
			st_dt_to_META,
			end_dt_fr_META,
			end_dt_to_META,
			wrk_sts_cd_META,
			wrk_sts_nm_META,
			slo_acc_cd_META,
			slo_acc_nm_META,
			cst_cd_META,
			cst_nm_META,
			wrk_no_META,
			wrk_nm_META,
			cur_cd_META,
			cur_nm_META,
			amt_dec_place_META,
			budget_fr_p_META,
			budget_to_p_META,
			slo_rsn_META,
			fail_rsn_META,
			wrk_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			inc_can_flg_META,
			bp_grp_p_META
		},
		new String[][]{
			{
				"budget_fr",
				"budget_to",
				"cst_grp_flg1",
				"cst_grp_cd1",
				"cst_grp_nm1",
				"cst_grp_flg2",
				"cst_grp_cd2",
				"cst_grp_nm2",
				"cst_grp_flg3",
				"cst_grp_cd3",
				"cst_grp_nm3",
				"cst_grp_flg4",
				"cst_grp_cd4",
				"cst_grp_nm4",
				"cst_grp_flg5",
				"cst_grp_cd5",
				"cst_grp_nm5",
				"cst_grp_flg6",
				"cst_grp_cd6",
				"cst_grp_nm6",
				"cst_grp_flg7",
				"cst_grp_cd7",
				"cst_grp_nm7",
				"cst_grp_flg8",
				"cst_grp_cd8",
				"cst_grp_nm8",
				"cst_grp_flg9",
				"cst_grp_cd9",
				"cst_grp_nm9",
				"cst_grp_flg10",
				"cst_grp_cd10",
				"cst_grp_nm10"
			},
			{
				$budget_fr,
				$budget_to,
				$cst_grp_flg1,
				$cst_grp_cd1,
				$cst_grp_nm1,
				$cst_grp_flg2,
				$cst_grp_cd2,
				$cst_grp_nm2,
				$cst_grp_flg3,
				$cst_grp_cd3,
				$cst_grp_nm3,
				$cst_grp_flg4,
				$cst_grp_cd4,
				$cst_grp_nm4,
				$cst_grp_flg5,
				$cst_grp_cd5,
				$cst_grp_nm5,
				$cst_grp_flg6,
				$cst_grp_cd6,
				$cst_grp_nm6,
				$cst_grp_flg7,
				$cst_grp_cd7,
				$cst_grp_nm7,
				$cst_grp_flg8,
				$cst_grp_cd8,
				$cst_grp_nm8,
				$cst_grp_flg9,
				$cst_grp_cd9,
				$cst_grp_nm9,
				$cst_grp_flg10,
				$cst_grp_cd10,
				$cst_grp_nm10
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$wrk_sts_cd, "wrk_mng_nm"},	// wrk_sts_cd
				{$slo_acc_cd, "wrk_mng_nm"},	// slo_acc_cd
				{$cst_cd, "bp_nm"}	// cst_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$cst_cd, "MAC_BP_IS_SRCH_TYP.CST"}	// cst_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$cst_cd, "bp_is_srch_typ"}	// cst_cd
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
	 * Sales project start date FROM 案件開始日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate st_dt_fr() {
		return getConstDate(offset + 0, $st_dt_fr);
	}

	/**
	 * Sales project start date FROM 案件開始日ＦＲＯＭ.<p>
	 *
	 */
	public void st_dt_fr(MCDate value) {
		setConstDate(offset + 0, $st_dt_fr, value);
	}


	/**
	 * Sales project start date TO 案件開始日ＴＯ.<p>
	 *
	 */
	public MCDate st_dt_to() {
		return getConstDate(offset + 1, $st_dt_to);
	}

	/**
	 * Sales project start date TO 案件開始日ＴＯ.<p>
	 *
	 */
	public void st_dt_to(MCDate value) {
		setConstDate(offset + 1, $st_dt_to, value);
	}


	/**
	 * Sales project end date FROM 案件終了日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate end_dt_fr() {
		return getConstDate(offset + 2, $end_dt_fr);
	}

	/**
	 * Sales project end date FROM 案件終了日ＦＲＯＭ.<p>
	 *
	 */
	public void end_dt_fr(MCDate value) {
		setConstDate(offset + 2, $end_dt_fr, value);
	}


	/**
	 * Sales project end date TO 案件終了日ＴＯ.<p>
	 *
	 */
	public MCDate end_dt_to() {
		return getConstDate(offset + 3, $end_dt_to);
	}

	/**
	 * Sales project end date TO 案件終了日ＴＯ.<p>
	 *
	 */
	public void end_dt_to(MCDate value) {
		setConstDate(offset + 3, $end_dt_to, value);
	}


	/**
	 * Sales project status cd. 案件状況ＣＤ.<p>
	 *
	 */
	public String wrk_sts_cd() {
		return getConstString(offset + 4, $wrk_sts_cd);
	}

	/**
	 * Sales project status cd. 案件状況ＣＤ.<p>
	 *
	 */
	public void wrk_sts_cd(String value) {
		setConstString(offset + 4, $wrk_sts_cd, value);
	}


	/**
	 * Sales project status name 案件状況名.<p>
	 *
	 */
	public String wrk_sts_nm() {
		return getConstString(offset + 5, $wrk_sts_nm);
	}

	/**
	 * Sales project status name 案件状況名.<p>
	 *
	 */
	public void wrk_sts_nm(String value) {
		setConstString(offset + 5, $wrk_sts_nm, value);
	}


	/**
	 * Sales order accuracy cd. 受注確度ＣＤ.<p>
	 *
	 */
	public String slo_acc_cd() {
		return getConstString(offset + 6, $slo_acc_cd);
	}

	/**
	 * Sales order accuracy cd. 受注確度ＣＤ.<p>
	 *
	 */
	public void slo_acc_cd(String value) {
		setConstString(offset + 6, $slo_acc_cd, value);
	}


	/**
	 * Sales order accuracy name 受注確度名.<p>
	 *
	 */
	public String slo_acc_nm() {
		return getConstString(offset + 7, $slo_acc_nm);
	}

	/**
	 * Sales order accuracy name 受注確度名.<p>
	 *
	 */
	public void slo_acc_nm(String value) {
		setConstString(offset + 7, $slo_acc_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 8, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 8, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 9, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 9, $cst_nm, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 10, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 10, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 11, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 11, $wrk_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 12, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 12, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 13, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 13, $cur_nm, value);
	}


	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 14, $amt_dec_place);
	}

	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 14, $amt_dec_place, value);
	}

	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 14, $amt_dec_place, value);
	}

	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 14, $amt_dec_place, value);
	}

	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 14, $amt_dec_place, value);
	}

	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 14, $amt_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR budget_fr_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 15, $budget_fr_p);
	}
	
	public void budget_fr_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 15, $budget_fr_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR budget_to_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 16, $budget_to_p);
	}
	
	public void budget_to_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 16, $budget_to_p, row);
	}


	/**
	 * Sales order reason 受注理由.<p>
	 *
	 */
	public String slo_rsn() {
		return getConstString(offset + 17, $slo_rsn);
	}

	/**
	 * Sales order reason 受注理由.<p>
	 *
	 */
	public void slo_rsn(String value) {
		setConstString(offset + 17, $slo_rsn, value);
	}


	/**
	 * Failed order reason 失注理由.<p>
	 *
	 */
	public String fail_rsn() {
		return getConstString(offset + 18, $fail_rsn);
	}

	/**
	 * Failed order reason 失注理由.<p>
	 *
	 */
	public void fail_rsn(String value) {
		setConstString(offset + 18, $fail_rsn, value);
	}


	/**
	 * Sales project remarks 案件備考.<p>
	 *
	 */
	public String wrk_rmrks() {
		return getConstString(offset + 19, $wrk_rmrks);
	}

	/**
	 * Sales project remarks 案件備考.<p>
	 *
	 */
	public void wrk_rmrks(String value) {
		setConstString(offset + 19, $wrk_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 20, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 20, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 21, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 21, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 22, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 22, $sub_char3, value);
	}


	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public boolean inc_can_flg() {
		return getConstBoolean(offset + 23, $inc_can_flg);
	}

	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public void inc_can_flg(boolean value) {
		setConstBoolean(offset + 23, $inc_can_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR bp_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 24, $bp_grp_p);
	}
	
	public void bp_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 24, $bp_grp_p, row);
	}


	public String getString(String name) {
		if ($wrk_sts_cd.equalsIgnoreCase(name)) {
			return wrk_sts_cd();
		}
		if ($wrk_sts_nm.equalsIgnoreCase(name)) {
			return wrk_sts_nm();
		}
		if ($slo_acc_cd.equalsIgnoreCase(name)) {
			return slo_acc_cd();
		}
		if ($slo_acc_nm.equalsIgnoreCase(name)) {
			return slo_acc_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($slo_rsn.equalsIgnoreCase(name)) {
			return slo_rsn();
		}
		if ($fail_rsn.equalsIgnoreCase(name)) {
			return fail_rsn();
		}
		if ($wrk_rmrks.equalsIgnoreCase(name)) {
			return wrk_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt_fr.equalsIgnoreCase(name)) {
			return st_dt_fr();
		}
		if ($st_dt_to.equalsIgnoreCase(name)) {
			return st_dt_to();
		}
		if ($end_dt_fr.equalsIgnoreCase(name)) {
			return end_dt_fr();
		}
		if ($end_dt_to.equalsIgnoreCase(name)) {
			return end_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			return inc_can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wrk_sts_cd.equalsIgnoreCase(name)) {
			return wrk_sts_cd();
		}
		if ($wrk_sts_nm.equalsIgnoreCase(name)) {
			return wrk_sts_nm();
		}
		if ($slo_acc_cd.equalsIgnoreCase(name)) {
			return slo_acc_cd();
		}
		if ($slo_acc_nm.equalsIgnoreCase(name)) {
			return slo_acc_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($slo_rsn.equalsIgnoreCase(name)) {
			return slo_rsn();
		}
		if ($fail_rsn.equalsIgnoreCase(name)) {
			return fail_rsn();
		}
		if ($wrk_rmrks.equalsIgnoreCase(name)) {
			return wrk_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt_fr.equalsIgnoreCase(name)) {
			return st_dt_fr();
		}
		if ($st_dt_to.equalsIgnoreCase(name)) {
			return st_dt_to();
		}
		if ($end_dt_fr.equalsIgnoreCase(name)) {
			return end_dt_fr();
		}
		if ($end_dt_to.equalsIgnoreCase(name)) {
			return end_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			return inc_can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wrk_sts_cd.equalsIgnoreCase(name)) {
			wrk_sts_cd(value);
			return;
		}
		if ($wrk_sts_nm.equalsIgnoreCase(name)) {
			wrk_sts_nm(value);
			return;
		}
		if ($slo_acc_cd.equalsIgnoreCase(name)) {
			slo_acc_cd(value);
			return;
		}
		if ($slo_acc_nm.equalsIgnoreCase(name)) {
			slo_acc_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($slo_rsn.equalsIgnoreCase(name)) {
			slo_rsn(value);
			return;
		}
		if ($fail_rsn.equalsIgnoreCase(name)) {
			fail_rsn(value);
			return;
		}
		if ($wrk_rmrks.equalsIgnoreCase(name)) {
			wrk_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt_fr.equalsIgnoreCase(name)) {
			st_dt_fr(value);
			return;
		}
		if ($st_dt_to.equalsIgnoreCase(name)) {
			st_dt_to(value);
			return;
		}
		if ($end_dt_fr.equalsIgnoreCase(name)) {
			end_dt_fr(value);
			return;
		}
		if ($end_dt_to.equalsIgnoreCase(name)) {
			end_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			inc_can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wrk_sts_cd.equalsIgnoreCase(name)) {
			wrk_sts_cd(value);
			return;
		}
		if ($wrk_sts_nm.equalsIgnoreCase(name)) {
			wrk_sts_nm(value);
			return;
		}
		if ($slo_acc_cd.equalsIgnoreCase(name)) {
			slo_acc_cd(value);
			return;
		}
		if ($slo_acc_nm.equalsIgnoreCase(name)) {
			slo_acc_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($slo_rsn.equalsIgnoreCase(name)) {
			slo_rsn(value);
			return;
		}
		if ($fail_rsn.equalsIgnoreCase(name)) {
			fail_rsn(value);
			return;
		}
		if ($wrk_rmrks.equalsIgnoreCase(name)) {
			wrk_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt_fr.equalsIgnoreCase(name)) {
			st_dt_fr(value);
			return;
		}
		if ($st_dt_to.equalsIgnoreCase(name)) {
			st_dt_to(value);
			return;
		}
		if ($end_dt_fr.equalsIgnoreCase(name)) {
			end_dt_fr(value);
			return;
		}
		if ($end_dt_to.equalsIgnoreCase(name)) {
			end_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			inc_can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($budget_fr_p.equalsIgnoreCase(name)) {
			return budget_fr_p();
		}
		if ($budget_to_p.equalsIgnoreCase(name)) {
			return budget_to_p();
		}
		if ($bp_grp_p.equalsIgnoreCase(name)) {
			return bp_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($budget_fr_p.equalsIgnoreCase(name)) {
			budget_fr_p(
				((MCContainerMeta) budget_fr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($budget_to_p.equalsIgnoreCase(name)) {
			budget_to_p(
				((MCContainerMeta) budget_to_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($bp_grp_p.equalsIgnoreCase(name)) {
			bp_grp_p(
				((MCContainerMeta) bp_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Budget FROM 予算ＦＲＯＭ.<p>
	 *
	 */
	public MCNumber budget_fr() {
		return budget_fr_p().amt();
	}

	/**
	 * Budget FROM 予算ＦＲＯＭ.<p>
	 *
	 */
	public void budget_fr(MCNumber value) {
		budget_fr_p().amt(value);
	}

	/**
	 * Budget FROM 予算ＦＲＯＭ.<p>
	 *
	 */
	public void budget_fr(int value) {
		budget_fr_p().amt(value);
	}

	/**
	 * Budget FROM 予算ＦＲＯＭ.<p>
	 *
	 */
	public void budget_fr(long value) {
		budget_fr_p().amt(value);
	}

	/**
	 * Budget FROM 予算ＦＲＯＭ.<p>
	 *
	 */
	public void budget_fr(float value) {
		budget_fr_p().amt(value);
	}

	/**
	 * Budget FROM 予算ＦＲＯＭ.<p>
	 *
	 */
	public void budget_fr(double value) {
		budget_fr_p().amt(value);
	}

	/**
	 * Budget TO 予算ＴＯ.<p>
	 *
	 */
	public MCNumber budget_to() {
		return budget_to_p().amt();
	}

	/**
	 * Budget TO 予算ＴＯ.<p>
	 *
	 */
	public void budget_to(MCNumber value) {
		budget_to_p().amt(value);
	}

	/**
	 * Budget TO 予算ＴＯ.<p>
	 *
	 */
	public void budget_to(int value) {
		budget_to_p().amt(value);
	}

	/**
	 * Budget TO 予算ＴＯ.<p>
	 *
	 */
	public void budget_to(long value) {
		budget_to_p().amt(value);
	}

	/**
	 * Budget TO 予算ＴＯ.<p>
	 *
	 */
	public void budget_to(float value) {
		budget_to_p().amt(value);
	}

	/**
	 * Budget TO 予算ＴＯ.<p>
	 *
	 */
	public void budget_to(double value) {
		budget_to_p().amt(value);
	}

	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public boolean cst_grp_flg1() {
		return bp_grp_p().bp_grp_flg1();
	}

	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public void cst_grp_flg1(boolean value) {
		bp_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public String cst_grp_cd1() {
		return bp_grp_p().bp_grp_cd1();
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public void cst_grp_cd1(String value) {
		bp_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public String cst_grp_nm1() {
		return bp_grp_p().bp_grp_nm1();
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public void cst_grp_nm1(String value) {
		bp_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public boolean cst_grp_flg2() {
		return bp_grp_p().bp_grp_flg2();
	}

	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public void cst_grp_flg2(boolean value) {
		bp_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public String cst_grp_cd2() {
		return bp_grp_p().bp_grp_cd2();
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public void cst_grp_cd2(String value) {
		bp_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public String cst_grp_nm2() {
		return bp_grp_p().bp_grp_nm2();
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public void cst_grp_nm2(String value) {
		bp_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public boolean cst_grp_flg3() {
		return bp_grp_p().bp_grp_flg3();
	}

	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public void cst_grp_flg3(boolean value) {
		bp_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public String cst_grp_cd3() {
		return bp_grp_p().bp_grp_cd3();
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public void cst_grp_cd3(String value) {
		bp_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public String cst_grp_nm3() {
		return bp_grp_p().bp_grp_nm3();
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public void cst_grp_nm3(String value) {
		bp_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public boolean cst_grp_flg4() {
		return bp_grp_p().bp_grp_flg4();
	}

	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public void cst_grp_flg4(boolean value) {
		bp_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public String cst_grp_cd4() {
		return bp_grp_p().bp_grp_cd4();
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public void cst_grp_cd4(String value) {
		bp_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public String cst_grp_nm4() {
		return bp_grp_p().bp_grp_nm4();
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public void cst_grp_nm4(String value) {
		bp_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public boolean cst_grp_flg5() {
		return bp_grp_p().bp_grp_flg5();
	}

	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public void cst_grp_flg5(boolean value) {
		bp_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public String cst_grp_cd5() {
		return bp_grp_p().bp_grp_cd5();
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public void cst_grp_cd5(String value) {
		bp_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public String cst_grp_nm5() {
		return bp_grp_p().bp_grp_nm5();
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public void cst_grp_nm5(String value) {
		bp_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public boolean cst_grp_flg6() {
		return bp_grp_p().bp_grp_flg6();
	}

	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public void cst_grp_flg6(boolean value) {
		bp_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public String cst_grp_cd6() {
		return bp_grp_p().bp_grp_cd6();
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public void cst_grp_cd6(String value) {
		bp_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public String cst_grp_nm6() {
		return bp_grp_p().bp_grp_nm6();
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public void cst_grp_nm6(String value) {
		bp_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public boolean cst_grp_flg7() {
		return bp_grp_p().bp_grp_flg7();
	}

	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public void cst_grp_flg7(boolean value) {
		bp_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public String cst_grp_cd7() {
		return bp_grp_p().bp_grp_cd7();
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public void cst_grp_cd7(String value) {
		bp_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public String cst_grp_nm7() {
		return bp_grp_p().bp_grp_nm7();
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public void cst_grp_nm7(String value) {
		bp_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public boolean cst_grp_flg8() {
		return bp_grp_p().bp_grp_flg8();
	}

	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public void cst_grp_flg8(boolean value) {
		bp_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public String cst_grp_cd8() {
		return bp_grp_p().bp_grp_cd8();
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public void cst_grp_cd8(String value) {
		bp_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public String cst_grp_nm8() {
		return bp_grp_p().bp_grp_nm8();
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public void cst_grp_nm8(String value) {
		bp_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public boolean cst_grp_flg9() {
		return bp_grp_p().bp_grp_flg9();
	}

	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public void cst_grp_flg9(boolean value) {
		bp_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public String cst_grp_cd9() {
		return bp_grp_p().bp_grp_cd9();
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public void cst_grp_cd9(String value) {
		bp_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public String cst_grp_nm9() {
		return bp_grp_p().bp_grp_nm9();
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public void cst_grp_nm9(String value) {
		bp_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public boolean cst_grp_flg10() {
		return bp_grp_p().bp_grp_flg10();
	}

	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public void cst_grp_flg10(boolean value) {
		bp_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public String cst_grp_cd10() {
		return bp_grp_p().bp_grp_cd10();
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public void cst_grp_cd10(String value) {
		bp_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public String cst_grp_nm10() {
		return bp_grp_p().bp_grp_nm10();
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public void cst_grp_nm10(String value) {
		bp_grp_p().bp_grp_nm10(value);
	}

}

