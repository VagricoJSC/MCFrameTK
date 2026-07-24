package mcframe.serverMSBC.MSBCL6090;

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
import mcframe.commonCore.report.MCReportFile;
import mcframe.serverCore.report.MCReportConf;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import mcframe.commonCore.barcode.MCBarcode39;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.awt.Graphics2D;
import java.awt.Color;

import static mcframe.serverMSBC.MSBCL6090.Query.*;
import mcframe.commonCore.report.container.*;
import mcframe.serverCore.report.MCServerReportManager;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.sys.MCSys;

import mcframe.commonMSBC.MSBCR1010.*;
import mcframe.commonMSBC.MSBCR1020.*;
import mcframe.commonMSBC.MSBCR1030.*;

import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;
import mcframe.serverMAUC.MAUCL5020.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_MfgRptService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_MfgRptService_MC extends MSBCL_MfgRptService_MC_A{
	//FMCB CUSTOM START

	/**
	 * MfgRpt_Prnt01オペレーション.<p>
	 *
	 * 製造指図書を発行する。<br>
	 */
	public class MfgRpt_Prnt01 extends MSBCL_MfgRptService_MC_A.MfgRpt_Prnt01 {
		/** 製造指図書の発行データリスト */
		protected MCList<MfgRpt_Prnt01_DtlR> _prntDataL = null;
		/** 製造指図書の再発行データリスト */
		protected MCList<MfgRpt_Prnt01_DtlR> _reprntDataL = null;
		/** 製造記録書フォームクラス */
		protected MSBCR_MfgAct _mfgAct = MSBCR_MfgAct.create();
		
		protected final static String MFG = "1";
		protected final static String OPER = "2";

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// 前処理
			prepare();

			// 製造指図チェック
			chkMfgInst();

			MCList<MfgRpt_Prnt01_DtlR> notErrL = up0().subList(MfgRpt_Prnt01_DtlR.$err_flg, false);
			if (notErrL.size() != 0) {

				// 製造指図情報（電文）編集
				MCList<MfgRpt_Prnt01_DtlR> updL = editUp(notErrL);

				// 製造指図の更新
				updMfgInst(updL);

				// 印刷処理
				prntMain();
			}

			// 下り電文設定
			setDown();
		}
		
		/**
		 * 前処理
		 */
		protected void prepare() {
			// ソート
			sortUp();
		}

		/**
		 * 更新前に上り電文をソートする。
		 */
		protected void sortUp() {
			up0().sort(MfgRpt_Prnt01_DtlR.$mfg_inst_no);
		}

		/**
		 * 製造指図のチェックを実行する。
		 * @return
		 */
		protected void chkMfgInst() {
			MCList<MST_MFG_INST_R> lockL = lockMfgInst();
			MCIndexKey idxkey = lockL.createIndex(MST_MFG_INST_R.$mfg_inst_no);

			MCMessageList msgList = new MCMessageList();
			for (MfgRpt_Prnt01_DtlR upR : up0()) {
				MST_MFG_INST_R lockR = lockL.getFirst(idxkey, upR.mfg_inst_no());

				// 存在チェック
				if (isNull(lockR)) {
					upR.err_flg(true);
					msgList.addAll(getRecordNotFoundMsg(
							"MS",
							"MST_MFG_INST",
							new String[]{MST_MFG_INST_R.$mfg_inst_no},
							new Comparable[]{upR.mfg_inst_no()}, upR));
					continue;
				}
				
				// 製造状況チェック
				if (MSC_MFG_STS_TYP.isSAV(lockR.getStringNE("MFG_STS_TYP"))) {
					upR.err_flg(true);
					msgList.add(new MCMessage(upR, null, MSBCL1095, upR.mfg_inst_no(),
							toDispGUIIndex(upR)));
				}
				
				// 打切チェック
				if (lockR.abort_flg()) {
					upR.err_flg(true);
					msgList.add(new MCMessage(upR, null, MSBCL1102, upR.mfg_inst_no(),
							toDispGUIIndex(upR)));
				}
				
				upR.inst_prnt_flg(lockR.inst_prnt_flg());
				upR.inst_prnt_tm(lockR.inst_prnt_tm());
				upR.aprv_flg(lockR.aprv_flg());
				upR.mfg_aprv_sts_typ(lockR.mfg_aprv_sts_typ());
			}

			if (!msgList.isEmpty()) {
				MCMessagePool.addAll(msgList);
			}
		}
		
		/**
		 * 製造指図をロックする。
		 * @return
		 */
		protected MCList<MST_MFG_INST_R> lockMfgInst() {
			MCList<MST_MFG_INST_R> lockL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder lockL_bldr = MCQueryApiBuilder.create(t);
			MSVT_MFG_INST_PR_R t1 = MSVT_MFG_INST_PR_R.create("T1");

			lockL_bldr.setSelect(t.mfg_inst_no, t.inst_prnt_flg, t.inst_prnt_tm, t.abort_flg, t.aprv_flg, t.mfg_aprv_sts_typ);
			lockL_bldr.addSelect(t1.mfg_sts_typ);
			lockL_bldr.addInnerJoin(t1, bracket( t.mfg_inst_no.eq(t1.mfg_inst_no)));
			lockL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			lockL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			lockL_bldr.setOrderByAsc(lockL_bldr.getBaseDbc().getKeyColumn$());
			MCList<MfgRpt_Prnt01_DtlR>  bindL = up0().shallowClone();
			bindL.sort(MfgRpt_Prnt01_DtlR.$mfg_inst_no);
			dbSelectKeyForUpdate("MSBCL6090_MST_MFG_INST_S01", lockL, lockL_bldr, bindL);
			
			return lockL;
		}
		
		/**
		 * 上り電文を編集する。
		 */
		protected MCList<MfgRpt_Prnt01_DtlR> editUp(MCList<MfgRpt_Prnt01_DtlR> subL) {
			_prntDataL = subL.subList(MfgRpt_Prnt01_DtlR.$inst_prnt_flg, false);
			_reprntDataL = subL.subList(MfgRpt_Prnt01_DtlR.$inst_prnt_flg, true);

			MCDate prntDt = MCDate.now();
			MCList<MfgRpt_Prnt01_DtlR> rtnL = MCList.create(MfgRpt_Prnt01_DtlR.class);
			for (MfgRpt_Prnt01_DtlR r : subL) {
				if (!isSame(getSysParm("MFG_INSP_PRNT_REV_FLG"), "1") || !r.inst_prnt_flg()) {
					r.inst_prnt_flg(true);
					r.inst_prnt_tm(prntDt);
					rtnL.add(r);
				}
			}
			return rtnL;
		}
		
		/**
		 * 製造指図テーブルを更新する。
		 */
		protected void updMfgInst(MCList<MfgRpt_Prnt01_DtlR> subL) {
			MCList<MST_MFG_INST_R> updMfgInstL = MCList.create(MST_MFG_INST_R.class);

			for(MfgRpt_Prnt01_DtlR r : subL) {
				if (!canUpdPrntTm(r)) {
					continue;
				}

				MST_MFG_INST_R mfgInstR = MST_MFG_INST_R.create();
				mfgInstR.mfg_inst_no(r.mfg_inst_no());
				mfgInstR.inst_prnt_flg(r.inst_prnt_flg());
				mfgInstR.inst_prnt_tm(r.inst_prnt_tm());
				updMfgInstL.add(mfgInstR);
			}

			if (!updMfgInstL.isEmpty()) {
				MCQueryApiBuilder updMfgInstL_bldr = MCQueryApiBuilder.create(MST_MFG_INST_R.create("T"));
				editMfgInstLSetStmt(updMfgInstL_bldr);

				dbUpdateKey("MSBCL6090_MST_MFG_INST_U01", updMfgInstL, updMfgInstL_bldr);
				
				callRevDataIns01(updMfgInstL);
			}
		}

		/**
		 * 発行日時、発行済フラグを設定する場合はtrueを返す
		 * @param r
		 * @return
		 */
		protected boolean canUpdPrntTm(MfgRpt_Prnt01_DtlR r) {
			// 再発行時に印刷データを再利用する場合で、承認対象かつ未承認の場合は発行日時、発行済フラグを設定しない
			// ※未承認の状態で発行済にしてしまうと、承認時の発行のときに再発行データを再利用してしまい、承認結果などが印字されない
			if (isSame(getSysParm("MFG_INSP_PRNT_REV_FLG"), "1") && r.aprv_flg()
					&& MSC_MFG_APRV_STS_TYP.isINST_OPN(r.mfg_aprv_sts_typ())) {
				return false;
			}
			return true;
		}
		
		/**
		 * 製造指図テーブル更新用のdbContainerのset句を編集する。
		 * @param mfgInstL 更新用リスト
		 */
		protected void editMfgInstLSetStmt(MCQueryApiBuilder mfgInstL_bldr) {
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			mfgInstL_bldr.setSet(t.inst_prnt_flg);
			mfgInstL_bldr.addSet(t.inst_prnt_tm);
		}

		/**
		 * 印刷処理
		 */
		protected void prntMain() {
			MCList<MfgRpt_Prnt01_DtlR> tmpPrntDataL = MCList.create(MfgRpt_Prnt01_DtlR.class);
			tmpPrntDataL.setAll(_prntDataL);
			if (isSame(getSysParm("MFG_INSP_PRNT_REV_FLG"), "1")) {
				// 再発行
				reprintData();
			}
			else {
				tmpPrntDataL.addAll(_reprntDataL);
			}
			// 最初発行
			if (!tmpPrntDataL.isEmpty()) {
				printData(tmpPrntDataL);
			}
		}
		
		/**
		 * 再発行する。
		 */
		protected void reprintData() {
			MCList<MCReportInfoR> reprntInfoList = MCList.create(MCReportInfoR.class);
			for (MfgRpt_Prnt01_DtlR r : _reprntDataL) {
				MSBCR_MfgInst reportSet = MSBCR_MfgInst.create();
				
				// 業務情報を設定し、印刷データからデータを取得
				reportSet.setAppTitle1(MCConst.repotlbl.getLabel("MS.MSBCR1010.label"));
				reportSet.setAppReportNo1(r.mfg_inst_no());
				reportSet.setAppReportNo2(r.mfg_inst_rev().toString());
				reportSet.setAppReportSts1(MAC_RPT_STS_TYP.CRT.value());

				MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(reportSet, false);
				reprntInfoList.addAll(infoL);
				
				// 製造指図時記録書発行を考慮
				MSBCR_MfgAct reportSetAct = MSBCR_MfgAct.create();
				
				reportSetAct.setAppTitle1(MCConst.repotlbl.getLabel("MS.MSBCR1020.label"));
				reportSetAct.setAppTitle2(MSC_MR_PRNT_STR.INST_ISSUE.name(getUsrLocale()));
				reportSetAct.setAppReportNo1(r.mfg_inst_no());
				reportSetAct.setAppReportNo2(r.mfg_inst_rev().toString());
				reportSetAct.setAppReportSts1(MAC_RPT_STS_TYP.CRT.value());

				infoL = MCServerReportManager.searchPrintData(reportSetAct, false);
				reprntInfoList.addAll(infoL);
			}
			
			if (!reprntInfoList.isEmpty()) {
				MCServerReportManager.reprint(reprntInfoList);
			}
		}
		
		/**
		 * 最初発行する。
		 */
		protected void printData(MCList<MfgRpt_Prnt01_DtlR> prntDataL) {
			MSBCR_MfgInst rs = MSBCR_MfgInst.create();
			MCDate prntDt = MCDate.now();
			
			// 対象の製造指図ＮＯをワークに格納
			MCList<MST_MFG_INST_R> mfgInstL = MCList.create(MST_MFG_INST_R.class);
			MCQueryApiBuilder mfgInstL_bldr = MCQueryApiBuilder.create(MST_MFG_INST_R.create("T"));
			dbWkDelete("MSBCL6090_MSW_MFG_INST_D01", mfgInstL_bldr.getBaseDbc());
			
			for (MfgRpt_Prnt01_DtlR r : prntDataL) {
				MST_MFG_INST_R mfgInstR = MST_MFG_INST_R.create();
				mfgInstR.mfg_inst_no(r.mfg_inst_no());
				mfgInstL.add(mfgInstR);
			}
			
			if(!isNull(mfgInstL)) {
				dbWkInsert("MSBCL6090_MSW_MFG_INST_I01", mfgInstL, mfgInstL_bldr.getBaseDbc());
			}
			
			MCList<MfgInstHdrR> hdrL = getPrntHdrData();
			MCList<MfgInstYldR> yieldL = getPrntYieldData();
			MCList<MfgInstInptR> inptL = getPrntInptData();

			MCIndexKey hdrKey = hdrL.createIndex(MfgInstHdrR.$mfg_inst_no);
			
			prntDataL.sort(SortType.ASC, MfgRpt_Prnt01_DtlR.$mfg_inst_no);
			for(MfgRpt_Prnt01_DtlR upR : prntDataL) {
				MCList<MfgInstHdrR> tmpHdrL = hdrL.subList(hdrKey, upR.mfg_inst_no());
				tmpHdrL.sort(SortType.ASC, MfgInstHdrR.$disp_seq, MfgInstHdrR.$oper_inst_no);

				MSBCR_MfgInst reportSetInst = MSBCR_MfgInst.create();
				MSBCR_MfgAct reportSetAct = MSBCR_MfgAct.create();

				for(MfgInstHdrR hdrR : tmpHdrL) {


					// 発行済にする場合のみ再印刷データを作成する
					if (canUpdPrntTm(upR)) {
						// 製造指図書の再印刷データ作成
						editPrntData(rs, reportSetInst, reportSetAct, upR, hdrR, yieldL, inptL, prntDt);
					}
					else {
						editPrntData(rs, null, null, upR, hdrR, yieldL, inptL, prntDt);
					}
				}
				if (reportSetInst.size() > 0) {
					// 製造指図書の再印刷データ登録
					crtReprintData(reportSetInst, tmpHdrL.get(0));
				}
				if (reportSetAct.size() > 0) {
					// 製造記録書の再印刷データ登録
					crtReprintDataMfgAct(reportSetAct, tmpHdrL.get(0));
				}
			}

			if (rs.size() > 0) {
				rs.setPersistent(false);
				execPrnt(rs);
			}
			
			// 製造記録書の発行
			if (_mfgAct.size() > 0) {
				_mfgAct.setPersistent(false);
				MCServerReportManager.request(_mfgAct);
			}
		}

		/**
		 * 製造指図書用のデータを取得する。
		 * @return
		 */
		protected MCList<MfgInstHdrR> getPrntHdrData() {
			MCList<MfgInstHdrR> hdrL = MCList.create(MfgInstHdrR.class);
			hdrL.addBooleanColumn("INST_REC_ISSUE_FLG");
			executeQuery(hdrL, MSBCL6090_MST_MFG_INST_S01());

			return hdrL;
		}
		
		/**
		 * 製造指図書用のデータ(出来高)を取得する。
		 * @return
		 */
		protected MCList<MfgInstYldR> getPrntYieldData() {
			MCList<MfgInstYldR> yieldL = MCList.create(MfgInstYldR.class);
			executeQuery(yieldL, MSBCL6090_MST_YIELD_SCHD_S01());
			
			return yieldL;
		}
		
		/**
		 * 製造指図書用のデータ(投入)を取得する。
		 * @return
		 */
		protected MCList<MfgInstInptR> getPrntInptData() {
			MCList<MfgInstInptR> inptL = MCList.create(MfgInstInptR.class);
			executeQuery(inptL, MSBCL6090_MST_INPT_SCHD_S01());
			
			return inptL;
		}
		
		protected void editPicture(MSBCR_MfgInst rs, MfgRpt_Prnt01_DtlR upR,
				MfgInstHdrR hdrR) {
			
			if (rs == null) {
				return ;
			}
			// MCReportPictureを使いまわす（一括で指図書発行した際に、最終ページのみバーコードが印字されてしまうため）
			MCList<MCReportPictureR> infoPicture = rs.getInfoPicture();
			if(infoPicture == null) {
				infoPicture = MCList.create(MCReportPictureR.class);
				rs.setInfoPicture(infoPicture);
			}
			
			// PICTURE_IDの重複チェック
			boolean b = true;
			boolean operB = true;
			for (MCReportPictureR r : infoPicture) {
				if(getPicId(upR.mfg_inst_no(), MFG).equals(r.PICTURE_ID())) {
					if (b) {
						b = false;
					}
				}
				else if(getPicId(hdrR.oper_inst_no(), OPER).equals(r.PICTURE_ID())) {
					if (operB) {
						operB = false;
					}
				}
			}
			if (b == true) {
				String path = MCReportFile.setSeparator(MCReportConf.getIfDataPath());
				File file = saveBarcodeFile(path, upR.mfg_inst_no(), MFG);
				MCReportPictureR r1 = MCReportPictureR.create();
				r1.PICTURE_ID(getPicId(upR.mfg_inst_no(), MFG));
				r1.FILE(MCBinary.valueOf(file));
				infoPicture.add(r1);
			}
			if (operB == true && !isNull(hdrR.oper_inst_no())) {
				String path = MCReportFile.setSeparator(MCReportConf.getIfDataPath());
				File file = saveBarcodeFile(path, hdrR.oper_inst_no(), OPER);
				MCReportPictureR r1 = MCReportPictureR.create();
				r1.PICTURE_ID(getPicId(hdrR.oper_inst_no(), OPER));
				r1.FILE(MCBinary.valueOf(file));
				infoPicture.add(r1);
			}
		}
		protected String getPicId(String strNo, String mfgOperTyp) {
			return mfgOperTyp.concat(strNo);
		}
		/**
		 * 製造指図書用のデータを編集する。
		 * @param data
		 */
		protected void editPrntData(MSBCR_MfgInst rs, MSBCR_MfgInst rsReInst, MSBCR_MfgAct rsReAct,
				MfgRpt_Prnt01_DtlR upR, MfgInstHdrR hdrR,
				MCList<MfgInstYldR> yieldL, MCList<MfgInstInptR> inptL, MCDate prntDt) {
			
			
			editPicture(rs, upR, hdrR);
			editPicture(rsReInst, upR, hdrR);
			
			if(isSame(hdrR.mfg_inst_rev(), MCNumber.ONE)) {
				hdrR.form_name(MSC_MI_PRNT_STR.CRT_TITLE.name(getUsrLocale()));
			}
			else {
				hdrR.form_name(MSC_MI_PRNT_STR.UPD_TITLE.name(getUsrLocale()));
			}
			hdrR.prnt_tm(prntDt);
			// PICTURE_IDを設定（この項目はバーコードを一意に特定するための値。バーコードに印字される値ではない。）
			hdrR.mfg_inst_no_bd(getPicId(upR.mfg_inst_no(), MFG));
			hdrR.oper_inst_no_bd(getPicId(hdrR.oper_inst_no(), OPER));
			hdrR.oper_num(convQtyBaseToOper(hdrR.getNumberNE("OPER_BASE_UNIT_QTY"),
					hdrR.getNumberNE("OPER_CONV_QTY"), hdrR.getNumberNE("OPER_STD_QTY"), hdrR.getNumberNE("OPER_UNIT_DEC_PLACE"),
					hdrR.getStringNE("OPER_UNIT_CONV_RND_TYP")));
			putNumStr(rs, hdrR, MfgInstHdrR.$s_oper_num, MfgInstHdrR.$oper_num,
					hdrR.getNumberNE("OPER_UNIT_DEC_PLACE"));
			putNumStr(rs, hdrR, MfgInstHdrR.$s_base_unit_inst_qty,
					MfgInstHdrR.$base_unit_inst_qty,
					hdrR.getNumberNE("BASE_UNIT_DEC_PLACE"));

			// 工程収率の印字
			if(!isNull(hdrR.oper_lower_yield()) || !isNull(hdrR.oper_std_yield()) || !isNull(hdrR.oper_upper_yield())) {
				hdrR.oper_yield_lbl(MSC_MI_PRNT_STR.OPER_YIELD.name(getUsrLocale()));
				
				hdrR.oper_lower_yield_lbl(MSC_MI_PRNT_STR.LOWER_YIELD.name(getUsrLocale()));
				hdrR.oper_std_yield_lbl(MSC_MI_PRNT_STR.STD_YIELD.name(getUsrLocale()));
				hdrR.oper_upper_yield_lbl(MSC_MI_PRNT_STR.UPPER_YIELD.name(getUsrLocale()));
			}
			// 品目収率の印字
			if(!isNull(hdrR.itm_lower_yield()) || !isNull(hdrR.itm_std_yield()) || !isNull(hdrR.itm_upper_yield())) {
				hdrR.itm_yield_lbl(MSC_MI_PRNT_STR.ITM_YIELD.name(getUsrLocale()));
				
				hdrR.itm_lower_yield_lbl(MSC_MI_PRNT_STR.LOWER_YIELD.name(getUsrLocale()));
				hdrR.itm_std_yield_lbl(MSC_MI_PRNT_STR.STD_YIELD.name(getUsrLocale()));
				hdrR.itm_upper_yield_lbl(MSC_MI_PRNT_STR.UPPER_YIELD.name(getUsrLocale()));
			}
			//品目ＣＤを表示用に変換
			putPrntItmSub1(hdrR, MfgInstHdrR.$itm_sub1_view, MfgInstHdrR.$itm_sub1_data);
			putPrntItmSub2(hdrR, MfgInstHdrR.$itm_sub2_view, MfgInstHdrR.$itm_sub2_data);
			putPrntItmSub3(hdrR, MfgInstHdrR.$itm_sub3_view, MfgInstHdrR.$itm_sub3_data);
			
			//手配ＮＯを表示用に変換
			putPrntSno1(hdrR, MfgInstHdrR.$sno1_view, MfgInstHdrR.$sno1_data);
			putPrntSno2(hdrR, MfgInstHdrR.$sno2_view, MfgInstHdrR.$sno2_data);
			putPrntSno3(hdrR, MfgInstHdrR.$sno3_view, MfgInstHdrR.$sno3_data);
			putPrntSno4(hdrR, MfgInstHdrR.$sno4_view, MfgInstHdrR.$sno4_data);

			//ロットＮＯを表示用に変換
			putPrntStr(hdrR, MfgInstHdrR.$lot_no_view, MfgInstHdrR.$lot_no_data);
			putPrntStr(hdrR, MfgInstHdrR.$sublot_no_view, MfgInstHdrR.$sublot_no_data);
			
			// 時刻の表示対応
			doCompTime(hdrR, false);
			
			rs.addRow(hdrR);
			if (rsReInst != null) {
				rsReInst.addRow(hdrR);
			}
			
			MCIndexKey yieldKey = yieldL.createIndex("MFG_INST_NO", "OPER_INST_NO");
			MCIndexKey inptKey = inptL.createIndex("MFG_INST_NO", "OPER_INST_NO");
			// 出来高
			MCList<MfgInstYldR> tmpYieldL = yieldL.subList(yieldKey, upR.mfg_inst_no(), hdrR.oper_inst_no());
			tmpYieldL.sort(SortType.ASC, MfgInstYldR.$schd_yield_dt, MfgInstYldR.$schd_yield_hm, "YIELD_SCHD_NO");
			//整数部と小数部に分ける
			putNumStr(rs, tmpYieldL, MfgInstYldR.$s_int_trd_unit_yield_qty, MfgInstYldR.$s_dec_trd_unit_yield_qty,
					MfgInstYldR.$trd_unit_yield_qty, "DEC_PLACE");

			if(!tmpYieldL.isEmpty()) {
				HdrMfgInstYldR hdrYieldR = HdrMfgInstYldR.create();
				hdrYieldR.print_yld("P");
				rs.addRow(hdrYieldR);
				if (rsReInst != null) {
					rsReInst.addRow(hdrYieldR);
				}
			}
			
			for(MfgInstYldR yieldR : tmpYieldL) {
				// 時刻の表示対応
				doCompTime(yieldR, false);

				rs.addRow(yieldR);
				if (rsReInst != null) {
					rsReInst.addRow(yieldR);
				}
			}
			
			// 投入予定
			MCList<MfgInstInptR> tmpInptL = inptL.subList(inptKey, upR.mfg_inst_no(), hdrR.oper_inst_no());
			tmpInptL.sort(SortType.ASC, "DISP_SEQ", "INPT_SCHD_NO");

			//整数部と小数部に分ける
			putNumStr(rs, tmpInptL, MfgInstInptR.$s_int_base_unit_inpt_qty, MfgInstInptR.$s_dec_base_unit_inpt_qty,
					MfgInstInptR.$base_unit_inpt_qty, "BASE_UNIT_DEC_PLACE");
			putNumStr(rs, tmpInptL, MfgInstInptR.$s_int_base_unit_rqmt_qty, MfgInstInptR.$s_dec_base_unit_rqmt_qty,
					MfgInstInptR.$base_unit_rqmt_qty, "BASE_UNIT_DEC_PLACE");
			putNumStr(rs, tmpInptL, MfgInstInptR.$s_int_base_unit_fxd_rqmt_qty, MfgInstInptR.$s_dec_base_unit_fxd_rqmt_qty,
					MfgInstInptR.$base_unit_fxd_rqmt_qty, "BASE_UNIT_DEC_PLACE");
			putNumStr(rs, tmpInptL, MfgInstInptR.$s_int_cont_qty_inpt, MfgInstInptR.$s_dec_cont_qty_inpt,
					MfgInstInptR.$cont_inpt_qty, "CONT_FCTR_UNIT_DEC_PLACE");
			putNumStr(rs, tmpInptL, MfgInstInptR.$s_int_cont_qty_rqmt, MfgInstInptR.$s_dec_cont_qty_rqmt,
					MfgInstInptR.$cont_rqmt_qty, "CONT_FCTR_UNIT_DEC_PLACE");
			putNumStr(rs, tmpInptL, MfgInstInptR.$s_int_cont_qty_fxd_rqmt, MfgInstInptR.$s_dec_cont_qty_fxd_rqmt,
					MfgInstInptR.$cont_fxd_rqmt_qty, "CONT_FCTR_UNIT_DEC_PLACE");

			if(!tmpInptL.isEmpty()) {
				HdrMfgInstInptR hdrInptR = HdrMfgInstInptR.create();
				hdrInptR.print_inpt("P");
				rs.addRow(hdrInptR);
				if (rsReInst != null) {
					rsReInst.addRow(hdrInptR);
				}
			}

			for(MfgInstInptR inptR : tmpInptL) {
				if(!isNull(inptR.cont_inpt_qty())) {
					inptR.left_qty_inpt(MSC_MI_PRNT_STR.LEFT.name(getUsrLocale()));
					inptR.right_qty_inpt(MSC_MI_PRNT_STR.RIGHT.name(getUsrLocale()));
				}
				if(!isNull(inptR.cont_rqmt_qty())) {
					inptR.left_qty_rqmt(MSC_MI_PRNT_STR.LEFT.name(getUsrLocale()));
					inptR.right_qty_rqmt(MSC_MI_PRNT_STR.RIGHT.name(getUsrLocale()));
				}
				if(!isNull(inptR.cont_fxd_rqmt_qty())) {
					inptR.left_qty_fxd_rqmt(MSC_MI_PRNT_STR.LEFT.name(getUsrLocale()));
					inptR.right_qty_fxd_rqmt(MSC_MI_PRNT_STR.RIGHT.name(getUsrLocale()));
				}
				if(!isNull(inptR.cont_fctr_unit_cd())) {
					inptR.left_nm(MSC_MI_PRNT_STR.LEFT.name(getUsrLocale()));
					inptR.right_nm(MSC_MI_PRNT_STR.RIGHT.name(getUsrLocale()));
				}
				
				if(!isNull(inptR.inpt_ver_no())) {
					inptR.inpt_ver_no_lbl(MSC_MI_PRNT_STR.VER_NO.name(getUsrLocale()));
				}
				
				// 品目の表示対応
				if(!isNull(inptR.getStringNE("ALT_GRP_CD")) && !isNull(inptR.getNumberNE("ALT_GRP_SEQ"))) {
					inptR.s_inpt_itm_cd(MSC_MI_PRNT_STR.LEFT.name(getUsrLocale())
							.concat(inptR.getStringNE("ALT_GRP_CD")
									.concat(MSC_MI_PRNT_STR.HYPHEN.name(getUsrLocale()))
									.concat(inptR.getNumberNE("ALT_GRP_SEQ")
											.toString())
									.concat(MSC_MI_PRNT_STR.RIGHT
											.name(getUsrLocale()))
									.concat(inptR.s_inpt_itm_cd())));
				}
				if(MAC_INPT_CTL_TYP.isNO_MRP_INST(inptR.getStringNE("INPT_CTL_TYP"))) {
					if (isNull(inptR.inpt_inst_rmrks())) {
						inptR.inpt_inst_rmrks(MSC_MI_PRNT_STR.LEFT.name(getUsrLocale())
								.concat(MSC_MI_PRNT_STR.REF_ITM.name(getUsrLocale()))
								.concat(MSC_MI_PRNT_STR.RIGHT.name(getUsrLocale())));
					}
					else {
						inptR.inpt_inst_rmrks(inptR.inpt_inst_rmrks().concat(MSC_MI_PRNT_STR.LEFT.name(getUsrLocale()))
								.concat(MSC_MI_PRNT_STR.REF_ITM.name(getUsrLocale()))
								.concat(MSC_MI_PRNT_STR.RIGHT.name(getUsrLocale())));
					}
				}
				
				//品目ＣＤを表示用に変換
				putPrntItmSub1(inptR, MfgInstInptR.$s_inpt_itm_sub1_view, MfgInstInptR.$s_inpt_itm_sub1_data);
				putPrntItmSub2(inptR, MfgInstInptR.$s_inpt_itm_sub2_view, MfgInstInptR.$s_inpt_itm_sub2_data);
				putPrntItmSub3(inptR, MfgInstInptR.$s_inpt_itm_sub3_view, MfgInstInptR.$s_inpt_itm_sub3_data);

				//手配ＮＯを表示用に変換
				putPrntSno1(inptR, MfgInstInptR.$inpt_sno1_view, MfgInstInptR.$inpt_sno1_data);
				putPrntSno2(inptR, MfgInstInptR.$inpt_sno2_view, MfgInstInptR.$inpt_sno2_data);
				putPrntSno3(inptR, MfgInstInptR.$inpt_sno3_view, MfgInstInptR.$inpt_sno3_data);
				putPrntSno4(inptR, MfgInstInptR.$inpt_sno4_view, MfgInstInptR.$inpt_sno4_data);

				//ロットＮＯを表示用に変換
				putPrntStr(inptR, MfgInstInptR.$inpt_lot_no_view, MfgInstInptR.$inpt_lot_no_data);
				putPrntStr(inptR, MfgInstInptR.$inpt_sublot_no_view, MfgInstInptR.$inpt_sublot_no_data);
				
				putPrntChk(inptR, MfgInstInptR.$s_alloc, MfgInstInptR.$alloc_flg);
				
				// 時刻の表示対応
				doCompTime(inptR, false);
				
				rs.addRow(inptR);
				if (rsReInst != null) {
					rsReInst.addRow(inptR);
				}
			}
			
			// フッター
			MfgInstFtrR ftrR = MfgInstFtrR.create();
			ftrR.oper_inst_rpt_rmrks_lbl(MSC_MI_PRNT_STR.OPER_INST_RMRKS.name(getUsrLocale()));
			ftrR.oper_inst_rpt_rmrks(hdrR.getStringNE("OPER_INST_RPT_RMRKS"));
			ftrR.mfg_inst_rpt_rmrks_lbl(MSC_MI_PRNT_STR.MFG_INST_RMRKS.name(getUsrLocale()));
			ftrR.mfg_inst_rpt_rmrks(hdrR.getStringNE("MFG_INST_RPT_RMRKS"));
			if (isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1")) {
				ftrR.aprv_dt_lbl(MSC_MI_PRNT_STR.APRV_DT.name(getUsrLocale()));
				ftrR.aprv_dt(hdrR.getDateNE("APRV_DT"));
				ftrR.aprv_dpt_cd(hdrR.getStringNE("APRV_DPT_CD"));
				ftrR.aprv_dpt_nm_lbl(MSC_MI_PRNT_STR.APRV_DPT.name(getUsrLocale()));
				ftrR.aprv_dpt_nm(hdrR.getStringNE("APRV_DPT_NM"));
				ftrR.aprv_usr_cd(hdrR.getStringNE("APRV_USR_CD"));
				ftrR.aprv_usr_nm_lbl(MSC_MI_PRNT_STR.APRV_USR.name(getUsrLocale()));
				ftrR.aprv_usr_nm(hdrR.getStringNE("APRV_USR_NM"));
				ftrR.aprv_rsn_lbl(MSC_MI_PRNT_STR.APRV_RSN.name(getUsrLocale()));
				ftrR.aprv_rsn(hdrR.getString("APRV_RSN"));
			}
			
			rs.addRow(ftrR);
			if (rsReInst != null) {
				rsReInst.addRow(ftrR);
			}
			
			rs.addNextPageRow();
			if (rsReInst != null) {
				rsReInst.addNextPageRow();
			}
			
			// 品目詳細マスタを参照し、製造指図時に記録書発行を行う
			if(hdrR.getBooleanNE("INST_REC_ISSUE_FLG")) {
				crtPrntMfgAct(_mfgAct, rsReAct, upR, hdrR, tmpYieldL, tmpInptL);
			}
		}
		
		protected void crtPrntMfgAct(MSBCR_MfgAct rs, MSBCR_MfgAct rsRe, MfgRpt_Prnt01_DtlR upR, MfgInstHdrR hdrR,
				MCList<MfgInstYldR> yieldL, MCList<MfgInstInptR> inptL) {

			// 既にデータが存在していたら改頁（初回だけは改頁しない）
			if (rs.size() != 0) {
				rs.addNextPageRow();
			}
			if (rsRe != null && rsRe.size() != 0) {
				rsRe.addNextPageRow();
			}

			// ヘッダ（記録書）のセット
			MfgActHdrR actHdrR = MfgActHdrR.create();
			actHdrR.form_name(MSC_MR_PRNT_STR.TITLE.name(getUsrLocale()));
			actHdrR.mfg_inst_no(hdrR.mfg_inst_no());
			actHdrR.div_seq(hdrR.mfg_inst_rev().toString());
			actHdrR.oper_inst_no(hdrR.oper_inst_no());
			actHdrR.prnt_tm(hdrR.prnt_tm());
			actHdrR.oper_cd(hdrR.oper_cd());
			actHdrR.oper_nm(hdrR.oper_nm());
			actHdrR.disp_seq(hdrR.disp_seq());
			actHdrR.oper_loc_nm(hdrR.oper_loc_nm());
			actHdrR.oper_str_ln_nm(hdrR.oper_str_ln_nm());
			actHdrR.oper_num(hdrR.oper_num());
			actHdrR.oper_unit_nm(hdrR.oper_unit_nm());
			actHdrR.oper_usr_nm(hdrR.oper_inst_usr_nm());
			if(!isNull(hdrR.oper_lower_yield()) || !isNull(hdrR.oper_std_yield()) || !isNull(hdrR.oper_upper_yield())) {
				actHdrR.oper_yield_lbl(MSC_MR_PRNT_STR.OPER_YIELD.name(getUsrLocale()));
				actHdrR.oper_act_yield_lbl(MSC_MR_PRNT_STR.ACT_YIELD.name(getUsrLocale()));
				actHdrR.oper_lower_yield_lbl(MSC_MR_PRNT_STR.LOWER_YIELD.name(getUsrLocale()));
				actHdrR.oper_lower_yield(hdrR.oper_lower_yield());
				actHdrR.oper_std_yield_lbl(MSC_MR_PRNT_STR.STD_YIELD.name(getUsrLocale()));
				actHdrR.oper_std_yield(hdrR.oper_std_yield());
				actHdrR.oper_upper_yield_lbl(MSC_MR_PRNT_STR.UPPER_YIELD.name(getUsrLocale()));
				actHdrR.oper_upper_yield(hdrR.oper_upper_yield());
			}
			actHdrR.inst_dpt_nm(hdrR.inst_dpt_nm());
			actHdrR.mfg_loc_nm(hdrR.mfg_loc_nm());
			actHdrR.mfg_str_ln_nm(hdrR.mfg_str_ln_nm());
			actHdrR.inst_dt(hdrR.inst_dt());
			actHdrR.itm_cd(hdrR.itm_cd());
			actHdrR.itm_sub1_view(hdrR.itm_sub1_view());
			actHdrR.itm_sub2_view(hdrR.itm_sub2_view());
			actHdrR.itm_sub3_view(hdrR.itm_sub3_view());
			actHdrR.itm_sub1_data(hdrR.itm_sub1_data());
			actHdrR.itm_sub2_data(hdrR.itm_sub2_data());
			actHdrR.itm_sub3_data(hdrR.itm_sub3_data());
			actHdrR.itm_nm(hdrR.itm_nm());
			actHdrR.itm_alt_nm1(hdrR.itm_alt_nm1());
			actHdrR.itm_alt_nm2(hdrR.itm_alt_nm2());
			actHdrR.itm_alt_nm3(hdrR.itm_alt_nm3());
			actHdrR.itm_alt_nm4(hdrR.itm_alt_nm4());
			if(!isNull(hdrR.itm_lower_yield()) || !isNull(hdrR.itm_std_yield()) || !isNull(hdrR.itm_upper_yield())) {
				actHdrR.itm_yield_lbl(MSC_MR_PRNT_STR.ITM_YIELD.name(getUsrLocale()));
				actHdrR.itm_act_yield_lbl(MSC_MR_PRNT_STR.ACT_YIELD.name(getUsrLocale()));
				actHdrR.itm_lower_yield_lbl(MSC_MR_PRNT_STR.LOWER_YIELD.name(getUsrLocale()));
				actHdrR.itm_lower_yield(hdrR.itm_lower_yield());
				actHdrR.itm_std_yield_lbl(MSC_MR_PRNT_STR.STD_YIELD.name(getUsrLocale()));
				actHdrR.itm_std_yield(hdrR.itm_std_yield());
				actHdrR.itm_upper_yield_lbl(MSC_MR_PRNT_STR.UPPER_YIELD.name(getUsrLocale()));
				actHdrR.itm_upper_yield(hdrR.itm_upper_yield());
			}
			actHdrR.disp_pd(hdrR.disp_pd());
			actHdrR.bom_ptn(hdrR.bom_ptn());
			actHdrR.lot_no_view(hdrR.lot_no_view());
			actHdrR.sublot_no_view(hdrR.sublot_no_view());
			actHdrR.lot_no_data(hdrR.lot_no_data());
			actHdrR.sublot_no_data(hdrR.sublot_no_data());
			actHdrR.base_unit_inst_qty(hdrR.base_unit_inst_qty());
			actHdrR.base_unit_nm(hdrR.base_unit_nm());
			actHdrR.itm_ord_no(hdrR.itm_ord_no());
			actHdrR.ntfy_nm(hdrR.getStringNE("NTFY_NM"));
			rs.addRow(actHdrR);
			if (rsRe != null) {
				rsRe.addRow(actHdrR);
			}
			
			// ヘッダ（記録書 出来高）のセット
			if(!yieldL.isEmpty()) {
				HdrMfgActYldR actYieldHdrR = HdrMfgActYldR.create();
				actYieldHdrR.print_yld("P");
				rs.addRow(actYieldHdrR);
				if (rsRe != null) {
					rsRe.addRow(actYieldHdrR);
				}
			}
			
			// 明細（記録書 出来高）のセット
			for(MfgInstYldR yieldR : yieldL) {
				MfgActYldR actYieldR = MfgActYldR.create();
				actYieldR.s_int_trd_unit_yield_qty(yieldR.s_int_trd_unit_yield_qty());
				actYieldR.s_dec_trd_unit_yield_qty(yieldR.s_dec_trd_unit_yield_qty());
				actYieldR.yield_unit_nm(yieldR.yield_unit_nm());
				actYieldR.yield_schd_no(yieldR.getStringNE("YIELD_SCHD_NO"));
				rs.addRow(actYieldR);
				if (rsRe != null) {
					rsRe.addRow(actYieldR);
				}
			}

			// ヘッダ（記録書 投入）のセット
			if(!inptL.isEmpty()) {
				HdrMfgActInptR actInptHdrR = HdrMfgActInptR.create();
				actInptHdrR.print_inpt("P");
				rs.addRow(actInptHdrR);
				if (rsRe != null) {
					rsRe.addRow(actInptHdrR);
				}
			}

			// 明細（記録書 投入）のセット
			for(MfgInstInptR inptR : inptL) {
				MfgActInptR actInptR = MfgActInptR.create();
				actInptR.inpt_act_itm_cd(inptR.s_inpt_itm_cd());
				actInptR.inpt_act_itm_sub1_view(inptR.s_inpt_itm_sub1_view());
				actInptR.inpt_act_itm_sub2_view(inptR.s_inpt_itm_sub2_view());
				actInptR.inpt_act_itm_sub3_view(inptR.s_inpt_itm_sub3_view());
				actInptR.inpt_act_itm_sub1_data(inptR.s_inpt_itm_sub1_data());
				actInptR.inpt_act_itm_sub2_data(inptR.s_inpt_itm_sub2_data());
				actInptR.inpt_act_itm_sub3_data(inptR.s_inpt_itm_sub3_data());
				actInptR.inpt_act_itm_nm(inptR.s_inpt_itm_nm());
				actInptR.inpt_itm_alt_nm1(inptR.s_inpt_itm_alt_nm1());
				actInptR.inpt_itm_alt_nm2(inptR.s_inpt_itm_alt_nm2());
				actInptR.inpt_itm_alt_nm3(inptR.s_inpt_itm_alt_nm3());
				actInptR.inpt_itm_alt_nm4(inptR.s_inpt_itm_alt_nm4());
				actInptR.alt_grp_cd(inptR.alt_grp_cd());
				actInptR.alt_grp_nm(inptR.alt_grp_nm());
				
				actInptR.base_unit_inpt_schd_qty(inptR.base_unit_inpt_qty());
				actInptR.s_int_base_unit_inpt_schd_qty(inptR.s_int_base_unit_inpt_qty());
				actInptR.s_dec_base_unit_inpt_schd_qty(inptR.s_dec_base_unit_inpt_qty());
				actInptR.base_unit_inpt_rqmt_qty(inptR.base_unit_rqmt_qty());
				actInptR.s_int_base_unit_inpt_rqmt_qty(inptR.s_int_base_unit_rqmt_qty());
				actInptR.s_dec_base_unit_inpt_rqmt_qty(inptR.s_dec_base_unit_rqmt_qty());
				actInptR.base_unit_inpt_fxd_rqmt_qty(inptR.base_unit_fxd_rqmt_qty());
				actInptR.s_int_base_unit_inpt_fxd_rqmt_qty(inptR.s_int_base_unit_fxd_rqmt_qty());
				actInptR.s_dec_base_unit_inpt_fxd_rqmt_qty(inptR.s_dec_base_unit_fxd_rqmt_qty());
				actInptR.left_cont_inpt_qty(inptR.left_qty_inpt());
				actInptR.cont_inpt_qty(inptR.cont_inpt_qty());
				actInptR.s_int_cont_inpt_qty(inptR.s_int_cont_qty_inpt());
				actInptR.s_dec_cont_inpt_qty(inptR.s_dec_cont_qty_inpt());
				actInptR.right_cont_inpt_qty(inptR.right_qty_inpt());
				
				actInptR.left_cont_inpt_rqmt_qty(inptR.left_qty_rqmt());
				actInptR.cont_inpt_rqmt_qty(inptR.cont_rqmt_qty());
				actInptR.s_int_cont_inpt_rqmt_qty(inptR.s_int_cont_qty_rqmt());
				actInptR.s_dec_cont_inpt_rqmt_qty(inptR.s_dec_cont_qty_rqmt());
				actInptR.right_cont_inpt_rqmt_qty(inptR.right_qty_rqmt());
				actInptR.left_cont_inpt_fxd_rqmt_qty(inptR.left_qty_fxd_rqmt());
				actInptR.cont_inpt_fxd_rqmt_qty(inptR.cont_fxd_rqmt_qty());
				actInptR.s_int_cont_inpt_fxd_rqmt_qty(inptR.s_int_cont_qty_fxd_rqmt());
				actInptR.s_dec_cont_inpt_fxd_rqmt_qty(inptR.s_dec_cont_qty_fxd_rqmt());
				actInptR.right_cont_inpt_fxd_rqmt_qty(inptR.right_qty_fxd_rqmt());
				actInptR.inpt_unit_nm(inptR.d_base_unit_nm());
				actInptR.left_unit(inptR.left_nm());
				actInptR.cont_fctr_unit_nm(inptR.cont_fctr_unit_nm());
				actInptR.right_unit(inptR.right_nm());
				actInptR.inpt_act_lot_no_view(inptR.inpt_lot_no_view());
				actInptR.inpt_act_lot_no_data(inptR.inpt_lot_no_data());
				actInptR.inpt_act_sublot_no_view(inptR.inpt_sublot_no_view());
				actInptR.inpt_act_sublot_no_data(inptR.inpt_sublot_no_data());
				actInptR.ver_no_lbl(inptR.inpt_ver_no_lbl());
				actInptR.ver_no(inptR.inpt_ver_no());
				actInptR.inpt_schd_no(inptR.getStringNE("INPT_SCHD_NO"));
				rs.addRow(actInptR);
				if (rsRe != null) {
					rsRe.addRow(actInptR);
				}
			}
			
			// フッタ（記録書）のセット(標準では設定する項目はない)
			MfgActFtrR actFtrR = MfgActFtrR.create();
			actFtrR.oper_act_rpt_rmrks_lbl(MSC_MR_PRNT_STR.OPER_ACT_RMRKS.name(getUsrLocale()));
			actFtrR.mfg_act_rpt_rmrks_lbl(MSC_MR_PRNT_STR.MFG_ACT_RMRKS.name(getUsrLocale()));
			
			if (isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1")) {
				actFtrR.mfg_act_aprv_dt_lbl(MSC_MR_PRNT_STR.APRV_DT.name(getUsrLocale()));
				actFtrR.mfg_act_dpt_nm_lbl(MSC_MR_PRNT_STR.APRV_DPT.name(getUsrLocale()));
				actFtrR.mfg_act_usr_nm_lbl(MSC_MR_PRNT_STR.APRV_USR.name(getUsrLocale()));
				actFtrR.mfg_aprv_rsn_lbl(MSC_MR_PRNT_STR.APRV_RSN.name(getUsrLocale()));
			}
			rs.addRow(actFtrR);
			if (rsRe != null) {
				rsRe.addRow(actFtrR);
			}
		}
		
		/**
		 * 製造記録書の印刷データを作成する。
		 */
		protected void crtReprintDataMfgAct(MSBCR_MfgAct reportSet, MfgInstHdrR hdrR) {
			
			reportSet.setAppTitle1(MCConst.repotlbl.getLabel("MS.MSBCR1020.label"));
			reportSet.setAppTitle2(MSC_MR_PRNT_STR.INST_ISSUE.name(getUsrLocale()));
			reportSet.setAppReportNo1(hdrR.mfg_inst_no());
			reportSet.setAppReportNo2(hdrR.mfg_inst_rev().toString());
			reportSet.setAppUsrCd1(hdrR.inst_dpt_cd());
			reportSet.setAppUsrNm1(hdrR.inst_dpt_nm());
			reportSet.setAppReportSts1(MAC_RPT_STS_TYP.CRT.value());

			MCServerReportManager.request(reportSet, false);
		}
		
		/**
		 * 印刷データを作成する。
		 */
		protected void crtReprintData(MSBCR_MfgInst reportSet, MfgInstHdrR hdrR) {
			
			reportSet.setAppTitle1(MCConst.repotlbl.getLabel("MS.MSBCR1010.label"));
			reportSet.setAppReportNo1(hdrR.mfg_inst_no());
			reportSet.setAppReportNo2(hdrR.mfg_inst_rev().toString());
			reportSet.setAppUsrCd1(hdrR.inst_dpt_cd());
			reportSet.setAppUsrNm1(hdrR.inst_dpt_nm());
			reportSet.setAppRmrks1(hdrR.getStringNE("MFG_INST_RPT_RMRKS"));
			reportSet.setAppReportSts1(MAC_RPT_STS_TYP.CRT.value());

			MCServerReportManager.request(reportSet, false);
		}
		
		/**
		 * 印刷実行
		 * @param rs
		 */
		protected void execPrnt(MSBCR_MfgInst rs) {
			MCServerReportManager.request(rs);
		}

		/**
		 * 「改訂履歴データ更新リスト」テーブルにデータを登録サービス呼び出し
		 */
		protected void callRevDataIns01(MCList<MST_MFG_INST_R> argL) {
			MCList<MST_MFG_INST_R> wkL = MCList.create(MST_MFG_INST_R.class);
			for (MST_MFG_INST_R r : argL) {
				MST_MFG_INST_R wkR = MST_MFG_INST_R.create();
				wkR.mfg_inst_no(r.mfg_inst_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_MFG_INST_R.create("T"));
			dbWkDelete("MSBCL6090_MSW_MFG_INST_D02", wkL_bldr.getBaseDbc());
			MCList<MST_MFG_INST_R> wkL2 = wkL.groupBy(wkL.createRow().getKeyColumn());
			dbWkInsert("MSBCL6090_MSW_MFG_INST_I02", wkL2, wkL_bldr.getBaseDbc());
			
			MCList<MST_MFG_INST_R> hdrL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t3 = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder hdrL_bldr = MCQueryApiBuilder.create(t3);
			MSW_MFG_INST_KEY_R w = MSW_MFG_INST_KEY_R.create("W");
			hdrL_bldr.addInnerJoin(w, bracket( t3.mfg_inst_no.eq(w.mfg_inst_no)));
			dbSelect("MSBCL6090_MST_MFG_INST_S02", hdrL, hdrL_bldr);
			
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (MST_MFG_INST_R hdrR : hdrL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(hdrR.mfg_inst_no());
				opeR.rev_no(hdrR.mfg_inst_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_MFG_INST.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
		
		// バーコードファイル生成
		protected File saveBarcodeFile(String path, String code, String mfgOperTyp) {
			File file = new File(path + "\\" + code + ".png");

			BufferedImage imagen = barcodeImage(code, mfgOperTyp);

			try {
				ImageIO.write(imagen, "png", file);
			}
			catch (Exception e) {
				e.printStackTrace();
				throw new MCAppException(e, MSBCL1404, e.toString());
			}
			return file;
		}

		// バーコード画像生成
		protected BufferedImage barcodeImage(String code, String mfgOperTyp) {
			String barString = code;

			// 制御文字で%xxを使えるようにする。
			try {
				barString = URLDecoder.decode(barString, "UTF-8");
			}
			catch (UnsupportedEncodingException e2) {
				barString = code;
			}

			int w = 0;
			int h = 0;
			if (MFG.equals(mfgOperTyp)) {
				w = MCConst.app.getInteger("MS.MSBCL6090.mfg_bcd.width", 300);
				h = MCConst.app.getInteger("MS.MSBCL6090.mfg_bcd.height", 50);
			}
			else if (OPER.equals(mfgOperTyp)) {
				w = MCConst.app.getInteger("MS.MSBCL6090.oper_bcd.width", 300);
				h = MCConst.app.getInteger("MS.MSBCL6090.oper_bcd.height", 50);
			}
			int w2 = w + 0;
			int h2 = h + 5;

			BufferedImage imagen = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
			Graphics2D g = imagen.createGraphics();
			g.setPaint(Color.white);
			g.fillRect(0, 0, w2, h2);

			MCBarcode39 code39 = new MCBarcode39();
			
			// バーコードの細線、太線のサイズを設定
			MCNumber numNarrow = MCConst.app.getNumber("MS.MSBCL6090.line_scale.narrow",
					new MCNumber(code39.getLineScale1()));
			MCNumber numWide = MCConst.app.getNumber("MS.MSBCL6090.line_scale.wide",
					new MCNumber(code39.getLineScale2()));
			code39.setLineScale1(numNarrow.doubleValue());
			code39.setLineScale2(numWide.doubleValue());

			code39.setShowText(false);
			code39.textString = null;

			code39.setCode(barString);
			code39.placeBarcode(imagen, Color.black, Color.black);
			return imagen;
		}
	}
	/**
	 * MfgRpt_Prnt02オペレーション.<p>
	 *
	 * 製造記録書を発行する。<br>
	 */
	public class MfgRpt_Prnt02 extends MSBCL_MfgRptService_MC_A.MfgRpt_Prnt02 {
		/** 製造記録書の発行データリスト */
		protected MCList<MfgRpt_Prnt02_DtlR> _prntDataL = null;
		/** 製造記録書の再発行データリスト */
		protected MCList<MfgRpt_Prnt02_DtlR> _reprntDataL = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// 前処理
			prepare();

			// 製造実績存在チェック
			chkMfgAct();
			
			// 製造状況チェック
			chkMfgSts();
			
			MCList<MfgRpt_Prnt02_DtlR> notErrL = up0().subList(MfgRpt_Prnt02_DtlR.$err_flg, false);
			if (notErrL.size() != 0) {

				// 製造指図情報（電文）編集
				MCList<MfgRpt_Prnt02_DtlR> updL = editUp(notErrL);

				// 製造実績の更新
				updMfgAct(updL);

				// 印刷処理
				prntMain();
			}

			// 下り電文設定
			setDown();
		}
		
		/**
		 * 前処理
		 */
		protected void prepare() {
			// ソート
			sortUp();
		}

		/**
		 * 更新前に上り電文をソートする。
		 */
		protected void sortUp() {
			up0().sort(MfgRpt_Prnt02_DtlR.$mfg_act_no);
		}
		
		/**
		 * 製造実績の存在チェックを実行する。
		 * @return
		 */
		protected void chkMfgAct() {
			MCList<MST_MFG_ACT_R> lockL = lockMfgAct();
			MCIndexKey idxkey = lockL.createIndex(MST_MFG_ACT_R.$mfg_act_no);

			// 承認対象ＦＬＧを取得するため、製造指図を取得する
			MCList<MST_MFG_INST_R> instL = getMfgInst();
			MCIndexKey instKey = instL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			
			MCMessageList msgList = new MCMessageList();
			for (MfgRpt_Prnt02_DtlR upR : up0()) {
				MST_MFG_ACT_R lockR = lockL.getFirst(idxkey, upR.mfg_act_no());

				if (isNull(lockR)) {
					upR.err_flg(true);
					msgList.addAll(getRecordNotFoundMsg(
							"MS",
							"MST_MFG_ACT",
							new String[]{MST_MFG_ACT_R.$mfg_act_no},
							new Comparable[]{upR.mfg_act_no()}, upR));
					continue;
				}
								
				upR.act_prnt_flg(lockR.act_prnt_flg());
				upR.act_prnt_tm(lockR.act_prnt_tm());
				upR.seq(lockR.seq());
				
				// 承認対象ＦＬＧ、製造承認区分を取得
				upR.mfg_aprv_sts_typ(lockR.mfg_aprv_sts_typ());
				MST_MFG_INST_R instR = instL.getFirst(instKey, upR.mfg_inst_no());
				if (!isNull(instR)) {
					upR.aprv_flg(instR.aprv_flg());
				}
			}

			if (!msgList.isEmpty()) {
				MCMessagePool.addAll(msgList);
			}
		}
		
		/**
		 * 製造実績をロックする。
		 * @return
		 */
		protected MCList<MST_MFG_ACT_R> lockMfgAct() {
			MCList<MST_MFG_ACT_R> lockL = MCList.create(MST_MFG_ACT_R.class);
			dbSelectKeyForUpdate("MSBCL6090_MST_MFG_ACT_S01", lockL,
					MCQueryApiBuilder.create(MST_MFG_ACT_R.create("T")), up0());
			return lockL;
		}

		protected MCList<MST_MFG_INST_R> getMfgInst() {
			MCList<MST_MFG_INST_R> instL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder instL_bldr = MCQueryApiBuilder.create(t);
			instL_bldr.setSelect(t.mfg_inst_no, t.aprv_flg);
			dbSelectKey("MSBCL6090_MST_MFG_INST_S03", instL, instL_bldr, up0());
			return instL;
		}
		
		/**
		 * 上り電文を編集する。
		 */
		protected MCList<MfgRpt_Prnt02_DtlR> editUp(MCList<MfgRpt_Prnt02_DtlR> subL) {
			_prntDataL = subL.subList(MfgRpt_Prnt02_DtlR.$act_prnt_flg, false);
			_reprntDataL = subL.subList(MfgRpt_Prnt02_DtlR.$act_prnt_flg, true);

			MCDate prntDt = MCDate.now();
			MCList<MfgRpt_Prnt02_DtlR> rtnL = MCList.create(MfgRpt_Prnt02_DtlR.class);
			for (MfgRpt_Prnt02_DtlR r : subL) {
				if (!isSame(getSysParm("MFG_INSP_PRNT_REV_FLG"), "1") || !r.act_prnt_flg()) {
					r.act_prnt_flg(true);
					r.act_prnt_tm(prntDt);
					rtnL.add(r);
				}
			}

			return rtnL;
		}

		/**
		 * 製造状況区分のチェックを行う
		 */
		protected void chkMfgSts() {
			MCList<MST_MFG_ACT_REM_R> chkL = MCList.create(MST_MFG_ACT_REM_R.class);
			dbSelectKeyForUpdate("MSBCL6090_MST_MFG_ACT_REM_S01", chkL,
					MCQueryApiBuilder.create(MST_MFG_ACT_REM_R.create("T")), up0());

			MCIndexKey idxkey = chkL.createIndex(MST_MFG_ACT_REM_R.$mfg_inst_no, MST_MFG_ACT_REM_R.$div_seq);

			MCMessageList msgList = new MCMessageList();
			for (MfgRpt_Prnt02_DtlR upR : up0()) {
				MST_MFG_ACT_REM_R chkR = chkL.getFirst(idxkey, upR.mfg_inst_no(), upR.div_seq());

				if (!isNull(chkR)) {
					if (!MSC_MFG_STS_TYP.isCMPL(chkR.mfg_sts_typ())) {
						upR.err_flg(true);
						msgList.add(new MCMessage(upR, null , MSBCL1096, upR.mfg_inst_no(), toDispGUIIndex(upR)));
					}
				}
			}

			if (!msgList.isEmpty()) {
				MCMessagePool.addAll(msgList);
			}
		}
		
		/**
		 * 製造実績テーブルを更新する。
		 */
		protected void updMfgAct(MCList<MfgRpt_Prnt02_DtlR> subL) {
			MCList<MST_MFG_ACT_R> updMfgActL = MCList.create(MST_MFG_ACT_R.class);

			for(MfgRpt_Prnt02_DtlR r : subL) {
				if (!canUpdPrntTm(r)) {
					continue;
				}

				MST_MFG_ACT_R mfgActR = MST_MFG_ACT_R.create();
				mfgActR.mfg_act_no(r.mfg_act_no());
				mfgActR.act_prnt_flg(r.act_prnt_flg());
				mfgActR.act_prnt_tm(r.act_prnt_tm());
				updMfgActL.add(mfgActR);
			}

			if (!updMfgActL.isEmpty()) {
				MST_MFG_ACT_R t = MST_MFG_ACT_R.create("T");
				MCQueryApiBuilder updMfgActL_bldr = MCQueryApiBuilder.create(t);
				editMfgActLSetStmt(updMfgActL, updMfgActL_bldr, t);

				dbUpdateKey("MSBCL6090_MST_MFG_ACT_U01", updMfgActL, updMfgActL_bldr);
			}
		}
		
		/**
		 * 製造実績テーブル更新用のdbContainerのset句を編集する。
		 * @param mfgActL 更新用リスト
		 */
		protected void editMfgActLSetStmt(MCList<MST_MFG_ACT_R> mfgActL, MCQueryApiBuilder updMfgActL_bldr,
				MST_MFG_ACT_R t) {
			updMfgActL_bldr.setSet(t.act_prnt_flg);
			updMfgActL_bldr.addSet(t.act_prnt_tm);
		}
		
		/**
		 * 発行日時、発行済フラグを設定する場合はtrueを返す
		 * @param r
		 * @return
		 */
		protected boolean canUpdPrntTm(MfgRpt_Prnt02_DtlR r) {
			// 再発行時に印刷データを再利用する場合で、承認対象かつ未承認の場合は発行日時、発行済フラグを設定しない
			// ※未承認の状態で発行済にしてしまうと、承認時の発行のときに再発行データを再利用してしまい、承認結果などが印字されない
			if (isSame(getSysParm("MFG_INSP_PRNT_REV_FLG"), "1") && r.aprv_flg()
					&& MSC_MFG_APRV_STS_TYP.isACT_OPN(r.mfg_aprv_sts_typ())) {
				return false;
			}
			return true;
		}
		
		/**
		 * 印刷処理
		 */
		protected void prntMain() {
			MCList<MfgRpt_Prnt02_DtlR> tmpPrntDataL = MCList.create(MfgRpt_Prnt02_DtlR.class);
			tmpPrntDataL.setAll(_prntDataL);
			if (isSame(getSysParm("MFG_INSP_PRNT_REV_FLG"), "1")) {
				// 再発行
				reprintData();
			}
			else {
				tmpPrntDataL.addAll(_reprntDataL);
			}
			// 最初発行
			if (!tmpPrntDataL.isEmpty()) {
				printData(tmpPrntDataL);
			}
		}
		
		/**
		 * 再発行する。
		 */
		protected void reprintData() {
			MCList<MCReportInfoR> reprntInfoList = MCList.create(MCReportInfoR.class);
			for (MfgRpt_Prnt02_DtlR r : _reprntDataL) {
				MSBCR_MfgAct reportSet = MSBCR_MfgAct.create();
				
				// 業務情報を設定し、印刷データからデータを取得
				reportSet.setAppTitle1(MCConst.repotlbl.getLabel("MS.MSBCR1020.label"));
				reportSet.setAppTitle2(MSC_MR_PRNT_STR.ACT_ISSUE.name(getUsrLocale()));
				reportSet.setAppReportNo2(r.mfg_act_no());
				reportSet.setAppReportNo3(r.seq().toString());
				reportSet.setAppReportSts1(MAC_RPT_STS_TYP.CRT.value());

				MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(reportSet, false);
				reprntInfoList.addAll(infoL);
			}
			if (!reprntInfoList.isEmpty()) {
				MCServerReportManager.reprint(reprntInfoList);
			}
		}
		
		/**
		 * 最初発行する。
		 */
		protected void printData(MCList<MfgRpt_Prnt02_DtlR> prntDataL) {
			MSBCR_MfgAct rs = MSBCR_MfgAct.create();
			MCDate prntDt = MCDate.now();
			
			// 対象の製造実績ＮＯをワークに格納
			MCList<MST_MFG_ACT_R> mfgActL = MCList.create(MST_MFG_ACT_R.class);
			MCQueryApiBuilder mfgActL_bldr = MCQueryApiBuilder.create(MST_MFG_ACT_R.create("T"));
			dbWkDelete("MSBCL6090_MSW_MFG_ACT_D01", mfgActL_bldr.getBaseDbc());
			
			for (MfgRpt_Prnt02_DtlR r : prntDataL) {
				MST_MFG_ACT_R mfgActR = MST_MFG_ACT_R.create();
				mfgActR.mfg_act_no(r.mfg_act_no());
				mfgActL.add(mfgActR);
			}
			
			if(!isNull(mfgActL)) {
				dbWkInsert("MSBCL6090_MSW_MFG_ACT_I01", mfgActL, mfgActL_bldr.getBaseDbc());
			}
			
			MCList<MfgActHdrR> hdrL = getPrntHdrData();
			MCList<MfgActYldR> yieldL = getPrntYieldData();
			MCList<MfgActInptR> inptL = getPrntInptData();
			
			MCIndexKey hdrKey = hdrL.createIndex(MfgActHdrR.$mfg_act_no);
			
			prntDataL.sort(SortType.ASC, MfgRpt_Prnt02_DtlR.$mfg_act_no);
			for(MfgRpt_Prnt02_DtlR upR : prntDataL) {
				MCList<MfgActHdrR> tmpHdrL = hdrL.subList(hdrKey, upR.mfg_act_no());
				tmpHdrL.sort(SortType.ASC, MfgActHdrR.$disp_seq, MfgActHdrR.$oper_act_no);

				MSBCR_MfgAct reportSet = MSBCR_MfgAct.create();
				for(MfgActHdrR hdrR : tmpHdrL) {

					// 発行済にする場合のみ再印刷データを作成する
					if (canUpdPrntTm(upR)) {
						// 再印刷データ作成
						editPrntData(rs, reportSet, upR, hdrR, yieldL, inptL, prntDt);
					}
					else {
						editPrntData(rs, null, upR, hdrR, yieldL, inptL, prntDt);
					}
				}
				if (reportSet.size() > 0) {
					crtReprintData(reportSet, upR, tmpHdrL.get(0));
				}
			}

			if (rs.size() > 0) {
				rs.setPersistent(false);
				execPrnt(rs);
			}
		}
		
		/**
		 * 製造記録書用のデータを取得する。
		 * @return
		 */
		protected MCList<MfgActHdrR> getPrntHdrData() {
			MCList<MfgActHdrR> hdrL = MCList.create(MfgActHdrR.class);
			executeQuery(hdrL, MSBCL6090_MST_MFG_ACT_S01());

			return hdrL;
		}
		
		/**
		 * 製造記録書用のデータ(出来高)を取得する。
		 * @return
		 */
		protected MCList<MfgActYldR> getPrntYieldData() {
			MCList<MfgActYldR> yieldL = MCList.create(MfgActYldR.class);
			executeQuery(yieldL, MSBCL6090_MST_YIELD_ACT_S01());
			
			return yieldL;
		}
		
		/**
		 * 製造記録書用のデータ(投入)を取得する。
		 * @return
		 */
		protected MCList<MfgActInptR> getPrntInptData() {
			MCList<MfgActInptR> inptL = MCList.create(MfgActInptR.class);
			executeQuery(inptL, MSBCL6090_MST_INPT_ACT_S01());

			return inptL;
		}

		/**
		 * 製造記録書用のデータを編集する。
		 * @param data
		 */
		protected void editPrntData(MSBCR_MfgAct rs, MSBCR_MfgAct rsRe,
				MfgRpt_Prnt02_DtlR upR, MfgActHdrR hdrR,
				MCList<MfgActYldR> yieldL, MCList<MfgActInptR> inptL, MCDate prntDt) {
			
			
			MCIndexKey yieldKey = yieldL.createIndex("OPER_ACT_NO");
			MCIndexKey inptKey = inptL.createIndex("OPER_ACT_NO");
			
			hdrR.form_name(MSC_MR_PRNT_STR.TITLE.name(getUsrLocale()));
			hdrR.prnt_tm(prntDt);
			hdrR.oper_num(convQtyBaseToOper(hdrR.getNumberNE("OPER_BASE_UNIT_QTY"),
					hdrR.getNumberNE("OPER_CONV_QTY"), hdrR.getNumberNE("OPER_STD_QTY"), hdrR.getNumberNE("OPER_UNIT_DEC_PLACE"),
					hdrR.getStringNE("OPER_UNIT_CONV_RND_TYP")));
			hdrR.oper_mfg_num(convQtyBaseToOper(hdrR.getNumberNE("OPER_BASE_UNIT_MFG_QTY"),
					hdrR.getNumberNE("OPER_CONV_QTY"), hdrR.getNumberNE("OPER_STD_QTY"), hdrR.getNumberNE("OPER_UNIT_DEC_PLACE"),
					hdrR.getStringNE("OPER_UNIT_CONV_RND_TYP")));
			putNumStr(rs, hdrR, MfgActHdrR.$s_oper_num, MfgActHdrR.$oper_num,
					hdrR.getNumberNE("OPER_UNIT_DEC_PLACE"));
			putNumStr(rs, hdrR, MfgActHdrR.$s_oper_mfg_num, MfgActHdrR.$oper_mfg_num,
					hdrR.getNumberNE("OPER_UNIT_DEC_PLACE"));
			putNumStr(rs, hdrR, MfgActHdrR.$s_oper_unit_qty, MfgActHdrR.$oper_unit_qty,
					hdrR.getNumberNE("OPER_UNIT_DEC_PLACE"));
			putNumStr(rs, hdrR, MfgActHdrR.$s_base_unit_inst_qty,
					MfgActHdrR.$base_unit_inst_qty,
					hdrR.getNumberNE("BASE_UNIT_DEC_PLACE"));
			putNumStr(rs, hdrR, MfgActHdrR.$s_base_unit_mfg_qty,
					MfgActHdrR.$base_unit_mfg_qty,
					hdrR.getNumberNE("BASE_UNIT_DEC_PLACE"));
			putNumStr(rs, hdrR, MfgActHdrR.$s_base_unit_yield_qty,
					MfgActHdrR.$base_unit_yield_qty,
					hdrR.getNumberNE("BASE_UNIT_DEC_PLACE"));
			putNumStr(rs, hdrR, MfgActHdrR.$s_base_unit_dfct_qty,
					MfgActHdrR.$base_unit_dfct_qty,
					hdrR.getNumberNE("BASE_UNIT_DEC_PLACE"));

			// 工程収率の印字
			if(!isNull(hdrR.oper_act_yield()) || !isNull(hdrR.oper_lower_yield()) || !isNull(hdrR.oper_std_yield()) || !isNull(hdrR.oper_upper_yield())) {
				hdrR.oper_yield_lbl(MSC_MR_PRNT_STR.OPER_YIELD.name(getUsrLocale()));
				
				hdrR.oper_act_yield_lbl(MSC_MR_PRNT_STR.ACT_YIELD.name(getUsrLocale()));
				hdrR.oper_lower_yield_lbl(MSC_MI_PRNT_STR.LOWER_YIELD.name(getUsrLocale()));
				hdrR.oper_std_yield_lbl(MSC_MI_PRNT_STR.STD_YIELD.name(getUsrLocale()));
				hdrR.oper_upper_yield_lbl(MSC_MI_PRNT_STR.UPPER_YIELD.name(getUsrLocale()));
			}
			// 品目収率の印字
			if(!isNull(hdrR.itm_act_yield()) || !isNull(hdrR.itm_lower_yield()) || !isNull(hdrR.itm_std_yield()) || !isNull(hdrR.itm_upper_yield())) {
				hdrR.itm_yield_lbl(MSC_MI_PRNT_STR.ITM_YIELD.name(getUsrLocale()));
				
				hdrR.itm_act_yield_lbl(MSC_MR_PRNT_STR.ACT_YIELD.name(getUsrLocale()));
				hdrR.itm_lower_yield_lbl(MSC_MI_PRNT_STR.LOWER_YIELD.name(getUsrLocale()));
				hdrR.itm_std_yield_lbl(MSC_MI_PRNT_STR.STD_YIELD.name(getUsrLocale()));
				hdrR.itm_upper_yield_lbl(MSC_MI_PRNT_STR.UPPER_YIELD.name(getUsrLocale()));
			}
			//品目ＣＤを表示用に変換
			putPrntItmSub1(hdrR, MfgActHdrR.$itm_sub1_view, MfgActHdrR.$itm_sub1_data);
			putPrntItmSub2(hdrR, MfgActHdrR.$itm_sub2_view, MfgActHdrR.$itm_sub2_data);
			putPrntItmSub3(hdrR, MfgActHdrR.$itm_sub3_view, MfgActHdrR.$itm_sub3_data);
			
			//手配ＮＯを表示用に変換
			putPrntSno1(hdrR, MfgActHdrR.$sno1_view, MfgActHdrR.$sno1_data);
			putPrntSno2(hdrR, MfgActHdrR.$sno2_view, MfgActHdrR.$sno2_data);
			putPrntSno3(hdrR, MfgActHdrR.$sno3_view, MfgActHdrR.$sno3_data);
			putPrntSno4(hdrR, MfgActHdrR.$sno4_view, MfgActHdrR.$sno4_data);

			//ロットＮＯを表示用に変換
			putPrntStr(hdrR, MfgActHdrR.$lot_no_view, MfgActHdrR.$lot_no_data);
			putPrntStr(hdrR, MfgActHdrR.$sublot_no_view, MfgActHdrR.$sublot_no_data);
			
			// 時刻の表示対応
			doCompTime(hdrR, false);
			
			// 品名設定
			if (!isNull(hdrR.ntfy_nm())) {
				hdrR.itm_nm(hdrR.ntfy_nm());
			}
			
			rs.addRow(hdrR);
			if (rsRe != null) {
				rsRe.addRow(hdrR);
			}
			
			// 出来高
			MCList<MfgActYldR> tmpYieldL = yieldL.subList(yieldKey, hdrR.oper_act_no());
			tmpYieldL.sort(SortType.ASC, MfgActYldR.$act_dt, MfgActYldR.$act_hm, MfgActYldR.$yield_schd_no, "YIELD_ACT_NO");
			//整数部と小数部に分ける
			putNumStr(rs, tmpYieldL, MfgActYldR.$s_int_trd_unit_yield_qty, MfgActYldR.$s_dec_trd_unit_yield_qty,
					MfgActYldR.$trd_unit_yield_qty, "DEC_PLACE");
			putNumStr(rs, tmpYieldL, MfgActYldR.$s_int_trd_unit_yield_act_qty, MfgActYldR.$s_dec_trd_unit_yield_act_qty,
					MfgActYldR.$trd_unit_yield_act_qty, "DEC_PLACE");

			if(!tmpYieldL.isEmpty()) {
				HdrMfgActYldR hdrActYieldR = HdrMfgActYldR.create();
				hdrActYieldR.print_yld("P");
				rs.addRow(hdrActYieldR);
				if (rsRe != null) {
					rsRe.addRow(hdrActYieldR);
				}
			}
			
			for(MfgActYldR yieldR : tmpYieldL) {
				MAC_YIELD_TYP.putNameNE(yieldR, "YIELD_TYP", MfgActYldR.$yield_typ_nm, getUsrLocale());
				
				//ロットＮＯを表示用に変換
				putPrntStr(yieldR, MfgActYldR.$yield_act_lot_no_view, MfgActYldR.$yield_act_lot_no_data);
				putPrntStr(yieldR, MfgActYldR.$yield_act_sublot_no_view, MfgActYldR.$yield_act_sublot_no_data);
				
				// 時刻の表示対応
				doCompTime(yieldR, false);
				
				rs.addRow(yieldR);
				if (rsRe != null) {
					rsRe.addRow(yieldR);
				}
			}
			
			// 投入予定
			MCList<MfgActInptR> tmpInptL = inptL.subList(inptKey, hdrR.oper_act_no());
			tmpInptL.sort(SortType.ASC, "DISP_SEQ", MfgActInptR.$inpt_schd_no, MfgActInptR.$inpt_act_no);

			//整数部と小数部に分ける
			// 投入予定数量
			putNumStr(rs, tmpInptL, MfgActInptR.$s_int_base_unit_inpt_schd_qty, MfgActInptR.$s_dec_base_unit_inpt_schd_qty,
					MfgActInptR.$base_unit_inpt_schd_qty, "BASE_UNIT_DEC_PLACE");
			// 投入必要数量
			putNumStr(rs, tmpInptL, MfgActInptR.$s_int_base_unit_inpt_rqmt_qty, MfgActInptR.$s_dec_base_unit_inpt_rqmt_qty,
					MfgActInptR.$base_unit_inpt_rqmt_qty, "BASE_UNIT_DEC_PLACE");
			// 投入固定必要数量
			putNumStr(rs, tmpInptL, MfgActInptR.$s_int_base_unit_inpt_fxd_rqmt_qty, MfgActInptR.$s_dec_base_unit_inpt_fxd_rqmt_qty,
					MfgActInptR.$base_unit_inpt_fxd_rqmt_qty, "BASE_UNIT_DEC_PLACE");
			// 投入実績数量
			putNumStr(rs, tmpInptL, MfgActInptR.$s_int_base_unit_inpt_act_qty, MfgActInptR.$s_dec_base_unit_inpt_act_qty,
					MfgActInptR.$base_unit_inpt_act_qty, "BASE_UNIT_DEC_PLACE");
			// ロス実績数
			putNumStr(rs, tmpInptL, MfgActInptR.$s_int_base_unit_loss_qty, MfgActInptR.$s_dec_base_unit_loss_qty,
					MfgActInptR.$base_unit_loss_qty, "BASE_UNIT_DEC_PLACE");
			// 固定ロス実績数
			putNumStr(rs, tmpInptL, MfgActInptR.$s_int_base_unit_fxd_loss_qty, MfgActInptR.$s_dec_base_unit_fxd_loss_qty,
					MfgActInptR.$base_unit_fxd_loss_qty, "BASE_UNIT_DEC_PLACE");

			// 指図有効成分(投入予定)
			putNumStr(rs, tmpInptL, MfgActInptR.$s_int_cont_inpt_qty, MfgActInptR.$s_dec_cont_inpt_qty,
					MfgActInptR.$cont_inpt_qty, "CONT_FCTR_UNIT_DEC_PLACE");
			// 指図有効成分(投入必要)
			putNumStr(rs, tmpInptL, MfgActInptR.$s_int_cont_inpt_rqmt_qty, MfgActInptR.$s_dec_cont_inpt_rqmt_qty,
					MfgActInptR.$cont_inpt_rqmt_qty, "CONT_FCTR_UNIT_DEC_PLACE");
			// 指図有効成分(投入固定必要)
			putNumStr(rs, tmpInptL, MfgActInptR.$s_int_cont_inpt_fxd_rqmt_qty, MfgActInptR.$s_dec_cont_inpt_fxd_rqmt_qty,
					MfgActInptR.$cont_inpt_fxd_rqmt_qty, "CONT_FCTR_UNIT_DEC_PLACE");
			// 投入有効成分
			putNumStr(rs, tmpInptL, MfgActInptR.$s_int_cont_qty, MfgActInptR.$s_dec_cont_qty,
					MfgActInptR.$cont_qty, "CONT_FCTR_UNIT_DEC_PLACE");
			// ロス有効成分
			putNumStr(rs, tmpInptL, MfgActInptR.$s_int_cont_loss_qty, MfgActInptR.$s_dec_cont_loss_qty,
					MfgActInptR.$cont_loss_qty, "CONT_FCTR_UNIT_DEC_PLACE");
			// 固定ロス有効成分
			putNumStr(rs, tmpInptL, MfgActInptR.$s_int_cont_fxd_loss_qty, MfgActInptR.$s_dec_cont_fxd_loss_qty,
					MfgActInptR.$cont_fxd_loss_qty, "CONT_FCTR_UNIT_DEC_PLACE");

			if(!tmpInptL.isEmpty()) {
				HdrMfgActInptR hdrActInptR = HdrMfgActInptR.create();
				hdrActInptR.print_inpt("P");
				rs.addRow(hdrActInptR);
				if (rsRe != null) {
					rsRe.addRow(hdrActInptR);
				}
			}

			for(MfgActInptR inptR : tmpInptL) {
				if(!isNull(inptR.cont_inpt_qty())) {
					inptR.left_cont_inpt_qty(MSC_MR_PRNT_STR.LEFT.name(getUsrLocale()));
					inptR.right_cont_inpt_qty(MSC_MR_PRNT_STR.RIGHT.name(getUsrLocale()));
				}
				if(!isNull(inptR.cont_inpt_rqmt_qty())) {
					inptR.left_cont_inpt_rqmt_qty(MSC_MR_PRNT_STR.LEFT.name(getUsrLocale()));
					inptR.right_cont_inpt_rqmt_qty(MSC_MR_PRNT_STR.RIGHT.name(getUsrLocale()));
				}
				if(!isNull(inptR.cont_inpt_fxd_rqmt_qty())) {
					inptR.left_cont_inpt_fxd_rqmt_qty(MSC_MR_PRNT_STR.LEFT.name(getUsrLocale()));
					inptR.right_cont_inpt_fxd_rqmt_qty(MSC_MR_PRNT_STR.RIGHT.name(getUsrLocale()));
				}
				if(!isNull(inptR.cont_qty())) {
					inptR.left_cont_qty(MSC_MR_PRNT_STR.LEFT.name(getUsrLocale()));
					inptR.right_cont_qty(MSC_MR_PRNT_STR.RIGHT.name(getUsrLocale()));
				}
				if(!isNull(inptR.cont_loss_qty())) {
					inptR.left_cont_loss_qty(MSC_MR_PRNT_STR.LEFT.name(getUsrLocale()));
					inptR.right_cont_loss_qty(MSC_MR_PRNT_STR.RIGHT.name(getUsrLocale()));
				}
				if(!isNull(inptR.cont_fxd_loss_qty())) {
					inptR.left_cont_fxd_loss_qty(MSC_MR_PRNT_STR.LEFT.name(getUsrLocale()));
					inptR.right_cont_fxd_loss_qty(MSC_MR_PRNT_STR.RIGHT.name(getUsrLocale()));
				}
				if(!isNull(inptR.cont_fctr_unit_nm())) {
					inptR.left_unit(MSC_MR_PRNT_STR.LEFT.name(getUsrLocale()));
					inptR.right_unit(MSC_MR_PRNT_STR.RIGHT.name(getUsrLocale()));
				}
				
				if(!isNull(inptR.ver_no())) {
					inptR.ver_no_lbl(MSC_MR_PRNT_STR.VER_NO.name(getUsrLocale()));
				}
								
				//品目ＣＤを表示用に変換
				putPrntItmSub1(inptR, MfgActInptR.$inpt_act_itm_sub1_view, MfgActInptR.$inpt_act_itm_sub1_data);
				putPrntItmSub2(inptR, MfgActInptR.$inpt_act_itm_sub2_view, MfgActInptR.$inpt_act_itm_sub2_data);
				putPrntItmSub3(inptR, MfgActInptR.$inpt_act_itm_sub3_view, MfgActInptR.$inpt_act_itm_sub3_data);

				//手配ＮＯを表示用に変換
				putPrntSno1(inptR, MfgActInptR.$inpt_sno1_view, MfgActInptR.$inpt_sno1_data);
				putPrntSno2(inptR, MfgActInptR.$inpt_sno2_view, MfgActInptR.$inpt_sno2_data);
				putPrntSno3(inptR, MfgActInptR.$inpt_sno3_view, MfgActInptR.$inpt_sno3_data);
				putPrntSno4(inptR, MfgActInptR.$inpt_sno4_view, MfgActInptR.$inpt_sno4_data);
				
				//ロットＮＯを表示用に変換
				putPrntStr(inptR, MfgActInptR.$inpt_act_lot_no_view, MfgActInptR.$inpt_act_lot_no_data);
				putPrntStr(inptR, MfgActInptR.$inpt_act_sublot_no_view, MfgActInptR.$inpt_act_sublot_no_data);
				
				// 時刻の表示対応
				doCompTime(inptR, false);
				
				rs.addRow(inptR);
				if (rsRe != null) {
					rsRe.addRow(inptR);
				}
			}
			
			// フッター
			MfgActFtrR ftrR = MfgActFtrR.create();
			ftrR.oper_act_rpt_rmrks_lbl(MSC_MR_PRNT_STR.OPER_ACT_RMRKS.name(getUsrLocale()));
			ftrR.oper_act_rpt_rmrks(hdrR.getStringNE("OPER_ACT_RPT_RMRKS"));
			ftrR.mfg_act_rpt_rmrks_lbl(MSC_MR_PRNT_STR.MFG_ACT_RMRKS.name(getUsrLocale()));
			ftrR.mfg_act_rpt_rmrks(hdrR.getStringNE("MFG_ACT_RPT_RMRKS"));
			if (isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1")) {
				ftrR.mfg_act_aprv_dt_lbl(MSC_MR_PRNT_STR.APRV_DT.name(getUsrLocale()));
				ftrR.mfg_act_aprv_dt(hdrR.getDateNE("APRV_DT"));
				ftrR.mfg_act_dpt_nm_lbl(MSC_MR_PRNT_STR.APRV_DPT.name(getUsrLocale()));
				ftrR.mfg_act_dpt_nm(hdrR.getStringNE("APRV_DPT_NM"));
				ftrR.mfg_act_usr_nm_lbl(MSC_MR_PRNT_STR.APRV_USR.name(getUsrLocale()));
				ftrR.mfg_act_usr_nm(hdrR.getStringNE("APRV_USR_NM"));
				ftrR.mfg_aprv_rsn_lbl(MSC_MR_PRNT_STR.APRV_RSN.name(getUsrLocale()));
				ftrR.mfg_aprv_rsn(hdrR.getString("APRV_RSN"));
			}
			
			rs.addRow(ftrR);
			
			rs.addNextPageRow();
			if (rsRe != null) {
				rsRe.addRow(ftrR);
				rsRe.addNextPageRow();
			}
		}
		
		/**
		 * 印刷データを作成する。
		 */
		protected void crtReprintData(MSBCR_MfgAct reportSet, MfgRpt_Prnt02_DtlR upR, MfgActHdrR hdrR) {

			reportSet.setAppTitle1(MCConst.repotlbl.getLabel("MS.MSBCR1020.label"));
			reportSet.setAppTitle2(MSC_MR_PRNT_STR.ACT_ISSUE.name(getUsrLocale()));
			reportSet.setAppReportNo1(hdrR.mfg_inst_no());
			reportSet.setAppReportNo2(hdrR.mfg_act_no());
			reportSet.setAppReportNo3(upR.seq().toString());
			reportSet.setAppUsrCd1(hdrR.getStringNE("INST_DPT_CD"));
			reportSet.setAppUsrNm1(hdrR.inst_dpt_nm());
			reportSet.setAppRmrks1(hdrR.getStringNE("MFG_ACT_RPT_RMRKS"));
			reportSet.setAppReportSts1(MAC_RPT_STS_TYP.CRT.value());

			MCServerReportManager.request(reportSet, false);
		}
		
		/**
		 * 印刷実行
		 * @param rs
		 */
		protected void execPrnt(MSBCR_MfgAct rs) {
			MCServerReportManager.request(rs);
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
	}
	/**
	 * MfgRpt_Prnt03オペレーション.<p>
	 *
	 * 工程・ＢＯＭマスタ変更リストを発行する。<br>
	 */
	public class MfgRpt_Prnt03 extends MSBCL_MfgRptService_MC_A.MfgRpt_Prnt03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// 前処理
			prepare();

			// 製造指図存在チェック
			chkMfgInst();
			
			// 改定番号チェック
			chkMfgInstVer();

			MCList<MfgRpt_Prnt03_DtlR> notErrL = up0().subList(MfgRpt_Prnt03_DtlR.$err_flg, false);
			if (notErrL.size() != 0) {
				// 印刷処理
				prntMain(notErrL);
			}

			// 下り電文設定
			setDown();
		}
		
		/**
		 * 前処理
		 */
		protected void prepare() {
			// ソート
			sortUp();
		}

		/**
		 * 更新前に上り電文をソートする。
		 */
		protected void sortUp() {
			up0().sort(MfgRpt_Prnt03_DtlR.$mfg_inst_no);
		}
		
		/**
		 * 製造指図の存在チェックを実行する。
		 * @return
		 */
		protected void chkMfgInst() {
			MCList<MST_MFG_INST_R> mfgInstL = getMfgInst();
			MCIndexKey idxkey = mfgInstL.createIndex(MST_MFG_INST_R.$mfg_inst_no);

			MCMessageList msgList = new MCMessageList();
			for (MfgRpt_Prnt03_DtlR upR : up0()) {
				MST_MFG_INST_R lockR = mfgInstL.getFirst(idxkey, upR.mfg_inst_no());

				if (isNull(lockR)) {
					upR.err_flg(true);
					msgList.addAll(getRecordNotFoundMsg(
							"MS",
							"MST_MFG_INST",
							new String[]{MST_MFG_INST_R.$mfg_inst_no, MST_MFG_INST_R.$mfg_inst_rev},
							new Comparable[]{upR.mfg_inst_no(), upR.mfg_inst_rev()}, upR));
					continue;
				}
				// 改訂番号を保持
				upR.latest_mfg_inst_rev(lockR.mfg_inst_rev());
			}

			if (!msgList.isEmpty()) {
				MCMessagePool.addAll(msgList);
			}
		}
		
		/**
		 * 上り電文の改定番号をチェックし、改定番号が１の場合はエラーとする
		 */
		protected void chkMfgInstVer() {
			for (MfgRpt_Prnt03_DtlR upR : up0()) {
				if(isSame(upR.mfg_inst_rev(), MCNumber.ONE)) {
					upR.err_flg(true);
					MCMessagePool.add(new MCMessage(upR, null , MSBCL1055, upR.mfg_inst_no(), toDispGUIIndex(upR)));
				}
			}
		}
		
		/**
		 * 製造指図を取得する。
		 * @return
		 */
		protected MCList<MST_MFG_INST_R> getMfgInst() {
			MCList<MST_MFG_INST_R> mfgInstL = MCList.create(MST_MFG_INST_R.class);
			dbSelectKey("MSBCL6090_MST_MFG_INST_S04", mfgInstL,
					MCQueryApiBuilder.create(MST_MFG_INST_R.create("T")), up0());

			return mfgInstL;
		}

		/**
		 * 印刷処理
		 */
		protected void prntMain(MCList<MfgRpt_Prnt03_DtlR> notErrL) {
			MSBCR_OperBom rs = MSBCR_OperBom.create();
			MCDate prntDt = MCDate.now();
			
			// 対象の製造指図ＮＯをワークに格納
			dbWkDelete("MSBCL6090_MSW_MFG_INST_D03", MST_MFG_INST_R.create("T"));
			
			for (MfgRpt_Prnt03_DtlR upR : notErrL) {
				
				MCList<OperBomHdrR> mfgL = getPrntMfgData(upR);
				MCList<OperBomYldR> yieldL = getPrntYieldData(upR);
				MCList<OperBomInptR> inptL = getPrntInptData(upR);
				
				MCList<OperBomHdrR> hdrL = getPrntHdrData(mfgL, yieldL);

				hdrL.sort(SortType.ASC, OperBomHdrR.$mfg_inst_no, OperBomHdrR.$oper_inst_no);
				hdrL.setBooleanNE("err_flg", false);
				MSBCR_OperBom reportSet = MSBCR_OperBom.create();
				for(OperBomHdrR hdrR : hdrL) {
					editPrntData(rs, reportSet, upR, hdrR, yieldL, inptL, prntDt);
				}
				
				MCIndexKey hdrKey = hdrL.createIndex("err_flg");
				if (!hdrL.contains(hdrKey, false)) {
					// エラーフラグがfalseのヘッダが存在しない場合、エラー
					MCMessagePool.add(new MCMessage(upR, null , MSBCL1055, upR.mfg_inst_no(), toDispGUIIndex(upR)));
				}
				if (reportSet.size() > 0) {
					crtReprintData(reportSet, hdrL.get(0));
				}
			}

			if (rs.size() > 0) {
				rs.setPersistent(false);
				execPrnt(rs);
			}
		}

		/**
		 * 工程・ＢＯＭマスタ変更リスト用のヘッダ・フッターデータ（製造指図単位）を取得する。
		 * @return
		 */
		protected MCList<OperBomHdrR> getPrntMfgData(MfgRpt_Prnt03_DtlR upR) {
			MCQueryPlan sql = MSBCL6090_MST_MFG_INST_ALL_R_S01();
			MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
			MCDynamicSQLID REP2 = createDynamicSQLID("REP2");
			MCDynamicSQLID REP3 = createDynamicSQLID("REP3");
			
			// 即時発行の場合はこの時点でDEFWのテーブルが存在しないため、処理対象の改訂番号が最新の場合はDEFWテーブルを参照しない
			if (isSame(upR.mfg_inst_rev(), upR.latest_mfg_inst_rev())) {
				MST_MFG_INST_R S0T2 = MST_MFG_INST_R.create("T2");
				MST_ITM_MFG_INST_R S0T9 = MST_ITM_MFG_INST_R.create("T9");
				
				sql.addDynamicSQLInfo(when(null).view(REP1, v -> S0T2));
				sql.addDynamicSQLInfo(when(null).view(REP2, v -> v.innerJoin(S0T9)
						.on(S0T9.itm_mfg_inst_no.eq(S0T2.itm_mfg_inst_no))));
				sql.addDynamicSQLInfo(when(null).predicate(REP3,
						p -> p.and(S0T2.mfg_inst_no.eq(bind("mfg_inst_no")))));
			}
			else {
				MST_MFG_INST_P_R S0T2 = MST_MFG_INST_P_R.create("T2");
				MST_ITM_MFG_INST_P_R S0T9 = MST_ITM_MFG_INST_P_R.create("T9");
				
				sql.addDynamicSQLInfo(when(null).view(REP1, v -> S0T2));
				sql.addDynamicSQLInfo(when(null).view(REP2, v -> v.innerJoin(S0T9)
						.on(S0T9.mfg_inst_no.eq(S0T2.mfg_inst_no)
								.and(S0T2.mfg_inst_rev.eq(bind("mfg_inst_rev"))))));
				sql.addDynamicSQLInfo(when(null).predicate(REP3,
						p -> p.and(S0T2.mfg_inst_no.eq(bind("mfg_inst_no"))
								.and(S0T2.mfg_inst_rev.eq(bind("mfg_inst_rev"))))));
			}

			MCList<OperBomHdrR> mfgL = MCList.create(OperBomHdrR.class);
			executeQuery(mfgL, sql, upR);

			return mfgL;
		}
		
		/**
		 * 工程・ＢＯＭマスタ変更リスト用のデータ(出来高)を取得する。
		 * @return
		 */
		protected MCList<OperBomYldR> getPrntYieldData(MfgRpt_Prnt03_DtlR upR) {

			MCList<OperBomYldR> yieldL = MCList.create(OperBomYldR.class);
			MCList<OperBomYldR> newYieldL = MCList.create(OperBomYldR.class);
			MCList<OperBomYldR> oldYieldL = MCList.create(OperBomYldR.class);

			// 最新の投入予定から取得する場合に使用するSQL
			MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
			MCDynamicSQLID REP2 = createDynamicSQLID("REP2");
			MST_OPER_INST_R S0T2 = MST_OPER_INST_R.create("T2");
			MCQueryPlan latestSql = MSBCL6090_MST_YIELD_SCHD_ALL_R_S01();
			latestSql.addDynamicSQLInfo(when(null).view(REP1, v -> S0T2));
			latestSql.addDynamicSQLInfo(when(null).predicate(REP2,
					p -> p.and(S0T2.mfg_inst_no.eq(bind("mfg_inst_no")))));
			
			// 改訂履歴テーブルから取得する場合に使用するSQL
			MST_OPER_INST_P_R S1T2 = MST_OPER_INST_P_R.create("T2");
			MCQueryPlan revSql = MSBCL6090_MST_YIELD_SCHD_ALL_R_S01();
			revSql.addDynamicSQLInfo(when(null).view(REP1, v -> S1T2));
			revSql.addDynamicSQLInfo(when(null).predicate(REP2,
					p -> p.and(S1T2.mfg_inst_no.eq(bind("mfg_inst_no"))
							.and(S1T2.mfg_inst_rev.eq(bind("mfg_inst_rev"))))));

			// 即時発行の場合はこの時点でDEFWのテーブルが存在しないため、処理対象の改訂番号が最新の場合はDEFWテーブルを参照しない
			if (isSame(upR.mfg_inst_rev(), upR.latest_mfg_inst_rev())) {
				executeQuery(newYieldL, latestSql, upR);
			}
			else {
				executeQuery(newYieldL, revSql, upR);
			}

			// 旧リビジョンの出来高予定は必ず改訂履歴テーブルから取得
			MfgRpt_Prnt03_DtlR oldUpR = upR.clone();
			oldUpR.mfg_inst_rev(oldUpR.mfg_inst_rev().subtract(1));
			executeQuery(oldYieldL, revSql, oldUpR);
			
			yieldL.addAll(newYieldL);
			yieldL.addAll(oldYieldL);
			
			return yieldL;
		}

		/**
		 * 工程・ＢＯＭマスタ変更リスト用のデータ(投入)を取得する。
		 * @return
		 */
		protected MCList<OperBomInptR> getPrntInptData(MfgRpt_Prnt03_DtlR upR) {

			MCList<OperBomInptR> inptL = MCList.create(OperBomInptR.class);
			MCList<OperBomInptR> newInptL = MCList.create(OperBomInptR.class);
			MCList<OperBomInptR> oldInptL = MCList.create(OperBomInptR.class);

			// 最新の投入予定から取得する場合に使用するSQL
			MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
			MCDynamicSQLID REP2 = createDynamicSQLID("REP2");
			MST_INPT_SCHD_R S0T2 = MST_INPT_SCHD_R.create("T2");
			MCQueryPlan latestSql = MSBCL6090_MST_INPT_SCHD_ALL_R_S01();
			latestSql.addDynamicSQLInfo(when(null).view(REP1, v -> S0T2));
			latestSql.addDynamicSQLInfo(when(null).predicate(REP2,
					p -> p.and(S0T2.mfg_inst_no.eq(bind("mfg_inst_no")))));
			
			// 改訂履歴テーブルから取得する場合に使用するSQL
			MST_INPT_SCHD_P_R S1T2 = MST_INPT_SCHD_P_R.create("T2");
			MCQueryPlan revSql = MSBCL6090_MST_INPT_SCHD_ALL_R_S01();
			revSql.addDynamicSQLInfo(when(null).view(REP1, v -> S1T2));
			revSql.addDynamicSQLInfo(when(null).predicate(REP2,
					p -> p.and(S1T2.mfg_inst_no.eq(bind("mfg_inst_no"))
							.and(S1T2.mfg_inst_rev.eq(bind("mfg_inst_rev"))))));

			// 即時発行の場合はこの時点でDEFWのテーブルが存在しないため、処理対象の改訂番号が最新の場合はDEFWテーブルを参照しない
			if (isSame(upR.mfg_inst_rev(), upR.latest_mfg_inst_rev())) {
				executeQuery(newInptL, latestSql, upR);
			}
			else {
				executeQuery(newInptL, revSql, upR);
			}

			// 旧リビジョンの投入予定は必ず改訂履歴テーブルから取得
			MfgRpt_Prnt03_DtlR oldUpR = upR.clone();
			oldUpR.mfg_inst_rev(oldUpR.mfg_inst_rev().subtract(1));
			executeQuery(oldInptL, revSql, oldUpR);
			
			inptL.addAll(newInptL);
			inptL.addAll(oldInptL);
			return inptL;
		}

		/**
		 * 製造指図、工程指図のデータからヘッダデータを作成する。
		 * @param mfgL
		 * @param yieldL
		 * @return
		 */
		protected MCList<OperBomHdrR> getPrntHdrData(MCList<OperBomHdrR> mfgL, MCList<OperBomYldR> yieldL) {
			MCList<OperBomHdrR> hdrL = MCList.create(OperBomHdrR.class);
			
			MCIndexKey mfgKey = yieldL.createIndex("MFG_INST_NO", OperBomYldR.$mfg_inst_rev_no);

			for (OperBomHdrR mfgR : mfgL) {
				// 製造指図ＮＯと変更前後のリビジョンＮＯから工程指図の新旧データを抽出
				MCList<OperBomYldR> newYieldL = yieldL.subList(mfgKey, mfgR.mfg_inst_no(), mfgR.new_mfg_inst_rev_no());
				MCList<OperBomYldR> oldYieldL = yieldL.subList(mfgKey, mfgR.mfg_inst_no(), mfgR.old_mfg_inst_rev_no());
				MCIndexKey operKey = newYieldL.createIndex("OPER_INST_NO");
				
				// 変更後のデータからヘッダデータを作成
				for (OperBomYldR yieldR : newYieldL) {
					OperBomHdrR hdrR = mfgR.clone();
					setPrntHdrData(hdrR, yieldR);
					hdrL.add(hdrR);
				}
				
				// 変更前のデータのうち、変更後のデータに含まれないレコードをヘッダに追加
				for (OperBomYldR yieldR : oldYieldL) {
					if (!newYieldL.contains(operKey, yieldR.getStringNE("OPER_INST_NO"))) {
						OperBomHdrR hdrR = mfgR.clone();
						setPrntHdrData(hdrR, yieldR);
						hdrL.add(hdrR);
					}
				}
			}
			return hdrL;
		}
		
		/**
		 * 工程指図のデータをヘッダデータに設定する。
		 * @param hdrR
		 * @param yieldR
		 */
		protected void setPrntHdrData(OperBomHdrR hdrR, OperBomYldR yieldR) {
			hdrR.oper_inst_no(yieldR.getStringNE("OPER_INST_NO"));
			hdrR.oper_cd(yieldR.getStringNE("OPER_CD"));
			hdrR.oper_nm(yieldR.getStringNE("OPER_NM"));
			hdrR.oper_seq(yieldR.getNumberNE("OPER_SEQ"));
			hdrR.disp_seq(yieldR.getNumberNE("DISP_SEQ"));
			hdrR.oper_inst_usr_cd(yieldR.getStringNE("OPER_INST_USR_CD"));
			hdrR.oper_inst_usr_nm(yieldR.getStringNE("OPER_INST_USR_NM"));
			hdrR.setStringNE("OPER_INST_RPT_RMRKS", yieldR.getStringNE("OPER_INST_RPT_RMRKS"));
		}
		
		/**
		 * 工程・ＢＯＭマスタ変更リスト用のデータを編集する。
		 * @param data
		 */
		protected void editPrntData(MSBCR_OperBom rs, MSBCR_OperBom rsRe,
				MfgRpt_Prnt03_DtlR upR, OperBomHdrR hdrR,
				MCList<OperBomYldR> yieldL, MCList<OperBomInptR> inptL, MCDate prntDt) {
			
			
			MCIndexKey yieldKey = yieldL.createIndex("OPER_INST_NO");
			MCList<OperBomYldR> tmpYieldL = yieldL.subList(yieldKey, hdrR.oper_inst_no());
			MCIndexKey inptKey = inptL.createIndex("OPER_INST_NO");
			MCList<OperBomInptR> tmpInptL = inptL.subList(inptKey, hdrR.oper_inst_no());
			
			hdrR.form_name(MSC_OPER_BOM_PRNT_STR.TITLE.name(getUsrLocale()));
			hdrR.prnt_tm(prntDt);
			
			hdrR.oper_inst_typ(chkChgOper(upR, tmpYieldL));
			
			chkChgInpt(upR, hdrR, tmpInptL);
			
			// 工程も投入予定も変更がない場合はエラーにする
			boolean chgFlg = false;
			for(OperBomInptR inptR : tmpInptL) {
				if(!isNull(inptR.d_oper_inst_typ())) {
					chgFlg = true;
					break;
				}
			}
			if(isNull(hdrR.oper_inst_typ()) && !chgFlg) {
				hdrR.setBooleanNE("err_flg", true);
				return;
			}
			
			//品目ＣＤを表示用に変換
			putPrntItmSub1(hdrR, OperBomHdrR.$prod_itm_sub1_view, OperBomHdrR.$prod_itm_sub1_data);
			putPrntItmSub2(hdrR, OperBomHdrR.$prod_itm_sub2_view, OperBomHdrR.$prod_itm_sub2_data);
			putPrntItmSub3(hdrR, OperBomHdrR.$prod_itm_sub3_view, OperBomHdrR.$prod_itm_sub3_data);

			rs.addRow(hdrR);
			rsRe.addRow(hdrR);
			
			// 出来高
			tmpYieldL.sort(SortType.ASC, OperBomYldR.$mfg_inst_rev_no, OperBomYldR.$st_schd_dt, OperBomYldR.$st_schd_hm, OperBomYldR.$end_schd_dt, OperBomYldR.$end_schd_hm);

			for(OperBomYldR yieldR : tmpYieldL) {
				// 工程単位数量への換算
				yieldR.oper_unit_inst_qty(convQtyBaseToOper(yieldR.getNumberNE("OPER_BASE_UNIT_QTY"),
						yieldR.getNumberNE("OPER_CONV_QTY"), yieldR.getNumberNE("OPER_STD_QTY"), yieldR.getNumberNE("OPER_UNIT_DEC_PLACE"),
						yieldR.getStringNE("OPER_UNIT_CONV_RND_TYP")));
			}

			// 整数部と小数部に分ける
			putNumStr(rs, tmpYieldL, OperBomYldR.$s_int_oper_unit_inst_qty, OperBomYldR.$s_dec_oper_unit_inst_qty,
					OperBomYldR.$oper_unit_inst_qty, "OPER_UNIT_DEC_PLACE");
			putNumStr(rs, tmpYieldL, OperBomYldR.$s_int_oper_lt_add_qty, OperBomYldR.$s_dec_oper_lt_add_qty,
					OperBomYldR.$oper_lt_add_qty, "OPER_UNIT_DEC_PLACE");
			putNumStr(rs, tmpYieldL, OperBomYldR.$s_int_oper_offst_add_qty, OperBomYldR.$s_dec_oper_offst_add_qty,
					OperBomYldR.$oper_offst_add_qty, "OPER_UNIT_DEC_PLACE");
			putNumStr(rs, tmpYieldL, OperBomYldR.$s_int_oper_std_qty, OperBomYldR.$s_dec_oper_std_qty,
					OperBomYldR.$oper_std_qty, "OPER_UNIT_DEC_PLACE");
			putNumStr(rs, tmpYieldL, OperBomYldR.$s_int_oper_conv_qty, OperBomYldR.$s_dec_oper_conv_qty,
					OperBomYldR.$oper_conv_qty, "OPER_UNIT_DEC_PLACE");
			
			if(!tmpYieldL.isEmpty()) {
				HdrOperBomYldR hdrYieldR = HdrOperBomYldR.create();
				hdrYieldR.print_oper("P");
				rs.addRow(hdrYieldR);
				rsRe.addRow(hdrYieldR);
			}
			
			for(OperBomYldR yieldR : tmpYieldL) {
				doCompTime(yieldR, false);
				MAC_OFFST_TYP.putNameNE(yieldR, OperBomYldR.$oper_offst_typ, OperBomYldR.$oper_offst_typ_nm, getUsrLocale());
				
				rs.addRow(yieldR);
				rsRe.addRow(yieldR);
			}
			
			// 投入予定
			tmpInptL.sort(SortType.ASC, OperBomInptR.$d_disp_seq, "INPT_SCHD_NO", "MFG_INST_REV_NO");

			//　整数部と小数部に分ける
			putNumStr(rs, tmpInptL, OperBomInptR.$s_int_base_unit_inpt_qty, OperBomInptR.$s_dec_base_unit_inpt_qty,
					OperBomInptR.$base_unit_inpt_qty, "BASE_UNIT_DEC_PLACE");
			putNumStr(rs, tmpInptL, OperBomInptR.$s_int_base_unit_rqmt_qty, OperBomInptR.$s_dec_base_unit_rqmt_qty,
					OperBomInptR.$base_unit_rqmt_qty, "BASE_UNIT_DEC_PLACE");
			putNumStr(rs, tmpInptL, OperBomInptR.$s_int_base_unit_fxd_rqmt_qty, OperBomInptR.$s_dec_base_unit_fxd_rqmt_qty,
					OperBomInptR.$base_unit_fxd_rqmt_qty, "BASE_UNIT_DEC_PLACE");
			putNumStr(rs, tmpInptL, OperBomInptR.$s_int_par_inst_qty, OperBomInptR.$s_dec_par_inst_qty,
					OperBomInptR.$par_inst_qty, "BASE_UNIT_DEC_PLACE");
			putNumStr(rs, tmpInptL, OperBomInptR.$s_int_chd_inpt_qty, OperBomInptR.$s_dec_chd_inpt_qty,
					OperBomInptR.$chd_inpt_qty, "BASE_UNIT_DEC_PLACE");
			putNumStr(rs, tmpInptL, OperBomInptR.$s_int_chd_rqmt_qty, OperBomInptR.$s_dec_chd_rqmt_qty,
					OperBomInptR.$chd_rqmt_qty, "BASE_UNIT_DEC_PLACE");
			putNumStr(rs, tmpInptL, OperBomInptR.$s_int_fxd_chd_rqmt_qty, OperBomInptR.$s_dec_fxd_chd_rqmt_qty,
					OperBomInptR.$fxd_chd_rqmt_qty, "BASE_UNIT_DEC_PLACE");

			if(!tmpInptL.isEmpty()) {
				HdrOperBomInptR hdrInptR = HdrOperBomInptR.create();
				hdrInptR.print_inpt("P");
				rs.addRow(hdrInptR);
				rsRe.addRow(hdrInptR);
			}

			for(OperBomInptR inptR : tmpInptL) {
				// 変更のない投入予定は表示対象外
				if(isNull(inptR.d_oper_inst_typ())) {
					continue;
				}
				
				doCompTime(inptR, false);
				// 品目の表示対応
				if(!isNull(inptR.getStringNE("ALT_GRP_CD")) && !isNull(inptR.getNumberNE("ALT_GRP_SEQ"))) {
					inptR.d_itm_cd(MSC_OPER_BOM_PRNT_STR.LEFT.name(getUsrLocale())
							.concat(inptR.getStringNE("ALT_GRP_CD")
									.concat(MSC_OPER_BOM_PRNT_STR.HYPHEN.name(getUsrLocale()))
									.concat(inptR.getNumberNE("ALT_GRP_SEQ")
											.toString())
									.concat(MSC_OPER_BOM_PRNT_STR.RIGHT
											.name(getUsrLocale()))
									.concat(inptR.d_itm_cd())));
				}
				if(MAC_INPT_CTL_TYP.isNO_MRP_INST(inptR.getStringNE("INPT_CTL_TYP"))) {
					inptR.d_itm_nm(MSC_MI_PRNT_STR.LEFT.name(getUsrLocale())
							.concat(MSC_OPER_BOM_PRNT_STR.REF_ITM.name(getUsrLocale()))
							.concat(MSC_MI_PRNT_STR.RIGHT.name(getUsrLocale()))
							.concat(inptR.d_itm_nm()));
				}
				
				//品目ＣＤを表示用に変換
				putPrntItmSub1(inptR, OperBomInptR.$d_itm_sub1_view, OperBomInptR.$d_itm_sub1_data);
				putPrntItmSub2(inptR, OperBomInptR.$d_itm_sub2_view, OperBomInptR.$d_itm_sub2_data);
				putPrntItmSub3(inptR, OperBomInptR.$d_itm_sub3_view, OperBomInptR.$d_itm_sub3_data);
				
				MAC_OFFST_TYP.putNameNE(inptR, OperBomInptR.$in_offst_typ, OperBomInptR.$in_offst_typ_nm, getUsrLocale());
				
				rs.addRow(inptR);
				rsRe.addRow(inptR);
			}
			
			// フッター
			OperBomFtrR ftrR = OperBomFtrR.create();
			ftrR.oper_inst_rpt_rmrks_lbl(MSC_OPER_BOM_PRNT_STR.OPER_INST_RMRKS.name(getUsrLocale()));
			ftrR.oper_inst_rpt_rmrks(hdrR.getStringNE("OPER_INST_RPT_RMRKS"));
			ftrR.mfg_inst_rpt_rmrks_lbl(MSC_OPER_BOM_PRNT_STR.MFG_INST_RMRKS.name(getUsrLocale()));
			ftrR.mfg_inst_rpt_rmrks(hdrR.getStringNE("MFG_INST_RPT_RMRKS"));
			
			rs.addRow(ftrR);
			
			rs.addNextPageRow();
			rsRe.addRow(ftrR);
			rsRe.addNextPageRow();
		}

		/**
		 * 工程が追加・更新・削除されたか判断し、区分を返す
		 * @param yieldL
		 * @return
		 */
		protected String chkChgOper(MfgRpt_Prnt03_DtlR upR, MCList<OperBomYldR> yieldL) {
			MCIndexKey idxKey = yieldL.createIndex(OperBomYldR.$mfg_inst_rev_no);
			MCList<OperBomYldR> newYieldL = yieldL.subList(idxKey, upR.mfg_inst_rev());
			MCList<OperBomYldR> oldYieldL = yieldL.subList(idxKey, upR.mfg_inst_rev().subtract(1));
			
			if(oldYieldL.isEmpty() && !newYieldL.isEmpty()) {
				return MSC_OPER_BOM_PRNT_STR.CRT.name(getUsrLocale());
			}
			if(!oldYieldL.isEmpty() && newYieldL.isEmpty()) {
				return MSC_OPER_BOM_PRNT_STR.DEL.name(getUsrLocale());
			}
			
			MCIndexKey oldKey = oldYieldL.createIndex("OPER_INST_NO");
			for(OperBomYldR newYieldR : newYieldL) {
				OperBomYldR oldYieldR = oldYieldL.getFirst(oldKey, newYieldR.getStringNE("OPER_INST_NO"));
				if(!isNull(oldYieldR)) {
					if(!isSame(oldYieldR.st_schd_dt(), newYieldR.st_schd_dt())
							|| !isSame(oldYieldR.st_schd_hm(), newYieldR.st_schd_hm())
							|| !isSame(oldYieldR.end_schd_dt(), newYieldR.end_schd_dt())
							|| !isSame(oldYieldR.end_schd_hm(), newYieldR.end_schd_hm())
							|| !isSame(oldYieldR.oper_unit_inst_qty(), newYieldR.oper_unit_inst_qty())
							|| !isSame(oldYieldR.oper_unit_cd(), newYieldR.oper_unit_cd())
							|| !isSame(oldYieldR.oper_disp_seq(), newYieldR.oper_disp_seq())
							|| !isSame(oldYieldR.oper_lt(), newYieldR.oper_lt())
							|| !isSame(oldYieldR.oper_lt_add_qty(), newYieldR.oper_lt_add_qty())
							|| !isSame(oldYieldR.oper_offst_typ(), newYieldR.oper_offst_typ())
							|| !isSame(oldYieldR.oper_offst(), newYieldR.oper_offst())
							|| !isSame(oldYieldR.oper_offst_add_qty(), newYieldR.oper_offst_add_qty())
							|| !isSame(oldYieldR.oper_std_qty(), newYieldR.oper_std_qty())
							|| !isSame(oldYieldR.oper_conv_qty(), newYieldR.oper_conv_qty())
					) {
						return MSC_OPER_BOM_PRNT_STR.UPD.name(getUsrLocale());
					}
				}
			}
			return null;
		}
		
		/**
		 * 投入予定が追加・更新・削除されたか判断し、区分を返す
		 * @param inptL
		 * @return
		 */
		protected void chkChgInpt(MfgRpt_Prnt03_DtlR upR, OperBomHdrR hdrR, MCList<OperBomInptR> inptL) {
			MCIndexKey idxKey = inptL.createIndex("MFG_INST_REV_NO", "OPER_INST_NO");
			MCList<OperBomInptR> newInptL = inptL.subList(idxKey, upR.mfg_inst_rev(), hdrR.oper_inst_no());
			MCList<OperBomInptR> oldInptL = inptL.subList(idxKey, upR.mfg_inst_rev().subtract(1), hdrR.oper_inst_no());
			
			MCIndexKey newInptKey = newInptL.createIndex("INPT_SCHD_NO");
			MCIndexKey oldInptKey = oldInptL.createIndex("INPT_SCHD_NO");
			
			for(OperBomInptR newInptR : newInptL) {
				OperBomInptR oldInptR = oldInptL.getFirst(oldInptKey, newInptR.getStringNE("INPT_SCHD_NO"));
				if(isNull(oldInptR)) {
					newInptR.d_oper_inst_typ(MSC_OPER_BOM_PRNT_STR.CRT.name(getUsrLocale()));
					continue;
				}
				if(!isSame(oldInptR.d_itm_cd(), newInptR.d_itm_cd())
						|| !isSame(oldInptR.d_itm_sub1_data(), newInptR.d_itm_sub1_data())
						|| !isSame(oldInptR.d_itm_sub2_data(), newInptR.d_itm_sub2_data())
						|| !isSame(oldInptR.d_itm_sub3_data(), newInptR.d_itm_sub3_data())
						|| !isSame(oldInptR.schd_dt(), newInptR.schd_dt())
						|| !isSame(oldInptR.schd_hm(), newInptR.schd_hm())
						|| !isSame(oldInptR.base_unit_inpt_qty(), newInptR.base_unit_inpt_qty())
						|| !isSame(oldInptR.base_unit_rqmt_qty(), newInptR.base_unit_rqmt_qty())
						|| !isSame(oldInptR.base_unit_fxd_rqmt_qty(), newInptR.base_unit_fxd_rqmt_qty())
						|| !isSame(oldInptR.par_inst_qty(), newInptR.par_inst_qty())
						|| !isSame(oldInptR.chd_inpt_qty(), newInptR.chd_inpt_qty())
						|| !isSame(oldInptR.chd_rqmt_qty(), newInptR.chd_rqmt_qty())
						|| !isSame(oldInptR.fxd_chd_rqmt_qty(), newInptR.fxd_chd_rqmt_qty())
						|| !isSame(oldInptR.in_offst_typ(), newInptR.in_offst_typ())
						|| !isSame(oldInptR.in_offst(), newInptR.in_offst())
				) {
					newInptR.d_oper_inst_typ(MSC_OPER_BOM_PRNT_STR.UPD_AF.name(getUsrLocale()));
					oldInptR.d_oper_inst_typ(MSC_OPER_BOM_PRNT_STR.UPD_BF.name(getUsrLocale()));
					// 変更前後で表示順が変わってしまうと帳票表示時に変更前と変更後がまとまらないため、変更後の表示順を変更前に設定しておく
					oldInptR.d_disp_seq(newInptR.d_disp_seq());
					continue;
				}
			}
			
			for(OperBomInptR oldInptR : oldInptL) {
				if(!isNull(oldInptR.d_oper_inst_typ())) {
					continue;
				}
				
				OperBomInptR newInptR = newInptL.getFirst(newInptKey, oldInptR.getStringNE("INPT_SCHD_NO"));
				if(isNull(newInptR)) {
					oldInptR.d_oper_inst_typ(MSC_OPER_BOM_PRNT_STR.DEL.name(getUsrLocale()));
					continue;
				}
			}
		}

		/**
		 * 印刷データを作成する。
		 */
		protected void crtReprintData(MSBCR_OperBom reportSet, OperBomHdrR hdrR) {
			reportSet.setAppTitle1(MCConst.repotlbl.getLabel("MS.MSBCR1030.label"));
			reportSet.setAppReportNo1(hdrR.mfg_inst_no());
			reportSet.setAppReportNo2(hdrR.new_mfg_inst_rev_no().toString());
			reportSet.setAppUsrCd1(hdrR.inst_dpt_cd());
			reportSet.setAppUsrNm1(hdrR.inst_dpt_nm());
			reportSet.setAppRmrks1(hdrR.getStringNE("MFG_INST_RPT_RMRKS"));
			reportSet.setAppReportSts1(MAC_RPT_STS_TYP.CRT.value());

			MCServerReportManager.request(reportSet, false);
		}
		
		/**
		 * 印刷実行
		 * @param rs
		 */
		protected void execPrnt(MSBCR_OperBom rs) {
			MCServerReportManager.request(rs);
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
	}

	//FMCB CUSTOM END
}