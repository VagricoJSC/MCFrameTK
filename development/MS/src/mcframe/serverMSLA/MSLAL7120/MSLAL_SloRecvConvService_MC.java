package mcframe.serverMSLA.MSLAL7120;

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
import mcframe.commonMSLA.MSLAR0020.*;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverFXUC.FXUCL0030.*;
import java.util.*;
import java.util.Map.Entry;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverCore.resource.MCConst;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_SloRecvConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_SloRecvConvService_MC extends MSLAL_SloRecvConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * SloRecvConv_Conv01オペレーション.<p>
	 *
	 */
	public class SloRecvConv_Conv01 extends MSLAL_SloRecvConvService_MC_A.SloRecvConv_Conv01 {
		
		/**
		 * 売上担当者と売上部門マップ
		 */
		protected Map<String, String> _slsUsrDptMap = null;
		
		protected MCList<MAVM_USR_DPT_R> _usrDptCache = null;
		
		protected MCIndexKey _usrDptIdx = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtRecvIfDBContainer(MST_SLO_RECV_IF_R.class);
		}
		@Override
		protected void setCnvBpCol() {
			_cnvBpCol = "if_cst_cd";
		}
		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("if_cst_cd", "cst_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("if_dest_cd1", "dest_cd1", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("if_dest_cd2", "dest_cd2", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("if_dest_cd3", "dest_cd3", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("if_cur_cd", "trd_cur_cd", MAC_IF_COL_TYP.CUR);
			_ifDBC.addCnvCol("if_sls_dpt_cd", "sls_dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvCol("if_sls_usr_cd", "sls_usr_cd", MAC_IF_COL_TYP.USR);
			_ifDBC.addCnvCol("if_dlv_cd", "dlv_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("if_dlv_cntry_cd", "dlv_cntry_cd", MAC_IF_COL_TYP.CNTRY);
			_ifDBC.addCnvCol("if_tdlv_cd", "tdlv_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("if_tdlv_cntry_cd", "tdlv_cntry_cd", MAC_IF_COL_TYP.CNTRY);
			_ifDBC.addCnvCol("if_wrk_no", "wrk_no", MAC_IF_COL_TYP.WRK_NO);
			_ifDBC.addCnvCol("if_tterm_cd1", "tterm_cd1", MAC_IF_COL_TYP.TTERM1);
			_ifDBC.addCnvCol("if_tterm_cd2", "tterm_cd2", MAC_IF_COL_TYP.TTERM2);
			_ifDBC.addCnvCol("if_tterm_cd3", "tterm_cd3", MAC_IF_COL_TYP.TTERM3);
			_ifDBC.addCnvCol("if_trnspt_cd", "trnspt_cd", MAC_IF_COL_TYP.TRNSPT);
			_ifDBC.addCnvCol("if_load_port_cd", "load_port_cd", MAC_IF_COL_TYP.PORT);
			_ifDBC.addCnvCol("if_dschrg_port_cd", "dschrg_port_cd", MAC_IF_COL_TYP.PORT);
			_ifDBC.addCnvCol("if_via_port_cd", "via_port_cd", MAC_IF_COL_TYP.PORT);
			_ifDBC.addCnvItmCol("if_itm_cd", "if_itm_sub1", "if_itm_sub2", "if_itm_sub3", "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
			_ifDBC.addCnvCol("if_cntry_org_cd", "cntry_org_cd", MAC_IF_COL_TYP.CNTRY);
			_ifDBC.addCnvCol("if_gd_cd", "gd_cd", MAC_IF_COL_TYP.GD);
			_ifDBC.addCnvCol("if_trd_unit_cd", "trd_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("if_dscnt_rsn_cd", "dscnt_rsn_cd", MAC_IF_COL_TYP.BIZ_RSN);
			_ifDBC.addCnvCol("if_ship_wh_cd", "ship_wh_cd", MAC_IF_COL_TYP.LG_GRP);
			_ifDBC.addCnvCol("if_maker_cd", "maker_cd", MAC_IF_COL_TYP.BP);
		}
		
		@Override
		protected void pushAlertMsg() {
			
			Map<List<String>, MCMessageList> map = new HashMap<List<String>, MCMessageList>();
			
			MCMessageList msgList = MCMessagePool.getMessageList();
			MCList<MST_SLO_RECV_IF_R> ifL = MCList.create(MST_SLO_RECV_IF_R.class);

			for (MCDBContainer row : _ifDBC.getExIfL()) {
				MST_SLO_RECV_IF_R ifR = (MST_SLO_RECV_IF_R)row;
				if (!isNull(ifR.cst_cd())) {
					ifL.add(ifR);
				}
			}
			if (ifL.isEmpty()) {
				return;
			}
			
			initCstUsrCache(ifL);
			initDptCache(ifL);
			initUsrDptCache(ifL);
			
			for (MST_SLO_RECV_IF_R ifR : ifL) {
				for (MCMessage msg : msgList) {
					if (msg.getCauseRow() == ifR) {
						
						List<String> keyList = new ArrayList<String>();
						keyList.add(ifR.cst_cd());
						
						MST_SLO_R sloR = null;
						if (MAC_DATA_CRUD_TYP.isUPD(ifR.data_crud_typ()) ||
								MAC_DATA_CRUD_TYP.isDEL(ifR.data_crud_typ())) {
							sloR = getSloR(ifR);
						}
						
						if (MAC_DATA_CRUD_TYP.isDEL(ifR.data_crud_typ())) {
							keyList.add(sloR.wg_cd());
							keyList.add(sloR.sls_usr_cd());
						}
						else {
						
							String slsUsrCd = null;
							
							MAM_CST_USR_R cstUsrR = getCstUsrCache(ifR.cst_cd());
							
							slsUsrCd = ifR.sls_usr_cd();
							
							if (MAC_DATA_CRUD_TYP.isUPD(ifR.data_crud_typ())
									&& !isNull(sloR) 
									&& (isNull(ifR.sls_usr_cd()))) {
								// データ更新区分が更新　かつ　受信受信ＩＦの売上担当者が設定されてない場合、受注の売上担当者を保持する
								slsUsrCd = sloR.sls_usr_cd();
							}
							
							if (isNull(slsUsrCd)) {
								slsUsrCd = cstUsrR.usr_cd();
							}
							
							if (!isNull(slsUsrCd)) {
								
								String slsDptCd = getSlsDptBySlsUsr(slsUsrCd, cstUsrR.dpt_cd());
								MAM_DPT_R dptR = getDptCache(slsDptCd);
								keyList.add(dptR.wg_cd());
								keyList.add(slsUsrCd);
							}
							else { 
							
								String slsDptCd = null;
								
								if (!isNull(ifR.sls_dpt_cd())) {
									// 受注受信ＩＦの売上部門を優先に設定する
									slsDptCd = ifR.sls_dpt_cd();
								}
								else {
									
									if (MAC_DATA_CRUD_TYP.isUPD(ifR.data_crud_typ())
											&& !isNull(sloR) 
											&& (isNull(ifR.sls_usr_cd()) || isSame(ifR.sls_usr_cd(), sloR.sls_usr_cd()))) {
										// データ更新区分が更新　かつ　売上担当者が変わってない場合は、受注の売上担当部門を設定する。
										slsDptCd = sloR.sls_dpt_cd();
									}
									else {
										if (!isNull(cstUsrR.dpt_cd())) {
											// 得意先担当マスタの売上部門を設定する。
											slsDptCd = cstUsrR.dpt_cd();
										}
									}
								}
								
								if (!isNull(slsDptCd)) {
										
									MAM_DPT_R dptR = getDptCache(slsDptCd);
									keyList.add(dptR.wg_cd());
									keyList.add(null);
								}
							}
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
		
		protected MST_SLO_R getSloR(MST_SLO_RECV_IF_R ifR) {
			MCList<MST_SLO_R> sloL = MCList.create(MST_SLO_R.class);
			MST_SLO_R t = MST_SLO_R.create("T");
			MCQueryApiBuilder sloL_bldr = MCQueryApiBuilder.create(t);
			MST_SLO_R sloR = MST_SLO_R.create();
			MST_SLO_D_R t2 = MST_SLO_D_R.create("T2");
			
			sloL_bldr.addInnerJoin(t2, bracket(t.slo_no.eq(t2.slo_no)));
			sloL_bldr.addWhereWithAnd(t.cst_cd.eq(bind("1")), ifR.cst_cd());
			sloL_bldr.addWhereWithAnd(t.cst_po_no.eq(bind("1")), ifR.cst_po_no());
			sloL_bldr.addWhereWithAnd(
					bracket(t2.cst_po_d_no.isNull().or(t2.cst_po_d_no.eq(bind("1")))),
					ifR.cst_po_d_no());
			sloL_bldr.addWhereWithAnd(t2.can_flg.eq(value(false)));
			
			dbSelect("MSLAL7120_MST_SLO_S01", sloL, sloL_bldr);
			
			if (!sloL.isEmpty()) {
				sloR = sloL.get(0);
			}
			return sloR;
		}
		
		/**
		 * 	マスタキャッシュ
		 */
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt;
		protected FXUCL_MCDbcCacheStEnd<MAM_CST_USR_R> _cacheCstUsr;
		
		protected MAM_DPT_R getDptCache(String dptCd) {
			return _cacheDpt.get(getToday(), dptCd);
		}
		
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> initDptCache(MCList<MST_SLO_RECV_IF_R> ifL) {
			if (_cacheDpt == null){
				MAM_DPT_R t = MAM_DPT_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setWhere(t.sls_dpt_flg.eq(value(true)));
				_cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dbc_bldr, ifL, MST_SLO_RECV_IF_R.$sls_dpt_cd);
			}
			return _cacheDpt;
		}
		
		protected MAM_CST_USR_R getCstUsrCache(String cstCd) {
			return _cacheCstUsr.get(getToday(), cstCd);
		}
		
		protected FXUCL_MCDbcCacheStEnd<MAM_CST_USR_R> initCstUsrCache(MCList<MST_SLO_RECV_IF_R> ifL) {
			if (_cacheCstUsr == null){
				_cacheCstUsr = new FXUCL_MCDbcCacheStEnd<MAM_CST_USR_R>(MCQueryApiBuilder.create(MAM_CST_USR_R.create("T")), ifL, MST_SLO_RECV_IF_R.$cst_cd);
			}
			return _cacheCstUsr;
		}
		
		protected MCList<MAVM_USR_DPT_R> getUsrDptL(String usrCd) {
			if (!isNull(_usrDptCache)) {
				return _usrDptCache.subList(_usrDptIdx, usrCd);
			}
			else {
				return null;
			}
		}
		protected void initUsrDptCache(MCList<MST_SLO_RECV_IF_R> sloRecvIfL) {
			MCList<MCRow> bindL = MCList.create(MCRow.class);
			bindL.addStringColumn("usr_cd");
			bindL.addDateColumn("slo_dt");
			for (MST_SLO_RECV_IF_R sloRecvIfR : sloRecvIfL) {
				if (!MAC_DATA_CRUD_TYP.isDEL(sloRecvIfR.data_crud_typ())) {
					MCRow bindR = MCRow.create();
					if (!isNull(sloRecvIfR.sls_usr_cd())) {
						bindR.setStringNE("usr_cd", sloRecvIfR.sls_usr_cd());
					}
					else {
						MAM_CST_USR_R cstUsrR = getCstUsrCache(sloRecvIfR.cst_cd());
						bindR.setStringNE("usr_cd", cstUsrR.usr_cd());
					}
					bindL.add(bindR);
				}
			}
			
			MCList<MAVM_USR_DPT_R> usrDptL = MCList.create(MAVM_USR_DPT_R.class);
			usrDptL.addDateColumn("dpt_st_dt");
			usrDptL.addDateColumn("dpt_end_dt");
			MAVM_USR_DPT_R usrDptT = MAVM_USR_DPT_R.create("usrDptT");
			MCQueryApiBuilder usrDptLBldr = MCQueryApiBuilder.create(usrDptT);
			MAM_DPT_R dptM = MAM_DPT_R.create("dptM");
			
			usrDptLBldr.setSelect(usrDptT.usr_cd, usrDptT.dpt_cd, usrDptT.main_flg, usrDptT.st_dt, usrDptT.end_dt,
					dptM.st_dt.as("dpt_st_dt"), dptM.end_dt.as("dpt_end_dt"));
			
			usrDptLBldr.addInnerJoin(dptM, usrDptT.dpt_cd.eq(dptM.dpt_cd).and(dptM.sls_dpt_flg.eq(value(true))));
			usrDptLBldr.setWhere(usrDptT.usr_cd.eq(bind("usr_cd")));
			usrDptLBldr.addWhereWithAnd(usrDptT.st_dt.lte(bind("1")), getToday());
			usrDptLBldr.addWhereWithAnd(usrDptT.end_dt.gte(bind("1")), getToday());
			usrDptLBldr.addWhereWithAnd(dptM.st_dt.lte(bind("1")), getToday());
			usrDptLBldr.addWhereWithAnd(dptM.end_dt.gte(bind("1")), getToday());
			dbSelect("MSLAL7120_MAVM_USR_DPT_S01", usrDptL, usrDptLBldr, bindL);
			
			if (!isNull(usrDptL)){
				_usrDptCache = usrDptL;
				_usrDptIdx = _usrDptCache.createIndex(MAVM_USR_DPT_R.$usr_cd);
			}
		}
		
		/**
		 * 売上担当者で売上部門を取得する。
		 * @param slsUsrCd 売上担当者
		 * @param cstSlsDptCd 得意先担当者マスタの部門
		 * @return 売上部門
		 */
		protected String getSlsDptBySlsUsr(String slsUsrCd, String cstSlsDptCd) {
			
			String slsDptCd = null;
			
			MCList<MAVM_USR_DPT_R> usrDptL = getUsrDptL(slsUsrCd);
			
			if (!isNull(usrDptL)) {
				MCIndexKey dptIdxkey = usrDptL.createIndex(MAVM_USR_DPT_R.$dpt_cd);
				MCIndexKey mainIdxkey = usrDptL.createIndex(MAVM_USR_DPT_R.$main_flg);
				
				if (usrDptL.contains(dptIdxkey, cstSlsDptCd)) {
					
					slsDptCd = cstSlsDptCd;
				}
				else if (usrDptL.contains(mainIdxkey, true)) {
					
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
	 * SloRecvConv_Conv02オペレーション.<p>
	 *
	 */
	public class SloRecvConv_Conv02 extends MSLAL_SloRecvConvService_MC_A.SloRecvConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		@SuppressWarnings({
			"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MST_SLO_RECV_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_SloPoPrnt.create());
			_IfRptSet.setRowMapper(new Map_MST_SLO_RECV_IF_R_DtlR());
		}
	}
	/**
	 * SloRecvConv_Conv03オペレーション.<p>
	 *
	 */
	public class SloRecvConv_Conv03 extends MSLAL_SloRecvConvService_MC_A.SloRecvConv_Conv03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		@SuppressWarnings({
			"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MST_SLO_RECV_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_SloPoPrnt.create());
			_IfRptSet.setRowMapper(new Map_MST_SLO_RECV_IF_R_DtlR());
		}
		
		@Override
		protected void setRptSetData() {
			_IfRptSet.getReportSet().addAll(up1());
		}
	}
	
	
	public class Map_MST_SLO_RECV_IF_R_DtlR<D extends MST_SLO_RECV_IF_R, S extends DtlR, W extends PFT_SDRV_IF_R>  
		extends MAUCC_RowMapperWith<D, S, W> {
		
		protected W _ifR;
		@Override
		public void setWith(W ifR){
			this._ifR = ifR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_SLO_RECV_IF_R.$data_crud_typ, DtlR.$data_crud_typ);
			addColumnPathMap(MST_SLO_RECV_IF_R.$data_make_dt, DtlR.$data_make_dt);
			addColumnPathMap(MST_SLO_RECV_IF_R.$po_dt, DtlR.$po_dt);
			addColumnPathMap(MST_SLO_RECV_IF_R.$purc_id_typ, DtlR.$purc_id_typ);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sls_cststk_flg, DtlR.$sls_cststk_flg);
			addColumnPathMap(MST_SLO_RECV_IF_R.$slo_typ, DtlR.$slo_typ);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tdlv_nm, DtlR.$tdlv_nm);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tdlv_cntct_dpt, DtlR.$tdlv_cntct_dpt);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tdlv_cntct_psn, DtlR.$tdlv_cntct_psn);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tdlv_zip_cd, DtlR.$tdlv_zip_cd);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tdlv_addr1, DtlR.$tdlv_addr1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tdlv_addr2, DtlR.$tdlv_addr2);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tdlv_addr3, DtlR.$tdlv_addr3);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tdlv_addr4, DtlR.$tdlv_addr4);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tdlv_tel, DtlR.$tdlv_tel);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tdlv_fax, DtlR.$tdlv_fax);
			addColumnPathMap(MST_SLO_RECV_IF_R.$dlv_day_week_typ, DtlR.$dlv_day_week_typ);
			addColumnPathMap(MST_SLO_RECV_IF_R.$pri_prnt_typ, DtlR.$pri_prnt_typ);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tterm_rmrks1, DtlR.$tterm_rmrks1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tterm_rmrks2, DtlR.$tterm_rmrks2);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tterm_rmrks3, DtlR.$tterm_rmrks3);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sno1, DtlR.$sno1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sno2, DtlR.$sno2);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sno3, DtlR.$sno3);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sno4, DtlR.$sno4);
			addColumnPathMap(MST_SLO_RECV_IF_R.$trd_unit_qty, DtlR.$trd_unit_qty);
			addColumnPathMap(MST_SLO_RECV_IF_R.$inc_tax_flg, DtlR.$inc_tax_flg);
			addColumnPathMap(MST_SLO_RECV_IF_R.$interim_flg, DtlR.$interim_flg);
			addColumnPathMap(MST_SLO_RECV_IF_R.$trd_cur_upri, DtlR.$trd_cur_upri);
			addColumnPathMap(MST_SLO_RECV_IF_R.$trd_cur_amt, DtlR.$trd_cur_amt);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tax_fix_flg, DtlR.$tax_fix_flg);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tax_rate, DtlR.$tax_rate);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tax_typ, DtlR.$tax_typ);
			addColumnPathMap(MST_SLO_RECV_IF_R.$trd_cur_tax_amt, DtlR.$trd_cur_tax_amt);
			addColumnPathMap(MST_SLO_RECV_IF_R.$trd_cur_dscnt_amt, DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(MST_SLO_RECV_IF_R.$ship_block_flg, DtlR.$ship_block_flg);
			addColumnPathMap(MST_SLO_RECV_IF_R.$abort_flg, DtlR.$abort_flg);
			addColumnPathMap(MST_SLO_RECV_IF_R.$set_itm_grp_no, DtlR.$set_itm_grp_no);
			addColumnPathMap(MST_SLO_RECV_IF_R.$ver_no, DtlR.$ver_no);
			addColumnPathMap(MST_SLO_RECV_IF_R.$lot_no, DtlR.$lot_no);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sublot_no, DtlR.$sublot_no);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char1, DtlR.$sub_char1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char2, DtlR.$sub_char2);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char3, DtlR.$sub_char3);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char4, DtlR.$sub_char4);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char5, DtlR.$sub_char5);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char6, DtlR.$sub_char6);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char7, DtlR.$sub_char7);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char8, DtlR.$sub_char8);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char9, DtlR.$sub_char9);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char10, DtlR.$sub_char10);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char11, DtlR.$sub_char11);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char12, DtlR.$sub_char12);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char13, DtlR.$sub_char13);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char14, DtlR.$sub_char14);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char15, DtlR.$sub_char15);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char16, DtlR.$sub_char16);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char17, DtlR.$sub_char17);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char18, DtlR.$sub_char18);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char19, DtlR.$sub_char19);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char20, DtlR.$sub_char20);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char21, DtlR.$sub_char21);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char22, DtlR.$sub_char22);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char23, DtlR.$sub_char23);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char24, DtlR.$sub_char24);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char25, DtlR.$sub_char25);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char26, DtlR.$sub_char26);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char27, DtlR.$sub_char27);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char28, DtlR.$sub_char28);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char29, DtlR.$sub_char29);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char30, DtlR.$sub_char30);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_num1, DtlR.$sub_num1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_num2, DtlR.$sub_num2);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_num3, DtlR.$sub_num3);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_num4, DtlR.$sub_num4);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_num5, DtlR.$sub_num5);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_dt1, DtlR.$sub_dt1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_dt2, DtlR.$sub_dt2);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_dt3, DtlR.$sub_dt3);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_dt4, DtlR.$sub_dt4);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_dt5, DtlR.$sub_dt5);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_char1, DtlR.$edi_sub_char1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_char2, DtlR.$edi_sub_char2);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_char3, DtlR.$edi_sub_char3);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_char4, DtlR.$edi_sub_char4);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_char5, DtlR.$edi_sub_char5);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_num1, DtlR.$edi_sub_num1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_dt1, DtlR.$edi_sub_dt1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_d_char1, DtlR.$edi_sub_d_char1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_d_char2, DtlR.$edi_sub_d_char2);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_d_char3, DtlR.$edi_sub_d_char3);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_d_char4, DtlR.$edi_sub_d_char4);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_d_char5, DtlR.$edi_sub_d_char5);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_d_num1, DtlR.$edi_sub_d_num1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_d_dt1, DtlR.$edi_sub_d_dt1);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.data_lno(getSequence(MSC_NUM_SYS_TYP.SLORECVIF.value()));
			dest.data_no(_ifR.data_no());
			dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
			dest.ext_sys_cd(_ifR.ext_sys_cd());
			dest.ext_data_no(src.data_no());
			dest.ext_data_lno(src.data_lno());
			dest.imp_flg(true);
			dest.recv_dt(getToday());
			dest.cst_po_no(src.po_no());
			dest.cst_po_rev(src.po_rev());
			dest.cst_po_d_no(src.po_d_no());
			dest.if_cst_cd(src.po_co_cd());
			dest.if_cst_nm(src.po_co_nm());
			dest.if_dest_cd1(src.dest_cd1());
			dest.if_dest_nm1(src.dest_nm1());
			dest.if_dest_cd2(src.dest_cd2());
			dest.if_dest_nm2(src.dest_nm2());
			dest.if_dest_cd3(src.dest_cd3());
			dest.if_dest_nm3(src.dest_nm3());
			dest.if_cur_cd(src.trd_cur_cd());
			dest.if_sls_dpt_cd(src.sls_dpt_cd());
			dest.if_sls_dpt_nm(src.sls_dpt_nm());
			dest.if_sls_usr_cd(src.sls_usr_cd());
			dest.if_sls_usr_nm(src.sls_usr_nm());
			dest.if_dlv_cd(src.in_to_id_cd());
			dest.dlv_nm(src.in_to_nm());
			dest.dlv_cntct_dpt(src.in_to_cntct_dpt());
			dest.dlv_cntct_psn(src.in_to_cntct_psn());
			dest.dlv_zip_cd(src.in_to_zip_cd());
			dest.dlv_addr1(src.in_to_addr1());
			dest.dlv_addr2(src.in_to_addr2());
			dest.dlv_addr3(src.in_to_addr3());
			dest.dlv_addr4(src.in_to_addr4());
			dest.dlv_tel(src.in_to_tel());
			dest.dlv_fax(src.in_to_fax());
			dest.if_dlv_cntry_cd(src.in_to_cntry_cd());
			dest.if_tdlv_cd(src.tdlv_cd());
			dest.if_tdlv_cntry_cd(src.tdlv_cntry_cd());
			dest.if_wrk_no(src.wrk_no());
			dest.if_wrk_nm(src.wrk_nm());
			dest.if_tterm_cd1(src.tterm_cd1());
			dest.if_tterm_nm1(src.tterm_nm1());
			dest.if_tterm_cd2(src.tterm_cd2());
			dest.if_tterm_nm2(src.tterm_nm2());
			dest.if_tterm_cd3(src.tterm_cd3());
			dest.if_tterm_nm3(src.tterm_nm3());
			dest.if_trnspt_cd(src.trnspt_cd());
			dest.if_trnspt_nm(src.trnspt_nm());
			dest.if_load_port_cd(src.load_port_cd());
			dest.if_load_port_nm(src.load_port_nm());
			dest.if_dschrg_port_cd(src.dschrg_port_cd());
			dest.if_dschrg_port_nm(src.dschrg_port_nm());
			dest.if_via_port_cd(src.via_port_cd());
			dest.if_via_port_nm(src.via_port_nm());
			dest.cst_itm_cd(src.po_co_itm_cd());
			dest.cst_itm_nm(src.po_co_itm_nm());
			dest.itm_nm(nvl(src.slo_co_itm_nm(), src.po_co_itm_nm()));
			dest.if_itm_cd(nvl(src.slo_co_itm_cd(), src.po_co_itm_cd()));
			dest.if_itm_sub1(nvl(src.slo_co_itm_sub1(), src.po_co_itm_sub1()));
			dest.if_itm_sub2(nvl(src.slo_co_itm_sub2(), src.po_co_itm_sub2()));
			dest.if_itm_sub3(nvl(src.slo_co_itm_sub3(), src.po_co_itm_sub3()));
			dest.if_itm_nm(src.po_co_itm_nm());
			dest.if_cntry_org_cd(src.cntry_org_cd());
			dest.if_gd_cd(src.gd_cd());
			dest.if_gd_nm(src.gd_nm());
			dest.if_trd_unit_cd(src.trd_unit_cd());
			dest.if_trd_unit_nm(src.trd_unit_nm());
			dest.if_dscnt_rsn_cd(src.dscnt_rsn_cd());
			dest.if_dscnt_rsn_nm(src.dscnt_rsn_nm());
			dest.if_ship_wh_cd(src.ship_wh_cd());
			dest.if_ship_wh_nm(src.ship_wh_nm());
			dest.dlv_rqst_tm(getYmdHm(src.dlv_rqst_dt(), src.dlv_rqst_hm()));
			dest.accpt_schd_dt(src.purc_schd_dt());
			dest.if_maker_cd(src.maker_cd());
			dest.if_maker_nm(src.maker_nm());
			dest.trd_rmrks(src.dlv_slip_rmrks());
			dest.trd_d_rmrks(src.dlv_slip_d_rmrks());
			dest.cst_po_rmrks(src.po_print_rmrks());
			dest.cst_po_d_rmrks(src.po_print_d_rmrks());
			dest.if_co_cd(src.slo_co_cd());
			dest.if_co_nm(src.slo_co_nm());

			MAM_EXT_SYS_R extSysR = getExtSysR(dest.ext_sys_cd());
			dest.upri_not_chk_flg(extSysR.upri_not_chk_flg());
			dest.amt_not_chk_flg(extSysR.amt_not_chk_flg());
			dest.tax_not_chk_flg(extSysR.tax_not_chk_flg());
		}
	}

	protected FXUCL_MCDbcCache<MAM_EXT_SYS_R> _extSys;

	protected MAM_EXT_SYS_R getExtSysR(String extSysCd) {
		if (_extSys == null) {
			MAM_EXT_SYS_R t = MAM_EXT_SYS_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.ext_sys_cd);
			dbc_bldr.addSelect(t.upri_not_chk_flg);
			dbc_bldr.addSelect(t.amt_not_chk_flg);
			dbc_bldr.addSelect(t.tax_not_chk_flg);
			
			_extSys = new FXUCL_MCDbcCache<MAM_EXT_SYS_R>(dbc_bldr);
		}
		return _extSys.get(extSysCd);
	}

	//FMCB CUSTOM END
}