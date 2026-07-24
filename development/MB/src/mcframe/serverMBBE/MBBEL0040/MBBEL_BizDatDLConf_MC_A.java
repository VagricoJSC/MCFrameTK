package mcframe.serverMBBE.MBBEL0040;

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
 * "MBBEL_BizDatDLConf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBEL_BizDatDLConf_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MBBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MBBEL0040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBEL_BizDatDLConf.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MB_MBBEL0040_Prnt01_INFO;
		this.aPrnt01 = ((MBBEL_BizDatDLConf)this).new Prnt01();
	}

	public static MBBEL_BizDatDLConf.Prnt01 crtPrnt01() {
		MBBEL_BizDatDLConf lgc = new MBBEL_BizDatDLConf();
		lgc.initPrnt01();
		return lgc.aPrnt01;
	}

	protected void paramPrnt01(MCParam p) {
		if (this.aPrnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrnt01.up0());
		p.addDownBlock(aPrnt01.down0());
		p.addDownBlock(aPrnt01.down1());
		p.addDownBlock(aPrnt01.down2());
	}

	protected void doPrnt01() {
		aPrnt01.call();
	};

	/**
	 * Prnt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0040.Prnt01_CndR createPrnt01_CndR(){
		return mcframe.serverMBBE.MBBEL0040.Prnt01_CndR.create();
	}

	/**
	 * Prnt01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0040.Prnt01_RsltR createPrnt01_RsltR(){
		return mcframe.serverMBBE.MBBEL0040.Prnt01_RsltR.create();
	}

	/**
	 * Prnt01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL0040.Prnt01_RsltR> createPrnt01_RsltL(){
		return MCList.create(mcframe.serverMBBE.MBBEL0040.Prnt01_RsltR.class);
	}

	/**
	 * Prnt01_RsltLblブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0040.Prnt01_RsltLblR createPrnt01_RsltLblR(){
		return mcframe.serverMBBE.MBBEL0040.Prnt01_RsltLblR.create();
	}

	/**
	 * Prnt01_RsltSmlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0040.Prnt01_RsltSmlR createPrnt01_RsltSmlR(){
		return mcframe.serverMBBE.MBBEL0040.Prnt01_RsltSmlR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 業務データダウンロードを実行する<br>
	 */
	abstract public class Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL0040.Prnt01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL0040.Prnt01_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL0040.Prnt01_RsltLblR down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL0040.Prnt01_RsltSmlR down2;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBE.MBBEL0040.Prnt01_CndR.create();
			down0 = MCList.create(mcframe.serverMBBE.MBBEL0040.Prnt01_RsltR.class);
			down1 = mcframe.serverMBBE.MBBEL0040.Prnt01_RsltLblR.create();
			down2 = mcframe.serverMBBE.MBBEL0040.Prnt01_RsltSmlR.create();

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
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MBBEL_BizDatDLConf)MBBEL_BizDatDLConf_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Prnt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0040.Prnt01_CndR createPrnt01_CndR(){
			return mcframe.serverMBBE.MBBEL0040.Prnt01_CndR.create();
		}

		/**
		 * Prnt01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0040.Prnt01_RsltR createPrnt01_RsltR(){
			return mcframe.serverMBBE.MBBEL0040.Prnt01_RsltR.create();
		}

		/**
		 * Prnt01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL0040.Prnt01_RsltR> createPrnt01_RsltL(){
			return MCList.create(mcframe.serverMBBE.MBBEL0040.Prnt01_RsltR.class);
		}

		/**
		 * Prnt01_RsltLblブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0040.Prnt01_RsltLblR createPrnt01_RsltLblR(){
			return mcframe.serverMBBE.MBBEL0040.Prnt01_RsltLblR.create();
		}

		/**
		 * Prnt01_RsltSmlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0040.Prnt01_RsltSmlR createPrnt01_RsltSmlR(){
			return mcframe.serverMBBE.MBBEL0040.Prnt01_RsltSmlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>biz_dat_id</td></tr>
		 * 	<tr><td><br></td><td>sql_src</td></tr>
		 * 	<tr><td><br></td><td>bind</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_file_typ</td></tr>
		 * 	<tr><td><br></td><td>form_file_nm</td></tr>
		 * 	<tr><td><br></td><td>cartridge</td></tr>
		 * 	<tr><td><br></td><td>dwnld_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL0040.Prnt01_CndR
		 */
		public mcframe.serverMBBE.MBBEL0040.Prnt01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>disp_str001</td></tr>
		 * 	<tr><td><br></td><td>disp_str002</td></tr>
		 * 	<tr><td><br></td><td>disp_str003</td></tr>
		 * 	<tr><td><br></td><td>disp_str004</td></tr>
		 * 	<tr><td><br></td><td>disp_str005</td></tr>
		 * 	<tr><td><br></td><td>disp_str006</td></tr>
		 * 	<tr><td><br></td><td>disp_str007</td></tr>
		 * 	<tr><td><br></td><td>disp_str008</td></tr>
		 * 	<tr><td><br></td><td>disp_str009</td></tr>
		 * 	<tr><td><br></td><td>disp_str010</td></tr>
		 * 	<tr><td><br></td><td>disp_str011</td></tr>
		 * 	<tr><td><br></td><td>disp_str012</td></tr>
		 * 	<tr><td><br></td><td>disp_str013</td></tr>
		 * 	<tr><td><br></td><td>disp_str014</td></tr>
		 * 	<tr><td><br></td><td>disp_str015</td></tr>
		 * 	<tr><td><br></td><td>disp_str016</td></tr>
		 * 	<tr><td><br></td><td>disp_str017</td></tr>
		 * 	<tr><td><br></td><td>disp_str018</td></tr>
		 * 	<tr><td><br></td><td>disp_str019</td></tr>
		 * 	<tr><td><br></td><td>disp_str020</td></tr>
		 * 	<tr><td><br></td><td>disp_str021</td></tr>
		 * 	<tr><td><br></td><td>disp_str022</td></tr>
		 * 	<tr><td><br></td><td>disp_str023</td></tr>
		 * 	<tr><td><br></td><td>disp_str024</td></tr>
		 * 	<tr><td><br></td><td>disp_str025</td></tr>
		 * 	<tr><td><br></td><td>disp_str026</td></tr>
		 * 	<tr><td><br></td><td>disp_str027</td></tr>
		 * 	<tr><td><br></td><td>disp_str028</td></tr>
		 * 	<tr><td><br></td><td>disp_str029</td></tr>
		 * 	<tr><td><br></td><td>disp_str030</td></tr>
		 * 	<tr><td><br></td><td>disp_str031</td></tr>
		 * 	<tr><td><br></td><td>disp_str032</td></tr>
		 * 	<tr><td><br></td><td>disp_str033</td></tr>
		 * 	<tr><td><br></td><td>disp_str034</td></tr>
		 * 	<tr><td><br></td><td>disp_str035</td></tr>
		 * 	<tr><td><br></td><td>disp_str036</td></tr>
		 * 	<tr><td><br></td><td>disp_str037</td></tr>
		 * 	<tr><td><br></td><td>disp_str038</td></tr>
		 * 	<tr><td><br></td><td>disp_str039</td></tr>
		 * 	<tr><td><br></td><td>disp_str040</td></tr>
		 * 	<tr><td><br></td><td>disp_str041</td></tr>
		 * 	<tr><td><br></td><td>disp_str042</td></tr>
		 * 	<tr><td><br></td><td>disp_str043</td></tr>
		 * 	<tr><td><br></td><td>disp_str044</td></tr>
		 * 	<tr><td><br></td><td>disp_str045</td></tr>
		 * 	<tr><td><br></td><td>disp_str046</td></tr>
		 * 	<tr><td><br></td><td>disp_str047</td></tr>
		 * 	<tr><td><br></td><td>disp_str048</td></tr>
		 * 	<tr><td><br></td><td>disp_str049</td></tr>
		 * 	<tr><td><br></td><td>disp_str050</td></tr>
		 * 	<tr><td><br></td><td>disp_str051</td></tr>
		 * 	<tr><td><br></td><td>disp_str052</td></tr>
		 * 	<tr><td><br></td><td>disp_str053</td></tr>
		 * 	<tr><td><br></td><td>disp_str054</td></tr>
		 * 	<tr><td><br></td><td>disp_str055</td></tr>
		 * 	<tr><td><br></td><td>disp_str056</td></tr>
		 * 	<tr><td><br></td><td>disp_str057</td></tr>
		 * 	<tr><td><br></td><td>disp_str058</td></tr>
		 * 	<tr><td><br></td><td>disp_str059</td></tr>
		 * 	<tr><td><br></td><td>disp_str060</td></tr>
		 * 	<tr><td><br></td><td>disp_str061</td></tr>
		 * 	<tr><td><br></td><td>disp_str062</td></tr>
		 * 	<tr><td><br></td><td>disp_str063</td></tr>
		 * 	<tr><td><br></td><td>disp_str064</td></tr>
		 * 	<tr><td><br></td><td>disp_str065</td></tr>
		 * 	<tr><td><br></td><td>disp_str066</td></tr>
		 * 	<tr><td><br></td><td>disp_str067</td></tr>
		 * 	<tr><td><br></td><td>disp_str068</td></tr>
		 * 	<tr><td><br></td><td>disp_str069</td></tr>
		 * 	<tr><td><br></td><td>disp_str070</td></tr>
		 * 	<tr><td><br></td><td>disp_str071</td></tr>
		 * 	<tr><td><br></td><td>disp_str072</td></tr>
		 * 	<tr><td><br></td><td>disp_str073</td></tr>
		 * 	<tr><td><br></td><td>disp_str074</td></tr>
		 * 	<tr><td><br></td><td>disp_str075</td></tr>
		 * 	<tr><td><br></td><td>disp_str076</td></tr>
		 * 	<tr><td><br></td><td>disp_str077</td></tr>
		 * 	<tr><td><br></td><td>disp_str078</td></tr>
		 * 	<tr><td><br></td><td>disp_str079</td></tr>
		 * 	<tr><td><br></td><td>disp_str080</td></tr>
		 * 	<tr><td><br></td><td>disp_str081</td></tr>
		 * 	<tr><td><br></td><td>disp_str082</td></tr>
		 * 	<tr><td><br></td><td>disp_str083</td></tr>
		 * 	<tr><td><br></td><td>disp_str084</td></tr>
		 * 	<tr><td><br></td><td>disp_str085</td></tr>
		 * 	<tr><td><br></td><td>disp_str086</td></tr>
		 * 	<tr><td><br></td><td>disp_str087</td></tr>
		 * 	<tr><td><br></td><td>disp_str088</td></tr>
		 * 	<tr><td><br></td><td>disp_str089</td></tr>
		 * 	<tr><td><br></td><td>disp_str090</td></tr>
		 * 	<tr><td><br></td><td>disp_str091</td></tr>
		 * 	<tr><td><br></td><td>disp_str092</td></tr>
		 * 	<tr><td><br></td><td>disp_str093</td></tr>
		 * 	<tr><td><br></td><td>disp_str094</td></tr>
		 * 	<tr><td><br></td><td>disp_str095</td></tr>
		 * 	<tr><td><br></td><td>disp_str096</td></tr>
		 * 	<tr><td><br></td><td>disp_str097</td></tr>
		 * 	<tr><td><br></td><td>disp_str098</td></tr>
		 * 	<tr><td><br></td><td>disp_str099</td></tr>
		 * 	<tr><td><br></td><td>disp_str100</td></tr>
		 * 	<tr><td><br></td><td>disp_str101</td></tr>
		 * 	<tr><td><br></td><td>disp_str102</td></tr>
		 * 	<tr><td><br></td><td>disp_str103</td></tr>
		 * 	<tr><td><br></td><td>disp_str104</td></tr>
		 * 	<tr><td><br></td><td>disp_str105</td></tr>
		 * 	<tr><td><br></td><td>disp_str106</td></tr>
		 * 	<tr><td><br></td><td>disp_str107</td></tr>
		 * 	<tr><td><br></td><td>disp_str108</td></tr>
		 * 	<tr><td><br></td><td>disp_str109</td></tr>
		 * 	<tr><td><br></td><td>disp_str110</td></tr>
		 * 	<tr><td><br></td><td>disp_str111</td></tr>
		 * 	<tr><td><br></td><td>disp_str112</td></tr>
		 * 	<tr><td><br></td><td>disp_str113</td></tr>
		 * 	<tr><td><br></td><td>disp_str114</td></tr>
		 * 	<tr><td><br></td><td>disp_str115</td></tr>
		 * 	<tr><td><br></td><td>disp_str116</td></tr>
		 * 	<tr><td><br></td><td>disp_str117</td></tr>
		 * 	<tr><td><br></td><td>disp_str118</td></tr>
		 * 	<tr><td><br></td><td>disp_str119</td></tr>
		 * 	<tr><td><br></td><td>disp_str120</td></tr>
		 * 	<tr><td><br></td><td>disp_str121</td></tr>
		 * 	<tr><td><br></td><td>disp_str122</td></tr>
		 * 	<tr><td><br></td><td>disp_str123</td></tr>
		 * 	<tr><td><br></td><td>disp_str124</td></tr>
		 * 	<tr><td><br></td><td>disp_str125</td></tr>
		 * 	<tr><td><br></td><td>disp_str126</td></tr>
		 * 	<tr><td><br></td><td>disp_str127</td></tr>
		 * 	<tr><td><br></td><td>disp_str128</td></tr>
		 * 	<tr><td><br></td><td>disp_str129</td></tr>
		 * 	<tr><td><br></td><td>disp_str130</td></tr>
		 * 	<tr><td><br></td><td>disp_str131</td></tr>
		 * 	<tr><td><br></td><td>disp_str132</td></tr>
		 * 	<tr><td><br></td><td>disp_str133</td></tr>
		 * 	<tr><td><br></td><td>disp_str134</td></tr>
		 * 	<tr><td><br></td><td>disp_str135</td></tr>
		 * 	<tr><td><br></td><td>disp_str136</td></tr>
		 * 	<tr><td><br></td><td>disp_str137</td></tr>
		 * 	<tr><td><br></td><td>disp_str138</td></tr>
		 * 	<tr><td><br></td><td>disp_str139</td></tr>
		 * 	<tr><td><br></td><td>disp_str140</td></tr>
		 * 	<tr><td><br></td><td>disp_str141</td></tr>
		 * 	<tr><td><br></td><td>disp_str142</td></tr>
		 * 	<tr><td><br></td><td>disp_str143</td></tr>
		 * 	<tr><td><br></td><td>disp_str144</td></tr>
		 * 	<tr><td><br></td><td>disp_str145</td></tr>
		 * 	<tr><td><br></td><td>disp_str146</td></tr>
		 * 	<tr><td><br></td><td>disp_str147</td></tr>
		 * 	<tr><td><br></td><td>disp_str148</td></tr>
		 * 	<tr><td><br></td><td>disp_str149</td></tr>
		 * 	<tr><td><br></td><td>disp_str150</td></tr>
		 * 	<tr><td><br></td><td>disp_str151</td></tr>
		 * 	<tr><td><br></td><td>disp_str152</td></tr>
		 * 	<tr><td><br></td><td>disp_str153</td></tr>
		 * 	<tr><td><br></td><td>disp_str154</td></tr>
		 * 	<tr><td><br></td><td>disp_str155</td></tr>
		 * 	<tr><td><br></td><td>disp_str156</td></tr>
		 * 	<tr><td><br></td><td>disp_str157</td></tr>
		 * 	<tr><td><br></td><td>disp_str158</td></tr>
		 * 	<tr><td><br></td><td>disp_str159</td></tr>
		 * 	<tr><td><br></td><td>disp_str160</td></tr>
		 * 	<tr><td><br></td><td>disp_str161</td></tr>
		 * 	<tr><td><br></td><td>disp_str162</td></tr>
		 * 	<tr><td><br></td><td>disp_str163</td></tr>
		 * 	<tr><td><br></td><td>disp_str164</td></tr>
		 * 	<tr><td><br></td><td>disp_str165</td></tr>
		 * 	<tr><td><br></td><td>disp_str166</td></tr>
		 * 	<tr><td><br></td><td>disp_str167</td></tr>
		 * 	<tr><td><br></td><td>disp_str168</td></tr>
		 * 	<tr><td><br></td><td>disp_str169</td></tr>
		 * 	<tr><td><br></td><td>disp_str170</td></tr>
		 * 	<tr><td><br></td><td>disp_str171</td></tr>
		 * 	<tr><td><br></td><td>disp_str172</td></tr>
		 * 	<tr><td><br></td><td>disp_str173</td></tr>
		 * 	<tr><td><br></td><td>disp_str174</td></tr>
		 * 	<tr><td><br></td><td>disp_str175</td></tr>
		 * 	<tr><td><br></td><td>disp_str176</td></tr>
		 * 	<tr><td><br></td><td>disp_str177</td></tr>
		 * 	<tr><td><br></td><td>disp_str178</td></tr>
		 * 	<tr><td><br></td><td>disp_str179</td></tr>
		 * 	<tr><td><br></td><td>disp_str180</td></tr>
		 * 	<tr><td><br></td><td>disp_str181</td></tr>
		 * 	<tr><td><br></td><td>disp_str182</td></tr>
		 * 	<tr><td><br></td><td>disp_str183</td></tr>
		 * 	<tr><td><br></td><td>disp_str184</td></tr>
		 * 	<tr><td><br></td><td>disp_str185</td></tr>
		 * 	<tr><td><br></td><td>disp_str186</td></tr>
		 * 	<tr><td><br></td><td>disp_str187</td></tr>
		 * 	<tr><td><br></td><td>disp_str188</td></tr>
		 * 	<tr><td><br></td><td>disp_str189</td></tr>
		 * 	<tr><td><br></td><td>disp_str190</td></tr>
		 * 	<tr><td><br></td><td>disp_str191</td></tr>
		 * 	<tr><td><br></td><td>disp_str192</td></tr>
		 * 	<tr><td><br></td><td>disp_str193</td></tr>
		 * 	<tr><td><br></td><td>disp_str194</td></tr>
		 * 	<tr><td><br></td><td>disp_str195</td></tr>
		 * 	<tr><td><br></td><td>disp_str196</td></tr>
		 * 	<tr><td><br></td><td>disp_str197</td></tr>
		 * 	<tr><td><br></td><td>disp_str198</td></tr>
		 * 	<tr><td><br></td><td>disp_str199</td></tr>
		 * 	<tr><td><br></td><td>disp_str200</td></tr>
		 * 	<tr><td><br></td><td>disp_dt001</td></tr>
		 * 	<tr><td><br></td><td>disp_dt002</td></tr>
		 * 	<tr><td><br></td><td>disp_dt003</td></tr>
		 * 	<tr><td><br></td><td>disp_dt004</td></tr>
		 * 	<tr><td><br></td><td>disp_dt005</td></tr>
		 * 	<tr><td><br></td><td>disp_dt006</td></tr>
		 * 	<tr><td><br></td><td>disp_dt007</td></tr>
		 * 	<tr><td><br></td><td>disp_dt008</td></tr>
		 * 	<tr><td><br></td><td>disp_dt009</td></tr>
		 * 	<tr><td><br></td><td>disp_dt010</td></tr>
		 * 	<tr><td><br></td><td>disp_num001</td></tr>
		 * 	<tr><td><br></td><td>disp_num002</td></tr>
		 * 	<tr><td><br></td><td>disp_num003</td></tr>
		 * 	<tr><td><br></td><td>disp_num004</td></tr>
		 * 	<tr><td><br></td><td>disp_num005</td></tr>
		 * 	<tr><td><br></td><td>disp_num006</td></tr>
		 * 	<tr><td><br></td><td>disp_num007</td></tr>
		 * 	<tr><td><br></td><td>disp_num008</td></tr>
		 * 	<tr><td><br></td><td>disp_num009</td></tr>
		 * 	<tr><td><br></td><td>disp_num010</td></tr>
		 * 	<tr><td><br></td><td>add_col_data</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL0040.Prnt01_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>disp_str001_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str002_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str003_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str004_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str005_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str006_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str007_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str008_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str009_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str010_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str011_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str012_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str013_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str014_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str015_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str016_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str017_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str018_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str019_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str020_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str021_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str022_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str023_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str024_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str025_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str026_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str027_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str028_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str029_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str030_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str031_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str032_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str033_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str034_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str035_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str036_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str037_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str038_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str039_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str040_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str041_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str042_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str043_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str044_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str045_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str046_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str047_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str048_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str049_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str050_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str051_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str052_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str053_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str054_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str055_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str056_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str057_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str058_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str059_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str060_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str061_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str062_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str063_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str064_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str065_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str066_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str067_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str068_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str069_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str070_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str071_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str072_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str073_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str074_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str075_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str076_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str077_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str078_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str079_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str080_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str081_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str082_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str083_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str084_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str085_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str086_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str087_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str088_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str089_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str090_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str091_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str092_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str093_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str094_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str095_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str096_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str097_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str098_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str099_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str100_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str101_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str102_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str103_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str104_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str105_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str106_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str107_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str108_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str109_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str110_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str111_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str112_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str113_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str114_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str115_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str116_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str117_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str118_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str119_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str120_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str121_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str122_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str123_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str124_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str125_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str126_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str127_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str128_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str129_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str130_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str131_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str132_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str133_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str134_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str135_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str136_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str137_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str138_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str139_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str140_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str141_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str142_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str143_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str144_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str145_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str146_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str147_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str148_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str149_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str150_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str151_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str152_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str153_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str154_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str155_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str156_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str157_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str158_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str159_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str160_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str161_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str162_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str163_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str164_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str165_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str166_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str167_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str168_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str169_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str170_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str171_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str172_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str173_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str174_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str175_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str176_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str177_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str178_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str179_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str180_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str181_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str182_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str183_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str184_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str185_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str186_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str187_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str188_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str189_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str190_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str191_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str192_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str193_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str194_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str195_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str196_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str197_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str198_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str199_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_str200_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_dt001_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_dt002_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_dt003_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_dt004_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_dt005_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_dt006_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_dt007_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_dt008_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_dt009_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_dt010_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_num001_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_num002_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_num003_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_num004_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_num005_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_num006_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_num007_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_num008_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_num009_lbl</td></tr>
		 * 	<tr><td><br></td><td>disp_num010_lbl</td></tr>
		 * 	<tr><td><br></td><td>add_col_lbl</td></tr>
		 * 	<tr><td><br></td><td>add_col_typ</td></tr>
		 * 	<tr><td><br></td><td>add_col_nm</td></tr>
		 * 	<tr><td><br></td><td>sort_info</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL0040.Prnt01_RsltLblR
		 */
		public mcframe.serverMBBE.MBBEL0040.Prnt01_RsltLblR down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>exec_time</td></tr>
		 * 	<tr><td><br></td><td>all_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL0040.Prnt01_RsltSmlR
		 */
		public mcframe.serverMBBE.MBBEL0040.Prnt01_RsltSmlR down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_BizDatDLConf)MBBEL_BizDatDLConf_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}