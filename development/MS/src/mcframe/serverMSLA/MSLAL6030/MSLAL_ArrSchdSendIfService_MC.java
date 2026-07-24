package mcframe.serverMSLA.MSLAL6030;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverPFBZ.PFBZL9050.*;
import mcframe.serverPFUD.PFUDL0030.DtlR;

import mcframe.serverMSBE.MSBEL5900.MSBEL_ArrSchdService;
import static mcframe.serverMSLA.MSLAL6030.Query.*;
import mcframe.serverMSUC.MSUCL0090.*;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Comparator;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_ArrSchdSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_ArrSchdSendIfService_MC extends MSLAL_ArrSchdSendIfService_MC_A{
	//FMCB CUSTOM START
	/**
	 * ArrSchdSendIf_Upd01オペレーション.<p>
	 *
	 * 送信対象の入荷予定をＩＦテーブルに書き込む<br>
	 */
	public class ArrSchdSendIf_Upd01 extends MSLAL_ArrSchdSendIfService_MC_A.ArrSchdSendIf_Upd01 {
		/**
		 * 送信対象情報
		 */
		protected MCList<MST_ARR_SCHD_R> _sendL;

		/**
		 * 送信ＩＦ情報
		 */
		protected MCList<MST_ARR_SCHD_SEND_IF_R> _sendIfInsL, _sendIfOldL;

		/**
		 * データＮＯを設定する単位ごとに送信対象を分割して保持するリスト
		 */
		protected ArrayList<MCList<MST_ARR_SCHD_R>> _sendArr;

		protected final String RCPT_IV_MNG_NO = "rcpt_iv_mng_no";
		protected final String PO_NO = "po_no";
		protected final String SLS_RET_SCHD_NO = "sls_ret_schd_no";
		protected final String IV_NO = "iv_no";
		protected final String DLV_SLIP_NO = "dlv_slip_no";

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			initProc();
			getSendInfo();
			if (isNull(_sendL)) {
				return;
			}
			splitSendL();
			makeDataNo();
			makeIFData();
			callESBSendCtrl();
		}

		/**
		 * 初期処理
		 */
		protected void initProc() {
			_sendL = MCList.create(MST_ARR_SCHD_R.class);
			_sendIfInsL = MCList.create(MST_ARR_SCHD_SEND_IF_R.class);
			_sendIfOldL = MCList.create(MST_ARR_SCHD_SEND_IF_R.class);

			_sendArr = new ArrayList<>();
		}

		/**
		 * 送信対象情報取得
		 */
		protected void getSendInfo() {
			MCList<MST_ARR_SCHD_R> up = MCList.create(MST_ARR_SCHD_R.class);
			up0().forEach(r -> up.add().arr_schd_no(r.arr_schd_no()));

			MCQueryApiBuilder up_bldr = MCQueryApiBuilder.create(MST_ARR_SCHD_R.create("T"));
			dbWkDelete("MSLAL6030_MSW_ARR_SCHD_D01", up_bldr.getBaseDbc());
			MCList<MST_ARR_SCHD_R> up2 = up.groupBy(MST_ARR_SCHD_R.$arr_schd_no);
			dbWkInsert("MSLAL6030_MSW_ARR_SCHD_I01", up2, up_bldr.getBaseDbc());

			_sendL.addBooleanColumn("prov_arr_flg");
			// 今回送信分
			executeQuery(_sendL, MSLAL6030_MST_ARR_SCHD_S01());

			// 売上返品予定NOを設定する
			setSlsRetSchdNo();

			// 外部システムCDを取得・設定する
			setExtSysCd();

			dbWkDelete("MSLAL6030_MSW_ARR_SCHD_D02", up_bldr.getBaseDbc());
		}

		/**
		 * 売上返品予定NOを設定する
		 */
		protected void setSlsRetSchdNo() {
			for (MST_ARR_SCHD_R r : _sendL) {
				String typ = r.getString("trd_ptn_typ");

				if (MAC_TRD_PTN_TYP.isSLS_RTN(typ)
					|| MAC_TRD_PTN_TYP.isSHIP_RTN(typ)) {

					// 売上返品予定の削除データの場合、本オペレーションが呼ばれる前に既に削除されているため取得できないので、
					// 入荷予定サービスのチェック処理でキャッシュした入荷予定から値を設定する
					if (isNull(r.getString(SLS_RET_SCHD_NO))) {
						MST_ARR_SCHD_R asR = MSBEL_ArrSchdService.getArrSchdR(r.arr_schd_no());
						if (!isNull(asR)) {
							r.setStringNE(SLS_RET_SCHD_NO, asR.getStringNE("sls_ret_schd_no"));
						}
					}
				}
			}
		}

		/**
		 * 各種NOごとにグループ化<br>
		 * 同一データNOを設定する単位に分割
		 */
		protected void splitSendL() {

			Map<String, MCList<MST_ARR_SCHD_R>> sendMap = new LinkedHashMap<>();
			sendMap.put(RCPT_IV_MNG_NO, MCList.create(MST_ARR_SCHD_R.class));
			sendMap.put(PO_NO, MCList.create(MST_ARR_SCHD_R.class));
			sendMap.put(SLS_RET_SCHD_NO, MCList.create(MST_ARR_SCHD_R.class));
			sendMap.put(IV_NO, MCList.create(MST_ARR_SCHD_R.class));
			sendMap.put(DLV_SLIP_NO, MCList.create(MST_ARR_SCHD_R.class));

			for (MST_ARR_SCHD_R r : _sendL) {
				String typ = r.getString("trd_ptn_typ");

				if (MAC_TRD_PTN_TYP.isPURC(typ)
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(typ)) {
					if (!isNull(r.rcpt_iv_mng_no())) {
						sendMap.get(RCPT_IV_MNG_NO).add(r);
					}
					else {
						sendMap.get(PO_NO).add(r);
					}
				}
				else if (MAC_TRD_PTN_TYP.isSLS_RTN(typ)
							|| MAC_TRD_PTN_TYP.isSHIP_RTN(typ)) {
					sendMap.get(SLS_RET_SCHD_NO).add(r);
				}
				else {
					if (!isNull(r.iv_no())) {
						sendMap.get(IV_NO).add(r);
					}
					else {
						sendMap.get(DLV_SLIP_NO).add(r);
					}
				}
			}

			// 各種ＮＯごとに追加
			for (Entry<String, MCList<MST_ARR_SCHD_R>> entry : sendMap.entrySet()) {
				for (MCList<MST_ARR_SCHD_R>
						l : entry.getValue().groupList(entry.getKey(), "ext_sys_cd")) {
					_sendArr.add(l);
				}
			}
		}

		/**
		* データＮＯ発番（キャッシュ）
		*/
		protected void makeDataNo() {
			// データＮＯ発番
			doSeqCache(
					MAC_NUM_SYS_TYP.ESB_DATA_NO, _sendArr.size());
			// データ行ＮＯ発番
			doSeqCache(
				MSC_NUM_SYS_TYP.ARRSCHDSENDIF, _sendL.size());
		}

		/**
		 * ＩＦデータ作成
		 */
		protected void makeIFData() {

			// 入荷予定ＮＯ順にリストを並び替える
			_sendArr.forEach(l -> l.sort(MST_ARR_SCHD_R.$arr_schd_no));
			_sendArr.sort(new Comparator<MCList<MST_ARR_SCHD_R>>() {
				public int compare(MCList<MST_ARR_SCHD_R> o1, MCList<MST_ARR_SCHD_R> o2) {
					return o1.get(0).arr_schd_no().compareTo(o2.get(0).arr_schd_no());
				}
			});

			MCIndexKey upIdx = up0().createIndex(ArrSchdSendIf_Upd01_DtlR.$arr_schd_no);

			for (MCList<MST_ARR_SCHD_R> l : _sendArr) {

				MCNumber dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());

				for (MST_ARR_SCHD_R r : l) {
					ArrSchdSendIf_Upd01_DtlR upR = up0().getFirst(upIdx, r.arr_schd_no());

					if (isNull(r.getStringNE("ext_sys_cd"))) {
						// 外部システムCDが取得できない＝SCM IF制御マスタが設定されていないとして送信しない
						continue;
					}

					// 送信データ
					MST_ARR_SCHD_SEND_IF_R ifR = _sendIfInsL.add();
					copy(ifR, r, createMap_MST_ARR_SCHD_SEND_IF_R_MST_ARR_SCHD_R());

					ifR.data_lno(getSequence(MSC_NUM_SYS_TYP.ARRSCHDSENDIF.value()));
					ifR.data_no(dataNo);
					ifR.data_crud_typ(upR.data_crud_typ());
				}
			}

			MCQueryApiBuilder sendIfInsL_bldr = MCQueryApiBuilder.create(MST_ARR_SCHD_SEND_IF_R.create("T"));
			dbInsertEx("MSLAL6030_MST_ARR_SCHD_SEND_IF_I01", _sendIfInsL, sendIfInsL_bldr);
		}
		protected Map_MST_ARR_SCHD_SEND_IF_R_MST_ARR_SCHD_R<MST_ARR_SCHD_SEND_IF_R,MST_ARR_SCHD_R> createMap_MST_ARR_SCHD_SEND_IF_R_MST_ARR_SCHD_R() {
			return new Map_MST_ARR_SCHD_SEND_IF_R_MST_ARR_SCHD_R<MST_ARR_SCHD_SEND_IF_R, MST_ARR_SCHD_R>();
		}
		public class Map_MST_ARR_SCHD_SEND_IF_R_MST_ARR_SCHD_R<D extends MST_ARR_SCHD_SEND_IF_R, S extends MST_ARR_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$arr_schd_no, MST_ARR_SCHD_R.$arr_schd_no);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$arr_schd_tm, MST_ARR_SCHD_R.$arr_schd_tm);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$arr_loc_cd, MST_ARR_SCHD_R.$arr_loc_cd);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$itm_cd, MST_ARR_SCHD_R.$itm_cd);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$itm_sub1, MST_ARR_SCHD_R.$itm_sub1);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$itm_sub2, MST_ARR_SCHD_R.$itm_sub2);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$itm_sub3, MST_ARR_SCHD_R.$itm_sub3);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$itm_nm, MST_ARR_SCHD_R.$itm_nm);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$lot_no, MST_ARR_SCHD_R.$lot_no);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$sublot_no, MST_ARR_SCHD_R.$sublot_no);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$ver_no, MST_ARR_SCHD_R.$ver_no);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$sno1, MST_ARR_SCHD_R.$sno1);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$sno2, MST_ARR_SCHD_R.$sno2);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$sno3, MST_ARR_SCHD_R.$sno3);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$sno4, MST_ARR_SCHD_R.$sno4);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$gd_cd, MST_ARR_SCHD_R.$gd_cd);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$quality_typ, MST_ARR_SCHD_R.$quality_typ);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$stk_insp_typ, MST_ARR_SCHD_R.$stk_insp_typ);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$stk_id_typ, MST_ARR_SCHD_R.$stk_id_typ);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$stk_bp_cd, MST_ARR_SCHD_R.$stk_bp_cd);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$trd_unit_qty, MST_ARR_SCHD_R.$trd_unit_qty);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$trd_unit_cd, MST_ARR_SCHD_R.$trd_unit_cd);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$base_unit_qty, MST_ARR_SCHD_R.$base_unit_qty);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$base_unit_cd, MST_ARR_SCHD_R.$base_unit_cd);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$abort_flg, MST_ARR_SCHD_R.$abort_flg);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$sppl_itm_cd, MST_ARR_SCHD_R.$sppl_itm_cd);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$sppl_itm_nm, MST_ARR_SCHD_R.$sppl_itm_nm);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$maker_cd, MST_ARR_SCHD_R.$maker_cd);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$bp_lot_no, MST_ARR_SCHD_R.$bp_lot_no);
				addColumnPathMap(MST_ARR_SCHD_SEND_IF_R.$arr_cnt_rmrks, MST_ARR_SCHD_R.$arr_cnt_rmrks);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.ext_sys_cd(src.getStringNE("ext_sys_cd"));
				dest.trd_cd(src.getStringNE("trd_cd"));
				dest.trd_nm(src.getStringNE("trd_nm"));
				dest.trd_ptn_typ(src.getStringNE("trd_ptn_typ"));
				dest.arr_lg_grp_cd(src.getStringNE("arr_lg_grp_cd"));
				dest.arr_lg_grp_nm(src.getStringNE("arr_lg_grp_nm"));
				dest.site_co_cd(src.getStringNE("site_co_cd"));
				dest.site_co_nm(src.getStringNE("site_co_nm"));
				dest.arr_loc_nm(src.getStringNE("arr_loc_nm"));
				dest.arr_str_ln_cd(src.getStringNE("arr_str_ln_cd"));
				dest.arr_str_ln_nm(src.getStringNE("arr_str_ln_nm"));
				dest.gd_nm(src.getStringNE("gd_nm"));
				dest.stk_bp_nm(src.getStringNE("stk_bp_nm"));
				dest.trd_unit_nm(src.getStringNE("trd_unit_nm"));
				dest.trd_unit_bnum(src.getNumberNE("trd_unit_bnum"));
				dest.trd_unit_wt(src.getNumberNE("trd_unit_wt"));
				dest.trd_unit_dim(src.getNumberNE("trd_unit_dim"));
				dest.wt_unit_cd(src.getStringNE("wt_unit_cd"));
				dest.wt_unit_nm(src.getStringNE("wt_unit_nm"));
				dest.dim_unit_cd(src.getStringNE("dim_unit_cd"));
				dest.dim_unit_nm(src.getStringNE("dim_unit_nm"));
				dest.base_unit_nm(src.getStringNE("base_unit_nm"));
				dest.vld_dt(src.getDateNE("vld_dt"));
				dest.lmt_dt(src.getDateNE("lmt_dt"));
				dest.sppl_cd(src.getStringNE("sppl_cd"));
				dest.sppl_nm(src.getStringNE("sppl_nm"));
				dest.cst_cd(src.getStringNE("cst_cd"));
				dest.cst_nm(src.getStringNE("cst_nm"));
				dest.ship_lg_grp_cd(src.getStringNE("ship_lg_grp_cd"));
				dest.ship_lg_grp_nm(src.getStringNE("ship_lg_grp_nm"));
				dest.maker_nm(src.getStringNE("maker_nm"));
				dest.rsn_cd(src.getStringNE("rsn_cd"));
				dest.rsn_nm(src.getStringNE("rsn_nm"));
				dest.prov_arr_flg(src.getBooleanNE("prov_arr_flg"));
				dest.co_nm(getCo().co_nm());

				if (!src.getBoolean(MAM_EXT_SYS_R.$null_val_if_flg)) {
					dest.arr_str_ln_cd(nullValToNull(dest.arr_str_ln_cd()));
					dest.itm_sub1(nullValToNull(dest.itm_sub1()));
					dest.itm_sub2(nullValToNull(dest.itm_sub2()));
					dest.itm_sub3(nullValToNull(dest.itm_sub3()));
					dest.lot_no(nullValToNull(dest.lot_no()));
					dest.sublot_no(nullValToNull(dest.sublot_no()));
					dest.sno1(nullValToNull(dest.sno1()));
					dest.sno2(nullValToNull(dest.sno2()));
					dest.sno3(nullValToNull(dest.sno3()));
					dest.sno4(nullValToNull(dest.sno4()));
					dest.stk_bp_cd(nullValToNull(dest.stk_bp_cd()));
					dest.maker_cd(nullValToNull(dest.maker_cd()));
				}

				if (MAC_TRD_PTN_TYP.isPURC(dest.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(dest.trd_ptn_typ())) {
					dest.rcpt_iv_no(src.rcpt_iv_no());
					dest.rcpt_iv_mng_no(src.rcpt_iv_mng_no());
					dest.rcpt_iv_d_no(src.getStringNE("rcpt_iv_d_no"));
					dest.prms_rcpt_no(src.getStringNE("prms_rcpt_no"));
					dest.prms_rcpt_d_no(src.prms_rcpt_d_no());
					dest.dlv_inst_no(src.getStringNE("dlv_inst_no"));
					dest.dlv_inst_d_no(src.dlv_inst_d_no());
					dest.po_no(src.getStringNE("po_no"));
					dest.po_d_no(src.getStringNE("po_d_no"));
					dest.purc_act_no(src.getStringNE("purc_act_no"));
					dest.purc_act_d_no(src.getStringNE("purc_act_d_no"));
					dest.purc_act_io_no(src.getStringNE("purc_act_io_no"));
					dest.dlv_slip_no(src.dlv_slip_no());
					dest.dlv_slip_seq(src.getNumberNE("dlv_slip_seq"));
					dest.dlv_slip_d_no(src.getStringNE("dlv_slip_d_no"));
					dest.dlv_slip_d_seq(src.getNumberNE("dlv_slip_d_seq"));
					dest.dlv_inst_print_d_rmrks(src.getStringNE("dlv_inst_print_d_rmrks"));
					dest.prms_rmrks(src.getStringNE("prms_rmrks"));
				}
				else if (MAC_TRD_PTN_TYP.isSLS_RTN(dest.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isSHIP_RTN(dest.trd_ptn_typ())) {
					dest.sls_ret_schd_no(src.getStringNE("sls_ret_schd_no"));
					dest.sls_ret_schd_d_no(src.getStringNE("sls_ret_schd_d_no"));
				}
				else {
					if (!isNull(src.iv_no())) {
						dest.iv_no(src.iv_no());
						dest.iv_d_no(src.getStringNE("iv_d_no"));
					}
					else {
						dest.dlv_slip_no(src.dlv_slip_no());
						dest.dlv_slip_d_no(src.getStringNE("dlv_slip_d_no"));
					}
				}

				if (!isNull(dest.trd_unit_wt())) {
					dest.trd_unit_wt().setScale(
						MST_ARR_SCHD_SEND_IF_R.trd_unit_wt_META.scale(), MCNumber.MODE_DOWN);
				}
				if (!isNull(dest.trd_unit_dim())) {
					dest.trd_unit_dim().setScale(
						MST_ARR_SCHD_SEND_IF_R.trd_unit_dim_META.scale(), MCNumber.MODE_DOWN);
				}
			}
		}

		/**
		 * 外部システムCDを取得・設定する
		 */
		protected void setExtSysCd() {

			_sendL.addStringColumn(MAM_EXT_SYS_R.$ext_sys_cd);
			_sendL.addBooleanColumn(MAM_EXT_SYS_R.$null_val_if_flg);
			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();

			Map<MCNumber, MST_ARR_SCHD_R> map = new HashMap<>();
			MCNumber peg = MCNumber.ZERO;
			for (MST_ARR_SCHD_R asR : _sendL) {

				SCMLinkUtil_Srch01_CndR r = o.up0().add();
				r.peg_no(peg);
				r.if_proc_typ(MAC_IF_PROC_TYP.WMS_ARR_SCHD_SEND.value());
				r.loc_cd(asR.arr_loc_cd());
				r.master_dt(getToday());

				map.put(peg, asR);
				peg = peg.add(1);
			}
			if (!o.up0().isEmpty()) {
				o.exec();

				for (SCMLinkUtil_Srch01_CndR r : o.down0()) {
					if (map.containsKey(r.peg_no())) {
						MST_ARR_SCHD_R asR = map.get(r.peg_no());
						asR.setString(MAM_EXT_SYS_R.$ext_sys_cd, r.ext_sys_cd());
						asR.setBoolean(MAM_EXT_SYS_R.$null_val_if_flg, r.null_val_if_flg());
					}
				}
			}
		}

		/**
		 * 送信制御処理呼び出し 
		 */
		protected void callESBSendCtrl() {
			PFBZL_SendRecvIfCtrl.Ins01 o = PFBZL_SendRecvIfCtrl.crtIns01();
			addAll(
				o.up0(),
				_sendIfInsL.groupBy(
					MST_ARR_SCHD_SEND_IF_R.$data_no,
					MST_ARR_SCHD_SEND_IF_R.$ext_sys_cd),
				createMap_Map_DtlR_MST_ARR_SCHD_SEND_IF_R()
			);
			o.exec();
		}
		protected Map_DtlR_MST_ARR_SCHD_SEND_IF_R<DtlR,MST_ARR_SCHD_SEND_IF_R> createMap_Map_DtlR_MST_ARR_SCHD_SEND_IF_R() {
			return new Map_DtlR_MST_ARR_SCHD_SEND_IF_R<DtlR, MST_ARR_SCHD_SEND_IF_R>();
		}
		public class Map_DtlR_MST_ARR_SCHD_SEND_IF_R<D extends DtlR, S extends MST_ARR_SCHD_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.data_no(src.data_no());
				dest.if_proc_typ(MAC_IF_PROC_TYP.WMS_ARR_SCHD_SEND.value());
				dest.ext_sys_cd(src.ext_sys_cd());
			}
		}
	}

	//FMCB CUSTOM END
}