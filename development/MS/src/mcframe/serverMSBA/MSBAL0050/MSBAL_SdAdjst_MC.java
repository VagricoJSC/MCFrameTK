package mcframe.serverMSBA.MSBAL0050;

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
import mcframe.serverMSBA.MSBAL0050.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5060.*;
import static mcframe.serverMSBA.MSBAL0050.Query.*;
import mcframe.commonCore.param.MCParam;
import java.util.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMAUC.MAUCL0140.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBAL_SdAdjst"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBAL_SdAdjst_MC extends MSBAL_SdAdjst_MC_A{
	//FMCB CUSTOM START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 日次供給情報を登録・訂正・削除するために、チェックを行う<br>
	 */
	public class Chk01 extends MSBAL_SdAdjst_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			msgL.addAll(chkDlySd());
			msgL.addAll(chkItmOrd());
						
			return msgL;
		}
		
		/**
		 * 日次供給情報のロック、更新カウンタチェック
		 */
		protected MCMessageList chkDlySd() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_Rslt2R> notErrL = getChkList(up1());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_DLY_SD_R> selectL = MCList.create(MST_DLY_SD_R.class);
			MST_DLY_SD_R t = MST_DLY_SD_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.dly_sd_no, t.upd_cntr);
			selectL_bldr.setOrderByAsc(t.dly_sd_no);
			MCList<Chk01_Rslt2R> bindL = notErrL;
			bindL.sort(Chk01_Rslt2R.$dly_sd_no);
			dbSelectKeyForUpdateNoWait("MSBAL0050_MST_DLY_SD_S01", selectL, selectL_bldr, bindL);
			
			MCIndexKey idxkey = selectL.createIndex(MST_DLY_SD_R.$dly_sd_no);
			for (Chk01_Rslt2R r : notErrL) {
				MST_DLY_SD_R selectR = selectL.getFirst(idxkey, r.dly_sd_no());
				if(!isNull(r.dly_sd_no())) {
					msgL.addAll(checkUpdCntrNE(r, Chk01_Rslt2R.$dly_sd_upd_cntr, selectR));
				}
			}
			return msgL;
		}
		
		/**
		 * 日次供給ＮＯに紐づいた品目オーダのチェック
		 */
		protected MCMessageList chkItmOrd() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_Rslt2R> notErrL = getChkList(up1());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_ITM_ORDER_R> itmOrdBindL = MCList.create(MST_ITM_ORDER_R.class);
			for (Chk01_Rslt2R r : notErrL) {
				MST_ITM_ORDER_R itmOrdBindR = MST_ITM_ORDER_R.create();
				itmOrdBindR.rqmt_no(r.dly_sd_no());
				itmOrdBindL.add(itmOrdBindR);
			}
			
			MCList<MST_ITM_ORDER_R> itmOrdL = MCList.create(MST_ITM_ORDER_R.class);
			MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder itmOrdL_bldr = MCQueryApiBuilder.create(t);
			itmOrdL_bldr.setSelect(t.rqmt_no, t.itm_ord_sts_typ);
			itmOrdL_bldr.setWhere(t.rqmt_no.eq(bind("rqmt_no")));
			itmOrdL_bldr.setOrderByAsc(t.rqmt_no);
			itmOrdL_bldr.addOrderByDesc(t.itm_ord_sts_typ);
			itmOrdL_bldr.addConstWhereWithAnd(t.itm_ord_sts_typ
					.neq(value(MSC_ITM_ORD_STS_TYP.OPN.value()))
					.and(t.itm_ord_sts_typ.neq(value(MSC_ITM_ORD_STS_TYP.SAV.value()))));
			dbSelect("MSBAL0050_MST_ITM_ORDER_S01", itmOrdL, itmOrdL_bldr, itmOrdBindL, null);

			MCIndexKey itmOrdIdxkey = itmOrdL.createIndex(MST_ITM_ORDER_R.$rqmt_no);
			for (Chk01_Rslt2R r : notErrL) {
				MST_ITM_ORDER_R itmOrdR = itmOrdL.getFirst(itmOrdIdxkey, r.dly_sd_no());
				if (!isNull(itmOrdR)
						&& !MSC_ITM_ORD_STS_TYP.isOPN(itmOrdR.itm_ord_sts_typ())
						&& !MSC_ITM_ORD_STS_TYP.isSAV(itmOrdR.itm_ord_sts_typ())) {
					msgL.add(new MCMessage(MSBAL0036, r.dly_sd_no()));
				}
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_Rslt2R> notErrL = getChkList(up1());
			for (Chk01_Rslt2R r : notErrL) {
				msgL.addAll(checkWritableLocCdDac(r, Chk01_Rslt2R.$strg_loc_cd));
			}

			msgL.addAll(chkDecPlace());
			msgL.addAll(chkItmDtl());
			msgL.addAll(chkSno());

			return msgL;
		}
		
		/**
		 * 数量の小数有効桁数チェック
		 */
		protected MCMessageList chkDecPlace() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_Rslt2R> notErrL = getChkList(up1());
			
			// 小数有効桁数チェック
			for (Chk01_Rslt2R upR : notErrL){
				if (!isNull(upR.base_unit_qty())) {
					msgL.addAll(checkDecPlace(upR, Chk01_Rslt2R.$base_unit_dec_place, Chk01_Rslt2R.$base_unit_qty));
				}
			}
			return msgL;
		}

		protected MCMessageList chkItmDtl() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_Rslt2R> notErrL = getChkList(up1());
			MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			
			for(Chk01_Rslt2R r : notErrL) {
				if(!isNullOrNullVal(r.mfg_loc_cd()) || !isNullOrNullVal(r.sppl_cd()) || !isNullOrNullVal(r.rqst_loc_cd())) {
					MAM_ITM_DTL_R itmDtlR = MAM_ITM_DTL_R.create();
					itmDtlR.setAttributes(r);
					itmDtlR.itm_cd(r.itm_cd());
					itmDtlR.itm_sub1(r.itm_sub1());
					itmDtlR.itm_sub2(r.itm_sub2());
					itmDtlR.itm_sub3(r.itm_sub3());
					itmDtlR.mfg_loc_cd(r.mfg_loc_cd());
					itmDtlR.sppl_cd(r.sppl_cd());
					itmDtlR.rqst_loc_cd(r.rqst_loc_cd());
					itmDtlR.wg_cd(r.strg_wg_cd());
					itmDtlR.st_dt(r.due_dt());
					itmDtlL.add(itmDtlR);
				}
			}
			
			if(!itmDtlL.isEmpty()) {
				MAM_ITM_R t1 = MAM_ITM_R.create("T");
				MCQueryApiBuilder itmDbc_bldr = MCQueryApiBuilder.create(t1);
				itmDbc_bldr.setSelect(t1.itm_cd);
				itmDbc_bldr.addSelect(t1.asset_mng_typ);

				FXUCL_MCDbcCache<MAM_ITM_R> itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(
						itmDbc_bldr, itmDtlL, MAM_ITM_R.$itm_cd, 
						MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, 
						MAM_ITM_R.$itm_sub3);
				
				MCList<MAM_ITM_DTL_R> chkItmDtlL = MCList.create(MAM_ITM_DTL_R.class);
				MAM_ITM_DTL_R t2 = MAM_ITM_DTL_R.create("T");
				MCQueryApiBuilder chkItmDtlL_bldr = MCQueryApiBuilder.create(t2);

				chkItmDtlL_bldr.setSelect(t2.itm_cd);
				chkItmDtlL_bldr.addSelect(t2.itm_sub1);
				chkItmDtlL_bldr.addSelect(t2.itm_sub2);
				chkItmDtlL_bldr.addSelect(t2.itm_sub3);
				chkItmDtlL_bldr.addSelect(t2.mfg_loc_cd);
				chkItmDtlL_bldr.addSelect(t2.sppl_cd);
				chkItmDtlL_bldr.addSelect(t2.rqst_loc_cd);
				chkItmDtlL_bldr.addSelect(t2.wg_cd);
				chkItmDtlL_bldr.addSelect(t2.st_dt);
				chkItmDtlL_bldr.addSelect(t2.end_dt);
				chkItmDtlL_bldr.setWhere(t2.itm_cd.eq(bind("itm_cd")));
				chkItmDtlL_bldr.addWhereWithAnd(t2.itm_sub1.eq(bind("itm_sub1")));
				chkItmDtlL_bldr.addWhereWithAnd(t2.itm_sub2.eq(bind("itm_sub2")));
				chkItmDtlL_bldr.addWhereWithAnd(t2.itm_sub3.eq(bind("itm_sub3")));
				chkItmDtlL_bldr.addWhereWithAnd(t2.mfg_loc_cd.eq(bind("mfg_loc_cd")));
				chkItmDtlL_bldr.addWhereWithAnd(t2.sppl_cd.eq(bind("sppl_cd")));
				chkItmDtlL_bldr.addWhereWithAnd(t2.rqst_loc_cd.eq(bind("rqst_loc_cd")));
				chkItmDtlL_bldr.addWhereWithAnd(t2.wg_cd.eq(bind("wg_cd")));
				dbSelect("MSBAL0050_MAM_ITM_DTL_S01", chkItmDtlL, chkItmDtlL_bldr,
						itmDtlL.groupBy(MAM_ITM_DTL_R.$itm_cd, 
								MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2, 
								MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$mfg_loc_cd, 
								MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$rqst_loc_cd, 
								MAM_ITM_DTL_R.$wg_cd));
				
				MCIndexKey idxKey = chkItmDtlL.createIndex(MAM_ITM_DTL_R.$itm_cd,
						MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2,
						MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$mfg_loc_cd,
						MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$rqst_loc_cd,
						MAM_ITM_DTL_R.$wg_cd);

				for(MAM_ITM_DTL_R r : itmDtlL) {
					MAM_ITM_R itmR = itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
					
					if(!isNull(itmR.itm_cd()) && !MAC_ASSET_MNG_TYP.isNOT_MNG(itmR.asset_mng_typ())) {
						MCList<MAM_ITM_DTL_R> tmpL = chkItmDtlL.subList(idxKey,
								r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
								r.mfg_loc_cd(), r.sppl_cd(), r.rqst_loc_cd(), r.wg_cd());
						if(isNull(tmpL)) {
							msgL.add(new MCMessage(r, null, MSBAL0018, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), null, r.mfg_loc_cd(), r.sppl_cd(), r.rqst_loc_cd(), toYMDString(r.st_dt()), toDispGUIIndex(r)));
							continue;
						}
						boolean exists = false;
						for(MAM_ITM_DTL_R tmpR : tmpL) {
							if(r.st_dt().gte(tmpR.st_dt()) && r.st_dt().lte(tmpR.end_dt())) {
								exists = true;
							}
						}
						if(!exists) {
							msgL.add(new MCMessage(r, null, MSBAL0018, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), null, r.mfg_loc_cd(), r.sppl_cd(), r.rqst_loc_cd(), toYMDString(r.st_dt()), toDispGUIIndex(r)));
						}
					}
				}
			}
			
			return msgL;
		}

		protected MCMessageList chkSno() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_Rslt2R> notErrL = getChkList(up1());
			for (Chk01_Rslt2R r : notErrL){
				// 手配ＮＯ１～４
				// ※checkerで補完した場合も含め、NULL文字を一旦クリアしてから必須チェックする
				if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno1_mng_typ())) {
					r.sno1(nullValToNull(r.sno1()));
					msgL.addAll(check(r, Chk01_Rslt2R.$sno1, new FXUCL_RequiredValidater()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno2_mng_typ())) {
					r.sno2(nullValToNull(r.sno2()));
					msgL.addAll(check(r, Chk01_Rslt2R.$sno2, new FXUCL_RequiredValidater()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno3_mng_typ())) {
					r.sno3(nullValToNull(r.sno3()));
					msgL.addAll(check(r, Chk01_Rslt2R.$sno3, new FXUCL_RequiredValidater()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno4_mng_typ())) {
					r.sno4(nullValToNull(r.sno4()));
					msgL.addAll(check(r, Chk01_Rslt2R.$sno4, new FXUCL_RequiredValidater()));
				}

				// 手配ＮＯ１～４　管理しない場合
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ())) {
					r.sno1(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ())) {
					r.sno2(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ())) {
					r.sno3(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ())) {
					r.sno4(MAC_STR.NULL_VAL.value());
				}
			}
			return msgL;
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 日次供給情報を登録・訂正・削除する<br>
	 */
	public class Upd01 extends MSBAL_SdAdjst_MC_A.Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}
		
		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			MCList<Chk01_Rslt2R> notErrL = up1().subList(Chk01_Rslt1R.$err_flg, false);
			if (notErrL.size() != 0) {
				updDlySd(notErrL);
			}
		}
		
		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(Chk01_Rslt1R.$peg_no, up0());
			setPegNo(Chk01_Rslt2R.$peg_no, up1());
			MCIndexKey idxKey = up0().createIndex(Chk01_Rslt1R.$itm_cd, Chk01_Rslt1R.$itm_sub1, Chk01_Rslt1R.$itm_sub2, Chk01_Rslt1R.$itm_sub3, Chk01_Rslt1R.$loc_cd);

			// 上り電文の属性を変更する前に、下り電文にpeg_noと属性をコピーする
			copyPegNoAndAttr(down1(), up1());

			for (Chk01_Rslt2R r : up1()) {
				if(isNull(r.dly_sd_no())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if(r.isStatusDelete()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());		
				}
				Chk01_Rslt1R rslt1R = up0().getFirst(idxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.strg_loc_cd());
				if(!isNull(rslt1R)) {
					// メッセージ出力用に属性をコピー
					r.setAttributes(rslt1R);
				}
			}
		}
				
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBAL_SdAdjst.Chk01 ope = MSBAL_SdAdjst.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().setAll(up1());
			ope.exec();
			
			up0().setAll(ope.down0());
			up1().setAll(ope.down1());
		}
		
		/**
		 * 日次供給情報の登録を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void updDlySd(MCList<Chk01_Rslt2R> notErrL) {
			MCIndexKey key = notErrL.createIndex(Chk01_Rslt2R.$data_crud_typ);
			MCList<Chk01_Rslt2R> insL = notErrL.subList(key, MAC_DATA_CRUD_TYP.CRT.value());
			MCList<Chk01_Rslt2R> updL = notErrL.subList(key, MAC_DATA_CRUD_TYP.UPD.value());
			MCList<Chk01_Rslt2R> delL = notErrL.subList(key, MAC_DATA_CRUD_TYP.DEL.value());

			MCList<MST_DLY_SD_R> insDlySdL = MCList.create(MST_DLY_SD_R.class);
			MCList<MST_DLY_SD_R> updDlySdL = MCList.create(MST_DLY_SD_R.class);
			MCList<MST_DLY_SD_R> delDlySdL = MCList.create(MST_DLY_SD_R.class);
			
			if(!isNull(insL)) {
				doSeqCache(MSC_NUM_SYS_TYP.DLYSD, insL.size());
				
				for(Chk01_Rslt2R r : insL) {
					MST_DLY_SD_R dlySdR = MST_DLY_SD_R.create();
					dlySdR.dly_sd_no(getStrSeq(MSC_NUM_SYS_TYP.DLYSD));
					dlySdR.itm_cd(r.itm_cd());
					dlySdR.itm_sub1(r.itm_sub1());
					dlySdR.itm_sub2(r.itm_sub2());
					dlySdR.itm_sub3(r.itm_sub3());
					dlySdR.strg_loc_cd(r.strg_loc_cd());
					dlySdR.due_dt(r.due_dt());
					dlySdR.rqmt_qty(r.base_unit_qty());
					dlySdR.mfg_loc_cd(r.mfg_loc_cd());
					dlySdR.sppl_cd(r.sppl_cd());
					dlySdR.rqst_loc_cd(r.rqst_loc_cd());
					dlySdR.sno1(r.sno1());
					dlySdR.sno2(r.sno2());
					dlySdR.sno3(r.sno3());
					dlySdR.sno4(r.sno4());
					dlySdR.wg_cd(r.strg_wg_cd());
					dlySdR.intr_rmrks(r.intr_rmrks());
					dlySdR.sub_char1(r.sub_char1());
					dlySdR.sub_char2(r.sub_char2());
					dlySdR.sub_char3(r.sub_char3());
					r.dly_sd_no(dlySdR.dly_sd_no());
					insDlySdL.add(dlySdR);
				}
				dbInsert("MSBAL0050_MST_DLY_SD_I01", insDlySdL,
						MCQueryApiBuilder.create(MST_DLY_SD_R.create("T")));
			}
			if(!isNull(updL)) {
				for(Chk01_Rslt2R r : updL) {
					MST_DLY_SD_R dlySdR = MST_DLY_SD_R.create();
					dlySdR.dly_sd_no(r.dly_sd_no());
					dlySdR.strg_loc_cd(r.strg_loc_cd());
					dlySdR.due_dt(r.due_dt());
					dlySdR.rqmt_qty(r.base_unit_qty());
					dlySdR.mfg_loc_cd(r.mfg_loc_cd());
					dlySdR.sppl_cd(r.sppl_cd());
					dlySdR.rqst_loc_cd(r.rqst_loc_cd());
					dlySdR.sno1(r.sno1());
					dlySdR.sno2(r.sno2());
					dlySdR.sno3(r.sno3());
					dlySdR.sno4(r.sno4());
					dlySdR.wg_cd(r.strg_wg_cd());
					dlySdR.intr_rmrks(r.intr_rmrks());
					dlySdR.sub_char1(r.sub_char1());
					dlySdR.sub_char2(r.sub_char2());
					dlySdR.sub_char3(r.sub_char3());
					updDlySdL.add(dlySdR);
				}
				MST_DLY_SD_R t = MST_DLY_SD_R.create("T");
				MCQueryApiBuilder updDlySdL_bldr = MCQueryApiBuilder.create(t);
				editUpdSetStmt(updDlySdL, t, updDlySdL_bldr);
				dbUpdateKey("MSBAL0050_MST_DLY_SD_U01", updDlySdL, updDlySdL_bldr);
			}
			if(!isNull(delL)) {
				for(Chk01_Rslt2R r : delL) {
					MST_DLY_SD_R dlySdR = MST_DLY_SD_R.create();
					dlySdR.dly_sd_no(r.dly_sd_no());
					delDlySdL.add(dlySdR);
				}
				dbDeleteKey("MSBAL0050_MST_DLY_SD_D01", delDlySdL, MCQueryApiBuilder.create(MST_DLY_SD_R.create("T")));
			}
		}
		
		/**
		 * 更新時のset句の編集
		 */
		protected void editUpdSetStmt(MCList<MST_DLY_SD_R> updL, MST_DLY_SD_R t, MCQueryApiBuilder updL_bldr) {

			updL_bldr.setSet(t.strg_loc_cd, 
					t.due_dt, 
					t.rqmt_qty, 
					t.mfg_loc_cd, 
					t.sppl_cd,
					t.rqst_loc_cd, 
					t.sno1, 
					t.sno2, 
					t.sno3, 
					t.sno4, 
					t.wg_cd, 
					t.intr_rmrks,
					t.sub_char1, 
					t.sub_char2, 
					t.sub_char3
					);
		}
		
		protected void handleSuccess(MCList<Chk01_Rslt1R> l) {
			dbTran().commit();

			MCIndexKey idxKey = up1().createIndex(Chk01_Rslt2R.$itm_cd, Chk01_Rslt2R.$itm_sub1, Chk01_Rslt2R.$itm_sub2, Chk01_Rslt2R.$itm_sub3, Chk01_Rslt2R.$strg_loc_cd);
			for (Chk01_Rslt1R r : l) {
				boolean errExists = false;
				MCList<Chk01_Rslt2R> rslt2L = up1().subList(idxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd());
				if(!isNull(rslt2L)) {
					for(Chk01_Rslt2R rslt2R : rslt2L) {
						if(rslt2R.err_flg()) {
							errExists = true;
						}
					}
				}
				if(!errExists) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		protected void handleEx(Exception e,
				MCList<Chk01_Rslt1R> l) {
			dbTran().rollback();
			
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk01_Rslt1R r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			
			String[] downCols = new String[] {
					Chk01_Rslt2R.$dly_sd_no, Chk01_Rslt2R.$itm_cd, Chk01_Rslt2R.$itm_sub1,
					Chk01_Rslt2R.$itm_sub2, Chk01_Rslt2R.$itm_sub3,
					Chk01_Rslt2R.$strg_loc_cd
			};
			copyByPegNo(down1(), downCols, up1(), downCols);
			
			// ※クライアントのshowMergeでエラー行はマージしない動作とするために、処理結果状況区分が必要
			MCIndexKey idxkey = down1().createIndex(Chk01_Rslt2R.$itm_cd,
					Chk01_Rslt2R.$itm_sub1, Chk01_Rslt2R.$itm_sub2,
					Chk01_Rslt2R.$itm_sub3, Chk01_Rslt2R.$strg_loc_cd);
			for (Chk01_Rslt1R downR : down0()) {
				MCList<Chk01_Rslt2R> subL = down1().subList(idxkey, downR.itm_cd(),
						downR.itm_sub1(), downR.itm_sub2(), downR.itm_sub3(),
						downR.loc_cd());
				for (Chk01_Rslt2R subR : subL) {
					subR.rtn_sts_typ(downR.rtn_sts_typ());
				}
			}
		}

		
		@Override
		protected <T extends MCRow> MCList<T> getSplitList(MCParam p) {
			@SuppressWarnings("unchecked")
			MCList<T> ret = (MCList<T>) up0();
			return ret;
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_Rslt1R>> list = splitUp0(up0(), getSplitRowCount());
			for (MCList<Chk01_Rslt1R> l : list) {
				MCOperation ope = createInstance(lgc, p);
				@SuppressWarnings("unchecked")
				MCList<Chk01_Rslt1R> up0L = ((MCList<Chk01_Rslt1R>)ope.up(0));
				@SuppressWarnings("unchecked")
				MCList<Chk01_Rslt2R> up1L = ((MCList<Chk01_Rslt2R>)ope.up(1));
				up0L.setAll(l);
				
				// ヘッダに対応する明細を設定
				MCIndexKey dtlIdx = up1().createIndex(Chk01_Rslt2R.$itm_cd, Chk01_Rslt2R.$itm_sub1, Chk01_Rslt2R.$itm_sub2, Chk01_Rslt2R.$itm_sub3, Chk01_Rslt2R.$strg_loc_cd);
				for (Chk01_Rslt1R rslt1R : l) {
					up1L.addAll(up1().subList(dtlIdx, rslt1R.itm_cd(), rslt1R.itm_sub1(), rslt1R.itm_sub2(), rslt1R.itm_sub3(), rslt1R.loc_cd()));
				}
				opeL.add(ope);
			}
			return opeL;
		}
		
	    /**
	     * 品目・枝番１～３、場所が同一の上り電文行が、同じMCListに格納されるように分割する
	     * @param list クライアントから渡された上り電文
	     * @param max １スレッドあたりの最大件数
	     * @return
	     */
		protected List<MCList<Chk01_Rslt1R>> splitUp0(MCList<Chk01_Rslt1R> list, int max) {
	        List<MCList<Chk01_Rslt1R>> ret = new ArrayList<>();
	        MCList<Chk01_Rslt1R> tmp = MCList.create(Chk01_Rslt1R.class);
	        for (Chk01_Rslt1R r : list) {
	            if (tmp.size() >= max) {
	                ret.add(tmp);
	                tmp = MCList.create(Chk01_Rslt1R.class);
	            }
	            tmp.add(r);
	        }
	        if (!tmp.isEmpty()) {
	            ret.add(tmp);
	        }
	        return ret;
	    }


	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 登録・訂正するために、日次需要情報、在庫推移、日次供給情報を検索する<br>
	 */
	public class Srch01 extends MSBAL_SdAdjst_MC_A.Srch01 {
		protected String _opeMonthly = "2";
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editUp();
			srchDtl();
		}
		
		@Override
		protected boolean isDelFlgCtl() {
			return true;
		}

		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			if (up0().ope().equals(_opeMonthly)) {
				up0().dmnd_dt_fr(MAUCL_DateUtil_MC.getPeriodStDt(up0().dmnd_dt_fr(), MAC_PERIOD_TYP.MONTHLY.value()));
				up0().dmnd_dt_to(MAUCL_DateUtil_MC.getPeriodEndDt(up0().dmnd_dt_to(), MAC_PERIOD_TYP.MONTHLY.value()));
			}
			MCDate ac_ym = nvl(getCloseInfo(up0()), minDate());
			
			up0().srch_dt_fr(MAUCL_DateUtil.getYmEndDt(ac_ym).addDay(1));
			
			if(up0().dmnd_dt_to().gt(getToday())) {
				up0().srch_dt_to(up0().dmnd_dt_to());
			}
			else {
				up0().srch_dt_to(getToday());
			}
			
			if(up0().adjst_tgt_flg() && !up0().adjst_not_tgt_flg()) {
				up0().addStringColumn("TMP_ADJST_TGT", toTrueStr(true));
			}
			else if(!up0().adjst_tgt_flg() && up0().adjst_not_tgt_flg()) {
				up0().addStringColumn("TMP_ADJST_NOT_TGT", toTrueStr(true));
			}
		}

		/**
		 * 在庫締日を取得
		 * @param up0
		 * @return
		 */
		protected MCDate getCloseInfo(Srch01_CndR up0) {
			MST_CLOSE_R dbc = MST_CLOSE_R.create();
			MST_CLOSE_R t = MST_CLOSE_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.addMax(t.ym, "ym");
			dbc_bldr.addWhereWithAnd(t.stk_cl_flg.eq(value(true)));
			dbc_bldr.addWhereWithAnd(
					MAPA_DT$F_GET_YM_END_DT_NE2(t.ym, bind("cl_day"), bind("cl_mon_base"))
							.lt(bind("dmnd_dt_fr")));
			up0.addNumberColumn("cl_day", getCo().ac_cl_day());
			up0.addNumberColumn("cl_mon_base", getCo().ac_cl_mon_base());
			dbSelect("MSBAL0050_MST_CLOSE_S01", dbc, dbc_bldr, up0);

			return dbc.ym();
		}
		
		/**
		 * 在庫締日が取得できない場合の検索開始日を返す
		 * @return
		 */
		protected MCDate minDate() {
			return MCDate.valueOf("19000101000000","yyyyMMddHHmmss");
		}

		protected void srchDtl(){
			MCList<Srch01_Rslt1R> itmL = srchItm();
			
			// 入力フォーム検索
			MCList<Srch01_Rslt1R> inptFormL = srchForm(itmL);

			if(inptFormL.isEmpty()) {
				return;
			}
			// 稼働日判定
			String[] key = new String[]{Srch01_Rslt1R.$loc_cd, Srch01_Rslt1R.$schd_dt};
			MCList<Srch01_Rslt1R> srchWorkDayList = inptFormL.groupBy(key);

			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
			locL_bldr.setSelect(t.loc_cd, t.cal_cd);
			FXUCL_MCDbcCache<MAM_LOC_R> locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(
					locL_bldr, srchWorkDayList, Srch01_Rslt1R.$loc_cd);
			
			for (Srch01_Rslt1R r : srchWorkDayList) {
				boolean isWrkday = execFuncBoolean(createSqlId(LOGIC_ID, "MAPA_DT$F_IS_WRKDAY", "01"), 
						MAPA_DT$F_IS_WRKDAY(value(r.schd_dt()), value(nvl(locCache.get(r.loc_cd()).cal_cd(), getCo().std_cal_cd()))));
				inptFormL.subList(key, new Comparable[]{r.loc_cd(), r.schd_dt()}).setBooleanNE(Srch01_Rslt1R.$wrk_day_flg, isWrkday);;
			}
			
			// 日次供給情報を検索
			MCQueryPlan dlySdSql = MSBAL0050_MST_DLY_SD_S01();
			executeQuery(down1(), dlySdSql, up0());

			
			// 在庫推移検索サービスを実行
			MSBEL_InvTransService.InvTrans_Srch03 invTransSrch03 = getInvTransSrch(itmL);
			
			// シミュオーダの検索
			MCQueryPlan simItmOrderSql = MSBAL0050_MST_SIM_ITM_ORDER_S01();
			executeQuery(down2(), simItmOrderSql, up0());
			
			// 日次需要情報を検索
			MCQueryPlan dlyDmndSql = MSBAL0050_MST_DLY_DMND_S01();
			executeQuery(down3(), dlyDmndSql, up0());
			
			// 日次供給情報、日次需要情報、シミュオーダ（移送）をマージする。
			mergeToInptFmt(inptFormL, invTransSrch03, down2().subList(Srch01_Rslt3R.$itm_ord_typ, MSC_ITM_ORD_TYP.XFR.value()));
			
			calcStk(inptFormL);
			
			// inptFormLを月次で集約する
			MCList<Srch01_Rslt1R> inptFormLMon = MCList.create(Srch01_Rslt1R.class);
			if (up0().ope().equals(_opeMonthly)) {
				MCDate saveDt = null;
				MCDate periodStDt = null;
				for (MCDate dt = up0().dmnd_dt_fr().addDay(-1); dt.lte(up0().dmnd_dt_to().addDay(1)); dt = dt.addDay(MCNumber.ONE)) {
					periodStDt = MAUCL_DateUtil_MC.getPeriodStDt(dt, MAC_PERIOD_TYP.MONTHLY.value());
					if (periodStDt.lt(up0().dmnd_dt_fr().addDay(-1))) {
						periodStDt = up0().dmnd_dt_fr().addDay(-1);
					}
					if (dt.eq(periodStDt)) {
						inptFormLMon.addAll(inptFormL.subList(Srch01_Rslt1R.$schd_dt, dt));
					}
					calcSchdQty(dt, saveDt, periodStDt, inptFormLMon, inptFormL);
					if (!periodStDt.eq(saveDt)) {
						saveDt = periodStDt;
					}
				}
			}
			// マイナス在庫のみ抽出する場合はマイナス在庫になるものを判断
			if(up0().minus_stk_flg()) {
				if (up0().ope().equals(_opeMonthly)) {
					getMinusStk(inptFormLMon);
				}
				else {
					getMinusStk(inptFormL);
				}
			}

			if (up0().ope().equals(_opeMonthly)) {
				down0().setAll(inptFormLMon);
			}
			else {
				down0().setAll(inptFormL);
			}
		}
		/**
		 * 月次検索時の個数サマリ
		 * @param dt 処理対象日
		 * @param saveDt 月ブレイク判定用日付
		 * @param periodStDt 処理対象日の月初日
		 * @param inptFormL2 集約先のリスト
		 * @param inptFormL 集約元のリスト
		 */
		protected void calcSchdQty(MCDate dt, MCDate saveDt, MCDate periodStDt,
				MCList<Srch01_Rslt1R> inptFormL2, MCList<Srch01_Rslt1R> inptFormL) {
			if (periodStDt.eq(saveDt) && !isNull(inptFormL2)) {
				String[] keys = {Srch01_Rslt1R.$itm_cd,
						Srch01_Rslt1R.$itm_sub1,
						Srch01_Rslt1R.$itm_sub2,
						Srch01_Rslt1R.$itm_sub3,
						Srch01_Rslt1R.$loc_cd,
						Srch01_Rslt1R.$sd_adjst_dtl_typ,
						Srch01_Rslt1R.$schd_dt};
				MCIndexKey idx = inptFormL2.createIndex(keys);
				for (Srch01_Rslt1R r : inptFormL.subList(Srch01_Rslt1R.$schd_dt, dt)) {
					// 在庫は集約しない
					if (MSC_SD_ADJST_DTL_TYP.isOLDSTK(r.sd_adjst_dtl_typ()) ||
							MSC_SD_ADJST_DTL_TYP.isSIMSTK(r.sd_adjst_dtl_typ()) ||
							MSC_SD_ADJST_DTL_TYP.isSTK(r.sd_adjst_dtl_typ())) {
						continue;
					}
					Srch01_Rslt1R calcR = inptFormL2.getFirst(idx, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
							r.loc_cd(), r.sd_adjst_dtl_typ(), periodStDt);

					if (MSC_SD_ADJST_DTL_TYP.isBUF(r.sd_adjst_dtl_typ())) {
						if (dt.eq(MAUCL_DateUtil_MC.getPeriodEndDt(dt, MAC_PERIOD_TYP.MONTHLY.value()))) {
							calcR.schd_qty(r.schd_qty());
						}
						continue;
					}
					
					if (!isNull(r.schd_qty())) {
						MCNumber sum = nvl(calcR.schd_qty(),MCNumber.ZERO).add(r.schd_qty());
						calcR.schd_qty(sum);
					}
				}
			}
		}
		
		/**
		 * 対象の品目を検索
		 * @return
		 */
		protected MCList<Srch01_Rslt1R> srchItm() {
			MCList<Srch01_Rslt1R> itmL = MCList.create(Srch01_Rslt1R.class);
			MCQueryPlan tgtItmSql = MABAL0050_TGT_ITM_S01();
			executeQuery(itmL, tgtItmSql, up0());
			
			return itmL;
		}
		
		/**
		 * 入力フォーム検索
		 */
		protected MCList<Srch01_Rslt1R> srchForm(MCList<Srch01_Rslt1R> itmL) {
			// 入力フォーム作成
			return crtInptForm(itmL);
		}

		/**
		 * 在庫推移検索サービスの実行
		 */
		protected MSBEL_InvTransService.InvTrans_Srch03 getInvTransSrch(MCList<Srch01_Rslt1R> itmL) {
			// パフォーマンス向上のため、常に検索条件に品目を指定する
			List<String> cndItmCdL = itmL.groupBy(Srch01_Rslt1R.$itm_cd).getStringNE(Srch01_Rslt1R.$itm_cd);
			String cndItmCdStr = MCStringUtil.arrayValueJoin(cndItmCdL.toArray(new String[cndItmCdL.size()]));
			
			MSBEL_InvTransService.InvTrans_Srch03 invTransSrch03 = MSBEL_InvTransService.crtInvTrans_Srch03();
			invTransSrch03.up0().gr_prcd_flg(false);
			invTransSrch03.up0().gr_sts_opn_grp_flg(true);
			invTransSrch03.up0().gr_sts_ordsav_grp_flg(true);
			invTransSrch03.up0().gr_sts_fix_grp_flg(true);
			invTransSrch03.up0().gr_sts_schd_grp_flg(true);
			invTransSrch03.up0().gr_sts_ord_grp_flg(true);
			invTransSrch03.up0().gr_act_flg(true);
			invTransSrch03.up0().gi_prcd_flg(false);
			invTransSrch03.up0().gi_sts_opn_grp_flg(true);
			invTransSrch03.up0().gi_sts_ordsav_grp_flg(true);
			invTransSrch03.up0().gi_sts_fix_grp_flg(true);
			invTransSrch03.up0().gi_sts_schd_grp_flg(true);
			invTransSrch03.up0().gi_sts_ord_grp_flg(true);
			invTransSrch03.up0().gi_act_flg(true);
			invTransSrch03.up0().tgt_ver_flg(true);
			invTransSrch03.up0().non_ver_flg(true);
			invTransSrch03.up0().dt_fr(up0().dmnd_dt_fr());
			invTransSrch03.up0().dt_to(up0().dmnd_dt_to());
			invTransSrch03.up0().loc_cd(up0().dmnd_loc_cd());
			invTransSrch03.up0().loc_nm(up0().dmnd_loc_nm());
			invTransSrch03.up0().site_cd(up0().site_cd());
			invTransSrch03.up0().site_nm(up0().site_nm());
			invTransSrch03.up0().wg_cd(up0().wg_cd());
			invTransSrch03.up0().wg_nm(up0().wg_nm());
			invTransSrch03.up0().lg_grp_cd(up0().lg_grp_cd());
			invTransSrch03.up0().lg_grp_nm(up0().lg_grp_nm());
			invTransSrch03.up0().loc_grp_cd(up0().loc_grp_cd());
			invTransSrch03.up0().loc_grp_nm(up0().loc_grp_nm());
			invTransSrch03.up0().itm_typ(up0().itm_typ());
			invTransSrch03.up0().itm_typ_d_cd(up0().itm_typ_d_cd());
			invTransSrch03.up0().itm_typ_d_nm(up0().itm_typ_d_nm());
			invTransSrch03.up0().itm_cd(cndItmCdStr);
			invTransSrch03.up0().itm_nm(up0().itm_nm());
			invTransSrch03.up0().itm_grp_flg1(up0().itm_grp_flg1());
			invTransSrch03.up0().itm_grp_cd1(up0().itm_grp_cd1());
			invTransSrch03.up0().itm_grp_nm1(up0().itm_grp_nm1());
			invTransSrch03.up0().itm_grp_flg2(up0().itm_grp_flg2());
			invTransSrch03.up0().itm_grp_cd2(up0().itm_grp_cd2());
			invTransSrch03.up0().itm_grp_nm2(up0().itm_grp_nm2());
			invTransSrch03.up0().itm_grp_flg3(up0().itm_grp_flg3());
			invTransSrch03.up0().itm_grp_cd3(up0().itm_grp_cd3());
			invTransSrch03.up0().itm_grp_nm3(up0().itm_grp_nm3());
			invTransSrch03.up0().itm_grp_flg4(up0().itm_grp_flg4());
			invTransSrch03.up0().itm_grp_cd4(up0().itm_grp_cd4());
			invTransSrch03.up0().itm_grp_nm4(up0().itm_grp_nm4());
			invTransSrch03.up0().itm_grp_flg5(up0().itm_grp_flg5());
			invTransSrch03.up0().itm_grp_cd5(up0().itm_grp_cd5());
			invTransSrch03.up0().itm_grp_nm5(up0().itm_grp_nm5());
			invTransSrch03.up0().itm_grp_flg6(up0().itm_grp_flg6());
			invTransSrch03.up0().itm_grp_cd6(up0().itm_grp_cd6());
			invTransSrch03.up0().itm_grp_nm6(up0().itm_grp_nm6());
			invTransSrch03.up0().itm_grp_flg7(up0().itm_grp_flg7());
			invTransSrch03.up0().itm_grp_cd7(up0().itm_grp_cd7());
			invTransSrch03.up0().itm_grp_nm7(up0().itm_grp_nm7());
			invTransSrch03.up0().itm_grp_flg8(up0().itm_grp_flg8());
			invTransSrch03.up0().itm_grp_cd8(up0().itm_grp_cd8());
			invTransSrch03.up0().itm_grp_nm8(up0().itm_grp_nm8());
			invTransSrch03.up0().itm_grp_flg9(up0().itm_grp_flg9());
			invTransSrch03.up0().itm_grp_cd9(up0().itm_grp_cd9());
			invTransSrch03.up0().itm_grp_nm9(up0().itm_grp_nm9());
			invTransSrch03.up0().itm_grp_flg10(up0().itm_grp_flg10());
			invTransSrch03.up0().itm_grp_cd10(up0().itm_grp_cd10());
			invTransSrch03.up0().itm_grp_nm10(up0().itm_grp_nm10());
			invTransSrch03.up0().sum_unit_typ(MSC_SUM_UNIT_TYP.LOC.value());
			invTransSrch03.up0().sno1_flg(false);
			invTransSrch03.up0().sno2_flg(false);
			invTransSrch03.up0().sno3_flg(false);
			invTransSrch03.up0().sno4_flg(false);
			invTransSrch03.up0().dtl_flg(false);
			if(up0().quality_typ_good_flg()) {
				invTransSrch03.up0().quality_typ(MAC_QUALITY_TYP.GOOD.value());
			}
			invTransSrch03.exec();
			
			return invTransSrch03;
		}
		
		/**
		 * 品目・場所ごとに各明細を準備する。
		 * @param itmL
		 * @return
		 */
		protected MCList<Srch01_Rslt1R> crtInptForm(MCList<Srch01_Rslt1R> itmL) {

			MCList<Srch01_Rslt1R> retL = MCList.create(Srch01_Rslt1R.class);
			MCDate dtFr = up0().dmnd_dt_fr();
			MCDate dtTo = up0().dmnd_dt_to();
			
			for(Srch01_Rslt1R r : itmL) {
				for (MCDate dt = dtFr.addDay(-1); dt.lte(dtTo.addDay(1)); dt = dt.addDay(MCNumber.ONE)){
					// 品目行
					Srch01_Rslt1R rslt1R = r.clone();
					rslt1R.schd_dt(dt);
					rslt1R.sd_adjst_dtl_typ(MSC_SD_ADJST_DTL_TYP.DMND.value());
					retL.add(rslt1R);

					rslt1R = rslt1R.clone();
					rslt1R.sd_adjst_dtl_typ(MSC_SD_ADJST_DTL_TYP.SPLN.value());
					retL.add(rslt1R);

					rslt1R = rslt1R.clone();
					rslt1R.sd_adjst_dtl_typ(MSC_SD_ADJST_DTL_TYP.CSTFRCST.value());
					retL.add(rslt1R);

					// 受注は出庫に含まれるため、対象外

					rslt1R = rslt1R.clone();
					rslt1R.sd_adjst_dtl_typ(MSC_SD_ADJST_DTL_TYP.OTH.value());
					retL.add(rslt1R);

					rslt1R = rslt1R.clone();
					rslt1R.sd_adjst_dtl_typ(MSC_SD_ADJST_DTL_TYP.GI.value());
					retL.add(rslt1R);
					
					rslt1R = rslt1R.clone();
					rslt1R.sd_adjst_dtl_typ(MSC_SD_ADJST_DTL_TYP.GR.value());
					retL.add(rslt1R);

					rslt1R = rslt1R.clone();
					rslt1R.sd_adjst_dtl_typ(MSC_SD_ADJST_DTL_TYP.OLDSPPLY.value());
					retL.add(rslt1R);

					rslt1R = rslt1R.clone();
					rslt1R.sd_adjst_dtl_typ(MSC_SD_ADJST_DTL_TYP.OLDSTK.value());
					retL.add(rslt1R);

					rslt1R = rslt1R.clone();
					rslt1R.sd_adjst_dtl_typ(MSC_SD_ADJST_DTL_TYP.SIM.value());
					retL.add(rslt1R);
					
					rslt1R = rslt1R.clone();
					rslt1R.sd_adjst_dtl_typ(MSC_SD_ADJST_DTL_TYP.SIMSTK.value());
					retL.add(rslt1R);

					rslt1R = rslt1R.clone();
					rslt1R.sd_adjst_dtl_typ(MSC_SD_ADJST_DTL_TYP.SPPLY.value());
					retL.add(rslt1R);

					rslt1R = rslt1R.clone();
					rslt1R.sd_adjst_dtl_typ(MSC_SD_ADJST_DTL_TYP.STK.value());
					retL.add(rslt1R);
					
					rslt1R = rslt1R.clone();
					rslt1R.sd_adjst_dtl_typ(MSC_SD_ADJST_DTL_TYP.BUF.value());
					retL.add(rslt1R);
					
					rslt1R = rslt1R.clone();
					rslt1R.sd_adjst_dtl_typ(MSC_SD_ADJST_DTL_TYP.SPPLYENT.value());
					retL.add(rslt1R);
				}
			}
			return retL;
		}
		
		/**
		 * 日毎の需要情報、供給計画、受払予定、受払実績、シミュオーダ（移送）を集計する。 
		 * @param inptFormL
		 * @param invTransSrch03
		 * @param XfrItmOrderL
		 */
		protected void mergeToInptFmt (MCList<Srch01_Rslt1R> inptFormL, MSBEL_InvTransService.InvTrans_Srch03 invTransSrch03, MCList<Srch01_Rslt3R> xfrItmOrderL){
			String[] itmKeys = {Srch01_Rslt1R.$itm_cd,
					Srch01_Rslt1R.$itm_sub1,
					Srch01_Rslt1R.$itm_sub2,
					Srch01_Rslt1R.$itm_sub3,
					Srch01_Rslt1R.$sd_adjst_dtl_typ,
					Srch01_Rslt1R.$loc_cd,
					Srch01_Rslt1R.$schd_dt};
			MCIndexKey inptFormKey = inptFormL.createIndex(itmKeys);
			
			MCList<Srch01_Rslt3R> xfrItmOrderItmDtGL = null;
			if (!isSame(getSysParm("SD_SIM_XFR_DISP_FLG"), "1")) {
				MCGroupByPolicy gp = new MCGroupByPolicy(
						Srch01_Rslt3R.$itm_cd,
						Srch01_Rslt3R.$itm_sub1,
						Srch01_Rslt3R.$itm_sub2,
						Srch01_Rslt3R.$itm_sub3,
						Srch01_Rslt3R.$strg_loc_cd,
						Srch01_Rslt3R.$due_dt);
				gp.sum(Srch01_Rslt3R.$inst_qty);
				xfrItmOrderItmDtGL = xfrItmOrderL.groupBy(gp);

				String[] xfrItmOrderItmKeys = {
						Srch01_Rslt3R.$itm_cd,
						Srch01_Rslt3R.$itm_sub1,
						Srch01_Rslt3R.$itm_sub2,
						Srch01_Rslt3R.$itm_sub3,
						Srch01_Rslt3R.$strg_loc_cd};
				MCList<Srch01_Rslt3R> xfrItmOrderItmGL = xfrItmOrderL.groupBy(xfrItmOrderItmKeys);

				// 在庫推移検索サービスの結果がない場合、後続処理でシミュレーション品目オーダ（移送）の値が反映できないためここで入庫予定にセットする
				if (!xfrItmOrderItmGL.isEmpty()) {
					String[] invTransSrch03ItmKeys = {
							RsltR.$itm_cd,
							RsltR.$itm_sub1,
							RsltR.$itm_sub2,
							RsltR.$itm_sub3,
							RsltR.$loc_cd};
					MCList<RsltR> invTransSrch03GL = invTransSrch03.down1().groupBy(invTransSrch03ItmKeys);

					MCIndexKey invTransSrch03IdxKey = invTransSrch03GL.createIndex(invTransSrch03ItmKeys);
					MCIndexKey itmIdxKey = xfrItmOrderItmDtGL.createIndex(xfrItmOrderItmKeys);
					
					// シミュレーション品目オーダ（移送）の品目、格納場所の単位でループ
					for (Srch01_Rslt3R row : xfrItmOrderItmGL) {
						// 在庫推移検索サービスの結果取得
						RsltR invTransSrch03R = invTransSrch03GL.getFirst(invTransSrch03IdxKey,  row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3(), row.strg_loc_cd());

						if (isNull(invTransSrch03R)) {
							// 納期別のシミュレーション品目オーダ（移送）を取得
							MCList<Srch01_Rslt3R> tmpL = xfrItmOrderItmDtGL.subList(itmIdxKey, row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3(), row.strg_loc_cd());
							for (Srch01_Rslt3R tmpR : tmpL) {
								Srch01_Rslt1R inptFormR = inptFormL.getFirst(inptFormKey, tmpR.itm_cd(), tmpR.itm_sub1(), tmpR.itm_sub2(), tmpR.itm_sub3(), MSC_SD_ADJST_DTL_TYP.GR.value(), tmpR.strg_loc_cd(), tmpR.due_dt());
								if(!isNull(inptFormR)) {
									inptFormR.schd_qty(tmpR.inst_qty());
								}
							}
						}
					}
				}
			}
			
			//　在庫推移検索サービスの結果をマージ
			for (RsltR srcR : invTransSrch03.down1()) {
				Srch01_Rslt1R destR = inptFormL.getFirst(inptFormKey, srcR.itm_cd(), srcR.itm_sub1(), srcR.itm_sub2(), srcR.itm_sub3(), MSC_SD_ADJST_DTL_TYP.STK.value(), srcR.loc_cd(), srcR.dt());
				if(!isNull(destR)) {
					if(isNull(destR.schd_qty())) {
						destR.schd_qty(srcR.stk_qty());
					}
					else {
						destR.schd_qty(destR.schd_qty().add(srcR.stk_qty()));
					}
				}
				
				destR = inptFormL.getFirst(inptFormKey, srcR.itm_cd(), srcR.itm_sub1(), srcR.itm_sub2(), srcR.itm_sub3(), MSC_SD_ADJST_DTL_TYP.GR.value(), srcR.loc_cd(), srcR.dt());
				if(!isNull(destR)) {
					if(isNull(destR.schd_qty())) {
						destR.schd_qty(srcR.gr_act_qty().add(srcR.gr_schd_qty()));
					}
					else {
						destR.schd_qty(destR.schd_qty().add(srcR.gr_act_qty().add(srcR.gr_schd_qty())));
					}
					
					if (!isSame(getSysParm("SD_SIM_XFR_DISP_FLG"), "1")) {
						String[] itmOderKeys = {Srch01_Rslt3R.$itm_cd,
								Srch01_Rslt3R.$itm_sub1,
								Srch01_Rslt3R.$itm_sub2,
								Srch01_Rslt3R.$itm_sub3,
								Srch01_Rslt3R.$strg_loc_cd,
								Srch01_Rslt3R.$due_dt};
						MCIndexKey idx = xfrItmOrderItmDtGL.createIndex(itmOderKeys);
						Srch01_Rslt3R xfrOrderR = xfrItmOrderItmDtGL.getFirst(idx, srcR.itm_cd(), srcR.itm_sub1(), srcR.itm_sub2(), srcR.itm_sub3(), srcR.loc_cd(), srcR.dt());
	
						if(!isNull(xfrOrderR) && !isNull(xfrOrderR.inst_qty())) {
							destR.schd_qty(destR.schd_qty().add(xfrOrderR.inst_qty()));
						}
					}
					
					if(destR.schd_qty().isZero()) {
						destR.schd_qty(null);
					}
				}

				destR = inptFormL.getFirst(inptFormKey, srcR.itm_cd(), srcR.itm_sub1(), srcR.itm_sub2(), srcR.itm_sub3(), MSC_SD_ADJST_DTL_TYP.GI.value(), srcR.loc_cd(), srcR.dt());
				if(!isNull(destR)) {
					if(isNull(destR.schd_qty())) {
						destR.schd_qty(srcR.gi_act_qty().add(srcR.gi_schd_qty()));
					}
					else {
						destR.schd_qty(destR.schd_qty().add(srcR.gi_act_qty().add(srcR.gi_schd_qty())));
					}

					if(destR.schd_qty().isZero()) {
						destR.schd_qty(null);
					}
				}
			}
			
			// 検索開始日の在庫数を算出
			for(Srch01_Rslt1R r : inptFormL.groupBy(Srch01_Rslt1R.$itm_cd, Srch01_Rslt1R.$itm_sub1, Srch01_Rslt1R.$itm_sub2, Srch01_Rslt1R.$itm_sub3, Srch01_Rslt1R.$loc_cd)) {				
				MCNumber stk = MCNumber.ZERO;
				MCDate startDt = up0().dmnd_dt_fr().addDay(-1);

				MCIndexKey invTransIdx = invTransSrch03.down1().createIndex(RsltR.$itm_cd, RsltR.$itm_sub1, RsltR.$itm_sub2, RsltR.$itm_sub3, RsltR.$loc_cd, RsltR.$dt);
				MCIndexKey stkIdx = invTransSrch03.down1().createIndex(RsltR.$itm_cd, RsltR.$itm_sub1, RsltR.$itm_sub2, RsltR.$itm_sub3, RsltR.$loc_cd);

				RsltR stkR = invTransSrch03.down1().getFirst(invTransIdx, r.itm_cd(),
						r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), startDt);

				if(!isNull(stkR)) {
					stk = stkR.stk_qty();
					stk = stk.subtract(stkR.gr_schd_qty());
					stk = stk.subtract(stkR.gr_act_qty());
					stk = stk.add(stkR.gi_schd_qty());
					stk = stk.add(stkR.gi_act_qty());
				}
				
				MCList<RsltR> tmpL = invTransSrch03.down1().subList(stkIdx, r.itm_cd(),
						r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd());
				
				MCSortPolicy p = new MCSortPolicy();
				p.add(SortType.ASC, RsltR.$dt);
				tmpL.sort(p);

				for (MCDate dt = startDt; dt.lte(up0().dmnd_dt_to()); dt = dt.addDay(1)){
					
					// 対象日の在庫を設定
					Srch01_Rslt1R tgtR = inptFormL.getFirst(inptFormKey, r.itm_cd(),
							r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
							MSC_SD_ADJST_DTL_TYP.STK.value(), r.loc_cd(), dt);

					if(!isNull(tgtR)) {
						tgtR.schd_qty(stk);
					}
				}				
			}
			
			// 日次供給情報のマージ
			for (Srch01_Rslt2R srcR : down1()) {
				MCDate dt;
				if(srcR.due_dt().lt(up0().dmnd_dt_fr())) {
					dt = up0().dmnd_dt_fr().addDay(-1);
				}
				else if (srcR.due_dt().gt(up0().dmnd_dt_to())) {
					dt = up0().dmnd_dt_to().addDay(1);
				}
				else {
					dt = srcR.due_dt();
				}
				
				// 供給計画(入力)
				Srch01_Rslt1R destR = inptFormL.getFirst(inptFormKey, srcR.itm_cd(), srcR.itm_sub1(), srcR.itm_sub2(), srcR.itm_sub3(), MSC_SD_ADJST_DTL_TYP.SPPLYENT.value(), srcR.strg_loc_cd(), dt);
				if(!isNull(destR)) {
					if(isNull(destR.schd_qty())) {
						destR.schd_qty(srcR.base_unit_qty());
					}
					else {
						destR.schd_qty(destR.schd_qty().add(srcR.base_unit_qty()));
					}
				}
				// 供給計画
				destR = inptFormL.getFirst(inptFormKey, srcR.itm_cd(), srcR.itm_sub1(), srcR.itm_sub2(), srcR.itm_sub3(), MSC_SD_ADJST_DTL_TYP.SPPLY.value(), srcR.strg_loc_cd(), dt);
				if(!isNull(destR)) {
					if(isNull(destR.schd_qty())) {
						if(srcR.base_unit_qty().gt(srcR.order_reg_qty())) {
							destR.schd_qty(srcR.base_unit_qty().subtract(srcR.order_reg_qty()));
						}
					}
					else {
						if(srcR.base_unit_qty().gt(srcR.order_reg_qty())) {
							destR.schd_qty(destR.schd_qty().add(srcR.base_unit_qty().subtract(srcR.order_reg_qty())));
						}
					}
				}
				// 前回供給計画も同様
				destR = inptFormL.getFirst(inptFormKey, srcR.itm_cd(), srcR.itm_sub1(), srcR.itm_sub2(), srcR.itm_sub3(), MSC_SD_ADJST_DTL_TYP.OLDSPPLY.value(), srcR.strg_loc_cd(), dt);
				if(!isNull(destR)) {
					if(isNull(destR.schd_qty())) {
						if(srcR.base_unit_qty().gt(srcR.order_reg_qty())) {
							destR.schd_qty(srcR.base_unit_qty().subtract(srcR.order_reg_qty()));
						}
					}
					else {
						if(srcR.base_unit_qty().gt(srcR.order_reg_qty())) {
							destR.schd_qty(destR.schd_qty().add(srcR.base_unit_qty().subtract(srcR.order_reg_qty())));
						}
					}
				}
			}
			
			// 表示期間内のもののみ取得
			MCList<Srch01_Rslt2R> tmpDown1 = down1().clone();
			down1().clear();
			for (Srch01_Rslt2R srcR : tmpDown1) {
				if (srcR.due_dt().gte(up0().dmnd_dt_fr()) && srcR.due_dt().lte(up0().dmnd_dt_to())) {
					down1().add(srcR);
				}
			}
			
			if (!isSame(getSysParm("SD_SIM_XFR_DISP_FLG"), "1")) {
				// シミュオーダから移送オーダを除去する。
				exceptXfr(down2());
			}
			
			// シミュレーションオーダのマージ
			for(Srch01_Rslt3R srcR : down2()) {
				MCDate dt;
				if(srcR.due_dt().lt(up0().dmnd_dt_fr())) {
					dt = up0().dmnd_dt_fr().addDay(-1);
					srcR.addBooleanColumn("delFlg", true);
				}
				else if (srcR.due_dt().gt(up0().dmnd_dt_to())) {
					dt = up0().dmnd_dt_to().addDay(1);
					srcR.addBooleanColumn("delFlg", true);
				}
				else {
					dt = srcR.due_dt();
				}

				Srch01_Rslt1R destR = inptFormL.getFirst(inptFormKey, srcR.itm_cd(), srcR.itm_sub1(), srcR.itm_sub2(), srcR.itm_sub3(), MSC_SD_ADJST_DTL_TYP.SIM.value(), srcR.strg_loc_cd(), dt);
				if(!isNull(destR)) {
					if(isNull(destR.schd_qty())) {
						destR.schd_qty(srcR.inst_qty());
					}
					else {
						destR.schd_qty(destR.schd_qty().add(srcR.inst_qty()));
					}
				}
			}
			
			down2().setAll(down2().subList(r -> r.getBooleanNE("delFlg") == false));
			
			// 日次需要情報のマージ
			for (Srch01_Rslt4R srcR: down3()) {
				// 受注は出庫予定を表示するため、日次需要情報側はマージしない
				if(MSC_DMND_TYP.isPRE_SLO(srcR.dmnd_typ())
						|| MSC_DMND_TYP.isSLO(srcR.dmnd_typ())){
					continue;
				}

				MCDate dt;
				if(srcR.dmnd_dt().lt(up0().dmnd_dt_fr())) {
					dt = up0().dmnd_dt_fr().addDay(-1);
				}
				else if (srcR.dmnd_dt().gt(up0().dmnd_dt_to())) {
					dt = up0().dmnd_dt_to().addDay(1);
				}
				else {
					dt = srcR.dmnd_dt();
				}

				Srch01_Rslt1R destR = inptFormL.getFirst(inptFormKey, srcR.itm_cd(), srcR.itm_sub1(), srcR.itm_sub2(), srcR.itm_sub3(), MSC_SD_ADJST_DTL_TYP.DMND.value(), srcR.dmnd_loc_cd(), dt);
				if(!isNull(destR)) {
					if(isNull(destR.schd_qty())) {
						destR.schd_qty(srcR.base_unit_qty());
					}
					else {
						destR.schd_qty(destR.schd_qty().add(srcR.base_unit_qty()));
					}
				}
				
				destR = null;
				// 需要情報の内訳についてマージ
				if(MSC_DMND_TYP.isPLN_SLS(srcR.dmnd_typ())) {
					destR = inptFormL.getFirst(inptFormKey, srcR.itm_cd(), srcR.itm_sub1(), srcR.itm_sub2(), srcR.itm_sub3(), MSC_SD_ADJST_DTL_TYP.SPLN.value(), srcR.dmnd_loc_cd(), dt);
				}
				else if(MSC_DMND_TYP.isCST_FRCST(srcR.dmnd_typ())) {
					destR = inptFormL.getFirst(inptFormKey, srcR.itm_cd(), srcR.itm_sub1(), srcR.itm_sub2(), srcR.itm_sub3(), MSC_SD_ADJST_DTL_TYP.CSTFRCST.value(), srcR.dmnd_loc_cd(), dt);
				}
				else if(MSC_DMND_TYP.isMISC(srcR.dmnd_typ())) {
					destR = inptFormL.getFirst(inptFormKey, srcR.itm_cd(), srcR.itm_sub1(), srcR.itm_sub2(), srcR.itm_sub3(), MSC_SD_ADJST_DTL_TYP.OTH.value(), srcR.dmnd_loc_cd(), dt);
				}

				if(!isNull(destR)) {
					if(isNull(destR.schd_qty())) {
						destR.schd_qty(srcR.base_unit_qty());
					}
					else {
						destR.schd_qty(destR.schd_qty().add(srcR.base_unit_qty()));
					}
				}				
			}			
		}
		
		/**
		 * シミュオーダから移送オーダを除去する。
		 * @param simItmOrderL
		 */
		protected void exceptXfr (MCList<Srch01_Rslt3R> simItmOrderL){
			MCList<Srch01_Rslt3R> tmpL = MCList.create(Srch01_Rslt3R.class);
			for (Srch01_Rslt3R r : simItmOrderL) {
				if (!MSC_ITM_ORD_TYP.isXFR(r.itm_ord_typ())) {
					tmpL.add(r);
				}
			}
			simItmOrderL.setAll(tmpL);
		}
		
		/**
		 * 在庫推移計算を行う
		 * @param inptFormL
		 */
		protected void calcStk (MCList<Srch01_Rslt1R> inptFormL) {			
			MCIndexKey tgtKey = inptFormL.createIndex(Srch01_Rslt1R.$sd_adjst_dtl_typ);
			MCIndexKey tgtRowKey = inptFormL.createIndex(Srch01_Rslt1R.$itm_cd, Srch01_Rslt1R.$itm_sub1, Srch01_Rslt1R.$itm_sub2, Srch01_Rslt1R.$itm_sub3, Srch01_Rslt1R.$loc_cd, Srch01_Rslt1R.$sd_adjst_dtl_typ, Srch01_Rslt1R.$schd_dt);
			
			MCList<Srch01_Rslt1R> tgtL = inptFormL.subList(tgtKey, MSC_SD_ADJST_DTL_TYP.STK.value());
			tgtL.sort(Srch01_Rslt1R.$itm_cd, Srch01_Rslt1R.$itm_sub1, Srch01_Rslt1R.$itm_sub2, Srch01_Rslt1R.$itm_sub3, Srch01_Rslt1R.$loc_cd, Srch01_Rslt1R.$schd_dt);
			MCNumber stk = MCNumber.ZERO;
			MCList<Srch01_Rslt1R> tgtBufL = inptFormL.subList(tgtKey, MSC_SD_ADJST_DTL_TYP.BUF.value());
			tgtBufL.sort(Srch01_Rslt1R.$itm_cd, Srch01_Rslt1R.$itm_sub1, Srch01_Rslt1R.$itm_sub2, Srch01_Rslt1R.$itm_sub3, Srch01_Rslt1R.$loc_cd, Srch01_Rslt1R.$schd_dt);
			// 各日時点の安全在庫を取得
			MCList<Srch01_Rslt1R> srchBufL = tgtBufL.groupBy(Srch01_Rslt1R.$itm_cd,
					Srch01_Rslt1R.$itm_sub1, Srch01_Rslt1R.$itm_sub2,
					Srch01_Rslt1R.$itm_sub3, Srch01_Rslt1R.$loc_cd);
			srchBufL.setDateNE(Srch01_Rslt1R.$schd_dt, up0().dmnd_dt_fr().addDay(-1));
			getBufQty(srchBufL,tgtBufL);
			for(Srch01_Rslt1R r : tgtL) {
				// 起点在庫を取得
				if(isSame(r.schd_dt(), up0().dmnd_dt_fr().addDay(-1))) {
					stk = r.schd_qty();
				}
				Srch01_Rslt1R dmndR = inptFormL.getFirst(tgtRowKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.DMND.value(), r.schd_dt());
				Srch01_Rslt1R giR = inptFormL.getFirst(tgtRowKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.GI.value(), r.schd_dt());
				Srch01_Rslt1R grR = inptFormL.getFirst(tgtRowKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.GR.value(), r.schd_dt());
				Srch01_Rslt1R spplyR = inptFormL.getFirst(tgtRowKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.SPPLY.value(), r.schd_dt());
				Srch01_Rslt1R simR = inptFormL.getFirst(tgtRowKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.SIM.value(), r.schd_dt());
				MCNumber bufQty = MCNumber.ZERO;
				if (up0().buf_qty_flg()) {
					if (isSame(r.schd_dt(), up0().dmnd_dt_fr().addDay(-1))) {
						bufQty = nvl(inptFormL.getFirst(tgtRowKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.BUF.value(), r.schd_dt()).schd_qty(), MCNumber.ZERO);
					}
					else {
						MCNumber curBufQty = nvl(inptFormL.getFirst(tgtRowKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.BUF.value(), r.schd_dt()).schd_qty(), MCNumber.ZERO);
						MCNumber befBufQty = nvl(inptFormL.getFirst(tgtRowKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.BUF.value(), r.schd_dt().addDay(-1)).schd_qty(), MCNumber.ZERO);
						bufQty = curBufQty.subtract(befBufQty);
					}
				}
				
				stk = stk.subtract(nvl(dmndR.schd_qty(), MCNumber.ZERO));
				stk = stk.subtract(nvl(giR.schd_qty(), MCNumber.ZERO));
				stk = stk.add(nvl(grR.schd_qty(), MCNumber.ZERO));
				stk = stk.add(nvl(spplyR.schd_qty(), MCNumber.ZERO));
				if (up0().buf_qty_flg()) {
					stk = stk.subtract(nvl(bufQty, MCNumber.ZERO));
				}
				r.schd_qty(stk);
				
				Srch01_Rslt1R simStkR = inptFormL.getFirst(tgtRowKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.SIMSTK.value(), r.schd_dt());
				if(!isNull(simStkR)) {
					stk = stk.add(nvl(simR.schd_qty(), MCNumber.ZERO));
					simStkR.schd_qty(stk);
				}
			}
		}
		/**
		 * 安全在庫数量の取得を行う
		 * @param srchBufL 安全在庫算出用のリスト
		 * @return retL 算出した安全在庫数量のリスト
		 */
		protected void getBufQty (MCList<Srch01_Rslt1R> srchBufL, MCList<Srch01_Rslt1R> tgtL) {
			MAM_STK_RPL_R t = MAM_STK_RPL_R.create("T");
			MCQueryApiBuilder dbcStkL_bldr = MCQueryApiBuilder.create(t);
			dbcStkL_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.loc_cd, t.buf_qty);
			FXUCL_MCDbcCacheStEnd<MAM_STK_RPL_R> cacheStk = new FXUCL_MCDbcCacheStEnd<MAM_STK_RPL_R>(dbcStkL_bldr, srchBufL,
					new String[] {
							Srch01_Rslt1R.$itm_cd,
							Srch01_Rslt1R.$itm_sub1,
							Srch01_Rslt1R.$itm_sub2,
							Srch01_Rslt1R.$itm_sub3,
							Srch01_Rslt1R.$loc_cd
							});
			for (Srch01_Rslt1R r : srchBufL) {
				MCIndexKey srchBufRsltKey = tgtL.createIndex(Srch01_Rslt1R.$itm_cd,
						Srch01_Rslt1R.$itm_sub1, Srch01_Rslt1R.$itm_sub2,
						Srch01_Rslt1R.$itm_sub3, Srch01_Rslt1R.$loc_cd);
				for (Srch01_Rslt1R tgtR : tgtL.subList(srchBufRsltKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd())) {
					MAM_STK_RPL_R dbcStkR = cacheStk.get(tgtR.schd_dt(), tgtR.itm_cd(), tgtR.itm_sub1(), tgtR.itm_sub2(), tgtR.itm_sub3(), tgtR.loc_cd());
					if (!dbcStkR.isEmpty() && !isNull(dbcStkR.buf_qty())) {
						tgtR.schd_qty(dbcStkR.buf_qty());
					}
				}
			}
		}
		
		/**
		 * マイナス在庫となるもののみ抽出する
		 * @param inptFormL
		 */
		protected void getMinusStk (MCList<Srch01_Rslt1R> inptFormL) {
			MCIndexKey idxKey = inptFormL.createIndex(Srch01_Rslt1R.$sd_adjst_dtl_typ, Srch01_Rslt1R.$itm_cd, Srch01_Rslt1R.$itm_sub1, Srch01_Rslt1R.$itm_sub2, Srch01_Rslt1R.$itm_sub3, Srch01_Rslt1R.$loc_cd);
			MCList<Srch01_Rslt1R> minusL = MCList.create(Srch01_Rslt1R.class);
			for(Srch01_Rslt1R r : inptFormL.groupBy(Srch01_Rslt1R.$itm_cd, Srch01_Rslt1R.$itm_sub1, Srch01_Rslt1R.$itm_sub2, Srch01_Rslt1R.$itm_sub3, Srch01_Rslt1R.$loc_cd)) {
				MCList<Srch01_Rslt1R> tgtL = inptFormL.subList(idxKey, MSC_SD_ADJST_DTL_TYP.STK.value(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd());
				if(!isNull(tgtL)) {
					tgtL.sort(Srch01_Rslt1R.$schd_dt);
					for(Srch01_Rslt1R tgtR : tgtL) {
						if(nvl(tgtR.schd_qty(), MCNumber.ZERO).isNegative()) {
							minusL.add(tgtR);
							break;
						}
					}
				}
			}

			MCList<Srch01_Rslt1R> tmpL = inptFormL.clone();
			MCIndexKey existsKey = tmpL.createIndex(Srch01_Rslt1R.$itm_cd, Srch01_Rslt1R.$itm_sub1, Srch01_Rslt1R.$itm_sub2, Srch01_Rslt1R.$itm_sub3, Srch01_Rslt1R.$loc_cd);
			
			MCList<Srch01_Rslt2R> tmp2L = down1().clone();
			MCIndexKey exists2Key = tmp2L.createIndex(Srch01_Rslt2R.$itm_cd, Srch01_Rslt2R.$itm_sub1, Srch01_Rslt2R.$itm_sub2, Srch01_Rslt2R.$itm_sub3, Srch01_Rslt2R.$strg_loc_cd);
			MCList<Srch01_Rslt3R> tmp3L = down2().clone();
			MCIndexKey exists3Key = tmp3L.createIndex(Srch01_Rslt3R.$itm_cd, Srch01_Rslt3R.$itm_sub1, Srch01_Rslt3R.$itm_sub2, Srch01_Rslt3R.$itm_sub3, Srch01_Rslt3R.$strg_loc_cd);
			MCList<Srch01_Rslt4R> tmp4L = down3().clone();
			MCIndexKey exists4Key = tmp4L.createIndex(Srch01_Rslt4R.$itm_cd, Srch01_Rslt4R.$itm_sub1, Srch01_Rslt4R.$itm_sub2, Srch01_Rslt4R.$itm_sub3, Srch01_Rslt4R.$dmnd_loc_cd);

			inptFormL.clear();
			down1().clear();
			down2().clear();
			down3().clear();
			for(Srch01_Rslt1R minusR : minusL) {
				inptFormL.addAll(tmpL.subList(existsKey, minusR.itm_cd(), minusR.itm_sub1(), minusR.itm_sub2(), minusR.itm_sub3(), minusR.loc_cd()));
				down1().addAll(tmp2L.subList(exists2Key, minusR.itm_cd(), minusR.itm_sub1(), minusR.itm_sub2(), minusR.itm_sub3(), minusR.loc_cd()));
				down2().addAll(tmp3L.subList(exists3Key, minusR.itm_cd(), minusR.itm_sub1(), minusR.itm_sub2(), minusR.itm_sub3(), minusR.loc_cd()));
				down3().addAll(tmp4L.subList(exists4Key, minusR.itm_cd(), minusR.itm_sub1(), minusR.itm_sub2(), minusR.itm_sub3(), minusR.loc_cd()));
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 参照するために、日次需要情報、在庫推移、日次供給情報を検索する<br>
	 */
	public class Srch02 extends MSBAL_SdAdjst_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			up0().srch_dt_fr(up0().dmnd_dt_fr());
			up0().srch_dt_to(up0().dmnd_dt_to());
			
			if(up0().adjst_tgt_flg() && !up0().adjst_not_tgt_flg()) {
				up0().addStringColumn("TMP_ADJST_TGT", toTrueStr(true));
			}
			else if(!up0().adjst_tgt_flg() && up0().adjst_not_tgt_flg()) {
				up0().addStringColumn("TMP_ADJST_NOT_TGT", toTrueStr(true));
			}
			
			// 日次供給情報を検索
			MCQueryPlan dlySdSql = MSBAL0050_MST_DLY_SD_S01();
			searchForDL(dlySdSql, up0(), down0());
		}
	}

	//FMCB CUSTOM END
}