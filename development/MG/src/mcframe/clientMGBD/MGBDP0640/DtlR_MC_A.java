package mcframe.clientMGBD.MGBDP0640;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	public static final String $term_p = "term_p";
	public static final String $src_itm_p = "src_itm_p";
	/**
	 * Standard Item name 標準品名.<p>
	 *
	 */
	public static final String $base_itm_nm = "base_itm_nm";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	public static final String $dest_itm_p = "dest_itm_p";
	/**
	 * Item master 品目マスタ.<p>
	 *
	 */
	public static final String $mam_itm_ = "mam_itm_";
	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public static final String $mgt_itm = "mgt_itm";
	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public static final String $mgt_itm_dtl = "mgt_itm_dtl";
	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public static final String $mgt_itm_oper = "mgt_itm_oper";
	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public static final String $mgt_bom = "mgt_bom";
	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public static final String $mgt_itm_wk = "mgt_itm_wk";
	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public static final String $mgt_itm_purc = "mgt_itm_purc";
	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public static final String $mgt_itm_proc = "mgt_itm_proc";
	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public static final String $mgt_itm_prov = "mgt_itm_prov";
	/**
	 * Cost sales unit price 原価販売単価.<p>
	 *
	 */
	public static final String $mgt_itm_sls = "mgt_itm_sls";
	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public static final String $mgt_itm_fix = "mgt_itm_fix";
	/**
	 * Item 品目.<p>
	 *
	 */
	public static final String $copy_mam_itm_ = "copy_mam_itm_";
	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public static final String $copy_mgt_itm = "copy_mgt_itm";
	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public static final String $copy_mgt_itm_dtl = "copy_mgt_itm_dtl";
	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public static final String $copy_mgt_itm_oper = "copy_mgt_itm_oper";
	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public static final String $copy_mgt_bom = "copy_mgt_bom";
	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public static final String $copy_mgt_itm_wk = "copy_mgt_itm_wk";
	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public static final String $copy_mgt_itm_purc = "copy_mgt_itm_purc";
	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public static final String $copy_mgt_itm_proc = "copy_mgt_itm_proc";
	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public static final String $copy_mgt_itm_prov = "copy_mgt_itm_prov";
	/**
	 * Cost sales unit price 原価販売単価.<p>
	 *
	 */
	public static final String $copy_mgt_itm_sls = "copy_mgt_itm_sls";
	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public static final String $copy_mgt_itm_fix = "copy_mgt_itm_fix";
	public static final String $rts_msg_p = "rts_msg_p";

	public static final String $term = $term_p + ".term";
	public static final String $itm_cd = $src_itm_p + ".itm_cd";
	public static final String $itm_sub1 = $src_itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $src_itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $src_itm_p + ".itm_sub3";
	public static final String $itm_nm = $src_itm_p + ".itm_nm";
	public static final String $dest_itm_cd = $dest_itm_p + ".itm_cd";
	public static final String $dest_itm_sub1 = $dest_itm_p + ".itm_sub1";
	public static final String $dest_itm_sub2 = $dest_itm_p + ".itm_sub2";
	public static final String $dest_itm_sub3 = $dest_itm_p + ".itm_sub3";
	public static final String $dest_itm_nm = $dest_itm_p + ".itm_nm";
	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";
	public static final String $rtn_sts_typ_nm = $rts_msg_p + ".rtn_sts_typ_nm";
	public static final String $msg_id = $rts_msg_p + ".msg_id";
	public static final String $msg = $rts_msg_p + ".msg";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta term_p_META = createInnerRowMeta($term_p, mcframe.clientMAUB.MAUBP5160.TermR.class);
	public static final MCMeta src_itm_p_META = createInnerRowMeta($src_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta base_itm_nm_META = createCommonMeta($base_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta dest_itm_p_META = createInnerRowMeta($dest_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta mam_itm__META = createCommonMeta($mam_itm_, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mgt_itm_META = createCommonMeta($mgt_itm, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mgt_itm_dtl_META = createCommonMeta($mgt_itm_dtl, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mgt_itm_oper_META = createCommonMeta($mgt_itm_oper, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mgt_bom_META = createCommonMeta($mgt_bom, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mgt_itm_wk_META = createCommonMeta($mgt_itm_wk, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mgt_itm_purc_META = createCommonMeta($mgt_itm_purc, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mgt_itm_proc_META = createCommonMeta($mgt_itm_proc, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mgt_itm_prov_META = createCommonMeta($mgt_itm_prov, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mgt_itm_sls_META = createCommonMeta($mgt_itm_sls, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mgt_itm_fix_META = createCommonMeta($mgt_itm_fix, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta copy_mam_itm__META = createCommonMeta($copy_mam_itm_, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_mgt_itm_META = createCommonMeta($copy_mgt_itm, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_mgt_itm_dtl_META = createCommonMeta($copy_mgt_itm_dtl, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_mgt_itm_oper_META = createCommonMeta($copy_mgt_itm_oper, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_mgt_bom_META = createCommonMeta($copy_mgt_bom, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_mgt_itm_wk_META = createCommonMeta($copy_mgt_itm_wk, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_mgt_itm_purc_META = createCommonMeta($copy_mgt_itm_purc, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_mgt_itm_proc_META = createCommonMeta($copy_mgt_itm_proc, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_mgt_itm_prov_META = createCommonMeta($copy_mgt_itm_prov, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_mgt_itm_sls_META = createCommonMeta($copy_mgt_itm_sls, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_mgt_itm_fix_META = createCommonMeta($copy_mgt_itm_fix, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			calc_ctg_cd_META,
			term_p_META,
			src_itm_p_META,
			base_itm_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			dest_itm_p_META,
			mam_itm__META,
			mgt_itm_META,
			mgt_itm_dtl_META,
			mgt_itm_oper_META,
			mgt_bom_META,
			mgt_itm_wk_META,
			mgt_itm_purc_META,
			mgt_itm_proc_META,
			mgt_itm_prov_META,
			mgt_itm_sls_META,
			mgt_itm_fix_META,
			copy_mam_itm__META,
			copy_mgt_itm_META,
			copy_mgt_itm_dtl_META,
			copy_mgt_itm_oper_META,
			copy_mgt_bom_META,
			copy_mgt_itm_wk_META,
			copy_mgt_itm_purc_META,
			copy_mgt_itm_proc_META,
			copy_mgt_itm_prov_META,
			copy_mgt_itm_sls_META,
			copy_mgt_itm_fix_META,
			rts_msg_p_META
		},
		new String[][]{
			{
				"term",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"dest_itm_cd",
				"dest_itm_sub1",
				"dest_itm_sub2",
				"dest_itm_sub3",
				"dest_itm_nm",
				"rtn_sts_typ",
				"rtn_sts_typ_nm",
				"msg_id",
				"msg"
			},
			{
				$term,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$dest_itm_cd,
				$dest_itm_sub1,
				$dest_itm_sub2,
				$dest_itm_sub3,
				$dest_itm_nm,
				$rtn_sts_typ,
				$rtn_sts_typ_nm,
				$msg_id,
				$msg
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
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$dest_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true;true"},	// dest_itm_p.itm_cd
				{$dest_itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;dest_itm_cd;true;true"},	// dest_itm_p.itm_sub1
				{$dest_itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;dest_itm_cd;dest_itm_sub1;true;true"},	// dest_itm_p.itm_sub2
				{$dest_itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;dest_itm_cd;dest_itm_sub1;dest_itm_sub2;true;true"}	// dest_itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$dest_itm_p + ".itm_cd", "itm_is_srch_typ;release_flg_on;release_flg_off"},	// dest_itm_p.itm_cd
				{$dest_itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd;release_flg_on;release_flg_off"},	// dest_itm_p.itm_sub1
				{$dest_itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1;release_flg_on;release_flg_off"},	// dest_itm_p.itm_sub2
				{$dest_itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"}	// dest_itm_p.itm_sub3
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 1, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 1, $calc_ctg_cd, value);
	}


	public mcframe.clientMAUB.MAUBP5160.TermR term_p(){
		return (mcframe.clientMAUB.MAUBP5160.TermR) getConstInnerRow(offset + 2, $term_p);
	}
	
	public void term_p(mcframe.clientMAUB.MAUBP5160.TermR row){
		setConstInnerRow(offset + 2, $term_p, row);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR src_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 3, $src_itm_p);
	}
	
	public void src_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 3, $src_itm_p, row);
	}


	/**
	 * Standard Item name 標準品名.<p>
	 *
	 */
	public String base_itm_nm() {
		return getConstString(offset + 4, $base_itm_nm);
	}

	/**
	 * Standard Item name 標準品名.<p>
	 *
	 */
	public void base_itm_nm(String value) {
		setConstString(offset + 4, $base_itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 5, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 5, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 6, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 6, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 7, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 7, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 8, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 8, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 9, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 9, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 10, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 10, $itm_jnl_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR dest_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 11, $dest_itm_p);
	}
	
	public void dest_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 11, $dest_itm_p, row);
	}


	/**
	 * Item master 品目マスタ.<p>
	 *
	 */
	public MCNumber mam_itm_() {
		return getConstNumber(offset + 12, $mam_itm_);
	}

	/**
	 * Item master 品目マスタ.<p>
	 *
	 */
	public void mam_itm_(MCNumber value) {
		setConstNumber(offset + 12, $mam_itm_, value);
	}

	/**
	 * Item master 品目マスタ.<p>
	 *
	 */
	public void mam_itm_(int value) {
		setConstNumber(offset + 12, $mam_itm_, value);
	}

	/**
	 * Item master 品目マスタ.<p>
	 *
	 */
	public void mam_itm_(long value) {
		setConstNumber(offset + 12, $mam_itm_, value);
	}

	/**
	 * Item master 品目マスタ.<p>
	 *
	 */
	public void mam_itm_(float value) {
		setConstNumber(offset + 12, $mam_itm_, value);
	}

	/**
	 * Item master 品目マスタ.<p>
	 *
	 */
	public void mam_itm_(double value) {
		setConstNumber(offset + 12, $mam_itm_, value);
	}


	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public MCNumber mgt_itm() {
		return getConstNumber(offset + 13, $mgt_itm);
	}

	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public void mgt_itm(MCNumber value) {
		setConstNumber(offset + 13, $mgt_itm, value);
	}

	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public void mgt_itm(int value) {
		setConstNumber(offset + 13, $mgt_itm, value);
	}

	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public void mgt_itm(long value) {
		setConstNumber(offset + 13, $mgt_itm, value);
	}

	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public void mgt_itm(float value) {
		setConstNumber(offset + 13, $mgt_itm, value);
	}

	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public void mgt_itm(double value) {
		setConstNumber(offset + 13, $mgt_itm, value);
	}


	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public MCNumber mgt_itm_dtl() {
		return getConstNumber(offset + 14, $mgt_itm_dtl);
	}

	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public void mgt_itm_dtl(MCNumber value) {
		setConstNumber(offset + 14, $mgt_itm_dtl, value);
	}

	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public void mgt_itm_dtl(int value) {
		setConstNumber(offset + 14, $mgt_itm_dtl, value);
	}

	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public void mgt_itm_dtl(long value) {
		setConstNumber(offset + 14, $mgt_itm_dtl, value);
	}

	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public void mgt_itm_dtl(float value) {
		setConstNumber(offset + 14, $mgt_itm_dtl, value);
	}

	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public void mgt_itm_dtl(double value) {
		setConstNumber(offset + 14, $mgt_itm_dtl, value);
	}


	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public MCNumber mgt_itm_oper() {
		return getConstNumber(offset + 15, $mgt_itm_oper);
	}

	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public void mgt_itm_oper(MCNumber value) {
		setConstNumber(offset + 15, $mgt_itm_oper, value);
	}

	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public void mgt_itm_oper(int value) {
		setConstNumber(offset + 15, $mgt_itm_oper, value);
	}

	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public void mgt_itm_oper(long value) {
		setConstNumber(offset + 15, $mgt_itm_oper, value);
	}

	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public void mgt_itm_oper(float value) {
		setConstNumber(offset + 15, $mgt_itm_oper, value);
	}

	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public void mgt_itm_oper(double value) {
		setConstNumber(offset + 15, $mgt_itm_oper, value);
	}


	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public MCNumber mgt_bom() {
		return getConstNumber(offset + 16, $mgt_bom);
	}

	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public void mgt_bom(MCNumber value) {
		setConstNumber(offset + 16, $mgt_bom, value);
	}

	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public void mgt_bom(int value) {
		setConstNumber(offset + 16, $mgt_bom, value);
	}

	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public void mgt_bom(long value) {
		setConstNumber(offset + 16, $mgt_bom, value);
	}

	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public void mgt_bom(float value) {
		setConstNumber(offset + 16, $mgt_bom, value);
	}

	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public void mgt_bom(double value) {
		setConstNumber(offset + 16, $mgt_bom, value);
	}


	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public MCNumber mgt_itm_wk() {
		return getConstNumber(offset + 17, $mgt_itm_wk);
	}

	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public void mgt_itm_wk(MCNumber value) {
		setConstNumber(offset + 17, $mgt_itm_wk, value);
	}

	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public void mgt_itm_wk(int value) {
		setConstNumber(offset + 17, $mgt_itm_wk, value);
	}

	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public void mgt_itm_wk(long value) {
		setConstNumber(offset + 17, $mgt_itm_wk, value);
	}

	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public void mgt_itm_wk(float value) {
		setConstNumber(offset + 17, $mgt_itm_wk, value);
	}

	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public void mgt_itm_wk(double value) {
		setConstNumber(offset + 17, $mgt_itm_wk, value);
	}


	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public MCNumber mgt_itm_purc() {
		return getConstNumber(offset + 18, $mgt_itm_purc);
	}

	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public void mgt_itm_purc(MCNumber value) {
		setConstNumber(offset + 18, $mgt_itm_purc, value);
	}

	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public void mgt_itm_purc(int value) {
		setConstNumber(offset + 18, $mgt_itm_purc, value);
	}

	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public void mgt_itm_purc(long value) {
		setConstNumber(offset + 18, $mgt_itm_purc, value);
	}

	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public void mgt_itm_purc(float value) {
		setConstNumber(offset + 18, $mgt_itm_purc, value);
	}

	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public void mgt_itm_purc(double value) {
		setConstNumber(offset + 18, $mgt_itm_purc, value);
	}


	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public MCNumber mgt_itm_proc() {
		return getConstNumber(offset + 19, $mgt_itm_proc);
	}

	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public void mgt_itm_proc(MCNumber value) {
		setConstNumber(offset + 19, $mgt_itm_proc, value);
	}

	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public void mgt_itm_proc(int value) {
		setConstNumber(offset + 19, $mgt_itm_proc, value);
	}

	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public void mgt_itm_proc(long value) {
		setConstNumber(offset + 19, $mgt_itm_proc, value);
	}

	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public void mgt_itm_proc(float value) {
		setConstNumber(offset + 19, $mgt_itm_proc, value);
	}

	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public void mgt_itm_proc(double value) {
		setConstNumber(offset + 19, $mgt_itm_proc, value);
	}


	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public MCNumber mgt_itm_prov() {
		return getConstNumber(offset + 20, $mgt_itm_prov);
	}

	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public void mgt_itm_prov(MCNumber value) {
		setConstNumber(offset + 20, $mgt_itm_prov, value);
	}

	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public void mgt_itm_prov(int value) {
		setConstNumber(offset + 20, $mgt_itm_prov, value);
	}

	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public void mgt_itm_prov(long value) {
		setConstNumber(offset + 20, $mgt_itm_prov, value);
	}

	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public void mgt_itm_prov(float value) {
		setConstNumber(offset + 20, $mgt_itm_prov, value);
	}

	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public void mgt_itm_prov(double value) {
		setConstNumber(offset + 20, $mgt_itm_prov, value);
	}


	/**
	 * Cost sales unit price 原価販売単価.<p>
	 *
	 */
	public MCNumber mgt_itm_sls() {
		return getConstNumber(offset + 21, $mgt_itm_sls);
	}

	/**
	 * Cost sales unit price 原価販売単価.<p>
	 *
	 */
	public void mgt_itm_sls(MCNumber value) {
		setConstNumber(offset + 21, $mgt_itm_sls, value);
	}

	/**
	 * Cost sales unit price 原価販売単価.<p>
	 *
	 */
	public void mgt_itm_sls(int value) {
		setConstNumber(offset + 21, $mgt_itm_sls, value);
	}

	/**
	 * Cost sales unit price 原価販売単価.<p>
	 *
	 */
	public void mgt_itm_sls(long value) {
		setConstNumber(offset + 21, $mgt_itm_sls, value);
	}

	/**
	 * Cost sales unit price 原価販売単価.<p>
	 *
	 */
	public void mgt_itm_sls(float value) {
		setConstNumber(offset + 21, $mgt_itm_sls, value);
	}

	/**
	 * Cost sales unit price 原価販売単価.<p>
	 *
	 */
	public void mgt_itm_sls(double value) {
		setConstNumber(offset + 21, $mgt_itm_sls, value);
	}


	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public MCNumber mgt_itm_fix() {
		return getConstNumber(offset + 22, $mgt_itm_fix);
	}

	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public void mgt_itm_fix(MCNumber value) {
		setConstNumber(offset + 22, $mgt_itm_fix, value);
	}

	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public void mgt_itm_fix(int value) {
		setConstNumber(offset + 22, $mgt_itm_fix, value);
	}

	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public void mgt_itm_fix(long value) {
		setConstNumber(offset + 22, $mgt_itm_fix, value);
	}

	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public void mgt_itm_fix(float value) {
		setConstNumber(offset + 22, $mgt_itm_fix, value);
	}

	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public void mgt_itm_fix(double value) {
		setConstNumber(offset + 22, $mgt_itm_fix, value);
	}


	/**
	 * Item 品目.<p>
	 *
	 */
	public boolean copy_mam_itm_() {
		return getConstBoolean(offset + 23, $copy_mam_itm_);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void copy_mam_itm_(boolean value) {
		setConstBoolean(offset + 23, $copy_mam_itm_, value);
	}


	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public boolean copy_mgt_itm() {
		return getConstBoolean(offset + 24, $copy_mgt_itm);
	}

	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public void copy_mgt_itm(boolean value) {
		setConstBoolean(offset + 24, $copy_mgt_itm, value);
	}


	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public boolean copy_mgt_itm_dtl() {
		return getConstBoolean(offset + 25, $copy_mgt_itm_dtl);
	}

	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public void copy_mgt_itm_dtl(boolean value) {
		setConstBoolean(offset + 25, $copy_mgt_itm_dtl, value);
	}


	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public boolean copy_mgt_itm_oper() {
		return getConstBoolean(offset + 26, $copy_mgt_itm_oper);
	}

	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public void copy_mgt_itm_oper(boolean value) {
		setConstBoolean(offset + 26, $copy_mgt_itm_oper, value);
	}


	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public boolean copy_mgt_bom() {
		return getConstBoolean(offset + 27, $copy_mgt_bom);
	}

	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public void copy_mgt_bom(boolean value) {
		setConstBoolean(offset + 27, $copy_mgt_bom, value);
	}


	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public boolean copy_mgt_itm_wk() {
		return getConstBoolean(offset + 28, $copy_mgt_itm_wk);
	}

	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public void copy_mgt_itm_wk(boolean value) {
		setConstBoolean(offset + 28, $copy_mgt_itm_wk, value);
	}


	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public boolean copy_mgt_itm_purc() {
		return getConstBoolean(offset + 29, $copy_mgt_itm_purc);
	}

	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public void copy_mgt_itm_purc(boolean value) {
		setConstBoolean(offset + 29, $copy_mgt_itm_purc, value);
	}


	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public boolean copy_mgt_itm_proc() {
		return getConstBoolean(offset + 30, $copy_mgt_itm_proc);
	}

	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public void copy_mgt_itm_proc(boolean value) {
		setConstBoolean(offset + 30, $copy_mgt_itm_proc, value);
	}


	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public boolean copy_mgt_itm_prov() {
		return getConstBoolean(offset + 31, $copy_mgt_itm_prov);
	}

	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public void copy_mgt_itm_prov(boolean value) {
		setConstBoolean(offset + 31, $copy_mgt_itm_prov, value);
	}


	/**
	 * Cost sales unit price 原価販売単価.<p>
	 *
	 */
	public boolean copy_mgt_itm_sls() {
		return getConstBoolean(offset + 32, $copy_mgt_itm_sls);
	}

	/**
	 * Cost sales unit price 原価販売単価.<p>
	 *
	 */
	public void copy_mgt_itm_sls(boolean value) {
		setConstBoolean(offset + 32, $copy_mgt_itm_sls, value);
	}


	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public boolean copy_mgt_itm_fix() {
		return getConstBoolean(offset + 33, $copy_mgt_itm_fix);
	}

	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public void copy_mgt_itm_fix(boolean value) {
		setConstBoolean(offset + 33, $copy_mgt_itm_fix, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 34, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 34, $rts_msg_p, row);
	}


	public String getString(String name) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($base_itm_nm.equalsIgnoreCase(name)) {
			return base_itm_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			return mam_itm_();
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			return mgt_itm();
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			return mgt_itm_dtl();
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			return mgt_itm_oper();
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			return mgt_bom();
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			return mgt_itm_wk();
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			return mgt_itm_purc();
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			return mgt_itm_proc();
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			return mgt_itm_prov();
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			return mgt_itm_sls();
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			return mgt_itm_fix();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($copy_mam_itm_.equalsIgnoreCase(name)) {
			return copy_mam_itm_();
		}
		if ($copy_mgt_itm.equalsIgnoreCase(name)) {
			return copy_mgt_itm();
		}
		if ($copy_mgt_itm_dtl.equalsIgnoreCase(name)) {
			return copy_mgt_itm_dtl();
		}
		if ($copy_mgt_itm_oper.equalsIgnoreCase(name)) {
			return copy_mgt_itm_oper();
		}
		if ($copy_mgt_bom.equalsIgnoreCase(name)) {
			return copy_mgt_bom();
		}
		if ($copy_mgt_itm_wk.equalsIgnoreCase(name)) {
			return copy_mgt_itm_wk();
		}
		if ($copy_mgt_itm_purc.equalsIgnoreCase(name)) {
			return copy_mgt_itm_purc();
		}
		if ($copy_mgt_itm_proc.equalsIgnoreCase(name)) {
			return copy_mgt_itm_proc();
		}
		if ($copy_mgt_itm_prov.equalsIgnoreCase(name)) {
			return copy_mgt_itm_prov();
		}
		if ($copy_mgt_itm_sls.equalsIgnoreCase(name)) {
			return copy_mgt_itm_sls();
		}
		if ($copy_mgt_itm_fix.equalsIgnoreCase(name)) {
			return copy_mgt_itm_fix();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($base_itm_nm.equalsIgnoreCase(name)) {
			return base_itm_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			return mam_itm_();
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			return mgt_itm();
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			return mgt_itm_dtl();
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			return mgt_itm_oper();
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			return mgt_bom();
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			return mgt_itm_wk();
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			return mgt_itm_purc();
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			return mgt_itm_proc();
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			return mgt_itm_prov();
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			return mgt_itm_sls();
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			return mgt_itm_fix();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($copy_mam_itm_.equalsIgnoreCase(name)) {
			return copy_mam_itm_();
		}
		if ($copy_mgt_itm.equalsIgnoreCase(name)) {
			return copy_mgt_itm();
		}
		if ($copy_mgt_itm_dtl.equalsIgnoreCase(name)) {
			return copy_mgt_itm_dtl();
		}
		if ($copy_mgt_itm_oper.equalsIgnoreCase(name)) {
			return copy_mgt_itm_oper();
		}
		if ($copy_mgt_bom.equalsIgnoreCase(name)) {
			return copy_mgt_bom();
		}
		if ($copy_mgt_itm_wk.equalsIgnoreCase(name)) {
			return copy_mgt_itm_wk();
		}
		if ($copy_mgt_itm_purc.equalsIgnoreCase(name)) {
			return copy_mgt_itm_purc();
		}
		if ($copy_mgt_itm_proc.equalsIgnoreCase(name)) {
			return copy_mgt_itm_proc();
		}
		if ($copy_mgt_itm_prov.equalsIgnoreCase(name)) {
			return copy_mgt_itm_prov();
		}
		if ($copy_mgt_itm_sls.equalsIgnoreCase(name)) {
			return copy_mgt_itm_sls();
		}
		if ($copy_mgt_itm_fix.equalsIgnoreCase(name)) {
			return copy_mgt_itm_fix();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($base_itm_nm.equalsIgnoreCase(name)) {
			base_itm_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			mam_itm_(value);
			return;
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			mgt_itm(value);
			return;
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			mgt_itm_dtl(value);
			return;
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			mgt_itm_oper(value);
			return;
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			mgt_bom(value);
			return;
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			mgt_itm_wk(value);
			return;
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			mgt_itm_purc(value);
			return;
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			mgt_itm_proc(value);
			return;
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			mgt_itm_prov(value);
			return;
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			mgt_itm_sls(value);
			return;
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			mgt_itm_fix(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			mam_itm_(value);
			return;
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			mgt_itm(value);
			return;
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			mgt_itm_dtl(value);
			return;
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			mgt_itm_oper(value);
			return;
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			mgt_bom(value);
			return;
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			mgt_itm_wk(value);
			return;
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			mgt_itm_purc(value);
			return;
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			mgt_itm_proc(value);
			return;
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			mgt_itm_prov(value);
			return;
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			mgt_itm_sls(value);
			return;
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			mgt_itm_fix(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			mam_itm_(value);
			return;
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			mgt_itm(value);
			return;
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			mgt_itm_dtl(value);
			return;
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			mgt_itm_oper(value);
			return;
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			mgt_bom(value);
			return;
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			mgt_itm_wk(value);
			return;
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			mgt_itm_purc(value);
			return;
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			mgt_itm_proc(value);
			return;
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			mgt_itm_prov(value);
			return;
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			mgt_itm_sls(value);
			return;
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			mgt_itm_fix(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			mam_itm_(value);
			return;
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			mgt_itm(value);
			return;
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			mgt_itm_dtl(value);
			return;
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			mgt_itm_oper(value);
			return;
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			mgt_bom(value);
			return;
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			mgt_itm_wk(value);
			return;
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			mgt_itm_purc(value);
			return;
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			mgt_itm_proc(value);
			return;
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			mgt_itm_prov(value);
			return;
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			mgt_itm_sls(value);
			return;
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			mgt_itm_fix(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			mam_itm_(value);
			return;
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			mgt_itm(value);
			return;
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			mgt_itm_dtl(value);
			return;
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			mgt_itm_oper(value);
			return;
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			mgt_bom(value);
			return;
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			mgt_itm_wk(value);
			return;
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			mgt_itm_purc(value);
			return;
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			mgt_itm_proc(value);
			return;
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			mgt_itm_prov(value);
			return;
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			mgt_itm_sls(value);
			return;
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			mgt_itm_fix(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($copy_mam_itm_.equalsIgnoreCase(name)) {
			copy_mam_itm_(value);
			return;
		}
		if ($copy_mgt_itm.equalsIgnoreCase(name)) {
			copy_mgt_itm(value);
			return;
		}
		if ($copy_mgt_itm_dtl.equalsIgnoreCase(name)) {
			copy_mgt_itm_dtl(value);
			return;
		}
		if ($copy_mgt_itm_oper.equalsIgnoreCase(name)) {
			copy_mgt_itm_oper(value);
			return;
		}
		if ($copy_mgt_bom.equalsIgnoreCase(name)) {
			copy_mgt_bom(value);
			return;
		}
		if ($copy_mgt_itm_wk.equalsIgnoreCase(name)) {
			copy_mgt_itm_wk(value);
			return;
		}
		if ($copy_mgt_itm_purc.equalsIgnoreCase(name)) {
			copy_mgt_itm_purc(value);
			return;
		}
		if ($copy_mgt_itm_proc.equalsIgnoreCase(name)) {
			copy_mgt_itm_proc(value);
			return;
		}
		if ($copy_mgt_itm_prov.equalsIgnoreCase(name)) {
			copy_mgt_itm_prov(value);
			return;
		}
		if ($copy_mgt_itm_sls.equalsIgnoreCase(name)) {
			copy_mgt_itm_sls(value);
			return;
		}
		if ($copy_mgt_itm_fix.equalsIgnoreCase(name)) {
			copy_mgt_itm_fix(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($base_itm_nm.equalsIgnoreCase(name)) {
			base_itm_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			mam_itm_(value);
			return;
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			mgt_itm(value);
			return;
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			mgt_itm_dtl(value);
			return;
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			mgt_itm_oper(value);
			return;
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			mgt_bom(value);
			return;
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			mgt_itm_wk(value);
			return;
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			mgt_itm_purc(value);
			return;
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			mgt_itm_proc(value);
			return;
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			mgt_itm_prov(value);
			return;
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			mgt_itm_sls(value);
			return;
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			mgt_itm_fix(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			mam_itm_(value);
			return;
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			mgt_itm(value);
			return;
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			mgt_itm_dtl(value);
			return;
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			mgt_itm_oper(value);
			return;
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			mgt_bom(value);
			return;
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			mgt_itm_wk(value);
			return;
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			mgt_itm_purc(value);
			return;
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			mgt_itm_proc(value);
			return;
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			mgt_itm_prov(value);
			return;
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			mgt_itm_sls(value);
			return;
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			mgt_itm_fix(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			mam_itm_(value);
			return;
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			mgt_itm(value);
			return;
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			mgt_itm_dtl(value);
			return;
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			mgt_itm_oper(value);
			return;
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			mgt_bom(value);
			return;
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			mgt_itm_wk(value);
			return;
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			mgt_itm_purc(value);
			return;
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			mgt_itm_proc(value);
			return;
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			mgt_itm_prov(value);
			return;
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			mgt_itm_sls(value);
			return;
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			mgt_itm_fix(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			mam_itm_(value);
			return;
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			mgt_itm(value);
			return;
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			mgt_itm_dtl(value);
			return;
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			mgt_itm_oper(value);
			return;
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			mgt_bom(value);
			return;
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			mgt_itm_wk(value);
			return;
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			mgt_itm_purc(value);
			return;
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			mgt_itm_proc(value);
			return;
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			mgt_itm_prov(value);
			return;
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			mgt_itm_sls(value);
			return;
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			mgt_itm_fix(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			mam_itm_(value);
			return;
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			mgt_itm(value);
			return;
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			mgt_itm_dtl(value);
			return;
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			mgt_itm_oper(value);
			return;
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			mgt_bom(value);
			return;
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			mgt_itm_wk(value);
			return;
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			mgt_itm_purc(value);
			return;
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			mgt_itm_proc(value);
			return;
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			mgt_itm_prov(value);
			return;
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			mgt_itm_sls(value);
			return;
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			mgt_itm_fix(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($copy_mam_itm_.equalsIgnoreCase(name)) {
			copy_mam_itm_(value);
			return;
		}
		if ($copy_mgt_itm.equalsIgnoreCase(name)) {
			copy_mgt_itm(value);
			return;
		}
		if ($copy_mgt_itm_dtl.equalsIgnoreCase(name)) {
			copy_mgt_itm_dtl(value);
			return;
		}
		if ($copy_mgt_itm_oper.equalsIgnoreCase(name)) {
			copy_mgt_itm_oper(value);
			return;
		}
		if ($copy_mgt_bom.equalsIgnoreCase(name)) {
			copy_mgt_bom(value);
			return;
		}
		if ($copy_mgt_itm_wk.equalsIgnoreCase(name)) {
			copy_mgt_itm_wk(value);
			return;
		}
		if ($copy_mgt_itm_purc.equalsIgnoreCase(name)) {
			copy_mgt_itm_purc(value);
			return;
		}
		if ($copy_mgt_itm_proc.equalsIgnoreCase(name)) {
			copy_mgt_itm_proc(value);
			return;
		}
		if ($copy_mgt_itm_prov.equalsIgnoreCase(name)) {
			copy_mgt_itm_prov(value);
			return;
		}
		if ($copy_mgt_itm_sls.equalsIgnoreCase(name)) {
			copy_mgt_itm_sls(value);
			return;
		}
		if ($copy_mgt_itm_fix.equalsIgnoreCase(name)) {
			copy_mgt_itm_fix(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($term_p.equalsIgnoreCase(name)) {
			return term_p();
		}
		if ($src_itm_p.equalsIgnoreCase(name)) {
			return src_itm_p();
		}
		if ($dest_itm_p.equalsIgnoreCase(name)) {
			return dest_itm_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($term_p.equalsIgnoreCase(name)) {
			term_p(
				((MCContainerMeta) term_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5160.TermR.class, value)
			);
			return;
		}
		if ($src_itm_p.equalsIgnoreCase(name)) {
			src_itm_p(
				((MCContainerMeta) src_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($dest_itm_p.equalsIgnoreCase(name)) {
			dest_itm_p(
				((MCContainerMeta) dest_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate term() {
		return term_p().term();
	}

	public void term(MCDate value) {
		term_p().term(value);
	}

	/**
	 * Item cd. (Copy from) 品目ＣＤ（コピー元）.<p>
	 *
	 */
	public String itm_cd() {
		return src_itm_p().itm_cd();
	}

	/**
	 * Item cd. (Copy from) 品目ＣＤ（コピー元）.<p>
	 *
	 */
	public void itm_cd(String value) {
		src_itm_p().itm_cd(value);
	}

	/**
	 * Branch No. 1 (Copy-from) 枝番１（コピー元）.<p>
	 *
	 */
	public String itm_sub1() {
		return src_itm_p().itm_sub1();
	}

	/**
	 * Branch No. 1 (Copy-from) 枝番１（コピー元）.<p>
	 *
	 */
	public void itm_sub1(String value) {
		src_itm_p().itm_sub1(value);
	}

	/**
	 * Branch No. 2 (Copy-from) 枝番２（コピー元）.<p>
	 *
	 */
	public String itm_sub2() {
		return src_itm_p().itm_sub2();
	}

	/**
	 * Branch No. 2 (Copy-from) 枝番２（コピー元）.<p>
	 *
	 */
	public void itm_sub2(String value) {
		src_itm_p().itm_sub2(value);
	}

	/**
	 * Branch No. 3 (Copy-from) 枝番３（コピー元）.<p>
	 *
	 */
	public String itm_sub3() {
		return src_itm_p().itm_sub3();
	}

	/**
	 * Branch No. 3 (Copy-from) 枝番３（コピー元）.<p>
	 *
	 */
	public void itm_sub3(String value) {
		src_itm_p().itm_sub3(value);
	}

	/**
	 * Item name (Copy from) 品名（コピー元）.<p>
	 *
	 */
	public String itm_nm() {
		return src_itm_p().itm_nm();
	}

	/**
	 * Item name (Copy from) 品名（コピー元）.<p>
	 *
	 */
	public void itm_nm(String value) {
		src_itm_p().itm_nm(value);
	}

	/**
	 * Item cd. (Copy to) 品目ＣＤ（コピー先）.<p>
	 *
	 */
	public String dest_itm_cd() {
		return dest_itm_p().itm_cd();
	}

	/**
	 * Item cd. (Copy to) 品目ＣＤ（コピー先）.<p>
	 *
	 */
	public void dest_itm_cd(String value) {
		dest_itm_p().itm_cd(value);
	}

	/**
	 * Branch No. 1 (Copy-to) 枝番１（コピー先）.<p>
	 *
	 */
	public String dest_itm_sub1() {
		return dest_itm_p().itm_sub1();
	}

	/**
	 * Branch No. 1 (Copy-to) 枝番１（コピー先）.<p>
	 *
	 */
	public void dest_itm_sub1(String value) {
		dest_itm_p().itm_sub1(value);
	}

	/**
	 * Branch No. 2 (Copy-to) 枝番２（コピー先）.<p>
	 *
	 */
	public String dest_itm_sub2() {
		return dest_itm_p().itm_sub2();
	}

	/**
	 * Branch No. 2 (Copy-to) 枝番２（コピー先）.<p>
	 *
	 */
	public void dest_itm_sub2(String value) {
		dest_itm_p().itm_sub2(value);
	}

	/**
	 * Branch No. 3 (Copy-to) 枝番３（コピー先）.<p>
	 *
	 */
	public String dest_itm_sub3() {
		return dest_itm_p().itm_sub3();
	}

	/**
	 * Branch No. 3 (Copy-to) 枝番３（コピー先）.<p>
	 *
	 */
	public void dest_itm_sub3(String value) {
		dest_itm_p().itm_sub3(value);
	}

	/**
	 * Item name (Copy to) 品名（コピー先）.<p>
	 *
	 */
	public String dest_itm_nm() {
		return dest_itm_p().itm_nm();
	}

	/**
	 * Item name (Copy to) 品名（コピー先）.<p>
	 *
	 */
	public void dest_itm_nm(String value) {
		dest_itm_p().itm_nm(value);
	}

	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
	}

	public String rtn_sts_typ_nm() {
		return rts_msg_p().rtn_sts_typ_nm();
	}

	public void rtn_sts_typ_nm(String value) {
		rts_msg_p().rtn_sts_typ_nm(value);
	}

	public String msg_id() {
		return rts_msg_p().msg_id();
	}

	public void msg_id(String value) {
		rts_msg_p().msg_id(value);
	}

	public String msg() {
		return rts_msg_p().msg();
	}

	public void msg(String value) {
		rts_msg_p().msg(value);
	}

}

