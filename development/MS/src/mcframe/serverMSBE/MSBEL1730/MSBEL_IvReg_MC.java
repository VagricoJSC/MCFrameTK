package mcframe.serverMSBE.MSBEL1730;

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
import mcframe.serverMSBE.MSBEL1730.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5500.*;
import mcframe.serverMSBE.MSBEL5720.*;
import mcframe.serverMSBB.MSBBL6220.*;
import mcframe.serverMSBB.MSBBL6080.*;
import static mcframe.serverMSBE.MSBEL1730.Query.*;
import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import mcframe.serverMSBE.MSBEL5730.*;
import mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR;

import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMSUC.MSUCL0020.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_IvReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_IvReg_MC extends MSBEL_IvReg_MC_A{
	//FMCB CUSTOM START
	
	/**
	 * Ins01オペレーション.<p>
	 *
	 * インボイスを登録する<br>
	 */
	public class Ins01 extends MSBEL_IvReg_MC_A.Ins01 {

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			editUp();
	
			callIvRegServiceChk01();
			
			throwUpdErr();
			
			callIvRegServiceIns01();
			
			setDown();
		}
		
		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {
			
			setPegNo(up1());
			
			setManualAddFlg(up1());
			
			//インボイス登録対象選択画面から遷移してくるときに、
			//インボイスの更新カウンタチェックは必要ないが、必須チェックに引っかかるため、適宜非NULL値を設定。
			if(isNull(up0().iv_upd_cntr())) {
				up0().iv_upd_cntr(-1);
			}
		}
		
		protected void callIvRegServiceChk01() {
			
			MSBEL_IvRegService.Iv_Chk01 ope = MSBEL_IvRegService.crtIv_Chk01();
			MCRow.copyall(ope.up0(), up0());
			ope.up0().data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.up3().setAll(up3());
			ope.up4().setAll(up4());
			ope.exec();
			
			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
			up2().setAll(ope.down2());
			up3().setAll(ope.down3());
			up4().setAll(ope.down4());
		}
		
		protected void callIvRegServiceIns01() {
			
			MSBEL_IvRegService.Iv_Ins01 ope = MSBEL_IvRegService.crtIv_Ins01();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.up3().setAll(up3());
			ope.up4().setAll(up4());
			ope.exec();
			
			up0().iv_no(ope.down0().iv_no());
			up0().iv_rev(ope.down0().iv_rev());
			up1().setAll(ope.down1());
		}
		
		protected void setDown() {
			down0().iv_no(up0().iv_no());
			down0().iv_rev(up0().iv_rev());
			down1().setAll(up1());
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * インボイスを更新する<br>
	 */
	public class Upd01 extends MSBEL_IvReg_MC_A.Upd01 {

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			editUp();
	
			callIvRegServiceChk01();
			
			throwUpdErr();
			
			callIvRegServiceUpd01();
			
			setDown();
		}
		
		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {
			
			setPegNo(up1());
			
			setManualAddFlg(up1());
		}
		
		protected void callIvRegServiceChk01() {
			
			MSBEL_IvRegService.Iv_Chk01 ope = MSBEL_IvRegService.crtIv_Chk01();
			MCRow.copyall(ope.up0(), up0());
			ope.up0().data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.up3().setAll(up3());
			ope.up4().setAll(up4());
			ope.exec();
			
			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
			up2().setAll(ope.down2());
			up3().setAll(ope.down3());
			up4().setAll(ope.down4());
		}
		
		protected void callIvRegServiceUpd01() {
			
			MSBEL_IvRegService.Iv_Upd01 ope = MSBEL_IvRegService.crtIv_Upd01();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.up3().setAll(up3());
			ope.up4().setAll(up4());
			ope.exec();
			
			up0().iv_no(ope.down0().iv_no());
			up0().iv_rev(ope.down0().iv_rev());
			up1().setAll(ope.down1());
		}
		
		protected void setDown() {
			down0().iv_no(up0().iv_no());
			down0().iv_rev(up0().iv_rev());
			down1().setAll(up1());
		}
	}
	
	/**
	 * Del01オペレーション.<p>
	 *
	 * インボイスを取り消す<br>
	 */
	public class Del01 extends MSBEL_IvReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			callIvRegServiceChk02();
			
			throwCanErr();
			
			callIvRegServiceDel01();
		}
		
		protected void callIvRegServiceChk02() {
			
			MSBEL_IvRegService.Iv_Chk02 ope = MSBEL_IvRegService.crtIv_Chk02();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.exec();
			
			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
			up2().setAll(ope.down2());
		}
		
		protected void callIvRegServiceDel01() {
			
			MSBEL_IvRegService.Iv_Del01 ope = MSBEL_IvRegService.crtIv_Del01();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.exec();
		}
	}
	
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 更新対象または新規登録対象のインボイスを取得する<br>
	 */
	public class Srch01 extends MSBEL_IvReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			getLatestIvRev(up0());
			
			MCQueryPlan sql = null;
			if (MSC_STK_SRCH_TGT_TYP.isRCPT_IV_NO(up0().srch_tgt_typ()) 
					|| !up0().ref_ope_flg() 
					|| (up0().latest_flg() && !up0().can_flg())) {
				sql = MSBEL1730_MST_IV_S01();
			}
			else {
				sql = MSBEL1730_MST_IV_S02();
			}
			
			doSrchIv(up0(), down0(), down1(),  down2(), sql);
		}
		/**
		 * 最新インボイス改訂番号を取得する。
		 * @param cndR 検索条件
		 */
		protected void getLatestIvRev(Srch01_CndR cndR) {
			
			if (MSC_STK_SRCH_TGT_TYP.isIV_NO(cndR.srch_tgt_typ()) && cndR.ref_ope_flg()) {
				MCList<MST_IV_P_R> ivPL = MCList.create(MST_IV_P_R.class);
				ivPL.addBooleanColumn("can_flg");
				
				MST_IV_P_R ivP = MST_IV_P_R.create("IVP");
				MST_IV_R iv = MST_IV_R.create("IV");
				MCQueryApiBuilder ivPL_bldr = MCQueryApiBuilder.create(ivP);
				ivPL_bldr.setSelect(ivP.iv_mng_no, ivP.iv_no, ivP.iv_rev, decode(iv.iv_mng_no, nullValue(), value(true), value(false)).as("can_flg"));
				ivPL_bldr.addLeftOuterJoin(iv, ivP.iv_mng_no.eq(iv.iv_mng_no).and( ivP.iv_rev.eq(iv.iv_rev)));
				ivPL_bldr.setWhere(ivP.iv_no.eq(bind("1")), cndR.srch_tgt_no());
				ivPL_bldr.addWhereWithCutOffAnd(ivP.iv_mng_no.eq(bind("1")), cndR.iv_mng_no());
				
				dbSelect("MSBEL1730_MST_IV_R_S01", ivPL, ivPL_bldr);
				
				if (!ivPL.isEmpty()) {
					
					if (!cndR.latest_flg()) {
						MCList<MST_IV_P_R> grpL = ivPL.groupBy(MST_IV_P_R.$iv_mng_no);
						if(grpL.size() > 1) {
							MCMessage msg = new MCMessage(MSBEL1109);
							MCMessagePool.add(msg);
							throwErr(msgOpeErr());
						}
					}
					
					ivPL.sort(SortType.DESC, MST_IV_P_R.$iv_mng_no, MST_IV_P_R.$iv_rev);
					MST_IV_P_R latestIvR = ivPL.get(0);
					cndR.latest_iv_mng_no(latestIvR.iv_mng_no());
					cndR.latest_iv_rev(latestIvR.iv_rev());
					cndR.can_flg(latestIvR.getBooleanNE("can_flg"));
					if (cndR.latest_iv_rev().eq(cndR.srch_tgt_rev())) {
						cndR.latest_flg(true);
					}
					
					if (cndR.latest_flg() && isNull(cndR.srch_tgt_rev())) {
						cndR.srch_tgt_rev(latestIvR.iv_rev());
					}
				}
			}
		}
		
		/**
		 * インボイスの検索処理を実行する
		 */
		protected void doSrchIv(
				Srch01_CndR u0,	
				Srch01_HdrR d0, 
				MCList<Srch01_DtlR> d1, 
				MCList<Srch01_MapDtlR> d2, 
				MCQueryPlan sqlId) 
		{
			MCRow bind = MCRow.create();
			if(MSC_STK_SRCH_TGT_TYP.isIV_NO(u0.srch_tgt_typ())) {
				bind.addStringColumn("iv_no", u0.srch_tgt_no());
			}
			else {
				if(!isNull(u0.rcpt_iv_mng_no())) {
					bind.addStringColumn("rcpt_iv_mng_no", u0.rcpt_iv_mng_no());
				}
				else {
					bind.addStringColumn("rcpt_iv_no", u0.srch_tgt_no());
				}
			}
			bind.addStringColumn("iv_mng_no", u0.latest_iv_mng_no());
			bind.addNumberColumn("latest_iv_rev", u0.latest_iv_rev());
			bind.addNumberColumn("iv_rev", u0.srch_tgt_rev());
			bind.addDateColumn("today", getToday());
			
			MCList<Srch01_DtlR> tmpDtlL = crtSrchDtl();
			executeQuery(tmpDtlL, sqlId, bind);
			
			MCList<Srch01_DtlR> dtlL = removeDup(tmpDtlL);
			
			//ＤＡＣ制御：同じインボイスのなかで、インボイス明細が一つでもＤＡＣ権限がなければ、該当インボイスを排除する
			dtlL = chkDac(dtlL);
			if (dtlL.isEmpty()) {
				return;
			}
			
			if(MSC_STK_SRCH_TGT_TYP.isRCPT_IV_NO(u0.srch_tgt_typ())) {
				MCList<Srch01_DtlR> tmpL = dtlL.groupBy(Srch01_DtlR.$iv_mng_no);
				if(tmpL.size() > 1) {
					MCMessage msg = new MCMessage(MSBEL0249);
					MCMessagePool.add(msg);
					throwErr(msgOpeErr());
				}
			}
						
			// インボイスヘッダ
			copy(d0, dtlL.get(0), createMap_Srch01_HdrR_Srch01_DtlR());
			setSlsCststk(d0, dtlL);

			convTrdUnitQty(dtlL);
			
			// インボイス明細
			d1.setAll(dtlL);
			setShipRqstNo(d0.trd_ptn_typ(), d1); //出荷依頼ＮＯを設定する
			d1.sort(Srch01_DtlR.$disp_seq, Srch01_DtlR.$iv_d_no);
			
			//インボイスマップ
			setIvMapDown(d2, d1, d0);
			
			//明細とマップの紐づくindexを付与する
			setIndex(d1, d2);
			setIvShipInstMapDown();
			setIvShipActMapDown();
		}
		
		/**
		 * インボイスマップが複数ある場合の重複を除外する
		 * 
		 * @param tmpDtlL
		 * @return
		 */
		protected MCList<Srch01_DtlR> removeDup(MCList<Srch01_DtlR> tmpDtlL){
			if(tmpDtlL.isEmpty()) {
				return tmpDtlL;
			}
			if (tmpDtlL.get(0).getBoolean("pre_rcpt_iv_flg")) {
				return tmpDtlL;
			}
			
			MCList<Srch01_DtlR> dtlL = tmpDtlL.createInstance();
			
			for (MCList<Srch01_DtlR> d : tmpDtlL.groupList(Srch01_DtlR.$iv_d_no)) {
				Srch01_DtlR r = d.get(0);
				if (r.bndl_flg()) {
					if (d.groupBy(Srch01_DtlR.$ship_fr_lg_grp_cd).size() > 1) {
						r.multi_ship_fr_lg_grp_flg(true);
						r.ship_fr_lg_grp_cd(null);
						r.ship_fr_lg_grp_nm(null);
					}
					r.ship_inst_no(null);
					r.ship_inst_d_no(null);
					r.ship_act_no(null);
					r.ship_act_d_no(null);
				}
				else if (r.purc_ddlv_flg()) {
					r.ship_fr_lg_grp_cd(null);
					r.ship_fr_lg_grp_nm(null);
				}
				dtlL.add(r);
			}
			return dtlL;
		}

		protected MCList<Srch01_DtlR> chkDac(MCList<Srch01_DtlR> chkL){
			if(chkL.isEmpty()) {
				return chkL;
			}

			MCList<Srch01_DtlR> rsltL = chkL.createInstance();

			MCList<Srch01_DtlR> gpL = chkL.groupBy(Srch01_DtlR.$iv_mng_no);
			for(Srch01_DtlR gpR : gpL){
				MCList<Srch01_DtlR> subL = chkL.subList(Srch01_DtlR.$iv_mng_no, gpR.iv_mng_no());

				String trd_ptn_typ = subL.get(0).getStringNE(Srch01_HdrR.$trd_ptn_typ);
				if(MAC_TRD_PTN_TYP.isSLS(trd_ptn_typ)
						|| MAC_TRD_PTN_TYP.isSHIP(trd_ptn_typ) || MAC_TRD_PTN_TYP.isSLS_CNSGN(trd_ptn_typ)){
					boolean dacOK = true;
					for(Srch01_DtlR r : subL){
						if(!readableWgCdDac(r.sls_dpt_wg_cd())){
							dacOK = false;
							break;
						}
					}
					if(dacOK) {
						rsltL.addAll(subL);
					}
				}
				// 支給・移送の場合
				else if(MAC_TRD_PTN_TYP.isPROV(trd_ptn_typ)
						|| MAC_TRD_PTN_TYP.isXFR(trd_ptn_typ)
						|| MAC_TRD_PTN_TYP.isXFR_RTN(trd_ptn_typ)){
					boolean dacOK = true;
					for(Srch01_DtlR r : subL){
						if(!readableLocCdDac(r.getStringNE("chk_gi_loc_cd"))){
							dacOK = false;
							break;
						}
					}
					if(dacOK) {
						rsltL.addAll(subL);
					}
				}
			}
			
			return rsltL;
		}

		protected void convTrdUnitQty(MCList<Srch01_DtlR> dL) {
			for(Srch01_DtlR dR : dL) {
				if(isSame(dR.trd_unit_cd(), dR.base_unit_cd())) {
					dR.max_trd_unit_qty(dR.max_base_unit_qty());
				}
				else {
					dR.max_trd_unit_qty(rvrsBaseUnitConv(
							dR.max_base_unit_qty(),
							dR.trd_unit_conv_base_qty(), 
							dR.trd_unit_conv_qty(),
							dR.trd_unit_dec_place(), 
							dR.trd_unit_rnd_typ()));
				}
			}
		}

		/**
		 * インボイス明細データをもとに、インボイスマップデータを纏める。
		 */
		protected void setIvMapDown(MCList<Srch01_MapDtlR> d2, MCList<Srch01_DtlR> d1, Srch01_HdrR d0) {		

			//新規（三国間）の場合
			if(!isNull(d0.rcpt_iv_mng_no()) && d0.pre_rcpt_iv_flg()) {
				for(Srch01_DtlR dR : d1) {
					Srch01_MapDtlR mapR = Srch01_MapDtlR.create();
					
					mapR.iv_d_no(dR.iv_d_no());
					mapR.ship_schd_no(dR.ship_schd_no());
					mapR.trd_unit_qty(dR.trd_unit_qty());
					mapR.base_unit_qty(dR.base_unit_qty());
					mapR.pr_sts_typ(dR.pr_sts_typ());
					mapR.ship_inst_typ(dR.ship_inst_typ());

					d2.add(mapR);
				}
			}
			//更新の場合
			else {
				MST_IV_MAP_R t = MST_IV_MAP_R.create("T");
				MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
				MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");

				MCList<MST_IV_MAP_R> mapL = MCList.create(MST_IV_MAP_R.class);
				MCQueryApiBuilder mapL_bldr = MCQueryApiBuilder.create(t);
				mapL_bldr.setSelect(t.iv_d_no, t.ship_schd_no, t.trd_unit_qty, t.base_unit_qty);
				mapL_bldr.addSelect(t1.pr_sts_typ);				//進捗状況区分
				mapL_bldr.addSelect(t2.ship_inst_typ);			//出荷指図区分
				mapL_bldr.addSelect(t1.ship_inst_qty);			//出荷指図数量
				mapL_bldr.addSelect(t1.ship_act_qty);			//出荷実績数量

				mapL_bldr.addInnerJoin(t1, bracket( t.ship_schd_no.eq(t1.ship_schd_no)));
				mapL_bldr.addInnerJoin(t2, bracket( t1.ship_pr_no.eq(t2.ship_pr_no)));

				mapL_bldr.setWhere(t.iv_d_no.eq(bind("iv_d_no")));
				dbSelect("MSBEL1730_MST_IV_MAP_S01", mapL, mapL_bldr, d1);
				setAll(d2, mapL, createMap_Srch01_MapDtlR_MST_IV_MAP_R());
			}
		}

		/**
		 * 明細とマップの紐づくindexを付与する
		 * @param d1
		 * @param d2
		 */
		protected void setIndex(MCList<Srch01_DtlR> d1, MCList<Srch01_MapDtlR> d2) {
			int index = 1;

			for(Srch01_DtlR dR : d1) {
				if(dR.manual_add_flg()) {
					continue;
				}

				dR.index(index);

				index ++;
			}
			
			for(Srch01_MapDtlR mapR : d2) {
				for(Srch01_DtlR dR : d1) {
					if(isSame(mapR.iv_d_no(), dR.iv_d_no())) {
						mapR.index(dR.index());
	
						break;
					}
				}
			}
		}
		
		/**
		 * インボイス出荷指図マップの下り電文を設定する。
		 */
		protected void setIvShipInstMapDown() {
			
			if (MSC_IV_SRC_TYP.isSHIP_INST( down0().iv_src_typ())) {
				MST_IV_SHIP_INST_MAP_R ivShipInstMap = MST_IV_SHIP_INST_MAP_R.create("IVSHIPINSTMAP");
				MCQueryApiBuilder ivShipInstMap_bldr = MCQueryApiBuilder.create(ivShipInstMap);
				ivShipInstMap_bldr.setSelect(ivShipInstMap.iv_d_no, ivShipInstMap.ship_schd_no, ivShipInstMap.ship_inst_d_no);
				ivShipInstMap_bldr.addSum(ivShipInstMap.base_unit_qty, MST_IV_SHIP_INST_MAP_R.$base_unit_qty);
				ivShipInstMap_bldr.setWhere(ivShipInstMap.iv_d_no.eq(bind(MST_IV_D_R.$iv_d_no)));
				ivShipInstMap_bldr.addGroupBy(ivShipInstMap.iv_d_no, ivShipInstMap.ship_schd_no, ivShipInstMap.ship_inst_d_no);
				
				dbSelect("MSBEL1730_MST_IV_SHIP_INST_MAP_S01", down3(), ivShipInstMap_bldr, down1());
				
				for(Srch01_ShipInstMapDtlR mapR : down3()) {
					for(Srch01_DtlR dR : down1()) {
						if(isSame(mapR.iv_d_no(), dR.iv_d_no())) {
							mapR.index(dR.index());
							break;
						}
					}
				}
			}
		}
		
		/**
		 * インボイス出荷実績マップの下り電文を設定する。
		 */
		protected void setIvShipActMapDown() {
			
			if (MSC_IV_SRC_TYP.isSHIP_ACT( down0().iv_src_typ())) {
				MST_IV_SHIP_ACT_MAP_R ivShipActMap = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
				MCQueryApiBuilder ivShipActMap_bldr = MCQueryApiBuilder.create(ivShipActMap);
				ivShipActMap_bldr.setSelect(ivShipActMap.iv_d_no, ivShipActMap.ship_schd_no, ivShipActMap.ship_alloc_sts_no,
						ivShipActMap.ship_act_d_no, ivShipActMap.base_unit_qty);
				ivShipActMap_bldr.setWhere(ivShipActMap.iv_d_no.eq(bind(MST_IV_D_R.$iv_d_no)));
				
				dbSelect("MSBEL1730_MST_IV_SHIP_ACT_MAP_S01", down4(), ivShipActMap_bldr, down1());
				
				for(Srch01_ShipActMapDtlR mapR : down4()) {
					for(Srch01_DtlR dR : down1()) {
						if(isSame(mapR.iv_d_no(), dR.iv_d_no())) {
							mapR.index(dR.index());
							break;
						}
					}
				}
			}
		}
		
		/**
		 * 預り売上に関連する項目を設定する。
		 */
		protected void setSlsCststk(Srch01_HdrR hdrR, MCList<Srch01_DtlR> dtlL) {
			Srch01_DtlR slsCststkR = dtlL.getFirst("sls_cststk_flg", true);
			
			if (!isNull(slsCststkR)) {
				hdrR.sls_cststk_flg(true);
				MCNumber slsQty =  slsCststkR.getNumberNE("sls_qty");
				if (!isNull(slsQty) && slsQty.isPositive()) {
					hdrR.sls_cmpl_flg(true);
				}
			}
		}
		
		@Override
		protected void doEditDown() {
			super.doEditDown();
			
			//登録機能名・更新機能名を補完する
			setFuncNm(down0());
			doCompTime(down1(), false);
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * インボイス作成元区分に従い、新規登録対象の出荷予定、出荷指図、出荷実績を取得する<br>
	 */
	public class Srch02 extends MSBEL_IvReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			MCQueryPlan sql = null;
			if (MSC_IV_SRC_TYP.isSHIP_SCHD(up1().iv_src_typ())) {
				// 出荷予定
				sql = MSBEL1730_MST_SHIP_SCHD_S02();
				insShipSchdWk(up0());
			}
			else if (MSC_IV_SRC_TYP.isSHIP_INST(up1().iv_src_typ())) {
				// 出荷指図
				sql = MSBEL1730_MST_SHIP_INST_D_S01();
				crtShipInstDWk(up0().distinctNE(Srch02_CndR.$ship_inst_d_no).getStringNE(Srch02_CndR.$ship_inst_d_no));
			}
			else if (MSC_IV_SRC_TYP.isSHIP_ACT(up1().iv_src_typ())) {
				// 出荷実績
				sql = MSBEL1730_MST_SHIP_ACT_D_S01();
				crtShipActDWk(up0().distinctNE(Srch02_CndR.$ship_act_d_no).getStringNE(Srch02_CndR.$ship_act_d_no));
			}
			
			doSrch(sql);
		}
				
		/**
		 * 検索処理を実行する。
		 * @param sqlId 検索SQL
		 */
		protected void doSrch(MCQueryPlan sql) {
			
			MCRow bind = MCRow.create();
			bind.addDateColumn("iv_dt", getToday());

			MCList<Srch01_DtlR> rsltL = MCList.create(Srch01_DtlR.class);
			executeQuery(rsltL, sql, bind);

			if (rsltL.isEmpty()) {
				return;
			}
			
			// 基準単位から取引単位に換算する
			convTrdUnitQty(rsltL);
			
			// 出荷依頼ＮＯを設定する
			setShipRqstNo(up1().trd_ptn_typ(), rsltL);
			
			// 明細をまとめる
			bndl(up1().iv_src_typ(), rsltL, down0(), down1(), down2(), down3());
			
			// 明細の金額を計算する
			setRsltAmt(down0());
		}

		protected void insShipSchdWk(MCList<Srch02_CndR> u0) {
			MCList<MST_SHIP_SCHD_R> insWkL = MCList.create(MST_SHIP_SCHD_R.class);
			MCQueryApiBuilder insWkL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
			dbWkDelete("MSBEL1730_MSW_SHIP_SCHD_D02", insWkL_bldr.getBaseDbc());
			for(Srch02_CndR cndR : u0) {
				MST_SHIP_SCHD_R r = MST_SHIP_SCHD_R.create();
				r.ship_schd_no(cndR.ship_schd_no());
				insWkL.add(r);
			}
			dbWkInsert("MSBEL1730_MSW_SHIP_SCHD_I02", insWkL, insWkL_bldr.getBaseDbc());
		}
		
	}
		
	/**
	 * 基準単位から取引単位に換算する。<br>
	 * 取引単位に換算できなかったら、基準単位とする。
	 * @param dL インボイス明細リスト
	 */
	protected void convTrdUnitQty(MCList<Srch01_DtlR> dL) {
		for(Srch01_DtlR dR : dL) {
			if(isSame(dR.trd_unit_cd(), dR.base_unit_cd())) {
				dR.trd_unit_qty(dR.base_unit_qty());
				dR.max_trd_unit_qty(dR.max_base_unit_qty());
			}
			else {
				MCNumber convQty = rvrsBaseUnitConv(dR.base_unit_qty(),
						dR.trd_unit_conv_base_qty(), dR.trd_unit_conv_qty(),
						dR.trd_unit_dec_place(), dR.trd_unit_rnd_typ());
				MCNumber baseUnitQty = convToBaseUnit(convQty,
						dR.trd_unit_conv_base_qty(), dR.trd_unit_conv_qty(),
						dR.base_unit_dec_place(), dR.base_unit_rnd_typ());
				
				MCNumber convMaxQty = rvrsBaseUnitConv(dR.max_base_unit_qty(),
						dR.trd_unit_conv_base_qty(), dR.trd_unit_conv_qty(),
						dR.trd_unit_dec_place(), dR.trd_unit_rnd_typ());
				MCNumber baseUnitMaxQty = convToBaseUnit(convMaxQty,
						dR.trd_unit_conv_base_qty(), dR.trd_unit_conv_qty(),
						dR.base_unit_dec_place(), dR.base_unit_rnd_typ());
				
				
				if (isSame(baseUnitQty, dR.base_unit_qty()) && isSame(baseUnitMaxQty, dR.max_base_unit_qty())) {
					dR.trd_unit_qty(convQty);
					dR.max_trd_unit_qty(convMaxQty);
				}
				else {
					dR.trd_unit_qty(dR.base_unit_qty());
					dR.max_trd_unit_qty(dR.max_base_unit_qty());
					dR.trd_unit_cd(dR.base_unit_cd());
					dR.trd_unit_nm(dR.base_unit_nm());
					dR.trd_unit_dec_place(dR.base_unit_dec_place());
					dR.trd_unit_rnd_typ(dR.base_unit_rnd_typ());
					dR.trd_unit_conv_base_qty(1);
					dR.trd_unit_conv_qty(1);
				}
			}
		}
	}
	
	/**
	 * 検索した明細をまとめる。
	 * @param rsltL 纏め元（IN）
	 * @param dtlL 纏めた下り電文（OUT）
	 * @param mapL 纏める時に初期化するインボイスマップ情報（OUT）
	 * @param shipInstMapL 纏める時に初期化するインボイス出荷指図マップ情報（OUT）
	 * @param shipActMapL 纏める時に初期化するインボイス出荷実績マップ情報（OUT）
	 */
	protected void bndl(String ivSrcTyp, MCList<Srch01_DtlR> rsltL, MCList<Srch01_DtlR> dtlL, MCList<Srch01_MapDtlR> mapL, MCList<Srch01_ShipInstMapDtlR> shipInstMapL, MCList<Srch01_ShipActMapDtlR> shipActMapL) {
		int index = 1;

		rsltL.sort(Srch01_DtlR.$slo_no, Srch01_DtlR.$ship_rqst_no, Srch01_DtlR.$purc_schd_no,
				Srch01_DtlR.$trd_unit_cd, Srch01_DtlR.$purc_act_d_no, Srch01_DtlR.$dlv_slip_d_no);

		for(int i = 0; i < rsltL.size(); i ++) {
			Srch01_DtlR dR = rsltL.get(i);
			dR.index(index);
			
			if (!dR.uplnd_flg()) {
				mapL.add(crtIvMapR(dR, index));
			}
			
			if (MSC_IV_SRC_TYP.isSHIP_INST(ivSrcTyp)) {
				shipInstMapL.add(crtIvShipInstMapR(dR, index));
			}
			else if (MSC_IV_SRC_TYP.isSHIP_ACT(ivSrcTyp)) {
				shipActMapL.add(crtIvShipActMapR(dR, index));
			}
			
			for(int j = i + 1; j < rsltL.size(); j ++) {
				Srch01_DtlR d2R = rsltL.get(j);
				if(((!dR.uplnd_flg() && !d2R.uplnd_flg()
						&& !dR.sls_cststk_flg() && !d2R.sls_cststk_flg()
						&& isSame(dR.slo_no(), d2R.slo_no()) 
						&& isSame(dR.ship_rqst_no(), d2R.ship_rqst_no()) 
						&& isSame(dR.purc_schd_no(), d2R.purc_schd_no()) 
						&& isSame(dR.purc_act_d_no(), d2R.purc_act_d_no()))
						|| (dR.uplnd_flg() && d2R.uplnd_flg() 
								&& isSame(dR.dlv_slip_d_no(), d2R.dlv_slip_d_no())))
						&& isSame(dR.trd_unit_cd(), d2R.trd_unit_cd())) {
					sum(dR, d2R);
					dR.bndl_flg(true);
					
					if (!isSame(dR.ship_fr_lg_grp_cd(), d2R.ship_fr_lg_grp_cd())) {
						dR.multi_ship_fr_lg_grp_flg(true);
						dR.ship_fr_lg_grp_cd(null);
						dR.ship_fr_lg_grp_nm(null);
					}
					
					if (!dR.uplnd_flg()) {
						mapL.add(crtIvMapR(d2R, index));
					}
					
					if (MSC_IV_SRC_TYP.isSHIP_INST(ivSrcTyp)) {
						shipInstMapL.add(crtIvShipInstMapR(d2R, index));
						dR.ship_inst_no(null);
						dR.ship_inst_d_no(null);
					}
					else if (MSC_IV_SRC_TYP.isSHIP_ACT(ivSrcTyp)) {
						shipActMapL.add(crtIvShipActMapR(d2R, index));
						dR.ship_act_no(null);
						dR.ship_act_d_no(null);
					}

					rsltL.remove(j);
					j--;
				}
				else {
					break;
				}
			}
			
			dtlL.add(dR);
			index ++;
		}
	}
	
	/**
	 * インボイスマップを作成する。
	 * @param dtlR 検索明細
	 * @param index インデックス
	 * @return インボイスマップ
	 */
	protected Srch01_MapDtlR crtIvMapR(Srch01_DtlR dtlR, int index) {
		
		Srch01_MapDtlR mapR = Srch01_MapDtlR.create();
		mapR.index(index);
		mapR.ship_schd_no(dtlR.ship_schd_no());
		mapR.trd_unit_qty(dtlR.trd_unit_qty());
		mapR.base_unit_qty(dtlR.base_unit_qty());
		mapR.pr_sts_typ(dtlR.pr_sts_typ());
		mapR.ship_inst_typ(dtlR.ship_inst_typ());
		
		return mapR;
	}
	
	/**
	 * インボイス出荷指図マップを作成する。
	 * @param dtlR 検索明細
	 * @param index インデックス
	 * @return インボイス出荷指図マップ
	 */
	protected Srch01_ShipInstMapDtlR crtIvShipInstMapR(Srch01_DtlR dtlR, int index) {
		
		Srch01_ShipInstMapDtlR shipInstMapR = Srch01_ShipInstMapDtlR.create();
		shipInstMapR.index(index);
		 shipInstMapR.ship_schd_no(dtlR.ship_schd_no());
		 shipInstMapR.ship_alloc_sts_no(dtlR.ship_alloc_sts_no());
		shipInstMapR.ship_inst_d_no(dtlR.ship_inst_d_no());
		shipInstMapR.base_unit_qty(dtlR.base_unit_qty());
		
		return shipInstMapR;
	}
	
	/**
	 * インボイス出荷実績マップを作成する。
	 * @param dtlR 検索明細
	 * @param index インデックス
	 * @return インボイス出荷実績マップ
	 */
	protected Srch01_ShipActMapDtlR crtIvShipActMapR(Srch01_DtlR dtlR, int index) {
		
		Srch01_ShipActMapDtlR shipActMapR = Srch01_ShipActMapDtlR.create();
		shipActMapR.index(index);
		shipActMapR.ship_schd_no(nvl(dtlR.ship_schd_no(), MAC_STR.NULL_VAL.value()));
		shipActMapR.ship_alloc_sts_no(nvl(dtlR.ship_alloc_sts_no(), MAC_STR.NULL_VAL.value()));
		shipActMapR.ship_act_d_no(dtlR.ship_act_d_no());
		shipActMapR.base_unit_qty(dtlR.base_unit_qty());
		
		return shipActMapR;
	}
	
	/**
	 * 有償支給の場合は、出荷予定ごとに支給予定が分割されるので、まとめる際は合算する。
	 * @param dR 合計対象１
	 * @param d2R 合計対象２
	 */
	protected void sum(Srch01_DtlR dR, Srch01_DtlR d2R) {
		dR.trd_unit_qty(dR.trd_unit_qty().add(d2R.trd_unit_qty()));			//取引単位数量
		dR.base_unit_qty(dR.base_unit_qty().add(d2R.base_unit_qty()));		//基準数量
		
		if (MAC_TRD_PTN_TYP.isPROV(dR.trd_ptn_typ()) 
				&& (MAC_PROV_BASIS_TYP.isGI(dR.prov_basis_typ()) || MAC_PROV_BASIS_TYP.isGR(dR.prov_basis_typ()))) {
			dR.schd_trd_cur_amt(dR.schd_trd_cur_amt().add(d2R.schd_trd_cur_amt()));
			dR.schd_trd_cur_tax_amt(dR.schd_trd_cur_tax_amt().add(d2R.schd_trd_cur_tax_amt()));
		}
	}
	
	/**
	 * 出荷指図明細のワークテーブルを作成する。
	 * @param shipInstDNoL 出荷指図明細NOリスト
	 */
	protected void crtShipInstDWk(List<String> shipInstDNoL) {
		
		MCList<MST_SHIP_INST_D_R> lst = MCList.create(MST_SHIP_INST_D_R.class);
		MST_SHIP_INST_D_R r = null;
		
		for (String shipInstDNo : shipInstDNoL) {
			
			r = MST_SHIP_INST_D_R.create();
			r.ship_inst_d_no(shipInstDNo);
			
			lst.add(r);
		}

		MCQueryApiBuilder shipInstD_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_D_R.create("T"));
		dbWkDelete("MSBEL1730_MSW_SHIP_INST_D_D01", shipInstD_bldr.getBaseDbc());
		dbWkInsert("MSBEL1730_MSW_SHIP_INST_D_I01", lst, shipInstD_bldr.getBaseDbc());
	}
	
	/**
	 * 出荷実績明細のワークテーブルを作成する。
	 * @param shipActDNoL 出荷実績明細NOリスト
	 */
	protected void crtShipActDWk(List<String> shipActDNoL) {
		
		MCList<MST_SHIP_ACT_D_R> lst = MCList.create(MST_SHIP_ACT_D_R.class);
		MST_SHIP_ACT_D_R r = null;
		
		for (String shipActDNo : shipActDNoL) {
			
			r = MST_SHIP_ACT_D_R.create();
			r.ship_act_d_no(shipActDNo);
			
			lst.add(r);
		}

		MCQueryApiBuilder shipActD_bldr = MCQueryApiBuilder.create(MST_SHIP_ACT_D_R.create("T"));
		dbWkDelete("MSBEL1730_MSW_SHIP_ACT_D_D01", shipActD_bldr.getBaseDbc());
		dbWkInsert("MSBEL1730_MSW_SHIP_ACT_D_I01", lst, shipActD_bldr.getBaseDbc());
	}
	
		/**
		 * 明細の金額を計算する（ヘッダの金額はクライアントで計算する）
		 */
		protected void setRsltAmt(MCList<Srch01_DtlR> down) {
			
			setPegNo(down);

			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();

			for (Srch01_DtlR dR : down) {

				//取引パタン：移動・移送 or 移動・移送返品
				if(MAC_TRD_PTN_TYP.isXFR(dR.trd_ptn_typ()) 
					|| MAC_TRD_PTN_TYP.isXFR_RTN(dR.trd_ptn_typ())) { 
					setAmtXfr(dR);
					continue;
				}
				else if (MAC_TRD_PTN_TYP.isPROV(dR.trd_ptn_typ()) 
						&& (MAC_PROV_BASIS_TYP.isINPT(dR.prov_basis_typ()) || isNull(dR.prov_basis_typ()))) {
					setAmtXfr(dR);
					continue;
				}
				else if (MAC_TRD_PTN_TYP.isSHIP(dR.trd_ptn_typ())) {
					setAmtXfr(dR);
					continue;
				}
				else if (MAC_TRD_PTN_TYP.isSLS(dR.trd_ptn_typ()) && isNull(dR.slo_d_no())) {
					continue;
				}
				
				ConvQtyAmtUtil_Calc01_HdrR opeHdr = ope.up0().createRow();
				copy(opeHdr, dR, createMap_ConvQtyAmtUtil_Calc01_HdrR_Srch01_DtlR());
				ope.up0().add(opeHdr);
				
				ConvQtyAmtUtil_Calc01_Dtl1R opeDtl = ope.up1().createRow();
				copy(opeDtl, dR, createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_DtlR());
				ope.up1().add(opeDtl);
			}
			ope.exec();

			String[] destCols = new String[] {
					Srch01_DtlR.$trd_cur_upri, Srch01_DtlR.$trd_cur_dscnt_amt,
					Srch01_DtlR.$trd_cur_amt, Srch01_DtlR.$trd_cur_tax_amt,
					Srch01_DtlR.$trd_cur_inc_tax_amt, Srch01_DtlR.$wtax_amt
			};
			String[] srcCols = new String[] {
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_dscnt_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_tax_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_inc_tax_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_amt
			};
			copyByPegNo(down, destCols, ope.down0(), srcCols);

			// インボイス表記金額
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 opeIv = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();

			for (Srch01_DtlR dR : down) {

				if(!isNull(dR.trd_cur_upri()) && !dR.trd_cur_upri().isZero()) {
					dR.iv_upri(dR.trd_cur_upri());
					dR.iv_amt(dR.trd_cur_amt());
					continue;
				}
				else if (isNull(dR.iv_upri())) {
					dR.iv_upri(0);
					dR.iv_amt(0);
					continue;
				}
				else if (MAC_TRD_PTN_TYP.isSLS(dR.trd_ptn_typ()) && isNull(dR.slo_d_no())) {
					continue;
				}

				ConvQtyAmtUtil_Calc01_HdrR opeHdrIv = opeIv.up0().createRow();
				copy(opeHdrIv, dR, createMap_ConvQtyAmtUtil_Calc01_HdrR_Srch01_DtlR_Iv());
				opeIv.up0().add(opeHdrIv);
				
				ConvQtyAmtUtil_Calc01_Dtl1R opeDtlIv = opeIv.up1().createRow();
				copy(opeDtlIv, dR, createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_DtlR());
				opeIv.up1().add(opeDtlIv);
			}
			opeIv.exec();

			String[] destIvCols = new String[] {
					Srch01_DtlR.$iv_upri, 
					Srch01_DtlR.$iv_amt
			};
			String[] srcIvCols = new String[] {
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt,
			};
			copyByPegNo(down, destIvCols, opeIv.down0(), srcIvCols);
		}
		
		/**
		 * 移送用の金額設定
		 * 
		 * @param dR
		 */
		protected void setAmtXfr(Srch01_DtlR dR) {
			dR.trd_cur_upri(0);
			dR.trd_cur_amt(0);
			dR.trd_cur_inc_tax_amt(0);
			dR.trd_cur_tax_amt(0);
		}
		
		/**
		 * 下り電文(Srch01_DtlR) -> 単位・金額換算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_HdrR)
		 * @return
		 */
		protected Map_ConvQtyAmtUtil_Calc01_HdrR_Srch01_DtlR<ConvQtyAmtUtil_Calc01_HdrR, Srch01_DtlR> createMap_ConvQtyAmtUtil_Calc01_HdrR_Srch01_DtlR() {
			return new Map_ConvQtyAmtUtil_Calc01_HdrR_Srch01_DtlR<ConvQtyAmtUtil_Calc01_HdrR, Srch01_DtlR>();
		}

		public class Map_ConvQtyAmtUtil_Calc01_HdrR_Srch01_DtlR<D extends ConvQtyAmtUtil_Calc01_HdrR, S extends Srch01_DtlR>
				extends MCRowMapper<D, S> {

			@Override
			protected void setupColumnPathMap() {
				
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$peg_no, Srch01_DtlR.$peg_no);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_cd, Srch01_DtlR.$trd_cur_cd);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$amt_dec_place, Srch01_DtlR.$amt_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$upri_dec_place, Srch01_DtlR.$upri_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$amt_rnd_typ, Srch01_DtlR.$amt_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$tax_rnd_typ, Srch01_DtlR.$tax_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_cd, Srch01_DtlR.$schd_trd_unit_cd);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_qty, Srch01_DtlR.$schd_trd_unit_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$schd_base_unit_qty, Srch01_DtlR.$schd_base_unit_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_upri, Srch01_DtlR.$schd_trd_cur_upri);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_dscnt_amt, Srch01_DtlR.$schd_trd_cur_dscnt_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_amt, Srch01_DtlR.$schd_trd_cur_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_tax_amt, Srch01_DtlR.$schd_trd_cur_tax_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$wtax_rate, Srch01_DtlR.$wtax_rate);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$wtax_amt, Srch01_DtlR.$schd_wtax_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_dec_place, Srch01_DtlR.$base_unit_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_rnd_typ, Srch01_DtlR.$base_unit_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_qty, Srch01_DtlR.$schd_trd_unit_conv_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_base_qty, Srch01_DtlR.$schd_trd_unit_conv_base_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$tax_rate,  Srch01_DtlR.$tax_rate);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$inc_tax_flg, Srch01_DtlR.$inc_tax_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if (!isNullOr(src.schd_trd_cur_amt(), src.schd_trd_cur_tax_amt())) {
					dest.trd_cur_inc_tax_amt(src.schd_trd_cur_amt().add(src.schd_trd_cur_tax_amt()));
				}
				if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
					dest.trd_unit_cd(src.base_unit_cd());
					dest.trd_unit_qty(src.schd_base_unit_qty());
					dest.trd_unit_conv_qty(1);
					dest.trd_unit_conv_base_qty(1);
				}
			}
		}
				
		/**
		 * 下り電文(Srch01_DtlR) -> 単位・金額換算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_HdrR)
		 * @return
		 */
		protected Map_ConvQtyAmtUtil_Calc01_HdrR_Srch01_DtlR_Iv<ConvQtyAmtUtil_Calc01_HdrR, Srch01_DtlR> createMap_ConvQtyAmtUtil_Calc01_HdrR_Srch01_DtlR_Iv() {
			return new Map_ConvQtyAmtUtil_Calc01_HdrR_Srch01_DtlR_Iv<ConvQtyAmtUtil_Calc01_HdrR, Srch01_DtlR>();
		}
	
		public class Map_ConvQtyAmtUtil_Calc01_HdrR_Srch01_DtlR_Iv<D extends ConvQtyAmtUtil_Calc01_HdrR, S extends Srch01_DtlR>
				extends MCRowMapper<D, S> {
	
			@Override
			protected void setupColumnPathMap() {
				
				// 取引通貨単価とインボイス単価が異なるのは、取引通貨単価が0（無償）の場合であり、この場合は値引額の指定はない
				// インボイス金額は税抜金額なので、税に関する項目は設定しない。

				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$peg_no, Srch01_DtlR.$peg_no);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_cd, Srch01_DtlR.$trd_cur_cd);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$amt_dec_place, Srch01_DtlR.$amt_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$upri_dec_place, Srch01_DtlR.$upri_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$amt_rnd_typ, Srch01_DtlR.$amt_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$tax_rnd_typ, Srch01_DtlR.$tax_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_cd, Srch01_DtlR.$schd_trd_unit_cd);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_qty, Srch01_DtlR.$schd_trd_unit_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_upri, Srch01_DtlR.$iv_upri);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_dec_place, Srch01_DtlR.$base_unit_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_rnd_typ, Srch01_DtlR.$base_unit_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_qty, Srch01_DtlR.$schd_trd_unit_conv_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_base_qty, Srch01_DtlR.$schd_trd_unit_conv_base_qty);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
					dest.trd_unit_cd(src.base_unit_cd());
					dest.trd_unit_qty(src.schd_base_unit_qty());
					dest.trd_unit_conv_qty(1);
					dest.trd_unit_conv_base_qty(1);
				}
				if (isNull(src.iv_amt())) {
					dest.trd_cur_amt(src.schd_iv_amt());
				}
				else {
					dest.trd_cur_amt(src.iv_amt());
				}
			}
		}

		/**
		 * 下り電文(Srch01_DtlR) -> 単位・金額換算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_Dtl1R)
		 * @return
		 */
		protected Map_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_DtlR<ConvQtyAmtUtil_Calc01_Dtl1R, Srch01_DtlR> createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_DtlR() {
			return new Map_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_DtlR<ConvQtyAmtUtil_Calc01_Dtl1R, Srch01_DtlR>();
		}

		public class Map_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_DtlR<D extends ConvQtyAmtUtil_Calc01_Dtl1R, S extends Srch01_DtlR>
				extends MCRowMapper<D, S> {

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$hdr_peg_no, Srch01_DtlR.$peg_no);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$peg_no, Srch01_DtlR.$peg_no);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_qty, Srch01_DtlR.$trd_unit_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_cd, Srch01_DtlR.$trd_unit_cd);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_qty, Srch01_DtlR.$trd_unit_conv_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_base_qty, Srch01_DtlR.$trd_unit_conv_base_qty);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
					dest.trd_unit_cd(src.base_unit_cd());
					dest.trd_unit_qty(src.schd_base_unit_qty());
					dest.trd_unit_conv_qty(1);
					dest.trd_unit_conv_base_qty(1);
				}
			}
		}

	
	/**
	 * Srch03オペレーション.<p>
	 *
	 * インボイス作成元区分に従い、追加候補の出荷予定、出荷指図、出荷実績を取得する<br>
	 */
	public class Srch03 extends MSBEL_IvReg_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			MCQueryPlan sql = null;
			if (MSC_IV_SRC_TYP.isSHIP_SCHD(up0().iv_src_typ())) {
				// 出荷予定
				sql = MSBEL1730_MST_SHIP_SCHD_S03();
				insShipSchdWk(up1());
			}
			else if (MSC_IV_SRC_TYP.isSHIP_INST(up0().iv_src_typ())) {
				// 出荷指図
				sql = MSBEL1730_MST_SHIP_INST_D_S02();
				crtShipInstDWk(up1().getStringNE(Srch02_CndR.$ship_inst_d_no));
			}
			else if (MSC_IV_SRC_TYP.isSHIP_ACT(up0().iv_src_typ())) {
				// 出荷実績
				sql = MSBEL1730_MST_SHIP_ACT_D_S02();
				crtShipActDWk(up1().getStringNE(Srch02_CndR.$ship_act_d_no));
			}
			
			doSrch(sql);
		}

		/**
		 * 追加候補の明細の検索処理を実行する。
		 * @param sqlId 検索SQL
		 */
		protected void doSrch(MCQueryPlan sql) {

			MCList<Srch03_DtlR> dtlL = MCList.create(Srch03_DtlR.class);
			up0().addStringColumn("is_slo_iv_no_str", MCBooleanUtil.booleanToDBString(up0().is_slo_iv_no()));
			up0().addStringColumn("purc_ddlv_flg_str", MCBooleanUtil.booleanToDBString(up0().purc_ddlv_flg()));
			up0().addStringColumn("sls_cststk_flg_str", MCBooleanUtil.booleanToDBString(up0().sls_cststk_flg()));
			
			executeQuery(dtlL, sql, up0());
			if (dtlL.isEmpty()) {
				return;
			}
			convTrdUnitQty(dtlL);

			down0().addAll(dtlL);
			setRsltAmt();
			down0().sort(Srch01_DtlR.$ship_schd_no);
		}
		
		/**
		 * 単位換算する。出荷予定の取引単位に換算できなければ、基準単位とする。
		 * 
		 * @param dL
		 */
		protected void convTrdUnitQty(MCList<Srch03_DtlR> dL) {
			for(Srch03_DtlR dR : dL) {
				if(isSame(dR.trd_unit_cd(), dR.base_unit_cd())) {
					dR.trd_unit_qty(dR.base_unit_qty());
					dR.max_trd_unit_qty(dR.max_base_unit_qty());
				}
				else {
					MCNumber convQty = rvrsBaseUnitConv(dR.base_unit_qty(),
							dR.trd_unit_conv_base_qty(), dR.trd_unit_conv_qty(),
							dR.trd_unit_dec_place(), dR.trd_unit_rnd_typ());
					MCNumber baseUnitQty = convToBaseUnit(convQty,
							dR.trd_unit_conv_base_qty(), dR.trd_unit_conv_qty(),
							dR.base_unit_dec_place(), dR.base_unit_rnd_typ());
					
					MCNumber convMaxQty = rvrsBaseUnitConv(dR.max_base_unit_qty(),
							dR.trd_unit_conv_base_qty(), dR.trd_unit_conv_qty(),
							dR.trd_unit_dec_place(), dR.trd_unit_rnd_typ());
					MCNumber baseUnitMaxQty = convToBaseUnit(convMaxQty,
							dR.trd_unit_conv_base_qty(), dR.trd_unit_conv_qty(),
							dR.base_unit_dec_place(), dR.base_unit_rnd_typ());
					
					
					if (isSame(baseUnitQty, dR.base_unit_qty()) && isSame(baseUnitMaxQty, dR.max_base_unit_qty())) {
						dR.trd_unit_qty(convQty);
						dR.max_trd_unit_qty(convMaxQty);
					}
					else {
						dR.trd_unit_qty(dR.base_unit_qty());
						dR.max_trd_unit_qty(dR.max_base_unit_qty());
						dR.trd_unit_cd(dR.base_unit_cd());
						dR.trd_unit_nm(dR.base_unit_nm());
						dR.trd_unit_dec_place(dR.base_unit_dec_place());
						dR.trd_unit_rnd_typ(dR.base_unit_rnd_typ());
						dR.trd_unit_conv_base_qty(1);
						dR.trd_unit_conv_qty(1);
					}
				}
			}
		}


		protected void insShipSchdWk(MCList<Srch03_Cnd2R> u1) {
			MCList<MST_SHIP_SCHD_R> insWkL = MCList.create(MST_SHIP_SCHD_R.class);
			MCQueryApiBuilder insWkL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
			dbWkDelete("MSBEL1730_MSW_SHIP_SCHD_D03", insWkL_bldr.getBaseDbc());
			for(Srch03_Cnd2R cndR : u1) {
				MST_SHIP_SCHD_R r = MST_SHIP_SCHD_R.create();
				r.ship_schd_no(cndR.ship_schd_no());
				insWkL.add(r);
			}
			dbWkInsert("MSBEL1730_MSW_SHIP_SCHD_I03", insWkL, insWkL_bldr.getBaseDbc());
		}
		
		/**
		 * 明細の金額を計算する
		 */
		protected void setRsltAmt() {
			
			setPegNo(down0());

			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();

			for (Srch03_DtlR dR : down0()) {

				//取引パタン：移動・移送 or 移動・移送返品
				if(MAC_TRD_PTN_TYP.isXFR(dR.trd_ptn_typ()) 
					|| MAC_TRD_PTN_TYP.isXFR_RTN(dR.trd_ptn_typ())) { 
					setAmtXfr(dR);
					continue;
				}
				else if (MAC_TRD_PTN_TYP.isPROV(dR.trd_ptn_typ()) 
						&& (MAC_PROV_BASIS_TYP.isINPT(dR.prov_basis_typ()) || isNull(dR.prov_basis_typ()))) {
					setAmtXfr(dR);
					continue;
				}
				
				ConvQtyAmtUtil_Calc01_HdrR opeHdr = ope.up0().createRow();
				copy(opeHdr, dR, createMap_ConvQtyAmtUtil_Calc01_HdrR_Srch03_DtlR());
				ope.up0().add(opeHdr);
				
				ConvQtyAmtUtil_Calc01_Dtl1R opeDtl = ope.up1().createRow();
				copy(opeDtl, dR, createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Srch03_DtlR());
				ope.up1().add(opeDtl);
			}
			ope.exec();

			String[] destCols = new String[] {
					Srch03_DtlR.$trd_cur_upri, Srch03_DtlR.$trd_cur_dscnt_amt,
					Srch03_DtlR.$trd_cur_amt, Srch03_DtlR.$trd_cur_tax_amt,
					Srch03_DtlR.$trd_cur_inc_tax_amt, Srch03_DtlR.$wtax_amt
			};
			String[] srcCols = new String[] {
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_dscnt_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_tax_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_inc_tax_amt,
					ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_amt
			};
			copyByPegNo(down0(), destCols, ope.down0(), srcCols);

			// インボイス表記金額
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 opeIv = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();

			for (Srch03_DtlR dR : down0()) {

				if(!isNull(dR.trd_cur_upri()) && !dR.trd_cur_upri().isZero()) {
					dR.iv_upri(dR.trd_cur_upri());
					dR.iv_amt(dR.trd_cur_amt());
					continue;
				}
				else if (isNull(dR.iv_upri())) {
					dR.iv_upri(0);
					dR.iv_amt(0);
					continue;
				}

				ConvQtyAmtUtil_Calc01_HdrR opeHdrIv = opeIv.up0().createRow();
				copy(opeHdrIv, dR, createMap_ConvQtyAmtUtil_Calc01_HdrR_Srch03_DtlR_Iv());
				opeIv.up0().add(opeHdrIv);
				
				ConvQtyAmtUtil_Calc01_Dtl1R opeDtlIv = opeIv.up1().createRow();
				copy(opeDtlIv, dR, createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Srch03_DtlR());
				opeIv.up1().add(opeDtlIv);
			}
			opeIv.exec();

			String[] destIvCols = new String[] {
					Srch03_DtlR.$iv_upri, 
					Srch03_DtlR.$iv_amt
			};
			String[] srcIvCols = new String[] {
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri,
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt,
			};
			copyByPegNo(down0(), destIvCols, opeIv.down0(), srcIvCols);
		}
		
		/**
		 * 移送用の金額設定
		 * 
		 * @param dR
		 */
		protected void setAmtXfr(Srch03_DtlR dR) {
			dR.trd_cur_upri(0);
			dR.trd_cur_amt(0);
			dR.trd_cur_inc_tax_amt(0);
			dR.trd_cur_tax_amt(0);
		}
		
		/**
		 * 下り電文(Srch03_DtlR) -> 単位・金額換算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_HdrR)
		 * @return
		 */
		protected Map_ConvQtyAmtUtil_Calc01_HdrR_Srch03_DtlR<ConvQtyAmtUtil_Calc01_HdrR, Srch03_DtlR> createMap_ConvQtyAmtUtil_Calc01_HdrR_Srch03_DtlR() {
			return new Map_ConvQtyAmtUtil_Calc01_HdrR_Srch03_DtlR<ConvQtyAmtUtil_Calc01_HdrR, Srch03_DtlR>();
		}

		public class Map_ConvQtyAmtUtil_Calc01_HdrR_Srch03_DtlR<D extends ConvQtyAmtUtil_Calc01_HdrR, S extends Srch03_DtlR>
				extends MCRowMapper<D, S> {

			@Override
			protected void setupColumnPathMap() {
				
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$peg_no, Srch03_DtlR.$peg_no);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_cd, Srch03_DtlR.$trd_cur_cd);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$amt_dec_place, Srch03_DtlR.$trd_cur_amt_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$upri_dec_place, Srch03_DtlR.$trd_cur_upri_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$amt_rnd_typ, Srch03_DtlR.$trd_amt_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$tax_rnd_typ, Srch03_DtlR.$trd_tax_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_cd, Srch03_DtlR.$schd_trd_unit_cd);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_qty, Srch03_DtlR.$schd_trd_unit_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$schd_base_unit_qty, Srch03_DtlR.$schd_base_unit_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_upri, Srch03_DtlR.$schd_trd_cur_upri);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_dscnt_amt, Srch03_DtlR.$schd_trd_cur_dscnt_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_amt, Srch03_DtlR.$schd_trd_cur_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_tax_amt, Srch03_DtlR.$schd_trd_cur_tax_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$wtax_rate, Srch03_DtlR.$wtax_rate);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$wtax_amt, Srch03_DtlR.$schd_wtax_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_dec_place, Srch03_DtlR.$base_unit_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_rnd_typ, Srch03_DtlR.$base_unit_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_qty, Srch03_DtlR.$schd_trd_unit_conv_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_base_qty, Srch03_DtlR.$schd_trd_unit_conv_base_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$tax_rate,  Srch03_DtlR.$tax_rate);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$inc_tax_flg, Srch03_DtlR.$inc_tax_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if (!isNullOr(src.schd_trd_cur_amt(), src.schd_trd_cur_tax_amt())) {
					dest.trd_cur_inc_tax_amt(src.schd_trd_cur_amt().add(src.schd_trd_cur_tax_amt()));
				}
				if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
					dest.trd_unit_cd(src.base_unit_cd());
					dest.trd_unit_qty(src.schd_base_unit_qty());
					dest.trd_unit_conv_qty(1);
					dest.trd_unit_conv_base_qty(1);
				}
			}
		}
				
		/**
		 * 下り電文(Srch03_DtlR) -> 単位・金額換算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_HdrR)
		 * @return
		 */
		protected Map_ConvQtyAmtUtil_Calc01_HdrR_Srch03_DtlR_Iv<ConvQtyAmtUtil_Calc01_HdrR, Srch03_DtlR> createMap_ConvQtyAmtUtil_Calc01_HdrR_Srch03_DtlR_Iv() {
			return new Map_ConvQtyAmtUtil_Calc01_HdrR_Srch03_DtlR_Iv<ConvQtyAmtUtil_Calc01_HdrR, Srch03_DtlR>();
		}
	
		public class Map_ConvQtyAmtUtil_Calc01_HdrR_Srch03_DtlR_Iv<D extends ConvQtyAmtUtil_Calc01_HdrR, S extends Srch03_DtlR>
				extends MCRowMapper<D, S> {
	
			@Override
			protected void setupColumnPathMap() {
				
				// 取引通貨単価とインボイス単価が異なるのは、取引通貨単価が0（無償）の場合であり、この場合は値引額の指定はない
				// インボイス金額は税抜金額なので、税に関する項目は設定しない。

				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$peg_no, Srch03_DtlR.$peg_no);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_cd, Srch03_DtlR.$trd_cur_cd);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$amt_dec_place, Srch03_DtlR.$trd_cur_amt_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$upri_dec_place, Srch03_DtlR.$trd_cur_upri_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$amt_rnd_typ, Srch03_DtlR.$trd_amt_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$tax_rnd_typ, Srch03_DtlR.$trd_tax_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_cd, Srch03_DtlR.$schd_trd_unit_cd);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_qty, Srch03_DtlR.$schd_trd_unit_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_upri, Srch03_DtlR.$iv_upri);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_amt, Srch03_DtlR.$schd_iv_amt);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_dec_place, Srch03_DtlR.$base_unit_dec_place);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_rnd_typ, Srch03_DtlR.$base_unit_rnd_typ);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_qty, Srch03_DtlR.$schd_trd_unit_conv_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_base_qty, Srch03_DtlR.$schd_trd_unit_conv_base_qty);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
					dest.trd_unit_cd(src.base_unit_cd());
					dest.trd_unit_qty(src.schd_base_unit_qty());
					dest.trd_unit_conv_qty(1);
					dest.trd_unit_conv_base_qty(1);
				}
			}
		}

		/**
		 * 下り電文(Srch03_DtlR) -> 単位・金額換算ユーティリティ.上り電文(ConvQtyAmtUtil_Calc01_Dtl1R)
		 * @return
		 */
		protected Map_ConvQtyAmtUtil_Calc01_Dtl1R_Srch03_DtlR<ConvQtyAmtUtil_Calc01_Dtl1R, Srch03_DtlR> createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Srch03_DtlR() {
			return new Map_ConvQtyAmtUtil_Calc01_Dtl1R_Srch03_DtlR<ConvQtyAmtUtil_Calc01_Dtl1R, Srch03_DtlR>();
		}

		public class Map_ConvQtyAmtUtil_Calc01_Dtl1R_Srch03_DtlR<D extends ConvQtyAmtUtil_Calc01_Dtl1R, S extends Srch03_DtlR>
				extends MCRowMapper<D, S> {

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$hdr_peg_no, Srch03_DtlR.$peg_no);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$peg_no, Srch03_DtlR.$peg_no);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_qty, Srch03_DtlR.$trd_unit_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_cd, Srch03_DtlR.$trd_unit_cd);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_qty, Srch03_DtlR.$trd_unit_conv_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_base_qty, Srch03_DtlR.$trd_unit_conv_base_qty);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
					dest.trd_unit_qty(src.base_unit_qty());
					dest.trd_unit_cd(src.base_unit_cd());
					dest.trd_unit_conv_qty(1);
					dest.trd_unit_conv_base_qty(1);
				}
			}
		}
	}
	/**
	 * Srch04オペレーション.<p>
	 *
	 * 検索対象区分に従い、新規登録対象の出荷指図または出荷実績を取得する。<br>
	 */
	public class Srch04 extends MSBEL_IvReg_MC_A.Srch04 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			srchHdr();
			
			srchDtl();
		}
		
		protected void srchHdr() {
			
			MCQueryPlan sql = null;
			if(MSC_STK_SRCH_TGT_TYP.isSHIP_INST_NO(up0().srch_tgt_typ())) {
				sql = MSBEL1730_MST_SHIP_INST_S01();
			}
			else if (MSC_STK_SRCH_TGT_TYP.isSHIP_ACT_NO(up0().srch_tgt_typ())) {
				sql = MSBEL1730_MST_SHIP_ACT_S01();
			}
			
			doSrchHdr(sql);
		}
		
		/**
		 * 検索処理を実行する。
		 * @param sqlId 検索SQL
		 */
		protected void doSrchHdr(MCQueryPlan sql) {
			
			up0().addDateColumn("today", getToday());
			
			MCList<Srch01_HdrR> rsltL = MCList.create(Srch01_HdrR.class);
			executeQuery(rsltL, sql, up0());

			if (rsltL.isEmpty()) {
				return;
			}
			
			Srch01_HdrR hdrR = rsltL.get(0);
			hdrR.cmpl_schd_dt(getToday());
			hdrR.iv_dt(getToday());
			
			hdrR.iv_ship_flg(false);
			hdrR.old_iv_ship_flg(hdrR.iv_ship_flg());
			
			if(!MAC_VIA_DLV_TYP.isVIA(hdrR.via_dlv_typ())) {
				hdrR.non_cmpl_flg(true);
			}
			
			if(MSC_STK_SRCH_TGT_TYP.isSHIP_INST_NO(up0().srch_tgt_typ())) {
				hdrR.iv_src_typ(MSC_IV_SRC_TYP.SHIP_INST.value());
				crtShipInstDWk(rsltL.getStringNE(Srch01_HdrR.$ship_inst_d_no));
			}
			else if (MSC_STK_SRCH_TGT_TYP.isSHIP_ACT_NO(up0().srch_tgt_typ())) {
				hdrR.iv_src_typ(MSC_IV_SRC_TYP.SHIP_ACT.value());
				crtShipActDWk(rsltL.getStringNE(Srch01_HdrR.$ship_act_d_no));
			}
			MCRow.copyvalue(down0(), hdrR);
		}
		
		protected void srchDtl() {
			
			MCQueryPlan sql = null;
			if(MSC_STK_SRCH_TGT_TYP.isSHIP_INST_NO(up0().srch_tgt_typ())) {
				// 出荷指図
				sql = MSBEL1730_MST_SHIP_INST_D_S01();
			}
			else if (MSC_STK_SRCH_TGT_TYP.isSHIP_ACT_NO(up0().srch_tgt_typ())) {
				// 出荷実績
				sql = MSBEL1730_MST_SHIP_ACT_D_S01();
			}
			
			doSrchDtl(sql);
		}
		
		/**
		 * 検索処理を実行する。
		 * @param sqlId 検索SQL
		 */
		protected void doSrchDtl(MCQueryPlan sql) {
			
			MCRow bind = MCRow.create();
			bind.addDateColumn("iv_dt", getToday());

			MCList<Srch01_DtlR> rsltL = MCList.create(Srch01_DtlR.class);
			executeQuery(rsltL, sql, bind);

			if (rsltL.isEmpty()) {
				return;
			}
			
			// 基準単位から取引単位に換算する
			convTrdUnitQty(rsltL);
			
			// 出荷依頼ＮＯを設定する
			setShipRqstNo(down0().trd_ptn_typ(), rsltL);
			
			// 明細をまとめる
			bndl(down0().iv_src_typ(), rsltL, down1(), down2(), down3(), down4());
			
			// 明細の金額を計算する
			setRsltAmt(down1());
		}
	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * インボイスを発行する<br>
	 */
	public class Prnt01 extends MSBEL_IvReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			//インボイス帳票印刷処理
			MSBEL_ExRptService.ExRpt_Prnt03  prnt03 = MSBEL_ExRptService.crtExRpt_Prnt03();
			prnt03.up0().iv_no(up0().iv_no());
			prnt03.up0().iv_mng_no(up0().iv_mng_no());
			prnt03.up0().iv_rev(up0().iv_rev());
			prnt03.exec();
		}
	}

	/**
	 * マニュアル追加フラグを設定する。
	 * @param dtlL インボイス明細リスト
	 */
	protected void setManualAddFlg(MCList<Iv_Chk01_DtlR> dtlL) {
		for (Iv_Chk01_DtlR dtlR : dtlL) {
			if(!dtlR.existed_flg()) { //トランデータ元ではない場合
				dtlR.manual_add_flg(true);
			}
		}
	}

	/**
	 * 出荷依頼ＮＯを設定する。
	 * 取引パタン区分：売上の場合、受注明細ＮＯを出荷依頼ＮＯとして設定する。
	 * 取引パタン区分：売上以外の場合、移動・移送予定ＮＯを出荷依頼ＮＯとして設定する。
	 * @param trd_ptn_typ
	 * @param d1
	 */
	protected void setShipRqstNo(String trd_ptn_typ, MCList<Srch01_DtlR> d1) {
		for(Srch01_DtlR r : d1) {
			if(MAC_TRD_PTN_TYP.isSLS(trd_ptn_typ)) {
				r.ship_rqst_no(r.slo_d_no());
			}
			else if(MAC_TRD_PTN_TYP.isSHIP(trd_ptn_typ)) {
				r.ship_rqst_no(r.slo_d_no());
			}
			else {
				r.ship_rqst_no(r.xfr_schd_no());
			}
		}
	}

	/**
	 * 検索結果格納用コンテナを生成する
	 */
	protected MCList<Srch01_DtlR> crtSrchDtl() {
		MCList<Srch01_DtlR> dtlL = MCList.create(Srch01_DtlR.class);

		dtlL.addNumberColumn("iv_rev");
		dtlL.addBooleanColumn("latest_flg");
		dtlL.addBooleanColumn("can_flg");
		dtlL.addStringColumn("iv_src_typ");
		dtlL.addBooleanColumn("cst_sls_upri_cng_flg");
		dtlL.addNumberColumn("sls_qty");
		dtlL.addBooleanColumn("is_slo_iv_no");
		dtlL.addStringColumn("iv_no");
		dtlL.addStringColumn("rcpt_iv_no");
		dtlL.addBooleanColumn("pl_skip_flg");
		dtlL.addBooleanColumn("pl_reg_flg");
		dtlL.addDateColumn("cmpl_schd_dt");
		dtlL.addDateColumn("cmpl_dt");
		dtlL.addDateColumn("ac_dt");
		dtlL.addDateColumn("iv_dt");
		dtlL.addBooleanColumn("non_cmpl_flg");
		dtlL.addBooleanColumn("cmpl_flg");
		dtlL.addBooleanColumn("old_iv_ship_flg");
		dtlL.addBooleanColumn("iv_ship_flg");
		dtlL.addStringColumn("dlv_id_typ");
		dtlL.addStringColumn("dlv_id_cd");
		dtlL.addStringColumn("dlv_id_nm");
		dtlL.addStringColumn("dlv_cntry_cd");
		dtlL.addStringColumn("dlv_cntry_nm");
		dtlL.addStringColumn("dlv_zip_cd");
		dtlL.addStringColumn("dlv_addr1");
		dtlL.addStringColumn("dlv_addr2");
		dtlL.addStringColumn("dlv_addr3");
		dtlL.addStringColumn("dlv_addr4");
		dtlL.addStringColumn("dlv_cntct_dpt");
		dtlL.addStringColumn("dlv_cntct_psn");
		dtlL.addStringColumn("dlv_tel");
		dtlL.addStringColumn("dlv_fax");
		dtlL.addStringColumn("ship_rqst_id_typ");
		dtlL.addStringColumn("ship_rqst_id_cd");
		dtlL.addStringColumn("ship_rqst_id_nm");
		dtlL.addStringColumn("tdlv_cd");
		dtlL.addStringColumn("tdlv_nm");
		dtlL.addStringColumn("trnspt_cd");
		dtlL.addStringColumn("trnspt_nm");
		dtlL.addStringColumn("vssl_flght");
		dtlL.addStringColumn("load_port_cd");
		dtlL.addStringColumn("load_port_nm");
		dtlL.addDateColumn("etd_dt");
		dtlL.addStringColumn("dschrg_port_cd");
		dtlL.addStringColumn("dschrg_port_nm");
		dtlL.addDateColumn("eta_dt");
		dtlL.addStringColumn("via_port_cd");
		dtlL.addStringColumn("via_port_nm");
		dtlL.addDateColumn("via_schd_dt");
		dtlL.addStringColumn("tterm_cd1");
		dtlL.addStringColumn("tterm_nm1");
		dtlL.addStringColumn("tterm_rmrks1");
		dtlL.addStringColumn("tterm_cd2");
		dtlL.addStringColumn("tterm_nm2");
		dtlL.addStringColumn("tterm_rmrks2");
		dtlL.addStringColumn("trd_cur_nm");
		dtlL.addBooleanColumn("xrate_inpt_flg");
		dtlL.addNumberColumn("xrate");
		dtlL.addBooleanColumn("ptax_xrate_inpt_flg");
		dtlL.addNumberColumn("ptax_xrate");
		dtlL.addStringColumn("ptax_cur_cd");
		dtlL.addStringColumn("tterm_cd3");
		dtlL.addStringColumn("tterm_nm3");
		dtlL.addStringColumn("tterm_rmrks3");
		dtlL.addDateColumn("bill_basis_dt");
		dtlL.addDateColumn("rcv_schd_dt");
		dtlL.addStringColumn("lc_no");
		dtlL.addDateColumn("lc_dt");
		dtlL.addStringColumn("lc_rmrks");
		dtlL.addStringColumn("bl_no");
		dtlL.addDateColumn("bl_dt");
		dtlL.addStringColumn("bl_rmrks");
		dtlL.addStringColumn("iv_rmrks");
		dtlL.addStringColumn("case_mrk1");
		dtlL.addStringColumn("case_mrk2");
		dtlL.addStringColumn("case_mrk3");
		dtlL.addStringColumn("case_mrk4");
		dtlL.addStringColumn("case_mrk5");
		dtlL.addStringColumn("case_mrk6");
		dtlL.addStringColumn("sub_char1");
		dtlL.addStringColumn("sub_char2");
		dtlL.addStringColumn("sub_char3");
		dtlL.addBooleanColumn("iv_prnt_flg");
		dtlL.addStringColumn("rcpt_iv_mng_no");
		dtlL.addBooleanColumn("dlv_sundry_flg");
		dtlL.addBooleanColumn("tdlv_sundry_flg");
		dtlL.addBooleanColumn("pre_rcpt_iv_flg");

		return dtlL;
	}

	protected Map_Srch01_HdrR_Srch01_DtlR<Srch01_HdrR,Srch01_DtlR> createMap_Srch01_HdrR_Srch01_DtlR() {
		return new Map_Srch01_HdrR_Srch01_DtlR<Srch01_HdrR, Srch01_DtlR>();
	}

	public class Map_Srch01_HdrR_Srch01_DtlR<D extends Srch01_HdrR, S extends Srch01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_HdrR.$is_slo_iv_no, Srch01_HdrR.$is_slo_iv_no);
			addColumnPathMap(Srch01_HdrR.$iv_no, Srch01_HdrR.$iv_no);
			addColumnPathMap(Srch01_HdrR.$iv_rev, Srch01_HdrR.$iv_rev);
			addColumnPathMap(Srch01_HdrR.$latest_flg, Srch01_HdrR.$latest_flg);
			addColumnPathMap(Srch01_HdrR.$can_flg, Srch01_HdrR.$can_flg);
			addColumnPathMap(Srch01_HdrR.$iv_src_typ, Srch01_HdrR.$iv_src_typ);
			addColumnPathMap(Srch01_HdrR.$rcpt_iv_no, Srch01_HdrR.$rcpt_iv_no);
			addColumnPathMap(Srch01_HdrR.$pl_skip_flg, Srch01_HdrR.$pl_skip_flg);
			addColumnPathMap(Srch01_HdrR.$pl_reg_flg, Srch01_HdrR.$pl_reg_flg);
			addColumnPathMap(Srch01_HdrR.$cmpl_schd_dt, Srch01_HdrR.$cmpl_schd_dt);
			addColumnPathMap(Srch01_HdrR.$cmpl_dt, Srch01_HdrR.$cmpl_dt);
			addColumnPathMap(Srch01_HdrR.$ac_dt, Srch01_HdrR.$ac_dt);
			addColumnPathMap(Srch01_HdrR.$iv_dt, Srch01_HdrR.$iv_dt);
			addColumnPathMap(Srch01_HdrR.$non_cmpl_flg, Srch01_HdrR.$non_cmpl_flg);
			addColumnPathMap(Srch01_HdrR.$cmpl_flg, Srch01_HdrR.$cmpl_flg);
			addColumnPathMap(Srch01_HdrR.$old_iv_ship_flg, Srch01_HdrR.$old_iv_ship_flg);
			addColumnPathMap(Srch01_HdrR.$iv_ship_flg, Srch01_HdrR.$iv_ship_flg);
			addColumnPathMap(Srch01_HdrR.$dlv_id_typ, Srch01_HdrR.$dlv_id_typ);
			addColumnPathMap(Srch01_HdrR.$dlv_id_cd, Srch01_HdrR.$dlv_id_cd);
			addColumnPathMap(Srch01_HdrR.$dlv_id_nm, Srch01_HdrR.$dlv_id_nm);
			addColumnPathMap(Srch01_HdrR.$dlv_cntry_cd, Srch01_HdrR.$dlv_cntry_cd);
			addColumnPathMap(Srch01_HdrR.$dlv_cntry_nm, Srch01_HdrR.$dlv_cntry_nm);
			addColumnPathMap(Srch01_HdrR.$dlv_zip_cd, Srch01_HdrR.$dlv_zip_cd);
			addColumnPathMap(Srch01_HdrR.$dlv_addr1, Srch01_HdrR.$dlv_addr1);
			addColumnPathMap(Srch01_HdrR.$dlv_addr2, Srch01_HdrR.$dlv_addr2);
			addColumnPathMap(Srch01_HdrR.$dlv_addr3, Srch01_HdrR.$dlv_addr3);
			addColumnPathMap(Srch01_HdrR.$dlv_addr4, Srch01_HdrR.$dlv_addr4);
			addColumnPathMap(Srch01_HdrR.$dlv_cntct_dpt, Srch01_HdrR.$dlv_cntct_dpt);
			addColumnPathMap(Srch01_HdrR.$dlv_cntct_psn, Srch01_HdrR.$dlv_cntct_psn);
			addColumnPathMap(Srch01_HdrR.$dlv_tel, Srch01_HdrR.$dlv_tel);
			addColumnPathMap(Srch01_HdrR.$dlv_fax, Srch01_HdrR.$dlv_fax);
			addColumnPathMap(Srch01_HdrR.$ship_rqst_id_typ, Srch01_HdrR.$ship_rqst_id_typ);
			addColumnPathMap(Srch01_HdrR.$ship_rqst_id_cd, Srch01_HdrR.$ship_rqst_id_cd);
			addColumnPathMap(Srch01_HdrR.$ship_rqst_id_nm, Srch01_HdrR.$ship_rqst_id_nm);
			addColumnPathMap(Srch01_HdrR.$tdlv_cd, Srch01_HdrR.$tdlv_cd);
			addColumnPathMap(Srch01_HdrR.$tdlv_nm, Srch01_HdrR.$tdlv_nm);
			addColumnPathMap(Srch01_HdrR.$tdlv_sundry_flg, Srch01_HdrR.$tdlv_sundry_flg);
			addColumnPathMap(Srch01_HdrR.$via_dlv_typ, Srch01_HdrR.$via_dlv_typ);
			addColumnPathMap(Srch01_HdrR.$tdlv_cntct_dpt, Srch01_HdrR.$tdlv_cntct_dpt);
			addColumnPathMap(Srch01_HdrR.$tdlv_cntct_psn, Srch01_HdrR.$tdlv_cntct_psn);
			addColumnPathMap(Srch01_HdrR.$tdlv_zip_cd, Srch01_HdrR.$tdlv_zip_cd);
			addColumnPathMap(Srch01_HdrR.$tdlv_addr1, Srch01_HdrR.$tdlv_addr1);
			addColumnPathMap(Srch01_HdrR.$tdlv_addr2, Srch01_HdrR.$tdlv_addr2);
			addColumnPathMap(Srch01_HdrR.$tdlv_addr3, Srch01_HdrR.$tdlv_addr3);
			addColumnPathMap(Srch01_HdrR.$tdlv_addr4, Srch01_HdrR.$tdlv_addr4);
			addColumnPathMap(Srch01_HdrR.$tdlv_tel, Srch01_HdrR.$tdlv_tel);
			addColumnPathMap(Srch01_HdrR.$tdlv_fax, Srch01_HdrR.$tdlv_fax);
			addColumnPathMap(Srch01_HdrR.$tdlv_lg_grp_cd, Srch01_HdrR.$tdlv_lg_grp_cd);
			addColumnPathMap(Srch01_HdrR.$trnspt_cd, Srch01_HdrR.$trnspt_cd);
			addColumnPathMap(Srch01_HdrR.$trnspt_nm, Srch01_HdrR.$trnspt_nm);
			addColumnPathMap(Srch01_HdrR.$vssl_flght, Srch01_HdrR.$vssl_flght);
			addColumnPathMap(Srch01_HdrR.$load_port_cd, Srch01_HdrR.$load_port_cd);
			addColumnPathMap(Srch01_HdrR.$load_port_nm, Srch01_HdrR.$load_port_nm);
			addColumnPathMap(Srch01_HdrR.$etd_dt, Srch01_HdrR.$etd_dt);
			addColumnPathMap(Srch01_HdrR.$dschrg_port_cd, Srch01_HdrR.$dschrg_port_cd);
			addColumnPathMap(Srch01_HdrR.$dschrg_port_nm, Srch01_HdrR.$dschrg_port_nm);
			addColumnPathMap(Srch01_HdrR.$eta_dt, Srch01_HdrR.$eta_dt);
			addColumnPathMap(Srch01_HdrR.$via_port_cd, Srch01_HdrR.$via_port_cd);
			addColumnPathMap(Srch01_HdrR.$via_port_nm, Srch01_HdrR.$via_port_nm);
			addColumnPathMap(Srch01_HdrR.$via_schd_dt, Srch01_HdrR.$via_schd_dt);
			addColumnPathMap(Srch01_HdrR.$tterm_cd1, Srch01_HdrR.$tterm_cd1);
			addColumnPathMap(Srch01_HdrR.$tterm_nm1, Srch01_HdrR.$tterm_nm1);
			addColumnPathMap(Srch01_HdrR.$tterm_rmrks1, Srch01_HdrR.$tterm_rmrks1);
			addColumnPathMap(Srch01_HdrR.$tterm_cd2, Srch01_HdrR.$tterm_cd2);
			addColumnPathMap(Srch01_HdrR.$tterm_nm2, Srch01_HdrR.$tterm_nm2);
			addColumnPathMap(Srch01_HdrR.$tterm_rmrks2, Srch01_HdrR.$tterm_rmrks2);
			addColumnPathMap(Srch01_HdrR.$trd_cur_cd, Srch01_HdrR.$trd_cur_cd);
			addColumnPathMap(Srch01_HdrR.$trd_cur_nm, Srch01_HdrR.$trd_cur_nm);
			addColumnPathMap(Srch01_HdrR.$xrate_inpt_flg, Srch01_HdrR.$xrate_inpt_flg);
			addColumnPathMap(Srch01_HdrR.$xrate, Srch01_HdrR.$xrate);
			addColumnPathMap(Srch01_HdrR.$ptax_xrate_inpt_flg, Srch01_HdrR.$ptax_xrate_inpt_flg);
			addColumnPathMap(Srch01_HdrR.$ptax_xrate, Srch01_HdrR.$ptax_xrate);
			addColumnPathMap(Srch01_HdrR.$tterm_cd3, Srch01_HdrR.$tterm_cd3);
			addColumnPathMap(Srch01_HdrR.$tterm_nm3, Srch01_HdrR.$tterm_nm3);
			addColumnPathMap(Srch01_HdrR.$tterm_rmrks3, Srch01_HdrR.$tterm_rmrks3);
			addColumnPathMap(Srch01_HdrR.$bill_basis_dt, Srch01_HdrR.$bill_basis_dt);
			addColumnPathMap(Srch01_HdrR.$rcv_schd_dt, Srch01_HdrR.$rcv_schd_dt);
			addColumnPathMap(Srch01_HdrR.$lc_no, Srch01_HdrR.$lc_no);
			addColumnPathMap(Srch01_HdrR.$lc_dt, Srch01_HdrR.$lc_dt);
			addColumnPathMap(Srch01_HdrR.$lc_rmrks, Srch01_HdrR.$lc_rmrks);
			addColumnPathMap(Srch01_HdrR.$bl_no, Srch01_HdrR.$bl_no);
			addColumnPathMap(Srch01_HdrR.$bl_dt, Srch01_HdrR.$bl_dt);
			addColumnPathMap(Srch01_HdrR.$bl_rmrks, Srch01_HdrR.$bl_rmrks);
			addColumnPathMap(Srch01_HdrR.$iv_rmrks, Srch01_HdrR.$iv_rmrks);
			addColumnPathMap(Srch01_HdrR.$case_mrk1, Srch01_HdrR.$case_mrk1);
			addColumnPathMap(Srch01_HdrR.$case_mrk2, Srch01_HdrR.$case_mrk2);
			addColumnPathMap(Srch01_HdrR.$case_mrk3, Srch01_HdrR.$case_mrk3);
			addColumnPathMap(Srch01_HdrR.$case_mrk4, Srch01_HdrR.$case_mrk4);
			addColumnPathMap(Srch01_HdrR.$case_mrk5, Srch01_HdrR.$case_mrk5);
			addColumnPathMap(Srch01_HdrR.$case_mrk6, Srch01_HdrR.$case_mrk6);
			addColumnPathMap(Srch01_HdrR.$intr_rmrks, Srch01_HdrR.$intr_rmrks);
			addColumnPathMap(Srch01_HdrR.$sub_char1, Srch01_HdrR.$sub_char1);
			addColumnPathMap(Srch01_HdrR.$sub_char2, Srch01_HdrR.$sub_char2);
			addColumnPathMap(Srch01_HdrR.$sub_char3, Srch01_HdrR.$sub_char3);
			addColumnPathMap(Srch01_HdrR.$iv_mng_no, Srch01_HdrR.$iv_mng_no);
			addColumnPathMap(Srch01_HdrR.$trd_ptn_typ, Srch01_HdrR.$trd_ptn_typ);
			addColumnPathMap(Srch01_HdrR.$iv_prnt_flg, Srch01_HdrR.$iv_prnt_flg);
			addColumnPathMap(Srch01_HdrR.$rcpt_iv_mng_no, Srch01_HdrR.$rcpt_iv_mng_no);
			addColumnPathMap(Srch01_HdrR.$trd_cur_upri_dec_place, Srch01_HdrR.$trd_cur_upri_dec_place);
			addColumnPathMap(Srch01_HdrR.$trd_cur_amt_dec_place, Srch01_HdrR.$trd_cur_amt_dec_place);
			addColumnPathMap(Srch01_HdrR.$trd_amt_rnd_typ, Srch01_HdrR.$trd_amt_rnd_typ);
			addColumnPathMap(Srch01_HdrR.$trd_tax_rnd_typ, Srch01_HdrR.$trd_tax_rnd_typ);
			addColumnPathMap(Srch01_HdrR.$ptax_xrate, Srch01_HdrR.$ptax_xrate);
			addColumnPathMap(Srch01_HdrR.$bill_cl_typ, Srch01_HdrR.$bill_cl_typ);
			addColumnPathMap(Srch01_HdrR.$sls_basis_typ, Srch01_HdrR.$sls_basis_typ);
			addColumnPathMap(Srch01_HdrR.$prov_basis_typ, Srch01_HdrR.$prov_basis_typ);
			addColumnPathMap(Srch01_HdrR.$iv_upd_cntr, Srch01_HdrR.$iv_upd_cntr);
			addColumnPathMap(Srch01_HdrR.$arr_schd_dt, Srch01_HdrR.$arr_schd_dt);
			addColumnPathMap(Srch01_HdrR.$sls_schd_dt, Srch01_HdrR.$sls_schd_dt);
			addColumnPathMap(Srch01_HdrR.$dlv_sundry_flg, Srch01_HdrR.$dlv_sundry_flg);
			addColumnPathMap(Srch01_HdrR.$pre_rcpt_iv_flg, Srch01_HdrR.$pre_rcpt_iv_flg);

			addColumnPathMap(Srch01_HdrR.$ins_usr_id, Srch01_HdrR.$ins_usr_id);
			addColumnPathMap(Srch01_HdrR.$ins_usr_nm, Srch01_HdrR.$ins_usr_nm);
			addColumnPathMap(Srch01_HdrR.$ins_func_id, Srch01_HdrR.$ins_func_id);
			addColumnPathMap(Srch01_HdrR.$ins_ts, Srch01_HdrR.$ins_ts);
			addColumnPathMap(Srch01_HdrR.$upd_usr_id, Srch01_HdrR.$upd_usr_id);
			addColumnPathMap(Srch01_HdrR.$upd_usr_nm, Srch01_HdrR.$upd_usr_nm);
			addColumnPathMap(Srch01_HdrR.$upd_func_id, Srch01_HdrR.$upd_func_id);
			addColumnPathMap(Srch01_HdrR.$upd_ts, Srch01_HdrR.$upd_ts);
			addColumnPathMap(Srch01_HdrR.$upd_srv_req_no, Srch01_HdrR.$upd_srv_req_no);
			addColumnPathMap(Srch01_HdrR.$purc_ddlv_flg, Srch01_HdrR.$purc_ddlv_flg);
			addColumnPathMap(Srch01_HdrR.$ar_dpt_typ, Srch01_HdrR.$ar_dpt_typ);
			addColumnPathMap(Srch01_HdrR.$lnk_ar_dpt_cd, Srch01_HdrR.$lnk_ar_dpt_cd);
			addColumnPathMap(Srch01_HdrR.$prnt_lcl_cd, Srch01_HdrR.$prnt_lcl_cd);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.sls_upri_cng_flg(src.getBooleanNE("cst_sls_upri_cng_flg"));
		}
	}

	protected Map_Srch01_MapDtlR_MST_IV_MAP_R<Srch01_MapDtlR,MST_IV_MAP_R> createMap_Srch01_MapDtlR_MST_IV_MAP_R() {
		return new Map_Srch01_MapDtlR_MST_IV_MAP_R<Srch01_MapDtlR, MST_IV_MAP_R>();
	}

	public class Map_Srch01_MapDtlR_MST_IV_MAP_R<D extends Srch01_MapDtlR, S extends MST_IV_MAP_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_MapDtlR.$iv_d_no, MST_IV_MAP_R.$iv_d_no);
			addColumnPathMap(Srch01_MapDtlR.$ship_schd_no, MST_IV_MAP_R.$ship_schd_no);
			addColumnPathMap(Srch01_MapDtlR.$trd_unit_qty, MST_IV_MAP_R.$trd_unit_qty);
			addColumnPathMap(Srch01_MapDtlR.$base_unit_qty, MST_IV_MAP_R.$base_unit_qty);
			
			addColumnPathMap(Srch01_MapDtlR.$pr_sts_typ, "pr_sts_typ");
			addColumnPathMap(Srch01_MapDtlR.$ship_inst_typ, "ship_inst_typ");
			addColumnPathMap(Srch01_MapDtlR.$ship_inst_qty, "ship_inst_qty");
			addColumnPathMap(Srch01_MapDtlR.$ship_act_qty, "ship_act_qty");

		}
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 単価を再取得する<br>
	 */
	public class Sprt01 extends MSBEL_IvReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {

			callSlsUpriSvSprt01();
			
			setDown();
		}

		/**
		 * 	単価再取得サービスの呼出
		 */
		protected void callSlsUpriSvSprt01() {

			mapUpContainers(CALL_OPE);
			sprt01.up0().setColumnValue(SlsUpri_Sprt01_DtlR.$std_upri_wg_cd, SlsUpri_Sprt01_DtlR.$wg_cd);

			sprt01.exec();

			// mapDownContaiersを呼ぶと属性(呼出元のGUIIndex)が上書きされるため呼ばない
			String[] destCols = new String[] {
				Sprt01_DtlR.$sls_upri, Sprt01_DtlR.$interim_flg
			};
			String[] srcCols = new String[] {
				SlsUpri_Sprt01_DtlR.$sls_upri, SlsUpri_Sprt01_DtlR.$interim_flg
			};
			copyByPegNo(up0(), destCols, sprt01_down0, srcCols);
		}

		@Override
		protected void up_CALL_OPE(MCList<SlsUpri_Sprt01_DtlR> dest0_0,
				MCList<Sprt01_DtlR> src_Sprt01_Dtl) {

			setPegNo(up0());
			super.up_CALL_OPE(dest0_0, src_Sprt01_Dtl);
			dest0_0.setBoolean(SlsUpri_Sprt01_DtlR.$sls_upri_flg, true);
			dest0_0.setBoolean(SlsUpri_Sprt01_DtlR.$std_upri_flg, true);
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	//FMCB CUSTOM END
}