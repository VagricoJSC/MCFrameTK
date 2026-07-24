package mcframe.serverMSLA.MSLAL6210;

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
import static mcframe.serverMSLA.MSLAL6210.Query.*;
import mcframe.serverPFBZ.PFBZL9050.*;
import mcframe.serverPFUD.PFUDL0030.DtlR;
import mcframe.serverPF.dbc.*;
import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;
import mcframe.serverMSUC.MSUCL0090.*;
import java.util.HashMap;
import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_MfgInstSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_MfgInstSendIfService_MC extends MSLAL_MfgInstSendIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * MfgInstSendIf_Upd01オペレーション.<p>
	 *
	 * 送信対象の製造指図（工程指図・出来高予定・投入予定）をＩＦテーブルに書き込む<br>
	 */
	public class MfgInstSendIf_Upd01 extends MSLAL_MfgInstSendIfService_MC_A.MfgInstSendIf_Upd01 {
		/**
		 * 送信対象情報
		 */
		protected MCList<MST_OPER_INST_SEND_IF_R> _operInstL;
		protected MCIndexKey _operInstIdx;
		protected MCList<MST_INPT_SCHD_SEND_IF_R> _inptSchdL;
		protected MCList<MST_YIELD_SCHD_SND_IF_R> _yieldSchdL;
		protected MCList<MST_WK_SCHD_SEND_IF_R> _wkSchdL;
		
		/**
		 * 送信ＩＦ情報
		 */
		protected MCList<MST_OPER_INST_SEND_IF_R> _operInstIfInsL;
		protected MCList<MST_INPT_SCHD_SEND_IF_R> _inptSchdIfInsL;
		protected MCList<MST_YIELD_SCHD_SND_IF_R> _yieldSchdIfInsL;
		protected MCList<MST_WK_SCHD_SEND_IF_R> _wkSchdIfInsL;
		
		protected MCIndexKey _up1Idx;
		protected MCIndexKey _up2Idx;
		protected MCIndexKey _up3Idx;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			initProc();
			getSendInfo();
			if (isNull(_operInstL) && isNull(_inptSchdL) && isNull(_yieldSchdL) && isNull(_wkSchdL)) {
				return;
			}
			initExtSysCache(_operInstL);
			makeDataNo();
			makeIFData();
			callESBSendCtrl();
		}
		
		/**
		 * 初期処理
		 */
		protected void initProc() {
			crtOperInstL();
			crtInptSchdL();
			crtYieldSchdL();
			crtWkSchdL();
		}
		
		/**
		 * 初期処理（工程指図）
		 */
		protected void crtOperInstL() {
			_operInstL = MCList.create(MST_OPER_INST_SEND_IF_R.class);
			_operInstL.addBooleanColumn("mfg_inst_can_flg");
			_operInstL.addBooleanColumn("can_flg");
			_operInstL.addNumberColumn("base_unit_dec_place");

			_operInstIfInsL = MCList.create(MST_OPER_INST_SEND_IF_R.class);
			_operInstIfInsL.addBooleanColumn("not_send_flg");
			_operInstIfInsL.addBooleanColumn("not_send_upd_flg");
			_operInstIfInsL.addStringColumn("if_proc_typ");
		}

		/**
		 * 初期処理（投入予定）
		 */
		protected void crtInptSchdL() {
			_inptSchdL = MCList.create(MST_INPT_SCHD_SEND_IF_R.class);
			_inptSchdL.addBooleanColumn("can_flg");

			_inptSchdIfInsL = MCList.create(MST_INPT_SCHD_SEND_IF_R.class);
			_inptSchdIfInsL.addBooleanColumn("not_send_flg");
			_inptSchdIfInsL.addBooleanColumn("not_send_upd_flg");
			_inptSchdIfInsL.addStringColumn("if_proc_typ");
		}

		/**
		 * 初期処理（出来高予定）
		 */
		protected void crtYieldSchdL() {
			_yieldSchdL = MCList.create(MST_YIELD_SCHD_SND_IF_R.class);
			_yieldSchdL.addBooleanColumn("can_flg");

			_yieldSchdIfInsL = MCList.create(MST_YIELD_SCHD_SND_IF_R.class);
			_yieldSchdIfInsL.addBooleanColumn("not_send_flg");
			_yieldSchdIfInsL.addBooleanColumn("not_send_upd_flg");
			_yieldSchdIfInsL.addStringColumn("if_proc_typ");
		}

		/**
		 * 初期処理（工数予定）
		 */
		protected void crtWkSchdL() {
			_wkSchdL = MCList.create(MST_WK_SCHD_SEND_IF_R.class);
			_wkSchdL.addBooleanColumn("can_flg");

			_wkSchdIfInsL = MCList.create(MST_WK_SCHD_SEND_IF_R.class);
			_wkSchdIfInsL.addBooleanColumn("not_send_flg");
			_wkSchdIfInsL.addBooleanColumn("not_send_upd_flg");
			_wkSchdIfInsL.addStringColumn("if_proc_typ");
		}

		/**
		 * 送信対象情報取得
		 */
		protected void getSendInfo() {
			MCList<MST_OPER_INST_R> up = MCList.create(MST_OPER_INST_R.class);
			up0().forEach(r -> up.add().oper_inst_no(r.oper_inst_no()));
			MCQueryApiBuilder up_bldr = MCQueryApiBuilder.create(MST_OPER_INST_R.create("T"));
			dbWkDelete("MSLAL6210_MSW_OPER_INST_D01", up_bldr.getBaseDbc());
			MCList<MST_OPER_INST_R> up2 = up.groupBy(MfgInstSendIf_Upd01_DtlOperR.$oper_inst_no);
			dbWkInsert("MSLAL6210_MSW_OPER_INST_I01", up2, up_bldr.getBaseDbc());


			getOperInstSendInfo();
			getInptSchdSendInfo();
			getYieldSchdSendInfo();
			getWkSchdSendInfo();
			dbWkDelete("MSLAL6210_MSW_OPER_INST_D02", up_bldr.getBaseDbc());
		}
		
		/**
		 * 工程指図の送信情報取得
		 */
		protected void getOperInstSendInfo() {
			executeQuery(_operInstL, MSLAL6210_MST_OPER_INST_S01());
			_operInstL.forEach(r -> calcOperNum(r));
		}
		
		/**
		 * 投入予定の送信情報取得
		 */
		protected void getInptSchdSendInfo() {
			executeQuery(_inptSchdL, MSLAL6210_MST_INPT_SCHD_S01());
		}
		
		/**
		 * 出来高予定の送信情報取得
		 */
		protected void getYieldSchdSendInfo() {
			executeQuery(_yieldSchdL, MSLAL6210_MST_YIELD_SCHD_S01());
		}
		
		/**
		 * 工数予定の送信情報取得
		 */
		protected void getWkSchdSendInfo() {
			executeQuery(_wkSchdL, MSLAL6210_MST_WK_SCHD_S01());
		}

		/**
		* データＮＯ発番（キャッシュ）
		*/
		protected void makeDataNo() {
			// データＮＯ発番
			doSeqCache(
				MAC_NUM_SYS_TYP.ESB_DATA_NO, 
				_operInstL.size() + _inptSchdL.groupBy("oper_inst_no").size() 
				+ _yieldSchdL.groupBy("oper_inst_no").size() + _wkSchdL.groupBy("oper_inst_no").size()
			);
			// データ行ＮＯ発番
			doSeqCache(MSC_NUM_SYS_TYP.OPERINSTSENDIF, _operInstL.size());
			doSeqCache(MSC_NUM_SYS_TYP.INPTSCHDSENDIF, _inptSchdL.size());
			doSeqCache(MSC_NUM_SYS_TYP.YIELDSCHDSENDIF, _yieldSchdL.size());
			doSeqCache(MSC_NUM_SYS_TYP.WKSCHDSENDIF, _wkSchdL.size());
		}
		
		/**
		 * ＩＦデータ作成
		 */
		protected void makeIFData() {
			_operInstIdx = _operInstL.createIndex(MST_OPER_INST_SEND_IF_R.$oper_inst_no);
			MCIndexKey inptSchdIdx = _inptSchdL.createIndex(MST_INPT_SCHD_R.$oper_inst_no);
			MCIndexKey yieldSchdIdx = _yieldSchdL.createIndex(MST_YIELD_SCHD_R.$oper_inst_no);
			MCIndexKey wkSchdIdx = _wkSchdL.createIndex(MST_WK_SCHD_R.$oper_inst_no);

			_up1Idx = up1().createIndex(MfgInstSendIf_Upd01_DtlInptR.$inpt_schd_no);
			_up2Idx = up2().createIndex(MfgInstSendIf_Upd01_DtlYieldR.$yield_schd_no);
			_up3Idx = up3().createIndex(MfgInstSendIf_Upd01_DtlWkR.$wk_schd_no);

			up0().sort(MfgInstSendIf_Upd01_DtlOperR.$oper_inst_no);
			up0().forEach(up0R -> {
				MST_OPER_INST_SEND_IF_R operInstR = _operInstL.getFirst(_operInstIdx, up0R.oper_inst_no());
				MCList<MST_INPT_SCHD_SEND_IF_R> subInptSchdL = _inptSchdL.subList(inptSchdIdx, up0R.oper_inst_no());
				MCList<MST_YIELD_SCHD_SND_IF_R> subYieldSchdL = _yieldSchdL.subList(yieldSchdIdx, up0R.oper_inst_no());
				MCList<MST_WK_SCHD_SEND_IF_R> subWkSchdL = _wkSchdL.subList(wkSchdIdx, up0R.oper_inst_no());
				
				// 送信データ
				makeOperInstIFData(operInstR, up0R);
				makeInptSchdIFData(subInptSchdL, operInstR, up0R);
				makeYieldSchdIFData(subYieldSchdL, operInstR, up0R);
				makeWkSchdIFData(subWkSchdL, operInstR, up0R);
			});
			MCQueryApiBuilder operInstIfInsL_bldr = MCQueryApiBuilder.create(MST_OPER_INST_SEND_IF_R.create("T"));
			dbInsertEx("MSLAL6210_MST_OPER_INST_SEND_IF_I01", _operInstIfInsL, operInstIfInsL_bldr);
			MCQueryApiBuilder inptSchdIfInsL_bldr = MCQueryApiBuilder.create(MST_INPT_SCHD_SEND_IF_R.create("T"));
			dbInsertEx("MSLAL6210_MST_INPT_SCHD_SEND_IF_I01", _inptSchdIfInsL, inptSchdIfInsL_bldr);
			MCQueryApiBuilder yieldSchdIfInsL_bldr = MCQueryApiBuilder.create(MST_YIELD_SCHD_SND_IF_R.create("T"));
			dbInsertEx("MSLAL6210_MST_YIELD_SCHD_SND_IF_I01", _yieldSchdIfInsL, yieldSchdIfInsL_bldr);
			MCQueryApiBuilder wkSchdIfInsL_bldr = MCQueryApiBuilder.create(MST_WK_SCHD_SEND_IF_R.create("T"));
			dbInsertEx("MSLAL6210_MST_WK_SCHD_SEND_IF_I01", _wkSchdIfInsL, wkSchdIfInsL_bldr);
		}
		
		/**
		 * 工程指図送信ＩＦデータ作成
		 */
		protected void makeOperInstIFData(MST_OPER_INST_SEND_IF_R operInstR, MfgInstSendIf_Upd01_DtlOperR up0R) {
			if (isNull((operInstR))) return;
			
			// 製造指図取消かつデータ更新区分=削除以外の場合は送信対象外
			if (operInstR.getBooleanNE("mfg_inst_can_flg") && !MAC_DATA_CRUD_TYP.isDEL(up0R.data_crud_typ())) {
				return;
			}
			
			//SCMIF制御マスタから「外部システムCD」と「送信後変更不可FLG」を取得する。
			//外部システムCDを取得できない場合は送信対象外
			operInstR.setStringNE("if_proc_typ", MAC_IF_PROC_TYP.MES_OPER_INST_SEND.value());
			SCMLinkUtil_Srch01_CndR extSysR = _extSysCache.get(operInstR);
			if (isNull(extSysR) || isNull(extSysR.ext_sys_cd())) {
				return;
			} else {
				operInstR.ext_sys_cd(extSysR.ext_sys_cd());
				operInstR.setBooleanNE("not_send_upd_flg", extSysR.not_send_upd_flg());
			}
			
			if (!extSysR.null_val_if_flg()) {
				convOperNullVal(operInstR);
			}
			
			operInstR.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
			operInstR.co_nm(getCo().co_nm());
			operInstR.data_lno(getSequence(MSC_NUM_SYS_TYP.OPERINSTSENDIF.value()));
			operInstR.data_no(getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value()));
			operInstR.data_crud_typ(up0R.data_crud_typ());
			
			//送信後訂正不可=オン、かつデータ更新区分=削除の場合は、送信対象外フラグをオンにする。
			if(extSysR.not_send_upd_flg() && MAC_DATA_CRUD_TYP.isDEL(operInstR.data_crud_typ())) {
				operInstR.setBooleanNE("not_send_flg", true);
			}
			
			_operInstIfInsL.add(operInstR);
		}
		
		protected void convOperNullVal(MST_OPER_INST_SEND_IF_R r) {
			r.mfg_itm_sub1(nullValToNull(r.mfg_itm_sub1()));
			r.mfg_itm_sub2(nullValToNull(r.mfg_itm_sub2()));
			r.mfg_itm_sub3(nullValToNull(r.mfg_itm_sub3()));
			r.oper_cd(nullValToNull(r.oper_cd()));
			r.oper_str_ln_cd(nullValToNull(r.oper_str_ln_cd()));
			r.oper_ptn(nullValToNull(r.oper_ptn()));
			r.lot_no(nullValToNull(r.lot_no()));
			r.sublot_no(nullValToNull(r.sublot_no()));
			r.sno1(nullValToNull(r.sno1()));
			r.sno2(nullValToNull(r.sno2()));
			r.sno3(nullValToNull(r.sno3()));
			r.sno4(nullValToNull(r.sno4()));
			r.strg_str_ln_cd(nullValToNull(r.strg_str_ln_cd()));
			r.mfg_str_ln_cd(nullValToNull(r.mfg_str_ln_cd()));
		}
		
		/**
		 * 投入予定送信ＩＦデータ作成
		 */
		protected void makeInptSchdIFData(MCList<MST_INPT_SCHD_SEND_IF_R> subInptSchdL, MST_OPER_INST_SEND_IF_R operInstR, MfgInstSendIf_Upd01_DtlOperR up0R) {
			if (subInptSchdL.isEmpty()) return;
			subInptSchdL.sort(MST_INPT_SCHD_R.$disp_seq);
			
			//SCMIF制御マスタから「外部システムCD」と「送信後変更不可FLG」を取得する。
			//外部システムCDを取得できない場合は送信対象外
			subInptSchdL.setStringNE("if_proc_typ", MAC_IF_PROC_TYP.MES_INPT_SCHD_SEND.value());
			SCMLinkUtil_Srch01_CndR extSysR = _extSysCache.get(subInptSchdL.get(0));
			if (isNull(extSysR) || isNull(extSysR.ext_sys_cd())) {
				return;
			}
			
			MCNumber dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
			for (MST_INPT_SCHD_SEND_IF_R r : subInptSchdL) {
				MfgInstSendIf_Upd01_DtlInptR up1R = up1().getFirst(_up1Idx, r.inpt_schd_no());
				if (isNoSendTarget(r, up1R, operInstR, up0R)) {
					continue;
				}
				
				r.ext_sys_cd(extSysR.ext_sys_cd());
				r.setBooleanNE("not_send_upd_flg", extSysR.not_send_upd_flg());
				if (!extSysR.null_val_if_flg()) {
					convInptNullVal(r);
				}
				
				r.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());				
				r.co_nm(getCo().co_nm());
				r.data_lno(getSequence(MSC_NUM_SYS_TYP.INPTSCHDSENDIF.value()));
				r.data_no(dataNo);
				r.data_crud_typ(getIFDataCrudTyp(up1R, up0R));
				_inptSchdIfInsL.add(r);
			}
			
			//送信後訂正不可=オン、かつ全行がデータ更新区分=削除の場合は、送信対象外フラグをオンにする。
			if(extSysR.not_send_upd_flg() &&
					subInptSchdL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())).isEmpty()) {
				subInptSchdL.setBooleanNE("not_send_flg", true);
			}
		}
		
		protected void convInptNullVal(MST_INPT_SCHD_SEND_IF_R r) {
			r.mfg_itm_sub1(nullValToNull(r.mfg_itm_sub1()));
			r.mfg_itm_sub2(nullValToNull(r.mfg_itm_sub2()));
			r.mfg_itm_sub3(nullValToNull(r.mfg_itm_sub3()));
			r.oper_cd(nullValToNull(r.oper_cd()));
			r.itm_sub1(nullValToNull(r.itm_sub1()));
			r.itm_sub2(nullValToNull(r.itm_sub2()));
			r.itm_sub3(nullValToNull(r.itm_sub3()));
			r.inpt_str_ln_cd(nullValToNull(r.inpt_str_ln_cd()));
			r.lot_no(nullValToNull(r.lot_no()));
			r.sublot_no(nullValToNull(r.sublot_no()));
			r.sno1(nullValToNull(r.sno1()));
			r.sno2(nullValToNull(r.sno2()));
			r.sno3(nullValToNull(r.sno3()));
			r.sno4(nullValToNull(r.sno4()));
			r.alloc_sno1(nullValToNull(r.alloc_sno1()));
			r.alloc_sno2(nullValToNull(r.alloc_sno2()));
			r.alloc_sno3(nullValToNull(r.alloc_sno3()));
			r.alloc_sno4(nullValToNull(r.alloc_sno4()));
		}
		
		/**
		 * 出来高予定送信ＩＦデータ作成
		 */
		protected void makeYieldSchdIFData(MCList<MST_YIELD_SCHD_SND_IF_R> subYieldSchdL, MST_OPER_INST_SEND_IF_R operInstR, MfgInstSendIf_Upd01_DtlOperR up0R) {
			if (subYieldSchdL.isEmpty()) return;
			subYieldSchdL.sort(MST_YIELD_SCHD_R.$yield_typ, MST_YIELD_SCHD_R.$disp_seq);
			
			//SCMIF制御マスタから「外部システムCD」と「送信後変更不可FLG」を取得する。
			//外部システムCDを取得できない場合は送信対象外
			subYieldSchdL.setStringNE("if_proc_typ", MAC_IF_PROC_TYP.MES_YIELD_SCHD_SEND.value());
			SCMLinkUtil_Srch01_CndR extSysR = _extSysCache.get(subYieldSchdL.get(0));
			if (isNull(extSysR) || isNull(extSysR.ext_sys_cd())) {
				return;
			}
			
			MCNumber dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
			for (MST_YIELD_SCHD_SND_IF_R r : subYieldSchdL) {
				MfgInstSendIf_Upd01_DtlYieldR up2R = up2().getFirst(_up2Idx, r.yield_schd_no());
				if (isNoSendTarget(r, up2R, operInstR, up0R)) {
					continue;
				}
				
				r.ext_sys_cd(extSysR.ext_sys_cd());
				r.setBooleanNE("not_send_upd_flg", extSysR.not_send_upd_flg());
				if (!extSysR.null_val_if_flg()) {
					convYieldNullVal(r);
				}
				
				r.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());				
				r.co_nm(getCo().co_nm());
				r.data_lno(getSequence(MSC_NUM_SYS_TYP.YIELDSCHDSENDIF.value()));
				r.data_no(dataNo);
				r.data_crud_typ(getIFDataCrudTyp(up2R, up0R));
				_yieldSchdIfInsL.add(r);
			}
			
			//送信後訂正不可=オン、かつ全行がデータ更新区分=削除の場合は、送信対象外フラグをオンにする。
			if(extSysR.not_send_upd_flg() &&
					subYieldSchdL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())).isEmpty()) {
				subYieldSchdL.setBooleanNE("not_send_flg", true);
			}
		}
		
		protected void convYieldNullVal(MST_YIELD_SCHD_SND_IF_R r) {
			r.mfg_itm_sub1(nullValToNull(r.mfg_itm_sub1()));
			r.mfg_itm_sub2(nullValToNull(r.mfg_itm_sub2()));
			r.mfg_itm_sub3(nullValToNull(r.mfg_itm_sub3()));
			r.oper_cd(nullValToNull(r.oper_cd()));
			r.itm_sub1(nullValToNull(r.itm_sub1()));
			r.itm_sub2(nullValToNull(r.itm_sub2()));
			r.itm_sub3(nullValToNull(r.itm_sub3()));
			r.lot_no(nullValToNull(r.lot_no()));
			r.sublot_no(nullValToNull(r.sublot_no()));
			r.sno1(nullValToNull(r.sno1()));
			r.sno2(nullValToNull(r.sno2()));
			r.sno3(nullValToNull(r.sno3()));
			r.sno4(nullValToNull(r.sno4()));
			r.strg_str_ln_cd(nullValToNull(r.strg_str_ln_cd()));
		}
		
		/**
		 * 工数予定送信ＩＦデータ作成
		 */
		protected void makeWkSchdIFData(MCList<MST_WK_SCHD_SEND_IF_R> subWkSchdL, MST_OPER_INST_SEND_IF_R operInstR, MfgInstSendIf_Upd01_DtlOperR up0R) {
			if (subWkSchdL.isEmpty()) return;
			subWkSchdL.sort(MST_WK_SCHD_R.$disp_seq);
			subWkSchdL.setStringNE("if_proc_typ", MAC_IF_PROC_TYP.MES_WK_SCHD_SEND.value());
			
			MCNumber dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
			boolean firstExtSys = true;
			String extSysCd = null;
			for (MST_WK_SCHD_SEND_IF_R r : subWkSchdL) {
				MfgInstSendIf_Upd01_DtlWkR up3R = up3().getFirst(_up3Idx, r.wk_schd_no());
				if (isNoSendTarget(r, up3R, operInstR, up0R)) {
					continue;
				}
				
				// 同一工程のなかでも送信対象/対象外が異なる可能性があるのでループのなかで1行1行判定する
				SCMLinkUtil_Srch01_CndR extSysR = _extSysCache.get(r);
				if (isNull(extSysR) || isNull(extSysR.ext_sys_cd())) {
					continue;
				}
				
				// SIGNALCHAIN連携の都合で同一工程に紐づく複数工数予定においては、採用される外部システムCDは1つに統一
				if (firstExtSys) {
					extSysCd = extSysR.ext_sys_cd();
					firstExtSys = false;
				}
				
				r.ext_sys_cd(extSysCd);
				r.setBooleanNE("not_send_upd_flg", extSysR.not_send_upd_flg());
				if (!extSysR.null_val_if_flg()) {
					convWkNullVal(r);
				}
				
				r.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				r.co_nm(getCo().co_nm());
				r.data_lno(getSequence(MSC_NUM_SYS_TYP.WKSCHDSENDIF.value()));
				r.data_no(dataNo);
				r.data_crud_typ(getIFDataCrudTyp(up3R, up0R));
				_wkSchdIfInsL.add(r);
				
				//送信後訂正不可=オン、かつ全行がデータ更新区分=削除の場合は、送信対象外フラグをオンにする。
				if(extSysR.not_send_upd_flg() &&
						subWkSchdL.subList(d -> !MAC_DATA_CRUD_TYP.isDEL(d.data_crud_typ())).isEmpty()) {
					subWkSchdL.setBooleanNE("not_send_flg", true);
				}
			}
		}
		
		protected void convWkNullVal(MST_WK_SCHD_SEND_IF_R r) {
			r.mfg_itm_sub1(nullValToNull(r.mfg_itm_sub1()));
			r.mfg_itm_sub2(nullValToNull(r.mfg_itm_sub2()));
			r.mfg_itm_sub3(nullValToNull(r.mfg_itm_sub3()));
			r.oper_cd(nullValToNull(r.oper_cd()));
		}

		/**
		 * 送信対象外か判定する
		 */
		protected <R1 extends MCRow, R2 extends MCRow> boolean isNoSendTarget(
				R1 ifR, R2 upR, MST_OPER_INST_SEND_IF_R operInstR, MfgInstSendIf_Upd01_DtlOperR up0R) {
			// 承認対象の場合、取消行は対象外
			if (operInstR.aprv_flg()) {
				return ifR.getBooleanNE("can_flg");
			}
			
			// 上り電文に存在しない場合は対象外
			if (isNull(upR)) {
				return true;
			}
			
			// 取消行のデータ更新区分が削除ではない場合は対象外
			if (ifR.getBooleanNE("can_flg") && !MAC_DATA_CRUD_TYP.isDEL(upR.getStringNE("data_crud_typ"))) {
				return true;
			}
			
			return false;
		}
		
		/**
		 * データ更新区分を取得する
		 */
		protected <R extends MCRow> String getIFDataCrudTyp(
				R upR, MfgInstSendIf_Upd01_DtlOperR up0R) {
			if (MAC_DATA_CRUD_TYP.isUPD(up0R.data_crud_typ())) {
				return upR.getStringNE("data_crud_typ");
			} else {
				return up0R.data_crud_typ();
			}
		}
		
		/**
		 * 送信制御処理呼び出し 
		 */
		protected void callESBSendCtrl() {
			//送信ＩＦデータの追加オペレーション
			PFBZL_SendRecvIfCtrl.Ins01 ins01 = PFBZL_SendRecvIfCtrl.crtIns01();
			
			MCList<MST_INPT_SCHD_SEND_IF_R> _inptSchdDataL = _inptSchdIfInsL.distinctNE("data_no");
			MCList<MST_YIELD_SCHD_SND_IF_R> _yieldSchdDataL = _yieldSchdIfInsL.distinctNE("data_no");
			MCList<MST_WK_SCHD_SEND_IF_R> _wkSchdDataL = _wkSchdIfInsL.distinctNE("data_no");
			
			addAll(ins01.up0(), 
				_operInstIfInsL,
				createMap_DtlR_MST_OPER_INST_SEND_IF_R()
			);

			addAll(ins01.up0(), 
				_inptSchdDataL,
				createMap_DtlR_MST_INPT_SCHD_SEND_IF_R()
			);

			addAll(ins01.up0(), 
				_yieldSchdDataL,
				createMap_DtlR_MST_YIELD_SCHD_SND_IF_R()
			);

			addAll(ins01.up0(), 
				_wkSchdDataL,
				createMap_DtlR_MST_WK_SCHD_SEND_IF_R()
			);

			//送信ＩＦデータの更新オペレーション
			//送信対象外フラグをオンに更新する。
			PFBZL_SendRecvIfCtrl.Upd01 upd01 = PFBZL_SendRecvIfCtrl.crtUpd01();
			upd01.up0().addAll(getNotSendList(_operInstIfInsL));
			upd01.up0().addAll(getNotSendList(_inptSchdDataL));
			upd01.up0().addAll(getNotSendList(_yieldSchdDataL));
			upd01.up0().addAll(getNotSendList(_wkSchdDataL));
			upd01.up0().addAll(getNotSendOldList(ins01.up0()));
			
			ins01.exec();
			upd01.exec();
		}
		
		/**
		 * 送信対象外データ取得処理
		 */
		protected <R extends MCRow> MCList<Upd01_DtlR> getNotSendList(MCList<R> sendL) {
			MCList<Upd01_DtlR> notSendL = MCList.create(Upd01_DtlR.class);
			if(sendL.isEmpty()) return notSendL;
			
			sendL.forEach(r -> {
				if(r.getBooleanNE("not_send_flg")) {
					Upd01_DtlR notSendR = notSendL.add();
					notSendR.data_no(r.getNumberNE("data_no"));
					notSendR.not_send_flg(true);
					notSendR.not_send_upd_flg(r.getBooleanNE("not_send_upd_flg"));
				}
			});
			return notSendL;
		}
		
		/**
		 * 送信対象外の過去データ取得処理
		 */
		protected MCList<Upd01_DtlR> getNotSendOldList(MCList<DtlR> sendL) {

			MCList<Upd01_DtlR> notSendL = MCList.create(Upd01_DtlR.class);
			if (sendL.isEmpty()) return notSendL;

			MCList<PFT_SDRV_IF_R> sdrvIfL = MCList.create(PFT_SDRV_IF_R.class);
			PFT_SDRV_IF_R t = PFT_SDRV_IF_R.create("T");
			MCQueryApiBuilder sdrvIfL_bldr = MCQueryApiBuilder.create(t);
			sdrvIfL_bldr.setSelect(t.data_no, t.not_send_upd_flg);
			sdrvIfL_bldr.addWhereWithAnd(t.if_proc_typ.eq(bind("if_proc_typ")));
			sdrvIfL_bldr.addWhereWithAnd(t.attr_char2.eq(bind("attr_char2")));
			sdrvIfL_bldr.addWhereWithAnd(t.not_send_flg.eq(value(false)));
			sdrvIfL_bldr.addWhereWithAnd(t.sdrv_sts_typ.neq(value(MAC_SDRV_STS_TYP.SEND_OK.value())));
			dbSelectForUpdate("MSLAL6210_PFT_SDRV_IF_S01", sdrvIfL, sdrvIfL_bldr,
					sendL.subList(r -> r.not_send_upd_flg()));

			if(sdrvIfL.isEmpty()) return notSendL;
			sdrvIfL.forEach(r -> {
				Upd01_DtlR notSendR = notSendL.add();
				notSendR.data_no(r.data_no());
				notSendR.not_send_flg(true);
				notSendR.not_send_upd_flg(r.not_send_upd_flg());
			});

			return notSendL;
		}
		
		/**
		 * 工程指図ＮＯと関連する業務情報をセットする。
		 */
		protected <D extends DtlR, S extends MCRow> void setAttrInfo(D dest, S src) {
				MST_OPER_INST_SEND_IF_R operInstR = _operInstL.getFirst(_operInstIdx, src.getStringNE("oper_inst_no"));
				if(!isNull(operInstR)) {
					dest.attr_char1(operInstR.mfg_inst_no());
					dest.attr_char2(operInstR.oper_inst_no());
					dest.attr_char3(operInstR.mfg_loc_cd());
					dest.attr_char4(operInstR.oper_cd());
					dest.attr_char5(operInstR.mfg_itm_cd());
					dest.attr_char6(operInstR.mfg_itm_sub1());
					dest.attr_char7(operInstR.mfg_itm_sub2());
					dest.attr_char8(operInstR.mfg_itm_sub3());
					dest.attr_char9(operInstR.usr_cd());
					dest.attr_char10(operInstR.mfg_mtd_typ());
					dest.attr_char11(operInstR.site_cd());
					dest.attr_char12(operInstR.oper_loc_cd());
					dest.attr_char13(operInstR.strg_loc_cd());
					dest.attr_char14(operInstR.lot_no());
					dest.attr_char15(operInstR.sublot_no());
					dest.attr_char16(operInstR.sno1());
					dest.attr_char17(operInstR.sno2());
					dest.attr_char18(operInstR.sno3());
					dest.attr_char19(operInstR.sno4());
					dest.attr_char20(MCBooleanUtil.booleanToDBString(operInstR.abort_flg()));
					dest.attr_num1(operInstR.mfg_inst_rev());
					dest.attr_dt1(operInstR.inst_dt());
					dest.attr_tm1(operInstR.mfg_st_schd_tm());
					dest.attr_tm2(operInstR.mfg_end_schd_tm());
					dest.attr_tm3(operInstR.st_schd_tm());
					dest.attr_tm4(operInstR.end_schd_tm());
				}
		}
		

		protected Map_DtlR_MST_OPER_INST_SEND_IF_R<DtlR,MST_OPER_INST_SEND_IF_R> createMap_DtlR_MST_OPER_INST_SEND_IF_R() {
			return new Map_DtlR_MST_OPER_INST_SEND_IF_R<DtlR, MST_OPER_INST_SEND_IF_R>();
		}

		public class Map_DtlR_MST_OPER_INST_SEND_IF_R<D extends DtlR, S extends MST_OPER_INST_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_no, MST_OPER_INST_SEND_IF_R.$data_no);
				addColumnPathMap(DtlR.$ext_sys_cd, MST_OPER_INST_SEND_IF_R.$ext_sys_cd);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.if_proc_typ(src.getStringNE("if_proc_typ"));
				dest.not_send_upd_flg(src.getBooleanNE("not_send_upd_flg"));
				setAttrInfo(dest, src);
			}
		}


		protected Map_DtlR_MST_INPT_SCHD_SEND_IF_R<DtlR,MST_INPT_SCHD_SEND_IF_R> createMap_DtlR_MST_INPT_SCHD_SEND_IF_R() {
			return new Map_DtlR_MST_INPT_SCHD_SEND_IF_R<DtlR, MST_INPT_SCHD_SEND_IF_R>();
		}

		public class Map_DtlR_MST_INPT_SCHD_SEND_IF_R<D extends DtlR, S extends MST_INPT_SCHD_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_no, MST_INPT_SCHD_SEND_IF_R.$data_no);
				addColumnPathMap(DtlR.$ext_sys_cd, MST_INPT_SCHD_SEND_IF_R.$ext_sys_cd);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.if_proc_typ(src.getStringNE("if_proc_typ"));
				dest.not_send_upd_flg(src.getBooleanNE("not_send_upd_flg"));
				setAttrInfo(dest, src);
			}
		}


		protected Map_DtlR_MST_YIELD_SCHD_SND_IF_R<DtlR,MST_YIELD_SCHD_SND_IF_R> createMap_DtlR_MST_YIELD_SCHD_SND_IF_R() {
			return new Map_DtlR_MST_YIELD_SCHD_SND_IF_R<DtlR, MST_YIELD_SCHD_SND_IF_R>();
		}

		public class Map_DtlR_MST_YIELD_SCHD_SND_IF_R<D extends DtlR, S extends MST_YIELD_SCHD_SND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_no, MST_YIELD_SCHD_SND_IF_R.$data_no);
				addColumnPathMap(DtlR.$ext_sys_cd, MST_YIELD_SCHD_SND_IF_R.$ext_sys_cd);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.if_proc_typ(src.getStringNE("if_proc_typ"));
				dest.not_send_upd_flg(src.getBooleanNE("not_send_upd_flg"));
				setAttrInfo(dest, src);
			}
		}

		protected Map_DtlR_MST_WK_SCHD_SEND_IF_R<DtlR,MST_WK_SCHD_SEND_IF_R> createMap_DtlR_MST_WK_SCHD_SEND_IF_R() {
			return new Map_DtlR_MST_WK_SCHD_SEND_IF_R<DtlR, MST_WK_SCHD_SEND_IF_R>();
		}

		public class Map_DtlR_MST_WK_SCHD_SEND_IF_R<D extends DtlR, S extends MST_WK_SCHD_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_no, MST_WK_SCHD_SEND_IF_R.$data_no);
				addColumnPathMap(DtlR.$ext_sys_cd, MST_WK_SCHD_SEND_IF_R.$ext_sys_cd);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.if_proc_typ(src.getStringNE("if_proc_typ"));
				dest.not_send_upd_flg(src.getBooleanNE("not_send_upd_flg"));
				setAttrInfo(dest, src);
			}
		}

		
		/**
		 * 工程単位指図数の計算
		 * @param operInstIfR
		 */
		protected void calcOperNum(MST_OPER_INST_SEND_IF_R r) {
			if (!isNull(r.oper_unit_qty())) return;
			MCNumber operUnitQty = convQtyBaseToOper(r.base_unit_qty(),
					r.oper_conv_qty(), r.oper_std_qty(), r.oper_unit_dec_place(),
					r.oper_unit_conv_rnd_typ());
			
			if (isNull(operUnitQty)) {
				r.oper_unit_qty(r.base_unit_qty());
				r.oper_unit_cd(r.base_unit_cd());
				r.oper_unit_nm(r.base_unit_nm());
				r.oper_std_qty(1);
				r.oper_conv_qty(1);
				r.oper_unit_dec_place(r.getNumberNE("base_unit_dec_place"));
			}
			else {
				r.oper_unit_qty(operUnitQty);
			}
		}
		
		/**
		 * SCM IF制御マスタキャッシュ
		 */
		protected ExtSysCache _extSysCache;
		protected void initExtSysCache(MCList<MST_OPER_INST_SEND_IF_R> l) {
			_extSysCache = new ExtSysCache(l);
		}
		public class ExtSysCache {
			protected MCList<SCMLinkUtil_Srch01_CndR> _extSysInfo;
			protected MCIndexKey _idx;
			protected MCIndexKey _idxWk;
			public ExtSysCache(MCList<MST_OPER_INST_SEND_IF_R> l) {
				init(l);
			}
			protected void init(MCList<MST_OPER_INST_SEND_IF_R> l) {
				_extSysInfo = MCList.create(SCMLinkUtil_Srch01_CndR.class);
				_extSysInfo.addStringColumn("oper_inst_no");
				_extSysInfo.addStringColumn("wk_schd_no");
				
				MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();
				Map<MCNumber, String> map = new HashMap<>();
				Map<MCNumber, String> mapWk = new HashMap<>();
				MCNumber peg = MCNumber.ZERO;
				for (MST_OPER_INST_SEND_IF_R oiR : l) {
					for (String ifProcTyp : getMfgInstIf()) {
						SCMLinkUtil_Srch01_CndR upR = SCMLinkUtil_Srch01_CndR.create();
						upR.peg_no(peg);
						upR.if_proc_typ(ifProcTyp);
						upR.loc_cd(oiR.mfg_loc_cd());
						upR.oper_cd(oiR.oper_cd());
						upR.itm_cd(oiR.mfg_itm_cd());
						upR.itm_sub1(oiR.mfg_itm_sub1());
						upR.itm_sub2(oiR.mfg_itm_sub2());
						upR.itm_sub3(oiR.mfg_itm_sub3());
						upR.master_dt(getToday());
						
						if (!MAC_IF_PROC_TYP.isMES_WK_SCHD_SEND(ifProcTyp)) {
							map.put(peg, oiR.oper_inst_no());
							o.up0().add(upR);
							peg = peg.add(1);
							continue;
						}
						//製造指図に紐づく工数予定が0件のとき、ifProcTypが工数予定送信のデータを追加しない
						if (_wkSchdL.isEmpty()) {
							continue;
						}
						
						boolean firstRow = true;
						for (MST_WK_SCHD_SEND_IF_R wkR : _wkSchdL) {
							//対象工程に紐づかない工数予定ならスキップ
							if (!oiR.oper_inst_no().equals(wkR.oper_inst_no())) {
								continue;
							}
							if (firstRow) {
								upR.wk_cost_cd(wkR.wk_cost_cd());
								map.put(peg, oiR.oper_inst_no());
								mapWk.put(peg, wkR.wk_schd_no());
								o.up0().add(upR);
								peg = peg.add(1);
								firstRow = false;
							}
							else {
								SCMLinkUtil_Srch01_CndR subR = upR.clone();
								subR.peg_no(peg);
								subR.wk_cost_cd(wkR.wk_cost_cd());
								map.put(peg, oiR.oper_inst_no());
								mapWk.put(peg, wkR.wk_schd_no());
								peg = peg.add(1);
								o.up0().add(subR);
							}
						}
					}

				}
				o.exec();
				for (SCMLinkUtil_Srch01_CndR r : o.down0()) {
					if (isNull(r.ext_sys_cd())) continue;
					if (map.containsKey(r.peg_no())) {
						String oper_inst_no = map.get(r.peg_no());
						String wk_schd_no = mapWk.get(r.peg_no());
						r.setStringNE("oper_inst_no", oper_inst_no);
						r.setStringNE("wk_schd_no", wk_schd_no);
					}
					_extSysInfo.add(r);
				}
				_idx = _extSysInfo.createIndex("oper_inst_no", "if_proc_typ");
				_idxWk = _extSysInfo.createIndex("oper_inst_no", "wk_schd_no", "if_proc_typ");
			}
			
			/**
			 * 対応するレコードを取得する
			 */
			protected SCMLinkUtil_Srch01_CndR get(MCRow r) {
				if (r.getStringNE("if_proc_typ").equals(MAC_IF_PROC_TYP.MES_WK_SCHD_SEND.value())) {
					return _extSysInfo.getFirst(_idxWk, r.toArray("oper_inst_no", "wk_schd_no", "if_proc_typ"));
				}
				else {
					return _extSysInfo.getFirst(_idx, r.toArray("oper_inst_no", "if_proc_typ"));	
				}
			}
		}
		
		/**
		 * 製造指図関連のIF処理区分を取得する
		 */
		protected String[] getMfgInstIf() {
			return new String[] {
				MAC_IF_PROC_TYP.MES_YIELD_SCHD_SEND.value(),
				MAC_IF_PROC_TYP.MES_OPER_INST_SEND.value(),
				MAC_IF_PROC_TYP.MES_INPT_SCHD_SEND.value(),
				MAC_IF_PROC_TYP.MES_WK_SCHD_SEND.value()
			};
		}
	}

	//FMCB CUSTOM END
}