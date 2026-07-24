package mcframe.serverMBBB.MBBBB0010;

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
 * "MBBBB_AcMstBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBBB_AcMstBatch_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MB";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MBBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MBBBB0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBBB_AcMstBatch.AcMst_Upd01 aAcMst_Upd01;

	protected void initAcMst_Upd01() {
		this.info = PDef.MB_MBBBB0010_AcMst_Upd01_INFO;
		this.aAcMst_Upd01 = ((MBBBB_AcMstBatch)this).new AcMst_Upd01();
	}

	public static MBBBB_AcMstBatch.AcMst_Upd01 crtAcMst_Upd01() {
		MBBBB_AcMstBatch lgc = new MBBBB_AcMstBatch();
		lgc.initAcMst_Upd01();
		return lgc.aAcMst_Upd01;
	}

	protected void paramAcMst_Upd01(MCParam p) {
		if (this.aAcMst_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAcMst_Upd01.up0());
	}

	protected void doAcMst_Upd01() {
		aAcMst_Upd01.call();
	};

	/**
	 * AcMst_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBB0010.AcMst_Upd01_CndR createAcMst_Upd01_CndR(){
		return mcframe.serverMBBB.MBBBB0010.AcMst_Upd01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * AcMst_Upd01オペレーション.<p>
	 *
	 * 会計マスタを取り込む。<br>
	 */
	abstract public class AcMst_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AcMst_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBB0010.AcMst_Upd01_CndR up0;
		
		
		// コンストラクタ
		protected AcMst_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBB.MBBBB0010.AcMst_Upd01_CndR.create();

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
			invoke((MBBBB_AcMstBatch)MBBBB_AcMstBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * AcMst_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBB0010.AcMst_Upd01_CndR createAcMst_Upd01_CndR(){
			return mcframe.serverMBBB.MBBBB0010.AcMst_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_imp_typ</td></tr>
		 * 	<tr><td><br></td><td>account_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_account_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>bac_ac_flg</td></tr>
		 * 	<tr><td><br></td><td>bank_flg</td></tr>
		 * 	<tr><td><br></td><td>bank_branch_flg</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_flg</td></tr>
		 * 	<tr><td><br></td><td>cur_xrate_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_tax_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBB0010.AcMst_Upd01_CndR
		 */
		public mcframe.serverMBBB.MBBBB0010.AcMst_Upd01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBB_AcMstBatch)MBBBB_AcMstBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}