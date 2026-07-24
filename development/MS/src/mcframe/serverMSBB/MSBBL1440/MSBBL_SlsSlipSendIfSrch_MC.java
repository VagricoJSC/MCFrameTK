package mcframe.serverMSBB.MSBBL1440;

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
import mcframe.serverMSBB.MSBBL1440.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBB.MSBBL1440.Query.*;
import mcframe.serverMSBB.MSBBL6260.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SlsSlipSendIfSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SlsSlipSendIfSrch_MC extends MSBBL_SlsSlipSendIfSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 売上実績を検索する<br>
	 */
	public class Srch01 extends MSBBL_SlsSlipSendIfSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			MCList<Srch01_RsltR> rsltL = MCList.create(Srch01_RsltR.class);
			MCQueryPlan sql = MSBBL1440_MBT_SLS_SLIP_SND_IF_S01();
			executeQuery(rsltL, sql, up0());

			down0().addAll(makeData(rsltL));
			down1().addAll(makeDtlData(rsltL));
		}

		/**
		 * 売上伝票NOごとにまとめる。
		 * @param rsltL
		 * @return
		 */
		protected MCList<Srch01_RsltR> makeData(MCList<Srch01_RsltR> rsltL) {
			MCList<Srch01_RsltR> list = MCList.create(Srch01_RsltR.class);

			for (MCList<Srch01_RsltR> l : rsltL.groupList(Srch01_RsltR.$data_no, Srch01_RsltR.$sls_slip_no)) {
				Srch01_RsltR slsErrR = l.getFirst(Srch01_RsltR.$snd_to_err_flg, true);

				if (!isNull(slsErrR)) {
					list.add(slsErrR);
				}
				else {
					list.add(l.get(0));
				}
			}

			MCList<Srch01_RsltR> slsSlipL = getSlsSlipL(list);

			return slsSlipL;
		}

		protected MCList<Srch01_RsltR> getSlsSlipL(MCList<Srch01_RsltR> list) {
			MCList<Srch01_RsltR> newL = MCList.create(Srch01_RsltR.class);
			MCList<Srch01_RsltR> slsSlipL = MCList.create(Srch01_RsltR.class);
			MCList<Srch01_RsltR> sndToErrL = MCList.create(Srch01_RsltR.class);

			if (up0().new_flg()) {
				for (MCList<Srch01_RsltR> l : list.groupList(Srch01_RsltR.$sls_slip_no)) {
					l.sort(SortType.DESC, Srch01_RsltR.$data_no);
					newL.add(l.get(0));
				}
			}
			else {
				newL.addAll(list);
			}

			if (up0().re_snd_flg() && !up0().not_re_snd_flg()) {
				slsSlipL.addAll(newL.subList(Srch01_RsltR.$not_snd_flg, false));
			}
			else if (up0().not_re_snd_flg() && !up0().re_snd_flg()) {
				slsSlipL.addAll(newL.subList(Srch01_RsltR.$not_snd_flg, true));
			}
			else {
				slsSlipL.addAll(newL);
			}

			if (up0().snd_to_err_flg()) {
				sndToErrL.addAll(slsSlipL.subList(Srch01_RsltR.$snd_to_err_flg, true));
			}
			else {
				sndToErrL.addAll(slsSlipL);
			}

			sndToErrL.sort(Srch01_RsltR.$data_no, Srch01_RsltR.$sls_slip_no);
			return sndToErrL;
		}

		protected MCList<Srch01_DtlR> makeDtlData(MCList<Srch01_RsltR> rsltL) {
			MCList<Srch01_DtlR> dltL = MCList.create(Srch01_DtlR.class);

			for (Srch01_RsltR r : rsltL) {
				Srch01_DtlR dtlR  = Srch01_DtlR.create();
				copy(dtlR, r, createMap_Srch01_DtlR_Srch01_RsltR());
				dltL.add(dtlR);
			}

			return dltL;
		}

		protected Map_Srch01_DtlR_Srch01_RsltR<Srch01_DtlR, Srch01_RsltR> createMap_Srch01_DtlR_Srch01_RsltR() {
			return new Map_Srch01_DtlR_Srch01_RsltR<Srch01_DtlR, Srch01_RsltR>();
		}
		
		public class Map_Srch01_DtlR_Srch01_RsltR<D extends Srch01_DtlR, S extends Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_DtlR.$data_no, Srch01_RsltR.$data_no);
				addColumnPathMap(Srch01_DtlR.$data_lno, Srch01_RsltR.$data_lno);
				addColumnPathMap(Srch01_DtlR.$upd_cntr, Srch01_RsltR.$upd_cntr);
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 売上伝票の再送信前チェックを行います。<br>
	 */
	public class Chk01 extends MSBBL_SlsSlipSendIfSrch_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			setErrToRtnStsTyp();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			chkSlsSlipSendIf(msgL, up0(), up1());

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
	 * Upd01オペレーション.<p>
	 *
	 * 売上伝票を再送信する<br>
	 */
	public class Upd01 extends MSBBL_SlsSlipSendIfSrch_MC_A.Upd01 {
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
			// チェック処理
			callThisChk01();

			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				callSlsSlipSendIf_Upd02(notErrL);
			}
		}

		protected void callThisChk01() {

			MSBBL_SlsSlipSendIfSrch.Chk01 o = MSBBL_SlsSlipSendIfSrch.crtChk01();
			o.up0().setAll(up0());
			o.up1().setAll(up1());
			o.exec();

			up0().setAll(o.down0());
		}

		protected void callSlsSlipSendIf_Upd02(MCList<Chk01_RsltR> notErrL) {
			MSBBL_SlsSlipSendIfService.SlsSlipSendIf_Upd02 ope = MSBBL_SlsSlipSendIfService.crtSlsSlipSendIf_Upd02();
			addAll(ope.up0(), notErrL, createMap_SlsSlipSendIf_Upd02_DtlR_Chk01_RsltR());
			ope.exec();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
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

		protected Map_SlsSlipSendIf_Upd02_DtlR_Chk01_RsltR<SlsSlipSendIf_Upd02_DtlR, Chk01_RsltR> createMap_SlsSlipSendIf_Upd02_DtlR_Chk01_RsltR() {
			return new Map_SlsSlipSendIf_Upd02_DtlR_Chk01_RsltR<SlsSlipSendIf_Upd02_DtlR, Chk01_RsltR>();
		}

		public class Map_SlsSlipSendIf_Upd02_DtlR_Chk01_RsltR<D extends SlsSlipSendIf_Upd02_DtlR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsSlipSendIf_Upd02_DtlR.$data_no, Chk01_RsltR.$data_no);
			}
		}
	}

	/**
	 * Upd02オペレーション.<p>
	 *
	 * 売上伝票を訂正する<br>
	 */
	public class Upd02 extends MSBBL_SlsSlipSendIfSrch_MC_A.Upd02 {
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
			// チェック処理
			callThisChk02();
			
			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				callSlsSlipSendIf_Upd03(notErrL);
			}
		}

		protected void callThisChk02() {

			MSBBL_SlsSlipSendIfSrch.Chk02 o = MSBBL_SlsSlipSendIfSrch.crtChk02();
			o.up0().setAll(up0());
			o.up1().setAll(up1());
			o.exec();

			up0().setAll(o.down0());
		}

		protected void callSlsSlipSendIf_Upd03(MCList<Chk01_RsltR> notErrL) {

			MSBBL_SlsSlipSendIfService.SlsSlipSendIf_Upd03 ope = MSBBL_SlsSlipSendIfService.crtSlsSlipSendIf_Upd03();
			addAll(ope.up0(), notErrL, createMap_SlsSlipSendIf_Upd03_DtlR_Chk01_RsltR());
			ope.exec();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
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

		protected Map_SlsSlipSendIf_Upd03_DtlR_Chk01_RsltR<SlsSlipSendIf_Upd03_DtlR, Chk01_RsltR> createMap_SlsSlipSendIf_Upd03_DtlR_Chk01_RsltR() {
			return new Map_SlsSlipSendIf_Upd03_DtlR_Chk01_RsltR<SlsSlipSendIf_Upd03_DtlR, Chk01_RsltR>();
		}

		public class Map_SlsSlipSendIf_Upd03_DtlR_Chk01_RsltR<D extends SlsSlipSendIf_Upd03_DtlR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsSlipSendIf_Upd03_DtlR.$data_no, Chk01_RsltR.$data_no);
				addColumnPathMap(SlsSlipSendIf_Upd03_DtlR.$not_snd_flg, Chk01_RsltR.$not_snd_flg);
			}
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 売上伝票の訂正前チェックを行います。<br>
	 */
	public class Chk02 extends MSBBL_SlsSlipSendIfSrch_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			setErrToRtnStsTyp();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			chkSlsSlipSendIf(msgL, up0(), up1());

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
	 * 売上伝票送信ＩＦのロック、更新カウンタチェック
	 * @return
	 */
	protected MCMessageList chkSlsSlipSendIf(MCMessageList msgL, MCList<Chk01_RsltR> up0l, MCList<Chk01_DtlR> up1l) {

		MCList<MBT_SLS_SLIP_SND_IF_R> slsSlipSndL = MCList.create(MBT_SLS_SLIP_SND_IF_R.class);
		MBT_SLS_SLIP_SND_IF_R slsSlipSnd = MBT_SLS_SLIP_SND_IF_R.create("slsSlipSnd");
		MCQueryApiBuilder slsSlipSndL_bldr = MCQueryApiBuilder.create(slsSlipSnd);
		slsSlipSndL_bldr.setSelect(slsSlipSnd.data_lno, slsSlipSnd.upd_cntr);
		slsSlipSndL_bldr.setWhere(slsSlipSnd.data_no.eq(bind("data_no")));
		dbSelectForUpdateNoWait("MSBBL1440_MBT_SLS_SLIP_SND_IF_S01", slsSlipSndL, slsSlipSndL_bldr, up0l);

		MCIndexKey up1Idx = up1l.createIndex(Chk01_DtlR.$data_no);
		MCIndexKey slsSlipSndIdx = slsSlipSndL.createIndex(MBT_SLS_SLIP_SND_IF_R.$data_lno);
		for (Chk01_RsltR up0R : up0l) {
			for (Chk01_DtlR up1R : up1l.subList(up1Idx, up0R.data_no())) {
				MBT_SLS_SLIP_SND_IF_R slsSlipSndR = slsSlipSndL.getFirst(slsSlipSndIdx, up1R.data_lno());
				MCMessageList tmpMsg = checkUpdCntrNE(up1R, Chk01_DtlR.$upd_cntr, slsSlipSndR);

				if (!tmpMsg.isEmpty()) {
					tmpMsg.get(0).setCauseRow(up0R, null);
					msgL.addAll(tmpMsg);
					break;
				}
			}
		}

		return msgL;
	}

	//FMCB CUSTOM END
}