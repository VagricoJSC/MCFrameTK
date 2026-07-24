package mcframe.serverMSBE.MSBEL1430;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public static final String $ship_schd_dt = "ship_schd_dt";
	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public static final String $ship_schd_hm = "ship_schd_hm";
	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public static final String $dlv_schd_dt = "dlv_schd_dt";
	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public static final String $dlv_schd_hm = "dlv_schd_hm";
	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public static final String $ship_wk_cd = "ship_wk_cd";
	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public static final String $ship_wk_nm = "ship_wk_nm";
	/**
	 * Number of unordered receiving points 未指図送付先数.<p>
	 *
	 */
	public static final String $not_inst_ship_to_cnt = "not_inst_ship_to_cnt";
	/**
	 * Number of unordered details 未指図明細数.<p>
	 *
	 */
	public static final String $not_inst_d_cnt = "not_inst_d_cnt";
	/**
	 * Unordered weight 未指図重量.<p>
	 *
	 */
	public static final String $not_inst_wt = "not_inst_wt";
	/**
	 * Unordered volume 未指図容積.<p>
	 *
	 */
	public static final String $not_inst_dim = "not_inst_dim";
	/**
	 * Number of ordered receiving point 指図済送付先数.<p>
	 *
	 */
	public static final String $inst_ship_to_cnt = "inst_ship_to_cnt";
	/**
	 * Number of ordered details 指図済明細数.<p>
	 *
	 */
	public static final String $inst_d_cnt = "inst_d_cnt";
	/**
	 * Ordered weight 指図済重量.<p>
	 *
	 */
	public static final String $inst_wt = "inst_wt";
	/**
	 * Ordered volume 指図済容積.<p>
	 *
	 */
	public static final String $inst_dim = "inst_dim";
	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public static final String $pr_sts_typ = "pr_sts_typ";
	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public static final String $ship_to_id_typ = "ship_to_id_typ";
	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public static final String $ship_to_id_cd = "ship_to_id_cd";
	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public static final String $cnt = "cnt";
	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public static final String $d_cnt = "d_cnt";
	/**
	 * Weight 重量.<p>
	 *
	 */
	public static final String $wt = "wt";
	/**
	 * Volume 容積.<p>
	 *
	 */
	public static final String $dim = "dim";


	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta ship_schd_dt_META = createCommonMeta($ship_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_schd_hm_META = createCommonMeta($ship_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta dlv_schd_dt_META = createCommonMeta($dlv_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_schd_hm_META = createCommonMeta($dlv_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta ship_wk_cd_META = createCommonMeta($ship_wk_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_CD);
	public static final MCMeta ship_wk_nm_META = createCommonMeta($ship_wk_nm, mcframe.commonMA.meta.MA_META.SHIP_WK_NM);
	public static final MCMeta not_inst_ship_to_cnt_META = createCommonMeta($not_inst_ship_to_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta not_inst_d_cnt_META = createCommonMeta($not_inst_d_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta not_inst_wt_META = createCommonMeta($not_inst_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta not_inst_dim_META = createCommonMeta($not_inst_dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta inst_ship_to_cnt_META = createCommonMeta($inst_ship_to_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta inst_d_cnt_META = createCommonMeta($inst_d_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta inst_wt_META = createCommonMeta($inst_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta inst_dim_META = createCommonMeta($inst_dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta pr_sts_typ_META = createCommonMeta($pr_sts_typ, mcframe.commonMS.meta.MS_META.PR_STS_TYP);
	public static final MCMeta ship_to_id_typ_META = createCommonMeta($ship_to_id_typ, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP);
	public static final MCMeta ship_to_id_cd_META = createCommonMeta($ship_to_id_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta cnt_META = createCommonMeta($cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta d_cnt_META = createCommonMeta($d_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta wt_META = createCommonMeta($wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta dim_META = createCommonMeta($dim, mcframe.commonMA.meta.MA_META.DIM);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			lg_grp_cd_META,
			lg_grp_nm_META,
			ship_schd_dt_META,
			ship_schd_hm_META,
			dlv_schd_dt_META,
			dlv_schd_hm_META,
			ship_wk_cd_META,
			ship_wk_nm_META,
			not_inst_ship_to_cnt_META,
			not_inst_d_cnt_META,
			not_inst_wt_META,
			not_inst_dim_META,
			inst_ship_to_cnt_META,
			inst_d_cnt_META,
			inst_wt_META,
			inst_dim_META,
			pr_sts_typ_META,
			ship_to_id_typ_META,
			ship_to_id_cd_META,
			cnt_META,
			d_cnt_META,
			wt_META,
			dim_META
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 0, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 0, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 1, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 1, $lg_grp_nm, value);
	}


	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public MCDate ship_schd_dt() {
		return getConstDate(offset + 2, $ship_schd_dt);
	}

	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public void ship_schd_dt(MCDate value) {
		setConstDate(offset + 2, $ship_schd_dt, value);
	}


	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public MCDate ship_schd_hm() {
		return getConstDate(offset + 3, $ship_schd_hm);
	}

	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public void ship_schd_hm(MCDate value) {
		setConstDate(offset + 3, $ship_schd_hm, value);
	}


	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public MCDate dlv_schd_dt() {
		return getConstDate(offset + 4, $dlv_schd_dt);
	}

	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public void dlv_schd_dt(MCDate value) {
		setConstDate(offset + 4, $dlv_schd_dt, value);
	}


	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public MCDate dlv_schd_hm() {
		return getConstDate(offset + 5, $dlv_schd_hm);
	}

	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public void dlv_schd_hm(MCDate value) {
		setConstDate(offset + 5, $dlv_schd_hm, value);
	}


	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public String ship_wk_cd() {
		return getConstString(offset + 6, $ship_wk_cd);
	}

	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public void ship_wk_cd(String value) {
		setConstString(offset + 6, $ship_wk_cd, value);
	}


	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public String ship_wk_nm() {
		return getConstString(offset + 7, $ship_wk_nm);
	}

	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public void ship_wk_nm(String value) {
		setConstString(offset + 7, $ship_wk_nm, value);
	}


	/**
	 * Number of unordered receiving points 未指図送付先数.<p>
	 *
	 */
	public MCNumber not_inst_ship_to_cnt() {
		return getConstNumber(offset + 8, $not_inst_ship_to_cnt);
	}

	/**
	 * Number of unordered receiving points 未指図送付先数.<p>
	 *
	 */
	public void not_inst_ship_to_cnt(MCNumber value) {
		setConstNumber(offset + 8, $not_inst_ship_to_cnt, value);
	}

	/**
	 * Number of unordered receiving points 未指図送付先数.<p>
	 *
	 */
	public void not_inst_ship_to_cnt(int value) {
		setConstNumber(offset + 8, $not_inst_ship_to_cnt, value);
	}

	/**
	 * Number of unordered receiving points 未指図送付先数.<p>
	 *
	 */
	public void not_inst_ship_to_cnt(long value) {
		setConstNumber(offset + 8, $not_inst_ship_to_cnt, value);
	}

	/**
	 * Number of unordered receiving points 未指図送付先数.<p>
	 *
	 */
	public void not_inst_ship_to_cnt(float value) {
		setConstNumber(offset + 8, $not_inst_ship_to_cnt, value);
	}

	/**
	 * Number of unordered receiving points 未指図送付先数.<p>
	 *
	 */
	public void not_inst_ship_to_cnt(double value) {
		setConstNumber(offset + 8, $not_inst_ship_to_cnt, value);
	}


	/**
	 * Number of unordered details 未指図明細数.<p>
	 *
	 */
	public MCNumber not_inst_d_cnt() {
		return getConstNumber(offset + 9, $not_inst_d_cnt);
	}

	/**
	 * Number of unordered details 未指図明細数.<p>
	 *
	 */
	public void not_inst_d_cnt(MCNumber value) {
		setConstNumber(offset + 9, $not_inst_d_cnt, value);
	}

	/**
	 * Number of unordered details 未指図明細数.<p>
	 *
	 */
	public void not_inst_d_cnt(int value) {
		setConstNumber(offset + 9, $not_inst_d_cnt, value);
	}

	/**
	 * Number of unordered details 未指図明細数.<p>
	 *
	 */
	public void not_inst_d_cnt(long value) {
		setConstNumber(offset + 9, $not_inst_d_cnt, value);
	}

	/**
	 * Number of unordered details 未指図明細数.<p>
	 *
	 */
	public void not_inst_d_cnt(float value) {
		setConstNumber(offset + 9, $not_inst_d_cnt, value);
	}

	/**
	 * Number of unordered details 未指図明細数.<p>
	 *
	 */
	public void not_inst_d_cnt(double value) {
		setConstNumber(offset + 9, $not_inst_d_cnt, value);
	}


	/**
	 * Unordered weight 未指図重量.<p>
	 *
	 */
	public MCNumber not_inst_wt() {
		return getConstNumber(offset + 10, $not_inst_wt);
	}

	/**
	 * Unordered weight 未指図重量.<p>
	 *
	 */
	public void not_inst_wt(MCNumber value) {
		setConstNumber(offset + 10, $not_inst_wt, value);
	}

	/**
	 * Unordered weight 未指図重量.<p>
	 *
	 */
	public void not_inst_wt(int value) {
		setConstNumber(offset + 10, $not_inst_wt, value);
	}

	/**
	 * Unordered weight 未指図重量.<p>
	 *
	 */
	public void not_inst_wt(long value) {
		setConstNumber(offset + 10, $not_inst_wt, value);
	}

	/**
	 * Unordered weight 未指図重量.<p>
	 *
	 */
	public void not_inst_wt(float value) {
		setConstNumber(offset + 10, $not_inst_wt, value);
	}

	/**
	 * Unordered weight 未指図重量.<p>
	 *
	 */
	public void not_inst_wt(double value) {
		setConstNumber(offset + 10, $not_inst_wt, value);
	}


	/**
	 * Unordered volume 未指図容積.<p>
	 *
	 */
	public MCNumber not_inst_dim() {
		return getConstNumber(offset + 11, $not_inst_dim);
	}

	/**
	 * Unordered volume 未指図容積.<p>
	 *
	 */
	public void not_inst_dim(MCNumber value) {
		setConstNumber(offset + 11, $not_inst_dim, value);
	}

	/**
	 * Unordered volume 未指図容積.<p>
	 *
	 */
	public void not_inst_dim(int value) {
		setConstNumber(offset + 11, $not_inst_dim, value);
	}

	/**
	 * Unordered volume 未指図容積.<p>
	 *
	 */
	public void not_inst_dim(long value) {
		setConstNumber(offset + 11, $not_inst_dim, value);
	}

	/**
	 * Unordered volume 未指図容積.<p>
	 *
	 */
	public void not_inst_dim(float value) {
		setConstNumber(offset + 11, $not_inst_dim, value);
	}

	/**
	 * Unordered volume 未指図容積.<p>
	 *
	 */
	public void not_inst_dim(double value) {
		setConstNumber(offset + 11, $not_inst_dim, value);
	}


	/**
	 * Number of ordered receiving point 指図済送付先数.<p>
	 *
	 */
	public MCNumber inst_ship_to_cnt() {
		return getConstNumber(offset + 12, $inst_ship_to_cnt);
	}

	/**
	 * Number of ordered receiving point 指図済送付先数.<p>
	 *
	 */
	public void inst_ship_to_cnt(MCNumber value) {
		setConstNumber(offset + 12, $inst_ship_to_cnt, value);
	}

	/**
	 * Number of ordered receiving point 指図済送付先数.<p>
	 *
	 */
	public void inst_ship_to_cnt(int value) {
		setConstNumber(offset + 12, $inst_ship_to_cnt, value);
	}

	/**
	 * Number of ordered receiving point 指図済送付先数.<p>
	 *
	 */
	public void inst_ship_to_cnt(long value) {
		setConstNumber(offset + 12, $inst_ship_to_cnt, value);
	}

	/**
	 * Number of ordered receiving point 指図済送付先数.<p>
	 *
	 */
	public void inst_ship_to_cnt(float value) {
		setConstNumber(offset + 12, $inst_ship_to_cnt, value);
	}

	/**
	 * Number of ordered receiving point 指図済送付先数.<p>
	 *
	 */
	public void inst_ship_to_cnt(double value) {
		setConstNumber(offset + 12, $inst_ship_to_cnt, value);
	}


	/**
	 * Number of ordered details 指図済明細数.<p>
	 *
	 */
	public MCNumber inst_d_cnt() {
		return getConstNumber(offset + 13, $inst_d_cnt);
	}

	/**
	 * Number of ordered details 指図済明細数.<p>
	 *
	 */
	public void inst_d_cnt(MCNumber value) {
		setConstNumber(offset + 13, $inst_d_cnt, value);
	}

	/**
	 * Number of ordered details 指図済明細数.<p>
	 *
	 */
	public void inst_d_cnt(int value) {
		setConstNumber(offset + 13, $inst_d_cnt, value);
	}

	/**
	 * Number of ordered details 指図済明細数.<p>
	 *
	 */
	public void inst_d_cnt(long value) {
		setConstNumber(offset + 13, $inst_d_cnt, value);
	}

	/**
	 * Number of ordered details 指図済明細数.<p>
	 *
	 */
	public void inst_d_cnt(float value) {
		setConstNumber(offset + 13, $inst_d_cnt, value);
	}

	/**
	 * Number of ordered details 指図済明細数.<p>
	 *
	 */
	public void inst_d_cnt(double value) {
		setConstNumber(offset + 13, $inst_d_cnt, value);
	}


	/**
	 * Ordered weight 指図済重量.<p>
	 *
	 */
	public MCNumber inst_wt() {
		return getConstNumber(offset + 14, $inst_wt);
	}

	/**
	 * Ordered weight 指図済重量.<p>
	 *
	 */
	public void inst_wt(MCNumber value) {
		setConstNumber(offset + 14, $inst_wt, value);
	}

	/**
	 * Ordered weight 指図済重量.<p>
	 *
	 */
	public void inst_wt(int value) {
		setConstNumber(offset + 14, $inst_wt, value);
	}

	/**
	 * Ordered weight 指図済重量.<p>
	 *
	 */
	public void inst_wt(long value) {
		setConstNumber(offset + 14, $inst_wt, value);
	}

	/**
	 * Ordered weight 指図済重量.<p>
	 *
	 */
	public void inst_wt(float value) {
		setConstNumber(offset + 14, $inst_wt, value);
	}

	/**
	 * Ordered weight 指図済重量.<p>
	 *
	 */
	public void inst_wt(double value) {
		setConstNumber(offset + 14, $inst_wt, value);
	}


	/**
	 * Ordered volume 指図済容積.<p>
	 *
	 */
	public MCNumber inst_dim() {
		return getConstNumber(offset + 15, $inst_dim);
	}

	/**
	 * Ordered volume 指図済容積.<p>
	 *
	 */
	public void inst_dim(MCNumber value) {
		setConstNumber(offset + 15, $inst_dim, value);
	}

	/**
	 * Ordered volume 指図済容積.<p>
	 *
	 */
	public void inst_dim(int value) {
		setConstNumber(offset + 15, $inst_dim, value);
	}

	/**
	 * Ordered volume 指図済容積.<p>
	 *
	 */
	public void inst_dim(long value) {
		setConstNumber(offset + 15, $inst_dim, value);
	}

	/**
	 * Ordered volume 指図済容積.<p>
	 *
	 */
	public void inst_dim(float value) {
		setConstNumber(offset + 15, $inst_dim, value);
	}

	/**
	 * Ordered volume 指図済容積.<p>
	 *
	 */
	public void inst_dim(double value) {
		setConstNumber(offset + 15, $inst_dim, value);
	}


	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public String pr_sts_typ() {
		return getConstString(offset + 16, $pr_sts_typ);
	}

	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public void pr_sts_typ(String value) {
		setConstString(offset + 16, $pr_sts_typ, value);
	}


	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public String ship_to_id_typ() {
		return getConstString(offset + 17, $ship_to_id_typ);
	}

	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public void ship_to_id_typ(String value) {
		setConstString(offset + 17, $ship_to_id_typ, value);
	}


	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public String ship_to_id_cd() {
		return getConstString(offset + 18, $ship_to_id_cd);
	}

	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		setConstString(offset + 18, $ship_to_id_cd, value);
	}


	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public MCNumber cnt() {
		return getConstNumber(offset + 19, $cnt);
	}

	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public void cnt(MCNumber value) {
		setConstNumber(offset + 19, $cnt, value);
	}

	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public void cnt(int value) {
		setConstNumber(offset + 19, $cnt, value);
	}

	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public void cnt(long value) {
		setConstNumber(offset + 19, $cnt, value);
	}

	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public void cnt(float value) {
		setConstNumber(offset + 19, $cnt, value);
	}

	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public void cnt(double value) {
		setConstNumber(offset + 19, $cnt, value);
	}


	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public MCNumber d_cnt() {
		return getConstNumber(offset + 20, $d_cnt);
	}

	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public void d_cnt(MCNumber value) {
		setConstNumber(offset + 20, $d_cnt, value);
	}

	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public void d_cnt(int value) {
		setConstNumber(offset + 20, $d_cnt, value);
	}

	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public void d_cnt(long value) {
		setConstNumber(offset + 20, $d_cnt, value);
	}

	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public void d_cnt(float value) {
		setConstNumber(offset + 20, $d_cnt, value);
	}

	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public void d_cnt(double value) {
		setConstNumber(offset + 20, $d_cnt, value);
	}


	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCNumber wt() {
		return getConstNumber(offset + 21, $wt);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(MCNumber value) {
		setConstNumber(offset + 21, $wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(int value) {
		setConstNumber(offset + 21, $wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(long value) {
		setConstNumber(offset + 21, $wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(float value) {
		setConstNumber(offset + 21, $wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(double value) {
		setConstNumber(offset + 21, $wt, value);
	}


	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCNumber dim() {
		return getConstNumber(offset + 22, $dim);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(MCNumber value) {
		setConstNumber(offset + 22, $dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(int value) {
		setConstNumber(offset + 22, $dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(long value) {
		setConstNumber(offset + 22, $dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(float value) {
		setConstNumber(offset + 22, $dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(double value) {
		setConstNumber(offset + 22, $dim, value);
	}


	public String getString(String name) {
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			return ship_wk_nm();
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($not_inst_ship_to_cnt.equalsIgnoreCase(name)) {
			return not_inst_ship_to_cnt();
		}
		if ($not_inst_d_cnt.equalsIgnoreCase(name)) {
			return not_inst_d_cnt();
		}
		if ($not_inst_wt.equalsIgnoreCase(name)) {
			return not_inst_wt();
		}
		if ($not_inst_dim.equalsIgnoreCase(name)) {
			return not_inst_dim();
		}
		if ($inst_ship_to_cnt.equalsIgnoreCase(name)) {
			return inst_ship_to_cnt();
		}
		if ($inst_d_cnt.equalsIgnoreCase(name)) {
			return inst_d_cnt();
		}
		if ($inst_wt.equalsIgnoreCase(name)) {
			return inst_wt();
		}
		if ($inst_dim.equalsIgnoreCase(name)) {
			return inst_dim();
		}
		if ($cnt.equalsIgnoreCase(name)) {
			return cnt();
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			return d_cnt();
		}
		if ($wt.equalsIgnoreCase(name)) {
			return wt();
		}
		if ($dim.equalsIgnoreCase(name)) {
			return dim();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ship_schd_dt.equalsIgnoreCase(name)) {
			return ship_schd_dt();
		}
		if ($ship_schd_hm.equalsIgnoreCase(name)) {
			return ship_schd_hm();
		}
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			return dlv_schd_dt();
		}
		if ($dlv_schd_hm.equalsIgnoreCase(name)) {
			return dlv_schd_hm();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			return ship_wk_nm();
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($not_inst_ship_to_cnt.equalsIgnoreCase(name)) {
			return not_inst_ship_to_cnt();
		}
		if ($not_inst_d_cnt.equalsIgnoreCase(name)) {
			return not_inst_d_cnt();
		}
		if ($not_inst_wt.equalsIgnoreCase(name)) {
			return not_inst_wt();
		}
		if ($not_inst_dim.equalsIgnoreCase(name)) {
			return not_inst_dim();
		}
		if ($inst_ship_to_cnt.equalsIgnoreCase(name)) {
			return inst_ship_to_cnt();
		}
		if ($inst_d_cnt.equalsIgnoreCase(name)) {
			return inst_d_cnt();
		}
		if ($inst_wt.equalsIgnoreCase(name)) {
			return inst_wt();
		}
		if ($inst_dim.equalsIgnoreCase(name)) {
			return inst_dim();
		}
		if ($cnt.equalsIgnoreCase(name)) {
			return cnt();
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			return d_cnt();
		}
		if ($wt.equalsIgnoreCase(name)) {
			return wt();
		}
		if ($dim.equalsIgnoreCase(name)) {
			return dim();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ship_schd_dt.equalsIgnoreCase(name)) {
			return ship_schd_dt();
		}
		if ($ship_schd_hm.equalsIgnoreCase(name)) {
			return ship_schd_hm();
		}
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			return dlv_schd_dt();
		}
		if ($dlv_schd_hm.equalsIgnoreCase(name)) {
			return dlv_schd_hm();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			ship_wk_nm(value);
			return;
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($not_inst_ship_to_cnt.equalsIgnoreCase(name)) {
			not_inst_ship_to_cnt(value);
			return;
		}
		if ($not_inst_d_cnt.equalsIgnoreCase(name)) {
			not_inst_d_cnt(value);
			return;
		}
		if ($not_inst_wt.equalsIgnoreCase(name)) {
			not_inst_wt(value);
			return;
		}
		if ($not_inst_dim.equalsIgnoreCase(name)) {
			not_inst_dim(value);
			return;
		}
		if ($inst_ship_to_cnt.equalsIgnoreCase(name)) {
			inst_ship_to_cnt(value);
			return;
		}
		if ($inst_d_cnt.equalsIgnoreCase(name)) {
			inst_d_cnt(value);
			return;
		}
		if ($inst_wt.equalsIgnoreCase(name)) {
			inst_wt(value);
			return;
		}
		if ($inst_dim.equalsIgnoreCase(name)) {
			inst_dim(value);
			return;
		}
		if ($cnt.equalsIgnoreCase(name)) {
			cnt(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($not_inst_ship_to_cnt.equalsIgnoreCase(name)) {
			not_inst_ship_to_cnt(value);
			return;
		}
		if ($not_inst_d_cnt.equalsIgnoreCase(name)) {
			not_inst_d_cnt(value);
			return;
		}
		if ($not_inst_wt.equalsIgnoreCase(name)) {
			not_inst_wt(value);
			return;
		}
		if ($not_inst_dim.equalsIgnoreCase(name)) {
			not_inst_dim(value);
			return;
		}
		if ($inst_ship_to_cnt.equalsIgnoreCase(name)) {
			inst_ship_to_cnt(value);
			return;
		}
		if ($inst_d_cnt.equalsIgnoreCase(name)) {
			inst_d_cnt(value);
			return;
		}
		if ($inst_wt.equalsIgnoreCase(name)) {
			inst_wt(value);
			return;
		}
		if ($inst_dim.equalsIgnoreCase(name)) {
			inst_dim(value);
			return;
		}
		if ($cnt.equalsIgnoreCase(name)) {
			cnt(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($not_inst_ship_to_cnt.equalsIgnoreCase(name)) {
			not_inst_ship_to_cnt(value);
			return;
		}
		if ($not_inst_d_cnt.equalsIgnoreCase(name)) {
			not_inst_d_cnt(value);
			return;
		}
		if ($not_inst_wt.equalsIgnoreCase(name)) {
			not_inst_wt(value);
			return;
		}
		if ($not_inst_dim.equalsIgnoreCase(name)) {
			not_inst_dim(value);
			return;
		}
		if ($inst_ship_to_cnt.equalsIgnoreCase(name)) {
			inst_ship_to_cnt(value);
			return;
		}
		if ($inst_d_cnt.equalsIgnoreCase(name)) {
			inst_d_cnt(value);
			return;
		}
		if ($inst_wt.equalsIgnoreCase(name)) {
			inst_wt(value);
			return;
		}
		if ($inst_dim.equalsIgnoreCase(name)) {
			inst_dim(value);
			return;
		}
		if ($cnt.equalsIgnoreCase(name)) {
			cnt(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($not_inst_ship_to_cnt.equalsIgnoreCase(name)) {
			not_inst_ship_to_cnt(value);
			return;
		}
		if ($not_inst_d_cnt.equalsIgnoreCase(name)) {
			not_inst_d_cnt(value);
			return;
		}
		if ($not_inst_wt.equalsIgnoreCase(name)) {
			not_inst_wt(value);
			return;
		}
		if ($not_inst_dim.equalsIgnoreCase(name)) {
			not_inst_dim(value);
			return;
		}
		if ($inst_ship_to_cnt.equalsIgnoreCase(name)) {
			inst_ship_to_cnt(value);
			return;
		}
		if ($inst_d_cnt.equalsIgnoreCase(name)) {
			inst_d_cnt(value);
			return;
		}
		if ($inst_wt.equalsIgnoreCase(name)) {
			inst_wt(value);
			return;
		}
		if ($inst_dim.equalsIgnoreCase(name)) {
			inst_dim(value);
			return;
		}
		if ($cnt.equalsIgnoreCase(name)) {
			cnt(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($not_inst_ship_to_cnt.equalsIgnoreCase(name)) {
			not_inst_ship_to_cnt(value);
			return;
		}
		if ($not_inst_d_cnt.equalsIgnoreCase(name)) {
			not_inst_d_cnt(value);
			return;
		}
		if ($not_inst_wt.equalsIgnoreCase(name)) {
			not_inst_wt(value);
			return;
		}
		if ($not_inst_dim.equalsIgnoreCase(name)) {
			not_inst_dim(value);
			return;
		}
		if ($inst_ship_to_cnt.equalsIgnoreCase(name)) {
			inst_ship_to_cnt(value);
			return;
		}
		if ($inst_d_cnt.equalsIgnoreCase(name)) {
			inst_d_cnt(value);
			return;
		}
		if ($inst_wt.equalsIgnoreCase(name)) {
			inst_wt(value);
			return;
		}
		if ($inst_dim.equalsIgnoreCase(name)) {
			inst_dim(value);
			return;
		}
		if ($cnt.equalsIgnoreCase(name)) {
			cnt(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ship_schd_dt.equalsIgnoreCase(name)) {
			ship_schd_dt(value);
			return;
		}
		if ($ship_schd_hm.equalsIgnoreCase(name)) {
			ship_schd_hm(value);
			return;
		}
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			dlv_schd_dt(value);
			return;
		}
		if ($dlv_schd_hm.equalsIgnoreCase(name)) {
			dlv_schd_hm(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			ship_wk_nm(value);
			return;
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($not_inst_ship_to_cnt.equalsIgnoreCase(name)) {
			not_inst_ship_to_cnt(value);
			return;
		}
		if ($not_inst_d_cnt.equalsIgnoreCase(name)) {
			not_inst_d_cnt(value);
			return;
		}
		if ($not_inst_wt.equalsIgnoreCase(name)) {
			not_inst_wt(value);
			return;
		}
		if ($not_inst_dim.equalsIgnoreCase(name)) {
			not_inst_dim(value);
			return;
		}
		if ($inst_ship_to_cnt.equalsIgnoreCase(name)) {
			inst_ship_to_cnt(value);
			return;
		}
		if ($inst_d_cnt.equalsIgnoreCase(name)) {
			inst_d_cnt(value);
			return;
		}
		if ($inst_wt.equalsIgnoreCase(name)) {
			inst_wt(value);
			return;
		}
		if ($inst_dim.equalsIgnoreCase(name)) {
			inst_dim(value);
			return;
		}
		if ($cnt.equalsIgnoreCase(name)) {
			cnt(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($not_inst_ship_to_cnt.equalsIgnoreCase(name)) {
			not_inst_ship_to_cnt(value);
			return;
		}
		if ($not_inst_d_cnt.equalsIgnoreCase(name)) {
			not_inst_d_cnt(value);
			return;
		}
		if ($not_inst_wt.equalsIgnoreCase(name)) {
			not_inst_wt(value);
			return;
		}
		if ($not_inst_dim.equalsIgnoreCase(name)) {
			not_inst_dim(value);
			return;
		}
		if ($inst_ship_to_cnt.equalsIgnoreCase(name)) {
			inst_ship_to_cnt(value);
			return;
		}
		if ($inst_d_cnt.equalsIgnoreCase(name)) {
			inst_d_cnt(value);
			return;
		}
		if ($inst_wt.equalsIgnoreCase(name)) {
			inst_wt(value);
			return;
		}
		if ($inst_dim.equalsIgnoreCase(name)) {
			inst_dim(value);
			return;
		}
		if ($cnt.equalsIgnoreCase(name)) {
			cnt(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($not_inst_ship_to_cnt.equalsIgnoreCase(name)) {
			not_inst_ship_to_cnt(value);
			return;
		}
		if ($not_inst_d_cnt.equalsIgnoreCase(name)) {
			not_inst_d_cnt(value);
			return;
		}
		if ($not_inst_wt.equalsIgnoreCase(name)) {
			not_inst_wt(value);
			return;
		}
		if ($not_inst_dim.equalsIgnoreCase(name)) {
			not_inst_dim(value);
			return;
		}
		if ($inst_ship_to_cnt.equalsIgnoreCase(name)) {
			inst_ship_to_cnt(value);
			return;
		}
		if ($inst_d_cnt.equalsIgnoreCase(name)) {
			inst_d_cnt(value);
			return;
		}
		if ($inst_wt.equalsIgnoreCase(name)) {
			inst_wt(value);
			return;
		}
		if ($inst_dim.equalsIgnoreCase(name)) {
			inst_dim(value);
			return;
		}
		if ($cnt.equalsIgnoreCase(name)) {
			cnt(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($not_inst_ship_to_cnt.equalsIgnoreCase(name)) {
			not_inst_ship_to_cnt(value);
			return;
		}
		if ($not_inst_d_cnt.equalsIgnoreCase(name)) {
			not_inst_d_cnt(value);
			return;
		}
		if ($not_inst_wt.equalsIgnoreCase(name)) {
			not_inst_wt(value);
			return;
		}
		if ($not_inst_dim.equalsIgnoreCase(name)) {
			not_inst_dim(value);
			return;
		}
		if ($inst_ship_to_cnt.equalsIgnoreCase(name)) {
			inst_ship_to_cnt(value);
			return;
		}
		if ($inst_d_cnt.equalsIgnoreCase(name)) {
			inst_d_cnt(value);
			return;
		}
		if ($inst_wt.equalsIgnoreCase(name)) {
			inst_wt(value);
			return;
		}
		if ($inst_dim.equalsIgnoreCase(name)) {
			inst_dim(value);
			return;
		}
		if ($cnt.equalsIgnoreCase(name)) {
			cnt(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($not_inst_ship_to_cnt.equalsIgnoreCase(name)) {
			not_inst_ship_to_cnt(value);
			return;
		}
		if ($not_inst_d_cnt.equalsIgnoreCase(name)) {
			not_inst_d_cnt(value);
			return;
		}
		if ($not_inst_wt.equalsIgnoreCase(name)) {
			not_inst_wt(value);
			return;
		}
		if ($not_inst_dim.equalsIgnoreCase(name)) {
			not_inst_dim(value);
			return;
		}
		if ($inst_ship_to_cnt.equalsIgnoreCase(name)) {
			inst_ship_to_cnt(value);
			return;
		}
		if ($inst_d_cnt.equalsIgnoreCase(name)) {
			inst_d_cnt(value);
			return;
		}
		if ($inst_wt.equalsIgnoreCase(name)) {
			inst_wt(value);
			return;
		}
		if ($inst_dim.equalsIgnoreCase(name)) {
			inst_dim(value);
			return;
		}
		if ($cnt.equalsIgnoreCase(name)) {
			cnt(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ship_schd_dt.equalsIgnoreCase(name)) {
			ship_schd_dt(value);
			return;
		}
		if ($ship_schd_hm.equalsIgnoreCase(name)) {
			ship_schd_hm(value);
			return;
		}
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			dlv_schd_dt(value);
			return;
		}
		if ($dlv_schd_hm.equalsIgnoreCase(name)) {
			dlv_schd_hm(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

