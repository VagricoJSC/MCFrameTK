package mcframe.serverMSBE.MSBEL5740;

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
 * ブロック"RcptIv_Chk01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RcptIv_Chk01_HdrR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Firm flg. 確定ＦＬＧ.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	public static final String $iv = "iv";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Base date 基準日.<p>
	 *
	 */
	public static final String $base_dt = "base_dt";
	/**
	 * Customer invoice transaction flg. 得意先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
	/**
	 * Purchase invoice No. before change 変更前受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $old_rcpt_iv_no = "old_rcpt_iv_no";
	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public static final String $purc_amt_rnd_typ = "purc_amt_rnd_typ";
	/**
	 * Tax rounding type 消費税端数処理区分.<p>
	 *
	 */
	public static final String $purc_tax_rnd_typ = "purc_tax_rnd_typ";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_amt_dec_place = "trd_amt_dec_place";
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_upri_dec_place = "trd_upri_dec_place";
	/**
	 * Sales order transaction terms cd. 1 受注取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $slo_tterm_cd1 = "slo_tterm_cd1";
	/**
	 * Sales order transaction terms remarks 1 受注取引条件備考１.<p>
	 *
	 */
	public static final String $slo_tterm_rmrks1 = "slo_tterm_rmrks1";
	/**
	 * Sales order transaction terms cd. 2 受注取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $slo_tterm_cd2 = "slo_tterm_cd2";
	/**
	 * Sales order transaction terms remarks 2 受注取引条件備考２.<p>
	 *
	 */
	public static final String $slo_tterm_rmrks2 = "slo_tterm_rmrks2";
	/**
	 * Sales order transaction terms cd. 3 受注取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $slo_tterm_cd3 = "slo_tterm_cd3";
	/**
	 * Sales order transaction terms remarks 3 受注取引条件備考３.<p>
	 *
	 */
	public static final String $slo_tterm_rmrks3 = "slo_tterm_rmrks3";

	public static final String $rcpt_iv_mng_no = $iv + ".rcpt_iv_mng_no";
	public static final String $rcpt_iv_rev = $iv + ".rcpt_iv_rev";
	public static final String $rcpt_iv_no = $iv + ".rcpt_iv_no";
	public static final String $rcpt_iv_src_typ = $iv + ".rcpt_iv_src_typ";
	public static final String $purc_schd_dt = $iv + ".purc_schd_dt";
	public static final String $purc_dt = $iv + ".purc_dt";
	public static final String $iv_dt = $iv + ".iv_dt";
	public static final String $purc_ac_schd_dt = $iv + ".purc_ac_schd_dt";
	public static final String $sppl_cd = $iv + ".sppl_cd";
	public static final String $in_to_id_typ = $iv + ".in_to_id_typ";
	public static final String $in_to_id_cd = $iv + ".in_to_id_cd";
	public static final String $in_to_id_nm = $iv + ".in_to_id_nm";
	public static final String $in_to_zip_cd = $iv + ".in_to_zip_cd";
	public static final String $in_to_addr1 = $iv + ".in_to_addr1";
	public static final String $in_to_addr2 = $iv + ".in_to_addr2";
	public static final String $in_to_addr3 = $iv + ".in_to_addr3";
	public static final String $in_to_addr4 = $iv + ".in_to_addr4";
	public static final String $in_to_cntct_dpt = $iv + ".in_to_cntct_dpt";
	public static final String $in_to_cntct_psn = $iv + ".in_to_cntct_psn";
	public static final String $in_to_tel = $iv + ".in_to_tel";
	public static final String $in_to_fax = $iv + ".in_to_fax";
	public static final String $in_to_cntry_cd = $iv + ".in_to_cntry_cd";
	public static final String $in_to_sundry_flg = $iv + ".in_to_sundry_flg";
	public static final String $trnspt_cd = $iv + ".trnspt_cd";
	public static final String $vssl_flght = $iv + ".vssl_flght";
	public static final String $load_port_cd = $iv + ".load_port_cd";
	public static final String $etd_dt = $iv + ".etd_dt";
	public static final String $dschrg_port_cd = $iv + ".dschrg_port_cd";
	public static final String $eta_dt = $iv + ".eta_dt";
	public static final String $via_port_cd = $iv + ".via_port_cd";
	public static final String $via_schd_dt = $iv + ".via_schd_dt";
	public static final String $tterm_cd1 = $iv + ".tterm_cd1";
	public static final String $tterm_rmrks1 = $iv + ".tterm_rmrks1";
	public static final String $tterm_cd2 = $iv + ".tterm_cd2";
	public static final String $tterm_rmrks2 = $iv + ".tterm_rmrks2";
	public static final String $tterm_cd3 = $iv + ".tterm_cd3";
	public static final String $tterm_rmrks3 = $iv + ".tterm_rmrks3";
	public static final String $trd_cur_cd = $iv + ".trd_cur_cd";
	public static final String $ptax_cur_cd = $iv + ".ptax_cur_cd";
	public static final String $xrate_inpt_flg = $iv + ".xrate_inpt_flg";
	public static final String $xrate = $iv + ".xrate";
	public static final String $ptax_xrate_inpt_flg = $iv + ".ptax_xrate_inpt_flg";
	public static final String $ptax_xrate = $iv + ".ptax_xrate";
	public static final String $pay_basis_dt = $iv + ".pay_basis_dt";
	public static final String $pay_schd_dt = $iv + ".pay_schd_dt";
	public static final String $purc_cmpl_flg = $iv + ".purc_cmpl_flg";
	public static final String $trd_rmrks = $iv + ".trd_rmrks";
	public static final String $intr_rmrks = $iv + ".intr_rmrks";
	public static final String $sub_char1 = $iv + ".sub_char1";
	public static final String $sub_char2 = $iv + ".sub_char2";
	public static final String $sub_char3 = $iv + ".sub_char3";
	public static final String $rcpt_iv_rmrks = $iv + ".rcpt_iv_rmrks";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_META = createInnerRowMeta($iv, mcframe.serverMS.dbc.MST_RCPT_IV_R.class);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta base_dt_META = createCommonMeta($base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_rcpt_iv_no_META = createCommonMeta($old_rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta purc_amt_rnd_typ_META = createCommonMeta($purc_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_rnd_typ_META = createCommonMeta($purc_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_amt_dec_place_META = createCommonMeta($trd_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_upri_dec_place_META = createCommonMeta($trd_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta slo_tterm_cd1_META = createCommonMeta($slo_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta slo_tterm_rmrks1_META = createCommonMeta($slo_tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta slo_tterm_cd2_META = createCommonMeta($slo_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta slo_tterm_rmrks2_META = createCommonMeta($slo_tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta slo_tterm_cd3_META = createCommonMeta($slo_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta slo_tterm_rmrks3_META = createCommonMeta($slo_tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);

	protected static final ConstMetaList<RcptIv_Chk01_HdrR> constMetas = new ConstMetaList<RcptIv_Chk01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			data_crud_typ_META,
			fix_flg_META,
			iv_META,
			ac_dt_META,
			base_dt_META,
			cst_iv_flg_META,
			old_rcpt_iv_no_META,
			purc_amt_rnd_typ_META,
			purc_tax_rnd_typ_META,
			trd_amt_dec_place_META,
			trd_upri_dec_place_META,
			slo_tterm_cd1_META,
			slo_tterm_rmrks1_META,
			slo_tterm_cd2_META,
			slo_tterm_rmrks2_META,
			slo_tterm_cd3_META,
			slo_tterm_rmrks3_META
		},
		new String[][]{
			{
				"rcpt_iv_mng_no",
				"rcpt_iv_rev",
				"rcpt_iv_no",
				"rcpt_iv_src_typ",
				"purc_schd_dt",
				"purc_dt",
				"iv_dt",
				"purc_ac_schd_dt",
				"sppl_cd",
				"in_to_id_typ",
				"in_to_id_cd",
				"in_to_id_nm",
				"in_to_zip_cd",
				"in_to_addr1",
				"in_to_addr2",
				"in_to_addr3",
				"in_to_addr4",
				"in_to_cntct_dpt",
				"in_to_cntct_psn",
				"in_to_tel",
				"in_to_fax",
				"in_to_cntry_cd",
				"in_to_sundry_flg",
				"trnspt_cd",
				"vssl_flght",
				"load_port_cd",
				"etd_dt",
				"dschrg_port_cd",
				"eta_dt",
				"via_port_cd",
				"via_schd_dt",
				"tterm_cd1",
				"tterm_rmrks1",
				"tterm_cd2",
				"tterm_rmrks2",
				"tterm_cd3",
				"tterm_rmrks3",
				"trd_cur_cd",
				"ptax_cur_cd",
				"xrate_inpt_flg",
				"xrate",
				"ptax_xrate_inpt_flg",
				"ptax_xrate",
				"pay_basis_dt",
				"pay_schd_dt",
				"purc_cmpl_flg",
				"trd_rmrks",
				"intr_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"rcpt_iv_rmrks"
			},
			{
				$rcpt_iv_mng_no,
				$rcpt_iv_rev,
				$rcpt_iv_no,
				$rcpt_iv_src_typ,
				$purc_schd_dt,
				$purc_dt,
				$iv_dt,
				$purc_ac_schd_dt,
				$sppl_cd,
				$in_to_id_typ,
				$in_to_id_cd,
				$in_to_id_nm,
				$in_to_zip_cd,
				$in_to_addr1,
				$in_to_addr2,
				$in_to_addr3,
				$in_to_addr4,
				$in_to_cntct_dpt,
				$in_to_cntct_psn,
				$in_to_tel,
				$in_to_fax,
				$in_to_cntry_cd,
				$in_to_sundry_flg,
				$trnspt_cd,
				$vssl_flght,
				$load_port_cd,
				$etd_dt,
				$dschrg_port_cd,
				$eta_dt,
				$via_port_cd,
				$via_schd_dt,
				$tterm_cd1,
				$tterm_rmrks1,
				$tterm_cd2,
				$tterm_rmrks2,
				$tterm_cd3,
				$tterm_rmrks3,
				$trd_cur_cd,
				$ptax_cur_cd,
				$xrate_inpt_flg,
				$xrate,
				$ptax_xrate_inpt_flg,
				$ptax_xrate,
				$pay_basis_dt,
				$pay_schd_dt,
				$purc_cmpl_flg,
				$trd_rmrks,
				$intr_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$rcpt_iv_rmrks
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
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
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$iv + ".xrate", "positive"},	// iv.xrate
				{$iv + ".ptax_xrate", "positive"}	// iv.ptax_xrate
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$iv + ".etd_dt", "E1:BF"},	// iv.etd_dt
				{$iv + ".eta_dt", "E2:AF"},	// iv.eta_dt
				{$iv + ".via_schd_dt", "E1:AF,E2:BF"}	// iv.via_schd_dt
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
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
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
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
	protected RcptIv_Chk01_HdrR_MC_A(ConstMetaList<? extends RcptIv_Chk01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcptIv_Chk01_HdrR clone() {
		return (RcptIv_Chk01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcptIv_Chk01_HdrR createInstance() {
		return (RcptIv_Chk01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcptIv_Chk01_HdrR getValues(String... names) {
		return (RcptIv_Chk01_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 2, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 2, $data_crud_typ, value);
	}


	/**
	 * Firm flg. 確定ＦＬＧ.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 3, $fix_flg);
	}

	/**
	 * Firm flg. 確定ＦＬＧ.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 3, $fix_flg, value);
	}


	public mcframe.serverMS.dbc.MST_RCPT_IV_R iv(){
		return (mcframe.serverMS.dbc.MST_RCPT_IV_R) getConstInnerRow(offset + 4, $iv);
	}
	
	public void iv(mcframe.serverMS.dbc.MST_RCPT_IV_R row){
		setConstInnerRow(offset + 4, $iv, row);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 5, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 5, $ac_dt, value);
	}


	/**
	 * Base date 基準日.<p>
	 *
	 */
	public MCDate base_dt() {
		return getConstDate(offset + 6, $base_dt);
	}

	/**
	 * Base date 基準日.<p>
	 *
	 */
	public void base_dt(MCDate value) {
		setConstDate(offset + 6, $base_dt, value);
	}


	/**
	 * Customer invoice transaction flg. 得意先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 7, $cst_iv_flg);
	}

	/**
	 * Customer invoice transaction flg. 得意先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 7, $cst_iv_flg, value);
	}


	/**
	 * Purchase invoice No. before change 変更前受領インボイスＮＯ.<p>
	 *
	 */
	public String old_rcpt_iv_no() {
		return getConstString(offset + 8, $old_rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. before change 変更前受領インボイスＮＯ.<p>
	 *
	 */
	public void old_rcpt_iv_no(String value) {
		setConstString(offset + 8, $old_rcpt_iv_no, value);
	}


	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public String purc_amt_rnd_typ() {
		return getConstString(offset + 9, $purc_amt_rnd_typ);
	}

	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public void purc_amt_rnd_typ(String value) {
		setConstString(offset + 9, $purc_amt_rnd_typ, value);
	}


	/**
	 * Tax rounding type 消費税端数処理区分.<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return getConstString(offset + 10, $purc_tax_rnd_typ);
	}

	/**
	 * Tax rounding type 消費税端数処理区分.<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		setConstString(offset + 10, $purc_tax_rnd_typ, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_amt_dec_place() {
		return getConstNumber(offset + 11, $trd_amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 11, $trd_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(int value) {
		setConstNumber(offset + 11, $trd_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(long value) {
		setConstNumber(offset + 11, $trd_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(float value) {
		setConstNumber(offset + 11, $trd_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(double value) {
		setConstNumber(offset + 11, $trd_amt_dec_place, value);
	}


	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_upri_dec_place() {
		return getConstNumber(offset + 12, $trd_upri_dec_place);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void trd_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 12, $trd_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void trd_upri_dec_place(int value) {
		setConstNumber(offset + 12, $trd_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void trd_upri_dec_place(long value) {
		setConstNumber(offset + 12, $trd_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void trd_upri_dec_place(float value) {
		setConstNumber(offset + 12, $trd_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void trd_upri_dec_place(double value) {
		setConstNumber(offset + 12, $trd_upri_dec_place, value);
	}


	/**
	 * Sales order transaction terms cd. 1 受注取引条件ＣＤ１.<p>
	 *
	 */
	public String slo_tterm_cd1() {
		return getConstString(offset + 13, $slo_tterm_cd1);
	}

	/**
	 * Sales order transaction terms cd. 1 受注取引条件ＣＤ１.<p>
	 *
	 */
	public void slo_tterm_cd1(String value) {
		setConstString(offset + 13, $slo_tterm_cd1, value);
	}


	/**
	 * Sales order transaction terms remarks 1 受注取引条件備考１.<p>
	 *
	 */
	public String slo_tterm_rmrks1() {
		return getConstString(offset + 14, $slo_tterm_rmrks1);
	}

	/**
	 * Sales order transaction terms remarks 1 受注取引条件備考１.<p>
	 *
	 */
	public void slo_tterm_rmrks1(String value) {
		setConstString(offset + 14, $slo_tterm_rmrks1, value);
	}


	/**
	 * Sales order transaction terms cd. 2 受注取引条件ＣＤ２.<p>
	 *
	 */
	public String slo_tterm_cd2() {
		return getConstString(offset + 15, $slo_tterm_cd2);
	}

	/**
	 * Sales order transaction terms cd. 2 受注取引条件ＣＤ２.<p>
	 *
	 */
	public void slo_tterm_cd2(String value) {
		setConstString(offset + 15, $slo_tterm_cd2, value);
	}


	/**
	 * Sales order transaction terms remarks 2 受注取引条件備考２.<p>
	 *
	 */
	public String slo_tterm_rmrks2() {
		return getConstString(offset + 16, $slo_tterm_rmrks2);
	}

	/**
	 * Sales order transaction terms remarks 2 受注取引条件備考２.<p>
	 *
	 */
	public void slo_tterm_rmrks2(String value) {
		setConstString(offset + 16, $slo_tterm_rmrks2, value);
	}


	/**
	 * Sales order transaction terms cd. 3 受注取引条件ＣＤ３.<p>
	 *
	 */
	public String slo_tterm_cd3() {
		return getConstString(offset + 17, $slo_tterm_cd3);
	}

	/**
	 * Sales order transaction terms cd. 3 受注取引条件ＣＤ３.<p>
	 *
	 */
	public void slo_tterm_cd3(String value) {
		setConstString(offset + 17, $slo_tterm_cd3, value);
	}


	/**
	 * Sales order transaction terms remarks 3 受注取引条件備考３.<p>
	 *
	 */
	public String slo_tterm_rmrks3() {
		return getConstString(offset + 18, $slo_tterm_rmrks3);
	}

	/**
	 * Sales order transaction terms remarks 3 受注取引条件備考３.<p>
	 *
	 */
	public void slo_tterm_rmrks3(String value) {
		setConstString(offset + 18, $slo_tterm_rmrks3, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($old_rcpt_iv_no.equalsIgnoreCase(name)) {
			return old_rcpt_iv_no();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($slo_tterm_cd1.equalsIgnoreCase(name)) {
			return slo_tterm_cd1();
		}
		if ($slo_tterm_rmrks1.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks1();
		}
		if ($slo_tterm_cd2.equalsIgnoreCase(name)) {
			return slo_tterm_cd2();
		}
		if ($slo_tterm_rmrks2.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks2();
		}
		if ($slo_tterm_cd3.equalsIgnoreCase(name)) {
			return slo_tterm_cd3();
		}
		if ($slo_tterm_rmrks3.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_amt_dec_place();
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_upri_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($old_rcpt_iv_no.equalsIgnoreCase(name)) {
			return old_rcpt_iv_no();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($slo_tterm_cd1.equalsIgnoreCase(name)) {
			return slo_tterm_cd1();
		}
		if ($slo_tterm_rmrks1.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks1();
		}
		if ($slo_tterm_cd2.equalsIgnoreCase(name)) {
			return slo_tterm_cd2();
		}
		if ($slo_tterm_rmrks2.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks2();
		}
		if ($slo_tterm_cd3.equalsIgnoreCase(name)) {
			return slo_tterm_cd3();
		}
		if ($slo_tterm_rmrks3.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_amt_dec_place();
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_upri_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($old_rcpt_iv_no.equalsIgnoreCase(name)) {
			old_rcpt_iv_no(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($slo_tterm_cd1.equalsIgnoreCase(name)) {
			slo_tterm_cd1(value);
			return;
		}
		if ($slo_tterm_rmrks1.equalsIgnoreCase(name)) {
			slo_tterm_rmrks1(value);
			return;
		}
		if ($slo_tterm_cd2.equalsIgnoreCase(name)) {
			slo_tterm_cd2(value);
			return;
		}
		if ($slo_tterm_rmrks2.equalsIgnoreCase(name)) {
			slo_tterm_rmrks2(value);
			return;
		}
		if ($slo_tterm_cd3.equalsIgnoreCase(name)) {
			slo_tterm_cd3(value);
			return;
		}
		if ($slo_tterm_rmrks3.equalsIgnoreCase(name)) {
			slo_tterm_rmrks3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($old_rcpt_iv_no.equalsIgnoreCase(name)) {
			old_rcpt_iv_no(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($slo_tterm_cd1.equalsIgnoreCase(name)) {
			slo_tterm_cd1(value);
			return;
		}
		if ($slo_tterm_rmrks1.equalsIgnoreCase(name)) {
			slo_tterm_rmrks1(value);
			return;
		}
		if ($slo_tterm_cd2.equalsIgnoreCase(name)) {
			slo_tterm_cd2(value);
			return;
		}
		if ($slo_tterm_rmrks2.equalsIgnoreCase(name)) {
			slo_tterm_rmrks2(value);
			return;
		}
		if ($slo_tterm_cd3.equalsIgnoreCase(name)) {
			slo_tterm_cd3(value);
			return;
		}
		if ($slo_tterm_rmrks3.equalsIgnoreCase(name)) {
			slo_tterm_rmrks3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($iv.equalsIgnoreCase(name)) {
			return iv();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($iv.equalsIgnoreCase(name)) {
			iv(
				((MCContainerMeta) iv_META).castInnerRow(mcframe.serverMS.dbc.MST_RCPT_IV_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return iv().rcpt_iv_mng_no();
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		iv().rcpt_iv_mng_no(value);
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public MCNumber rcpt_iv_rev() {
		return iv().rcpt_iv_rev();
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(MCNumber value) {
		iv().rcpt_iv_rev(value);
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(int value) {
		iv().rcpt_iv_rev(value);
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(long value) {
		iv().rcpt_iv_rev(value);
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(float value) {
		iv().rcpt_iv_rev(value);
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(double value) {
		iv().rcpt_iv_rev(value);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return iv().rcpt_iv_no();
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		iv().rcpt_iv_no(value);
	}

	/**
	 * Purchase invoice creating source type 受領インボイス作成元区分.<p>
	 *
	 */
	public String rcpt_iv_src_typ() {
		return iv().rcpt_iv_src_typ();
	}

	/**
	 * Purchase invoice creating source type 受領インボイス作成元区分.<p>
	 *
	 */
	public void rcpt_iv_src_typ(String value) {
		iv().rcpt_iv_src_typ(value);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return iv().purc_schd_dt();
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		iv().purc_schd_dt(value);
	}

	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public MCDate purc_dt() {
		return iv().purc_dt();
	}

	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public void purc_dt(MCDate value) {
		iv().purc_dt(value);
	}

	/**
	 * Invoice date インボイス日付.<p>
	 *
	 */
	public MCDate iv_dt() {
		return iv().iv_dt();
	}

	/**
	 * Invoice date インボイス日付.<p>
	 *
	 */
	public void iv_dt(MCDate value) {
		iv().iv_dt(value);
	}

	/**
	 * Scheduled purchase recording date 仕入計上予定日.<p>
	 *
	 */
	public MCDate purc_ac_schd_dt() {
		return iv().purc_ac_schd_dt();
	}

	/**
	 * Scheduled purchase recording date 仕入計上予定日.<p>
	 *
	 */
	public void purc_ac_schd_dt(MCDate value) {
		iv().purc_ac_schd_dt(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return iv().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		iv().sppl_cd(value);
	}

	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public String in_to_id_typ() {
		return iv().in_to_id_typ();
	}

	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public void in_to_id_typ(String value) {
		iv().in_to_id_typ(value);
	}

	/**
	 * Delivery destination identification cd. 納入先識別ＣＤ.<p>
	 *
	 */
	public String in_to_id_cd() {
		return iv().in_to_id_cd();
	}

	/**
	 * Delivery destination identification cd. 納入先識別ＣＤ.<p>
	 *
	 */
	public void in_to_id_cd(String value) {
		iv().in_to_id_cd(value);
	}

	/**
	 * Delivery destination identification name 納入先識別名.<p>
	 *
	 */
	public String in_to_id_nm() {
		return iv().in_to_id_nm();
	}

	/**
	 * Delivery destination identification name 納入先識別名.<p>
	 *
	 */
	public void in_to_id_nm(String value) {
		iv().in_to_id_nm(value);
	}

	/**
	 * Delivery destination zip code 納入先郵便番号.<p>
	 *
	 */
	public String in_to_zip_cd() {
		return iv().in_to_zip_cd();
	}

	/**
	 * Delivery destination zip code 納入先郵便番号.<p>
	 *
	 */
	public void in_to_zip_cd(String value) {
		iv().in_to_zip_cd(value);
	}

	/**
	 * Delivery destination address1 納入先住所１.<p>
	 *
	 */
	public String in_to_addr1() {
		return iv().in_to_addr1();
	}

	/**
	 * Delivery destination address1 納入先住所１.<p>
	 *
	 */
	public void in_to_addr1(String value) {
		iv().in_to_addr1(value);
	}

	/**
	 * Delivery destination address2 納入先住所２.<p>
	 *
	 */
	public String in_to_addr2() {
		return iv().in_to_addr2();
	}

	/**
	 * Delivery destination address2 納入先住所２.<p>
	 *
	 */
	public void in_to_addr2(String value) {
		iv().in_to_addr2(value);
	}

	/**
	 * Delivery destination address3 納入先住所３.<p>
	 *
	 */
	public String in_to_addr3() {
		return iv().in_to_addr3();
	}

	/**
	 * Delivery destination address3 納入先住所３.<p>
	 *
	 */
	public void in_to_addr3(String value) {
		iv().in_to_addr3(value);
	}

	/**
	 * Delivery destination address4 納入先住所４.<p>
	 *
	 */
	public String in_to_addr4() {
		return iv().in_to_addr4();
	}

	/**
	 * Delivery destination address4 納入先住所４.<p>
	 *
	 */
	public void in_to_addr4(String value) {
		iv().in_to_addr4(value);
	}

	/**
	 * Delivery destination dept. 納入先部署.<p>
	 *
	 */
	public String in_to_cntct_dpt() {
		return iv().in_to_cntct_dpt();
	}

	/**
	 * Delivery destination dept. 納入先部署.<p>
	 *
	 */
	public void in_to_cntct_dpt(String value) {
		iv().in_to_cntct_dpt(value);
	}

	/**
	 * Delivery destination PIC 納入先担当者.<p>
	 *
	 */
	public String in_to_cntct_psn() {
		return iv().in_to_cntct_psn();
	}

	/**
	 * Delivery destination PIC 納入先担当者.<p>
	 *
	 */
	public void in_to_cntct_psn(String value) {
		iv().in_to_cntct_psn(value);
	}

	/**
	 * Delivery destination TEL 納入先ＴＥＬ.<p>
	 *
	 */
	public String in_to_tel() {
		return iv().in_to_tel();
	}

	/**
	 * Delivery destination TEL 納入先ＴＥＬ.<p>
	 *
	 */
	public void in_to_tel(String value) {
		iv().in_to_tel(value);
	}

	/**
	 * Delivery destination FAX 納入先ＦＡＸ.<p>
	 *
	 */
	public String in_to_fax() {
		return iv().in_to_fax();
	}

	/**
	 * Delivery destination FAX 納入先ＦＡＸ.<p>
	 *
	 */
	public void in_to_fax(String value) {
		iv().in_to_fax(value);
	}

	/**
	 * Delivery destination country cd. 納入先国ＣＤ.<p>
	 *
	 */
	public String in_to_cntry_cd() {
		return iv().in_to_cntry_cd();
	}

	/**
	 * Delivery destination country cd. 納入先国ＣＤ.<p>
	 *
	 */
	public void in_to_cntry_cd(String value) {
		iv().in_to_cntry_cd(value);
	}

	/**
	 * Miscellaneous delivery destination flg. 納入先諸口ＦＬＧ.<p>
	 *
	 */
	public boolean in_to_sundry_flg() {
		return iv().in_to_sundry_flg();
	}

	/**
	 * Miscellaneous delivery destination flg. 納入先諸口ＦＬＧ.<p>
	 *
	 */
	public void in_to_sundry_flg(boolean value) {
		iv().in_to_sundry_flg(value);
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return iv().trnspt_cd();
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		iv().trnspt_cd(value);
	}

	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public String vssl_flght() {
		return iv().vssl_flght();
	}

	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public void vssl_flght(String value) {
		iv().vssl_flght(value);
	}

	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public String load_port_cd() {
		return iv().load_port_cd();
	}

	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public void load_port_cd(String value) {
		iv().load_port_cd(value);
	}

	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public MCDate etd_dt() {
		return iv().etd_dt();
	}

	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public void etd_dt(MCDate value) {
		iv().etd_dt(value);
	}

	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public String dschrg_port_cd() {
		return iv().dschrg_port_cd();
	}

	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public void dschrg_port_cd(String value) {
		iv().dschrg_port_cd(value);
	}

	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public MCDate eta_dt() {
		return iv().eta_dt();
	}

	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public void eta_dt(MCDate value) {
		iv().eta_dt(value);
	}

	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public String via_port_cd() {
		return iv().via_port_cd();
	}

	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public void via_port_cd(String value) {
		iv().via_port_cd(value);
	}

	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public MCDate via_schd_dt() {
		return iv().via_schd_dt();
	}

	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public void via_schd_dt(MCDate value) {
		iv().via_schd_dt(value);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return iv().tterm_cd1();
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		iv().tterm_cd1(value);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return iv().tterm_rmrks1();
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		iv().tterm_rmrks1(value);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return iv().tterm_cd2();
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		iv().tterm_cd2(value);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return iv().tterm_rmrks2();
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		iv().tterm_rmrks2(value);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return iv().tterm_cd3();
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		iv().tterm_cd3(value);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return iv().tterm_rmrks3();
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		iv().tterm_rmrks3(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return iv().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		iv().trd_cur_cd(value);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return iv().ptax_cur_cd();
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		iv().ptax_cur_cd(value);
	}

	/**
	 * Set exchange rate flg. 為替レート指定ＦＬＧ.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return iv().xrate_inpt_flg();
	}

	/**
	 * Set exchange rate flg. 為替レート指定ＦＬＧ.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		iv().xrate_inpt_flg(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return iv().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		iv().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		iv().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		iv().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		iv().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		iv().xrate(value);
	}

	/**
	 * Taxpaying exchange rate specification flg. 納税為替レート指定ＦＬＧ.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return iv().ptax_xrate_inpt_flg();
	}

	/**
	 * Taxpaying exchange rate specification flg. 納税為替レート指定ＦＬＧ.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		iv().ptax_xrate_inpt_flg(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return iv().ptax_xrate();
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		iv().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		iv().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		iv().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		iv().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		iv().ptax_xrate(value);
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public MCDate pay_basis_dt() {
		return iv().pay_basis_dt();
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public void pay_basis_dt(MCDate value) {
		iv().pay_basis_dt(value);
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return iv().pay_schd_dt();
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		iv().pay_schd_dt(value);
	}

	/**
	 * Purchase completion flg. 仕入完了ＦＬＧ.<p>
	 *
	 */
	public boolean purc_cmpl_flg() {
		return iv().purc_cmpl_flg();
	}

	/**
	 * Purchase completion flg. 仕入完了ＦＬＧ.<p>
	 *
	 */
	public void purc_cmpl_flg(boolean value) {
		iv().purc_cmpl_flg(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return iv().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		iv().trd_rmrks(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return iv().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		iv().intr_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return iv().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		iv().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return iv().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		iv().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return iv().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		iv().sub_char3(value);
	}

	/**
	 * Purchase invoice remarks 受領インボイス備考.<p>
	 *
	 */
	public String rcpt_iv_rmrks() {
		return iv().rcpt_iv_rmrks();
	}

	/**
	 * Purchase invoice remarks 受領インボイス備考.<p>
	 *
	 */
	public void rcpt_iv_rmrks(String value) {
		iv().rcpt_iv_rmrks(value);
	}

}

