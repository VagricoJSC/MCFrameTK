package mcframe.serverMSBD.MSBDL0160;

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
import mcframe.serverMSBD.MSBDL0160.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBD.MSBDL5170.*;
import mcframe.serverMSBD.MSBDL5200.MSBDL_PurcPrntService;
import mcframe.commonMSUA.MSUAC0040.MSUAC_List;
import mcframe.serverMSBD.MSBDL5200.PurcPrnt_Prnt02_CndR;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import mcframe.commonMAUA.MAUAC0010.MAUAC_List;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch02_DtlR;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMSBC.MSBCL6130.*;
import mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil;
import mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil;
import java.util.*;
import static mcframe.serverMSBD.MSBDL0160.Query.*;
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverMSUC.MSUCL0020.*;
import static mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil.*;
import static mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil.*;
import mcframe.serverMSBF.MSBFL5210.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMSBD.MSBDL5170.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcRetActReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcRetActReg_MC extends MSBDL_PurcRetActReg_MC_A{
	//FMCB CUSTOM START

	/** 製造指図 */
	protected FXUCL_MCDbcCache<MST_MFG_INST_R> _cacheMfgInst = null;
	/** 品目製造指図 */
	protected FXUCL_MCDbcCache<MST_ITM_MFG_INST_R> _cacheItmMftInst = null;

	/**
	 * Chk01オペレーション.<p>
	 *
	 */
	public class Chk01 extends MSBDL_PurcRetActReg_MC_A.Chk01 {
		protected Schd_HdrR _prSchdR = Schd_HdrR.create();
		protected Schd_DtlL<Schd_DtlR> _prSchdDL = Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(Schd_DtlR.class);
		protected Schd_IoL<Schd_IoR> _prSchdIOL = Schd_IoL.createMS_MSBDL5170_Schd_Io(Schd_IoR.class);
		
		protected MCJoinKey<MCList<IoR>> _d2i = null;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			
			// 単票のチェックロジックでは、doItは必ず以下のような実装になります
			// ・自身のチェックでエラーがなければ他のサービスのチェックロジックを呼び出す
			// ・チェックが終わったら下り電文を設定する
			// 単票画面の場合、外部からデータを取り込む機能がないため、キー項目の整合性などはチェックしません

			if (!hasErr()) {
				callChkService();
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			
			// 単票のチェックロジックでは、doServerCheckBaseは必ず以下のような実装になります
			// ・lockAndCheckBaseで更新カウンタチェック対象、補完に必要なトランザクションデータを検索する
			// ・エラーがなければcompBaseでトランザクションデータから補完する
			MCMessageList msgL = super.doServerCheckBase();

			createCache();
			
			msgL.addAll(lockAndCheckBase());

			if (!msgL.isEmpty()) {
				return msgL;
			}
			compBase();
			MCJoinKey<MCList<IoR>> _d2i = null;
			_d2i = up1().join(DtlR.$peg_no, up2(), IoR.$dtl_peg_no);
			
			for (DtlR r : up1()) {
				MCList<IoR> iol = r.getJoined(_d2i);
				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
					iol.setString(IoR.$lot_no, MAC_STR.NULL_VAL.value());
				}
				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
					iol.setString(IoR.$sublot_no, MAC_STR.NULL_VAL.value());
				}
			}

			chkDpt(up0(), up1());
			
			return msgL;
		}

		/**
		 * キャッシュ作成
		 */
		protected void createCache() {
			// 製造指図
			createCacheMfgInst(up1());
		}
		protected MCMessageList lockAndCheckBase() {
			
			// 更新カウンタチェック、更新前データのDACチェック、トランザクションデータの検索を実装します
			// 取得したトランザクションデータはインスタンス変数に格納します（他の処理から参照できるように）
			// 単票なのでデータ量の制限があまりないため、select句は絞りません
			MCMessageList msgL = new MCMessageList();
			
			//仕入返品予定
			if (!isNull(up0().purc_ret_schd_no())) {
				msgL.addAll( cachePurcRetSchd(up0(), up1(), up2(), _prSchdR, _prSchdDL, _prSchdIOL));
			}
			
			return msgL;
		}

		protected void compBase() {
			
			// トランザクションデータからの補完処理はここに実装する
			// それ以外の補完処理はリストロジックチェックで補完された情報などが前提となる場合があり、ここには実装しない
			copyPurcRetSchdToUp(up0(), _prSchdR);
			copyPurcRetSchdDToUp(up1(), _prSchdDL);
			copyPurcRetSchdIoToUp(up2(), _prSchdIOL);
			
			_d2i = up1().join(DtlR.$peg_no, up2(), IoR.$dtl_peg_no);
			
			// 各負担項目ＮＯの存在チェック用のトランザクションデータを取得する
			getDataForExistChk(up1());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			
			// 単票のチェックロジックでは、doServerCheckSubは必ず以下のような実装になります
			// ・checkSubで条件付チェック
			// ・エラーがなければ（doServerCheckSub以前のチェック結果含む）compSubで補完する
			MCMessageList msgL = super.doServerCheckSub();
			
			if (!msgL.isEmpty() || hasErrFlgOn(up0())) {
				return msgL;
			}
			
			msgL.addAll(checkAtLeastOneDtl(up0(), up1()));
			msgL.addAll(MSBDL_PurcUtil.checkAtLeastOneIo(up1(), up2()));

			setParentErrFlg(up0(), up1());
			
			msgL.addAll(checkSub(up0(), up1(), up2(), _d2i));

			msgL.addAll(existItmDtlCheck(up0(),  
					getChkList(up1(),MCRow.CREATE, MCRow.MODIFY, MCRow.NONE), 
					_d2i));

			msgL.addAll(existBdCheck(up1())); 
			
			if (!msgL.isEmpty() || hasErrFlgOn(up0(), up1())) {
				return msgL;
			}

			compSub();

			msgL.addAll(chkDtlAndIo(getChkList(up1(),MCRow.CREATE, MCRow.MODIFY, MCRow.NONE),
					_d2i));
			msgL.addAll(chkAbortFlg(up1(), _prSchdDL, null));
			
			return msgL;
		}

		protected void compSub() {
			
			// リストロジックチェックで補完しきれない項目を補完する

			compSubImpl(up0(), up1(), up2());
		}

		@Override
		protected void putListLogicCheckBind() {
			
			// リストロジックが別のブロックの項目を引数にとる場合、ここに実装する
			super.putListLogicCheckBind();

			// 返品元場所
			ListLogicBind loc1Bind = getListLogicBind(up1(), DtlR.$purc_ret_loc_cd);
			loc1Bind.putBind(MAUAC_List.LocCols.$i_dt, up0(), HdrR.$purc_ret_dt);

			ListLogicBind loc2Bind = getListLogicBind(up2(), IoR.$purc_ret_loc_cd);
			loc2Bind.putBind(MAUAC_List.LocCols.$i_dt, up0(), HdrR.$purc_ret_dt);
			
			// 債務部門
			ListLogicBind apDptBind = getListLogicBind(up1(), DtlR.$ap_dpt_cd);
			apDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), HdrR.$ac_dt);
			
			// 負担部門
			ListLogicBind bdDptBind = getListLogicBind(up1(), DtlR.$bd_dpt_cd);
			bdDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), HdrR.$ac_dt);

			// メーカー
			ListLogicBind itmDtlMakerBind = getListLogicBind(up1(), DtlR.$maker_cd);
			itmDtlMakerBind.putBind(MSUAC_List.ItmDtlMakerCols.$i_master_dt, up0(), HdrR.$purc_ret_dt);
			itmDtlMakerBind.putBind(MSUAC_List.ItmDtlMakerCols.$i_sppl_cd, up0(), HdrR.$sppl_cd);

		}
		protected void callChkService() {
			MSBDL_PurcRetRegService.PurcRet_Chk01 ope = MSBDL_PurcRetRegService.crtPurcRet_Chk01();

			ope.up0().add(up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.exec();
			
			//連携先もコンテナインスタンスを変更しないため、err_flgのコピーは不要
		}

		protected void setDown() {
			
			// チェックの結果や補完の結果は全て上り電文に入っているので、そのまま下り電文に設定しなおす
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 */
	public class Chk02 extends MSBDL_PurcRetActReg_MC_A.Chk02 {
		protected Schd_HdrR _prSchdR = Schd_HdrR.create();
		protected Schd_DtlL<Schd_DtlR> _prSchdDL = Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(Schd_DtlR.class);
		protected Schd_IoL<Schd_IoR> _prSchdIOL = Schd_IoL.createMS_MSBDL5170_Schd_Io(Schd_IoR.class);
		MST_PURC_ACT_R _pActR = MST_PURC_ACT_R.create("T");
		protected MCList<MST_PURC_ACT_D_R> _pActDL = MCList.create(MST_PURC_ACT_D_R.class);
		protected MCList<MST_PURC_ACT_IO_R> _pActIOL = MCList.create(MST_PURC_ACT_IO_R.class);
		protected MCList<MST_PURC_RET_ACT_D_R> _prActDL = MCList.create(MST_PURC_RET_ACT_D_R.class);
		protected MCList<MST_PURC_RET_ACT_IO_R> _prActIOL = MCList.create(MST_PURC_RET_ACT_IO_R.class);

		protected MCJoinKey<MCList<IoR>> _d2i = null;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			
			// 単票のチェックロジックでは、doItは必ず以下のような実装になります
			// ・自身のチェックでエラーがなければ他のサービスのチェックロジックを呼び出す
			// ・チェックが終わったら下り電文を設定する
			// 単票画面の場合、外部からデータを取り込む機能がないため、キー項目の整合性などはチェックしません

			if (!hasErr()) {
				callChkService();
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			
			// 単票のチェックロジックでは、doServerCheckBaseは必ず以下のような実装になります
			// ・lockAndCheckBaseで更新カウンタチェック対象、補完に必要なトランザクションデータを検索する
			// ・エラーがなければcompBaseでトランザクションデータから補完する
			MCMessageList msgL = super.doServerCheckBase();
			createCache();
			
			msgL.addAll(lockAndCheckBase());

			compBase();
			MCJoinKey<MCList<IoR>> _d2i = null;
			_d2i = up1().join(DtlR.$peg_no, up2(), IoR.$dtl_peg_no);
			
			for (DtlR r : up1()) {
				MCList<IoR> iol = r.getJoined(_d2i);
				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
					iol.setString(IoR.$lot_no, MAC_STR.NULL_VAL.value());
				}
				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
					iol.setString(IoR.$sublot_no, MAC_STR.NULL_VAL.value());
				}
			}

			chkDpt(up0(), up1());
			
			return msgL;
		}

		/**
		 * キャッシュ作成
		 */
		protected void createCache() {
			// 製造指図
			createCacheMfgInst(up1());
		}
		protected MCMessageList lockAndCheckBase() {
			
			// 更新カウンタチェック、更新前データのDACチェック、トランザクションデータの検索を実装します
			// 取得したトランザクションデータはインスタンス変数に格納します（他の処理から参照できるように）
			// 単票なのでデータ量の制限があまりないため、select句は絞りません
			MCMessageList msgL = new MCMessageList();
			
			//仕入返品実績
			MST_PURC_RET_ACT_R prar = MST_PURC_RET_ACT_R.create("T");
			dbSelectKeyForUpdateNoWait("MSBDL0160_MST_PURC_RET_ACT_S01", prar,
					MCQueryApiBuilder.create(prar), up0());
			msgL.addAll(checkUpdCntrNE(up0(), HdrR.$pr_act_upd_cntr, prar));

			if (msgL.size() > 0) {
				return msgL;
			}
			
			//データ更新前のDACチェック
			prar.setAttributes(up0());
			msgL.addAll(checkWritableDptCdDac(prar, HdrR.$purc_dpt_cd));

			if (msgL.size() > 0) {
				return msgL;
			}

			dbSelectKey("MSBDL0160_MST_PURC_RET_ACT_D_S01", _prActDL,
					MCQueryApiBuilder.create(MST_PURC_RET_ACT_D_R.create("T")),
					up1().subList(r -> r.isStatusModify() || r.isStatusDelete() || r.isStatusNone()));
			dbSelectKey("MSBDL0160_MST_PURC_RET_ACT_IO_S01", _prActIOL,
					MCQueryApiBuilder.create(MST_PURC_RET_ACT_IO_R.create("T")),
					up2().subList(r -> r.isStatusModify() || r.isStatusDelete() || r.isStatusNone()));
			
			//仕入返品予定
			if (!isNull(up0().purc_ret_schd_no())) {
				msgL.addAll(cachePurcRetSchd(up0(), up1(), up2(), _prSchdR, _prSchdDL, _prSchdIOL));
			}
			
			if (msgL.size() > 0) {
				return msgL;
			}
			
			//仕入実績
			msgL.addAll(cachePurcAct(up0(), up1(), _pActR, _pActDL, _pActIOL));
			
			return msgL;
		}

		protected void compBase() {
			
			// トランザクションデータからの補完処理はここに実装する
			// それ以外の補完処理はリストロジックチェックで補完された情報などが前提となる場合があり、ここには実装しない
			copyPurcRetSchdToUp(up0(), _prSchdR);
			copyPurcRetSchdDToUp(up1(), _prSchdDL);
			copyPurcRetSchdIoToUp(up2(), _prSchdIOL);
			copyPurcActToUp(up0(), _pActR);
			copyPurcActDToUp(up1(), _pActDL);
			copyPurcActIoToUp(up2(), _pActIOL);
			
			_d2i = up1().join(DtlR.$peg_no, up2(), IoR.$dtl_peg_no);
			
			// 各負担項目ＮＯの存在チェック用のトランザクションデータを取得する
			getDataForExistChk(up1());

		}

		@Override
		protected MCMessageList doServerCheckSub() {
			
			// 単票のチェックロジックでは、doServerCheckSubは必ず以下のような実装になります
			// ・checkSubで条件付チェック
			// ・エラーがなければ（doServerCheckSub以前のチェック結果含む）compSubで補完する
			MCMessageList msgL = super.doServerCheckSub();

			if (!msgL.isEmpty() || hasErrFlgOn(up0())) {
				return msgL;
			}
			msgL.addAll(checkAtLeastOneDtl(up0(), up1()));
			msgL.addAll(MSBDL_PurcUtil.checkAtLeastOneIo(up1(), up2()));
			
			setParentErrFlg(up0(), up1());

			msgL.addAll(existItmDtlCheck(up0(),  
					getChkList(up1(),MCRow.CREATE, MCRow.MODIFY, MCRow.NONE), 
					_d2i));
			
			msgL.addAll(checkSub(up0(), 
					getChkList(up1(),MCRow.CREATE, MCRow.MODIFY, MCRow.NONE), 
					up2().subList(MCRow.CREATE, MCRow.MODIFY, MCRow.NONE), _d2i));
			
			
			msgL.addAll(existBdCheck(up1())); 

			if (!msgL.isEmpty() || hasErrFlgOn(up0(), up1())) {
				return msgL;
			}

			compSub();

			msgL.addAll(chkDtlAndIo(getChkList(up1(),MCRow.CREATE, MCRow.MODIFY, MCRow.NONE),
					_d2i));
			msgL.addAll(chkAbortFlg(up1(), _prSchdDL, _prActDL));
			
			return msgL;
		}

		
		
				
		protected void compSub() {
			
			// リストロジックチェックで補完しきれない項目を補完する
			compSubImpl(up0(), up1(), up2());
		}

		@Override
		protected void putListLogicCheckBind() {
			
			// リストロジックが別のブロックの項目を引数にとる場合、ここに実装する
			super.putListLogicCheckBind();

			// 返品元場所
			ListLogicBind loc1Bind = getListLogicBind(up1(), DtlR.$purc_ret_loc_cd);
			loc1Bind.putBind(MAUAC_List.LocCols.$i_dt, up0(), HdrR.$purc_ret_dt);

			ListLogicBind loc2Bind = getListLogicBind(up2(), IoR.$purc_ret_loc_cd);
			loc2Bind.putBind(MAUAC_List.LocCols.$i_dt, up0(), HdrR.$purc_ret_dt);
			
			// 債務部門
			ListLogicBind apDptBind = getListLogicBind(up1(), DtlR.$ap_dpt_cd);
			apDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), HdrR.$ac_dt);
			
			// 負担部門
			ListLogicBind bdDptBind = getListLogicBind(up1(), DtlR.$bd_dpt_cd);
			bdDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), HdrR.$ac_dt);

			// メーカー
			ListLogicBind itmDtlMakerBind = getListLogicBind(up1(), DtlR.$maker_cd);
			itmDtlMakerBind.putBind(MSUAC_List.ItmDtlMakerCols.$i_master_dt, up0(), HdrR.$purc_ret_dt);
			itmDtlMakerBind.putBind(MSUAC_List.ItmDtlMakerCols.$i_sppl_cd, up0(), HdrR.$sppl_cd);

		}
		
		protected void callChkService() {
			MSBDL_PurcRetRegService.PurcRet_Chk02 ope = MSBDL_PurcRetRegService.crtPurcRet_Chk02();

			ope.up0().add(up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.exec();

			//連携先もコンテナインスタンスを変更しないため、err_flgのコピーは不要
			
			String[] destCol = {DtlR.$purc_dtl_upd_flg};
			String[] srcCol = {mcframe.serverMSBD.MSBDL5170.DtlR.$purc_dtl_upd_flg};
			copyByPegNo(up1(), destCol, ope.down1(), srcCol);
			
		}

		protected void setDown() {
			
			// チェックの結果や補完の結果は全て上り電文に入っているので、そのまま下り電文に設定しなおす
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 */
	public class Chk03 extends MSBDL_PurcRetActReg_MC_A.Chk03 {
		
		protected Schd_HdrR _prSchdR = Schd_HdrR.create();
		protected Schd_DtlL<Schd_DtlR> _prSchdDL = Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(Schd_DtlR.class);
		protected Schd_IoL<Schd_IoR> _prSchdIOL = Schd_IoL.createMS_MSBDL5170_Schd_Io(Schd_IoR.class);
		
		MST_PURC_ACT_R _pActR = MST_PURC_ACT_R.create("T");
		MSBDL_PurcRetRegService.PurcRet_Chk03 _ope = MSBDL_PurcRetRegService.crtPurcRet_Chk03();
		
		mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> _dl; 
		mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> _iol; 
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			// 単票のチェックロジックでは、doItは必ず以下のような実装になります
			// ・自身のチェックでエラーがなければ他のサービスのチェックロジックを呼び出す
			// ・チェックが終わったら下り電文を設定する
			// 単票画面の場合、外部からデータを取り込む機能がないため、キー項目の整合性などはチェックしません

			if (!hasErr()) {
				callChkService();
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			
			// 単票のチェックロジックでは、doServerCheckBaseは必ず以下のような実装になります
			// ・lockAndCheckBaseで更新カウンタチェック対象、補完に必要なトランザクションデータを検索する
			// ・エラーがなければcompBaseでトランザクションデータから補完する
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(lockAndCheckBase());

			if (!msgL.isEmpty()) {
				return msgL;
			}

			compBase();

			return msgL;
		}

		protected MCMessageList lockAndCheckBase() {
			
			// 更新カウンタチェック、更新前データのDACチェック、トランザクションデータの検索を実装します
			// 取得したトランザクションデータはインスタンス変数に格納します（他の処理から参照できるように）
			// 単票なのでデータ量の制限があまりないため、select句は絞りません
			MCMessageList msgL = new MCMessageList();
			
			//仕入返品実績
			MST_PURC_RET_ACT_R prar = MST_PURC_RET_ACT_R.create("T");
			dbSelectKeyForUpdateNoWait("MSBDL0160_MST_PURC_RET_ACT_S02", prar,
					MCQueryApiBuilder.create(prar), up0());
			msgL.addAll(checkUpdCntrNE(up0(), HdrR.$pr_act_upd_cntr, prar));

			if (msgL.size() > 0) {
				return msgL;
			}
			
			//データ更新前のDACチェック
			prar.setAttributes(up0());
			msgL.addAll(checkWritableDptCdDac(prar, HdrR.$purc_dpt_cd));

			if (msgL.size() > 0) {
				return msgL;
			}
			

			mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> hl
				= _ope.createHdrL();
			up0().peg_no(MCNumber.ONE);
			hl.add(up0());
			_dl	= _ope.getPurcRetActD(hl);
			_iol = _ope.getPurcRetActIo(_dl);
			
			//仕入返品予定
			if (!isNull(up0().purc_ret_schd_no())) {
				msgL.addAll(cachePurcRetSchd(up0(), _dl, _iol, _prSchdR, _prSchdDL, _prSchdIOL));
			}

			if (msgL.size() > 0) {
				return msgL;
			}
			
			//仕入実績
			msgL.addAll(checkUpdCntrPurcAct(up0(), _pActR));
			
			return msgL;
		}

		protected void compBase() {
			
			// トランザクションデータからの補完処理はここに実装する
			// それ以外の補完処理はリストロジックチェックで補完された情報などが前提となる場合があり、ここには実装しない
			// リストロジックチェックで補完しきれない項目を補完する
//			copyPurcRetSchdToUp(up0(), _schdR);
			copyPurcActToUp(up0(), _pActR);
			up0().schd_dt(_prSchdR.schd_dt());
			
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			
			// 単票のチェックロジックでは、doServerCheckSubは必ず以下のような実装になります
			// ・checkSubで条件付チェック
			// ・エラーがなければ（doServerCheckSub以前のチェック結果含む）compSubで補完する
			MCMessageList msgL = super.doServerCheckSub();

			if (!msgL.isEmpty() || hasErrFlgOn(up0())) {
				return msgL;
			}
			msgL.addAll(check(up0(), HdrR.$can_ac_dt, new FXUCL_BeforeTodayValidater()));

			compSub();

			return msgL;
		}

		
				
		protected void compSub() {
			

		}

		protected void callChkService() {

			_ope.up0().add(up0());
			_ope.up1().setAll(_dl);
			_ope.up2().setAll(_iol);
			_ope.exec();

			//連携先もコンテナインスタンスを変更しないため、err_flgのコピーは不要
		}

		protected void setDown() {
			
			// チェックの結果や補完の結果は全て上り電文に入っているので、そのまま下り電文に設定しなおす
			MCRow.copyall(down0(), up0());
		}
		
		protected mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> getChkdD() {
			return _dl;
		}
		protected mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> getChkdIO() {
			return _iol;
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 */
	public class Ins01 extends MSBDL_PurcRetActReg_MC_A.Ins01 {

		MSBDL_PurcRetActReg.Chk01 _cope;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			editUp();
			callThisChk();
			throwUpdErr();
			callInsService();
			setDown();
		}
		
		protected void editUp() {
			up0().io_make_flg(true);
			
			setRowStatus();
			copyGUIIndexDtlToIo();
		}

		/**
		 * 行ステータス設定
		 */
		protected void setRowStatus() {
			up0().setStatus(MCRow.CREATE);
			up1().setStatus(MCRow.CREATE);
			up2().setStatus(MCRow.CREATE);
		}
		
		protected void copyGUIIndexDtlToIo() {
			MCIndexKey ik = up1().createIndex(DtlR.$peg_no);
			up2().forEach(ir -> {
				DtlR dr = up1().getFirst(ik, ir.dtl_peg_no());
				if(!isNull(dr)) {
					// メッセージ出力用に行番号のみを上段の行番号を設定する
					ir.setGUIIndex(dr.getGUIIndex());
				}
			});
		}
		
		protected void callThisChk() {
			_cope = MSBDL_PurcRetActReg.crtChk01();

			MCRow.copyall(_cope.up0(), up0());
			_cope.up1().setAll(up1());
			_cope.up2().setAll(up2());
			_cope.exec();
			MCRow.copyall(up0(), _cope.down0());
		}

		protected void callInsService() {

			MSBDL_PurcRetRegService.PurcRet_Ins01 ope = MSBDL_PurcRetRegService.crtPurcRet_Ins01();
			
			ope.up0().add(up0());
			ope.up0().setBoolean(0, "indiv_prnt_flg", true);
			ope.up0().setBoolean(0, "amt_calc_flg", false);
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.exec();

			//予定更新（返品予定トランに対する処理は打切、打切解除のみ）
			callSchdOpe(up1(), up2(), _cope._prSchdR, _cope._prSchdDL, _cope._prSchdIOL, null, null);
			
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 */
	public class Upd01 extends MSBDL_PurcRetActReg_MC_A.Upd01 {
		
		MSBDL_PurcRetActReg.Chk02 _cope;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			editUp();
			callThisChk();
			throwUpdErr();
			callUpdService();
			setDown();
		}

		protected void editUp() {
			up0().io_make_flg(true);
			copyGUIIndexDtlToIo();
		}
		
		protected void copyGUIIndexDtlToIo() {
			MCIndexKey ik = up1().createIndex(DtlR.$peg_no);
			up2().forEach(ir -> {
				DtlR dr = up1().getFirst(ik, ir.dtl_peg_no());
				if(!isNull(dr)) {
					// メッセージ出力用に行番号のみを上段の行番号を設定する
					ir.setGUIIndex(dr.getGUIIndex());
				}
			});
		}
		
		protected void callThisChk() {
			_cope = MSBDL_PurcRetActReg.crtChk02();

			MCRow.copyall(_cope.up0(), up0());
			_cope.up1().setAll(up1());
			_cope.up2().setAll(up2());
			_cope.exec();
			MCRow.copyall(up0(), _cope.down0());
		}

		protected void callUpdService() {
			//実績更新
			MSBDL_PurcRetRegService.PurcRet_Upd01 ope = MSBDL_PurcRetRegService.crtPurcRet_Upd01();
			ope.up0().add(up0());
			ope.up0().setBoolean(0, "indiv_prnt_flg", true);
			ope.up0().setBoolean(0, "amt_calc_flg", false);
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			
			ope.exec();

			//予定更新（返品予定トランに対する処理は打切、打切解除のみ）
			callSchdOpe(up1(), up2(), 
					_cope._prSchdR, _cope._prSchdDL, _cope._prSchdIOL, 
					_cope._prActDL, _cope._prActIOL);
			
		}
				
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
		
	}
	
	protected MCMessageList chkAbortFlg(MCList<DtlR> up1,
			Schd_DtlL<Schd_DtlR> prSchdDL,
			MCList<MST_PURC_RET_ACT_D_R> befPrActDL) {
		
		MCMessageList ml = new MCMessageList();
		
		MCIndexKey schdDK = prSchdDL.createIndex(Schd_DtlR.$purc_ret_schd_d_no);
		MCIndexKey bactDK = (befPrActDL == null) ? null : befPrActDL.createIndex(Schd_DtlR.$purc_ret_act_d_no);
		
		
		for (DtlR r : up1.subList(r -> 
			r.isStatusModify() || r.isStatusCreate()|| r.isStatusDelete())) {
			Schd_DtlR sr = prSchdDL.getFirst(schdDK, r.purc_ret_schd_d_no());
			if (sr != null) {
				MST_PURC_RET_ACT_D_R br = (befPrActDL == null) ? null : befPrActDL.getFirst(bactDK, r.purc_ret_act_d_no());
				//１行ずつ差分を評価し、srの返品済数（ret_qty）を更新する
				convRetQtyForIoSchd(sr, r, br);
			}
		}
		up1.forEach(r ->{
			Schd_DtlR sr = prSchdDL.getFirst(schdDK, r.purc_ret_schd_d_no());
			if (sr != null) {
				if (r.abort_flg() && sr.base_unit_qty().lte(sr.getNumberNE(DtlR.$ret_qty))) {
					r.err_flg(true);
					ml.add(new MCMessage(r, DtlR.$trd_unit_qty, MSBDL0050, toDispGUIIndex(r)));
				}
			}
		});
		return ml;
	}
	
	/**
	 * 受払予定を更新する。
	 * @param up1 上り電文明細
	 * @param up2 上り電文詳細
	 * @param prSchdR 予定ヘッダ
	 * @param prSchdDL 予定明細
	 * @param prSchdIoL 予定詳細
	 * @param befPrActDL 変更前実績明細
	 * @param befPrActIOL 変更前実績詳細
	 */
	protected <D extends mcframe.serverMSBD.MSBDL5170.DtlR, I extends mcframe.serverMSBD.MSBDL5170.IoR> 
		void callSchdOpe(MCList<D> up1, MCList<I> up2,
			Schd_HdrR prSchdR, Schd_DtlL<Schd_DtlR> prSchdDL, Schd_IoL<Schd_IoR> prSchdIoL,
			MCList<? extends MST_PURC_RET_ACT_D_R> befPrActDL, 
					MCList<? extends MST_PURC_RET_ACT_IO_R> befPrActIoL) {
		MCIndexKey schdDK = prSchdDL.createIndex(Schd_DtlR.$purc_ret_schd_d_no);
		
		String $bef_abort_flg = "$bef_abort_flg";
		for (D u1r : up1) {

			Schd_DtlR sr = prSchdDL.getFirst(schdDK, u1r.purc_ret_schd_d_no());
			if (sr == null) {
				continue;
			}
			sr.setBooleanNE($bef_abort_flg, sr.abort_flg());
						
			//残数0は予定の削除
			if (!isNull(sr.ret_qty()) && 
					MCNumber.ZERO.gte(sr.base_unit_qty().subtract(sr.ret_qty()))) {
				sr.setStatus(MCRow.DELETE);
			}
			//予定残数ありの実績更新や登録時は予定の修正
			else {
				sr.setStatus(MCRow.MODIFY);
			}

			//予定の打切フラグを設定する。
			if (u1r.abort_flg()) {
				if (!sr.abort_flg()) {
					sr.abort_flg(true);
					sr.setStatus(MCRow.DELETE);
				}
			}
			else {
				if (sr.abort_flg()){
					sr.abort_flg(false);
					sr.setStatus(MCRow.CREATE);
				}
			}
		}			
		
		MCIndexKey schdIOK = prSchdIoL.createIndex(Schd_IoR.$purc_ret_schd_io_no);
		MCIndexKey actIOK = (befPrActIoL == null) ? null : befPrActIoL.createIndex(Schd_IoR.$purc_ret_act_io_no);

		//変更後返品済数(ret_qty)を計算する。
		for (mcframe.serverMSBD.MSBDL5170.IoR r : up2) {
			Schd_IoR sr = prSchdIoL.getFirst(schdIOK, r.purc_ret_schd_io_no());
			if (sr != null) {
				MST_PURC_RET_ACT_IO_R br = (befPrActIoL == null) ? null : 
					(MST_PURC_RET_ACT_IO_R)befPrActIoL.getFirst(actIOK, r.purc_ret_act_io_no());
				convRetQtyForIoSchd(sr, r, br);
			}
		}
		
		for (Schd_IoR sr : prSchdIoL) {
			
			//残数0は予定の削除
			if (!isNull(sr.ret_qty()) && 
					MCNumber.ZERO.gte(sr.base_unit_qty().subtract(sr.ret_qty()))) {
				sr.setStatus(MCRow.DELETE);
			}
			//予定残数ありの実績更新や登録時は予定の修正
			else {
				Schd_DtlR dsr = prSchdDL.getFirst(schdDK, sr.purc_ret_schd_d_no());
				if (!dsr.getBooleanNE($bef_abort_flg) && dsr.abort_flg()) {
					sr.setStatus(MCRow.DELETE);
				}
				else if (dsr.getBooleanNE($bef_abort_flg) && !dsr.abort_flg()){
					sr.setStatus(MCRow.CREATE);
				}
				else if (!dsr.getBooleanNE($bef_abort_flg) && !dsr.abort_flg()){
					sr.setStatus(MCRow.MODIFY);
				}
				else {
					//打ち切りのままは無視
				}
			}
		}
		
		if (!isNull(prSchdDL)) {
			
			//予定打切、打切解除、受払予定更新
			MSBDL_PurcRetRegService.Schd_Upd02 aope = MSBDL_PurcRetRegService.crtSchd_Upd02();
			MCRow.copyall(aope.up0(), prSchdR);
			aope.up0().skip_alloc_flg(true);
			aope.up0().amt_calc_flg(false);
			aope.up1().setAll(prSchdDL);
			aope.up2().setAll(prSchdIoL);
			
			//peg_no設定して実行
			MCNumber hp = MCNumber.ONE;
			MCNumber dp = MCNumber.ONE;
			MCNumber ip = MCNumber.ONE;
			MCJoinKey<Schd_IoL<Schd_IoR>> jk = aope.up1().join(
					Schd_DtlR.$purc_ret_schd_d_no, aope.up2(), Schd_IoR.$purc_ret_schd_d_no);

			aope.up0().peg_no(hp);
			for(Schd_DtlR dr : aope.up1()) {
				dr.hdr_peg_no(hp);
				dr.peg_no(dp);
				for (Schd_IoR ir : dr.getJoined(jk)) {
					ir.dtl_peg_no(dp);
					ir.peg_no(ip);
					ip = ip.add(MCNumber.ONE);
					ir.itm_cd(dr.itm_cd());
					ir.itm_sub1(dr.itm_sub1());
					ir.itm_sub2(dr.itm_sub2());
					ir.itm_sub3(dr.itm_sub3());
				}
				dp = dp.add(MCNumber.ONE);
			}
			
			aope.exec();
		}
	
	}
	
	/**
	 * 予定の返品済数（ret_qty）を更新する。
	 * @param schd 予定
	 * @param act 実績
	 * @param bact 変更前実績
	 */
	protected void convRetQtyForIoSchd(MCRow schd, MCRow act, MCRow bact) {
		MCNumber retBase = schd.getNumber(Schd_DtlR.$ret_qty);
		if (retBase == null) {
			retBase = MCNumber.ZERO;
		}
		MCNumber bactBase = bact == null ? MCNumber.ZERO : bact.getNumber(Schd_DtlR.$base_unit_qty);
		MCNumber actBase = act.isStatusDelete() ? MCNumber.ZERO : act.getNumber(Schd_DtlR.$base_unit_qty);
		//残数に実績の差分を追加する
		MCNumber newRetBase = retBase.add(actBase.subtract(bactBase));
		schd.setValueNE(Schd_DtlR.$ret_qty, newRetBase);
	}
	
	/**
	 * Del01オペレーション.<p>
	 *
	 */
	public class Del01 extends MSBDL_PurcRetActReg_MC_A.Del01 {
		MSBDL_PurcRetActReg.Chk03 _cope;
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			editUp();
			callThisChk();
			throwCanErr();
			callDelService();
			setDown();
		}
		
		
		protected void editUp() {
			up0().io_make_flg(true);
			setRowStatus();
		}

		/**
		 * 行ステータス設定
		 */
		protected void setRowStatus() {
			up0().setStatus(MCRow.DELETE);
		}
		
		protected void callThisChk() {
			_cope = MSBDL_PurcRetActReg.crtChk03();
			MCRow.copyall(_cope.up0(), up0());
			_cope.exec();
			MCRow.copyall(up0(), _cope.down0());
		}

		protected void callDelService() {

			MSBDL_PurcRetRegService.PurcRet_Del01 ope = MSBDL_PurcRetRegService.crtPurcRet_Del01();
			
			
			ope.up0().add(up0());
			ope.up0().setBoolean(0, "indiv_prnt_flg", true);
			ope.up0().setBoolean(0, "amt_calc_flg", false);
			ope.up1().setAll(_cope.getChkdD());
			ope.up2().setAll(_cope.getChkdIO());
			ope.exec();
			
			setAfterRetQty();
			
			//予定更新（返品予定トランに対する処理は打切、打切解除のみ）
			callSchdOpe(_cope.getChkdD(), _cope.getChkdIO(), _cope._prSchdR, _cope._prSchdDL, _cope._prSchdIOL, 
					_cope.getChkdD(), _cope.getChkdIO());
			
		}
		
		/**
		 * 明細の更新後返品済み数を設定する。詳細はcallSchdOpe内で設定するためここではやらない。
		 */
		protected void setAfterRetQty() {
			MCIndexKey schdDK = _cope._prSchdDL.createIndex(Schd_DtlR.$purc_ret_schd_d_no);
			for (mcframe.serverMSBD.MSBDL5170.DtlR r : _cope.getChkdD()) {
				Schd_DtlR sr = _cope._prSchdDL.getFirst(schdDK, r.purc_ret_schd_d_no());
				if (sr != null) {
					//１行ずつ差分を評価し、srの返品済数（ret_qty）を更新する
					convRetQtyForIoSchd(sr, r, r);
				}
			}
		}
		
		protected void setDown() {
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 */
	public class Prnt01 extends MSBDL_PurcRetActReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			callPurcPrntServicePrnt01();
		}

		protected void callPurcPrntServicePrnt01() {
			MSBDL_PurcPrntService.PurcPrnt_Prnt02 prnt
				= MSBDL_PurcPrntService.crtPurcPrnt_Prnt02();
			Map_PurcPrnt_Prnt02_CndR_HdrR<PurcPrnt_Prnt02_CndR, HdrR> map
				= createMap_PurcPrnt_Prnt02_CndR_HdrR();
			PurcPrnt_Prnt02_CndR cr = prnt.up0().createRow();
			copy(cr, up0(), map);
			prnt.up0().add(cr);
			prnt.up1().indiv_prnt_flg(true);
			prnt.exec();
		}
		/**
		 * 購買帳票発行サービス仕入返品票発行用のRowMapperを作成します。
		 */
		public Map_PurcPrnt_Prnt02_CndR_HdrR<PurcPrnt_Prnt02_CndR,HdrR> createMap_PurcPrnt_Prnt02_CndR_HdrR() {
			return new Map_PurcPrnt_Prnt02_CndR_HdrR<PurcPrnt_Prnt02_CndR, HdrR>();
		}

		/**
		 * 購買帳票発行サービス仕入返品票発行用のRowMapperです。
		 */
		public class Map_PurcPrnt_Prnt02_CndR_HdrR<D extends PurcPrnt_Prnt02_CndR, S extends HdrR> extends MCRowMapper<D,S>{
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcPrnt_Prnt02_CndR.$purc_ret_act_no, HdrR.$purc_ret_act_no);
				addColumnPathMap(PurcPrnt_Prnt02_CndR.$purc_ret_act_rev, HdrR.$purc_ret_act_rev);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
			}
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 * 仕入返品予定情報を検索する。
	 */
	public class Srch01 extends MSBDL_PurcRetActReg_MC_A.Srch01 {
		
		// 単票ではシンプルにdoSearchMainでDBからヘッダ、明細のデータを取得、editListMainでDBから取得したデータの加工をします
		// 定数名、時分項目、棚・ライン対象ＦＬＧの補完は親クラスで処理されるため、個々の実装は不要です。
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			
			editUp();
			
			int cnt = srchHdr();
		
			if (isSame(cnt, 0)) {
				return;
			}

			cnt = srchDtl();
			if (isSame(cnt, 0)) {
				down0().clearAll();
				return;
			}

			cnt = srchIO();
			if (isSame(cnt, 0)) {
				down0().clearAll();
				down1().clear();
				return;
			}
			
			
		}
		
		protected void editUp() {
			//計上日の初期値となる運用日付を部門の結合条件として使用する
			up0().addDateColumn("dpt_dt", getToday());
			
			up0().addStringColumn("base_cur_cd", getBaseCur().cur_cd());
			up0().addStringColumn("ptax_cur_cd", getPtaxCur().cur_cd());
		}
		
		/**
		 * ヘッダを検索する。
		 *
		 * @return 検索件数
		 */
		protected int srchHdr() {
			return executeQuery(down0(), MSBDL5170_MST_PURC_RET_SCHD_S01(), up0());
		}

		/**
		 * 明細を検索する。
		 * 
		 * @return 検索件数
		 */
		protected int srchDtl() {
			executeQuery(down1(), MSBDL5170_MST_PURC_RET_SCHD_D_S01(), up0());
			//予定残無しは対象外
			down1().removeIf(r -> 
					!isNull(r.ret_qty()) && 
					MCNumber.ZERO.gte(
							r.base_unit_qty().add(r.ret_qty().negate()))
							|| r.cmpl_flg()
				);
			
			if (down1().size() > 0) {
				MCList<MAM_TAX_R> taxL = MCList.create(MAM_TAX_R.class);
				MAM_TAX_R taxL_t = MAM_TAX_R.create("T");
				MCQueryApiBuilder taxL_bldr = MCQueryApiBuilder.create(taxL_t);
				taxL_bldr.setWhere(taxL_t.tax_cd.eq(bind("act_tax_cd")));
				dbSelect("MSBDL0160_MAM_TAX_S01", taxL, taxL_bldr, down1());
				MCIndexKey key = taxL.createIndex(MAM_TAX_R.$tax_cd);
				for (DtlR r : down1()) {
					// 予定時税率、内税ＦＬＧを設定
					r.schd_tax_rate(r.tax_rate());
					r.schd_inc_tax_flg(r.inc_tax_flg());
					if (!r.tax_fix_flg()) {
						// 税指定なしの場合に、税情報を運用日付で取得した最新の情報に置き換える
						if (MSC_STK_ID_TYP.isACCPT_DFCT(r.stk_id_typ())) {
							continue;
						}
						MAM_TAX_R taxR = taxL.getFirst(key, r.act_tax_cd());
						r.tax_cd(r.act_tax_cd());
						r.tax_nm(taxR.tax_nm());
						r.tax_rate(taxR.tax_rate());
						r.inc_tax_flg(taxR.inc_tax_flg());
					}
					
				}
			}
			return down1().size();
		}

		/**
		 * 受払を検索する。
		 * 
		 * @return 検索件数
		 */
		protected int srchIO() {
			executeQuery(down2(), MSBDL5170_MST_PURC_RET_SCHD_IO_S01(), up0());
			//予定残無しは対象外
			down2().removeIf(r -> 
						!isNull(r.ret_qty()) && 
						MCNumber.ZERO.gte(
								r.base_unit_qty().add(r.ret_qty().negate()))
					);
		
			return down2().size();
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			final HdrR down0 = down0();
			final MCList<DtlR> down1 = down1();
			final MCList<IoR> down2 = down2();
			if (!down0.isEmpty()) {
				MCDate dt = up0().getDateNE("dpt_dt");
				down0.ac_dt(dt);
				down0.pay_basis_dt(dt);
				down0.purc_ret_dt(dt);
				
				editXrateIfInptFlgOff(down0);

				MCJoinKey<MCList<IoR>> jk = down1.join(
						DtlR.$purc_ret_schd_d_no, down2, IoR.$purc_ret_schd_d_no);
				
				down1().forEach(r->{
						//残数計算
						if (!isNull(r.ret_qty())) {
							MCNumber remainBase = r.base_unit_qty().add(r.ret_qty().negate());
							r.schd_qty(remainBase);
							r.base_unit_qty(remainBase);
							MCNumber remainTrd = rvrsBaseUnitConv(remainBase, 
									r.trd_unit_dmn_qty(), r.trd_unit_conv_qty(), 
									r.trd_unit_dec_place(), r.trd_unit_rnd_typ());
							r.trd_ret_qty(remainTrd);//未使用
							r.trd_unit_qty(remainTrd);
							
						}

						//明細に参照入荷実績ＮＯがないので受払からコピーする
						if (isNull(r.ref_arr_act_no())) {
							MCList<IoR> iol = r.getJoined(jk);
							for(IoR ir : iol) {
								if (!isNull(ir.ref_arr_act_no())) {
									r.ref_arr_act_no(ir.ref_arr_act_no());
									r.ref_arr_act_rev(ir.ref_arr_act_rev());
								}
							}
						}
					});
				
				down2.forEach(r -> {
					//残数計算
					if (!isNull(r.ret_qty())) {
						MCNumber remainBase = r.base_unit_qty().add(r.ret_qty().negate());
						r.base_unit_qty(remainBase);
						MCNumber remainTrd = rvrsBaseUnitConv(remainBase, 
								r.trd_unit_dmn_qty(), r.trd_unit_conv_qty(), 
								r.trd_unit_dec_place(), r.trd_unit_rnd_typ());
						r.trd_ret_qty(remainTrd);//未使用
						r.trd_unit_qty(remainTrd);
					}
				});
				
				editDownForSrch(down0, down1, 
						jk);

				calcAmt(down0, down1);
				
				down1.forEach(r -> {
					MSBDL_PurcUtil.setBaseCurInfo(down0, r);
					MSBDL_PurcUtil.setPtaxCurInfo(down0, r);
				});
				
			}
		}
	}
	
	/**
	 * 指定フラグがfalseのレートをマスタから取得します。
	 * @param r ヘッダ
	 */
	protected void editXrateIfInptFlgOff(HdrR r) {

		if (!r.xrate_inpt_flg()) {
			r.xrate(MAUCL_AmtUtil.getDefXrateNE(r.trd_cur_cd(), r.base_cur_cd(), 
					getCo().purc_xrate_cd(), r.purc_ret_dt()));
		}
		
		if (!r.ptax_xrate_inpt_flg()) {
			r.ptax_xrate(MAUCL_AmtUtil.getDefXrateNE(r.trd_cur_cd(), r.ptax_cur_cd(), 
				getCo().purc_xrate_cd(), r.purc_ret_dt()));
		}
	}
	
	/**
	 * Srch02オペレーション.<p>
	 *　入荷実績情報を検索する。
	 */
	public class Srch02 extends MSBDL_PurcRetActReg_MC_A.Srch02 {
		
		// 単票ではシンプルにdoSearchMainでDBからヘッダ、明細のデータを取得、editListMainでDBから取得したデータの加工をします
		// 定数名、時分項目、棚・ライン対象ＦＬＧの補完は親クラスで処理されるため、個々の実装は不要です。
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			
			editUp();
			
			int cnt = srchHdr();

			if (isSame(cnt, 0)) {
				return;
			}
			
			editUpForDtl();
			
			cnt = srchDtl();
			if (isSame(cnt, 0)) {
				down0().clearAll();
				return;
			}

			cnt = srchIO();
			if (isSame(cnt, 0)) {
				down0().clearAll();
				down1().clear();
				return;
			}

		}
		protected void editUpForDtl() {
			up0().setStringNE("ap_dpt_cd", down0().ap_dpt_cd());
		}
		
		protected void editUp() {
			//計上日の初期値となる運用日付を部門、住所の条件として使用する
			MCDate td = getToday();
			up0().addDateColumn("dpt_dt", td);
			up0().addDateColumn("addr_dt", td);
			
			up0().addStringColumn("base_cur_cd", getCo().base_cur_cd());
			up0().addStringColumn("ptax_cur_cd", getCo().ptax_cur_cd());
		}
		/**
		 * ヘッダを検索する。
		 *
		 * @return 検索件数
		 */
		protected int srchHdr() {
			return executeQuery(down0(), MSBDL5170_MST_ARR_ACT_S01(), up0());
		}

		/**
		 * 明細を検索する。
		 * 
		 * @return 検索件数
		 */
		protected int srchDtl() {
			return executeQuery(down1(), MSBDL5170_MST_ARR_ACT_S02(), up0());
		}

		/**
		 * 受払を検索する。
		 * 
		 * @return 検索件数
		 */
		protected int srchIO() {
			IoR d2 = IoR.create();
			d2.setValuesByName(down1().get(0));
			down2().add(d2);
			return 1;

		}

		
		@Override
		protected void editListMain() {
			super.editListMain();

			final HdrR down0 = down0();
			final MCList<DtlR> down1 = down1();
			final MCList<IoR> down2 = down2();
			if (!down0.isEmpty()) {
				
				callOutSrcActSprt02Service();
				
				//運用日付
				MCDate dt = up0().getDateNE("dpt_dt");
				down0.ac_dt(dt);
				down0.pay_basis_dt(dt);
				down0.purc_ret_dt(dt);

				editXrateIfInptFlgOff(down0);
				editDownForSrch(down0, down1, 
						down1.join(
						DtlR.$ref_purc_act_d_no, down2, IoR.$ref_purc_act_d_no));
				for (DtlR down1R :down1) {
					MSBDL_PurcUtil.setAmtInfo(down0, down1R);
					down1R.base_purc_ac_dt(dt);
				}
			}
		}
		
		/**
		 * 仕入実績がない場合に、入荷予定の製造指図ＮＯを元に購買区分を取得して明細に設定します。
		 */
		protected void callOutSrcActSprt02Service() {
			MSBCL_OutSrcActService.OutSrcAct_Sprt02 ope 
				= MSBCL_OutSrcActService.crtOutSrcAct_Sprt02();
			MCList<DtlR> dl = down1().subList(dr -> 
				isNull(dr.purc_ret_act_d_no()) && !isNull(dr.mfg_inst_no()));
			Map_OutSrcAct_Sprt02_CndR_DtlR<OutSrcAct_Sprt02_CndR,DtlR> map
				= createMap_OutSrcAct_Sprt02_CndR_DtlR();
			map.setWith(down0());
			addAll(ope.up0(), dl, map);
			ope.exec();
			MCIndexKey k = ope.down0().createIndex(OutSrcAct_Sprt02_RsltR.$peg_no);
			dl.forEach(dr -> {
				OutSrcAct_Sprt02_RsltR r = 
						ope.down0().getFirst(k, dr.peg_no());
				dr.purc_typ(r.purc_typ());
			});
		}
	}
	/**
	 * Srch03オペレーション.<p>
	 *　仕入実績情報を検索する。
	 */
	public class Srch03 extends MSBDL_PurcRetActReg_MC_A.Srch03 {
		
		// 単票ではシンプルにdoSearchMainでDBからヘッダ、明細のデータを取得、editListMainでDBから取得したデータの加工をします
		// 定数名、時分項目、棚・ライン対象ＦＬＧの補完は親クラスで処理されるため、個々の実装は不要です。
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			editUp();

			int cnt = srchHdr();
			
			if (isSame(cnt, 0)) {
				return;
			}

			cnt = srchDtl();
			if (isSame(cnt, 0)) {
				down0().clearAll();
				return;
			}

			cnt = srchIO();
			if (isSame(cnt, 0)) {
				down0().clearAll();
				down1().clear();
				return;
			}
			
		}
		
		protected void editUp() {

			//計上日の初期値となる運用日付を部門、住所の条件として使用する
			MCDate td = getToday();
			up0().addDateColumn("dpt_dt", td);
			up0().addDateColumn("addr_dt", td);
						
			up0().addStringColumn("base_cur_cd", getCo().base_cur_cd());
			up0().addStringColumn("ptax_cur_cd", getCo().ptax_cur_cd());

			if (MSC_PURC_SRCH_TGT_TYP.isPURC_ACT_NO(up0().srch_tgt_typ())) {
				up0().setStringNE("purc_act_no", up0().srch_tgt_no());
			}
			else {
				up0().setStringNE("purc_act_d_no", up0().srch_tgt_no());
			}
		}
				
		/**
		 * ヘッダを検索する。
		 *
		 * @return 検索件数
		 */
		protected int srchHdr() {
			if (isNull(up0().srch_tgt_no())) {
				return 0;
			}
			
			return executeQuery(down0(), MSBDL5170_MST_PURC_ACT_S01(), up0());
		}

		/**
		 * 明細を検索する。
		 * 
		 * @return 検索件数
		 */
		protected int srchDtl() {
			return executeQuery(down1(), MSBDL5170_MST_PURC_ACT_D_S01(), up0());
		}

		/**
		 * 受払を検索する。
		 * 
		 * @return 検索件数
		 */
		protected int srchIO() {
			executeQuery(down2(), MSBDL5170_MST_PURC_ACT_IO_S01(), up0());
			return down2().size();
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			final HdrR down0 = down0();
			final MCList<DtlR> down1 = down1();
			final MCList<IoR> down2 = down2();
			if (!down0.isEmpty()) {

				MCDate dt = up0().getDateNE("dpt_dt");
				down0.ac_dt(dt);
				down0.pay_basis_dt(dt);
				down0.purc_ret_dt(dt);
				
				MCJoinKey<MCList<IoR>> jk = down1.join(DtlR.$ref_purc_act_d_no, down2, IoR.$ref_purc_act_d_no);
				editDownForSrch(down0, down1, jk);
				
				for (DtlR dr :down1) {
					if (!MSC_STK_ID_TYP.isCOSTK(dr.stk_id_typ())) {
						dr.bd_dpt_cd(null);
						dr.bd_dpt_nm(null);
						dr.bd_itm_cd(null);
						dr.bd_itm_sub1(null);
						dr.bd_itm_sub2(null);
						dr.bd_itm_sub3(null);
						dr.bd_itm_nm(null);
						dr.bd_lot_mng_typ(null);
						dr.bd_sublot_mng_typ(null);
						dr.bd_lot_no_typ(null);
						dr.bd_sublot_no_typ(null);
						dr.bd_sno1_mng_typ(null);
						dr.bd_sno2_mng_typ(null);
						dr.bd_sno3_mng_typ(null);
						dr.bd_sno4_mng_typ(null);
						dr.bd_lot_no(null);
						dr.bd_sublot_no(null);
						dr.bd_sno1(null);
						dr.bd_sno2(null);
						dr.bd_sno3(null);
						dr.bd_sno4(null);
						dr.bd_bp_cd(null);
						dr.bd_bp_nm(null);
						dr.bd_loc_cd(null);
						dr.bd_loc_nm(null);
						dr.bd_ctg_cd(null);
						dr.bd_ctg_nm(null);
						dr.bd_oper_cd(null);
						dr.bd_oper_nm(null);
						dr.bd_iv_no(null);
						dr.bd_slo_no(null);
						dr.bd_po_no(null);
					}
					MCList<IoR> iol = dr.getJoined(jk);
					for(IoR ir :iol) {
						dr.base_ac_dt(ir.getDateNE(MST_PROV_ACT_R.$base_ac_dt));
					}
				}
			}
		}
	}
	/**
	 * Srch04オペレーション.<p>
	 * 仕入返品実績情報を検索する。
	 */
	public class Srch04 extends MSBDL_PurcRetActReg_MC_A.Srch04 {
		
		// 最新リビジョン
		protected MCNumber _latestRev;
		
		// 単票ではシンプルにdoSearchMainでDBからヘッダ、明細のデータを取得、editListMainでDBから取得したデータの加工をします
		// 定数名、時分項目、棚・ライン対象ＦＬＧの補完は親クラスで処理されるため、個々の実装は不要です。
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			editUp();
			
			int cnt = srchHdr();
		
			if (isSame(cnt, 0)) {
				down0().clearAll();
				return;
			}

			cnt = srchDtl();
			if (isSame(cnt, 0)) {
				down0().clearAll();
				return;
			}

			setPurcDdlvSlsRetFlg();
			
			checkOpeInPurcDdlvSlsRet();
			
			cnt = srchIO();
			if (isSame(cnt, 0)) {
				down0().clearAll();
				down1().clear();
				return;
			}
		}
		protected void editUp() {
			up0().addStringColumn("base_cur_cd", getCo().base_cur_cd());
			up0().addStringColumn("ptax_cur_cd", getCo().ptax_cur_cd());

			// 最新リビジョン取得
			setLastRev();
			
			// 検索条件のリビジョンが未入力の場合は、最新チェックがオンとみなす。
			if (isNull(up0().srch_tgt_rev())) {
				up0().srch_tgt_rev(_latestRev);
			}
			
			//purc_act_seqを取得する
			up0().addNumberColumn("purc_act_seq", getTgtPurcActSeq());
			
			if (!isSame(OPE_REF, up0().ope())) {
				up0().addStringColumn("tmp_can_flg", MCBooleanUtil.booleanToDBString(false));
			}
			else {
				up0().addStringColumn("tmp_can_flg", MCBooleanUtil.booleanToDBString(true));
			}
			if (isSame(_latestRev, up0().srch_tgt_rev())) {
				up0().addStringColumn("tmp_latest_flg", MCBooleanUtil.booleanToDBString(true));
			}
			else {
				up0().addStringColumn("tmp_latest_flg", MCBooleanUtil.booleanToDBString(false));
			}
			
		}
		
		/**
		 * 仕入直送売上返品により発生した仕入返品実績の場合、仕入直送売上返品ＦＬＧをtrueにします。
		 */
		protected void setPurcDdlvSlsRetFlg() {
			for (DtlR r : down1()) {
				if (!isNull(r.sls_act_d_no())) {
					down0().purc_ddlv_sls_ret_flg(true);
					break;
				}
			}
		}
		
		/**
		 * 仕入直送売上返品による仕入返品実績を検索した場合に<br>
		 * 操作種別が「参照」以外を選択していないかチェックします。<br>
		 * 「参照」以外の場合、エラーを返します。
		 */
		protected void checkOpeInPurcDdlvSlsRet() {
			if (down0().purc_ddlv_sls_ret_flg()) {
				if (isSame(up0().ope(), OPE_UPD)
						|| isSame(up0().ope(), OPE_DEL)) {
					throw new MCAppException(MSBDL0171);
				}
			}
		}

		/**
		 * 最新リビジョンを取得する
		 * @return
		 */
		protected void setLastRev() {
			up0().setStringNE("purc_ret_act_no", up0().srch_tgt_no());
			MST_PURC_RET_ACT_R h = HdrR.create("T");
			MCQueryApiBuilder h_bldr = MCQueryApiBuilder.create(h);
			h_bldr.setSelect(h.purc_ret_act_rev);
			dbSelectKey("MSBDL0160_MST_PURC_RET_ACT_S03", h, h_bldr, up0());
			_latestRev = h.purc_ret_act_rev();
		}
		
		/**
		 * 仕入返品実績のキーを使用して検索対象の仕入実績連番を取得する
		 */
		protected MCNumber getTgtPurcActSeq() {
			
			//新規がある場合、新規の連番を取得する。
			//新規がない場合、無効の中で最小の連番を取得する。
			MCList<MST_PURC_RET_ACT_R> hl = MCList.create(MST_PURC_RET_ACT_R.class);
			MST_PURC_RET_ACT_R t = MST_PURC_RET_ACT_R.create("T");
			MCQueryApiBuilder hl_bldr = MCQueryApiBuilder.create(t);
			MST_PURC_ACT_R a = MST_PURC_ACT_R.create("A");

			hl_bldr.setGroupBy(a.slip_sts_typ);
			hl_bldr.addMin(a.purc_act_seq, "seq");
			hl_bldr.addLeftOuterJoin(a, bracket(t.purc_ret_act_no.eq(a.purc_ret_act_no)
					.and(t.purc_ret_act_rev.eq(a.purc_ret_act_rev))
					.and(value(false).eq(MAC_SLIP_STS_TYP$IS_CAN(a.slip_sts_typ)))));
			dbSelectKey("MSBDL0160_MST_PURC_RET_ACT_S04", hl, hl_bldr, up0());
			
			MST_PURC_RET_ACT_R nr = hl.getFirst("slip_sts_typ", MAC_SLIP_STS_TYP.CRT.value());
			if (nr == null) {
				nr = hl.getFirst("slip_sts_typ", MAC_SLIP_STS_TYP.DIS.value());
			}
			if (nr == null) {
				return null;
			}
			return nr.getNumberNE("seq");
		}
		/**
		 * ヘッダを検索する。
		 *
		 * @return 検索件数
		 */
		protected int srchHdr() {
			int cnt = executeQuery(down0(), MSBDL5170_MST_PURC_RET_ACT_S01(), up0());
			down0().addStringColumn("tmp_can_flg", up0().getStringNE("tmp_can_flg"));
			down0().addStringColumn("tmp_latest_flg", up0().getStringNE("tmp_latest_flg"));
			return cnt;
		}

		/**
		 * 明細を検索する。
		 * 
		 * @return 検索件数
		 */
		protected int srchDtl() {
			return executeQuery(down1(), MSBDL5170_MST_PURC_RET_ACT_D_S01(), down0());
		}

		/**
		 * 受払を検索する。
		 * 
		 * @return 検索件数
		 */
		protected int srchIO() {
			return executeQuery(down2(), MSBDL5170_MST_PURC_RET_ACT_IO_S01(), down0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			final HdrR down0 = down0();
			final MCList<DtlR> down1 = down1();
			final MCList<IoR> down2 = down2();
			
			if (!down0.isEmpty()) {
				down0.newest_flg(isSame(down0.purc_ret_act_rev(),down0.purc_ret_act_rev_new()));
								
				MCJoinKey<MCList<IoR>> jk = down1.join(
						DtlR.$purc_ret_act_d_no, down2, IoR.$purc_ret_act_d_no);
				editDownForSrch(down0, down1, 
						jk);

				for (DtlR dr :down1) {
					
					//明細に参照入荷実績ＮＯがないので受払からコピーする
					if (isNull(dr.ref_arr_act_no())) {
						MCList<IoR> iol = dr.getJoined(jk);
						for(IoR ir : iol) {
							if (!isNull(ir.ref_arr_act_no())) {
								dr.ref_arr_act_no(ir.ref_arr_act_no());
								dr.ref_arr_act_rev(ir.ref_arr_act_rev());
							}
						}
					}
					
				}
				
				//打切数計算
				for (DtlR dr : down1) {
					
					//予定削除済取消実績データの場合nullになる
					if (dr.abort_flg()) {
						if (!isNullOr(dr.schd_qty(), dr.ret_qty())) {
							MCNumber remained = dr.schd_qty().add(dr.ret_qty().negate());
							dr.abort_qty(remained);
						}
					}
					MCList<IoR> iol = dr.getJoined(jk);
					for(IoR ir :iol) {
						dr.base_ac_dt(ir.getDateNE(MST_PROV_ACT_R.$base_ac_dt));
					}
				}
			}
		}
	}
	protected void editDownForSrch(HdrR down0, MCList<DtlR> down1, MCJoinKey<MCList<IoR>> jk) {

		editDownHdrForSrch(down0);

		editDownPegNo(down1, jk);
		
		for (DtlR dr :down1) {
			dr.str_ln_cd_none_flg(MAC_STR.isNULL_VAL(dr.str_ln_cd()));
			dr.purc_cont_qty(null);//仕入有効成分は詳細から計算する
			MCList<IoR> iol = dr.getJoined(jk);

			boolean multiGdIo = false;
			String igdCd = null;
			boolean multiLotIo = false;
			String ilotNo = null;
			boolean multiSubLotIo = false;
			String isublotNo = null;
			for(IoR ir: iol) {				
				ir.str_ln_cd_none_flg(MAC_STR.isNULL_VAL(ir.str_ln_cd()));
				MSBDL_PurcUtil.setCont(ir);
				MSBDL_PurcUtil.addCont(dr, ir);
				
				setDefaultStkCd(ir);
				if (!multiGdIo && isNull(igdCd)) {
					dr.gd_cd(ir.gd_cd());
					dr.gd_nm(ir.gd_nm());
					igdCd = ir.gd_cd();
				}
				else if (!isSame(igdCd, ir.gd_cd())){
					dr.gd_cd(null);
					dr.gd_nm(null);
					multiGdIo = true;
				}
				if (!multiLotIo && isNull(ilotNo)) {
					dr.lot_no(ir.lot_no());
					ilotNo = ir.lot_no();
				}
				else if (!isSame(ilotNo, ir.lot_no())){
					dr.lot_no(null);
					multiLotIo = true;
				}
				if (!multiSubLotIo && isNull(isublotNo)) {
					dr.sublot_no(ir.sublot_no());
					isublotNo = ir.sublot_no();
				}
				else if (!isSame(isublotNo, ir.sublot_no())){
					dr.sublot_no(null);
					multiSubLotIo = true;
				}
				if(!MAC_PURC_TYP.isPURC_ITM(dr.purc_typ())) {
					dr.repurc_obli_flg(down0.repurc_obli_flg());
					dr.outsrc_upri_typ(down0.outsrc_upri_typ());
				}
			}
		}
		
	}

	protected void setDefaultStkCd(MCRow r) {
		if (isNull(r.getString("gd_cd"))) {
			r.setString("gd_cd" ,getDefaultFeedStkGd().gd_cd());
			r.setString("gd_nm" ,getDefaultFeedStkGd().gd_nm());
		}
	}
	protected void editDownPegNo(MCList<DtlR> down1, MCJoinKey<MCList<IoR>> jk) {
		MCNumber dpeg = MCNumber.ZERO;
		MCNumber ipeg = MCNumber.ZERO;
		for (DtlR dr : down1) {
			dr.peg_no(dpeg);

			MCList<IoR> iol = dr.getJoined(jk);
			if (iol.size() > 0) {
				for (IoR ir : iol) {
					ir.dtl_peg_no(dpeg);
					ir.peg_no(ipeg);
					ipeg = ipeg.add(MCNumber.ONE);
				}
			}
			dpeg = dpeg.add(MCNumber.ONE);
		}
	}

	/**
	 * ヘッダ情報を編集します。
	 */
	protected void editDownHdrForSrch(HdrR r) {

		//通貨
		r.base_cur_cd(getBaseCur().cur_cd());
		r.base_cur_nm(getBaseCur().cur_nm());
		
		r.ptax_cur_cd(getPtaxCur().cur_cd());
		r.ptax_cur_nm(getPtaxCur().cur_nm());

		r.xrate_rnd_typ(getCo().xrate_rnd_typ());
		r.wtax_rnd_typ(getCo().wtax_rnd_typ());
		
		if(isNull(r.ap_dpt_cd()) && r.ap_dpt_flg()) {
			r.ap_dpt_cd(r.purc_dpt_cd());
		}
		
 	}
	/**
	 * 仕入返品予定ヘッダで上り電文ヘッダを上書きします。
	 */
	protected void copyPurcRetSchdToUp(HdrR up0, MST_PURC_RET_SCHD_R schdR) {
		if (!isNull(up0.purc_ret_schd_no())) {
			//購買部門、購買担当者、日付項目、備考、取引条件以外を予定から取得する
			//予定テーブルと実績テーブルの項目名は同じ前提で実装
			getPurcRetSchdToUpCols().forEach(s -> up0.setValue(s, schdR.getValue(s)));
		}
	}
	
	/**
	 * 仕入返品予定明細で上り電文明細を上書きします。
	 */
	protected void copyPurcRetSchdDToUp(MCList<DtlR> up1, Schd_DtlL<Schd_DtlR> schdD) {
		
		//金額情報、数量以外を予定から取得する
		MCList<DtlR> dtgt = up1.subList(r -> r.isStatusCreate());
		MCIndexKey dk = schdD.createIndex(MST_PURC_RET_SCHD_D_R.$purc_ret_schd_d_no);
		List<String> copyD = getPurcRetSchdDToUpCols();
		dtgt.forEach(dr -> {
			if (!isNull(dr.purc_ret_schd_d_no())) {
				MST_PURC_RET_SCHD_D_R sr = schdD.getFirst(dk, dr.purc_ret_schd_d_no());
				copyD.forEach(s -> {
					if (dr.contains(s)) {
						dr.setValue(s, sr.getValue(s));
					}
				});
			}
		});

	}

	/**
	 * 仕入返品予定受払で上り電文受払を上書きします。
	 */
	protected void copyPurcRetSchdIoToUp(MCList<IoR> up2, Schd_IoL<Schd_IoR> schdIO) {
		//金額情報、数量以外を予定から取得する
		MCList<IoR> iotgt = up2.subList(r -> r.isStatusCreate());
		MCIndexKey iok = schdIO.createIndex(MST_PURC_RET_SCHD_IO_R.$purc_ret_schd_io_no);
		List<String> copyIO = getPurcRetSchdIOToUpCols();
		iotgt.forEach(dr -> {
			if (!isNull(dr.purc_ret_schd_io_no())) {
				MST_PURC_RET_SCHD_IO_R ior = schdIO.getFirst(iok, dr.purc_ret_schd_io_no());
				copyIO.forEach(s -> {
					if (dr.contains(s)) {
						dr.setValue(s, ior.getValue(s));
					}
				});
				
			}
		});
	}
	/**
	 * 予定ヘッダの、上り電文ヘッダへ引き継ぐ項目を返します。
	 * @return 引継対象の予定項目
	 */
	protected List<String> getPurcRetSchdToUpCols() {
		java.util.List<String> schdCols = new ArrayList<>();
		schdCols.add(MST_PURC_RET_SCHD_R.$trd_cd);
		schdCols.add(MST_PURC_RET_SCHD_R.$trd_ptn_typ);
		schdCols.add(MST_PURC_RET_SCHD_R.$sppl_cd);
		schdCols.add(MST_PURC_RET_SCHD_R.$trd_cur_cd);
		return schdCols;
	}

	/**
	 * 予定明細の、上り電文明細へ引き継ぐ項目を返します。
	 * @return 引継対象の予定明細項目
	 */
	protected List<String> getPurcRetSchdDToUpCols() {
		java.util.List<String> schdCols = new ArrayList<>();
		schdCols.add(MST_PURC_RET_SCHD_D_R.$itm_cd);
		schdCols.add(MST_PURC_RET_SCHD_D_R.$itm_sub1);
		schdCols.add(MST_PURC_RET_SCHD_D_R.$itm_sub2);
		schdCols.add(MST_PURC_RET_SCHD_D_R.$itm_sub3);
		schdCols.add(MST_PURC_RET_SCHD_D_R.$trd_unit_cd);
		return schdCols;
	}
	
	
	/**
	 * 仕入返品予定受払の、上り電文受払へ引き継ぐ項目を返します。
	 * @return 引継対象の仕入返品予定受払項目
	 */
	protected List<String> getPurcRetSchdIOToUpCols() {
		java.util.List<String> schdCols = new ArrayList<>();
		schdCols.add(MST_PURC_RET_SCHD_IO_R.$trd_unit_cd);
		schdCols.add(MST_PURC_RET_SCHD_IO_R.$io_schd_pr_no);
		return schdCols;
	}
	
	/**
	 * 仕入実績ヘッダで上り電文ヘッダを上書きします。
	 */
	protected void copyPurcActToUp(HdrR up0, MST_PURC_ACT_R actR) {
		if (actR != null) {
			up0.purc_act_no(actR.purc_act_no());
			up0.purc_act_seq(actR.purc_act_seq());
			up0.xrate_cd(actR.xrate_cd());
			up0.ptax_cur_cd(actR.ptax_cur_cd());
		}
	}
	
	/**
	 * 仕入実績明細で上り電文明細を上書きします。
	 */
	protected void copyPurcActDToUp(MCList<DtlR> up1, MCList<MST_PURC_ACT_D_R> actD) {
		
		MCList<DtlR> dtgt = up1;
		MCIndexKey dk = actD.createIndex(MST_PURC_ACT_D_R.$purc_ret_act_d_no);
		dtgt.forEach(dr -> {
			if (isNull(dr.purc_ret_act_d_no())) {
				return;
			}
			MST_PURC_ACT_D_R sr = actD.getFirst(dk, dr.purc_ret_act_d_no());
			if (sr != null) {
				dr.purc_act_no(sr.purc_act_no());
				dr.purc_act_seq(sr.purc_act_seq());
				dr.purc_act_d_no(sr.purc_act_d_no());
				dr.purc_act_d_seq(sr.purc_act_d_seq());
				if (dr.isStatusCreate()) {
					dr.base_cur_tax_amt(sr.base_cur_tax_amt());
					dr.ptax_cur_upri(sr.ptax_cur_upri());
					dr.ptax_cur_amt(sr.ptax_cur_amt());
				}
			}
		
		});

	}

	/**
	 * 仕入実績受払で上り電文受払を上書きします。
	 */
	protected void copyPurcActIoToUp(MCList<IoR> up2, MCList<MST_PURC_ACT_IO_R> actIO) {
		MCList<IoR> iotgt = up2;
		MCIndexKey iok = actIO.createIndex(MST_PURC_ACT_IO_R.$purc_ret_act_io_no);
		iotgt.forEach(dr -> {
			if (isNull(dr.purc_ret_act_io_no())) {
				return;
			}
			MST_PURC_ACT_IO_R ior = actIO.getFirst(iok, dr.purc_ret_act_io_no());
			if (ior != null) {
				dr.purc_act_d_no(ior.purc_act_d_no());
				dr.purc_act_d_seq(ior.purc_act_d_seq());
				dr.purc_act_io_no(ior.purc_act_io_no());
				dr.purc_act_io_seq(ior.purc_act_io_seq());
			}
		});
	}
	protected void setStrLn(MCRow r, String purcRetLocCdCol, String strLnCdCol) {

		if (!isNull(r.getString(purcRetLocCdCol))) {
			if (isNull(r.getString(strLnCdCol))) {
				r.setValue(strLnCdCol, MAC_STR.NULL_VAL.value());
			}
		}
	}
	/**
	 * 在庫管理区分の設定 <p>
	 * 品目マスタの在庫管理区分・資産管理区分と、上り電文の経費購買FLGの組合せで、<br>
	 * 連携する在庫管理区分の値を決定し、入れ替える<br>
	 */
	protected void setStkMngTyp(DtlR r) {
		if (MSBDL_PurcUtil.isUpdStk(r.stk_mng_typ(), r.asset_mng_typ(), r.xpns_purc_flg())) {
			r.stk_mng_typ(MAC_STK_MNG_TYP.MNG.value());
		}
		
		else {
			r.stk_mng_typ(MAC_STK_MNG_TYP.NOT_MNG.value());
		}
		
	}
	protected void setBaseUnitQty(DtlR dtlR) {
		if (isSame(dtlR.trd_unit_cd(), dtlR.base_unit_cd())) {
			dtlR.base_unit_qty(dtlR.trd_unit_qty());
		}
		else {
			dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(),
					dtlR.trd_unit_dmn_qty(), dtlR.trd_unit_conv_qty(),
					dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
		}
	}

	protected void setBaseUnitQty(IoR ioR) {
		if (isSame(ioR.trd_unit_cd(), ioR.base_unit_cd())) {
			ioR.base_unit_qty(ioR.trd_unit_qty());
		}
		else {
			ioR.base_unit_qty(convToBaseUnit(ioR.trd_unit_qty(),
					ioR.trd_unit_dmn_qty(), ioR.trd_unit_conv_qty(),
					ioR.base_unit_dec_place(), ioR.base_unit_rnd_typ()));
		}
	}
	protected void setPackUnitQty(IoR dtlR) {
		if (dtlR.pack_flg()) {
			dtlR.pack_unit_cd(dtlR.trd_unit_cd());
			dtlR.pack_unit_qty(dtlR.trd_unit_qty());
		}
		else {
			dtlR.pack_unit_cd(dtlR.base_unit_cd());
			dtlR.pack_unit_qty(dtlR.base_unit_qty());
		}
	}
		
	/**
	 * 仕入返品予定情報をロックしてキャッシュします。
	 */
	protected <D extends mcframe.serverMSBD.MSBDL5170.DtlR, I extends mcframe.serverMSBD.MSBDL5170.IoR> MCMessageList cachePurcRetSchd(
			HdrR up0, MCList<D> up1, MCList<I> up2, Schd_HdrR schdH,
			Schd_DtlL<Schd_DtlR> schdDL, Schd_IoL<Schd_IoR> schdIOL) {
		MCMessageList msgL = new MCMessageList();

		msgL.addAll(checkUpdCntrPurcRetSchd(up0, schdH));

		if (msgL.size() > 0) {
			return msgL;
		}
		
		MSBDL_PurcRetRegService.selectSchdD(schdDL, schdH);

		MSBDL_PurcRetRegService.seletSchdIo(schdIOL, schdH);
		
		return msgL;
	}
	
	protected MCMessageList checkUpdCntrPurcRetSchd(HdrR up0, MST_PURC_RET_SCHD_R _schdR) {
		_schdR.setAlias("T");
		dbSelectKeyForUpdateNoWait("MSBDL0160_MST_PURC_RET_SCHD_S01", _schdR,
				MCQueryApiBuilder.create(Schd_HdrR.create()), up0);
		return checkUpdCntrNE(up0, HdrR.$pr_schd_upd_cntr, _schdR);
	}
	
	/**
	 * 仕入実績情報をロックしてキャッシュします。
	 * @param _actIOL_bldr 
	 * @param _actIOL_t 
	 * @param _actDL_bldr 
	 * @param _actDL_t 
	 */
	protected MCMessageList cachePurcAct(HdrR up0, MCList<DtlR> up1, MST_PURC_ACT_R actR,
			MCList<MST_PURC_ACT_D_R> actDL, MCList<MST_PURC_ACT_IO_R> actIOL) {
		MCMessageList msgL = new MCMessageList();

		msgL.addAll(checkUpdCntrPurcAct(up0, actR));

		if (msgL.size() > 0) {
			return msgL;
		}

		MST_PURC_ACT_D_R actDL_t = MST_PURC_ACT_D_R.create("T");
		MCQueryApiBuilder actDL_bldr = MCQueryApiBuilder.create(actDL_t);
		actDL_bldr.setWhere(actDL_t.purc_act_no.eq(bind("purc_act_no"))
				.and(actDL_t.purc_act_seq.eq(bind("purc_act_seq"))), actR);
		dbSelect("MSBDL0160_MST_PURC_ACT_D_S01", actDL, actDL_bldr);

		dbSelectColumn("MSBDL0160_MST_PURC_ACT_IO_S01", actIOL,
				MCQueryApiBuilder.create(MST_PURC_ACT_IO_R.create("T")),
				new String[] {MST_PURC_ACT_D_R.$purc_act_d_no, MST_PURC_ACT_D_R.$purc_act_d_seq}, actDL,
				new String[] {MST_PURC_ACT_D_R.$purc_act_d_no, MST_PURC_ACT_D_R.$purc_act_d_seq});
		
		return msgL;
	}

	protected MCMessageList checkUpdCntrPurcAct(HdrR up0, MST_PURC_ACT_R _actR) {
		MCQueryApiBuilder actR_bldr = MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T"));
		actR_bldr.setWhere(value(true).eq(MAC_SLIP_STS_TYP$IS_CRT(_actR.slip_sts_typ))
				.and(_actR.purc_ret_act_no.eq(bind("1"))), up0.purc_ret_act_no());
		dbSelectForUpdateNoWait("MSBDL0160_MST_PURC_ACT_S01", _actR, actR_bldr);
		return checkUpdCntrNE(up0, HdrR.$p_act_upd_cntr, _actR);
	}
	
	protected MCMessageList checkSub(HdrR up0, MCList<DtlR> up1_CU, MCList<IoR> up2, MCJoinKey<MCList<IoR>> d2i) {
		MCMessageList msgL = new MCMessageList();
		HdrR hr = up0;
		MCList<DtlR> dl = up1_CU;
					
		if (hr.err_flg()) {
			return msgL;
		}

		//自社在庫のリスト（支給戻しの結果自社在庫になるものも含む）
		MCList<DtlR> costkDtl = dl.createInstance();
		MCList<IoR> costkIo = up2.subList(dr -> 
			MSC_STK_ID_TYP.isCOSTK(dr.stk_id_typ()) || MSC_STK_ID_TYP.isONR_PROV(dr.stk_id_typ()));
		MCJoinKey<MCList<DtlR>> i2d = costkIo.join(IoR.$dtl_peg_no, dl, DtlR.$peg_no);
		MCList<DtlR> tmp = MCList.create(DtlR.class);
		costkIo.forEach(r -> {
			DtlR dr = r.getJoinedRow(i2d);
			if (dr != null && !dr.err_flg()) {
				tmp.add(dr);
			}
		});
		costkDtl.setAll(tmp);
		
		FXUCL_RequiredValidater rv = new FXUCL_RequiredValidater();
		if (costkIo.size() > 0) {
			if (!hr.sppl_iv_flg()) {
				msgL.addAll(check(hr, HdrR.$pay_basis_dt, rv));
			}
			else {
				if (hr.pay_spot_flg()) {
					msgL.addAll(check(hr, HdrR.$pay_schd_dt, rv));
				}
				else {
					msgL.addAll(check(hr, HdrR.$pay_basis_dt, rv));
				}
			}

			msgL.addAll(check(hr, HdrR.$trd_cur_cd, rv));

			if (hr.xrate_inpt_flg() || !isSame(hr.trd_cur_cd(), hr.base_cur_cd())) {
				msgL.addAll(check(hr, HdrR.$xrate, rv));
			}

			if (hr.ptax_xrate_inpt_flg() || !isSame(hr.ptax_cur_cd(), hr.base_cur_cd())) {
				msgL.addAll(check(hr, HdrR.$ptax_xrate, rv));
			}
		}
		
		
		if(!costkDtl.isEmpty()) {
			msgL.addAll(check(costkDtl, DtlR.$trd_cur_upri, rv));
			msgL.addAll(check(costkDtl, DtlR.$tax_cd, rv));
			if(!isNull(getCo().ptax_cur_cd())) {
				msgL.addAll(check(costkDtl, DtlR.$ptax_cur_tax_amt, rv));
			}
			msgL.addAll(check(costkDtl, DtlR.$ap_dpt_cd, rv));
			msgL.addAll(check(costkDtl, DtlR.$pay_crryovr_times, rv));
		
			if (MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(hr.trd_ptn_typ())) {
				msgL.addAll(check(costkDtl, DtlR.$bd_dpt_cd, new FXUCL_RequiredValidater(r -> {
					DtlR dr = (DtlR)r;
					return MAC_ASSET_MNG_TYP.isNOT_MNG(dr.asset_mng_typ()) || dr.xpns_purc_flg();
				})));
			}			
		}
		
		dl.forEach(dr -> {

			if (dr.sundry_itm_flg()) {
				msgL.addAll(check(dr, DtlR.$itm_nm, rv));
				if (hr.sppl_iv_flg()) {
					msgL.addAll(check(dr, DtlR.$iv_itm_nm, rv));
				}
			}
			
			// 経費購買の場合、資産管理しない品目しか登録できない
			if (MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(up0.trd_ptn_typ()) && MAC_ASSET_MNG_TYP.isMNG(dr.asset_mng_typ())) {
				msgL.add(new MCMessage(dr, null, MSBDL0194, toDispItm(dr.itm_cd(), dr.itm_sub1(), dr.itm_sub2(), dr.itm_sub3()),
						toDispGUIIndex(dr)));
			}
			// 資産管理する品目に経費理由を設定できない
			if (MAC_ASSET_MNG_TYP.isMNG(dr.asset_mng_typ()) && dr.xpns_purc_flg()) {
				msgL.add(new MCMessage(dr, null, MSBDL0150, toDispItm(dr.itm_cd(), dr.itm_sub1(), dr.itm_sub2(), dr.itm_sub3()),
						dr.ret_rsn_cd(), toDispGUIIndex(dr)));
			}
			// 資産管理しない品目には経費理由しか設定できない
			if (MAC_ASSET_MNG_TYP.isNOT_MNG(dr.asset_mng_typ()) && !dr.xpns_purc_flg()) {
				msgL.add(new MCMessage(dr, null, MSBDL0151, toDispItm(dr.itm_cd(), dr.itm_sub1(), dr.itm_sub2(), dr.itm_sub3()),
						dr.ret_rsn_cd(), toDispGUIIndex(dr)));
			}
			
			MCList<IoR> iol = dr.getJoined(d2i);
			if (iol != null) {
				iol = iol.subList(r -> !r.isStatusDelete());
				if (!MAC_LOT_MNG_TYP.isNOT_MNG(dr.lot_mng_typ())) {
					msgL.addAll(check(iol, IoR.$lot_no, rv));
				}
				if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(dr.sublot_mng_typ())) {
					msgL.addAll(check(iol, IoR.$sublot_no, rv));
				}

			}
			
			msgL.addAll(checkExistMfgInst(hr, dr));
		});			
		
		//定型エラーチェック（必須・存在チェック以外）
		msgL.addAll(checkWritableDptCdDac(hr, HdrR.$purc_dpt_cd));

		if (costkDtl.size() > 0) {
			msgL.addAll(check(costkDtl, 
					new String[]{DtlR.$trd_cur_upri},
					new FXUCL_SmallLargeValidater(null,
							MCNumber.ZERO, (MCNumber)null)));
			
			msgL.addAll(check(costkDtl, 
					new String[]{DtlR.$ptax_cur_tax_amt},
					new FXUCL_SmallLargeValidater(null,
							MCNumber.ZERO, (MCNumber)null)));
			
			msgL.addAll(check(costkDtl, 
					new String[]{DtlR.$trd_cur_upri},
					new FXUCL_PositiveValidater(
							r -> MAC_PURC_ID_TYP.isONR_RCV(((DtlR)r).purc_id_typ()))));
			msgL.addAll(check(costkDtl, DtlR.$trd_cur_dscnt_amt, new FXUCL_PositiveValidater()));
		}
		msgL.addAll(checkDecPlace(dl, DtlR.$trd_unit_dec_place, DtlR.$trd_unit_qty));
		for(DtlR dr : dl) {
			msgL.addAll(checkDecPlace(dr.getJoined(d2i), 
					IoR.$trd_unit_dec_place, IoR.$trd_unit_qty));
		}
		
		//固有チェック
		if (!hr.err_flg()) {
			for(DtlR dr : costkDtl) {
				//ヘッダの取引通貨が設定されていない場合
				if (isNull(hr.trd_cur_cd())) {
					hr.err_flg(true);
					MCMessagePool.add(new MCMessage(hr, 
							HdrR.$trd_cur_cd, MSBDL0007));
					break;
				}
				//単価0で値引額が登録されている場合
				MCMessageList ml = MSBDL_PurcUtil.checkDscntAmt(
						dr, Schd_DtlR.$trd_cur_upri, Schd_DtlR.$trd_cur_dscnt_amt);
				if (ml.size() > 0) {
					MCMessagePool.addAll(ml);
					dr.err_flg(true);
					hr.err_flg(true);
				}
			}
		}
		
		return msgL;
	}

	protected MCMessageList chkDtlAndIo(MCList<DtlR> up1, MCJoinKey<MCList<IoR>> d2i) {
		MCMessageList ml = new MCMessageList();
		up1.forEach(dr -> {
			MCList<IoR> il = dr.getJoined(d2i).subList(ir -> !ir.isStatusDelete());
			//上下段の合計数チェック
			MCNumber isum = il.sum(IoR.$base_unit_qty);
			if (!isSame(dr.base_unit_qty(), isum)) {
				ml.add(new MCMessage(dr, DtlR.$trd_unit_qty, MSBDL0135, 
						dr.base_unit_qty(), isum, toDispGUIIndex(dr)));
			}
			//上下段の有効成分チェック
			if (dr.cont_fctr_flg()) {
				MCNumber ios = il.sum(IoR.$purc_cont_qty);
				if (!isSame(dr.purc_cont_qty(), ios)) {
					ml.add(new MCMessage(dr, Schd_DtlR.$purc_cont_qty, MSBDL0160, 
							dr.purc_cont_qty(), ios, toDispGUIIndex(dr)));
				}
			}
		});
		return ml;
	}
	/**
	 * チェック処理（製造指図関連）
	 */
	protected MCMessageList checkExistMfgInst(HdrR hdrR, DtlR dtlR) {
		MCMessageList msgL = new MCMessageList();
		if (!isNull(dtlR.mfg_inst_no())) {
			MST_MFG_INST_R mfgInstR = _cacheMfgInst.get(dtlR.mfg_inst_no());
			MST_ITM_MFG_INST_R itmMfgInstR = _cacheItmMftInst.get(mfgInstR.itm_mfg_inst_no());
			
			if (!(isSame(dtlR.itm_cd(), itmMfgInstR.itm_cd())
					&& isSame(dtlR.itm_sub1(), itmMfgInstR.itm_sub1())
					&& isSame(dtlR.itm_sub2(), itmMfgInstR.itm_sub2())
					&& isSame(dtlR.itm_sub3(), itmMfgInstR.itm_sub3())
					&& isSame(dtlR.sno1(), itmMfgInstR.sno1())
					&& isSame(dtlR.sno2(), itmMfgInstR.sno2())
					&& isSame(dtlR.sno3(), itmMfgInstR.sno3())
					&& isSame(dtlR.sno4(), itmMfgInstR.sno4())
				)) {
				// 品目、手配ＮＯ不一致
				msgL.add(new MCMessage(dtlR, null, MSBDL0106, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
						toDispSno(dtlR.sno1(), dtlR.sno2(), dtlR.sno3(), dtlR.sno4()), dtlR.mfg_inst_no(), toDispGUIIndex(dtlR)));
			}
			if (!isSame(hdrR.sppl_cd(), itmMfgInstR.sppl_cd())) {
				// 発注先不一致
				msgL.add(new MCMessage(dtlR, null , MSBDL0107, hdrR.sppl_cd(), dtlR.mfg_inst_no(), toDispGUIIndex(dtlR)));
			}

		}
		return msgL;
	}
	protected void compSubImpl(HdrR up0, MCList<DtlR> up1, MCList<IoR> up2) {
		// 明細と受払のpeg_noは画面側で設定されていることを想定
		up0.peg_no(MCNumber.ONE);
		if(!up0.sppl_iv_flg()) {
			up0.rcpt_iv_no(null);
			up0.ref_rcpt_iv_no(null);
		}
		up1.forEach(r -> {
			r.hdr_peg_no(up0.peg_no());
			
			if (r.isStatusCreate()) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (r.isStatusModify()) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			else if (r.isStatusDelete()) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
			setStkMngTyp(r);
			
			r.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			r.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			setStrLn(r, DtlR.$purc_ret_loc_cd, DtlR.$str_ln_cd);

		});

		up2.forEach(r -> {
			if (r.isStatusCreate()) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (r.isStatusModify()) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			else if (r.isStatusDelete()) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
			r.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			r.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			setPackUnitQty(r);
			setStrLn(r, IoR.$purc_ret_loc_cd, IoR.$str_ln_cd);
		});

		setDispSeq(up1);
	}
	
	protected Map_OutSrcAct_Sprt02_CndR_DtlR<OutSrcAct_Sprt02_CndR,DtlR> createMap_OutSrcAct_Sprt02_CndR_DtlR() {
		return new Map_OutSrcAct_Sprt02_CndR_DtlR<OutSrcAct_Sprt02_CndR, DtlR>();
	}

	public class Map_OutSrcAct_Sprt02_CndR_DtlR<D extends OutSrcAct_Sprt02_CndR, S extends DtlR> extends MCRowMapper<D,S>{

		HdrR _hr;
		protected void setWith(HdrR hr) {
			_hr = hr;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(OutSrcAct_Sprt02_CndR.$peg_no, DtlR.$peg_no);
			addColumnPathMap(OutSrcAct_Sprt02_CndR.$mfg_inst_no, DtlR.$mfg_inst_no);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
		}
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 */
	public class Sprt01 extends MSBDL_PurcRetActReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected boolean isDelFlgCtl() {
			return true;
		}
		@Override
		protected boolean isReleaseFlgCtl() {
			return true;
		}
		@Override
		protected void doIt() {
			setUpriInfo();
		}
		
		/**
		 * 単価情報の取得および金額情報を算出します。
		 */
		protected void setUpriInfo() {
			MCList<DtlR> tmpL = MCList.create(DtlR.class);
			if (isNullOr(up0().sppl_cd(), up0().trd_cur_cd(), up0().purc_ret_dt())) {
				return;
			}
			
			for (DtlR r : up1()) {
				if (!isNullOr(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
						r.trd_unit_cd(), r.trd_unit_qty(), r.purc_ret_loc_wg_cd())) {
					tmpL.add(r);
				}
			}
			
			// 単価取得対象が存在しない場合中断
			if (tmpL.size() == 0) {
				return;
			}

			// 会社情報から為替レート端数処理区分、源泉徴収税端数処理区分を取得
			up0().xrate_rnd_typ(getCo().xrate_rnd_typ());
			up0().wtax_rnd_typ(getCo().wtax_rnd_typ());
			
			setPegNo(tmpL);
			
			MSBDL_PurcUtil.PurcUtil_Srch02 purcUtilSrch02 = MSBDL_PurcUtil.crtPurcUtil_Srch02();
			Map_PurcUtil_Srch02_DtlR_DtlR<PurcUtil_Srch02_DtlR,DtlR> map = createMap_PurcUtil_Srch02_DtlR_DtlR();
			map.setWith(up0());
			addAll(purcUtilSrch02.up0(), tmpL, map);
			
			purcUtilSrch02.exec();
			String[] destCols = {DtlR.$trd_cur_upri, DtlR.$trd_cur_proc_upri, DtlR.$trd_cur_onr_prov_upri, DtlR.$interim_flg};
			String[] srcCols = {PurcUtil_Srch02_DtlR.$trd_cur_upri, PurcUtil_Srch02_DtlR.$trd_cur_proc_upri, PurcUtil_Srch02_DtlR.$trd_cur_onr_prov_upri, PurcUtil_Srch02_DtlR.$interim_flg};
			copyByPegNo(tmpL, destCols, purcUtilSrch02.down0(), srcCols);
			
			down0().setAll(tmpL);
		}
		
		protected Map_PurcUtil_Srch02_DtlR_DtlR<PurcUtil_Srch02_DtlR,DtlR> createMap_PurcUtil_Srch02_DtlR_DtlR() {
			return new Map_PurcUtil_Srch02_DtlR_DtlR<PurcUtil_Srch02_DtlR, DtlR>();
		}

		public class Map_PurcUtil_Srch02_DtlR_DtlR<D extends PurcUtil_Srch02_DtlR, S extends DtlR> extends MCRowMapper<D,S>{
			protected HdrR _hr;
			protected void setWith(HdrR hr) {
				_hr = hr;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch02_DtlR.$peg_no, DtlR.$peg_no);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_cd, DtlR.$itm_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub1, DtlR.$itm_sub1);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub2, DtlR.$itm_sub2);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub3, DtlR.$itm_sub3);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$maker_cd, DtlR.$maker_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_cd, DtlR.$trd_unit_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_qty, DtlR.$trd_unit_qty);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$base_unit_qty, DtlR.$base_unit_qty);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$in_to_loc_cd, DtlR.$purc_ret_loc_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$tax_cd, DtlR.$tax_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$purc_typ, DtlR.$purc_typ);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$mfg_inst_no, DtlR.$mfg_inst_no);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno1, DtlR.$sno1);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno2, DtlR.$sno2);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno3, DtlR.$sno3);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno4, DtlR.$sno4);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$interim_flg, DtlR.$interim_flg);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$wg_cd, DtlR.$purc_ret_loc_wg_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$base_dt, DtlR.$base_dt); 
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.sppl_cd(_hr.sppl_cd());
				dest.cur_cd(_hr.trd_cur_cd());
				dest.itmdtl_base_dt(_hr.purc_ret_dt());
