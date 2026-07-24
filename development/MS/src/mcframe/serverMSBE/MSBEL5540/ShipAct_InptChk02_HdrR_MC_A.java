package mcframe.serverMSBE.MSBEL5540;

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
 * ブロック"ShipAct_InptChk02_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ShipAct_InptChk02_HdrR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public static final String $ship_act_no = "ship_act_no";
	/**
	 * Shipping result rev. number 出荷実績改訂番号.<p>
	 *
	 */
	public static final String $ship_act_rev = "ship_act_rev";
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public static final String $ship_inst_no = "ship_inst_no";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Shipping date and time 出荷日時.<p>
	 *
	 */
	public static final String $ship_tm = "ship_tm";
	/**
	 * Delivery date and time 納品日時.<p>
	 *
	 */
	public static final String $dlv_tm = "dlv_tm";
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public static final String $rqst_dpt_cd = "rqst_dpt_cd";
	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public static final String $rqst_usr_cd = "rqst_usr_cd";
	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_cd = "ship_fr_lg_grp_cd";
	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Shipping dept. cd. 出荷部門ＣＤ.<p>
	 *
	 */
	public static final String $ship_dpt_cd = "ship_dpt_cd";
	/**
	 * Shipping PIC cd. 出荷担当者ＣＤ.<p>
	 *
	 */
	public static final String $ship_usr_cd = "ship_usr_cd";
	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_to_lg_grp_cd = "ship_to_lg_grp_cd";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
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
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public static final String $ship_to_id_nm = "ship_to_id_nm";
	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public static final String $ship_to_zip_cd = "ship_to_zip_cd";
	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public static final String $ship_to_addr1 = "ship_to_addr1";
	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public static final String $ship_to_addr2 = "ship_to_addr2";
	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public static final String $ship_to_addr3 = "ship_to_addr3";
	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public static final String $ship_to_addr4 = "ship_to_addr4";
	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public static final String $ship_to_cntct_dpt = "ship_to_cntct_dpt";
	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public static final String $ship_to_cntct_psn = "ship_to_cntct_psn";
	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public static final String $ship_to_tel = "ship_to_tel";
	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public static final String $ship_to_fax = "ship_to_fax";
	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public static final String $ship_to_sundry_flg = "ship_to_sundry_flg";
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public static final String $uplnd_flg = "uplnd_flg";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
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
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public static final String $dlv_slip_prnt_flg = "dlv_slip_prnt_flg";
	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public static final String $ship_adv_prnt_flg = "ship_adv_prnt_flg";
	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public static final String $lot_chk_off_flg = "lot_chk_off_flg";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";


	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta ship_act_no_META = createCommonMeta($ship_act_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_NO);
	public static final MCMeta ship_act_rev_META = createCommonMeta($ship_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta ship_inst_no_META = createCommonMeta($ship_inst_no, mcframe.commonMA.meta.MA_META.SHIP_INST_NO);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_tm_META = createCommonMeta($ship_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_tm_META = createCommonMeta($dlv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta rqst_dpt_cd_META = createCommonMeta($rqst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_usr_cd_META = createCommonMeta($rqst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ship_dpt_cd_META = createCommonMeta($ship_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ship_usr_cd_META = createCommonMeta($ship_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta ship_to_lg_grp_cd_META = createCommonMeta($ship_to_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ship_to_id_typ_META = createCommonMeta($ship_to_id_typ, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP);
	public static final MCMeta ship_to_id_cd_META = createCommonMeta($ship_to_id_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta ship_to_id_nm_META = createCommonMeta($ship_to_id_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_NM);
	public static final MCMeta ship_to_zip_cd_META = createCommonMeta($ship_to_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta ship_to_addr1_META = createCommonMeta($ship_to_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta ship_to_addr2_META = createCommonMeta($ship_to_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta ship_to_addr3_META = createCommonMeta($ship_to_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta ship_to_addr4_META = createCommonMeta($ship_to_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta ship_to_cntct_dpt_META = createCommonMeta($ship_to_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta ship_to_cntct_psn_META = createCommonMeta($ship_to_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta ship_to_tel_META = createCommonMeta($ship_to_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ship_to_fax_META = createCommonMeta($ship_to_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ship_to_sundry_flg_META = createCommonMeta($ship_to_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta uplnd_flg_META = createCommonMeta($uplnd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SHIP_ACT_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SHIP_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SHIP_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SHIP_ACT_SUB_CHAR3);
	public static final MCMeta dlv_slip_prnt_flg_META = createCommonMeta($dlv_slip_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_adv_prnt_flg_META = createCommonMeta($ship_adv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_chk_off_flg_META = createCommonMeta($lot_chk_off_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ShipAct_InptChk02_HdrR> constMetas = new ConstMetaList<ShipAct_InptChk02_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			ship_act_no_META,
			ship_act_rev_META,
			ship_inst_no_META,
			ac_dt_META,
			can_ac_dt_META,
			ship_tm_META,
			dlv_tm_META,
			rqst_dpt_cd_META,
			rqst_usr_cd_META,
			ship_fr_lg_grp_cd_META,
			wg_cd_META,
			ship_term_cd_META,
			ship_dpt_cd_META,
			ship_usr_cd_META,
			ship_to_lg_grp_cd_META,
			cst_cd_META,
			ship_to_id_typ_META,
			ship_to_id_cd_META,
			ship_to_id_nm_META,
			ship_to_zip_cd_META,
			ship_to_addr1_META,
			ship_to_addr2_META,
			ship_to_addr3_META,
			ship_to_addr4_META,
			ship_to_cntct_dpt_META,
			ship_to_cntct_psn_META,
			ship_to_tel_META,
			ship_to_fax_META,
			ship_to_sundry_flg_META,
			via_dlv_typ_META,
			iv_no_META,
			uplnd_flg_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			dlv_slip_prnt_flg_META,
			ship_adv_prnt_flg_META,
			lot_chk_off_flg_META,
			peg_no_META,
			err_flg_META
		},
		new String[][]{
			{
			},
			{
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
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
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
				{$data_crud_typ, "E"},	// data_crud_typ
				{$ship_act_no, "E"},	// ship_act_no
				{$can_ac_dt, "E"}	// can_ac_dt
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
				{$can_ac_dt, "bfToday"}	// can_ac_dt
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
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
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
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
	protected ShipAct_InptChk02_HdrR_MC_A(ConstMetaList<? extends ShipAct_InptChk02_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipAct_InptChk02_HdrR clone() {
		return (ShipAct_InptChk02_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipAct_InptChk02_HdrR createInstance() {
		return (ShipAct_InptChk02_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipAct_InptChk02_HdrR getValues(String... names) {
		return (ShipAct_InptChk02_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 0, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 0, $data_crud_typ, value);
	}


	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public String ship_act_no() {
		return getConstString(offset + 1, $ship_act_no);
	}

	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public void ship_act_no(String value) {
		setConstString(offset + 1, $ship_act_no, value);
	}


	/**
	 * Shipping result rev. number 出荷実績改訂番号.<p>
	 *
	 */
	public MCNumber ship_act_rev() {
		return getConstNumber(offset + 2, $ship_act_rev);
	}

	/**
	 * Shipping result rev. number 出荷実績改訂番号.<p>
	 *
	 */
	public void ship_act_rev(MCNumber value) {
		setConstNumber(offset + 2, $ship_act_rev, value);
	}

	/**
	 * Shipping result rev. number 出荷実績改訂番号.<p>
	 *
	 */
	public void ship_act_rev(int value) {
		setConstNumber(offset + 2, $ship_act_rev, value);
	}

	/**
	 * Shipping result rev. number 出荷実績改訂番号.<p>
	 *
	 */
	public void ship_act_rev(long value) {
		setConstNumber(offset + 2, $ship_act_rev, value);
	}

	/**
	 * Shipping result rev. number 出荷実績改訂番号.<p>
	 *
	 */
	public void ship_act_rev(float value) {
		setConstNumber(offset + 2, $ship_act_rev, value);
	}

	/**
	 * Shipping result rev. number 出荷実績改訂番号.<p>
	 *
	 */
	public void ship_act_rev(double value) {
		setConstNumber(offset + 2, $ship_act_rev, value);
	}


	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public String ship_inst_no() {
		return getConstString(offset + 3, $ship_inst_no);
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		setConstString(offset + 3, $ship_inst_no, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 4, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 4, $ac_dt, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 5, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 5, $can_ac_dt, value);
	}


	/**
	 * Shipping date and time 出荷日時.<p>
	 *
	 */
	public MCDate ship_tm() {
		return getConstDate(offset + 6, $ship_tm);
	}

	/**
	 * Shipping date and time 出荷日時.<p>
	 *
	 */
	public void ship_tm(MCDate value) {
		setConstDate(offset + 6, $ship_tm, value);
	}


	/**
	 * Delivery date and time 納品日時.<p>
	 *
	 */
	public MCDate dlv_tm() {
		return getConstDate(offset + 7, $dlv_tm);
	}

	/**
	 * Delivery date and time 納品日時.<p>
	 *
	 */
	public void dlv_tm(MCDate value) {
		setConstDate(offset + 7, $dlv_tm, value);
	}


	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return getConstString(offset + 8, $rqst_dpt_cd);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		setConstString(offset + 8, $rqst_dpt_cd, value);
	}


	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_usr_cd() {
		return getConstString(offset + 9, $rqst_usr_cd);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		setConstString(offset + 9, $rqst_usr_cd, value);
	}


	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 10, $ship_fr_lg_grp_cd);
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 10, $ship_fr_lg_grp_cd, value);
	}


	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 11, $wg_cd);
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 11, $wg_cd, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 12, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 12, $ship_term_cd, value);
	}


	/**
	 * Shipping dept. cd. 出荷部門ＣＤ.<p>
	 *
	 */
	public String ship_dpt_cd() {
		return getConstString(offset + 13, $ship_dpt_cd);
	}

	/**
	 * Shipping dept. cd. 出荷部門ＣＤ.<p>
	 *
	 */
	public void ship_dpt_cd(String value) {
		setConstString(offset + 13, $ship_dpt_cd, value);
	}


	/**
	 * Shipping PIC cd. 出荷担当者ＣＤ.<p>
	 *
	 */
	public String ship_usr_cd() {
		return getConstString(offset + 14, $ship_usr_cd);
	}

	/**
	 * Shipping PIC cd. 出荷担当者ＣＤ.<p>
	 *
	 */
	public void ship_usr_cd(String value) {
		setConstString(offset + 14, $ship_usr_cd, value);
	}


	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public String ship_to_lg_grp_cd() {
		return getConstString(offset + 15, $ship_to_lg_grp_cd);
	}

	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public void ship_to_lg_grp_cd(String value) {
		setConstString(offset + 15, $ship_to_lg_grp_cd, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 16, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 16, $cst_cd, value);
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
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public String ship_to_id_nm() {
		return getConstString(offset + 19, $ship_to_id_nm);
	}

	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public void ship_to_id_nm(String value) {
		setConstString(offset + 19, $ship_to_id_nm, value);
	}


	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public String ship_to_zip_cd() {
		return getConstString(offset + 20, $ship_to_zip_cd);
	}

	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public void ship_to_zip_cd(String value) {
		setConstString(offset + 20, $ship_to_zip_cd, value);
	}


	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public String ship_to_addr1() {
		return getConstString(offset + 21, $ship_to_addr1);
	}

	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public void ship_to_addr1(String value) {
		setConstString(offset + 21, $ship_to_addr1, value);
	}


	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public String ship_to_addr2() {
		return getConstString(offset + 22, $ship_to_addr2);
	}

	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public void ship_to_addr2(String value) {
		setConstString(offset + 22, $ship_to_addr2, value);
	}


	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public String ship_to_addr3() {
		return getConstString(offset + 23, $ship_to_addr3);
	}

	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public void ship_to_addr3(String value) {
		setConstString(offset + 23, $ship_to_addr3, value);
	}


	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public String ship_to_addr4() {
		return getConstString(offset + 24, $ship_to_addr4);
	}

	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public void ship_to_addr4(String value) {
		setConstString(offset + 24, $ship_to_addr4, value);
	}


	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public String ship_to_cntct_dpt() {
		return getConstString(offset + 25, $ship_to_cntct_dpt);
	}

	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public void ship_to_cntct_dpt(String value) {
		setConstString(offset + 25, $ship_to_cntct_dpt, value);
	}


	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public String ship_to_cntct_psn() {
		return getConstString(offset + 26, $ship_to_cntct_psn);
	}

	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public void ship_to_cntct_psn(String value) {
		setConstString(offset + 26, $ship_to_cntct_psn, value);
	}


	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public String ship_to_tel() {
		return getConstString(offset + 27, $ship_to_tel);
	}

	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public void ship_to_tel(String value) {
		setConstString(offset + 27, $ship_to_tel, value);
	}


	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public String ship_to_fax() {
		return getConstString(offset + 28, $ship_to_fax);
	}

	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public void ship_to_fax(String value) {
		setConstString(offset + 28, $ship_to_fax, value);
	}


	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public boolean ship_to_sundry_flg() {
		return getConstBoolean(offset + 29, $ship_to_sundry_flg);
	}

	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public void ship_to_sundry_flg(boolean value) {
		setConstBoolean(offset + 29, $ship_to_sundry_flg, value);
	}


	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 30, $via_dlv_typ);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 30, $via_dlv_typ, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 31, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 31, $iv_no, value);
	}


	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public boolean uplnd_flg() {
		return getConstBoolean(offset + 32, $uplnd_flg);
	}

	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public void uplnd_flg(boolean value) {
		setConstBoolean(offset + 32, $uplnd_flg, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 33, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 33, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 34, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 34, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 35, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 35, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 36, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 36, $sub_char3, value);
	}


	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public boolean dlv_slip_prnt_flg() {
		return getConstBoolean(offset + 37, $dlv_slip_prnt_flg);
	}

	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public void dlv_slip_prnt_flg(boolean value) {
		setConstBoolean(offset + 37, $dlv_slip_prnt_flg, value);
	}


	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public boolean ship_adv_prnt_flg() {
		return getConstBoolean(offset + 38, $ship_adv_prnt_flg);
	}

	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public void ship_adv_prnt_flg(boolean value) {
		setConstBoolean(offset + 38, $ship_adv_prnt_flg, value);
	}


	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public boolean lot_chk_off_flg() {
		return getConstBoolean(offset + 39, $lot_chk_off_flg);
	}

	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public void lot_chk_off_flg(boolean value) {
		setConstBoolean(offset + 39, $lot_chk_off_flg, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 40, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 40, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 40, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 40, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 40, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 40, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 41, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 41, $err_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_dpt_cd.equalsIgnoreCase(name)) {
			return ship_dpt_cd();
		}
		if ($ship_usr_cd.equalsIgnoreCase(name)) {
			return ship_usr_cd();
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_to_lg_grp_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			return ship_to_zip_cd();
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			return ship_to_addr1();
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			return ship_to_addr2();
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			return ship_to_addr3();
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			return ship_to_addr4();
		}
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			return ship_to_cntct_dpt();
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			return ship_to_cntct_psn();
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			return ship_to_tel();
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			return ship_to_fax();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			return ship_act_rev();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($ship_tm.equalsIgnoreCase(name)) {
			return ship_tm();
		}
		if ($dlv_tm.equalsIgnoreCase(name)) {
			return dlv_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			return uplnd_flg();
		}
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_slip_prnt_flg();
		}
		if ($ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			return ship_adv_prnt_flg();
		}
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			return lot_chk_off_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_dpt_cd.equalsIgnoreCase(name)) {
			return ship_dpt_cd();
		}
		if ($ship_usr_cd.equalsIgnoreCase(name)) {
			return ship_usr_cd();
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_to_lg_grp_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			return ship_to_zip_cd();
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			return ship_to_addr1();
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			return ship_to_addr2();
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			return ship_to_addr3();
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			return ship_to_addr4();
		}
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			return ship_to_cntct_dpt();
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			return ship_to_cntct_psn();
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			return ship_to_tel();
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			return ship_to_fax();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			return ship_act_rev();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($ship_tm.equalsIgnoreCase(name)) {
			return ship_tm();
		}
		if ($dlv_tm.equalsIgnoreCase(name)) {
			return dlv_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			return uplnd_flg();
		}
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_slip_prnt_flg();
		}
		if ($ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			return ship_adv_prnt_flg();
		}
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			return lot_chk_off_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			rqst_usr_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_dpt_cd.equalsIgnoreCase(name)) {
			ship_dpt_cd(value);
			return;
		}
		if ($ship_usr_cd.equalsIgnoreCase(name)) {
			ship_usr_cd(value);
			return;
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_to_lg_grp_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
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
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			ship_to_zip_cd(value);
			return;
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			ship_to_addr1(value);
			return;
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			ship_to_addr2(value);
			return;
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			ship_to_addr3(value);
			return;
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			ship_to_addr4(value);
			return;
		}
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			ship_to_cntct_dpt(value);
			return;
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			ship_to_cntct_psn(value);
			return;
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			ship_to_tel(value);
			return;
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			ship_to_fax(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($ship_tm.equalsIgnoreCase(name)) {
			ship_tm(value);
			return;
		}
		if ($dlv_tm.equalsIgnoreCase(name)) {
			dlv_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
			return;
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			uplnd_flg(value);
			return;
		}
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			dlv_slip_prnt_flg(value);
			return;
		}
		if ($ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			ship_adv_prnt_flg(value);
			return;
		}
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			lot_chk_off_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			rqst_usr_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_dpt_cd.equalsIgnoreCase(name)) {
			ship_dpt_cd(value);
			return;
		}
		if ($ship_usr_cd.equalsIgnoreCase(name)) {
			ship_usr_cd(value);
			return;
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_to_lg_grp_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
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
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			ship_to_zip_cd(value);
			return;
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			ship_to_addr1(value);
			return;
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			ship_to_addr2(value);
			return;
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			ship_to_addr3(value);
			return;
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			ship_to_addr4(value);
			return;
		}
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			ship_to_cntct_dpt(value);
			return;
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			ship_to_cntct_psn(value);
			return;
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			ship_to_tel(value);
			return;
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			ship_to_fax(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($ship_tm.equalsIgnoreCase(name)) {
			ship_tm(value);
			return;
		}
		if ($dlv_tm.equalsIgnoreCase(name)) {
			dlv_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
			return;
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			uplnd_flg(value);
			return;
		}
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			dlv_slip_prnt_flg(value);
			return;
		}
		if ($ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			ship_adv_prnt_flg(value);
			return;
		}
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			lot_chk_off_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

