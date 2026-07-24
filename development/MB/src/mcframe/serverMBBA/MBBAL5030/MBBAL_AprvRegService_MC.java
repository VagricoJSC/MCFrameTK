package mcframe.serverMBBA.MBBAL5030;

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
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMBBA.MBBAL5030.*;	// このimportはFrameManagerの自動生成で追加されました。

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverMAUC.MAUCL5010.*;
import mcframe.serverMBBA.MBBAL5020.*;
import static mcframe.serverMBBA.MBBAL5030.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBAL_AprvRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBAL_AprvRegService_MC extends MBBAL_AprvRegService_MC_A{
	//FMCB CUSTOM START
	protected static final String UPD_CNTR_ERR_FLG = "upd_cntr_err_flg";
	
	/**
	 * Aprv_Srch01オペレーション.<p>
	 *
	 * 承認情報を検索する。<br>
	 */
	public class Aprv_Srch01 extends MBBAL_AprvRegService_MC_A.Aprv_Srch01 {

		/**
		 * ワーク
		 */
		MCList<Aprv_Srch01_Dtl1R> _wkL = down0().createInstance();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			editUp();
			sel();
			crtDown();
			sortDown();
		}

		/**
		 * 上り電文を編集します。
		 */
		protected void editUp() {
			up0().usr_dtl_flg_str(up0().usr_dtl_flg() ?
					MCBooleanUtil.booleanToDBString(true) : null);
		}

		/**
		 * 承認情報を検索します。
		 */
		protected void sel() {
			executeQuery(_wkL, MBBAL5030_MBT_APRV_S01(), up0());
		}

		/**
		 * 下り電文を作成します。
		 */
		protected void crtDown() {
			for (Aprv_Srch01_Dtl1R wkR : _wkL) {
				boolean mr = up0().main_role_flg() && wkR.main_role_flg();
				boolean sr = up0().sub_role_flg() && wkR.sub_role_flg();
				boolean match = mr || sr;
				wkR.match_cnd_flg(wkR.match_cnd_flg() && match);
			}
			MCList<Aprv_Srch01_Dtl1R>[] wkGLArr = _wkL.groupList(getAprvNoCols());
			MCRowMatcher<Aprv_Srch01_Dtl1R> tgtRM = r -> {
				return r.match_cnd_flg();
			};
			for (MCList<Aprv_Srch01_Dtl1R> wkGL : wkGLArr) {
				MCList<Aprv_Srch01_Dtl1R> tgtL = wkGL.subList(tgtRM);
				if (!tgtL.isEmpty()) {
					down0().addAll(wkGL);
				}
			}
		}

		/**
		 * 下り電文をソートします。
		 */
		protected void sortDown() {
			String[] cols = new String[] {
				  Aprv_Srch01_Dtl1R.$aprv_no
				, Aprv_Srch01_Dtl1R.$aprv_no_seq
				, Aprv_Srch01_Dtl1R.$aprv_seq
			};
			down0().sort(cols);
		}

	}

	/**
	 * Aprv_Srch02オペレーション.<p>
	 *
	 * 承認状況を検索する。<br>
	 */
	public class Aprv_Srch02 extends MBBAL_AprvRegService_MC_A.Aprv_Srch02 {

		@Override
		protected void call() {
			mapUpContainers(AP);
			so01.exec();
			mapDownContainers(AP);
		}

	}

	// **********************************************************************

	/**
	 * オブジェクト共有用のクラス
	 */
	protected static final Class<MBBAL_AprvRegService> CLAZZ =
			MBBAL_AprvRegService.class;

	/**
	 * 承認情報ヘッダ
	 */
	protected Map<List<Comparable<?>>, MBT_APRV_R> _hdrMap = null;

	/**
	 * 承認情報明細
	 */
	protected Map<List<Comparable<?>>, MBT_APRV_D_R> _dtlMap = null;

	/**
	 * 承認情報ヘッダを取得します。
	 */
	protected static Map<List<Comparable<?>>, MBT_APRV_R> getHdrMap() {
		return object(CLAZZ)._getHdrMap();
	}

	/**
	 * 承認情報ヘッダを取得します。
	 */
	protected Map<List<Comparable<?>>, MBT_APRV_R> _getHdrMap() {
		if (_hdrMap == null) {
			_hdrMap = new HashMap<>();
		}
		return _hdrMap;
	}

	/**
	 * 承認情報明細を取得します。
	 */
	protected static Map<List<Comparable<?>>, MBT_APRV_D_R> getDtlMap() {
		return object(CLAZZ)._getDtlMap();
	}

	/**
	 * 承認情報明細を取得します。
	 */
	protected Map<List<Comparable<?>>, MBT_APRV_D_R> _getDtlMap() {
		if (_dtlMap == null) {
			_dtlMap = new HashMap<>();
		}
		return _dtlMap;
	}

	/**
	 * Aprv_Chk01オペレーション.<p>
	 *
	 * 承認または却下する際のチェックを行う。<br>
	 */
	public class Aprv_Chk01 extends MBBAL_AprvRegService_MC_A.Aprv_Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void init() {
			super.init();
			editUp(up0());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			sprt();
			MCMessageList msgL = super.doServerCheckBase();
			dbUp(up0());
			msgL.addAll(chkHdr(up0()));
			msgL.addAll(chkDtl(up0(), true));
			return msgL;
		}

		/**
		 * データを補填します。
		 */
		protected void sprt() {
			up0().setString(Aprv_Chk01_Rslt1R.$act_usr_cd, MCSys.user.ID());
		}

		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			msgL.addAll(addlReqChk());
			msgL.addAll(addlCstChk());
			return msgL;
		}

		/**
		 * 追加の必須チェックを行います。
		 */
		protected MCMessageList addlReqChk() {
			MCMessageList msgL = new MCMessageList();
			String[] cols = new String[] {
				  Aprv_Chk01_Rslt1R.$aprv_d_sts_typ
			};
			for (String col : cols) {
				msgL.addAll(FXUCL_ValidaterUtil.check(
						up0(), col, new FXUCL_RequiredValidater()));
			}
			return msgL;
		}

		/**
		 * 追加の定数チェックを行います。
		 */
		protected MCMessageList addlCstChk() {
			MCMessageList msgL = new MCMessageList();
			String[] cols = new String[] {
				  Aprv_Chk01_Rslt1R.$aprv_d_sts_typ
			};
			Aprv_Chk01_Rslt1R protoR = up0().createRow();
			for (String col : cols) {
				Map<String, String> cstMap = protoR.getExtMap(CHK_CONST);
				if (cstMap != null && !isNull(cstMap.get(col))) {
					MCAppConst[] cArr = getConstArray(cstMap.get(col));
					msgL.addAll(FXUCL_ValidaterUtil.check(
							up0(), col, getConstExistValidater(col, cArr)));
				}
			}
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(chkSeq(up0()));
			msgL.addAll(chkDtlSts());
			return msgL;
		}

		/**
		 * 承認明細状況区分をチェックします。
		 */
		protected MCMessageList chkDtlSts() {
			MCMessageList msgL = new MCMessageList();
			MCList<Aprv_Chk01_Rslt1R>[] upGLArr = up0().groupList(getAprvNoCols());
			MCRowMatcher<Aprv_Chk01_Rslt1R> tgtRM = r -> {
				String dSts = r.aprv_d_sts_typ();
				boolean acpt = MAC_APRV_D_STS_TYP.isACPT(dSts);
				boolean rjct = MAC_APRV_D_STS_TYP.isRJCT(dSts);
				return acpt || rjct; 
			};
			String col = Aprv_Chk01_Rslt1R.$aprv_d_sts_typ;
			MCRowMatcher<Aprv_Chk01_Rslt1R> othRM = r -> !tgtRM.match(r) &&
					MAC_APRV_D_STS_TYP.contains(r.aprv_d_sts_typ());
			for (MCList<Aprv_Chk01_Rslt1R> upGL : upGLArr) {
				MCList<Aprv_Chk01_Rslt1R> tgtL = upGL.subList(tgtRM);
				List<String> tgtDStsL = tgtL.groupBy(col).getString(col);
				if (tgtDStsL.size() > 1) {
					for (Aprv_Chk01_Rslt1R tgtR : tgtL) {
						msgL.add(new MCMessage(
								tgtR, null, MBBAL0010, tgtR.aprv_no()));
					}
				}
				MCList<Aprv_Chk01_Rslt1R> othL = upGL.subList(othRM);
				for (Aprv_Chk01_Rslt1R othR : othL) {
					msgL.add(new MCMessage(
							othR, null, MBBAL0011, othR.aprv_d_sts_typ()));
				}
			}
			return msgL;
		}

		@Override
		protected void doIt() {
			super.doIt();
			crtDown();
		}

		/**
		 * 下り電文を作成します。
		 */
		protected void crtDown() {
			down0().addAll(up0());
		}

	}

	/**
	 * Aprv_Chk02オペレーション.<p>
	 *
	 * 承認または却下を取り消す際のチェックを行う。<br>
	 */
	public class Aprv_Chk02 extends MBBAL_AprvRegService_MC_A.Aprv_Chk02 {

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void init() {
			super.init();
			editUp(up0());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			sprt();
			MCMessageList msgL = super.doServerCheckBase();
			dbUp(up0());
			msgL.addAll(chkHdr(up0()));
			msgL.addAll(chkDtl(up0(), true));
			return msgL;
		}

		/**
		 * データを補填します。
		 */
		protected void sprt() {
			up0().setString(Aprv_Chk01_Rslt1R.$act_usr_cd, MCSys.user.ID());
			up0().setString(Aprv_Chk01_Rslt1R.$aprv_d_sts_typ,
					MAC_APRV_D_STS_TYP.OPN.value());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(chkSeq(up0()));
			return msgL;
		}

		@Override
		protected void doIt() {
			super.doIt();
			crtDown();
		}

		/**
		 * 下り電文を作成します。
		 */
		protected void crtDown() {
			down0().addAll(up0());
		}

	}

	/**
	 * Aprv_Chk03オペレーション.<p>
	 *
	 * 承認情報を更新する際のチェックを行う。<br>
	 */
	public class Aprv_Chk03 extends MBBAL_AprvRegService_MC_A.Aprv_Chk03 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void init() {
			super.init();
			editUp(up0());
			regUpWk(up0());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			dbUp(up0());
			msgL.addAll(chkHdr(up0()));
			msgL.addAll(chkDtl(up0(), false));
			return msgL;
		}

		@Override
		protected void doIt() {
			super.doIt();
			crtDown();
		}

		/**
		 * 下り電文を作成します。
		 */
		protected void crtDown() {
			down0().addAll(up0());
		}

	}

	/**
	 * 上り電文に対応するDB処理を行います。
	 */
	protected void dbUp(MCList<Aprv_Chk01_Rslt1R> upL) {
		MCDBContainer wkTbl = regUpWk(upL);
		selHdr(upL, wkTbl);
		selDtl(upL, wkTbl);
	}

	/**
	 * 上り電文をワークテーブルに登録します。
	 */
	protected MCDBContainer regUpWk(MCList<Aprv_Chk01_Rslt1R> upL) {
		List<BiConsumer<MBT_APRV_D_R, Aprv_Chk01_Rslt1R>> cpyL = new ArrayList<>();
		BiConsumer<MBT_APRV_D_R, Aprv_Chk01_Rslt1R> cpy = (d, s) -> {
			d.aprv_no(s.aprv_no());
			d.aprv_no_seq(s.aprv_no_seq());
			d.aprv_role_cd(s.aprv_role_cd());
			d.aprv_usr_cd(s.aprv_usr_cd());
		};
		cpyL.add(cpy);
		return getRegWk(MBT_APRV_D_R.class, upL, cpyL);
	}

	/**
	 * 上り電文を編集します。
	 * @param upL 上り電文
	 */
	protected void editUp(MCList<Aprv_Chk01_Rslt1R> upL) {
		upL.addBooleanColumn(UPD_CNTR_ERR_FLG, false);
	}
	
	/**
	 * 承認情報ヘッダを検索します。
	 */
	protected void selHdr(MCList<Aprv_Chk01_Rslt1R> upL, MCDBContainer wkTbl) {
		MCList<MBT_APRV_R> hdrL = MCList.create(MBT_APRV_R.class);
		MBT_APRV_R hdrR = MBT_APRV_R.create("T");
		MCQueryApiBuilder hdrR_bldr = MCQueryApiBuilder.create(hdrR);
		setSelWk(hdrR, hdrR_bldr, wkTbl, true);
		dbSelectForUpdateNoWait("MBBAL5030_MBT_APRV_S01", hdrL, hdrR_bldr);
		getHdrMap().putAll(crtRowMap(hdrL, hdrR.getKeyColumn()));
	}

	/**
	 * 承認情報明細を検索します。
	 */
	protected void selDtl(MCList<Aprv_Chk01_Rslt1R> upL, MCDBContainer wkTbl) {
		MCList<MBT_APRV_D_R> dtlL = MCList.create(MBT_APRV_D_R.class);
		MBT_APRV_D_R dtlR = MBT_APRV_D_R.create("T");
		MCQueryApiBuilder dtlR_bldr = MCQueryApiBuilder.create(dtlR);
		setSelWk(dtlR, dtlR_bldr, wkTbl, false);
		dtlR_bldr.buildSelect("MBBAL5030_MBT_APRV_D_S01").executeQuery(dtlL);
		getDtlMap().putAll(crtRowMap(dtlL, dtlR.getKeyColumn()));
	}

	/**
	 * 承認情報ヘッダの更新可能性をチェックします。
	 */
	protected MCMessageList chkHdr(MCList<Aprv_Chk01_Rslt1R> upL) {
		MCMessageList msgL = new MCMessageList();
		for (Aprv_Chk01_Rslt1R upR : upL) {
			Comparable<?>[] vals = upR.toArray(getAprvNoCols());
			MBT_APRV_R hdrR = getMapVal(getHdrMap(), vals);
			if (hdrR == null) {
				msgL.add(new MCMessage(upR, null, MBBAL0002, (Object[]) vals));
			}
			else {
				if (upR.upd_cntr_chk_flg()) {
					MCMessageList cntrMsgL = new MCMessageList();
					cntrMsgL.addAll(checkUpdCntrNE(upR, Aprv_Chk01_Rslt1R.$upd_cntr, hdrR));
					if (cntrMsgL.size() > 0) {
						upR.setBooleanNE(UPD_CNTR_ERR_FLG, true);
						msgL.addAll(cntrMsgL);
					}
				}
				if (hdrR.can_flg() && !upR.getBooleanNE(UPD_CNTR_ERR_FLG)) {
					msgL.add(new MCMessage(upR, null, MBBAL0004, (Object[]) vals));
				}
			}
		}
		return msgL;
	}

	/**
	 * 承認情報明細の更新可能性をチェックします。
	 */
	protected MCMessageList chkDtl(
			MCList<Aprv_Chk01_Rslt1R> upL, boolean chkNotUpdFlg) {
		MCMessageList msgL = new MCMessageList();
		String[] cols = new String[] {
			  Aprv_Chk01_Rslt1R.$aprv_no
			, Aprv_Chk01_Rslt1R.$aprv_no_seq
			, Aprv_Chk01_Rslt1R.$aprv_role_cd
			, Aprv_Chk01_Rslt1R.$aprv_usr_cd
		};
		for (Aprv_Chk01_Rslt1R upR : upL) {
			if (upR.getBooleanNE(UPD_CNTR_ERR_FLG)) {
				continue;
			}
			Comparable<?>[] vals = upR.toArray(cols);
			MBT_APRV_D_R dtlR = getMapVal(getDtlMap(), vals);
			if (dtlR == null) {
				msgL.add(new MCMessage(upR, null, MBBAL0003, (Object[]) vals));
			}
			else {
				if (chkNotUpdFlg && dtlR.not_upd_flg()) {
					msgL.add(new MCMessage(upR, null, MBBAL0006, (Object[]) vals));
				}
			}
		}
		return msgL;
	}

	/**
	 * 確認順番をチェックします。
	 */
	protected MCMessageList chkSeq(MCList<Aprv_Chk01_Rslt1R> upL) {
		MCMessageList msgL = new MCMessageList();
		MCList<Aprv_Chk01_Rslt1R>[] upGLArr = upL.groupList(getAprvNoCols());
		MCList<MBT_APRV_D_R> dtlL = MCList.create(MBT_APRV_D_R.class);
		String[] cols = new String[] {
			  Aprv_Chk01_Rslt1R.$aprv_no
			, Aprv_Chk01_Rslt1R.$aprv_no_seq
			, Aprv_Chk01_Rslt1R.$aprv_role_cd
			, Aprv_Chk01_Rslt1R.$aprv_usr_cd
		};
		String col = MBT_APRV_D_R.$aprv_seq;
		for (MCList<Aprv_Chk01_Rslt1R> upGL : upGLArr) {
			for (Aprv_Chk01_Rslt1R upGR : upGL) {
				Comparable<?>[] vals = upGR.toArray(cols);
				dtlL.add(getMapVal(getDtlMap(), vals));
			}
			List<MCNumber> seqL = dtlL.groupBy(col).getNumber(col);
			if (seqL.size() > 1) {
				for (Aprv_Chk01_Rslt1R upGR : upGL) {
					msgL.add(new MCMessage(
							upGR, null, MBBAL0009, upGR.aprv_no()));
				}
			}
			dtlL.clear();
		}
		return msgL;
	}

	// **********************************************************************

	/**
	 * 承認情報ヘッダ（登録対象）
	 */
	MCList<MBT_APRV_R> _regHdrL = MCList.create(MBT_APRV_R.class);

	/**
	 * 承認情報明細
	 */
	protected Map<List<Comparable<?>>, MCList<MBT_APRV_D_R>>
			_dtl2Map = new HashMap<>();

	/**
	 * 承認情報明細（一部）
	 */
	protected MCList<MBT_APRV_D_R>
			_ptDtl1L = MCList.create(MBT_APRV_D_R.class);

	/**
	 * 承認情報明細（一部）
	 */
	protected MCList<MBT_APRV_D_R>
			_ptDtl2L = MCList.create(MBT_APRV_D_R.class);

	/**
	 * 承認情報明細（登録対象）
	 */
	protected MCList<MBT_APRV_D_R>
			_regDtl1L = MCList.create(MBT_APRV_D_R.class);

	/**
	 * 承認情報明細（登録対象）
	 */
	protected MCList<MBT_APRV_D_R>
			_regDtl2L = MCList.create(MBT_APRV_D_R.class);

	/**
	 * 承認事後サービスの上り電文
	 */
	protected Map<List<Comparable<?>>, AprvAfter_Upd01_CndR>
			_svcUpMap = new HashMap<>();

	/**
	 * Aprv_Upd01オペレーション.<p>
	 *
	 * 承認または却下する。<br>
	 */
	public class Aprv_Upd01 extends MBBAL_AprvRegService_MC_A.Aprv_Upd01 {

		@Override
		protected void call() {
			callChk();
	
			MCList<Aprv_Chk01_Rslt1R> notErrL = up0().subList(Aprv_Chk01_Rslt1R.$err_flg, false);
			if (notErrL.size() != 0) {
				selDtl2();
				crt(notErrL);
				regDtl1();
				regDtl2();
				regHdr();
				callSvc();
			}
			setDown();
		}

		/**
		 * チェック処理を呼び出します。
		 */
		protected void callChk() {
			MBBAL_AprvRegService.Aprv_Chk01 ope = MBBAL_AprvRegService.crtAprv_Chk01();
			ope.up0().addAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 登録データを作成します。
		 */
		protected void crt(MCList<Aprv_Chk01_Rslt1R> notErrL) {
			MCList<Aprv_Chk01_Rslt1R>[] upGLArr = notErrL.groupList(getAprvNoCols());
			for (MCList<Aprv_Chk01_Rslt1R> upGL : upGLArr) {
				crtPtRegDtl(upGL);
				crtRegDtl();
				crtRegHdrAndSvcUp(upGL);
				callPushNtc(upGL);
				clrPtRegDtl();
			}
		}

		/**
		 * 承認情報明細を作成します。
		 */
		protected void crtPtRegDtl(MCList<Aprv_Chk01_Rslt1R> upL) {
			if (upL == null) {
				return;
			}
			for (Aprv_Chk01_Rslt1R upR : upL) {
				MBT_APRV_D_R regDtlR = _ptDtl1L.createRow();
				regDtlR.aprv_no(upR.aprv_no());
				regDtlR.aprv_no_seq(upR.aprv_no_seq());
				regDtlR.aprv_role_cd(upR.aprv_role_cd());
				regDtlR.aprv_usr_cd(upR.aprv_usr_cd());
				regDtlR.aprv_d_sts_typ(upR.aprv_d_sts_typ());
				regDtlR.aprv_d_tm(MCDate.now());
				boolean main = isSame(upR.aprv_usr_cd(), upR.act_usr_cd());
				regDtlR.deputy_flg(!main);
				regDtlR.deputy_usr_cd(main ? null : upR.act_usr_cd());
				regDtlR.aprv_d_rmrks(upR.aprv_d_rmrks());
				regDtlR.sub_char1(upR.sub_char1());
				regDtlR.sub_char2(upR.sub_char2());
				regDtlR.sub_char3(upR.sub_char3());
				_ptDtl1L.add(regDtlR);
			}
			editNotUpdFlg(upL);
		}

		/**
		 * 承認情報ヘッダ及び承認事後サービスの上り電文を作成します。
		 */
		protected void crtRegHdrAndSvcUp(MCList<Aprv_Chk01_Rslt1R> upL) {
			if (upL == null) {
				return;
			}
			MCList<MBT_APRV_D_R> dtlL = MCList.create(MBT_APRV_D_R.class);
			dtlL.addAll(_ptDtl1L);

			Comparable<?>[] vals = upL.get(0).toArray(getAprvNoCols());
			if (_dtl2Map.containsKey(Arrays.asList(vals))) {
				for (MBT_APRV_D_R dtlR : _dtl2Map.get(Arrays.asList(vals))) {
					dtlL.add(dtlR);
				}
			}
			String aprvStsTyp = getSts(dtlL);

			String lastAprvUsrCd = null;
			MCDate lastAprvTm = null;
			// 未承認にはならない。
			if (!MAC_APRV_STS_TYP.isFIX(aprvStsTyp)) {
				lastAprvUsrCd = upL.get(0).act_usr_cd();
				lastAprvTm = MCDate.now();
			}
			MBT_APRV_R regHdrR = _regHdrL.createRow();
			regHdrR.aprv_no(upL.get(0).aprv_no());
			regHdrR.aprv_no_seq(upL.get(0).aprv_no_seq());
			regHdrR.aprv_sts_typ(aprvStsTyp);
			regHdrR.last_aprv_usr_cd(lastAprvUsrCd);
			regHdrR.last_aprv_tm(lastAprvTm);
			_regHdrL.add(regHdrR);
			MBT_APRV_R hdrR = getMapVal(getHdrMap(), vals);
			AprvAfter_Upd01_CndR svcUpR = AprvAfter_Upd01_CndR.create();
			svcUpR.aprv_no(hdrR.aprv_no());
			svcUpR.aprv_sts_typ(aprvStsTyp);
			svcUpR.old_aprv_sts_typ(hdrR.aprv_sts_typ());
			svcUpR.last_aprv_usr_cd(lastAprvUsrCd);
			svcUpR.last_aprv_tm(lastAprvTm);
			svcUpR.src_itm_cd(hdrR.src_itm_cd());
			svcUpR.src_itm_sub1(hdrR.src_itm_sub1());
			svcUpR.src_itm_sub2(hdrR.src_itm_sub2());
			svcUpR.src_itm_sub3(hdrR.src_itm_sub3());
			svcUpR.src_dpt_cd(hdrR.src_dpt_cd());
			svcUpR.src_bp_cd(hdrR.src_bp_cd());
			svcUpR.src_cur_cd1(hdrR.src_cur_cd1());
			svcUpR.src_amt1(hdrR.src_amt1());
			svcUpR.src_cur_cd2(hdrR.src_cur_cd2());
			svcUpR.src_amt2(hdrR.src_amt2());
			svcUpR.src_cur_cd3(hdrR.src_cur_cd3());
			svcUpR.src_amt3(hdrR.src_amt3());
			svcUpR.src_ext_key1(hdrR.src_ext_key1());
			svcUpR.src_ext_key2(hdrR.src_ext_key2());
			svcUpR.src_ext_key3(hdrR.src_ext_key3());
			svcUpR.aprv_src_no1(hdrR.aprv_src_no1());
			svcUpR.aprv_src_no2(hdrR.aprv_src_no2());
			_svcUpMap.put(Arrays.asList(vals), svcUpR);
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Aprv_Upd02オペレーション.<p>
	 *
	 * 承認または却下を取り消す。<br>
	 */
	public class Aprv_Upd02 extends MBBAL_AprvRegService_MC_A.Aprv_Upd02 {

		@Override
		protected void call() {
			callChk();
			MCList<Aprv_Chk01_Rslt1R> notErrL = up0().subList(Aprv_Chk01_Rslt1R.$err_flg, false);
			if (notErrL.size() != 0) {
				selDtl2();
				crt(notErrL);
				regDtl1();
				regDtl2();
				regHdr();
				callSvc();
			}
			setDown();
		}

		/**
		 * チェック処理を呼び出します。
		 */
		protected void callChk() {
			MBBAL_AprvRegService.Aprv_Chk02 ope = MBBAL_AprvRegService.crtAprv_Chk02();
			ope.up0().addAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 登録データを作成します。
		 */
		protected void crt(MCList<Aprv_Chk01_Rslt1R> notErrL) {
			MCList<Aprv_Chk01_Rslt1R>[] upGLArr = notErrL.groupList(getAprvNoCols());
			for (MCList<Aprv_Chk01_Rslt1R> upGL : upGLArr) {
				crtPtRegDtl(upGL);
				crtRegDtl();
				crtRegHdrAndSvcUp(upGL);
				callPushNtc(upGL);
				clrPtRegDtl();
			}
		}

		/**
		 * 承認情報明細を作成します。
		 */
		protected void crtPtRegDtl(MCList<Aprv_Chk01_Rslt1R> upL) {
			if (upL == null) {
				return;
			}
			for (Aprv_Chk01_Rslt1R upR : upL) {
				MBT_APRV_D_R regDtlR = _ptDtl1L.createRow();
				regDtlR.aprv_no(upR.aprv_no());
				regDtlR.aprv_no_seq(upR.aprv_no_seq());
				regDtlR.aprv_role_cd(upR.aprv_role_cd());
				regDtlR.aprv_usr_cd(upR.aprv_usr_cd());
				regDtlR.aprv_d_sts_typ(upR.aprv_d_sts_typ());
				regDtlR.aprv_d_tm(null);
				regDtlR.deputy_flg(false);
				regDtlR.deputy_usr_cd(null);
				regDtlR.aprv_d_rmrks(upR.aprv_d_rmrks());
				regDtlR.sub_char1(upR.sub_char1());
				regDtlR.sub_char2(upR.sub_char2());
				regDtlR.sub_char3(upR.sub_char3());
				_ptDtl1L.add(regDtlR);
			}
			editNotUpdFlg(upL);
		}

		/**
		 * 承認情報ヘッダ及び承認事後サービスの上り電文を作成します。
		 */
		protected void crtRegHdrAndSvcUp(MCList<Aprv_Chk01_Rslt1R> upL) {
			if (upL == null) {
				return;
			}
			MCList<MBT_APRV_D_R> dtlL = MCList.create(MBT_APRV_D_R.class);
			dtlL.addAll(_ptDtl1L);

			Comparable<?>[] vals = upL.get(0).toArray(getAprvNoCols());
			if (_dtl2Map.containsKey(Arrays.asList(vals))) {
				for (MBT_APRV_D_R dtlR : _dtl2Map.get(Arrays.asList(vals))) {
					dtlL.add(dtlR);
				}
			}
			String aprvStsTyp = getSts(dtlL);

			MBT_APRV_R regHdrR = _regHdrL.createRow();
			regHdrR.aprv_no(upL.get(0).aprv_no());
			regHdrR.aprv_no_seq(upL.get(0).aprv_no_seq());
			regHdrR.aprv_sts_typ(aprvStsTyp);
			regHdrR.last_aprv_usr_cd(null);
			regHdrR.last_aprv_tm(null);
			_regHdrL.add(regHdrR);
			MBT_APRV_R hdrR = getMapVal(getHdrMap(), vals);
			AprvAfter_Upd01_CndR svcUpR = AprvAfter_Upd01_CndR.create();
			
			svcUpR.aprv_no(hdrR.aprv_no());
			svcUpR.aprv_sts_typ(aprvStsTyp);
			svcUpR.old_aprv_sts_typ(hdrR.aprv_sts_typ());
			svcUpR.last_aprv_usr_cd(null);
			svcUpR.last_aprv_tm(null);
			svcUpR.src_itm_cd(hdrR.src_itm_cd());
			svcUpR.src_itm_sub1(hdrR.src_itm_sub1());
			svcUpR.src_itm_sub2(hdrR.src_itm_sub2());
			svcUpR.src_itm_sub3(hdrR.src_itm_sub3());
			svcUpR.src_dpt_cd(hdrR.src_dpt_cd());
			svcUpR.src_bp_cd(hdrR.src_bp_cd());
			svcUpR.src_cur_cd1(hdrR.src_cur_cd1());
			svcUpR.src_amt1(hdrR.src_amt1());
			svcUpR.src_cur_cd2(hdrR.src_cur_cd2());
			svcUpR.src_amt2(hdrR.src_amt2());
			svcUpR.src_cur_cd3(hdrR.src_cur_cd3());
			svcUpR.src_amt3(hdrR.src_amt3());
			svcUpR.src_ext_key1(hdrR.src_ext_key1());
			svcUpR.src_ext_key2(hdrR.src_ext_key2());
			svcUpR.src_ext_key3(hdrR.src_ext_key3());
			svcUpR.aprv_src_no1(hdrR.aprv_src_no1());
			svcUpR.aprv_src_no2(hdrR.aprv_src_no2());
			_svcUpMap.put(Arrays.asList(vals), svcUpR);
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Aprv_Upd03オペレーション.<p>
	 *
	 * 承認情報を更新する。<br>
	 */
	public class Aprv_Upd03 extends MBBAL_AprvRegService_MC_A.Aprv_Upd03 {

		@Override
		protected void call() {
			callChk();
			MCList<Aprv_Chk01_Rslt1R> notErrL = up0().subList(Aprv_Chk01_Rslt1R.$err_flg, false);
			if (notErrL.size() != 0) {
				crtRegDtl1I(notErrL);
				regDtl1I();
				regHdrI();
			}
			setDown();
		}

		/**
		 * チェック処理を呼び出します。
		 */
		protected void callChk() {
			MBBAL_AprvRegService.Aprv_Chk03 ope = MBBAL_AprvRegService.crtAprv_Chk03();
			ope.up0().addAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 承認情報明細を作成します。
		 */
		protected void crtRegDtl1I(MCList<Aprv_Chk01_Rslt1R> notErrL) {
			for (Aprv_Chk01_Rslt1R upR : notErrL) {
				MBT_APRV_D_R regDtlR = MBT_APRV_D_R.create();
				regDtlR.aprv_no(upR.aprv_no());
				regDtlR.aprv_no_seq(upR.aprv_no_seq());
				regDtlR.aprv_role_cd(upR.aprv_role_cd());
				regDtlR.aprv_usr_cd(upR.aprv_usr_cd());
				regDtlR.aprv_d_rmrks(upR.aprv_d_rmrks());
				regDtlR.sub_char1(upR.sub_char1());
				regDtlR.sub_char2(upR.sub_char2());
				regDtlR.sub_char3(upR.sub_char3());
				_ptDtl1L.add(regDtlR);
			}
		}

		/**
		 * 承認情報明細を登録します。
		 */
		protected void regDtl1I() {
			MCList<MBT_APRV_D_R> dtlL = MCList.create(MBT_APRV_D_R.class);
			MBT_APRV_D_R t = MBT_APRV_D_R.create("T");
			MCQueryApiBuilder dtlL_bldr = MCQueryApiBuilder.create(t);
			dtlL.setAll(_ptDtl1L);
			dtlL_bldr.setSet(t.aprv_d_rmrks, t.sub_char1, t.sub_char2, t.sub_char3);
			dbUpdateKey("MBBAL5030_MBT_APRV_D_U01", dtlL, dtlL_bldr);
		}

		/**
		 * 承認情報ヘッダを登録します。
		 */
		protected void regHdrI() {
			dbTsUpdateKey("MBBAL5030_MBT_APRV_U01",
					_ptDtl1L.groupBy(MBT_APRV_D_R.$aprv_no, MBT_APRV_D_R.$aprv_no_seq),
					MBT_APRV_R.create("T"));
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * 承認情報明細を検索します。
	 */
	protected void selDtl2() {
		MCList<MBT_APRV_D_R> dtlL = MCList.create(MBT_APRV_D_R.class);
		MBT_APRV_D_R dtlR = MBT_APRV_D_R.create("T");
		MCQueryApiBuilder dtlR_bldr = MCQueryApiBuilder.create(dtlR);
		setSelWk(dtlR, dtlR_bldr, null, false, getAprvNoCols());
		dtlR_bldr.buildSelect("MBBAL5030_MBT_APRV_D_S02").executeQuery(dtlL);
		MCRowMatcher<MBT_APRV_D_R> tgtRM = r -> {
			Comparable<?>[] vals = r.toArray(r.getKeyColumn());
			return !getDtlMap().containsKey(Arrays.asList(vals));
		};
		_dtl2Map.putAll(crtListMap(dtlL.subList(tgtRM), getAprvNoCols()));
	}

	/**
	 * 更新不可フラグを編集します。
	 */
	protected void editNotUpdFlg(MCList<Aprv_Chk01_Rslt1R> upL) {
		if (upL == null) {
			return;
		}
		MCNumber tgtSeq = Collections.min(getSeqL(_ptDtl1L));
		if (tgtSeq == null) {
			return;
		}
		Comparable<?>[] vals = upL.get(0).toArray(getAprvNoCols());
		MCList<MBT_APRV_D_R> dtl2L = getMapVal(_dtl2Map, vals);
		if (dtl2L == null) {
			return;
		}
		List<MCNumber> seqL = getSeqL(dtl2L);
		int prev = -1; int curt = -1; int next = -1;
		for (int i = 0; i < seqL.size(); i++) {
			MCNumber seq = seqL.get(i);
			if (tgtSeq.gt(seq)) {prev = i; continue;}
			if (tgtSeq.eq(seq)) {curt = i; continue;}
			if (tgtSeq.lt(seq)) {next = i; break;}
		}
		MCList<MBT_APRV_D_R>[] seqLArr =
				dtl2L.groupList(MBT_APRV_D_R.$aprv_seq);
		MCList<MBT_APRV_D_R> prevL, curtL, nextL;
		prevL = (prev < 0 ? null : seqLArr[prev]);
		curtL = (curt < 0 ? null : seqLArr[curt]);
		nextL = (next < 0 ? null : seqLArr[next]);
		_ptDtl2L.addAll(prevL);
		_ptDtl2L.addAll(curtL);
		_ptDtl2L.addAll(nextL);
		MCList<MBT_APRV_D_R> mrgL = MCList.create(MBT_APRV_D_R.class);
		mrgL.addAll(_ptDtl1L);
		mrgL.addAll(curtL);
		editNotUpdFlg(upL, prevL, mrgL, nextL);
	}

	/**
	 * 承認順番を取得します。
	 */
	protected List<MCNumber> getSeqL(MCList<MBT_APRV_D_R> dtlL) {
		List<MCNumber> ret = new ArrayList<>();
		if (dtlL == null) {
			return ret;
		}
		MCList<MBT_APRV_D_R> tmpL = dtlL.createInstance();
		for (MBT_APRV_D_R dtlR : dtlL) {
			if (dtlR.aprv_seq() == null) {
				Comparable<?>[] vals = dtlR.toArray(dtlR.getKeyColumn());
				tmpL.add(getMapVal(getDtlMap(), vals));
			}
			else {
				tmpL.add(dtlR);
			}
		}
		String col = MBT_APRV_D_R.$aprv_seq;
		ret.addAll(tmpL.groupBy(col).getNumber(col));
		return ret;
	}

	/**
	 * 更新不可フラグを編集します。
	 */
	protected void editNotUpdFlg(
			MCList<Aprv_Chk01_Rslt1R> upL, MCList<MBT_APRV_D_R> prevL,
			MCList<MBT_APRV_D_R> curtL, MCList<MBT_APRV_D_R> nextL) {
		if (upL == null) {
			return;
		}
		Comparable<?>[] vals = upL.get(0).toArray(getAprvNoCols());
		MBT_APRV_R hdrR = getMapVal(getHdrMap(), vals);
		MAC_APRV_FUNC_TYP aprvFuncTyp = MAC_APRV_FUNC_TYP.get(hdrR.aprv_func_typ());
		String tgtSts = getSts(curtL);
		if (MAC_APRV_STS_TYP.isOPN(tgtSts)) {
			editNotUpdFlg(prevL, false);
			editNotUpdFlg(curtL, false);
			editNotUpdFlg(nextL, true);
		}
		else if (MAC_APRV_STS_TYP.isFIX(tgtSts)) {
			editNotUpdFlg(prevL, true);
			editNotUpdFlg(curtL, false);
			editNotUpdFlg(nextL, true);
		}
		else if (MAC_APRV_STS_TYP.isACPT(tgtSts)) {
			editNotUpdFlg(prevL, true);
			editNotUpdFlg(curtL, false);
			editNotUpdFlg(nextL, false);
		}
		else {
			editNotUpdFlg(prevL, true);
			// 単価マスタ承認の場合、却下されると承認フローが終了する。
			if (aprvFuncTyp != null && aprvFuncTyp.is_upri_master_typ()) {
				editNotUpdFlg(curtL, true);
			}
			else if (curtL != null) {
				MCRowMatcher<MBT_APRV_D_R> rjctRM =
						r -> MAC_APRV_D_STS_TYP.isRJCT(r.aprv_d_sts_typ());
				editNotUpdFlg(curtL.subList(rjctRM), false);
				editNotUpdFlg(curtL.subList(r -> !rjctRM.match(r)), true);
			}
			editNotUpdFlg(nextL, true);
		}
	}

	/**
	 * 承認状況区分を取得します。
	 */
	protected String getSts(MCList<MBT_APRV_D_R> dtlL) {
		String ret = null;
		List<MCNumber> seqL = getSeqL(dtlL);
		List<String> dStsL = getDStsL(dtlL);
		if (seqL.isEmpty() || dStsL.isEmpty()) {
			return ret;
		}
		MCRowMatcher<MBT_APRV_D_R> rjctRM =
				r -> MAC_APRV_D_STS_TYP.isRJCT(r.aprv_d_sts_typ());
		MCList<MBT_APRV_D_R> rjctL = dtlL.subList(rjctRM);
		List<MCNumber> rjctSeqL = getSeqL(rjctL);
		if (!rjctSeqL.isEmpty()) {
			if (rjctSeqL.contains(seqL.get(seqL.size() - 1))) {
				ret = MAC_APRV_STS_TYP.LAST_RJCT.value();
			}
			else {
				ret = MAC_APRV_STS_TYP.RJCT.value();
			}
		}
		else if (dStsL.size() == 1) {
			if (MAC_APRV_D_STS_TYP.isOPN(dStsL.get(0))) {
				ret = MAC_APRV_STS_TYP.OPN.value();
			}
			else if (MAC_APRV_D_STS_TYP.isACPT(dStsL.get(0))) {
				ret = MAC_APRV_STS_TYP.ACPT.value();
			}
		}
		else {
			ret = MAC_APRV_STS_TYP.FIX.value();
		}
		return ret;
	}

	/**
	 * 承認明細状況区分を取得します。
	 */
	protected List<String> getDStsL(MCList<MBT_APRV_D_R> dtlL) {
		List<String> ret = new ArrayList<>();
		if (dtlL == null) {
			return ret;
		}
		String col = MBT_APRV_D_R.$aprv_d_sts_typ;
		ret.addAll(dtlL.groupBy(col).getString(col));
		return ret;
	}

	/**
	 * 更新不可フラグを編集します。
	 */
	protected void editNotUpdFlg(MCList<MBT_APRV_D_R> dtlL, boolean flg) {
		if (dtlL == null) {
			return;
		}
		dtlL.setBoolean(MBT_APRV_D_R.$not_upd_flg, flg);
	}

	/**
	 * 承認情報明細（登録対象）を作成します。
	 */
	protected void crtRegDtl() {
		_regDtl1L.addAll(_ptDtl1L);
		_regDtl2L.addAll(_ptDtl2L);
	}

	/**
	 * プッシュ通知処理を呼び出します。
	 */
	protected void callPushNtc(MCList<Aprv_Chk01_Rslt1R> upL) {
		if (upL == null) {
			return;
		}
		MCNumber tgtSeq = Collections.min(getSeqL(_ptDtl1L));
		MCList<MBT_APRV_D_R> curtL = _ptDtl2L.subList(r -> tgtSeq.eq(r.aprv_seq()));
		MCList<MBT_APRV_D_R> mrgL = MCList.create(MBT_APRV_D_R.class);
		mrgL.addAll(_ptDtl1L);
		mrgL.addAll(curtL);
		String tgtDSts = Collections.min(getDStsL(mrgL));
		if (tgtSeq == null || tgtDSts == null) {
			return;
		}
		String[] dtlCols = new String[] {
			  Aprv_Chk01_Rslt1R.$aprv_no
			, Aprv_Chk01_Rslt1R.$aprv_no_seq
			, Aprv_Chk01_Rslt1R.$aprv_role_cd
			, Aprv_Chk01_Rslt1R.$aprv_usr_cd
		};
		Map<List<Comparable<?>>, MBT_APRV_D_R> ptDtl1Map = crtRowMap(_ptDtl1L, dtlCols);
		Comparable<?>[] hdrVals = upL.get(0).toArray(getAprvNoCols());
		MBT_APRV_R hdrR = getMapVal(getHdrMap(), hdrVals);
		AprvAfter_Upd01_CndR svcUpR = getMapVal(_svcUpMap, hdrVals);
		MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();
		// ************************************************************
		MCList<MBT_APRV_R> hdrL = MCList.create(MBT_APRV_R.class);
		hdrL.add(hdrR);
		List<BiConsumer<MAM_BP_R, MBT_APRV_R>> bpCpyL = new ArrayList<>();
		bpCpyL.add((d, s) -> {d.bp_cd(s.src_bp_cd());});
		
		BiConsumer<MCDBContainer, MCQueryApiBuilder> bpCnd = (t, r_bldr) -> {
			r_bldr.setSelect(t.getColumn$("bp_cd"), t.getColumn$("bp_nm"));
		};
		Map<List<Comparable<?>>, MAM_BP_R> bpMap = getMap(MAM_BP_R.class, hdrL, bpCpyL, bpCnd);
		List<BiConsumer<MAM_USR_R, MBT_APRV_R>> usrCpyL = new ArrayList<>();
		
		usrCpyL.add((d, s) -> {d.usr_cd(s.biz_usr_cd());});
		usrCpyL.add((d, s) -> {d.usr_cd(s.src_ins_usr_cd());});
		
		BiConsumer<MCDBContainer, MCQueryApiBuilder> usrCnd = (t, r_bldr) -> {
			r_bldr.setSelect(t.getColumn$("usr_cd"), t.getColumn$("usr_nm"));
		};
		Map<List<Comparable<?>>, MAM_USR_R> usrMap = getMap(MAM_USR_R.class, hdrL, usrCpyL, usrCnd);
		List<BiConsumer<MAM_CUR_R, MBT_APRV_R>> curCpyL = new ArrayList<>();
		
		curCpyL.add((d, s) -> {d.cur_cd(s.src_cur_cd1());});
		
		BiConsumer<MCDBContainer, MCQueryApiBuilder> curCnd = (t, r_bldr) -> {
			r_bldr.setSelect(t.getColumn$("cur_cd"), t.getColumn$("cur_nm"));
		};
		Map<List<Comparable<?>>, MAM_CUR_R> curMap = getMap(MAM_CUR_R.class, hdrL, curCpyL, curCnd);
		// ************************************************************
		String nStr = getMsgNullStr();
		MAC_APRV_FUNC_TYP aprvFuncTyp = MAC_APRV_FUNC_TYP.get(hdrR.aprv_func_typ());
		String aprvFuncTypNm = 
				(aprvFuncTyp == null ? nStr : aprvFuncTyp.name(MCSys.user.locale()));
		
		MAM_BP_R bpR = getMapVal(bpMap, hdrR.src_bp_cd());
		String srcBpNm = (bpR == null ? nStr : bpR.bp_nm());
		
		MAM_USR_R usrR1 = getMapVal(usrMap, hdrR.biz_usr_cd());
		String bizUsrNm = (usrR1 == null ? nStr : usrR1.usr_nm());
		
		MAM_USR_R usrR2 = getMapVal(usrMap, hdrR.src_ins_usr_cd());
		String srcInsUsrNm = (usrR2 == null ? nStr : usrR2.usr_nm());
		
		MAM_CUR_R curR = getMapVal(curMap, hdrR.src_cur_cd1());
		String srcCurNm1 = (curR == null ? nStr : curR.cur_nm());
		
		String srcAmt1 = nvl(hdrR.src_amt1(), nStr).toString();
		String aprvSrcNo1 = nvl(hdrR.aprv_src_no1(), nStr);
		String aprvSrcNo2 = nvl(hdrR.aprv_src_no2(), nStr);
		// ************************************************************
		if (MAC_APRV_D_STS_TYP.isACPT(tgtDSts)) {
			MCList<MBT_APRV_D_R> nextL =
					_ptDtl2L.subList(r -> tgtSeq.lt(r.aprv_seq()));
			if (!nextL.isEmpty()) {
				String roleCol = MBT_APRV_D_R.$aprv_role_cd;
				List<String> roleL = nextL.groupBy(roleCol).getString(roleCol);
				MAUCL_PushNtcInfo info1 = mgr.createInfo(MAC_PUSH_NTC_TYP.APRV_RQST_MAIN);
				
				for (String role : roleL) {
					info1.addAprvRole(role, hdrR.master_dt());
				}
				
				info1.setMsg(new MCMessage(MBBAL1001,
						aprvFuncTypNm, srcBpNm,
						bizUsrNm, srcInsUsrNm, srcCurNm1, srcAmt1));
				info1.addScrBind(hdrR.aprv_no(), true, false);
				MAUCL_PushNtcInfo info2 = mgr.createInfo(MAC_PUSH_NTC_TYP.APRV_RQST_SUB);
				for (String role : roleL) {
					info2.addAprvRole(role, hdrR.master_dt());
				}
				info2.setMsg(new MCMessage(MBBAL1002,
						aprvFuncTypNm, srcBpNm,
						bizUsrNm, srcInsUsrNm, srcCurNm1, srcAmt1));
				info2.addScrBind(hdrR.aprv_no(), false, true);
			}
		}
		// ************************************************************
		String msgId = null;

		// 承認依頼承認
		if (MAC_APRV_STS_TYP.isACPT(svcUpR.aprv_sts_typ())) {
			msgId = MBBAL1004;
		}
		// 承認依頼却下
		else if (!(MAC_APRV_STS_TYP.isRJCT(svcUpR.old_aprv_sts_typ())
				|| MAC_APRV_STS_TYP.isLAST_RJCT(svcUpR.old_aprv_sts_typ()))
				&& (MAC_APRV_STS_TYP.isRJCT(svcUpR.aprv_sts_typ())
						|| MAC_APRV_STS_TYP.isLAST_RJCT(svcUpR.aprv_sts_typ()))) {
			msgId = MBBAL1005;
		}
		// 承認依頼承認取消
		else if (MAC_APRV_STS_TYP.isACPT(svcUpR.old_aprv_sts_typ())
				&& !MAC_APRV_STS_TYP.isACPT(svcUpR.aprv_sts_typ())) {
			msgId = MBBAL1006;
		}
		// 承認依頼却下取消
		else if ((MAC_APRV_STS_TYP.isRJCT(svcUpR.old_aprv_sts_typ())
				|| MAC_APRV_STS_TYP.isLAST_RJCT(svcUpR.old_aprv_sts_typ()))
				&& !(MAC_APRV_STS_TYP.isRJCT(svcUpR.aprv_sts_typ())
						|| MAC_APRV_STS_TYP.isLAST_RJCT(svcUpR.aprv_sts_typ()))) {
			msgId = MBBAL1007;
		}

		if (!isNull(msgId)) {
			MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.APRV_RESULT);
			info.addUsr(hdrR.biz_usr_cd(), hdrR.master_dt());
			// 業務担当者と登録担当者が違う場合のみ両方追加
			if (!isSame(hdrR.biz_usr_cd(), hdrR.src_ins_usr_cd())) {
				info.addUsr(hdrR.src_ins_usr_cd(), hdrR.master_dt());
			}
			info.setMsg(new MCMessage(msgId, aprvFuncTypNm, hdrR.aprv_no(), 
									aprvSrcNo1, aprvSrcNo2, srcBpNm, srcCurNm1,
									srcAmt1));
			info.addScrBind(hdrR.aprv_no());
		}
		// ************************************************************
		for (Aprv_Chk01_Rslt1R upR : upL) {

			if (!isSame(upR.aprv_usr_cd(), upR.act_usr_cd())) {

				Comparable<?>[] dtlVals = upR.toArray(dtlCols);
				MBT_APRV_D_R ptDtl1R = getMapVal(ptDtl1Map, dtlVals);
				MBT_APRV_D_R dtlR = getMapVal(getDtlMap(), dtlVals);

				msgId = null;

				// 承認依頼代理承認
				if (MAC_APRV_D_STS_TYP.isACPT(ptDtl1R.aprv_d_sts_typ())) {
					msgId = MBBAL1008;
				}
				// 承認依頼代理却下
				else if (MAC_APRV_D_STS_TYP.isRJCT(ptDtl1R.aprv_d_sts_typ())) {
					msgId = MBBAL1009;
				}
				else if (MAC_APRV_D_STS_TYP.isOPN(ptDtl1R.aprv_d_sts_typ())) {
					// 承認依頼承認代理取消
					if (MAC_APRV_D_STS_TYP.isACPT(dtlR.aprv_d_sts_typ())) {
						msgId = MBBAL1010;
					}
					// 承認依頼却下代理取消
					else if (MAC_APRV_D_STS_TYP.isRJCT(dtlR.aprv_d_sts_typ())) {
						msgId = MBBAL1011;
					}
				}

				if (!isNull(msgId)) {
					MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.APRV_DEPUTY);
					info.addUsr(ptDtl1R.aprv_usr_cd(), hdrR.master_dt());
					info.setMsg(new MCMessage(msgId, aprvFuncTypNm, 
							hdrR.aprv_no(), srcBpNm, bizUsrNm, srcInsUsrNm,
							srcCurNm1, srcAmt1));
					info.addScrBind("4", hdrR.aprv_no());
				}
			}
		}
		// ************************************************************
		mgr.exec();
	}

	/**
	 * メッセージにおけるNULL文字を取得します。
	 */
	protected String getMsgNullStr() {
		return "-";
	}

	/**
	 * 承認情報明細を消去します。
	 */
	protected void clrPtRegDtl() {
		_ptDtl1L.clear();
		_ptDtl2L.clear();
	}

	/**
	 * 承認情報明細を登録します。
	 */
	protected void regDtl1() {
		MCList<MBT_APRV_D_R> dtlL = MCList.create(MBT_APRV_D_R.class);
		MBT_APRV_D_R t = MBT_APRV_D_R.create("T");
		MCQueryApiBuilder dtlL_bldr = MCQueryApiBuilder.create(t);
		dtlL.setAll(_regDtl1L);
		dtlL_bldr.setSet(t.aprv_d_sts_typ, t.aprv_d_tm, t.deputy_flg, t.deputy_usr_cd,
				t.aprv_d_rmrks, t.not_upd_flg, t.sub_char1, t.sub_char2, t.sub_char3);
		dbUpdateKey("MBBAL5030_MBT_APRV_D_U02", dtlL, dtlL_bldr);
	}

	/**
	 * 承認情報明細を登録します。
	 */
	protected void regDtl2() {
		MCList<MBT_APRV_D_R> dtlL = MCList.create(MBT_APRV_D_R.class);
		MBT_APRV_D_R t = MBT_APRV_D_R.create("T");
		MCQueryApiBuilder dtlL_bldr = MCQueryApiBuilder.create(t);
		dtlL.setAll(_regDtl2L);
		dtlL_bldr.setSet(t.not_upd_flg);
		dbUpdateKey("MBBAL5030_MBT_APRV_D_U03", dtlL, dtlL_bldr);
	}

	/**
	 * 承認情報ヘッダを登録します。
	 */
	protected void regHdr() {
		MCList<MBT_APRV_R> hdrL = MCList.create(MBT_APRV_R.class);
		MBT_APRV_R t = MBT_APRV_R.create("T");
		MCQueryApiBuilder hdrL_bldr = MCQueryApiBuilder.create(t);
		hdrL.setAll(_regHdrL);
		hdrL_bldr.setSet(t.aprv_sts_typ, t.last_aprv_usr_cd, t.last_aprv_tm);
		dbUpdateKey("MBBAL5030_MBT_APRV_U02", hdrL, hdrL_bldr);
	}

	/**
	 * 承認事後サービスを呼び出します。
	 */
	protected <T extends MCRow> void callSvc() {
		List<Entry<List<Comparable<?>>, AprvAfter_Upd01_CndR>> svcUpL = new ArrayList<>(_svcUpMap.entrySet());
		
		// 以下、定数定義書が整備されていることを前提とし、各値のチェックは行わない。
		for (int i = 0; i < svcUpL.size(); i++) {
			Entry<List<Comparable<?>>, AprvAfter_Upd01_CndR> e = svcUpL.get(i);
			MBT_APRV_R hdrR = getHdrMap().get(e.getKey());
			MAC_APRV_FUNC_TYP aft =
					MAC_APRV_FUNC_TYP.get(hdrR.aprv_func_typ());
			String logic = aft.aft_logic_id();
			String module = logic.substring(0, 2);
			String operation = aft.aft_operation_id();
			MCOperation updOpe = 
					createOperation(module, logic, operation, MCOperation.class);
			
			if (updOpe instanceof IfMBBAL_AprvAfter_AprvAfter_Upd01) {
				IfMBBAL_AprvAfter_AprvAfter_Upd01 updIfOpe = (IfMBBAL_AprvAfter_AprvAfter_Upd01) updOpe;
				updIfOpe.up0().add(svcUpL.get(i).getValue());
			}
			else {
				MCList<T> up0L = (MCList<T>) updOpe.up(0);
				T up0R = up0L.createRow();
				String[] cols = AprvAfter_Upd01_CndR.colnames();
				for (String col : cols) {
					up0R.setValueNE(col, svcUpL.get(i).getValue().getValue(col));
				}
				up0L.add(up0R);
			}
			updOpe.exec();
		}
	}

	// **********************************************************************

	/**
	 * テーブルのデータを検索するマップを取得します。
	 */
	protected <D extends MCDBContainer, S extends MCRow>
			Map<List<Comparable<?>>, D> getMap(
			Class<D> clazz, MCList<S> bindL, List<BiConsumer<D, S>> cpyL,
			BiConsumer<MCDBContainer, MCQueryApiBuilder> cnd, String... cols) {
		MCDBContainer wkTbl = getRegWk(clazz, bindL, cpyL);
		if (wkTbl == null) {
			return null;
		}
		MCList<D> dbcL = MCList.create(clazz);
		D dbcR = dbcL.createRow();
		dbcR.setAlias("T");
		MCQueryApiBuilder dbcR_bldr = MCQueryApiBuilder.create(dbcR);
		if (cnd != null) {
			cnd.accept(dbcR, dbcR_bldr);
		}
		setSelWk(dbcR, dbcR_bldr, wkTbl, false);
		dbcR_bldr.buildSelect(createSqlId(LOGIC_ID, dbcR_bldr.getBaseDbc(), "S50")).executeQuery(dbcL);
		
		String[] keyCols = (cols == null || cols.length == 0 ? dbcR.getKeyColumn() : cols);
		return crtRowMap(dbcL, keyCols);
	}

	/**
	 * ワークテーブルにデータを登録し、当ワークテーブルの名称を取得します。
	 */
	protected <D extends MCDBContainer, S extends MCRow> MCDBContainer getRegWk(
			Class<D> clazz, MCList<S> bindL, List<BiConsumer<D, S>> cpyL) {
		if (clazz == null || bindL == null || cpyL == null) {
			return null;
		}
		MCList<D> dbcL = MCList.create(clazz);
		D protoR = dbcL.createRow();
		
		//ワークテーブルのＤＢコンテナを作成する
		MCDBContainer wkTbl = protoR.getPkWorkDbc("W");
		if (wkTbl == null) {
			return null;
		}
		MCQueryApiBuilder wK_bldr = MCQueryApiBuilder.create(wkTbl);
		
		//ワークテーブルをクリアする
		wK_bldr.buildDelete(createSqlId(LOGIC_ID, wK_bldr.getBaseDbc(), "D50")).executeUpdate();
		
		//VALUES句の項目をDBContainerのカラム名で設定する
		wK_bldr.setValues(wK_bldr.getBaseDbc().getKeyColumn$());
		
		for (S bindR : bindL) {
			for (BiConsumer<D, S> cpy : cpyL) {
				D dbcR = dbcL.createRow();
				cpy.accept(dbcR, bindR);
				dbcL.add(dbcR);
			}
		}
		
		//ワークテーブルにデータを登録する
		wK_bldr.buildInsert(createSqlId(LOGIC_ID, wK_bldr.getBaseDbc(), "I50")).executeBatchUpdate(dbcL);
		return wkTbl;
	}

	/**
	 * ワークテーブルに紐付く検索を行う設定を施します。
	 */
	protected <D extends MCDBContainer> D setSelWk(
			D dbcR, MCQueryApiBuilder dbcR_bldr, MCDBContainer wkTbl, boolean lock, String... cols) {
		if (dbcR == null) {
			return null;
		}
		
		MCDBContainer selWkTbl = (wkTbl == null ? dbcR.getPkWorkDbc("W") : wkTbl);
		if (selWkTbl == null) {
			return dbcR;
		}
		String[] joinCols = (cols == null || cols.length == 0 ? dbcR.getKeyColumn() : cols);
		if (joinCols.length == 0) {
			return dbcR;
		}
		
		MCPredicate condition = null;
		for (String col : joinCols) {
			MCPermColumn mainCol = dbcR.getColumn$(col);
			MCPermColumn wkCol = selWkTbl.getColumn$(col);
			MCPredicate c = MCQueryApiBuilder.makeEq(mainCol, wkCol);
			if (dbcR.isNullableColumn(col)) {
				c = c.or(MCQueryApiBuilder.makeIsNull(mainCol).and(MCQueryApiBuilder.makeIsNull(wkCol)));
			}
			condition = (condition == null) ? c : condition.and(c);
		}
		dbcR_bldr.addInnerJoin(selWkTbl, condition);
		
		if (lock) {
			dbcR_bldr.setOrderByAsc(dbcR_bldr.getBaseDbc().getKeyColumn$());
			dbcR_bldr.setLockTable(dbcR.getColumn$(joinCols[0]));
		}
		return dbcR;
	}

	/**
	 * コンテナを取得するマップを作成します。
	 */
	protected <T extends MCRow> Map<List<Comparable<?>>, T>
			crtRowMap(MCList<T> tgtL, String... cols) {
		Map<List<Comparable<?>>, T> ret = new HashMap<>();
		if (tgtL == null) {
			return ret;
		}
		MCList<T>[] tgtGLArr = tgtL.groupList(cols);
		for (MCList<T> tgtGL : tgtGLArr) {
			// tgtGL.size() == 1 を想定
			for (T tgtGR : tgtGL) {
				Comparable<?>[] vals = tgtGR.toArray(cols);
				ret.put(Arrays.asList(vals), tgtGR);
			}
		}
		return ret;
	}

	/**
	 * コンテナを取得するマップを作成します。
	 */
	protected <T extends MCRow> Map<List<Comparable<?>>, MCList<T>>
			crtListMap(MCList<T> tgtL, String... cols) {
		Map<List<Comparable<?>>, MCList<T>> ret = new HashMap<>();
		if (tgtL == null) {
			return ret;
		}
		MCList<T>[] tgtGLArr = tgtL.groupList(cols);
		for (MCList<T> tgtGL : tgtGLArr) {
			Comparable<?>[] vals = tgtGL.get(0).toArray(cols);
			ret.put(Arrays.asList(vals), tgtGL);
		}
		return ret;
	}

	/**
	 * マップから値を取得します。
	 */
	protected <T> T getMapVal(
			Map<List<Comparable<?>>, T> map, Comparable<?>... vals) {
		return map.get(Arrays.asList(vals));
	}

	/**
	 * {aprv_no, aprv_no_seq}
	 */
	protected String[] getAprvNoCols() {
		return new String[] { Aprv_Chk01_Rslt1R.$aprv_no, Aprv_Chk01_Rslt1R.$aprv_no_seq };
	}

	//FMCB CUSTOM END
}