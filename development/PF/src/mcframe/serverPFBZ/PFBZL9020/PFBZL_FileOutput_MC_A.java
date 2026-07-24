package mcframe.serverPFBZ.PFBZL9020;

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
 * "PFBZL_FileOutput"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class PFBZL_FileOutput_MC_A extends mcframe.serverPFUD.PFUDL5000.PFUDL_LogicBase {
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
	public static final String LOGIC_ID = "PFBZL9020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected PFBZL_FileOutput.Send01 aSend01;

	protected void initSend01() {
		this.info = PDef.PF_PFBZL9020_Send01_INFO;
		this.aSend01 = ((PFBZL_FileOutput)this).new Send01();
	}

	public static PFBZL_FileOutput.Send01 crtSend01() {
		PFBZL_FileOutput lgc = new PFBZL_FileOutput();
		lgc.initSend01();
		return lgc.aSend01;
	}

	protected void paramSend01(MCParam p) {
		if (this.aSend01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSend01.up0());
	}

	protected void doSend01() {
		aSend01.call();
	};

	/**
	 * SendCndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFBZ.PFBZL9050.Srch01_CndR createSendCndR(){
		return mcframe.serverPFBZ.PFBZL9050.Srch01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Send01オペレーション.<p>
	 *
	 * 対象の業務ＩＦデータを検索する<br>
	 */
	abstract public class Send01 extends mcframe.serverPFUD.PFUDL5000.PFUDL_LogicBase.OperationBase {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Send01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverPFBZ.PFBZL9050.Srch01_CndR up0;
		
		
		// コンストラクタ
		protected Send01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverPFBZ.PFBZL9050.Srch01_CndR.create();

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
			invoke((PFBZL_FileOutput)PFBZL_FileOutput_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SendCndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZL9050.Srch01_CndR createSendCndR(){
			return mcframe.serverPFBZ.PFBZL9050.Srch01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>notyet_flg</td></tr>
		 * 	<tr><td><br></td><td>send_conv_err_flg</td></tr>
		 * 	<tr><td><br></td><td>send_conv_ok_flg</td></tr>
		 * 	<tr><td><br></td><td>send_err_flg</td></tr>
		 * 	<tr><td><br></td><td>send_ok_flg</td></tr>
		 * 	<tr><td><br></td><td>recv_err_flg</td></tr>
		 * 	<tr><td><br></td><td>recv_ok_flg</td></tr>
		 * 	<tr><td><br></td><td>recv_conv_err_flg</td></tr>
		 * 	<tr><td><br></td><td>recv_conv_ok_flg</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>data_no_fr</td></tr>
		 * 	<tr><td><br></td><td>data_no_to</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts_fr</td></tr>
		 * 	<tr><td><br></td><td>ins_ts_to</td></tr>
		 * 	<tr><td><br></td><td>sdrv_tm_fr</td></tr>
		 * 	<tr><td><br></td><td>sdrv_tm_to</td></tr>
		 * 	<tr><td><br></td><td>file_nm</td></tr>
		 * 	<tr><td><br></td><td>batch_log_no</td></tr>
		 * 	<tr><td><br></td><td>not_send_flg</td></tr>
		 * 	<tr><td><br></td><td>attr_char1</td></tr>
		 * 	<tr><td><br></td><td>attr_char2</td></tr>
		 * 	<tr><td><br></td><td>attr_char3</td></tr>
		 * 	<tr><td><br></td><td>attr_char4</td></tr>
		 * 	<tr><td><br></td><td>attr_char5</td></tr>
		 * 	<tr><td><br></td><td>attr_char6</td></tr>
		 * 	<tr><td><br></td><td>attr_char7</td></tr>
		 * 	<tr><td><br></td><td>attr_char8</td></tr>
		 * 	<tr><td><br></td><td>attr_char9</td></tr>
		 * 	<tr><td><br></td><td>attr_char10</td></tr>
		 * 	<tr><td><br></td><td>attr_char11</td></tr>
		 * 	<tr><td><br></td><td>attr_char12</td></tr>
		 * 	<tr><td><br></td><td>attr_char13</td></tr>
		 * 	<tr><td><br></td><td>attr_char14</td></tr>
		 * 	<tr><td><br></td><td>attr_char15</td></tr>
		 * 	<tr><td><br></td><td>attr_char16</td></tr>
		 * 	<tr><td><br></td><td>attr_char17</td></tr>
		 * 	<tr><td><br></td><td>attr_char18</td></tr>
		 * 	<tr><td><br></td><td>attr_char19</td></tr>
		 * 	<tr><td><br></td><td>attr_char20</td></tr>
		 * 	<tr><td><br></td><td>attr_char21</td></tr>
		 * 	<tr><td><br></td><td>attr_char22</td></tr>
		 * 	<tr><td><br></td><td>attr_char23</td></tr>
		 * 	<tr><td><br></td><td>attr_char24</td></tr>
		 * 	<tr><td><br></td><td>attr_char25</td></tr>
		 * 	<tr><td><br></td><td>attr_char26</td></tr>
		 * 	<tr><td><br></td><td>attr_char27</td></tr>
		 * 	<tr><td><br></td><td>attr_char28</td></tr>
		 * 	<tr><td><br></td><td>attr_char29</td></tr>
		 * 	<tr><td><br></td><td>attr_char30</td></tr>
		 * 	<tr><td><br></td><td>attr_num1</td></tr>
		 * 	<tr><td><br></td><td>attr_num2</td></tr>
		 * 	<tr><td><br></td><td>attr_num3</td></tr>
		 * 	<tr><td><br></td><td>attr_num4</td></tr>
		 * 	<tr><td><br></td><td>attr_num5</td></tr>
		 * 	<tr><td><br></td><td>attr_dt1_fr</td></tr>
		 * 	<tr><td><br></td><td>attr_dt1_to</td></tr>
		 * 	<tr><td><br></td><td>attr_dt2_fr</td></tr>
		 * 	<tr><td><br></td><td>attr_dt2_to</td></tr>
		 * 	<tr><td><br></td><td>attr_dt3_fr</td></tr>
		 * 	<tr><td><br></td><td>attr_dt3_to</td></tr>
		 * 	<tr><td><br></td><td>attr_dt4_fr</td></tr>
		 * 	<tr><td><br></td><td>attr_dt4_to</td></tr>
		 * 	<tr><td><br></td><td>attr_dt5_fr</td></tr>
		 * 	<tr><td><br></td><td>attr_dt5_to</td></tr>
		 * 	<tr><td><br></td><td>attr_tm1_fr</td></tr>
		 * 	<tr><td><br></td><td>attr_tm1_to</td></tr>
		 * 	<tr><td><br></td><td>attr_tm2_fr</td></tr>
		 * 	<tr><td><br></td><td>attr_tm2_to</td></tr>
		 * 	<tr><td><br></td><td>attr_tm3_fr</td></tr>
		 * 	<tr><td><br></td><td>attr_tm3_to</td></tr>
		 * 	<tr><td><br></td><td>attr_tm4_fr</td></tr>
		 * 	<tr><td><br></td><td>attr_tm4_to</td></tr>
		 * 	<tr><td><br></td><td>attr_tm5_fr</td></tr>
		 * 	<tr><td><br></td><td>attr_tm5_to</td></tr>
		 * 	<tr><td><br></td><td>batch_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverPFBZ.PFBZL9050.Srch01_CndR
		 */
		public mcframe.serverPFBZ.PFBZL9050.Srch01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBZL_FileOutput)PFBZL_FileOutput_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}