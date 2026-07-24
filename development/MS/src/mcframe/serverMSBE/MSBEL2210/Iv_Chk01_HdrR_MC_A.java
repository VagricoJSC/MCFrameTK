package mcframe.serverMSBE.MSBEL2210;

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
 * ブロック"Iv_Chk01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Iv_Chk01_HdrR_MC_A extends MCConstRow {

	/**
	 * Purchase invoice creating source type 受領インボイス作成元区分.<p>
	 *
	 */
	public static final String $rcpt_iv_src_typ = "rcpt_iv_src_typ";
	/**
	 * Firm flg. 確定ＦＬＧ.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * I/V date Ｉ／Ｖ日付.<p>
	 *
	 */
	public static final String $iv_dt = "iv_dt";
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public static final String $purc_schd_dt = "purc_schd_dt";
	/**
	 * Scheduled purchase recording date 仕入計上予定日.<p>
	 *
	 */
	public static final String $purc_ac_schd_dt = "purc_ac_schd_dt";
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
	 * Delivery destination dept. 納入先部署.<p>
	 *
	 */
	public static final String $in_to_cntct_dpt = "in_to_cntct_dpt";
	/**
	 * Delivery destination PIC 納入先担当者.<p>
	 *
	 */
	public static final String $in_to_cntct_psn = "in_to_cntct_psn";
	/**
	 * Delivery destination zip code 納入先郵便番号.<p>
	 *
	 */
	public static final String $in_to_zip_cd = "in_to_zip_cd";
	/**
	 * Delivery destination address1 納入先住所１.<p>
	 *
	 */
	public static final String $in_to_addr1 = "in_to_addr1";
	/**
	 * Delivery destination address2 納入先住所２.<p>
	 *
	 */
	public static final String $in_to_addr2 = "in_to_addr2";
	/**
	 * Delivery destination address3 納入先住所３.<p>
	 *
	 */
	public static final String $in_to_addr3 = "in_to_addr3";
	/**
	 * Delivery destination address4 納入先住所４.<p>
	 *
	 */
	public static final String $in_to_addr4 = "in_to_addr4";
	/**
	 * Delivery destination TEL 納入先ＴＥＬ.<p>
	 *
	 */
	public static final String $in_to_tel = "in_to_tel";
	/**
	 * Delivery destination FAX 納入先ＦＡＸ.<p>
	 *
	 */
	public static final String $in_to_fax = "in_to_fax";
	/**
	 * Delivery destination country cd. 納入先国ＣＤ.<p>
	 *
	 */
	public static final String $in_to_cntry_cd = "in_to_cntry_cd";
	/**
	 * Delivery destination country name 納入先国名.<p>
	 *
	 */
	public static final String $in_to_cntry_nm = "in_to_cntry_nm";
	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public static final String $trnspt_cd = "trnspt_cd";
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
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public static final String $via_schd_dt = "via_schd_dt";
	/**
	 * Purchase I/V remarks 受領Ｉ／Ｖ備考.<p>
	 *
	 */
	public static final String $rcpt_iv_rmrks = "rcpt_iv_rmrks";
	/**
	 * Purchase I/V internal remarks 受領Ｉ／Ｖ内部備考.<p>
	 *
	 */
	public static final String $rcpt_iv_intr_rmrks = "rcpt_iv_intr_rmrks";
	/**
	 * Purchase I/V spare 1 受領Ｉ／Ｖ予備１.<p>
	 *
	 */
	public static final String $rcpt_iv_sub_char1 = "rcpt_iv_sub_char1";
	/**
	 * Purchase I/V spare 2 受領Ｉ／Ｖ予備２.<p>
	 *
	 */
	public static final String $rcpt_iv_sub_char2 = "rcpt_iv_sub_char2";
	/**
	 * Purchase I/V spare 3 受領Ｉ／Ｖ予備３.<p>
	 *
	 */
	public static final String $rcpt_iv_sub_char3 = "rcpt_iv_sub_char3";
	/**
	 * Update counter (Purchase invoice header) 更新カウンタ（受領インボイスヘッダ）.<p>
	 *
	 */
	public static final String $rcpt_iv_upd_cntr = "rcpt_iv_upd_cntr";
	public static final String $ph = "ph";
	/**
	 * Firm before change flg. 変更前確定ＦＬＧ.<p>
	 *
	 */
	public static final String $bef_fix_flg = "bef_fix_flg";

	public static final String $data_crud_typ = $ph + ".data_crud_typ";
	public static final String $err_flg = $ph + ".err_flg";
	public static final String $ac_ym = $ph + ".ac_ym";
	public static final String $rcpt_iv_no = $ph + ".rcpt_iv_no";
	public static final String $rcpt_iv_mng_no = $ph + ".rcpt_iv_mng_no";
	public static final String $rcpt_iv_rev = $ph + ".rcpt_iv_rev";
	public static final String $purc_dt = $ph + ".purc_dt";
	public static final String $can_ac_dt = $ph + ".can_ac_dt";
	public static final String $ac_dt = $ph + ".ac_dt";
	public static final String $pay_basis_dt = $ph + ".pay_basis_dt";
	public static final String $pay_schd_dt = $ph + ".pay_schd_dt";
	public static final String $sppl_cd = $ph + ".sppl_cd";
	public static final String $sppl_iv_flg = $ph + ".sppl_iv_flg";
	public static final String $trd_cur_cd = $ph + ".trd_cur_cd";
	public static final String $trd_cur_upri_dec_place = $ph + ".trd_cur_upri_dec_place";
	public static final String $trd_cur_amt_dec_place = $ph + ".trd_cur_amt_dec_place";
	public static final String $xrate_inpt_flg = $ph + ".xrate_inpt_flg";
	public static final String $xrate = $ph + ".xrate";
	public static final String $base_cur_cd = $ph + ".base_cur_cd";
	public static final String $ptax_cur_cd = $ph + ".ptax_cur_cd";
	public static final String $ptax_dt = $ph + ".ptax_dt";
	public static final String $ptax_xrate_inpt_flg = $ph + ".ptax_xrate_inpt_flg";
	public static final String $ptax_xrate = $ph + ".ptax_xrate";
	public static final String $asppl_cd = $ph + ".asppl_cd";
	public static final String $bsppl_cd = $ph + ".bsppl_cd";
	public static final String $psppl_cd = $ph + ".psppl_cd";
	public static final String $cred_cd = $ph + ".cred_cd";
	public static final String $purc_amt_rnd_typ = $ph + ".purc_amt_rnd_typ";
	public static final String $purc_tax_rnd_typ = $ph + ".purc_tax_rnd_typ";
	public static final String $purc_tax_calc_typ = $ph + ".purc_tax_calc_typ";
	public static final String $trd_rmrks = $ph + ".trd_rmrks";
	public static final String $intr_rmrks = $ph + ".intr_rmrks";
	public static final String $sub_char1 = $ph + ".sub_char1";
	public static final String $sub_char2 = $ph + ".sub_char2";
	public static final String $sub_char3 = $ph + ".sub_char3";
	public static final String $tterm_cd1 = $ph + ".tterm_cd1";
	public static final String $tterm_rmrks1 = $ph + ".tterm_rmrks1";
	public static final String $tterm_cd2 = $ph + ".tterm_cd2";
	public static final String $tterm_rmrks2 = $ph + ".tterm_rmrks2";
	public static final String $tterm_cd3 = $ph + ".tterm_cd3";
	public static final String $tterm_rmrks3 = $ph + ".tterm_rmrks3";
	public static final String $edi_flg = $ph + ".edi_flg";
	public static final String $subcon_flg = $ph + ".subcon_flg";

	public static final MCMeta rcpt_iv_src_typ_META = createCommonMeta($rcpt_iv_src_typ, mcframe.commonMS.meta.MS_META.RCPT_IV_SRC_TYP);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_dt_META = createCommonMeta($iv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_schd_dt_META = createCommonMeta($purc_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_ac_schd_dt_META = createCommonMeta($purc_ac_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta in_to_id_typ_META = createCommonMeta($in_to_id_typ, mcframe.commonMS.meta.MS_META.IN_TO_ID_TYP);
	public static final MCMeta in_to_id_cd_META = createCommonMeta($in_to_id_cd, mcframe.commonMS.meta.MS_META.IN_TO_ID_CD);
	public static final MCMeta in_to_id_nm_META = createCommonMeta($in_to_id_nm, mcframe.commonMS.meta.MS_META.IN_TO_ID_NM);
	public static final MCMeta in_to_cntct_dpt_META = createCommonMeta($in_to_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta in_to_cntct_psn_META = createCommonMeta($in_to_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta in_to_zip_cd_META = createCommonMeta($in_to_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta in_to_addr1_META = createCommonMeta($in_to_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr2_META = createCommonMeta($in_to_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr3_META = createCommonMeta($in_to_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr4_META = createCommonMeta($in_to_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_tel_META = createCommonMeta($in_to_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta in_to_fax_META = createCommonMeta($in_to_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta in_to_cntry_cd_META = createCommonMeta($in_to_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta in_to_cntry_nm_META = createCommonMeta($in_to_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.TRNSPT_CD);
	public static final MCMeta vssl_flght_META = createCommonMeta($vssl_flght, mcframe.commonMA.meta.MA_META.VSSL_FLGHT);
	public static final MCMeta load_port_cd_META = createCommonMeta($load_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta etd_dt_META = createCommonMeta($etd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dschrg_port_cd_META = createCommonMeta($dschrg_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta eta_dt_META = createCommonMeta($eta_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta via_port_cd_META = createCommonMeta($via_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta via_schd_dt_META = createCommonMeta($via_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcpt_iv_rmrks_META = createCommonMeta($rcpt_iv_rmrks, mcframe.commonMS.meta.MS_META.IV_RMRKS);
	public static final MCMeta rcpt_iv_intr_rmrks_META = createCommonMeta($rcpt_iv_intr_rmrks, mcframe.commonMS.meta.MS_META.RCPT_IV_INTR_RMRKS);
	public static final MCMeta rcpt_iv_sub_char1_META = createCommonMeta($rcpt_iv_sub_char1, mcframe.commonMS.meta.MS_META.RCPT_IV_SUB_CHAR1);
	public static final MCMeta rcpt_iv_sub_char2_META = createCommonMeta($rcpt_iv_sub_char2, mcframe.commonMS.meta.MS_META.RCPT_IV_SUB_CHAR2);
	public static final MCMeta rcpt_iv_sub_char3_META = createCommonMeta($rcpt_iv_sub_char3, mcframe.commonMS.meta.MS_META.RCPT_IV_SUB_CHAR3);
	public static final MCMeta rcpt_iv_upd_cntr_META = createCommonMeta($rcpt_iv_upd_cntr, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ph_META = createInnerRowMeta($ph, mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.class);
	public static final MCMeta bef_fix_flg_META = createCommonMeta($bef_fix_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Iv_Chk01_HdrR> constMetas = new ConstMetaList<Iv_Chk01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rcpt_iv_src_typ_META,
			fix_flg_META,
			iv_dt_META,
			purc_schd_dt_META,
			purc_ac_schd_dt_META,
			in_to_id_typ_META,
			in_to_id_cd_META,
			in_to_id_nm_META,
			in_to_cntct_dpt_META,
			in_to_cntct_psn_META,
			in_to_zip_cd_META,
			in_to_addr1_META,
			in_to_addr2_META,
			in_to_addr3_META,
			in_to_addr4_META,
			in_to_tel_META,
			in_to_fax_META,
			in_to_cntry_cd_META,
			in_to_cntry_nm_META,
			trnspt_cd_META,
			vssl_flght_META,
			load_port_cd_META,
			etd_dt_META,
			dschrg_port_cd_META,
			eta_dt_META,
			via_port_cd_META,
			via_schd_dt_META,
			rcpt_iv_rmrks_META,
			rcpt_iv_intr_rmrks_META,
			rcpt_iv_sub_char1_META,
			rcpt_iv_sub_char2_META,
			rcpt_iv_sub_char3_META,
			rcpt_iv_upd_cntr_META,
			ph_META,
			bef_fix_flg_META
		},
		new String[][]{
			{
				"data_crud_typ",
				"err_flg",
				"ac_ym",
				"rcpt_iv_no",
				"rcpt_iv_mng_no",
				"rcpt_iv_rev",
				"purc_dt",
				"can_ac_dt",
				"ac_dt",
				"pay_basis_dt",
				"pay_schd_dt",
				"sppl_cd",
				"sppl_iv_flg",
				"trd_cur_cd",
				"trd_cur_upri_dec_place",
				"trd_cur_amt_dec_place",
				"xrate_inpt_flg",
				"xrate",
				"base_cur_cd",
				"ptax_cur_cd",
				"ptax_dt",
				"ptax_xrate_inpt_flg",
				"ptax_xrate",
				"asppl_cd",
				"bsppl_cd",
				"psppl_cd",
				"cred_cd",
				"purc_amt_rnd_typ",
				"purc_tax_rnd_typ",
				"purc_tax_calc_typ",
				"trd_rmrks",
				"intr_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"tterm_cd1",
				"tterm_rmrks1",
				"tterm_cd2",
				"tterm_rmrks2",
				"tterm_cd3",
				"tterm_rmrks3",
				"edi_flg",
				"subcon_flg"
			},
			{
				$data_crud_typ,
				$err_flg,
				$ac_ym,
				$rcpt_iv_no,
				$rcpt_iv_mng_no,
				$rcpt_iv_rev,
				$purc_dt,
				$can_ac_dt,
				$ac_dt,
				$pay_basis_dt,
				$pay_schd_dt,
				$sppl_cd,
				$sppl_iv_flg,
				$trd_cur_cd,
				$trd_cur_upri_dec_place,
				$trd_cur_amt_dec_place,
				$xrate_inpt_flg,
				$xrate,
				$base_cur_cd,
				$ptax_cur_cd,
				$ptax_dt,
				$ptax_xrate_inpt_flg,
				$ptax_xrate,
				$asppl_cd,
				$bsppl_cd,
				$psppl_cd,
				$cred_cd,
				$purc_amt_rnd_typ,
				$purc_tax_rnd_typ,
				$purc_tax_calc_typ,
				$trd_rmrks,
				$intr_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$tterm_cd1,
				$tterm_rmrks1,
				$tterm_cd2,
				$tterm_rmrks2,
				$tterm_cd3,
				$tterm_rmrks3,
				$edi_flg,
				$subcon_flg
			}
		}
	);

	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
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
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
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
	protected Iv_Chk01_HdrR_MC_A(ConstMetaList<? extends Iv_Chk01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Iv_Chk01_HdrR clone() {
		return (Iv_Chk01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Iv_Chk01_HdrR createInstance() {
		return (Iv_Chk01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Iv_Chk01_HdrR getValues(String... names) {
		return (Iv_Chk01_HdrR) super.getValues(names);
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
	 * Firm flg. 確定ＦＬＧ.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 1, $fix_flg);
	}

	/**
	 * Firm flg. 確定ＦＬＧ.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 1, $fix_flg, value);
	}


	/**
	 * I/V date Ｉ／Ｖ日付.<p>
	 *
	 */
	public MCDate iv_dt() {
		return getConstDate(offset + 2, $iv_dt);
	}

	/**
	 * I/V date Ｉ／Ｖ日付.<p>
	 *
	 */
	public void iv_dt(MCDate value) {
		setConstDate(offset + 2, $iv_dt, value);
	}


	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return getConstDate(offset + 3, $purc_schd_dt);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		setConstDate(offset + 3, $purc_schd_dt, value);
	}


	/**
	 * Scheduled purchase recording date 仕入計上予定日.<p>
	 *
	 */
	public MCDate purc_ac_schd_dt() {
		return getConstDate(offset + 4, $purc_ac_schd_dt);
	}

	/**
	 * Scheduled purchase recording date 仕入計上予定日.<p>
	 *
	 */
	public void purc_ac_schd_dt(MCDate value) {
		setConstDate(offset + 4, $purc_ac_schd_dt, value);
	}


	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public String in_to_id_typ() {
		return getConstString(offset + 5, $in_to_id_typ);
	}

	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public void in_to_id_typ(String value) {
		setConstString(offset + 5, $in_to_id_typ, value);
	}


	/**
	 * Delivery destination identification cd. 納入先識別ＣＤ.<p>
	 *
	 */
	public String in_to_id_cd() {
		return getConstString(offset + 6, $in_to_id_cd);
	}

	/**
	 * Delivery destination identification cd. 納入先識別ＣＤ.<p>
	 *
	 */
	public void in_to_id_cd(String value) {
		setConstString(offset + 6, $in_to_id_cd, value);
	}


	/**
	 * Delivery destination identification name 納入先識別名.<p>
	 *
	 */
	public String in_to_id_nm() {
		return getConstString(offset + 7, $in_to_id_nm);
	}

	/**
	 * Delivery destination identification name 納入先識別名.<p>
	 *
	 */
	public void in_to_id_nm(String value) {
		setConstString(offset + 7, $in_to_id_nm, value);
	}


	/**
	 * Delivery destination dept. 納入先部署.<p>
	 *
	 */
	public String in_to_cntct_dpt() {
		return getConstString(offset + 8, $in_to_cntct_dpt);
	}

	/**
	 * Delivery destination dept. 納入先部署.<p>
	 *
	 */
	public void in_to_cntct_dpt(String value) {
		setConstString(offset + 8, $in_to_cntct_dpt, value);
	}


	/**
	 * Delivery destination PIC 納入先担当者.<p>
	 *
	 */
	public String in_to_cntct_psn() {
		return getConstString(offset + 9, $in_to_cntct_psn);
	}

	/**
	 * Delivery destination PIC 納入先担当者.<p>
	 *
	 */
	public void in_to_cntct_psn(String value) {
		setConstString(offset + 9, $in_to_cntct_psn, value);
	}


	/**
	 * Delivery destination zip code 納入先郵便番号.<p>
	 *
	 */
	public String in_to_zip_cd() {
		return getConstString(offset + 10, $in_to_zip_cd);
	}

	/**
	 * Delivery destination zip code 納入先郵便番号.<p>
	 *
	 */
	public void in_to_zip_cd(String value) {
		setConstString(offset + 10, $in_to_zip_cd, value);
	}


	/**
	 * Delivery destination address1 納入先住所１.<p>
	 *
	 */
	public String in_to_addr1() {
		return getConstString(offset + 11, $in_to_addr1);
	}

	/**
	 * Delivery destination address1 納入先住所１.<p>
	 *
	 */
	public void in_to_addr1(String value) {
		setConstString(offset + 11, $in_to_addr1, value);
	}


	/**
	 * Delivery destination address2 納入先住所２.<p>
	 *
	 */
	public String in_to_addr2() {
		return getConstString(offset + 12, $in_to_addr2);
	}

	/**
	 * Delivery destination address2 納入先住所２.<p>
	 *
	 */
	public void in_to_addr2(String value) {
		setConstString(offset + 12, $in_to_addr2, value);
	}


	/**
	 * Delivery destination address3 納入先住所３.<p>
	 *
	 */
	public String in_to_addr3() {
		return getConstString(offset + 13, $in_to_addr3);
	}

	/**
	 * Delivery destination address3 納入先住所３.<p>
	 *
	 */
	public void in_to_addr3(String value) {
		setConstString(offset + 13, $in_to_addr3, value);
	}


	/**
	 * Delivery destination address4 納入先住所４.<p>
	 *
	 */
	public String in_to_addr4() {
		return getConstString(offset + 14, $in_to_addr4);
	}

	/**
	 * Delivery destination address4 納入先住所４.<p>
	 *
	 */
	public void in_to_addr4(String value) {
		setConstString(offset + 14, $in_to_addr4, value);
	}


	/**
	 * Delivery destination TEL 納入先ＴＥＬ.<p>
	 *
	 */
	public String in_to_tel() {
		return getConstString(offset + 15, $in_to_tel);
	}

	/**
	 * Delivery destination TEL 納入先ＴＥＬ.<p>
	 *
	 */
	public void in_to_tel(String value) {
		setConstString(offset + 15, $in_to_tel, value);
	}


	/**
	 * Delivery destination FAX 納入先ＦＡＸ.<p>
	 *
	 */
	public String in_to_fax() {
		return getConstString(offset + 16, $in_to_fax);
	}

	/**
	 * Delivery destination FAX 納入先ＦＡＸ.<p>
	 *
	 */
	public void in_to_fax(String value) {
		setConstString(offset + 16, $in_to_fax, value);
	}


	/**
	 * Delivery destination country cd. 納入先国ＣＤ.<p>
	 *
	 */
	public String in_to_cntry_cd() {
		return getConstString(offset + 17, $in_to_cntry_cd);
	}

	/**
	 * Delivery destination country cd. 納入先国ＣＤ.<p>
	 *
	 */
	public void in_to_cntry_cd(String value) {
		setConstString(offset + 17, $in_to_cntry_cd, value);
	}


	/**
	 * Delivery destination country name 納入先国名.<p>
	 *
	 */
	public String in_to_cntry_nm() {
		return getConstString(offset + 18, $in_to_cntry_nm);
	}

	/**
	 * Delivery destination country name 納入先国名.<p>
	 *
	 */
	public void in_to_cntry_nm(String value) {
		setConstString(offset + 18, $in_to_cntry_nm, value);
	}


	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 19, $trnspt_cd);
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 19, $trnspt_cd, value);
	}


	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public String vssl_flght() {
		return getConstString(offset + 20, $vssl_flght);
	}

	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public void vssl_flght(String value) {
		setConstString(offset + 20, $vssl_flght, value);
	}


	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public String load_port_cd() {
		return getConstString(offset + 21, $load_port_cd);
	}

	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public void load_port_cd(String value) {
		setConstString(offset + 21, $load_port_cd, value);
	}


	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public MCDate etd_dt() {
		return getConstDate(offset + 22, $etd_dt);
	}

	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public void etd_dt(MCDate value) {
		setConstDate(offset + 22, $etd_dt, value);
	}


	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public String dschrg_port_cd() {
		return getConstString(offset + 23, $dschrg_port_cd);
	}

	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public void dschrg_port_cd(String value) {
		setConstString(offset + 23, $dschrg_port_cd, value);
	}


	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public MCDate eta_dt() {
		return getConstDate(offset + 24, $eta_dt);
	}

	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public void eta_dt(MCDate value) {
		setConstDate(offset + 24, $eta_dt, value);
	}


	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public String via_port_cd() {
		return getConstString(offset + 25, $via_port_cd);
	}

	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public void via_port_cd(String value) {
		setConstString(offset + 25, $via_port_cd, value);
	}


	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public MCDate via_schd_dt() {
		return getConstDate(offset + 26, $via_schd_dt);
	}

	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public void via_schd_dt(MCDate value) {
		setConstDate(offset + 26, $via_schd_dt, value);
	}


	/**
	 * Purchase I/V remarks 受領Ｉ／Ｖ備考.<p>
	 *
	 */
	public String rcpt_iv_rmrks() {
		return getConstString(offset + 27, $rcpt_iv_rmrks);
	}

	/**
	 * Purchase I/V remarks 受領Ｉ／Ｖ備考.<p>
	 *
	 */
	public void rcpt_iv_rmrks(String value) {
		setConstString(offset + 27, $rcpt_iv_rmrks, value);
	}


	/**
	 * Purchase I/V internal remarks 受領Ｉ／Ｖ内部備考.<p>
	 *
	 */
	public String rcpt_iv_intr_rmrks() {
		return getConstString(offset + 28, $rcpt_iv_intr_rmrks);
	}

	/**
	 * Purchase I/V internal remarks 受領Ｉ／Ｖ内部備考.<p>
	 *
	 */
	public void rcpt_iv_intr_rmrks(String value) {
		setConstString(offset + 28, $rcpt_iv_intr_rmrks, value);
	}


	/**
	 * Purchase I/V spare 1 受領Ｉ／Ｖ予備１.<p>
	 *
	 */
	public String rcpt_iv_sub_char1() {
		return getConstString(offset + 29, $rcpt_iv_sub_char1);
	}

	/**
	 * Purchase I/V spare 1 受領Ｉ／Ｖ予備１.<p>
	 *
	 */
	public void rcpt_iv_sub_char1(String value) {
		setConstString(offset + 29, $rcpt_iv_sub_char1, value);
	}


	/**
	 * Purchase I/V spare 2 受領Ｉ／Ｖ予備２.<p>
	 *
	 */
	public String rcpt_iv_sub_char2() {
		return getConstString(offset + 30, $rcpt_iv_sub_char2);
	}

	/**
	 * Purchase I/V spare 2 受領Ｉ／Ｖ予備２.<p>
	 *
	 */
	public void rcpt_iv_sub_char2(String value) {
		setConstString(offset + 30, $rcpt_iv_sub_char2, value);
	}


	/**
	 * Purchase I/V spare 3 受領Ｉ／Ｖ予備３.<p>
	 *
	 */
	public String rcpt_iv_sub_char3() {
		return getConstString(offset + 31, $rcpt_iv_sub_char3);
	}

	/**
	 * Purchase I/V spare 3 受領Ｉ／Ｖ予備３.<p>
	 *
	 */
	public void rcpt_iv_sub_char3(String value) {
		setConstString(offset + 31, $rcpt_iv_sub_char3, value);
	}


	/**
	 * Update counter (Purchase invoice header) 更新カウンタ（受領インボイスヘッダ）.<p>
	 *
	 */
	public MCNumber rcpt_iv_upd_cntr() {
		return getConstNumber(offset + 32, $rcpt_iv_upd_cntr);
	}

	/**
	 * Update counter (Purchase invoice header) 更新カウンタ（受領インボイスヘッダ）.<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(MCNumber value) {
		setConstNumber(offset + 32, $rcpt_iv_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase invoice header) 更新カウンタ（受領インボイスヘッダ）.<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(int value) {
		setConstNumber(offset + 32, $rcpt_iv_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase invoice header) 更新カウンタ（受領インボイスヘッダ）.<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(long value) {
		setConstNumber(offset + 32, $rcpt_iv_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase invoice header) 更新カウンタ（受領インボイスヘッダ）.<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(float value) {
		setConstNumber(offset + 32, $rcpt_iv_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase invoice header) 更新カウンタ（受領インボイスヘッダ）.<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(double value) {
		setConstNumber(offset + 32, $rcpt_iv_upd_cntr, value);
	}


	public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR ph(){
		return (mcframe.serverMSBD.MSBDL0140.Chk01_HdrR) getConstInnerRow(offset + 33, $ph);
	}
	
	public void ph(mcframe.serverMSBD.MSBDL0140.Chk01_HdrR row){
		setConstInnerRow(offset + 33, $ph, row);
	}


	/**
	 * Firm before change flg. 変更前確定ＦＬＧ.<p>
	 *
	 */
	public boolean bef_fix_flg() {
		return getConstBoolean(offset + 34, $bef_fix_flg);
	}

	/**
	 * Firm before change flg. 変更前確定ＦＬＧ.<p>
	 *
	 */
	public void bef_fix_flg(boolean value) {
		setConstBoolean(offset + 34, $bef_fix_flg, value);
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
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			return in_to_cntct_dpt();
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			return in_to_cntct_psn();
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
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			return in_to_cntry_cd();
		}
		if ($in_to_cntry_nm.equalsIgnoreCase(name)) {
			return in_to_cntry_nm();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($rcpt_iv_rmrks.equalsIgnoreCase(name)) {
			return rcpt_iv_rmrks();
		}
		if ($rcpt_iv_intr_rmrks.equalsIgnoreCase(name)) {
			return rcpt_iv_intr_rmrks();
		}
		if ($rcpt_iv_sub_char1.equalsIgnoreCase(name)) {
			return rcpt_iv_sub_char1();
		}
		if ($rcpt_iv_sub_char2.equalsIgnoreCase(name)) {
			return rcpt_iv_sub_char2();
		}
		if ($rcpt_iv_sub_char3.equalsIgnoreCase(name)) {
			return rcpt_iv_sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			return rcpt_iv_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($iv_dt.equalsIgnoreCase(name)) {
			return iv_dt();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($purc_ac_schd_dt.equalsIgnoreCase(name)) {
			return purc_ac_schd_dt();
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
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($bef_fix_flg.equalsIgnoreCase(name)) {
			return bef_fix_flg();
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
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			return in_to_cntct_dpt();
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			return in_to_cntct_psn();
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
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			return in_to_cntry_cd();
		}
		if ($in_to_cntry_nm.equalsIgnoreCase(name)) {
			return in_to_cntry_nm();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($rcpt_iv_rmrks.equalsIgnoreCase(name)) {
			return rcpt_iv_rmrks();
		}
		if ($rcpt_iv_intr_rmrks.equalsIgnoreCase(name)) {
			return rcpt_iv_intr_rmrks();
		}
		if ($rcpt_iv_sub_char1.equalsIgnoreCase(name)) {
			return rcpt_iv_sub_char1();
		}
		if ($rcpt_iv_sub_char2.equalsIgnoreCase(name)) {
			return rcpt_iv_sub_char2();
		}
		if ($rcpt_iv_sub_char3.equalsIgnoreCase(name)) {
			return rcpt_iv_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			return rcpt_iv_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($iv_dt.equalsIgnoreCase(name)) {
			return iv_dt();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($purc_ac_schd_dt.equalsIgnoreCase(name)) {
			return purc_ac_schd_dt();
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
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($bef_fix_flg.equalsIgnoreCase(name)) {
			return bef_fix_flg();
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
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			in_to_cntct_dpt(value);
			return;
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			in_to_cntct_psn(value);
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
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			in_to_cntry_cd(value);
			return;
		}
		if ($in_to_cntry_nm.equalsIgnoreCase(name)) {
			in_to_cntry_nm(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
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
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($rcpt_iv_rmrks.equalsIgnoreCase(name)) {
			rcpt_iv_rmrks(value);
			return;
		}
		if ($rcpt_iv_intr_rmrks.equalsIgnoreCase(name)) {
			rcpt_iv_intr_rmrks(value);
			return;
		}
		if ($rcpt_iv_sub_char1.equalsIgnoreCase(name)) {
			rcpt_iv_sub_char1(value);
			return;
		}
		if ($rcpt_iv_sub_char2.equalsIgnoreCase(name)) {
			rcpt_iv_sub_char2(value);
			return;
		}
		if ($rcpt_iv_sub_char3.equalsIgnoreCase(name)) {
			rcpt_iv_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($iv_dt.equalsIgnoreCase(name)) {
			iv_dt(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($purc_ac_schd_dt.equalsIgnoreCase(name)) {
			purc_ac_schd_dt(value);
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
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($bef_fix_flg.equalsIgnoreCase(name)) {
			bef_fix_flg(value);
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
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			in_to_cntct_dpt(value);
			return;
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			in_to_cntct_psn(value);
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
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			in_to_cntry_cd(value);
			return;
		}
		if ($in_to_cntry_nm.equalsIgnoreCase(name)) {
			in_to_cntry_nm(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
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
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($rcpt_iv_rmrks.equalsIgnoreCase(name)) {
			rcpt_iv_rmrks(value);
			return;
		}
		if ($rcpt_iv_intr_rmrks.equalsIgnoreCase(name)) {
			rcpt_iv_intr_rmrks(value);
			return;
		}
		if ($rcpt_iv_sub_char1.equalsIgnoreCase(name)) {
			rcpt_iv_sub_char1(value);
			return;
		}
		if ($rcpt_iv_sub_char2.equalsIgnoreCase(name)) {
			rcpt_iv_sub_char2(value);
			return;
		}
		if ($rcpt_iv_sub_char3.equalsIgnoreCase(name)) {
			rcpt_iv_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($iv_dt.equalsIgnoreCase(name)) {
			iv_dt(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($purc_ac_schd_dt.equalsIgnoreCase(name)) {
			purc_ac_schd_dt(value);
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
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($bef_fix_flg.equalsIgnoreCase(name)) {
			bef_fix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ph.equalsIgnoreCase(name)) {
			return ph();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ph.equalsIgnoreCase(name)) {
			ph(
				((MCContainerMeta) ph_META).castInnerRow(mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return ph().data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		ph().data_crud_typ(value);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return ph().err_flg();
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		ph().err_flg(value);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return ph().ac_ym();
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		ph().ac_ym(value);
	}

	/**
	 * Purchase I/V No. 受領Ｉ／ＶＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return ph().rcpt_iv_no();
	}

	/**
	 * Purchase I/V No. 受領Ｉ／ＶＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		ph().rcpt_iv_no(value);
	}

	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return ph().rcpt_iv_mng_no();
	}

	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		ph().rcpt_iv_mng_no(value);
	}

	/**
	 * Purchase I/V rev. number 受領Ｉ／Ｖ改訂番号.<p>
	 *
	 */
	public MCNumber rcpt_iv_rev() {
		return ph().rcpt_iv_rev();
	}

	/**
	 * Purchase I/V rev. number 受領Ｉ／Ｖ改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(MCNumber value) {
		ph().rcpt_iv_rev(value);
	}

	/**
	 * Purchase I/V rev. number 受領Ｉ／Ｖ改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(int value) {
		ph().rcpt_iv_rev(value);
	}

	/**
	 * Purchase I/V rev. number 受領Ｉ／Ｖ改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(long value) {
		ph().rcpt_iv_rev(value);
	}

	/**
	 * Purchase I/V rev. number 受領Ｉ／Ｖ改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(float value) {
		ph().rcpt_iv_rev(value);
	}

	/**
	 * Purchase I/V rev. number 受領Ｉ／Ｖ改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(double value) {
		ph().rcpt_iv_rev(value);
	}

	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public MCDate purc_dt() {
		return ph().purc_dt();
	}

	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public void purc_dt(MCDate value) {
		ph().purc_dt(value);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return ph().can_ac_dt();
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		ph().can_ac_dt(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return ph().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		ph().ac_dt(value);
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public MCDate pay_basis_dt() {
		return ph().pay_basis_dt();
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public void pay_basis_dt(MCDate value) {
		ph().pay_basis_dt(value);
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return ph().pay_schd_dt();
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		ph().pay_schd_dt(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return ph().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		ph().sppl_cd(value);
	}

	/**
	 * Supplier invoice transaction flg. 発注先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public boolean sppl_iv_flg() {
		return ph().sppl_iv_flg();
	}

	/**
	 * Supplier invoice transaction flg. 発注先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public void sppl_iv_flg(boolean value) {
		ph().sppl_iv_flg(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return ph().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		ph().trd_cur_cd(value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_upri_dec_place() {
		return ph().trd_cur_upri_dec_place();
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(MCNumber value) {
		ph().trd_cur_upri_dec_place(value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(int value) {
		ph().trd_cur_upri_dec_place(value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(long value) {
		ph().trd_cur_upri_dec_place(value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(float value) {
		ph().trd_cur_upri_dec_place(value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(double value) {
		ph().trd_cur_upri_dec_place(value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return ph().trd_cur_amt_dec_place();
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		ph().trd_cur_amt_dec_place(value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		ph().trd_cur_amt_dec_place(value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		ph().trd_cur_amt_dec_place(value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		ph().trd_cur_amt_dec_place(value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		ph().trd_cur_amt_dec_place(value);
	}

	/**
	 * Set scheduled rate 予定レート指定.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return ph().xrate_inpt_flg();
	}

	/**
	 * Set scheduled rate 予定レート指定.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		ph().xrate_inpt_flg(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return ph().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		ph().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		ph().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		ph().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		ph().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		ph().xrate(value);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return ph().base_cur_cd();
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		ph().base_cur_cd(value);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return ph().ptax_cur_cd();
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		ph().ptax_cur_cd(value);
	}

	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public MCDate ptax_dt() {
		return ph().ptax_dt();
	}

	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public void ptax_dt(MCDate value) {
		ph().ptax_dt(value);
	}

	/**
	 * Set tax schedule rate 納税予定レート指定.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return ph().ptax_xrate_inpt_flg();
	}

	/**
	 * Set tax schedule rate 納税予定レート指定.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		ph().ptax_xrate_inpt_flg(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return ph().ptax_xrate();
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		ph().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		ph().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		ph().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		ph().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		ph().ptax_xrate(value);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return ph().asppl_cd();
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		ph().asppl_cd(value);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return ph().bsppl_cd();
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		ph().bsppl_cd(value);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return ph().psppl_cd();
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		ph().psppl_cd(value);
	}

	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public String cred_cd() {
		return ph().cred_cd();
	}

	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public void cred_cd(String value) {
		ph().cred_cd(value);
	}

	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public String purc_amt_rnd_typ() {
		return ph().purc_amt_rnd_typ();
	}

	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public void purc_amt_rnd_typ(String value) {
		ph().purc_amt_rnd_typ(value);
	}

	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return ph().purc_tax_rnd_typ();
	}

	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		ph().purc_tax_rnd_typ(value);
	}

	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public String purc_tax_calc_typ() {
		return ph().purc_tax_calc_typ();
	}

	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public void purc_tax_calc_typ(String value) {
		ph().purc_tax_calc_typ(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return ph().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		ph().trd_rmrks(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return ph().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		ph().intr_rmrks(value);
	}

	/**
	 * Purchase result spare 1 仕入実績予備１.<p>
	 *
	 */
	public String sub_char1() {
		return ph().sub_char1();
	}

	/**
	 * Purchase result spare 1 仕入実績予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		ph().sub_char1(value);
	}

	/**
	 * Purchase result spare 2 仕入実績予備２.<p>
	 *
	 */
	public String sub_char2() {
		return ph().sub_char2();
	}

	/**
	 * Purchase result spare 2 仕入実績予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		ph().sub_char2(value);
	}

	/**
	 * Purchase result spare 3 仕入実績予備３.<p>
	 *
	 */
	public String sub_char3() {
		return ph().sub_char3();
	}

	/**
	 * Purchase result spare 3 仕入実績予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		ph().sub_char3(value);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return ph().tterm_cd1();
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		ph().tterm_cd1(value);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return ph().tterm_rmrks1();
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		ph().tterm_rmrks1(value);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return ph().tterm_cd2();
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		ph().tterm_cd2(value);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return ph().tterm_rmrks2();
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		ph().tterm_rmrks2(value);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return ph().tterm_cd3();
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		ph().tterm_cd3(value);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return ph().tterm_rmrks3();
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		ph().tterm_rmrks3(value);
	}

	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public boolean edi_flg() {
		return ph().edi_flg();
	}

	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		ph().edi_flg(value);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_flg() {
		return ph().subcon_flg();
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		ph().subcon_flg(value);
	}

}

