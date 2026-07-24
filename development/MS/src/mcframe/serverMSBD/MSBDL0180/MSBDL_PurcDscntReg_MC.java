package mcframe.serverMSBD.MSBDL0180;

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
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonFXUC.FXUCC0090.FXUCC_RowMapperWith;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverMSBD.MSBDL0180.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil;
import mcframe.serverMSBD.MSBDL5240.MSBDL_PurcDscntRegService;
import mcframe.serverMSBD.MSBDL5240.PurcDscnt_Ins01_DtlR;
import mcframe.serverMSBD.MSBDL5240.PurcDscnt_Ins01_HdrR;
import static mcframe.serverMSBD.MSBDL0180.Query.*;
import mcframe.commonMAUA.MAUAC0010.MAUAC_List;
import static mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil.*;
import mcframe.serverMSBF.MSBFL5210.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcDscntReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcDscntReg_MC extends MSBDL_PurcDscntReg_MC_A{
	//FMCB CUSTOM START
	//----------------------------
	// Cache
	//----------------------------
	/** 製造指図 */
	protected FXUCL_MCDbcCache<MST_MFG_INST_R> _cacheMfgInst = null;
	/** 仕入実績ヘッダ */
	protected MST_PURC_ACT_R _cachePurcActR = MST_PURC_ACT_R.create();
	/** 仕入実績明細 */
	protected MCList<MST_PURC_ACT_D_R> _cachePurcActD = MCList.create(MST_PURC_ACT_D_R.class);
	/** 仕入実績受払 */
	protected MCList<MST_PURC_ACT_IO_R> _cachePurcActIo = MCList.create(MST_PURC_ACT_IO_R.class);
	/** 仕入実績明細(参照用) */
	protected MCList<MST_PURC_ACT_D_R> _cachePurcActDForRef = MCList.create(MST_PURC_ACT_D_R.class);
	/** 品目製造指図 */
	protected FXUCL_MCDbcCache<MST_ITM_MFG_INST_R> _cacheItmMftInst = null;

	protected FXUCL_MCDbcCache<MAM_SUNDRY_ITM_R> _sundryItmCache = null;

	protected void createSundryItmCache(MCList<Chk01_DtlR>  dtlL) {

		MAM_SUNDRY_ITM_R t = MAM_SUNDRY_ITM_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.itm_nm);
		_sundryItmCache = new FXUCL_MCDbcCache<MAM_SUNDRY_ITM_R>(dbc_bldr, dtlL,
				Chk01_DtlR.$itm_cd, Chk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub2,
				Chk01_DtlR.$itm_sub3, Chk01_DtlR.$sno1, Chk01_DtlR.$sno2,
				Chk01_DtlR.$sno3, Chk01_DtlR.$sno4);
	}

	protected MAM_SUNDRY_ITM_R getSundryItm(String itmCd, String itmSub1, String itmSub2, String itmSub3, String sno1, String sno2, String sno3,
			String sno4) {
		return _sundryItmCache.get(itmCd, itmSub1, itmSub2, itmSub3, sno1, sno2, sno3, sno4);
	}
	//----------------------------
	// IndexKey
	//----------------------------
	/** 仕入実績明細 */
	protected MCIndexKey _idxCachePurcActD = null;
	/** 仕入実績受払 */
	protected MCIndexKey _idxCachePurcActIo = null;
	/** 仕入実績明細(参照用) */
	protected MCIndexKey _idxCachePurcActDForRef = null;
	/** 品目製造指図 */
	protected MCIndexKey _idxItmMnfctInstL = null;
	//----------------------------
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 参照仕入実績ＮＯより仕入情報を検索する<br>
	 */
	public class Srch01 extends MSBDL_PurcDscntReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			// 検索条件の編集
			editUp();
			// ヘッダ検索
			int cnt = srchPurcActHdr();
			// ヘッダが検索できない場合、処理終了
			if (isSame(cnt, 0)) {
				return;
			}
			// 明細検索
			srchPurcActDtl();
			if (down1().size() == 0) {
				down0().clear();
			}
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			setDefaultApDpt(down0());
		}
		/**
		 * 検索条件を編集します
		 */
		protected void editUp() {
			// 参照実績ＮＯの最新の改訂を取得
			MST_PURC_ACT_R purcActR = MST_PURC_ACT_R.create();
			MST_PURC_ACT_R t = MST_PURC_ACT_R.create("T");
			MCQueryApiBuilder purcActR_bldr = MCQueryApiBuilder.create(t);
			purcActR_bldr.setSelect(max(t.purc_act_rev).as("purc_act_rev"));
			purcActR_bldr.setWhere(t.purc_act_no.eq(bind("1")), up0().srch_tgt_no());
			purcActR_bldr.addWhereWithAnd(t.slip_sts_typ.eq(bind("1")),
					MAC_SLIP_STS_TYP.CRT.value());
			dbSelect("MSBDL0180_MST_PURC_ACT_S01", purcActR, purcActR_bldr);
			up0().rev_no(purcActR.purc_act_rev());
			
			up0().addDateColumn("today", getToday());
		}
		/**
		 * 仕入実績ヘッダを検索する。
		 *
		 * @return 検索件数
		 */
		protected int srchPurcActHdr() {
			return executeQuery(down0(), MSBDL0180_MST_PURC_ACT_S01(), up0());
		}
		/**
		 * 仕入実績明細を検索する。
		 */
		protected void srchPurcActDtl() {
			// 表示順でソート
			executeQuery(down1(), MSBDL0180_MST_PURC_ACT_D_S01(), down0());
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 仕入実績ＮＯより仕入情報を検索する<br>
	 */
	public class Srch02 extends MSBDL_PurcDscntReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			// 検索条件の編集
			editUp();
			// ヘッダ検索
			int cnt = srchPurcActHdr();
			// ヘッダが検索できない場合、処理終了
			if (isSame(cnt, 0)) {
				return;
			}
			
			// 操作種別が「訂正」または「取消」、かつ、仕入実績が取り消されている場合は、
			// メッセージを表示し、検索処理を中断する。
			if ((isSame(up0().ope(), OPE_UPD) || isSame(up0().ope(),OPE_DEL))
					&& down0().can_flg()) { 
				throw new MCAppException(new MCMessage(MSBDL0170, down0().purc_act_no()));
			}
			
			// 明細検索
			srchPurcActDtl();
			if (down1().size() == 0) {
				down0().clear();
			}
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			setDefaultApDpt(down0());
		}
		/**
		 * 検索条件を編集します
		 */
		protected void editUp() {
			if (up0().latest_flg()) {
				// 最新の改訂を取得
				MST_PURC_ACT_R purcActR = MST_PURC_ACT_R.create();
				MST_PURC_ACT_R t = MST_PURC_ACT_R.create("T");
				MCQueryApiBuilder purcActR_bldr = MCQueryApiBuilder.create(t);
				purcActR_bldr.setSelect(max(t.purc_act_rev).as("purc_act_rev"));
				purcActR_bldr.setWhere(t.purc_act_no.eq(bind("1")), up0().srch_tgt_no());
				dbSelect("MSBDL0180_MST_PURC_ACT_S02", purcActR, purcActR_bldr);
				up0().rev_no(purcActR.purc_act_rev());

				up0().addDateColumn("today", getToday());
			}
		}
		/**
		 * 仕入実績ヘッダを検索する。
		 *
		 * @return 検索件数
		 */
		protected int srchPurcActHdr() {
			return executeQuery(down0(), MSBDL0180_MST_PURC_ACT_S02(), up0());
		}
		/**
		 * 仕入実績明細を検索する。
		 */
		protected void srchPurcActDtl() {
			// 表示順でソート
			executeQuery(down1(), MSBDL0180_MST_PURC_ACT_D_S02(), down0());
		}
	}

	protected void setDefaultApDpt(Srch01_HdrR r) {
		if(isNull(r.ap_dpt_cd()) && r.ap_dpt_flg()) {
			r.ap_dpt_cd(r.purc_dpt_cd());
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 仕入値引情報の登録をする前に、チェックを実行します。<br>
	 */
	public class Chk01 extends MSBDL_PurcDscntReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				// 仕入値引登録サービスチェック処理実行
				callPurcDscntRegServiceChk01();
			}
			setDown();
		}
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// キャッシュ作成
			createCache();
			// 各負担項目ＮＯの存在チェック用のトランザクションデータを取得する
			getDataForExistChk(up1());
			return msgL;
		}
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			if (hasErrFlgOn(up0(), up1())) {
				return msgL;
			}
			
			// 更新データのDACチェック処理
			msgL.addAll(checkWritableDptCdDac(up0(), Chk01_HdrR.$purc_dpt_cd));

			msgL.addAll(checkDtlSub(up0(), up1()));
			
			completionDtl();
			completion(up0(), up1());

			msgL.addAll(thisCheck());
			return msgL;
		}
		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			// 債務部門
			ListLogicBind apDptBind = getListLogicBind(up1(), Chk01_DtlR.$ap_dpt_cd);
			apDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$ac_dt);
			// 負担部門
			ListLogicBind bdDptBind = getListLogicBind(up1(), Chk01_DtlR.$bd_dpt_cd);
			bdDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$ac_dt);
		}
		@Override
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row, String column) {
			if (isSame(paramIndex, 0)) {
				// 諸口品の場合は品名補完しない
				if (isSame(column, Chk01_DtlR.$itm_nm)) {
					if (row.getBoolean(Chk01_DtlR.$sundry_itm_flg)) {
						return false;
					}
				}
			}
			return super.isSetListLogicValue(paramIndex, row, column);
		}
		/**
		 * キャッシュ作成
		 */
		protected void createCache() {
			// 製造指図
			createCacheMfgInst(up1());
			// 仕入実績明細(参照用)
			createCachePurcActDForRef(up1());
			createSundryItmCache(up1());
		}
		/**
		 * 補完処理
		 */
		protected void completionDtl() {
			// 固定値の補完
			up0().setStringNE(Chk01_HdrR.$ptax_cur_cd, getCo().ptax_cur_cd());
			up0().setStringNE(Chk01_HdrR.$base_cur_cd, getCo().base_cur_cd());
			// 明細補完処理
			for (Chk01_DtlR r : up1()) {
				setSundryItmNm(r);
			}			
		}

		
		/**
		 * チェック処理
		 * @return
		 */
		protected MCMessageList thisCheck() {
			MCMessageList msgL = new MCMessageList();
			// 新規・更新時共通チェック処理をコール
			msgL.addAll(thisCheckCommon(up0(), up1()));
			// 新規時固有チェック
			msgL.addAll(thisCheckWhenIns());
			return msgL;
		}
		
		/**
		 * 新規時特有のチェック処理
		 */
		protected MCMessageList thisCheckWhenIns() {
			MCMessageList msgL = new MCMessageList();
			// 固有チェックは特になし
			return msgL;
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}
		/**
		 * 仕入値引サービスのチェック処理を呼出す
		 */
		protected void callPurcDscntRegServiceChk01() {
			MSBDL_PurcDscntRegService.PurcDscnt_Chk01 ope = MSBDL_PurcDscntRegService.crtPurcDscnt_Chk01();
			// 上り電文設定（up0）
			PurcDscnt_Ins01_HdrR hdrR = PurcDscnt_Ins01_HdrR.create();
			copy(hdrR, up0(), createMap_PurcDscnt_Ins01_HdrR_Chk01_HdrR());
			hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			ope.up0().add(hdrR);
			// 上り電文設定（up1）
			addAll(ope.up1(), up1(), up0(), createMap_PurcDscnt_Ins01_DtlR_Chk01_DtlR());
			// サービスコール
			ope.exec();
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 仕入値引情報の更新をする前に、チェックを実行します。<br>
	 */
	public class Chk02 extends MSBDL_PurcDscntReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				// 仕入値引登録サービスチェック処理実行
				callPurcDscntRegServiceChk01();
			}
			setDown();
		}
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// キャッシュ作成
			createCache();
			// 各負担項目ＮＯの存在チェック用のトランザクションデータを取得する
			getDataForExistChk(up1());
			return msgL;
		}
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			if (hasErrFlgOn(up0(), up1())) {
				return msgL;
			}
			
			// 更新前DACチェック処理
			msgL.addAll(checkWritableDptCdDac(_cachePurcActR, MST_PURC_ACT_R.$purc_dpt_cd));
			
			// 更新後DACチェック処理
			msgL.addAll(checkWritableDptCdDac(up0(), Chk01_HdrR.$purc_dpt_cd));
			msgL.addAll(check(up0(), Chk01_HdrR.$can_ac_dt, new FXUCL_BeforeTodayValidater()));

			msgL.addAll(checkDtlSub(up0(), up1()));
			
			// 補完処理
			msgL.addAll(completionDtl());
			completion(up0(), up1());
			
			msgL.addAll(thisCheck());
			return msgL;
		}
		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			// 債務部門
			ListLogicBind apDptBind = getListLogicBind(up1(), Chk01_DtlR.$ap_dpt_cd);
			apDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$ac_dt);
			// 負担部門
			ListLogicBind bdDptBind = getListLogicBind(up1(), Chk01_DtlR.$bd_dpt_cd);
			bdDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$ac_dt);
		}
		@Override
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row, String column) {
			if (isSame(paramIndex, 0)) {
				// 諸口品の場合は品名補完しない
				if (isSame(column, Chk01_DtlR.$itm_nm)) {
					if (row.getBoolean(Chk01_DtlR.$sundry_itm_flg)) {
						return false;
					}
				}
			}
			return super.isSetListLogicValue(paramIndex, row, column);
		}
		/**
		 * キャッシュ作成
		 */
		protected void createCache() {
			// 仕入実績ヘッダ
			createCachePurcAct(up0());
			// 仕入実績明細
			createCachePurcActD();
			// 仕入実績受払
			createCachePurcActIo();
			// 仕入実績明細(参照用)
			createCachePurcActDForRef(up1());
			// 製造指図
			createCacheMfgInst(up1());
			createSundryItmCache(up1());
		}
		/**
		 * 補完処理
		 */
		protected MCMessageList completionDtl() {
			MCMessageList msgL = new MCMessageList();
			// 仕入実績ヘッダ
			msgL.addAll(competionPurcAct());
			// 明細補完処理
			for (Chk01_DtlR r : up1()) {
				// 仕入実績明細
				msgL.addAll(competionPurcActD(r));
				setSundryItmNm(r);
			}
			
			return msgL;
		}
		/**
		 * 補完処理（仕入実績ヘッダ）
		 */
		protected MCMessageList competionPurcAct() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$upd_cntr, _cachePurcActR));
			if (msgL.size() == 0) {
				up0().purc_act_rev(_cachePurcActR.purc_act_rev());
				up0().sppl_cd(_cachePurcActR.sppl_cd());
			}
			return msgL;
		}
		/**
		 * 補完処理（仕入実績明細）
		 */
		protected MCMessageList competionPurcActD(Chk01_DtlR r) {
			MCMessageList msgL = new MCMessageList();
			if (isNull(r.purc_act_d_no())) {
				return msgL;
			}

			if (msgL.size() == 0) {
				MST_PURC_ACT_IO_R purcActIoR = _cachePurcActIo.getFirst(_idxCachePurcActIo, r.purc_act_d_no(), r.purc_act_d_seq());
				r.purc_act_no(_cachePurcActR.purc_act_no());
				r.purc_act_seq(_cachePurcActR.purc_act_seq());
				r.purc_act_io_no(purcActIoR.purc_act_io_no());
				r.purc_act_io_seq(purcActIoR.purc_act_io_seq());
			}
			return msgL;
		}
		
		/**
		 * チェック処理
		 * @return
		 */
		protected MCMessageList thisCheck() {
			MCMessageList msgL = new MCMessageList();
			// 新規・更新時共通チェック処理をコール
			msgL.addAll(thisCheckCommon(up0(), up1()));
			// 更新時固有チェック
			msgL.addAll(thisCheckWhenUpd());
			return msgL;
		}
		/**
		 * 新規時特有のチェック処理
		 */
		protected MCMessageList thisCheckWhenUpd() {
			MCMessageList msgL = new MCMessageList();
			//　固有チェックはない
			return msgL;
		}
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}
		/**
		 * 仕入値引サービスのチェック処理を呼出す
		 */
		protected void callPurcDscntRegServiceChk01() {
			MSBDL_PurcDscntRegService.PurcDscnt_Chk01 ope = MSBDL_PurcDscntRegService.crtPurcDscnt_Chk01();
			// 上り電文設定（up0）
			PurcDscnt_Ins01_HdrR hdrR = PurcDscnt_Ins01_HdrR.create();
			copy(hdrR, up0(), createMap_PurcDscnt_Ins01_HdrR_Chk01_HdrR());
			hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			ope.up0().add(hdrR);
			// 上り電文設定（up1）
			addAll(ope.up1(), up1(), up0(), createMap_PurcDscnt_Ins01_DtlR_Chk01_DtlR());
			// サービスコール
			ope.exec();
			
			String[] destCol = {Chk01_DtlR.$purc_dtl_upd_flg};
			String[] srcCol = {PurcDscnt_Ins01_DtlR.$purc_dtl_upd_flg};
			copyByPegNo(up1(), destCol, ope.down1(), srcCol);

		}
	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 仕入値引情報の削除をする前に、チェックを実行します。<br>
	 */
	public class Chk03 extends MSBDL_PurcDscntReg_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				// 仕入値引登録サービスチェック処理実行
				callPurcDscntRegServiceChk01();
			}
			setDown();
		}
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// キャッシュ作成
			createCache();
			// 補完処理
			msgL.addAll(completion());
			return msgL;
		}
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			// 更新前DACチェック処理
			msgL.addAll(checkWritableDptCdDac(_cachePurcActR, MST_PURC_ACT_R.$purc_dpt_cd));
			
			msgL.addAll(thisCheck());
			return msgL;
		}
		/**
		 * キャッシュ作成
		 */
		protected void createCache() {
			// 仕入実績ヘッダ
			createCachePurcAct(up0());
			// 仕入実績明細
			createCachePurcActD();
			// 仕入実績受払
			createCachePurcActIo();
		}
		/**
		 * 補完処理
		 */
		protected MCMessageList completion() {
			MCMessageList msgL = new MCMessageList();
			// 仕入実績ヘッダ
			msgL.addAll(competionPurcAct());
			// 明細補完処理
			for (Chk03_DtlR r : up1()) {
				// 仕入実績明細
				msgL.addAll(competionPurcActD(r));
			}
			return msgL;
		}
		/**
		 * 補完処理（仕入実績ヘッダ）
		 */
		protected MCMessageList competionPurcAct() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$upd_cntr, _cachePurcActR));
			if (msgL.size() == 0) {
				up0().purc_act_rev(_cachePurcActR.purc_act_rev());
			}
			return msgL;
		}
		/**
		 * 補完処理（仕入実績明細）
		 */
		protected MCMessageList competionPurcActD(Chk03_DtlR r) {
			MCMessageList msgL = new MCMessageList();
			if (msgL.size() == 0) {
				MST_PURC_ACT_IO_R purcActIoR = _cachePurcActIo.getFirst(_idxCachePurcActIo, r.purc_act_d_no(), r.purc_act_d_seq());
				r.purc_act_no(_cachePurcActR.purc_act_no());
				r.purc_act_seq(_cachePurcActR.purc_act_seq());
				r.purc_act_io_no(purcActIoR.purc_act_io_no());
				r.purc_act_io_seq(purcActIoR.purc_act_io_seq());
			}
			return msgL;
		}
		/**
		 * チェック処理
		 * @return
		 */
		protected MCMessageList thisCheck() {
			MCMessageList msgL = new MCMessageList();
			return msgL;
		}
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}
		/**
		 * 仕入値引サービスのチェック処理を呼出す
		 */
		protected void callPurcDscntRegServiceChk01() {
			MSBDL_PurcDscntRegService.PurcDscnt_Chk01 ope = MSBDL_PurcDscntRegService.crtPurcDscnt_Chk01();
			// 上り電文設定（up0）
			PurcDscnt_Ins01_HdrR hdrR = PurcDscnt_Ins01_HdrR.create();
			copy(hdrR, up0(), createMap_PurcDscnt_Ins01_HdrR_Chk03_HdrR());
			hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			ope.up0().add(hdrR);
			// 上り電文設定（up1）
			addAll(ope.up1(), up1(), createMap_PurcDscnt_Ins01_DtlR_Chk03_DtlR());
			ope.up1().setNumberNE(PurcDscnt_Ins01_DtlR.$hdr_peg_no, hdrR.peg_no());
			// サービスコール
			ope.exec();
		}
	}
	
	protected MCMessageList checkDtlSub(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();
		for (Chk01_DtlR dtlR : dtlL) {
			if ((MAC_TRD_PTN_TYP.isPURC_DSCNT_XPNS(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XTRA_XPNS(hdrR.trd_ptn_typ())) 
					&& MAC_ASSET_MNG_TYP.isMNG(dtlR.asset_mng_typ())) {
				msgL.add(new MCMessage(dtlR, null, MSBDL0195, toDispItm(dtlR.itm_cd(), 
						dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()), toDispGUIIndex(dtlR)));
			}
		}
		return msgL;
	}
	
	/**
	 * キャッシュ作成（製造指図）
	 * @param bindL
	 * @return
	 */
	protected void createCacheMfgInst(MCList<Chk01_DtlR> dtlL) {
		MCList<MST_MFG_INST_R> mfgInstL = MCList.create(MST_MFG_INST_R.class);
		_cacheMfgInst = new FXUCL_MCDbcCache<MST_MFG_INST_R>(mfgInstL,
				MCQueryApiBuilder.create(MST_MFG_INST_R.create("T")),
				dtlL.groupBy(Chk01_DtlR.$mfg_inst_no), Chk01_DtlR.$mfg_inst_no);
		// 品目製造指図
		createCacheItmMfgInst(mfgInstL);
	}
	/**
	 * キャッシュ作成（品目製造指図）
	 * @param bindL
	 * @return
	 */
	protected void createCacheItmMfgInst(MCList<MST_MFG_INST_R> mfgInstL) {
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");

		MST_ITM_MFG_INST_R t = MST_ITM_MFG_INST_R.create("T");
		MCQueryApiBuilder itmMfgInstL_bldr = MCQueryApiBuilder.create(t);
		itmMfgInstL_bldr.addSelect(m1.asst_dpt_cd);
		itmMfgInstL_bldr.addInnerJoin(m1, bracket(t.mfg_loc_cd.eq(m1.loc_cd)));
		_cacheItmMftInst = new FXUCL_MCDbcCache<MST_ITM_MFG_INST_R>(itmMfgInstL_bldr,
				mfgInstL.groupBy(MST_MFG_INST_R.$itm_mfg_inst_no),
				MST_MFG_INST_R.$itm_mfg_inst_no);
	}
	/**
	 * キャッシュ作成（仕入実績ヘッダ）
	 * @param hdrR
	 */
	protected void createCachePurcAct(MCRow hdrR) {
		_cachePurcActR = MST_PURC_ACT_R.create();
		dbSelectKeyForUpdateNoWait("MSBDL0180_MST_PURC_ACT_S03", _cachePurcActR,
				MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T")), hdrR);
	}
	/**
	 * キャッシュ作成（仕入実績明細）
	 * @param dtlL
	 */
	protected void createCachePurcActD() {
		_cachePurcActD = MCList.create(MST_PURC_ACT_D_R.class);
		MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
		MCQueryApiBuilder cachePurcActD_bldr = MCQueryApiBuilder.create(t);
		cachePurcActD_bldr.setWhere(t.purc_act_no.eq(bind("purc_act_no")));
		cachePurcActD_bldr.addWhereWithAnd(t.purc_act_seq.eq(bind("purc_act_seq")));
		dbSelect("MSBDL0180_MST_PURC_ACT_D_S01",
				_cachePurcActD, cachePurcActD_bldr, _cachePurcActR);
		_idxCachePurcActD = _cachePurcActD.createIndex(MST_PURC_ACT_D_R.$purc_act_d_no,
				MST_PURC_ACT_D_R.$purc_act_d_seq);
	}
	/**
	 * キャッシュ作成（仕入実績受払）
	 */
	protected void createCachePurcActIo() {
		_cachePurcActIo = MCList.create(MST_PURC_ACT_IO_R.class);
		MST_PURC_ACT_IO_R t = MST_PURC_ACT_IO_R.create("T");
		MCQueryApiBuilder cachePurcActIo_bldr = MCQueryApiBuilder.create(t);
		cachePurcActIo_bldr.setWhere(t.purc_act_d_no.eq(bind("purc_act_d_no")));
		cachePurcActIo_bldr.addWhereWithAnd(t.purc_act_d_seq.eq(bind("purc_act_d_seq")));
		dbSelect("MSBDL0180_MST_PURC_ACT_IO_S01",
				_cachePurcActIo, cachePurcActIo_bldr, _cachePurcActD);
		_idxCachePurcActIo = _cachePurcActIo.createIndex(MST_PURC_ACT_IO_R.$purc_act_d_no,
				MST_PURC_ACT_IO_R.$purc_act_d_seq);
	}
	/**
	 * キャッシュ作成（仕入実績明細）参照用
	 */
	protected void createCachePurcActDForRef(MCList<Chk01_DtlR> dtlL) {
		_cachePurcActDForRef = MCList.create(MST_PURC_ACT_D_R.class);
		MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
		MCQueryApiBuilder cachePurcActDForRef_bldr = MCQueryApiBuilder.create(t);
		cachePurcActDForRef_bldr.setSelect(t.purc_act_d_no);
		cachePurcActDForRef_bldr.addSelect(t.purc_act_d_seq);
		cachePurcActDForRef_bldr.addSelect(t.accpt_dfct_flg);
		cachePurcActDForRef_bldr.setWhere(t.purc_act_d_no.eq(bind("ref_purc_act_d_no")));
		cachePurcActDForRef_bldr
				.addWhereWithAnd(t.purc_act_d_seq.eq(bind("ref_purc_act_d_seq")));
		dbSelect("MSBDL0180_MST_PURC_ACT_D_S02",
				_cachePurcActDForRef, cachePurcActDForRef_bldr, dtlL);
		_idxCachePurcActDForRef = _cachePurcActDForRef.createIndex(
				MST_PURC_ACT_D_R.$purc_act_d_no, MST_PURC_ACT_D_R.$purc_act_d_seq);
	}
	/**
	 * 共通チェック処理
	 * @param r
	 */
	protected MCMessageList thisCheckCommon(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();
		MCList<Chk01_DtlR> notErrL = getChkList(dtlL, Status.CREATE, Status.MODIFY);
		// 明細行が1件以上あるかチェック
		msgL.addAll(checkAtLeastOneDtl(hdrR, dtlL));
		// 条件付必須チェック
		msgL.addAll(checkReqInCnd(hdrR));
		
		for (Chk01_DtlR r : notErrL) {
			msgL.addAll(check(r, Chk01_DtlR.$trd_cur_upri, new FXUCL_PositiveValidater()));
			
			// 存在チェック（製造指図）
			MST_MFG_INST_R mfgInstR = _cacheMfgInst.get(r.mfg_inst_no());
			if (!isNull(r.mfg_inst_no()) && isNull(mfgInstR)) {
				msgL.add(new MCMessage(r, null , MSBDL0105, r.mfg_inst_no(), toDispGUIIndex(r)));
			}
			// 仕入実績関連チェック
			msgL.addAll(checkPurcAct(hdrR, r));
			// 製造指図関連チェック
			msgL.addAll(checkExistMfgInst(hdrR, r));
			if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ()) && r.sundry_itm_flg()) {
				MAM_SUNDRY_ITM_R sundryItm = getSundryItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.sno1(), r.sno2(), r.sno3(),
						r.sno4());
				if (isNull(sundryItm) || sundryItm.isEmpty()) {
					msgL.add(new MCMessage(r, null, MSBDL0058, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4()), toDispGUIIndex(r)));
				}
			}
		}
		
		// 負担項目の存在チェック
		msgL.addAll(existBdCheck(dtlL));
		
		return msgL;
	}
	
	/**
	 * 条件付必須チェック
	 * @return メッセージリスト
	 */
	protected MCMessageList checkReqInCnd(Chk01_HdrR hdrR) {

		MCMessageList msgL = new MCMessageList();
		FXUCL_RequiredValidater rv = new FXUCL_RequiredValidater();
		if (!hdrR.sppl_iv_flg()) {
			msgL.addAll(check(hdrR, Chk01_HdrR.$pay_basis_dt, rv));
		}
		else {
			if (hdrR.pay_spot_flg()) {
				msgL.addAll(check(hdrR, Chk01_HdrR.$pay_schd_dt, rv));
			}
			else {
				msgL.addAll(check(hdrR, Chk01_HdrR.$pay_basis_dt, rv));
			}
		}
		return msgL;
	}
	
	/**
	 * チェック処理（仕入実績関連）
	 */
	protected MCMessageList checkPurcAct(Chk01_HdrR hdrR, Chk01_DtlR dtlR) {
		MCMessageList msgL = new MCMessageList();
		if (isNullAnd(dtlR.ref_purc_act_d_no(), dtlR.ref_purc_act_d_seq())) {
			return msgL;
		}
		MST_PURC_ACT_D_R purcActDtlR = _cachePurcActDForRef.getFirst(_idxCachePurcActDForRef, dtlR.ref_purc_act_d_no(), dtlR.ref_purc_act_d_seq());
		if (!isNull(purcActDtlR) && purcActDtlR.accpt_dfct_flg()) {
			// 検収不良、または、全数打切の仕入情報を参照情報とすることはできない
			msgL.add(new MCMessage(dtlR, null , MSBDL0104, dtlR.ref_purc_act_no(), dtlR.ref_purc_act_d_no(), toDispGUIIndex(dtlR)));
		}
		return msgL;
	}
	/**
	 * チェック処理（製造指図関連）
	 */
	protected MCMessageList checkExistMfgInst(Chk01_HdrR hdrR, Chk01_DtlR dtlR) {
		MCMessageList msgL = new MCMessageList();
		if (!isNull(dtlR.mfg_inst_no())) {
			MST_MFG_INST_R mfgInstR = _cacheMfgInst.get(dtlR.mfg_inst_no());
			MST_ITM_MFG_INST_R itmMfgInstR = _cacheItmMftInst.get(mfgInstR.itm_mfg_inst_no());
			// 負担部門の一致を確認
			if (!isSame(dtlR.bd_dpt_cd(), itmMfgInstR.getStringNE("ASST_DPT_CD"))) {
				//　部門不一致
				msgL.add(new MCMessage(dtlR, null , MSBDL0108, dtlR.bd_dpt_cd(), itmMfgInstR.getStringNE("ASST_DPT_CD"), dtlR.mfg_inst_no(), toDispGUIIndex(dtlR)));
			}
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
	
	/**
	 * チェック処理(負担項目の各種ＮＯの存在チェック）
	 * @param dtlL 明細上り電文リスト(新規、または更新)
	 * @return メッセージリスト
	 */
	protected MCMessageList existBdCheck(MCList<Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();
		MCList<Chk01_DtlR> bdLotChkTgtL = MCList.create(Chk01_DtlR.class);
				
		for (Chk01_DtlR dr : dtlL) {
			if (dr.getStatus() == MCRow.DELETE) {
				continue;
			}
			if (!isNull(dr.po_no())) {
				if (!existsPoNo(dr.po_no())) {
					msgL.add(new MCMessage(dr, Chk01_DtlR.$po_no, MSBDL0084, dr.po_no(), toDispGUIIndex(dr)));
				}
			}
			if (!isNull(dr.bd_po_no())) {
				if (!existsPoNo(dr.bd_po_no())) {
					msgL.add(new MCMessage(dr, Chk01_DtlR.$bd_po_no, MSBDL0175, dr.bd_po_no(), toDispGUIIndex(dr)));
				}
			}
			if (!isNull(dr.slo_no())) {
				if (!existsSloNo(dr.slo_no())) {
					msgL.add(new MCMessage(dr, Chk01_DtlR.$slo_no, MSBDL0176, dr.slo_no(), toDispGUIIndex(dr)));
				}
			}
			if (!isNull(dr.bd_slo_no())) {
				if (!existsSloNo(dr.bd_slo_no())) {
					msgL.add(new MCMessage(dr, Chk01_DtlR.$bd_slo_no, MSBDL0177, dr.bd_slo_no(), toDispGUIIndex(dr)));
				}
			}
			if (!isNull(dr.bd_lot_no()) && !isNull(dr.bd_itm_cd())) {
				bdLotChkTgtL.add(dr);
			}
			if (!isNull(dr.bd_iv_no())) {
				if (!existsBdIvNo(dr.bd_iv_no())) {
					msgL.add(new MCMessage(dr, Chk01_DtlR.$bd_iv_no, MSBDL0179, dr.bd_iv_no(), toDispGUIIndex(dr)));
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
	protected void callLotServiceChkBdItm(MCList<Chk01_DtlR> dtlL) {
		if (dtlL.isEmpty()) {
			return;
		}
		MSBFL_LotService.Lot_Chk03 ope = MSBFL_LotService.crtLot_Chk03();
		addAll(ope.up0(), dtlL, createMap_Lot_Chk03_CndR_Chk01_DtlR());
		ope.exec();		
		copyErrFlg(dtlL, ope.up0());
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 仕入値引情報を登録する。<br>
	 */
	public class Ins01 extends MSBDL_PurcDscntReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// 上り電文編集
			editUp();
			// チェック処理
			callThisChk01();
			throwUpdErr();
			// 上り電文編集
			editAfterCheck(up0(), up1());
			// 登録処理
			callPurcDscntRegServiceIns01();
			// 下り電文の設定
			setDown();
		}
		
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			// 紐付けＮＯの設定
			setPegNo(up0());
			setPegNo(up1());
			// データ更新区分の設定
			up1().setStringNE(Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			// 表示順の設定
			setDispSeq(up1(), Chk01_DtlR.$disp_seq);
		}
		
		/**
		 * チェック処理を呼出す
		 */
		protected void callThisChk01() {
			MSBDL_PurcDscntReg.Chk01 ope = MSBDL_PurcDscntReg.crtChk01();

			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			
			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}
		
		/**
		 * 仕入値引登録サービスの登録処理を呼出す
		 */
		protected void callPurcDscntRegServiceIns01() {
			MSBDL_PurcDscntRegService.PurcDscnt_Ins01  ope = MSBDL_PurcDscntRegService.crtPurcDscnt_Ins01();
			PurcDscnt_Ins01_HdrR hdrR = PurcDscnt_Ins01_HdrR.create();
			// 上り電文設定（up0）
			copy(hdrR, up0(), createMap_PurcDscnt_Ins01_HdrR_Chk01_HdrR());
			hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			ope.up0().add(hdrR);
			// 上り電文設定（up1）
			setAll(ope.up1(), up1(), up0(), createMap_PurcDscnt_Ins01_DtlR_Chk01_DtlR());
			// サービスコール
			ope.exec();
			
			// 更新サービスの下り電文設定（ヘッダ） 
			PurcDscnt_Ins01_HdrR opeDown0 = ope.down0().get(0);
			up0().purc_act_no(opeDown0.purc_act_no());
			up0().purc_act_rev(opeDown0.purc_act_rev());
			
			// 更新サービスの下り電文設定（明細）
			String[] dtlDestCols = new String[] {PurcDscnt_Ins01_DtlR.$purc_act_d_no};
			String[] dtlSrcCols = new String[] {PurcDscnt_Ins01_DtlR.$purc_act_d_no};
			copyByPegNo(up1(), dtlDestCols, ope.down1(),  dtlSrcCols);
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 仕入値引情報を更新する。<br>
	 */
	public class Upd01 extends MSBDL_PurcDscntReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// 上り電文編集
			editUp();
			// チェック処理
			callThisChk02();
			throwUpdErr();
			// 上り電文編集
			editAfterCheck(up0(), up1());
			// 更新処理
			callPurcDscntRegServiceUpd01();
			// 下り電文の設定
			setDown();
		}
		
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			// 紐付けＮＯの設定
			setPegNo(up0());
			setPegNo(up1());
			// データ更新区分の設定
			setDataCrudTypDtl();
			// 表示順の設定
			setDispSeq(up1(), Chk01_DtlR.$disp_seq);
		}
		
		/**
		 * チェック処理を呼出す
		 */
		protected void callThisChk02() {
			MSBDL_PurcDscntReg.Chk02 ope = MSBDL_PurcDscntReg.crtChk02();

			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			
			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}
		
		/**
		 * 仕入値引登録サービスの更新処理を呼出す
		 */
		protected void callPurcDscntRegServiceUpd01() {
			MSBDL_PurcDscntRegService.PurcDscnt_Upd01  ope = MSBDL_PurcDscntRegService.crtPurcDscnt_Upd01();
			// 上り電文設定（up0）
			PurcDscnt_Ins01_HdrR hdrR = PurcDscnt_Ins01_HdrR.create();
			copy(hdrR, up0(), createMap_PurcDscnt_Ins01_HdrR_Chk01_HdrR());
			hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			ope.up0().add(hdrR);
			// 上り電文設定（up1）
			setAll(ope.up1(), up1(), up0(), createMap_PurcDscnt_Ins01_DtlR_Chk01_DtlR());
			// サービスコール
			ope.exec();
			
			// 更新サービスの下り電文設定（ヘッダ） 
			up0().purc_act_rev(ope.down0().get(0).purc_act_rev());
			
			// 更新サービスの下り電文設定（明細）
			String[] dtlDestCols = new String[] {PurcDscnt_Ins01_DtlR.$purc_act_d_no};
			String[] dtlSrcCols = new String[] {PurcDscnt_Ins01_DtlR.$purc_act_d_no};
			copyByPegNo(up1(), dtlDestCols, ope.down1(),  dtlSrcCols);
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}
		/**
		 * データ更新区分を設定します。
		 * @param r 明細レコード
		 */
		protected void setDataCrudTypDtl(){
			for (Chk01_DtlR r : up1()) {
				if (isSame(MCRow.Status.CREATE, r.getStatus())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				} 
				else if (isSame(MCRow.Status.MODIFY, r.getStatus())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				} 
				else if (isSame(MCRow.Status.DELETE, r.getStatus())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 仕入値引情報を削除する。<br>
	 */
	public class Del01 extends MSBDL_PurcDscntReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// 上り電文編集
			editUp();
			// チェック処理
			callThisChk03();
			throwCanErr();
			// 削除処理
			callPurcDscntRegServiceDel01();
		}
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			// 紐付けＮＯの設定
			setPegNo(up0());
			setPegNo(up1());
			// データ更新区分の設定
			up1().setStringNE(Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
		}
		/**
		 * チェック処理を呼出す
		 */
		protected void callThisChk03() {
			MSBDL_PurcDscntReg.Chk03 ope = MSBDL_PurcDscntReg.crtChk03();

			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			
			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}
		
		/**
		 * 仕入値引登録サービスの削除処理を呼出す
		 */
		protected void callPurcDscntRegServiceDel01() {
			MSBDL_PurcDscntRegService.PurcDscnt_Del01  ope = MSBDL_PurcDscntRegService.crtPurcDscnt_Del01();
			// 上り電文設定（up0）
			PurcDscnt_Ins01_HdrR hdrR = PurcDscnt_Ins01_HdrR.create();
			copy(hdrR, up0(), createMap_PurcDscnt_Ins01_HdrR_Chk03_HdrR());
			hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			ope.up0().add(hdrR);
			// 上り電文設定（up1）
			setAll(ope.up1(), up1(), createMap_PurcDscnt_Ins01_DtlR_Chk03_DtlR());
			ope.up1().setNumberNE(PurcDscnt_Ins01_DtlR.$hdr_peg_no, hdrR.peg_no());
			// サービスコール
			ope.exec();
		}
		
	}
	//-----------------------------------------
	// 共通メソッド
	//-----------------------------------------
	protected void completion(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		// 固定値
		hdrR.setStringNE(Chk01_HdrR.$xrate_cd, getCo().purc_xrate_cd());
		hdrR.base_cur_cd(getCo().base_cur_cd());
		hdrR.ptax_cur_cd(getCo().ptax_cur_cd());
		hdrR.addStringColumn("wtax_rnd_typ", getCo().wtax_rnd_typ());
		hdrR.addStringColumn("xrate_rnd_typ", getCo().xrate_rnd_typ());
		for (Chk01_DtlR dtlR : dtlL) {
			// 基準単位
			dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(), dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
					dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
			// 源泉税
			MSBDL_PurcUtil.setWtaxInfo(hdrR, dtlR);
		}
		//本来設定されない項目を無視
		if(!hdrR.sppl_iv_flg()) {
			hdrR.rcpt_iv_no(null);
			hdrR.ref_rcpt_iv_no(null);
		}
	}
	//-----------------------------------------
	// サービスコール用マップ
	//-----------------------------------------
	/** 仕入値引登録ＳＶヘッダブロック（新規・更新） */
	protected Map_PurcDscnt_Ins01_HdrR_Chk01_HdrR<PurcDscnt_Ins01_HdrR,Chk01_HdrR> createMap_PurcDscnt_Ins01_HdrR_Chk01_HdrR() {
		return new Map_PurcDscnt_Ins01_HdrR_Chk01_HdrR<PurcDscnt_Ins01_HdrR, Chk01_HdrR>();
	}

	public class Map_PurcDscnt_Ins01_HdrR_Chk01_HdrR<D extends PurcDscnt_Ins01_HdrR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$peg_no, Chk01_HdrR.$peg_no);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$trd_cd, Chk01_HdrR.$trd_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$trd_ptn_typ, Chk01_HdrR.$trd_ptn_typ);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_act_no, Chk01_HdrR.$purc_act_no);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_act_seq, Chk01_HdrR.$purc_act_seq);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_act_rev, Chk01_HdrR.$purc_act_rev);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_dpt_cd, Chk01_HdrR.$purc_dpt_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$wg_cd, Chk01_HdrR.$wg_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_usr_cd, Chk01_HdrR.$purc_usr_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$sppl_cd, Chk01_HdrR.$sppl_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$sppl_iv_flg, Chk01_HdrR.$sppl_iv_flg);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$asppl_cd, Chk01_HdrR.$asppl_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$bsppl_cd, Chk01_HdrR.$bsppl_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$psppl_cd, Chk01_HdrR.$psppl_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$cred_cd, Chk01_HdrR.$cred_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$trd_cur_cd, Chk01_HdrR.$trd_cur_cd);
			
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_amt_rnd_typ, Chk01_HdrR.$purc_amt_rnd_typ);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_tax_rnd_typ, Chk01_HdrR.$purc_tax_rnd_typ);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_tax_calc_typ, Chk01_HdrR.$purc_tax_calc_typ);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$upri_dec_place, Chk01_HdrR.$trd_cur_upri_dec_place);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$amt_dec_place, Chk01_HdrR.$trd_cur_amt_dec_place);
			
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$trd_rmrks, Chk01_HdrR.$trd_rmrks);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$intr_rmrks, Chk01_HdrR.$intr_rmrks);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$tterm_cd1, Chk01_HdrR.$tterm_cd1);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$tterm_rmrks1, Chk01_HdrR.$tterm_rmrks1);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$tterm_cd2, Chk01_HdrR.$tterm_cd2);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$tterm_rmrks2, Chk01_HdrR.$tterm_rmrks2);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$tterm_cd3, Chk01_HdrR.$tterm_cd3);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$tterm_rmrks3, Chk01_HdrR.$tterm_rmrks3);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$sub_char1, Chk01_HdrR.$sub_char1);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$sub_char2, Chk01_HdrR.$sub_char2);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$sub_char3, Chk01_HdrR.$sub_char3);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_dt, Chk01_HdrR.$purc_dt);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$ac_dt, Chk01_HdrR.$ac_dt);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$can_ac_dt, Chk01_HdrR.$can_ac_dt);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$pay_basis_dt, Chk01_HdrR.$pay_basis_dt);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$pay_schd_dt, Chk01_HdrR.$pay_schd_dt);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$rcpt_iv_no, Chk01_HdrR.$rcpt_iv_no);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$ref_rcpt_iv_no, Chk01_HdrR.$ref_rcpt_iv_no);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$xrate, Chk01_HdrR.$xrate);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$ptax_dt, Chk01_HdrR.$ptax_dt);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$ptax_xrate, Chk01_HdrR.$ptax_xrate);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.ptax_cur_cd(getCo().ptax_cur_cd());
			dest.base_cur_cd(getCo().base_cur_cd());
			dest.xrate_cd(getCo().purc_xrate_cd());
			
			// 為替レート
			if (isSame(getCo().base_cur_cd(), src.trd_cur_cd())) {
				dest.xrate(MCNumber.ONE);
			}
			else {
				dest.xrate(src.xrate());
			}
			// 納税為替レート
			if (isSame(src.trd_cur_cd(), getCo().ptax_cur_cd())) {
				dest.ptax_xrate(MCNumber.ONE);
			}
			else {
				dest.ptax_xrate(src.ptax_xrate());
			}
		}
	}
	/** 仕入値引登録ＳＶ明細ブロック（新規・更新） */
	protected Map_PurcDscnt_Ins01_DtlR_Chk01_DtlR<PurcDscnt_Ins01_DtlR,Chk01_DtlR,Chk01_HdrR> createMap_PurcDscnt_Ins01_DtlR_Chk01_DtlR() {
		return new Map_PurcDscnt_Ins01_DtlR_Chk01_DtlR<PurcDscnt_Ins01_DtlR, Chk01_DtlR,Chk01_HdrR>();
	}

	public class Map_PurcDscnt_Ins01_DtlR_Chk01_DtlR<D extends PurcDscnt_Ins01_DtlR, S extends Chk01_DtlR, W extends Chk01_HdrR>  extends FXUCC_RowMapperWith<D,S,W>{
		protected W _chk01_HdrR;
		@Override
		public void setWith(W _chk01_HdrR){
			this._chk01_HdrR = _chk01_HdrR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$purc_act_d_no, Chk01_DtlR.$purc_act_d_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$purc_act_d_seq, Chk01_DtlR.$purc_act_d_seq);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$purc_act_no, Chk01_DtlR.$purc_act_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$purc_act_seq, Chk01_DtlR.$purc_act_seq);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$purc_act_io_no, Chk01_DtlR.$purc_act_io_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$purc_act_io_seq, Chk01_DtlR.$purc_act_io_seq);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$dscnt_rsn_cd, Chk01_DtlR.$dscnt_rsn_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$purc_typ, Chk01_DtlR.$purc_typ);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$mfg_inst_no, Chk01_DtlR.$mfg_inst_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$itm_nm, Chk01_DtlR.$itm_nm);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$iv_itm_nm, Chk01_DtlR.$iv_itm_nm);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sppl_itm_cd, Chk01_DtlR.$sppl_itm_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sppl_itm_nm, Chk01_DtlR.$sppl_itm_nm);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sundry_itm_flg, Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$tax_cd, Chk01_DtlR.$tax_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$inc_tax_flg, Chk01_DtlR.$inc_tax_flg);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$tax_typ, Chk01_DtlR.$tax_typ);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$tax_rate, Chk01_DtlR.$tax_rate);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$purc_dtl_upd_flg, Chk01_DtlR.$purc_dtl_upd_flg);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$trd_cur_upri, Chk01_DtlR.$trd_cur_upri);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$trd_cur_amt, Chk01_DtlR.$trd_cur_amt);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$trd_cur_tax_amt, Chk01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$base_cur_upri, Chk01_DtlR.$base_cur_upri);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$base_cur_amt, Chk01_DtlR.$base_cur_amt);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$base_cur_tax_amt, Chk01_DtlR.$base_cur_tax_amt);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$ptax_cur_upri, Chk01_DtlR.$ptax_cur_upri);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$ptax_cur_amt, Chk01_DtlR.$ptax_cur_amt);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$ptax_cur_tax_amt, Chk01_DtlR.$ptax_cur_tax_amt);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$wtax_rate, Chk01_DtlR.$wtax_rate);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$wtax_amt, Chk01_DtlR.$wtax_amt);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$maker_cd, Chk01_DtlR.$maker_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$ap_dpt_cd, Chk01_DtlR.$ap_dpt_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$pay_crryovr_times, Chk01_DtlR.$pay_crryovr_times);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_itm_cd, Chk01_DtlR.$bd_itm_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_itm_sub1, Chk01_DtlR.$bd_itm_sub1);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_itm_sub2, Chk01_DtlR.$bd_itm_sub2);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_itm_sub3, Chk01_DtlR.$bd_itm_sub3);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_sno1, Chk01_DtlR.$bd_sno1);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_sno2, Chk01_DtlR.$bd_sno2);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_sno3, Chk01_DtlR.$bd_sno3);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_sno4, Chk01_DtlR.$bd_sno4);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_lot_no, Chk01_DtlR.$bd_lot_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_sublot_no, Chk01_DtlR.$bd_sublot_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_ctg_cd, Chk01_DtlR.$bd_ctg_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_oper_cd, Chk01_DtlR.$bd_oper_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_iv_no, Chk01_DtlR.$bd_iv_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_loc_cd, Chk01_DtlR.$bd_loc_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_po_no, Chk01_DtlR.$bd_po_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_slo_no, Chk01_DtlR.$bd_slo_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_wg_cd, Chk01_DtlR.$bd_wg_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$asset_mng_typ, Chk01_DtlR.$asset_mng_typ);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$intr_rmrks, Chk01_DtlR.$intr_rmrks);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$trd_d_rmrks, Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$ref_purc_act_no, Chk01_DtlR.$ref_purc_act_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$ref_purc_act_seq, Chk01_DtlR.$ref_purc_act_seq);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$ref_purc_act_d_no, Chk01_DtlR.$ref_purc_act_d_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$ref_purc_act_d_seq, Chk01_DtlR.$ref_purc_act_d_seq);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$base_purc_ac_dt, Chk01_DtlR.$base_purc_ac_dt);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$lot_no, Chk01_DtlR.$lot_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sublot_no, Chk01_DtlR.$sublot_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$po_no, Chk01_DtlR.$po_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$slo_no, Chk01_DtlR.$slo_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$disp_seq, Chk01_DtlR.$disp_seq);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$pack_flg, Chk01_DtlR.$pack_flg);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$stk_mng_typ, Chk01_DtlR.$stk_mng_typ);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.hdr_peg_no(_chk01_HdrR.peg_no());
			// 経費時の補完
			if (isXpns(_chk01_HdrR.trd_ptn_typ(), src.asset_mng_typ())) {
				dest.xpns_po_flg(true);
				dest.bd_bp_cd(_chk01_HdrR.sppl_cd());
			}
			else {
				dest.xpns_po_flg(false);
			}
		}
	}
	/** 仕入値引登録ＳＶヘッダブロック（削除） */
	protected Map_PurcDscnt_Ins01_HdrR_Chk03_HdrR<PurcDscnt_Ins01_HdrR,Chk03_HdrR> createMap_PurcDscnt_Ins01_HdrR_Chk03_HdrR() {
		return new Map_PurcDscnt_Ins01_HdrR_Chk03_HdrR<PurcDscnt_Ins01_HdrR, Chk03_HdrR>();
	}
	public class Map_PurcDscnt_Ins01_HdrR_Chk03_HdrR<D extends PurcDscnt_Ins01_HdrR, S extends Chk03_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$peg_no, Chk03_HdrR.$peg_no);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$trd_ptn_typ, Chk03_HdrR.$trd_ptn_typ);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_act_no, Chk03_HdrR.$purc_act_no);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_act_seq, Chk03_HdrR.$purc_act_seq);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_act_rev, Chk03_HdrR.$purc_act_rev);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$can_ac_dt, Chk03_HdrR.$can_ac_dt);
		}
	}
	/** 仕入値引登録ＳＶ明細ブロック（削除） */
	protected Map_PurcDscnt_Ins01_DtlR_Chk03_DtlR<PurcDscnt_Ins01_DtlR,Chk03_DtlR> createMap_PurcDscnt_Ins01_DtlR_Chk03_DtlR() {
		return new Map_PurcDscnt_Ins01_DtlR_Chk03_DtlR<PurcDscnt_Ins01_DtlR, Chk03_DtlR>();
	}
	public class Map_PurcDscnt_Ins01_DtlR_Chk03_DtlR<D extends PurcDscnt_Ins01_DtlR, S extends Chk03_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$peg_no, Chk03_DtlR.$peg_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$data_crud_typ, PurcDscnt_Ins01_DtlR.$data_crud_typ);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$purc_act_d_no, Chk03_DtlR.$purc_act_d_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$purc_act_d_seq, Chk03_DtlR.$purc_act_d_seq);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$purc_act_no, Chk03_DtlR.$purc_act_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$purc_act_seq, Chk03_DtlR.$purc_act_seq);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$purc_act_io_no, Chk03_DtlR.$purc_act_io_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$purc_act_io_seq, Chk03_DtlR.$purc_act_io_seq);
		}
	}
	
	/**
	 * 経費値引であるか否か
	 * @return
	 */
	protected boolean isXpns(String trdPtnTyp, String assetMngTyp) {
		if (MAC_TRD_PTN_TYP.isPURC_XTRA_XPNS(trdPtnTyp) 
				|| MAC_TRD_PTN_TYP.isPURC_DSCNT_XPNS(trdPtnTyp)) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * 上り電文の編集を行います。
	 * @param hdrR
	 * @param dtlL
	 */
	protected void editAfterCheck(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		for (Chk01_DtlR r : dtlL) {
			// 本来設定できないはずの項目は例え上ってきたとしても無視
			ignoreColumn(hdrR, r);
			// 導出項目の設定
			editColumn(hdrR, r);
		}
	}
	/**
	 * 条件に合致しないカラムは、たとえ上りに設定されていたとしても無視します。
	 */
	protected void ignoreColumn(Chk01_HdrR hdrR, Chk01_DtlR dtlR) {
		// 品名
		if (!dtlR.sundry_itm_flg()) {
			dtlR.itm_nm(null);
		}
		// インボイス表記品名
		if (hdrR.sppl_iv_flg() && !dtlR.sundry_itm_flg()) {
			dtlR.iv_itm_nm(null);
		}
		// 源泉税率
		if (!(isSame(hdrR.trd_cur_cd(), hdrR.base_cur_cd())
				&& (isSame(hdrR.trd_cur_cd(), hdrR.ptax_cur_cd()) || isNull(hdrR.ptax_cur_cd())))) {
			dtlR.wtax_rate(null);
			dtlR.wtax_amt(null);
		}
	}
	/**
	 * 導出項目等を設定します
	 * @param hdrR
	 * @param dtlR
	 */
	protected void editColumn(Chk01_HdrR hdrR, Chk01_DtlR dtlR) {
		// 基準単位数
		dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(), dtlR.trd_unit_conv_base_qty(), 
				dtlR.trd_unit_conv_qty(), dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
		
		// 金額計算は仕入実績登録ＳＶで計算するのでここでは行わない。
	}
	protected void setSundryItmNm(Chk01_DtlR dr) {
		if (MAC_STK_MNG_TYP.isNOT_MNG(dr.stk_mng_typ()) && dr.sundry_itm_flg()) {
			//そのまま上らせる
		}
		else if (MAC_STK_MNG_TYP.isMNG(dr.stk_mng_typ()) && dr.sundry_itm_flg()) {
			MAM_SUNDRY_ITM_R sundryItm = getSundryItm(dr.itm_cd(), dr.itm_sub1(), dr.itm_sub2(), dr.itm_sub3(), dr.sno1(), dr.sno2(), dr.sno3(),
					dr.sno4());
			dr.itm_nm(sundryItm.itm_nm());
		}
		else {
			dr.itm_nm(null);
			dr.iv_itm_nm(null);
		}
	}
	protected Map_Lot_Chk03_CndR_Chk01_DtlR<Lot_Chk03_CndR,Chk01_DtlR> createMap_Lot_Chk03_CndR_Chk01_DtlR() {
		return new Map_Lot_Chk03_CndR_Chk01_DtlR<Lot_Chk03_CndR, Chk01_DtlR>();
	}

	public class Map_Lot_Chk03_CndR_Chk01_DtlR<D extends Lot_Chk03_CndR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk03_CndR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(Lot_Chk03_CndR.$itm_cd, Chk01_DtlR.$bd_itm_cd);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, Chk01_DtlR.$bd_itm_sub1);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, Chk01_DtlR.$bd_itm_sub2);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, Chk01_DtlR.$bd_itm_sub3);
			addColumnPathMap(Lot_Chk03_CndR.$lot_no, Chk01_DtlR.$bd_lot_no);
			addColumnPathMap(Lot_Chk03_CndR.$sublot_no, Chk01_DtlR.$bd_sublot_no);
			addColumnPathMap(Lot_Chk03_CndR.$err_flg, Chk01_DtlR.$err_flg);
		}
	}

	//FMCB CUSTOM END
}