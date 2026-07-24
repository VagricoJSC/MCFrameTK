package mcframe.serverMSLA.MSLAB1320;

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
 * "MSLAB_SCMActRecvIfLumpImp"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAB_SCMActRecvIfLumpImp_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSLA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSLAB1320";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAB_SCMActRecvIfLumpImp.SCMActRecvIfLumpImp_Upd01 aSCMActRecvIfLumpImp_Upd01;

	protected void initSCMActRecvIfLumpImp_Upd01() {
		this.info = PDef.MS_MSLAB1320_SCMActRecvIfLumpImp_Upd01_INFO;
		this.aSCMActRecvIfLumpImp_Upd01 = ((MSLAB_SCMActRecvIfLumpImp)this).new SCMActRecvIfLumpImp_Upd01();
	}

	public static MSLAB_SCMActRecvIfLumpImp.SCMActRecvIfLumpImp_Upd01 crtSCMActRecvIfLumpImp_Upd01() {
		MSLAB_SCMActRecvIfLumpImp lgc = new MSLAB_SCMActRecvIfLumpImp();
		lgc.initSCMActRecvIfLumpImp_Upd01();
		return lgc.aSCMActRecvIfLumpImp_Upd01;
	}

	protected void paramSCMActRecvIfLumpImp_Upd01(MCParam p) {
		if (this.aSCMActRecvIfLumpImp_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSCMActRecvIfLumpImp_Upd01.up0());
	}

	protected void doSCMActRecvIfLumpImp_Upd01() {
		aSCMActRecvIfLumpImp_Upd01.call();
	};

	/**
	 * SCMActRecvIfLumpImp_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAB1320.SCMActRecvIfLumpImp_Upd01_CndR createSCMActRecvIfLumpImp_Upd01_CndR(){
		return mcframe.serverMSLA.MSLAB1320.SCMActRecvIfLumpImp_Upd01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SCMActRecvIfLumpImp_Upd01オペレーション.<p>
	 *
	 * ＳＣＭ実績受信ＩＦ一括取込処理を実行する。<br>
	 */
	abstract public class SCMActRecvIfLumpImp_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SCMActRecvIfLumpImp_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAB1320.SCMActRecvIfLumpImp_Upd01_CndR up0;
		
		
		// コンストラクタ
		protected SCMActRecvIfLumpImp_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAB1320.SCMActRecvIfLumpImp_Upd01_CndR.create();

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
			invoke((MSLAB_SCMActRecvIfLumpImp)MSLAB_SCMActRecvIfLumpImp_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SCMActRecvIfLumpImp_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAB1320.SCMActRecvIfLumpImp_Upd01_CndR createSCMActRecvIfLumpImp_Upd01_CndR(){
			return mcframe.serverMSLA.MSLAB1320.SCMActRecvIfLumpImp_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>exe_unit_lump_flg</td></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd1</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd2</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd3</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd4</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd5</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd6</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd7</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd8</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd9</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAB1320.SCMActRecvIfLumpImp_Upd01_CndR
		 */
		public mcframe.serverMSLA.MSLAB1320.SCMActRecvIfLumpImp_Upd01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAB_SCMActRecvIfLumpImp)MSLAB_SCMActRecvIfLumpImp_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}