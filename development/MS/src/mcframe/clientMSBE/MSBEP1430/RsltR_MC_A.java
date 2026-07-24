package mcframe.clientMSBE.MSBEP1430;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

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
	public static final String $ship_schd_dt_p = "ship_schd_dt_p";
	public static final String $dlv_schd_dt_p = "dlv_schd_dt_p";
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
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public static final String $not_inst_ship_to_cnt = "not_inst_ship_to_cnt";
	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public static final String $not_inst_d_cnt = "not_inst_d_cnt";
	/**
	 * Weight 重量.<p>
	 *
	 */
	public static final String $not_inst_wt = "not_inst_wt";
	/**
	 * Volume 容積.<p>
	 *
	 */
	public static final String $not_inst_dim = "not_inst_dim";
	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public static final String $inst_ship_to_cnt = "inst_ship_to_cnt";
	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public static final String $inst_d_cnt = "inst_d_cnt";
	/**
	 * Weight 重量.<p>
	 *
	 */
	public static final String $inst_wt = "inst_wt";
	/**
	 * Volume 容積.<p>
	 *
	 */
	public static final String $inst_dim = "inst_dim";

	public static final String $ship_schd_dt = $ship_schd_dt_p + ".ymd";
	public static final String $ship_schd_hm = $ship_schd_dt_p + ".hm";
	public static final String $dlv_schd_dt = $dlv_schd_dt_p + ".ymd";
	public static final String $dlv_schd_hm = $dlv_schd_dt_p + ".hm";

	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta ship_schd_dt_p_META = createInnerRowMeta($ship_schd_dt_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta dlv_schd_dt_p_META = createInnerRowMeta($dlv_schd_dt_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
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

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			lg_grp_cd_META,
			lg_grp_nm_META,
			ship_schd_dt_p_META,
			dlv_schd_dt_p_META,
			ship_wk_cd_META,
			ship_wk_nm_META,
			not_inst_ship_to_cnt_META,
			not_inst_d_cnt_META,
			not_inst_wt_META,
			not_inst_dim_META,
			inst_ship_to_cnt_META,
			inst_d_cnt_META,
			inst_wt_META,
			inst_dim_META
		},
		new String[][]{
			{
				"ship_schd_dt",
				"ship_schd_hm",
				"dlv_schd_dt",
				"dlv_schd_hm"
			},
			{
				$ship_schd_dt,
				$ship_schd_hm,
				$dlv_schd_dt,
				$dlv_schd_hm
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
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$lg_grp_cd, "LG_GRP"},	// lg_grp_cd
				{$lg_grp_nm, "LG_GRP"}	// lg_grp_nm
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
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


	public mcframe.clientMAUB.MAUBP5320.YmdHmR ship_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 2, $ship_schd_dt_p);
	}
	
	public void ship_schd_dt_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 2, $ship_schd_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR dlv_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 3, $dlv_schd_dt_p);
	}
	
	public void dlv_schd_dt_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 3, $dlv_schd_dt_p, row);
	}


	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public String ship_wk_cd() {
		return getConstString(offset + 4, $ship_wk_cd);
	}

	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public void ship_wk_cd(String value) {
		setConstString(offset + 4, $ship_wk_cd, value);
	}


	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public String ship_wk_nm() {
		return getConstString(offset + 5, $ship_wk_nm);
	}

	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public void ship_wk_nm(String value) {
		setConstString(offset + 5, $ship_wk_nm, value);
	}


	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public MCNumber not_inst_ship_to_cnt() {
		return getConstNumber(offset + 6, $not_inst_ship_to_cnt);
	}

	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public void not_inst_ship_to_cnt(MCNumber value) {
		setConstNumber(offset + 6, $not_inst_ship_to_cnt, value);
	}

	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public void not_inst_ship_to_cnt(int value) {
		setConstNumber(offset + 6, $not_inst_ship_to_cnt, value);
	}

	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public void not_inst_ship_to_cnt(long value) {
		setConstNumber(offset + 6, $not_inst_ship_to_cnt, value);
	}

	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public void not_inst_ship_to_cnt(float value) {
		setConstNumber(offset + 6, $not_inst_ship_to_cnt, value);
	}

	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public void not_inst_ship_to_cnt(double value) {
		setConstNumber(offset + 6, $not_inst_ship_to_cnt, value);
	}


	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public MCNumber not_inst_d_cnt() {
		return getConstNumber(offset + 7, $not_inst_d_cnt);
	}

	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public void not_inst_d_cnt(MCNumber value) {
		setConstNumber(offset + 7, $not_inst_d_cnt, value);
	}

	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public void not_inst_d_cnt(int value) {
		setConstNumber(offset + 7, $not_inst_d_cnt, value);
	}

	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public void not_inst_d_cnt(long value) {
		setConstNumber(offset + 7, $not_inst_d_cnt, value);
	}

	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public void not_inst_d_cnt(float value) {
		setConstNumber(offset + 7, $not_inst_d_cnt, value);
	}

	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public void not_inst_d_cnt(double value) {
		setConstNumber(offset + 7, $not_inst_d_cnt, value);
	}


	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCNumber not_inst_wt() {
		return getConstNumber(offset + 8, $not_inst_wt);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void not_inst_wt(MCNumber value) {
		setConstNumber(offset + 8, $not_inst_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void not_inst_wt(int value) {
		setConstNumber(offset + 8, $not_inst_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void not_inst_wt(long value) {
		setConstNumber(offset + 8, $not_inst_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void not_inst_wt(float value) {
		setConstNumber(offset + 8, $not_inst_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void not_inst_wt(double value) {
		setConstNumber(offset + 8, $not_inst_wt, value);
	}


	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCNumber not_inst_dim() {
		return getConstNumber(offset + 9, $not_inst_dim);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void not_inst_dim(MCNumber value) {
		setConstNumber(offset + 9, $not_inst_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void not_inst_dim(int value) {
		setConstNumber(offset + 9, $not_inst_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void not_inst_dim(long value) {
		setConstNumber(offset + 9, $not_inst_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void not_inst_dim(float value) {
		setConstNumber(offset + 9, $not_inst_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void not_inst_dim(double value) {
		setConstNumber(offset + 9, $not_inst_dim, value);
	}


	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public MCNumber inst_ship_to_cnt() {
		return getConstNumber(offset + 10, $inst_ship_to_cnt);
	}

	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public void inst_ship_to_cnt(MCNumber value) {
		setConstNumber(offset + 10, $inst_ship_to_cnt, value);
	}

	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public void inst_ship_to_cnt(int value) {
		setConstNumber(offset + 10, $inst_ship_to_cnt, value);
	}

	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public void inst_ship_to_cnt(long value) {
		setConstNumber(offset + 10, $inst_ship_to_cnt, value);
	}

	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public void inst_ship_to_cnt(float value) {
		setConstNumber(offset + 10, $inst_ship_to_cnt, value);
	}

	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public void inst_ship_to_cnt(double value) {
		setConstNumber(offset + 10, $inst_ship_to_cnt, value);
	}


	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public MCNumber inst_d_cnt() {
		return getConstNumber(offset + 11, $inst_d_cnt);
	}

	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public void inst_d_cnt(MCNumber value) {
		setConstNumber(offset + 11, $inst_d_cnt, value);
	}

	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public void inst_d_cnt(int value) {
		setConstNumber(offset + 11, $inst_d_cnt, value);
	}

	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public void inst_d_cnt(long value) {
		setConstNumber(offset + 11, $inst_d_cnt, value);
	}

	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public void inst_d_cnt(float value) {
		setConstNumber(offset + 11, $inst_d_cnt, value);
	}

	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public void inst_d_cnt(double value) {
		setConstNumber(offset + 11, $inst_d_cnt, value);
	}


	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCNumber inst_wt() {
		return getConstNumber(offset + 12, $inst_wt);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void inst_wt(MCNumber value) {
		setConstNumber(offset + 12, $inst_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void inst_wt(int value) {
		setConstNumber(offset + 12, $inst_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void inst_wt(long value) {
		setConstNumber(offset + 12, $inst_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void inst_wt(float value) {
		setConstNumber(offset + 12, $inst_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void inst_wt(double value) {
		setConstNumber(offset + 12, $inst_wt, value);
	}


	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCNumber inst_dim() {
		return getConstNumber(offset + 13, $inst_dim);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void inst_dim(MCNumber value) {
		setConstNumber(offset + 13, $inst_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void inst_dim(int value) {
		setConstNumber(offset + 13, $inst_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void inst_dim(long value) {
		setConstNumber(offset + 13, $inst_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void inst_dim(float value) {
		setConstNumber(offset + 13, $inst_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void inst_dim(double value) {
		setConstNumber(offset + 13, $inst_dim, value);
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
		return super.getNumber(name);
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
		return super.getNumberNE(name);
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
		super.setNumber(name, value);
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
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ship_schd_dt_p.equalsIgnoreCase(name)) {
			return ship_schd_dt_p();
		}
		if ($dlv_schd_dt_p.equalsIgnoreCase(name)) {
			return dlv_schd_dt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ship_schd_dt_p.equalsIgnoreCase(name)) {
			ship_schd_dt_p(
				((MCContainerMeta) ship_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($dlv_schd_dt_p.equalsIgnoreCase(name)) {
			dlv_schd_dt_p(
				((MCContainerMeta) dlv_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public MCDate ship_schd_dt() {
		return ship_schd_dt_p().ymd();
	}

	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public void ship_schd_dt(MCDate value) {
		ship_schd_dt_p().ymd(value);
	}

	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public MCDate ship_schd_hm() {
		return ship_schd_dt_p().hm();
	}

	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public void ship_schd_hm(MCDate value) {
		ship_schd_dt_p().hm(value);
	}

	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public MCDate dlv_schd_dt() {
		return dlv_schd_dt_p().ymd();
	}

	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public void dlv_schd_dt(MCDate value) {
		dlv_schd_dt_p().ymd(value);
	}

	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public MCDate dlv_schd_hm() {
		return dlv_schd_dt_p().hm();
	}

	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public void dlv_schd_hm(MCDate value) {
		dlv_schd_dt_p().hm(value);
	}

}

