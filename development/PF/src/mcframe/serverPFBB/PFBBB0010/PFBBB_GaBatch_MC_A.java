package mcframe.serverPFBB.PFBBB0010;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "PFBBB_GaBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class PFBBB_GaBatch_MC_A extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "PF";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "PFBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "PFBBB0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected PFBBB_GaBatch.Recv_Upd01 aRecv_Upd01;

	protected void initRecv_Upd01() {
		this.info = PDef.PF_PFBBB0010_Recv_Upd01_INFO;
		this.aRecv_Upd01 = ((PFBBB_GaBatch)this).new Recv_Upd01();
	}

	public static PFBBB_GaBatch.Recv_Upd01 crtRecv_Upd01() {
		PFBBB_GaBatch lgc = new PFBBB_GaBatch();
		lgc.initRecv_Upd01();
		return lgc.aRecv_Upd01;
	}

	protected void paramRecv_Upd01(MCParam p) {
		if (this.aRecv_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRecv_Upd01.up0());
	}

	protected void doRecv_Upd01() {
		aRecv_Upd01.call();
	};

	/**
	 * GaBatch_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFBB.PFBBB0010.GaBatch_DtlR createGaBatch_DtlR(){
		return mcframe.serverPFBB.PFBBB0010.GaBatch_DtlR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Recv_Upd01オペレーション.<p>
	 *
	 * ＧＡのAPIを呼び出し、受信変換処理を実行する。<br>
	 */
	abstract public class Recv_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Recv_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverPFBB.PFBBB0010.GaBatch_DtlR up0;
		
		
		// コンストラクタ
		protected Recv_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverPFBB.PFBBB0010.GaBatch_DtlR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((PFBBB_GaBatch)PFBBB_GaBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * GaBatch_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBB.PFBBB0010.GaBatch_DtlR createGaBatch_DtlR(){
			return mcframe.serverPFBB.PFBBB0010.GaBatch_DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>tgt_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>tgt_dt_to</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>budgetcode</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverPFBB.PFBBB0010.GaBatch_DtlR
		 */
		public mcframe.serverPFBB.PFBBB0010.GaBatch_DtlR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBBB_GaBatch)PFBBB_GaBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}