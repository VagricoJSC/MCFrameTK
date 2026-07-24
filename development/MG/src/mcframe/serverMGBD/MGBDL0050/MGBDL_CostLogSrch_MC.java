package mcframe.serverMGBD.MGBDL0050;

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
import mcframe.serverMG.dbc.*;
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
import mcframe.serverMGBD.MGBDL0050.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBD.MGBDL0050.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_CostLogSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_CostLogSrch_MC extends MGBDL_CostLogSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 原価計算ログ削除時のチェックをする。<br>
	 */
	public class Chk01 extends MGBDL_CostLogSrch_MC_A.Chk01 {
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
			DtlL<DtlR> up = up0();
			
			MCList<MGT_CALC_LOG_R> locked = lock(up);
			
			MCJoinKey<MCList<MGT_CALC_LOG_R>> a2b = up.join(
					up.createRow().getKeyColumn(), locked, locked.createRow().getKeyColumn());

			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(chkBaseCom(up, a2b));
			msgL.addAll(chkBase(up, a2b));
						
			if (!msgL.isEmpty()) {
				return msgL;
			}
			
			compBase(up0(), a2b);
			
			return msgL;
			
		}
		
		/**
		 * 更新チェック処理
		 * @param up0 上り電文
		 * @param a2bLocked 上り電文からロックした行を取得するためのキー
		 * @return メッセージ
		 */
		protected MCMessageList chkBase(DtlL<DtlR> up0, MCJoinKey<MCList<MGT_CALC_LOG_R>> a2bLocked) {
			MCMessageList ml = new MCMessageList();
			return ml;
		}
		
		/**
		 * 上り電文を修正する
		 * @param up0 上り電文
		 * @param a2b 上り電文からロックした行（変更前のデータ）を取得するためのキー
		 */
		protected void compBase(DtlL<DtlR> up0, MCJoinKey<MCList<MGT_CALC_LOG_R>> a2b) {
			
		}

		protected void setDown() {
			down0().setAll(up0());
		}	
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価計算ログを削除する。<br>
	 */
	public class Del01 extends MGBDL_CostLogSrch_MC_A.Del01 {
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
				down0().setAll(up0());
			}
			
		}
		
		@Override
		protected void doIt() {
			DtlL<DtlR> up = up0();
			editUp(up);
			callThisChk(up);
			@SuppressWarnings({"unchecked", "rawtypes"})
			DtlL<DtlR> list =(DtlL)getChkList(up);
			del(list);
		}
		
		protected void editUp(MCList<DtlR> up) {
		}
		
		protected void callThisChk(DtlL<DtlR> up) {
			MGBDL_CostLogSrch.Chk01 o = MGBDL_CostLogSrch.crtChk01();
			o.up0().setAll(up);
			o.exec();
			up.setAll(o.down0());
		}
		
		protected void del(DtlL<DtlR> up) {
			if (up.isEmpty())	return;
			MCList<MGT_CALC_LOG_R> dbc = MCList.create(MGT_CALC_LOG_R.class);
			dbc.addAll(up);
			dbDeleteKey("MGBDL0050_MGT_CALC_LOG_D01", dbc, MCQueryApiBuilder.create(MGT_CALC_LOG_R.create("T")));
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価計算ログを検索する。<br>
	 */
	public class Srch01 extends MGBDL_CostLogSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			select();
		}
		
		protected void select() {
			executeQuery(down0(), MSBDL0050_MGT_CALC_LOG_S01(), up0());
		}
	}

	/**
	 * 更新対象をロックし、ロックした行を返す。
	 * @param list 更新対象
	 * @return ロックした行
	 */
	protected MCList<MGT_CALC_LOG_R> lock(DtlL<DtlR> list) {
		if (list.isEmpty()) {
			return null;
		}
		
		list.sort(list.createRow().getKeyColumn());// ロック順の指定
		MCList<MGT_CALC_LOG_R> locked = MCList.create(MGT_CALC_LOG_R.class);
		dbSelectKeyForUpdateNoWait("MGBDL0050_MGT_CALC_LOG_S01", locked, MCQueryApiBuilder.create(MGT_CALC_LOG_R.create("T")), list);	// 行ロックできない場合は、ここで例外がスローされる。
		return locked;
	}

	/**
	 * 更新、削除の共通チェック処理
	 * @param list
	 * @param a2bLocked
	 * @return
	 */
	protected MCMessageList chkBaseCom(DtlL<DtlR> list, MCJoinKey<MCList<MGT_CALC_LOG_R>> a2bLocked) {
		MCMessageList ml = new MCMessageList();
		if (list.isEmpty()) {
			return ml;
		}
		
		//更新カウンタのチェックを行う。（ただし、標準でログを編集する機能はない。）
		list.forEach(ar -> {
			//ロックした変更前データ
			MGT_CALC_LOG_R lockedRow = ar.getJoinedRow(a2bLocked);
			if (lockedRow != null) {
				ml.addAll(checkUpdCntrNE(ar, DtlR.$upd_cntr, lockedRow));
			}
		});
		return ml;
	
	}

	//FMCB CUSTOM END
}