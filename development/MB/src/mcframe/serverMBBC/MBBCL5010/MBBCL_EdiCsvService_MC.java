package mcframe.serverMBBC.MBBCL5010;

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
import mcframe.serverMBBC.MBBCL5010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.commonCore.sys.MCFactory;
import mcframe.commonCore.container.io.MCCsvWriter;
import mcframe.commonCore.container.io.MCContainerIOConfig;
import mcframe.serverCore.messagequeue.MCMQMessage;
import mcframe.serverCore.messagequeue.MCMessageQueue;
import mcframe.serverFXUC.FXUCL0170.*;
import static mcframe.serverCore.requester.MCRequestObject.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.Optional;
import org.apache.commons.io.FileUtils;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBCL_EdiCsvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBCL_EdiCsvService_MC extends MBBCL_EdiCsvService_MC_A{
	//FMCB CUSTOM START

	// キャッシュ
	protected static final Class<MBBCL_EdiCsvService> CLAZZ = MBBCL_EdiCsvService.class;

	/**
	 * EdiCsv_Chk01オペレーション.<p>
	 *
	 * ＥＤＩ用ＣＳＶファイル作成前チェック<br>
	 */
	public class EdiCsv_Chk01 extends MBBCL_EdiCsvService_MC_A.EdiCsv_Chk01 {
		@Override
		protected void call() {
			super.call();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<EdiCsv_Chk01_Dtl1R> notErrL = getChkList(up0());
			for (EdiCsv_Chk01_Dtl1R r : notErrL) {
				// 必須チェック
				for (int i = 2; i <= MAC_BIZ_TYP.key_num(r.biz_typ()).intValue(); i++) {
					msgL.addAll(check(r, "biz_key" + i, new FXUCL_RequiredValidater()));
				}
				MBT_ATTACHMENT_R attachR = getCacheAttach(r.biz_typ(), r.report_id(),
						r.biz_key1(), r.biz_key2(), r.biz_key3(), r.biz_key4(),
						r.biz_key5(), r.biz_key6(), r.biz_key7(), r.biz_key8(),
						r.biz_key9(), r.biz_key10());
				if (null == attachR) {
					msgL.add(new MCMessage(MBBCL0010, r.biz_typ(), r.report_id(),
							r.biz_key1(), r.biz_key2(), r.biz_key3(), r.biz_key4(),
							r.biz_key5(), r.biz_key6(), r.biz_key7(), r.biz_key8(),
							r.biz_key9(), r.biz_key10()));
				}
			}
			return msgL;
		}

		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}
	}
	/**
	 * EdiCsv_Prnt01オペレーション.<p>
	 *
	 * ＥＤＩ用ＣＳＶファイルを作成する<br>
	 */
	public class EdiCsv_Prnt01 extends MBBCL_EdiCsvService_MC_A.EdiCsv_Prnt01 {
		
		protected MCList<EdiCsv_Chk01_Dtl1R> _tgtUp0L = MCList.create(EdiCsv_Chk01_Dtl1R.class);

		@Override
		protected void call() {
			super.call();
		}

		protected void doIt() {
			if (!isStrgTgt()) {
				return;
			}
			cache();
			callThisChk01();
			_tgtUp0L = getChkList(_tgtUp0L);
			makeCsv();
		}
		
		protected boolean isStrgTgt() {
			MAM_STRG_TGT_REPORT_R t = MAM_STRG_TGT_REPORT_R.create("T");
			for (MCList<EdiCsv_Chk01_Dtl1R> l : up0().groupList(EdiCsv_Chk01_Dtl1R.$report_id)) {
				int i = execDbCount("MBBCL5010_MAM_STRG_TGT_REPORT_S01", t,
						t.report_id.eq(bind("report_id")).and(t.del_flg.eq(value(false))),
						l.get(0));
				if (i > 0) {
					_tgtUp0L.addAll(l);
				}
			}
			return !_tgtUp0L.isEmpty();
		}
		
		protected void callThisChk01() {
			MBBCL_EdiCsvService.EdiCsv_Chk01 ope = MBBCL_EdiCsvService.crtEdiCsv_Chk01();
			ope.up0().setAll(_tgtUp0L);
			ope.up1().setAll(up1());
			ope.exec();
		}

		protected void cache() {
			createAttachCache(up0());
		}

		protected void makeCsv() {
			File tmpDir = createTempDir();
			try {
				makeCsvMain(tmpDir);
			}
			finally {
				deleteTempDir(tmpDir);
			}
		}
		protected File createTempDir() {
			Path p;
			File f;
			try {
				p = Files.createTempDirectory("mcf_");
				f = p.toFile();
			}
			catch (IOException e) {
				throw new MCException(e);
			}
			return f;
		}
		protected void deleteTempDir(File tmpDir) {
			try {
				FileUtils.deleteDirectory(tmpDir);
			}
			catch (IOException e) {
				throw new MCException(e);
			}
		}
		
		protected void makeCsvMain(File tmpDir) {
			MCIndexKey idxkey = up1().createIndex(EdiCsv_Chk01_Dtl2R.$biz_typ,
					EdiCsv_Chk01_Dtl2R.$report_id, EdiCsv_Chk01_Dtl2R.$biz_key1,
					EdiCsv_Chk01_Dtl2R.$biz_key2, EdiCsv_Chk01_Dtl2R.$biz_key3,
					EdiCsv_Chk01_Dtl2R.$biz_key4, EdiCsv_Chk01_Dtl2R.$biz_key5,
					EdiCsv_Chk01_Dtl2R.$biz_key6, EdiCsv_Chk01_Dtl2R.$biz_key7,
					EdiCsv_Chk01_Dtl2R.$biz_key8, EdiCsv_Chk01_Dtl2R.$biz_key9,
					EdiCsv_Chk01_Dtl2R.$biz_key10);
			MCList<MBT_ATTACHMENT_R> attachL = MCList.create(MBT_ATTACHMENT_R.class);

			for (EdiCsv_Chk01_Dtl1R r : _tgtUp0L) {
				MBT_ATTACHMENT_R attachR = getCacheAttach(r.biz_typ(), r.report_id(),
						r.biz_key1(), r.biz_key2(), r.biz_key3(), r.biz_key4(),
						r.biz_key5(), r.biz_key6(), r.biz_key7(), r.biz_key8(),
						r.biz_key9(), r.biz_key10());
				if (null == attachR) {
					continue;
				}
				// IFデータ取得
				MCList<EdiCsv_Chk01_Dtl2R> bindL = up1().subList(idxkey, r.biz_typ(),
						r.report_id(), r.biz_key1(), r.biz_key2(), r.biz_key3(),
						r.biz_key4(), r.biz_key5(), r.biz_key6(), r.biz_key7(),
						r.biz_key8(), r.biz_key9(), r.biz_key10());
				MCDBContainer dbc = getDbc(MAC_BIZ_TYP.if_tbl(r.biz_typ()));
				if(null == dbc) {
					continue;
				}
				MCDBContainer dbcW = dbc.getPkWorkDbc("W");

				dbWkDelete(createSqlId(LOGIC_ID, dbcW, "D01"), dbc);
				dbWkInsert(createSqlId(LOGIC_ID, dbcW, "I01"), bindL, dbc);

				MCNumberPermColumn data_lno = (MCNumberPermColumn)dbc.getColumn$("data_lno");
				MCNumberPermColumn data_lnoW = (MCNumberPermColumn)dbcW.getColumn$("data_lno");
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(dbc);
				bldr.addInnerJoin(dbcW, data_lno.eq(data_lnoW));
				MCList<?> list = MCList.create(dbc);
				dbSelect(createSqlId(LOGIC_ID, dbc, "S01"), list, bldr);

				// ＣＳＶ作成
				File f = new File(tmpDir, attachR.file_nm());
				MCCsvWriter<?> writer = new MCCsvWriter<>(list, f.getAbsolutePath());
				MCContainerIOConfig conf = new MCContainerIOConfig();
				conf.setWriterNameOut(false);
				conf.setWriterEncode(MCContainerIOConfig.Encode.MS932);
				writer.write(conf);
				attachR.file_bin(MCBinary.valueOf(f));
				attachL.add(attachR);
			}

			if (attachL.isEmpty()) {
				return ;
			}

			try {
				String msgQId = request_consumer01();
				attachL.setStringNE("msg_queue_id", msgQId);
				updateAttachment(attachL);
			}
			catch (Exception e) {
				throw new MCException(e);
			}
		}

		protected String request_consumer01() throws Exception {
			MCMQMessage target = MCMQMessage.create("consumer01");
			Optional<String> messageQueueId = MCMessageQueue.request(target);
			return messageQueueId.get();
		}

		protected void updateAttachment(MCList<MBT_ATTACHMENT_R> bindL) {
			MBT_ATTACHMENT_R t = MBT_ATTACHMENT_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSet(t.msg_queue_id, t.file_bin);
			dbUpdateKey("MBBCL5010_MBT_ATTACHMENT_U01", bindL, bldr);
		}
	}

	protected MCDBContainer getDbc(String tableNm) {
		if (isNull(tableNm)) {
			return null;
		}
		Class<?> clazz = createDbcClass(tableNm);
		MCDBContainer dbc = (MCDBContainer) MCFactory.invokeStatic(clazz, "create",
				new Class[] {
						String.class
				}, new Object[] {
						"T"
				});
		return dbc;
	}

	/**
	 * キャッシュ（添付ファイル情報）
	 */
	protected MCList<MBT_ATTACHMENT_R> _cacheAttach;
	protected MCIndexKey _cacheAttachKey;
	protected void createAttachCache(MCList<EdiCsv_Chk01_Dtl1R> upL) {
		MCList<EdiCsv_Chk01_Dtl1R> bindL = upL.groupBy(EdiCsv_Chk01_Dtl1R.$biz_typ, EdiCsv_Chk01_Dtl1R.$report_id,
				EdiCsv_Chk01_Dtl1R.$biz_key1,
				EdiCsv_Chk01_Dtl1R.$biz_key2,
				EdiCsv_Chk01_Dtl1R.$biz_key3,
				EdiCsv_Chk01_Dtl1R.$biz_key4,
				EdiCsv_Chk01_Dtl1R.$biz_key5,
				EdiCsv_Chk01_Dtl1R.$biz_key6,
				EdiCsv_Chk01_Dtl1R.$biz_key7,
				EdiCsv_Chk01_Dtl1R.$biz_key8,
				EdiCsv_Chk01_Dtl1R.$biz_key9,
				EdiCsv_Chk01_Dtl1R.$biz_key10);
		MCList<MBT_ATTACHMENT_R> rsltL = MCList.create(MBT_ATTACHMENT_R.class);
		MBT_ATTACHMENT_R t = MBT_ATTACHMENT_R.create("T");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
		bldr.setSelect(t.data_no, t.edition, t.biz_typ, t.report_id, t.biz_key1, t.biz_key2, t.biz_key3,
				t.biz_key4, t.biz_key5, t.biz_key6, t.biz_key7, t.biz_key8, t.biz_key9,
				t.biz_key10, t.file_nm);
		bldr.setWhere(
				t.data_crud_typ.neq(value(MAC_DATA_CRUD_TYP.DEL.value()))
						.and(t.biz_typ.eq(bind("biz_typ")))
						.and(t.report_id.eq(bind("report_id")))
						.and(t.biz_key1.eq(bind("biz_key1")))
						.cutoff$and(t.biz_key2.eq(bind("biz_key2")))
						.cutoff$and(t.biz_key3.eq(bind("biz_key3")))
						.cutoff$and(t.biz_key4.eq(bind("biz_key4")))
						.cutoff$and(t.biz_key5.eq(bind("biz_key5")))
						.cutoff$and(t.biz_key6.eq(bind("biz_key6")))
						.cutoff$and(t.biz_key7.eq(bind("biz_key7")))
						.cutoff$and(t.biz_key8.eq(bind("biz_key8")))
						.cutoff$and(t.biz_key9.eq(bind("biz_key9")))
						.cutoff$and(t.biz_key10.eq(bind("biz_key10"))));
		dbSelect("MBBCL5010_MBT_ATTACHMENT_S01", rsltL, bldr, bindL);

		// インデックス作成
		object(CLAZZ)._cacheAttach = rsltL;
		object(CLAZZ)._cacheAttachKey = 
				object(CLAZZ)._cacheAttach.createIndex(EdiCsv_Chk01_Dtl1R.$biz_typ, EdiCsv_Chk01_Dtl1R.$report_id,
						EdiCsv_Chk01_Dtl1R.$biz_key1,
						EdiCsv_Chk01_Dtl1R.$biz_key2,
						EdiCsv_Chk01_Dtl1R.$biz_key3,
						EdiCsv_Chk01_Dtl1R.$biz_key4,
						EdiCsv_Chk01_Dtl1R.$biz_key5,
						EdiCsv_Chk01_Dtl1R.$biz_key6,
						EdiCsv_Chk01_Dtl1R.$biz_key7,
						EdiCsv_Chk01_Dtl1R.$biz_key8,
						EdiCsv_Chk01_Dtl1R.$biz_key9,
						EdiCsv_Chk01_Dtl1R.$biz_key10);
	}

	protected MBT_ATTACHMENT_R getCacheAttach(String bizTyp, String rptId,
			String bizKey1, String bizKey2, String bizKey3, String bizKey4,
			String bizKey5, String bizKey6, String bizKey7, String bizKey8,
			String bizKey9, String bizKey10) {
		return object(CLAZZ)._cacheAttach.getFirst(object(CLAZZ)._cacheAttachKey, bizTyp, rptId, bizKey1, bizKey2,
				bizKey3, bizKey4, bizKey5, bizKey6, bizKey7, bizKey8, bizKey9,
				bizKey10);
	}

	//FMCB CUSTOM END
}