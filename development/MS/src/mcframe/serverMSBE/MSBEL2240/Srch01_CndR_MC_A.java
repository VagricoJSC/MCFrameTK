package mcframe.serverMSBE.MSBEL2240;

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
	 * Purchase invoice creating source type 受領インボイス作成元区分.<p>
	 *
	 */
	public static final String $rcpt_iv_src_typ = "rcpt_iv_src_typ";
	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public static final String $in_to_id_typ = "in_to_id_typ";
	/**
	 * Delivery destination identification cd. 納入先識別ＣＤ.<p>
	 *
	 */
	public static final String $in_to_id_cd = "in_to_id_cd";
	/**
	 * Delivery destination identification name 納入先識別名.<p>
	 *
	 */
	public static final String $in_to_id_nm = "in_to_id_nm";
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public static final String $in_to_zip_cd = "in_to_zip_cd";
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public static final String $in_to_addr1 = "in_to_addr1";
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public static final String $in_to_addr2 = "in_to_addr2";
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public static final String $in_to_addr3 = "in_to_addr3";
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public static final String $in_to_addr4 = "in_to_addr4";
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public static final String $in_to_tel = "in_to_tel";
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public static final String $in_to_fax = "in_to_fax";
	/**
	 * Dept. in charge 担当部署.<p>
	 *
	 */
	public static final String $in_to_cntct_dpt = "in_to_cntct_dpt";
	/**
	 * PIC 担当者.<p>
	 *
	 */
	public static final String $in_to_cntct_psn = "in_to_cntct_psn";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $in_to_cntry_cd = "in_to_cntry_cd";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * PO currency cd. 発注通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Sales order currency cd. 受注通貨ＣＤ.<p>
	 *
	 */
	public static final String $slo_cur_cd = "slo_cur_cd";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Sales order transaction pattern type 受注取引パタン区分.<p>
	 *
	 */
	public static final String $slo_trd_ptn_typ = "slo_trd_ptn_typ";
	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public static final String $sls_basis_typ = "sls_basis_typ";
	/**
	 * Sales order transaction terms cd. 1 受注取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $slo_tterm_cd1 = "slo_tterm_cd1";
	/**
	 * Sales order transaction terms cd. 2 受注取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $slo_tterm_cd2 = "slo_tterm_cd2";
	/**
	 * Sales order transaction terms cd. 3 受注取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $slo_tterm_cd3 = "slo_tterm_cd3";
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public static final String $purc_schd_dt = "purc_schd_dt";
	public static final String $has_arr_basis_flg = "has_arr_basis_flg";


	public static final MCMeta rcpt_iv_src_typ_META = createCommonMeta($rcpt_iv_src_typ, mcframe.commonMS.meta.MS_META.RCPT_IV_SRC_TYP);
	public static final MCMeta in_to_id_typ_META = createCommonMeta($in_to_id_typ, mcframe.commonMS.meta.MS_META.IN_TO_ID_TYP);
	public static final MCMeta in_to_id_cd_META = createCommonMeta($in_to_id_cd, mcframe.commonMS.meta.MS_META.IN_TO_ID_CD);
	public static final MCMeta in_to_id_nm_META = createCommonMeta($in_to_id_nm, mcframe.commonMS.meta.MS_META.IN_TO_ID_NM);
	public static final MCMeta in_to_zip_cd_META = createCommonMeta($in_to_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta in_to_addr1_META = createCommonMeta($in_to_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr2_META = createCommonMeta($in_to_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr3_META = createCommonMeta($in_to_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr4_META = createCommonMeta($in_to_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_tel_META = createCommonMeta($in_to_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta in_to_fax_META = createCommonMeta($in_to_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta in_to_cntct_dpt_META = createCommonMeta($in_to_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta in_to_cntct_psn_META = createCommonMeta($in_to_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta in_to_cntry_cd_META = createCommonMeta($in_to_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta slo_cur_cd_META = createCommonMeta($slo_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta slo_trd_ptn_typ_META = createCommonMeta($slo_trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta slo_tterm_cd1_META = createCommonMeta($slo_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta slo_tterm_cd2_META = createCommonMeta($slo_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta slo_tterm_cd3_META = createCommonMeta($slo_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta purc_schd_dt_META = createCommonMeta($purc_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta has_arr_basis_flg_META = createCommonMeta($has_arr_basis_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rcpt_iv_src_typ_META,
			in_to_id_typ_META,
			in_to_id_cd_META,
			in_to_id_nm_META,
			in_to_zip_cd_META,
			in_to_addr1_META,
			in_to_addr2_META,
			in_to_addr3_META,
			in_to_addr4_META,
			in_to_tel_META,
			in_to_fax_META,
			in_to_cntct_dpt_META,
			in_to_cntct_psn_META,
			in_to_cntry_cd_META,
			sppl_cd_META,
			trd_cur_cd_META,
			slo_cur_cd_META,
			cst_cd_META,
			slo_trd_ptn_typ_META,
			sls_basis_typ_META,
			slo_tterm_cd1_META,
			slo_tterm_cd2_META,
			slo_tterm_cd3_META,
			purc_schd_dt_META,
			has_arr_basis_flg_META
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
	 * Purchase invoice creating source type 受領インボイス作成元区分.<p>
	 *
	 */
	public String rcpt_iv_src_typ() {
		return getConstString(offset + 0, $rcpt_iv_src_typ);
	}

	/**
	 * Purchase invoice creating source type 受領インボイス作成元区分.<p>
	 *
	 */
	public void rcpt_iv_src_typ(String value) {
		setConstString(offset + 0, $rcpt_iv_src_typ, value);
	}


	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public String in_to_id_typ() {
		return getConstString(offset + 1, $in_to_id_typ);
	}

	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public void in_to_id_typ(String value) {
		setConstString(offset + 1, $in_to_id_typ, value);
	}


	/**
	 * Delivery destination identification cd. 納入先識別ＣＤ.<p>
	 *
	 */
	public String in_to_id_cd() {
		return getConstString(offset + 2, $in_to_id_cd);
	}

	/**
	 * Delivery destination identification cd. 納入先識別ＣＤ.<p>
	 *
	 */
	public void in_to_id_cd(String value) {
		setConstString(offset + 2, $in_to_id_cd, value);
	}


	/**
	 * Delivery destination identification name 納入先識別名.<p>
	 *
	 */
	public String in_to_id_nm() {
		return getConstString(offset + 3, $in_to_id_nm);
	}

	/**
	 * Delivery destination identification name 納入先識別名.<p>
	 *
	 */
	public void in_to_id_nm(String value) {
		setConstString(offset + 3, $in_to_id_nm, value);
	}


	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public String in_to_zip_cd() {
		return getConstString(offset + 4, $in_to_zip_cd);
	}

	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public void in_to_zip_cd(String value) {
		setConstString(offset + 4, $in_to_zip_cd, value);
	}


	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public String in_to_addr1() {
		return getConstString(offset + 5, $in_to_addr1);
	}

	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public void in_to_addr1(String value) {
		setConstString(offset + 5, $in_to_addr1, value);
	}


	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public String in_to_addr2() {
		return getConstString(offset + 6, $in_to_addr2);
	}

	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public void in_to_addr2(String value) {
		setConstString(offset + 6, $in_to_addr2, value);
	}


	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public String in_to_addr3() {
		return getConstString(offset + 7, $in_to_addr3);
	}

	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public void in_to_addr3(String value) {
		setConstString(offset + 7, $in_to_addr3, value);
	}


	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public String in_to_addr4() {
		return getConstString(offset + 8, $in_to_addr4);
	}

	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public void in_to_addr4(String value) {
		setConstString(offset + 8, $in_to_addr4, value);
	}


	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public String in_to_tel() {
		return getConstString(offset + 9, $in_to_tel);
	}

	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public void in_to_tel(String value) {
		setConstString(offset + 9, $in_to_tel, value);
	}


	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public String in_to_fax() {
		return getConstString(offset + 10, $in_to_fax);
	}

	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public void in_to_fax(String value) {
		setConstString(offset + 10, $in_to_fax, value);
	}


	/**
	 * Dept. in charge 担当部署.<p>
	 *
	 */
	public String in_to_cntct_dpt() {
		return getConstString(offset + 11, $in_to_cntct_dpt);
	}

	/**
	 * Dept. in charge 担当部署.<p>
	 *
	 */
	public void in_to_cntct_dpt(String value) {
		setConstString(offset + 11, $in_to_cntct_dpt, value);
	}


	/**
	 * PIC 担当者.<p>
	 *
	 */
	public String in_to_cntct_psn() {
		return getConstString(offset + 12, $in_to_cntct_psn);
	}

	/**
	 * PIC 担当者.<p>
	 *
	 */
	public void in_to_cntct_psn(String value) {
		setConstString(offset + 12, $in_to_cntct_psn, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String in_to_cntry_cd() {
		return getConstString(offset + 13, $in_to_cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void in_to_cntry_cd(String value) {
		setConstString(offset + 13, $in_to_cntry_cd, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 14, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 14, $sppl_cd, value);
	}


	/**
	 * PO currency cd. 発注通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 15, $trd_cur_cd);
	}

	/**
	 * PO currency cd. 発注通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 15, $trd_cur_cd, value);
	}


	/**
	 * Sales order currency cd. 受注通貨ＣＤ.<p>
	 *
	 */
	public String slo_cur_cd() {
		return getConstString(offset + 16, $slo_cur_cd);
	}

	/**
	 * Sales order currency cd. 受注通貨ＣＤ.<p>
	 *
	 */
	public void slo_cur_cd(String value) {
		setConstString(offset + 16, $slo_cur_cd, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 17, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 17, $cst_cd, value);
	}


	/**
	 * Sales order transaction pattern type 受注取引パタン区分.<p>
	 *
	 */
	public String slo_trd_ptn_typ() {
		return getConstString(offset + 18, $slo_trd_ptn_typ);
	}

	/**
	 * Sales order transaction pattern type 受注取引パタン区分.<p>
	 *
	 */
	public void slo_trd_ptn_typ(String value) {
		setConstString(offset + 18, $slo_trd_ptn_typ, value);
	}


	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 19, $sls_basis_typ);
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 19, $sls_basis_typ, value);
	}


	/**
	 * Sales order transaction terms cd. 1 受注取引条件ＣＤ１.<p>
	 *
	 */
	public String slo_tterm_cd1() {
		return getConstString(offset + 20, $slo_tterm_cd1);
	}

	/**
	 * Sales order transaction terms cd. 1 受注取引条件ＣＤ１.<p>
	 *
	 */
	public void slo_tterm_cd1(String value) {
		setConstString(offset + 20, $slo_tterm_cd1, value);
	}


	/**
	 * Sales order transaction terms cd. 2 受注取引条件ＣＤ２.<p>
	 *
	 */
	public String slo_tterm_cd2() {
		return getConstString(offset + 21, $slo_tterm_cd2);
	}

	/**
	 * Sales order transaction terms cd. 2 受注取引条件ＣＤ２.<p>
	 *
	 */
	public void slo_tterm_cd2(String value) {
		setConstString(offset + 21, $slo_tterm_cd2, value);
	}


	/**
	 * Sales order transaction terms cd. 3 受注取引条件ＣＤ３.<p>
	 *
	 */
	public String slo_tterm_cd3() {
		return getConstString(offset + 22, $slo_tterm_cd3);
	}

	/**
	 * Sales order transaction terms cd. 3 受注取引条件ＣＤ３.<p>
	 *
	 */
	public void slo_tterm_cd3(String value) {
		setConstString(offset + 22, $slo_tterm_cd3, value);
	}


	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return getConstDate(offset + 23, $purc_schd_dt);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		setConstDate(offset + 23, $purc_schd_dt, value);
	}


	public boolean has_arr_basis_flg() {
		return getConstBoolean(offset + 24, $has_arr_basis_flg);
	}

	public void has_arr_basis_flg(boolean value) {
		setConstBoolean(offset + 24, $has_arr_basis_flg, value);
	}


	public String getString(String name) {
		if ($rcpt_iv_src_typ.equalsIgnoreCase(name)) {
			return rcpt_iv_src_typ();
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			return in_to_id_typ();
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			return in_to_id_cd();
		}
		if ($in_to_id_nm.equalsIgnoreCase(name)) {
			return in_to_id_nm();
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			return in_to_zip_cd();
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			return in_to_addr1();
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			return in_to_addr2();
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			return in_to_addr3();
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			return in_to_addr4();
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			return in_to_tel();
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			return in_to_fax();
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			return in_to_cntct_dpt();
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			return in_to_cntct_psn();
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			return in_to_cntry_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($slo_cur_cd.equalsIgnoreCase(name)) {
			return slo_cur_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($slo_trd_ptn_typ.equalsIgnoreCase(name)) {
			return slo_trd_ptn_typ();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($slo_tterm_cd1.equalsIgnoreCase(name)) {
			return slo_tterm_cd1();
		}
		if ($slo_tterm_cd2.equalsIgnoreCase(name)) {
			return slo_tterm_cd2();
		}
		if ($slo_tterm_cd3.equalsIgnoreCase(name)) {
			return slo_tterm_cd3();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($has_arr_basis_flg.equalsIgnoreCase(name)) {
			return has_arr_basis_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($rcpt_iv_src_typ.equalsIgnoreCase(name)) {
			return rcpt_iv_src_typ();
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			return in_to_id_typ();
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			return in_to_id_cd();
		}
		if ($in_to_id_nm.equalsIgnoreCase(name)) {
			return in_to_id_nm();
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			return in_to_zip_cd();
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			return in_to_addr1();
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			return in_to_addr2();
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			return in_to_addr3();
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			return in_to_addr4();
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			return in_to_tel();
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			return in_to_fax();
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			return in_to_cntct_dpt();
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			return in_to_cntct_psn();
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			return in_to_cntry_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($slo_cur_cd.equalsIgnoreCase(name)) {
			return slo_cur_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($slo_trd_ptn_typ.equalsIgnoreCase(name)) {
			return slo_trd_ptn_typ();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($slo_tterm_cd1.equalsIgnoreCase(name)) {
			return slo_tterm_cd1();
		}
		if ($slo_tterm_cd2.equalsIgnoreCase(name)) {
			return slo_tterm_cd2();
		}
		if ($slo_tterm_cd3.equalsIgnoreCase(name)) {
			return slo_tterm_cd3();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($has_arr_basis_flg.equalsIgnoreCase(name)) {
			return has_arr_basis_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($rcpt_iv_src_typ.equalsIgnoreCase(name)) {
			rcpt_iv_src_typ(value);
			return;
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			in_to_id_typ(value);
			return;
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			in_to_id_cd(value);
			return;
		}
		if ($in_to_id_nm.equalsIgnoreCase(name)) {
			in_to_id_nm(value);
			return;
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			in_to_zip_cd(value);
			return;
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			in_to_addr1(value);
			return;
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			in_to_addr2(value);
			return;
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			in_to_addr3(value);
			return;
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			in_to_addr4(value);
			return;
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			in_to_tel(value);
			return;
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			in_to_fax(value);
			return;
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			in_to_cntct_dpt(value);
			return;
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			in_to_cntct_psn(value);
			return;
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			in_to_cntry_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($slo_cur_cd.equalsIgnoreCase(name)) {
			slo_cur_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($slo_trd_ptn_typ.equalsIgnoreCase(name)) {
			slo_trd_ptn_typ(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($slo_tterm_cd1.equalsIgnoreCase(name)) {
			slo_tterm_cd1(value);
			return;
		}
		if ($slo_tterm_cd2.equalsIgnoreCase(name)) {
			slo_tterm_cd2(value);
			return;
		}
		if ($slo_tterm_cd3.equalsIgnoreCase(name)) {
			slo_tterm_cd3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($has_arr_basis_flg.equalsIgnoreCase(name)) {
			has_arr_basis_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcpt_iv_src_typ.equalsIgnoreCase(name)) {
			rcpt_iv_src_typ(value);
			return;
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			in_to_id_typ(value);
			return;
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			in_to_id_cd(value);
			return;
		}
		if ($in_to_id_nm.equalsIgnoreCase(name)) {
			in_to_id_nm(value);
			return;
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			in_to_zip_cd(value);
			return;
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			in_to_addr1(value);
			return;
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			in_to_addr2(value);
			return;
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			in_to_addr3(value);
			return;
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			in_to_addr4(value);
			return;
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			in_to_tel(value);
			return;
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			in_to_fax(value);
			return;
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			in_to_cntct_dpt(value);
			return;
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			in_to_cntct_psn(value);
			return;
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			in_to_cntry_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($slo_cur_cd.equalsIgnoreCase(name)) {
			slo_cur_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($slo_trd_ptn_typ.equalsIgnoreCase(name)) {
			slo_trd_ptn_typ(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($slo_tterm_cd1.equalsIgnoreCase(name)) {
			slo_tterm_cd1(value);
			return;
		}
		if ($slo_tterm_cd2.equalsIgnoreCase(name)) {
			slo_tterm_cd2(value);
			return;
		}
		if ($slo_tterm_cd3.equalsIgnoreCase(name)) {
			slo_tterm_cd3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($has_arr_basis_flg.equalsIgnoreCase(name)) {
			has_arr_basis_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

