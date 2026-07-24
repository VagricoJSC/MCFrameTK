package mcframe.serverMSBB.MSBBL1040;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

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
	 * Sales project remarks 案件備考.<p>
	 *
	 */
	public static final String $wrk_rmrks = "wrk_rmrks";
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
	 * Budget FROM 予算ＦＲＯＭ.<p>
	 *
	 */
	public static final String $budget_fr = "budget_fr";
	/**
	 * Budget TO 予算ＴＯ.<p>
	 *
	 */
	public static final String $budget_to = "budget_to";
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
	 * Include cancelled 取消済含む.<p>
	 *
	 */
	public static final String $inc_can_flg = "inc_can_flg";
	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public static final String $cst_grp_flg1 = "cst_grp_flg1";
	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public static final String $cst_grp_cd1 = "cst_grp_cd1";
	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public static final String $cst_grp_nm1 = "cst_grp_nm1";
	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public static final String $cst_grp_flg2 = "cst_grp_flg2";
	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public static final String $cst_grp_cd2 = "cst_grp_cd2";
	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public static final String $cst_grp_nm2 = "cst_grp_nm2";
	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public static final String $cst_grp_flg3 = "cst_grp_flg3";
	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public static final String $cst_grp_cd3 = "cst_grp_cd3";
	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public static final String $cst_grp_nm3 = "cst_grp_nm3";
	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public static final String $cst_grp_flg4 = "cst_grp_flg4";
	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public static final String $cst_grp_cd4 = "cst_grp_cd4";
	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public static final String $cst_grp_nm4 = "cst_grp_nm4";
	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public static final String $cst_grp_flg5 = "cst_grp_flg5";
	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public static final String $cst_grp_cd5 = "cst_grp_cd5";
	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public static final String $cst_grp_nm5 = "cst_grp_nm5";
	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public static final String $cst_grp_flg6 = "cst_grp_flg6";
	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public static final String $cst_grp_cd6 = "cst_grp_cd6";
	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public static final String $cst_grp_nm6 = "cst_grp_nm6";
	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public static final String $cst_grp_flg7 = "cst_grp_flg7";
	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public static final String $cst_grp_cd7 = "cst_grp_cd7";
	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public static final String $cst_grp_nm7 = "cst_grp_nm7";
	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public static final String $cst_grp_flg8 = "cst_grp_flg8";
	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public static final String $cst_grp_cd8 = "cst_grp_cd8";
	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public static final String $cst_grp_nm8 = "cst_grp_nm8";
	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public static final String $cst_grp_flg9 = "cst_grp_flg9";
	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public static final String $cst_grp_cd9 = "cst_grp_cd9";
	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public static final String $cst_grp_nm9 = "cst_grp_nm9";
	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public static final String $cst_grp_flg10 = "cst_grp_flg10";
	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $cst_grp_cd10 = "cst_grp_cd10";
	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public static final String $cst_grp_nm10 = "cst_grp_nm10";


	public static final MCMeta st_dt_fr_META = createCommonMeta($st_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_dt_to_META = createCommonMeta($st_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_fr_META = createCommonMeta($end_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_to_META = createCommonMeta($end_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta wrk_rmrks_META = createCommonMeta($wrk_rmrks, mcframe.commonMS.meta.MS_META.WRK_RMRKS);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta wrk_sts_cd_META = createCommonMeta($wrk_sts_cd, mcframe.commonMS.meta.MS_META.WRK_MNG_CD);
	public static final MCMeta wrk_sts_nm_META = createCommonMeta($wrk_sts_nm, mcframe.commonMS.meta.MS_META.WRK_MNG_NM);
	public static final MCMeta slo_acc_cd_META = createCommonMeta($slo_acc_cd, mcframe.commonMS.meta.MS_META.WRK_MNG_CD);
	public static final MCMeta slo_acc_nm_META = createCommonMeta($slo_acc_nm, mcframe.commonMS.meta.MS_META.WRK_MNG_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta budget_fr_META = createCommonMeta($budget_fr, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta budget_to_META = createCommonMeta($budget_to, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slo_rsn_META = createCommonMeta($slo_rsn, mcframe.commonMS.meta.MS_META.WRK_SLO_RSN);
	public static final MCMeta fail_rsn_META = createCommonMeta($fail_rsn, mcframe.commonMS.meta.MS_META.WRK_FAIL_RSN);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.WRK_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.WRK_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.WRK_SUB_CHAR3);
	public static final MCMeta inc_can_flg_META = createCommonMeta($inc_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_flg1_META = createCommonMeta($cst_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd1_META = createCommonMeta($cst_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm1_META = createCommonMeta($cst_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg2_META = createCommonMeta($cst_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd2_META = createCommonMeta($cst_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm2_META = createCommonMeta($cst_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg3_META = createCommonMeta($cst_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd3_META = createCommonMeta($cst_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm3_META = createCommonMeta($cst_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg4_META = createCommonMeta($cst_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd4_META = createCommonMeta($cst_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm4_META = createCommonMeta($cst_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg5_META = createCommonMeta($cst_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd5_META = createCommonMeta($cst_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm5_META = createCommonMeta($cst_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg6_META = createCommonMeta($cst_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd6_META = createCommonMeta($cst_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm6_META = createCommonMeta($cst_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg7_META = createCommonMeta($cst_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd7_META = createCommonMeta($cst_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm7_META = createCommonMeta($cst_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg8_META = createCommonMeta($cst_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd8_META = createCommonMeta($cst_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm8_META = createCommonMeta($cst_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg9_META = createCommonMeta($cst_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd9_META = createCommonMeta($cst_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm9_META = createCommonMeta($cst_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg10_META = createCommonMeta($cst_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd10_META = createCommonMeta($cst_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm10_META = createCommonMeta($cst_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			st_dt_fr_META,
			st_dt_to_META,
			end_dt_fr_META,
			end_dt_to_META,
			cst_cd_META,
			cst_nm_META,
			wrk_rmrks_META,
			wrk_no_META,
			wrk_nm_META,
			wrk_sts_cd_META,
			wrk_sts_nm_META,
			slo_acc_cd_META,
			slo_acc_nm_META,
			cur_cd_META,
			cur_nm_META,
			budget_fr_META,
			budget_to_META,
			slo_rsn_META,
			fail_rsn_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			inc_can_flg_META,
			cst_grp_flg1_META,
			cst_grp_cd1_META,
			cst_grp_nm1_META,
			cst_grp_flg2_META,
			cst_grp_cd2_META,
			cst_grp_nm2_META,
			cst_grp_flg3_META,
			cst_grp_cd3_META,
			cst_grp_nm3_META,
			cst_grp_flg4_META,
			cst_grp_cd4_META,
			cst_grp_nm4_META,
			cst_grp_flg5_META,
			cst_grp_cd5_META,
			cst_grp_nm5_META,
			cst_grp_flg6_META,
			cst_grp_cd6_META,
			cst_grp_nm6_META,
			cst_grp_flg7_META,
			cst_grp_cd7_META,
			cst_grp_nm7_META,
			cst_grp_flg8_META,
			cst_grp_cd8_META,
			cst_grp_nm8_META,
			cst_grp_flg9_META,
			cst_grp_cd9_META,
			cst_grp_nm9_META,
			cst_grp_flg10_META,
			cst_grp_cd10_META,
			cst_grp_nm10_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
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
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 4, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 4, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 5, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 5, $cst_nm, value);
	}


	/**
	 * Sales project remarks 案件備考.<p>
	 *
	 */
	public String wrk_rmrks() {
		return getConstString(offset + 6, $wrk_rmrks);
	}

	/**
	 * Sales project remarks 案件備考.<p>
	 *
	 */
	public void wrk_rmrks(String value) {
		setConstString(offset + 6, $wrk_rmrks, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 7, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 7, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 8, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 8, $wrk_nm, value);
	}


	/**
	 * Sales project status cd. 案件状況ＣＤ.<p>
	 *
	 */
	public String wrk_sts_cd() {
		return getConstString(offset + 9, $wrk_sts_cd);
	}

	/**
	 * Sales project status cd. 案件状況ＣＤ.<p>
	 *
	 */
	public void wrk_sts_cd(String value) {
		setConstString(offset + 9, $wrk_sts_cd, value);
	}


	/**
	 * Sales project status name 案件状況名.<p>
	 *
	 */
	public String wrk_sts_nm() {
		return getConstString(offset + 10, $wrk_sts_nm);
	}

	/**
	 * Sales project status name 案件状況名.<p>
	 *
	 */
	public void wrk_sts_nm(String value) {
		setConstString(offset + 10, $wrk_sts_nm, value);
	}


	/**
	 * Sales order accuracy cd. 受注確度ＣＤ.<p>
	 *
	 */
	public String slo_acc_cd() {
		return getConstString(offset + 11, $slo_acc_cd);
	}

	/**
	 * Sales order accuracy cd. 受注確度ＣＤ.<p>
	 *
	 */
	public void slo_acc_cd(String value) {
		setConstString(offset + 11, $slo_acc_cd, value);
	}


	/**
	 * Sales order accuracy name 受注確度名.<p>
	 *
	 */
	public String slo_acc_nm() {
		return getConstString(offset + 12, $slo_acc_nm);
	}

	/**
	 * Sales order accuracy name 受注確度名.<p>
	 *
	 */
	public void slo_acc_nm(String value) {
		setConstString(offset + 12, $slo_acc_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 13, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 13, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 14, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 14, $cur_nm, value);
	}


	/**
	 * Budget FROM 予算ＦＲＯＭ.<p>
	 *
	 */
	public MCNumber budget_fr() {
		return getConstNumber(offset + 15, $budget_fr);
	}

	/**
	 * Budget FROM 予算ＦＲＯＭ.<p>
	 *
	 */
	public void budget_fr(MCNumber value) {
		setConstNumber(offset + 15, $budget_fr, value);
	}

	/**
	 * Budget FROM 予算ＦＲＯＭ.<p>
	 *
	 */
	public void budget_fr(int value) {
		setConstNumber(offset + 15, $budget_fr, value);
	}

	/**
	 * Budget FROM 予算ＦＲＯＭ.<p>
	 *
	 */
	public void budget_fr(long value) {
		setConstNumber(offset + 15, $budget_fr, value);
	}

	/**
	 * Budget FROM 予算ＦＲＯＭ.<p>
	 *
	 */
	public void budget_fr(float value) {
		setConstNumber(offset + 15, $budget_fr, value);
	}

	/**
	 * Budget FROM 予算ＦＲＯＭ.<p>
	 *
	 */
	public void budget_fr(double value) {
		setConstNumber(offset + 15, $budget_fr, value);
	}


	/**
	 * Budget TO 予算ＴＯ.<p>
	 *
	 */
	public MCNumber budget_to() {
		return getConstNumber(offset + 16, $budget_to);
	}

	/**
	 * Budget TO 予算ＴＯ.<p>
	 *
	 */
	public void budget_to(MCNumber value) {
		setConstNumber(offset + 16, $budget_to, value);
	}

	/**
	 * Budget TO 予算ＴＯ.<p>
	 *
	 */
	public void budget_to(int value) {
		setConstNumber(offset + 16, $budget_to, value);
	}

	/**
	 * Budget TO 予算ＴＯ.<p>
	 *
	 */
	public void budget_to(long value) {
		setConstNumber(offset + 16, $budget_to, value);
	}

	/**
	 * Budget TO 予算ＴＯ.<p>
	 *
	 */
	public void budget_to(float value) {
		setConstNumber(offset + 16, $budget_to, value);
	}

	/**
	 * Budget TO 予算ＴＯ.<p>
	 *
	 */
	public void budget_to(double value) {
		setConstNumber(offset + 16, $budget_to, value);
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
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 19, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 19, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 20, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 20, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 21, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 21, $sub_char3, value);
	}


	/**
	 * Include cancelled 取消済含む.<p>
	 *
	 */
	public boolean inc_can_flg() {
		return getConstBoolean(offset + 22, $inc_can_flg);
	}

	/**
	 * Include cancelled 取消済含む.<p>
	 *
	 */
	public void inc_can_flg(boolean value) {
		setConstBoolean(offset + 22, $inc_can_flg, value);
	}


	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public boolean cst_grp_flg1() {
		return getConstBoolean(offset + 23, $cst_grp_flg1);
	}

	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public void cst_grp_flg1(boolean value) {
		setConstBoolean(offset + 23, $cst_grp_flg1, value);
	}


	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public String cst_grp_cd1() {
		return getConstString(offset + 24, $cst_grp_cd1);
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public void cst_grp_cd1(String value) {
		setConstString(offset + 24, $cst_grp_cd1, value);
	}


	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public String cst_grp_nm1() {
		return getConstString(offset + 25, $cst_grp_nm1);
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public void cst_grp_nm1(String value) {
		setConstString(offset + 25, $cst_grp_nm1, value);
	}


	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public boolean cst_grp_flg2() {
		return getConstBoolean(offset + 26, $cst_grp_flg2);
	}

	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public void cst_grp_flg2(boolean value) {
		setConstBoolean(offset + 26, $cst_grp_flg2, value);
	}


	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public String cst_grp_cd2() {
		return getConstString(offset + 27, $cst_grp_cd2);
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public void cst_grp_cd2(String value) {
		setConstString(offset + 27, $cst_grp_cd2, value);
	}


	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public String cst_grp_nm2() {
		return getConstString(offset + 28, $cst_grp_nm2);
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public void cst_grp_nm2(String value) {
		setConstString(offset + 28, $cst_grp_nm2, value);
	}


	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public boolean cst_grp_flg3() {
		return getConstBoolean(offset + 29, $cst_grp_flg3);
	}

	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public void cst_grp_flg3(boolean value) {
		setConstBoolean(offset + 29, $cst_grp_flg3, value);
	}


	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public String cst_grp_cd3() {
		return getConstString(offset + 30, $cst_grp_cd3);
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public void cst_grp_cd3(String value) {
		setConstString(offset + 30, $cst_grp_cd3, value);
	}


	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public String cst_grp_nm3() {
		return getConstString(offset + 31, $cst_grp_nm3);
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public void cst_grp_nm3(String value) {
		setConstString(offset + 31, $cst_grp_nm3, value);
	}


	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public boolean cst_grp_flg4() {
		return getConstBoolean(offset + 32, $cst_grp_flg4);
	}

	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public void cst_grp_flg4(boolean value) {
		setConstBoolean(offset + 32, $cst_grp_flg4, value);
	}


	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public String cst_grp_cd4() {
		return getConstString(offset + 33, $cst_grp_cd4);
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public void cst_grp_cd4(String value) {
		setConstString(offset + 33, $cst_grp_cd4, value);
	}


	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public String cst_grp_nm4() {
		return getConstString(offset + 34, $cst_grp_nm4);
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public void cst_grp_nm4(String value) {
		setConstString(offset + 34, $cst_grp_nm4, value);
	}


	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public boolean cst_grp_flg5() {
		return getConstBoolean(offset + 35, $cst_grp_flg5);
	}

	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public void cst_grp_flg5(boolean value) {
		setConstBoolean(offset + 35, $cst_grp_flg5, value);
	}


	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public String cst_grp_cd5() {
		return getConstString(offset + 36, $cst_grp_cd5);
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public void cst_grp_cd5(String value) {
		setConstString(offset + 36, $cst_grp_cd5, value);
	}


	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public String cst_grp_nm5() {
		return getConstString(offset + 37, $cst_grp_nm5);
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public void cst_grp_nm5(String value) {
		setConstString(offset + 37, $cst_grp_nm5, value);
	}


	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public boolean cst_grp_flg6() {
		return getConstBoolean(offset + 38, $cst_grp_flg6);
	}

	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public void cst_grp_flg6(boolean value) {
		setConstBoolean(offset + 38, $cst_grp_flg6, value);
	}


	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public String cst_grp_cd6() {
		return getConstString(offset + 39, $cst_grp_cd6);
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public void cst_grp_cd6(String value) {
		setConstString(offset + 39, $cst_grp_cd6, value);
	}


	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public String cst_grp_nm6() {
		return getConstString(offset + 40, $cst_grp_nm6);
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public void cst_grp_nm6(String value) {
		setConstString(offset + 40, $cst_grp_nm6, value);
	}


	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public boolean cst_grp_flg7() {
		return getConstBoolean(offset + 41, $cst_grp_flg7);
	}

	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public void cst_grp_flg7(boolean value) {
		setConstBoolean(offset + 41, $cst_grp_flg7, value);
	}


	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public String cst_grp_cd7() {
		return getConstString(offset + 42, $cst_grp_cd7);
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public void cst_grp_cd7(String value) {
		setConstString(offset + 42, $cst_grp_cd7, value);
	}


	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public String cst_grp_nm7() {
		return getConstString(offset + 43, $cst_grp_nm7);
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public void cst_grp_nm7(String value) {
		setConstString(offset + 43, $cst_grp_nm7, value);
	}


	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public boolean cst_grp_flg8() {
		return getConstBoolean(offset + 44, $cst_grp_flg8);
	}

	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public void cst_grp_flg8(boolean value) {
		setConstBoolean(offset + 44, $cst_grp_flg8, value);
	}


	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public String cst_grp_cd8() {
		return getConstString(offset + 45, $cst_grp_cd8);
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public void cst_grp_cd8(String value) {
		setConstString(offset + 45, $cst_grp_cd8, value);
	}


	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public String cst_grp_nm8() {
		return getConstString(offset + 46, $cst_grp_nm8);
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public void cst_grp_nm8(String value) {
		setConstString(offset + 46, $cst_grp_nm8, value);
	}


	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public boolean cst_grp_flg9() {
		return getConstBoolean(offset + 47, $cst_grp_flg9);
	}

	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public void cst_grp_flg9(boolean value) {
		setConstBoolean(offset + 47, $cst_grp_flg9, value);
	}


	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public String cst_grp_cd9() {
		return getConstString(offset + 48, $cst_grp_cd9);
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public void cst_grp_cd9(String value) {
		setConstString(offset + 48, $cst_grp_cd9, value);
	}


	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public String cst_grp_nm9() {
		return getConstString(offset + 49, $cst_grp_nm9);
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public void cst_grp_nm9(String value) {
		setConstString(offset + 49, $cst_grp_nm9, value);
	}


	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public boolean cst_grp_flg10() {
		return getConstBoolean(offset + 50, $cst_grp_flg10);
	}

	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public void cst_grp_flg10(boolean value) {
		setConstBoolean(offset + 50, $cst_grp_flg10, value);
	}


	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public String cst_grp_cd10() {
		return getConstString(offset + 51, $cst_grp_cd10);
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public void cst_grp_cd10(String value) {
		setConstString(offset + 51, $cst_grp_cd10, value);
	}


	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public String cst_grp_nm10() {
		return getConstString(offset + 52, $cst_grp_nm10);
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public void cst_grp_nm10(String value) {
		setConstString(offset + 52, $cst_grp_nm10, value);
	}


	public String getString(String name) {
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($wrk_rmrks.equalsIgnoreCase(name)) {
			return wrk_rmrks();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
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
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			return cst_grp_cd1();
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			return cst_grp_nm1();
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			return cst_grp_cd2();
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			return cst_grp_nm2();
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			return cst_grp_cd3();
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			return cst_grp_nm3();
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			return cst_grp_cd4();
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			return cst_grp_nm4();
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			return cst_grp_cd5();
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			return cst_grp_nm5();
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			return cst_grp_cd6();
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			return cst_grp_nm6();
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			return cst_grp_cd7();
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			return cst_grp_nm7();
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			return cst_grp_cd8();
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			return cst_grp_nm8();
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			return cst_grp_cd9();
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			return cst_grp_nm9();
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			return cst_grp_cd10();
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			return cst_grp_nm10();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($budget_fr.equalsIgnoreCase(name)) {
			return budget_fr();
		}
		if ($budget_to.equalsIgnoreCase(name)) {
			return budget_to();
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
		if ($cst_grp_flg1.equalsIgnoreCase(name)) {
			return cst_grp_flg1();
		}
		if ($cst_grp_flg2.equalsIgnoreCase(name)) {
			return cst_grp_flg2();
		}
		if ($cst_grp_flg3.equalsIgnoreCase(name)) {
			return cst_grp_flg3();
		}
		if ($cst_grp_flg4.equalsIgnoreCase(name)) {
			return cst_grp_flg4();
		}
		if ($cst_grp_flg5.equalsIgnoreCase(name)) {
			return cst_grp_flg5();
		}
		if ($cst_grp_flg6.equalsIgnoreCase(name)) {
			return cst_grp_flg6();
		}
		if ($cst_grp_flg7.equalsIgnoreCase(name)) {
			return cst_grp_flg7();
		}
		if ($cst_grp_flg8.equalsIgnoreCase(name)) {
			return cst_grp_flg8();
		}
		if ($cst_grp_flg9.equalsIgnoreCase(name)) {
			return cst_grp_flg9();
		}
		if ($cst_grp_flg10.equalsIgnoreCase(name)) {
			return cst_grp_flg10();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($wrk_rmrks.equalsIgnoreCase(name)) {
			return wrk_rmrks();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
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
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			return cst_grp_cd1();
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			return cst_grp_nm1();
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			return cst_grp_cd2();
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			return cst_grp_nm2();
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			return cst_grp_cd3();
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			return cst_grp_nm3();
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			return cst_grp_cd4();
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			return cst_grp_nm4();
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			return cst_grp_cd5();
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			return cst_grp_nm5();
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			return cst_grp_cd6();
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			return cst_grp_nm6();
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			return cst_grp_cd7();
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			return cst_grp_nm7();
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			return cst_grp_cd8();
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			return cst_grp_nm8();
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			return cst_grp_cd9();
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			return cst_grp_nm9();
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			return cst_grp_cd10();
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			return cst_grp_nm10();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($budget_fr.equalsIgnoreCase(name)) {
			return budget_fr();
		}
		if ($budget_to.equalsIgnoreCase(name)) {
			return budget_to();
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
		if ($cst_grp_flg1.equalsIgnoreCase(name)) {
			return cst_grp_flg1();
		}
		if ($cst_grp_flg2.equalsIgnoreCase(name)) {
			return cst_grp_flg2();
		}
		if ($cst_grp_flg3.equalsIgnoreCase(name)) {
			return cst_grp_flg3();
		}
		if ($cst_grp_flg4.equalsIgnoreCase(name)) {
			return cst_grp_flg4();
		}
		if ($cst_grp_flg5.equalsIgnoreCase(name)) {
			return cst_grp_flg5();
		}
		if ($cst_grp_flg6.equalsIgnoreCase(name)) {
			return cst_grp_flg6();
		}
		if ($cst_grp_flg7.equalsIgnoreCase(name)) {
			return cst_grp_flg7();
		}
		if ($cst_grp_flg8.equalsIgnoreCase(name)) {
			return cst_grp_flg8();
		}
		if ($cst_grp_flg9.equalsIgnoreCase(name)) {
			return cst_grp_flg9();
		}
		if ($cst_grp_flg10.equalsIgnoreCase(name)) {
			return cst_grp_flg10();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($wrk_rmrks.equalsIgnoreCase(name)) {
			wrk_rmrks(value);
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
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			cst_grp_cd1(value);
			return;
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			cst_grp_nm1(value);
			return;
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			cst_grp_cd2(value);
			return;
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			cst_grp_nm2(value);
			return;
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			cst_grp_cd3(value);
			return;
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			cst_grp_nm3(value);
			return;
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			cst_grp_cd4(value);
			return;
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			cst_grp_nm4(value);
			return;
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			cst_grp_cd5(value);
			return;
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			cst_grp_nm5(value);
			return;
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			cst_grp_cd6(value);
			return;
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			cst_grp_nm6(value);
			return;
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			cst_grp_cd7(value);
			return;
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			cst_grp_nm7(value);
			return;
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			cst_grp_cd8(value);
			return;
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			cst_grp_nm8(value);
			return;
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			cst_grp_cd9(value);
			return;
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			cst_grp_nm9(value);
			return;
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			cst_grp_cd10(value);
			return;
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			cst_grp_nm10(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($budget_fr.equalsIgnoreCase(name)) {
			budget_fr(value);
			return;
		}
		if ($budget_to.equalsIgnoreCase(name)) {
			budget_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($budget_fr.equalsIgnoreCase(name)) {
			budget_fr(value);
			return;
		}
		if ($budget_to.equalsIgnoreCase(name)) {
			budget_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($budget_fr.equalsIgnoreCase(name)) {
			budget_fr(value);
			return;
		}
		if ($budget_to.equalsIgnoreCase(name)) {
			budget_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($budget_fr.equalsIgnoreCase(name)) {
			budget_fr(value);
			return;
		}
		if ($budget_to.equalsIgnoreCase(name)) {
			budget_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($budget_fr.equalsIgnoreCase(name)) {
			budget_fr(value);
			return;
		}
		if ($budget_to.equalsIgnoreCase(name)) {
			budget_to(value);
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
		if ($cst_grp_flg1.equalsIgnoreCase(name)) {
			cst_grp_flg1(value);
			return;
		}
		if ($cst_grp_flg2.equalsIgnoreCase(name)) {
			cst_grp_flg2(value);
			return;
		}
		if ($cst_grp_flg3.equalsIgnoreCase(name)) {
			cst_grp_flg3(value);
			return;
		}
		if ($cst_grp_flg4.equalsIgnoreCase(name)) {
			cst_grp_flg4(value);
			return;
		}
		if ($cst_grp_flg5.equalsIgnoreCase(name)) {
			cst_grp_flg5(value);
			return;
		}
		if ($cst_grp_flg6.equalsIgnoreCase(name)) {
			cst_grp_flg6(value);
			return;
		}
		if ($cst_grp_flg7.equalsIgnoreCase(name)) {
			cst_grp_flg7(value);
			return;
		}
		if ($cst_grp_flg8.equalsIgnoreCase(name)) {
			cst_grp_flg8(value);
			return;
		}
		if ($cst_grp_flg9.equalsIgnoreCase(name)) {
			cst_grp_flg9(value);
			return;
		}
		if ($cst_grp_flg10.equalsIgnoreCase(name)) {
			cst_grp_flg10(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($wrk_rmrks.equalsIgnoreCase(name)) {
			wrk_rmrks(value);
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
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			cst_grp_cd1(value);
			return;
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			cst_grp_nm1(value);
			return;
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			cst_grp_cd2(value);
			return;
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			cst_grp_nm2(value);
			return;
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			cst_grp_cd3(value);
			return;
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			cst_grp_nm3(value);
			return;
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			cst_grp_cd4(value);
			return;
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			cst_grp_nm4(value);
			return;
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			cst_grp_cd5(value);
			return;
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			cst_grp_nm5(value);
			return;
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			cst_grp_cd6(value);
			return;
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			cst_grp_nm6(value);
			return;
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			cst_grp_cd7(value);
			return;
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			cst_grp_nm7(value);
			return;
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			cst_grp_cd8(value);
			return;
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			cst_grp_nm8(value);
			return;
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			cst_grp_cd9(value);
			return;
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			cst_grp_nm9(value);
			return;
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			cst_grp_cd10(value);
			return;
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			cst_grp_nm10(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($budget_fr.equalsIgnoreCase(name)) {
			budget_fr(value);
			return;
		}
		if ($budget_to.equalsIgnoreCase(name)) {
			budget_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($budget_fr.equalsIgnoreCase(name)) {
			budget_fr(value);
			return;
		}
		if ($budget_to.equalsIgnoreCase(name)) {
			budget_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($budget_fr.equalsIgnoreCase(name)) {
			budget_fr(value);
			return;
		}
		if ($budget_to.equalsIgnoreCase(name)) {
			budget_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($budget_fr.equalsIgnoreCase(name)) {
			budget_fr(value);
			return;
		}
		if ($budget_to.equalsIgnoreCase(name)) {
			budget_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($budget_fr.equalsIgnoreCase(name)) {
			budget_fr(value);
			return;
		}
		if ($budget_to.equalsIgnoreCase(name)) {
			budget_to(value);
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
		if ($cst_grp_flg1.equalsIgnoreCase(name)) {
			cst_grp_flg1(value);
			return;
		}
		if ($cst_grp_flg2.equalsIgnoreCase(name)) {
			cst_grp_flg2(value);
			return;
		}
		if ($cst_grp_flg3.equalsIgnoreCase(name)) {
			cst_grp_flg3(value);
			return;
		}
		if ($cst_grp_flg4.equalsIgnoreCase(name)) {
			cst_grp_flg4(value);
			return;
		}
		if ($cst_grp_flg5.equalsIgnoreCase(name)) {
			cst_grp_flg5(value);
			return;
		}
		if ($cst_grp_flg6.equalsIgnoreCase(name)) {
			cst_grp_flg6(value);
			return;
		}
		if ($cst_grp_flg7.equalsIgnoreCase(name)) {
			cst_grp_flg7(value);
			return;
		}
		if ($cst_grp_flg8.equalsIgnoreCase(name)) {
			cst_grp_flg8(value);
			return;
		}
		if ($cst_grp_flg9.equalsIgnoreCase(name)) {
			cst_grp_flg9(value);
			return;
		}
		if ($cst_grp_flg10.equalsIgnoreCase(name)) {
			cst_grp_flg10(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

