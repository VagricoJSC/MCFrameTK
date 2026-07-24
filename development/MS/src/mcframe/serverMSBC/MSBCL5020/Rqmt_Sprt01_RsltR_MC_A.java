package mcframe.serverMSBC.MSBCL5020;

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
 * ブロック"Rqmt_Sprt01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Rqmt_Sprt01_RsltR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Due date 納期.<p>
	 *
	 */
	public static final String $due_dt = "due_dt";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Keep SEIBAN No. 1 手配ＮＯ１保持.<p>
	 *
	 */
	public static final String $sno1_keep_flg = "sno1_keep_flg";
	/**
	 * Keep SEIBAN No. 2 手配ＮＯ２保持.<p>
	 *
	 */
	public static final String $sno2_keep_flg = "sno2_keep_flg";
	/**
	 * Keep SEIBAN No. 3 手配ＮＯ３保持.<p>
	 *
	 */
	public static final String $sno3_keep_flg = "sno3_keep_flg";
	/**
	 * Keep SEIBAN No. 4 手配ＮＯ４保持.<p>
	 *
	 */
	public static final String $sno4_keep_flg = "sno4_keep_flg";
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
	 * Requirements SEIBAN No. 1 required 所要手配ＮＯ１必須.<p>
	 *
	 */
	public static final String $rqmt_sno1_flg = "rqmt_sno1_flg";
	/**
	 * Requirements SEIBAN No. 2 required 所要手配ＮＯ２必須.<p>
	 *
	 */
	public static final String $rqmt_sno2_flg = "rqmt_sno2_flg";
	/**
	 * Requirements SEIBAN No. 3 required 所要手配ＮＯ３必須.<p>
	 *
	 */
	public static final String $rqmt_sno3_flg = "rqmt_sno3_flg";
	/**
	 * Requirements SEIBAN No. 4 required 所要手配ＮＯ４必須.<p>
	 *
	 */
	public static final String $rqmt_sno4_flg = "rqmt_sno4_flg";
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public static final String $sno1_num_typ = "sno1_num_typ";
	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public static final String $sno2_num_typ = "sno2_num_typ";
	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public static final String $sno3_num_typ = "sno3_num_typ";
	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public static final String $sno4_num_typ = "sno4_num_typ";
	/**
	 * SEIBAN No. 1 numbering pattern cd. 手配ＮＯ１発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sno1_ptn_cd = "sno1_ptn_cd";
	/**
	 * SEIBAN No. 2 numbering pattern cd. 手配ＮＯ２発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sno2_ptn_cd = "sno2_ptn_cd";
	/**
	 * SEIBAN No. 3 numbering pattern cd. 手配ＮＯ３発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sno3_ptn_cd = "sno3_ptn_cd";
	/**
	 * SEIBAN No. 4 numbering pattern cd. 手配ＮＯ４発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sno4_ptn_cd = "sno4_ptn_cd";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta due_dt_META = createCommonMeta($due_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno1_keep_flg_META = createCommonMeta($sno1_keep_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_keep_flg_META = createCommonMeta($sno2_keep_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_keep_flg_META = createCommonMeta($sno3_keep_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_keep_flg_META = createCommonMeta($sno4_keep_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta rqmt_sno1_flg_META = createCommonMeta($rqmt_sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqmt_sno2_flg_META = createCommonMeta($rqmt_sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqmt_sno3_flg_META = createCommonMeta($rqmt_sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqmt_sno4_flg_META = createCommonMeta($rqmt_sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno1_num_typ_META = createCommonMeta($sno1_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno2_num_typ_META = createCommonMeta($sno2_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno3_num_typ_META = createCommonMeta($sno3_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno4_num_typ_META = createCommonMeta($sno4_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno1_ptn_cd_META = createCommonMeta($sno1_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sno2_ptn_cd_META = createCommonMeta($sno2_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sno3_ptn_cd_META = createCommonMeta($sno3_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sno4_ptn_cd_META = createCommonMeta($sno4_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);

	protected static final ConstMetaList<Rqmt_Sprt01_RsltR> constMetas = new ConstMetaList<Rqmt_Sprt01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			strg_loc_cd_META,
			site_cd_META,
			wg_cd_META,
			due_dt_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			sno1_keep_flg_META,
			sno2_keep_flg_META,
			sno3_keep_flg_META,
			sno4_keep_flg_META,
			wrk_no_META,
			wrk_nm_META,
			rqmt_sno1_flg_META,
			rqmt_sno2_flg_META,
			rqmt_sno3_flg_META,
			rqmt_sno4_flg_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			sno1_num_typ_META,
			sno2_num_typ_META,
			sno3_num_typ_META,
			sno4_num_typ_META,
			sno1_ptn_cd_META,
			sno2_ptn_cd_META,
			sno3_ptn_cd_META,
			sno4_ptn_cd_META
		},
		new String[][]{
			{
			},
			{
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
	protected Rqmt_Sprt01_RsltR_MC_A(ConstMetaList<? extends Rqmt_Sprt01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rqmt_Sprt01_RsltR clone() {
		return (Rqmt_Sprt01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rqmt_Sprt01_RsltR createInstance() {
		return (Rqmt_Sprt01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rqmt_Sprt01_RsltR getValues(String... names) {
		return (Rqmt_Sprt01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 5, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 5, $strg_loc_cd, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 6, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 6, $site_cd, value);
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
	 * Due date 納期.<p>
	 *
	 */
	public MCDate due_dt() {
		return getConstDate(offset + 8, $due_dt);
	}

	/**
	 * Due date 納期.<p>
	 *
	 */
	public void due_dt(MCDate value) {
		setConstDate(offset + 8, $due_dt, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 9, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 9, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 10, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 10, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 11, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 11, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 12, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 12, $sno4, value);
	}


	/**
	 * Keep SEIBAN No. 1 手配ＮＯ１保持.<p>
	 *
	 */
	public boolean sno1_keep_flg() {
		return getConstBoolean(offset + 13, $sno1_keep_flg);
	}

	/**
	 * Keep SEIBAN No. 1 手配ＮＯ１保持.<p>
	 *
	 */
	public void sno1_keep_flg(boolean value) {
		setConstBoolean(offset + 13, $sno1_keep_flg, value);
	}


	/**
	 * Keep SEIBAN No. 2 手配ＮＯ２保持.<p>
	 *
	 */
	public boolean sno2_keep_flg() {
		return getConstBoolean(offset + 14, $sno2_keep_flg);
	}

	/**
	 * Keep SEIBAN No. 2 手配ＮＯ２保持.<p>
	 *
	 */
	public void sno2_keep_flg(boolean value) {
		setConstBoolean(offset + 14, $sno2_keep_flg, value);
	}


	/**
	 * Keep SEIBAN No. 3 手配ＮＯ３保持.<p>
	 *
	 */
	public boolean sno3_keep_flg() {
		return getConstBoolean(offset + 15, $sno3_keep_flg);
	}

	/**
	 * Keep SEIBAN No. 3 手配ＮＯ３保持.<p>
	 *
	 */
	public void sno3_keep_flg(boolean value) {
		setConstBoolean(offset + 15, $sno3_keep_flg, value);
	}


	/**
	 * Keep SEIBAN No. 4 手配ＮＯ４保持.<p>
	 *
	 */
	public boolean sno4_keep_flg() {
		return getConstBoolean(offset + 16, $sno4_keep_flg);
	}

	/**
	 * Keep SEIBAN No. 4 手配ＮＯ４保持.<p>
	 *
	 */
	public void sno4_keep_flg(boolean value) {
		setConstBoolean(offset + 16, $sno4_keep_flg, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 17, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 17, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 18, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 18, $wrk_nm, value);
	}


	/**
	 * Requirements SEIBAN No. 1 required 所要手配ＮＯ１必須.<p>
	 *
	 */
	public boolean rqmt_sno1_flg() {
		return getConstBoolean(offset + 19, $rqmt_sno1_flg);
	}

	/**
	 * Requirements SEIBAN No. 1 required 所要手配ＮＯ１必須.<p>
	 *
	 */
	public void rqmt_sno1_flg(boolean value) {
		setConstBoolean(offset + 19, $rqmt_sno1_flg, value);
	}


	/**
	 * Requirements SEIBAN No. 2 required 所要手配ＮＯ２必須.<p>
	 *
	 */
	public boolean rqmt_sno2_flg() {
		return getConstBoolean(offset + 20, $rqmt_sno2_flg);
	}

	/**
	 * Requirements SEIBAN No. 2 required 所要手配ＮＯ２必須.<p>
	 *
	 */
	public void rqmt_sno2_flg(boolean value) {
		setConstBoolean(offset + 20, $rqmt_sno2_flg, value);
	}


	/**
	 * Requirements SEIBAN No. 3 required 所要手配ＮＯ３必須.<p>
	 *
	 */
	public boolean rqmt_sno3_flg() {
		return getConstBoolean(offset + 21, $rqmt_sno3_flg);
	}

	/**
	 * Requirements SEIBAN No. 3 required 所要手配ＮＯ３必須.<p>
	 *
	 */
	public void rqmt_sno3_flg(boolean value) {
		setConstBoolean(offset + 21, $rqmt_sno3_flg, value);
	}


	/**
	 * Requirements SEIBAN No. 4 required 所要手配ＮＯ４必須.<p>
	 *
	 */
	public boolean rqmt_sno4_flg() {
		return getConstBoolean(offset + 22, $rqmt_sno4_flg);
	}

	/**
	 * Requirements SEIBAN No. 4 required 所要手配ＮＯ４必須.<p>
	 *
	 */
	public void rqmt_sno4_flg(boolean value) {
		setConstBoolean(offset + 22, $rqmt_sno4_flg, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 23, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 23, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 24, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 24, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 25, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 25, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 26, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 26, $sno4_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public String sno1_num_typ() {
		return getConstString(offset + 27, $sno1_num_typ);
	}

	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public void sno1_num_typ(String value) {
		setConstString(offset + 27, $sno1_num_typ, value);
	}


	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public String sno2_num_typ() {
		return getConstString(offset + 28, $sno2_num_typ);
	}

	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public void sno2_num_typ(String value) {
		setConstString(offset + 28, $sno2_num_typ, value);
	}


	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public String sno3_num_typ() {
		return getConstString(offset + 29, $sno3_num_typ);
	}

	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public void sno3_num_typ(String value) {
		setConstString(offset + 29, $sno3_num_typ, value);
	}


	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public String sno4_num_typ() {
		return getConstString(offset + 30, $sno4_num_typ);
	}

	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public void sno4_num_typ(String value) {
		setConstString(offset + 30, $sno4_num_typ, value);
	}


	/**
	 * SEIBAN No. 1 numbering pattern cd. 手配ＮＯ１発番パタンＣＤ.<p>
	 *
	 */
	public String sno1_ptn_cd() {
		return getConstString(offset + 31, $sno1_ptn_cd);
	}

	/**
	 * SEIBAN No. 1 numbering pattern cd. 手配ＮＯ１発番パタンＣＤ.<p>
	 *
	 */
	public void sno1_ptn_cd(String value) {
		setConstString(offset + 31, $sno1_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 2 numbering pattern cd. 手配ＮＯ２発番パタンＣＤ.<p>
	 *
	 */
	public String sno2_ptn_cd() {
		return getConstString(offset + 32, $sno2_ptn_cd);
	}

	/**
	 * SEIBAN No. 2 numbering pattern cd. 手配ＮＯ２発番パタンＣＤ.<p>
	 *
	 */
	public void sno2_ptn_cd(String value) {
		setConstString(offset + 32, $sno2_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 3 numbering pattern cd. 手配ＮＯ３発番パタンＣＤ.<p>
	 *
	 */
	public String sno3_ptn_cd() {
		return getConstString(offset + 33, $sno3_ptn_cd);
	}

	/**
	 * SEIBAN No. 3 numbering pattern cd. 手配ＮＯ３発番パタンＣＤ.<p>
	 *
	 */
	public void sno3_ptn_cd(String value) {
		setConstString(offset + 33, $sno3_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 4 numbering pattern cd. 手配ＮＯ４発番パタンＣＤ.<p>
	 *
	 */
	public String sno4_ptn_cd() {
		return getConstString(offset + 34, $sno4_ptn_cd);
	}

	/**
	 * SEIBAN No. 4 numbering pattern cd. 手配ＮＯ４発番パタンＣＤ.<p>
	 *
	 */
	public void sno4_ptn_cd(String value) {
		setConstString(offset + 34, $sno4_ptn_cd, value);
	}


	public String getString(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			return sno1_num_typ();
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			return sno2_num_typ();
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			return sno3_num_typ();
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			return sno4_num_typ();
		}
		if ($sno1_ptn_cd.equalsIgnoreCase(name)) {
			return sno1_ptn_cd();
		}
		if ($sno2_ptn_cd.equalsIgnoreCase(name)) {
			return sno2_ptn_cd();
		}
		if ($sno3_ptn_cd.equalsIgnoreCase(name)) {
			return sno3_ptn_cd();
		}
		if ($sno4_ptn_cd.equalsIgnoreCase(name)) {
			return sno4_ptn_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($sno1_keep_flg.equalsIgnoreCase(name)) {
			return sno1_keep_flg();
		}
		if ($sno2_keep_flg.equalsIgnoreCase(name)) {
			return sno2_keep_flg();
		}
		if ($sno3_keep_flg.equalsIgnoreCase(name)) {
			return sno3_keep_flg();
		}
		if ($sno4_keep_flg.equalsIgnoreCase(name)) {
			return sno4_keep_flg();
		}
		if ($rqmt_sno1_flg.equalsIgnoreCase(name)) {
			return rqmt_sno1_flg();
		}
		if ($rqmt_sno2_flg.equalsIgnoreCase(name)) {
			return rqmt_sno2_flg();
		}
		if ($rqmt_sno3_flg.equalsIgnoreCase(name)) {
			return rqmt_sno3_flg();
		}
		if ($rqmt_sno4_flg.equalsIgnoreCase(name)) {
			return rqmt_sno4_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			return sno1_num_typ();
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			return sno2_num_typ();
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			return sno3_num_typ();
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			return sno4_num_typ();
		}
		if ($sno1_ptn_cd.equalsIgnoreCase(name)) {
			return sno1_ptn_cd();
		}
		if ($sno2_ptn_cd.equalsIgnoreCase(name)) {
			return sno2_ptn_cd();
		}
		if ($sno3_ptn_cd.equalsIgnoreCase(name)) {
			return sno3_ptn_cd();
		}
		if ($sno4_ptn_cd.equalsIgnoreCase(name)) {
			return sno4_ptn_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sno1_keep_flg.equalsIgnoreCase(name)) {
			return sno1_keep_flg();
		}
		if ($sno2_keep_flg.equalsIgnoreCase(name)) {
			return sno2_keep_flg();
		}
		if ($sno3_keep_flg.equalsIgnoreCase(name)) {
			return sno3_keep_flg();
		}
		if ($sno4_keep_flg.equalsIgnoreCase(name)) {
			return sno4_keep_flg();
		}
		if ($rqmt_sno1_flg.equalsIgnoreCase(name)) {
			return rqmt_sno1_flg();
		}
		if ($rqmt_sno2_flg.equalsIgnoreCase(name)) {
			return rqmt_sno2_flg();
		}
		if ($rqmt_sno3_flg.equalsIgnoreCase(name)) {
			return rqmt_sno3_flg();
		}
		if ($rqmt_sno4_flg.equalsIgnoreCase(name)) {
			return rqmt_sno4_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			sno1_num_typ(value);
			return;
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			sno2_num_typ(value);
			return;
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			sno3_num_typ(value);
			return;
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			sno4_num_typ(value);
			return;
		}
		if ($sno1_ptn_cd.equalsIgnoreCase(name)) {
			sno1_ptn_cd(value);
			return;
		}
		if ($sno2_ptn_cd.equalsIgnoreCase(name)) {
			sno2_ptn_cd(value);
			return;
		}
		if ($sno3_ptn_cd.equalsIgnoreCase(name)) {
			sno3_ptn_cd(value);
			return;
		}
		if ($sno4_ptn_cd.equalsIgnoreCase(name)) {
			sno4_ptn_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($due_dt.equalsIgnoreCase(name)) {
			due_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sno1_keep_flg.equalsIgnoreCase(name)) {
			sno1_keep_flg(value);
			return;
		}
		if ($sno2_keep_flg.equalsIgnoreCase(name)) {
			sno2_keep_flg(value);
			return;
		}
		if ($sno3_keep_flg.equalsIgnoreCase(name)) {
			sno3_keep_flg(value);
			return;
		}
		if ($sno4_keep_flg.equalsIgnoreCase(name)) {
			sno4_keep_flg(value);
			return;
		}
		if ($rqmt_sno1_flg.equalsIgnoreCase(name)) {
			rqmt_sno1_flg(value);
			return;
		}
		if ($rqmt_sno2_flg.equalsIgnoreCase(name)) {
			rqmt_sno2_flg(value);
			return;
		}
		if ($rqmt_sno3_flg.equalsIgnoreCase(name)) {
			rqmt_sno3_flg(value);
			return;
		}
		if ($rqmt_sno4_flg.equalsIgnoreCase(name)) {
			rqmt_sno4_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			sno1_num_typ(value);
			return;
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			sno2_num_typ(value);
			return;
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			sno3_num_typ(value);
			return;
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			sno4_num_typ(value);
			return;
		}
		if ($sno1_ptn_cd.equalsIgnoreCase(name)) {
			sno1_ptn_cd(value);
			return;
		}
		if ($sno2_ptn_cd.equalsIgnoreCase(name)) {
			sno2_ptn_cd(value);
			return;
		}
		if ($sno3_ptn_cd.equalsIgnoreCase(name)) {
			sno3_ptn_cd(value);
			return;
		}
		if ($sno4_ptn_cd.equalsIgnoreCase(name)) {
			sno4_ptn_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($due_dt.equalsIgnoreCase(name)) {
			due_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sno1_keep_flg.equalsIgnoreCase(name)) {
			sno1_keep_flg(value);
			return;
		}
		if ($sno2_keep_flg.equalsIgnoreCase(name)) {
			sno2_keep_flg(value);
			return;
		}
		if ($sno3_keep_flg.equalsIgnoreCase(name)) {
			sno3_keep_flg(value);
			return;
		}
		if ($sno4_keep_flg.equalsIgnoreCase(name)) {
			sno4_keep_flg(value);
			return;
		}
		if ($rqmt_sno1_flg.equalsIgnoreCase(name)) {
			rqmt_sno1_flg(value);
			return;
		}
		if ($rqmt_sno2_flg.equalsIgnoreCase(name)) {
			rqmt_sno2_flg(value);
			return;
		}
		if ($rqmt_sno3_flg.equalsIgnoreCase(name)) {
			rqmt_sno3_flg(value);
			return;
		}
		if ($rqmt_sno4_flg.equalsIgnoreCase(name)) {
			rqmt_sno4_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

