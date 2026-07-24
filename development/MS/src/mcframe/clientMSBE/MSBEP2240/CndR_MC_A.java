package mcframe.clientMSBE.MSBEP2240;

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
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
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
	/**
	 * Purchase biz transaction terms cd. 1 購買取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $purc_tterm_cd1 = "purc_tterm_cd1";
	/**
	 * Purchase biz transaction terms name 1 購買取引条件名１.<p>
	 *
	 */
	public static final String $purc_tterm_nm1 = "purc_tterm_nm1";
	/**
	 * Purchase biz transaction terms remarks 1 購買取引条件備考１.<p>
	 *
	 */
	public static final String $purc_tterm_rmrks1 = "purc_tterm_rmrks1";
	/**
	 * Purchase biz transaction terms cd. 2 購買取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $purc_tterm_cd2 = "purc_tterm_cd2";
	/**
	 * Purchase biz transaction terms name 2 購買取引条件名２.<p>
	 *
	 */
	public static final String $purc_tterm_nm2 = "purc_tterm_nm2";
	/**
	 * Purchase biz transaction terms remarks 2 購買取引条件備考２.<p>
	 *
	 */
	public static final String $purc_tterm_rmrks2 = "purc_tterm_rmrks2";
	/**
	 * Purchase biz transaction terms cd. 3 購買取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $purc_tterm_cd3 = "purc_tterm_cd3";
	/**
	 * Purchase biz transaction terms name 3 購買取引条件名３.<p>
	 *
	 */
	public static final String $purc_tterm_nm3 = "purc_tterm_nm3";
	/**
	 * Purchase biz transaction terms remarks 3 購買取引条件備考３.<p>
	 *
	 */
	public static final String $purc_tterm_rmrks3 = "purc_tterm_rmrks3";
	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public static final String $xrate_inpt_flg = "xrate_inpt_flg";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public static final String $ptax_xrate_inpt_flg = "ptax_xrate_inpt_flg";
	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public static final String $ptax_xrate = "ptax_xrate";
	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public static final String $trnspt_cd = "trnspt_cd";
	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public static final String $trnspt_nm = "trnspt_nm";
	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public static final String $vssl_flght = "vssl_flght";
	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public static final String $load_port_cd = "load_port_cd";
	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public static final String $load_port_nm = "load_port_nm";
	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public static final String $etd_dt = "etd_dt";
	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public static final String $dschrg_port_cd = "dschrg_port_cd";
	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public static final String $dschrg_port_nm = "dschrg_port_nm";
	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public static final String $eta_dt = "eta_dt";
	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public static final String $via_port_cd = "via_port_cd";
	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public static final String $via_port_nm = "via_port_nm";
	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public static final String $via_schd_dt = "via_schd_dt";
	/**
	 * Sales order transaction terms remarks 1 受注取引条件備考１.<p>
	 *
	 */
	public static final String $slo_tterm_rmrks1 = "slo_tterm_rmrks1";
	/**
	 * Sales order transaction terms remarks 2 受注取引条件備考２.<p>
	 *
	 */
	public static final String $slo_tterm_rmrks2 = "slo_tterm_rmrks2";
	/**
	 * Sales order transaction terms remarks 3 受注取引条件備考３.<p>
	 *
	 */
	public static final String $slo_tterm_rmrks3 = "slo_tterm_rmrks3";
	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public static final String $slo_ptax_xrate = "slo_ptax_xrate";
	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public static final String $slo_xrate = "slo_xrate";


	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
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
	public static final MCMeta purc_tterm_cd1_META = createCommonMeta($purc_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta purc_tterm_nm1_META = createCommonMeta($purc_tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta purc_tterm_rmrks1_META = createCommonMeta($purc_tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta purc_tterm_cd2_META = createCommonMeta($purc_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta purc_tterm_nm2_META = createCommonMeta($purc_tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta purc_tterm_rmrks2_META = createCommonMeta($purc_tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta purc_tterm_cd3_META = createCommonMeta($purc_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta purc_tterm_nm3_META = createCommonMeta($purc_tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta purc_tterm_rmrks3_META = createCommonMeta($purc_tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta xrate_inpt_flg_META = createCommonMeta($xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_xrate_inpt_flg_META = createCommonMeta($ptax_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ptax_xrate_META = createCommonMeta($ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.TRNSPT_CD);
	public static final MCMeta trnspt_nm_META = createCommonMeta($trnspt_nm, mcframe.commonMA.meta.MA_META.TRNSPT_NM);
	public static final MCMeta vssl_flght_META = createCommonMeta($vssl_flght, mcframe.commonMA.meta.MA_META.VSSL_FLGHT);
	public static final MCMeta load_port_cd_META = createCommonMeta($load_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta load_port_nm_META = createCommonMeta($load_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta etd_dt_META = createCommonMeta($etd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dschrg_port_cd_META = createCommonMeta($dschrg_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta dschrg_port_nm_META = createCommonMeta($dschrg_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta eta_dt_META = createCommonMeta($eta_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta via_port_cd_META = createCommonMeta($via_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta via_port_nm_META = createCommonMeta($via_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta via_schd_dt_META = createCommonMeta($via_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta slo_tterm_rmrks1_META = createCommonMeta($slo_tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta slo_tterm_rmrks2_META = createCommonMeta($slo_tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta slo_tterm_rmrks3_META = createCommonMeta($slo_tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta slo_ptax_xrate_META = createCommonMeta($slo_ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slo_xrate_META = createCommonMeta($slo_xrate, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rcpt_iv_no_META,
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
			has_arr_basis_flg_META,
			purc_tterm_cd1_META,
			purc_tterm_nm1_META,
			purc_tterm_rmrks1_META,
			purc_tterm_cd2_META,
			purc_tterm_nm2_META,
			purc_tterm_rmrks2_META,
			purc_tterm_cd3_META,
			purc_tterm_nm3_META,
			purc_tterm_rmrks3_META,
			xrate_inpt_flg_META,
			xrate_META,
			ptax_xrate_inpt_flg_META,
			ptax_xrate_META,
			trnspt_cd_META,
			trnspt_nm_META,
			vssl_flght_META,
			load_port_cd_META,
			load_port_nm_META,
			etd_dt_META,
			dschrg_port_cd_META,
			dschrg_port_nm_META,
			eta_dt_META,
			via_port_cd_META,
			via_port_nm_META,
			via_schd_dt_META,
			slo_tterm_rmrks1_META,
			slo_tterm_rmrks2_META,
			slo_tterm_rmrks3_META,
			slo_ptax_xrate_META,
			slo_xrate_META
		},
		new String[][]{
			{
			},
			{
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
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 0, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 0, $rcpt_iv_no, value);
	}


	/**
	 * Purchase invoice creating source type 受領インボイス作成元区分.<p>
	 *
	 */
	public String rcpt_iv_src_typ() {
		return getConstString(offset + 1, $rcpt_iv_src_typ);
	}

	/**
	 * Purchase invoice creating source type 受領インボイス作成元区分.<p>
	 *
	 */
	public void rcpt_iv_src_typ(String value) {
		setConstString(offset + 1, $rcpt_iv_src_typ, value);
	}


	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public String in_to_id_typ() {
		return getConstString(offset + 2, $in_to_id_typ);
	}

	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public void in_to_id_typ(String value) {
		setConstString(offset + 2, $in_to_id_typ, value);
	}


	/**
	 * Delivery destination identification cd. 納入先識別ＣＤ.<p>
	 *
	 */
	public String in_to_id_cd() {
		return getConstString(offset + 3, $in_to_id_cd);
	}

	/**
	 * Delivery destination identification cd. 納入先識別ＣＤ.<p>
	 *
	 */
	public void in_to_id_cd(String value) {
		setConstString(offset + 3, $in_to_id_cd, value);
	}


	/**
	 * Delivery destination identification name 納入先識別名.<p>
	 *
	 */
	public String in_to_id_nm() {
		return getConstString(offset + 4, $in_to_id_nm);
	}

	/**
	 * Delivery destination identification name 納入先識別名.<p>
	 *
	 */
	public void in_to_id_nm(String value) {
		setConstString(offset + 4, $in_to_id_nm, value);
	}


	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public String in_to_zip_cd() {
		return getConstString(offset + 5, $in_to_zip_cd);
	}

	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public void in_to_zip_cd(String value) {
		setConstString(offset + 5, $in_to_zip_cd, value);
	}


	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public String in_to_addr1() {
		return getConstString(offset + 6, $in_to_addr1);
	}

	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public void in_to_addr1(String value) {
		setConstString(offset + 6, $in_to_addr1, value);
	}


	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public String in_to_addr2() {
		return getConstString(offset + 7, $in_to_addr2);
	}

	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public void in_to_addr2(String value) {
		setConstString(offset + 7, $in_to_addr2, value);
	}


	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public String in_to_addr3() {
		return getConstString(offset + 8, $in_to_addr3);
	}

	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public void in_to_addr3(String value) {
		setConstString(offset + 8, $in_to_addr3, value);
	}


	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public String in_to_addr4() {
		return getConstString(offset + 9, $in_to_addr4);
	}

	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public void in_to_addr4(String value) {
		setConstString(offset + 9, $in_to_addr4, value);
	}


	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public String in_to_tel() {
		return getConstString(offset + 10, $in_to_tel);
	}

	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public void in_to_tel(String value) {
		setConstString(offset + 10, $in_to_tel, value);
	}


	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public String in_to_fax() {
		return getConstString(offset + 11, $in_to_fax);
	}

	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public void in_to_fax(String value) {
		setConstString(offset + 11, $in_to_fax, value);
	}


	/**
	 * Dept. in charge 担当部署.<p>
	 *
	 */
	public String in_to_cntct_dpt() {
		return getConstString(offset + 12, $in_to_cntct_dpt);
	}

	/**
	 * Dept. in charge 担当部署.<p>
	 *
	 */
	public void in_to_cntct_dpt(String value) {
		setConstString(offset + 12, $in_to_cntct_dpt, value);
	}


	/**
	 * PIC 担当者.<p>
	 *
	 */
	public String in_to_cntct_psn() {
		return getConstString(offset + 13, $in_to_cntct_psn);
	}

	/**
	 * PIC 担当者.<p>
	 *
	 */
	public void in_to_cntct_psn(String value) {
		setConstString(offset + 13, $in_to_cntct_psn, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String in_to_cntry_cd() {
		return getConstString(offset + 14, $in_to_cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void in_to_cntry_cd(String value) {
		setConstString(offset + 14, $in_to_cntry_cd, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 15, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 15, $sppl_cd, value);
	}


	/**
	 * PO currency cd. 発注通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 16, $trd_cur_cd);
	}

	/**
	 * PO currency cd. 発注通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 16, $trd_cur_cd, value);
	}


	/**
	 * Sales order currency cd. 受注通貨ＣＤ.<p>
	 *
	 */
	public String slo_cur_cd() {
		return getConstString(offset + 17, $slo_cur_cd);
	}

	/**
	 * Sales order currency cd. 受注通貨ＣＤ.<p>
	 *
	 */
	public void slo_cur_cd(String value) {
		setConstString(offset + 17, $slo_cur_cd, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 18, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 18, $cst_cd, value);
	}


	/**
	 * Sales order transaction pattern type 受注取引パタン区分.<p>
	 *
	 */
	public String slo_trd_ptn_typ() {
		return getConstString(offset + 19, $slo_trd_ptn_typ);
	}

	/**
	 * Sales order transaction pattern type 受注取引パタン区分.<p>
	 *
	 */
	public void slo_trd_ptn_typ(String value) {
		setConstString(offset + 19, $slo_trd_ptn_typ, value);
	}


	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 20, $sls_basis_typ);
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 20, $sls_basis_typ, value);
	}


	/**
	 * Sales order transaction terms cd. 1 受注取引条件ＣＤ１.<p>
	 *
	 */
	public String slo_tterm_cd1() {
		return getConstString(offset + 21, $slo_tterm_cd1);
	}

	/**
	 * Sales order transaction terms cd. 1 受注取引条件ＣＤ１.<p>
	 *
	 */
	public void slo_tterm_cd1(String value) {
		setConstString(offset + 21, $slo_tterm_cd1, value);
	}


	/**
	 * Sales order transaction terms cd. 2 受注取引条件ＣＤ２.<p>
	 *
	 */
	public String slo_tterm_cd2() {
		return getConstString(offset + 22, $slo_tterm_cd2);
	}

	/**
	 * Sales order transaction terms cd. 2 受注取引条件ＣＤ２.<p>
	 *
	 */
	public void slo_tterm_cd2(String value) {
		setConstString(offset + 22, $slo_tterm_cd2, value);
	}


	/**
	 * Sales order transaction terms cd. 3 受注取引条件ＣＤ３.<p>
	 *
	 */
	public String slo_tterm_cd3() {
		return getConstString(offset + 23, $slo_tterm_cd3);
	}

	/**
	 * Sales order transaction terms cd. 3 受注取引条件ＣＤ３.<p>
	 *
	 */
	public void slo_tterm_cd3(String value) {
		setConstString(offset + 23, $slo_tterm_cd3, value);
	}


	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return getConstDate(offset + 24, $purc_schd_dt);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		setConstDate(offset + 24, $purc_schd_dt, value);
	}


	public boolean has_arr_basis_flg() {
		return getConstBoolean(offset + 25, $has_arr_basis_flg);
	}

	public void has_arr_basis_flg(boolean value) {
		setConstBoolean(offset + 25, $has_arr_basis_flg, value);
	}


	/**
	 * Purchase biz transaction terms cd. 1 購買取引条件ＣＤ１.<p>
	 *
	 */
	public String purc_tterm_cd1() {
		return getConstString(offset + 26, $purc_tterm_cd1);
	}

	/**
	 * Purchase biz transaction terms cd. 1 購買取引条件ＣＤ１.<p>
	 *
	 */
	public void purc_tterm_cd1(String value) {
		setConstString(offset + 26, $purc_tterm_cd1, value);
	}


	/**
	 * Purchase biz transaction terms name 1 購買取引条件名１.<p>
	 *
	 */
	public String purc_tterm_nm1() {
		return getConstString(offset + 27, $purc_tterm_nm1);
	}

	/**
	 * Purchase biz transaction terms name 1 購買取引条件名１.<p>
	 *
	 */
	public void purc_tterm_nm1(String value) {
		setConstString(offset + 27, $purc_tterm_nm1, value);
	}


	/**
	 * Purchase biz transaction terms remarks 1 購買取引条件備考１.<p>
	 *
	 */
	public String purc_tterm_rmrks1() {
		return getConstString(offset + 28, $purc_tterm_rmrks1);
	}

	/**
	 * Purchase biz transaction terms remarks 1 購買取引条件備考１.<p>
	 *
	 */
	public void purc_tterm_rmrks1(String value) {
		setConstString(offset + 28, $purc_tterm_rmrks1, value);
	}


	/**
	 * Purchase biz transaction terms cd. 2 購買取引条件ＣＤ２.<p>
	 *
	 */
	public String purc_tterm_cd2() {
		return getConstString(offset + 29, $purc_tterm_cd2);
	}

	/**
	 * Purchase biz transaction terms cd. 2 購買取引条件ＣＤ２.<p>
	 *
	 */
	public void purc_tterm_cd2(String value) {
		setConstString(offset + 29, $purc_tterm_cd2, value);
	}


	/**
	 * Purchase biz transaction terms name 2 購買取引条件名２.<p>
	 *
	 */
	public String purc_tterm_nm2() {
		return getConstString(offset + 30, $purc_tterm_nm2);
	}

	/**
	 * Purchase biz transaction terms name 2 購買取引条件名２.<p>
	 *
	 */
	public void purc_tterm_nm2(String value) {
		setConstString(offset + 30, $purc_tterm_nm2, value);
	}


	/**
	 * Purchase biz transaction terms remarks 2 購買取引条件備考２.<p>
	 *
	 */
	public String purc_tterm_rmrks2() {
		return getConstString(offset + 31, $purc_tterm_rmrks2);
	}

	/**
	 * Purchase biz transaction terms remarks 2 購買取引条件備考２.<p>
	 *
	 */
	public void purc_tterm_rmrks2(String value) {
		setConstString(offset + 31, $purc_tterm_rmrks2, value);
	}


	/**
	 * Purchase biz transaction terms cd. 3 購買取引条件ＣＤ３.<p>
	 *
	 */
	public String purc_tterm_cd3() {
		return getConstString(offset + 32, $purc_tterm_cd3);
	}

	/**
	 * Purchase biz transaction terms cd. 3 購買取引条件ＣＤ３.<p>
	 *
	 */
	public void purc_tterm_cd3(String value) {
		setConstString(offset + 32, $purc_tterm_cd3, value);
	}


	/**
	 * Purchase biz transaction terms name 3 購買取引条件名３.<p>
	 *
	 */
	public String purc_tterm_nm3() {
		return getConstString(offset + 33, $purc_tterm_nm3);
	}

	/**
	 * Purchase biz transaction terms name 3 購買取引条件名３.<p>
	 *
	 */
	public void purc_tterm_nm3(String value) {
		setConstString(offset + 33, $purc_tterm_nm3, value);
	}


	/**
	 * Purchase biz transaction terms remarks 3 購買取引条件備考３.<p>
	 *
	 */
	public String purc_tterm_rmrks3() {
		return getConstString(offset + 34, $purc_tterm_rmrks3);
	}

	/**
	 * Purchase biz transaction terms remarks 3 購買取引条件備考３.<p>
	 *
	 */
	public void purc_tterm_rmrks3(String value) {
		setConstString(offset + 34, $purc_tterm_rmrks3, value);
	}


	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return getConstBoolean(offset + 35, $xrate_inpt_flg);
	}

	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 35, $xrate_inpt_flg, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 36, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 36, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 36, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 36, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 36, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 36, $xrate, value);
	}


	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return getConstBoolean(offset + 37, $ptax_xrate_inpt_flg);
	}

	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 37, $ptax_xrate_inpt_flg, value);
	}


	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return getConstNumber(offset + 38, $ptax_xrate);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		setConstNumber(offset + 38, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		setConstNumber(offset + 38, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		setConstNumber(offset + 38, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		setConstNumber(offset + 38, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		setConstNumber(offset + 38, $ptax_xrate, value);
	}


	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 39, $trnspt_cd);
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 39, $trnspt_cd, value);
	}


	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public String trnspt_nm() {
		return getConstString(offset + 40, $trnspt_nm);
	}

	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public void trnspt_nm(String value) {
		setConstString(offset + 40, $trnspt_nm, value);
	}


	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public String vssl_flght() {
		return getConstString(offset + 41, $vssl_flght);
	}

	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public void vssl_flght(String value) {
		setConstString(offset + 41, $vssl_flght, value);
	}


	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public String load_port_cd() {
		return getConstString(offset + 42, $load_port_cd);
	}

	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public void load_port_cd(String value) {
		setConstString(offset + 42, $load_port_cd, value);
	}


	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public String load_port_nm() {
		return getConstString(offset + 43, $load_port_nm);
	}

	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public void load_port_nm(String value) {
		setConstString(offset + 43, $load_port_nm, value);
	}


	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public MCDate etd_dt() {
		return getConstDate(offset + 44, $etd_dt);
	}

	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public void etd_dt(MCDate value) {
		setConstDate(offset + 44, $etd_dt, value);
	}


	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public String dschrg_port_cd() {
		return getConstString(offset + 45, $dschrg_port_cd);
	}

	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public void dschrg_port_cd(String value) {
		setConstString(offset + 45, $dschrg_port_cd, value);
	}


	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public String dschrg_port_nm() {
		return getConstString(offset + 46, $dschrg_port_nm);
	}

	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public void dschrg_port_nm(String value) {
		setConstString(offset + 46, $dschrg_port_nm, value);
	}


	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public MCDate eta_dt() {
		return getConstDate(offset + 47, $eta_dt);
	}

	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public void eta_dt(MCDate value) {
		setConstDate(offset + 47, $eta_dt, value);
	}


	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public String via_port_cd() {
		return getConstString(offset + 48, $via_port_cd);
	}

	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public void via_port_cd(String value) {
		setConstString(offset + 48, $via_port_cd, value);
	}


	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public String via_port_nm() {
		return getConstString(offset + 49, $via_port_nm);
	}

	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public void via_port_nm(String value) {
		setConstString(offset + 49, $via_port_nm, value);
	}


	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public MCDate via_schd_dt() {
		return getConstDate(offset + 50, $via_schd_dt);
	}

	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public void via_schd_dt(MCDate value) {
		setConstDate(offset + 50, $via_schd_dt, value);
	}


	/**
	 * Sales order transaction terms remarks 1 受注取引条件備考１.<p>
	 *
	 */
	public String slo_tterm_rmrks1() {
		return getConstString(offset + 51, $slo_tterm_rmrks1);
	}

	/**
	 * Sales order transaction terms remarks 1 受注取引条件備考１.<p>
	 *
	 */
	public void slo_tterm_rmrks1(String value) {
		setConstString(offset + 51, $slo_tterm_rmrks1, value);
	}


	/**
	 * Sales order transaction terms remarks 2 受注取引条件備考２.<p>
	 *
	 */
	public String slo_tterm_rmrks2() {
		return getConstString(offset + 52, $slo_tterm_rmrks2);
	}

	/**
	 * Sales order transaction terms remarks 2 受注取引条件備考２.<p>
	 *
	 */
	public void slo_tterm_rmrks2(String value) {
		setConstString(offset + 52, $slo_tterm_rmrks2, value);
	}


	/**
	 * Sales order transaction terms remarks 3 受注取引条件備考３.<p>
	 *
	 */
	public String slo_tterm_rmrks3() {
		return getConstString(offset + 53, $slo_tterm_rmrks3);
	}

	/**
	 * Sales order transaction terms remarks 3 受注取引条件備考３.<p>
	 *
	 */
	public void slo_tterm_rmrks3(String value) {
		setConstString(offset + 53, $slo_tterm_rmrks3, value);
	}


	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public MCNumber slo_ptax_xrate() {
		return getConstNumber(offset + 54, $slo_ptax_xrate);
	}

	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public void slo_ptax_xrate(MCNumber value) {
		setConstNumber(offset + 54, $slo_ptax_xrate, value);
	}

	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public void slo_ptax_xrate(int value) {
		setConstNumber(offset + 54, $slo_ptax_xrate, value);
	}

	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public void slo_ptax_xrate(long value) {
		setConstNumber(offset + 54, $slo_ptax_xrate, value);
	}

	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public void slo_ptax_xrate(float value) {
		setConstNumber(offset + 54, $slo_ptax_xrate, value);
	}

	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public void slo_ptax_xrate(double value) {
		setConstNumber(offset + 54, $slo_ptax_xrate, value);
	}


	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public MCNumber slo_xrate() {
		return getConstNumber(offset + 55, $slo_xrate);
	}

	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public void slo_xrate(MCNumber value) {
		setConstNumber(offset + 55, $slo_xrate, value);
	}

	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public void slo_xrate(int value) {
		setConstNumber(offset + 55, $slo_xrate, value);
	}

	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public void slo_xrate(long value) {
		setConstNumber(offset + 55, $slo_xrate, value);
	}

	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public void slo_xrate(float value) {
		setConstNumber(offset + 55, $slo_xrate, value);
	}

	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public void slo_xrate(double value) {
		setConstNumber(offset + 55, $slo_xrate, value);
	}


	public String getString(String name) {
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
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
		if ($purc_tterm_cd1.equalsIgnoreCase(name)) {
			return purc_tterm_cd1();
		}
		if ($purc_tterm_nm1.equalsIgnoreCase(name)) {
			return purc_tterm_nm1();
		}
		if ($purc_tterm_rmrks1.equalsIgnoreCase(name)) {
			return purc_tterm_rmrks1();
		}
		if ($purc_tterm_cd2.equalsIgnoreCase(name)) {
			return purc_tterm_cd2();
		}
		if ($purc_tterm_nm2.equalsIgnoreCase(name)) {
			return purc_tterm_nm2();
		}
		if ($purc_tterm_rmrks2.equalsIgnoreCase(name)) {
			return purc_tterm_rmrks2();
		}
		if ($purc_tterm_cd3.equalsIgnoreCase(name)) {
			return purc_tterm_cd3();
		}
		if ($purc_tterm_nm3.equalsIgnoreCase(name)) {
			return purc_tterm_nm3();
		}
		if ($purc_tterm_rmrks3.equalsIgnoreCase(name)) {
			return purc_tterm_rmrks3();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			return load_port_nm();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			return dschrg_port_nm();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			return via_port_nm();
		}
		if ($slo_tterm_rmrks1.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks1();
		}
		if ($slo_tterm_rmrks2.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks2();
		}
		if ($slo_tterm_rmrks3.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			return slo_ptax_xrate();
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			return slo_xrate();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			return etd_dt();
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			return eta_dt();
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			return via_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($has_arr_basis_flg.equalsIgnoreCase(name)) {
			return has_arr_basis_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
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
		if ($purc_tterm_cd1.equalsIgnoreCase(name)) {
			return purc_tterm_cd1();
		}
		if ($purc_tterm_nm1.equalsIgnoreCase(name)) {
			return purc_tterm_nm1();
		}
		if ($purc_tterm_rmrks1.equalsIgnoreCase(name)) {
			return purc_tterm_rmrks1();
		}
		if ($purc_tterm_cd2.equalsIgnoreCase(name)) {
			return purc_tterm_cd2();
		}
		if ($purc_tterm_nm2.equalsIgnoreCase(name)) {
			return purc_tterm_nm2();
		}
		if ($purc_tterm_rmrks2.equalsIgnoreCase(name)) {
			return purc_tterm_rmrks2();
		}
		if ($purc_tterm_cd3.equalsIgnoreCase(name)) {
			return purc_tterm_cd3();
		}
		if ($purc_tterm_nm3.equalsIgnoreCase(name)) {
			return purc_tterm_nm3();
		}
		if ($purc_tterm_rmrks3.equalsIgnoreCase(name)) {
			return purc_tterm_rmrks3();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			return load_port_nm();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			return dschrg_port_nm();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			return via_port_nm();
		}
		if ($slo_tterm_rmrks1.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks1();
		}
		if ($slo_tterm_rmrks2.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks2();
		}
		if ($slo_tterm_rmrks3.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			return slo_ptax_xrate();
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			return slo_xrate();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			return etd_dt();
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			return eta_dt();
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			return via_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($has_arr_basis_flg.equalsIgnoreCase(name)) {
			return has_arr_basis_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
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
		if ($purc_tterm_cd1.equalsIgnoreCase(name)) {
			purc_tterm_cd1(value);
			return;
		}
		if ($purc_tterm_nm1.equalsIgnoreCase(name)) {
			purc_tterm_nm1(value);
			return;
		}
		if ($purc_tterm_rmrks1.equalsIgnoreCase(name)) {
			purc_tterm_rmrks1(value);
			return;
		}
		if ($purc_tterm_cd2.equalsIgnoreCase(name)) {
			purc_tterm_cd2(value);
			return;
		}
		if ($purc_tterm_nm2.equalsIgnoreCase(name)) {
			purc_tterm_nm2(value);
			return;
		}
		if ($purc_tterm_rmrks2.equalsIgnoreCase(name)) {
			purc_tterm_rmrks2(value);
			return;
		}
		if ($purc_tterm_cd3.equalsIgnoreCase(name)) {
			purc_tterm_cd3(value);
			return;
		}
		if ($purc_tterm_nm3.equalsIgnoreCase(name)) {
			purc_tterm_nm3(value);
			return;
		}
		if ($purc_tterm_rmrks3.equalsIgnoreCase(name)) {
			purc_tterm_rmrks3(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			trnspt_nm(value);
			return;
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			vssl_flght(value);
			return;
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			load_port_cd(value);
			return;
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			load_port_nm(value);
			return;
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			dschrg_port_nm(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			via_port_nm(value);
			return;
		}
		if ($slo_tterm_rmrks1.equalsIgnoreCase(name)) {
			slo_tterm_rmrks1(value);
			return;
		}
		if ($slo_tterm_rmrks2.equalsIgnoreCase(name)) {
			slo_tterm_rmrks2(value);
			return;
		}
		if ($slo_tterm_rmrks3.equalsIgnoreCase(name)) {
			slo_tterm_rmrks3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			etd_dt(value);
			return;
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			eta_dt(value);
			return;
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			via_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($has_arr_basis_flg.equalsIgnoreCase(name)) {
			has_arr_basis_flg(value);
			return;
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
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
		if ($purc_tterm_cd1.equalsIgnoreCase(name)) {
			purc_tterm_cd1(value);
			return;
		}
		if ($purc_tterm_nm1.equalsIgnoreCase(name)) {
			purc_tterm_nm1(value);
			return;
		}
		if ($purc_tterm_rmrks1.equalsIgnoreCase(name)) {
			purc_tterm_rmrks1(value);
			return;
		}
		if ($purc_tterm_cd2.equalsIgnoreCase(name)) {
			purc_tterm_cd2(value);
			return;
		}
		if ($purc_tterm_nm2.equalsIgnoreCase(name)) {
			purc_tterm_nm2(value);
			return;
		}
		if ($purc_tterm_rmrks2.equalsIgnoreCase(name)) {
			purc_tterm_rmrks2(value);
			return;
		}
		if ($purc_tterm_cd3.equalsIgnoreCase(name)) {
			purc_tterm_cd3(value);
			return;
		}
		if ($purc_tterm_nm3.equalsIgnoreCase(name)) {
			purc_tterm_nm3(value);
			return;
		}
		if ($purc_tterm_rmrks3.equalsIgnoreCase(name)) {
			purc_tterm_rmrks3(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			trnspt_nm(value);
			return;
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			vssl_flght(value);
			return;
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			load_port_cd(value);
			return;
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			load_port_nm(value);
			return;
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			dschrg_port_nm(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			via_port_nm(value);
			return;
		}
		if ($slo_tterm_rmrks1.equalsIgnoreCase(name)) {
			slo_tterm_rmrks1(value);
			return;
		}
		if ($slo_tterm_rmrks2.equalsIgnoreCase(name)) {
			slo_tterm_rmrks2(value);
			return;
		}
		if ($slo_tterm_rmrks3.equalsIgnoreCase(name)) {
			slo_tterm_rmrks3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			etd_dt(value);
			return;
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			eta_dt(value);
			return;
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			via_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($has_arr_basis_flg.equalsIgnoreCase(name)) {
			has_arr_basis_flg(value);
			return;
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

