package mcframe.serverMSBE.MSBEL0120;

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
import mcframe.serverMSBE.MSBEL0120.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Sprt01_CndR;
import mcframe.serverMSBE.MSBEL5040.MSBEL_AllocMngService;
import mcframe.serverMSBE.MSBEL5040.Srch_RsltR;
import mcframe.serverMSBE.MSBEL5040.Srch_TgtR;
import mcframe.serverMSBE.MSBEL5500.Alloc_RsltR;
import mcframe.serverMSBE.MSBEL5500.MSBEL_ShipSchdService;
import mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR;
import mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR;
import mcframe.serverMSBE.MSBEL5510.MSBEL_ShipSchdDtCalcService;
import mcframe.serverMSBE.MSBEL5520.MSBEL_ShipLotChkService;
import mcframe.serverMSBE.MSBEL5520.ShipLot_DtlR;
import static mcframe.serverMSBE.MSBEL0120.Query.*;
import mcframe.serverMSBB.MSBBL6080.MSBBL_SloStsRegService;
import mcframe.serverMSBB.MSBBL6080.SloSts_DtlR;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_AllocChng"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_AllocChng_MC extends MSBEL_AllocChng_MC_A{
	//FMCB CUSTOM START
	
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 引当変更前チェック処理を実行する。<br>
	 */
	public class Chk01 extends MSBEL_AllocChng_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void initUpSub() {
			super.initUpSub();
			
			// 出荷引当状況ＮＯがnullの場合、在庫・入庫予定とみなす。
			for (ShipAllocR up1R : up1()) {
				up1R.vstk_in_schd_flg(isNull(up1R.ship_alloc_sts_no()) ? true : false);
			}
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			if (!hasErr()) {
				
				callShipSchdServiceChk06();
			}
			
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			msgL.addAll(chkShipSchd());
			
			msgL.addAll(chkShipAlloc());
			
			msgL.addAll(chkSame());
			
			msgL.addAll(chkAllocChngQty());
			
			msgL.addAll(chkWaitQty());
			
			return msgL;
		}
		
		/**
		 * 振替先の出荷予定ＮＯを元に、出荷進捗の排他チェックを行う。<br>
		 * ＤＡＣチェックを行う。優先順：場所＞出荷物流Ｇ＞総量引当場所Ｇ<br>
		 * 保留数量、基準単位ＣＤを補完する。
		 * @return メッセージリスト
		 */
		protected MCMessageList chkShipSchd() {

			MCMessageList msgL = new MCMessageList();
			
			if (!up0().err_flg()) {
				
				ShipSchdR lockR = ShipSchdR.create();
				executeQuery(lockR, MSBEL0120_MST_SHIP_PR_S01(), up0());
				
				msgL.addAll(checkUpdCntrNE(up0(), ShipSchdR.$ship_pr_upd_cntr, lockR));
				
				if (!isNull(lockR) && !lockR.isEmpty()) {
					
					lockR.setAttributes(up0());
					
					if (!isNull(lockR.loc_cd())) {
						
						msgL.addAll(checkWritableLocCdDac(lockR, MST_SHIP_PR_R.$loc_cd));
					}
					else if (!isNull(lockR.ship_lg_grp_cd())) {
						
						msgL.addAll(checkWritableLgGrpCdDac(lockR, MST_SHIP_PR_R.$ship_lg_grp_cd));
					}
					else if (!isNull(lockR.alloc_grp_cd())) {
						msgL.addAll(checkWritableAlcGrpCdDac(lockR, MST_SHIP_PR_R.$alloc_grp_cd));
					}
					
					lockR.peg_no(up0().peg_no());
					lockR.ship_schd_no(up0().ship_schd_no());
					lockR.ship_pr_upd_cntr(up0().ship_pr_upd_cntr());
					lockR.err_flg(up0().err_flg());
					
					setshipFrLgGrpCd(lockR);
					
					MCRow.copyall(up0(), lockR);
				}
			}
			
			return msgL;
		}
		
		/**
		 * 出荷元物流グループＣＤを設定する。
		 * @param shiSchdR 出荷予定
		 */
		protected void setshipFrLgGrpCd(ShipSchdR shiSchdR) {
				
			shiSchdR.alloc_ship_lg_grp_cd(shiSchdR.ship_fr_lg_grp_cd());
			
			if (isNull(shiSchdR.ship_fr_lg_grp_cd())) {
				
				MAM_LOC_R locR = getLoc(shiSchdR);
				
				if (!isNull(locR)) {
					shiSchdR.ship_fr_lg_grp_cd(locR.lg_grp_cd());
				}
			}
		}
		
		/**
		 * 場所マスタの情報を取得する。
		 * @param shiSchdR 出荷予定
		 * @return 場所マスタ
		 */
		protected MAM_LOC_R getLoc(ShipSchdR shiSchdR) {
			
			MAM_LOC_R locR = MAM_LOC_R.create();
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locR_bldr = MCQueryApiBuilder.create(t);
			locR_bldr.setSelect(t.lg_grp_cd);
			
			dbSelectKey("MSBEL0120_MAM_LOC_S01", locR, locR_bldr, nvl(shiSchdR.loc_cd(), shiSchdR.def_loc_cd()));
			
			return locR;
		}
		
		/**
		 * 振替元の出荷引当状況ＮＯを元に、出荷進捗の排他チェックを行う。<br>
		 * ＤＡＣチェックを行う。優先順：場所＞出荷物流Ｇ＞総量引当場所Ｇ<br>
		 * 引当可能数量、取引単位ＣＤなどを補完する。
		 * @return メッセージリスト
		 */
		protected MCMessageList chkShipAlloc() {

			MCMessageList msgL = new MCMessageList();
			
			MCList<ShipAllocR> notErrL = getChkList(up1().subList(ShipAllocR.$vstk_in_schd_flg, false));
			
			if (!notErrL.isEmpty()) {
				
				ShipAllocR bindR = ShipAllocR.create();
				bindR.ship_alloc_sts_no(MCStringUtil.arrayValueJoin(notErrL.getStringNE(ShipAllocR.$ship_alloc_sts_no).toArray(new String[0])));
				
				MCList<ShipAllocR> lockL = MCList.create(ShipAllocR.class);
				executeQuery(lockL, MSBEL0120_MST_SHIP_ALLOC_STS_S02(), bindR);
				
				
				MCIndexKey idxkey = lockL.createIndex(ShipAllocR.$ship_alloc_sts_no);
				ShipAllocR lockR = null;
				
				for (ShipAllocR shipAllocR : notErrL) {
				
					lockR = lockL.getFirst(idxkey, shipAllocR.ship_alloc_sts_no());
					lockR.setAttributes(shipAllocR);
					
					msgL.addAll(checkUpdCntrNE(shipAllocR, ShipAllocR.$ship_pr_upd_cntr, lockR));
					
					if (!isNull(lockR)) {
						
						lockR.setAttributes(shipAllocR);
						
						if (!isNull(lockR.loc_cd())) {
							
							msgL.addAll(checkWritableLocCdDac(lockR, MST_SHIP_PR_R.$loc_cd));
						}
						else if (!isNull(lockR.ship_lg_grp_cd())) {
							
							msgL.addAll(checkWritableLgGrpCdDac(lockR, MST_SHIP_PR_R.$ship_lg_grp_cd));
						}
						else if (!isNull(lockR.alloc_grp_cd())) {
							msgL.addAll(checkWritableAlcGrpCdDac(lockR, MST_SHIP_PR_R.$alloc_grp_cd));
						}
						
						lockR.peg_no(shipAllocR.peg_no());
						lockR.ship_alloc_sts_no(shipAllocR.ship_alloc_sts_no());
						lockR.alloc_chng_qty(shipAllocR.alloc_chng_qty());
						lockR.ship_pr_upd_cntr(shipAllocR.ship_pr_upd_cntr());
						lockR.err_flg(shipAllocR.err_flg());

						MCRow.copyall(shipAllocR, lockR);
					}
				}
			}
			
			if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(up0().alloc_scope_typ())) {
				// 総量引当の場合に、以下の情報が画面に表示してないため、補完する
				MCList<ShipAllocR> vstkInSchdL = getChkList(up1().subList(ShipAllocR.$vstk_in_schd_flg, true));
				
				for (ShipAllocR shipAllocR : vstkInSchdL) { 
					
					shipAllocR.ship_loc_cd(up0().loc_cd());
					shipAllocR.ship_str_ln_cd(up0().str_ln_cd());
					shipAllocR.lot_no(up0().lot_no());
					shipAllocR.sublot_no(up0().sublot_no());
				}
			}
			
			return msgL;
		}
		
		/**
		 * 振替先と振替元の情報が一致するかチェックする。
		 * @return メッセージリスト
		 */
		protected MCMessageList chkSame() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<ShipAllocR> notErrL = getChkList(up1());
			
			for (ShipAllocR shipAllocR : notErrL) {
				
				if (!isSameStkBaseNoVstkInSchd(shipAllocR)
						|| !isSameStkBaseCommon(shipAllocR)
						|| !isSameVerNo(shipAllocR)
						|| !isSameStkIdTyp(shipAllocR)
						|| !isSameSno(shipAllocR)
						|| !isSamePackUnit(shipAllocR)
						|| !isSameAllocScopeLoc(shipAllocR)
						|| !isSameAllocScopeAllocGrp(shipAllocR)) {
					
					msgL.add(new MCMessage(shipAllocR, null, MSBEL0164, toDispGUIIndex(shipAllocR)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 振替元と振替先の在庫キー基本情報が一致するか(在庫・入庫予定以外)。
		 * @param shipAllocR 振替元
		 * @return 振替元と振替先の版ＮＯが一致する場合はtrue
		 */
		protected boolean isSameStkBaseNoVstkInSchd(ShipAllocR shipAllocR) {
			
			if (shipAllocR.vstk_in_schd_flg()) {
				return true;
			}
			
			return isSame(shipAllocR.itm_cd(), up0().itm_cd())
					&& isSame(shipAllocR.itm_sub1(), up0().itm_sub1())
					&& isSame(shipAllocR.itm_sub2(), up0().itm_sub2())
					&& isSame(shipAllocR.itm_sub3(), up0().itm_sub3())
					&& isSame(shipAllocR.gd_cd(), up0().gd_cd())
					&& isSame(shipAllocR.quality_typ(), up0().quality_typ())
					&& isSame(shipAllocR.stk_insp_typ(), up0().stk_insp_typ());

		}
		
		/**
		 * 振替元と振替先の在庫キー基本情報が一致するか(共通)。
		 * @param shipAllocR 振替元
		 * @return 振替元と振替先の版ＮＯが一致する場合はtrue
		 */
		protected boolean isSameStkBaseCommon(ShipAllocR shipAllocR) {
			
			return (isNull(up0().str_ln_cd()) || isSame(shipAllocR.ship_str_ln_cd(), up0().str_ln_cd()))
					   && (isNull(up0().lot_no()) ||isSame(shipAllocR.lot_no(), up0().lot_no()))
					   && (isNull(up0().sublot_no()) ||isSame(shipAllocR.sublot_no(), up0().sublot_no()));
		}
		
		/**
		 * 振替元と振替先の版ＮＯが一致するか。
		 * @param shipAllocR 振替元
		 * @return 振替元と振替先の版ＮＯが一致する場合はtrue
		 */
		protected boolean isSameVerNo(ShipAllocR shipAllocR) {
			
			return !up0().ver_flg() || isSame(shipAllocR.ver_no(), up0().ver_no());
		}
		
		/**
		 * 振替元と振替先の在庫識別区分が一致するか。
		 * @param shipAllocR 振替元
		 * @return 振替元と振替先の在庫識別区分が一致する場合はtrue
		 */
		protected boolean isSameStkIdTyp(ShipAllocR shipAllocR) {
			
			// 移動・移送予定の場合は、ＶＭＩ在庫、無償受給を引当できるよう
			if ((MAC_TRD_PTN_TYP.isXFR(up0().trd_ptn_typ()) 
				|| MAC_TRD_PTN_TYP.isPROV(up0().trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isXFR_RTN(up0().trd_ptn_typ()) 
				|| MAC_TRD_PTN_TYP.isPROV_RTN(up0().trd_ptn_typ())) 
					&& MSC_STK_ID_TYP.isCOSTK(up0().stk_id_typ())) {
				
				return MSC_STK_ID_TYP.isCOSTK(shipAllocR.stk_id_typ())
						|| MSC_STK_ID_TYP.isRNT_RCV(shipAllocR.stk_id_typ())
						|| MSC_STK_ID_TYP.isNCV_RCV(shipAllocR.stk_id_typ());
			}
			else {
				return isSame(shipAllocR.stk_id_typ(), up0().stk_id_typ())
						&& isSame(shipAllocR.stk_bp_cd(), up0().stk_bp_cd());
			}
		}
		
		/**
		 * 振替元と振替先の手配ＮＯが一致するか。
		 * @param shipAllocR 振替元
		 * @return 振替元と振替先の手配ＮＯが一致する場合はtrue
		 */
		protected boolean isSameSno(ShipAllocR shipAllocR) {
			
			return (isSame(shipAllocR.sno1(), up0().sno1()) || (up0().sno1_null_flg() && MAC_STR.isNULL_VAL(shipAllocR.sno1())) || MAC_SNO_MNG_TYP.isMNG_NOT_STK(up0().sno1_mng_typ()))
					&& (isSame(shipAllocR.sno2(), up0().sno2()) || (up0().sno2_null_flg() && MAC_STR.isNULL_VAL(shipAllocR.sno2()))  || MAC_SNO_MNG_TYP.isMNG_NOT_STK(up0().sno2_mng_typ()))
					&& (isSame(shipAllocR.sno3(), up0().sno3()) || (up0().sno3_null_flg() && MAC_STR.isNULL_VAL(shipAllocR.sno3()))  || MAC_SNO_MNG_TYP.isMNG_NOT_STK(up0().sno3_mng_typ()))
					&& (isSame(shipAllocR.sno4(), up0().sno4()) || (up0().sno4_null_flg() && MAC_STR.isNULL_VAL(shipAllocR.sno4()))  || MAC_SNO_MNG_TYP.isMNG_NOT_STK(up0().sno4_mng_typ()));
		}
		
		/**
		 * 振替元と振替先の荷姿単位が一致するか。
		 * @param shipAllocR 振替元
		 * @return 振替元と振替先の荷姿単位が一致する場合はtrue
		 */
		protected boolean isSamePackUnit(ShipAllocR shipAllocR) {
			
			return !up0().pack_alloc_flg()
					|| !up0().pack_flg() 
					|| isSame(shipAllocR.pack_unit_cd(), up0().trd_unit_cd());
		}
		
		/**
		 * 振替元が振替先に引当できるか(場所引当)。
		 * @param shipAllocR 振替元
		 * @return 振替元が振替先に引当できる場合はtrue
		 */
		protected boolean isSameAllocScopeLoc(ShipAllocR shipAllocR) {
			
			if (MAC_ALLOC_SCOPE_TYP.isLOC(up0().alloc_scope_typ())) {
				
				return isAllocAblLoc(shipAllocR);
			}
			
			return true;
		}
		
		/**
		 * 振替元が振替先に引当できるか(総量引当)。
		 * @param shipAllocR 振替元
		 * @return 振替元が振替先に引当できる場合はtrue
		 */
		protected boolean isSameAllocScopeAllocGrp(ShipAllocR shipAllocR) {
			
			if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(up0().alloc_scope_typ())) {
				
				if (!isNull(shipAllocR.loc_cd())) {
					
					return isAllocAblLoc(shipAllocR);
				}
				else if (!isNull(shipAllocR.ship_lg_grp_cd())) {
					
					return isAllocAblLgGrp(shipAllocR);
				}
				
				return isSame(shipAllocR.alloc_grp_cd(), up0().alloc_grp_cd());
			}
			
			return true;
		}
		
		/**
		 * 振替元の場所が振替先に引当できるか。
		 * @param shipAllocR 振替元
		 * @return 振替元の場所が振替先に引当できる場合はtrue
		 */
		protected boolean isAllocAblLoc(ShipAllocR shipAllocR) {
			
			MCList<MAM_LOC_R> locL = MCList.create(MAM_LOC_R.class);
			
			if (!isNull(up0().loc_cd())) {
				
				MAM_LOC_R locR = MAM_LOC_R.create();
				locR.loc_cd(up0().loc_cd());
				locL.add(locR);
			}
			else if (!isNull(up0().alloc_ship_lg_grp_cd())) {
				
				locL.addAll(getShipLgGrpLoc(up0().alloc_ship_lg_grp_cd()));
			}
			else if (!isNull(up0().alloc_grp_cd())) {
				
				locL.addAll(getAllocGrpLoc(up0().alloc_grp_cd()));
			}
			
			MCIndexKey idxkey = locL.createIndex(MAM_LOC_R.$loc_cd);
			return locL.contains(idxkey, shipAllocR.ship_loc_cd());
		}
		
		/**
		 * 振替元の出荷元物流Ｇが振替先に引当できるか。
		 * @param shipAllocR 振替元
		 * @return 振替元の出荷元物流Ｇが振替先に引当できる場合はtrue
		 */
		protected boolean isAllocAblLgGrp(ShipAllocR shipAllocR) {
			
			MCList<MAM_LG_GRP_R> lgGrpL = MCList.create(MAM_LG_GRP_R.class);
			
			if (!isNull(up0().alloc_ship_lg_grp_cd())) {
				
				MAM_LG_GRP_R lgGrpR = MAM_LG_GRP_R.create();
				lgGrpR.lg_grp_cd(up0().alloc_ship_lg_grp_cd());
				lgGrpL.add(lgGrpR);
			}
			else if (!isNull(up0().alloc_grp_cd())) {
				
				lgGrpL.addAll(getAllocGrpLgGrp(up0().alloc_grp_cd()));
			}
			
			MCIndexKey idxkey = lgGrpL.createIndex(MAM_LG_GRP_R.$lg_grp_cd);
			return lgGrpL.contains(idxkey, shipAllocR.ship_fr_lg_grp_cd());
		}
		
		/**
		 * 引当振替数量のチェックを行う。
		 * @return メッセージリスト
		 */
		protected MCMessageList chkAllocChngQty() {

			MCMessageList msgL = new MCMessageList();
			
			MCList<ShipAllocR> notErrL = getChkList(up1());
			
			for (ShipAllocR chkR : notErrL) {
				
				if (chkR.vstk_in_schd_flg()) {
					
					if (up0().pack_alloc_flg() && up0().pack_flg()) {
						checkDecPlace(chkR, up0().trd_unit_dec_place().intValue(), ShipAllocR.$alloc_chng_qty);
					}
					else {
						checkDecPlace(chkR, up0().base_unit_dec_place().intValue(), ShipAllocR.$alloc_chng_qty);
					}
				}
				else {
					checkDecPlace(chkR, ShipAllocR.$pack_unit_dec_place, ShipAllocR.$alloc_chng_qty);
					
					if (chkR.alloc_chng_qty().gt(chkR.alloc_abl_qty())) {
					
						msgL.add(new MCMessage(chkR, ShipAllocR.$alloc_chng_qty, MSBEL0150, toDispGUIIndex(chkR)));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 引当振替基準単位数量を算出する。
		 */
		protected void calcChngBaseUnitQty() {

			for (ShipAllocR up1R : up1()) {
				
				if (up1R.vstk_in_schd_flg()) {
					if (up0().pack_alloc_flg() && up0().pack_flg()) {
						
						up1R.alloc_chng_base_unit_qty(
								convToBaseUnit(up1R.alloc_chng_qty(), 
										up0().trd_unit_conv_base_qty(), 
										up0().trd_unit_conv_qty(), 
										up0().base_unit_dec_place(), 
										up0().base_unit_rnd_typ()));
					}
					else {
						
						up1R.alloc_chng_base_unit_qty(up1R.alloc_chng_qty());
					}
				}
				else {
					up1R.alloc_chng_base_unit_qty(
							convToBaseUnit(up1R.alloc_chng_qty(), 
									up1R.pack_unit_conv_base_qty(), 
									up1R.pack_unit_conv_qty(), 
									up1R.base_unit_dec_place(), 
									up1R.base_unit_rnd_typ()));
				}
			}
		}
		
		/**
		 * 保留数量のチェックを行う。
		 * @return メッセージリスト
		 */
		protected MCMessageList chkWaitQty() {
			
			calcChngBaseUnitQty();

			MCMessageList msgL = new MCMessageList();
			
			MCNumber sumAllocChngBaseUnitQty = up1().sum(ShipAllocR.$alloc_chng_base_unit_qty);
			if (up0().wait_qty().lt(sumAllocChngBaseUnitQty)) {
				
				msgL.add(new MCMessage(MSBEL0151, up0().wait_qty(), sumAllocChngBaseUnitQty));
			}
			
			return msgL;
		}
		
		/**
		 * 出荷予定サービスの更新（引当解除）前チェック処理を呼び出す。
		 */
		protected void callShipSchdServiceChk06() {
			
			MCList<ShipAllocR> notErrL = getChkList(up1().subList(ShipAllocR.$vstk_in_schd_flg, false));
			
			if (!notErrL.isEmpty()) {
				
				MSBEL_ShipSchdService.ShipSchd_Chk06 ope = MSBEL_ShipSchdService.crtShipSchd_Chk06();
				
				addAll(ope.up0(), notErrL, createMap_ShipSchd_Upd06_DtlR_ShipAllocR());
				
				ope.exec();
			}
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			
			MCRow.copyall(down0(), up0());
			
			down1().setAll(up1());
		}
	}
	
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 受注や移送から作成された再引当対象（保留）の出荷予定に対して、他の出荷予定で引き当てている在庫・入庫予定、引当可能な在庫、および入庫予定からマニュアルで引当を行う。<br>
	 */
	public class Upd01 extends MSBEL_AllocChng_MC_A.Upd01 {
		
		/**
		 * ロット提案結果
		 */
		protected MCList<Srch_RsltR> _allocRsltL = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			editUp();
			
			callThisChk01();
			
			throwUpdErr();
			
			callShipSchdDtServiceSrch02();
			
			callAllocMngServiceAllocAvlSprt01();
			
			callShipLotChkServiceSrch01();
			
			callAllocMngServiceLockUpd01();
			
			callShipSchdServiceUpd06();
			
			callAllocMngServiceAllocSrch01();
			
			callShipSchdServiceChk02();
			
			throwUpdErr();
			
			callShipSchdServiceUpd02();
			
			callSloStsRegServiceIns01();
		}
		
		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {
			
			setPegNo(up0());
			setPegNo(up1());
		}
		
		/**
		 * チェック処理を実行する。
		 */
		protected void callThisChk01() {
			
			MSBEL_AllocChng.Chk01 ope = MSBEL_AllocChng.crtChk01();
			
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			
			ope.exec();
			
			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}
		
		/**
		 * 出荷予定日計算サービスの出荷予定日計算を呼び出す。<br>
		 * 振替先の出荷予定に対して、出荷予定日、納品予定日を出荷予定日計算サービスで再計算する。
		 */
		protected void callShipSchdDtServiceSrch02() {

			if (!up0().not_dt_calc_flg()) {
			
				MSBEL_ShipSchdDtCalcService.ShipSchdDt_Srch01 ope = MSBEL_ShipSchdDtCalcService.crtShipSchdDt_Srch01();
				
				MSW_SHIP_SCHD_DT_CALC_R opeUp0R = MSW_SHIP_SCHD_DT_CALC_R.create();
				copy(opeUp0R, up0(), createMap_MSW_SHIP_SCHD_DT_CALC_R_ShipSchdR());
				
				// peg_noが重複すると後続のcopyByPegNoに影響が出るため、-1を設定
				opeUp0R.ship_fr_lg_grp_cd(up0().ship_fr_lg_grp_cd());
				opeUp0R.peg_no(-1);
				ope.up0().add(opeUp0R.clone());
				
				for (ShipAllocR up1R : up1()) {
					
					opeUp0R.ship_fr_lg_grp_cd(up1R.ship_fr_lg_grp_cd());
					opeUp0R.peg_no(up1R.peg_no());
					
					ope.up0().add(opeUp0R.clone());
				}
				
				ope.exec();
				
				if (!ope.down0().isEmpty()) {
					
					String[] destCols = new String[] { ShipAllocR.$ship_schd_tm, ShipAllocR.$dlv_schd_tm, ShipAllocR.$ship_wk_cd };
					String[] srcCols = new String[] { MSW_SHIP_SCHD_DT_CALC_R.$ship_schd_tm, MSW_SHIP_SCHD_DT_CALC_R.$dlv_schd_tm, MSW_SHIP_SCHD_DT_CALC_R.$ship_wk_cd };
					
					copyByPegNo(up1(), destCols, ope.down0(), srcCols);
					
					MSW_SHIP_SCHD_DT_CALC_R downR = ope.down0().getFirst(MSW_SHIP_SCHD_DT_CALC_R.$peg_no, MCNumber.valueOf(-1));
					up0().ship_schd_tm(downR.ship_schd_tm());
					up0().dlv_schd_tm(downR.dlv_schd_tm());
					up0().ship_wk_cd(downR.ship_wk_cd());
				}	
			}
		}
		
		/**
		 * 引当管理サービスの引当可能数チェックを呼び出す<br>
		 * 物流制御マスタから引当可能日数を取得し、範囲外であれば引当処理を実行しない。
		 */
		protected void callAllocMngServiceAllocAvlSprt01() {
			
			MSBEL_AllocMngService.Alloc_Avl_Sprt01 ope = MSBEL_AllocMngService.crtAlloc_Avl_Sprt01();
			
			Alloc_Avl_Sprt01_CndR opeUp0R = Alloc_Avl_Sprt01_CndR.create();
			
			copy(opeUp0R, up0(), createMap_Alloc_Avl_Sprt01_CndR_ShipSchdR());
			
			ope.up0().add(opeUp0R);
			
			ope.exec();
			
			if (ope.down0().get(0).exceed_alloc_days_flg()) {
				throw new MCAppException(MSBEL1018);
			}
		}
		
		/**
		 * 出荷ロットチェックサービスの有効期限取得処理を呼び出す。<br>
		 * 出荷ロットから最小・最大の有効期限を取得する。
		 */
		protected void callShipLotChkServiceSrch01() {

			MSBEL_ShipLotChkService.ShipLotChk_Srch01 ope = MSBEL_ShipLotChkService.crtShipLotChk_Srch01();
			
			ShipLot_DtlR opeUp0R = ShipLot_DtlR.create();
			copy(opeUp0R, up0(), createMap_ShipLot_DtlR_ShipSchdR());
			
			for (ShipAllocR up1R : up1()) {
				
				if (!isNull(up1R.dlv_schd_tm())) {
					
					opeUp0R.base_dt(up1R.dlv_schd_tm().startTimeOfDay());
				}
				else if (!isNull(up0().dlv_schd_tm())) {
					
					opeUp0R.base_dt(up0().dlv_schd_tm().startTimeOfDay());
				}
				
				opeUp0R.peg_no(up1R.peg_no());
				
				ope.up0().add(opeUp0R.clone());
			}
			
			ope.exec();
			
			if (!ope.down0().isEmpty()) {
				
				String[] destCols = new String[] { ShipAllocR.$valid_dt_fr, ShipAllocR.$valid_dt_fr_grp, ShipAllocR.$valid_dt_to };
				String[] srcCols = new String[] { ShipLot_DtlR.$valid_dt_fr, ShipLot_DtlR.$valid_dt_fr_grp, ShipLot_DtlR.$valid_dt_to };
				
				copyByPegNo(up1(), destCols, ope.down0(), srcCols);
			}
		}
		
		/**
		 * 在庫引当管理サービスのロックを呼び出す。<br>
		 * 引当処理の前にロックを取得する。
		 */
		protected void callAllocMngServiceLockUpd01() {
			
			MSBEL_AllocMngService.Alloc_Lock_Upd01 ope = MSBEL_AllocMngService.crtAlloc_Lock_Upd01();
			
			MSW_ALLOC_LOC_MAP_R opeUp0R = MSW_ALLOC_LOC_MAP_R.create();
			
			copy(opeUp0R, up0(), createMap_MSW_ALLOC_LOC_MAP_R_ShipSchdR());
			
			ope.up0().add(opeUp0R);
			
			ope.exec();
		}
		
		/**
		 * 出荷予定サービスの更新（引当解除）処理を呼び出す。<br>
		 * 振替元の出荷引当状況ごとに引当解除を行う。
		 */
		protected void callShipSchdServiceUpd06() {
			
			MCList<ShipAllocR> shipAllocL = up1().subList(ShipAllocR.$vstk_in_schd_flg, false);
			
			if (!isNull(shipAllocL) && !shipAllocL.isEmpty()) {
				
				MSBEL_ShipSchdService.ShipSchd_Upd06 ope = MSBEL_ShipSchdService.crtShipSchd_Upd06();
				addAll(ope.up0(), shipAllocL, createMap_ShipSchd_Upd06_DtlR_ShipAllocR());
				
				ope.exec();
			}
		}
		
		/**
		 * 引当管理サービスのロット提案算出を呼び出す。<br>
		 * 振替先に適する在庫や入庫予定を算出する
		 */
		protected void callAllocMngServiceAllocSrch01() {
			
			MSBEL_AllocMngService.Alloc_Srch01 ope = MSBEL_AllocMngService.crtAlloc_Srch01();
			
			crtMSBEL5040Up0(ope);
			crtMSBEL5040Up1(ope);
			
			ope.exec();
			
			_allocRsltL = ope.down0();
			
			chkNotLotMix();
		}
		
		/**
		 * 引当管理サービスのロット提案算出の上り電文０を設定する。
		 * @param ope ロット提案算出オペレーション
		 */
		protected void crtMSBEL5040Up0(MSBEL_AllocMngService.Alloc_Srch01 ope) {

			ope.up0().stk_flg(false);
			ope.up0().short_ope_typ(MSC_SHORT_OPE_TYP.FIN.value());
			ope.up0().lot_prop_typ(MSC_LOT_PROP_TYP.LOT.value());
			ope.up0().except_alloc_wait_flg(true);
			ope.up0().nm_srch_flg(false);
		}
		
		/**
		 * 引当管理サービスのロット提案算出の上り電文１を設定する。
		 * @param ope ロット提案算出オペレーション
		 */
		protected void crtMSBEL5040Up1(MSBEL_AllocMngService.Alloc_Srch01 ope) {
			
			Srch_TgtR tgtR = Srch_TgtR.create();
			
			copy(tgtR, up0(), createMap_Srch_TgtR_ShipSchdR());
			cmpNotLotFixFlg();
			
			for (ShipAllocR up1R : up1()) {
				
				tgtR.peg_no(up1R.peg_no());
				
				tgtR.gi_lg_grp_cd(up1R.ship_fr_lg_grp_cd());
				tgtR.gi_loc_cd(up1R.ship_loc_cd());
				tgtR.gi_str_ln_cd(up1R.ship_str_ln_cd());
				tgtR.lot_no(up1R.lot_no());
				tgtR.sublot_no(up1R.sublot_no());
				
				if (isNull(tgtR.lot_no())) {
					tgtR.not_lot_fix_flg(up0().getBooleanNE("not_lot_fix_flg"));
				}
				
				tgtR.sno1(up1R.sno1());
				tgtR.sno2(up1R.sno2());
				tgtR.sno3(up1R.sno3());
				tgtR.sno4(up1R.sno4());
				
				tgtR.stk_id_typ(up1R.stk_id_typ());
				tgtR.stk_bp_cd(up1R.stk_bp_cd());
				
				tgtR.vld_dt_fr(up1R.valid_dt_fr());
				tgtR.vld_dt_fr_grp(up1R.valid_dt_fr_grp());
				tgtR.vld_dt_to(up1R.valid_dt_to());

				if (up0().sls_cststk_flg()) {
					tgtR.gi_schd_dt(up0().sls_schd_dt());
				}
				else {
					
					if (!isNull(up1R.ship_schd_tm())) {
						
						tgtR.gi_schd_dt(up1R.ship_schd_tm().startTimeOfDay());
					}
					else if (!isNull(up0().ship_schd_tm())) {
						
						tgtR.gi_schd_dt(up0().ship_schd_tm().startTimeOfDay());
					}
				}
				
				if (!isNull(up1R.dlv_schd_tm())) {
					
					tgtR.gr_schd_dt(up1R.dlv_schd_tm().startTimeOfDay());
				}
				else if (!isNull(up0().dlv_schd_tm())) {
					
					tgtR.gr_schd_dt(up0().dlv_schd_tm().startTimeOfDay());
				}
								
				if (up0().pack_alloc_flg() && up0().pack_flg()) {
					tgtR.pack_unit_qty(up1R.alloc_chng_qty());
				}
			
				tgtR.base_unit_qty(up1R.alloc_chng_base_unit_qty());
				
				ope.up1().add(tgtR.clone());
			}
		}
		
		protected void cmpNotLotFixFlg() {
			up0().setBooleanNE("not_lot_fix_flg", true);
			if (!up0().not_lot_mix_flg() && !up0().not_sublot_mix_flg()) {
				return;
			}
			
			boolean mfgAllocNotLotFixFlg = isSame(getSysParm("MFG_ALLOC_NOT_LOT_FIX_FLG"), "1");
			boolean sloAllocNotLotFixFlg = isSame(getSysParm("SLO_ALLOC_NOT_LOT_FIX_FLG"), "1");
			
			MST_XFR_SCHD_R xfrSchdR = MST_XFR_SCHD_R.create();
			MST_SHIP_PR_R shipPr = MST_SHIP_PR_R.create("SHIP_PR");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(shipPr);
			MST_XFR_SCHD_R xfrSchd = MST_XFR_SCHD_R.create("XFR_SCHD");
			dbc_bldr.setSelect(xfrSchd.xfr_src_typ, xfrSchd.slo_d_no);
			dbc_bldr.addInnerJoin(xfrSchd, bracket(xfrSchd.xfr_schd_no.eq(shipPr.xfr_schd_no)));
			dbSelectKey("MSBEL0120_MST_SHIP_PR_S02", xfrSchdR, dbc_bldr, up0().ship_pr_no());
			if (isNull(xfrSchdR)) {
				return;
			}
			else if (!mfgAllocNotLotFixFlg && isSrcInpt(xfrSchdR)) {
				up0().setBooleanNE("not_lot_fix_flg", false);
			}
			else if (!sloAllocNotLotFixFlg && isSrcSlo(xfrSchdR)) {
				up0().setBooleanNE("not_lot_fix_flg", false);
			}
		}
		protected boolean isSrcInpt(MST_XFR_SCHD_R xfrSchdR) {
			return MSC_XFR_SRC_TYP.isINPT(xfrSchdR.xfr_src_typ()) || MSC_XFR_SRC_TYP.isINPT_RPL(xfrSchdR.xfr_src_typ());
		}
		protected boolean isSrcSlo(MST_XFR_SCHD_R xfrSchdR) {
			return !isNull(xfrSchdR.slo_d_no()) || MSC_XFR_SRC_TYP.isSHIP_RPL(xfrSchdR.xfr_src_typ());
		}
		
		protected void chkNotLotMix() {
			
			String dispItm = toDispItm(up0().itm_cd(), up0().itm_sub1(), up0().itm_sub2(), up0().itm_sub3());
			
			if (up0().not_lot_mix_flg()) {
				MCList<Srch_RsltR>[] lotGrpL = _allocRsltL.groupList(Srch_RsltR.$lot_no);
				if (lotGrpL.length != 1) {
					MCMessagePool.add(new MCMessage(MSBEL1201, dispItm, " "));
				}
			}
			if (up0().not_sublot_mix_flg()) {
				MCList<Srch_RsltR>[] lotGrpL = _allocRsltL.groupList(Srch_RsltR.$sublot_no);
				if (lotGrpL.length != 1) {
					MCMessagePool.add(new MCMessage(MSBEL1202, dispItm, " "));
				}
			}
		}
		
		/**
		 * 出荷予定サービスの更新（出荷予定）前チェックを呼び出す。
		 */
		protected void callShipSchdServiceChk02() {
			
			MSBEL_ShipSchdService.ShipSchd_Chk02 op = MSBEL_ShipSchdService.crtShipSchd_Chk02();
			
			ShipSchd_DtlR chkR = ShipSchd_DtlR.create();
			copy(chkR, up0(), createMap_ShipSchd_DtlR_ShipSchdR());
			
			op.up0().add(chkR);
			op.exec();
		}
		
		/**
		 * 出荷予定サービスの更新（出荷予定）を呼び出す。<br>
		 * 振替先の出荷予定の追加・更新・削除を行う。
		 */
		protected void callShipSchdServiceUpd02() {
				
			MSBEL_ShipSchdService.ShipSchd_Upd02 ope = MSBEL_ShipSchdService.crtShipSchd_Upd02();
			
			ope.up0().lot_chk_flg(true);
			
			crtMSBEL5500Up1(ope);
			
			crtMSBEL5500Up2(ope);
			
			ope.exec();
		}
		
		/**
		 * 出荷予定サービスの更新（出荷予定）の上り電文１を設定する。
		 * @param ope 出荷予定サービスの更新（出荷予定）オペレーション
		 */
		protected void crtMSBEL5500Up1(MSBEL_ShipSchdService.ShipSchd_Upd02 ope) {
			
			ShipSchd_DtlR opeUp0R = ShipSchd_DtlR.create();
			
			copy(opeUp0R, up0(), createMap_ShipSchd_DtlR_ShipSchdR());
			
			ope.up1().add(opeUp0R);

		}
		
		/**
		 * 出荷予定サービスの更新（出荷予定）の上り電文２を設定する。
		 * @param ope 出荷予定サービスの更新（出荷予定）オペレーション
		 */
		protected void crtMSBEL5500Up2(MSBEL_ShipSchdService.ShipSchd_Upd02 ope) {
			
			MCList<Alloc_RsltR> up2L = null;
			
			MCList<MST_SHIP_ALLOC_STS_R> allocL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder allocL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
			
			allocL_bldr.addSelect(t1.ship_fr_lg_grp_cd);
			allocL_bldr.setWhere(createWhere(t, MST_SHIP_ALLOC_STS_R.$ship_schd_no));
			allocL_bldr.addWhereWithAnd(t.alloc_flg.eq(value(true)));
			allocL_bldr.addInnerJoin(t1, t.ship_schd_no.eq(t1.ship_schd_no));
			dbSelect("MSBEL0120_MST_SHIP_ALLOC_STS_S01", allocL, allocL_bldr, up0());
			
			if (!allocL.isEmpty()) {
				// 既存の出荷引当状況を引き継ぐ
				
				up2L = MCList.create(Alloc_RsltR.class);
				
				setAll(up2L, allocL, createMap_Alloc_RsltR_MST_SHIP_ALLOC_STS_R());
				
				up2L.setValue(Alloc_RsltR.$itm_cd, up0().itm_cd());
				up2L.setValue(Alloc_RsltR.$itm_sub1, up0().itm_sub1());
				up2L.setValue(Alloc_RsltR.$itm_sub2, up0().itm_sub2());
				up2L.setValue(Alloc_RsltR.$itm_sub3, up0().itm_sub3());
				
				up2L.setValueNE(Alloc_RsltR.$peg_no, up0().peg_no());
				ope.up2().addAll(up2L);
			}
			
			if (!isNull(_allocRsltL) && !_allocRsltL.isEmpty()) {
				// ロット提案の結果
				
				up2L = MCList.create(Alloc_RsltR.class);
				setAll(up2L, _allocRsltL, createMap_Alloc_RsltR_Srch_RsltR());
				
				up2L.setValueNE(Alloc_RsltR.$peg_no, up0().peg_no());
				
				if (MAC_ALLOC_SCOPE_TYP.isLOC(up0().alloc_scope_typ()) || MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(up0().alloc_scope_typ())) {
					up2L.setValueNE(Alloc_RsltR.$alloc_flg, true);
				}
				
				ope.up2().addAll(up2L);
			}
		}
		
		/**
		 * 受注状況更新サービスの受注状況登録処理を呼び出す。<br>
		 * 振替先、振替元ともに受注状況に「引当先変更」を登録する。<br>
		 * 振替先が＋、振替元が－の数量
		 */
		protected void callSloStsRegServiceIns01() {
			
			MSBBL_SloStsRegService.SloSts_Ins01 ope = MSBBL_SloStsRegService.crtSloSts_Ins01();
			
			// 振替先の受注状況（引当先変更）を設定
			if (!isNull(up0().slo_d_no())) {
				MCGroupByPolicy gp = new MCGroupByPolicy(Srch_RsltR.$pack_unit_cd);
				gp.sum(Srch_RsltR.$pack_unit_qty);
				MCList<Srch_RsltR> allocRsltL = _allocRsltL.groupBy(gp);
				
				Map_SloSts_DtlR_ShipSchdR<SloSts_DtlR,ShipSchdR> mpr = createMap_SloSts_DtlR_ShipSchdR();
				for (Srch_RsltR allocRsltR : allocRsltL) {
					SloSts_DtlR upR = SloSts_DtlR.create();
					copy(upR, up0(), mpr);
					upR.unit_cd(allocRsltR.pack_unit_cd());
					upR.qty(allocRsltR.pack_unit_qty());

					ope.up0().add(upR);
				}
			}
			
			// 振替元の受注状況（引当先変更）を設定
			for (ShipAllocR shipAllocR : up1()) {
				if (!isNull(shipAllocR.slo_d_no())) {
					SloSts_DtlR upR = SloSts_DtlR.create();
					copy(upR, shipAllocR, createMap_SloSts_DtlR_ShipAllocR());
					ope.up0().add(upR);
				}
			}
			
			ope.exec();
		}
	}
	
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 引当先変更対象となる出荷予定を検索する。<br>
	 */
	public class Srch01 extends MSBEL_AllocChng_MC_A.Srch01 {
		
		/**
		 * 振替先の出荷予定
		 */
		protected Srch01_ShipSchdRsltR _shipSchdR = null;
		
		/**
		 * 振替元の出荷予定リスト
		 */
		protected MCList<Srch01_ShipAllocRsltR> _shipAllocL = null;
		
		/**
		 * 振替元の在庫・入庫予定リスト
		 */
		protected MCList<Srch01_ShipAllocRsltR> _vstkInSchdAllocL = null;
		
		/**
		 * 引当可能な場所ワーク
		 */
		protected MCList<MAM_LOC_R> _locWkL = null;
		protected MAM_LOC_R _locWkL_t = MAM_LOC_R.create("T");
		protected MCQueryApiBuilder _locWkL_bldr = MCQueryApiBuilder.create(_locWkL_t);
		
		/**
		 * 引当可能な物流グループワーク
		 */
		protected MCList<MAM_LG_GRP_R> _lgGrpWkL = null;
		protected MAM_LG_GRP_R _lgGrpWkL_t = MAM_LG_GRP_R.create("T");
		protected MCQueryApiBuilder _lgGrpWkL_bldr = MCQueryApiBuilder.create(_lgGrpWkL_t);
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			getShipSchd();
			
			if (!_shipSchdR.isEmpty()) {
				
				chkShipSchd();
				
				if (MCMessagePool.getMessageList().size() > 0) {
					return;
				}
				
				getShipAlloc();
				
				getVstkInSchd();
				
				chkShipAlloc();
			}
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			
			editVstkInSchd();
			
			setDown();
		}
		
		@Override
		protected void initSearch() {
			super.initSearch();
			
			_shipSchdR = Srch01_ShipSchdRsltR.create();
			_shipAllocL = MCList.create(Srch01_ShipAllocRsltR.class);
			_vstkInSchdAllocL = MCList.create(Srch01_ShipAllocRsltR.class);
		}
		
		/**
		 * 振替先の出荷予定を取得する。
		 */
		protected void getShipSchd() {

			executeQuery(_shipSchdR, MSBEL0120_MST_SHIP_SCHD_S01(), up0());
			
			setshipFrLgGrpCd(_shipSchdR);
		}
		
		/**
		 * 出荷元物流グループＣＤを設定する。
		 * @param shiSchdR 出荷予定
		 */
		protected void setshipFrLgGrpCd(Srch01_ShipSchdRsltR shiSchdR) {
				
			shiSchdR.alloc_ship_lg_grp_cd(shiSchdR.ship_fr_lg_grp_cd());
			
			if (isNull(shiSchdR.ship_fr_lg_grp_cd())) {
				
				MAM_LOC_R locR = getLoc(shiSchdR);
				
				if (!isNull(locR)) {
					shiSchdR.ship_fr_lg_grp_cd(locR.lg_grp_cd());
				}
			}
		}
		
		/**
		 * 場所の物流グループを取得する。
		 * @param shiSchdR 出荷予定
		 * @return 場所マスタ
		 */
		protected MAM_LOC_R getLoc(Srch01_ShipSchdRsltR shiSchdR) {
			
			MAM_LOC_R locR = MAM_LOC_R.create();
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locR_bldr = MCQueryApiBuilder.create(t);
			locR_bldr.setSelect(t.lg_grp_cd);
			
			dbSelectKey("MSBEL0120_MAM_LOC_S02", locR, locR_bldr, nvl(shiSchdR.loc_cd(), shiSchdR.def_loc_cd()));
			
			return locR;
		}
		
		/**
		 * 振替先の出荷予定のチェック処理を行う。
		 */
		protected void chkShipSchd() {

			if (!MAC_STK_MNG_TYP.isMNG(_shipSchdR.stk_mng_typ())) {
				
				MCMessagePool.add(MSBEL0138);
			}
			
			if (!_shipSchdR.ship_act_qty().isZero()) {
				
				MCMessagePool.add(MSBEL1016);
			}
			else if (!_shipSchdR.ship_inst_qty().isZero()) {
				
				MCMessagePool.add(MSBEL1015);
			}
			else if (!isNull(_shipSchdR.slo_d_no()) && !_shipSchdR.wait_qty().isPositive()
					|| !isNull(_shipSchdR.xfr_schd_no()) && !(_shipSchdR.base_unit_qty().subtract(_shipSchdR.alloc_qty())).isPositive()) {
				
				MCMessagePool.add(MSBEL0139);
			}

			if (!MAC_ALLOC_TYP.isIMMED(_shipSchdR.alloc_typ()) 
					&& !MAC_ALLOC_TYP.isLATER(_shipSchdR.alloc_typ())
					&& !isNull(_shipSchdR.slo_d_no())) {
				
				MCMessagePool.add(MSBEL0141);
			}
		}
		
		/**
		 * 振替元の引当済の出荷引当状況情報を取得する。
		 */
		protected void getShipAlloc() {
			
			crtLocWk();
			
			crtLgGrpWk();
			
			executeQuery(_shipAllocL, MSBEL0120_MST_SHIP_ALLOC_STS_S01(), _shipSchdR);
			
			delLocWk();
			
			delLgGrpWk();
			
			if (!_shipAllocL.isEmpty()) {
				_shipAllocL.setValueNE(Srch01_ShipAllocRsltR.$vstk_in_schd_flg, false);
			}
		}
		
		/**
		 * 引当可能場所ワークを作成する。
		 */
		protected void crtLocWk() {
			
			_locWkL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R locWkR = null;
			
			if (!isNull(_shipSchdR.loc_cd())) {
				
				locWkR = MAM_LOC_R.create();
				locWkR.loc_cd(_shipSchdR.loc_cd());
				_locWkL.add(locWkR);
			}
			else if (!isNull(_shipSchdR.alloc_ship_lg_grp_cd())) {
				
				_locWkL.addAll(getShipLgGrpLoc(_shipSchdR.alloc_ship_lg_grp_cd()));
			}
			else if (!isNull(_shipSchdR.alloc_grp_cd())) {
				
				_locWkL.addAll(getAllocGrpLoc(_shipSchdR.alloc_grp_cd()));
			}
			
			dbWkInsert("MSBEL0120_MAW_LOC_I01", _locWkL, _locWkL_bldr.getBaseDbc());
		}
		
		/**
		 * 引当可能場所ワークを削除する。
		 */
		protected void delLocWk() {

			dbWkDelete("MSBEL0120_MAW_LOC_D01", _locWkL_bldr.getBaseDbc());
		}
		
		/**
		 * 引当可能物流グループワークを作成する。
		 */
		protected void crtLgGrpWk() {
			
			_lgGrpWkL = MCList.create(MAM_LG_GRP_R.class);
			
			if (!isNull(_shipSchdR.loc_cd())) {
				return;
			}
			if (!isNull(_shipSchdR.alloc_ship_lg_grp_cd())) {
				
				MAM_LG_GRP_R lgGrpWkR = MAM_LG_GRP_R.create();
				lgGrpWkR.lg_grp_cd(_shipSchdR.alloc_ship_lg_grp_cd());
				_lgGrpWkL.add(lgGrpWkR);
			}
			else if (!isNull(_shipSchdR.alloc_grp_cd())) {
				
				_lgGrpWkL.addAll(getAllocGrpLgGrp(_shipSchdR.alloc_grp_cd()));
			}
			
			dbWkInsert("MSBEL0120_MAW_LG_GRP_I01", _lgGrpWkL, _lgGrpWkL_bldr.getBaseDbc());
		}
		
		/**
		 * 引当可能物流グループワークを削除する。
		 */
		protected void delLgGrpWk() {

			dbWkDelete("MSBEL0120_MAW_LG_GRP_D01", _lgGrpWkL_bldr.getBaseDbc());
		}
		
		/**
		 * 振替元の引当可能な在庫・入庫予定情報を取得する。
		 */
		protected void getVstkInSchd() {
					
			MSBEL_AllocMngService.Alloc_Srch01 ope = MSBEL_AllocMngService.crtAlloc_Srch01();
		
			crtMSBEL5040Up0(ope);
			crtMSBEL5040Up1(ope);
			
			ope.exec();
			
			setVstkInSchd(calcMSBEL5040Down(ope));
		}
		
		/**
		 * 引当管理サービスのロット提案オペレーションの上り電文０を設定する。
		 * @param ope ロット提案オペレーション
		 */
		protected void crtMSBEL5040Up0(MSBEL_AllocMngService.Alloc_Srch01 ope) {
			
			ope.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
			if (MAC_ALLOC_SCOPE_TYP.isLOC(_shipSchdR.alloc_scope_typ())) {
				ope.up0().lot_prop_typ(MSC_LOT_PROP_TYP.SRCH_LOC.value());
			}
			else if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(_shipSchdR.alloc_scope_typ())) {
				ope.up0().lot_prop_typ(MSC_LOT_PROP_TYP.SRCH_GRS.value());
			}
			ope.up0().except_alloc_wait_flg(true);
			ope.up0().nm_srch_flg(true);
		}
		
		/**
		 * 引当管理サービスのロット提案オペレーションの上り電文１を設定する。
		 * @param ope ロット提案オペレーション
		 */
		protected void crtMSBEL5040Up1(MSBEL_AllocMngService.Alloc_Srch01 ope) {
			
			Srch_TgtR up1R = Srch_TgtR.create();
			
			callShipSchdDtServiceSrch02();
			
			callAllocMngServiceAllocAvlSprt01();
			
			callShipLotChkServiceSrch01();
			
			copy(up1R, _shipSchdR, createMap_Srch_TgtR_Srch01_ShipSchdRsltR());
			setPegNo(up1R);
			
			ope.up1().add(up1R);
		}
		
		/**
		 * 出荷予定日計算サービスの出荷予定日計算を呼び出す。<br>
		 * 振替先の出荷予定に対して、出荷予定日、納品予定日を出荷予定日計算サービスで再計算する。
		 */
		protected void callShipSchdDtServiceSrch02() {
			
			if (!_shipSchdR.not_dt_calc_flg()) {
			
				MSBEL_ShipSchdDtCalcService.ShipSchdDt_Srch01 ope = MSBEL_ShipSchdDtCalcService.crtShipSchdDt_Srch01();
				
				MSW_SHIP_SCHD_DT_CALC_R opeUp0R = MSW_SHIP_SCHD_DT_CALC_R.create();
				copy(opeUp0R, _shipSchdR, createMap_MSW_SHIP_SCHD_DT_CALC_R_Srch01_ShipSchdRsltR());
				setPegNo(opeUp0R);
				ope.up0().add(opeUp0R);
				
				ope.exec();
				
				if (!ope.down0().isEmpty()) {
					
					if (!isNull(ope.down0().get(0).ship_schd_tm())) {
						_shipSchdR.ship_schd_tm(ope.down0().get(0).ship_schd_tm());
						_shipSchdR.ship_schd_dt(ope.down0().get(0).ship_schd_tm().trunc(MCDateFieldType.DAY));
						_shipSchdR.ship_schd_hm(ope.down0().get(0).ship_schd_tm());
					}
					
					if (!isNull(ope.down0().get(0).dlv_schd_tm())) {
						_shipSchdR.dlv_schd_tm(ope.down0().get(0).dlv_schd_tm());
						_shipSchdR.dlv_schd_dt(ope.down0().get(0).dlv_schd_tm().trunc(MCDateFieldType.DAY));
						_shipSchdR.dlv_schd_hm(ope.down0().get(0).dlv_schd_tm());
					}
				}	
			}
		}
		
		/**
		 * 引当管理サービスの引当可能数チェックを呼び出す<br>
		 * 物流制御マスタから引当可能日数を取得し、範囲外であれば引当処理を実行しない。
		 */
		protected void callAllocMngServiceAllocAvlSprt01() {
			
			MSBEL_AllocMngService.Alloc_Avl_Sprt01 ope = MSBEL_AllocMngService.crtAlloc_Avl_Sprt01();
			
			Alloc_Avl_Sprt01_CndR opeUp0R = Alloc_Avl_Sprt01_CndR.create();
			
			copy(opeUp0R, _shipSchdR, createMap_Alloc_Avl_Sprt01_CndR_Srch01_ShipSchdRsltR());
			setPegNo(opeUp0R);
			ope.up0().add(opeUp0R);
			
			ope.exec();
			
			if (ope.down0().get(0).exceed_alloc_days_flg()) {
				MCMessagePool.add(MSBEL1017);
			}
		}
		
		/**
		 * 出荷ロットチェックサービスの有効期限取得処理を呼び出す。<br>
		 * 出荷ロットから最小・最大の有効期限を取得する。
		 */
		protected void callShipLotChkServiceSrch01() {
			
			MSBEL_ShipLotChkService.ShipLotChk_Srch01 ope = MSBEL_ShipLotChkService.crtShipLotChk_Srch01();
			
			ShipLot_DtlR opeUp0R = ShipLot_DtlR.create();
			copy(opeUp0R, _shipSchdR, createMap_ShipLot_DtlR_Srch01_ShipSchdRsltR());
			setPegNo(opeUp0R);
			ope.up0().add(opeUp0R);
			
			ope.exec();
			
			if (!ope.down0().isEmpty()) {
				
				_shipSchdR.valid_dt_fr(ope.down0().get(0).valid_dt_fr());
				_shipSchdR.valid_dt_fr_grp(ope.down0().get(0).valid_dt_fr_grp());
				_shipSchdR.valid_dt_to(ope.down0().get(0).valid_dt_to());
			}
		}
		
		/**
		 * 引当管理サービスのロット提案結果を集計する。
		 * @param ope ロット提案オペレーション
		 * @return 集計結果
		 */
		protected MCList<Srch_RsltR> calcMSBEL5040Down(MSBEL_AllocMngService.Alloc_Srch01 ope) {
			
			if (!ope.down0().isEmpty()) {
				
				MCList<Srch_RsltR> rsltL = MCList.create(Srch_RsltR.class);
						
				// 品目マスタの荷姿引当ＦＬＧ
				if (_shipSchdR.pack_alloc_flg() && _shipSchdR.pack_flg()) {
					
					rsltL = ope.down0().subList(Srch_RsltR.$pack_unit_cd, _shipSchdR.trd_unit_cd());
				}
				else {
					rsltL.setAll(ope.down0());
				}
				
				if (MAC_ALLOC_SCOPE_TYP.isLOC(_shipSchdR.alloc_scope_typ())) {
					
					return rsltL.groupBy(getVstkInSchdLocPolicy());
				} 
				else if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(_shipSchdR.alloc_scope_typ())) {
					
					return rsltL.groupBy(getVstkInSchdAllocGrpPolicy());
				}
			}
			
			return null;
		}
		
		/**
		 * 総量引当の使用可能在庫の集計条件を返す。
		 * @return 集計条件
		 */
		protected MCGroupByPolicy getVstkInSchdAllocGrpPolicy() {
			
			MCGroupByPolicy policy = new MCGroupByPolicy(
					Srch_RsltR.$ver_no,					
					Srch_RsltR.$stk_lg_grp_cd,
					Srch_RsltR.$stk_lg_grp_nm,
					Srch_RsltR.$stk_alloc_grp_cd,
					Srch_RsltR.$stk_alloc_grp_nm,
					Srch_RsltR.$sno1,
					Srch_RsltR.$sno2,
					Srch_RsltR.$sno3,
					Srch_RsltR.$sno4,
					Srch_RsltR.$stk_id_typ,
					Srch_RsltR.$stk_bp_cd,
					Srch_RsltR.$stk_bp_nm,
					Srch_RsltR.$pack_unit_cd,
					Srch_RsltR.$pack_unit_nm,
					Srch_RsltR.$base_unit_cd,
					Srch_RsltR.$base_unit_nm,
					Srch_RsltR.$base_unit_dec_place,
					Srch_RsltR.$base_unit_rnd_typ
					);
			
			policy.sum(Srch_RsltR.$pack_unit_qty, Srch_RsltR.$base_unit_qty);
			
			return policy;
		}
		
		/**
		 * 場所引当の使用可能在庫の集計条件を返す。
		 */
		protected MCGroupByPolicy getVstkInSchdLocPolicy() {
			
			MCGroupByPolicy policy = new MCGroupByPolicy(
					Srch_RsltR.$stk_loc_cd,
					Srch_RsltR.$stk_loc_nm,
					Srch_RsltR.$stk_str_ln_cd,
					Srch_RsltR.$stk_str_ln_nm,
					Srch_RsltR.$lot_no,
					Srch_RsltR.$sublot_no,
					Srch_RsltR.$ver_no,					
					Srch_RsltR.$stk_lg_grp_cd,
					Srch_RsltR.$stk_lg_grp_nm,
					Srch_RsltR.$stk_alloc_grp_cd,
					Srch_RsltR.$stk_alloc_grp_nm,
					Srch_RsltR.$sno1,
					Srch_RsltR.$sno2,
					Srch_RsltR.$sno3,
					Srch_RsltR.$sno4,
					Srch_RsltR.$stk_id_typ,
					Srch_RsltR.$stk_bp_cd,
					Srch_RsltR.$stk_bp_nm,
					Srch_RsltR.$pack_unit_cd,
					Srch_RsltR.$pack_unit_nm,
					Srch_RsltR.$base_unit_cd,
					Srch_RsltR.$base_unit_nm,
					Srch_RsltR.$base_unit_dec_place,
					Srch_RsltR.$base_unit_rnd_typ
					);
			
			policy.sum(Srch_RsltR.$pack_unit_qty, Srch_RsltR.$base_unit_qty);
			
			return policy;
		}
		
		/**
		 * 振替元の在庫・入庫予定を設定する。
		 * @param grpRsltL 集計したロット提案結果
		 */
		protected void setVstkInSchd(MCList<Srch_RsltR> grpRsltL) {
			
			if (!isNull(grpRsltL) && !grpRsltL.isEmpty()) {
				
				addAll(_vstkInSchdAllocL, grpRsltL, createMap_Srch01_ShipAllocRsltR_Srch_RsltR());
				_vstkInSchdAllocL.setValueNE(Srch01_ShipAllocRsltR.$vstk_in_schd_flg, true);
			}
		}
		
		/**
		 * 変更可能な出荷予定、引当可能な在庫・入庫予定が存在するかチェックする。
		 */
		protected void chkShipAlloc() {
			
			if (_shipAllocL.isEmpty() && _vstkInSchdAllocL.isEmpty()) {
				
				MCMessagePool.add(MSBEL0142);
			}
		}
		
		/**
		 * 振替元の在庫・入庫予定の情報を編集する。
		 */
		protected void editVstkInSchd() {

			for (Srch01_ShipAllocRsltR vstkInSchdAllocR : _vstkInSchdAllocL) {
				
				setLocInfo(vstkInSchdAllocR);
				setUnitInfo(vstkInSchdAllocR);
			}
		}
		
		/**
		 * 場所に関連する項目を補完する。
		 */
		protected void setLocInfo(Srch01_ShipAllocRsltR vstkInSchdAllocR) {

			MAM_LOC_R locR = MAM_LOC_R.create();
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locR_bldr = MCQueryApiBuilder.create(t);
			
			locR_bldr.setSelect(t.wg_cd, t.getColumn$(MAM_LOC_R.$wg_nm), t.site_cd, t.getColumn$(MAM_LOC_R.$site_nm));
			
			dbSelectKey("MSBEL0120_MAM_LOC_S03", locR, locR_bldr, vstkInSchdAllocR.ship_loc_cd());
			
			if (!isNull(locR) && !locR.isEmpty()) {
				
				vstkInSchdAllocR.wg_cd(locR.wg_cd());
				vstkInSchdAllocR.wg_nm(locR.wg_nm());
				vstkInSchdAllocR.site_cd(locR.site_cd());
				vstkInSchdAllocR.site_nm(locR.site_nm());
			}
		}
		
		/**
		 * 単位に関連する項目を補完する。
		 */
		protected void setUnitInfo(Srch01_ShipAllocRsltR vstkInSchdAllocR) {

			MAVM_ITM_UNIT_R itmUnitR = MAVM_ITM_UNIT_R.create();
			MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder itmUnitR_bldr = MCQueryApiBuilder.create(t);
			
			itmUnitR_bldr.setSelect(t.dec_place, t.conv_base_qty, t.conv_qty);
			
			dbSelectKey("MSBEL0120_MAVM_ITM_UNIT_S01", itmUnitR, itmUnitR_bldr, _shipSchdR.itm_cd(), _shipSchdR.itm_sub1(), _shipSchdR.itm_sub2(), _shipSchdR.itm_sub3(), vstkInSchdAllocR.pack_unit_cd());
			
			if (!isNull(itmUnitR) && !itmUnitR.isEmpty()) {
				
				vstkInSchdAllocR.pack_unit_dec_place(itmUnitR.dec_place());
				vstkInSchdAllocR.pack_unit_conv_base_qty(itmUnitR.conv_base_qty());
				vstkInSchdAllocR.pack_unit_conv_qty(itmUnitR.conv_qty());
			}
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			MCRow.copyall(down0(), _shipSchdR);
			
			if (MCMessagePool.getMessageList().size() > 0 && noSrchDown()) {
				return;
			}
			
			down1().setAll(_shipAllocL);
			down1().addAll(_vstkInSchdAllocL);
			
			MCSortPolicy policy = new MCSortPolicy();
			policy.add(SortType.DESC, Srch01_ShipAllocRsltR.$vstk_in_schd_flg);
			policy.add(SortType.ASC, Srch01_ShipAllocRsltR.$ship_schd_no);
			policy.add(SortType.ASC, Srch01_ShipAllocRsltR.$ship_alloc_sts_no);
			down1().sort(policy);
		}
		
		/**
		 * 検索結果を表示するかどうかを判断する。
		 */
		protected boolean noSrchDown() {
			MCMessageList msgL = MCMessagePool.getMessageList();
			for (MCMessage msg : msgL) {
				if (isSame(msg.getID(), MSBEL0162) || isSame(msg.getID(), MSBEL0163)) {
					continue;
				}
				else {
					return true;
				}
			}
			return false;
		}
	}
	
	/**
	 * 出荷物流グループに属する場所を取得する。
	 * @param lgGrpCd 出荷物流グループＣＤ
	 * @return 出荷物流グループに属する場所
	 */
	protected MCList<MAM_LOC_R> getShipLgGrpLoc(String lgGrpCd) {
		
		MCList<MAM_LOC_R> shipLgGrpLocL = MCList.create(MAM_LOC_R.class);
		
		MAM_LOC_R cndR = MAM_LOC_R.create();
		cndR.lg_grp_cd(lgGrpCd);
		
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder shipLgGrpLocL_bldr = MCQueryApiBuilder.create(t);
		shipLgGrpLocL_bldr.setSelect(t.loc_cd);
		shipLgGrpLocL_bldr.setWhere(createWhere(t, MAM_LOC_R.$lg_grp_cd), cndR);
		
		dbSelect("MSBEL0120_MAM_LOC_S04", shipLgGrpLocL, shipLgGrpLocL_bldr);
		
		return shipLgGrpLocL;
	}
	
	/**
	 * 総量引当場所グループに属する場所を取得する。
	 * @param allocGrpCd 総量引当場所グループＣＤ
	 * @return 総量引当場所グループに属する場所
	 */
	protected MCList<MAM_LOC_R> getAllocGrpLoc(String allocGrpCd) {
		
		MCList<MAM_LOC_R> allocGrpLocL = MCList.create(MAM_LOC_R.class);
		
		MAM_LOC_R cndR = MAM_LOC_R.create();
		cndR.alloc_grp_cd(allocGrpCd);
		
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder allocGrpLocL_bldr = MCQueryApiBuilder.create(t);
		allocGrpLocL_bldr.setSelect(t.loc_cd);
		allocGrpLocL_bldr.setWhere(createWhere(t, MAM_LOC_R.$alloc_grp_cd), cndR);
		
		dbSelect("MSBEL0120_MAM_LOC_S05", allocGrpLocL, allocGrpLocL_bldr);
		
		return allocGrpLocL;
	}
	
	/**
	 * 総量引当場所グループに属する物流グループを取得する。
	 * @param shipSchdR 振替元出荷予定
	 * @return 総量引当場所グループに属する物流グループ
	 */
	protected MCList<MAM_LG_GRP_R> getAllocGrpLgGrp(String allocGrpCd) {
		
		MCList<MAM_LOC_R> allocGrpLocL = MCList.create(MAM_LOC_R.class);
		
		MAM_LOC_R cndR = MAM_LOC_R.create();
		cndR.alloc_grp_cd(allocGrpCd);
		
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder allocGrpLocL_bldr = MCQueryApiBuilder.create(t);
		allocGrpLocL_bldr.setSelect(t.lg_grp_cd);
		allocGrpLocL_bldr.setDistinct();
		allocGrpLocL_bldr.setWhere(createWhere(t, MAM_LOC_R.$alloc_grp_cd), cndR);
		
		dbSelect("MSBEL0120_MAM_LOC_S06", allocGrpLocL, allocGrpLocL_bldr);
		
		MCList<MAM_LG_GRP_R> lgGrpWkL = MCList.create(MAM_LG_GRP_R.class);
		
		MAM_LG_GRP_R lgGrpR = null;
		for (MAM_LOC_R locR : allocGrpLocL) {
			
			lgGrpR = MAM_LG_GRP_R.create();
			lgGrpR.lg_grp_cd(locR.lg_grp_cd());
			lgGrpWkL.add(lgGrpR);
		}
		
		return lgGrpWkL;
	}
	
	protected Map_MSW_SHIP_SCHD_DT_CALC_R_ShipSchdR<MSW_SHIP_SCHD_DT_CALC_R,ShipSchdR> createMap_MSW_SHIP_SCHD_DT_CALC_R_ShipSchdR() {
		return new Map_MSW_SHIP_SCHD_DT_CALC_R_ShipSchdR<MSW_SHIP_SCHD_DT_CALC_R, ShipSchdR>();
	}

	public class Map_MSW_SHIP_SCHD_DT_CALC_R_ShipSchdR<D extends MSW_SHIP_SCHD_DT_CALC_R, S extends ShipSchdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_to_id_typ, ShipSchdR.$ship_to_id_typ);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_to_id_cd, ShipSchdR.$ship_to_id_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_to_lg_grp_cd, ShipSchdR.$ship_to_lg_grp_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_term_cd, ShipSchdR.$ship_term_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$dlv_day_week_typ, ShipSchdR.$dlv_day_week_typ);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_inst_typ, ShipSchdR.$ship_inst_typ);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.dlv_rqst_tm(nvl(src.pd_inst_dlv_tm(), src.dlv_rqst_tm()));
			dest.ship_rqst_tm(nvl(src.ship_rqst_tm(), src.ship_pr_ship_rqst_tm()));
			
			dest.base_dt(getToday());
			if (isSlo(src)) {
				dest.cl_time_chk_flg(true);
				dest.ship_dt_chk_flg(true);
				dest.ship_cal_cd_chk_flg(true);
				dest.early_ship_dt_add_days_chk_flg(true);
			}
			else {
				dest.cl_time_chk_flg(false);
				dest.ship_dt_chk_flg(false);
				dest.ship_cal_cd_chk_flg(false);
				dest.early_ship_dt_add_days_chk_flg(false);
			}
		}
		protected boolean isSlo(S src) {
			return !isNull(src.slo_d_no());
		}
	}
	
	protected Map_Srch_TgtR_Srch01_ShipSchdRsltR<Srch_TgtR,Srch01_ShipSchdRsltR> createMap_Srch_TgtR_Srch01_ShipSchdRsltR() {
		return new Map_Srch_TgtR_Srch01_ShipSchdRsltR<Srch_TgtR, Srch01_ShipSchdRsltR>();
	}

	public class Map_Srch_TgtR_Srch01_ShipSchdRsltR<D extends Srch_TgtR, S extends Srch01_ShipSchdRsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch_TgtR.$itm_cd, Srch01_ShipSchdRsltR.$itm_cd);
			addColumnPathMap(Srch_TgtR.$itm_sub1, Srch01_ShipSchdRsltR.$itm_sub1);
			addColumnPathMap(Srch_TgtR.$itm_sub2, Srch01_ShipSchdRsltR.$itm_sub2);
			addColumnPathMap(Srch_TgtR.$itm_sub3, Srch01_ShipSchdRsltR.$itm_sub3);
			addColumnPathMap(Srch_TgtR.$ver_no, Srch01_ShipSchdRsltR.$ver_no);
			addColumnPathMap(Srch_TgtR.$alloc_grp_cd, Srch01_ShipSchdRsltR.$alloc_grp_cd);
			addColumnPathMap(Srch_TgtR.$quality_typ, Srch01_ShipSchdRsltR.$quality_typ);
			addColumnPathMap(Srch_TgtR.$stk_id_typ, Srch01_ShipSchdRsltR.$stk_id_typ);
			addColumnPathMap(Srch_TgtR.$stk_bp_cd, Srch01_ShipSchdRsltR.$stk_bp_cd);
			addColumnPathMap(Srch_TgtR.$gd_cd, Srch01_ShipSchdRsltR.$gd_cd);
			addColumnPathMap(Srch_TgtR.$lot_no, Srch01_ShipSchdRsltR.$lot_no);
			addColumnPathMap(Srch_TgtR.$sublot_no, Srch01_ShipSchdRsltR.$sublot_no);
			addColumnPathMap(Srch_TgtR.$sno1, Srch01_ShipSchdRsltR.$sno1);
			addColumnPathMap(Srch_TgtR.$sno1_null_flg, Srch01_ShipSchdRsltR.$sno1_null_flg);
			addColumnPathMap(Srch_TgtR.$sno2, Srch01_ShipSchdRsltR.$sno2);
			addColumnPathMap(Srch_TgtR.$sno2_null_flg, Srch01_ShipSchdRsltR.$sno2_null_flg);
			addColumnPathMap(Srch_TgtR.$sno3, Srch01_ShipSchdRsltR.$sno3);
			addColumnPathMap(Srch_TgtR.$sno3_null_flg, Srch01_ShipSchdRsltR.$sno3_null_flg);
			addColumnPathMap(Srch_TgtR.$sno4, Srch01_ShipSchdRsltR.$sno4);
			addColumnPathMap(Srch_TgtR.$sno4_null_flg, Srch01_ShipSchdRsltR.$sno4_null_flg);
			addColumnPathMap(Srch_TgtR.$base_unit_cd, Srch01_ShipSchdRsltR.$base_unit_cd);
			addColumnPathMap(Srch_TgtR.$not_lot_mix_flg, Srch01_ShipSchdRsltR.$not_lot_mix_flg);
			addColumnPathMap(Srch_TgtR.$not_sublot_mix_flg, Srch01_ShipSchdRsltR.$not_sublot_mix_flg);
			addColumnPathMap(Srch_TgtR.$alloc_scope_typ, Srch01_ShipSchdRsltR.$alloc_scope_typ);
			addColumnPathMap(Srch_TgtR.$ship_term_cd, Srch01_ShipSchdRsltR.$ship_term_cd);
			addColumnPathMap(Srch_TgtR.$pack_alloc_flg, Srch01_ShipSchdRsltR.$pack_alloc_flg);
			addColumnPathMap(Srch_TgtR.$vld_dt_fr, Srch01_ShipSchdRsltR.$valid_dt_fr);
			addColumnPathMap(Srch_TgtR.$vld_dt_fr_grp, Srch01_ShipSchdRsltR.$valid_dt_fr_grp);
			addColumnPathMap(Srch_TgtR.$vld_dt_to, Srch01_ShipSchdRsltR.$valid_dt_to);
			addColumnPathMap(Srch_TgtR.$gi_lg_grp_cd, Srch01_ShipSchdRsltR.$alloc_ship_lg_grp_cd);
			addColumnPathMap(Srch_TgtR.$gi_loc_cd, Srch01_ShipSchdRsltR.$loc_cd);
			addColumnPathMap(Srch_TgtR.$gi_str_ln_cd, Srch01_ShipSchdRsltR.$str_ln_cd);
			addColumnPathMap(Srch_TgtR.$cst_cd, Srch01_ShipSchdRsltR.$cst_cd);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			if (src.sls_cststk_flg()) {
				// 預り売上の場合は、売上予定日を出庫予定日とする。
				dest.gi_schd_dt(src.sls_schd_dt());
			}
			else {
				dest.gi_schd_dt(isNull(src.ship_schd_tm()) ? null : src.ship_schd_tm().startTimeOfDay());
			}
			dest.gr_schd_dt(isNull(src.dlv_schd_tm()) ? null : src.dlv_schd_tm().startTimeOfDay());
			
			dest.dlv_lg_grp_cd(src.ship_to_lg_grp_cd());
			
			if (src.pack_alloc_flg() && src.pack_flg()) {
				dest.pack_unit_cd(src.trd_unit_cd());
			}
			
			if (isNull(src.lot_no())) {
				dest.not_lot_fix_flg(true);
			}
			
			if (MAC_TRD_PTN_TYP.isSLS(src.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value());
			}
			else if (MAC_TRD_PTN_TYP.isSHIP(src.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.SHIP_OUT.value());
			}
			else if (MAC_TRD_PTN_TYP.isXFR(src.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GI.value());
			}
			else if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GI_PROV.value());
			}
			else if (MAC_TRD_PTN_TYP.isXFR_RTN(src.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_RTN_GI.value());
			}
			else if (MAC_TRD_PTN_TYP.isPROV_RTN(src.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_RTN_GI_PROV.value());
			}
			
			if (MAC_TRD_PTN_TYP.isSLS(src.trd_ptn_typ())) {
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SLO.value());
			}
			else {
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
			}
			
			// 移動・移送予定の場合は、ＶＭＩ在庫を引当できるよう、在庫識別区分が自社在庫の場合、在庫識別区分をクリアする
			if ((MAC_TRD_PTN_TYP.isXFR(src.trd_ptn_typ()) 
				|| MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isXFR_RTN(src.trd_ptn_typ()) 
				|| MAC_TRD_PTN_TYP.isPROV_RTN(src.trd_ptn_typ())) 
					&& MSC_STK_ID_TYP.isCOSTK(dest.stk_id_typ())) {
				dest.stk_id_typ(null);
				dest.stk_bp_cd(null);
			}
			
			dest.stk_alloc_flg(false);
		}
	}	
	protected Map_Srch01_ShipAllocRsltR_Srch_RsltR<Srch01_ShipAllocRsltR,Srch_RsltR> createMap_Srch01_ShipAllocRsltR_Srch_RsltR() {
		return new Map_Srch01_ShipAllocRsltR_Srch_RsltR<Srch01_ShipAllocRsltR, Srch_RsltR>();
	}

	public class Map_Srch01_ShipAllocRsltR_Srch_RsltR<D extends Srch01_ShipAllocRsltR, S extends Srch_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_ShipAllocRsltR.$base_unit_cd, Srch_RsltR.$base_unit_cd);
			addColumnPathMap(Srch01_ShipAllocRsltR.$base_unit_nm, Srch_RsltR.$base_unit_nm);
			addColumnPathMap(Srch01_ShipAllocRsltR.$base_unit_dec_place, Srch_RsltR.$base_unit_dec_place);
			addColumnPathMap(Srch01_ShipAllocRsltR.$base_unit_rnd_typ, Srch_RsltR.$base_unit_rnd_typ);
			addColumnPathMap(Srch01_ShipAllocRsltR.$ship_loc_cd, Srch_RsltR.$stk_loc_cd);
			addColumnPathMap(Srch01_ShipAllocRsltR.$ship_loc_nm, Srch_RsltR.$stk_loc_nm);
			addColumnPathMap(Srch01_ShipAllocRsltR.$ship_str_ln_cd, Srch_RsltR.$stk_str_ln_cd);
			addColumnPathMap(Srch01_ShipAllocRsltR.$ship_str_ln_nm, Srch_RsltR.$stk_str_ln_nm);
			addColumnPathMap(Srch01_ShipAllocRsltR.$ship_fr_lg_grp_cd, Srch_RsltR.$stk_lg_grp_cd);
			addColumnPathMap(Srch01_ShipAllocRsltR.$ship_fr_lg_grp_nm, Srch_RsltR.$stk_lg_grp_nm);
			addColumnPathMap(Srch01_ShipAllocRsltR.$alloc_grp_cd, Srch_RsltR.$stk_alloc_grp_cd);
			addColumnPathMap(Srch01_ShipAllocRsltR.$alloc_grp_nm, Srch_RsltR.$stk_alloc_grp_nm);
			addColumnPathMap(Srch01_ShipAllocRsltR.$lot_no, Srch_RsltR.$lot_no);
			addColumnPathMap(Srch01_ShipAllocRsltR.$sublot_no, Srch_RsltR.$sublot_no);
			addColumnPathMap(Srch01_ShipAllocRsltR.$ver_no, Srch_RsltR.$ver_no);
			addColumnPathMap(Srch01_ShipAllocRsltR.$sno1, Srch_RsltR.$sno1);
			addColumnPathMap(Srch01_ShipAllocRsltR.$sno2, Srch_RsltR.$sno2);
			addColumnPathMap(Srch01_ShipAllocRsltR.$sno3, Srch_RsltR.$sno3);
			addColumnPathMap(Srch01_ShipAllocRsltR.$sno4, Srch_RsltR.$sno4);
			addColumnPathMap(Srch01_ShipAllocRsltR.$stk_id_typ, Srch_RsltR.$stk_id_typ);
			addColumnPathMap(Srch01_ShipAllocRsltR.$stk_bp_cd, Srch_RsltR.$stk_bp_cd);
			addColumnPathMap(Srch01_ShipAllocRsltR.$stk_bp_nm, Srch_RsltR.$stk_bp_nm);
			addColumnPathMap(Srch01_ShipAllocRsltR.$pack_unit_cd, Srch_RsltR.$pack_unit_cd);
			addColumnPathMap(Srch01_ShipAllocRsltR.$pack_unit_nm, Srch_RsltR.$pack_unit_nm);
			addColumnPathMap(Srch01_ShipAllocRsltR.$alloc_abl_qty, Srch_RsltR.$pack_unit_qty);
			addColumnPathMap(Srch01_ShipAllocRsltR.$alloc_abl_base_unit_qty, Srch_RsltR.$base_unit_qty);
		}
	}
	
	protected Map_ShipLot_DtlR_ShipSchdR<ShipLot_DtlR,ShipSchdR> createMap_ShipLot_DtlR_ShipSchdR() {
		return new Map_ShipLot_DtlR_ShipSchdR<ShipLot_DtlR, ShipSchdR>();
	}

	public class Map_ShipLot_DtlR_ShipSchdR<D extends ShipLot_DtlR, S extends ShipSchdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipLot_DtlR.$cst_cd, ShipSchdR.$cst_cd);
			addColumnPathMap(ShipLot_DtlR.$itm_cd, ShipSchdR.$itm_cd);
			addColumnPathMap(ShipLot_DtlR.$itm_sub1, ShipSchdR.$itm_sub1);
			addColumnPathMap(ShipLot_DtlR.$itm_sub2, ShipSchdR.$itm_sub2);
			addColumnPathMap(ShipLot_DtlR.$itm_sub3, ShipSchdR.$itm_sub3);
			addColumnPathMap(ShipLot_DtlR.$dlv_cd, ShipSchdR.$dlv_id_cd);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.lock_flg(true);
		}
	}
	
	protected Map_MSW_ALLOC_LOC_MAP_R_ShipSchdR<MSW_ALLOC_LOC_MAP_R,ShipSchdR> createMap_MSW_ALLOC_LOC_MAP_R_ShipSchdR() {
		return new Map_MSW_ALLOC_LOC_MAP_R_ShipSchdR<MSW_ALLOC_LOC_MAP_R, ShipSchdR>();
	}

	public class Map_MSW_ALLOC_LOC_MAP_R_ShipSchdR<D extends MSW_ALLOC_LOC_MAP_R, S extends ShipSchdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_cd, ShipSchdR.$itm_cd);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub1, ShipSchdR.$itm_sub1);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub2, ShipSchdR.$itm_sub2);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub3, ShipSchdR.$itm_sub3);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$alloc_grp_cd, ShipSchdR.$alloc_grp_cd);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$alloc_scope_typ, ShipSchdR.$alloc_scope_typ);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$gi_lg_grp_cd, ShipSchdR.$alloc_ship_lg_grp_cd);
			
		}
	}
	
	protected Map_ShipSchd_Upd06_DtlR_ShipAllocR<ShipSchd_Upd06_DtlR,ShipAllocR> createMap_ShipSchd_Upd06_DtlR_ShipAllocR() {
		return new Map_ShipSchd_Upd06_DtlR_ShipAllocR<ShipSchd_Upd06_DtlR, ShipAllocR>();
	}

	public class Map_ShipSchd_Upd06_DtlR_ShipAllocR<D extends ShipSchd_Upd06_DtlR, S extends ShipAllocR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipSchd_Upd06_DtlR.$peg_no, ShipAllocR.$peg_no);
			addColumnPathMap(ShipSchd_Upd06_DtlR.$ship_alloc_sts_no, ShipAllocR.$ship_alloc_sts_no);
			addColumnPathMap(ShipSchd_Upd06_DtlR.$alloc_rel_qty, ShipAllocR.$alloc_chng_qty);
			
		}
	}
	
	protected Map_Srch_TgtR_ShipSchdR<Srch_TgtR,ShipSchdR> createMap_Srch_TgtR_ShipSchdR() {
		return new Map_Srch_TgtR_ShipSchdR<Srch_TgtR, ShipSchdR>();
	}

	public class Map_Srch_TgtR_ShipSchdR<D extends Srch_TgtR, S extends ShipSchdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch_TgtR.$itm_cd, ShipSchdR.$itm_cd);
			addColumnPathMap(Srch_TgtR.$itm_sub1, ShipSchdR.$itm_sub1);
			addColumnPathMap(Srch_TgtR.$itm_sub2, ShipSchdR.$itm_sub2);
			addColumnPathMap(Srch_TgtR.$itm_sub3, ShipSchdR.$itm_sub3);
			addColumnPathMap(Srch_TgtR.$ver_no, ShipSchdR.$ver_no);
			addColumnPathMap(Srch_TgtR.$alloc_grp_cd, ShipSchdR.$alloc_grp_cd);
			addColumnPathMap(Srch_TgtR.$quality_typ, ShipSchdR.$quality_typ);
			addColumnPathMap(Srch_TgtR.$stk_id_typ, ShipSchdR.$stk_id_typ);
			addColumnPathMap(Srch_TgtR.$stk_bp_cd, ShipSchdR.$stk_bp_cd);
			addColumnPathMap(Srch_TgtR.$gd_cd, ShipSchdR.$gd_cd);
			addColumnPathMap(Srch_TgtR.$base_unit_cd, ShipSchdR.$base_unit_cd);
			addColumnPathMap(Srch_TgtR.$not_lot_mix_flg, ShipSchdR.$not_lot_mix_flg);
			addColumnPathMap(Srch_TgtR.$not_sublot_mix_flg, ShipSchdR.$not_sublot_mix_flg);
			addColumnPathMap(Srch_TgtR.$alloc_scope_typ, ShipSchdR.$alloc_scope_typ);
			addColumnPathMap(Srch_TgtR.$ship_term_cd, ShipSchdR.$ship_term_cd);
			addColumnPathMap(Srch_TgtR.$pack_alloc_flg, ShipSchdR.$pack_alloc_flg);
			addColumnPathMap(Srch_TgtR.$cst_cd, ShipSchdR.$cst_cd);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			if (MSC_DLV_ID_TYP.isLOC(src.dlv_id_typ())) {
				
				dest.gr_str_ln_cd(src.dlv_str_ln_cd());
				dest.gr_loc_cd(src.dlv_id_cd());
			}

			dest.dlv_lg_grp_cd(src.ship_to_lg_grp_cd());
			
			if (src.pack_alloc_flg() && src.pack_flg()) {
				dest.pack_unit_cd(src.trd_unit_cd());
			}
			
			if (MAC_TRD_PTN_TYP.isSLS(src.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value());
			}
			else if (MAC_TRD_PTN_TYP.isSHIP(src.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.SHIP_OUT.value());
			}
			else if (MAC_TRD_PTN_TYP.isXFR(src.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GI.value());
			}
			else if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GI_PROV.value());
			}
			else if (MAC_TRD_PTN_TYP.isXFR_RTN(src.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_RTN_GI.value());
			}
			else if (MAC_TRD_PTN_TYP.isPROV_RTN(src.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_RTN_GI_PROV.value());
			}
			
			if (MAC_TRD_PTN_TYP.isSLS(src.trd_ptn_typ())) {
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SLO.value());
			}
			else {
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
			}
			
			dest.stk_alloc_flg(false);
		}
	}
	
	protected Map_ShipSchd_DtlR_ShipSchdR<ShipSchd_DtlR,ShipSchdR> createMap_ShipSchd_DtlR_ShipSchdR() {
		return new Map_ShipSchd_DtlR_ShipSchdR<ShipSchd_DtlR, ShipSchdR>();
	}

	public class Map_ShipSchd_DtlR_ShipSchdR<D extends ShipSchd_DtlR, S extends ShipSchdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipSchd_DtlR.$peg_no, ShipSchdR.$peg_no);
			addColumnPathMap(ShipSchd_DtlR.$ship_schd_no, ShipSchdR.$ship_schd_no);
			addColumnPathMap(ShipSchd_DtlR.$ship_pr_no, ShipSchdR.$ship_pr_no);
			addColumnPathMap(ShipSchd_DtlR.$ship_inst_d_no, ShipSchdR.$ship_inst_d_no);
			addColumnPathMap(ShipSchd_DtlR.$dlv_inst_rcpt_no, ShipSchdR.$dlv_inst_rcpt_no);
			addColumnPathMap(ShipSchd_DtlR.$slo_prms_no, ShipSchdR.$slo_prms_no);
			addColumnPathMap(ShipSchd_DtlR.$ship_fr_lg_grp_cd, ShipSchdR.$ship_fr_lg_grp_cd);
			addColumnPathMap(ShipSchd_DtlR.$wg_cd, ShipSchdR.$wg_cd);
			addColumnPathMap(ShipSchd_DtlR.$pd_inst_dlv_tm, ShipSchdR.$pd_inst_dlv_tm);
			addColumnPathMap(ShipSchd_DtlR.$ship_rqst_tm, ShipSchdR.$ship_rqst_tm);
			addColumnPathMap(ShipSchd_DtlR.$ship_schd_tm, ShipSchdR.$ship_schd_tm);
			addColumnPathMap(ShipSchd_DtlR.$dlv_schd_tm, ShipSchdR.$dlv_schd_tm);
			addColumnPathMap(ShipSchd_DtlR.$ship_term_cd, ShipSchdR.$ship_term_cd);
			addColumnPathMap(ShipSchd_DtlR.$ship_wk_cd, ShipSchdR.$ship_wk_cd);
			addColumnPathMap(ShipSchd_DtlR.$itm_cd, ShipSchdR.$itm_cd);
			addColumnPathMap(ShipSchd_DtlR.$itm_sub1, ShipSchdR.$itm_sub1);
			addColumnPathMap(ShipSchd_DtlR.$itm_sub2, ShipSchdR.$itm_sub2);
			addColumnPathMap(ShipSchd_DtlR.$itm_sub3, ShipSchdR.$itm_sub3);
			addColumnPathMap(ShipSchd_DtlR.$itm_nm, ShipSchdR.$itm_nm);
			addColumnPathMap(ShipSchd_DtlR.$iv_itm_nm, ShipSchdR.$iv_itm_nm);
			addColumnPathMap(ShipSchd_DtlR.$sundry_itm_flg, ShipSchdR.$sundry_itm_flg);
			addColumnPathMap(ShipSchd_DtlR.$sno1, ShipSchdR.$sno1);
			addColumnPathMap(ShipSchd_DtlR.$sno1_null_flg, ShipSchdR.$sno1_null_flg);
			addColumnPathMap(ShipSchd_DtlR.$sno2, ShipSchdR.$sno2);
			addColumnPathMap(ShipSchd_DtlR.$sno2_null_flg, ShipSchdR.$sno2_null_flg);
			addColumnPathMap(ShipSchd_DtlR.$sno3, ShipSchdR.$sno3);
			addColumnPathMap(ShipSchd_DtlR.$sno3_null_flg, ShipSchdR.$sno3_null_flg);
			addColumnPathMap(ShipSchd_DtlR.$sno4, ShipSchdR.$sno4);
			addColumnPathMap(ShipSchd_DtlR.$sno4_null_flg, ShipSchdR.$sno4_null_flg);
			addColumnPathMap(ShipSchd_DtlR.$lot_no, ShipSchdR.$lot_no);
			addColumnPathMap(ShipSchd_DtlR.$sublot_no, ShipSchdR.$sublot_no);
			addColumnPathMap(ShipSchd_DtlR.$ver_no, ShipSchdR.$ver_no);
			addColumnPathMap(ShipSchd_DtlR.$stk_arrv_bp_cd, ShipSchdR.$stk_arrv_bp_cd);
			addColumnPathMap(ShipSchd_DtlR.$gd_cd, ShipSchdR.$gd_cd);
			addColumnPathMap(ShipSchd_DtlR.$quality_typ, ShipSchdR.$quality_typ);
			addColumnPathMap(ShipSchd_DtlR.$stk_id_typ, ShipSchdR.$stk_id_typ);
			addColumnPathMap(ShipSchd_DtlR.$stk_bp_cd, ShipSchdR.$stk_bp_cd);
			addColumnPathMap(ShipSchd_DtlR.$trd_unit_qty, ShipSchdR.$trd_unit_qty);
			addColumnPathMap(ShipSchd_DtlR.$trd_unit_cd, ShipSchdR.$trd_unit_cd);
			addColumnPathMap(ShipSchd_DtlR.$base_unit_qty, ShipSchdR.$base_unit_qty);
			addColumnPathMap(ShipSchd_DtlR.$base_unit_cd, ShipSchdR.$base_unit_cd);
			addColumnPathMap(ShipSchd_DtlR.$abort_flg, ShipSchdR.$abort_flg);
			addColumnPathMap(ShipSchd_DtlR.$fix_flg, ShipSchdR.$fix_flg);
			addColumnPathMap(ShipSchd_DtlR.$ship_block_flg, ShipSchdR.$ship_block_flg);
			addColumnPathMap(ShipSchd_DtlR.$inst_bndl_flg, ShipSchdR.$inst_bndl_flg);
			addColumnPathMap(ShipSchd_DtlR.$not_lot_mix_flg, ShipSchdR.$not_lot_mix_flg);
			addColumnPathMap(ShipSchd_DtlR.$not_sublot_mix_flg, ShipSchdR.$not_sublot_mix_flg);
			addColumnPathMap(ShipSchd_DtlR.$vld_dt_fr, ShipSchdR.$vld_dt_fr);
			addColumnPathMap(ShipSchd_DtlR.$vld_dt_to, ShipSchdR.$vld_dt_to);
			addColumnPathMap(ShipSchd_DtlR.$re_ship_schd_flg, ShipSchdR.$re_ship_schd_flg);
			addColumnPathMap(ShipSchd_DtlR.$intr_rmrks, ShipSchdR.$intr_rmrks);
			addColumnPathMap(ShipSchd_DtlR.$trd_rmrks, ShipSchdR.$trd_rmrks);
			addColumnPathMap(ShipSchd_DtlR.$trd_d_rmrks, ShipSchdR.$trd_d_rmrks);
			addColumnPathMap(ShipSchd_DtlR.$ship_cnt_rmrks, ShipSchdR.$ship_cnt_rmrks);
			addColumnPathMap(ShipSchd_DtlR.$sub_char1, ShipSchdR.$sub_char1);
			addColumnPathMap(ShipSchd_DtlR.$sub_char2, ShipSchdR.$sub_char2);
			addColumnPathMap(ShipSchd_DtlR.$sub_char3, ShipSchdR.$sub_char3);
			addColumnPathMap(ShipSchd_DtlR.$not_dt_calc_flg, ShipSchdR.$not_dt_calc_flg);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			dest.ship_schd_split_flg(true);
			dest.ship_judge_flg(false);
			dest.iv_chk_skip_flg(true);
		}
	}
	
	protected Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_R<Alloc_RsltR,MST_SHIP_ALLOC_STS_R> createMap_Alloc_RsltR_MST_SHIP_ALLOC_STS_R() {
		return new Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_R<Alloc_RsltR, MST_SHIP_ALLOC_STS_R>();
	}

	public class Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_R<D extends Alloc_RsltR, S extends MST_SHIP_ALLOC_STS_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Alloc_RsltR.$ver_no, MST_SHIP_ALLOC_STS_R.$ver_no);
			
			addColumnPathMap(Alloc_RsltR.$stk_loc_cd, MST_SHIP_ALLOC_STS_R.$ship_loc_cd);
			addColumnPathMap(Alloc_RsltR.$stk_str_ln_cd, MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd);
			addColumnPathMap(Alloc_RsltR.$quality_typ, MST_SHIP_ALLOC_STS_R.$quality_typ);
			addColumnPathMap(Alloc_RsltR.$stk_insp_typ, MST_SHIP_ALLOC_STS_R.$stk_insp_typ);
			addColumnPathMap(Alloc_RsltR.$stk_id_typ, MST_SHIP_ALLOC_STS_R.$stk_id_typ);
			addColumnPathMap(Alloc_RsltR.$stk_bp_cd, MST_SHIP_ALLOC_STS_R.$stk_bp_cd);
			addColumnPathMap(Alloc_RsltR.$gd_cd, MST_SHIP_ALLOC_STS_R.$gd_cd);
			addColumnPathMap(Alloc_RsltR.$lot_no, MST_SHIP_ALLOC_STS_R.$lot_no);
			addColumnPathMap(Alloc_RsltR.$sublot_no, MST_SHIP_ALLOC_STS_R.$sublot_no);
			addColumnPathMap(Alloc_RsltR.$sno1, MST_SHIP_ALLOC_STS_R.$sno1);
			addColumnPathMap(Alloc_RsltR.$sno2, MST_SHIP_ALLOC_STS_R.$sno2);
			addColumnPathMap(Alloc_RsltR.$sno3, MST_SHIP_ALLOC_STS_R.$sno3);
			addColumnPathMap(Alloc_RsltR.$sno4, MST_SHIP_ALLOC_STS_R.$sno4);
			addColumnPathMap(Alloc_RsltR.$pack_unit_cd, MST_SHIP_ALLOC_STS_R.$pack_unit_cd);
			addColumnPathMap(Alloc_RsltR.$pack_unit_qty, MST_SHIP_ALLOC_STS_R.$pack_unit_qty);
			addColumnPathMap(Alloc_RsltR.$base_unit_cd, MST_SHIP_ALLOC_STS_R.$base_unit_cd);
			addColumnPathMap(Alloc_RsltR.$base_unit_qty, MST_SHIP_ALLOC_STS_R.$base_unit_qty);
			addColumnPathMap(Alloc_RsltR.$vld_dt_fr, MST_SHIP_ALLOC_STS_R.$vld_dt_fr);
			addColumnPathMap(Alloc_RsltR.$vld_dt_to, MST_SHIP_ALLOC_STS_R.$vld_dt_to);
			addColumnPathMap(Alloc_RsltR.$alloc_flg, MST_SHIP_ALLOC_STS_R.$alloc_flg);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.stk_lg_grp_cd(src.getStringNE("ship_fr_lg_grp_cd"));
		}
	}
	
	protected Map_Alloc_RsltR_Srch_RsltR<Alloc_RsltR,Srch_RsltR> createMap_Alloc_RsltR_Srch_RsltR() {
		return new Map_Alloc_RsltR_Srch_RsltR<Alloc_RsltR, Srch_RsltR>();
	}

	public class Map_Alloc_RsltR_Srch_RsltR<D extends Alloc_RsltR, S extends Srch_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Alloc_RsltR.$itm_cd, Srch_RsltR.$itm_cd);
			addColumnPathMap(Alloc_RsltR.$itm_sub1, Srch_RsltR.$itm_sub1);
			addColumnPathMap(Alloc_RsltR.$itm_sub2, Srch_RsltR.$itm_sub2);
			addColumnPathMap(Alloc_RsltR.$itm_sub3, Srch_RsltR.$itm_sub3);
			addColumnPathMap(Alloc_RsltR.$ver_no, Srch_RsltR.$ver_no);
			addColumnPathMap(Alloc_RsltR.$stk_loc_cd, Srch_RsltR.$stk_loc_cd);
			addColumnPathMap(Alloc_RsltR.$stk_str_ln_cd, Srch_RsltR.$stk_str_ln_cd);
			addColumnPathMap(Alloc_RsltR.$stk_lg_grp_cd, Srch_RsltR.$stk_lg_grp_cd);
			addColumnPathMap(Alloc_RsltR.$quality_typ, Srch_RsltR.$quality_typ);
			addColumnPathMap(Alloc_RsltR.$stk_insp_typ, Srch_RsltR.$stk_insp_typ);
			addColumnPathMap(Alloc_RsltR.$stk_id_typ, Srch_RsltR.$stk_id_typ);
			addColumnPathMap(Alloc_RsltR.$stk_bp_cd, Srch_RsltR.$stk_bp_cd);
			addColumnPathMap(Alloc_RsltR.$gd_cd, Srch_RsltR.$gd_cd);
			addColumnPathMap(Alloc_RsltR.$lot_no, Srch_RsltR.$lot_no);
			addColumnPathMap(Alloc_RsltR.$sublot_no, Srch_RsltR.$sublot_no);
			addColumnPathMap(Alloc_RsltR.$sno1, Srch_RsltR.$sno1);
			addColumnPathMap(Alloc_RsltR.$sno2, Srch_RsltR.$sno2);
			addColumnPathMap(Alloc_RsltR.$sno3, Srch_RsltR.$sno3);
			addColumnPathMap(Alloc_RsltR.$sno4, Srch_RsltR.$sno4);
			addColumnPathMap(Alloc_RsltR.$pack_unit_cd, Srch_RsltR.$pack_unit_cd);
			addColumnPathMap(Alloc_RsltR.$pack_unit_qty, Srch_RsltR.$pack_unit_qty);
			addColumnPathMap(Alloc_RsltR.$base_unit_cd, Srch_RsltR.$base_unit_cd);
			addColumnPathMap(Alloc_RsltR.$base_unit_qty, Srch_RsltR.$base_unit_qty);
			addColumnPathMap(Alloc_RsltR.$vld_dt_fr, Srch_RsltR.$vld_dt_fr);
			addColumnPathMap(Alloc_RsltR.$vld_dt_to, Srch_RsltR.$vld_dt_to);

		}
	}
	
	protected Map_SloSts_DtlR_ShipSchdR<SloSts_DtlR,ShipSchdR> createMap_SloSts_DtlR_ShipSchdR() {
		return new Map_SloSts_DtlR_ShipSchdR<SloSts_DtlR, ShipSchdR>();
	}

	public class Map_SloSts_DtlR_ShipSchdR<D extends SloSts_DtlR, S extends ShipSchdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			
			addColumnPathMap(SloSts_DtlR.$slo_d_no, ShipSchdR.$slo_d_no);
			addColumnPathMap(SloSts_DtlR.$loc_cd, ShipSchdR.$loc_cd);
			addColumnPathMap(SloSts_DtlR.$alloc_grp_cd, ShipSchdR.$alloc_grp_cd);
			addColumnPathMap(SloSts_DtlR.$ship_lg_grp_cd, ShipSchdR.$ship_fr_lg_grp_cd);
			
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.slo_sts_typ(MSC_SLO_STS_TYP.ALLOC_UPD.value());
		}
	}
	
	protected Map_SloSts_DtlR_ShipAllocR<SloSts_DtlR,ShipAllocR> createMap_SloSts_DtlR_ShipAllocR() {
		return new Map_SloSts_DtlR_ShipAllocR<SloSts_DtlR, ShipAllocR>();
	}

	public class Map_SloSts_DtlR_ShipAllocR<D extends SloSts_DtlR, S extends ShipAllocR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SloSts_DtlR.$slo_d_no, ShipAllocR.$slo_d_no);
			addColumnPathMap(SloSts_DtlR.$ship_lg_grp_cd, ShipAllocR.$ship_lg_grp_cd);
			addColumnPathMap(SloSts_DtlR.$alloc_grp_cd, ShipAllocR.$alloc_grp_cd);
			addColumnPathMap(SloSts_DtlR.$unit_cd, ShipAllocR.$pack_unit_cd);
			addColumnPathMap(SloSts_DtlR.$loc_cd, ShipAllocR.$ship_loc_cd);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.qty(src.alloc_chng_qty().multiply(-1));
			dest.slo_sts_typ(MSC_SLO_STS_TYP.ALLOC_UPD.value());
		}
	}
	
	protected Map_MSW_SHIP_SCHD_DT_CALC_R_Srch01_ShipSchdRsltR<MSW_SHIP_SCHD_DT_CALC_R,Srch01_ShipSchdRsltR> createMap_MSW_SHIP_SCHD_DT_CALC_R_Srch01_ShipSchdRsltR() {
		return new Map_MSW_SHIP_SCHD_DT_CALC_R_Srch01_ShipSchdRsltR<MSW_SHIP_SCHD_DT_CALC_R, Srch01_ShipSchdRsltR>();
	}

	public class Map_MSW_SHIP_SCHD_DT_CALC_R_Srch01_ShipSchdRsltR<D extends MSW_SHIP_SCHD_DT_CALC_R, S extends Srch01_ShipSchdRsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_to_id_typ, Srch01_ShipSchdRsltR.$ship_to_id_typ);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_to_id_cd, Srch01_ShipSchdRsltR.$ship_to_id_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_to_lg_grp_cd, Srch01_ShipSchdRsltR.$ship_to_lg_grp_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_fr_lg_grp_cd, Srch01_ShipSchdRsltR.$ship_fr_lg_grp_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_term_cd, Srch01_ShipSchdRsltR.$ship_term_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$dlv_day_week_typ, Srch01_ShipSchdRsltR.$dlv_day_week_typ);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_inst_typ, Srch01_ShipSchdRsltR.$ship_inst_typ);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.dlv_rqst_tm(nvl(src.pd_inst_dlv_tm(), src.dlv_rqst_tm()));
			dest.ship_rqst_tm(nvl(src.ship_rqst_tm(), src.ship_pr_ship_rqst_tm()));
			
			dest.base_dt(getToday());
			if (isSlo(src)) {
				dest.cl_time_chk_flg(true);
				dest.ship_dt_chk_flg(true);
				dest.ship_cal_cd_chk_flg(true);
				dest.early_ship_dt_add_days_chk_flg(true);
			}
			else {
				dest.cl_time_chk_flg(false);
				dest.ship_dt_chk_flg(false);
				dest.ship_cal_cd_chk_flg(false);
				dest.early_ship_dt_add_days_chk_flg(false);
			}
		}
		protected boolean isSlo(S src) {
			return !isNull(src.slo_d_no());
		}
	}
	
	protected Map_ShipLot_DtlR_Srch01_ShipSchdRsltR<ShipLot_DtlR,Srch01_ShipSchdRsltR> createMap_ShipLot_DtlR_Srch01_ShipSchdRsltR() {
		return new Map_ShipLot_DtlR_Srch01_ShipSchdRsltR<ShipLot_DtlR, Srch01_ShipSchdRsltR>();
	}

	public class Map_ShipLot_DtlR_Srch01_ShipSchdRsltR<D extends ShipLot_DtlR, S extends Srch01_ShipSchdRsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipLot_DtlR.$cst_cd, Srch01_ShipSchdRsltR.$cst_cd);
			addColumnPathMap(ShipLot_DtlR.$itm_cd, Srch01_ShipSchdRsltR.$itm_cd);
			addColumnPathMap(ShipLot_DtlR.$itm_sub1, Srch01_ShipSchdRsltR.$itm_sub1);
			addColumnPathMap(ShipLot_DtlR.$itm_sub2, Srch01_ShipSchdRsltR.$itm_sub2);
			addColumnPathMap(ShipLot_DtlR.$itm_sub3, Srch01_ShipSchdRsltR.$itm_sub3);
			addColumnPathMap(ShipLot_DtlR.$dlv_cd, Srch01_ShipSchdRsltR.$dlv_id_cd);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.base_dt(isNull(src.dlv_schd_tm()) ? null : src.dlv_schd_tm().startTimeOfDay());
			dest.lock_flg(true);
		}
	}
	
	protected Map_Alloc_Avl_Sprt01_CndR_ShipSchdR<Alloc_Avl_Sprt01_CndR,ShipSchdR> createMap_Alloc_Avl_Sprt01_CndR_ShipSchdR() {
		return new Map_Alloc_Avl_Sprt01_CndR_ShipSchdR<Alloc_Avl_Sprt01_CndR, ShipSchdR>();
	}

	public class Map_Alloc_Avl_Sprt01_CndR_ShipSchdR<D extends Alloc_Avl_Sprt01_CndR, S extends ShipSchdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			
			addColumnPathMap(Alloc_Avl_Sprt01_CndR.$peg_no, ShipSchdR.$peg_no);
			addColumnPathMap(Alloc_Avl_Sprt01_CndR.$dlv_lg_grp_cd, ShipSchdR.$ship_to_lg_grp_cd);
			addColumnPathMap(Alloc_Avl_Sprt01_CndR.$gi_lg_grp_cd, ShipSchdR.$ship_fr_lg_grp_cd);
			addColumnPathMap(Alloc_Avl_Sprt01_CndR.$ship_term_cd, ShipSchdR.$ship_term_cd);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			if (src.sls_cststk_flg()) {
				// 預り売上の場合は、売上予定日を出庫予定日とする。
				dest.gi_schd_dt(src.sls_schd_dt());
			}
			else {
				dest.gi_schd_dt(src.ship_schd_tm().startTimeOfDay());
			}
		}
	}
	
	protected Map_Alloc_Avl_Sprt01_CndR_Srch01_ShipSchdRsltR<Alloc_Avl_Sprt01_CndR,Srch01_ShipSchdRsltR> createMap_Alloc_Avl_Sprt01_CndR_Srch01_ShipSchdRsltR() {
		return new Map_Alloc_Avl_Sprt01_CndR_Srch01_ShipSchdRsltR<Alloc_Avl_Sprt01_CndR, Srch01_ShipSchdRsltR>();
	}

	public class Map_Alloc_Avl_Sprt01_CndR_Srch01_ShipSchdRsltR<D extends Alloc_Avl_Sprt01_CndR, S extends Srch01_ShipSchdRsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			
			addColumnPathMap(Alloc_Avl_Sprt01_CndR.$dlv_lg_grp_cd, Srch01_ShipSchdRsltR.$ship_to_lg_grp_cd);
			addColumnPathMap(Alloc_Avl_Sprt01_CndR.$gi_lg_grp_cd, Srch01_ShipSchdRsltR.$ship_fr_lg_grp_cd);
			addColumnPathMap(Alloc_Avl_Sprt01_CndR.$ship_term_cd, Srch01_ShipSchdRsltR.$ship_term_cd);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			if (src.sls_cststk_flg()) {
				// 預り売上の場合は、売上予定日を出庫予定日とする。
				dest.gi_schd_dt(src.sls_schd_dt());
			}
			else {
				dest.gi_schd_dt(src.ship_schd_tm().startTimeOfDay());
			}
		}
	}

	//FMCB CUSTOM END
}