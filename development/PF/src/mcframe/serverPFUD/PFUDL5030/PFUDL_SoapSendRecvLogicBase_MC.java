package mcframe.serverPFUD.PFUDL5030;

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
import static mcframe.commonPF.notice.PF_Msg.*;

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
import static mcframe.serverPF.dbc.PFFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverPF.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFUD.PFUDL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFBZ.PFBZL9010.PFBZL_CodeConvert;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;
import java.util.*;
import mcframe.serverCore.resource.MCConst;
//FMCB CUSTOM_IMPORT END

/**
 * "PFUDL_SoapSendRecvLogicBase"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFUDL_SoapSendRecvLogicBase_MC extends PFUDL_SoapSendRecvLogicBase_MC_A{
	//FMCB CUSTOM START

	/**
	 * ConvBase01オペレーション.<p>
	 *
	 */
	public class ConvBase01  extends PFUDL_SoapSendRecvLogicBase_MC_A.ConvBase01 {

		private PFBZL_CodeConvert.IfDBContainer<? extends MCDBContainer> _ifDBC = null;
		protected ArrayIfList _arrifList;

		protected void setIfDbc(PFBZL_CodeConvert.IfDBContainer<? extends MCDBContainer> ifDbc) {
			_ifDBC = ifDbc;
		}

		protected PFBZL_CodeConvert.IfDBContainer<? extends MCDBContainer> getIfDbc() {
			return _ifDBC;
		}
		
		@Override
		protected void call() {
			SdrvDtlR sdrvIfR = up0().get(0);
		
			setIfDBC();
		
			if (_ifDBC == null || up0().isEmpty()) return;
			
			MCList<SdrvDtlR>[] up0GprLAry = up0().groupList(convSendIfLKey(up0()));
			
			int cnt = 0;
			
			for (MCList<SdrvDtlR> up0GprL : up0GprLAry) {
				boolean isErr = false;
				try {
					insSdrvIfWk(up0GprL);
					post(sdrvIfR, up0GprL);
					setDown0(up0GprL, isErr);
					
					cnt ++;
				}
				catch (Exception e) {
					isErr = true;
					while (cnt <  up0GprLAry.length) {
						MCList<SdrvDtlR> errIfL = up0().groupList(convSendIfLKey(up0()))[cnt];
						setDown0(errIfL, isErr);
						cnt ++;
					}
					throw e;
				}
			}
		}

		protected void setIfDBC() {
			// サブクラスで実装
		}


		protected void post(SdrvDtlR sdrvIfR, MCList<SdrvDtlR> targetUp0L) {
			setIfDBCSql();

			MCList<?> ifL = srchDBC();

			if (!ifL.isEmpty()) {
				bfrSendRequest(ifL, targetUp0L);
				sendRequest(sdrvIfR, ifL);
				aftrSendRequest(ifL, targetUp0L);
			}
		}
		
		protected void setIfDBCSql() {
			_ifDBC.checkIfL();
			_ifDBC.initSelect();
			_ifDBC.addSelectIfCtrlColumns();
			_ifDBC.addWhereIfWrite();
			_ifDBC.setOrderBy();
		}

		protected MCList<?> srchDBC() {
			MCList<?> ifL = _ifDBC.getIfL();
			MCQueryApiBuilder builder = _ifDBC.getBuilder();
			dbSelect(createSqlId(LOGIC_ID, builder.getBaseDbc(), "S01"), ifL, builder);
			return ifL;
		}
	
		protected void bfrSendRequest(MCList<?> ifL, MCList<SdrvDtlR> targetUp0L) {
			setLogKey(ifL);
		}

		protected void aftrSendRequest(MCList<?> ifL, MCList<SdrvDtlR> targetUp0L) {
			writeBatchLog(up0());
		}
		
		protected void sendRequest(SdrvDtlR sdrvIfR, MCList<?> ifL) {
			_arrifList = createArrayIfList(ifL);
			for (MCList<?> lst : _arrifList) {
				doSoap(sdrvIfR, lst);
			}
		}


		protected void setDown0(MCList<SdrvDtlR> up0L, boolean isErr) {
			if (isErr) {
				up0L.setString(PFT_SDRV_IF_R.$sdrv_sts_typ, MAC_SDRV_STS_TYP.SEND_ERR.value());
			}
			else {
				up0L.setString(PFT_SDRV_IF_R.$sdrv_sts_typ, MAC_SDRV_STS_TYP.SEND_OK.value());
			}
			down0().addAll(up0L);
		}
		
	
		protected String[] convSendIfLKey(MCList<SdrvDtlR> up) {
			SdrvDtlR dtlR = up.get(0);
			ifPrtclMgr().set(dtlR);
			
			List<String> kl = new ArrayList<>();
			kl.add(PFT_SDRV_IF_R.$if_proc_typ);
			kl.add(PFT_SDRV_IF_R.$ext_sys_cd);
			boolean useDataNo = isSame(mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys._send_file_grp_2, ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SEND_FILE_GRP, dtlR.getStringNE("if_proc_typ")));
			if (useDataNo) {
				kl.add(PFT_SDRV_IF_R.$data_no);
			}
			return kl.toArray(new String[kl.size()]);
		}
		
		protected void insSdrvIfWk(MCList<SdrvDtlR> up0L) {
			mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.UpdWk01 ope = mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.crtUpdWk01();
			UpdWk01_DtlR_SdrvDtlR<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, SdrvDtlR> mapper = createUpdWk01_DtlR_SdrvDtlR();
			for (SdrvDtlR up0R : up0L) {
				mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR row = ope.up0().createRow();
				copy(row, up0R, mapper);
				ope.up0().add(row);
			}
			ope.exec();
		}
	
		protected UpdWk01_DtlR_SdrvDtlR<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, SdrvDtlR> createUpdWk01_DtlR_SdrvDtlR() {
			return new UpdWk01_DtlR_SdrvDtlR<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, SdrvDtlR>();
		}
	
		public class UpdWk01_DtlR_SdrvDtlR<D extends mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, S extends SdrvDtlR> extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.ext_sys_cd(src.ext_sys_cd());
				dest.if_proc_typ(src.if_proc_typ());
				dest.data_no(src.data_no());
			}
		}
		
		protected void setLogKey(MCList<?> ifL) {
			saveMessagePool();
			MCMessagePool.clear();
			
			getBatchLogger().setLogKey(
				ifL,
				MBT_JOURNAL_SND_IF_R.$batch_log_no,
				MBT_JOURNAL_SND_IF_R.$log_sub_key1,
				MBT_JOURNAL_SND_IF_R.$log_sub_key2
			);
		}
		
		protected void writeBatchLog(MCList<SdrvDtlR> up0L) {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(MCMessagePool.getMessageList());
			rollbackMessagePool();
			
			if (msgL.size() > 0) {
				getBatchLogger().writeDataLog(msgL);
				
				// SAPでエラーがあったことを通知するためのメッセージ
				MCList<MCRow> lst = MCList.create(MCRow.class);
				for (MCMessage msg : msgL) {
					lst.add(msg.getCauseRow());
				}
				
				String key = "data_no";
				MCIndexKey idx = up0L.createIndex(key);
				lst.distinctNE(key).forEach(r -> {
					SdrvDtlR up0R = up0L.getFirst(idx, r.toArray(idx.getKeys()));
					MCMessagePool.add(
						up0R, null,
						MAC_SDRV_STS_TYP.isSEND_ERR(up0R.sdrv_sts_typ()) ? PFBAL0002 : PFBAL0003,
						r.getNumberNE(key)
					);
				});
			}
		}
	}
	
	protected ArrayIfList createArrayIfList(MCList<?> ifL) {
		return new ArrayIfList(ifL);
	}
	
	public class ArrayIfList implements Iterable<MCList<?>> {
		protected ArrayList<MCList<?>> _arr;
		protected int cursor = -1;
		
		public ArrayIfList(MCList<?> ifL) {
			_arr = new java.util.ArrayList<>();
			int limit = getSendLimitSize();
			
			String grpKey = "_grp_no_";
			int grpNo=0, grpSize=0;
			for (MCList<?> grp : ifL.groupList(getSendGroupKey())) {
				grp.setNumberNE(grpKey, grpNo);
				grpSize++;
				
				if (limit > 0 && grpSize >= limit) {
					grpNo++;
					grpSize = 0;
				}
			}
			
			for (MCList<?> grp : ifL.groupList(grpKey)) {
				grp.sort(getSendGroupSortKey());
				_arr.add(grp);
			}
		}
		
		@Override
		public Iterator<MCList<?>> iterator() {
			return new Iterator<MCList<?>>() {
				@Override
				public boolean hasNext() {
					return cursor < _arr.size() - 1;
				}
				@Override
				public MCList<?> next() {
					return _arr.get(++cursor);
				}
			};
		}
		
		public MCList<?> now() {
			return _arr.get(cursor);
		}
		
		/**
		 * 送信グループのキー
		 * 
		 * @return
		 */
		protected String[] getSendGroupKey() {
			// サブクラスで実装
			return null;
		}
		
		/**
		 * 送信グループ内でのソートキー
		 * 
		 * @return
		 */
		protected String[] getSendGroupSortKey() {
			// サブクラスで実装
			return null;
		}
		
		/**
		 * １リクエストに含める送信グループの数
		 * 
		 * @return
		 */
		protected int getSendLimitSize() {
			// サブクラスで実装
			return -1;
		}
	}

	//FMCB CUSTOM END
}