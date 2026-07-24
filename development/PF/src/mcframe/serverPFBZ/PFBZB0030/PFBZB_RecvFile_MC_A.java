package mcframe.serverPFBZ.PFBZB0030;

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
 * "PFBZB_RecvFile"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class PFBZB_RecvFile_MC_A extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase {
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
	public static final String SUBMODULE_ID = "PFBZ";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "PFBZB0030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected PFBZB_RecvFile.Recv01 aRecv01;

	protected void initRecv01() {
		this.info = PDef.PF_PFBZB0030_Recv01_INFO;
		this.aRecv01 = ((PFBZB_RecvFile)this).new Recv01();
	}

	public static PFBZB_RecvFile.Recv01 crtRecv01() {
		PFBZB_RecvFile lgc = new PFBZB_RecvFile();
		lgc.initRecv01();
		return lgc.aRecv01;
	}

	protected void paramRecv01(MCParam p) {
		if (this.aRecv01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRecv01.up0());
	}

	protected void doRecv01() {
		aRecv01.call();
	};

	/**
	 * CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFBZ.PFBZB0030.CndR createCndR(){
		return mcframe.serverPFBZ.PFBZB0030.CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Recv01オペレーション.<p>
	 *
	 * ＩＦファイルを受信する。<br>
	 */
	abstract public class Recv01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Recv01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverPFBZ.PFBZB0030.CndR up0;
		
		
		// コンストラクタ
		protected Recv01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverPFBZ.PFBZB0030.CndR.create();

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
			invoke((PFBZB_RecvFile)PFBZB_RecvFile_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZB0030.CndR createCndR(){
			return mcframe.serverPFBZ.PFBZB0030.CndR.create();
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
		 * </table>
		 *
		 * @see mcframe.serverPFBZ.PFBZB0030.CndR
		 */
		public mcframe.serverPFBZ.PFBZB0030.CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBZB_RecvFile)PFBZB_RecvFile_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}