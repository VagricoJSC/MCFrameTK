package mcframe.serverMSBG.MSBGL5080;

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
import mcframe.serverCore.mcjdbc.MCSavepoint;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_CredService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_CredService_MC extends MSBGL_CredService_MC_A{
	//FMCB CUSTOM START

	/**
	 * Cred_Srch01オペレーション.<p>
	 *
	 */
	public class Cred_Srch01 extends MSBGL_CredService_MC_A.Cred_Srch01 {
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
		protected void doSearchMain() {
			// 与信管理先の設定
			setCredCd(up0());
			
			if (isNull(up0().getValueNE(Cred_Srch01_CndR.$cred_cd))) {
				return;
			}
			// 与信限度額と与信使用額の取得
			MAM_CRED_CTRL_R ctrlR = MAM_CRED_CTRL_R.create();
			MAM_CRED_CTRL_R t = MAM_CRED_CTRL_R.create("T");
			MST_CRED_R t1 = MST_CRED_R.create("T1");
			MCQueryApiBuilder ctrlR_bldr = MCQueryApiBuilder.create(t);
			ctrlR.addNumberColumn(Cred_Srch01_CndR.$cred_amt); // 与信使用額
			
			ctrlR_bldr.addSelect(nvl( t1.cred_amt, value(0)).as("cred_amt"));
			ctrlR_bldr.addLeftOuterJoin(t1, t1.cred_cd.eq(t.cred_cd)
					.and(t1.trd_cur_cd.eq(t.cur_cd)));
			
			
			int cnt = dbSelectKey("MSBGL5080_MAM_CRED_CTRL_S01", ctrlR, ctrlR_bldr, up0());
			
			if (cnt == 0) {
				MCLog.write(MSBGL0025, up0().cred_cd(), up0().cur_cd());
				return;
			}
			
			// 与信枠残高 = 与信限度額 - 与信使用額
			MCNumber credBal = ctrlR.cred_limit().subtract(ctrlR.getNumber(Cred_Srch01_CndR.$cred_amt));
			
			// 下り電文への設定
			down0().cred_bal(credBal);
			down0().cred_amt(ctrlR.getNumber(Cred_Srch01_CndR.$cred_amt));
			down0().cred_limit(ctrlR.cred_limit());
		}


		
		/**
		 * 与信管理先を設定する<br>
		 * 条件にはcred_cd/bcst_cd/acst_cd/cst_cdのいずれかを含むこと<br>
		 * 名称がcred_cdの項目に結果を格納する<br>
		 * cred_cdが存在しない場合は一時カラムを追加して格納する
		 * 
		 * @param r 与信管理先取得条件および格納先
		 */
		protected void setCredCd(MCRow r) {
			
			String credCd = r.getStringNE(Cred_Srch01_CndR.$cred_cd);
			String bcstCd = r.getStringNE(Cred_Srch01_CndR.$bcst_cd);
			String acstCd = r.getStringNE(Cred_Srch01_CndR.$acst_cd);
			String cstCd = r.getStringNE(Cred_Srch01_CndR.$cst_cd);
			
			//与信管理先に値が設定されている場合
			if (!isNull(credCd)) {
				return;
			}
			
			//請求先に値が設定されている場合
			if (!isNull(bcstCd)) {
				credCd = execFuncString(createSqlId(LOGIC_ID, "MAPA_BP$F_GET_CRED_OF_BCST", "01"), MAPA_BP$F_GET_CRED_OF_BCST(value(bcstCd)));
			}
			//売掛先に値が設定されている場合
			else if (!isNull(acstCd)) {
				credCd = execFuncString(createSqlId(LOGIC_ID, "MAPA_BP$F_GET_CRED_OF_ACST", "01"), MAPA_BP$F_GET_CRED_OF_ACST(value(acstCd)));
			}
			//得意先に値が設定されている場合
			else if (!isNull(cstCd)) {
				credCd = execFuncString(createSqlId(LOGIC_ID, "MAPA_BP$F_GET_CRED_OF_CST", "01"), MAPA_BP$F_GET_CRED_OF_CST(value(cstCd)));
			}
			
			if (isNull(credCd)) {
				return ;
			}
			
			//与信管理先を設定する
			r.setValueNE(Cred_Srch01_CndR.$cred_cd, credCd);
		}
	}
	
	/**
	 * Cred_Upd01オペレーション.<p>
	 *
	 */
	public class Cred_Upd01 extends MSBGL_CredService_MC_A.Cred_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			MCList<MST_CRED_R> credL = MCList.create(MST_CRED_R.class);
			String keys[] = {MST_CRED_R.$cred_cd, MST_CRED_R.$trd_cur_cd};
			setCredCd(); // 与信管理先の設定
			
			// 更新前処理（更新情報の作成）
			for (Cred_Upd01_CndR cndR : up0()) {
				
				if (MSC_CRED_UPD_TYP.isNO_UPD(cndR.cred_upd_typ())) {
					continue;
				}
				
				if (isNull(cndR.cred_cd()) ) {
					continue;
				}
				setAmtPm(cndR); // 金額の符号の設定
				
				String vals[] = {cndR.cred_cd(), cndR.cur_cd()};
				MST_CRED_R credR = credL.getFirst(keys, vals);
				
				if (credR == null) {
					credR = MST_CRED_R.create();
					credR.addBooleanColumn(Cred_Upd01_CndR.$check_flg); // 与信チェックフラグの追加
					copy(credR, cndR, createMap_MST_CRED_R_Cred_Upd01_CndR());
					credL.add(credR);
				}
				else {
					credR.cred_amt(credR.cred_amt().add(cndR.amt()));
					credR.ar_cred_amt(credR.ar_cred_amt().add(cndR.amt()));
				}
				
				setCredCheckFlg(cndR, credR);
			}
			
			// バッチ更新
			MST_CRED_R t = MST_CRED_R.create("T");
			MCQueryApiBuilder credL_bldr = MCQueryApiBuilder.create(t); 	// バッチ更新用DBC
			credL_bldr.setSetVL(t.cred_amt, t.cred_amt.add(bindEx("cred_amt")));
			credL_bldr.addSetVL(t.ar_cred_amt, t.ar_cred_amt.add(bindEx("ar_cred_amt")));
			dbLockUpdInsNoCheck("MSBGL5080_MST_CRED_U01", credL, credL_bldr);
			
			// 更新の結果与信枠を超過していないかをチェックする
			MCList<Cred_Upd01_ErrR> errL = checkCred(credL);
			if (!isNull(errL)) {
				down1().setAll(errL);
			}
			
			down0().setAll(up0());

		}
		
		/**
		 * 与信管理先を一括で設定する
		 */
		protected void setCredCd() {
			
			MCList<Cred_Upd01_CndR> bcstL = up0().createInstance();
			MCList<Cred_Upd01_CndR> acstL = up0().createInstance();
			MCList<Cred_Upd01_CndR> cstL = up0().createInstance();
			
			for (Cred_Upd01_CndR cndR : up0()) {
				if (!isNull(cndR.cred_cd()) || MSC_CRED_UPD_TYP.isNO_UPD(cndR.cred_upd_typ())) {
					continue;
				}
				else if (!isNull(cndR.bcst_cd())) {
					bcstL.add(cndR);
				}
				else if (!isNull(cndR.acst_cd())) {
					acstL.add(cndR);
				}
				else if (!isNull(cndR.cst_cd())) {
					cstL.add(cndR);
				}
			}
			
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_BP$F_GET_CRED_OF_BCST", "02"), MABSFunction.getFunctionExecuter("MAPA_BP$F_GET_CRED_OF_BCST"), Cred_Upd01_CndR.$cred_cd, bcstL, Cred_Upd01_CndR.$bcst_cd);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_BP$F_GET_CRED_OF_ACST", "02"), MABSFunction.getFunctionExecuter("MAPA_BP$F_GET_CRED_OF_ACST"), Cred_Upd01_CndR.$cred_cd, acstL, Cred_Upd01_CndR.$acst_cd);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_BP$F_GET_CRED_OF_CST", "02"), MABSFunction.getFunctionExecuter("MAPA_BP$F_GET_CRED_OF_CST"), Cred_Upd01_CndR.$cred_cd, cstL, Cred_Upd01_CndR.$cst_cd);
		}
		
		/**
		 * 与信限度額のチェックをする
		 * 
		 * @param credL 与信情報
		 */
		protected MCList<Cred_Upd01_ErrR> checkCred(MCList<MST_CRED_R> credL) {
			
			// チェック対象のみを選択
			MCList<MST_CRED_R> subL = credL.subList(Cred_Upd01_CndR.$check_flg, true);
			MCList<Cred_Upd01_ErrR> errL = MCList.create(Cred_Upd01_ErrR.class);
			
			for (MST_CRED_R subR : subL) {
				
				// 与信使用額を減額する場合にはチェック対象外
				if (!subR.cred_amt().isPositive()) {
					continue;
				}
				
				// 与信コントロールマスタと与信使用額の取得
				MAM_CRED_CTRL_R ctrlR = getCredCtrl(subR);
				
				// チェックなし
				if (ctrlR.isEmpty()) {
					MCLog.write(MSBGL0025, subR.cred_cd(), subR.trd_cur_cd());
					continue;
				}
				// チェックなし
				else if (MAC_CRED_ACT_TYP.isNO_BLOCK(ctrlR.act_typ())) {
					// アクション無し
				}
				// 与信超過をチェックする場合
				else if (MAC_CRED_ACT_TYP.isSLS_BLOCK(ctrlR.act_typ())) {
					// 与信超過のため受注不可
					if (!isWithinCredLimit(subR, ctrlR)) {
						errL.add(createErrR(subR, ctrlR));
						continue;
					}
				}
				// アラーム使用率超過のためメッセージ追加
				if (!isWithinAlarmLimit(subR, ctrlR)) {
					writeCredAlarmLog(subR, ctrlR);
				}
			}
			
			return errL;
		}
		
		/**
		 * 与信限度額情報を取得する
		 * 
		 * @param credR 与信情報
		 * @return 与信限度額情報
		 */
		protected MAM_CRED_CTRL_R getCredCtrl(MST_CRED_R credR) {
			
			MAM_CRED_CTRL_R ctrlR = MAM_CRED_CTRL_R.create();
			MAM_CRED_CTRL_R t = MAM_CRED_CTRL_R.create("T");
			MST_CRED_R t1 = MST_CRED_R.create("T1");
			MCQueryApiBuilder ctrlR_bldr = MCQueryApiBuilder.create(t);
			ctrlR.addNumberColumn(Cred_Upd01_ErrR.$cred_amt); // 与信使用額
			
			ctrlR_bldr.addSelect(nvl( t1.cred_amt, value(0)).as("cred_amt"));
			ctrlR_bldr.addLeftOuterJoin(t1, t1.cred_cd.eq(t.cred_cd)
					.and(t1.trd_cur_cd.eq(t.cur_cd)));
			
			int cnt = dbSelectKey("MSBGL5080_MAM_CRED_CTRL_S02", ctrlR, ctrlR_bldr, credR.cred_cd(), credR.trd_cur_cd());
			
			if (cnt == 0) {
				ctrlR.clear();
			}
			
			return ctrlR;
		}
		
		/**
		 * 与信使用額が与信限度額内かどうかを判断する
		 * 
		 * @param credR 与信情報
		 * @param ctrlR 与信限度額情報
		 * @return 与信限度内の場合にtrue
		 */
		protected boolean isWithinCredLimit(MST_CRED_R credR, MAM_CRED_CTRL_R ctrlR) {
			
			if (ctrlR.getNumber(Cred_Upd01_ErrR.$cred_amt).gt(ctrlR.cred_limit())) {
				return false;
			}
			
			return true;
		}
		/**
		 * 与信アラーム使用率内かどうかを判断する
		 * 
		 * @param credR 与信情報
		 * @param ctrlR 与信限度額情報
		 * @return 与信アラーム使用率内の場合にtrue
		 */
		protected boolean isWithinAlarmLimit(MST_CRED_R credR, MAM_CRED_CTRL_R ctrlR) {
			
			MCNumber alarm_amt = ctrlR.alarm_point().multiply(ctrlR.cred_limit()).divide(100);
			
			if (ctrlR.getNumber(Cred_Upd01_ErrR.$cred_amt).gt(alarm_amt)) {
				return false;
			}
			
			return true;
		}
		
		/**
		 * 与信限度額を超過した場合にエラー情報を作成する<br>
		 * 同時にエラーログを出力する
		 * 
		 * @param credR 与信情報
		 * @param ctrlR 与信限度額情報
		 * @return エラー情報
		 */
		protected Cred_Upd01_ErrR createErrR(MST_CRED_R credR, MAM_CRED_CTRL_R ctrlR) {
			
			Cred_Upd01_ErrR errR = Cred_Upd01_ErrR.create();
			
			errR.cred_cd(ctrlR.cred_cd());
			errR.cur_cd(ctrlR.cur_cd());
			errR.cred_amt(ctrlR.getNumber(Cred_Upd01_ErrR.$cred_amt));
			errR.cred_limit(ctrlR.cred_limit());
			
			writeCredErrLog(credR, ctrlR);
			
			return errR;
		}
		
		/**
		 * エラーになった場合にエラーログとメッセージへの追加をする
		 * 
		 * @param credR 与信情報
		 * @param ctrlR 与信限度額情報
		 */
		protected void writeCredErrLog(MST_CRED_R credR, MAM_CRED_CTRL_R ctrlR) {
			
			MCLog.write(MSBGL0044,
					credR.cred_cd(), ctrlR.cur_cd(), ctrlR.getNumber(Cred_Upd01_ErrR.$cred_amt), ctrlR.cred_limit());
			
			MCMessagePool.add(ctrlR, null, MSBGL0044,
					credR.cred_cd(), ctrlR.cur_cd(), ctrlR.getNumber(Cred_Upd01_ErrR.$cred_amt), ctrlR.cred_limit());
		}
		
		/**
		 * アラーム使用率を超過した場合にメッセージへの追加をする
		 * 
		 * @param credR 与信情報
		 * @param ctrlR 与信限度額情報
		 */
		protected void writeCredAlarmLog(MST_CRED_R credR, MAM_CRED_CTRL_R ctrlR) {
			
			MCMessagePool.add(ctrlR, null, MSBGL0026,
					credR.cred_cd(), ctrlR.cur_cd(), ctrlR.getNumber(Cred_Upd01_ErrR.$cred_amt), ctrlR.cred_limit(), ctrlR.alarm_point());
			
		}
		/**
		 * 与信チェック対象のフラグを設定する
		 * 
		 * @param cndR 上り電文コンテナ
		 * @param credR フラグ設定対象の与信情報
		 */
		protected void setCredCheckFlg(Cred_Upd01_CndR cndR, MST_CRED_R credR) {
			
			// 与信額チェックが必要な場合はフラグを設定する（常に上書き）
			if (MSC_CRED_UPD_TYP.isUPD_CHK(cndR.cred_upd_typ())) {
				credR.setBoolean(Cred_Upd01_CndR.$check_flg, true);
			}
		}
		
		/**
		 * 取引区分から金額の符号を設定する
		 * 
		 * @param r 上り電文の条件
		 */
		protected void setAmtPm(Cred_Upd01_CndR r) {
			
			MCNumber pm = MAC_TRD_PTN_TYP.ar_amt_pm(r.trd_ptn_typ());
			r.amt(r.amt().multiply(pm));
		}
		
		protected Map_MST_CRED_R_Cred_Upd01_CndR<MST_CRED_R,Cred_Upd01_CndR> createMap_MST_CRED_R_Cred_Upd01_CndR() {
			return new Map_MST_CRED_R_Cred_Upd01_CndR<MST_CRED_R, Cred_Upd01_CndR>();
		}

		public class Map_MST_CRED_R_Cred_Upd01_CndR<D extends MST_CRED_R, S extends Cred_Upd01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_CRED_R.$cred_cd, Cred_Upd01_CndR.$cred_cd);
				addColumnPathMap(MST_CRED_R.$trd_cur_cd, Cred_Upd01_CndR.$cur_cd);
				addColumnPathMap(MST_CRED_R.$cred_amt, Cred_Upd01_CndR.$amt);
				addColumnPathMap(MST_CRED_R.$ar_cred_amt, Cred_Upd01_CndR.$amt);
				addColumnPathMap(MST_CRED_R.$sub_char1, Cred_Upd01_CndR.$sub_char1);
				addColumnPathMap(MST_CRED_R.$sub_char2, Cred_Upd01_CndR.$sub_char2);
				addColumnPathMap(MST_CRED_R.$sub_char3, Cred_Upd01_CndR.$sub_char3);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.ap_cred_amt(0);
			}
		}
	}
	/**
	 * Cred_Upd02オペレーション.<p>
	 *
	 */
	public class Cred_Upd02 extends MSBGL_CredService_MC_A.Cred_Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			MCList<MST_CRED_R> credL = MCList.create(MST_CRED_R.class);
			String keys[] = {MST_CRED_R.$cred_cd, MST_CRED_R.$trd_cur_cd};
			setCredCd(); // 与信管理先の設定
			
			// 更新前処理（更新情報の作成）
			for (Cred_Upd02_CndR cndR : up0()) {
				
				if (isNull(cndR.cred_cd()) ) {
					continue;
				}
				
				String vals[] = {cndR.cred_cd(), cndR.cur_cd()};
				MST_CRED_R credR = credL.getFirst(keys, vals);
				
				if (credR == null) {
					credR = MST_CRED_R.create();
					copy(credR, cndR, createMap_MST_CRED_R_Cred_Upd02_CndR());
					credL.add(credR);
				}
				else {
					credR.cred_amt(credR.cred_amt().add(cndR.amt()));
					credR.ap_cred_amt(credR.ap_cred_amt().add(cndR.amt()));
				}
			}
			
			// バッチ更新
			MST_CRED_R t = MST_CRED_R.create("T");
			MCQueryApiBuilder credL_bldr = MCQueryApiBuilder.create(t); 	// バッチ更新用DBC
			credL_bldr.setSetVL(t.cred_amt, t.cred_amt.add(bindEx("cred_amt")));
			credL_bldr.addSetVL(t.ap_cred_amt, t.ap_cred_amt.add(bindEx("ap_cred_amt")));
			dbLockUpdInsNoCheck("MSBGL5080_MST_CRED_U02", credL, credL_bldr);
			
			down0().setAll(up0());
		}
		
		/**
		 * 与信管理先を一括で設定する
		 */
		protected void setCredCd() {
			
			MCList<Cred_Upd02_CndR> bspplL = up0().createInstance();
			MCList<Cred_Upd02_CndR> aspplL = up0().createInstance();
			MCList<Cred_Upd02_CndR> spplL = up0().createInstance();
			
			for (Cred_Upd02_CndR cndR : up0()) {
				if (!isNull(cndR.cred_cd())) {
					continue;
				}
				else if (!isNull(cndR.bsppl_cd())) {
					bspplL.add(cndR);
				}
				else if (!isNull(cndR.asppl_cd())) {
					aspplL.add(cndR);
				}
				else if (!isNull(cndR.sppl_cd())) {
					spplL.add(cndR);
				}
			}
			
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_BP$F_GET_CRED_OF_BSPPL", "01"), MABSFunction.getFunctionExecuter("MAPA_BP$F_GET_CRED_OF_BSPPL"), Cred_Upd02_CndR.$cred_cd, bspplL, Cred_Upd02_CndR.$bsppl_cd);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_BP$F_GET_CRED_OF_ASPPL", "01"), MABSFunction.getFunctionExecuter("MAPA_BP$F_GET_CRED_OF_ASPPL"), Cred_Upd02_CndR.$cred_cd, aspplL, Cred_Upd02_CndR.$asppl_cd);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_BP$F_GET_CRED_OF_SPPL", "01"), MABSFunction.getFunctionExecuter("MAPA_BP$F_GET_CRED_OF_SPPL"), Cred_Upd02_CndR.$cred_cd, spplL, Cred_Upd02_CndR.$sppl_cd);
		}

		protected Map_MST_CRED_R_Cred_Upd02_CndR<MST_CRED_R,Cred_Upd02_CndR> createMap_MST_CRED_R_Cred_Upd02_CndR() {
			return new Map_MST_CRED_R_Cred_Upd02_CndR<MST_CRED_R, Cred_Upd02_CndR>();
		}

		public class Map_MST_CRED_R_Cred_Upd02_CndR<D extends MST_CRED_R, S extends Cred_Upd02_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_CRED_R.$cred_cd, Cred_Upd02_CndR.$cred_cd);
				addColumnPathMap(MST_CRED_R.$trd_cur_cd, Cred_Upd02_CndR.$cur_cd);
				addColumnPathMap(MST_CRED_R.$cred_amt, Cred_Upd02_CndR.$amt);
				addColumnPathMap(MST_CRED_R.$ap_cred_amt, Cred_Upd02_CndR.$amt);
				addColumnPathMap(MST_CRED_R.$sub_char1, Cred_Upd02_CndR.$sub_char1);
				addColumnPathMap(MST_CRED_R.$sub_char2, Cred_Upd02_CndR.$sub_char2);
				addColumnPathMap(MST_CRED_R.$sub_char3, Cred_Upd02_CndR.$sub_char3);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.ar_cred_amt(0);
			}
		}
	}

	//FMCB CUSTOM END
}