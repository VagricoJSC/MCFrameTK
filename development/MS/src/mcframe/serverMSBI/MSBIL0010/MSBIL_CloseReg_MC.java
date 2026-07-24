package mcframe.serverMSBI.MSBIL0010;

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
import mcframe.serverMSBI.MSBIL0010.*;	// このimportはFrameManagerの自動生成で追加されました。

import java.util.Arrays;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.serverFXUC.FXUCL0170.FXUCL_AtLeastOneValidater;
import mcframe.serverFXUC.FXUCL0170.IfValidater;
import mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ApR;
import mcframe.serverMSBI.MSBIL5010.Cl_Chk01_ArR;
import mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR;
import mcframe.serverMSBI.MSBIL5010.MSBIL_ClService;
import static mcframe.serverMSBI.MSBIL5010.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBIL_CloseReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBIL_CloseReg_MC extends MSBIL_CloseReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MSBIL_CloseReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			// 締情報検索
			MST_CLOSE_R dbc = getTgtCl();
			copy(down0(), dbc, createMap_Srch01_Rslt1R_MST_CLOSE_R_2());	
			
			if (getCo().sls_cl_flg()) {
				int cnt = executeQuery(down0(), MSBIL5010_MST_CLOSE_S06(), up0());
				if (cnt == 0) {
					// 締、仮締の場合のみ、結果がないとき値を設定する
					if (isSame(up0().cl_typ(), "0")) {
						down0().sls_cl_flg(true);
					}
				}
			}
			if (getCo().rcv_cl_flg()) {
				int cnt = executeQuery(down0(), MSBIL5010_MST_CLOSE_S07(), up0());
				if (cnt == 0) {
					if (isSame(up0().cl_typ(), "0")) {
						down0().rcv_cl_flg(true);
					}
				}
			}
			if (getCo().purc_cl_flg()) {
				int cnt = executeQuery(down0(), MSBIL5010_MST_CLOSE_S08(), up0());
				if (cnt == 0) {
					if (isSame(up0().cl_typ(), "0")) {
						down0().purc_cl_flg(true);
					}
				}
			}
			if (getCo().pay_cl_flg()) {
				int cnt = executeQuery(down0(), MSBIL5010_MST_CLOSE_S09(), up0());
				if (cnt == 0) {
					if (isSame(up0().cl_typ(), "0") && !getCo().ap_no_use_flg()) {
						down0().pay_cl_flg(true);
					}
				}
			}
			int cnt = executeQuery(down0(), MSBIL5010_MST_CLOSE_S10(), up0());
			if (cnt == 0) {
				if (isSame(up0().cl_typ(), "0")) {
					down0().stk_cl_flg(true);
				}
			}

			MAM_BP_R bp = MAM_BP_R.create("BP");
			MCList<MST_AR_PRE_CLOSE_R> arL = MCList.create(MST_AR_PRE_CLOSE_R.class);
			MST_AR_PRE_CLOSE_R t1 = MST_AR_PRE_CLOSE_R.create("T");
			MCQueryApiBuilder arL_bldr = MCQueryApiBuilder.create(t1);
			arL_bldr.addSelect(bp.bp_nm);
			arL_bldr.setWhere(t1.ym.eq(bind("1")), up0().cl_ym());
			arL_bldr.addLeftOuterJoin(bp, bracket(t1.acst_cd.eq(bp.bp_cd)));
			arL_bldr.addOrderByAsc(t1.acst_cd);
			dbSelect("MSBIL0010_MST_AR_PRE_CLOSE_S01", arL, arL_bldr);
			setAll(down1(), arL, createMap_Srch01_Rslt2R_MST_AR_PRE_CLOSE_R());

			MCList<MST_AP_PRE_CLOSE_R> apL = MCList.create(MST_AP_PRE_CLOSE_R.class);
			MST_AP_PRE_CLOSE_R t2 = MST_AP_PRE_CLOSE_R.create("T");
			MCQueryApiBuilder apL_bldr = MCQueryApiBuilder.create(t2);
			apL_bldr.addSelect(bp.bp_nm);
			apL_bldr.setWhere(t2.ym.eq(bind("1")), up0().cl_ym());
			apL_bldr.addLeftOuterJoin(bp, bracket(t2.asppl_cd.eq(bp.bp_cd)));
			apL_bldr.addOrderByAsc(t2.asppl_cd);
			dbSelect("MSBIL0010_MST_AP_PRE_CLOSE_S01", apL, apL_bldr);
			setAll(down2(), apL, createMap_Srch01_Rslt3R_MST_AP_PRE_CLOSE_R());
		}
		
		protected MST_CLOSE_R getTgtCl(){
			MST_CLOSE_R dbc = MST_CLOSE_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);
			MAM_USR_R arusr = MAM_USR_R.create("ARUSR");
			MAM_USR_R apusr = MAM_USR_R.create("APUSR");
			dbc_bldr.addSelect(dbc.upd_cntr);
			dbc_bldr.addSelect(arusr.usr_nm.as("ar_pre_cl_usr_nm"));
			dbc_bldr.addLeftOuterJoin(arusr, bracket(arusr.usr_cd.eq(dbc.ar_pre_cl_usr_cd)));
			dbc_bldr.addSelect(apusr.usr_nm.as("ap_pre_cl_usr_nm"));
			dbc_bldr.addLeftOuterJoin(apusr, bracket(apusr.usr_cd.eq(dbc.ap_pre_cl_usr_cd)));
			dbSelectKey("MSBIL0010_MST_CLOSE_S01", dbc, dbc_bldr, up0().cl_ym());
			
			return dbc;
		}
		
		protected Map_Srch01_Rslt1R_MST_CLOSE_R2<Srch01_Rslt1R,MST_CLOSE_R> createMap_Srch01_Rslt1R_MST_CLOSE_R_2() {
			return new Map_Srch01_Rslt1R_MST_CLOSE_R2<Srch01_Rslt1R, MST_CLOSE_R>();
		}

		public class Map_Srch01_Rslt1R_MST_CLOSE_R2<D extends Srch01_Rslt1R, S extends MST_CLOSE_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_Rslt1R.$ym, MST_CLOSE_R.$ym);
				addColumnPathMap(Srch01_Rslt1R.$db_ar_pre_cl_flg, MST_CLOSE_R.$ar_pre_cl_flg);
				addColumnPathMap(Srch01_Rslt1R.$ar_pre_cl_tm, MST_CLOSE_R.$ar_pre_cl_tm);
				addColumnPathMap(Srch01_Rslt1R.$ar_pre_cl_usr_cd, MST_CLOSE_R.$ar_pre_cl_usr_cd);
				addColumnPathMap(Srch01_Rslt1R.$db_ap_pre_cl_flg, MST_CLOSE_R.$ap_pre_cl_flg);
				addColumnPathMap(Srch01_Rslt1R.$ap_pre_cl_tm, MST_CLOSE_R.$ap_pre_cl_tm);
				addColumnPathMap(Srch01_Rslt1R.$ap_pre_cl_usr_cd, MST_CLOSE_R.$ap_pre_cl_usr_cd);
				addColumnPathMap(Srch01_Rslt1R.$all_acst_pre_cl_flg, MST_CLOSE_R.$all_acst_pre_cl_flg);
				addColumnPathMap(Srch01_Rslt1R.$all_asppl_pre_cl_flg, MST_CLOSE_R.$all_asppl_pre_cl_flg);
				addColumnPathMap(Srch01_Rslt1R.$upd_cntr, MST_CLOSE_R.$upd_cntr);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				dest.ym(up0().cl_ym());
				dest.ar_pre_cl_usr_nm(src.getStringNE("ar_pre_cl_usr_nm"));
				dest.ap_pre_cl_usr_nm(src.getStringNE("ap_pre_cl_usr_nm"));
				super.valueCopy(dest, src);
			}
		}
		
		protected Map_Srch01_Rslt2R_MST_AR_PRE_CLOSE_R<Srch01_Rslt2R,MST_AR_PRE_CLOSE_R> createMap_Srch01_Rslt2R_MST_AR_PRE_CLOSE_R() {
			return new Map_Srch01_Rslt2R_MST_AR_PRE_CLOSE_R<Srch01_Rslt2R, MST_AR_PRE_CLOSE_R>();
		}

		public class Map_Srch01_Rslt2R_MST_AR_PRE_CLOSE_R<D extends Srch01_Rslt2R, S extends MST_AR_PRE_CLOSE_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_Rslt2R.$acst_cd, MST_AR_PRE_CLOSE_R.$acst_cd);
				addColumnPathMap(Srch01_Rslt2R.$pre_cl_tm, MST_AR_PRE_CLOSE_R.$pre_cl_tm);
				addColumnPathMap(Srch01_Rslt2R.$ins_usr_id, MST_AR_PRE_CLOSE_R.$ins_usr_id);
				addColumnPathMap(Srch01_Rslt2R.$ins_usr_nm, MST_AR_PRE_CLOSE_R.$ins_usr_nm);
				addColumnPathMap(Srch01_Rslt2R.$ins_func_id, MST_AR_PRE_CLOSE_R.$ins_func_id);
				addColumnPathMap(Srch01_Rslt2R.$ins_ts, MST_AR_PRE_CLOSE_R.$ins_ts);
				addColumnPathMap(Srch01_Rslt2R.$upd_usr_id, MST_AR_PRE_CLOSE_R.$upd_usr_id);
				addColumnPathMap(Srch01_Rslt2R.$upd_usr_nm, MST_AR_PRE_CLOSE_R.$upd_usr_nm);
				addColumnPathMap(Srch01_Rslt2R.$upd_func_id, MST_AR_PRE_CLOSE_R.$upd_func_id);
				addColumnPathMap(Srch01_Rslt2R.$upd_ts, MST_AR_PRE_CLOSE_R.$upd_ts);
				addColumnPathMap(Srch01_Rslt2R.$upd_srv_req_no, MST_AR_PRE_CLOSE_R.$upd_srv_req_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.acst_nm(src.getStringNE("bp_nm"));
			}
		}
		
		protected Map_Srch01_Rslt3R_MST_AP_PRE_CLOSE_R<Srch01_Rslt3R,MST_AP_PRE_CLOSE_R> createMap_Srch01_Rslt3R_MST_AP_PRE_CLOSE_R() {
			return new Map_Srch01_Rslt3R_MST_AP_PRE_CLOSE_R<Srch01_Rslt3R, MST_AP_PRE_CLOSE_R>();
		}

		public class Map_Srch01_Rslt3R_MST_AP_PRE_CLOSE_R<D extends Srch01_Rslt3R, S extends MST_AP_PRE_CLOSE_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_Rslt3R.$asppl_cd, MST_AP_PRE_CLOSE_R.$asppl_cd);
				addColumnPathMap(Srch01_Rslt3R.$pre_cl_tm, MST_AP_PRE_CLOSE_R.$pre_cl_tm);
				addColumnPathMap(Srch01_Rslt3R.$ins_usr_id, MST_AP_PRE_CLOSE_R.$ins_usr_id);
				addColumnPathMap(Srch01_Rslt3R.$ins_usr_nm, MST_AP_PRE_CLOSE_R.$ins_usr_nm);
				addColumnPathMap(Srch01_Rslt3R.$ins_func_id, MST_AP_PRE_CLOSE_R.$ins_func_id);
				addColumnPathMap(Srch01_Rslt3R.$ins_ts, MST_AP_PRE_CLOSE_R.$ins_ts);
				addColumnPathMap(Srch01_Rslt3R.$upd_usr_id, MST_AP_PRE_CLOSE_R.$upd_usr_id);
				addColumnPathMap(Srch01_Rslt3R.$upd_usr_nm, MST_AP_PRE_CLOSE_R.$upd_usr_nm);
				addColumnPathMap(Srch01_Rslt3R.$upd_func_id, MST_AP_PRE_CLOSE_R.$upd_func_id);
				addColumnPathMap(Srch01_Rslt3R.$upd_ts, MST_AP_PRE_CLOSE_R.$upd_ts);
				addColumnPathMap(Srch01_Rslt3R.$upd_srv_req_no, MST_AP_PRE_CLOSE_R.$upd_srv_req_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.asppl_nm(src.getStringNE("bp_nm"));
			}
		}
		
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 */
	public class Chk01 extends MSBIL_CloseReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				callClChkSrv();
			}
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL =  super.doServerCheckBase();
			
			//　締処理情報のロック、更新カウンタチェック
			msgL.addAll(chkCl());
			
			return msgL;
		}
		
		/**
		 * 締処理提供サービスのチェック処理を呼出す
		 */
		protected void callClChkSrv() {
			MSBIL_ClService.Cl_Chk01 ope = MSBIL_ClService.crtCl_Chk01();
			copy(ope.up0(), up0(), createMap_Cl_Chk01_HdrR_Chk01_HdrR());
			if (up0().pre_cl_flg() || up0().rel_pre_cl_flg()) {
				setAll(ope.up1(), up1(), createMap_Cl_Chk01_ArR_Chk01_Dtl1R());
				setAll(ope.up2(), up2(), createMap_Cl_Chk01_ApR_Chk01_Dtl2R());
			}
			ope.exec();
		}
		
		/**
		 * 締処理情報のロック・排他処理を実行する
		 * @return
		 */
		protected MCMessageList chkCl() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<Chk01_HdrR> subL = getChkList(up0());
			if (subL.isEmpty()) {
				return msgL;
			}
			
			// 締処理情報をロックする
			MCList<MST_CLOSE_R> selectL = MCList.create(MST_CLOSE_R.class);
			MST_CLOSE_R t = MST_CLOSE_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.ym, t.upd_cntr);
			selectL_bldr.setOrderByAsc(t.ym);
			dbSelectForUpdateNoWait("MSBIL0010_MST_CLOSE_S02", selectL, selectL_bldr);
			
			// 締処理情報が存在した場合、排他処理チェックを実行
			if (!selectL.isEmpty()) {
				MCIndexKey idxkey = selectL.createIndex(MST_CLOSE_R.$ym);
				for (Chk01_HdrR r : subL) {
					MST_CLOSE_R selectR = selectL.getFirst(idxkey, r.ym());
					if (!isNull(selectR) && isNull(r.upd_cntr())) {
						r.upd_cntr(-1);
					}
					if (!isNull(selectR) || !isNull(r.upd_cntr())) {
						msgL.addAll(checkUpdCntrNE(r, Chk01_HdrR.$upd_cntr, selectR));
					}
				}
			}
			
			return msgL;
			
		}
		
		@Override
		protected IfValidater getAtLeastOneValidater(String[] cols) {
			// 実装仕様書で「AT_LEAST_ONE」を指定している同一グループの項目全てを指定する
			if (Arrays.asList(cols).contains(Chk01_HdrR.$sls_cl_flg) &&
					Arrays.asList(cols).contains(Chk01_HdrR.$rcv_cl_flg) &&
					Arrays.asList(cols).contains(Chk01_HdrR.$purc_cl_flg) &&
					Arrays.asList(cols).contains(Chk01_HdrR.$pay_cl_flg) &&
					Arrays.asList(cols).contains(Chk01_HdrR.$stk_cl_flg)) {
				// 本締、本締解除処理の場合、売上・入金・仕入・支払・在庫のいずれかのFLGがオンのときチェックをする
				return new FXUCL_AtLeastOneValidater(
						filter -> (filter.getBoolean(Chk01_HdrR.$cl_flg) || 
								filter.getBoolean(Chk01_HdrR.$rel_cl_flg)));
			}
			if (Arrays.asList(cols).contains(Chk01_HdrR.$ar_pre_cl_flg) &&
					Arrays.asList(cols).contains(Chk01_HdrR.$ap_pre_cl_flg)) {
				// 仮締、仮締解除処理の場合、売掛仮締・買掛仮締のいずれかのFLGがオンのときチェックをする
				return new FXUCL_AtLeastOneValidater(
						filter -> (filter.getBoolean(Chk01_HdrR.$pre_cl_flg) || 
								filter.getBoolean(Chk01_HdrR.$rel_pre_cl_flg)));
			}
			return super.getAtLeastOneValidater(cols);
		}
		
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 仮締処理を実行する<br>
	 */
	public class Upd01 extends MSBIL_CloseReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
			setDown();
		}

		@Override
		protected void doIt() {
			// 上り電文の編集
			editUp();
			
			// 仮締対象と仮締解除対象に分割する
			MCList<Chk01_Dtl1R> arInsL = up1().subList(Status.CREATE);
			
			MCList<Chk01_Dtl2R> apInsL = up2().subList(Status.CREATE);
			
			// 本画面のチェック処理を実行（ロック、排他、必須チェック）
			callThisChk01ForPreCl(up0(), arInsL, apInsL);
			throwUpdErr();
			
			// 締処理提供サービス（締処理）を呼出す
			callClUpdSrvForPreCl(up0(), arInsL, apInsL, down0(), down1(), down2());
			
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			up0().pre_cl_flg(true);
			
			// 紐付ＮＯの設定
			setPegNo(Chk01_Dtl1R.$peg_no, up1());
			setPegNo(Chk01_Dtl2R.$peg_no, up2());
		}
		
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
		
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 仮締解除を実行する<br>
	 */
	public class Upd02 extends MSBIL_CloseReg_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			// 上り電文の編集
			editUp();
			
			// 本画面のチェック処理を実行（ロック、排他、必須チェック）
			callThisChk01ForPreCl(up0(), up1(), up2());
			throwUpdErr();
			
			// 締処理提供サービス（締処理）を呼出す
			callClUpdSrvForPreCl(up0(), up1(), up2(), down0(), down1(), down2());
			
			setDown();
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			up0().rel_pre_cl_flg(true);
			
			setPegNo(Chk01_Dtl1R.$peg_no, up1());
			setPegNo(Chk01_Dtl2R.$peg_no, up2());
		}
		
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
		
	}
	/**
	 * Upd03オペレーション.<p>
	 *
	 * 本締処理を実行する
	 */
	public class Upd03 extends MSBIL_CloseReg_MC_A.Upd03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 上り電文の編集
			editUp();
			
			// 本画面のチェック処理を実行（ロック、排他、必須チェック）
			callThisChk01ForCl(up0());
			throwUpdErr();
			
			// 締処理提供サービス（締処理）を呼出す
			callClUpdSrvForCl(up0());
			
			setDown();
			
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			up0().cl_flg(true);
		}
		
		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
		
	}
	/**
	 * Upd04オペレーション.<p>
	 *
	 * 本締解除を実行する
	 */
	public class Upd04 extends MSBIL_CloseReg_MC_A.Upd04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			// 上り電文の編集
			editUp();
			
			// 本画面のチェック処理を実行（ロック、排他、必須チェック）
			callThisChk01ForCl(up0());
			throwUpdErr();
			
			// 締処理提供サービス（締処理）を呼出す
			callClUpdSrvForCl(up0());
			
			setDown();
			
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			up0().rel_cl_flg(true);
		}
		
		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
		
	}
	
	/**
	 * チェック処理を実行する（仮締用）
	 */
	protected void callThisChk01ForPreCl(Chk01_HdrR up0, MCList<Chk01_Dtl1R> up1, MCList<Chk01_Dtl2R> up2) {
		MSBIL_CloseReg.Chk01 ope = MSBIL_CloseReg.crtChk01();
		
		MCRow.copyall(ope.up0(), up0);
		ope.up1().setAll(up1);
		ope.up2().setAll(up2);
		
		ope.exec();
	}
	
	/**
	 * 締処理提供サービス（締処理）を呼出す（仮締用）
	 */
	protected void callClUpdSrvForPreCl(Chk01_HdrR up0, MCList<Chk01_Dtl1R> up1, MCList<Chk01_Dtl2R> up2,
			Chk01_HdrR down0, MCList<Chk01_Dtl1R> down1, MCList<Chk01_Dtl2R> down2) {
		MSBIL_ClService.Cl_Upd01 ope = MSBIL_ClService.crtCl_Upd01();
		copy(ope.up0(), up0, createMap_Cl_Chk01_HdrR_Chk01_HdrR());
		setAll(ope.up1(), up1, createMap_Cl_Chk01_ArR_Chk01_Dtl1R());
		setAll(ope.up2(), up2, createMap_Cl_Chk01_ApR_Chk01_Dtl2R());
		
		ope.exec();	
		
		String[] destCols1 = new String[] {Chk01_Dtl1R.$pre_cl_tm};
		String[] srcCols1 = new String[] {Cl_Chk01_ArR.$pre_cl_tm};
		
		String[] destCols2 = new String[] {Chk01_Dtl2R.$pre_cl_tm};
		String[] srcCols2 = new String[] {Cl_Chk01_ApR.$pre_cl_tm};
		
		copy(up0, ope.down0(), createMap_Chk01_HdrR_Cl_Chk01_HdrR());
		copyByPegNo(up1, destCols1, ope.down1(), srcCols1);
		copyByPegNo(up2, destCols2, ope.down2(), srcCols2);
	}
	
	/**
	 * チェック処理を実行する（本締用）
	 */
	protected void callThisChk01ForCl(Chk01_HdrR up0) {
		MSBIL_CloseReg.Chk01 ope = MSBIL_CloseReg.crtChk01();
		
		MCRow.copyall(ope.up0(), up0);
		
		ope.exec();
	}
	
	/**
	 * 締処理提供サービス（締処理）を呼出す（本締用）
	 */
	protected void callClUpdSrvForCl(Chk01_HdrR up0) {
		MSBIL_ClService.Cl_Upd01 ope = MSBIL_ClService.crtCl_Upd01();
		copy(ope.up0(), up0, createMap_Cl_Chk01_HdrR_Chk01_HdrR());
		
		ope.exec();
		
		copy(up0, ope.down0(), createMap_Chk01_HdrR_Cl_Chk01_HdrR());
	}
	
	protected Map_Cl_Chk01_HdrR_Chk01_HdrR<Cl_Chk01_HdrR,Chk01_HdrR> createMap_Cl_Chk01_HdrR_Chk01_HdrR() {
		return new Map_Cl_Chk01_HdrR_Chk01_HdrR<Cl_Chk01_HdrR, Chk01_HdrR>();
	}

	public class Map_Cl_Chk01_HdrR_Chk01_HdrR<D extends Cl_Chk01_HdrR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Cl_Chk01_HdrR.$ym, Chk01_HdrR.$ym);
			addColumnPathMap(Cl_Chk01_HdrR.$cl_flg, Chk01_HdrR.$cl_flg);
			addColumnPathMap(Cl_Chk01_HdrR.$rel_cl_flg, Chk01_HdrR.$rel_cl_flg);
			addColumnPathMap(Cl_Chk01_HdrR.$pre_cl_flg, Chk01_HdrR.$pre_cl_flg);
			addColumnPathMap(Cl_Chk01_HdrR.$rel_pre_cl_flg, Chk01_HdrR.$rel_pre_cl_flg);
			addColumnPathMap(Cl_Chk01_HdrR.$sls_cl_flg, Chk01_HdrR.$sls_cl_flg);
			addColumnPathMap(Cl_Chk01_HdrR.$rcv_cl_flg, Chk01_HdrR.$rcv_cl_flg);
			addColumnPathMap(Cl_Chk01_HdrR.$purc_cl_flg, Chk01_HdrR.$purc_cl_flg);
			addColumnPathMap(Cl_Chk01_HdrR.$pay_cl_flg, Chk01_HdrR.$pay_cl_flg);
			addColumnPathMap(Cl_Chk01_HdrR.$stk_cl_flg, Chk01_HdrR.$stk_cl_flg);
			addColumnPathMap(Cl_Chk01_HdrR.$ar_pre_cl_flg, Chk01_HdrR.$ar_pre_cl_flg);
			addColumnPathMap(Cl_Chk01_HdrR.$ap_pre_cl_flg, Chk01_HdrR.$ap_pre_cl_flg);
			addColumnPathMap(Cl_Chk01_HdrR.$all_acst_pre_cl_flg, Chk01_HdrR.$for_sv_all_acst_pre_cl_flg);
			addColumnPathMap(Cl_Chk01_HdrR.$all_asppl_pre_cl_flg, Chk01_HdrR.$for_sv_all_asppl_pre_cl_flg);

		}
	}
	
	protected Map_Cl_Chk01_ArR_Chk01_Dtl1R<Cl_Chk01_ArR,Chk01_Dtl1R> createMap_Cl_Chk01_ArR_Chk01_Dtl1R() {
		return new Map_Cl_Chk01_ArR_Chk01_Dtl1R<Cl_Chk01_ArR, Chk01_Dtl1R>();
	}

	public class Map_Cl_Chk01_ArR_Chk01_Dtl1R<D extends Cl_Chk01_ArR, S extends Chk01_Dtl1R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Cl_Chk01_ArR.$peg_no, Chk01_Dtl1R.$peg_no);
			addColumnPathMap(Cl_Chk01_ArR.$acst_cd, Chk01_Dtl1R.$acst_cd);
			
		}
	}
	
	protected Map_Cl_Chk01_ApR_Chk01_Dtl2R<Cl_Chk01_ApR,Chk01_Dtl2R> createMap_Cl_Chk01_ApR_Chk01_Dtl2R() {
		return new Map_Cl_Chk01_ApR_Chk01_Dtl2R<Cl_Chk01_ApR, Chk01_Dtl2R>();
	}

	public class Map_Cl_Chk01_ApR_Chk01_Dtl2R<D extends Cl_Chk01_ApR, S extends Chk01_Dtl2R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Cl_Chk01_ApR.$peg_no, Chk01_Dtl2R.$peg_no);
			addColumnPathMap(Cl_Chk01_ApR.$asppl_cd, Chk01_Dtl2R.$asppl_cd);

		}
	}
	
	protected Map_Chk01_HdrR_Cl_Chk01_HdrR<Chk01_HdrR,Cl_Chk01_HdrR> createMap_Chk01_HdrR_Cl_Chk01_HdrR() {
		return new Map_Chk01_HdrR_Cl_Chk01_HdrR<Chk01_HdrR, Cl_Chk01_HdrR>();
	}

	public class Map_Chk01_HdrR_Cl_Chk01_HdrR<D extends Chk01_HdrR, S extends Cl_Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Chk01_HdrR.$sls_cl_ym, Cl_Chk01_HdrR.$sls_cl_ym);
			addColumnPathMap(Chk01_HdrR.$rcv_cl_ym, Cl_Chk01_HdrR.$rcv_cl_ym);
			addColumnPathMap(Chk01_HdrR.$purc_cl_ym, Cl_Chk01_HdrR.$purc_cl_ym);
			addColumnPathMap(Chk01_HdrR.$pay_cl_ym, Cl_Chk01_HdrR.$pay_cl_ym);
			addColumnPathMap(Chk01_HdrR.$stk_cl_ym, Cl_Chk01_HdrR.$stk_cl_ym);
			addColumnPathMap(Chk01_HdrR.$sls_cl_tm, Cl_Chk01_HdrR.$sls_cl_tm);
			addColumnPathMap(Chk01_HdrR.$rcv_cl_tm, Cl_Chk01_HdrR.$rcv_cl_tm);
			addColumnPathMap(Chk01_HdrR.$purc_cl_tm, Cl_Chk01_HdrR.$purc_cl_tm);
			addColumnPathMap(Chk01_HdrR.$pay_cl_tm, Cl_Chk01_HdrR.$pay_cl_tm);
			addColumnPathMap(Chk01_HdrR.$stk_cl_tm, Cl_Chk01_HdrR.$stk_cl_tm);
			addColumnPathMap(Chk01_HdrR.$ar_pre_cl_tm, Cl_Chk01_HdrR.$ar_pre_cl_tm);
			addColumnPathMap(Chk01_HdrR.$ap_pre_cl_tm, Cl_Chk01_HdrR.$ap_pre_cl_tm);
			addColumnPathMap(Chk01_HdrR.$sls_cl_usr_cd,Cl_Chk01_HdrR.$sls_cl_usr_cd);
			addColumnPathMap(Chk01_HdrR.$sls_cl_usr_nm,Cl_Chk01_HdrR.$sls_cl_usr_nm);
			addColumnPathMap(Chk01_HdrR.$rcv_cl_usr_cd,Cl_Chk01_HdrR.$rcv_cl_usr_cd);
			addColumnPathMap(Chk01_HdrR.$rcv_cl_usr_nm,Cl_Chk01_HdrR.$rcv_cl_usr_nm);
			addColumnPathMap(Chk01_HdrR.$purc_cl_usr_cd,Cl_Chk01_HdrR.$purc_cl_usr_cd);
			addColumnPathMap(Chk01_HdrR.$purc_cl_usr_nm,Cl_Chk01_HdrR.$purc_cl_usr_nm);
			addColumnPathMap(Chk01_HdrR.$pay_cl_usr_cd,Cl_Chk01_HdrR.$pay_cl_usr_cd);
			addColumnPathMap(Chk01_HdrR.$pay_cl_usr_nm,Cl_Chk01_HdrR.$pay_cl_usr_nm);
			addColumnPathMap(Chk01_HdrR.$stk_cl_usr_cd,Cl_Chk01_HdrR.$stk_cl_usr_cd);
			addColumnPathMap(Chk01_HdrR.$stk_cl_usr_nm,Cl_Chk01_HdrR.$stk_cl_usr_nm);
			addColumnPathMap(Chk01_HdrR.$ar_pre_cl_usr_cd, Cl_Chk01_HdrR.$ar_pre_cl_usr_cd);
			addColumnPathMap(Chk01_HdrR.$ar_pre_cl_usr_nm, Cl_Chk01_HdrR.$ar_pre_cl_usr_nm);
			addColumnPathMap(Chk01_HdrR.$ap_pre_cl_usr_cd, Cl_Chk01_HdrR.$ap_pre_cl_usr_cd);
			addColumnPathMap(Chk01_HdrR.$ap_pre_cl_usr_nm, Cl_Chk01_HdrR.$ap_pre_cl_usr_nm);
			
		}
	}

	//FMCB CUSTOM END
}