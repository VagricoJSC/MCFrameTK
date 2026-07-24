package mcframe.serverMSLA.MSLAL7160;

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
import mcframe.commonMSLA.MSLAR0060.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFBZ.PFBZL9010.PFBZL_CodeConvert;
import mcframe.serverPFBZ.PFBZL9030.PFBZL_FileInput;
import mcframe.serverMS.dbc.MST_ACCPT_RECV_IF_R;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import mcframe.serverFXUC.FXUCL0030.*;
import java.util.*;
import java.util.Map.Entry;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverCore.resource.MCConst;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_AccptRecvConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_AccptRecvConvService_MC extends MSLAL_AccptRecvConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * AccptRecvConv_Conv01オペレーション.<p>
	 *
	 */
	public class AccptRecvConv_Conv01 extends MSLAL_AccptRecvConvService_MC_A.AccptRecvConv_Conv01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtRecvIfDBContainer(MST_ACCPT_RECV_IF_R.class);
		}
		@Override
		protected void setCnvBpCol() {
			_cnvBpCol = "if_cst_cd";
		}
		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("if_cst_cd", "cst_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("if_cur_cd", "trd_cur_cd", MAC_IF_COL_TYP.CUR);
			_ifDBC.addCnvCol("if_trd_unit_cd", "trd_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("if_dscnt_rsn_cd", "dscnt_rsn_cd", MAC_IF_COL_TYP.BIZ_RSN);
			_ifDBC.addCnvItmCol("if_itm_cd", "if_itm_sub1", "if_itm_sub2", "if_itm_sub3", "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
		}
		
		@Override
		protected void pushAlertMsg() {
			Map<List<String>, MCMessageList> map = new HashMap<List<String>, MCMessageList>();
			
			MCMessageList msgList = MCMessagePool.getMessageList();
			MCList<MST_ACCPT_RECV_IF_R> ifL = MCList.create(MST_ACCPT_RECV_IF_R.class);

			for (MCContainer row : _ifDBC.getExIfL()) {
				MST_ACCPT_RECV_IF_R ifR = (MST_ACCPT_RECV_IF_R)row;
				if (!isNull(ifR.cst_cd())) {
					ifL.add(ifR);
				}
			}
			if (ifL.isEmpty()) {
				return;
			}
			
			initCstUsrCache(ifL);
			getSlsActInfo(ifL);
			setUsrtDpt(ifL);
			
			for (MST_ACCPT_RECV_IF_R ifR : ifL) {
				for (MCMessage msg : msgList) {
					if (msg.getCauseRow() == ifR) {
						List<String> keyList = new ArrayList<String>();
						keyList.add(ifR.cst_cd());
						keyList.add(ifR.getStringNE("wg_cd"));
						keyList.add(ifR.getStringNE("sls_usr_cd"));
						
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
				String cstCd = entry.getKey().get(0);
				String wgCd = entry.getKey().get(1);
				String usrCd = entry.getKey().get(2);
				
				pushAlert(null, wgCd, cstCd, usrCd,
						MODULE_ID, LOGIC_ID, OPERATION_ID,
						entry.getValue(), FXBAL_BatchLogManager.getLogger(),
						MSLAL0205,
						MCConst.lgclbl.getLabel(MODULE_ID, LOGIC_ID, null),
						MCDate.sysnow().toString("yyyy/MM/dd HH:mm:ss"),
						getCo().co_cd(), wgCd, cstCd);
			}
		}
		
		/**
		 * 	マスタキャッシュ
		 */
		protected FXUCL_MCDbcCacheStEnd<MAM_CST_USR_R> _cacheCstUsr;
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt;
		
		protected MAM_CST_USR_R getCstUsrCache(String cstCd) {
			return _cacheCstUsr.get(getToday(), cstCd);
		}
		
		protected FXUCL_MCDbcCacheStEnd<MAM_CST_USR_R> initCstUsrCache(MCList<MST_ACCPT_RECV_IF_R> ifL) {
			if (_cacheCstUsr == null){
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MAM_CST_USR_R.create("T"));
				_cacheCstUsr = new FXUCL_MCDbcCacheStEnd<MAM_CST_USR_R>(dbc_bldr, ifL,
						MST_ACCPT_RECV_IF_R.$cst_cd);
			}
			return _cacheCstUsr;
		}
		protected MAM_DPT_R getDptCache(String dptCd) {
			return _cacheDpt.get(getToday(), dptCd);
		}
		
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> initDptCache(MCList<MST_ACCPT_RECV_IF_R> ifL) {
			if (_cacheDpt == null){
				MAM_DPT_R t = MAM_DPT_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setWhere(t.sls_dpt_flg.eq(value(true)));
				_cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dbc_bldr, ifL, "sls_dpt_cd");
			}

			return _cacheDpt;
		}
		
		// 売上実績情報
		MCList<MST_SLS_ACT_D_R> _slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
		MCIndexKey _slsActDLIdxKey = null;
		
		/**
		 * 訂正・取消の外部仕入実績明細ＮＯに紐づく売上実績情報の取得
		 * @param ifL
		 */
		protected void getSlsActInfo(MCList<MST_ACCPT_RECV_IF_R> ifL) {
			MCList<MST_ACCPT_RECV_IF_R> tgtL = MCList.create(MST_ACCPT_RECV_IF_R.class);
			for (MST_ACCPT_RECV_IF_R ifR : ifL) {
				if (MAC_DATA_CRUD_TYP.isCRT(ifR.data_crud_typ())) {
					continue;
				}
				tgtL.add(ifR);
			}

			if (!isNull(tgtL) && !tgtL.isEmpty()) {
				_slsActDL.addStringColumn(MST_SLS_ACT_R.$sls_usr_cd);
				_slsActDL.addStringColumn(MST_SLS_ACT_R.$sls_dpt_cd);
				MST_SLS_ACT_D_R t1 = MST_SLS_ACT_D_R.create("T");
				MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(t1);
				MST_SLS_ACT_R t2 = MST_SLS_ACT_R.create("T2");
				slsActDL_bldr.setSelect(t1.ext_purc_act_d_no);
				slsActDL_bldr.addSelect(t2.sls_usr_cd);
				slsActDL_bldr.addSelect(t2.sls_dpt_cd);
				slsActDL_bldr.addInnerJoin(t2, bracket(t2.sls_act_no.eq(t1.sls_act_no)
						.and(t2.sls_act_seq.eq(t1.sls_act_seq))
						.and(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
				slsActDL_bldr.setWhere(t1.ext_purc_act_d_no.eq(bind("ext_purc_act_d_no")));
				dbSelect("MSLAL7160_MST_SLS_ACT_D_S01", _slsActDL, slsActDL_bldr, tgtL);
				_slsActDLIdxKey = _slsActDL.createIndex(MST_SLS_ACT_D_R.$ext_purc_act_d_no);
			}
			
		}
		
		/**
		 * 売上担当者、売上部門、ワーキンググループの設定
		 * @param ifL
		 */
		protected void setUsrtDpt(MCList<MST_ACCPT_RECV_IF_R> ifL) {
			ifL.addStringColumn("sls_usr_cd");
			ifL.addStringColumn("sls_dpt_cd");
			ifL.addStringColumn("wg_cd");
			
			// 売上担当者取得
			for (MST_ACCPT_RECV_IF_R ifR : ifL) {
				// 訂正・取消の場合、外部仕入実績明細ＮＯに紐づく売上実績情報より売上担当者、売上部門を取得
				// ただし、訂正でも売上が未登録の場合がある（その場合は新規と同様）
				if (!MAC_DATA_CRUD_TYP.isCRT(ifR.data_crud_typ()) && !isNull(_slsActDL)) {
					MST_SLS_ACT_D_R slsActDR = _slsActDL.getFirst(_slsActDLIdxKey, ifR.ext_purc_act_d_no());
					if (!isNull(slsActDR)) {
						ifR.setStringNE("sls_usr_cd", slsActDR.getStringNE(MST_SLS_ACT_R.$sls_usr_cd));
						ifR.setStringNE("sls_dpt_cd", slsActDR.getStringNE(MST_SLS_ACT_R.$sls_dpt_cd));
					}
				}
				if (isNull(ifR.getStringNE("sls_usr_cd"))) {
					MAM_CST_USR_R cstUsrR = getCstUsrCache(ifR.cst_cd());
					ifR.setStringNE("sls_usr_cd", cstUsrR.usr_cd());
				}
			}
			
			// 売上部門取得
			for (MST_ACCPT_RECV_IF_R ifR : ifL) {
				if (!isNull(ifR.getStringNE("sls_dpt_cd"))) {
					continue;
				}
				ifR.setStringNE("sls_dpt_cd", getSlsDptBySlsUsr(ifR.getStringNE("sls_usr_cd")));
			}
			
			// ワーキンググループ取得
			initDptCache(ifL);
			for (MST_ACCPT_RECV_IF_R ifR : ifL) {
				if (isNull(ifR.getStringNE("sls_dpt_cd"))) {
					continue;
				}
				MAM_DPT_R dptR = getDptCache(ifR.getStringNE("sls_dpt_cd"));
				ifR.setStringNE("wg_cd", dptR.wg_cd());
			}
		}
		
		/**
		 * 売上担当者より売上部門を取得
		 * @param slsUsrCd
		 * @return
		 */
		protected String getSlsDptBySlsUsr (String slsUsrCd) {
			
			String slsDptCd = null;
			
			MCList<MAVM_USR_DPT_R> usrDptL = MCList.create(MAVM_USR_DPT_R.class);
			MAVM_USR_DPT_R t1 = MAVM_USR_DPT_R.create("T");
			MCQueryApiBuilder usrDptL_bldr = MCQueryApiBuilder.create(t1);
			MAM_DPT_R m1 = MAM_DPT_R.create("M1");
			usrDptL_bldr.setSelect(t1.usr_cd, t1.dpt_cd, t1.main_flg);
			usrDptL_bldr.addInnerJoin(m1, bracket(t1.dpt_cd.eq(m1.dpt_cd)
					.and(m1.sls_dpt_flg.eq(value(true)))));
			usrDptL_bldr.setWhere(t1.usr_cd.eq(bind("1")), slsUsrCd);
			usrDptL_bldr.addWhereWithAnd(t1.st_dt.lte(bind("1")), getToday());
			usrDptL_bldr.addWhereWithAnd(t1.end_dt.gte(bind("1")), getToday());
			usrDptL_bldr.addWhereWithAnd(m1.st_dt.lte(bind("1")), getToday());
			usrDptL_bldr.addWhereWithAnd(m1.end_dt.gte(bind("1")), getToday());
			dbSelect("MSLAL7160_MAVM_USR_DPT_S01", usrDptL, usrDptL_bldr);
			
			MCIndexKey mainIdxkey = usrDptL.createIndex(MAVM_USR_DPT_R.$main_flg);
			
			if (!usrDptL.isEmpty()) {
				if (usrDptL.contains(mainIdxkey, true)) {
					slsDptCd = usrDptL.getFirst(mainIdxkey, true).dpt_cd();
				}
				else {
					usrDptL.sort(SortType.ASC, MAVM_USR_DPT_R.$dpt_cd);
					slsDptCd = usrDptL.get(0).dpt_cd();
				}
			}
			return slsDptCd;
		}
		
	}
	
	/**
	 * AccptRecvConv_Conv02オペレーション.<p>
	 *
	 */
	public class AccptRecvConv_Conv02 extends MSLAL_AccptRecvConvService_MC_A.AccptRecvConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings({
			"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MST_ACCPT_RECV_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_AccptPrnt.create());
			_IfRptSet.setRowMapper(new Map_MST_ACCPT_RECV_IF_R_DtlR());
		}
	}
	
	/**
	 * AccptRecvConv_Conv03オペレーション.<p>
	 *
	 */
	public class AccptRecvConv_Conv03 extends MSLAL_AccptRecvConvService_MC_A.AccptRecvConv_Conv03 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings({
			"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MST_ACCPT_RECV_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_AccptPrnt.create());
			_IfRptSet.setRowMapper(new Map_MST_ACCPT_RECV_IF_R_DtlR());
		}
		@Override
		protected void setRptSetData() {
			_IfRptSet.getReportSet().addAll(up1());
		}
	}

	public class Map_MST_ACCPT_RECV_IF_R_DtlR<D extends MST_ACCPT_RECV_IF_R, S extends DtlR, W extends PFT_SDRV_IF_R>
			extends MAUCC_RowMapperWith<D, S, W> {

		protected W _ifR;

		@Override
		public void setWith(W ifR) {
			this._ifR = ifR;
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$data_crud_typ, DtlR.$data_crud_typ);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$data_make_dt, DtlR.$data_make_dt);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$dlv_slip_no, DtlR.$dlv_slip_no);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$dlv_slip_d_no, DtlR.$dlv_slip_d_no);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$iv_flg, DtlR.$iv_flg);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$abort_flg, DtlR.$abort_flg);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$trd_unit_qty, DtlR.$trd_unit_qty);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$inc_tax_flg, DtlR.$inc_tax_flg);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$interim_flg, DtlR.$interim_flg);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$trd_cur_upri, DtlR.$trd_cur_upri);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$trd_cur_amt, DtlR.$trd_cur_amt);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$tax_rate, DtlR.$tax_rate);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$tax_typ, DtlR.$tax_typ);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$trd_cur_tax_amt, DtlR.$trd_cur_tax_amt);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$trd_cur_dscnt_amt, DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$accpt_dfct_flg, DtlR.$accpt_dfct_flg);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$lot_no, DtlR.$lot_no);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$rcv_schd_dt, DtlR.$pay_schd_dt);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sno1, DtlR.$sno1);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sno2, DtlR.$sno2);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sno3, DtlR.$sno3);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sno4, DtlR.$sno4);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char1, DtlR.$sub_char1);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char2, DtlR.$sub_char2);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char3, DtlR.$sub_char3);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char4, DtlR.$sub_char4);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char5, DtlR.$sub_char5);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char6, DtlR.$sub_char6);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char7, DtlR.$sub_char7);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char8, DtlR.$sub_char8);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char9, DtlR.$sub_char9);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char10, DtlR.$sub_char10);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char11, DtlR.$sub_char11);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char12, DtlR.$sub_char12);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char13, DtlR.$sub_char13);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char14, DtlR.$sub_char14);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char15, DtlR.$sub_char15);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char16, DtlR.$sub_char16);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char17, DtlR.$sub_char17);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char18, DtlR.$sub_char18);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char19, DtlR.$sub_char19);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char20, DtlR.$sub_char20);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char21, DtlR.$sub_char21);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char22, DtlR.$sub_char22);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char23, DtlR.$sub_char23);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char24, DtlR.$sub_char24);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char25, DtlR.$sub_char25);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char26, DtlR.$sub_char26);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char27, DtlR.$sub_char27);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char28, DtlR.$sub_char28);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char29, DtlR.$sub_char29);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_char30, DtlR.$sub_char30);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_num1, DtlR.$sub_num1);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_num2, DtlR.$sub_num2);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_num3, DtlR.$sub_num3);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_num4, DtlR.$sub_num4);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_num5, DtlR.$sub_num5);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_dt1, DtlR.$sub_dt1);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_dt2, DtlR.$sub_dt2);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_dt3, DtlR.$sub_dt3);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_dt4, DtlR.$sub_dt4);
			addColumnPathMap(MST_ACCPT_RECV_IF_R.$sub_dt5, DtlR.$sub_dt5);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_lno(getSequence(MSC_NUM_SYS_TYP.ACCPTRECVIF.value()));
			dest.data_no(_ifR.data_no());
			dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
			dest.ext_sys_cd(_ifR.ext_sys_cd());
			dest.imp_flg(true);
			dest.recv_dt(getToday());
			dest.ext_data_lno(src.data_lno());
			dest.ext_data_no(src.data_no());
			dest.accpt_dt(src.ac_dt());
			dest.cst_po_no(src.po_no());
			dest.cst_po_d_no(src.po_d_no());
			dest.ext_purc_act_d_no(src.purc_act_d_no());
			dest.if_cst_cd(src.po_co_cd());
			dest.if_cst_nm(src.po_co_nm());
			dest.if_cur_cd(src.trd_cur_cd());
			dest.if_trd_unit_cd(src.trd_unit_cd());
			dest.if_trd_unit_nm(src.trd_unit_nm());
			dest.if_dscnt_rsn_cd(src.dscnt_rsn_cd());
			dest.if_dscnt_rsn_nm(src.dscnt_rsn_nm());
			if (src.iv_flg()) {
				dest.itm_nm(nvl(src.slo_co_itm_nm(), src.po_co_iv_itm_nm()));
				dest.if_itm_nm(nvl(src.slo_co_itm_nm(), src.po_co_iv_itm_nm()));
			}
			else {
				dest.itm_nm(nvl(src.slo_co_itm_nm(), src.po_co_itm_nm()));
				dest.if_itm_nm(nvl(src.slo_co_itm_nm(), src.po_co_itm_nm()));
			}
			dest.if_itm_cd(nvl(src.slo_co_itm_cd(), src.po_co_itm_cd()));
			dest.if_itm_sub1(nvl(src.slo_co_itm_sub1(), src.po_co_itm_sub1()));
			dest.if_itm_sub2(nvl(src.slo_co_itm_sub2(), src.po_co_itm_sub2()));
			dest.if_itm_sub3(nvl(src.slo_co_itm_sub3(), src.po_co_itm_sub3()));
			dest.if_co_cd(src.slo_co_cd());
			dest.if_co_nm(src.slo_co_nm());

			if (isSame(getSysParm("ACCPT_RECV_UPRI_CHK_PTN_FLG"),"2") || isSame(getSysParm("ACCPT_RECV_UPRI_CHK_PTN_FLG"),"3")) {
				MAM_EXT_SYS_R extSysR = getExtSysR(dest.ext_sys_cd());
				dest.upri_not_chk_flg(extSysR.upri_not_chk_flg());
				dest.amt_not_chk_flg(extSysR.amt_not_chk_flg());
				dest.tax_not_chk_flg(extSysR.tax_not_chk_flg());
			}
		}
	}

	protected FXUCL_MCDbcCache<MAM_EXT_SYS_R> _extSys;

	protected MAM_EXT_SYS_R getExtSysR(String extSysCd) {
		if (_extSys == null) {
			MAM_EXT_SYS_R extSysR = MAM_EXT_SYS_R.create("MAMEXT");
			MCQueryApiBuilder extSysBldr = MCQueryApiBuilder.create(extSysR);
			extSysBldr.setSelect(extSysR.ext_sys_cd);
			extSysBldr.addSelect(extSysR.upri_not_chk_flg);
			extSysBldr.addSelect(extSysR.amt_not_chk_flg);
			extSysBldr.addSelect(extSysR.tax_not_chk_flg);
			
			_extSys = new FXUCL_MCDbcCache<MAM_EXT_SYS_R>(extSysBldr);
		}
		return _extSys.get(extSysCd);
	}

	//FMCB CUSTOM END
}