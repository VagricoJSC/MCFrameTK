package mcframe.serverMSLA.MSLAL9510;

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
import mcframe.serverPFBZ.PFBZL9010.PFBZL_CodeConvert;
import mcframe.serverPFBZ.PFBZL9030.PFBZL_FileInput;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import mcframe.commonMSLA.MSLAR2010.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverCore.resource.MCConst;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_RcvRecvConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_RcvRecvConvService_MC extends MSLAL_RcvRecvConvService_MC_A{
	//FMCB CUSTOM START
	
	/**
	 * RcvRecvConv_Conv01オペレーション.<p>
	 *
	 */
	public class RcvRecvConv_Conv01 extends MSLAL_RcvRecvConvService_MC_A.RcvRecvConv_Conv01 {
		
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt;
		
		protected MAM_DPT_R getDptCache(String dptCd) {
			return _cacheDpt.get(getToday(), dptCd);
		}
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtRecvIfDBContainer(MST_RCV_RECV_IF_R.class);
		}
		
		@Override
		protected void setCnvBpCol() {
			_cnvBpCol = "if_rcst_cd";
		}
		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("if_rcst_cd", "rcst_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("if_bcst_cd", "bcst_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("if_bill_dpt_cd", "bill_dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvCol("if_rcv_dpt_cd", "rcv_dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvCol("if_rcv_usr_cd", "rcv_usr_cd", MAC_IF_COL_TYP.USR);
			_ifDBC.addCnvCol("if_rcv_mtd_cd", "rcv_mtd_cd", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("if_bank_cd", "bank_cd", MAC_IF_COL_TYP.BANK);
			_ifDBC.addCnvCol("if_bank_ac_cd", "bank_ac_cd", MAC_IF_COL_TYP.BANK_AC);
			_ifDBC.addCnvCol("if_trd_cur_cd", "trd_cur_cd", MAC_IF_COL_TYP.CUR);
			_ifDBC.addCnvCol("if_note_rsn_cd", "note_rsn_cd", MAC_IF_COL_TYP.NOTE_RSN);
			_ifDBC.addCnvCol("if_draw_bank_cd", "draw_bank_cd", MAC_IF_COL_TYP.BANK);
			_ifDBC.addCnvCol("if_draw_branch_cd", "draw_branch_cd", MAC_IF_COL_TYP.BRANCH);
		}
		
		@Override
		protected void pushAlertMsg() {
			
			Map<List<String>, MCMessageList> map = new HashMap<List<String>, MCMessageList>();
			
			MCMessageList msgList = MCMessagePool.getMessageList();
			MCList<MST_RCV_RECV_IF_R> ifL = MCList.create(MST_RCV_RECV_IF_R.class);

			for (MCDBContainer row : _ifDBC.getExIfL()) {
				MST_RCV_RECV_IF_R ifR = (MST_RCV_RECV_IF_R)row;
				ifL.add(ifR);
			}
			if (ifL.isEmpty()) {
				return;
			}
			
			initDptCache(ifL);
			
			for (MST_RCV_RECV_IF_R ifR : ifL) {
				for (MCMessage msg : msgList) {
					if (msg.getCauseRow() == ifR) {
						
						List<String> keyList = new ArrayList<String>();
						
						MST_RCV_R rcvR = null;
						
						if (MAC_DATA_CRUD_TYP.isUPD(ifR.data_crud_typ()) ||
								MAC_DATA_CRUD_TYP.isDEL(ifR.data_crud_typ())) {
							rcvR = getRcvR(ifR);
						}
						
						if (!isNull(rcvR) && MAC_DATA_CRUD_TYP.isDEL(ifR.data_crud_typ())) {
							keyList.add(rcvR.rcst_cd());
							keyList.add(rcvR.wg_cd());
							keyList.add(rcvR.rcv_usr_cd());
						}
						else {
							String rcvUsrCd = null;
							if (MAC_DATA_CRUD_TYP.isUPD(ifR.data_crud_typ())
									&& !isNull(rcvR) 
									&& (isNull(ifR.rcv_usr_cd()))) {
								// データ更新区分が更新　かつ　入金受信ＩＦの入金担当者が設定されていない場合、入金テーブルの入金担当者を保持する
								rcvUsrCd = rcvR.rcv_usr_cd();
							} else {
								rcvUsrCd = ifR.rcv_usr_cd();
							}
							
							String wgCd = null;
							if (!isNull(ifR.rcv_dpt_cd())) {
								MAM_DPT_R dptR = getDptCache(ifR.rcv_dpt_cd());
								wgCd = dptR.wg_cd();
							} 
							//データ更新区分が更新　かつ　入金担当者が変わってない場合は、入金テーブルのＷＧを設定する。
							else if (MAC_DATA_CRUD_TYP.isUPD(ifR.data_crud_typ()) && !isNull(rcvR) 
									&& ((isNull(ifR.rcv_usr_cd()) && isNull(rcvR.rcv_usr_cd())) || isSame(rcvUsrCd, rcvR.rcv_usr_cd()))){
								wgCd = rcvR.wg_cd();
							}
							
							keyList.add(ifR.rcst_cd());
							keyList.add(wgCd);
							keyList.add(rcvUsrCd);
						}
						
						if (map.containsKey(keyList)) {
							MCMessageList list = map.get(keyList);
							list.add(msg);
						}
						else {
							MCMessageList list = new MCMessageList();
							list.add(msg);
							map.put(keyList, list);
						}
					}
				}
			}
			for (Entry<List<String>, MCMessageList> entry : map.entrySet()) {
				String rcstCd = entry.getKey().get(0);
				String wgCd = entry.getKey().get(1);
				String usrCd = entry.getKey().get(2);
				
				pushAlert(null, wgCd, rcstCd, usrCd, MODULE_ID, LOGIC_ID, OPERATION_ID,
						entry.getValue(), FXBAL_BatchLogManager.getLogger(), MSLAL0603,
						MCConst.lgclbl.getLabel(MODULE_ID, LOGIC_ID, null),
						MCDate.sysnow().toString("yyyy/MM/dd HH:mm:ss"),
						getCo().co_cd(), wgCd, rcstCd);
			}
		}
		
		protected MST_RCV_R getRcvR(MST_RCV_RECV_IF_R ifR) {
			MCList<MST_RCV_R> rcvL = MCList.create(MST_RCV_R.class);
			MST_RCV_R t = MST_RCV_R.create("T");
			MCQueryApiBuilder rcvL_bldr = MCQueryApiBuilder.create(t);
			MST_RCV_R rcvR = MST_RCV_R.create();
			
			rcvL_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), ifR.ext_sys_cd());
			rcvL_bldr.addWhereWithAnd(t.ext_rcv_no.eq(bind("1")), ifR.ext_rcv_no());
			
			dbSelect("MSLAL9510_MST_RCV_S01", rcvL, rcvL_bldr);
			
			if (!rcvL.isEmpty()) {
				rcvR = rcvL.get(0);
			}
			return rcvR;
		}
		
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> initDptCache(MCList<MST_RCV_RECV_IF_R> ifL) {
			if (_cacheDpt == null){
				MAM_DPT_R t = MAM_DPT_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setWhere(t.ar_dpt_flg.eq(value(true)));
				_cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dbc_bldr, ifL, MST_RCV_RECV_IF_R.$rcv_dpt_cd);
			}
			return _cacheDpt;
		}
	}
	
	
	/**
	 * RcvRecvConv_Conv02オペレーション.<p>
	 *
	 */
	public class RcvRecvConv_Conv02 extends MSLAL_RcvRecvConvService_MC_A.RcvRecvConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		@SuppressWarnings({
			"unchecked", "rawtypes"
		})
		
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MST_RCV_RECV_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_RcvPrnt.create());
			_IfRptSet.setRowMapper(new Map_MST_RCV_RECV_IF_R_DtlR());
		}
		
		public class Map_MST_RCV_RECV_IF_R_DtlR<D extends MST_RCV_RECV_IF_R, S extends DtlR, W extends PFT_SDRV_IF_R> 
		extends MAUCC_RowMapperWith<D, S, W> {
			
			protected W _ifR;
			
			@Override
			public void setWith(W ifR){
				this._ifR = ifR;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_RECV_IF_R.$data_crud_typ, DtlR.$data_crud_typ);
				addColumnPathMap(MST_RCV_RECV_IF_R.$data_make_dt, DtlR.$data_make_dt);
				addColumnPathMap(MST_RCV_RECV_IF_R.$ext_rcv_no, DtlR.$ext_rcv_no);
				addColumnPathMap(MST_RCV_RECV_IF_R.$rcv_dt, DtlR.$rcv_dt);
				addColumnPathMap(MST_RCV_RECV_IF_R.$ar_sttl_typ, DtlR.$ar_sttl_typ);
				addColumnPathMap(MST_RCV_RECV_IF_R.$xfr_psn, DtlR.$xfr_psn);
				addColumnPathMap(MST_RCV_RECV_IF_R.$xrate, DtlR.$xrate);
				addColumnPathMap(MST_RCV_RECV_IF_R.$rcv_amt, DtlR.$rcv_amt);
				addColumnPathMap(MST_RCV_RECV_IF_R.$com_paid, DtlR.$com_paid);
				addColumnPathMap(MST_RCV_RECV_IF_R.$rcv_rmrks, DtlR.$rcv_rmrks);
				addColumnPathMap(MST_RCV_RECV_IF_R.$note_no, DtlR.$note_no);
				addColumnPathMap(MST_RCV_RECV_IF_R.$note_typ, DtlR.$note_typ);
				addColumnPathMap(MST_RCV_RECV_IF_R.$draw_dt, DtlR.$draw_dt);
				addColumnPathMap(MST_RCV_RECV_IF_R.$due_dt, DtlR.$due_dt);
				addColumnPathMap(MST_RCV_RECV_IF_R.$drawer_nm, DtlR.$drawer_nm);
				addColumnPathMap(MST_RCV_RECV_IF_R.$endrsr, DtlR.$endrsr);
				addColumnPathMap(MST_RCV_RECV_IF_R.$accptr, DtlR.$accptr);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char1, DtlR.$sub_char1);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char2, DtlR.$sub_char2);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char3, DtlR.$sub_char3);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char4, DtlR.$sub_char4);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char5, DtlR.$sub_char5);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char6, DtlR.$sub_char6);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char7, DtlR.$sub_char7);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char8, DtlR.$sub_char8);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char9, DtlR.$sub_char9);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char10, DtlR.$sub_char10);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char11, DtlR.$sub_char11);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char12, DtlR.$sub_char12);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char13, DtlR.$sub_char13);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char14, DtlR.$sub_char14);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char15, DtlR.$sub_char15);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char16, DtlR.$sub_char16);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char17, DtlR.$sub_char17);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char18, DtlR.$sub_char18);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char19, DtlR.$sub_char19);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char20, DtlR.$sub_char20);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char21, DtlR.$sub_char21);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char22, DtlR.$sub_char22);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char23, DtlR.$sub_char23);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char24, DtlR.$sub_char24);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char25, DtlR.$sub_char25);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char26, DtlR.$sub_char26);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char27, DtlR.$sub_char27);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char28, DtlR.$sub_char28);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char29, DtlR.$sub_char29);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_char30, DtlR.$sub_char30);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_num1, DtlR.$sub_num1);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_num2, DtlR.$sub_num2);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_num3, DtlR.$sub_num3);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_num4, DtlR.$sub_num4);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_num5, DtlR.$sub_num5);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_dt1, DtlR.$sub_dt1);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_dt2, DtlR.$sub_dt2);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_dt3, DtlR.$sub_dt3);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_dt4, DtlR.$sub_dt4);
				addColumnPathMap(MST_RCV_RECV_IF_R.$sub_dt5, DtlR.$sub_dt5);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_lno(getSequence(MSC_NUM_SYS_TYP.RCVRECVIF.value()));
				dest.data_no(_ifR.data_no());
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.ext_sys_cd(_ifR.ext_sys_cd());
				dest.ext_data_lno(src.data_lno());
				dest.ext_data_no(src.data_no());
				dest.imp_flg(true);
				dest.recv_dt(getToday());
				dest.if_rcst_cd(src.pay_cd());
				dest.if_rcst_nm(src.pay_nm());
				dest.if_bcst_cd(src.bcst_cd());
				dest.if_bcst_nm(src.bcst_nm());
				dest.if_bill_dpt_cd(src.bill_dpt_cd());
				dest.if_bill_dpt_nm(src.bill_dpt_nm());
				dest.if_rcv_dpt_cd(src.rcv_dpt_cd());
				dest.if_rcv_dpt_nm(src.rcv_dpt_nm());
				dest.if_rcv_usr_cd(src.rcv_usr_cd());
				dest.if_rcv_usr_nm(src.rcv_usr_nm());
				dest.if_rcv_mtd_cd(src.rcv_mtd_cd());
				dest.if_rcv_mtd_nm(src.rcv_mtd_nm());
				dest.if_bank_cd(src.bank_cd());
				dest.if_bank_nm(src.bank_nm());
				dest.if_bank_ac_cd(src.bank_ac_cd());
				dest.if_bank_ac_nm(src.bank_ac_nm());
				dest.if_trd_cur_cd(src.trd_cur_cd());
				dest.if_trd_cur_nm(src.trd_cur_nm());
				dest.if_note_rsn_cd(src.note_rsn_cd());
				dest.if_note_rsn_nm(src.note_rsn_nm());
				dest.if_draw_bank_cd(src.draw_bank_cd());
				dest.if_draw_bank_nm(src.draw_bank_nm());
				dest.if_draw_branch_cd(src.draw_branch_cd());
				dest.if_draw_branch_nm(src.draw_branch_nm());
				dest.if_co_cd(src.rcpt_co_cd());
				dest.if_co_nm(src.rcpt_co_nm());
			}
		}
	}

	//FMCB CUSTOM END
}