package mcframe.clientMSBB.MSBBP0130;

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
 * ブロック"BulkSet"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BulkSetR_MC_A extends MCConstRow {

	/**
	 * Sales start month 販売開始年月.<p>
	 *
	 */
	public static final String $spln_st_ym = "spln_st_ym";
	/**
	 * Sales end month 販売終了年月.<p>
	 *
	 */
	public static final String $spln_end_ym = "spln_end_ym";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
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
	public static final String $wrk_no_p = "wrk_no_p";
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
	 * Sales plan setting classification 販売計画設定区分.<p>
	 *
	 */
	public static final String $spln_set_typ = "spln_set_typ";
	/**
	 * Sales plan setting type name 販売計画設定区分名.<p>
	 *
	 */
	public static final String $spln_set_typ_nm = "spln_set_typ_nm";
	/**
	 * Aggregated by customer on 得意先別集計オン.<p>
	 *
	 */
	public static final String $cst_cd_unit_t_flg = "cst_cd_unit_t_flg";
	/**
	 * Aggregated by customer off 得意先別集計オフ.<p>
	 *
	 */
	public static final String $cst_cd_unit_f_flg = "cst_cd_unit_f_flg";
	/**
	 * Aggregation by sales project on 案件別集計オン.<p>
	 *
	 */
	public static final String $wrk_no_unit_t_flg = "wrk_no_unit_t_flg";
	/**
	 * Aggregation by sales project off 案件別集計オフ.<p>
	 *
	 */
	public static final String $wrk_no_unit_f_flg = "wrk_no_unit_f_flg";

	public static final String $wrk_no = $wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $wrk_no_p + ".wrk_nm";

	public static final MCMeta spln_st_ym_META = createCommonMeta($spln_st_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta spln_end_ym_META = createCommonMeta($spln_end_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta wrk_no_p_META = createInnerRowMeta($wrk_no_p, mcframe.clientMSUB.MSUBP0010.WrkNoR.class);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta spln_set_typ_META = createCommonMeta($spln_set_typ, mcframe.commonMA.meta.MA_META.SPLN_SET_TYP);
	public static final MCMeta spln_set_typ_nm_META = createCommonMeta($spln_set_typ_nm, mcframe.commonMA.meta.MA_META.SPLN_SET_TYP_NM);
	public static final MCMeta cst_cd_unit_t_flg_META = createCommonMeta($cst_cd_unit_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_cd_unit_f_flg_META = createCommonMeta($cst_cd_unit_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_no_unit_t_flg_META = createCommonMeta($wrk_no_unit_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_no_unit_f_flg_META = createCommonMeta($wrk_no_unit_f_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<BulkSetR> constMetas = new ConstMetaList<BulkSetR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			spln_st_ym_META,
			spln_end_ym_META,
			dpt_cd_META,
			dpt_nm_META,
			cst_cd_META,
			cst_nm_META,
			wrk_no_p_META,
			cur_cd_META,
			cur_nm_META,
			spln_set_typ_META,
			spln_set_typ_nm_META,
			cst_cd_unit_t_flg_META,
			cst_cd_unit_f_flg_META,
			wrk_no_unit_t_flg_META,
			wrk_no_unit_f_flg_META
		},
		new String[][]{
			{
				"wrk_no",
				"wrk_nm"
			},
			{
				$wrk_no,
				$wrk_nm
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
				{$cst_cd, "bp_nm"}	// cst_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$dpt_cd, "MAC_DPT_IS_SRCH_TYP.SLS;true;true"},	// dpt_cd
				{$cst_cd, "MAC_BP_IS_SRCH_TYP.CST;true"},	// cst_cd
				{$wrk_no_p + ".wrk_no", "true"}	// wrk_no_p.wrk_no
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$dpt_cd, "dpt_is_srch_typ;wr_flg;mode_today_flg"},	// dpt_cd
				{$cst_cd, "bp_is_srch_typ;mode_nullval_flg"},	// cst_cd
				{$wrk_no_p + ".wrk_no", "mode_nullval_flg"}	// wrk_no_p.wrk_no
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wrk_no_unit_t_flg, "WRK"},	// wrk_no_unit_t_flg
				{$wrk_no_unit_f_flg, "WRK"}	// wrk_no_unit_f_flg
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
	protected BulkSetR_MC_A(ConstMetaList<? extends BulkSetR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR clone() {
		return (BulkSetR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR createInstance() {
		return (BulkSetR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR getValues(String... names) {
		return (BulkSetR) super.getValues(names);
	}



	/**
	 * Sales start month 販売開始年月.<p>
	 *
	 */
	public MCDate spln_st_ym() {
		return getConstDate(offset + 0, $spln_st_ym);
	}

	/**
	 * Sales start month 販売開始年月.<p>
	 *
	 */
	public void spln_st_ym(MCDate value) {
		setConstDate(offset + 0, $spln_st_ym, value);
	}


	/**
	 * Sales end month 販売終了年月.<p>
	 *
	 */
	public MCDate spln_end_ym() {
		return getConstDate(offset + 1, $spln_end_ym);
	}

	/**
	 * Sales end month 販売終了年月.<p>
	 *
	 */
	public void spln_end_ym(MCDate value) {
		setConstDate(offset + 1, $spln_end_ym, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 2, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 2, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 3, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 3, $dpt_nm, value);
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


	public mcframe.clientMSUB.MSUBP0010.WrkNoR wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP0010.WrkNoR) getConstInnerRow(offset + 6, $wrk_no_p);
	}
	
	public void wrk_no_p(mcframe.clientMSUB.MSUBP0010.WrkNoR row){
		setConstInnerRow(offset + 6, $wrk_no_p, row);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 7, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 7, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 8, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 8, $cur_nm, value);
	}


	/**
	 * Sales plan setting classification 販売計画設定区分.<p>
	 *
	 */
	public String spln_set_typ() {
		return getConstString(offset + 9, $spln_set_typ);
	}

	/**
	 * Sales plan setting classification 販売計画設定区分.<p>
	 *
	 */
	public void spln_set_typ(String value) {
		setConstString(offset + 9, $spln_set_typ, value);
	}


	/**
	 * Sales plan setting type name 販売計画設定区分名.<p>
	 *
	 */
	public String spln_set_typ_nm() {
		return getConstString(offset + 10, $spln_set_typ_nm);
	}

	/**
	 * Sales plan setting type name 販売計画設定区分名.<p>
	 *
	 */
	public void spln_set_typ_nm(String value) {
		setConstString(offset + 10, $spln_set_typ_nm, value);
	}


	/**
	 * Aggregated by customer on 得意先別集計オン.<p>
	 *
	 */
	public boolean cst_cd_unit_t_flg() {
		return getConstBoolean(offset + 11, $cst_cd_unit_t_flg);
	}

	/**
	 * Aggregated by customer on 得意先別集計オン.<p>
	 *
	 */
	public void cst_cd_unit_t_flg(boolean value) {
		setConstBoolean(offset + 11, $cst_cd_unit_t_flg, value);
	}


	/**
	 * Aggregated by customer off 得意先別集計オフ.<p>
	 *
	 */
	public boolean cst_cd_unit_f_flg() {
		return getConstBoolean(offset + 12, $cst_cd_unit_f_flg);
	}

	/**
	 * Aggregated by customer off 得意先別集計オフ.<p>
	 *
	 */
	public void cst_cd_unit_f_flg(boolean value) {
		setConstBoolean(offset + 12, $cst_cd_unit_f_flg, value);
	}


	/**
	 * Aggregation by sales project on 案件別集計オン.<p>
	 *
	 */
	public boolean wrk_no_unit_t_flg() {
		return getConstBoolean(offset + 13, $wrk_no_unit_t_flg);
	}

	/**
	 * Aggregation by sales project on 案件別集計オン.<p>
	 *
	 */
	public void wrk_no_unit_t_flg(boolean value) {
		setConstBoolean(offset + 13, $wrk_no_unit_t_flg, value);
	}


	/**
	 * Aggregation by sales project off 案件別集計オフ.<p>
	 *
	 */
	public boolean wrk_no_unit_f_flg() {
		return getConstBoolean(offset + 14, $wrk_no_unit_f_flg);
	}

	/**
	 * Aggregation by sales project off 案件別集計オフ.<p>
	 *
	 */
	public void wrk_no_unit_f_flg(boolean value) {
		setConstBoolean(offset + 14, $wrk_no_unit_f_flg, value);
	}


	public String getString(String name) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($spln_set_typ.equalsIgnoreCase(name)) {
			return spln_set_typ();
		}
		if ($spln_set_typ_nm.equalsIgnoreCase(name)) {
			return spln_set_typ_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($spln_st_ym.equalsIgnoreCase(name)) {
			return spln_st_ym();
		}
		if ($spln_end_ym.equalsIgnoreCase(name)) {
			return spln_end_ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($cst_cd_unit_t_flg.equalsIgnoreCase(name)) {
			return cst_cd_unit_t_flg();
		}
		if ($cst_cd_unit_f_flg.equalsIgnoreCase(name)) {
			return cst_cd_unit_f_flg();
		}
		if ($wrk_no_unit_t_flg.equalsIgnoreCase(name)) {
			return wrk_no_unit_t_flg();
		}
		if ($wrk_no_unit_f_flg.equalsIgnoreCase(name)) {
			return wrk_no_unit_f_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($spln_set_typ.equalsIgnoreCase(name)) {
			return spln_set_typ();
		}
		if ($spln_set_typ_nm.equalsIgnoreCase(name)) {
			return spln_set_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($spln_st_ym.equalsIgnoreCase(name)) {
			return spln_st_ym();
		}
		if ($spln_end_ym.equalsIgnoreCase(name)) {
			return spln_end_ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($cst_cd_unit_t_flg.equalsIgnoreCase(name)) {
			return cst_cd_unit_t_flg();
		}
		if ($cst_cd_unit_f_flg.equalsIgnoreCase(name)) {
			return cst_cd_unit_f_flg();
		}
		if ($wrk_no_unit_t_flg.equalsIgnoreCase(name)) {
			return wrk_no_unit_t_flg();
		}
		if ($wrk_no_unit_f_flg.equalsIgnoreCase(name)) {
			return wrk_no_unit_f_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($spln_set_typ.equalsIgnoreCase(name)) {
			spln_set_typ(value);
			return;
		}
		if ($spln_set_typ_nm.equalsIgnoreCase(name)) {
			spln_set_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($spln_st_ym.equalsIgnoreCase(name)) {
			spln_st_ym(value);
			return;
		}
		if ($spln_end_ym.equalsIgnoreCase(name)) {
			spln_end_ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($cst_cd_unit_t_flg.equalsIgnoreCase(name)) {
			cst_cd_unit_t_flg(value);
			return;
		}
		if ($cst_cd_unit_f_flg.equalsIgnoreCase(name)) {
			cst_cd_unit_f_flg(value);
			return;
		}
		if ($wrk_no_unit_t_flg.equalsIgnoreCase(name)) {
			wrk_no_unit_t_flg(value);
			return;
		}
		if ($wrk_no_unit_f_flg.equalsIgnoreCase(name)) {
			wrk_no_unit_f_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($spln_set_typ.equalsIgnoreCase(name)) {
			spln_set_typ(value);
			return;
		}
		if ($spln_set_typ_nm.equalsIgnoreCase(name)) {
			spln_set_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($spln_st_ym.equalsIgnoreCase(name)) {
			spln_st_ym(value);
			return;
		}
		if ($spln_end_ym.equalsIgnoreCase(name)) {
			spln_end_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($cst_cd_unit_t_flg.equalsIgnoreCase(name)) {
			cst_cd_unit_t_flg(value);
			return;
		}
		if ($cst_cd_unit_f_flg.equalsIgnoreCase(name)) {
			cst_cd_unit_f_flg(value);
			return;
		}
		if ($wrk_no_unit_t_flg.equalsIgnoreCase(name)) {
			wrk_no_unit_t_flg(value);
			return;
		}
		if ($wrk_no_unit_f_flg.equalsIgnoreCase(name)) {
			wrk_no_unit_f_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			return wrk_no_p();
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

}

