package mcframe.serverMSBA.MSBAL0030;

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
import mcframe.serverMSBA.MSBAL0030.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBA.MSBAL0030.Query.*;
import mcframe.serverMSBA.MSBAL5120.*;
import mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.dbc.CoreFunction.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBAL_DmndListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBAL_DmndListReg_MC extends MSBAL_DmndListReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 需要情報を検索する<br>
	 */
	public class Srch01 extends MSBAL_DmndListReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setUpTmpCol(up0());
			
			MCQueryPlan dmndSql = MSBAL0030_MST_DMND_S01();
			searchForDL(dmndSql, up0(), down0());
		}
		
		/**
		 * 検索条件に対する一時カラムを設定する
		 * @param up 上り電文
		 */
		protected void setUpTmpCol(Srch01_CndR up) {
			if(up.misc()) {
				up.addStringColumn("TMP_MISC", MSC_DMND_TYP.MISC.value());
			}
			if(up.othr()) {
				up.addStringColumn("TMP_OTHR", toTrueStr(true));
			}
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			
			for (Srch01_RsltR r : down0()) {
				if (isNull(r.dlv_cd())) {
					r.ship_lt(r.bp_ship_lt());
				}
				else {
					if (r.non_dmnd_lt_flg()) {
						r.ship_lt(MCNumber.ZERO);
					}
					else {
						r.ship_lt(r.xfr_lt());
					}
				}
			}
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 需要情報を登録・訂正するために、チェックを行う<br>
	 */
	public class Chk01 extends MSBAL_DmndListReg_MC_A.Chk01 {
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
			
			msgL.addAll(chkDmnd());
			
			return msgL;
		}
		
		/**
		 * 需要情報のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkDmnd() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_DMND_R> selectL = MCList.create(MST_DMND_R.class);
			MST_DMND_R t = MST_DMND_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.dmnd_no);
			MCList<Chk01_RsltR> bindL = notErrL;
			bindL.sort(Chk01_RsltR.$dmnd_no);
			if (up1().file_imp_flg()) {
				dbSelectKey("MSBAL0030_MST_DMND_S01", selectL, selectL_bldr, bindL);
			}
			else {
				dbSelectKeyForUpdateNoWait("MSBAL0030_MST_DMND_S02", selectL, selectL_bldr, bindL);
			}
			
			MCIndexKey idxkey = selectL.createIndex(MST_DMND_R.$dmnd_no);
			for (Chk01_RsltR r : notErrL) {
				MST_DMND_R selectR = selectL.getFirst(idxkey, r.dmnd_no());
				if (up1().file_imp_flg()) {
					if (!isNull(r.dmnd_no())) {
						// 存在チェック
						if (selectR == null) {
							msgL.add(msgNotExistInTable(t, r, Chk01_RsltR.$dmnd_no));
						}
						else {
							r.dmnd_period_typ(selectR.dmnd_period_typ());
							r.dmnd_typ(selectR.dmnd_typ());
							r.dmnd_upd_cntr(selectR.upd_cntr());
							// その他需要以外更新不可
							if(!MSC_DMND_TYP.isMISC(r.dmnd_typ())) {
								msgL.add(new MCMessage(MSBAL0021, r.dmnd_no(), toDispGUIIndex(r)));
							}
						}
					}
				}
				else {
					// 更新カウンタチェック
					if(!isNull(r.dmnd_no())) {
						msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$dmnd_upd_cntr, selectR));
					}
				}
				
				if(!isNull(selectR)) {
					selectR.setAttributes(r);
					msgL.addAll(checkWritableLocCdDac(selectR, MST_DMND_R.$dmnd_loc_cd));
				}
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			setShipLt(notErrL);
			for (Chk01_RsltR r : notErrL) {
				// 手配ＮＯ１～４
				// ※checkerで補完した場合も含め、NULL文字を一旦クリアしてから必須チェックする
				if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno1_mng_typ())) {
					r.sno1(nullValToNull(r.sno1()));
					msgL.addAll(check(r, Chk01_RsltR.$sno1, new FXUCL_RequiredValidater()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno2_mng_typ())) {
					r.sno2(nullValToNull(r.sno2()));
					msgL.addAll(check(r, Chk01_RsltR.$sno2, new FXUCL_RequiredValidater()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno3_mng_typ())) {
					r.sno3(nullValToNull(r.sno3()));
					msgL.addAll(check(r, Chk01_RsltR.$sno3, new FXUCL_RequiredValidater()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno4_mng_typ())) {
					r.sno4(nullValToNull(r.sno4()));
					msgL.addAll(check(r, Chk01_RsltR.$sno4, new FXUCL_RequiredValidater()));
				}
				
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
				
				msgL.addAll(checkWritableLocCdDac(r, MST_DMND_R.$dmnd_loc_cd));
				setDmndDt(r);
			}
			
			setErrFlg(up0());
			
			msgL.addAll(chkDecPlace());

			return msgL;
		}
		
		/**
		 * 数量の小数有効桁数チェック
		 */
		protected MCMessageList chkDecPlace() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			
			// 小数有効桁数チェック
			for (Chk01_RsltR upR : notErrL){
				if (!isNull(upR.dmnd_qty())) {
					msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$base_unit_dec_place, Chk01_RsltR.$dmnd_qty));
				}
				if (!isNull(upR.input_qty())) {
					msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$base_unit_dec_place, Chk01_RsltR.$input_qty));
				}
				if (!isNull(upR.rec_qty())) {
					msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$base_unit_dec_place, Chk01_RsltR.$rec_qty));
				}
			}
			return msgL;
		}

		/**
		 * 物流制御マスタを取得し、出荷ＬＴを設定する
		 * @param notErrL
		 */
		protected void setShipLt(MCList<Chk01_RsltR> notErrL) {
			// 物流制御マスタの移動ＬＴを取得
			MCList<Chk01_RsltR> bindDmndL = MCList.create(Chk01_RsltR.class);
			for (Chk01_RsltR r : notErrL.groupBy(Chk01_RsltR.$dmnd_lg_grp_cd, Chk01_RsltR.$to_lg_grp_cd, Chk01_RsltR.$ship_term_cd)) {
				if (isNullOrNullVal(r.dmnd_lg_grp_cd()) || isNullOrNullVal(r.to_lg_grp_cd())) {
					continue;
				}
				bindDmndL.add(r);
				
				// 出荷条件は一致するものがない場合はNULL文字のものを取得する必要があるため、対象に追加
				if (!MAC_STR.isNULL_VAL(r.getStringNE("SHIP_TERM_CD"))) {
					Chk01_RsltR copyR = r.clone();
					copyR.ship_term_cd(MAC_STR.NULL_VAL.value());
					bindDmndL.add(copyR);
				}
			}
			MCList<MAM_LG_CTL_R> lgCtlL = MCList.create(MAM_LG_CTL_R.class);
			MAM_LG_CTL_R t = MAM_LG_CTL_R.create("T");
			MCQueryApiBuilder lgCtlL_bldr = MCQueryApiBuilder.create(t);
			lgCtlL_bldr.setSelect(t.fr_lg_grp_cd, t.to_lg_grp_cd, t.ship_term_cd, t.xfr_lt, t.non_dmnd_lt_flg);
			lgCtlL_bldr.setWhere(t.fr_lg_grp_cd.eq(bind("dmnd_lg_grp_cd")));
			lgCtlL_bldr.addWhereWithAnd(t.to_lg_grp_cd.eq(bind("to_lg_grp_cd")));
			lgCtlL_bldr.addWhereWithAnd(t.ship_term_cd.eq(bind("ship_term_cd")));
			dbSelect("MSBAL0030_MAM_LG_CTL_S01", lgCtlL, lgCtlL_bldr, bindDmndL);
			MCIndexKey lgCtlKey = lgCtlL.createIndex(MAM_LG_CTL_R.$fr_lg_grp_cd, MAM_LG_CTL_R.$to_lg_grp_cd, MAM_LG_CTL_R.$ship_term_cd);

			for (Chk01_RsltR r : notErrL) {
				if (isNull(r.dlv_cd())) {
					r.ship_lt(nvl(r.bp_ship_lt(), MCNumber.ZERO));
				}
				else {
					MAM_LG_CTL_R lgCtlR = lgCtlL.getFirst(lgCtlKey, r.dmnd_lg_grp_cd(), r.to_lg_grp_cd(), r.ship_term_cd());
					if (!isNull(lgCtlR)) {
						r.xfr_lt(lgCtlR.xfr_lt());
						r.non_dmnd_lt_flg(lgCtlR.non_dmnd_lt_flg());
						if (r.non_dmnd_lt_flg()) {
							r.ship_lt(MCNumber.ZERO);
						}
						else {
							r.ship_lt(r.xfr_lt());
						}
					}
					else {
						lgCtlR = lgCtlL.getFirst(lgCtlKey, r.dmnd_lg_grp_cd(), r.to_lg_grp_cd(), MAC_STR.NULL_VAL.value());
						if (!isNull(lgCtlR)) {
							r.xfr_lt(lgCtlR.xfr_lt());
							r.non_dmnd_lt_flg(lgCtlR.non_dmnd_lt_flg());
							if (r.non_dmnd_lt_flg()) {
								r.ship_lt(MCNumber.ZERO);
							}
							else {
								r.ship_lt(r.xfr_lt());
							}
						}
						else {
							r.xfr_lt(MCNumber.ZERO);
							r.ship_lt(MCNumber.ZERO);
						}
					}
				}
			}
		}
		
		/**
		 * 出荷ＬＴを元に各日付を設定する
		 * @param r
		 */
		protected void setDmndDt(Chk01_RsltR r) {
			if (!isNull(r.dmnd_st_dt())) {
				r.dmnd_end_dt(r.dmnd_st_dt());
				MCDate dt = r.dmnd_st_dt().addDay(r.ship_lt());
				r.dmnd_dt(dt);
				r.dlv_schd_st_dt(dt);
				r.dlv_schd_end_dt(dt);
			}
			else if (!isNull(r.dmnd_dt())) {
				r.dlv_schd_st_dt(r.dmnd_dt());
				r.dlv_schd_end_dt(r.dmnd_dt());
				MCDate dt = r.dmnd_dt().addDay(r.ship_lt().negate());
				r.dmnd_st_dt(dt);
				r.dmnd_end_dt(dt);
			}
		}
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 需要情報を取り消すために、チェックを行う<br>
	 */
	public class Chk02 extends MSBAL_DmndListReg_MC_A.Chk02 {
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
			
			msgL.addAll(chkDmnd());
			
			return msgL;
		}

		/**
		 * 需要情報のロック、更新カウンタチェック
		 */
		protected MCMessageList chkDmnd() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_DMND_R> selectL = MCList.create(MST_DMND_R.class);
			MST_DMND_R t = MST_DMND_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.dmnd_no, t.dmnd_loc_cd, t.upd_cntr);
			selectL_bldr.setOrderByAsc(t.dmnd_no);
			MCList<Chk02_RsltR> bindL = notErrL;
			bindL.sort(Chk02_RsltR.$dmnd_no);
			dbSelectKeyForUpdateNoWait("MSBAL0030_MST_DMND_S03", selectL, selectL_bldr, bindL);
			
			MCIndexKey idxkey = selectL.createIndex(MST_DMND_R.$dmnd_no);
			for (Chk02_RsltR r : notErrL) {
				MST_DMND_R selectR = selectL.getFirst(idxkey, r.dmnd_no());
				msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$dmnd_upd_cntr, selectR));
				if(!isNull(selectR)) {
					selectR.setAttributes(r);
					msgL.addAll(checkWritableLocCdDac(selectR, MST_DMND_R.$dmnd_loc_cd));
				}
			}
			return msgL;
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * 需要情報をファイル入力する<br>
	 */
	public class Imp01 extends MSBAL_DmndListReg_MC_A.Imp01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			setDown();
		}
		
		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());
			
			for(Chk01_RsltR r : up0()) {
				// 部門マスタの適用日に使用するため値を設定する
				if (isNull(r.dmnd_dt())) {
					r.dmnd_dt(r.dmnd_st_dt());
				}
				r.dmnd_period_typ(MAC_PERIOD_TYP.DAILY.value());
				r.dmnd_typ(MSC_DMND_TYP.MISC.value());
				r.dmnd_qty(r.input_qty());
				r.rec_qty(MCNumber.ZERO);
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBAL_DmndListReg.Chk01 ope = MSBAL_DmndListReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(true);
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 需要情報を登録・訂正する<br>
	 */
	public class Upd01 extends MSBAL_DmndListReg_MC_A.Upd01 {
		MCList<MAM_LOC_R> _locL = null;
		MCIndexKey _locKey = null;
		
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
			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				updDmnd(notErrL);
			}
		}
		
		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());

			for (Chk01_RsltR r : up0()) {
				if(r.isStatusCreate()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if(r.isStatusModify()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBAL_DmndListReg.Chk01 ope = MSBAL_DmndListReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}
		
		/**
		 * 需要情報の登録を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void updDmnd(MCList<Chk01_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			
			_locL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R locL_t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(locL_t);
			locL_bldr.setWhere(locL_t.loc_cd.eq(bind("dmnd_loc_cd")));
			dbSelect("MSBAL0030_MAM_LOC_S01", _locL, locL_bldr, notErrL.groupBy(Chk01_RsltR.$dmnd_loc_cd));
			_locKey = _locL.createIndex(MAM_LOC_R.$loc_cd);
			
			MCIndexKey key = notErrL.createIndex(Chk01_RsltR.$data_crud_typ);
			MCList<Chk01_RsltR> insL = notErrL.subList(key, MAC_DATA_CRUD_TYP.CRT.value());
			MCList<Chk01_RsltR> updL = notErrL.subList(key, MAC_DATA_CRUD_TYP.UPD.value());

			MCList<MST_DMND_R> insDmndL = MCList.create(MST_DMND_R.class);
			MCList<MST_DMND_R> updDmndL = MCList.create(MST_DMND_R.class);
			
			if(!isNull(insL)) {
				doSeqCache(MSC_NUM_SYS_TYP.DMND, insL.size());
				
				for(Chk01_RsltR r : insL) {
					MST_DMND_R dmndR = MST_DMND_R.create();
					dmndR.dmnd_no(getStrSeq(MSC_NUM_SYS_TYP.DMND));
					dmndR.dmnd_dt(r.dmnd_dt());
					dmndR.dmnd_st_dt(r.dmnd_st_dt());
					dmndR.dmnd_end_dt(r.dmnd_st_dt());
					dmndR.dlv_schd_st_dt(r.dmnd_dt());
					dmndR.dlv_schd_end_dt(r.dmnd_dt());
					dmndR.dmnd_period_typ(r.dmnd_period_typ());
					dmndR.itm_cd(r.itm_cd());
					dmndR.itm_sub1(r.itm_sub1());
					dmndR.itm_sub2(r.itm_sub2());
					dmndR.itm_sub3(r.itm_sub3());
					dmndR.dmnd_typ(r.dmnd_typ());
					dmndR.dmnd_qty(r.dmnd_qty());
					dmndR.input_qty(r.input_qty());
					dmndR.rec_qty(r.rec_qty());
					dmndR.dmnd_dpt_cd(r.dmnd_dpt_cd());
					dmndR.dmnd_usr_cd(r.dmnd_usr_cd());
					dmndR.cst_cd(r.cst_cd());
					dmndR.dlv_cd(r.dlv_cd());
					dmndR.sno1(r.sno1());
					dmndR.sno2(r.sno2());
					dmndR.sno3(r.sno3());
					dmndR.sno4(r.sno4());
					dmndR.wrk_no(r.sno1());
					dmndR.dmnd_loc_cd(r.dmnd_loc_cd());
					dmndR.intr_rmrks(r.intr_rmrks());
					dmndR.sub_char1(r.sub_char1());
					dmndR.sub_char2(r.sub_char2());
					dmndR.sub_char3(r.sub_char3());
					r.dmnd_no(dmndR.dmnd_no());
					insDmndL.add(dmndR);
				}
				dbInsert("MSBAL0030_MST_DMND_I01", insDmndL,
						MCQueryApiBuilder.create(MST_DMND_R.create("T")));
			}
			if(!isNull(updL)) {
				for(Chk01_RsltR r : updL) {
					MST_DMND_R dmndR = MST_DMND_R.create();
					dmndR.dmnd_no(r.dmnd_no());
					dmndR.dmnd_dt(r.dmnd_dt());
					dmndR.dmnd_st_dt(r.dmnd_st_dt());
					dmndR.dmnd_end_dt(r.dmnd_st_dt());
					dmndR.dlv_schd_st_dt(r.dmnd_dt());
					dmndR.dlv_schd_end_dt(r.dmnd_dt());
					dmndR.itm_cd(r.itm_cd());
					dmndR.itm_sub1(r.itm_sub1());
					dmndR.itm_sub2(r.itm_sub2());
					dmndR.itm_sub3(r.itm_sub3());
					dmndR.dmnd_typ(r.dmnd_typ());
					dmndR.dmnd_qty(r.dmnd_qty());
					dmndR.input_qty(r.input_qty());
					dmndR.rec_qty(r.rec_qty());
					dmndR.dmnd_dpt_cd(r.dmnd_dpt_cd());
					dmndR.dmnd_usr_cd(r.dmnd_usr_cd());
					dmndR.cst_cd(r.cst_cd());
					dmndR.dlv_cd(r.dlv_cd());
					dmndR.sno1(r.sno1());
					dmndR.sno2(r.sno2());
					dmndR.sno3(r.sno3());
					dmndR.sno4(r.sno4());
					dmndR.wrk_no(r.sno1());
					dmndR.dmnd_loc_cd(r.dmnd_loc_cd());
					dmndR.intr_rmrks(r.intr_rmrks());
					dmndR.sub_char1(r.sub_char1());
					dmndR.sub_char2(r.sub_char2());
					dmndR.sub_char3(r.sub_char3());
					updDmndL.add(dmndR);
				}
				MST_DMND_R DmndL_t = MST_DMND_R.create("T");
				MCQueryApiBuilder updDmndL_bldr = MCQueryApiBuilder.create(DmndL_t);
				editUpdSetStmt(updDmndL, DmndL_t, updDmndL_bldr);
				dbUpdateKey("MSBAL0030_MST_DMND_U01", updDmndL, updDmndL_bldr);
			}
			
			insDlyDmnd(insDmndL);
			updDlyDmnd(updDmndL);
		}
		
		/**
		 * 更新時のset句の編集
		 * @param updL_bldr 
		 * @param t 
		 */
		protected void editUpdSetStmt(MCList<MST_DMND_R> updL, MST_DMND_R t, MCQueryApiBuilder updL_bldr) {
			updL_bldr.setSet(t.dmnd_dt, t.dmnd_st_dt, t.dmnd_end_dt, t.dlv_schd_st_dt,
					t.dlv_schd_end_dt, t.dly_div_flg, t.itm_cd, t.itm_sub1, t.itm_sub2,
					t.itm_sub3, t.dmnd_typ, t.dmnd_qty, t.input_qty, t.rec_qty,
					t.dmnd_dpt_cd, t.dmnd_usr_cd, t.cst_cd, t.dlv_cd, t.sno1, t.sno2,
					t.sno3, t.sno4, t.wrk_no, t.dmnd_loc_cd, t.intr_rmrks, t.sub_char1,
					t.sub_char2, t.sub_char3);
		}
		
		/**
		 * 日次需要情報を追加
		 * @param insDmndL
		 */
		protected void insDlyDmnd(MCList<MST_DMND_R> insDmndL) {
			MCList<MST_DLY_DMND_R> insDlyDmndL = MCList.create(MST_DLY_DMND_R.class);
			for(MST_DMND_R dmndR : insDmndL) {
				MST_DLY_DMND_R dlyDmndR = MST_DLY_DMND_R.create();
				dlyDmndR.dmnd_no(dmndR.dmnd_no());
				dlyDmndR.dmnd_dt(dmndR.dmnd_st_dt());
				dlyDmndR.dmnd_st_dt(dmndR.dmnd_st_dt());
				dlyDmndR.dmnd_end_dt(dmndR.dmnd_end_dt());
				dlyDmndR.dlv_schd_st_dt(dmndR.dlv_schd_st_dt());
				dlyDmndR.dlv_schd_end_dt(dmndR.dlv_schd_end_dt());
				dlyDmndR.dmnd_period_typ(dmndR.dmnd_period_typ());
				dlyDmndR.itm_cd(dmndR.itm_cd());
				dlyDmndR.itm_sub1(dmndR.itm_sub1());
				dlyDmndR.itm_sub2(dmndR.itm_sub2());
				dlyDmndR.itm_sub3(dmndR.itm_sub3());
				dlyDmndR.spln_itm_cd(dmndR.spln_itm_cd());
				dlyDmndR.dmnd_typ(dmndR.dmnd_typ());
				dlyDmndR.dmnd_qty(dmndR.dmnd_qty());
				dlyDmndR.dmnd_dpt_cd(dmndR.dmnd_dpt_cd());
				dlyDmndR.wrk_no(dmndR.wrk_no());
				dlyDmndR.dmnd_usr_cd(dmndR.dmnd_usr_cd());
				dlyDmndR.cst_cd(dmndR.cst_cd());
				dlyDmndR.dlv_cd(dmndR.dlv_cd());
				dlyDmndR.slo_d_no(dmndR.slo_d_no());
				dlyDmndR.slo_no(dmndR.slo_no());
				dlyDmndR.cst_frcst_d_no(dmndR.cst_frcst_d_no());
				dlyDmndR.cst_frcst_no(dmndR.cst_frcst_no());
				dlyDmndR.ym(dmndR.ym());
				dlyDmndR.spln_vers(dmndR.spln_vers());
				dlyDmndR.cur_cd(dmndR.cur_cd());
				dlyDmndR.sno1(dmndR.sno1());
				dlyDmndR.sno2(dmndR.sno2());
				dlyDmndR.sno3(dmndR.sno3());
				dlyDmndR.sno4(dmndR.sno4());
				dlyDmndR.dmnd_loc_cd(dmndR.dmnd_loc_cd());
				dlyDmndR.intr_rmrks(dmndR.intr_rmrks());
				dlyDmndR.sub_char1(dmndR.sub_char1());
				dlyDmndR.sub_char2(dmndR.sub_char2());
				dlyDmndR.sub_char3(dmndR.sub_char3());
				MAM_LOC_R locR = _locL.getFirst(_locKey, dlyDmndR.dmnd_loc_cd());
				dlyDmndR.wg_cd(locR.wg_cd());
				insDlyDmndL.add(dlyDmndR);
			}
			
			if(!insDlyDmndL.isEmpty()) {
				doSeqCache(MSC_NUM_SYS_TYP.DLYDMND, insDlyDmndL.size());
				for(MST_DLY_DMND_R r : insDlyDmndL) {
					r.dly_dmnd_no(getStrSeq(MSC_NUM_SYS_TYP.DLYDMND));
				}
				dbInsert("MSBAL0030_MST_DLY_DMND_I01", insDlyDmndL,
						MCQueryApiBuilder.create(MST_DLY_DMND_R.create("T")));
			}
		}

		/**
		 * 日次需要情報を更新
		 * @param updDmndL
		 */
		protected void updDlyDmnd(MCList<MST_DMND_R> updDmndL) {
			MCList<MST_DLY_DMND_R> updDlyDmndL = MCList.create(MST_DLY_DMND_R.class);
			MST_DLY_DMND_R t = MST_DLY_DMND_R.create("T");
			MCQueryApiBuilder updDlyDmndL_bldr = MCQueryApiBuilder.create(t);
			updDlyDmndL_bldr.setWhere(t.dmnd_no.eq(bind("dmnd_no")));
			dbSelectForUpdate("MSBAL0030_MST_DLY_DMND_S01", updDlyDmndL, updDlyDmndL_bldr, updDmndL);
			
			MCIndexKey dmndKey = updDmndL.createIndex(MST_DMND_R.$dmnd_no);
			for(MST_DLY_DMND_R dlyDmndR : updDlyDmndL) {
				MST_DMND_R dmndR = updDmndL.getFirst(dmndKey, dlyDmndR.dmnd_no());
				
				dlyDmndR.dmnd_dt(dmndR.dmnd_st_dt());
				dlyDmndR.dmnd_st_dt(dmndR.dmnd_st_dt());
				dlyDmndR.dmnd_end_dt(dmndR.dmnd_end_dt());
				dlyDmndR.dlv_schd_st_dt(dmndR.dlv_schd_st_dt());
				dlyDmndR.dlv_schd_end_dt(dmndR.dlv_schd_end_dt());
				dlyDmndR.dmnd_period_typ(dmndR.dmnd_period_typ());
				dlyDmndR.itm_cd(dmndR.itm_cd());
				dlyDmndR.itm_sub1(dmndR.itm_sub1());
				dlyDmndR.itm_sub2(dmndR.itm_sub2());
				dlyDmndR.itm_sub3(dmndR.itm_sub3());
				dlyDmndR.spln_itm_cd(dmndR.spln_itm_cd());
				dlyDmndR.dmnd_typ(dmndR.dmnd_typ());
				dlyDmndR.dmnd_qty(dmndR.dmnd_qty());
				dlyDmndR.dmnd_dpt_cd(dmndR.dmnd_dpt_cd());
				dlyDmndR.wrk_no(dmndR.wrk_no());
				dlyDmndR.dmnd_usr_cd(dmndR.dmnd_usr_cd());
				dlyDmndR.cst_cd(dmndR.cst_cd());
				dlyDmndR.dlv_cd(dmndR.dlv_cd());
				dlyDmndR.slo_d_no(dmndR.slo_d_no());
				dlyDmndR.slo_no(dmndR.slo_no());
				dlyDmndR.cst_frcst_d_no(dmndR.cst_frcst_d_no());
				dlyDmndR.cst_frcst_no(dmndR.cst_frcst_no());
				dlyDmndR.ym(dmndR.ym());
				dlyDmndR.spln_vers(dmndR.spln_vers());
				dlyDmndR.cur_cd(dmndR.cur_cd());
				dlyDmndR.sno1(dmndR.sno1());
				dlyDmndR.sno2(dmndR.sno2());
				dlyDmndR.sno3(dmndR.sno3());
				dlyDmndR.sno4(dmndR.sno4());
				dlyDmndR.dmnd_loc_cd(dmndR.dmnd_loc_cd());
				dlyDmndR.intr_rmrks(dmndR.intr_rmrks());
				dlyDmndR.sub_char1(dmndR.sub_char1());
				dlyDmndR.sub_char2(dmndR.sub_char2());
				dlyDmndR.sub_char3(dmndR.sub_char3());
				MAM_LOC_R locR = _locL.getFirst(_locKey, dlyDmndR.dmnd_loc_cd());
				dlyDmndR.wg_cd(locR.wg_cd());				
			}
			
			if(!updDlyDmndL.isEmpty()) {
				editUpdSetStmt(updDlyDmndL, t, updDlyDmndL_bldr);
				dbUpdateKey("MSBAL0030_MST_DLY_DMND_U01", updDlyDmndL, updDlyDmndL_bldr);
			}
		}
		
		/**
		 * 更新時のset句の編集
		 */
		protected void editUpdSetStmt(MCList<MST_DLY_DMND_R> updL, MST_DLY_DMND_R t, MCQueryApiBuilder updL_bldr) {
			updL_bldr.setSet(t.dmnd_dt, t.dmnd_st_dt, t.dmnd_end_dt, t.dlv_schd_st_dt,
					t.dlv_schd_end_dt, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					t.dmnd_typ, t.dmnd_qty, t.dmnd_dpt_cd, t.dmnd_usr_cd, t.cst_cd,
					t.dlv_cd, t.sno1, t.sno2, t.sno3, t.sno4, t.wrk_no, t.dmnd_loc_cd,
					t.intr_rmrks, t.sub_char1, t.sub_char2, t.sub_char3, t.wg_cd);
		}

		protected void handleSuccess(MCList<Chk01_RsltR> l) {
			dbTran().commit();

			for (Chk01_RsltR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		protected void handleEx(Exception e,
				MCList<Chk01_RsltR> l) {
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
			for (Chk01_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 需要情報を取り消す<br>
	 */
	public class Del01 extends MSBAL_DmndListReg_MC_A.Del01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e){
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk02();
			MCList<Chk02_RsltR> notErrL = up0().subList(Chk02_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				delDmnd(notErrL);
			}
		}
		
		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(Chk02_RsltR.$peg_no, up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBAL_DmndListReg.Chk02 ope = MSBAL_DmndListReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}
		
		/**
		 * 需要情報の削除を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void delDmnd(MCList<Chk02_RsltR> notErrL) {
			MCList<MST_DMND_R> delDmndL = MCList.create(MST_DMND_R.class);
			for(Chk02_RsltR r : notErrL) {
				MST_DMND_R dmndR = MST_DMND_R.create();
				dmndR.dmnd_no(r.dmnd_no());
				delDmndL.add(dmndR);
			}
			dbDeleteKey("MSBAL0030_MST_DMND_D01", delDmndL,
					MCQueryApiBuilder.create(MST_DMND_R.create("T")));

			delDlyDmnd(delDmndL);
		}
		
		/**
		 * 日次需要情報を削除する
		 * @param delDmndL
		 */
		protected void delDlyDmnd(MCList<MST_DMND_R> delDmndL) {
			MCList<MST_DLY_DMND_R> delDlyDmndL = MCList.create(MST_DLY_DMND_R.class);
			MST_DLY_DMND_R t = MST_DLY_DMND_R.create("T");
			MCQueryApiBuilder delDlyDmndL_bldr = MCQueryApiBuilder.create(t);
			delDlyDmndL_bldr.setWhere(t.dmnd_no.eq(bind("dmnd_no")));
			dbSelectForUpdate("MSBAL0030_MST_DLY_DMND_S02", delDlyDmndL, delDlyDmndL_bldr, delDmndL);
			
			if(!delDlyDmndL.isEmpty()) {
				dbDeleteKey("MSBAL0030_MST_DLY_DMND_D01", delDlyDmndL, delDlyDmndL_bldr);
			}
		}

		protected void handleSuccess(MCList<Chk02_RsltR> l) {
			dbTran().commit();

			for (Chk02_RsltR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		protected void handleEx(Exception e,
				MCList<Chk02_RsltR> l) {
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
			for (Chk02_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}	

	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 日次需要を作成するために検索する<br>
	 */
	public class Srch02 extends MSBAL_DmndListReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			setUpTmpCol(up0());
			
			MCQueryPlan dmndSql = MSBAL0030_MST_DMND_S02();
			executeQuery(down0(), dmndSql, up0());
		}
		
		/**
		 * 検索条件に対する一時カラムを設定する
		 * @param up 上り電文
		 */
		protected void setUpTmpCol(Srch02_CndR up) {
			if(up.misc()) {
				up.addStringColumn("TMP_MISC", MSC_DMND_TYP.MISC.value());
			}
			if(up.othr()) {
				up.addStringColumn("TMP_OTHR", toTrueStr(true));
			}
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 需要日ばらしサービスを実行し日次需要を作成する<br>
	 */
	public class Upd02 extends MSBAL_DmndListReg_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			updDmnd();
			callDlyDmndCrtSrv();
		}
		
		protected void updDmnd() {
			// 期間が該当する需要を取得
			MCList<MST_DMND_R> dmndL = MCList.create(MST_DMND_R.class);
			MST_DMND_R t = MST_DMND_R.create("T");
			MCQueryApiBuilder dmndL_bldr = MCQueryApiBuilder.create(t);
			MAM_CO_R m1 = MAM_CO_R.create("M1");
			dmndL_bldr.setSelect(t.dmnd_no);
			dmndL_bldr.addSelect(t.itm_cd);
			dmndL_bldr.addSelect(t.itm_sub1);
			dmndL_bldr.addSelect(t.itm_sub2);
			dmndL_bldr.addSelect(t.itm_sub3);
			dmndL_bldr.addSelect(t.dmnd_dpt_cd);
			dmndL_bldr.addSelect(t.dmnd_st_dt);
			dmndL_bldr.addSelect(t.dmnd_end_dt);
			dmndL_bldr.addInnerJoin(m1, bracket(value(0).eq(value(0))));
			dmndL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			dmndL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			dmndL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			dmndL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			dmndL_bldr.addWhereWithAnd(t.dmnd_dpt_cd.eq(bind("dmnd_dpt_cd")));
			dmndL_bldr.addWhereWithAnd(t.dmnd_end_dt
					.gte(MAPA_DT$F_GET_PERIOD_ST_DT_NE(FCPA_DATE_UTIL$F_GET_TODAY1(),
							value(MAC_PERIOD_TYP.MONTHLY.value()), m1.ac_cl_day)));
			dbSelectForUpdate("MSBAL0030_MST_DMND_S04", dmndL, dmndL_bldr, up0());
			
			MCIndexKey idxKey = up0().createIndex(Upd02_RsltR.$itm_cd, Upd02_RsltR.$itm_sub1, Upd02_RsltR.$itm_sub2, Upd02_RsltR.$itm_sub3, Upd02_RsltR.$dmnd_dpt_cd);
			
			for(MST_DMND_R r : dmndL) {
				Upd02_RsltR rsltR = up0().getFirst(idxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd());
				if(!isNull(rsltR)) {
					if(!rsltR.dly_div_flg()) {
						r.dly_div_flg(false);
						continue;
					}
					
					if (r.dmnd_st_dt()
							.lte(MAUCL_DateUtil.getPeriodEndDt(
									getToday().addMonth(rsltR.dmnd_date_div_mons())
											.addMonth(-1), MAC_PERIOD_TYP.MONTHLY.value()))) {

						r.dly_div_flg(rsltR.dly_div_flg());
					}
					else {
						r.dly_div_flg(false);
					}
				}
			}
			
			if(!dmndL.isEmpty()) {
				dmndL_bldr.setSet(t.dly_div_flg);
				dbUpdateKey("MSBAL0030_MST_DMND_U02", dmndL, dmndL_bldr);
			}
		}
		
		protected void callDlyDmndCrtSrv() {
			MSBAL_DlyDmndCrtService.DlyDmndCrt_Upd01 dlyDmndCrtUpd01 = MSBAL_DlyDmndCrtService.crtDlyDmndCrt_Upd01();
			MCList<DlyDmndCrt_Upd01_DtlR> destL = MCList.create(DlyDmndCrt_Upd01_DtlR.class);
			addAll(destL, up0(), createMap_DlyDmndCrt_Upd01_DtlR_Upd02_RsltR());
			dlyDmndCrtUpd01.up0().addAll(destL);
			if(!dlyDmndCrtUpd01.up0().isEmpty()) {
				dlyDmndCrtUpd01.exec();
			}
		}
		
		protected Map_DlyDmndCrt_Upd01_DtlR_Upd02_RsltR<DlyDmndCrt_Upd01_DtlR,Upd02_RsltR> createMap_DlyDmndCrt_Upd01_DtlR_Upd02_RsltR() {
			return new Map_DlyDmndCrt_Upd01_DtlR_Upd02_RsltR<DlyDmndCrt_Upd01_DtlR, Upd02_RsltR>();
		}

		public class Map_DlyDmndCrt_Upd01_DtlR_Upd02_RsltR<D extends DlyDmndCrt_Upd01_DtlR, S extends Upd02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DlyDmndCrt_Upd01_DtlR.$date_div_flg, Upd02_RsltR.$dly_div_flg);
				addColumnPathMap(DlyDmndCrt_Upd01_DtlR.$itm_cd, Upd02_RsltR.$itm_cd);
				addColumnPathMap(DlyDmndCrt_Upd01_DtlR.$itm_sub1, Upd02_RsltR.$itm_sub1);
				addColumnPathMap(DlyDmndCrt_Upd01_DtlR.$itm_sub2, Upd02_RsltR.$itm_sub2);
				addColumnPathMap(DlyDmndCrt_Upd01_DtlR.$itm_sub3, Upd02_RsltR.$itm_sub3);
				addColumnPathMap(DlyDmndCrt_Upd01_DtlR.$dpt_cd, Upd02_RsltR.$dmnd_dpt_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.reg_flg(true);
				dest.st_dt(MAUCL_DateUtil.getPeriodStDt(getToday(), MAC_PERIOD_TYP.MONTHLY.value()));
				dest.fr_screen_flg(true);
			}
		}
		
	}

	//FMCB CUSTOM END
}