//				dest.dlv_cd(MAC_STR.NULL_VAL.value());
			}
		}
	}

	/**
	 * 品目詳細マスタの存在チェックを行います。
	 * @return
	 */
	protected MCMessageList existItmDtlCheck(HdrR hr, MCList<DtlR> dtlL, MCJoinKey<MCList<IoR>> d2i) {
		MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
		for (DtlR r : dtlL) {
			// 品目詳細マスタの存在チェックを行う
			MCList<IoR> iol = r.getJoined(d2i).subList(ir -> !ir.isStatusDelete()).groupBy(IoR.$purc_ret_loc_wg_cd);
			for(IoR i : iol) {
				MAM_ITM_DTL_R itmDtlR = MAM_ITM_DTL_R.create();
				itmDtlR.setAttributes(r);
				itmDtlR.itm_cd(r.itm_cd());
				itmDtlR.itm_sub1(r.itm_sub1());
				itmDtlR.itm_sub2(r.itm_sub2());
				itmDtlR.itm_sub3(r.itm_sub3());
				itmDtlR.sppl_cd(hr.sppl_cd());
				itmDtlR.maker_cd(r.maker_cd());
				itmDtlR.wg_cd(i.purc_ret_loc_wg_cd());
				itmDtlR.st_dt(hr.purc_ret_dt());
				itmDtlL.add(itmDtlR);
			}
		}
		return MSUCL_ProdUtil.chkItmDtlPurc(itmDtlL);
	}
	
	/**
	 * 負担項目の各種ＮＯの存在チェックを行います。
	 * @param dtlL 明細上り電文リスト(新規、または更新)
	 * @return メッセージリスト
	 */
	protected MCMessageList existBdCheck(MCList<DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();
		MCList<DtlR> bdLotChkTgtL = MCList.create(DtlR.class);
				
		for (DtlR dr : dtlL) {
			if (dr.getStatus() == MCRow.DELETE) {
				continue;
			}
			if (!isNull(dr.po_no())) {
				if (!existsPoNo(dr.po_no())) {
					msgL.add(new MCMessage(dr, DtlR.$po_no, MSBDL0084, dr.po_no(), toDispGUIIndex(dr)));
				}
			}
			if (!isNull(dr.bd_po_no())) {
				if (!existsPoNo(dr.bd_po_no())) {
					msgL.add(new MCMessage(dr, DtlR.$bd_po_no, MSBDL0175, dr.bd_po_no(), toDispGUIIndex(dr)));
				}
			}
			if (!isNull(dr.bd_slo_no())) {
				if (!existsSloNo(dr.bd_slo_no())) {
					msgL.add(new MCMessage(dr, DtlR.$bd_slo_no, MSBDL0177, dr.bd_slo_no(), toDispGUIIndex(dr)));
				}
			}
			if (!isNull(dr.bd_lot_no()) && !isNull(dr.bd_itm_cd())) {
				bdLotChkTgtL.add(dr);
			}
			if (!isNull(dr.bd_iv_no())) {
				if (!existsBdIvNo(dr.bd_iv_no())) {
					msgL.add(new MCMessage(dr, DtlR.$bd_iv_no, MSBDL0179, dr.bd_iv_no(), toDispGUIIndex(dr)));
				}
			}
			
		}		
		callLotServiceChkBdItm(bdLotChkTgtL);
		
		return msgL;
	}
	/**
	 * ロット存在チェックサービスを呼出し、負担ロットの存在チェックを行います。
	 * @param dtlL 明細上り電文リスト(新規、または更新)
	 */
	protected void callLotServiceChkBdItm(MCList<DtlR> dtlL) {
		if (dtlL.isEmpty()) {
			return;
		}		
		MSBFL_LotService.Lot_Chk03 ope = MSBFL_LotService.crtLot_Chk03();
		addAll(ope.up0(), dtlL, createMap_Lot_Chk03_CndR_DtlR());
		ope.exec();		
		copyErrFlg(dtlL, ope.up0());
	}

	/**
	 * 明細の金額計算を行う
	 */
	protected void calcAmt(HdrR srchHdr, MCList<DtlR> srchDtlL) {
		
		
		// ユーティリティ実行用の引数電文
		MCList<ConvQtyAmtUtil_Calc01_HdrR> hdrParmLst = MCList.create(ConvQtyAmtUtil_Calc01_HdrR.class);
		MCList<ConvQtyAmtUtil_Calc01_Dtl1R> dtl1ParmLst = MCList.create(ConvQtyAmtUtil_Calc01_Dtl1R.class);
		
		
		for (DtlR row : srchDtlL) {
			
			ConvQtyAmtUtil_Calc01_HdrR hdrParmRow = ConvQtyAmtUtil_Calc01_HdrR.create();
			hdrParmRow.peg_no(row.peg_no());
			hdrParmRow.trd_unit_cd(row.schd_trd_unit_cd());
			hdrParmRow.trd_unit_qty(row.schd_trd_unit_qty());
			hdrParmRow.trd_cur_upri(row.schd_trd_cur_upri());
			hdrParmRow.trd_cur_dscnt_amt(row.schd_trd_cur_dscnt_amt());
			hdrParmRow.trd_cur_proc_upri(row.schd_trd_cur_proc_upri());
			hdrParmRow.trd_cur_onr_prov_upri(row.schd_trd_cur_onr_prov_upri());
			hdrParmRow.trd_cur_amt(row.schd_trd_cur_amt());
			hdrParmRow.trd_cur_proc_amt(row.schd_trd_cur_proc_amt());
			hdrParmRow.trd_cur_onr_prov_amt(row.schd_trd_cur_onr_prov_amt());
			hdrParmRow.tax_rate(row.schd_tax_rate());
			hdrParmRow.inc_tax_flg(row.schd_inc_tax_flg());
			hdrParmRow.act_tax_rate(row.tax_rate());
			hdrParmRow.act_inc_tax_flg(row.inc_tax_flg());
			hdrParmRow.trd_cur_tax_amt(row.schd_trd_cur_tax_amt());
			MCRow rslt = getAmtAndTax(row.schd_trd_cur_upri(), row.schd_trd_unit_qty(), row.tax_rate(), row.inc_tax_flg(), 
					srchHdr.trd_cur_amt_dec_place(), srchHdr.purc_amt_rnd_typ(), srchHdr.purc_tax_rnd_typ(), row.schd_trd_cur_dscnt_amt());
			if (isNotTrnstPurcActD(rslt, row)) {
				hdrParmRow.trd_cur_inc_tax_amt(rslt.getNumberNE("inc_tax_amt"));
			}
			else {
				hdrParmRow.trd_cur_inc_tax_amt(row.trd_cur_amt().add(row.trd_cur_tax_amt()));
			}
			hdrParmRow.base_unit_dec_place(row.base_unit_dec_place());
			hdrParmRow.base_unit_rnd_typ(row.base_unit_rnd_typ());
			hdrParmRow.trd_unit_conv_qty(row.schd_trd_unit_conv_qty());
			hdrParmRow.trd_unit_conv_base_qty(row.schd_trd_unit_dmn_qty());
			hdrParmRow.trd_cur_cd(srchHdr.trd_cur_cd());
			hdrParmRow.amt_dec_place(srchHdr.trd_cur_amt_dec_place());
			hdrParmRow.upri_dec_place(srchHdr.trd_cur_upri_dec_place());
			hdrParmRow.amt_rnd_typ(srchHdr.purc_amt_rnd_typ());
			hdrParmRow.tax_rnd_typ(srchHdr.purc_tax_rnd_typ());
			hdrParmRow.wtax_rate(row.wtax_rate());
			hdrParmRow.schd_base_unit_qty(row.schd_base_unit_qty());
			hdrParmLst.add(hdrParmRow);
			
			ConvQtyAmtUtil_Calc01_Dtl1R dtl1ParmRow = ConvQtyAmtUtil_Calc01_Dtl1R.create();
			dtl1ParmRow.hdr_peg_no(row.peg_no());
			dtl1ParmRow.peg_no(row.peg_no());
			dtl1ParmRow.trd_unit_qty(row.trd_unit_qty());
			dtl1ParmRow.trd_unit_cd(row.trd_unit_cd());
			dtl1ParmRow.trd_unit_conv_base_qty(row.trd_unit_dmn_qty());
			dtl1ParmRow.trd_unit_conv_qty(row.trd_unit_conv_qty());
			dtl1ParmLst.add(dtl1ParmRow);
		
			
		}
		
		// 金額計算実行
		MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();
		ope.up0().addAll(hdrParmLst);
		ope.up1().addAll(dtl1ParmLst);
		
		ope.exec();
		
		// 実行結果を明細行に反映する
		String[] scopyCols = {DtlR.$trd_cur_upri,
				DtlR.$trd_cur_dscnt_amt,
				DtlR.$trd_cur_amt,
				DtlR.$trd_cur_tax_amt,
				DtlR.$trd_cur_inc_tax_amt,
				DtlR.$trd_unit_conv_qty,
				DtlR.$trd_unit_dmn_qty,
				DtlR.$trd_cur_proc_upri,
				DtlR.$trd_cur_onr_prov_upri,
				DtlR.$trd_cur_proc_amt,
				DtlR.$trd_cur_onr_prov_amt,
				DtlR.$wtax_amt};
		String[] copyCols = {ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_dscnt_amt,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_tax_amt,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_inc_tax_amt,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_qty,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_base_qty,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_proc_upri,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_onr_prov_upri,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_proc_amt,
				ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_onr_prov_amt,
				ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_amt};
		
		copyByPegNo(srchDtlL, scopyCols, ope.down0(), copyCols);
		
		for (DtlR dtlRow : srchDtlL) {
			calcRepurcObliTax(srchHdr, dtlRow);
			// 単価・値引額・金額・税額
			dtlRow.base_cur_upri(convToBaseCur(dtlRow.trd_cur_upri(), srchHdr.xrate(), srchHdr.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			dtlRow.base_cur_dscnt_amt(convToBaseCur(dtlRow.trd_cur_dscnt_amt(), srchHdr.xrate(), srchHdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlRow.base_cur_amt(convToBaseCur(dtlRow.trd_cur_amt(), srchHdr.xrate(), srchHdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlRow.base_cur_tax_amt(convToBaseCur(dtlRow.trd_cur_tax_amt(), srchHdr.xrate(), srchHdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			// 加工単価・金額
			dtlRow.base_cur_proc_upri(convToBaseCur(dtlRow.trd_cur_proc_upri(), srchHdr.xrate(), srchHdr.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			dtlRow.base_cur_proc_amt(convToBaseCur(dtlRow.trd_cur_proc_amt(), srchHdr.xrate(), srchHdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			// 有償支給単価・金額
			dtlRow.base_cur_onr_prov_upri(convToBaseCur(dtlRow.trd_cur_onr_prov_upri(), srchHdr.xrate(), srchHdr.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			dtlRow.base_cur_onr_prov_amt(convToBaseCur(dtlRow.trd_cur_onr_prov_amt(), srchHdr.xrate(), srchHdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			
			if (!isNull(srchHdr.ptax_cur_cd())) {
				dtlRow.ptax_cur_upri(convCur(dtlRow.trd_cur_upri(), srchHdr.xrate(), srchHdr.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
				dtlRow.ptax_cur_dscnt_amt(convCur(dtlRow.trd_cur_dscnt_amt(), srchHdr.xrate(), srchHdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlRow.ptax_cur_amt(convCur(dtlRow.trd_cur_amt(), srchHdr.xrate(), srchHdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlRow.ptax_cur_tax_amt(convCur(dtlRow.trd_cur_tax_amt(), srchHdr.xrate(), srchHdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));					
				
				// 加工単価・金額
				dtlRow.ptax_cur_proc_upri(convCur(dtlRow.trd_cur_proc_upri(), srchHdr.xrate(), srchHdr.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
				dtlRow.ptax_cur_proc_amt(convCur(dtlRow.trd_cur_proc_amt(), srchHdr.xrate(), srchHdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));

				// 有償支給単価・金額
				dtlRow.ptax_cur_onr_prov_upri(convCur(dtlRow.trd_cur_onr_prov_upri(), srchHdr.xrate(), srchHdr.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
				dtlRow.ptax_cur_onr_prov_amt(convCur(dtlRow.trd_cur_onr_prov_amt(), srchHdr.xrate(), srchHdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			}
		}

	}

	protected boolean isNotTrnstPurcActD(MCRow rslt, DtlR row) {
		if (isNullAnd(row.ref_purc_act_d_no(), row.ref_purc_act_d_seq())){
			return true;
		}
		if (isSame(rslt.getNumberNE("amt"), row.trd_cur_amt())
				&& isSame(rslt.getNumberNE("tax_amt"), row.trd_cur_tax_amt())) {
			return true;
		}
		return false;
	}

	/**
	 * 買戻義務の場合の税額を計算します
	 * @param hdrR
	 * @param dtlL
	 */
	protected void calcRepurcObliTax(HdrR hdrR, DtlR dtlR) {
		if(MAC_PURC_TYP.isPURC_ITM(dtlR.purc_typ()) || !dtlR.repurc_obli_flg()) {
			return;
		}
		MCNumber amt = getAmt(dtlR.trd_cur_upri(),
				dtlR.trd_unit_qty(),
				hdrR.trd_cur_amt_dec_place(),
				hdrR.purc_tax_rnd_typ(),
				dtlR.trd_cur_dscnt_amt());
		if(dtlR.inc_tax_flg()) {
			// 内税の場合、有償支給単価を税額に含めないために、一旦加工単価×数量で導出し、後続処理で税額を差し引く
			MCNumber proc_inc_tax_amt = getAmt(dtlR.trd_cur_proc_upri(),
					dtlR.trd_unit_qty(),
					hdrR.trd_cur_amt_dec_place(),
					hdrR.purc_tax_rnd_typ(),
					dtlR.trd_cur_dscnt_amt());
			dtlR.trd_cur_proc_amt(proc_inc_tax_amt);
			// 有償支給金額は金額-加工金額
			dtlR.trd_cur_onr_prov_amt(!isNull(amt) ? amt.subtract(proc_inc_tax_amt) : null);
		}
		MCNumber trdCurTaxAmt = getTaxAmt(
				dtlR.trd_cur_proc_amt(),
				dtlR.tax_rate(),
				hdrR.trd_cur_amt_dec_place(),
				hdrR.purc_tax_rnd_typ(),
				dtlR.inc_tax_flg()
				);
		dtlR.trd_cur_tax_amt(trdCurTaxAmt);
		if(dtlR.inc_tax_flg()) {
			amt = (amt != null) ? amt.subtract(trdCurTaxAmt) : null;
			MCNumber proc_amt = !isNull(dtlR.trd_cur_proc_amt()) ? dtlR.trd_cur_proc_amt().subtract(trdCurTaxAmt) : MCNumber.ZERO;
			dtlR.trd_cur_amt(amt);
			dtlR.trd_cur_proc_amt(proc_amt);
		}
		dtlR.trd_cur_inc_tax_amt(dtlR.trd_cur_amt() != null ? dtlR.trd_cur_amt().add(trdCurTaxAmt) : null);
	}
	/**
	 * キャッシュ作成（製造指図）
	 * @param bindL
	 * @return
	 */
	protected void createCacheMfgInst(MCList<DtlR> dtlL) {
		MCList<MST_MFG_INST_R> mfgInstL = MCList.create(MST_MFG_INST_R.class);
		_cacheMfgInst = new FXUCL_MCDbcCache<MST_MFG_INST_R>(mfgInstL,
				MCQueryApiBuilder.create(MST_MFG_INST_R.create("T")),
				dtlL.groupBy(DtlR.$mfg_inst_no), DtlR.$mfg_inst_no);
		// 品目製造指図
		createCacheItmMfgInst(mfgInstL);
	}
	/**
	 * キャッシュ作成（品目製造指図）
	 * @param bindL
	 * @return
	 */
	protected void createCacheItmMfgInst(MCList<MST_MFG_INST_R> mfgInstL) {
		_cacheItmMftInst = new FXUCL_MCDbcCache<MST_ITM_MFG_INST_R>(
				MCQueryApiBuilder.create(MST_ITM_MFG_INST_R.create("T")),
				mfgInstL.groupBy(MST_MFG_INST_R.$itm_mfg_inst_no),
				MST_MFG_INST_R.$itm_mfg_inst_no);
	}
	/**
	 * エラーフラグを設定する
	 */
	protected void setParentErrFlg(HdrR up0, MCList<DtlR> up1) {
		for(DtlR dr:up1){
			if(dr.err_flg()) {
				up0.err_flg(true);
				return;
			}				
		}
	}

	protected void chkDpt(HdrR up0, MCList<DtlR> up1) {
		setDpt(up0, HdrR.$purc_dpt_cd, HdrR.$ac_dt);
		up1.addDateColumn(HdrR.$ac_dt, up0.ac_dt());
		setDpt(up1, DtlR.$ap_dpt_cd, HdrR.$ac_dt);
		setDpt(up1, DtlR.$bd_dpt_cd, HdrR.$ac_dt);
	}
	protected Map_Lot_Chk03_CndR_DtlR<Lot_Chk03_CndR,DtlR> createMap_Lot_Chk03_CndR_DtlR() {
		return new Map_Lot_Chk03_CndR_DtlR<Lot_Chk03_CndR, DtlR>();
	}

	public class Map_Lot_Chk03_CndR_DtlR<D extends Lot_Chk03_CndR, S extends DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk03_CndR.$peg_no, DtlR.$peg_no);
			addColumnPathMap(Lot_Chk03_CndR.$itm_cd, DtlR.$bd_itm_cd);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, DtlR.$bd_itm_sub1);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, DtlR.$bd_itm_sub2);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, DtlR.$bd_itm_sub3);
			addColumnPathMap(Lot_Chk03_CndR.$lot_no, DtlR.$bd_lot_no);
			addColumnPathMap(Lot_Chk03_CndR.$sublot_no, DtlR.$bd_sublot_no);
			addColumnPathMap(Lot_Chk03_CndR.$err_flg, DtlR.$err_flg);
		}
	}

	//FMCB CUSTOM END
}