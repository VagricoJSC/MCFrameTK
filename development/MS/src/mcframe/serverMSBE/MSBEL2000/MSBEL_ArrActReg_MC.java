package mcframe.serverMSBE.MSBEL2000;

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
import mcframe.serverMSBE.MSBEL2000.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5930.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSUC.MSUCL0110.MSUCL_StrLnUtil;
import mcframe.serverMSUC.MSUCL0110.StrLnUtil_Srch01_CndR;

import static mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil_FW.isNull;
import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;

import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeTodayValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.commonCore.param.MCParam;
import java.util.*;
import mcframe.commonMAUA.MAUAC0010.MAUAC_List;
import static mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ArrActReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ArrActReg_MC extends MSBEL_ArrActReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 入荷予定を検索する。<br>
	 */
	public class Srch01 extends MSBEL_ArrActReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			doSrchArrSchd();
		}
		/**
		 * 入荷予定を検索する
		 */
		protected void doSrchArrSchd() {
			MSBEL_ArrActService.ArrAct_Srch01 o = MSBEL_ArrActService.crtArrAct_Srch01();
			// 支給品着荷一覧登録からの検索
			if(up0().prov_arrv_req_flg()) {
				// 固定で指定する検索条件
				up0().outsrc_loc_flg(true);
				up0().prnt_yet_flg(true);
				up0().prnt_done_flg(true);
				up0().prov_slip_prnt_yet_flg(true);
				up0().prov_slip_prnt_done_flg(true);
			}
			MCRow.copyall(o.up0(), up0());
			o.exec();
			down0().setAll(o.down0());
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 入荷実績を検索する。<br>
	 */
	public class Srch02 extends MSBEL_ArrActReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			doSrchArrAct();
		}
		/**
		 * 入荷実績を検索する
		 */
		protected void doSrchArrAct() {
			MSBEL_ArrActService.ArrAct_Srch02 o = MSBEL_ArrActService.crtArrAct_Srch02();
			// 支給品着荷一覧登録からの検索
			if(up0().prov_arrv_req_flg()) {
				// 固定で指定する検索条件
				up0().outsrc_loc_flg(true);
				up0().prnt_yet_flg(true);
				up0().prnt_done_flg(true);
				up0().prov_slip_prnt_yet_flg(true);
				up0().prov_slip_prnt_done_flg(true);
			}
			MCRow.copyall(o.up0(), up0());
			o.exec();
			down0().setAll(o.down0());
		}
	}

	/**
	 * Srch03オペレーション.<p>
	 *
	 * 入荷予定および入荷実績を検索する。<br>
	 */
	public class Srch03 extends MSBEL_ArrActReg_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			doSrchArrSchdAndAct();
		}
		/**
		 * 入荷予定および実績を検索する
		 */
		protected void doSrchArrSchdAndAct() {
			MSBEL_ArrActService.ArrAct_Srch03 o = MSBEL_ArrActService.crtArrAct_Srch03();
			// 支給品着荷一覧登録からの検索
			if(up0().prov_arrv_req_flg()) {
				// 固定で指定する検索条件
				up0().outsrc_loc_flg(true);
				up0().prnt_yet_flg(true);
				up0().prnt_done_flg(true);
				up0().prov_slip_prnt_yet_flg(true);
				up0().prov_slip_prnt_done_flg(true);
			}
			MCRow.copyall(o.up0(), up0());
			o.exec();
			down0().setAll(o.down0());
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 入荷予定に対して、または計画外の入荷実績を計上する。<br>
	 */
	public class Ins01 extends MSBEL_ArrActReg_MC_A.Ins01 {
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

			// 初期処理
			editUp();
			replaceParam();
			// チェック処理
			callThisChk01();

			// メイン処理
			callArrActSrv();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			up0().setStatus(MCRow.Status.CREATE);
			up0().forEach(r -> r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value()));
			setPegNo(up0());
			up0().setBoolean("edi_flg", false);
			up0().setString("edi_bp_dlv_slip_no", null);
			up0().setString("edi_bp_dlv_slip_d_no", null);
		}

		/**
		 * 登録前チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBEL_ArrActReg.Chk01 o = MSBEL_ArrActReg.crtChk01();
			o.up0().setAll(up0());
			o.up1().prov_arrv_req_flg(up1().prov_arrv_req_flg());
			o.exec();
			up0().setAll(o.down0());
			// メッセージ編集
			MCMessageList msgL = MCMessagePool.getMessageList();
			MCMessageList addmsgl = new MCMessageList();
			MCMessageList removemsgl = new MCMessageList();
			for (MCMessage msg : msgL) {
				if (!isSame(msg.getID(), MSBDL0030)) {
					continue;
				}
				MCRow causerow = msg.getCauseRow();
				addmsgl.add(new MCMessage(causerow, null,
						MSBEL1053, msg.getBind(1), toDispGUIIndex(causerow)));
				removemsgl.add(msg);
			}
			msgL.removeAll(removemsgl);
			msgL.addAll(addmsgl);
		}

		/**
		 * 入荷実績SVを呼び出す
		 */
		protected void callArrActSrv() {
			// エラー行は除く
			up_AA(v0_up0, up0().subList(r -> !r.err_flg()));
			if (v0_up0.isEmpty()) {
				return;
			}
			v0.up0().outsrc_act_flg(true);
			v0.up0().purc_act_flg(true);
			v0.up0().sls_act_flg(true);
			v0.up0().io_act_flg(true);
			v0.exec();

			// 下り電文を設定
			MCIndexKey idx = v0.down0().createIndex("peg_no");
			for (Chk01_RsltR r : up0()) {
				ArrAct_DtlR row = v0.down0().getFirst(idx, r.peg_no());
				if (!isNull(row)) {
					copy(r, row, createMap_down_AA_v0_0());
				}
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
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_RsltR>> list = splitUp(up0(), up1(), getSplitRowCount());
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = ((MCList<Chk01_RsltR>)ope.up(0));  
				up0L.setAll(l);
				MCRow.copyall((MCRow)ope.up(1), up1());
				opeL.add(ope);
			}
			return opeL;
		}
		protected void replaceParam() {
			for (Chk01_RsltR r : up0()) {
				if (isNull(r.arr_schd_no())) {
					r.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				}
			}
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 入荷実績を訂正する。<br>
	 */
	public class Upd01 extends MSBEL_ArrActReg_MC_A.Upd01 {
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

			// 初期処理
			editUp();

			// チェック処理
			callThisChk01();

			// メイン処理
			callArrActSrv();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			up0().forEach(r -> {
				if (r.isStatusDelete()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else if (r.isStatusCreate()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				if (!MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ())) {
					// 通常管理の場合、仕入実績受払NOは上らせない
					// (仕入実績受払NOの有無で未着かを判定している箇所があるので)
					r.purc_act_io_no(null);
				}
			});
			setPegNo(up0());
		}

		/**
		 * 更新前チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBEL_ArrActReg.Chk01 o = MSBEL_ArrActReg.crtChk01();
			o.up0().setAll(up0());
			o.up1().prov_arrv_req_flg(up1().prov_arrv_req_flg());
			o.exec();
			up0().setAll(o.down0());
		}

		/**
		 * 入荷実績SVを呼び出す
		 */
		protected void callArrActSrv() {
			// エラー行は除く
			up_AA(v0_up0, up0().subList(r -> !r.err_flg()));
			if (v0_up0.isEmpty()) {
				return;
			}
			v0.up0().outsrc_act_flg(true);
			v0.up0().purc_act_flg(true);
			v0.up0().sls_act_flg(true);
			v0.up0().io_act_flg(true);
			v0.exec();

			// 下り電文を設定
			MCIndexKey idx = v0.down0().createIndex("peg_no");
			for (Chk01_RsltR r : up0()) {
				ArrAct_DtlR row = v0.down0().getFirst(idx, r.peg_no());
				if (!isNull(row)) {
					copy(r, row, createMap_down_AA_v0_0());
				}
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
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_RsltR>> list = splitUp(up0(), up1(), getSplitRowCount());
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = ((MCList<Chk01_RsltR>)ope.up(0));  
				up0L.setAll(l);
				MCRow.copyall((MCRow)ope.up(1), up1());
				opeL.add(ope);
			}
			return opeL;
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 入荷実績を訂正する。<br>
	 */
	public class Del01 extends MSBEL_ArrActReg_MC_A.Del01 {
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

			// 初期処理
			editUp();

			// チェック処理
			callThisChk02();

			// メイン処理
			callArrActSrv();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			up0().forEach(r -> r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value()));
			up0().forEach(r -> r.setStatus(MCRow.Status.DELETE));
			setPegNo(up0());
		}

		/**
		 * 削除前チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBEL_ArrActReg.Chk02 o = MSBEL_ArrActReg.crtChk02();
			o.up0().setAll(up0());
			o.up1().prov_arrv_req_flg(up1().prov_arrv_req_flg());
			o.exec();
			up0().setAll(o.down0());
		}

		/**
		 * 入荷実績SVを呼び出す
		 */
		protected void callArrActSrv() {
			// エラー行は除く
			up_AA(v0_up0, up0().subList(r -> !r.err_flg()));
			if (v0_up0.isEmpty()) {
				return;
			}
			v0.up0().outsrc_act_flg(true);
			v0.up0().purc_act_flg(true);
			v0.up0().sls_act_flg(true);
			v0.up0().io_act_flg(true);
			v0.exec();

			MCIndexKey idx = v0.down0().createIndex("peg_no");
			for (Chk01_RsltR r : up0()) {
				ArrAct_DtlR row = v0.down0().getFirst(idx, r.peg_no());
				if (!isNull(row)) {
					copy(r, row, createMap_down_AA_v0_0());
				}
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
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_RsltR>> list = splitUp(up0(), up1(), getSplitRowCount());
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = ((MCList<Chk01_RsltR>)ope.up(0));  
				up0L.setAll(l);
				MCRow.copyall((MCRow)ope.up(1), up1());
				opeL.add(ope);
			}
			return opeL;
		}
	}

	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだ入荷実績のチェック処理を行う<br>
	 */
	public class Imp01 extends MSBEL_ArrActReg_MC_A.Imp01 {
		/** 場所マスタキャッシュ */
		protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLoc = null;
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			replaceParam();
			callThisChk01();
			setDown();
		}

		protected void editUp() {
			up0().forEach(r -> r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value()));
			if(up1().prov_arrv_req_flg()) {
				up0().setValueNE(Chk01_RsltR.$prov_typ, MAC_PROV_TYP.FFR_PROV.value());
			}
			setPegNo(Chk01_RsltR.$peg_no, up0());
			createCache();
			complLoc();
			setDefStrLnCd();
		}

		/**
		 * キャッシュ作成
		 */
		protected void createCache() {
			createLocCache();
		}

		protected void complLoc() {
			for (Chk01_RsltR r : up0()) {
				MAM_LOC_R locR = getCacheLoc(r.arr_loc_cd());
				if (!isNull(locR)) {
					r.arr_str_ln_tgt_flg(locR.str_ln_tgt_flg());
				}
			}
		}

		/**
		 * 標準の棚・ラインCDを設定します。
		 */
		protected void setDefStrLnCd() {
			MSUCL_StrLnUtil.StrLnUtil_Srch01 ope = MSUCL_StrLnUtil.crtStrLnUtil_Srch01();
			for (Chk01_RsltR r : up0()) {
				if (!r.arr_str_ln_tgt_flg() || isNull(r.itm_cd()) || isNull(r.arr_loc_cd())) {
					continue;
				}
				StrLnUtil_Srch01_CndR cndR = StrLnUtil_Srch01_CndR.create();
				cndR.peg_no(r.peg_no());
				cndR.itm_cd(r.itm_cd());
				cndR.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
				cndR.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
				cndR.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
				cndR.loc_cd(r.arr_loc_cd());
				ope.up0().add(cndR);
			}
			ope.exec();
			MCIndexKey idxkey = ope.down0().createIndex(StrLnUtil_Srch01_CndR.$peg_no);
			for (Chk01_RsltR r : up0()) {
				StrLnUtil_Srch01_CndR downR = ope.down0().getFirst(idxkey, r.peg_no());
				if (!r.arr_str_ln_tgt_flg()) {
					r.arr_str_ln_cd_none_flg(false);
				}
				else if (!isNull(r.arr_str_ln_cd())) {
					r.arr_str_ln_cd_none_flg(false);
				}
				else if (!isNull(downR) && !isNullOrNullVal(downR.str_ln_cd())) {
					if (!r.arr_str_ln_cd_none_flg()) {
						r.arr_str_ln_cd(downR.str_ln_cd());
					}
				}
				else {
					r.arr_str_ln_cd_none_flg(false);
				}
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBEL_ArrActReg.Chk01 ope = MSBEL_ArrActReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().prov_arrv_req_flg(up1().prov_arrv_req_flg());
			ope.up1().file_imp_flg(true);
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void setDown() {
			down0().setAll(up0());
			down0().forEach(r -> {
				r.arr_dt(r.arr_tm());
				r.arr_hm(r.arr_tm());
			});
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_RsltR>> list = splitUp(up0(), up1(), getSplitRowCount());
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = ((MCList<Chk01_RsltR>)ope.up(0));  
				up0L.setAll(l);
				MCRow.copyall((MCRow)ope.up(1), up1());
				opeL.add(ope);
			}
			return opeL;
		}

		protected void createLocCache() {
			_cacheLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(MCQueryApiBuilder.create(MAM_LOC_R.create("T")), up0(), Chk01_RsltR.$arr_loc_cd);
		}

		protected MAM_LOC_R getCacheLoc(String locCd) {
			return _cacheLoc.get(locCd);
		}
		
		protected void replaceParam() {
			for (Chk01_RsltR r : up0()) {
				r.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 入荷実績を登録・訂正するために、チェックを行う<br>
	 */
	public class Chk01 extends MSBEL_ArrActReg_MC_A.Chk01 {
		/**
		 * 訂正前の場所
		 */
		protected final String ORG_LOC_CD = "_org_loc_cd";
		/**
		 * 訂正前の物流場所
		 */
		protected final String ORG_LG_GRP_CD = "_org_lg_grp_cd";
	
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			// 入荷実績チェック処理
			callArrActChkSrv();
			setErrToRtnStsTyp();
			setDown();
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			// 条件付リストロジックチェックの処理
			ListLogicBind arrLocCdBind = getListLogicBind(up0(), Chk01_RsltR.$arr_loc_cd);
			if(!up1().prov_arrv_req_flg()) {
				arrLocCdBind.putBind(MAUAC_List.LocCols.$i_loc_is_srch_typ, (Comparable<?>)MAC_LOC_IS_SRCH_TYP.HOUSE.value());
			}
			else {
				arrLocCdBind.putBind(MAUAC_List.LocCols.$i_loc_is_srch_typ, (Comparable<?>)MAC_LOC_IS_SRCH_TYP.OUTSIDE.value());
			}
		}

		@Override
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row, String column) {
			if (row instanceof Chk01_RsltR) {

				Chk01_RsltR r = (Chk01_RsltR)row;

				if (isSame(column, Chk01_RsltR.$sno1_mng_typ)
					|| isSame(column, Chk01_RsltR.$sno2_mng_typ)
					|| isSame(column, Chk01_RsltR.$sno3_mng_typ)
					|| isSame(column, Chk01_RsltR.$sno4_mng_typ)
					|| isSame(column, Chk01_RsltR.$stk_mng_typ)) {

					// 未着管理の場合は仕入実績明細、計画外の入荷済の場合は入荷実績の値を使用する
					if (!isNull(r.arr_schd_no()) && !isNull(r.purc_act_io_no())
						|| isNull(r.arr_schd_no()) && !isNull(r.arr_act_no())) {
						return false;
					}
				}
				if (isSame(column, Chk01_RsltR.$sundry_itm_flg)) {
					if (!isNull(r.arr_schd_no()) || !isNull(r.arr_act_no())) {
						return false;
					}
				}
				if (isSame(column, Chk01_RsltR.$itm_nm)) {
					if (row.getBoolean(Chk01_RsltR.$sundry_itm_flg)) {
						return false;
					}
				}
			}
			return super.isSetListLogicValue(paramIndex, row, column);
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 更新カウンタチェック
			msgL.addAll(chkUpdCntrArrPr());
			msgL.addAll(chkUpdCntrArrAct());
			msgL.addAll(chkUpdCntrRcptIv());

			MCList<Chk01_RsltR>
				noErrL = getChkList(up0()),
				unPlndL = MCList.create(Chk01_RsltR.class),
				nrmlL = MCList.create(Chk01_RsltR.class),
				nYetL = MCList.create(Chk01_RsltR.class);
			noErrL.forEach(r -> {
				if (isNull(r.arr_schd_no())) {
					// 計画外は更新のみ対象
					if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
						unPlndL.add(r);
					}
				}
				else if (isNull(r.purc_act_io_no())) {
					// 通常管理
					nrmlL.add(r);
				}
				else {
					// 未着管理
					nYetL.add(r);
				}
			});
			// 予定あり・通常管理
			if (!nrmlL.isEmpty()) {
				// 入荷予定からデータを補完する
				msgL.addAll(cmpleByArrSchdNrml(nrmlL));
			}
			// 予定あり・未着管理
			if (!nYetL.isEmpty()) {
				msgL.addAll(cmpleByArrSchdNYet(nYetL));
			}
			// 予定なし
			if (!unPlndL.isEmpty()) {
				msgL.addAll(cmpleByArrAct(unPlndL));
			}

			// 部門の組織変更対応
			cmpleDpt(noErrL);

			return msgL;
		}

		@Override
		protected MCMessageList updCntChkReq() {
			MCMessageList msgL = super.updCntChkReq();
			MCList<Chk01_RsltR> actL = up0().subList(r -> !MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()));
			msgL.addAll(check(actL, Chk01_RsltR.$arr_act_no, new FXUCL_RequiredValidater()));
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_RsltR>
				upL = getChkList(up0().subList(MCRow.Status.CREATE, MCRow.Status.MODIFY));

			// 定型チェック後の補完
			crrctDataAfterDoServerChk(upL);

			// 条件付必須チェック
			msgL.addAll(chkReq(upL));

			// 条件付妥当性チェック
			msgL.addAll(chkValid(upL));

			// 有効桁数チェック
			msgL.addAll(chkDecPlace(upL));

			// DACチェック
			msgL.addAll(chkArrLocDac(upL));

			return msgL;
		}

		/**
		 * doServerChk（リストロジックによるチェックなど）実行後に行うべきデータの補正
		 */
		protected void crrctDataAfterDoServerChk(MCList<Chk01_RsltR> notErrL) {
			for (Chk01_RsltR r : notErrL) {
				// リストロジックによって補完する項目を元に条件分岐するので、リストロジック実行後に補完している
				// ロット作成
				if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()) && r.cststk_flg()) {
					r.crt_lot_flg(false);
				}
				// ロットＮＯ
				if (!MAC_LOT_MNG_TYP.req_lot(r.lot_mng_typ())) {
					r.lot_no(MAC_STR.NULL_VAL.value());
					r.crt_lot_flg(false);
				}
				else {
					r.lot_no(nullValToNull(r.lot_no()));
					if (MSC_PURC_UNFIX_STR.isUNFIXED(r.lot_no())) {
						r.lot_no(null);
					}
				}
				// サブロットＮＯ
				if (!MAC_SUBLOT_MNG_TYP.req_lot(r.sublot_mng_typ())) {
					r.sublot_no(MAC_STR.NULL_VAL.value());
				}
				else {
					r.sublot_no(nullValToNull(r.sublot_no()));
				}
				// 手配ＮＯ１
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ())) {
					r.sno1(MAC_STR.NULL_VAL.value());
				}
				else if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno1_mng_typ())) {
					r.sno1(nvl(r.sno1(), MAC_STR.NULL_VAL.value()));
				}
				else {
					r.sno1(nullValToNull(r.sno1()));
				}
				// 手配ＮＯ２
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ())) {
					r.sno2(MAC_STR.NULL_VAL.value());
				}
				else if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno2_mng_typ())) {
					r.sno2(nvl(r.sno2(), MAC_STR.NULL_VAL.value()));
				}
				else {
					r.sno2(nullValToNull(r.sno2()));
				}
				// 手配ＮＯ３
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ())) {
					r.sno3(MAC_STR.NULL_VAL.value());
				}
				else if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno3_mng_typ())) {
					r.sno3(nvl(r.sno3(), MAC_STR.NULL_VAL.value()));
				}
				else {
					r.sno3(nullValToNull(r.sno3()));
				}
				// 手配ＮＯ４
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ())) {
					r.sno4(MAC_STR.NULL_VAL.value());
				}
				else if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno4_mng_typ())) {
					r.sno4(nvl(r.sno4(), MAC_STR.NULL_VAL.value()));
				}
				else {
					r.sno4(nullValToNull(r.sno4()));
				}
				// 棚・ラインＣＤ
				r.arr_str_ln_cd(nvl(r.arr_str_ln_cd(), MAC_STR.NULL_VAL.value()));

				if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ()) && isNull(r.ret_dlv_slip_d_no())) {
					// 返品元場所は貸出返品のみ有効
					r.ret_str_ln_cd(nvl(r.ret_str_ln_cd(), MAC_STR.NULL_VAL.value()));
					// 返品元格付ＣＤ
					r.ret_gd_cd(nvl(r.ret_gd_cd(), nvl(getSysParm("DEF_STK_GD_CD"), getDefaultFeedStkGd().gd_cd())));
				}
				else {
					r.ret_loc_cd(null);
					r.ret_str_ln_cd(null);
				}
				// 格付ＣＤ
				if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
					r.gd_cd(nvl(r.gd_cd(), nvl(getSysParm("DEF_STK_GD_CD"), getDefaultFeedStkGd().gd_cd())));
				}

				// 在庫管理区分
				cmplStkMngTyp(r);
				// 在庫検査区分
				cmplStkInspTyp(r);
				// 在庫識別区分
				cmplStkIdTyp(r);
				// 在庫取引先
				cmplStkBpCd(r);
				// 在庫着荷先
				cmplStkArrvBpCd(r);
				// 基準単位数量
				cmplBaseUnitQty(r);
				// 仕入有効成分係数
				cmplPurcContFctr(r);
			}
		}

		/**
		 * 入荷進捗に対する更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntrArrPr() {
			MCList<Chk01_RsltR> schdL = up0().subList(r -> !isNull(r.arr_pr_no()));
			schdL.sort(Chk01_RsltR.$arr_pr_no);

			MCList<MST_ARR_PR_R> l = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			l_bldr.setSelect(t.arr_pr_no, t.upd_cntr);
			l_bldr.setOrderByAsc(l_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdateNoWait("MSBEL2000_MST_ARR_PR_S01", l, l_bldr, schdL);
			MCIndexKey idx = l.createIndex(MST_ARR_PR_R.$arr_pr_no);

			MCMessageList msgL = new MCMessageList();
			for (Chk01_RsltR r : schdL) {
				MST_ARR_PR_R lockR = l.getFirst(idx, r.arr_pr_no());
				msgL.addAll(
					checkUpdCntrNE(
						r, Chk01_RsltR.$arr_pr_upd_cntr, lockR));
				setErrFlg(r, msgL);
			}
			return msgL;
		}

		/**
		 * 入荷実績に対する更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntrArrAct() {
			MCList<Chk01_RsltR> actL = up0().subList(r -> !MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()));
			actL.sort(Chk01_RsltR.$arr_act_no);

			MCList<MST_ARR_ACT_R> l = MCList.create(MST_ARR_ACT_R.class);
			MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			l_bldr.setSelect(t.arr_act_no, t.arr_loc_cd, t.lg_grp_cd, t.upd_cntr);
			l_bldr.setWhere(t.arr_act_no.eq(bind("arr_act_no")));
			l_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			l_bldr.setOrderByAsc(l_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdateNoWait("MSBEL2000_MST_ARR_ACT_S01", l, l_bldr, actL);
			MCIndexKey idx = l.createIndex(MST_ARR_ACT_R.$arr_act_no);

			MCMessageList msgL = new MCMessageList();
			for (Chk01_RsltR r : actL) {
				if (!r.err_flg()) {
					MST_ARR_ACT_R lockR = l.getFirst(idx, r.arr_act_no());
					msgL.addAll(
						checkUpdCntrNE(
							r, Chk01_RsltR.$arr_act_upd_cntr, lockR));
					setErrFlg(r, msgL);

					// 訂正前の場所（DACチェックで使用）
					r.setStringNE(ORG_LOC_CD, lockR.arr_loc_cd());
					r.setStringNE(ORG_LG_GRP_CD, lockR.lg_grp_cd());
				}
			}
			return msgL;
		}

		/**
		 * 受領インボイスに対する更新カウンタチェック<br>
		 */
		protected MCMessageList chkUpdCntrRcptIv() {
			// 同時計上時に一緒に計上される仕入諸掛は、仕入諸掛の仕入予定は対応する入荷進捗が存在しないので、
			// 受領インボイス登録画面から仕入諸掛のみを行追加、または行削除された場合に排他制御が漏れてしまうため、
			// 受領インボイスヘッダに対するチェックを行う

			MCList<Chk01_RsltR> actL = up0().subList(r -> !isNull(r.rcpt_iv_mng_no()));
			actL.sort(Chk01_RsltR.$rcpt_iv_mng_no);

			MCList<MST_RCPT_IV_R> l = MCList.create(MST_RCPT_IV_R.class);
			MST_RCPT_IV_R t = MST_RCPT_IV_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			l_bldr.setSelect(t.rcpt_iv_mng_no, t.upd_cntr);
			l_bldr.setOrderByAsc(l_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdateNoWait("MSBEL2000_MST_RCPT_IV_S01", l, l_bldr, actL);
			MCIndexKey idx = l.createIndex(MST_RCPT_IV_R.$rcpt_iv_mng_no);

			MCMessageList msgL = new MCMessageList();
			for (Chk01_RsltR r : actL) {
				if (!r.err_flg()) {
					MST_RCPT_IV_R lockR = l.getFirst(idx, r.rcpt_iv_mng_no());
					msgL.addAll(
						checkUpdCntrNE(
							r, Chk01_RsltR.$rcpt_iv_upd_cntr, lockR));
					setErrFlg(r, msgL);
				}
			}
			return msgL;
		}

		/**
		 * 通常管理の入荷予定の存在チェック、および上り電文のデータを補完する
		 */
		protected MCMessageList cmpleByArrSchdNrml(MCList<Chk01_RsltR> upL) {

			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_RsltR> notErrL = getChkList(upL);
			if (isNull(notErrL)) {
				return msgL;
			}

			MCList<MST_ARR_SCHD_R> arrL = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R t1 = MST_ARR_SCHD_R.create("T1");
			MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
			MCQueryApiBuilder arrL_bldr = MCQueryApiBuilder.create(t1);
			arrL_bldr.setSelectAll();
			arrL_bldr.addSelect(t2.trd_cd, t2.trd_ptn_typ, t2.cst_cd, t2.sppl_cd, t2.ret_dlv_slip_d_no, t2.sret_fr_cd, t2.rsn_cd, t2.bd_dpt_cd);
			arrL_bldr.addInnerJoin(t2, bracket( t2.arr_pr_no.eq(t1.arr_pr_no)));
			dbSelectKey("MSBEL2000_MST_ARR_SCHD_S01", arrL, arrL_bldr, notErrL.groupBy(Chk01_RsltR.$arr_schd_no));
			MCIndexKey arrIdx = arrL.createIndex(MST_ARR_SCHD_R.$arr_schd_no);

			for (Chk01_RsltR r : notErrL) {
				MST_ARR_SCHD_R arrR = arrL.getFirst(arrIdx, r.arr_schd_no());

				// 入荷予定NOがDBに登録されているか
				if (isNull(arrR)) {
					msgL.addAll(getRecordNotFoundMsg("MS", "MST_ARR_SCHD"
							, new String[]{MST_ARR_SCHD_R.$arr_schd_no}
							, new Comparable[]{r.arr_schd_no()}, r));
					continue;
				}
				// 上り電文から取得した入荷予定と、入荷進捗更新カウンタとの妥当性をチェック
				if (!isSame(arrR.arr_pr_no(), r.arr_pr_no())) {
					msgL.addAll(getRecordInvalidMsg(MST_ARR_SCHD_R.$arr_pr_no, r.arr_pr_no(), r));
				}

				// 引継元の入荷予定からデータを補完
				r.trd_cd(arrR.getString("trd_cd"));
				r.trd_ptn_typ(arrR.getString("trd_ptn_typ"));
				r.purc_act_io_no(null);
				r.itm_cd(arrR.itm_cd());
				r.itm_sub1(arrR.itm_sub1());
				r.itm_sub2(arrR.itm_sub2());
				r.itm_sub3(arrR.itm_sub3());
				r.itm_nm(arrR.itm_nm());
				r.rcpt_iv_itm_nm(arrR.rcpt_iv_itm_nm());
				r.sundry_itm_flg(arrR.sundry_itm_flg());
				if (!isCmpleItmNm(r)) {
					r.itm_nm(null);
					r.rcpt_iv_itm_nm(null);
				}
				r.purc_id_typ(arrR.purc_id_typ());
				r.sno1(arrR.sno1());
				r.sno2(arrR.sno2());
				r.sno3(arrR.sno3());
				r.sno4(arrR.sno4());
				r.stk_arrv_bp_cd(arrR.stk_arrv_bp_cd());
				r.stk_id_typ(arrR.stk_id_typ());
				r.stk_insp_typ(arrR.stk_insp_typ());
				r.stk_bp_cd(arrR.stk_bp_cd());
				r.stk_arrv_bp_cd(arrR.stk_arrv_bp_cd());
				r.quality_typ(arrR.quality_typ());

				if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					r.trd_unit_cd(arrR.trd_unit_cd());
					r.gd_cd(arrR.gd_cd());
				}
				r.rqst_dpt_cd(null);	// 計画外のみ更新
				r.rqst_usr_cd(null);	// 計画外のみ更新
				r.sppl_itm_cd(arrR.sppl_itm_cd());
				r.sppl_itm_nm(arrR.sppl_itm_nm());
				r.cst_cd(arrR.getString("cst_cd"));
				r.sppl_cd(arrR.getString("sppl_cd"));
				r.ret_dlv_slip_d_no(arrR.getString("ret_dlv_slip_d_no"));
				r.sret_fr_cd(arrR.getString("sret_fr_cd"));
				r.ret_loc_cd(arrR.ret_loc_cd());
				r.ret_str_ln_cd(arrR.ret_str_ln_cd());
				r.ret_gd_cd(arrR.ret_gd_cd());
				r.maker_cd(arrR.maker_cd());
				if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())	) {
					r.rsn_cd(arrR.getString("rsn_cd"));
					r.bd_dpt_cd(arrR.getString("bd_dpt_cd"));
				}
				r.rcpt_iv_no(arrR.rcpt_iv_no());
				if (!isNull(r.rcpt_iv_mng_no())) {
					r.temp_rcpt_iv_no(null);
				}
				r.iv_no(arrR.iv_no());
				r.io_schd_pr_no(arrR.io_schd_pr_no());
				r.mfg_inst_no(arrR.mfg_inst_no());
				r.pre_outsrc_act_flg(arrR.pre_outsrc_act_flg());
				r.arr_ptn_typ(MSC_ARR_PTN_TYP.NRML.value());
			}
			return msgL;
		}

		/**
		 * 未着管理の入荷予定の存在チェック、および上り電文のデータを補完する
		 */
		protected MCMessageList cmpleByArrSchdNYet(MCList<Chk01_RsltR> upL) {

			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_RsltR> notErrL = getChkList(upL);
			if (isNull(notErrL)) {
				return msgL;
			}

			MCList<MST_PURC_ACT_IO_R> purcL = MCList.create(MST_PURC_ACT_IO_R.class);
			MST_PURC_ACT_IO_R t1 = MST_PURC_ACT_IO_R.create("T1");
			MST_PURC_ACT_D_R t2 = MST_PURC_ACT_D_R.create("T2");
			MST_PURC_ACT_R t3 = MST_PURC_ACT_R.create("T3");
			MST_PURC_SCHD_R t4 = MST_PURC_SCHD_R.create("T4");
			MST_ARR_SCHD_R t5 = MST_ARR_SCHD_R.create("T5");
			MCQueryApiBuilder purcL_bldr = MCQueryApiBuilder.create(t1);
			purcL.addBooleanColumn("sundry_itm_flg");
			purcL.addBooleanColumn("pre_outsrc_act_flg");
			purcL_bldr.setSelect(t1.purc_act_io_no);
			purcL_bldr.addSelect(t3.trd_cd, t3.trd_ptn_typ, t3.sppl_cd,
					t2.itm_cd, t2.itm_sub1, t2.itm_sub2, t2.itm_sub3, t2.itm_nm, t2.iv_itm_nm.as("rcpt_iv_itm_nm"),
					t2.sundry_itm_flg, t2.stk_mng_typ, t2.sppl_itm_cd, t2.sppl_itm_nm, t2.sno1, t2.sno2, t2.sno3,
					t2.sno4, t2.sno1_mng_typ, t2.sno2_mng_typ, t2.sno3_mng_typ, t2.sno4_mng_typ, t2.maker_cd,
					t2.rsn_cd, t2.bd_dpt_cd, t5.arr_schd_no, t5.arr_pr_no, t5.purc_id_typ, t5.rcpt_iv_no,
					t5.iv_no, t5.io_schd_pr_no, t5.mfg_inst_no, t5.pre_outsrc_act_flg);
			purcL_bldr.addInnerJoin(t2, bracket( t2.purc_act_d_no.eq(t1.purc_act_d_no)
					.and(t2.purc_act_d_seq.eq(t1.purc_act_d_seq))));
			purcL_bldr.addInnerJoin(t3, bracket( t3.purc_act_no.eq(t2.purc_act_no)
					.and(t3.purc_act_seq.eq(t2.purc_act_seq))
					.and(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
			purcL_bldr.addInnerJoin(t4, bracket( t4.purc_schd_no.eq(t2.purc_schd_no)));
			purcL_bldr.addInnerJoin(t5, bracket( t5.arr_schd_no.eq(t4.arr_schd_no)));
			purcL_bldr.setWhere(t1.purc_act_io_no.eq(bind("purc_act_io_no")));
			dbSelect("MSBEL2000_MST_PURC_ACT_IO_S01", purcL, purcL_bldr, notErrL.groupBy(Chk01_RsltR.$purc_act_io_no));
			MCIndexKey purcIdx = purcL.createIndex(MST_PURC_ACT_IO_R.$purc_act_io_no);

			for (Chk01_RsltR r : notErrL) {
				MST_PURC_ACT_IO_R purcR = purcL.getFirst(purcIdx, r.purc_act_io_no());

				// 仕入実績受払NOがDBに登録されているか
				if (isNull(purcR)) {
					msgL.addAll(getRecordNotFoundMsg("MS", "MST_PURC_ACT_IO"
							, new String[]{MST_PURC_ACT_IO_R.$purc_act_io_no}
							, new Comparable[]{r.purc_act_io_no()}, r));
					continue;
				}
				// 上り電文から取得した入荷予定と、入荷進捗更新カウンタとの妥当性をチェック
				if (!isSame(purcR.getString("arr_schd_no"), r.arr_schd_no())) {
					msgL.addAll(getRecordInvalidMsg(MST_ARR_SCHD_R.$arr_schd_no, r.arr_schd_no(), r));
				}
				if (!isSame(purcR.getString("arr_pr_no"), r.arr_pr_no())) {
					msgL.addAll(getRecordInvalidMsg(MST_ARR_SCHD_R.$arr_pr_no, r.arr_pr_no(), r));
				}

				// 引継元の入荷予定からデータを補完
				r.trd_cd(purcR.getString("trd_cd"));
				r.trd_ptn_typ(purcR.getString("trd_ptn_typ"));
				r.itm_cd(purcR.getString("itm_cd"));
				r.itm_sub1(purcR.getString("itm_sub1"));
				r.itm_sub2(purcR.getString("itm_sub2"));
				r.itm_sub3(purcR.getString("itm_sub3"));
				r.itm_nm(purcR.getString("itm_nm"));
				r.rcpt_iv_itm_nm(purcR.getString("rcpt_iv_itm_nm"));
				r.sundry_itm_flg(purcR.getBoolean("sundry_itm_flg"));
				if (!isCmpleItmNm(r)) {
					r.itm_nm(null);
					r.rcpt_iv_itm_nm(null);
				}
				r.stk_mng_typ(purcR.getString("stk_mng_typ"));
				r.setStringNE("purc_stk_mng_typ", purcR.getString("stk_mng_typ"));
				r.purc_id_typ(purcR.getString("purc_id_typ"));
				r.sno1(purcR.getString("sno1"));
				r.sno2(purcR.getString("sno2"));
				r.sno3(purcR.getString("sno3"));
				r.sno4(purcR.getString("sno4"));
				r.sno1_mng_typ(purcR.getString("sno1_mng_typ"));
				r.sno2_mng_typ(purcR.getString("sno2_mng_typ"));
				r.sno3_mng_typ(purcR.getString("sno3_mng_typ"));
				r.sno4_mng_typ(purcR.getString("sno4_mng_typ"));
				r.rqst_dpt_cd(null);	// 計画外のみ更新
				r.rqst_usr_cd(null);	// 計画外のみ更新
				r.sppl_itm_cd(purcR.getString("sppl_itm_cd"));
				r.sppl_itm_nm(purcR.getString("sppl_itm_nm"));
				r.sppl_cd(purcR.getString("sppl_cd"));
				r.maker_cd(purcR.getString("maker_cd"));
				r.rsn_cd(purcR.getString("rsn_cd"));
				r.bd_dpt_cd(purcR.getString("bd_dpt_cd"));
				r.rcpt_iv_no(purcR.getString("rcpt_iv_no"));
				r.temp_rcpt_iv_no(null);
				r.iv_no(purcR.getString("iv_no"));
				r.io_schd_pr_no(purcR.getString("io_schd_pr_no"));
				r.mfg_inst_no(purcR.getString("mfg_inst_no"));
				r.pre_outsrc_act_flg(purcR.getBoolean("pre_outsrc_act_flg"));
				r.arr_ptn_typ(MSC_ARR_PTN_TYP.N_YET_ARR.value());
			}
			return msgL;
		}

		/**
		 * 計画外の入荷実績の存在チェック、および上り電文のデータを補完する
		 */
		protected MCMessageList cmpleByArrAct(MCList<Chk01_RsltR> upL) {

			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_RsltR> notErrL = getChkList(upL);
			if (isNull(notErrL)) {
				return msgL;
			}
			MCList<MST_ARR_ACT_R> arrL = MCList.create(MST_ARR_ACT_R.class);
			dbSelectKey("MSBEL2000_MST_ARR_ACT_S02", arrL, MCQueryApiBuilder.create(MST_ARR_ACT_R.create("T")), upL);
			MCIndexKey arrIdx = arrL.createIndex(MST_ARR_ACT_R.$arr_act_no);

			for (Chk01_RsltR r : notErrL) {
				MST_ARR_ACT_R arrR = arrL.getFirst(arrIdx, r.arr_act_no());

				// 入荷実績NOがDBに登録されているか
				if (isNull(arrR)) {
					msgL.addAll(getRecordNotFoundMsg("MS", "MST_ARR_ACT"
							, new String[]{MST_ARR_ACT_R.$arr_act_no}
							, new Comparable[]{r.arr_act_no()}, r));
					continue;
				}
				
				// データ補完（マスタからの補完）はリストロジックによるチェックロジックを利用して補完する
				r.trd_cd(arrR.trd_cd());
				r.trd_ptn_typ(arrR.trd_ptn_typ());
				r.itm_cd(arrR.itm_cd());
				r.itm_sub1(arrR.itm_sub1());
				r.itm_sub2(arrR.itm_sub2());
				r.itm_sub3(arrR.itm_sub3());
				r.itm_nm(arrR.itm_nm());
				r.rcpt_iv_itm_nm(arrR.rcpt_iv_itm_nm());
				r.sundry_itm_flg(arrR.sundry_itm_flg());
				r.stk_mng_typ(arrR.stk_mng_typ());
				if (!isCmpleItmNm(r)) {
					r.itm_nm(null);
					r.rcpt_iv_itm_nm(null);
				}
				r.purc_id_typ(arrR.purc_id_typ());
				r.sno1_mng_typ(arrR.sno1_mng_typ());
				r.sno2_mng_typ(arrR.sno2_mng_typ());
				r.sno3_mng_typ(arrR.sno3_mng_typ());
				r.sno4_mng_typ(arrR.sno4_mng_typ());

				r.cst_cd(arrR.cst_cd());
				r.sret_fr_cd(arrR.sret_fr_cd());
				r.sppl_cd(arrR.sppl_cd());
			}
			return msgL;
		}

		/**
		 * 品名を補完するか
		 */
		protected boolean isCmpleItmNm(Chk01_RsltR r) {
			return
				r.sundry_itm_flg()
				&& (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()));
		}

		/**
		 * 部門の組織変更
		 */
		protected void cmpleDpt(MCList<Chk01_RsltR> noErrL) {
			MCList<Chk01_RsltR>
				xfrL = createChk01_RsltL(), purcL = createChk01_RsltL();
			noErrL.forEach(r -> {
				if (!isNull(r.bd_dpt_cd())) {
					if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())) {
						xfrL.add(r);
					}
					else {
						purcL.add(r);
					}
				}
			});
			if (!xfrL.isEmpty()) {
				// 負担部門が変更可能な場合のチェックは、リストロジックチェックにゆだねる
				setDpt(xfrL, Chk01_RsltR.$bd_dpt_cd, Chk01_RsltR.$ac_dt);
			}
			if (!purcL.isEmpty()) {
				// 負担部門が変更不可の場合のチェックは、下記ユーティリティで行う
				setDpt(purcL, Chk01_RsltR.$bd_dpt_cd, Chk01_RsltR.$bd_dpt_nm, Chk01_RsltR.$ac_dt, true);
			}
		}

		/**
		 * 条件付必須チェック
		 */
		protected MCMessageList chkReq(MCList<Chk01_RsltR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk01_RsltR r : notErrL) {

				// 更新のみ
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					msgL.addAll(check(r, Chk01_RsltR.$arr_act_no, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, Chk01_RsltR.$can_ac_dt, new FXUCL_RequiredValidater()));
				}

				// 品名（諸口品のみ）
				if (isCmpleItmNm(r)) {
					msgL.addAll(check(r, Chk01_RsltR.$itm_nm, new FXUCL_RequiredValidater()));
				}

				// 取引ＣＤ（計画外のみ）
				if (isNull(r.arr_schd_no())) {
					msgL.addAll(check(r, Chk01_RsltR.$trd_cd, new FXUCL_RequiredValidater()));
				}

				msgL.addAll(check(r, Chk01_RsltR.$arr_tm, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, Chk01_RsltR.$ac_dt, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, Chk01_RsltR.$trd_unit_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, Chk01_RsltR.$trd_unit_qty, new FXUCL_RequiredValidater()));

				// 仕入、経費購買
				if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
					msgL.addAll(check(r, Chk01_RsltR.$purc_id_typ, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, Chk01_RsltR.$sppl_cd, new FXUCL_RequiredValidater()));

					if (r.bp_lot_flg()) {
						msgL.addAll(check(r, Chk01_RsltR.$bp_lot_no, new FXUCL_RequiredValidater()));
					}
				}
				// 経費購買
				if (MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
					msgL.addAll(check(r, Chk01_RsltR.$rsn_cd, new FXUCL_RequiredValidater()));
				}
				// 売上返品
				if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())) {
					msgL.addAll(check(r, Chk01_RsltR.$cst_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, Chk01_RsltR.$rsn_cd, new FXUCL_RequiredValidater()));
				}
				// 出荷返品
				if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
					msgL.addAll(check(r, Chk01_RsltR.$cst_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, Chk01_RsltR.$rsn_cd, new FXUCL_RequiredValidater()));
					// 貸出返品
					if (isNull(r.ret_dlv_slip_d_no())) {
						msgL.addAll(check(r, Chk01_RsltR.$sret_fr_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, Chk01_RsltR.$ret_loc_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, Chk01_RsltR.$ret_gd_cd, new FXUCL_RequiredValidater()));
					}
				}
				// 入荷
				if (MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())) {
					if (!r.cststk_flg()) {
						msgL.addAll(check(r, Chk01_RsltR.$purc_id_typ, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, Chk01_RsltR.$sppl_cd, new FXUCL_RequiredValidater()));
						if (r.bp_lot_flg()) {
							msgL.addAll(check(r, Chk01_RsltR.$bp_lot_no, new FXUCL_RequiredValidater()));
						}
					}
					else {
						msgL.addAll(check(r, Chk01_RsltR.$cst_cd, new FXUCL_RequiredValidater()));
					}
				}
				// ロット発番が手動、またはロット作成しない場合は必須
				if (MAC_LOT_NO_TYP.isMANUAL(r.lot_no_typ()) || !r.crt_lot_flg()) {
					msgL.addAll(check(r, Chk01_RsltR.$lot_no, new FXUCL_RequiredValidater()));
				}
				// ロット発番が自動で、ロットＮＯが指定されている場合はロットＮＯをクリア
				if (MAC_LOT_NO_TYP.isAUTO(r.lot_no_typ()) && !isNull(r.lot_no()) && r.crt_lot_flg()) {
					r.lot_no(null);
				}
				
				// サブロット発番が手動、またはロット作成しない、在庫のみサブロット管理もしない場合は必須
				if (MAC_LOT_NO_TYP.isMANUAL(r.sublot_no_typ())
						|| (!r.crt_lot_flg() && !isCrtSublot(r))) {
					msgL.addAll(check(r, Chk01_RsltR.$sublot_no, new FXUCL_RequiredValidater()));
				}
				// サブロット発番が自動で、サブロットＮＯが指定されている場合はサブロットＮＯをクリア
				if (MAC_LOT_NO_TYP.isAUTO(r.sublot_no_typ()) && !isNull(r.sublot_no()) && r.crt_lot_flg()) {
					r.sublot_no(null);
				}

				// 版管理対象は版Noは必須
				if (r.ver_flg()) {
					msgL.addAll(check(r, Chk01_RsltR.$ver_no, new FXUCL_RequiredValidater()));
				}
				if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
					// 在庫管理品は必須
					msgL.addAll(check(r, Chk01_RsltR.$gd_cd, new FXUCL_RequiredValidater()));
				}
				msgL.addAll(check(r, Chk01_RsltR.$quality_typ, new FXUCL_RequiredValidater()));

				// crrctDataAfterDoServerChkで補完しているので、なければエラー
				msgL.addAll(check(r, Chk01_RsltR.$sno1, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, Chk01_RsltR.$sno2, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, Chk01_RsltR.$sno3, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, Chk01_RsltR.$sno4, new FXUCL_RequiredValidater()));

				// 取引パタン区分が移送の入荷
				if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())) {
					//理由が他勘定出庫
					if (r.acxfr_gi_flg()) {
						msgL.addAll(check(r, Chk01_RsltR.$bd_dpt_cd, new FXUCL_RequiredValidater()));
					}
				}
			}
			return msgL;
		}

		/**
		 * ロット発番はしないが、サブロット発番するか判定する
		 * @param r
		 * @return
		 */
		protected boolean isCrtSublot(Chk01_RsltR r) {
			// ロット作成フラグがオンになるパタンは、仕入、経費購買、入荷(預り以外)のみ
			if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()) && !isNull(r.purc_id_typ())) {

				if (MAC_SUBLOT_MNG_TYP.isSTK(r.sublot_mng_typ())
						&& !MAC_LOT_NO_TYP.isMANUAL(r.sublot_no_typ())
						&& isNull(r.sublot_no())) {
					return true;
				}
			}
			return false;
		}

		/**
		 * 条件付妥当性チェック
		 */
		protected MCMessageList chkValid(MCList<Chk01_RsltR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk01_RsltR r : notErrL) {

				// 取引パタンの妥当性チェック
				if (!isNull(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
				 	&& !MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
				 	&& !MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())) {
					msgL.add(new MCMessage(r, null, MSBEL0167, r.trd_cd(), r.trd_ptn_typ(), toDispGUIIndex(r)));
				}
				if (isNull(r.arr_schd_no())) {
					if (!isNull(r.trd_ptn_typ())
						&& !(MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) ) {
						// 計画外の入荷で扱える取引は「入荷」「出荷返品」のみ
						msgL.add(new MCMessage(r, null, MSBEL0111, r.trd_cd(), r.trd_ptn_typ(), toDispGUIIndex(r)));
					}
					if (MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
						// 品目
					 	if (!MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
						 	// 計画外の「入荷」「出荷返品」は在庫品のみ
							msgL.add(new MCMessage(r, null, MSBEL0300, r.trd_cd(),
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toDispGUIIndex(r)));
						}
					}
					if (MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
						// 良品区分
						if (!MAC_QUALITY_TYP.isGOOD(r.quality_typ())) {
							// 計画外は良品のみ
							msgL.add(new MCMessage(r, null, MSBEL0112, toDispGUIIndex(r)));
						}
					}
					if (MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())) {
						if (!isNull(r.purc_id_typ()) && r.cststk_flg()) {
							// 購買識別区分、預りはいずれか一方のみ設定可
							msgL.add(new MCMessage(r, null, MSBEL0306, r.trd_cd(), toDispGUIIndex(r)));
						}
						// 購買識別区分
						if (!r.cststk_flg()) {
							if (MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ())) {
								// 取引パタンが「入荷(預り以外)」、資産管理する品目の場合は、「無償受給」「ＶＭＩ」のみ
								if (!isNull(r.trd_ptn_typ())
									&& !isNull(r.purc_id_typ())
									&& !(MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())
										|| MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) ) {
									msgL.add(new MCMessage(r, null, MSBEL0301, r.trd_cd(),
										toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), r.purc_id_typ(), toDispGUIIndex(r)));
								}
							}
							else {
								// 取引パタンが「入荷(預り以外)」、資産管理しない品目の場合は、「無償受給」のみ
								if (!MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
									msgL.add(new MCMessage(r, null, MSBEL0307, r.trd_cd(),
										toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), r.purc_id_typ(), toDispGUIIndex(r)));
								}
							}
						}
					}
				}
				// 理由
				if (!isNull(r.rsn_cd())) {
					if (MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()) && !r.cststk_flg()) {
						if (MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ())) {
							if ( !(r.purc_flg() && !r.xpns_purc_flg()) ) {
								// 資産管理する品目の場合は、仕入理由のみ(経費購買理由は不可)
								msgL.add(new MCMessage(r, null, MSBEL0302,
									r.trd_cd(), toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
									r.rsn_cd(), toDispGUIIndex(r)));
							}
						}
						else {
							if ( !(r.purc_flg() && r.xpns_purc_flg()) ) {
								// 資産管理しない品目の場合は、経費購買理由のみ
								msgL.add(new MCMessage(r, null, MSBEL0168,
									r.trd_cd(), toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
									r.rsn_cd(), toDispGUIIndex(r)));
							}
						}
					}
					else if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())) {
						if (!r.xfr_flg()) {
							// 取引パタン区分が「移送」の場合は、移送理由のみ(他勘定出庫も含む)
							msgL.add(new MCMessage(r, null, MSBEL0303, r.trd_cd(), r.rsn_cd(), toDispGUIIndex(r)));
						}
					}
					else if (MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
						if (!r.xfr_flg() || r.acxfr_gi_flg()) {
							// 取引パタン区分が「移送返品」「支給返品」の場合は、移送理由のみ(他勘定出庫は不可)
							msgL.add(new MCMessage(r, null, MSBEL0304, r.trd_cd(), r.rsn_cd(), toDispGUIIndex(r)));
						}
					}
					else if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ()) && isNull(r.arr_schd_no())) {
						if (!r.sls_rtn_flg() || r.sls_acxfr_flg()) {
							// 取引パタン区分が「出荷返品」の場合は、売上返品理由のみ(販売他勘定理由は不可)
							msgL.add(new MCMessage(r, null, MSBEL0305, r.trd_cd(), r.rsn_cd(), toDispGUIIndex(r)));
						}
					}
				}
			}
			// 品目詳細マスタチェック
			msgL.addAll(chkItmDtlForPurc());

			return msgL;
		}

		/**
		 * 有効桁数チェック
		 */
		protected MCMessageList chkDecPlace(MCList<Chk01_RsltR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			// 取引単位数量
			msgL.addAll(checkDecPlace(notErrL, Chk01_RsltR.$trd_unit_dec_place, Chk01_RsltR.$trd_unit_qty));

			// 仕入有効成分
			msgL.addAll(checkDecPlace(notErrL, Chk01_RsltR.$cont_fctr_dec_place, Chk01_RsltR.$purc_cont_qty));

			return msgL;
		}
		
		/**
		 * 発注先、メーカに対する品目詳細マスタチェック
		 */
		protected MCMessageList chkItmDtlForPurc() {
			MCMessageList msgL = new MCMessageList();
			MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			MCList<Chk01_RsltR> upL = getChkList(up0());
			upL.forEach(r -> {
				if (isNull(r.arr_schd_no())
					&& !isNull(r.purc_id_typ())
					&& !isNull(r.arr_tm())
					&& !isNull(r.arr_loc_cd())
					&& !isNull(r.sppl_cd())) {
					copy(itmDtlL.add(), r, createMap_MAM_ITM_DTL_R_Chk01_RsltR());
				}
			});
			if (!itmDtlL.isEmpty()) {
				msgL.addAll(chkItmDtlPurc(itmDtlL));
			}
			return msgL;
		}
		protected Map_MAM_ITM_DTL_R_Chk01_RsltR<MAM_ITM_DTL_R,Chk01_RsltR> createMap_MAM_ITM_DTL_R_Chk01_RsltR() {
			return new Map_MAM_ITM_DTL_R_Chk01_RsltR<MAM_ITM_DTL_R, Chk01_RsltR>();
		}
		public class Map_MAM_ITM_DTL_R_Chk01_RsltR<D extends MAM_ITM_DTL_R, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.itm_cd(src.itm_cd());
				dest.itm_sub1(src.itm_sub1());
				dest.itm_sub2(src.itm_sub2());
				dest.itm_sub3(src.itm_sub3());
				dest.sppl_cd(src.sppl_cd());
				dest.maker_cd(nvl(src.maker_cd(), MAC_STR.NULL_VAL.value()));
				dest.wg_cd(src.arr_wg_cd());
				dest.st_dt(src.arr_tm());
			}
		}

		/**
		 * 在庫検査区分を設定する
		 */
		protected void cmplStkInspTyp(Chk01_RsltR r) {
			if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
				// cmpleByArrSchdで設定した入荷予定の値を使用する
			}
			else {
				r.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			}
		}

		/**
		 * 在庫識別区分を補完する
		 */
		protected void cmplStkIdTyp(Chk01_RsltR r) {
			// 「仕入」「経費購買」
			if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
			 	|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
				if (isNull(r.purc_act_io_no())) {
					if (MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
						// 無償受給は「無償受給」
						r.stk_id_typ(MSC_STK_ID_TYP.NCV_RCV.value());
					}
					else if (MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) {
						// ＶＭＩは「ＶＭＩ」
						r.stk_id_typ(MSC_STK_ID_TYP.RNT_RCV.value());
					}
					else {
						// 通常管理は「仕入検収前」
						r.stk_id_typ(MSC_STK_ID_TYP.PURC_PRE_ACCPT.value());
					}
				}
				else {
					// 未着管理は「通常在庫」
					r.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				}
			}
			// 「売上返品」
			else if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())) {
				// 売上返品は「返品検収前」
				r.stk_id_typ(MSC_STK_ID_TYP.RTN_PRE_ACCPT.value());
			}
			// 「出荷返品」
			else if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
				// 出荷返品は「通常在庫」
				r.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			}
			// 「入荷」
			else if (MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())) {
				if (MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
					// 無償受給は「無償受給」
					r.stk_id_typ(MSC_STK_ID_TYP.NCV_RCV.value());
				}
				else if (MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) {
					// ＶＭＩは「ＶＭＩ」
					r.stk_id_typ(MSC_STK_ID_TYP.RNT_RCV.value());
				}
				else if (r.cststk_flg()) {
					// 預りは「預り在庫」
					r.stk_id_typ(MSC_STK_ID_TYP.CSTSTK.value());
				}
			}
			// 上記以外（移送や支給など）
			else {
				// cmpleByArrSchdで設定した入荷予定の値を使用する
			}
		}

		/**
		 * 在庫管理区分を補完する
		 */
		protected void cmplStkMngTyp(Chk01_RsltR r) {
			// 在庫計上しない取引の場合、
			// 在庫管理区分に「在庫管理しない」を設定し入荷実績を作成する
			// 未着の場合は、仕入実績明細の値で補完する
			if (isNotStk(r)) {
				if (!isNull(r.purc_act_io_no())) {
					r.stk_mng_typ(r.getStringNE("purc_stk_mng_typ"));
				}
				else {
					r.stk_mng_typ(MAC_STK_MNG_TYP.NOT_MNG.value());
				}
			}
		}

		/**
		 * 非在庫チェック
		 */
		protected boolean isNotStk(Chk01_RsltR r) {
			if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
				return true;
			}
			if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ()) && MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ())) {
				if (MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())) {
					if (r.xpns_purc_flg()) {
						return true;
					}
				}
			}
			return false;
		}

		/**
		 * 在庫取引先を補完する<br>
		 * 補完には在庫識別区分を使用するので予め補完済みであること
		 */
		protected void cmplStkBpCd(Chk01_RsltR r) {
			if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
				// cmpleByArrSchdで設定した入荷予定の値を使用する
			}
			else {
				if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
					// 自社在庫はNULL文字
					r.stk_bp_cd(MAC_STR.NULL_VAL.value());
				}
				else if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(r.stk_id_typ())
					|| MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())) {
					// 返品検収前、預りは得意先を設定する
					r.stk_bp_cd(r.cst_cd());
				}
				else {
					// 上記以外は発注先を設定する
					r.stk_bp_cd(r.sppl_cd());
				}
			}
		}

		/**
		 * 在庫着荷先を補完する
		 */
		protected void cmplStkArrvBpCd(Chk01_RsltR r) {
			if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
				// cmpleByArrSchdで設定した入荷予定の値を使用する
			}
			else {
				r.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
			}

			// ファイル入力時の表示用に設定
			if (!isNull(r.sret_fr_cd())) {
				r.ret_stk_arrv_bp_cd(r.sret_fr_cd());
				r.ret_stk_arrv_bp_nm(r.sret_fr_nm());
			}
		}

		/**
		 * 基準単位数量の算出し補完する<br>
		 * ※事前に基準数量、換算数量、小数部有効桁数、端数処理区分が補完されていること
		 */
		protected void cmplBaseUnitQty(Chk01_RsltR r) {
			r.base_unit_qty(
				convToBaseUnit(
					r.trd_unit_qty(), r.trd_unit_conv_base_qty() , r.trd_unit_conv_qty(),
					r.base_unit_dec_place(), r.base_unit_rnd_typ())
			);
		}

		/**
		 * 有効成分係数を算出し補完する
		 */
		protected void cmplPurcContFctr(Chk01_RsltR r) {
			if (r.cont_fctr_flg()) {
				// 仕入有効成分係数
				if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()) && !r.cststk_flg()) {
					r.purc_cont_fctr(
						calcContFctr(r.base_unit_qty(), r.purc_cont_qty(), r.cont_fctr_dec_place()));
				}
				// 標準有効成分
				r.std_cont_qty(
					convToContFctrUnit(
						r.base_unit_qty(), r.std_cont_fctr(), r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ())
				);
			}
			else {
				r.purc_cont_qty(null);
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 入荷場所に対するDACチェック
		 */
		protected MCMessageList chkArrLocDac(MCList<Chk01_RsltR> notErrL) {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_RsltR> orgL = MCList.create(Chk01_RsltR.class);

			notErrL.forEach(r -> {
				String locCd = r.getStringNE(ORG_LOC_CD);
				String lgGrpCd = r.getStringNE(ORG_LG_GRP_CD);
				if ((!isNull(locCd) && !isSame(r.arr_loc_cd(), locCd)) || (!isNull(lgGrpCd) && !isSame(r.arr_lg_grp_cd(), lgGrpCd))) {
					orgL.add(r);
				}
			});
			
			for (Chk01_RsltR r : orgL) {
				MCMessageList msgDacLocL = checkWritableLocCdDac(r, ORG_LOC_CD);	// 訂正前の場所に対してチェック
				MCMessageList msgDacLgL = checkWritableLgGrpCdDac(r, ORG_LG_GRP_CD);	// 訂正前の物流Ｇに対してチェック
				if (!msgDacLocL.isEmpty() && !msgDacLgL.isEmpty()) {
					msgL.addAll(msgDacLocL);
					msgL.addAll(msgDacLgL);
				}
			}

			for (Chk01_RsltR r : notErrL) {
				MCMessageList msgDacLocL = checkWritableLocCdDac(r, Chk01_RsltR.$arr_loc_cd);
				MCMessageList msgDacLgL = checkWritableLgGrpCdDac(r, Chk01_RsltR.$arr_lg_grp_cd);
				if (!msgDacLocL.isEmpty() && !msgDacLgL.isEmpty()) {
					msgL.addAll(msgDacLocL);
					msgL.addAll(msgDacLgL);
				}
			}
			


			return msgL;
		}

		/**
		 * 入荷実績SV 更新前チェック処理を実行する
		 */
		protected void callArrActChkSrv() {
			if(isNull(getChkList(up0()))) {
				return;
			}
			
			up_AA(v0_up0, getChkList(up0()));
			v0.up0().forEach(r -> {
				r.purc_act_chk_flg(true);
				r.sls_ret_chk_flg(true);
				r.outsrc_act_chk_flg(true);
			});
			v0.up1().file_imp_flg(up1().file_imp_flg());
			v0.exec();
			copyErrFlg(up0(), v0.down0());
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 入荷実績を削除するために、チェックを行う<br>
	 */
	public class Chk02 extends MSBEL_ArrActReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			// 入荷実績チェック処理
			callArrActChkSrv();
			setDown();
			setErrToRtnStsTyp();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 更新カウンタチェック
			msgL.addAll(chkUpdCntrArrPr());
			msgL.addAll(chkUpdCntrArrAct());
			msgL.addAll(chkUpdCntrRcptIv());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_RsltR> upL = getChkList(up0());

			// 条件付必須チェック
			msgL.addAll(chkReq(upL));

			// DACチェック
			msgL.addAll(chkLocDac(upL));
			msgL.addAll(chkOther(upL));
			return msgL;
		}

		protected MCMessageList chkOther(MCList<Chk01_RsltR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk01_RsltR r : notErrL) {
				msgL.addAll(check(r, Chk01_RsltR.$can_ac_dt,
						new FXUCL_BeforeTodayValidater()));
			}
			return msgL;
		}
		/**
		 * 入荷場所に対するDACチェック
		 */
		protected MCMessageList chkLocDac(MCList<Chk01_RsltR> notErrL) {
			
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCList<MAM_LOC_R> locL = MCList.create(MAM_LOC_R.class);
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
			locL_bldr.setSelect(t.lg_grp_cd);
			locL_bldr.addSelect(t.loc_cd);
			dbSelectColumn("MSBEL2000_MAM_LOC_S01", locL, locL_bldr, MAM_LOC_R.$loc_cd, notErrL, Chk01_RsltR.$arr_loc_cd);
			
			MCMessageList msgL = new MCMessageList();
			for (Chk01_RsltR r : notErrL) {
				MCMessageList msgDacLocL = checkWritableLocCdDac(r, Chk01_RsltR.$arr_loc_cd);
				MAM_LOC_R locR = locL.getFirst(MAM_LOC_R.$loc_cd, r.arr_loc_cd());					

				if (isNull(locR)) {
					msgL.add(new MCMessage(r, null, MSBEL1072, r.arr_loc_cd(), toDispGUIIndex(r)));
					continue;
				}

				MCMessageList msgDacLgL = checkWritableLgGrpCdDac(locR, MAM_LOC_R.$lg_grp_cd);
				if (!msgDacLocL.isEmpty() && !msgDacLgL.isEmpty()) {
					msgL.addAll(msgDacLocL);
					msgL.addAll(msgDacLgL);
				}
			}

			return msgL;
		}

		/**
		 * 入荷進捗に対する更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntrArrPr() {
			MCList<Chk01_RsltR> schdL = up0().subList(r -> !isNull(r.arr_pr_no()));
			schdL.sort(Chk01_RsltR.$arr_pr_no);

			MCList<MST_ARR_PR_R> l = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			l_bldr.setSelect(t.arr_pr_no, t.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBEL2000_MST_ARR_PR_S02", l, l_bldr, schdL);
			MCIndexKey idx = l.createIndex(MST_ARR_PR_R.$arr_pr_no);

			MCMessageList msgL = new MCMessageList();
			for (Chk01_RsltR r : schdL) {
				MST_ARR_PR_R lockR = l.getFirst(idx, r.arr_pr_no());
				msgL.addAll(
					checkUpdCntrNE(
						r, Chk01_RsltR.$arr_pr_upd_cntr, lockR));
				setErrFlg(r, msgL);
			}
			return msgL;
		}

		/**
		 * 入荷実績に対する更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntrArrAct() {
			up0().sort(Chk01_RsltR.$arr_act_no);

			MCList<MST_ARR_ACT_R> l = MCList.create(MST_ARR_ACT_R.class);
			MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			l_bldr.setSelect(t.arr_act_no, t.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBEL2000_MST_ARR_ACT_S03", l, l_bldr, up0());
			MCIndexKey idx = l.createIndex(MST_ARR_ACT_R.$arr_act_no);

			MCMessageList msgL = new MCMessageList();
			for (Chk01_RsltR r : up0()) {
				if (!r.err_flg()) {
					MST_ARR_ACT_R lockR = l.getFirst(idx, r.arr_act_no());
					msgL.addAll(
						checkUpdCntrNE(
							r, Chk01_RsltR.$arr_act_upd_cntr, lockR));
					setErrFlg(r, msgL);
				}
			}
			return msgL;
		}

		/**
		 * 受領インボイスに対する更新カウンタチェック<br>
		 */
		protected MCMessageList chkUpdCntrRcptIv() {
			MCList<Chk01_RsltR> actL = up0().subList(r -> !isNull(r.rcpt_iv_mng_no()));
			actL.sort(Chk01_RsltR.$rcpt_iv_mng_no);

			MCList<MST_RCPT_IV_R> l = MCList.create(MST_RCPT_IV_R.class);
			MST_RCPT_IV_R t = MST_RCPT_IV_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			l_bldr.setSelect(t.rcpt_iv_mng_no, t.upd_cntr);
			l_bldr.setOrderByAsc(l_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdateNoWait("MSBEL2000_MST_RCPT_IV_S02", l, l_bldr, actL);
			MCIndexKey idx = l.createIndex(MST_RCPT_IV_R.$rcpt_iv_mng_no);

			MCMessageList msgL = new MCMessageList();
			for (Chk01_RsltR r : actL) {
				if (!r.err_flg()) {
					MST_RCPT_IV_R lockR = l.getFirst(idx, r.rcpt_iv_mng_no());
					msgL.addAll(
						checkUpdCntrNE(
							r, Chk01_RsltR.$rcpt_iv_upd_cntr, lockR));
					setErrFlg(r, msgL);
				}
			}
			return msgL;
		}

		/**
		 * 条件付必須チェック
		 */
		protected MCMessageList chkReq(MCList<Chk01_RsltR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk01_RsltR r : notErrL) {

				msgL.addAll(check(r, Chk01_RsltR.$arr_act_no, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, Chk01_RsltR.$can_ac_dt, new FXUCL_RequiredValidater()));

			}
			return msgL;
		}

		/**
		 * 入荷実績SV 削除前チェック処理を実行する
		 */
		protected void callArrActChkSrv() {
			if(isNull(getChkList(up0()))) {
				return;
			}
			up_AA(v0_up0, getChkList(up0()));
			v0.up0().forEach(r -> {
				r.purc_act_chk_flg(true);
				r.sls_ret_chk_flg(true);
				r.outsrc_act_chk_flg(true);
			});
			v0.exec();
			copyErrFlg(up0(), v0.down0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * 受領インボイスＮＯ、発注ＮＯ、納品書ＮＯ、売上返品予定あるいは入荷進捗ＮＯが同一の上り電文行が、
	 * 同じMCListに格納されるように分割する
	 */
	protected List<MCList<Chk01_RsltR>> splitUp(MCList<Chk01_RsltR> list, Chk01_CtrlR ctrlR, int max) {
		List<MCList<Chk01_RsltR>> ret = new ArrayList<>(), arr = new ArrayList<>();
		MCList<Chk01_RsltR>
			rcptL = createChk01_RsltL(), poL = createChk01_RsltL(),
			dlvL = createChk01_RsltL(), slsL = createChk01_RsltL(), elseL = createChk01_RsltL();
		for (Chk01_RsltR r : list) {
			if (!isNull(r.rcpt_iv_mng_no())) {
				// 受領インボイス単位
				rcptL.add(r);
			}
			else if (!isNull(r.po_no())) {
				// 発注ありの場合は発注単位
				poL.add(r);
			}
			else if (ctrlR.prov_arrv_req_flg() && !isNull(r.dlv_slip_no())) {
				// 支給の場合は納品書単位
				dlvL.add(r);
			}
			else if (!isNull(r.sls_ret_schd_no())) {
				// 売上返品予定ありの場合は売上返品予定単位
				slsL.add(r);
			}
			else {
				// 上記以外は入荷進捗単位
				elseL.add(r);
			}
		}
		java.util.function.BiConsumer<MCList<Chk01_RsltR>, String> func = (lst, col) -> {
			for (MCList<Chk01_RsltR> l : lst.groupList(col)) {
				l.sort(Chk01_RsltR.$arr_pr_no, Chk01_RsltR.$arr_schd_no, Chk01_RsltR.$arr_act_no);
				arr.add(l);
			}
		};
		func.accept(rcptL, Chk01_RsltR.$sppl_cd);
		func.accept(dlvL, Chk01_RsltR.$dlv_slip_no);
		func.accept(poL, Chk01_RsltR.$po_no);
		func.accept(slsL, Chk01_RsltR.$sls_ret_schd_no);
		func.accept(elseL, Chk01_RsltR.$arr_pr_no);
		arr.sort(new Comparator<MCList<Chk01_RsltR>>() {
			public int compare(MCList<Chk01_RsltR> o1, MCList<Chk01_RsltR> o2) {
				Chk01_RsltR r1 = o1.get(0), r2 = o2.get(0);
				if (isNull(r1.arr_pr_no())) {
					if (!isNull(r2.arr_pr_no())) {
						return 1;
					}
					return 0;
				}
				return r1.arr_pr_no().compareTo(r2.arr_pr_no());
			}
		});

		MCList<Chk01_RsltR> tmp = MCList.create(Chk01_RsltR.class);
		for (MCList<Chk01_RsltR> grp : arr) {
			if (tmp.size() >= max) {
				ret.add(tmp);
				tmp = MCList.create(Chk01_RsltR.class);
			}
			tmp.addAll(grp);
		}
		if (!tmp.isEmpty()) {
			ret.add(tmp);
		}
		return ret;
	}

	protected void handleSuccess(MCList<Chk01_RsltR> l) {
		dbTran().commit();
		for (Chk01_RsltR r : l) {
			if (!r.err_flg()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			}
		}
	}
	
	protected void handleEx(Exception e, MCList<Chk01_RsltR> l) {
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

	//FMCB CUSTOM END
}