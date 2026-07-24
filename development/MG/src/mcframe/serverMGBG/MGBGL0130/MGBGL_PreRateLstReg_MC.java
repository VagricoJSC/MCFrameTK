package mcframe.serverMGBG.MGBGL0130;

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
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMA.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMG.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMGBG.MGBGL0130.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBG.MGBGL0130.Query.*;
import static mcframe.commonMGUA.MGUAC0010.MGUAC_List.*;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;
import mcframe.serverFXUC.FXUCL0170.FXUCL_AtLeastOneValidater;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_DuplicateValidater;
import mcframe.serverFXUC.FXUCL0170.IfValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBGL_PreRateLstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBGL_PreRateLstReg_MC extends MGBGL_PreRateLstReg_MC_A{
	//FMCB CUSTOM START
	protected String _tgt_TERM = "0";
	protected String _tgt_PLN = "1";
	protected String _tgt_ACT = "2";

	protected Map<String, String[]> _preAlcTypMap;
	protected Map<String, String[]> preAlcTypMap(){
		if(_preAlcTypMap == null){
			_preAlcTypMap = new LinkedHashMap<String, String[]>();
			_preAlcTypMap.put(MAM_PRE_ALC_PTN_R.$dpt_alc_typ,		new String[]{Chk01_RsltR.$dpt_cd, Chk01_RsltR.$dpt_nm});
			_preAlcTypMap.put(MAM_PRE_ALC_PTN_R.$loc_alc_typ,		new String[]{Chk01_RsltR.$loc_cd, Chk01_RsltR.$loc_nm});
			_preAlcTypMap.put(MAM_PRE_ALC_PTN_R.$oper_alc_typ,		new String[]{Chk01_RsltR.$oper_cd, Chk01_RsltR.$oper_nm});
			_preAlcTypMap.put(MAM_PRE_ALC_PTN_R.$bp_alc_typ,		new String[]{Chk01_RsltR.$bp_cd, Chk01_RsltR.$bp_nm});
			_preAlcTypMap.put(MAM_PRE_ALC_PTN_R.$ctg_alc_typ,		new String[]{Chk01_RsltR.$ctg_cd, Chk01_RsltR.$ctg_nm});
			_preAlcTypMap.put(MAM_PRE_ALC_PTN_R.$itm_alc_typ,		new String[]{Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_sub1, 
																				 Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub3, 
																				 Chk01_RsltR.$itm_nm, Chk01_RsltR.$itm_typ,
																				 Chk01_RsltR.$itm_typ_nm, Chk01_RsltR.$itm_typ_d_cd, 
																				 Chk01_RsltR.$itm_typ_d_nm});
			_preAlcTypMap.put(MAM_PRE_ALC_PTN_R.$lot_alc_typ,		new String[]{Chk01_RsltR.$lot_no});
			_preAlcTypMap.put(MAM_PRE_ALC_PTN_R.$sublot_alc_typ,	new String[]{Chk01_RsltR.$sublot_no});
			_preAlcTypMap.put(MAM_PRE_ALC_PTN_R.$sno1_alc_typ,		new String[]{Chk01_RsltR.$sno1});
			_preAlcTypMap.put(MAM_PRE_ALC_PTN_R.$sno2_alc_typ,		new String[]{Chk01_RsltR.$sno2});
			_preAlcTypMap.put(MAM_PRE_ALC_PTN_R.$sno3_alc_typ,		new String[]{Chk01_RsltR.$sno3});
			_preAlcTypMap.put(MAM_PRE_ALC_PTN_R.$sno4_alc_typ,		new String[]{Chk01_RsltR.$sno4});
			_preAlcTypMap.put(MAM_PRE_ALC_PTN_R.$inst_alc_typ,		new String[]{Chk01_RsltR.$itm_mfg_inst_no});
			_preAlcTypMap.put(MAM_PRE_ALC_PTN_R.$iv_alc_typ,		new String[]{Chk01_RsltR.$iv_no});
			_preAlcTypMap.put(MAM_PRE_ALC_PTN_R.$po_alc_typ,		new String[]{Chk01_RsltR.$po_no});
			_preAlcTypMap.put(MAM_PRE_ALC_PTN_R.$slo_alc_typ,		new String[]{Chk01_RsltR.$slo_no});
			_preAlcTypMap.put(MAM_PRE_ALC_PTN_R.$alc_ac_alc_typ,	new String[]{Chk01_RsltR.$alc_ac_cd, Chk01_RsltR.$alc_ac_nm});
			_preAlcTypMap.put(MAM_PRE_ALC_PTN_R.$wg_alc_typ,		new String[]{Chk01_RsltR.$trd_wg_cd, Chk01_RsltR.$trd_wg_nm});
		}
		return _preAlcTypMap;
	}
	
	// キャッシュ関連
	protected FXUCL_MCDbcCache<MAM_PRE_ALC_RATE_R> _preAlcRateCache = null;

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 一次配賦比率を検索する<br>
	 */
	public class Srch01 extends MGBGL_PreRateLstReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			if (isSame(up0().tgt(), _tgt_TERM)) {
				srchTerm();
			}
			else {
				srchMly();
			}
		}

		protected void srchTerm() {
			executeQuery(down0(), MGBGL0130_MGT_PRE_RATE_TERM_S01(), up0());
		}
		
		protected void srchMly() {
			if (isSame(up0().tgt(), _tgt_PLN)) {
				up0().addStringColumn("sa_typ", MAC_SA_TYP.PLN.value());
			} else if (isSame(up0().tgt(), _tgt_ACT)) {
				up0().addStringColumn("sa_typ", MAC_SA_TYP.ACT.value());
			}
			executeQuery(down0(), MGBGL0130_MGT_PRE_RATE_MLY_S01(), up0());
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 一次配賦期間比率を登録・訂正するために、チェックを行う<br>
	 */
	public class Chk01 extends MGBGL_PreRateLstReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			super.doIt();
			setDown();
		}

		protected void editUp() {
			for(Chk01_RsltR r : up0()) {
				if(isNull(r.itm_cd())) {
					r.itm_sub1(null);
					r.itm_sub2(null);
					r.itm_sub3(null);
				}
			}

			String wg = getSysParm("DEF_WG_CD");
			if (!isNullOrNullVal(wg)) {
				for(Chk01_RsltR r : up0().subList(MCRow.CREATE)) {
					r.wg_cd(wg);
				}
			}
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(chk());
			return msgL;
		}
		
		/**
		 * ロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_RsltR> notErrUpdL = getChkList(up0());
			if (notErrUpdL.isEmpty()) {
				return msgL;
			}
						
			MCList<MGT_PRE_RATE_TERM_R> selectL = MCList.create(MGT_PRE_RATE_TERM_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_PRE_RATE_TERM_R.create("T"));
			if (up1().file_imp_flg()) {
				selectPkWk("MGBGL0130_MGT_PRE_RATE_TERM_S01", selectL, selectL_bldr.getBaseDbc(), notErrUpdL, false);
			}
			else {
				selectForUpdateNoWaitPkWk("MGBGL0130_MGT_PRE_RATE_TERM_S02", selectL, selectL_bldr.getBaseDbc(), notErrUpdL);
			}
			
			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);
			for (Chk01_RsltR r : notErrUpdL) {
				Comparable<?>[] binds = r.toArray(keys);
				MGT_PRE_RATE_TERM_R selectR = selectL.getFirst(idxkey, binds);
				
				if (isNull(selectR)) {
					if (up1().file_imp_flg()) {
						r.setStatus(MCRow.CREATE);
					}
					else {
						if (r.isStatusModify()) {
							msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
						}
					}
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					if (up1().file_imp_flg() || up1().file_ins_flg()) {
						r.setStatus(MCRow.MODIFY);
						r.upd_cntr(selectR.upd_cntr());
					}
					else {
						if (r.isStatusModify()) {
							msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
						}
						else {
							msgL.addAll(getRecordFoundMsg(getModuleID(), selectL.createRow(), r));
						}
					}
					if (r.isStatusModify()) {
						// DACチェック
						msgL.addAll(checkWritableWgCdDac(selectR, MGT_PRE_RATE_TERM_R.$wg_cd));
					}
				}
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			for (Chk01_RsltR upR : notErrL){
				// DACチェック
				msgL.addAll(checkWritableWgCdDac(upR, MGT_PRE_RATE_TERM_R.$wg_cd));
			}
			
			//各一次配賦区分に対応する項目のチェック
			checkPreAlcTyp(msgL, notErrL, up1().file_imp_flg(), up1().file_ins_flg());

			return msgL;
		}

		@Override
		protected IfValidater getDuplicateValidater(String[] cols) {
			return new FXUCL_DuplicateValidater(true);
		}

		@Override
		protected boolean useChkErrUpperLimit() {
			return up1().file_ins_flg();
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
	 * 一次配賦月次比率を登録・訂正するために、チェックを行う<br>
	 */
	public class Chk02 extends MGBGL_PreRateLstReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			super.doIt();
			setDown();
		}

		protected void editUp() {
			for(Chk02_RsltR r : up0()) {
				if(isNull(r.itm_cd())) {
					r.itm_sub1(null);
					r.itm_sub2(null);
					r.itm_sub3(null);
				}
	
				r.addDateColumn(PreAlcRateInPreAlcCtgWithPtnCols.$i_term, getTermInfoYM(r.ym()) == null ? null : getTermInfoYM(r.ym()).term());
			}

			if (isSame(up2().tgt(), _tgt_PLN)) {
				up0().addStringColumn(PreAlcRateInPreAlcCtgWithPtnCols.$i_pln_mly_flg_str, "1");
				up0().addStringColumn(PreAlcRateInPreAlcCtgWithPtnCols.$i_act_mly_flg_str, "0");
				up0().setString(Chk02_RsltR.$sa_typ, MAC_SA_TYP.PLN.value());
			} else if (isSame(up2().tgt(), _tgt_ACT)) {
				up0().addStringColumn(PreAlcRateInPreAlcCtgWithPtnCols.$i_pln_mly_flg_str, "0");
				up0().addStringColumn(PreAlcRateInPreAlcCtgWithPtnCols.$i_act_mly_flg_str, "1");
				up0().setString(Chk02_RsltR.$sa_typ, MAC_SA_TYP.ACT.value());
			}

			String wg = getSysParm("DEF_WG_CD");
			if (!isNullOrNullVal(wg)) {
				for(Chk02_RsltR r : up0().subList(MCRow.CREATE)) {
					r.wg_cd(wg);
				}
			}
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(chk());
			return msgL;
		}
		
		/**
		 * ロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk02_RsltR> notErrUpdL = getChkList(up0());
			if (notErrUpdL.isEmpty()) {
				return msgL;
			}
			
			MCList<MGT_PRE_RATE_MLY_R> selectL = MCList.create(MGT_PRE_RATE_MLY_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_PRE_RATE_MLY_R.create("T"));
			if (up1().file_imp_flg()) {
				selectPkWk("MGBGL0130_MGT_PRE_RATE_MLY_S01", selectL, selectL_bldr.getBaseDbc(), notErrUpdL, false);
			}
			else {
				selectForUpdateNoWaitPkWk("MGBGL0130_MGT_PRE_RATE_MLY_S02", selectL, selectL_bldr.getBaseDbc(), notErrUpdL);
			}
			
			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);
			for (Chk02_RsltR r : notErrUpdL) {
				Comparable<?>[] binds = r.toArray(keys);
				MGT_PRE_RATE_MLY_R selectR = selectL.getFirst(idxkey, binds);
				
				if (isNull(selectR)) {
					if (up1().file_imp_flg()) {
						r.setStatus(MCRow.CREATE);
					}
					else {
						if (r.isStatusModify()) {
							msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
						}
					}
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					if (up1().file_imp_flg() || up1().file_ins_flg()) {
						r.setStatus(MCRow.MODIFY);
						r.upd_cntr(selectR.upd_cntr());
					}
					else {
						if (r.isStatusModify()) {
							msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$upd_cntr, selectR));
						}
						else {
							msgL.addAll(getRecordFoundMsg(getModuleID(), selectL.createRow(), r));
						}
					}
					if (r.isStatusModify()) {
						// DACチェック
						msgL.addAll(checkWritableWgCdDac(selectR, MGT_PRE_RATE_MLY_R.$wg_cd));
					}
				}
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk02_RsltR> notErrL = getChkList(up0());

			for (Chk02_RsltR upR : notErrL){
				// DACチェック
				msgL.addAll(checkWritableWgCdDac(upR, MGT_PRE_RATE_MLY_R.$wg_cd));
			}

			//各一次配賦区分に対応する項目のチェック
			checkPreAlcTyp(msgL, notErrL, up1().file_imp_flg(), up1().file_ins_flg());

			return msgL;
		}

		@Override
		protected IfValidater getDuplicateValidater(String[] cols) {
			return new FXUCL_DuplicateValidater(true);
		}

		@Override
		protected boolean useChkErrUpperLimit() {
			return up1().file_ins_flg();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}		
	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 一次配賦期間比率を削除するために、チェックを行う<br>
	 */
	public class Chk03 extends MGBGL_PreRateLstReg_MC_A.Chk03 {
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
			msgL.addAll(chk());
			return msgL;
		}
		
		/**
		 * ロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk03_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MGT_PRE_RATE_TERM_R> selectL = MCList.create(MGT_PRE_RATE_TERM_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_PRE_RATE_TERM_R.create("T"));
			selectForUpdateNoWaitPkWk("MGBGL0130_MGT_PRE_RATE_TERM_S03", selectL, selectL_bldr.getBaseDbc(), notErrL);

			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);
			for (Chk03_RsltR r : notErrL) {
				Comparable<?>[] binds = r.toArray(keys);
				MGT_PRE_RATE_TERM_R selectR = selectL.getFirst(idxkey, binds);
				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					msgL.addAll(checkUpdCntrNE(r, Chk03_RsltR.$upd_cntr, selectR));
					// DACチェック
					msgL.addAll(checkWritableWgCdDac(selectR, MGT_PRE_RATE_TERM_R.$wg_cd));
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
	 * Chk04オペレーション.<p>
	 *
	 * 一次配賦月次比率を削除するために、チェックを行う<br>
	 */
	public class Chk04 extends MGBGL_PreRateLstReg_MC_A.Chk04 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			super.doIt();
			setDown();
		}

		protected void editUp() {
			if (isSame(up1().tgt(), _tgt_PLN)) {
				up0().setString(Chk04_RsltR.$sa_typ, MAC_SA_TYP.PLN.value());
			} else if (isSame(up1().tgt(), _tgt_ACT)) {
				up0().setString(Chk04_RsltR.$sa_typ, MAC_SA_TYP.ACT.value());
			}
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(chk());
			return msgL;
		}
		
		/**
		 * ロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk04_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MGT_PRE_RATE_MLY_R> selectL = MCList.create(MGT_PRE_RATE_MLY_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_PRE_RATE_MLY_R.create("T"));
			selectForUpdateNoWaitPkWk("MGBGL0130_MGT_PRE_RATE_MLY_S03", selectL, selectL_bldr.getBaseDbc(), notErrL);

			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);
			for (Chk04_RsltR r : notErrL) {
				Comparable<?>[] binds = r.toArray(keys);
				MGT_PRE_RATE_MLY_R selectR = selectL.getFirst(idxkey, binds);
				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					msgL.addAll(checkUpdCntrNE(r, Chk04_RsltR.$upd_cntr, selectR));
					// DACチェック
					msgL.addAll(checkWritableWgCdDac(selectR, MGT_PRE_RATE_MLY_R.$wg_cd));
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
	 * Chk05オペレーション.<p>
	 *
	 * 一次配賦期間比率を一括で削除するために、チェックを行う<br>
	 */
	public class Chk05 extends MGBGL_PreRateLstReg_MC_A.Chk05 {
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
			msgL.addAll(chk());
			return msgL;
		}
		
		/**
		 * DAC
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();

			msgL.addAll(checkWritableWgCdDac(up0(), Chk05_CndR.$wg_cd));

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}
	/**
	 * Chk06オペレーション.<p>
	 *
	 * 一次配賦月次比率を一括で削除するために、チェックを行う<br>
	 */
	public class Chk06 extends MGBGL_PreRateLstReg_MC_A.Chk06 {
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
			msgL.addAll(chk());
			return msgL;
		}
		
		/**
		 * DAC
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();

			msgL.addAll(checkWritableWgCdDac(up0(), Chk06_CndR.$wg_cd));

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだ一次配賦期間比率のチェック処理を行う<br>
	 */
	public class Imp01 extends MGBGL_PreRateLstReg_MC_A.Imp01 {
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
		
		protected void editUp() {
			setPegNo(up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MGBGL_PreRateLstReg.Chk01 ope = MGBGL_PreRateLstReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(true);
			ope.exec();
			up0().setAll(ope.down0());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Imp02オペレーション.<p>
	 *
	 * ファイルから取り込んだ一次配賦月次比率のチェック処理を行う<br>
	 */
	public class Imp02 extends MGBGL_PreRateLstReg_MC_A.Imp02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk02();
			setDown();
		}
		
		protected void editUp() {
			setPegNo(up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MGBGL_PreRateLstReg.Chk02 ope = MGBGL_PreRateLstReg.crtChk02();
			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(true);
			ope.up2().tgt(up1().tgt());
			ope.exec();
			up0().setAll(ope.down0());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 一次配賦期間比率を登録、訂正する<br>
	 */
	public class Upd01 extends MGBGL_PreRateLstReg_MC_A.Upd01 {
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
			upd01Main(up0(), false);
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 一次配賦月次比率を登録、訂正する<br>
	 */
	public class Upd02 extends MGBGL_PreRateLstReg_MC_A.Upd02 {
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
			upd02Main(up0(), up1(), false);
		}
		
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
	 * 一次配賦期間比率を削除する<br>
	 */
	public class Del01 extends MGBGL_PreRateLstReg_MC_A.Del01 {
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
			callThisChk03();
			MCList<Chk03_RsltR> notErrL = getChkList(up0());
			del(notErrL);
		}
		
		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MGBGL_PreRateLstReg.Chk03 ope = MGBGL_PreRateLstReg.crtChk03();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 在庫実績ＩＦの削除を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void del(MCList<Chk03_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_PRE_RATE_TERM_R> dbcL = MCList.create(MGT_PRE_RATE_TERM_R.class);
			notErrL.forEach(r -> dbcL.add(r.dbc()));
			dbDeleteKey("MGBGL0130_MGT_PRE_RATE_TERM_D01", dbcL, MCQueryApiBuilder.create(MGT_PRE_RATE_TERM_R.create("T")));
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
	 * Del02オペレーション.<p>
	 *
	 * 一次配賦月次比率を削除する<br>
	 */
	public class Del02 extends MGBGL_PreRateLstReg_MC_A.Del02 {
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
			callThisChk04();
			MCList<Chk04_RsltR> notErrL = getChkList(up0());
			del(notErrL);
		}
		
		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk04() {
			MGBGL_PreRateLstReg.Chk04 ope = MGBGL_PreRateLstReg.crtChk04();
			ope.up0().setAll(up0());
			MCRow.copyall(ope.up1(), up1());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 在庫実績ＩＦの削除を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void del(MCList<Chk04_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_PRE_RATE_MLY_R> dbcL = MCList.create(MGT_PRE_RATE_MLY_R.class);
			notErrL.forEach(r -> dbcL.add(r.dbc()));
			dbDeleteKey("MGBGL0130_MGT_PRE_RATE_MLY_D01", dbcL, MCQueryApiBuilder.create(MGT_PRE_RATE_MLY_R.create("T")));
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
	 * Del03オペレーション.<p>
	 *
	 * 一次配賦期間比率を一括で削除する<br>
	 */
	public class Del03 extends MGBGL_PreRateLstReg_MC_A.Del03 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			callThisChk05();
			throwDelErr();
			MGT_PRE_RATE_TERM_R t = MGT_PRE_RATE_TERM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			createDbc(dbc_bldr, t);
			lock(dbc_bldr, t);
			del(dbc_bldr, t);
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk05() {
			MGBGL_PreRateLstReg.Chk05 ope = MGBGL_PreRateLstReg.crtChk05();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
			MCRow.copyall(up0(), ope.down0());
		}

		protected void createDbc(MCQueryApiBuilder dbc_bldr, MGT_PRE_RATE_TERM_R t) {
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());

			dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			dbc_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			dbc_bldr.addWhereWithAnd(t.term.between(bind("term_fr"), bind("term_to")));
			dbc_bldr.addWhereWithCutOffAnd(t.pre_alc_rate_cd.like(bind("pre_alc_rate_cd")));

			dbc_bldr.addOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
		}
		protected void lock(MCQueryApiBuilder dbc_bldr, MGT_PRE_RATE_TERM_R t) {
			dbSelectForUpdateNoWaitNoFetch("MGBGL0130_MGT_PRE_RATE_TERM_S04", dbc_bldr, up0());
		}
		protected void del(MCQueryApiBuilder dbc_bldr, MGT_PRE_RATE_TERM_R t) {
			dbc_bldr.buildDelete("MGBGL0130_MGT_PRE_RATE_TERM_D02").executeUpdate(up0());
		}
	}
	/**
	 * Del04オペレーション.<p>
	 *
	 * 一次配賦月次比率を一括で削除する<br>
	 */
	public class Del04 extends MGBGL_PreRateLstReg_MC_A.Del04 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			callThisChk06();
			throwDelErr();
			MGT_PRE_RATE_MLY_R t = MGT_PRE_RATE_MLY_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			createDbc(dbc_bldr, t);
			lock(dbc_bldr, t);
			del(dbc_bldr, t);
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk06() {
			MGBGL_PreRateLstReg.Chk06 ope = MGBGL_PreRateLstReg.crtChk06();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
			MCRow.copyall(up0(), ope.down0());
		}

		protected void createDbc(MCQueryApiBuilder dbc_bldr, MGT_PRE_RATE_MLY_R t) {
			if (isSame(up1().tgt(), _tgt_PLN)) {
				up0().addStringColumn("sa_typ", MAC_SA_TYP.PLN.value());
			}
			else if (isSame(up1().tgt(), _tgt_ACT)) {
				up0().addStringColumn("sa_typ", MAC_SA_TYP.ACT.value());
			}


			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());

			dbc_bldr.addWhereWithAnd(t.sa_typ.eq(bind("sa_typ")));
			dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			dbc_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			dbc_bldr.addWhereWithAnd(t.ym.between(bind("ym_fr"), bind("ym_to")));
			dbc_bldr.addWhereWithCutOffAnd(t.pre_alc_rate_cd.like(bind("pre_alc_rate_cd")));

			dbc_bldr.addOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
		}
		protected void lock(MCQueryApiBuilder dbc_bldr, MGT_PRE_RATE_MLY_R t) {
			dbSelectForUpdateNoWaitNoFetch("MGBGL0130_MGT_PRE_RATE_MLY_S04", dbc_bldr, up0());
		}
		protected void del(MCQueryApiBuilder dbc_bldr, MGT_PRE_RATE_MLY_R t) {
			dbc_bldr.buildDelete("MGBGL0130_MGT_PRE_RATE_MLY_D02").executeUpdate(up0());
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * ファイルから取り込んだ一次配賦期間比率を登録する<br>
	 */
	public class Ins01 extends MGBGL_PreRateLstReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			upd01Main(up0(), true);
		}
	}
	/**
	 * Ins02オペレーション.<p>
	 *
	 * ファイルから取り込んだ一次配賦月次比率を登録する<br>
	 */
	public class Ins02 extends MGBGL_PreRateLstReg_MC_A.Ins02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			upd02Main(up0(), up1(), true);
		}
	}
	/**
	 * Ins03オペレーション.<p>
	 *
	 * 一括削除後にファイルから取り込んだ一次配賦期間比率を登録する<br>
	 */
	public class Ins03 extends MGBGL_PreRateLstReg_MC_A.Ins03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisDel03();
			upd01Main(up1(), true);
		}
		
		protected void callThisDel03() {
			MGBGL_PreRateLstReg.Del03 ope = MGBGL_PreRateLstReg.crtDel03();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
		}
	}
	/**
	 * Ins04オペレーション.<p>
	 *
	 * 一括削除後にファイルから取り込んだ一次配賦月次比率を登録する<br>
	 */
	public class Ins04 extends MGBGL_PreRateLstReg_MC_A.Ins04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisDel04();
			upd02Main(up1(), up2(), true);
		}
		
		protected void callThisDel04() {
			MGBGL_PreRateLstReg.Del04 ope = MGBGL_PreRateLstReg.crtDel04();
			MCRow.copyall(ope.up0(), up0());
			MCRow.copyall(ope.up1(), up2());
			ope.exec();
		}
	}

	//////////////////////////////////////////////////////////////////////
	// Upd01/Ins01/Ins03 Common
	protected void upd01Main(MCList<Chk01_RsltR> upL, boolean file_ins_flg) {
		upd01Edit(upL);
		upd01Chk(upL, file_ins_flg);
		if (file_ins_flg) {
			throwUpdErr();
		}
		upd01Reg(upL);
	}

	protected void upd01Edit(MCList<Chk01_RsltR> upL) {
		setPegNo(upL);
	}
	
	protected void upd01Chk(MCList<Chk01_RsltR> upL, boolean file_ins_flg) {
		MGBGL_PreRateLstReg.Chk01 ope = MGBGL_PreRateLstReg.crtChk01();
		ope.up0().setAll(upL);
		ope.up1().file_ins_flg(file_ins_flg);
		ope.exec();
		upL.setAll(ope.down0());
	}
	
	protected void upd01Reg(MCList<Chk01_RsltR> upL) {
		MCList<Chk01_RsltR> notErrL = upL.subList(r -> !r.err_flg());
		if(notErrL.isEmpty()) {
			return;
		}

		MCList<MGT_PRE_RATE_TERM_R> dbcL = MCList.create(MGT_PRE_RATE_TERM_R.class);
		notErrL.forEach(r -> dbcL.add(r.dbc()));
		dbUpdByStatus(dbcL);
	}
	
	// Upd02/Ins02/Ins04 Common
	protected void upd02Main(MCList<Chk02_RsltR> upL, Chk02_TgtR tgtR, boolean file_ins_flg) {
		upd02Edit(upL);
		upd02Chk(upL, tgtR, file_ins_flg);
		if (file_ins_flg) {
			throwUpdErr();
		}
		upd02Reg(upL);
	}

	protected void upd02Edit(MCList<Chk02_RsltR> upL) {
		setPegNo(upL);
	}
	
	protected void upd02Chk(MCList<Chk02_RsltR> upL, Chk02_TgtR tgtR, boolean file_ins_flg) {
		MGBGL_PreRateLstReg.Chk02 ope = MGBGL_PreRateLstReg.crtChk02();
		ope.up0().setAll(upL);
		ope.up1().file_ins_flg(file_ins_flg);
		MCRow.copyall(ope.up2(), tgtR);
		ope.exec();
		upL.setAll(ope.down0());
	}
	
	protected void upd02Reg(MCList<Chk02_RsltR> upL) {
		MCList<Chk02_RsltR> notErrL = upL.subList(r -> !r.err_flg());
		if(notErrL.isEmpty()) {
			return;
		}

		MCList<MGT_PRE_RATE_MLY_R> dbcL = MCList.create(MGT_PRE_RATE_MLY_R.class);
		notErrL.forEach(r -> dbcL.add(r.dbc()));
		dbUpdByStatus(dbcL);
	}
	
	// Chk01/Chk02 Common
	protected void checkPreAlcTyp(MCMessageList msgList, MCList<?> rowList, boolean file_imp_flg, boolean file_ins_flg) {

		for (MCRow r : rowList) {

			boolean atLeastOne_flg = false;
			List<String> atLeastOneCols = new ArrayList<String>();
			List<String> errCols = new ArrayList<String>();
			for(String typ: preAlcTypMap().keySet()){
				String[] values = preAlcTypMap().get(typ);

				//一次配賦パタンの各一次配賦区分が3(対象)以外の場合はエラー
				if(!MAC_PRE_ALC_TYP.isTARGET(r.getStringNE(typ))){
					if(file_imp_flg || file_ins_flg) {
						errCols.add(values[0]);
						if(isSame(typ, MAM_PRE_ALC_PTN_R.$itm_alc_typ)) {
							errCols.add(values[1]);
							errCols.add(values[2]);
							errCols.add(values[3]);
						}
					}
				}
				else {
					atLeastOneCols.add(values[0]);
					if(isSame(typ, MAM_PRE_ALC_PTN_R.$itm_alc_typ)) {
						atLeastOneCols.add(values[1]);
						atLeastOneCols.add(values[2]);
						atLeastOneCols.add(values[3]);
					}
					if (!isNull(r.getStringNE(values[0]))) {
						atLeastOne_flg = true;
					}
				}
			}
			if(!errCols.isEmpty()) {
				msgList.addAll(checkNull(MGBXL0049, r, errCols.toArray(new String[0])));
			}

			if (!atLeastOne_flg && !atLeastOneCols.isEmpty()) {
				msgList.addAll(check(r, atLeastOneCols.toArray(new String[0]), new FXUCL_AtLeastOneValidater()));
			}
		}
	}

	//////////////////////////////////////////////////////////////////////

	//FMCB CUSTOM END
}